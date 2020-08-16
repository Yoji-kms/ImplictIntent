package com.yoji.implictintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    private View.OnClickListener syncBtnOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(Intent.ACTION_SYNC);
            int currentTime = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
            if (currentTime >= 6 && currentTime < 14) {
                intent.setData(Uri.parse("http://morning"));
            } else if (currentTime == 14) {
                intent.setData(Uri.parse("http://afternoon"));
            } else {
                intent.setData(Uri.parse("http://evening"));
            }
            startActivity(intent);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    private void init() {
        Button syncBtn = findViewById(R.id.syncBtnId);
        syncBtn.setOnClickListener(syncBtnOnClickListener);
    }
}