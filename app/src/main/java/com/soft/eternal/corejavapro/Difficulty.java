package com.soft.eternal.corejavapro;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.support.v4.content.ContextCompat;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;


public class Difficulty extends ListFragment {

    ArrayList<Title> titles;
    TitleAdapter titleAdapter;

    @Override
    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);

        titles =  new ArrayList<Title>();
        titles.add(new Title("Easy",1,Title.Category.Difficulty));
        titles.add(new Title("Medium",2,Title.Category.Difficulty));
        titles.add(new Title("Hard",3,Title.Category.Difficulty));

        titleAdapter = new TitleAdapter(getActivity(), titles);

        setListAdapter(titleAdapter);

        getListView().setDivider(ContextCompat.getDrawable(getActivity(), android.R.color.darker_gray));
        getListView().setDividerHeight(1);
    }

    @Override
    public void onListItemClick(ListView l, View v, int postion, long id){
        super.onListItemClick(l, v, postion, id);

            launchTitle(postion);
    }


    public void launchTitle(int position){

        Title title = (Title) getListAdapter().getItem(position);

        //which class file has to opened when clicked
        Intent intent = new Intent(getActivity(),ChapterNDifficulty.class);

        //pass along the information of the title clicked on
        intent.putExtra(Home.TITLE_ID_EXTRA, title.getTitleId());
        intent.putExtra(Home.TITLE_TITLE_EXTRA, title.getTitle());
        intent.putExtra(Home.TITLE_CATEGORY_EXTRA, "Difficulty");

        startActivity(intent);
    }

}
