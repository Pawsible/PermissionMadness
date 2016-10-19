package com.braindamage.permissionmadness.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.braindamage.permissionmadness.Model.Model.ForecastModel.DailyForecast;
import com.braindamage.permissionmadness.R;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by Chuck Norris on 22/09/16.
 */
public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.RecyclerHolder> {

    RecyclerHolder recyclerHolder;
    Context context;
    List<DailyForecast> dataModelList;
    //List<String> list;

    public RecyclerViewAdapter(Context context, List<DailyForecast> dataModelList){
        this.context = context;
        this.dataModelList = dataModelList;
    }

    @Override
    public RecyclerHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.row_layout, parent, false);
        recyclerHolder = new RecyclerHolder(view);
        return recyclerHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerHolder holder, int position) {

        holder.temp_text.setText(dataModelList.get(position).getTemperature().getMaximum().getValue()+" "
                +dataModelList.get(position).getTemperature().getMinimum().getValue());

        int dt = dataModelList.get(position).getEpochDate();
        Date date = new Date((long) 1000*dt);
        SimpleDateFormat format = new SimpleDateFormat("EEEE");
        holder.day_text.setText(format.format(date));
        holder.weather_text.setText(dataModelList.get(0).getDay().getIconPhrase());
        holder.weather_image.setImageResource(R.drawable.sunnyday);
       // holder.weather_text.setText(list.get(position));

    }

    @Override
    public int getItemCount() {
        return dataModelList.size();
    }

    @Override
    public boolean onFailedToRecycleView(RecyclerHolder holder) {
        Log.d("RECYCLERVIEWTAG", holder.toString());
        return super.onFailedToRecycleView(holder);
    }


    public class RecyclerHolder extends RecyclerView.ViewHolder {
        TextView day_text, weather_text, temp_text;
        ImageView weather_image;

        public RecyclerHolder(View itemView) {
            super(itemView);
            day_text = (TextView) itemView.findViewById(R.id.rcText);
            temp_text = (TextView) itemView.findViewById(R.id.rcTex);
            weather_text = (TextView) itemView.findViewById(R.id.rcText2);
            weather_image = (ImageView) itemView.findViewById(R.id.rcImage);
        }
    }
}
