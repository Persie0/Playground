package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.C2548c;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.annotation.KeepName;
import p152hb.C5961d;
import p176ib.C6272i;
import p412ub.HandlerC9517f;

/* JADX INFO: loaded from: classes.dex */
@KeepName
public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int f13869b = 0;

    /* JADX INFO: renamed from: a */
    public int f13870a = 0;

    @Override // android.app.Activity
    public final void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i10 == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.f13870a = 0;
            setResult(i11, intent);
            if (booleanExtra) {
                C5961d c5961dM12400f = C5961d.m12400f(this);
                if (i11 == -1) {
                    HandlerC9517f handlerC9517f = c5961dM12400f.f35440I;
                    handlerC9517f.sendMessage(handlerC9517f.obtainMessage(3));
                } else if (i11 == 0) {
                    c5961dM12400f.m12405g(new ConnectionResult(13, null), getIntent().getIntExtra("failing_client_id", -1));
                }
            }
            finish();
        }
        if (i10 == 2) {
            this.f13870a = 0;
            setResult(i11, intent);
        }
        finish();
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.f13870a = 0;
        setResult(0);
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f13870a = bundle.getInt("resolution");
        }
        if (this.f13870a != 1) {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                Log.e("GoogleApiActivity", "Activity started without extras");
                finish();
                return;
            }
            PendingIntent pendingIntent = (PendingIntent) extras.get("pending_intent");
            Integer num = (Integer) extras.get("error_code");
            if (pendingIntent == null && num == null) {
                Log.e("GoogleApiActivity", "Activity started without resolution");
                finish();
                return;
            }
            if (pendingIntent != null) {
                try {
                    startIntentSenderForResult(pendingIntent.getIntentSender(), 1, null, 0, 0, 0);
                    this.f13870a = 1;
                    return;
                } catch (ActivityNotFoundException e10) {
                    if (extras.getBoolean("notify_manager", true)) {
                        C5961d.m12400f(this).m12405g(new ConnectionResult(22, null), getIntent().getIntExtra("failing_client_id", -1));
                    } else {
                        String string = pendingIntent.toString();
                        StringBuilder sb2 = new StringBuilder(string.length() + 36);
                        sb2.append("Activity not found while launching ");
                        sb2.append(string);
                        sb2.append(".");
                        String string2 = sb2.toString();
                        if (Build.FINGERPRINT.contains("generic")) {
                            string2 = string2.concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");
                        }
                        Log.e("GoogleApiActivity", string2, e10);
                    }
                    this.f13870a = 1;
                    finish();
                    return;
                } catch (IntentSender.SendIntentException e11) {
                    Log.e("GoogleApiActivity", "Failed to launch pendingIntent", e11);
                    finish();
                    return;
                }
            }
            C6272i.m12915i(num);
            AlertDialog alertDialogM7587d = C2548c.f13920d.m7587d(num.intValue(), this, 2, this);
            if (alertDialogM7587d != null) {
                C2548c.m7584h(this, alertDialogM7587d, "GooglePlayServicesErrorDialog", this);
            }
            this.f13870a = 1;
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("resolution", this.f13870a);
        super.onSaveInstanceState(bundle);
    }
}
