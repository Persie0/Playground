package p000;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.facebook.AccessToken;
import com.facebook.FacebookException;
import com.facebook.LoggingBehavior;
import com.facebook.appevents.AccessTokenAppIdPair;
import com.facebook.appevents.AppEvent;
import com.facebook.appevents.AppEventsLogger$FlushBehavior;
import com.facebook.appevents.FlushReason;
import com.facebook.appevents.integrity.C0925a;
import com.facebook.internal.FeatureManager$Feature;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.Date;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import kotlin.Pair;
import org.json.JSONException;

/* JADX INFO: renamed from: fs */
/* JADX INFO: loaded from: classes.dex */
public final class C3012fs {

    /* JADX INFO: renamed from: c */
    public static final String f39540c;

    /* JADX INFO: renamed from: d */
    public static ScheduledThreadPoolExecutor f39541d;

    /* JADX INFO: renamed from: e */
    public static final AppEventsLogger$FlushBehavior f39542e;

    /* JADX INFO: renamed from: f */
    public static final Object f39543f;

    /* JADX INFO: renamed from: g */
    public static volatile String f39544g;

    /* JADX INFO: renamed from: h */
    public static boolean f39545h;

    /* JADX INFO: renamed from: i */
    public static final gm5 f39546i;

    /* JADX INFO: renamed from: a */
    public final String f39547a;

    /* JADX INFO: renamed from: b */
    public final AccessTokenAppIdPair f39548b;

