package com.example.android.learndraw;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;

public class MainListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // apple image source  list
        ArrayList<Integer> appleimgs = new ArrayList<>();
        appleimgs.add(R.drawable.apple1);
        appleimgs.add(R.drawable.apple2);
        appleimgs.add(R.drawable.apple3);
        appleimgs.add(R.drawable.apple4);
        appleimgs.add(R.drawable.apple5);
        appleimgs.add(R.drawable.apple6);
//        appleimgs.add(R.drawable.apple_cover);

// cherry image source  list
        ArrayList<Integer> cherryimgs = new ArrayList<>();
        cherryimgs.add(R.drawable.cheery1);
        cherryimgs.add(R.drawable.cheery2);
        cherryimgs.add(R.drawable.cheery3);
        cherryimgs.add(R.drawable.cheery4);
        cherryimgs.add(R.drawable.cherry5);
        cherryimgs.add(R.drawable.cheery6);
//        cherryimgs.add(R.drawable.cherry_cover);

// orange image source  list
        ArrayList<Integer> orangeimgs = new ArrayList<>();
        orangeimgs.add(R.drawable.orange1);
        orangeimgs.add(R.drawable.orange2);
        orangeimgs.add(R.drawable.orange3);
        orangeimgs.add(R.drawable.orange4);
        orangeimgs.add(R.drawable.orange5);
        orangeimgs.add(R.drawable.orange6);
//        orangeimgs.add(R.drawable.cover_orange);

// strwberry image source  list
        ArrayList<Integer> strawberryimgs = new ArrayList<>();
        strawberryimgs.add(R.drawable.strawberry1);
        strawberryimgs.add(R.drawable.strawberry2);
        strawberryimgs.add(R.drawable.strawberry3);
        strawberryimgs.add(R.drawable.strawberry4);
        strawberryimgs.add(R.drawable.strawberry5);
        strawberryimgs.add(R.drawable.strawberry6);
        strawberryimgs.add(R.drawable.strawberry7);
        strawberryimgs.add(R.drawable.strawberry8);
//        strawberryimgs.add(R.drawable.cover_strwberry);


// banana image source  list
        ArrayList<Integer> bananaimgs = new ArrayList<>();
        bananaimgs.add(R.drawable.banana1);
        bananaimgs.add(R.drawable.banana2);
        bananaimgs.add(R.drawable.banana3);
        bananaimgs.add(R.drawable.banaan5);
//        bananaimgs.add(R.drawable.bnana_cover);



//TODO 6 ORGNIZE MINI LISTS OF  ALBUMZ IN DATABASE OR JSON OR SEPRATE CLASS
//         LAST OPTION MAY THE OPRPREAT ON !!.


        // all drawing lists
        final ArrayList<ArtAlbum> artAlbum = new ArrayList<ArtAlbum>();
        artAlbum.add(new ArtAlbum(appleimgs, "apple", appleimgs.size()-1, R.drawable.apple_cover));
        artAlbum.add(new ArtAlbum(bananaimgs, "banana", bananaimgs.size()-1, R.drawable.bnana_cover));
        artAlbum.add(new ArtAlbum(cherryimgs, "cherry", cherryimgs.size()-1, R.drawable.cherry_cover));
        artAlbum.add(new ArtAlbum(orangeimgs, "orange", orangeimgs.size()-1, R.drawable.cover_orange));
        artAlbum.add(new ArtAlbum(strawberryimgs, "strawberry", strawberryimgs.size()-1, R.drawable.cover_strwberry));



        DrawAdapter adapter = new DrawAdapter(this, artAlbum);
        GridView gridView = (GridView) findViewById(R.id.ArtList);
        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                LetUsDrawActivity.artAlbums = artAlbum;
                LetUsDrawActivity.postion = position;
                Intent Intent = new Intent(MainListActivity.this, LetUsDrawActivity.class);
                startActivity(Intent);
            }
        });

    }
}
