package com.soft.eternal.corejavapro;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v4.app.ListFragment;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Statistic extends ListFragment {

       ArrayList<Title> titles;
    TitleAdapter titleAdapter;

    @Override
    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);

        titles =  new ArrayList<Title>();
        titles.add(new Title("Mock Test (Average)",1,Title.Category.Statistic));
        titles.add(new Title("Quick Test (Average)",2,Title.Category.Statistic));
        int i = 3;
        List<String> testID = new DBActivity(getContext()).getTestID();
        for (int j=0; j<testID.size(); j++){
            titles.add(new Title(testID.get(j),i++,Title.Category.Statistic));
        }

        titleAdapter = new TitleAdapter(getActivity(), titles);

        setListAdapter(titleAdapter);

        getListView().setDivider(ContextCompat.getDrawable(getActivity(), android.R.color.darker_gray));
        getListView().setDividerHeight(1);
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id){
        super.onListItemClick(l, v, position, id);
        launchTitle(position);
    }


    public void launchTitle(int position){

        Title title = (Title) getListAdapter().getItem(position);

        //which class file has to opened when clicked
        Intent intent = new Intent(getActivity(),StatisticFragment.class);

        //pass along the information of the title clicked on
        intent.putExtra(Home.TITLE_ID_EXTRA, title.getTitleId());
        intent.putExtra(Home.TITLE_TITLE_EXTRA, title.getTitle());
        intent.putExtra(Home.TITLE_CATEGORY_EXTRA, "Statistic");

        startActivity(intent);
    }

}
