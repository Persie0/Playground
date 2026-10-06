package com.google.android.gms.auth.api.signin.internal;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.apps.camera.cameravisionkit.olQ.BEeWZPor;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.api.Status;
import p000.ActivityC0080bz;
import p000.amd;
import p000.jbq;
import p000.jbu;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class SignInHubActivity extends ActivityC0080bz {

    /* JADX INFO: renamed from: s */
    private static boolean f7592s = false;

    /* JADX INFO: renamed from: q */
    public int f7593q;

    /* JADX INFO: renamed from: r */
    public Intent f7594r;

    /* JADX INFO: renamed from: t */
    private boolean f7595t = false;

    /* JADX INFO: renamed from: u */
    private SignInConfiguration f7596u;

    /* JADX INFO: renamed from: v */
    private boolean f7597v;

    /* JADX INFO: renamed from: h */
    private final void m4639h() {
        amd.m936a(this).m938c(0, new jbu(this));
        f7592s = false;
    }

    /* JADX INFO: renamed from: i */
    private final void m4640i(int i) {
        Status status = new Status(i);
        Intent intent = new Intent();
        intent.putExtra("googleSignInStatus", status);
        setResult(0, intent);
        finish();
        f7592s = false;
    }

    /* JADX INFO: renamed from: j */
    private final void m4641j(String str) {
        Intent intent = new Intent(str);
        if (str.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN")) {
            intent.setPackage("com.google.android.gms");
        } else {
            intent.setPackage(getPackageName());
        }
        intent.putExtra(BEeWZPor.AOvRs, this.f7596u);
        try {
            startActivityForResult(intent, 40962);
        } catch (ActivityNotFoundException e) {
            this.f7595t = true;
            Log.w("AuthSignInClient", "Could not launch sign in Intent. Google Play Service is probably being updated...");
            m4640i(17);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return true;
    }

    @Override // p000.ActivityC0080bz, p000.ActivityC0907pl, android.app.Activity
    protected final void onActivityResult(int i, int i2, Intent intent) {
        GoogleSignInAccount googleSignInAccount;
        if (this.f7595t) {
        }
        setResult(0);
        switch (i) {
            case 40962:
                if (intent != null) {
                    SignInAccount signInAccount = (SignInAccount) intent.getParcelableExtra("signInAccount");
                    if (signInAccount != null && (googleSignInAccount = signInAccount.f7588b) != null) {
                        jbq.m12843c(this).m12848e(this.f7596u.f7591b, googleSignInAccount);
                        intent.removeExtra("signInAccount");
                        intent.putExtra("googleSignInAccount", googleSignInAccount);
                        this.f7597v = true;
                        this.f7593q = i2;
                        this.f7594r = intent;
                        m4639h();
                    } else if (intent.hasExtra("errorCode")) {
                        int intExtra = intent.getIntExtra("errorCode", 8);
                        if (intExtra == 13) {
                            intExtra = 12501;
                        }
                        m4640i(intExtra);
                    }
                }
                m4640i(8);
                break;
        }
    }

    @Override // p000.ActivityC0080bz, p000.ActivityC0907pl, p000.ActivityC0136do, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        String action = intent.getAction();
        action.getClass();
        if ("com.google.android.gms.auth.NO_IMPL".equals(action)) {
            m4640i(12500);
            return;
        }
        if (!action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") && !action.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")) {
            Log.e("AuthSignInClient", "Unknown action: ".concat(String.valueOf(intent.getAction())));
            finish();
            return;
        }
        Bundle bundleExtra = intent.getBundleExtra("config");
        bundleExtra.getClass();
        SignInConfiguration signInConfiguration = (SignInConfiguration) bundleExtra.getParcelable("config");
        if (signInConfiguration == null) {
            Log.e("AuthSignInClient", "Activity started with invalid configuration.");
            setResult(0);
            finish();
            return;
        }
        this.f7596u = signInConfiguration;
        if (bundle == null) {
            if (f7592s) {
                setResult(0);
                m4640i(12502);
                return;
            } else {
                f7592s = true;
                m4641j(action);
                return;
            }
        }
        boolean z = bundle.getBoolean("signingInGoogleApiClients");
        this.f7597v = z;
        if (z) {
            this.f7593q = bundle.getInt("signInResultCode");
            Intent intent2 = (Intent) bundle.getParcelable("signInResultData");
            intent2.getClass();
            this.f7594r = intent2;
            m4639h();
        }
    }

    @Override // p000.ActivityC0080bz, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        f7592s = false;
    }

    @Override // p000.ActivityC0907pl, p000.ActivityC0136do, android.app.Activity
    protected final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.f7597v);
        if (this.f7597v) {
            bundle.putInt("signInResultCode", this.f7593q);
            bundle.putParcelable("signInResultData", this.f7594r);
        }
    }
}
