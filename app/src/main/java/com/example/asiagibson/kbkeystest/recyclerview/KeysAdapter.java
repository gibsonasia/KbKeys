package com.example.asiagibson.kbkeystest.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.asiagibson.kbkeystest.R;
import com.example.asiagibson.kbkeystest.model.Available;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by asiagibson on 1/11/17.
 */

public class KeysAdapter extends RecyclerView.Adapter<KeysViewHolder> {
    JSONArray data;

    public KeysAdapter(){
        this.data = new JSONArray();
    }

    @Override
    public KeysViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_view, parent, false);
        return new KeysViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(KeysViewHolder holder, int position) {
        try{
            JSONObject object = data.getJSONObject(position);
            Available available = new Available();
            available.setName(object.getString("name"));
            holder.bind(available);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override
    public int getItemCount() {
        return data.length();
    }

    public void setData(JSONArray data) {
        this.data = data;
    }

}
