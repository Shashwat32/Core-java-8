package com.soft.eternal.corejavapro;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.ActionBar;
import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import static com.soft.eternal.corejavapro.R.id.container;


public class ChapterNDifficulty extends AppCompatActivity {

    /**
     * The {@link android.support.v4.view.PagerAdapter} that will provide
     * fragments for each of the sections. We use a
     * {@link FragmentPagerAdapter} derivative, which will keep every
     * loaded fragment in memory. If this becomes too memory intensive, it
     * may be best to switch to a
     * {@link android.support.v4.app.FragmentStatePagerAdapter}.
     */
    private SectionsPagerAdapter mSectionsPagerAdapter;
    public Map<String,Table> fragments = new HashMap<String,Table>();
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
        ActionBar ab = getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);
        final Activity activity = this;

        Bundle extras = getIntent().getExtras();
        id =  extras.getLong(Home.TITLE_ID_EXTRA);
        title = extras.getString(Home.TITLE_TITLE_EXTRA);
        category = extras.getString(Home.TITLE_CATEGORY_EXTRA);
        activity.setTitle(title);
        dbActivity = new DBActivity(this);
        if (category.equalsIgnoreCase("chapter")) {
            array_list = dbActivity.getDataByChapter(id);
        } else {
            array_list = dbActivity.getDataByDifficulty(id);
        }
        no_of_ques = array_list.size();

        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(container);
        mViewPager.setAdapter(mSectionsPagerAdapter);

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
        public static PlaceholderFragment newInstance(int sectionNumber,boolean isLast, Table T) {
            PlaceholderFragment fragment = new PlaceholderFragment();
            Bundle args = new Bundle();
            args.putInt(ARG_SECTION_NUMBER, sectionNumber);
            args.putBoolean("IS_LAST",isLast);
            args.putSerializable("TABLE",T);
            fragment.setArguments(args);
            return fragment;
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {

            View rootView = inflater.inflate(R.layout.fragment_chapter_qn, container, false);
            QnAFragment qnAFragment = new QnAFragment();
            qnAFragment.setQuesNAns(getActivity(), mViewPager,rootView,getArguments().getInt(ARG_SECTION_NUMBER),getArguments().getBoolean("IS_LAST"),(Table)getArguments().getSerializable("TABLE"));
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
            if((position+1) == no_of_ques)
                return PlaceholderFragment.newInstance(position + 1,true,table);
            else
                return PlaceholderFragment.newInstance(position + 1,false,table);
        }

        @Override
        public int getCount() {

            return no_of_ques;
        }

    }

}
