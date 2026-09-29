package com.android.billingclient.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.google.android.gms.internal.play_billing.AbstractC0985a;
import com.google.android.gms.internal.play_billing.zzjd;
import com.google.android.gms.internal.play_billing.zzjk;
import p000.qc0;
import p000.qvb;
import p000.sq6;

/* JADX INFO: loaded from: classes2.dex */
public class ProxyBillingActivity extends Activity {

    /* JADX INFO: renamed from: a */
    public ResultReceiver f11280a;

    /* JADX INFO: renamed from: b */
    public boolean f11281b;

    /* JADX INFO: renamed from: c */
    public boolean f11282c;

    /* JADX INFO: renamed from: d */
    public int f11283d;

    /* JADX INFO: renamed from: e */
    public long f11284e;

    /* JADX INFO: renamed from: f */
    public boolean f11285f;

    /* JADX INFO: renamed from: a */
    public static zzjd m5173a(Intent intent, int i) {
        if (intent != null) {
            if (intent.getExtras() == null) {
                return zzjd.NULL_BUNDLE_IN_ACTIVITY_RESULT;
            }
            return i == 5 ? zzjd.PLAY_STORE_ON_CREATE_RUNTIME_EXCEPTION : zzjd.REASON_UNSPECIFIED;
        }
        if (i == -1) {
            return zzjd.NULL_DATA_WITH_OK_RESULT_CODE_IN_PROXY_BILLING_ACTIVITY_RESULT;
        }
        if (i == 0) {
            return zzjd.NULL_DATA_WITH_CANCELLED_RESULT_CODE_IN_PROXY_BILLING_ACTIVITY_RESULT;
        }
        if (i != 3) {
            return i != 4 ? zzjd.NULL_DATA_WITH_OTHER_RESULT_CODE_IN_PROXY_BILLING_ACTIVITY_RESULT : zzjd.NULL_DATA_WITH_PLAY_CANCELED_WITHOUT_COMPLETE_ACTION_RESULT_CODE;
        }
        return zzjd.NULL_DATA_WITH_PLAY_CANCELED_RESULT_CODE;
    }

    /* JADX INFO: renamed from: b */
    public final Intent m5174b(zzjd zzjdVar, long j) {
        Intent intentM5175c = m5175c();
        intentM5175c.putExtra("RESPONSE_CODE", 6);
        intentM5175c.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
        sq6 sq6VarM19857a = qc0.m19857a();
        sq6VarM19857a.f61253a = 6;
        sq6VarM19857a.f61255c = "An internal error occurred.";
        qc0 qc0VarM21585u = sq6VarM19857a.m21585u();
        int i = qvb.f58258a;
        intentM5175c.putExtra("FAILURE_LOGGING_PAYLOAD", qvb.m20182b(zzjdVar, 2, qc0VarM21585u, null, zzjk.BROADCAST_ACTION_UNSPECIFIED).m5530b());
        intentM5175c.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
        intentM5175c.putExtra("billingClientTransactionId", j);
        intentM5175c.putExtra("wasServiceAutoReconnected", this.f11285f);
        return intentM5175c;
    }

