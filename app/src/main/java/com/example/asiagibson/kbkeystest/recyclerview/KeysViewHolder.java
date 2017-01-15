package com.example.asiagibson.kbkeystest.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.asiagibson.kbkeystest.R;
import com.example.asiagibson.kbkeystest.model.Available;

import org.json.JSONObject;

/**
 * Created by asiagibson on 1/11/17.
 */

public class KeysViewHolder extends RecyclerView.ViewHolder {

    TextView textView;

    public KeysViewHolder(View view) {
        super(view);
        textView =(TextView) itemView.findViewById(R.id.keys_tv);

    }

    public void bind(Available available) {

        String name = available.getName();
        textView.setText(name + available.getTextColor() + available.getUrl());
        Toast.makeText(textView.getContext(), name, Toast.LENGTH_LONG).show();

    }
}