    static {
        String canonicalName = C3012fs.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "com.facebook.appevents.AppEventsLoggerImpl";
        }
        f39540c = canonicalName;
        f39542e = AppEventsLogger$FlushBehavior.AUTO;
        f39543f = new Object();
        f39546i = new gm5(11);
    }

    public C3012fs(String str, String str2) {
        eda.m11074g();
        this.f39547a = str;
        Date date = AccessToken.f11306l;
        AccessToken accessTokenM24363t = x74.m24363t();
        if (accessTokenM24363t == null || new Date().after(accessTokenM24363t.f11307a) || !(str2 == null || str2.equals(accessTokenM24363t.f11314h))) {
            if (str2 == null) {
                sy2.m21766a();
                str2 = sy2.m21767b();
            }
            this.f39548b = new AccessTokenAppIdPair(null, str2);
        } else {
            this.f39548b = new AccessTokenAppIdPair(accessTokenM24363t.f11311e, sy2.m21767b());
        }
        iy5.m14196k();
    }

    /* JADX INFO: renamed from: a */
    public static final String m12034a() {
        if (lp1.f49971a.contains(C3012fs.class)) {
            return null;
        }
        try {
            return f39544g;
        } catch (Throwable th) {
            lp1.m16420a(C3012fs.class, th);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static final ScheduledThreadPoolExecutor m12035b() {
        if (lp1.f49971a.contains(C3012fs.class)) {
            return null;
        }
        try {
            return f39541d;
        } catch (Throwable th) {
            lp1.m16420a(C3012fs.class, th);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static final Object m12036c() {
        if (lp1.f49971a.contains(C3012fs.class)) {
            return null;
        }
        try {
            return f39543f;
        } catch (Throwable th) {
            lp1.m16420a(C3012fs.class, th);
            return null;
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m12037f(C3012fs c3012fs, String str, Double d, Bundle bundle, boolean z, UUID uuid) {
        if (lp1.f49971a.contains(C3012fs.class)) {
            return;
        }
        try {
            c3012fs.m12039e(str, d, bundle, z, uuid, null);
        } catch (Throwable th) {
            lp1.m16420a(C3012fs.class, th);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m12038d(String str, Bundle bundle) {
        C3012fs c3012fs;
        if (lp1.f49971a.contains(this)) {
            return;
        }
        try {
            c3012fs = this;
            try {
                m12037f(c3012fs, str, null, bundle, false, AbstractC3785y6.m24949b());
            } catch (Throwable th) {
                th = th;
                lp1.m16420a(c3012fs, th);
            }
        } catch (Throwable th2) {
            th = th2;
            c3012fs = this;
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x009d  */
    /* JADX INFO: renamed from: e */
    public final void m12039e(String str, Double d, Bundle bundle, boolean z, UUID uuid, jz6 jz6Var) {
        jz6 jz6Var2;
        Bundle bundle2;
        boolean zContains;
        Set set = lp1.f49971a;
        if (set.contains(this) || str == null) {
            return;
        }
        try {
            if (str.length() == 0) {
                return;
            }
            if (!z && c60.m4339c() && (str.equals("fb_mobile_purchase") || str.equals("Subscribe") || str.equals("StartTrial"))) {
                Log.w(f39540c, "You are logging purchase events while auto-logging of in-app purchase is enabled in the SDK. Make sure you don't log duplicate events");
                if ((p13.m18852b(FeatureManager$Feature.AndroidManualImplicitPurchaseDedupe) && str.equals("fb_mobile_purchase")) || (p13.m18852b(FeatureManager$Feature.AndroidManualImplicitSubsDedupe) && (str.equals("Subscribe") || str.equals("StartTrial")))) {
                    Double dM23064f = v24.m23064f(d, bundle);
                    Currency currencyM23060b = v24.m23060b(bundle);
                    if (dM23064f == null || currencyM23060b == null) {
                        jz6Var2 = jz6Var;
                        bundle2 = bundle;
                    } else {
                        Pair pairM23059a = v24.m23059a(z24.m25416c(vz1.m23604J(new j24(str, dM23064f.doubleValue(), currencyM23060b)), System.currentTimeMillis(), false, vz1.m23604J(new Pair(bundle, jz6Var))), bundle, jz6Var);
                        bundle2 = (Bundle) pairM23059a.f47623a;
                        jz6Var2 = (jz6) pairM23059a.f47624b;
                    }
                } else {
                    jz6Var2 = jz6Var;
                    bundle2 = bundle;
                }
            } else {
                jz6Var2 = jz6Var;
                bundle2 = bundle;
            }
            if (v23.m23054b("app_events_killswitch", sy2.m21767b(), false)) {
                iy5 iy5Var = qj5.f57852d;
                iy5.m14198n(LoggingBehavior.APP_EVENTS, "AppEvents", "KillSwitch is enabled and fail to log app event: %s", str);
                return;
            }
            xd0 xd0Var = xd0.f68087a;
            if (set.contains(xd0.class)) {
                zContains = false;
            } else {
                try {
                    if (xd0.f68088b) {
                        zContains = xd0.f68089c.contains(str);
                    }
                } catch (Throwable th) {
                    lp1.m16420a(xd0.class, th);
                }
                zContains = false;
            }
            if (zContains) {
                return;
            }
            Pair pairM14190c = iy5.m14190c(bundle2, jz6Var2, z);
            Bundle bundle3 = (Bundle) pairM14190c.f47623a;
            jz6 jz6Var3 = (jz6) pairM14190c.f47624b;
            try {
                if (!C0925a.f11404a.m5193c(bundle3)) {
                    aw8.m3098b(str, bundle3);
                }
                i80.m13716a(bundle3);
                ho5.m13389A(str, bundle3);
                ri9.m20668d(bundle3);
                C0925a.m5191b(bundle3);
                iy5.m14189b(new AppEvent(this.f39547a, str, d, bundle3, z, AbstractC3785y6.f69348k == 0, uuid, jz6Var3), this.f39548b);
            } catch (FacebookException e) {
                iy5 iy5Var2 = qj5.f57852d;
                iy5.m14198n(LoggingBehavior.APP_EVENTS, "AppEvents", "Invalid app event: %s", e.toString());
            } catch (JSONException e2) {
                iy5 iy5Var3 = qj5.f57852d;
                iy5.m14198n(LoggingBehavior.APP_EVENTS, "AppEvents", "JSON encoding for app event failed: '%s'", e2.toString());
            }
        } catch (Throwable th2) {
            lp1.m16420a(this, th2);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m12040g(String str, Bundle bundle) {
        C3012fs c3012fs;
        if (lp1.f49971a.contains(this)) {
            return;
        }
        try {
            c3012fs = this;
            try {
                m12037f(c3012fs, str, null, bundle, true, AbstractC3785y6.m24949b());
            } catch (Throwable th) {
                th = th;
                lp1.m16420a(c3012fs, th);
            }
        } catch (Throwable th2) {
            th = th2;
            c3012fs = this;
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m12041h(BigDecimal bigDecimal, Currency currency, Bundle bundle, jz6 jz6Var) {
        Throwable th;
        C3012fs c3012fs;
        if (lp1.f49971a.contains(this)) {
            return;
        }
        try {
            if (bigDecimal == null) {
                iy5 iy5Var = qj5.f57852d;
                iy5.m14197m(LoggingBehavior.DEVELOPER_ERRORS, "AppEvents", "purchaseAmount cannot be null");
                return;
            }
            if (currency == null) {
                iy5 iy5Var2 = qj5.f57852d;
                iy5.m14197m(LoggingBehavior.DEVELOPER_ERRORS, "AppEvents", "currency cannot be null");
                return;
            }
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = bundle;
            try {
                bundle2.putString("fb_currency", currency.getCurrencyCode());
                c3012fs = this;
                try {
                    c3012fs.m12039e("fb_mobile_purchase", Double.valueOf(bigDecimal.doubleValue()), bundle2, true, AbstractC3785y6.m24949b(), jz6Var);
                    try {
                        if (iy5.m14194i() != AppEventsLogger$FlushBehavior.EXPLICIT_ONLY) {
                            AbstractC3546rr.m20754c(FlushReason.EAGER_FLUSHING_EVENT);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        lp1.m16420a(c3012fs, th);
                    }
                } catch (Throwable th3) {
                    th = th3;
                    th = th;
                    lp1.m16420a(c3012fs, th);
                }
            } catch (Throwable th4) {
                th = th4;
                c3012fs = this;
            }
        } catch (Throwable th5) {
            th = th5;
            c3012fs = this;
        }
    }

    public C3012fs(Context context, String str) {
        this(bna.m3927P(context), str);
    }
}
