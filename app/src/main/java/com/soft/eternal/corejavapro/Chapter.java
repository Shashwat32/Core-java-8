package com.soft.eternal.corejavapro;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.support.v4.content.ContextCompat;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;


public class Chapter extends ListFragment {

    ArrayList<Title> titles;
    TitleAdapter titleAdapter;



    @Override
    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);


        titles =  new ArrayList<Title>();
        titles.add(new Title("Java Basics",1,Title.Category.Chapter));
        titles.add(new Title("Java Data Types",2,Title.Category.Chapter));
        titles.add(new Title("Operators & Decision Constructs",3,Title.Category.Chapter));
        titles.add(new Title("Creating & Using Arrays",4,Title.Category.Chapter));
        titles.add(new Title("Loop Constructs",5,Title.Category.Chapter));
        titles.add(new Title("Methods & Encapsulation",6,Title.Category.Chapter));
        titles.add(new Title("Inheritance",7,Title.Category.Chapter));
        titles.add(new Title("Handling Exceptions",8,Title.Category.Chapter));
        titles.add(new Title("Selected classes from the Java API",9,Title.Category.Chapter));
        titleAdapter = new TitleAdapter(getActivity(), titles);

        setListAdapter(titleAdapter);

        getListView().setDivider(ContextCompat.getDrawable(getActivity(), android.R.color.darker_gray));
        getListView().setDividerHeight(1);
    }

    @Override
    public void onListItemClick(ListView l, View v,int postion, long id){
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
        intent.putExtra(Home.TITLE_CATEGORY_EXTRA, "Chapter");

        startActivity(intent);
    }



}
