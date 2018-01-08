package com.soft.eternal.corejavapro;


import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v4.app.ListFragment;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;


public class Review {

    TextView qno1, ques1;
    SharedPreferences sharedPrefs;
    static ArrayList<Table> array_list;

    public void setReview (final ViewPager mViewPager, final Context context,final View rootView) {

        sharedPrefs = PreferenceManager.getDefaultSharedPreferences(context);
        Gson gson = new Gson();
        String json = sharedPrefs.getString("ARRAY_LIST", null);
        Type type = new TypeToken<ArrayList<Table>>() {}.getType();
        array_list = gson.fromJson(json, type);
        TextView message = (TextView) rootView.findViewById(R.id.message);
        final Spinner ques_no = (Spinner) rootView.findViewById(R.id.no);

        if(array_list.size()==15){

            ArrayAdapter<String> adapter = new ArrayAdapter<String>(context,
                    android.R.layout.simple_spinner_item);
            adapter.add("1");
            adapter.add("2");
            adapter.add("3");
            adapter.add("4");
            adapter.add("5");
            adapter.add("6");
            adapter.add("7");
            adapter.add("8");
            adapter.add("9");
            adapter.add("10");
            adapter.add("11");
            adapter.add("12");
            adapter.add("13");
            adapter.add("14");
            adapter.add("15");

            adapter.notifyDataSetChanged();
            ques_no.setAdapter(adapter);
        }

        Button submit = (Button) rootView.findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                final String text = ques_no.getSelectedItem().toString();

                mViewPager.setCurrentItem(Integer.parseInt(text)-1);
            }
        });

        try{
        Field popup = Spinner.class.getDeclaredField("mPopup");
        popup.setAccessible(true);

        // Get private mPopup member variable and try cast to ListPopupWindow
        android.widget.ListPopupWindow popupWindow = (android.widget.ListPopupWindow) popup.get(ques_no);

        // Set popupWindow height to 500px
        popupWindow.setHeight(300);
        }catch (Exception e){

        }


        if(sharedPrefs.getBoolean("mark1",false)){

            LinearLayout box1 = (LinearLayout) rootView.findViewById(R.id.box1);
            TextView qno1 = (TextView) rootView.findViewById(R.id.qno1);
            TextView question1 = (TextView) rootView.findViewById(R.id.question1);
            box1.setVisibility(View.VISIBLE);
            message.setVisibility(View.GONE);
            qno1.setText("QUES 1");
            question1.setText(array_list.get(0).getQUESTION());
            box1.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View arg0) {

                    mViewPager.setCurrentItem(0);

                }

            });

        }
        if(sharedPrefs.getBoolean("mark2",false)){

            LinearLayout box2 = (LinearLayout) rootView.findViewById(R.id.box2);
            TextView qno2 = (TextView) rootView.findViewById(R.id.qno2);
            TextView question2 = (TextView) rootView.findViewById(R.id.question2);
            box2.setVisibility(View.VISIBLE);
            message.setVisibility(View.GONE);
            qno2.setText("QUES 2");
            question2.setText(array_list.get(1).getQUESTION());
            box2.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View arg0) {

                    mViewPager.setCurrentItem(1);

                }

            });

        }
        if(sharedPrefs.getBoolean("mark3",false)){

            LinearLayout box3 = (LinearLayout) rootView.findViewById(R.id.box3);
            TextView qno3 = (TextView) rootView.findViewById(R.id.qno3);
            TextView question3 = (TextView) rootView.findViewById(R.id.question3);
            box3.setVisibility(View.VISIBLE);
            message.setVisibility(View.GONE);
            qno3.setText("QUES 3");
            question3.setText(array_list.get(2).getQUESTION());
            box3.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View arg0) {

                    mViewPager.setCurrentItem(2);

                }

            });

        }
        if(sharedPrefs.getBoolean("mark4",false)){

            LinearLayout box4 = (LinearLayout) rootView.findViewById(R.id.box4);
            TextView qno4 = (TextView) rootView.findViewById(R.id.qno4);
            TextView question4 = (TextView) rootView.findViewById(R.id.question4);
            box4.setVisibility(View.VISIBLE);
            message.setVisibility(View.GONE);
            qno4.setText("QUES 4");
            question4.setText(array_list.get(3).getQUESTION());
            box4.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View arg0) {

                    mViewPager.setCurrentItem(3);

                }

            });

        }
        if(sharedPrefs.getBoolean("mark5",false)){

            LinearLayout box5 = (LinearLayout) rootView.findViewById(R.id.box5);
            TextView qno5 = (TextView) rootView.findViewById(R.id.qno5);
            TextView question5 = (TextView) rootView.findViewById(R.id.question5);
            box5.setVisibility(View.VISIBLE);
            message.setVisibility(View.GONE);
            qno5.setText("QUES 5");
            question5.setText(array_list.get(4).getQUESTION());
            box5.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View arg0) {

                    mViewPager.setCurrentItem(4);

                }

            });

        }
        if(sharedPrefs.getBoolean("mark6",false)){

            LinearLayout box6 = (LinearLayout) rootView.findViewById(R.id.box6);
            TextView qno6 = (TextView) rootView.findViewById(R.id.qno6);
            TextView question6 = (TextView) rootView.findViewById(R.id.question6);
            box6.setVisibility(View.VISIBLE);
            message.setVisibility(View.GONE);
            qno6.setText("QUES 6");
            question6.setText(array_list.get(5).getQUESTION());
            box6.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View arg0) {

                    mViewPager.setCurrentItem(5);

                }

            });

        }
        if(sharedPrefs.getBoolean("mark7",false)){

            LinearLayout box7 = (LinearLayout) rootView.findViewById(R.id.box7);
            TextView qno7 = (TextView) rootView.findViewById(R.id.qno7);
            TextView question7 = (TextView) rootView.findViewById(R.id.question7);
            box7.setVisibility(View.VISIBLE);
            message.setVisibility(View.GONE);
            qno7.setText("QUES 7");
            question7.setText(array_list.get(6).getQUESTION());
            box7.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View arg0) {

                    mViewPager.setCurrentItem(6);

                }

            });

        }
        if(sharedPrefs.getBoolean("mark8",false)){

            LinearLayout box8 = (LinearLayout) rootView.findViewById(R.id.box8);
            TextView qno8 = (TextView) rootView.findViewById(R.id.qno8);
            TextView question8 = (TextView) rootView.findViewById(R.id.question8);
            box8.setVisibility(View.VISIBLE);
            message.setVisibility(View.GONE);
            qno8.setText("QUES 8");
            question8.setText(array_list.get(7).getQUESTION());
            box8.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View arg0) {

                    mViewPager.setCurrentItem(7);

                }

            });

        }
        if(sharedPrefs.getBoolean("mark9",false)){

            LinearLayout box9 = (LinearLayout) rootView.findViewById(R.id.box9);
            TextView qno9 = (TextView) rootView.findViewById(R.id.qno9);
            TextView question9 = (TextView) rootView.findViewById(R.id.question9);
            box9.setVisibility(View.VISIBLE);
            message.setVisibility(View.GONE);
            qno9.setText("QUES 9");
            question9.setText(array_list.get(8).getQUESTION());
            box9.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View arg0) {

                    mViewPager.setCurrentItem(8);

                }

            });

        }
        if(sharedPrefs.getBoolean("mark10",false)){

            LinearLayout box10 = (LinearLayout) rootView.findViewById(R.id.box10);
            TextView qno10 = (TextView) rootView.findViewById(R.id.qno10);
            TextView question10 = (TextView) rootView.findViewById(R.id.question10);
            box10.setVisibility(View.VISIBLE);
            message.setVisibility(View.GONE);
            qno10.setText("QUES 10");
            question10.setText(array_list.get(9).getQUESTION());
            box10.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View arg0) {

                    mViewPager.setCurrentItem(9);

                }

            });

        }
        if(sharedPrefs.getBoolean("mark11",false)){

            LinearLayout box11 = (LinearLayout) rootView.findViewById(R.id.box11);
            TextView qno11 = (TextView) rootView.findViewById(R.id.qno11);
            TextView question11 = (TextView) rootView.findViewById(R.id.question11);
            box11.setVisibility(View.VISIBLE);
            message.setVisibility(View.GONE);
            qno11.setText("QUES 11");
            question11.setText(array_list.get(10).getQUESTION());
            box11.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View arg0) {

                    mViewPager.setCurrentItem(10);

                }

            });

        }
        if(sharedPrefs.getBoolean("mark12",false)){

            LinearLayout box12 = (LinearLayout) rootView.findViewById(R.id.box12);
            TextView qno12 = (TextView) rootView.findViewById(R.id.qno12);
            TextView question12 = (TextView) rootView.findViewById(R.id.question12);
            box12.setVisibility(View.VISIBLE);
            message.setVisibility(View.GONE);
            qno12.setText("QUES 12");
            question12.setText(array_list.get(11).getQUESTION());
            box12.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View arg0) {

                    mViewPager.setCurrentItem(11);

                }

            });

        }
        if(sharedPrefs.getBoolean("mark13",false)){

            LinearLayout box13 = (LinearLayout) rootView.findViewById(R.id.box13);
            TextView qno13 = (TextView) rootView.findViewById(R.id.qno13);
            TextView question13 = (TextView) rootView.findViewById(R.id.question13);
            box13.setVisibility(View.VISIBLE);
            message.setVisibility(View.GONE);
            qno13.setText("QUES 13");
            question13.setText(array_list.get(12).getQUESTION());
            box13.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View arg0) {

                    mViewPager.setCurrentItem(12);

                }

            });

        }
        if(sharedPrefs.getBoolean("mark14",false)){

            LinearLayout box14 = (LinearLayout) rootView.findViewById(R.id.box14);
            TextView qno14 = (TextView) rootView.findViewById(R.id.qno14);
            TextView question14 = (TextView) rootView.findViewById(R.id.question14);
            box14.setVisibility(View.VISIBLE);
            message.setVisibility(View.GONE);
            qno14.setText("QUES 14");
            question14.setText(array_list.get(13).getQUESTION());
            box14.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View arg0) {

                    mViewPager.setCurrentItem(13);

                }

            });

        }
        if(sharedPrefs.getBoolean("mark15",false)){

            LinearLayout box15 = (LinearLayout) rootView.findViewById(R.id.box15);
            TextView qno15 = (TextView) rootView.findViewById(R.id.qno15);
            TextView question15 = (TextView) rootView.findViewById(R.id.question15);
            box15.setVisibility(View.VISIBLE);
            message.setVisibility(View.GONE);
            qno15.setText("QUES 15");
            question15.setText(array_list.get(14).getQUESTION());
            box15.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View arg0) {

                    mViewPager.setCurrentItem(14);

                }

            });

        }
        if(sharedPrefs.getBoolean("mark16",false)){

            LinearLayout box16 = (LinearLayout) rootView.findViewById(R.id.box16);
            TextView qno16 = (TextView) rootView.findViewById(R.id.qno16);
            TextView question16 = (TextView) rootView.findViewById(R.id.question16);
            box16.setVisibility(View.VISIBLE);
            message.setVisibility(View.GONE);
            qno16.setText("QUES 16");
            question16.setText(array_list.get(15).getQUESTION());
            box16.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View arg0) {

                    mViewPager.setCurrentItem(15);

                }

            });

        }
        if(sharedPrefs.getBoolean("mark17",false)){

            LinearLayout box17 = (LinearLayout) rootView.findViewById(R.id.box17);
            TextView qno17 = (TextView) rootView.findViewById(R.id.qno17);
            TextView question17 = (TextView) rootView.findViewById(R.id.question17);
            box17.setVisibility(View.VISIBLE);
            message.setVisibility(View.GONE);
            qno17.setText("QUES 17");
            question17.setText(array_list.get(16).getQUESTION());
            box17.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View arg0) {

                    mViewPager.setCurrentItem(16);

                }

            });

        }
        if(sharedPrefs.getBoolean("mark18",false)){

            LinearLayout box18 = (LinearLayout) rootView.findViewById(R.id.box18);
            TextView qno18 = (TextView) rootView.findViewById(R.id.qno18);
            TextView question18 = (TextView) rootView.findViewById(R.id.question18);
            box18.setVisibility(View.VISIBLE);
            message.setVisibility(View.GONE);
            qno18.setText("QUES 18");
            question18.setText(array_list.get(17).getQUESTION());
            box18.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View arg0) {

                    mViewPager.setCurrentItem(17);

                }

            });

        }
        if(sharedPrefs.getBoolean("mark19",false)){

            LinearLayout box19 = (LinearLayout) rootView.findViewById(R.id.box19);
            TextView qno19 = (TextView) rootView.findViewById(R.id.qno19);
            TextView question19 = (TextView) rootView.findViewById(R.id.question19);
            box19.setVisibility(View.VISIBLE);
            message.setVisibility(View.GONE);
            qno19.setText("QUES 19");
            question19.setText(array_list.get(18).getQUESTION());
            box19.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View arg0) {

                    mViewPager.setCurrentItem(18);

                }

            });

        }
        if(sharedPrefs.getBoolean("mark20",false)){

            LinearLayout box20 = (LinearLayout) rootView.findViewById(R.id.box20);
            TextView qno20 = (TextView) rootView.findViewById(R.id.qno20);
            TextView question20 = (TextView) rootView.findViewById(R.id.question20);
            box20.setVisibility(View.VISIBLE);
            message.setVisibility(View.GONE);
            qno20.setText("QUES 20");
            question20.setText(array_list.get(19).getQUESTION());
            box20.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View arg0) {

                    mViewPager.setCurrentItem(19);

                }

            });

        }
        if(sharedPrefs.getBoolean("mark21",false)){

            LinearLayout box21 = (LinearLayout) rootView.findViewById(R.id.box21);
            TextView qno21 = (TextView) rootView.findViewById(R.id.qno21);
            TextView question21 = (TextView) rootView.findViewById(R.id.question21);
            box21.setVisibility(View.VISIBLE);
            message.setVisibility(View.GONE);
            qno21.setText("QUES 21");
            question21.setText(array_list.get(20).getQUESTION());
            box21.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View arg0) {

                    mViewPager.setCurrentItem(20);

                }

            });

        }
        if(sharedPrefs.getBoolean("mark22",false)){

            LinearLayout box22 = (LinearLayout) rootView.findViewById(R.id.box22);
            TextView qno22 = (TextView) rootView.findViewById(R.id.qno22);
            TextView question22 = (TextView) rootView.findViewById(R.id.question22);
            box22.setVisibility(View.VISIBLE);
            message.setVisibility(View.GONE);
            qno22.setText("QUES 22");
            question22.setText(array_list.get(21).getQUESTION());
            box22.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View arg0) {

                    mViewPager.setCurrentItem(21);

                }

            });

        }
        if(sharedPrefs.getBoolean("mark23",false)){

            LinearLayout box23 = (LinearLayout) rootView.findViewById(R.id.box23);
            TextView qno23 = (TextView) rootView.findViewById(R.id.qno23);
            TextView question23 = (TextView) rootView.findViewById(R.id.question23);
            box23.setVisibility(View.VISIBLE);
            message.setVisibility(View.GONE);
            qno23.setText("QUES 23");
            question23.setText(array_list.get(22).getQUESTION());
            box23.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View arg0) {

                    mViewPager.setCurrentItem(22);

                }

            });

        }
        if(sharedPrefs.getBoolean("mark24",false)){

            LinearLayout box24 = (LinearLayout) rootView.findViewById(R.id.box24);
            TextView qno24 = (TextView) rootView.findViewById(R.id.qno24);
            TextView question24 = (TextView) rootView.findViewById(R.id.question24);
            box24.setVisibility(View.VISIBLE);
            message.setVisibility(View.GONE);
            qno24.setText("QUES 24");
            question24.setText(array_list.get(23).getQUESTION());
            box24.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View arg0) {

                    mViewPager.setCurrentItem(23);

                }

            });

        }
        if(sharedPrefs.getBoolean("mark25",false)){

            LinearLayout box25 = (LinearLayout) rootView.findViewById(R.id.box25);
            TextView qno25 = (TextView) rootView.findViewById(R.id.qno25);
            TextView question25 = (TextView) rootView.findViewById(R.id.question25);
            box25.setVisibility(View.VISIBLE);
            message.setVisibility(View.GONE);
            qno25.setText("QUES 25");
            question25.setText(array_list.get(24).getQUESTION());
            box25.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View arg0) {

                    mViewPager.setCurrentItem(24);

                }

            });

        }
        if(sharedPrefs.getBoolean("mark26",false)){

            LinearLayout box26 = (LinearLayout) rootView.findViewById(R.id.box26);
            TextView qno26 = (TextView) rootView.findViewById(R.id.qno26);
            TextView question26 = (TextView) rootView.findViewById(R.id.question26);
            box26.setVisibility(View.VISIBLE);
            message.setVisibility(View.GONE);
            qno26.setText("QUES 26");
            question26.setText(array_list.get(25).getQUESTION());
            box26.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View arg0) {

                    mViewPager.setCurrentItem(25);

                }

            });

        }
        if(sharedPrefs.getBoolean("mark27",false)){

            LinearLayout box27 = (LinearLayout) rootView.findViewById(R.id.box27);
            TextView qno27 = (TextView) rootView.findViewById(R.id.qno27);
            TextView question27 = (TextView) rootView.findViewById(R.id.question27);
            box27.setVisibility(View.VISIBLE);
            message.setVisibility(View.GONE);
            qno27.setText("QUES 27");
            question27.setText(array_list.get(26).getQUESTION());
            box27.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View arg0) {

                    mViewPager.setCurrentItem(26);

                }

            });

        }
        if(sharedPrefs.getBoolean("mark28",false)){

            LinearLayout box28 = (LinearLayout) rootView.findViewById(R.id.box28);
            TextView qno28 = (TextView) rootView.findViewById(R.id.qno28);
            TextView question28 = (TextView) rootView.findViewById(R.id.question28);
            box28.setVisibility(View.VISIBLE);
            message.setVisibility(View.GONE);
            qno28.setText("QUES 28");
            question28.setText(array_list.get(27).getQUESTION());
            box28.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View arg0) {

                    mViewPager.setCurrentItem(27);

                }

            });

        }
        if(sharedPrefs.getBoolean("mark29",false)){

            LinearLayout box29 = (LinearLayout) rootView.findViewById(R.id.box29);
            TextView qno29 = (TextView) rootView.findViewById(R.id.qno29);
            TextView question29 = (TextView) rootView.findViewById(R.id.question29);
            box29.setVisibility(View.VISIBLE);
            message.setVisibility(View.GONE);
            qno29.setText("QUES 29");
            question29.setText(array_list.get(28).getQUESTION());
            box29.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View arg0) {

                    mViewPager.setCurrentItem(28);

                }

            });

        }
        if(sharedPrefs.getBoolean("mark30",false)){

            LinearLayout box30 = (LinearLayout) rootView.findViewById(R.id.box30);
            TextView qno30 = (TextView) rootView.findViewById(R.id.qno30);
            TextView question30 = (TextView) rootView.findViewById(R.id.question30);
            box30.setVisibility(View.VISIBLE);
            message.setVisibility(View.GONE);
            qno30.setText("QUES 30");
            question30.setText(array_list.get(29).getQUESTION());
            box30.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View arg0) {

                    mViewPager.setCurrentItem(29);

                }

            });

        }
        if(sharedPrefs.getBoolean("mark31",false)){

            LinearLayout box31 = (LinearLayout) rootView.findViewById(R.id.box31);
            TextView qno31 = (TextView) rootView.findViewById(R.id.qno31);
            TextView question31 = (TextView) rootView.findViewById(R.id.question31);
            box31.setVisibility(View.VISIBLE);
            message.setVisibility(View.GONE);
            qno31.setText("QUES 31");
            question31.setText(array_list.get(30).getQUESTION());
            box31.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View arg0) {

                    mViewPager.setCurrentItem(30);

                }

            });

        }
        if(sharedPrefs.getBoolean("mark32",false)){

            LinearLayout box32 = (LinearLayout) rootView.findViewById(R.id.box32);
            TextView qno32 = (TextView) rootView.findViewById(R.id.qno32);
            TextView question32 = (TextView) rootView.findViewById(R.id.question32);
            box32.setVisibility(View.VISIBLE);
            message.setVisibility(View.GONE);
            qno32.setText("QUES 32");
            question32.setText(array_list.get(31).getQUESTION());
            box32.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View arg0) {

                    mViewPager.setCurrentItem(31);

                }

            });

        }
        if(sharedPrefs.getBoolean("mark33",false)){

            LinearLayout box33 = (LinearLayout) rootView.findViewById(R.id.box33);
            TextView qno33 = (TextView) rootView.findViewById(R.id.qno33);
            TextView question33 = (TextView) rootView.findViewById(R.id.question33);
            box33.setVisibility(View.VISIBLE);
            message.setVisibility(View.GONE);
            qno33.setText("QUES 33");
            question33.setText(array_list.get(32).getQUESTION());
            box33.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View arg0) {

                    mViewPager.setCurrentItem(32);

                }

            });

        }
        if(sharedPrefs.getBoolean("mark34",false)){

            LinearLayout box34 = (LinearLayout) rootView.findViewById(R.id.box34);
            TextView qno34 = (TextView) rootView.findViewById(R.id.qno34);
            TextView question34 = (TextView) rootView.findViewById(R.id.question34);
            box34.setVisibility(View.VISIBLE);
            message.setVisibility(View.GONE);
            qno34.setText("QUES 34");
            question34.setText(array_list.get(33).getQUESTION());
            box34.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View arg0) {

                    mViewPager.setCurrentItem(33);

                }

            });

        }
        if(sharedPrefs.getBoolean("mark35",false)){

            LinearLayout box35 = (LinearLayout) rootView.findViewById(R.id.box35);
            TextView qno35 = (TextView) rootView.findViewById(R.id.qno35);
            TextView question35 = (TextView) rootView.findViewById(R.id.question35);
            box35.setVisibility(View.VISIBLE);
            message.setVisibility(View.GONE);
            qno35.setText("QUES 35");
            question35.setText(array_list.get(34).getQUESTION());
            box35.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View arg0) {

                    mViewPager.setCurrentItem(34);

                }

            });

        }
        if(sharedPrefs.getBoolean("mark36",false)){

            LinearLayout box36 = (LinearLayout) rootView.findViewById(R.id.box36);
            TextView qno36 = (TextView) rootView.findViewById(R.id.qno36);
            TextView question36 = (TextView) rootView.findViewById(R.id.question36);
            box36.setVisibility(View.VISIBLE);
            message.setVisibility(View.GONE);
            qno36.setText("QUES 36");
            question36.setText(array_list.get(35).getQUESTION());
            box36.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View arg0) {

                    mViewPager.setCurrentItem(35);

                }

            });

        }
        if(sharedPrefs.getBoolean("mark37",false)){

            LinearLayout box37 = (LinearLayout) rootView.findViewById(R.id.box37);
            TextView qno37 = (TextView) rootView.findViewById(R.id.qno37);
            TextView question37 = (TextView) rootView.findViewById(R.id.question37);
            box37.setVisibility(View.VISIBLE);
            message.setVisibility(View.GONE);
            qno37.setText("QUES 37");
            question37.setText(array_list.get(36).getQUESTION());
            box37.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View arg0) {

                    mViewPager.setCurrentItem(36);

                }

            });

        }
        if(sharedPrefs.getBoolean("mark38",false)){

            LinearLayout box38 = (LinearLayout) rootView.findViewById(R.id.box38);
            TextView qno38 = (TextView) rootView.findViewById(R.id.qno38);
            TextView question38 = (TextView) rootView.findViewById(R.id.question38);
            box38.setVisibility(View.VISIBLE);
            message.setVisibility(View.GONE);
            qno38.setText("QUES 38");
            question38.setText(array_list.get(37).getQUESTION());
            box38.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View arg0) {

                    mViewPager.setCurrentItem(37);

                }

            });

        }
        if(sharedPrefs.getBoolean("mark39",false)){

            LinearLayout box39 = (LinearLayout) rootView.findViewById(R.id.box39);
            TextView qno39 = (TextView) rootView.findViewById(R.id.qno39);
            TextView question39 = (TextView) rootView.findViewById(R.id.question39);
            box39.setVisibility(View.VISIBLE);
            message.setVisibility(View.GONE);
            qno39.setText("QUES 39");
            question39.setText(array_list.get(38).getQUESTION());
            box39.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View arg0) {

                    mViewPager.setCurrentItem(38);

                }

            });

        }
        if(sharedPrefs.getBoolean("mark40",false)){

            LinearLayout box40 = (LinearLayout) rootView.findViewById(R.id.box40);
            TextView qno40 = (TextView) rootView.findViewById(R.id.qno40);
            TextView question40 = (TextView) rootView.findViewById(R.id.question40);
            box40.setVisibility(View.VISIBLE);
            message.setVisibility(View.GONE);
            qno40.setText("QUES 40");
            question40.setText(array_list.get(39).getQUESTION());
            box40.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View arg0) {

                    mViewPager.setCurrentItem(39);

                }

            });

        }
        if(sharedPrefs.getBoolean("mark41",false)){

            LinearLayout box41 = (LinearLayout) rootView.findViewById(R.id.box41);
            TextView qno41 = (TextView) rootView.findViewById(R.id.qno41);
            TextView question41 = (TextView) rootView.findViewById(R.id.question41);
            box41.setVisibility(View.VISIBLE);
            message.setVisibility(View.GONE);
            qno41.setText("QUES 41");
            question41.setText(array_list.get(40).getQUESTION());
            box41.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View arg0) {

                    mViewPager.setCurrentItem(40);

                }

            });

        }
        if(sharedPrefs.getBoolean("mark42",false)){

            LinearLayout box42 = (LinearLayout) rootView.findViewById(R.id.box42);
            TextView qno42 = (TextView) rootView.findViewById(R.id.qno42);
            TextView question42 = (TextView) rootView.findViewById(R.id.question42);
            box42.setVisibility(View.VISIBLE);
            message.setVisibility(View.GONE);
            qno42.setText("QUES 42");
            question42.setText(array_list.get(41).getQUESTION());
            box42.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View arg0) {

                    mViewPager.setCurrentItem(41);

                }

            });

        }
        if(sharedPrefs.getBoolean("mark43",false)){

            LinearLayout box43 = (LinearLayout) rootView.findViewById(R.id.box43);
            TextView qno43 = (TextView) rootView.findViewById(R.id.qno43);
            TextView question43 = (TextView) rootView.findViewById(R.id.question43);
            box43.setVisibility(View.VISIBLE);
            message.setVisibility(View.GONE);
            qno43.setText("QUES 43");
            question43.setText(array_list.get(42).getQUESTION());
            box43.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View arg0) {

                    mViewPager.setCurrentItem(42);

                }

            });

        }
        if(sharedPrefs.getBoolean("mark44",false)){

            LinearLayout box44 = (LinearLayout) rootView.findViewById(R.id.box44);
            TextView qno44 = (TextView) rootView.findViewById(R.id.qno44);
            TextView question44 = (TextView) rootView.findViewById(R.id.question44);
            box44.setVisibility(View.VISIBLE);
            message.setVisibility(View.GONE);
            qno44.setText("QUES 44");
            question44.setText(array_list.get(43).getQUESTION());
            box44.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View arg0) {

                    mViewPager.setCurrentItem(43);

                }

            });

        }
        if(sharedPrefs.getBoolean("mark45",false)){

            LinearLayout box45 = (LinearLayout) rootView.findViewById(R.id.box45);
            TextView qno45 = (TextView) rootView.findViewById(R.id.qno45);
            TextView question45 = (TextView) rootView.findViewById(R.id.question45);
            box45.setVisibility(View.VISIBLE);
            message.setVisibility(View.GONE);
            qno45.setText("QUES 45");
            question45.setText(array_list.get(44).getQUESTION());
            box45.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View arg0) {

                    mViewPager.setCurrentItem(44);

                }

            });

        }
        if(sharedPrefs.getBoolean("mark46",false)){

            LinearLayout box46 = (LinearLayout) rootView.findViewById(R.id.box46);
            TextView qno46 = (TextView) rootView.findViewById(R.id.qno46);
            TextView question46 = (TextView) rootView.findViewById(R.id.question46);
            box46.setVisibility(View.VISIBLE);
            message.setVisibility(View.GONE);
            qno46.setText("QUES 46");
            question46.setText(array_list.get(45).getQUESTION());
            box46.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View arg0) {

                    mViewPager.setCurrentItem(45);

                }

            });

        }
        if(sharedPrefs.getBoolean("mark47",false)){

            LinearLayout box47 = (LinearLayout) rootView.findViewById(R.id.box47);
            TextView qno47 = (TextView) rootView.findViewById(R.id.qno47);
            TextView question47 = (TextView) rootView.findViewById(R.id.question47);
            box47.setVisibility(View.VISIBLE);
            message.setVisibility(View.GONE);
            qno47.setText("QUES 47");
            question47.setText(array_list.get(46).getQUESTION());
            box47.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View arg0) {

                    mViewPager.setCurrentItem(46);

                }

            });

        }
        if(sharedPrefs.getBoolean("mark48",false)){

            LinearLayout box48 = (LinearLayout) rootView.findViewById(R.id.box48);
            TextView qno48 = (TextView) rootView.findViewById(R.id.qno48);
            TextView question48 = (TextView) rootView.findViewById(R.id.question48);
            box48.setVisibility(View.VISIBLE);
            message.setVisibility(View.GONE);
            qno48.setText("QUES 48");
            question48.setText(array_list.get(47).getQUESTION());
            box48.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View arg0) {

                    mViewPager.setCurrentItem(47);

                }

            });

        }
        if(sharedPrefs.getBoolean("mark49",false)){

            LinearLayout box49 = (LinearLayout) rootView.findViewById(R.id.box49);
            TextView qno49 = (TextView) rootView.findViewById(R.id.qno49);
            TextView question49 = (TextView) rootView.findViewById(R.id.question49);
            box49.setVisibility(View.VISIBLE);
            message.setVisibility(View.GONE);
            qno49.setText("QUES 49");
            question49.setText(array_list.get(48).getQUESTION());
            box49.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View arg0) {

                    mViewPager.setCurrentItem(48);

                }

            });

        }
        if(sharedPrefs.getBoolean("mark50",false)){

            LinearLayout box50 = (LinearLayout) rootView.findViewById(R.id.box50);
            TextView qno50 = (TextView) rootView.findViewById(R.id.qno50);
            TextView question50 = (TextView) rootView.findViewById(R.id.question50);
            box50.setVisibility(View.VISIBLE);
            message.setVisibility(View.GONE);
            qno50.setText("QUES 50");
            question50.setText(array_list.get(49).getQUESTION());
            box50.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View arg0) {

                    mViewPager.setCurrentItem(49);

                }

            });

        }
        if(sharedPrefs.getBoolean("mark51",false)){

            LinearLayout box51 = (LinearLayout) rootView.findViewById(R.id.box51);
            TextView qno51 = (TextView) rootView.findViewById(R.id.qno51);
            TextView question51 = (TextView) rootView.findViewById(R.id.question51);
            box51.setVisibility(View.VISIBLE);
            message.setVisibility(View.GONE);
            qno51.setText("QUES 51");
            question51.setText(array_list.get(50).getQUESTION());
            box51.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View arg0) {

                    mViewPager.setCurrentItem(50);

                }

            });

        }
        if(sharedPrefs.getBoolean("mark52",false)){

            LinearLayout box52 = (LinearLayout) rootView.findViewById(R.id.box52);
            TextView qno52 = (TextView) rootView.findViewById(R.id.qno52);
            TextView question52 = (TextView) rootView.findViewById(R.id.question52);
            box52.setVisibility(View.VISIBLE);
            message.setVisibility(View.GONE);
            qno52.setText("QUES 52");
            question52.setText(array_list.get(51).getQUESTION());
            box52.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View arg0) {

                    mViewPager.setCurrentItem(51);

                }

            });

        }
        if(sharedPrefs.getBoolean("mark53",false)){

            LinearLayout box53 = (LinearLayout) rootView.findViewById(R.id.box53);
            TextView qno53 = (TextView) rootView.findViewById(R.id.qno53);
            TextView question53 = (TextView) rootView.findViewById(R.id.question53);
            box53.setVisibility(View.VISIBLE);
            message.setVisibility(View.GONE);
            qno53.setText("QUES 53");
            question53.setText(array_list.get(52).getQUESTION());
            box53.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View arg0) {

                    mViewPager.setCurrentItem(52);

                }

            });

        }
        if(sharedPrefs.getBoolean("mark54",false)){

            LinearLayout box54 = (LinearLayout) rootView.findViewById(R.id.box54);
            TextView qno54 = (TextView) rootView.findViewById(R.id.qno54);
            TextView question54 = (TextView) rootView.findViewById(R.id.question54);
            box54.setVisibility(View.VISIBLE);
            message.setVisibility(View.GONE);
            qno54.setText("QUES 54");
            question54.setText(array_list.get(53).getQUESTION());
            box54.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View arg0) {

                    mViewPager.setCurrentItem(53);

                }

            });

        }
        if(sharedPrefs.getBoolean("mark55",false)){

            LinearLayout box55 = (LinearLayout) rootView.findViewById(R.id.box55);
            TextView qno55 = (TextView) rootView.findViewById(R.id.qno55);
            TextView question55 = (TextView) rootView.findViewById(R.id.question55);
            box55.setVisibility(View.VISIBLE);
            message.setVisibility(View.GONE);
            qno55.setText("QUES 55");
            question55.setText(array_list.get(54).getQUESTION());
            box55.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View arg0) {

                    mViewPager.setCurrentItem(54);

                }

            });

        }
        if(sharedPrefs.getBoolean("mark56",false)){

            LinearLayout box56 = (LinearLayout) rootView.findViewById(R.id.box56);
            TextView qno56 = (TextView) rootView.findViewById(R.id.qno56);
            TextView question56 = (TextView) rootView.findViewById(R.id.question56);
            box56.setVisibility(View.VISIBLE);
            message.setVisibility(View.GONE);
            qno56.setText("QUES 56");
            question56.setText(array_list.get(55).getQUESTION());
            box56.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View arg0) {

                    mViewPager.setCurrentItem(55);

                }

            });

        }
        if(sharedPrefs.getBoolean("mark57",false)){

            LinearLayout box57 = (LinearLayout) rootView.findViewById(R.id.box57);
            TextView qno57 = (TextView) rootView.findViewById(R.id.qno57);
            TextView question57 = (TextView) rootView.findViewById(R.id.question57);
            box57.setVisibility(View.VISIBLE);
            message.setVisibility(View.GONE);
            qno57.setText("QUES 57");
            question57.setText(array_list.get(56).getQUESTION());
            box57.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View arg0) {

                    mViewPager.setCurrentItem(56);

                }

            });

        }
        if(sharedPrefs.getBoolean("mark58",false)){

            LinearLayout box58 = (LinearLayout) rootView.findViewById(R.id.box58);
            TextView qno58 = (TextView) rootView.findViewById(R.id.qno58);
            TextView question58 = (TextView) rootView.findViewById(R.id.question58);
            box58.setVisibility(View.VISIBLE);
            message.setVisibility(View.GONE);
            qno58.setText("QUES 58");
            question58.setText(array_list.get(57).getQUESTION());
            box58.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View arg0) {

                    mViewPager.setCurrentItem(57);

                }

            });

        }
        if(sharedPrefs.getBoolean("mark59",false)){

            LinearLayout box59 = (LinearLayout) rootView.findViewById(R.id.box59);
            TextView qno59 = (TextView) rootView.findViewById(R.id.qno59);
            TextView question59 = (TextView) rootView.findViewById(R.id.question59);
            box59.setVisibility(View.VISIBLE);
            message.setVisibility(View.GONE);
            qno59.setText("QUES 59");
            question59.setText(array_list.get(58).getQUESTION());
            box59.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View arg0) {

                    mViewPager.setCurrentItem(58);

                }

            });

        }
        if(sharedPrefs.getBoolean("mark60",false)){

            LinearLayout box60 = (LinearLayout) rootView.findViewById(R.id.box60);
            TextView qno60 = (TextView) rootView.findViewById(R.id.qno60);
            TextView question60 = (TextView) rootView.findViewById(R.id.question60);
            box60.setVisibility(View.VISIBLE);
            message.setVisibility(View.GONE);
            qno60.setText("QUES 60");
            question60.setText(array_list.get(59).getQUESTION());
            box60.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View arg0) {

                    mViewPager.setCurrentItem(59);

                }

            });

        }
        if(sharedPrefs.getBoolean("mark61",false)){

            LinearLayout box61 = (LinearLayout) rootView.findViewById(R.id.box61);
            TextView qno61 = (TextView) rootView.findViewById(R.id.qno61);
            TextView question61 = (TextView) rootView.findViewById(R.id.question61);
            box61.setVisibility(View.VISIBLE);
            message.setVisibility(View.GONE);
            qno61.setText("QUES 61");
            question61.setText(array_list.get(60).getQUESTION());
            box61.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View arg0) {

                    mViewPager.setCurrentItem(60);

                }

            });

        }
        if(sharedPrefs.getBoolean("mark62",false)){

            LinearLayout box62 = (LinearLayout) rootView.findViewById(R.id.box62);
            TextView qno62 = (TextView) rootView.findViewById(R.id.qno62);
            TextView question62 = (TextView) rootView.findViewById(R.id.question62);
            box62.setVisibility(View.VISIBLE);
            message.setVisibility(View.GONE);
            qno62.setText("QUES 62");
            question62.setText(array_list.get(61).getQUESTION());
            box62.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View arg0) {

                    mViewPager.setCurrentItem(61);

                }

            });

        }
        if(sharedPrefs.getBoolean("mark63",false)){

            LinearLayout box63 = (LinearLayout) rootView.findViewById(R.id.box63);
            TextView qno63 = (TextView) rootView.findViewById(R.id.qno63);
            TextView question63 = (TextView) rootView.findViewById(R.id.question63);
            box63.setVisibility(View.VISIBLE);
            message.setVisibility(View.GONE);
            qno63.setText("QUES 63");
            question63.setText(array_list.get(62).getQUESTION());
            box63.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View arg0) {

                    mViewPager.setCurrentItem(62);

                }

            });

        }
        if(sharedPrefs.getBoolean("mark64",false)){

            LinearLayout box64 = (LinearLayout) rootView.findViewById(R.id.box64);
            TextView qno64 = (TextView) rootView.findViewById(R.id.qno64);
            TextView question64 = (TextView) rootView.findViewById(R.id.question64);
            box64.setVisibility(View.VISIBLE);
            message.setVisibility(View.GONE);
            qno64.setText("QUES 64");
            question64.setText(array_list.get(63).getQUESTION());
            box64.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View arg0) {

                    mViewPager.setCurrentItem(63);

                }

            });

        }
        if(sharedPrefs.getBoolean("mark65",false)){

            LinearLayout box65 = (LinearLayout) rootView.findViewById(R.id.box65);
            TextView qno65 = (TextView) rootView.findViewById(R.id.qno65);
            TextView question65 = (TextView) rootView.findViewById(R.id.question65);
            box65.setVisibility(View.VISIBLE);
            message.setVisibility(View.GONE);
            qno65.setText("QUES 65");
            question65.setText(array_list.get(64).getQUESTION());
            box65.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View arg0) {

                    mViewPager.setCurrentItem(64);

                }

            });

        }
        if(sharedPrefs.getBoolean("mark66",false)){

            LinearLayout box66 = (LinearLayout) rootView.findViewById(R.id.box66);
            TextView qno66 = (TextView) rootView.findViewById(R.id.qno66);
            TextView question66 = (TextView) rootView.findViewById(R.id.question66);
            box66.setVisibility(View.VISIBLE);
            message.setVisibility(View.GONE);
            qno66.setText("QUES 66");
            question66.setText(array_list.get(65).getQUESTION());
            box66.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View arg0) {

                    mViewPager.setCurrentItem(65);

                }

            });

        }
        if(sharedPrefs.getBoolean("mark67",false)){

            LinearLayout box67 = (LinearLayout) rootView.findViewById(R.id.box67);
            TextView qno67 = (TextView) rootView.findViewById(R.id.qno67);
            TextView question67 = (TextView) rootView.findViewById(R.id.question67);
            box67.setVisibility(View.VISIBLE);
            message.setVisibility(View.GONE);
            qno67.setText("QUES 67");
            question67.setText(array_list.get(66).getQUESTION());
            box67.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View arg0) {

                    mViewPager.setCurrentItem(66);

                }

            });

        }
        if(sharedPrefs.getBoolean("mark68",false)){

            LinearLayout box68 = (LinearLayout) rootView.findViewById(R.id.box68);
            TextView qno68 = (TextView) rootView.findViewById(R.id.qno68);
            TextView question68 = (TextView) rootView.findViewById(R.id.question68);
            box68.setVisibility(View.VISIBLE);
            message.setVisibility(View.GONE);
            qno68.setText("QUES 68");
            question68.setText(array_list.get(67).getQUESTION());
            box68.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View arg0) {

                    mViewPager.setCurrentItem(67);

                }

            });

        }
        if(sharedPrefs.getBoolean("mark69",false)){

            LinearLayout box69 = (LinearLayout) rootView.findViewById(R.id.box69);
            TextView qno69 = (TextView) rootView.findViewById(R.id.qno69);
            TextView question69 = (TextView) rootView.findViewById(R.id.question69);
            box69.setVisibility(View.VISIBLE);
            message.setVisibility(View.GONE);
            qno69.setText("QUES 69");
            question69.setText(array_list.get(68).getQUESTION());
            box69.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View arg0) {

                    mViewPager.setCurrentItem(68);

                }

            });

        }
        if(sharedPrefs.getBoolean("mark70",false)){

            LinearLayout box70 = (LinearLayout) rootView.findViewById(R.id.box70);
            TextView qno70 = (TextView) rootView.findViewById(R.id.qno70);
            TextView question70 = (TextView) rootView.findViewById(R.id.question70);
            box70.setVisibility(View.VISIBLE);
            message.setVisibility(View.GONE);
            qno70.setText("QUES 70");
            question70.setText(array_list.get(69).getQUESTION());
            box70.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View arg0) {

                    mViewPager.setCurrentItem(69);

                }

            });

        }







    }


}
