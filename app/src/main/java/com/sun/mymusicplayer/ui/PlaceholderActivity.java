package com.sun.mymusicplayer.ui;

import android.os.Bundle;

import com.sun.mymusicplayer.R;


public class PlaceholderActivity extends BaseActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_placeholder);
        initializeToolbar();
    }

}