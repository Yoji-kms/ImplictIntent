package com.yoji.implictintent;

import android.os.Bundle;

public class MorningActivity extends MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_morning);
        setTitle(R.string.morning);

        init();
    }
}