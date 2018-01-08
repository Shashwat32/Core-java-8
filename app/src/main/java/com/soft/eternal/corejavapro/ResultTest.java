package com.soft.eternal.corejavapro;


import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;

import android.graphics.Color;
import android.preference.PreferenceManager;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;


public class ResultTest extends Fragment{


    TextView ques_no, ques,explaination, explain, res;
    RadioButton opt1, opt2, opt3, opt4, opt5, opt6;
    CheckBox cb1, cb2, cb3, cb4, cb5, cb6;
    Button home;
    ImageView next, pre;

    SharedPreferences sharedpreferences;
    //public static final String MyPREFERENCES = "MyPrefs" ;
    static ArrayList<Table> array_list;


    public void setQuesNAns (final ViewPager mViewPager, final Context context, View rootView, final int section, Table table)
    {
        int flag = 0;
        String correct_opt = table.getCORRECT_OPT();
        String corr_opt[] = correct_opt.split(" ");
        // String multiple_opt[]= new String[Integer.parseInt(table.getNo_Opt())];  // storing values from the frame chccked box
        //String single_opt = null;


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
        res = (TextView) rootView.findViewById(R.id.res);
        explaination = (TextView) rootView.findViewById(R.id.explaination);
        explain = (TextView) rootView.findViewById(R.id.explain);
        next = (ImageView) rootView.findViewById(R.id.nextM);
        pre = (ImageView) rootView.findViewById(R.id.preM);
        home =  (Button) rootView.findViewById(R.id.home);

        ques.setText(table.getQUESTION());
        ques_no.setText("Question "+ section);

        explain.setVisibility(View.VISIBLE);
        explaination.setVisibility(View.VISIBLE);
        explain.setText(table.getEXPLANATION());

        if(section == 1)
            pre.setVisibility(rootView.GONE);

        if(section == 70)
            next.setVisibility(rootView.GONE);

        sharedpreferences = PreferenceManager.getDefaultSharedPreferences(context);
        Gson gson = new Gson();
        String json = sharedpreferences.getString("ARRAY_LIST", null);
        Type type = new TypeToken<ArrayList<Table>>() {}.getType();
        array_list = gson.fromJson(json, type);

        if(array_list.size() == 15 && section == 15)
            next.setVisibility(rootView.GONE);

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

            if(sharedpreferences.getBoolean(String.format("opt1%d",section),false) && corr_opt[0].equalsIgnoreCase("A") ) {
                opt1.setTextColor(Color.parseColor("#039b0f"));
            }
            else if(sharedpreferences.getBoolean(String.format("opt1%d",section),false)&& !corr_opt[0].equalsIgnoreCase("A")){
                flag++;
                opt1.setTextColor(Color.RED);
            }
            else if(!sharedpreferences.getBoolean(String.format("opt1%d",section),false)&& corr_opt[0].equalsIgnoreCase("A") ){
                flag++;
                opt1.setTextColor(Color.parseColor("#039b0f"));
            }


            if(sharedpreferences.getBoolean(String.format("opt2%d",section),false) && corr_opt[0].equalsIgnoreCase("B") ) {
                opt2.setTextColor(Color.parseColor("#039b0f"));
            }
            else if(sharedpreferences.getBoolean(String.format("opt2%d",section),false)&& !corr_opt[0].equalsIgnoreCase("B")){
                flag++;
                opt2.setTextColor(Color.RED);
            }
            else if(!sharedpreferences.getBoolean(String.format("opt2%d",section),false)&& corr_opt[0].equalsIgnoreCase("B") ){
                flag++;
                opt2.setTextColor(Color.parseColor("#039b0f"));
            }

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

                if(sharedpreferences.getBoolean(String.format("opt1%d",section),false) && corr_opt[0].equalsIgnoreCase("A") ) {
                    opt1.setTextColor(Color.parseColor("#039b0f"));
                }
                else if(sharedpreferences.getBoolean(String.format("opt1%d",section),false)&& !corr_opt[0].equalsIgnoreCase("A")){
                    flag++;
                    opt1.setTextColor(Color.RED);
                }
                else if(!sharedpreferences.getBoolean(String.format("opt1%d",section),false)&& corr_opt[0].equalsIgnoreCase("A") ){
                    flag++;
                   opt1.setTextColor(Color.parseColor("#039b0f"));
                }


                if(sharedpreferences.getBoolean(String.format("opt2%d",section),false) && corr_opt[0].equalsIgnoreCase("B") ) {
                    opt2.setTextColor(Color.parseColor("#039b0f"));
                }
                else if(sharedpreferences.getBoolean(String.format("opt2%d",section),false)&& !corr_opt[0].equalsIgnoreCase("B")){
                    flag++;
                    opt2.setTextColor(Color.RED);
                }
                else if(!sharedpreferences.getBoolean(String.format("opt2%d",section),false)&& corr_opt[0].equalsIgnoreCase("B") ){
                    flag++;
                    opt2.setTextColor(Color.parseColor("#039b0f"));
                }



                if(sharedpreferences.getBoolean(String.format("opt3%d",section),false) && corr_opt[0].equalsIgnoreCase("C") ) {
                    opt3.setTextColor(Color.parseColor("#039b0f"));
                }
                else if(sharedpreferences.getBoolean(String.format("opt3%d",section),false)&& !corr_opt[0].equalsIgnoreCase("C")){
                    flag++;
                    opt3.setTextColor(Color.RED);
                }
                else if(!sharedpreferences.getBoolean(String.format("opt3%d",section),false)&& corr_opt[0].equalsIgnoreCase("C") ){
                    flag++;
                   opt3.setTextColor(Color.parseColor("#039b0f"));
                }


                if(sharedpreferences.getBoolean(String.format("opt4%d",section),false) && corr_opt[0].equalsIgnoreCase("D") ) {
                    opt4.setTextColor(Color.parseColor("#039b0f"));
                }
                else if(sharedpreferences.getBoolean(String.format("opt4%d",section),false)&& !corr_opt[0].equalsIgnoreCase("D")){
                    flag++;
                    opt4.setTextColor(Color.RED);
                }
                else if(!sharedpreferences.getBoolean(String.format("opt4%d",section),false)&& corr_opt[0].equalsIgnoreCase("D") ){
                    flag++;
                    opt4.setTextColor(Color.parseColor("#039b0f"));
                }


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

                if(sharedpreferences.getBoolean(String.format("cb1%d",section),false) && correct_opt.contains("A") ) {
                    cb1.setTextColor(Color.parseColor("#039b0f"));
                }
                else if(sharedpreferences.getBoolean(String.format("cb1%d",section),false)&& !correct_opt.contains("A")){
                    flag++;
                    cb1.setTextColor(Color.RED);
                }
                else if(!sharedpreferences.getBoolean(String.format("cb1%d",section),false)&& correct_opt.contains("A") ){
                    flag++;
                    cb1.setTextColor(Color.parseColor("#039b0f"));
                }


                if(sharedpreferences.getBoolean(String.format("cb2%d",section),false) && correct_opt.contains("B") ) {
                    cb2.setTextColor(Color.parseColor("#039b0f"));
                }
                else if(sharedpreferences.getBoolean(String.format("cb2%d",section),false)&& !correct_opt.contains("B")){
                    flag++;
                    cb2.setTextColor(Color.RED);
                }
                else if(!sharedpreferences.getBoolean(String.format("cb2%d",section),false)&& correct_opt.contains("B") ){
                    flag++;
                    cb2.setTextColor(Color.parseColor("#039b0f"));
                }



                if(sharedpreferences.getBoolean(String.format("cb3%d",section),false) && correct_opt.contains("C") ) {
                    cb3.setTextColor(Color.parseColor("#039b0f"));
                }
                else if(sharedpreferences.getBoolean(String.format("cb3%d",section),false)&& !correct_opt.contains("C")){
                    flag++;
                    cb3.setTextColor(Color.RED);
                }
                else if(!sharedpreferences.getBoolean(String.format("cb3%d",section),false)&& correct_opt.contains("C") ){
                    flag++;
                    cb3.setTextColor(Color.parseColor("#039b0f"));
                }


                if(sharedpreferences.getBoolean(String.format("cb4%d",section),false) && correct_opt.contains("D") ) {
                    cb4.setTextColor(Color.parseColor("#039b0f"));
                }
                else if(sharedpreferences.getBoolean(String.format("cb4%d",section),false)&& !correct_opt.contains("D")){
                    flag++;
                    cb4.setTextColor(Color.RED);
                }
                else if(!sharedpreferences.getBoolean(String.format("cb4%d",section),false)&& correct_opt.contains("D") ){
                    flag++;
                    cb4.setTextColor(Color.parseColor("#039b0f"));
                }


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

                if(sharedpreferences.getBoolean(String.format("opt1%d",section),false) && corr_opt[0].equalsIgnoreCase("A") ) {
                    opt1.setTextColor(Color.parseColor("#039b0f"));
                }
                else if(sharedpreferences.getBoolean(String.format("opt1%d",section),false)&& !corr_opt[0].equalsIgnoreCase("A")){
                    flag++;
                    opt1.setTextColor(Color.RED);
                }
                else if(!sharedpreferences.getBoolean(String.format("opt1%d",section),false)&& corr_opt[0].equalsIgnoreCase("A") ){
                    flag++;
                    opt1.setTextColor(Color.parseColor("#039b0f"));
                }


                if(sharedpreferences.getBoolean(String.format("opt2%d",section),false) && corr_opt[0].equalsIgnoreCase("B") ) {
                    opt2.setTextColor(Color.parseColor("#039b0f"));
                }
                else if(sharedpreferences.getBoolean(String.format("opt2%d",section),false)&& !corr_opt[0].equalsIgnoreCase("B")){
                    flag++;
                    opt2.setTextColor(Color.RED);
                }
                else if(!sharedpreferences.getBoolean(String.format("opt2%d",section),false)&& corr_opt[0].equalsIgnoreCase("B") ){
                    flag++;
                    opt2.setTextColor(Color.parseColor("#039b0f"));
                }



                if(sharedpreferences.getBoolean(String.format("opt3%d",section),false) && corr_opt[0].equalsIgnoreCase("C") ) {
                    opt3.setTextColor(Color.parseColor("#039b0f"));
                }
                else if(sharedpreferences.getBoolean(String.format("opt3%d",section),false)&& !corr_opt[0].equalsIgnoreCase("C")){
                    flag++;
                    opt3.setTextColor(Color.RED);
                }
                else if(!sharedpreferences.getBoolean(String.format("opt3%d",section),false)&& corr_opt[0].equalsIgnoreCase("C") ){
                    flag++;
                    opt3.setTextColor(Color.parseColor("#039b0f"));
                }


                if(sharedpreferences.getBoolean(String.format("opt4%d",section),false) && corr_opt[0].equalsIgnoreCase("D") ) {
                    opt4.setTextColor(Color.parseColor("#039b0f"));
                }
                else if(sharedpreferences.getBoolean(String.format("opt4%d",section),false)&& !corr_opt[0].equalsIgnoreCase("D")){
                    flag++;
                    opt4.setTextColor(Color.RED);
                }
                else if(!sharedpreferences.getBoolean(String.format("opt4%d",section),false)&& corr_opt[0].equalsIgnoreCase("D") ){
                    flag++;
                    opt4.setTextColor(Color.parseColor("#039b0f"));
                }

                if(sharedpreferences.getBoolean(String.format("opt5%d",section),false) && corr_opt[0].equalsIgnoreCase("E") ) {
                    opt5.setTextColor(Color.parseColor("#039b0f"));
                }
                else if(sharedpreferences.getBoolean(String.format("opt5%d",section),false)&& !corr_opt[0].equalsIgnoreCase("E")){
                    flag++;
                    opt5.setTextColor(Color.RED);
                }
                else if(!sharedpreferences.getBoolean(String.format("opt5%d",section),false)&& corr_opt[0].equalsIgnoreCase("E") ){
                    flag++;
                    opt5.setTextColor(Color.parseColor("#039b0f"));
                }


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

                if(sharedpreferences.getBoolean(String.format("cb1%d",section),false) && correct_opt.contains("A") ) {
                    cb1.setTextColor(Color.parseColor("#039b0f"));
                }
                else if(sharedpreferences.getBoolean(String.format("cb1%d",section),false)&& !correct_opt.contains("A")){
                    flag++;
                    cb1.setTextColor(Color.RED);
                }
                else if(!sharedpreferences.getBoolean(String.format("cb1%d",section),false)&& correct_opt.contains("A") ){
                    flag++;
                    cb1.setTextColor(Color.parseColor("#039b0f"));
                }


                if(sharedpreferences.getBoolean(String.format("cb2%d",section),false) && correct_opt.contains("B") ) {
                    cb2.setTextColor(Color.parseColor("#039b0f"));
                }
                else if(sharedpreferences.getBoolean(String.format("cb2%d",section),false)&& !correct_opt.contains("B")){
                    flag++;
                    cb2.setTextColor(Color.RED);
                }
                else if(!sharedpreferences.getBoolean(String.format("cb2%d",section),false)&& correct_opt.contains("B") ){
                    flag++;
                    cb2.setTextColor(Color.parseColor("#039b0f"));
                }



                if(sharedpreferences.getBoolean(String.format("cb3%d",section),false) && correct_opt.contains("C") ) {
                    cb3.setTextColor(Color.parseColor("#039b0f"));
                }
                else if(sharedpreferences.getBoolean(String.format("cb3%d",section),false)&& !correct_opt.contains("C")){
                    flag++;
                    cb3.setTextColor(Color.RED);
                }
                else if(!sharedpreferences.getBoolean(String.format("cb3%d",section),false)&& correct_opt.contains("C") ){
                    flag++;
                    cb3.setTextColor(Color.parseColor("#039b0f"));
                }


                if(sharedpreferences.getBoolean(String.format("cb4%d",section),false) && correct_opt.contains("D") ) {
                    cb4.setTextColor(Color.parseColor("#039b0f"));
                }
                else if(sharedpreferences.getBoolean(String.format("cb4%d",section),false)&& !correct_opt.contains("D")){
                    flag++;
                    cb4.setTextColor(Color.RED);
                }
                else if(!sharedpreferences.getBoolean(String.format("cb4%d",section),false)&& correct_opt.contains("D") ){
                    flag++;
                    cb4.setTextColor(Color.parseColor("#039b0f"));
                }

                if(sharedpreferences.getBoolean(String.format("cb5%d",section),false) && correct_opt.contains("E") ) {
                    cb5.setTextColor(Color.parseColor("#039b0f"));
                }
                else if(sharedpreferences.getBoolean(String.format("cb5%d",section),false)&& !correct_opt.contains("E")){
                    flag++;
                    cb5.setTextColor(Color.RED);
                }
                else if(!sharedpreferences.getBoolean(String.format("cb5%d",section),false)&& correct_opt.contains("E") ){
                    flag++;
                    cb5.setTextColor(Color.parseColor("#039b0f"));
                }

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

                if(sharedpreferences.getBoolean(String.format("opt1%d",section),false) && corr_opt[0].equalsIgnoreCase("A") ) {
                    opt1.setTextColor(Color.parseColor("#039b0f"));
                }
                else if(sharedpreferences.getBoolean(String.format("opt1%d",section),false)&& !corr_opt[0].equalsIgnoreCase("A")){
                    flag++;
                    opt1.setTextColor(Color.RED);
                }
                else if(!sharedpreferences.getBoolean(String.format("opt1%d",section),false)&& corr_opt[0].equalsIgnoreCase("A") ){
                    flag++;
                    opt1.setTextColor(Color.parseColor("#039b0f"));
                }


                if(sharedpreferences.getBoolean(String.format("opt2%d",section),false) && corr_opt[0].equalsIgnoreCase("B") ) {
                    opt2.setTextColor(Color.parseColor("#039b0f"));
                }
                else if(sharedpreferences.getBoolean(String.format("opt2%d",section),false)&& !corr_opt[0].equalsIgnoreCase("B")){
                    flag++;
                    opt2.setTextColor(Color.RED);
                }
                else if(!sharedpreferences.getBoolean(String.format("opt2%d",section),false)&& corr_opt[0].equalsIgnoreCase("B") ){
                    flag++;
                    opt2.setTextColor(Color.parseColor("#039b0f"));
                }



                if(sharedpreferences.getBoolean(String.format("opt3%d",section),false) && corr_opt[0].equalsIgnoreCase("C") ) {
                    opt3.setTextColor(Color.parseColor("#039b0f"));
                }
                else if(sharedpreferences.getBoolean(String.format("opt3%d",section),false)&& !corr_opt[0].equalsIgnoreCase("C")){
                    flag++;
                    opt3.setTextColor(Color.RED);
                }
                else if(!sharedpreferences.getBoolean(String.format("opt3%d",section),false)&& corr_opt[0].equalsIgnoreCase("C") ){
                    flag++;
                    opt3.setTextColor(Color.parseColor("#039b0f"));
                }


                if(sharedpreferences.getBoolean(String.format("opt4%d",section),false) && corr_opt[0].equalsIgnoreCase("D") ) {
                    opt4.setTextColor(Color.parseColor("#039b0f"));
                }
                else if(sharedpreferences.getBoolean(String.format("opt4%d",section),false)&& !corr_opt[0].equalsIgnoreCase("D")){
                    flag++;
                    opt4.setTextColor(Color.RED);
                }
                else if(!sharedpreferences.getBoolean(String.format("opt4%d",section),false)&& corr_opt[0].equalsIgnoreCase("D") ){
                    flag++;
                    opt4.setTextColor(Color.parseColor("#039b0f"));
                }

                if(sharedpreferences.getBoolean(String.format("opt5%d",section),false) && corr_opt[0].equalsIgnoreCase("E") ) {
                    opt5.setTextColor(Color.parseColor("#039b0f"));
                }
                else if(sharedpreferences.getBoolean(String.format("opt5%d",section),false)&& !corr_opt[0].equalsIgnoreCase("E")){
                    flag++;
                    opt5.setTextColor(Color.RED);
                }
                else if(!sharedpreferences.getBoolean(String.format("opt5%d",section),false)&& corr_opt[0].equalsIgnoreCase("E") ){
                    flag++;
                    opt5.setTextColor(Color.parseColor("#039b0f"));
                }

                if(sharedpreferences.getBoolean(String.format("opt6%d",section),false) && corr_opt[0].equalsIgnoreCase("F") ) {
                    opt6.setTextColor(Color.parseColor("#039b0f"));
                }
                else if(sharedpreferences.getBoolean(String.format("opt6%d",section),false)&& !corr_opt[0].equalsIgnoreCase("F")){
                    flag++;
                    opt6.setTextColor(Color.RED);
                }
                else if(!sharedpreferences.getBoolean(String.format("opt6%d",section),false)&& corr_opt[0].equalsIgnoreCase("F") ){
                    flag++;
                    opt6.setTextColor(Color.parseColor("#039b0f"));
                }

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


                if(sharedpreferences.getBoolean(String.format("cb1%d",section),false) && correct_opt.contains("A") ) {
                    cb1.setTextColor(Color.parseColor("#039b0f"));
                }
                else if(sharedpreferences.getBoolean(String.format("cb1%d",section),false)&& !correct_opt.contains("A")){
                    flag++;
                    cb1.setTextColor(Color.RED);
                }
                else if(!sharedpreferences.getBoolean(String.format("cb1%d",section),false)&& correct_opt.contains("A") ){
                    flag++;
                    cb1.setTextColor(Color.parseColor("#039b0f"));
                }


                if(sharedpreferences.getBoolean(String.format("cb2%d",section),false) && correct_opt.contains("B") ) {
                    cb2.setTextColor(Color.parseColor("#039b0f"));
                }
                else if(sharedpreferences.getBoolean(String.format("cb2%d",section),false)&& !correct_opt.contains("B")){
                    flag++;
                    cb2.setTextColor(Color.RED);
                }
                else if(!sharedpreferences.getBoolean(String.format("cb2%d",section),false)&& correct_opt.contains("B") ){
                    flag++;
                    cb2.setTextColor(Color.parseColor("#039b0f"));
                }



                if(sharedpreferences.getBoolean(String.format("cb3%d",section),false) && correct_opt.contains("C") ) {
                    cb3.setTextColor(Color.parseColor("#039b0f"));
                }
                else if(sharedpreferences.getBoolean(String.format("cb3%d",section),false)&& !correct_opt.contains("C")){
                    flag++;
                    cb3.setTextColor(Color.RED);
                }
                else if(!sharedpreferences.getBoolean(String.format("cb3%d",section),false)&& correct_opt.contains("C") ){
                    flag++;
                    cb3.setTextColor(Color.parseColor("#039b0f"));
                }


                if(sharedpreferences.getBoolean(String.format("cb4%d",section),false) && correct_opt.contains("D") ) {
                    cb4.setTextColor(Color.parseColor("#039b0f"));
                }
                else if(sharedpreferences.getBoolean(String.format("cb4%d",section),false)&& !correct_opt.contains("D")){
                    flag++;
                    cb4.setTextColor(Color.RED);
                }
                else if(!sharedpreferences.getBoolean(String.format("cb4%d",section),false)&& correct_opt.contains("D") ){
                    flag++;
                    cb4.setTextColor(Color.parseColor("#039b0f"));
                }

                if(sharedpreferences.getBoolean(String.format("cb5%d",section),false) && correct_opt.contains("E") ) {
                    cb5.setTextColor(Color.parseColor("#039b0f"));
                }
                else if(sharedpreferences.getBoolean(String.format("cb5%d",section),false)&& !correct_opt.contains("E")){
                    flag++;
                    cb5.setTextColor(Color.RED);
                }
                else if(!sharedpreferences.getBoolean(String.format("cb5%d",section),false)&& correct_opt.contains("E") ){
                    flag++;
                    cb5.setTextColor(Color.parseColor("#039b0f"));
                }

                if(sharedpreferences.getBoolean(String.format("cb6%d",section),false) && correct_opt.contains("F") ) {
                    cb6.setTextColor(Color.parseColor("#039b0f"));
                }
                else if(sharedpreferences.getBoolean(String.format("cb6%d",section),false)&& !correct_opt.contains("F")){
                    flag++;
                    cb6.setTextColor(Color.RED);
                }
                else if(!sharedpreferences.getBoolean(String.format("cb6%d",section),false)&& correct_opt.contains("F") ){
                    flag++;
                    cb6.setTextColor(Color.parseColor("#039b0f"));
                }

            }




        }


        if(flag != 0){
            res.setTextColor(Color.RED);
            res.setText("INCORRECT");
        }
        else{
            res.setTextColor(Color.parseColor("#039b0f"));
            res.setText("CORRECT");
        }

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, Home.class);
                context.startActivity(intent);
            }
        });

        next.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                mViewPager.setCurrentItem(section);

            }

        });

        pre.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                mViewPager.setCurrentItem(section - 2);

            }

        });


    }

}
