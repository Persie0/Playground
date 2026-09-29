package com.google.android.gms.auth.api.signin.internal;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import androidx.fragment.app.ActivityC0979t;
import androidx.view.InterfaceC1051q;
import androidx.view.InterfaceC1057w;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.AbstractC2544c;
import com.google.android.gms.common.api.Status;
import java.lang.reflect.Modifier;
import java.util.Set;
import p070db.C5125e;
import p070db.C5134n;
import p070db.C5141u;
import p326q.C8453i;
import p447w3.AbstractC9808a;
import p447w3.C9809b;

/* JADX INFO: loaded from: classes.dex */
@KeepName
public class SignInHubActivity extends ActivityC0979t {

    /* JADX INFO: renamed from: X */
    public static boolean f13847X;

    /* JADX INFO: renamed from: S */
    public boolean f13848S = false;

    /* JADX INFO: renamed from: T */
    public SignInConfiguration f13849T;

    /* JADX INFO: renamed from: U */
    public boolean f13850U;

    /* JADX INFO: renamed from: V */
    public int f13851V;

    /* JADX INFO: renamed from: W */
    public Intent f13852W;

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: M */
    public final void m7526M() {
        C9809b c9809bM18288a = AbstractC9808a.m18288a(this);
        C5141u c5141u = new C5141u(this);
        C9809b.c cVar = c9809bM18288a.f49928b;
        if (cVar.f49939e) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
        C8453i<C9809b.a> c8453i = cVar.f49938d;
        C9809b.a aVar = (C9809b.a) c8453i.m16535f(0, null);
        InterfaceC1051q interfaceC1051q = c9809bM18288a.f49927a;
        if (aVar == null) {
            try {
                cVar.f49939e = true;
                Set<AbstractC2544c> set = AbstractC2544c.f13900a;
                synchronized (set) {
                }
                C5125e c5125e = new C5125e(this, set);
                if (C5125e.class.isMemberClass() && !Modifier.isStatic(C5125e.class.getModifiers())) {
                    throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + c5125e);
                }
                C9809b.a aVar2 = new C9809b.a(c5125e);
                c8453i.m16536g(0, aVar2);
                cVar.f49939e = false;
                C9809b.b<D> bVar = new C9809b.b<>(aVar2.f49931n, c5141u);
                aVar2.m3895d(interfaceC1051q, bVar);
                InterfaceC1057w interfaceC1057w = aVar2.f49933p;
                if (interfaceC1057w != null) {
                    aVar2.mo3899h(interfaceC1057w);
                }
                aVar2.f49932o = interfaceC1051q;
                aVar2.f49933p = bVar;
            } catch (Throwable th2) {
                cVar.f49939e = false;
                throw th2;
            }
        } else {
            C9809b.b<D> bVar2 = new C9809b.b<>(aVar.f49931n, c5141u);
            aVar.m3895d(interfaceC1051q, bVar2);
            InterfaceC1057w interfaceC1057w2 = aVar.f49933p;
            if (interfaceC1057w2 != null) {
                aVar.mo3899h(interfaceC1057w2);
            }
            aVar.f49932o = interfaceC1051q;
            aVar.f49933p = bVar2;
        }
        f13847X = false;
    }

    /* JADX INFO: renamed from: N */
    public final void m7527N(int i10) {
        Status status = new Status(null, i10);
        Intent intent = new Intent();
        intent.putExtra("googleSignInStatus", status);
        setResult(0, intent);
        finish();
        f13847X = false;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return true;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // androidx.fragment.app.ActivityC0979t, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i10, int i11, Intent intent) {
        GoogleSignInAccount googleSignInAccount;
        if (this.f13848S) {
            return;
        }
        setResult(0);
        if (i10 != 40962) {
            return;
        }
        if (intent != null) {
            SignInAccount signInAccount = (SignInAccount) intent.getParcelableExtra("signInAccount");
            if (signInAccount != null && (googleSignInAccount = signInAccount.f13840b) != null) {
                C5134n c5134nM10914a = C5134n.m10914a(this);
                GoogleSignInOptions googleSignInOptions = this.f13849T.f13846b;
                googleSignInAccount.getClass();
                synchronized (c5134nM10914a) {
                    c5134nM10914a.f33118a.m10905d(googleSignInAccount, googleSignInOptions);
                }
                intent.removeExtra("signInAccount");
                intent.putExtra("googleSignInAccount", googleSignInAccount);
                this.f13850U = true;
                this.f13851V = i11;
                this.f13852W = intent;
                m7526M();
                return;
            }
            if (intent.hasExtra("errorCode")) {
                int intExtra = intent.getIntExtra("errorCode", 8);
                if (intExtra == 13) {
                    intExtra = 12501;
                }
                m7527N(intExtra);
                return;
            }
        }
        m7527N(8);
    }

    @Override // androidx.fragment.app.ActivityC0979t, androidx.activity.ComponentActivity, p232l2.ActivityC7230i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        String action = intent.getAction();
        action.getClass();
        if ("com.google.android.gms.auth.NO_IMPL".equals(action)) {
            m7527N(12500);
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
        this.f13849T = signInConfiguration;
        if (bundle != null) {
            boolean z10 = bundle.getBoolean("signingInGoogleApiClients");
            this.f13850U = z10;
            if (z10) {
                this.f13851V = bundle.getInt("signInResultCode");
                Intent intent2 = (Intent) bundle.getParcelable("signInResultData");
                intent2.getClass();
                this.f13852W = intent2;
                m7526M();
                return;
            }
            return;
        }
        if (f13847X) {
            setResult(0);
            m7527N(12502);
            return;
        }
        f13847X = true;
        Intent intent3 = new Intent(action);
        if (action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN")) {
            intent3.setPackage("com.google.android.gms");
        } else {
            intent3.setPackage(getPackageName());
        }
        intent3.putExtra("config", this.f13849T);
        try {
            startActivityForResult(intent3, 40962);
        } catch (ActivityNotFoundException unused) {
            this.f13848S = true;
            Log.w("AuthSignInClient", "Could not launch sign in Intent. Google Play Service is probably being updated...");
            m7527N(17);
        }
    }

    @Override // androidx.fragment.app.ActivityC0979t, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        f13847X = false;
    }

    @Override // androidx.activity.ComponentActivity, p232l2.ActivityC7230i, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.f13850U);
        if (this.f13850U) {
            bundle.putInt("signInResultCode", this.f13851V);
            bundle.putParcelable("signInResultData", this.f13852W);
        }
    }
}
