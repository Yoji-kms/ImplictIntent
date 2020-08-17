package com.yoji.implictintent;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.Button;

import java.util.Calendar;

public class Utils {

    public static void init(final Activity activity) {
        Button syncBtn = activity.findViewById(R.id.syncBtnId);

        View.OnClickListener syncBtnOnClickListener = new View.OnClickListener() {
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
                activity.startActivity(intent);
            }
        };

        syncBtn.setOnClickListener(syncBtnOnClickListener);
    }
}
