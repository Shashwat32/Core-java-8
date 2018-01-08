package com.soft.eternal.corejavapro;



import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Environment;
import android.preference.PreferenceManager;
import android.support.v4.app.FragmentTransaction;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;


public class Home extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    NavigationView navigationView = null;
    Toolbar toolbar = null;
    public static final String TITLE_ID_EXTRA = "com.eternal.soft.corejava.TITLE_IDENTIFIER";
    public static final String TITLE_TITLE_EXTRA = "com.eternal.soft.corejava.TITLE";
    public static final String TITLE_CATEGORY_EXTRA = "com.eternal.soft.corejava.CATEGORY";

    //final VunglePub vunglePub = VunglePub.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        final Activity activity = this;
        //Set the fragment initially
        Chapter localOverview = new Chapter();
        FragmentTransaction localFragmentTransaction = getSupportFragmentManager().beginTransaction();
        localFragmentTransaction.replace(R.id.select, localOverview);
        localFragmentTransaction.commit();
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(activity);
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        View hView =  navigationView.getHeaderView(0);
        if(prefs.getBoolean("skip", true)) {


            ImageView profileImage = (ImageView) hView.findViewById(R.id.profile_img);
            // Set the Image in ImageView after decoding the String
            profileImage.setImageBitmap(BitmapFactory
                    .decodeFile(Environment.getExternalStorageDirectory() + File.separator + "COREJAVA/Profile.JPEG"));
        }
        TextView userName = (TextView) hView.findViewById(R.id.username);
        userName.setText(prefs.getString("userName", "1"));

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }


    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            new AlertDialog.Builder(this)
                    .setTitle("Alert !")
                    .setMessage("Are you sure you want to exit ?")
                    .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {

                            moveTaskToBack(true);
                            return;
                        }
                    })
                    .setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            return;
                        }
                    })
                    .setIcon(android.R.drawable.ic_dialog_alert)
                    .show();
            return;
        }
    }


    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_overview) {
            Overview localOverview = new Overview();
            FragmentTransaction localFragmentTransaction = getSupportFragmentManager().beginTransaction();
            localFragmentTransaction.replace(R.id.select, localOverview);
            localFragmentTransaction.commit();
        } else if (id == R.id.nav_chapter) {
            Chapter localOverview = new Chapter();
            FragmentTransaction localFragmentTransaction = getSupportFragmentManager().beginTransaction();
            localFragmentTransaction.replace(R.id.select, localOverview);
            localFragmentTransaction.commit();

        } else if (id == R.id.nav_difficulty) {
            Difficulty localOverview = new Difficulty();
            FragmentTransaction localFragmentTransaction = getSupportFragmentManager().beginTransaction();
            localFragmentTransaction.replace(R.id.select, localOverview);
            localFragmentTransaction.commit();


        } else if (id == R.id.nav_mock) {
            Mock localOverview = new Mock();
            FragmentTransaction localFragmentTransaction = getSupportFragmentManager().beginTransaction();
            localFragmentTransaction.replace(R.id.select, localOverview);
            localFragmentTransaction.commit();


        }else if (id == R.id.nav_quick) {
            Intent intent = new Intent(Home.this, Quick.class);

            startActivity(intent);


        }else if (id == R.id.nav_exit) {

            moveTaskToBack(true);

        }else if (id == R.id.nav_rate) {
            Intent intent = new Intent(Intent.ACTION_VIEW);
            //Try Google play
            intent.setData(Uri.parse("market://details?id=com.eternal.soft.corejavapro"));
            try{
                startActivity(intent);
            }
            catch (Exception e){
                //Market (Google play) app seems not installed, let's try to open a webbrowser
                intent.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.eternal.soft.corejavapro"));
                try{
                   startActivity(intent);
                }catch (Exception g){

                    //Well if this also fails, we have run out of options, inform the user.
                    Toast.makeText(this, "Could not open Android market, please install the market app.", Toast.LENGTH_SHORT).show();
                }
            }


        }else if (id == R.id.stats) {
            Statistic localOverview = new Statistic();
            FragmentTransaction localFragmentTransaction = getSupportFragmentManager().beginTransaction();
            localFragmentTransaction.replace(R.id.select, localOverview);
            localFragmentTransaction.commit();


        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}


