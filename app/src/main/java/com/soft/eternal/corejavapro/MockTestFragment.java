package com.soft.eternal.corejavapro;


import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;

import android.preference.PreferenceManager;

import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;



public class MockTestFragment extends Fragment {


    TextView ques_no, ques;
    RadioButton opt1, opt2, opt3, opt4, opt5, opt6;
    CheckBox cb1, cb2, cb3, cb4, cb5, cb6, mark;
    Button review;
    ImageView pre,next;

    SharedPreferences sharedpreferences;



    public void setQuesNAns (final ViewPager mViewPager, final Context context, View rootView, final int section, Table table)
    {



        ques_no = (TextView) rootView.findViewById(R.id.question_no);
        ques = (TextView) rootView.findViewById(R.id.question);
        opt1 = (RadioButton) rootView.findViewById(R.id.option1);
        opt2 = (RadioButton) rootView.findViewById(R.id.option2);
        opt3 = (RadioButton) rootView.findViewById(R.id.option3);
        opt4 = (RadioButton) rootView.findViewById(R.id.option4);
        opt5 = (RadioButton) rootView.findViewById(R.id.option5);
        opt6 = (RadioButton) rootView.findViewById(R.id.option6);

        cb1 = (CheckBox) rootView.findViewById(R.id.checkBox1);
        cb2 = (CheckBox) rootView.findViewById(R.id.checkBox2);
        cb3 = (CheckBox) rootView.findViewById(R.id.checkBox3);
        cb4 = (CheckBox) rootView.findViewById(R.id.checkBox4);
        cb5 = (CheckBox) rootView.findViewById(R.id.checkBox5);
        cb6 = (CheckBox) rootView.findViewById(R.id.checkBox6);
        next = (ImageView) rootView.findViewById(R.id.nextM);
        pre = (ImageView) rootView.findViewById(R.id.preM);
        mark = (CheckBox) rootView.findViewById(R.id.mark);
        review = (Button) rootView.findViewById(R.id.review);




        ques.setText(table.getQUESTION());
        ques_no.setText("Question "+ section);

        if(section == 1)
            pre.setVisibility(rootView.GONE);


        sharedpreferences = PreferenceManager.getDefaultSharedPreferences(context);
        final SharedPreferences.Editor editor = sharedpreferences.edit();

        if (Integer.parseInt(table.getNo_Opt()) == 2) {        // 2:- option count = 2 i.e true & false

                opt1.setText(table.getOPT_ONE());
                opt2.setText(table.getOPT_TWO());
                opt3.setVisibility(rootView.GONE);
                opt4.setVisibility(rootView.GONE);
                opt5.setVisibility(rootView.GONE);
                opt6.setVisibility(rootView.GONE);
                cb1.setVisibility(rootView.GONE);
                cb2.setVisibility(rootView.GONE);
                cb3.setVisibility(rootView.GONE);
                cb4.setVisibility(rootView.GONE);
                cb5.setVisibility(rootView.GONE);
                cb6.setVisibility(rootView.GONE);

        }
        if (Integer.parseInt(table.getNo_Opt()) == 4) {        // 4:- option count = 4
            if (Integer.parseInt(table.getTYPE()) == 2) {      // 2:- type = single


                opt1.setText(table.getOPT_ONE());
                opt2.setText(table.getOPT_TWO());
                opt3.setText(table.getOPT_THREE());
                opt4.setText(table.getOPT_FOUR());
                opt5.setVisibility(rootView.GONE);
                opt6.setVisibility(rootView.GONE);
                cb1.setVisibility(rootView.GONE);
                cb2.setVisibility(rootView.GONE);
                cb3.setVisibility(rootView.GONE);
                cb4.setVisibility(rootView.GONE);
                cb5.setVisibility(rootView.GONE);
                cb6.setVisibility(rootView.GONE);

            } else {

                opt1.setVisibility(rootView.GONE);
                opt2.setVisibility(rootView.GONE);
                opt3.setVisibility(rootView.GONE);
                opt4.setVisibility(rootView.GONE);
                opt5.setVisibility(rootView.GONE);
                opt6.setVisibility(rootView.GONE);
                cb1.setText(table.getOPT_ONE());
                cb2.setText(table.getOPT_TWO());
                cb3.setText(table.getOPT_THREE());
                cb4.setText(table.getOPT_FOUR());
                cb5.setVisibility(rootView.GONE);
                cb6.setVisibility(rootView.GONE);

            }
        }
        if (Integer.parseInt(table.getNo_Opt()) == 5) {        // 5:- option count = 5
            if (Integer.parseInt(table.getTYPE()) == 2) {      // 2:- type = single

                opt1.setText(table.getOPT_ONE());
                opt2.setText(table.getOPT_TWO());
                opt3.setText(table.getOPT_THREE());
                opt4.setText(table.getOPT_FOUR());
                opt5.setText(table.getOPT_FIVE());
                opt6.setVisibility(rootView.GONE);
                cb1.setVisibility(rootView.GONE);
                cb2.setVisibility(rootView.GONE);
                cb3.setVisibility(rootView.GONE);
                cb4.setVisibility(rootView.GONE);
                cb5.setVisibility(rootView.GONE);
                cb6.setVisibility(rootView.GONE);

            } else {

                opt1.setVisibility(rootView.GONE);
                opt2.setVisibility(rootView.GONE);
                opt3.setVisibility(rootView.GONE);
                opt4.setVisibility(rootView.GONE);
                opt5.setVisibility(rootView.GONE);
                opt6.setVisibility(rootView.GONE);
                cb1.setText(table.getOPT_ONE());
                cb2.setText(table.getOPT_TWO());
                cb3.setText(table.getOPT_THREE());
                cb4.setText(table.getOPT_FOUR());
                cb5.setText(table.getOPT_FIVE());
                cb6.setVisibility(rootView.GONE);

            }
        }
        if (Integer.parseInt(table.getNo_Opt()) == 6) {        // 6:- option count = 6
            if (Integer.parseInt(table.getTYPE()) == 2) {      // 2:- type = single

                opt1.setText(table.getOPT_ONE());
                opt2.setText(table.getOPT_TWO());
                opt3.setText(table.getOPT_THREE());
                opt4.setText(table.getOPT_FOUR());
                opt5.setText(table.getOPT_FIVE());
                opt6.setText(table.getOPT_SIX());
                cb1.setVisibility(rootView.GONE);
                cb2.setVisibility(rootView.GONE);
                cb3.setVisibility(rootView.GONE);
                cb4.setVisibility(rootView.GONE);
                cb5.setVisibility(rootView.GONE);
                cb6.setVisibility(rootView.GONE);

            } else {

                opt1.setVisibility(rootView.GONE);
                opt2.setVisibility(rootView.GONE);
                opt3.setVisibility(rootView.GONE);
                opt4.setVisibility(rootView.GONE);
                opt5.setVisibility(rootView.GONE);
                opt6.setVisibility(rootView.GONE);
                cb1.setText(table.getOPT_ONE());
                cb2.setText(table.getOPT_TWO());
                cb3.setText(table.getOPT_THREE());
                cb4.setText(table.getOPT_FOUR());
                cb5.setText(table.getOPT_FIVE());
                cb6.setText(table.getOPT_SIX());

            }


        }


        cb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cb1.isChecked()){
                    editor.putBoolean(String.format("cb1%d",section),true);
                    editor.commit();
                }
                else {
                    //cb1.setText(String.valueOf(sharedpreferences.getBoolean(String.format("cb1%d",section),false)));
                    editor.putBoolean(String.format("cb1%d", section), false);
                    editor.commit();
                }
            }
        });
        cb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cb2.isChecked()){
                    editor.putBoolean(String.format("cb2%d",section),true);
                    editor.commit();
                }
                else {
                    editor.putBoolean(String.format("cb2%d", section), false);
                    editor.commit();
                }
            }
        });
        cb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cb3.isChecked()){
                    editor.putBoolean(String.format("cb3%d",section),true);
                    editor.commit();
                }
                else {
                    editor.putBoolean(String.format("cb3%d", section), false);
                    editor.commit();
                }
            }
        });
        cb4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cb4.isChecked()){
                    editor.putBoolean(String.format("cb4%d",section),true);
                    editor.commit();
                }
                else {
                    editor.putBoolean(String.format("cb4%d", section), false);
                    editor.commit();
                }
            }
        });
        cb5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cb5.isChecked()){
                    editor.putBoolean(String.format("cb5%d",section),true);
                    editor.commit();
                }
                else {
                    editor.putBoolean(String.format("cb5%d", section), false);
                    editor.commit();
                }
            }
        });

        cb6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cb6.isChecked()){

                    editor.putBoolean(String.format("cb6%d",section),true);
                    editor.commit();
                }
                else {

                    editor.putBoolean(String.format("cb6%d", section), false);
                    editor.commit();
                }
            }
        });

        opt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(opt1.isChecked()){
                    //opt1.setText(String.valueOf(sharedpreferences.getBoolean(String.format("cb1%d",section),false)));
                    editor.putBoolean(String.format("opt1%d",section),true);
                    editor.putBoolean(String.format("opt2%d",section),false);
                    editor.putBoolean(String.format("opt3%d",section),false);
                    editor.putBoolean(String.format("opt4%d",section),false);
                    editor.putBoolean(String.format("opt5%d",section),false);
                    editor.putBoolean(String.format("opt6%d",section),false);
                    editor.commit();
                }
                else {
                    //opt1.setText(String.valueOf(sharedpreferences.getBoolean(String.format("cb1%d",section),false)));
                    editor.putBoolean(String.format("opt1%d", section), false);
                    editor.commit();
                }
            }
        });
        opt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(opt2.isChecked()){
                    editor.putBoolean(String.format("opt1%d",section),false);
                    editor.putBoolean(String.format("opt2%d",section),true);
                    editor.putBoolean(String.format("opt3%d",section),false);
                    editor.putBoolean(String.format("opt4%d",section),false);
                    editor.putBoolean(String.format("opt5%d",section),false);
                    editor.putBoolean(String.format("opt6%d",section),false);
                    editor.commit();
                }
                else {
                    editor.putBoolean(String.format("opt2%d", section), false);
                    editor.commit();
                }
            }
        });
        opt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(opt3.isChecked()){
                    editor.putBoolean(String.format("opt1%d",section),false);
                    editor.putBoolean(String.format("opt2%d",section),false);
                    editor.putBoolean(String.format("opt3%d",section),true);
                    editor.putBoolean(String.format("opt4%d",section),false);
                    editor.putBoolean(String.format("opt5%d",section),false);
                    editor.putBoolean(String.format("opt6%d",section),false);
                    editor.commit();
                }
                else {
                    editor.putBoolean(String.format("opt3%d", section), false);
                    editor.commit();
                }
            }
        });
        opt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(opt4.isChecked()){
                    editor.putBoolean(String.format("opt1%d",section),false);
                    editor.putBoolean(String.format("opt2%d",section),false);
                    editor.putBoolean(String.format("opt3%d",section),false);
                    editor.putBoolean(String.format("opt4%d",section),true);
                    editor.putBoolean(String.format("opt5%d",section),false);
                    editor.putBoolean(String.format("opt6%d",section),false);
                    editor.commit();
                }
                else {
                    editor.putBoolean(String.format("opt4%d", section), false);
                    editor.commit();
                }
            }
        });
        opt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(opt5.isChecked()){
                    editor.putBoolean(String.format("opt1%d",section),false);
                    editor.putBoolean(String.format("opt2%d",section),false);
                    editor.putBoolean(String.format("opt3%d",section),false);
                    editor.putBoolean(String.format("opt4%d",section),false);
                    editor.putBoolean(String.format("opt5%d",section),true);
                    editor.putBoolean(String.format("opt6%d",section),false);
                    editor.commit();
                }
                else {
                    editor.putBoolean(String.format("opt5%d", section), false);
                    editor.commit();
                }
            }
        });

        opt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(opt6.isChecked()){
                    editor.putBoolean(String.format("opt1%d",section),false);
                    editor.putBoolean(String.format("opt2%d",section),false);
                    editor.putBoolean(String.format("opt3%d",section),false);
                    editor.putBoolean(String.format("opt4%d",section),false);
                    editor.putBoolean(String.format("opt5%d",section),false);
                    editor.putBoolean(String.format("opt6%d",section),true);
                    editor.commit();
                }
                else {
                    editor.putBoolean(String.format("opt6%d", section), false);
                    editor.commit();
                }
            }
        });

        review.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                mViewPager.setCurrentItem(72);
            }

        });



        next.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                //submit.setBackgroundResource(R.drawable.submitbutton_brown);
                mViewPager.setCurrentItem(section);

            }

        });

        pre.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                //submit.setBackgroundResource(R.drawable.submitbutton_brown);
                mViewPager.setCurrentItem(section - 2);

            }

        });

        mark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mark.isChecked()){
                    editor.putBoolean(String.format("mark%d",section),true);
                    editor.commit();
                }
                else {
                    editor.putBoolean(String.format("mark%d", section), false);
                    editor.commit();
                }
            }
        });



    }
}
