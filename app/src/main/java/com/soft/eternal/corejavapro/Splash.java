package com.soft.eternal.corejavapro;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class Splash extends Activity {

    SQLiteDatabase db ;
    DBActivity dbActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

            final ImageView rotate = (ImageView) this.findViewById(R.id.rotate);
            final ImageView es = (ImageView) this.findViewById(R.id.es);
            final Animation animation = AnimationUtils.loadAnimation(this, R.anim.rotate);
            final Animation fadein = AnimationUtils.loadAnimation(this, R.anim.fadein);
            final Activity activity = this;
            rotate.startAnimation(animation);


            animation.setAnimationListener(new Animation.AnimationListener() {
                @Override
                public void onAnimationStart(Animation animation) {
                    es.startAnimation(fadein);
                    try{
                    PackageInfo pInfo = getPackageManager().getPackageInfo(getPackageName(), 0);
                    String version = pInfo.versionName;
                    SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(activity);
                    if (!version.equals(prefs.getString("version", "1"))) {
                        // <---- run your one time code here
                        InsertValues insertValues = new InsertValues();
                        insertValues.databaseSetup(activity);

                        // mark first time has runned.
                        SharedPreferences.Editor editor = prefs.edit();
                        editor.putString("version", version);
                        editor.commit();
                    }
                    }catch (Exception e){
                        e.getMessage();
                    }
                }

                @Override
                public void onAnimationEnd(Animation animation) {

                    finish();
                    SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(activity);
                    if("1".equals(prefs.getString("userName", "1"))){
                        Intent i = new Intent(getBaseContext(), LoginActivity.class);
                        startActivity(i);
                    }else {
                        Intent i = new Intent(getBaseContext(), Home.class);
                        startActivity(i);
                    }
                }

                @Override
                public void onAnimationRepeat(Animation animation) {

                }
            });
    }

}
