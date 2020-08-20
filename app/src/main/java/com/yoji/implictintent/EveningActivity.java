package com.yoji.implictintent;

import android.os.Bundle;

public class EveningActivity extends MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_evening);
        setTitle(R.string.evening);

        init();
    }
}