    /* JADX INFO: renamed from: c */
    public final Intent m5175c() {
        Intent intent = new Intent("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
        intent.setPackage(getApplicationContext().getPackageName());
        return intent;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x003c  */
    /* JADX WARN: Code duplicated, block: B:21:0x003e  */
    /* JADX WARN: Code duplicated, block: B:28:0x006b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x006d  */
    /* JADX WARN: Code duplicated, block: B:30:0x006e A[PHI: r10
      0x006e: PHI (r10v1 int) = (r10v0 int), (r10v16 int) binds: [B:27:0x0069, B:29:0x006d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:32:0x008a  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:45:0x010b  */
    /* JADX WARN: Code duplicated, block: B:6:0x0011  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Instruction removed from duplicated block: B:30:0x006e, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:32:0x008a, please report this as an issue */
    @Override // android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        boolean z;
        int i3;
        int i4;
        String string;
        Intent intentM5175c;
        int i5;
        ResultReceiver resultReceiver;
        Bundle extras;
        super.onActivityResult(i, i2, intent);
        if (i == 100) {
            if (intent == null) {
                z = false;
            } else {
                z = true;
            }
            i3 = AbstractC0985a.m5504e(intent, "ProxyBillingActivity").f57553a;
            i4 = -1;
            if (i2 != -1) {
                AbstractC0985a.m5508i("ProxyBillingActivity", "Activity finished with resultCode " + i2 + " and billing's responseCode: " + i3);
                i4 = i2;
            } else if (i3 != 0) {
                i2 = -1;
                AbstractC0985a.m5508i("ProxyBillingActivity", "Activity finished with resultCode " + i2 + " and billing's responseCode: " + i3);
                i4 = i2;
            }
            if (true != z) {
                AbstractC0985a.m5508i("ProxyBillingActivity", "Got null data with resultCode " + i4 + "!");
            } else if (intent.getExtras() == null) {
                AbstractC0985a.m5508i("ProxyBillingActivity", "Got null bundle!");
            }
            if (m5173a(intent, i4).equals(zzjd.REASON_UNSPECIFIED)) {
                string = intent.getExtras().getString("ALTERNATIVE_BILLING_USER_CHOICE_DATA");
                if (string != null) {
                    Intent intent2 = new Intent("com.android.vending.billing.ALTERNATIVE_BILLING");
                    intent2.setPackage(getApplicationContext().getPackageName());
                    intent2.putExtra("ALTERNATIVE_BILLING_USER_CHOICE_DATA", string);
                    intent2.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                    intentM5175c = intent2;
                } else {
                    intentM5175c = m5175c();
                    intentM5175c.putExtras(intent.getExtras());
                    intentM5175c.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                }
                intentM5175c.putExtra("billingClientTransactionId", this.f11284e);
                intentM5175c.putExtra("wasServiceAutoReconnected", this.f11285f);
            } else {
                intentM5175c = m5174b(m5173a(intent, i4), this.f11284e);
            }
            if (i == 110) {
                intentM5175c.putExtra("IS_FIRST_PARTY_PURCHASE", true);
            }
            sendBroadcast(intentM5175c);
        } else if (i == 110) {
            if (intent == null) {
                z = false;
            } else {
                z = true;
            }
            i3 = AbstractC0985a.m5504e(intent, "ProxyBillingActivity").f57553a;
            i4 = -1;
            if (i2 != -1) {
                AbstractC0985a.m5508i("ProxyBillingActivity", "Activity finished with resultCode " + i2 + " and billing's responseCode: " + i3);
                i4 = i2;
            } else if (i3 != 0) {
                i2 = -1;
                AbstractC0985a.m5508i("ProxyBillingActivity", "Activity finished with resultCode " + i2 + " and billing's responseCode: " + i3);
                i4 = i2;
            }
            if (true != z) {
                AbstractC0985a.m5508i("ProxyBillingActivity", "Got null data with resultCode " + i4 + "!");
            } else if (intent.getExtras() == null) {
                AbstractC0985a.m5508i("ProxyBillingActivity", "Got null bundle!");
            }
            if (m5173a(intent, i4).equals(zzjd.REASON_UNSPECIFIED)) {
                intentM5175c = m5174b(m5173a(intent, i4), this.f11284e);
            } else {
                string = intent.getExtras().getString("ALTERNATIVE_BILLING_USER_CHOICE_DATA");
                if (string != null) {
                    Intent intent3 = new Intent("com.android.vending.billing.ALTERNATIVE_BILLING");
                    intent3.setPackage(getApplicationContext().getPackageName());
                    intent3.putExtra("ALTERNATIVE_BILLING_USER_CHOICE_DATA", string);
                    intent3.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                    intentM5175c = intent3;
                } else {
                    intentM5175c = m5175c();
                    intentM5175c.putExtras(intent.getExtras());
                    intentM5175c.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                }
                intentM5175c.putExtra("billingClientTransactionId", this.f11284e);
                intentM5175c.putExtra("wasServiceAutoReconnected", this.f11285f);
            }
            if (i == 110) {
                intentM5175c.putExtra("IS_FIRST_PARTY_PURCHASE", true);
            }
            sendBroadcast(intentM5175c);
        } else if (i == 101) {
            if (intent == null) {
                AbstractC0985a.m5508i("ProxyBillingActivity", "Got null intent!");
            } else {
                int i6 = AbstractC0985a.f12176a;
                Bundle extras2 = intent.getExtras();
                if (extras2 == null) {
                    AbstractC0985a.m5508i("ProxyBillingActivity", "Unexpected null bundle received!");
                } else {
                    i5 = extras2.getInt("IN_APP_MESSAGE_RESPONSE_CODE", 0);
                }
                resultReceiver = this.f11280a;
                if (resultReceiver != null) {
                    if (intent == null) {
                        extras = null;
                    } else {
                        extras = intent.getExtras();
                    }
                    resultReceiver.send(i5, extras);
                }
            }
            i5 = 0;
            resultReceiver = this.f11280a;
            if (resultReceiver != null) {
                if (intent == null) {
                    extras = null;
                } else {
                    extras = intent.getExtras();
                }
                resultReceiver.send(i5, extras);
            }
        } else {
            AbstractC0985a.m5508i("ProxyBillingActivity", "Got onActivityResult with wrong requestCode: " + i + "; skipping...");
        }
        this.f11281b = false;
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        PendingIntent pendingIntent;
        super.onCreate(bundle);
        if (bundle != null) {
            AbstractC0985a.m5507h("ProxyBillingActivity", "Launching Play Store billing flow from savedInstanceState");
            this.f11281b = bundle.getBoolean("send_cancelled_broadcast_if_finished", false);
            if (bundle.containsKey("in_app_message_result_receiver")) {
                this.f11280a = (ResultReceiver) bundle.getParcelable("in_app_message_result_receiver");
            }
            this.f11282c = bundle.getBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false);
            this.f11283d = bundle.getInt("activity_code", 100);
            if (bundle.containsKey("billingClientTransactionId")) {
                this.f11284e = bundle.getLong("billingClientTransactionId");
            }
            if (bundle.containsKey("wasServiceAutoReconnected")) {
                this.f11285f = bundle.getBoolean("wasServiceAutoReconnected");
                return;
            }
            return;
        }
        AbstractC0985a.m5507h("ProxyBillingActivity", "Launching Play Store billing flow");
        this.f11283d = 100;
        if (getIntent().hasExtra("BUY_INTENT")) {
            pendingIntent = (PendingIntent) getIntent().getParcelableExtra("BUY_INTENT");
            if (getIntent().hasExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT") && getIntent().getBooleanExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false)) {
                this.f11282c = true;
                this.f11283d = 110;
            }
        } else if (getIntent().hasExtra("IN_APP_MESSAGE_INTENT")) {
            pendingIntent = (PendingIntent) getIntent().getParcelableExtra("IN_APP_MESSAGE_INTENT");
            this.f11280a = (ResultReceiver) getIntent().getParcelableExtra("in_app_message_result_receiver");
            this.f11283d = 101;
        } else {
            pendingIntent = null;
        }
        if (getIntent().hasExtra("billingClientTransactionId")) {
            this.f11284e = getIntent().getLongExtra("billingClientTransactionId", 0L);
        }
        if (getIntent().hasExtra("wasServiceAutoReconnected")) {
            this.f11285f = getIntent().getBooleanExtra("wasServiceAutoReconnected", false);
        }
        try {
            this.f11281b = true;
            startIntentSenderForResult(pendingIntent.getIntentSender(), this.f11283d, new Intent(), 0, 0, 0);
        } catch (IntentSender.SendIntentException e) {
            AbstractC0985a.m5509j("ProxyBillingActivity", "Got exception while trying to start a purchase flow.", e);
            ResultReceiver resultReceiver = this.f11280a;
            if (resultReceiver != null) {
                resultReceiver.send(0, null);
            } else {
                Intent intentM5174b = m5174b(zzjd.INTENT_SENDER_EXCEPTION, this.f11284e);
                if (this.f11282c) {
                    intentM5174b.putExtra("IS_FIRST_PARTY_PURCHASE", true);
                }
                sendBroadcast(intentM5174b);
            }
            this.f11281b = false;
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        if (isFinishing() && this.f11281b) {
            Intent intentM5175c = m5175c();
            intentM5175c.putExtra("RESPONSE_CODE", 1);
            intentM5175c.putExtra("DEBUG_MESSAGE", "Billing dialog closed.");
            if (this.f11282c) {
                intentM5175c.putExtra("IS_FIRST_PARTY_PURCHASE", true);
            }
            int i = this.f11283d;
            if (i == 110 || i == 100) {
                intentM5175c.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                intentM5175c.putExtra("billingClientTransactionId", this.f11284e);
            }
            sendBroadcast(intentM5175c);
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.f11280a;
        if (resultReceiver != null) {
            bundle.putParcelable("in_app_message_result_receiver", resultReceiver);
        }
        bundle.putBoolean("send_cancelled_broadcast_if_finished", this.f11281b);
        bundle.putBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", this.f11282c);
        bundle.putInt("activity_code", this.f11283d);
        bundle.putLong("billingClientTransactionId", this.f11284e);
        bundle.putBoolean("wasServiceAutoReconnected", this.f11285f);
    }
}
