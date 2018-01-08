package com.soft.eternal.corejavapro;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by singhsha on 7/12/2016.
 */

public class TitleAdapter extends ArrayAdapter<Title>{

    public static class ViewHolder{
        TextView title;
        ImageView icon;
    }
    public TitleAdapter(Context context, ArrayList<Title> titles){
        super(context,0,titles);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){

        //Get the data item for this postion
        Title title = getItem(position);

        //create a new viewHolder
        ViewHolder viewHolder;

        //Check if an existing voew is being reused, otherwise inflate a new view
        if(convertView == null){
            //to save our view reference for optimization
            viewHolder = new ViewHolder();

            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_row, parent, false);

            viewHolder.title = (TextView) convertView.findViewById(R.id.listTitle);
            viewHolder.icon = (ImageView) convertView.findViewById(R.id.listIcon);
            // use this tag to remember our view holder
            convertView.setTag(viewHolder);

        }
        else {

            viewHolder = (ViewHolder) convertView.getTag();
        }

        /*
        //Grab references of views so we can populate them with specified note
        TextView listTitle = (TextView) convertView.findViewById(R.id.listTitle);
        ImageView listIcon = (ImageView) convertView.findViewById(R.id.listIcon);*/

        viewHolder.title.setText(title.getTitle());
        viewHolder.icon.setImageResource(title.getAssociatedDrawable());

        /*//Fill each new reference view with data associated with note
        listTitle.setText(title.getTitle());
        listIcon.setImageResource(title.getAssociatedDrawable());*/

        //return it so it can be displayed
        return convertView;
    }
}
