package com.facebook;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.login.LoginTargetApp;
import java.util.concurrent.locks.ReentrantLock;
import p000.AbstractC3695vr;
import p000.C2943dx;
import p000.C3156jq;
import p000.C3693vp;
import p000.ak5;
import p000.bna;
import p000.fa4;
import p000.gv5;
import p000.lp1;
import p000.mx1;
import p000.nx1;
import p000.s76;
import p000.sy2;
import p000.vqb;
import p000.w41;
import p000.z64;

/* JADX INFO: loaded from: classes2.dex */
public final class CustomTabMainActivity extends Activity {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ int f11347c = 0;

    /* JADX INFO: renamed from: a */
    public boolean f11348a = true;

    /* JADX INFO: renamed from: b */
    public C3693vp f11349b;

    /* JADX INFO: renamed from: a */
    public final void m5183a(Intent intent, int i) {
        Bundle bundle;
        C3693vp c3693vp = this.f11349b;
        if (c3693vp != null) {
            w41.m23706r(this).m23717K(c3693vp);
        }
        if (intent != null) {
            String stringExtra = intent.getStringExtra("CustomTabMainActivity.extra_url");
            if (stringExtra != null) {
                Uri uri = Uri.parse(stringExtra);
                bundle = bna.m3964n0(uri.getQuery());
                bundle.putAll(bna.m3964n0(uri.getFragment()));
            } else {
                bundle = new Bundle();
            }
            Intent intent2 = getIntent();
            intent2.getClass();
            Intent intentM21137e = s76.m21137e(intent2, bundle, null);
            if (intentM21137e != null) {
                intent = intentM21137e;
            }
            setResult(i, intent);
        } else {
            Intent intent3 = getIntent();
            intent3.getClass();
            setResult(i, s76.m21137e(intent3, null, null));
        }
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        String stringExtra;
        LoginTargetApp loginTargetApp;
        vqb vqbVar;
        boolean z;
        Uri uriM3956j;
        super.onCreate(bundle);
        if ("CustomTabActivity.action_customTabRedirect".equals(getIntent().getAction())) {
            setResult(0);
            finish();
            return;
        }
        if (bundle != null || (stringExtra = getIntent().getStringExtra("CustomTabMainActivity.extra_action")) == null) {
            return;
        }
        Bundle bundleExtra = getIntent().getBundleExtra("CustomTabMainActivity.extra_params");
        String stringExtra2 = getIntent().getStringExtra("CustomTabMainActivity.extra_chromePackage");
        ak5 ak5Var = LoginTargetApp.Companion;
        String stringExtra3 = getIntent().getStringExtra("CustomTabMainActivity.extra_targetApp");
        ak5Var.getClass();
        LoginTargetApp[] loginTargetAppArrValues = LoginTargetApp.values();
        int length = loginTargetAppArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                loginTargetApp = LoginTargetApp.FACEBOOK;
                break;
            }
            loginTargetApp = loginTargetAppArrValues[i];
            if (fa4.m11650l(loginTargetApp.toString(), stringExtra3)) {
                break;
            } else {
                i++;
            }
        }
        if (mx1.f51989a[loginTargetApp.ordinal()] == 1) {
            vqbVar = new z64(stringExtra, bundleExtra);
            if (bundleExtra == null) {
                bundleExtra = new Bundle();
            }
            if (stringExtra.equals("oauth")) {
                uriM3956j = bna.m3956j(AbstractC3695vr.m23504o(), "oauth/authorize", bundleExtra);
            } else {
                uriM3956j = bna.m3956j(AbstractC3695vr.m23504o(), sy2.m21769d() + "/dialog/" + stringExtra, bundleExtra);
            }
            if (!lp1.f49971a.contains(vqbVar)) {
                try {
                    vqbVar.f65802b = uriM3956j;
                } catch (Throwable th) {
                    lp1.m16420a(vqbVar, th);
                }
            }
        } else {
            vqbVar = new vqb(stringExtra, bundleExtra);
        }
        if (lp1.f49971a.contains(vqbVar)) {
            z = false;
        } else {
            try {
                ReentrantLock reentrantLock = nx1.f53356d;
                reentrantLock.lock();
                gv5 gv5Var = nx1.f53355c;
                nx1.f53355c = null;
                reentrantLock.unlock();
                C3156jq c3156jqM10716c = new C2943dx(gv5Var).m10716c();
                ((Intent) c3156jqM10716c.f45990a).setPackage(stringExtra2);
                try {
                    Uri uri = (Uri) vqbVar.f65802b;
                    Intent intent = (Intent) c3156jqM10716c.f45990a;
                    intent.setData(uri);
                    startActivity(intent, (Bundle) c3156jqM10716c.f45991b);
                    z = true;
                } catch (ActivityNotFoundException unused) {
                    z = false;
                }
            } catch (Throwable th2) {
                lp1.m16420a(vqbVar, th2);
            }
        }
        this.f11348a = false;
        if (!z) {
            setResult(0, getIntent().putExtra("CustomTabMainActivity.no_activity_exception", true));
            finish();
        } else {
            C3693vp c3693vp = new C3693vp(this, 3);
            this.f11349b = c3693vp;
            w41.m23706r(this).m23709C(c3693vp, new IntentFilter("CustomTabActivity.action_customTabRedirect"));
        }
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        intent.getClass();
        super.onNewIntent(intent);
        if ("CustomTabMainActivity.action_refresh".equals(intent.getAction())) {
            w41.m23706r(this).m23711E(new Intent("CustomTabActivity.action_destroy"));
            m5183a(intent, -1);
        } else if ("CustomTabActivity.action_customTabRedirect".equals(intent.getAction())) {
            m5183a(intent, -1);
        }
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        if (this.f11348a) {
            m5183a(null, 0);
        }
        this.f11348a = true;
    }
}
