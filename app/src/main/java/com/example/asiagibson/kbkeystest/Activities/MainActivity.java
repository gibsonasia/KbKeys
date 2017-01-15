package com.example.asiagibson.kbkeystest.Activities;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.asiagibson.kbkeystest.KeysFragment;
import com.example.asiagibson.kbkeystest.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();

        KeysFragment fragment = new KeysFragment();
        ft.add(R.id.frag_container, fragment);
        ft.commit();


//         NOTE ADD FRAGMENT MANAGER!!
        //Intents


    }
}
