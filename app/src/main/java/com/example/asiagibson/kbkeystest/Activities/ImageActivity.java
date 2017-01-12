package com.example.asiagibson.kbkeystest.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.example.asiagibson.kbkeystest.R;

/**
 * Created by asiagibson on 1/11/17.
 */

public class ImageActivity extends AppCompatActivity{
    ImageView iv;
    private static String IMAGE_URL = "http://jsjrobotics.nyc/";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);
        iv = (ImageView) findViewById(R.id.img);

        Intent intent = getIntent();
    }
}
