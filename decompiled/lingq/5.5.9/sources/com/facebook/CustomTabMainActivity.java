package com.facebook;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.login.LoginTargetApp;
import dm.C5207g;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import p067d8.C5061d;
import p067d8.C5075o;
import p067d8.C5079s;
import p067d8.C5086z;
import p173i8.C6205a;
import p254m2.C7472a;
import p266n.C7667d;
import p266n.C7669f;
import p274n8.C7717b;
import p498y3.C10289a;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m13365d2 = {"Lcom/facebook/CustomTabMainActivity;", "Landroid/app/Activity;", "<init>", "()V", "facebook-common_release"}, m13366k = 1, m13367mv = {1, 5, 1})
public final class CustomTabMainActivity extends Activity {

    /* JADX INFO: renamed from: c */
    public static final String f11421c = C5207g.m11116k(".extra_action", "CustomTabMainActivity");

    /* JADX INFO: renamed from: d */
    public static final String f11422d = C5207g.m11116k(".extra_params", "CustomTabMainActivity");

    /* JADX INFO: renamed from: e */
    public static final String f11423e = C5207g.m11116k(".extra_chromePackage", "CustomTabMainActivity");

    /* JADX INFO: renamed from: f */
    public static final String f11424f = C5207g.m11116k(".extra_url", "CustomTabMainActivity");

    /* JADX INFO: renamed from: g */
    public static final String f11425g = C5207g.m11116k(".extra_targetApp", "CustomTabMainActivity");

    /* JADX INFO: renamed from: h */
    public static final String f11426h = C5207g.m11116k(".action_refresh", "CustomTabMainActivity");

    /* JADX INFO: renamed from: i */
    public static final String f11427i = C5207g.m11116k(".no_activity_exception", "CustomTabMainActivity");

    /* JADX INFO: renamed from: a */
    public boolean f11428a = true;

    /* JADX INFO: renamed from: b */
    public C2273b f11429b;

    /* JADX INFO: renamed from: com.facebook.CustomTabMainActivity$a */
    public /* synthetic */ class C2272a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f11430a;

        static {
            int[] iArr = new int[LoginTargetApp.valuesCustom().length];
            iArr[LoginTargetApp.INSTAGRAM.ordinal()] = 1;
            f11430a = iArr;
        }
    }

    /* JADX INFO: renamed from: com.facebook.CustomTabMainActivity$b */
    public static final class C2273b extends BroadcastReceiver {
        public C2273b() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            C5207g.m11111f(context, "context");
            C5207g.m11111f(intent, "intent");
            CustomTabMainActivity customTabMainActivity = CustomTabMainActivity.this;
            Intent intent2 = new Intent(customTabMainActivity, (Class<?>) CustomTabMainActivity.class);
            intent2.setAction(CustomTabMainActivity.f11426h);
            String str = CustomTabMainActivity.f11424f;
            intent2.putExtra(str, intent.getStringExtra(str));
            intent2.addFlags(603979776);
            customTabMainActivity.startActivity(intent2);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m6601a(Intent intent, int i10) {
        Bundle bundle;
        C2273b c2273b = this.f11429b;
        if (c2273b != null) {
            C10289a.m19281a(this).m19284d(c2273b);
        }
        if (intent != null) {
            String stringExtra = intent.getStringExtra(f11424f);
            if (stringExtra != null) {
                Uri uri = Uri.parse(stringExtra);
                C5086z c5086z = C5086z.f33015a;
                bundle = C5086z.m10809H(uri.getQuery());
                bundle.putAll(C5086z.m10809H(uri.getFragment()));
            } else {
                bundle = new Bundle();
            }
            C5079s c5079s = C5079s.f32992a;
            Intent intent2 = getIntent();
            C5207g.m11110e(intent2, "intent");
            Intent intentM10785e = C5079s.m10785e(intent2, bundle, null);
            if (intentM10785e != null) {
                intent = intentM10785e;
            }
            setResult(i10, intent);
        } else {
            C5079s c5079s2 = C5079s.f32992a;
            Intent intent3 = getIntent();
            C5207g.m11110e(intent3, "intent");
            setResult(i10, C5079s.m10785e(intent3, null, null));
        }
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        LoginTargetApp loginTargetApp;
        boolean z10;
        super.onCreate(bundle);
        if (C5207g.m11106a(CustomTabActivity.f11417b, getIntent().getAction())) {
            setResult(0);
            finish();
            return;
        }
        if (bundle == null) {
            String stringExtra = getIntent().getStringExtra(f11421c);
            if (stringExtra == null) {
                return;
            }
            Bundle bundleExtra = getIntent().getBundleExtra(f11422d);
            String stringExtra2 = getIntent().getStringExtra(f11423e);
            LoginTargetApp.Companion companion = LoginTargetApp.INSTANCE;
            String stringExtra3 = getIntent().getStringExtra(f11425g);
            companion.getClass();
            LoginTargetApp[] loginTargetAppArrValuesCustom = LoginTargetApp.valuesCustom();
            int length = loginTargetAppArrValuesCustom.length;
            int i10 = 0;
            do {
                if (i10 >= length) {
                    loginTargetApp = LoginTargetApp.FACEBOOK;
                    break;
                } else {
                    loginTargetApp = loginTargetAppArrValuesCustom[i10];
                    i10++;
                }
            } while (!C5207g.m11106a(loginTargetApp.toString(), stringExtra3));
            C5061d c5075o = C2272a.f11430a[loginTargetApp.ordinal()] == 1 ? new C5075o(bundleExtra, stringExtra) : new C5061d(bundleExtra, stringExtra);
            if (C6205a.m12742b(c5075o)) {
                z10 = false;
            } else {
                try {
                    ReentrantLock reentrantLock = C7717b.f42250d;
                    reentrantLock.lock();
                    C7669f c7669f = C7717b.f42249c;
                    C7717b.f42249c = null;
                    reentrantLock.unlock();
                    Intent intent = new C7667d.b(c7669f).m15265a().f42139a;
                    intent.setPackage(stringExtra2);
                    try {
                        intent.setData(c5075o.f32915a);
                        Object obj = C7472a.f41322a;
                        C7472a.a.m14844b(this, intent, null);
                        z10 = true;
                    } catch (ActivityNotFoundException unused) {
                        z10 = false;
                    }
                } catch (Throwable th2) {
                    C6205a.m12741a(c5075o, th2);
                }
            }
            this.f11428a = false;
            if (!z10) {
                setResult(0, getIntent().putExtra(f11427i, true));
                finish();
            } else {
                C2273b c2273b = new C2273b();
                this.f11429b = c2273b;
                C10289a.m19281a(this).m19282b(c2273b, new IntentFilter(CustomTabActivity.f11417b));
            }
        }
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        C5207g.m11111f(intent, "intent");
        super.onNewIntent(intent);
        if (C5207g.m11106a(f11426h, intent.getAction())) {
            C10289a.m19281a(this).m19283c(new Intent(CustomTabActivity.f11418c));
            m6601a(intent, -1);
        } else if (C5207g.m11106a(CustomTabActivity.f11417b, intent.getAction())) {
            m6601a(intent, -1);
        }
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        if (this.f11428a) {
            m6601a(null, 0);
        }
        this.f11428a = true;
    }
}
