package com.yoji.implictintent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class AfternoonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_afternoon);
        setTitle(R.string.afternoon);

        Utils.init(this);
    }
}