package com.soft.eternal.corejavapro;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.os.CountDownTimer;
import android.preference.PreferenceManager;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import static com.soft.eternal.corejavapro.R.id.container;


public class MockTest extends AppCompatActivity {

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
    static String title ;
    static String category ;
    static DBActivity dbActivity ;
    static ArrayList<Table> array_list;
    static Table table ;
    static int no_of_ques = 3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter_qn);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);




        final Activity activity = this;

        Bundle extras = getIntent().getExtras();
        id =  extras.getLong(Home.TITLE_ID_EXTRA);
        title = extras.getString(Home.TITLE_TITLE_EXTRA);
        category = extras.getString(Home.TITLE_CATEGORY_EXTRA);
        dbActivity = new DBActivity(this);
        array_list = dbActivity.getDataByMock(id);
        no_of_ques = array_list.size() + 2;
        String version = "1";
        try {
            PackageInfo pInfo = getPackageManager().getPackageInfo(getPackageName(), 0);
            version = pInfo.versionName;
        }catch (Exception e){

        }
        //store arraylist in session
        final SharedPreferences sharedPrefs = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editor = sharedPrefs.edit();
        String userName = sharedPrefs.getString("userName", "1");
        editor.clear();
        editor.commit();
        Gson gson = new Gson();

        String json = gson.toJson(array_list);
        editor.putString("userName",userName);
        editor.putString("version", version);
        editor.putString("ARRAY_LIST", json);
        editor.putBoolean("RanBefore", true);
        editor.putString("TestID", title);
        editor.putInt("isMock", 1);  // 1 : mock , 2:Quick
        editor.commit();


        new CountDownTimer(10000, 1000) {

            public void onTick(long millisUntilFinished) {

                activity.setTitle(title +"      (" + ""+String.format("%d: %d: %d",
                        TimeUnit.MILLISECONDS.toHours(millisUntilFinished),
                        TimeUnit.MILLISECONDS.toMinutes(millisUntilFinished)-
                        TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toHours(millisUntilFinished)),
                        TimeUnit.MILLISECONDS.toSeconds(millisUntilFinished) -
                                TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(millisUntilFinished)))+ ")");
            }

            public void onFinish() {
                if(sharedPrefs.getBoolean("Submited",false)) {
                    Intent intent = new Intent(activity, Result.class);
                    activity.startActivity(intent);
                }
            }
        }.start();

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
                .setMessage("You can't go back.\nEither press Submit or Exit Test.")
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
        getMenuInflater().inflate(R.menu.menu_chapter_qn, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.exit) {
            Intent intent = new Intent(this, Home.class);
            this.startActivity(intent);
        }else if (id == R.id.finish) {
            Intent intent = new Intent(this, Result.class);
            this.startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
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
            if(getArguments().getInt(ARG_SECTION_NUMBER)!= 71 && getArguments().getInt(ARG_SECTION_NUMBER)!= 72) {

                View rootView = inflater.inflate(R.layout.fragment_mock_test, container, false);
                MockTestFragment mockTestFragment = new MockTestFragment();
                mockTestFragment.setQuesNAns(mViewPager, getActivity(), rootView, getArguments().getInt(ARG_SECTION_NUMBER), (Table) getArguments().getSerializable("TABLE"));
                return rootView;
            }
            else if(getArguments().getInt(ARG_SECTION_NUMBER)== 71) {

                View rootView = inflater.inflate(R.layout.fragment_submit, container, false);
                Submit submitFragment = new Submit();
                submitFragment.setSubmit(mViewPager, getActivity(), rootView);
                return rootView;

            }else{

                View rootView = inflater.inflate(R.layout.review, container, false);
                Review review = new Review();
                review.setReview(mViewPager, getActivity(), rootView);
                return rootView;
            }
        }


    }

    /**
     * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
     * one of the sections/tabs/pages.
     */
    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {

            super(fm);

        }

        @Override
        public Fragment getItem(int position) {
            // getItem is called to instantiate the fragment for the given page.
            // Return a PlaceholderFragment (defined as a static inner class below).
            if(position < array_list.size())
            table = array_list.get(position);
            return PlaceholderFragment.newInstance(position + 1,table);
        }

        @Override
        public int getCount() {

            return no_of_ques;
        }

    }
}
