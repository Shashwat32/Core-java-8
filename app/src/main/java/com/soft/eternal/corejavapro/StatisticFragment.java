package com.soft.eternal.corejavapro;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StatisticFragment extends AppCompatActivity {


    static Long id ;
    static String title ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statistic_fragment);

        ActionBar ab = getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);
        Map<String, List<Integer>> stats = new HashMap();
        DBActivity dbActivity = new DBActivity(this);
        Bundle extras = getIntent().getExtras();
        id =  extras.getLong(Home.TITLE_ID_EXTRA);
        title = extras.getString(Home.TITLE_TITLE_EXTRA);
        TextView heading = (TextView) findViewById(R.id.heading);

        if(id == 1) {
            stats = dbActivity.getAllStats(1);
        }else if(id == 2){
            stats = dbActivity.getAllStats(2);
            heading.setText("Average of all Quick Tests");
        }else{
            stats = dbActivity.getStat(id-2);
            heading.setText(title);
        }

        if(stats.size()!= 0){
            TextView notAttemted = (TextView) findViewById(R.id.not);
            notAttemted.setVisibility(View.GONE);
        }else{
            TextView notAttemted = (TextView) findViewById(R.id.not);
            notAttemted.setVisibility(View.VISIBLE);
        }
        ArrayList<Bar> points = new ArrayList<Bar>();
        Bar d = new Bar();
        d.setColor(Color.parseColor("#99CC00"));
        d.setName("1");
        d.setGoalValue(0);
        Bar d2 = new Bar();
        d2.setColor(Color.parseColor("#FFBB33"));
        d2.setName("2");
        d2.setGoalValue(0);
        Bar d3 = new Bar();
        d3.setColor(Color.parseColor("#9e42ff"));
        d3.setName("3");
        d3.setGoalValue(0);
        Bar d4 = new Bar();
        d4.setColor(Color.parseColor("#572c37"));
        d4.setName("4");
        d4.setGoalValue(0);
        Bar d5 = new Bar();
        d5.setColor(Color.parseColor("#575e80"));
        d5.setName("5");
        d5.setGoalValue(0);
        Bar d6 = new Bar();
        d6.setColor(Color.parseColor("#ffd754"));
        d6.setName("6");
        d6.setGoalValue(0);
        Bar d7 = new Bar();
        d7.setColor(Color.parseColor("#cc5aa0"));
        d7.setName("7");
        d7.setGoalValue(0);
        Bar d8 = new Bar();
        d8.setColor(Color.parseColor("#7ce4e6"));
        d8.setName("8");
        d8.setGoalValue(0);
        Bar d9 = new Bar();
        d9.setColor(Color.parseColor("#de0007"));
        d9.setName("9");
        d9.setGoalValue(0);

        // iterate over avg stats & set the percentage
        for (Map.Entry<String , List<Integer>> entry : stats.entrySet()) {
            int perc = 0;
            if(entry.getValue().get(0) + entry.getValue().get(1) != 0) {
                perc = (int) (((float) entry.getValue().get(0) / (float) (entry.getValue().get(0) + entry.getValue().get(1))) * 100);
            }
            switch (entry.getKey()){
                case "1" : d.setGoalValue( perc );
                           break;
                case "2" : d2.setGoalValue( perc );
                    break;
                case "3" : d3.setGoalValue( perc );
                    break;
                case "4" : d4.setGoalValue( perc );
                    break;
                case "5" : d5.setGoalValue( perc );
                    break;
                case "6" : d6.setGoalValue( perc );
                    break;
                case "7" : d7.setGoalValue( perc );
                    break;
                case "8" : d8.setGoalValue( perc );
                    break;
                case "9" : d9.setGoalValue( perc );
                    break;

            }
        }

        points.add(d);
        points.add(d2);
        points.add(d3);
        points.add(d4);
        points.add(d5);
        points.add(d6);
        points.add(d7);
        points.add(d8);
        points.add(d9);

        BarGraph g = (BarGraph)findViewById(R.id.graph);
        g.setBars(points);
        g.setDuration(1200);//default if unspecified is 300 ms
        g.setInterpolator(new AccelerateDecelerateInterpolator());//Only use over/undershoot  when not inserting/deleting
        g.setValueStringPrecision(1); //1 decimal place. 0 by default for integers.
        g.animateToGoalValues();






    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.

        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
