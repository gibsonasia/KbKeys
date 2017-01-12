package com.example.asiagibson.kbkeystest;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by asiagibson on 1/11/17.
 */

public class KeysFragment extends Fragment {
    String TAG = "Keys Frag";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_keys, container, false);

        return view;
    }

    }
