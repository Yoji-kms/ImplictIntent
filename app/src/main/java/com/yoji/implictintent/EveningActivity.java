package com.yoji.implictintent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class EveningActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_evening);
        setTitle(R.string.evening);

        Utils.init(this);
    }
}