package com.soft.eternal.corejavapro;

import android.content.Context;
import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.Button;

/**
 * Created by SinghSha on 8/25/2016.
 */

public class Submit {
    public void setSubmit(final ViewPager mViewPager, final Context context, View rootView) {


        Button review = (Button) rootView.findViewById(R.id.review);
        Button submit = (Button) rootView.findViewById(R.id.submit);

        review.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                mViewPager.setCurrentItem(72);
            }

        });
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    Intent intent = new Intent(context, Result.class);
                    context.startActivity(intent);
                } catch (Exception e) {
                    System.out.print(e.getMessage());
                }

            }
        });
    }
}