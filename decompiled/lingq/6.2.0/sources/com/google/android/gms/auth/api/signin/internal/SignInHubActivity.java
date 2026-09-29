package com.google.android.gms.auth.api.signin.internal;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.api.Status;
import java.lang.reflect.Modifier;
import java.util.Set;
import p000.C3386nv;
import p000.cua;
import p000.id3;
import p000.ih5;
import p000.jh9;
import p000.kh5;
import p000.leb;
import p000.me3;
import p000.ny8;
import p000.or1;
import p000.pe9;
import p000.vcb;
import p000.web;
import p000.y38;
import p000.z21;
import p000.zi9;

/* JADX INFO: loaded from: classes2.dex */
public class SignInHubActivity extends id3 {

    /* JADX INFO: renamed from: a0 */
    public static boolean f11615a0 = false;

    /* JADX INFO: renamed from: V */
    public boolean f11616V = false;

    /* JADX INFO: renamed from: W */
    public SignInConfiguration f11617W;

    /* JADX INFO: renamed from: X */
    public boolean f11618X;

    /* JADX INFO: renamed from: Y */
    public int f11619Y;

    /* JADX INFO: renamed from: Z */
    public Intent f11620Z;

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return true;
    }

    /* JADX INFO: renamed from: l */
    public final void m5273l() {
        cua cuaVarMo2116r = mo2116r();
        me3 me3Var = kh5.f47296d;
        cuaVarMo2116r.getClass();
        or1 or1Var = or1.f54780b;
        or1Var.getClass();
        ny8 ny8Var = new ny8(cuaVarMo2116r, me3Var, or1Var);
        z21 z21VarM24933a = y38.m24933a(kh5.class);
        String strM25413b = z21VarM24933a.m25413b();
        if (strM25413b == null) {
            C3386nv.m17626m("Local and anonymous classes can not be ViewModels");
            return;
        }
        kh5 kh5Var = (kh5) ny8Var.m17675B(z21VarM24933a, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strM25413b));
        jh9 jh9Var = new jh9(this, 5);
        boolean z = kh5Var.f47298c;
        pe9 pe9Var = kh5Var.f47297b;
        if (z) {
            C3386nv.m17633t("Called while creating a loader");
            return;
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            C3386nv.m17633t("initLoader must be called on the main thread");
            return;
        }
        ih5 ih5Var = (ih5) pe9Var.m19078b(0);
        if (ih5Var == null) {
            try {
                kh5Var.f47298c = true;
                Set set = vcb.f65200b;
                synchronized (set) {
                }
                leb lebVar = new leb(this, set);
                if (leb.class.isMemberClass() && !Modifier.isStatic(leb.class.getModifiers())) {
                    throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + lebVar);
                }
                ih5 ih5Var2 = new ih5(lebVar);
                pe9Var.m19080d(0, ih5Var2);
                kh5Var.f47298c = false;
                ih5Var2.m13914m(this, jh9Var);
            } catch (Throwable th) {
                kh5Var.f47298c = false;
                throw th;
            }
        } else {
            ih5Var.m13914m(this, jh9Var);
        }
        f11615a0 = false;
    }

    /* JADX INFO: renamed from: m */
    public final void m5274m(int i) {
        Status status = new Status(i, null, null, null);
        Intent intent = new Intent();
        intent.putExtra("googleSignInStatus", status);
        setResult(0, intent);
        finish();
        f11615a0 = false;
    }

    @Override // p000.id3, p000.uc1, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        GoogleSignInAccount googleSignInAccount;
        if (this.f11616V) {
            return;
        }
        setResult(0);
        if (i != 40962) {
            return;
        }
        if (intent != null) {
            SignInAccount signInAccount = (SignInAccount) intent.getParcelableExtra("signInAccount");
            if (signInAccount != null && (googleSignInAccount = signInAccount.f11608b) != null) {
                web webVarM23863P = web.m23863P(this);
                GoogleSignInOptions googleSignInOptions = this.f11617W.f11614b;
                synchronized (webVarM23863P) {
                    ((zi9) webVarM23863P.f66742a).m25672c(googleSignInAccount, googleSignInOptions);
                }
                intent.removeExtra("signInAccount");
                intent.putExtra("googleSignInAccount", googleSignInAccount);
                this.f11618X = true;
                this.f11619Y = i2;
                this.f11620Z = intent;
                m5273l();
                return;
            }
            if (intent.hasExtra("errorCode")) {
                int intExtra = intent.getIntExtra("errorCode", 8);
                if (intExtra == 13) {
                    intExtra = 12501;
                }
                m5274m(intExtra);
                return;
            }
        }
        m5274m(8);
    }

    @Override // p000.id3, p000.uc1, p000.tc1, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        String action = intent.getAction();
        if (action == null) {
            Log.e("AuthSignInClient", "Null action");
            m5274m(12500);
            return;
        }
        if (action.equals("com.google.android.gms.auth.NO_IMPL")) {
            Log.e("AuthSignInClient", "Action not implemented");
            m5274m(12500);
            return;
        }
        if (!action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") && !action.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")) {
            Log.e("AuthSignInClient", "Unknown action: ".concat(String.valueOf(intent.getAction())));
            finish();
            return;
        }
        Bundle bundleExtra = intent.getBundleExtra("config");
        if (bundleExtra == null) {
            Log.e("AuthSignInClient", "Activity started with no configuration.");
            setResult(0);
            finish();
            return;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) bundleExtra.getParcelable("config");
        if (signInConfiguration == null) {
            Log.e("AuthSignInClient", "Activity started with invalid configuration.");
            setResult(0);
            finish();
            return;
        }
        this.f11617W = signInConfiguration;
        if (bundle != null) {
            boolean z = bundle.getBoolean("signingInGoogleApiClients");
            this.f11618X = z;
            if (z) {
                this.f11619Y = bundle.getInt("signInResultCode");
                Intent intent2 = (Intent) bundle.getParcelable("signInResultData");
                if (intent2 != null) {
                    this.f11620Z = intent2;
                    m5273l();
                    return;
                } else {
                    Log.e("AuthSignInClient", "Sign in result data cannot be null");
                    setResult(0);
                    finish();
                    return;
                }
            }
            return;
        }
        if (f11615a0) {
            setResult(0);
            m5274m(12502);
            return;
        }
        f11615a0 = true;
        Intent intent3 = new Intent(action);
        if (action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN")) {
            intent3.setPackage("com.google.android.gms");
        } else {
            intent3.setPackage(getPackageName());
        }
        intent3.putExtra("config", this.f11617W);
        try {
            startActivityForResult(intent3, 40962);
        } catch (ActivityNotFoundException unused) {
            this.f11616V = true;
            Log.w("AuthSignInClient", "Could not launch sign in Intent. Google Play Service is probably being updated...");
            m5274m(17);
        }
    }

    @Override // p000.id3, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        f11615a0 = false;
    }

    @Override // p000.uc1, p000.tc1, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.f11618X);
        if (this.f11618X) {
            bundle.putInt("signInResultCode", this.f11619Y);
            bundle.putParcelable("signInResultData", this.f11620Z);
        }
    }
}
