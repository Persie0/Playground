package com.android.billingclient.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.internal.play_billing.C2933a;

/* JADX INFO: loaded from: classes.dex */
@UsedByReflection("PlatformActivityProxy")
public class ProxyBillingActivity extends Activity {

    /* JADX INFO: renamed from: a */
    public ResultReceiver f10523a;

    /* JADX INFO: renamed from: b */
    public ResultReceiver f10524b;

    /* JADX INFO: renamed from: c */
    public boolean f10525c;

    /* JADX INFO: renamed from: d */
    public boolean f10526d;

    /* JADX INFO: renamed from: a */
    public final Intent m6224a() {
        Intent intent = new Intent("com.android.vending.billing.PURCHASES_UPDATED");
        intent.setPackage(getApplicationContext().getPackageName());
        return intent;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0045  */
    /* JADX WARN: Code duplicated, block: B:22:0x0049  */
    /* JADX WARN: Code duplicated, block: B:52:0x0122  */
    @Override // android.app.Activity
    public final void onActivityResult(int i10, int i11, Intent intent) {
        Intent intentM6224a;
        int i12;
        ResultReceiver resultReceiver;
        super.onActivityResult(i10, i11, intent);
        Bundle extras = null;
        if (i10 == 100 || i10 == 110) {
            int i13 = C2933a.m8511c(intent, "ProxyBillingActivity").f43186a;
            if (i11 != -1) {
                C2933a.m8515g("ProxyBillingActivity", "Activity finished with resultCode " + i11 + " and billing's responseCode: " + i13);
            } else if (i13 != 0) {
                i11 = -1;
                C2933a.m8515g("ProxyBillingActivity", "Activity finished with resultCode " + i11 + " and billing's responseCode: " + i13);
            } else {
                i13 = 0;
            }
            ResultReceiver resultReceiver2 = this.f10523a;
            if (resultReceiver2 != null) {
                if (intent != null) {
                    extras = intent.getExtras();
                }
                resultReceiver2.send(i13, extras);
            } else {
                if (intent == null) {
                    intentM6224a = m6224a();
                } else if (intent.getExtras() != null) {
                    String string = intent.getExtras().getString("ALTERNATIVE_BILLING_USER_CHOICE_DATA");
                    if (string != null) {
                        intentM6224a = new Intent("com.android.vending.billing.ALTERNATIVE_BILLING");
                        intentM6224a.setPackage(getApplicationContext().getPackageName());
                        intentM6224a.putExtra("ALTERNATIVE_BILLING_USER_CHOICE_DATA", string);
                    } else {
                        Intent intentM6224a2 = m6224a();
                        intentM6224a2.putExtras(intent.getExtras());
                        intentM6224a = intentM6224a2;
                    }
                } else {
                    intentM6224a = m6224a();
                    C2933a.m8515g("ProxyBillingActivity", "Got null bundle!");
                    intentM6224a.putExtra("RESPONSE_CODE", 6);
                    intentM6224a.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
                }
                if (i10 == 110) {
                    intentM6224a.putExtra("IS_FIRST_PARTY_PURCHASE", true);
                }
                sendBroadcast(intentM6224a);
            }
        } else if (i10 == 101) {
            if (intent == null) {
                C2933a.m8515g("ProxyBillingActivity", "Got null intent!");
            } else {
                int i14 = C2933a.f14568a;
                Bundle extras2 = intent.getExtras();
                if (extras2 == null) {
                    C2933a.m8515g("ProxyBillingActivity", "Unexpected null bundle received!");
                } else {
                    i12 = extras2.getInt("IN_APP_MESSAGE_RESPONSE_CODE", 0);
                }
                resultReceiver = this.f10524b;
                if (resultReceiver != null) {
                    resultReceiver.send(i12, intent != null ? intent.getExtras() : null);
                }
            }
            i12 = 0;
            resultReceiver = this.f10524b;
            if (resultReceiver != null) {
                resultReceiver.send(i12, intent != null ? intent.getExtras() : null);
            }
        } else {
            C2933a.m8515g("ProxyBillingActivity", "Got onActivityResult with wrong requestCode: " + i10 + "; skipping...");
        }
        this.f10525c = false;
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i10;
        PendingIntent pendingIntent;
        int i11;
        super.onCreate(bundle);
        if (bundle != null) {
            C2933a.m8514f("ProxyBillingActivity", "Launching Play Store billing flow from savedInstanceState");
            this.f10525c = bundle.getBoolean("send_cancelled_broadcast_if_finished", false);
            if (bundle.containsKey("result_receiver")) {
                this.f10523a = (ResultReceiver) bundle.getParcelable("result_receiver");
            } else if (bundle.containsKey("in_app_message_result_receiver")) {
                this.f10524b = (ResultReceiver) bundle.getParcelable("in_app_message_result_receiver");
            }
            this.f10526d = bundle.getBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false);
            return;
        }
        C2933a.m8514f("ProxyBillingActivity", "Launching Play Store billing flow");
        if (getIntent().hasExtra("BUY_INTENT")) {
            pendingIntent = (PendingIntent) getIntent().getParcelableExtra("BUY_INTENT");
            if (getIntent().hasExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT") && getIntent().getBooleanExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false)) {
                this.f10526d = true;
                i11 = 110;
                i10 = i11;
            } else {
                i10 = 100;
            }
        } else if (getIntent().hasExtra("SUBS_MANAGEMENT_INTENT")) {
            pendingIntent = (PendingIntent) getIntent().getParcelableExtra("SUBS_MANAGEMENT_INTENT");
            this.f10523a = (ResultReceiver) getIntent().getParcelableExtra("result_receiver");
            i10 = 100;
        } else if (getIntent().hasExtra("IN_APP_MESSAGE_INTENT")) {
            pendingIntent = (PendingIntent) getIntent().getParcelableExtra("IN_APP_MESSAGE_INTENT");
            this.f10524b = (ResultReceiver) getIntent().getParcelableExtra("in_app_message_result_receiver");
            i11 = 101;
            i10 = i11;
        } else {
            i10 = 100;
            pendingIntent = null;
        }
        try {
            this.f10525c = true;
            startIntentSenderForResult(pendingIntent.getIntentSender(), i10, new Intent(), 0, 0, 0);
        } catch (IntentSender.SendIntentException e10) {
            C2933a.m8516h("ProxyBillingActivity", "Got exception while trying to start a purchase flow.", e10);
            ResultReceiver resultReceiver = this.f10523a;
            if (resultReceiver != null) {
                resultReceiver.send(6, null);
            } else {
                ResultReceiver resultReceiver2 = this.f10524b;
                if (resultReceiver2 != null) {
                    resultReceiver2.send(0, null);
                } else {
                    Intent intentM6224a = m6224a();
                    if (this.f10526d) {
                        intentM6224a.putExtra("IS_FIRST_PARTY_PURCHASE", true);
                    }
                    intentM6224a.putExtra("RESPONSE_CODE", 6);
                    intentM6224a.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
                    sendBroadcast(intentM6224a);
                }
            }
            this.f10525c = false;
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        if (isFinishing() && this.f10525c) {
            Intent intentM6224a = m6224a();
            intentM6224a.putExtra("RESPONSE_CODE", 1);
            intentM6224a.putExtra("DEBUG_MESSAGE", "Billing dialog closed.");
            sendBroadcast(intentM6224a);
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        ResultReceiver resultReceiver = this.f10523a;
        if (resultReceiver != null) {
            bundle.putParcelable("result_receiver", resultReceiver);
        }
        ResultReceiver resultReceiver2 = this.f10524b;
        if (resultReceiver2 != null) {
            bundle.putParcelable("in_app_message_result_receiver", resultReceiver2);
        }
        bundle.putBoolean("send_cancelled_broadcast_if_finished", this.f10525c);
        bundle.putBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", this.f10526d);
    }
}
