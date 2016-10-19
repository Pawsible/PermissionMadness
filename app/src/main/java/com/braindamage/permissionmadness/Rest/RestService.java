package com.braindamage.permissionmadness.Rest;

import com.braindamage.permissionmadness.Activities.MainActivity;
import com.braindamage.permissionmadness.Model.Model.CurrentWeatherModel.CurrentWeather;
import com.braindamage.permissionmadness.Model.Model.CurrentWeatherrModel.CurrentWeatherrModel;
import com.braindamage.permissionmadness.Model.Model.FiveDayModel.FiveDaysList;
import com.braindamage.permissionmadness.Model.Model.ForecastModel.DailyForecast;
import com.braindamage.permissionmadness.Model.Model.ForecastModel.FutureForecastModel;
import com.braindamage.permissionmadness.Model.Model.HourlyForecast.HourlyForecast;
import com.braindamage.permissionmadness.Model.Model.LocationModel.LocationPojo;
import com.braindamage.permissionmadness.Model.Model.LocationModel.SupplementalAdminArea;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by Chuck Norris on 08/09/16.
 */
public interface RestService {


    @GET("2.5/forecast")
    Call<FiveDaysList> getWeatherList(@Query("lat") String latitude,
                                      @Query("lon") String longitude,
                                      @Query("mode") String mode,
                                      @Query("units") String units,
                                      @Query("cnt") int cnt,
                                      @Query("appid") String app_id);

    @GET("cities/geoposition/search")
    Call<LocationPojo> getLocationData(@Query("q") String coord,
                                         @Query("apikey") String api_key,
                                         @Query("toplevel") boolean toplevel);
   /* @GET("{lok}")
    Call<List<CurrentWeather>> getCurrentWeather(@Path("lok") String locationKey,
            @Query("apikey") String api_key);*/

    @GET("{lok}")
    Call<FutureForecastModel> getForecast(@Path("lok") String locationKey,
                                          @Query("apikey") String api_key,
                                          @Query("metric") boolean metric);

    @GET("{lok}")
    Call<List<CurrentWeatherrModel>> getCurrentWeather(@Path("lok") String locationKey,
                                                       @Query("apikey") String api_key,
                                                        @Query("details") boolean details);

    @GET("{lok}")
    Call<List<HourlyForecast>> getHourlyForecast(@Path("lok") String locationKey,
                                           @Query("apikey") String api_key,
                                           @Query("metric") boolean metric);

}


//http:api.openweathermap.org/data/2.5/weather?lat=55&lon=139&units=metric&appid=054c3e93214e77da931959ee42733ef8
//http://api.openweathermap.org/data/2.5/forecast/daily?lat=35&lon=139&cnt=10&mode=json&appid=054c3e93214e77da931959ee42733ef8
//http://api.openweathermap.org/data/2.5/forecast/daily?lat=28.4774756&lon=77.0814039&cnt=10&mode=json&appid=054c3e93214e77da931959ee42733ef8

//Current condition call
//http://dataservice.accuweather.com/currentconditions/v1/{location-key}
//http://dataservice.accuweather.com/forecasts/v1/daily/5day/188408?apikey=gbw8U8eWO2A6zQHT9fnnGGAsVgFI4GFP&metric=true


//http://dataservice.accuweather.com/currentconditions/v1/3351800?apikey=gbw8U8eWO2A6zQHT9fnnGGAsVgFI4GFP&details=true

//API Key for Forecast.io d9d603ba50f111bf5b466a3e33bcab7a