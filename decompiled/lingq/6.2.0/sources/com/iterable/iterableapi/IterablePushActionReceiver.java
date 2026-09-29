package com.iterable.iterableapi;

import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import p000.te1;

/* JADX INFO: loaded from: classes2.dex */
public class IterablePushActionReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        ((NotificationManager) context.getSystemService("notification")).cancel(intent.getIntExtra("requestCode", 0));
        te1.m22002p(context);
        if ("com.iterable.push.ACTION_PUSH_ACTION".equalsIgnoreCase(intent.getAction())) {
            te1.m22010x(context, intent);
        }
    }
}
