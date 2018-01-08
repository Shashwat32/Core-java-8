package com.soft.eternal.corejavapro;


import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.preference.PreferenceManager;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;



public class QnAFragment extends Fragment {

    TextView ques_no, ques, explaination, explain, res;
    RadioButton opt1, opt2, opt3, opt4, opt5, opt6;
    CheckBox cb1, cb2, cb3, cb4, cb5, cb6;
    Button submit,reset;
    ImageView next, pre;
    RadioGroup radioGroup;
    View topLevelLayout;
    ImageView got;

    public void setQuesNAns(final Context activity, final ViewPager mViewPager, final View rootView, final int section, boolean isLast, final Table table) {
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
        explaination = (TextView) rootView.findViewById(R.id.explaination);
        explain = (TextView) rootView.findViewById(R.id.explain);
        submit = (Button) rootView.findViewById(R.id.submit);
        res = (TextView) rootView.findViewById(R.id.res);
        next = (ImageView) rootView.findViewById(R.id.next);
        pre = (ImageView) rootView.findViewById(R.id.pre);
        reset = (Button) rootView.findViewById(R.id.reset);
        radioGroup = (RadioGroup) rootView.findViewById(R.id.radioGroup);
        topLevelLayout = rootView.findViewById(R.id.top_layout);
        got = (ImageView) rootView.findViewById(R.id.got);

        ques.setText(table.getQUESTION());
        ques_no.setText("Question " + section);

        final  SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(activity);

        if(section == 1) {
            pre.setVisibility(rootView.GONE);
            boolean ranBefore = preferences.getBoolean("RanBefore", false);
            if (!ranBefore) {
                topLevelLayout.setVisibility(rootView.VISIBLE);
                got.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        topLevelLayout.setVisibility(rootView.INVISIBLE);
                        SharedPreferences.Editor editor = preferences.edit();
                        editor.putBoolean("RanBefore", true);
                        editor.commit();
                    }
                });

            }
        }

        if(isLast)
            next.setVisibility(rootView.GONE);

        if (Integer.parseInt(table.getNo_Opt()) == 2) {        // 4:- option count = 4
            // 2:- type = single


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

        //Button nextButton = (Button) rootView.findViewById(R.id.next);
        // nextButton.hasOnClickListeners(rootView.setCurrentItem(int , boolean true));
        if(Integer.parseInt(table.getTYPE()) == 2) {
            reset.setVisibility(rootView.VISIBLE);
            reset.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View arg0) {
                    res.setVisibility(View.GONE);
                    radioGroup.clearCheck();
                    opt1.setTextColor(Color.BLACK);
                    opt2.setTextColor(Color.BLACK);
                    opt3.setTextColor(Color.BLACK);
                    opt4.setTextColor(Color.BLACK);
                    opt5.setTextColor(Color.BLACK);
                    opt6.setTextColor(Color.BLACK);
                    explain.setVisibility(View.GONE);
                    explaination.setVisibility(View.GONE);

                }

            });
        }
        submit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                //submit.setBackgroundResource(R.drawable.submitbutton_brown);
                explain.setVisibility(View.VISIBLE);
                explaination.setVisibility(View.VISIBLE);
                res.setVisibility(View.VISIBLE);
                boolean result = check(table);
                if(!result){
                    res.setTextColor(Color.RED);
                    res.setText("INCORRECT");
                }
                else {
                    res.setTextColor(Color.parseColor("#039b0f"));
                    res.setText("CORRECT");
                }

                explain.setText(table.getEXPLANATION());

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

    }




    /**
     *
     * @param table
     * @return true or false
     * for checking the answer whether it is correct or not
     */
    public boolean check(Table table){
        String correct_opt = table.getCORRECT_OPT();
        String corr_opt[] = correct_opt.split(" ");
        String multiple_opt[]= new String[Integer.parseInt(table.getNo_Opt())];  // storing values from the frame chccked box
        String single_opt = null;

        int i = 0;
        if(Integer.parseInt(table.getTYPE()) == 1){

            /*if(cb1.isChecked())
                multiple_opt[i++] = "A";
            if(cb2.isChecked())
                multiple_opt[i++] = "B";
            if(cb3.isChecked())
                multiple_opt[i++] = "C";
            if(cb4.isChecked())
                multiple_opt[i++] = "D";
            if(cb5.isChecked())
                multiple_opt[i++] = "E";
            if(cb6.isChecked())
                multiple_opt[i++] = "F";*/

            if(cb1.isChecked() && correct_opt.contains("A") ){
                cb1.setTextColor(Color.parseColor("#039b0f"));
                multiple_opt[i++] = "A";
            }
            else if (cb1.isChecked() && !correct_opt.contains("A")){
                cb1.setTextColor(Color.RED);
                multiple_opt[i++] = "A";
            }
            else if (!cb1.isChecked() && correct_opt.contains("A")){
                cb1.setTextColor(Color.parseColor("#039b0f"));
            }
            else{
                cb1.setTextColor(Color.BLACK);
            }


            if(cb2.isChecked() && correct_opt.contains("B") ){
                cb2.setTextColor(Color.parseColor("#039b0f"));
                multiple_opt[i++] = "B";
            }
            else if (cb2.isChecked() && !correct_opt.contains("B")){
                cb2.setTextColor(Color.RED);
                multiple_opt[i++] = "B";
            }
            else if (!cb2.isChecked() && correct_opt.contains("B")){
                cb2.setTextColor(Color.parseColor("#039b0f"));
            }
            else{
                cb2.setTextColor(Color.BLACK);
            }


            if(cb3.isChecked() && correct_opt.contains("C") ){
                cb3.setTextColor(Color.parseColor("#039b0f"));
                multiple_opt[i++] = "C";
            }
            else if (cb3.isChecked() && !correct_opt.contains("C")){
                cb3.setTextColor(Color.RED);
                multiple_opt[i++] = "C";
            }
            else if (!cb3.isChecked() && correct_opt.contains("C")){
                cb3.setTextColor(Color.parseColor("#039b0f"));
            }
            else{
                cb3.setTextColor(Color.BLACK);
            }


            if(cb4.isChecked() && correct_opt.contains("D") ){
                cb4.setTextColor(Color.parseColor("#039b0f"));
                multiple_opt[i++] = "D";
            }
            else if (cb4.isChecked() && !correct_opt.contains("D")){
                cb4.setTextColor(Color.RED);
                multiple_opt[i++] = "D";
            }
            else if (!cb4.isChecked() && correct_opt.contains("D")){
                cb4.setTextColor(Color.parseColor("#039b0f"));
            }
            else{
                cb4.setTextColor(Color.BLACK);
            }

            if(cb5.isChecked() && correct_opt.contains("E") ){
                cb5.setTextColor(Color.parseColor("#039b0f"));
                multiple_opt[i++] = "E";
            }
            else if (cb5.isChecked() && !correct_opt.contains("E")){
                cb5.setTextColor(Color.RED);
                multiple_opt[i++] = "E";
            }
            else if (!cb5.isChecked() && correct_opt.contains("E")){
                cb5.setTextColor(Color.parseColor("#039b0f"));
            }
            else{
                cb5.setTextColor(Color.BLACK);
            }


            if(cb6.isChecked() && correct_opt.contains("F") ){
                cb6.setTextColor(Color.parseColor("#039b0f"));
                multiple_opt[i++] = "F";
            }
            else if (cb6.isChecked() && !correct_opt.contains("F")){
                cb6.setTextColor(Color.RED);
                multiple_opt[i++] = "F";
            }
            else if (!cb6.isChecked() && correct_opt.contains("F")){
                cb6.setTextColor(Color.parseColor("#039b0f"));
            }
            else{
                cb6.setTextColor(Color.BLACK);
            }
            int multipleOptLength = i;
            i = 0;

            //check if no opt is selected
            if(multiple_opt != null && multipleOptLength == corr_opt.length) {
                for (String temp : corr_opt) {
                    if (temp.equalsIgnoreCase(multiple_opt[i++]))
                        continue;
                    else
                        return false;
                }
            }
            else
                return false;
        }
        else {
            if(opt1.isChecked() && corr_opt[0].equalsIgnoreCase("A") ){
                opt1.setTextColor(Color.parseColor("#039b0f"));
                single_opt = "A";
            }
            else if (opt1.isChecked() && !corr_opt[0].equalsIgnoreCase("A")){
                opt1.setTextColor(Color.RED);
                single_opt = "A";
            }
            else if (!opt1.isChecked() && corr_opt[0].equalsIgnoreCase("A")){
                opt1.setTextColor(Color.parseColor("#039b0f"));
            }
            else{
                opt1.setTextColor(Color.BLACK);
            }


            if(opt2.isChecked() && corr_opt[0].equalsIgnoreCase("B") ){
                opt2.setTextColor(Color.parseColor("#039b0f"));
                single_opt = "B";
            }
            else if (opt2.isChecked() && !corr_opt[0].equalsIgnoreCase("B")){
                opt2.setTextColor(Color.RED);
                single_opt = "B";
            }
            else if (!opt2.isChecked() && corr_opt[0].equalsIgnoreCase("B")){
                opt2.setTextColor(Color.parseColor("#039b0f"));
            }
            else{
                opt2.setTextColor(Color.BLACK);
            }


            if(opt3.isChecked() && corr_opt[0].equalsIgnoreCase("C") ){
                opt3.setTextColor(Color.parseColor("#039b0f"));
                single_opt = "C";
            }
            else if (opt3.isChecked() && !corr_opt[0].equalsIgnoreCase("C")){
                opt3.setTextColor(Color.RED);
                single_opt = "C";
            }
            else if (!opt3.isChecked() && corr_opt[0].equalsIgnoreCase("C")){
                opt3.setTextColor(Color.parseColor("#039b0f"));
            }
            else{
                opt3.setTextColor(Color.BLACK);
            }


            if(opt4.isChecked() && corr_opt[0].equalsIgnoreCase("D") ){
                opt4.setTextColor(Color.parseColor("#039b0f"));
                single_opt = "D";
            }
            else if (opt4.isChecked() && !corr_opt[0].equalsIgnoreCase("D")){
                opt4.setTextColor(Color.RED);
                single_opt = "D";
            }
            else if (!opt4.isChecked() && corr_opt[0].equalsIgnoreCase("D")){
                opt4.setTextColor(Color.parseColor("#039b0f"));
            }
            else{
                opt4.setTextColor(Color.BLACK);
            }

            if(opt5.isChecked() && corr_opt[0].equalsIgnoreCase("E") ){
                opt5.setTextColor(Color.parseColor("#039b0f"));
                single_opt = "E";
            }
            else if (opt5.isChecked() && !corr_opt[0].equalsIgnoreCase("E")){
                opt5.setTextColor(Color.RED);
                single_opt = "E";
            }
            else if (!opt5.isChecked() && corr_opt[0].equalsIgnoreCase("E")){
                opt5.setTextColor(Color.parseColor("#039b0f"));
            }
            else{
                opt5.setTextColor(Color.BLACK);
            }


            if(opt6.isChecked() && corr_opt[0].equalsIgnoreCase("F") ){
                opt6.setTextColor(Color.parseColor("#039b0f"));
                single_opt = "F";
            }
            else if (opt6.isChecked() && !corr_opt[0].equalsIgnoreCase("F")){
                opt6.setTextColor(Color.RED);
                single_opt = "F";
            }
            else if (!opt6.isChecked() && corr_opt[0].equalsIgnoreCase("F")){
                opt6.setTextColor(Color.parseColor("#039b0f"));
            }
            else{
                opt6.setTextColor(Color.BLACK);
            }


            //check if no opt is selected
            if(single_opt!=null) {

                if (!single_opt.equalsIgnoreCase(corr_opt[0])) {
                    return false;
                }
            }
            else
                return false;

        }

        return true;
    }


}
