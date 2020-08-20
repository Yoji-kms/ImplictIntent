package com.yoji.implictintent;

import android.os.Bundle;

public class AfternoonActivity extends MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_afternoon);
        setTitle(R.string.afternoon);

        init();
    }
}