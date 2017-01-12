package com.example.asiagibson.kbkeystest.model;

/**
 * Created by asiagibson on 1/11/17.
 */
import java.util.List;

public class AvailableKeys {

    private Available[] keys;

    private boolean success;


    public void setKeys(Available[] keys) {
        this.keys = keys;
    }
    public Available[] getKeys() {
        return keys;
    }


    public void setSuccess(boolean success) {
        this.success = success;
    }

    public boolean getSuccess() {
        return this.success;


    }
}

