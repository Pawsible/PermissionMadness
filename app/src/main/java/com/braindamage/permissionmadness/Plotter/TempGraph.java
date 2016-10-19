package com.braindamage.permissionmadness.Plotter;

import android.app.Activity;
import android.os.Bundle;

import com.androidplot.xy.LineAndPointFormatter;
import com.androidplot.xy.XYPlot;
import com.androidplot.xy.XYRegionFormatter;
import com.androidplot.xy.XYSeries;
import com.braindamage.permissionmadness.R;

/**
 * Created by Chuck Norris on 19/10/16.
 */
public class TempGraph extends Activity{
    private XYPlot xyPlot;
    private Number[] temp;
    private LineAndPointFormatter tempFormat;
    private XYSeries series;
    private XYRegionFormatter regionFormatter;

    public TempGraph(Number[] temp){
        this.temp = temp;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
}
