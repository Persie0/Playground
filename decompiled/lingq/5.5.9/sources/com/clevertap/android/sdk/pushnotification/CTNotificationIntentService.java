package com.clevertap.android.sdk.pushnotification;

import android.annotation.SuppressLint;
import android.app.IntentService;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import com.clevertap.android.sdk.C2181a;
import com.clevertap.android.sdk.CleverTapAPI;
import p290o6.C7979r0;
import p430v6.InterfaceC9655a;

/* JADX INFO: loaded from: classes.dex */
@Deprecated(since = "4.3.0")
public class CTNotificationIntentService extends IntentService {
    public static final String MAIN_ACTION = "com.clevertap.PUSH_EVENT";
    public static final String TYPE_BUTTON_CLICK = "com.clevertap.ACTION_BUTTON_CLICK";
    private InterfaceC9655a mActionButtonClickHandler;

    public CTNotificationIntentService() {
        super("CTNotificationIntentService");
    }

    @SuppressLint({"MissingPermission"})
    private void handleActionButtonClick(Bundle bundle) {
        Intent launchIntentForPackage;
        NotificationManager notificationManager;
        try {
            boolean z10 = bundle.getBoolean("autoCancel", false);
            int i10 = bundle.getInt("notificationId", -1);
            String string = bundle.getString("dl");
            Context applicationContext = getApplicationContext();
            this.mActionButtonClickHandler.mo6570a();
            if (Build.VERSION.SDK_INT >= 31) {
                return;
            }
            if (string != null) {
                launchIntentForPackage = new Intent("android.intent.action.VIEW", Uri.parse(string));
                C7979r0.m15843j(applicationContext, launchIntentForPackage);
            } else {
                launchIntentForPackage = applicationContext.getPackageManager().getLaunchIntentForPackage(applicationContext.getPackageName());
            }
            if (launchIntentForPackage == null) {
                C2181a.m6455h("CTNotificationService: create launch intent.");
                return;
            }
            launchIntentForPackage.setFlags(872415232);
            launchIntentForPackage.putExtras(bundle);
            launchIntentForPackage.removeExtra("dl");
            String string2 = bundle.getString("pt_dismiss_on_click", "");
            if (z10 && i10 > -1 && string2.isEmpty() && (notificationManager = (NotificationManager) getApplicationContext().getSystemService("notification")) != null) {
                notificationManager.cancel(i10);
            }
            sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
            startActivity(launchIntentForPackage);
        } catch (Throwable th2) {
            C2181a.m6455h("CTNotificationService: unable to process action button click:  " + th2.getLocalizedMessage());
        }
    }

    @Override // android.app.IntentService
    public void onHandleIntent(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            return;
        }
        int i10 = CleverTapAPI.f10977c;
        C2257c.m6569b(extras);
        this.mActionButtonClickHandler = C2257c.a.f11334a;
        if (TYPE_BUTTON_CLICK.equals(extras.getString("ct_type"))) {
            C2181a.m6455h("CTNotificationIntentService handling com.clevertap.ACTION_BUTTON_CLICK");
            handleActionButtonClick(extras);
        } else {
            C2181a.m6455h("CTNotificationIntentService: unhandled intent " + intent.getAction());
        }
    }
}
