package com.soft.eternal.corejavapro;


import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AlertDialog;
import android.view.View;
import android.support.v4.app.ListFragment;
import android.widget.ListView;


import java.util.ArrayList;


public class Mock extends ListFragment {

    ArrayList<Title> titles;
    TitleAdapter titleAdapter;

    @Override
    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);

        titles =  new ArrayList<Title>();
        titles.add(new Title("Mock Test 1",1,Title.Category.Mock));
        titles.add(new Title("Mock Test 2",2,Title.Category.Mock));
        titles.add(new Title("Mock Test 3",3,Title.Category.Mock));
        titles.add(new Title("Mock Test 4",4,Title.Category.Mock));
        titles.add(new Title("Mock Test 5",5,Title.Category.Mock));
        titles.add(new Title("Mock Test 6",6,Title.Category.Mock));
        titles.add(new Title("Mock Test 7",7,Title.Category.Mock));
        titles.add(new Title("Mock Test 8",8,Title.Category.Mock));
        titles.add(new Title("Mock Test 9",9,Title.Category.Mock));
        titles.add(new Title("Mock Test 10",10,Title.Category.Mock));

        titleAdapter = new TitleAdapter(getActivity(), titles);

        setListAdapter(titleAdapter);
        final SharedPreferences sharedPrefs = PreferenceManager.getDefaultSharedPreferences(getContext());
        SharedPreferences.Editor editor = sharedPrefs.edit();
        editor.putBoolean("Submited", true);
        getListView().setDivider(ContextCompat.getDrawable(getActivity(), android.R.color.darker_gray));
        getListView().setDividerHeight(1);
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id){
        super.onListItemClick(l, v, position, id);
        if(position == 0 || position == 1 || position == 2 )
            launchTitle(position);
        /*else if(position == 2){

            new AlertDialog.Builder(getActivity())
                    .setTitle("Unlock !")
                    .setMessage("Download App in video to unlock this mock test !\nMake sure you are connected with internet !")
                    .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            final VunglePub vunglePub = VunglePub.getInstance();
                            final String app_id = "57e67edc50d2df383b000022";

                            // initialize the Publisher SDK
                            vunglePub.init(getActivity(), app_id);
                            final AdConfig overrideConfig = new AdConfig();

                            // set incentivized option on
                            overrideConfig.setIncentivized(true);

                            vunglePub.setEventListeners(vungleDefaultListener);
                            if(vunglePub.isAdPlayable())
                                vunglePub.playAd(overrideConfig);
                            else {
                                new AlertDialog.Builder(getActivity())
                                        .setTitle("Oops !")
                                        .setMessage("Seems like you are not connected with internet or you have slow connection !\nTry again later !!")
                                        .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                                            public void onClick(DialogInterface dialog, int which) {
                                                return;
                                            }
                                        })
                                        .setIcon(android.R.drawable.ic_lock_idle_lock)
                                        .show();
                            }
                        }
                    })
                    .setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            return;
                        }
                    })
                    .setIcon(android.R.drawable.ic_lock_idle_lock)
                    .show();

        }*/
        else{
            new AlertDialog.Builder(getActivity())
                    .setTitle("Go Pro !")
                    .setMessage("Download Pro Version to unlock this mock test.\nPro version coming soon !")
                    .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            return;
                        }
                    })
                    .setIcon(android.R.drawable.ic_lock_idle_lock)
                    .show();
        }
    }


    public void launchTitle(int position){

        Title title = (Title) getListAdapter().getItem(position);

        //which class file has to opened when clicked
        Intent intent = new Intent(getActivity(),Instructions.class);

        //pass along the information of the title clicked on
        intent.putExtra(Home.TITLE_ID_EXTRA, title.getTitleId());
        intent.putExtra(Home.TITLE_TITLE_EXTRA, title.getTitle());
        intent.putExtra(Home.TITLE_CATEGORY_EXTRA, "Mock");

        startActivity(intent);
    }

    /*private final EventListener vungleDefaultListener = new EventListener() {
        @Deprecated
        @Override
        public void onVideoView(boolean isCompletedView, int watchedMillis, int videoDurationMillis) {
            // This method is deprecated and will be removed. Please use onAdEnd() instead.
        }

        @Override
        public void onAdStart() {
            // Called before playing an ad.
        }

        @Override
        public void onAdUnavailable(String reason) {
            // Called when VunglePub.playAd() was called but no ad is available to show to the user.
        }

        @Override
        public void onAdEnd(boolean wasSuccessfulView, boolean wasCallToActionClicked) {
            // Called when the user leaves the ad and control is returned to your application.
            launchTitle(2);
        }

        @Override
        public void onAdPlayableChanged(boolean isAdPlayable) {
            // Called when ad playability changes.
            Log.d("DefaultListener", "This is a default eventlistener.");
            final boolean enabled = isAdPlayable;

        }
    };*/


}
