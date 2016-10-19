package com.braindamage.permissionmadness.Activities;

import android.content.Intent;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.location.Location;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.braindamage.permissionmadness.Adapter.RecyclerViewAdapter;
import com.braindamage.permissionmadness.Model.Model.CurrentWeatherModel.CurrentWeather;
import com.braindamage.permissionmadness.Model.Model.CurrentWeatherrModel.CurrentWeatherrModel;
import com.braindamage.permissionmadness.Model.Model.ForecastModel.DailyForecast;
import com.braindamage.permissionmadness.Model.Model.ForecastModel.FutureForecastModel;
import com.braindamage.permissionmadness.Model.Model.HourlyForecast.HourlyForecast;
import com.braindamage.permissionmadness.Model.Model.LocationModel.LocationPojo;
import com.braindamage.permissionmadness.R;
import com.braindamage.permissionmadness.Rest.ApiService;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity{


    public static final String API_KEY = "gbw8U8eWO2A6zQHT9fnnGGAsVgFI4GFP";
    public static final boolean TOP_LEVEL = true;
    public static final boolean DETAILS = true;
    public static final String DEGREE  = "\u00b0"+"C";

    public static String LOCATION_KEY;
    public List<HourlyForecast> tempArray;

    public TextView temp_text, hum_text, city_text, weathertext, foreCastText;
    public ImageView imageView;


    public RecyclerView recyclerView;
    public RecyclerViewAdapter adapter;
    public RecyclerView.LayoutManager layoutManager;
    public Location mCurrentLocation;
    public Intent intent;
    public String coordinate;
    public RelativeLayout relativeLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Toolbar toolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(toolbar);

        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/DroidSerifRegular.ttf");

        foreCastText = (TextView) findViewById(R.id.forecast_text);
        temp_text = (TextView) findViewById(R.id.temptext);
        temp_text.setTypeface(typeface);
        hum_text = (TextView) findViewById(R.id.humtext);
        hum_text.setTypeface(typeface);
        city_text = (TextView) findViewById(R.id.citytext);
        city_text.setTypeface(typeface);
        weathertext = (TextView) findViewById(R.id.weathertext);
        weathertext.setTypeface(typeface);
        recyclerView = (RecyclerView) findViewById(R.id.recycler);
        layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        imageView = (ImageView) findViewById(R.id.weather_icon);
        intent = getIntent();
        relativeLayout = (RelativeLayout) findViewById(R.id.rlayout);
        mCurrentLocation = intent.getParcelableExtra("Location");
        if(mCurrentLocation != null) {
            getDatafromApi(mCurrentLocation.getLatitude(), mCurrentLocation.getLongitude());
        }
        else{
            Toast.makeText(MainActivity.this, "Location not received", Toast.LENGTH_SHORT).show();
        }
    }

    public void getDatafromApi(double latitude, double longitude){
        coordinate = latitude+","+longitude;

        new ApiService("http://dataservice.accuweather.com/locations/v1/").getInstance().getLocationData(coordinate, API_KEY, TOP_LEVEL)
        .enqueue(new Callback<LocationPojo>() {
            @Override
            public void onResponse(Call<LocationPojo> call, Response<LocationPojo> response) {
                LOCATION_KEY = response.body().getKey();
                city_text.setText(response.body().getSupplementalAdminAreas().get(0).getEnglishName()+", "
                +response.body().getCountry().getID());

                if(LOCATION_KEY != null){
                    tempCall();
                    forecastCall();
                    hourlyForecast();
                }
            }

            @Override
            public void onFailure(Call<LocationPojo> call, Throwable t) {

            }
        });


    }
    public void tempCall() {
        new ApiService("http://dataservice.accuweather.com/currentconditions/v1/").getInstance()
                .getCurrentWeather(LOCATION_KEY, API_KEY, DETAILS).enqueue(new Callback<List<CurrentWeatherrModel>>() {
            @Override
            public void onResponse(Call<List<CurrentWeatherrModel>> call, Response<List<CurrentWeatherrModel>> response) {
                temp_text.setText( response.body().get(0).getTemperature().getMetric().getValue()+DEGREE);
                hum_text.setText("HUMIDITY " + response.body().get(0).getRelativeHumidity()+"%");
                String weather_text = response.body().get(0).getWeatherText();
                weathertext.setText(weather_text);
                imageView.setImageResource(R.drawable.sunnyday);
                if(response.body().get(0).isIsDayTime()){
                    relativeLayout.setBackground(ContextCompat.getDrawable(MainActivity.this, R.drawable.bluesky));
                }else{
                    //relativeLayout.setBackground(ContextCompat.getDrawable(MainActivity.this, R.drawable.nightsky));
                }
            }

            @Override
            public void onFailure(Call<List<CurrentWeatherrModel>> call, Throwable t) {
                t.printStackTrace();
            }
        });
    }

    public void forecastCall(){
        new ApiService("http://dataservice.accuweather.com/forecasts/v1/daily/5day/").getInstance()
                .getForecast(LOCATION_KEY, API_KEY, true).enqueue(new Callback<FutureForecastModel>() {
            @Override
            public void onResponse(Call<FutureForecastModel> call, Response<FutureForecastModel> response) {
                Log.d("5DAYTAG", "5 day call");
                List<DailyForecast> list = response.body().getDailyForecasts();
                adapter = new RecyclerViewAdapter(MainActivity.this, list);
                recyclerView.setHasFixedSize(true);
                recyclerView.setLayoutManager(layoutManager);
                recyclerView.setAdapter(adapter);
                Log.d("5DAYTAG", "5 DAY CALL FINISHED");
            }

            @Override
            public void onFailure(Call<FutureForecastModel> call, Throwable t) {
                t.printStackTrace();
            }
        });

    }

    public void hourlyForecast(){
        new ApiService("http://dataservice.accuweather.com/forecasts/v1/hourly/12hour/").getInstance()
                .getHourlyForecast(LOCATION_KEY, API_KEY, true).enqueue(new Callback<List<HourlyForecast>>() {
            @Override
            public void onResponse(Call<List<HourlyForecast>> call, Response<List<HourlyForecast>> response) {
                tempArray = response.body();
                for(HourlyForecast fore : tempArray){
                    foreCastText.append(fore.getTemperature().getValue()+" ");
                    String time = fore.getDateTime();
                    foreCastText.append(time);
                }
            }

            @Override
            public void onFailure(Call<List<HourlyForecast>> call, Throwable t) {

            }
        });
    }

}


//http://dataservice.accuweather.com/currentconditions/v1/188408?apikey=gbw8U8eWO2A6zQHT9fnnGGAsVgFI4GFP