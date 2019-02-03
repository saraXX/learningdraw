package com.example.android.learndraw;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class DrawAdapter extends ArrayAdapter<ArtAlbum> {
    private static final String LOG_TAG = DrawAdapter.class.getSimpleName();


    public DrawAdapter(Activity context, ArrayList<ArtAlbum> soundLibraries) {
        super(context, 0, soundLibraries);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        ArtAlbum currentDraw = getItem(position);

        TextView drawSteps = (TextView) listItemView.findViewById(R.id.textItem);
        // must cast to string
        drawSteps.setText(Integer.toString(currentDraw.getStepsNumber()));


        ImageView listItemCover = (ImageView) listItemView.findViewById(R.id.imgItem);
        listItemCover.setImageResource(currentDraw.getCover());

        return listItemView;
    }


}
