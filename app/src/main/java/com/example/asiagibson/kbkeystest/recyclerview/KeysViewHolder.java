package com.example.asiagibson.kbkeystest.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.asiagibson.kbkeystest.R;

/**
 * Created by asiagibson on 1/11/17.
 */

public class KeysViewHolder extends RecyclerView.ViewHolder {

    TextView textView;

    public KeysViewHolder(View itemView) {
        super(itemView);

        textView =(TextView) itemView.findViewById(R.id.keys_tv);

    }

    public void bind(){

    }
}
