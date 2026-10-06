package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.google.android.apps.camera.p014ui.captureframe.Tjcw.gBCSQzBeB;
import com.google.lens.sdk.LensApi;
import p000.jcu;
import p000.jcy;
import p000.jfm;
import p000.jib;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: a */
    protected int f7598a = 0;

    /* JADX INFO: renamed from: a */
    public static Intent m4642a(Context context, PendingIntent pendingIntent, int i, boolean z) {
        Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
        intent.putExtra("pending_intent", pendingIntent);
        intent.putExtra("failing_client_id", i);
        intent.putExtra("notify_manager", z);
        return intent;
    }

    /* JADX INFO: renamed from: b */
    private final void m4643b() {
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
        if (pendingIntent == null) {
            jib.m13205j(num);
            jcy.f33766a.m12899c(this, num.intValue(), 2, this);
            this.f7598a = 1;
            return;
        }
        try {
            startIntentSenderForResult(pendingIntent.getIntentSender(), 1, null, 0, 0, 0);
            this.f7598a = 1;
        } catch (ActivityNotFoundException e) {
            if (extras.getBoolean("notify_manager", true)) {
                jfm.m13041c(this).m13046d(new jcu(22, null), getIntent().getIntExtra("failing_client_id", -1));
            } else {
                String strConcat = "Activity not found while launching " + pendingIntent.toString() + ".";
                if (Build.FINGERPRINT.contains("generic")) {
                    strConcat = strConcat.concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");
                }
                Log.e("GoogleApiActivity", strConcat, e);
            }
            this.f7598a = 1;
            finish();
        } catch (IntentSender.SendIntentException e2) {
            Log.e("GoogleApiActivity", "Failed to launch pendingIntent", e2);
            finish();
        }
    }

    @Override // android.app.Activity
    protected final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.f7598a = 0;
            setResult(i2, intent);
            if (booleanExtra) {
                jfm jfmVarM13041c = jfm.m13041c(this);
                switch (i2) {
                    case LensApi.LensAvailabilityStatus.LENS_AVAILABILITY_UNKNOWN /* -1 */:
                        jfmVarM13041c.m13047e();
                        break;
                    case 0:
                        jfmVarM13041c.m13046d(new jcu(13, null), getIntent().getIntExtra("failing_client_id", -1));
                        break;
                }
            }
        } else if (i == 2) {
            this.f7598a = 0;
            setResult(i2, intent);
        }
        finish();
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.f7598a = 0;
        setResult(0);
        finish();
    }

    @Override // android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f7598a = bundle.getInt("resolution");
        }
        if (this.f7598a != 1) {
            m4643b();
        }
    }

    @Override // android.app.Activity
    protected final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt(gBCSQzBeB.URmaVYgngxe, this.f7598a);
        super.onSaveInstanceState(bundle);
    }
}
