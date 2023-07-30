package com.example.datacollectionplatform;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.widget.Toast;

public class notification extends AppCompatActivity {
    private static final String CHANNEL_ID="My Channel";
    private static final int NOTIFICATION_ID=100;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);
        String msg="Data successfully stored in database";
        Drawable drawable= ResourcesCompat.getDrawable(getResources(),R.drawable.message,null);
        BitmapDrawable bitmapDrawable=(BitmapDrawable)drawable;
        Bitmap largeIcon=bitmapDrawable.getBitmap();
        NotificationManager nm=(NotificationManager)getSystemService(NOTIFICATION_SERVICE);
        Notification notification=new Notification.Builder(this).setLargeIcon(largeIcon).setSmallIcon(R.drawable.message).setContentText(msg).setChannelId(CHANNEL_ID).build();
        nm.createNotificationChannel(new NotificationChannel(CHANNEL_ID,"New Channel",NotificationManager.IMPORTANCE_HIGH));
        nm.notify(NOTIFICATION_ID,notification);
    }
}