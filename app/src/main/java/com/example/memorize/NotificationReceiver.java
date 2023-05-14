package com.example.memorize;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class NotificationReceiver extends BroadcastReceiver {

    public static final String ACTION_NOTIFICATION_ACTION = "com.example.memorize.NOTIFICATION_ACTION";

    @Override
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (ACTION_NOTIFICATION_ACTION.equals(action)) {
            // Handle the notification action here
            Toast.makeText(context, "Notification Action Clicked", Toast.LENGTH_SHORT).show();
        }
    }
}
