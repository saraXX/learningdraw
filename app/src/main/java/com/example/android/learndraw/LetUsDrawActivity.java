package com.example.android.learndraw;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.ArrayList;


public class LetUsDrawActivity extends AppCompatActivity {
    static ArrayList<ArtAlbum> artAlbums;
    static int postion;
    int stepsNumber;
    ImageView imgpager;
    ArrayList<Integer> drawSteps;
    int counter = 0;
    Button next, back;
    TextView artName, stepsNoTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lets_draw);

        mycustomAlbum(artAlbums);


    }


//    TDO 1 : fix problem of "out of bound " in arraY

//    TDO 2 : fix problem of next and back button and make it  convenet



    public void mycustomAlbum(final ArrayList<ArtAlbum> draw) {
        ArtAlbum album = new ArtAlbum();
        // take postion from adapter to each item of list
        album = draw.get(postion);

        drawSteps = new ArrayList<Integer>();

        next = (Button) findViewById(R.id.next);
        back = (Button) findViewById(R.id.back);
        imgpager = (ImageView) findViewById(R.id.imagePager);
        stepsNoTextView = (TextView) findViewById(R.id.steps_Numbers);

//        ImageView TESTimgpager = (ImageView) findViewById(R.id.TESTO);

        drawSteps.addAll(album.getImgsrc());


//        imgpager.setImageResource(drawSteps.get(counter));
        Glide.with(LetUsDrawActivity.this).load(drawSteps.get(counter)).into(imgpager);

//        Glide.with(this).load(R.drawable.giphy).into(imgpager);



        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (counter == drawSteps.size() - 1) {
                    Toast.makeText(LetUsDrawActivity.this, "final step", Toast.LENGTH_LONG).show();
                } else {
                    counter++;
                    Glide.with(LetUsDrawActivity.this).load(drawSteps.get(counter)).into(imgpager);
//                    stepsNoTextView.setText(Integer.toString(drawSteps.indexOf(counter)));

//                    imgpager.setImageResource(drawSteps.get(counter));
                }
            }

        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (counter == 0) {
                    Toast.makeText(LetUsDrawActivity.this, "first step", Toast.LENGTH_LONG).show();
                } else {
                    counter--;
                    Glide.with(LetUsDrawActivity.this).load(drawSteps.get(counter)).into(imgpager);

//                    stepsNoTextView.setText(drawSteps.indexOf(album.getImgsrc().get()));

//                    imgpager.setImageResource(drawSteps.get(counter));
                }

            }

        });

//        add steps text :
//        stepsNumber =
//        stepsNoTextView.setText(drawSteps.get);

    }


}


