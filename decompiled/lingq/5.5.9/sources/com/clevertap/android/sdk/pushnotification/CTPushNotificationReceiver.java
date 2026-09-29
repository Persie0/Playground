package com.clevertap.android.sdk.pushnotification;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.clevertap.android.sdk.C2181a;
import com.clevertap.android.sdk.CleverTapAPI;
import p290o6.C7979r0;

/* JADX INFO: loaded from: classes.dex */
@Deprecated(since = "4.3.0")
public class CTPushNotificationReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Intent launchIntentForPackage;
        try {
            Bundle extras = intent.getExtras();
            if (extras == null) {
                return;
            }
            if (extras.containsKey("wzrk_dl")) {
                launchIntentForPackage = new Intent("android.intent.action.VIEW", Uri.parse(intent.getStringExtra("wzrk_dl")));
                C7979r0.m15843j(context, launchIntentForPackage);
            } else {
                launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
                if (launchIntentForPackage == null) {
                    return;
                }
            }
            CleverTapAPI.m6422i(context, extras);
            launchIntentForPackage.setFlags(872415232);
            launchIntentForPackage.putExtras(extras);
            launchIntentForPackage.putExtra("wzrk_from", "CTPushNotificationReceiver");
            if (extras.containsKey("close_system_dialogs") && extras.getBoolean("close_system_dialogs")) {
                context.sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
            }
            context.startActivity(launchIntentForPackage);
            C2181a.m6449a("CTPushNotificationReceiver: handled notification: " + extras.toString());
        } catch (Throwable th2) {
            C2181a.m6457j("CTPushNotificationReceiver: error handling notification", th2);
        }
    }
}
