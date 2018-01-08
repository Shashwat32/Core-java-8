package com.soft.eternal.corejavapro;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Color;
import android.preference.PreferenceManager;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.PopupWindow;
import android.widget.TextView;

import java.lang.reflect.Type;


import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.soft.eternal.corejavapro.R.id.container;


public class Result extends AppCompatActivity {

    /**
     * The {@link android.support.v4.view.PagerAdapter} that will provide
     * fragments for each of the sections. We use a
     * {@link FragmentPagerAdapter} derivative, which will keep every
     * loaded fragment in memory. If this becomes too memory intensive, it
     * may be best to switch to a
     * {@link android.support.v4.app.FragmentStatePagerAdapter}.
     */
    private SectionsPagerAdapter mSectionsPagerAdapter;

    /**
     * The {@link ViewPager} that will host the section contents.
     */
    public static ViewPager mViewPager;
    static Long id ;
    static ArrayList<Table> array_list;
    static Table table ;
    static int no_of_ques = 3;
    SharedPreferences sharedPrefs;
    private PopupWindow pwindo;
    static String result="";
    private Map<String, List<Integer>> map = new HashMap<String, List<Integer>>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter_qn);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        sharedPrefs = PreferenceManager.getDefaultSharedPreferences(this);
        // making Submitted as true so that it not resubmit after timeover
        SharedPreferences.Editor editor = sharedPrefs.edit();
        editor.putBoolean("Submited", false);

        Gson gson = new Gson();
        String json = sharedPrefs.getString("ARRAY_LIST", null);
        Type type = new TypeToken<ArrayList<Table>>() {}.getType();
        array_list = gson.fromJson(json, type);
        no_of_ques = array_list.size();
        double score = calResult();

        // store stats in DB
        DBActivity dbActivity = new DBActivity(this);
        SQLiteDatabase db= dbActivity.getWritableDatabase();
        dbActivity.insertLastStats(map,db,this);

        result = String.format("%.2f",score );
        final Activity activity = this;



        activity.setTitle("Result  " + result + "%");
        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(container);
        mViewPager.setAdapter(mSectionsPagerAdapter);

    }








    @Override
    public void onBackPressed() {
        new AlertDialog.Builder(this)
                .setTitle("Alert !")
                .setMessage("Press Home button to go back on Home Screen")
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                         return;
                    }
                })
                .setIcon(android.R.drawable.ic_dialog_alert)
                .show();
        return;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.

        getMenuInflater().inflate(R.menu.menu_result, menu);
        initiatePopupWindow(result);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.backToHome) {
            Intent intent = new Intent(this, Home.class);
            this.startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }

    public double calResult(){
        double score = 0.0;
        int count_correct = 0 ;
        String correct_opt;

            for (int i = 1; i <= array_list.size(); i++) {

                Table temp = array_list.get(i-1);
                correct_opt = temp.getCORRECT_OPT();
                String corr_opt[] = correct_opt.split(" ");
                String marked_opt[] = new String[6];
                int k = 0, m = 0, flag;
                for (int j = 1; j <= Integer.parseInt(temp.getNo_Opt()); j++) {

                    if (sharedPrefs.getBoolean(String.format("opt%d%d", j, i), false) &&  (Integer.parseInt(temp.getTYPE()) == 2) ) {
                        marked_opt[k] = option(j);
                        k++;
                    }
                    else if(sharedPrefs.getBoolean(String.format("cb%d%d", j, i), false) &&  (Integer.parseInt(temp.getTYPE()) == 1)){
                        marked_opt[k] = option(j);
                        k++;
                    }
                }
                String chapter = temp.getCHAPTER();
                if(!map.containsKey(chapter)){
                   List<Integer> list =  new ArrayList<Integer>();
                    list.add(0);
                    list.add(0);
                    map.put(chapter,list);
                }
                if (Integer.parseInt(temp.getTYPE()) == 2) {


                    if (corr_opt[0].equalsIgnoreCase(marked_opt[0])) {
                        count_correct++;
                        List<Integer> key = map.get(chapter);
                        key.set(0,key.get(0) + 1);
                        map.put(chapter, key);
                    }else{
                        List<Integer> key = map.get(chapter);
                        key.set(1,key.get(1) + 1);
                        map.put(chapter, key);

                    }

                } else {
                    flag = 0;
                    if(k != 0){
                        while (m != k ) {
                            if (corr_opt[m].equalsIgnoreCase(marked_opt[m])) {
                                m++;
                                continue;
                            } else {
                                flag = 1;
                                 break;
                            }

                        }
                    }
                    else
                      flag = 1;

                    if (flag == 0) {
                        count_correct++;
                        List<Integer> key = map.get(chapter);
                        key.set(0,key.get(0) + 1);
                        map.put(chapter, key);
                    }else{
                        List<Integer> key = map.get(chapter);
                        key.set(1,key.get(1) + 1);
                        map.put(chapter, key);
                    }
                }
            }

            score = ((double) count_correct /(double) array_list.size()) * 100;


        return score;
    }

    private void initiatePopupWindow(String result) {

        try {

// We need to get the instance of the LayoutInflater

            LayoutInflater inflater = (LayoutInflater) Result.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            View layout = inflater.inflate(R.layout.result_popup,(ViewGroup) findViewById(R.id.popup_element));

            pwindo = new PopupWindow(layout,ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT, true);
            //pwindo.setWindowLayoutMode(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);

            pwindo.showAtLocation(layout, Gravity.CENTER, 0, 0);


            TextView marks = (TextView)layout.findViewById(R.id.marks);
            TextView message = (TextView)layout.findViewById(R.id.message);
            Button ok = (Button) layout.findViewById(R.id.ok);
            Button home = (Button) layout.findViewById(R.id.home);
            marks.setText(result+" %");

            if(Double.parseDouble(result) < 63) {
                marks.setTextColor(Color.RED);
                message.setText("You can do better next time !\n\n" +
                        "Press OK to check the answers or Press Home to go back Home screen");

            }else{
                marks.setTextColor(Color.GREEN);
                message.setText("Congratulations !!\n\n" +
                        "Press OK to check the answers or Press Home to go back Home screen");

            }

            ok.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    pwindo.dismiss();
                }
            });

            home.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                        Intent intent = new Intent(Result.this, Home.class);
                        startActivity(intent);

                }
            });

        } catch (Exception e) {

            e.printStackTrace();

        }

    }


    public String option(int i){
        switch (i){
            case 1 : return "A";
            case 2 : return "B";
            case 3 : return "C";
            case 4 : return "D";
            case 5 : return "E";
            case 6 : return "F";
            default: return null;

        }
    }

    public static class PlaceholderFragment extends Fragment {
        /**
         * The fragment argument representing the section number for this
         * fragment.
         */

        private static final String ARG_SECTION_NUMBER = "section_number";
        public PlaceholderFragment() {
        }

        /**
         * Returns a new instance of this fragment for the given section
         * number.
         */
        public static PlaceholderFragment newInstance(int sectionNumber, Table T) {
            PlaceholderFragment fragment = new PlaceholderFragment();
            Bundle args = new Bundle();
            args.putInt(ARG_SECTION_NUMBER, sectionNumber);
            args.putSerializable("TABLE",T);
            fragment.setArguments(args);
            return fragment;
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {

            View rootView = inflater.inflate(R.layout.fragment_result, container, false);
            ResultTest resultTest = new ResultTest();
            resultTest.setQuesNAns(mViewPager,getActivity(),rootView,getArguments().getInt(ARG_SECTION_NUMBER),(Table)getArguments().getSerializable("TABLE"));
            return rootView;
        }


    }

    /**
     * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
     * one of the sections/tabs/pages.
     */
    public class SectionsPagerAdapter extends FragmentPagerAdapter {
        private Fragment[] fragments;

        public SectionsPagerAdapter(FragmentManager fm) {

            super(fm);

        }

        @Override
        public Fragment getItem(int position) {
            // getItem is called to instantiate the fragment for the given page.
            // Return a PlaceholderFragment (defined as a static inner class below).

            table = array_list.get(position);
            return PlaceholderFragment.newInstance(position + 1,table);
        }

        @Override
        public int getCount() {

            return no_of_ques;
        }

    }
}
