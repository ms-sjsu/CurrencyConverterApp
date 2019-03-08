package com.ms.currencyconverterapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class RecieverFromCurrencyExchange extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Intent activityIntent = new Intent(context, MainActivity.class);
        activityIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        activityIntent.putExtra("msg3",intent.getStringExtra("message3"));
        context.startActivity(activityIntent);
    }
}
