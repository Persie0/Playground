package p317p7;

import android.content.Context;
import android.os.Bundle;
import com.android.installreferrer.api.C2078a;
import com.android.installreferrer.api.InstallReferrerClient;
import com.facebook.AccessToken;
import com.facebook.FacebookException;
import com.facebook.LoggingBehavior;
import com.facebook.appevents.AccessTokenAppIdPair;
import com.facebook.appevents.AppEvent;
import com.facebook.appevents.AppEventsLogger$FlushBehavior;
import com.facebook.appevents.FlushReason;
import com.facebook.internal.FeatureManager;
import dm.C5207g;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.Date;
import java.util.UUID;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import p067d8.C5056a0;
import p067d8.C5073m;
import p067d8.C5076p;
import p067d8.C5077q;
import p067d8.C5078r;
import p067d8.C5086z;
import p080e.RunnableC5286r;
import p173i8.C6205a;
import p213k4.RunnableC6590j;
import p291o7.C8004n;
import p476x7.C10105d;
import p527z7.C10454b;
import sl.C9072e;

/* JADX INFO: renamed from: p7.h */
/* JADX INFO: loaded from: classes.dex */
public final class C8201h {

    /* JADX INFO: renamed from: c */
    public static final String f44393c;

    /* JADX INFO: renamed from: d */
    public static ScheduledThreadPoolExecutor f44394d;

    /* JADX INFO: renamed from: e */
    public static final AppEventsLogger$FlushBehavior f44395e;

    /* JADX INFO: renamed from: f */
    public static final Object f44396f;

    /* JADX INFO: renamed from: g */
    public static String f44397g;

    /* JADX INFO: renamed from: h */
    public static boolean f44398h;

    /* JADX INFO: renamed from: a */
    public final String f44399a;

    /* JADX INFO: renamed from: b */
    public final AccessTokenAppIdPair f44400b;

    /* JADX INFO: renamed from: p7.h$a */
    public static final class a {

        /* JADX INFO: renamed from: p7.h$a$a, reason: collision with other inner class name */
        public static final class C10666a implements C5076p.a {
            @Override // p067d8.C5076p.a
            /* JADX INFO: renamed from: a */
            public final void mo10775a(String str) {
                String str2 = C8201h.f44393c;
                C8004n.m15871a().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putString("install_referrer", str).apply();
            }
        }

        /* JADX WARN: Code duplicated, block: B:28:0x007e  */
        /* JADX WARN: Code duplicated, block: B:39:0x008f A[Catch: all -> 0x00a2, TRY_LEAVE, TryCatch #0 {all -> 0x00a2, blocks: (B:17:0x0054, B:39:0x008f, B:29:0x0080, B:27:0x0079, B:23:0x006c), top: B:64:0x0054, inners: #4 }] */
        /* JADX INFO: renamed from: a */
        public static final void m16336a(AppEvent appEvent, AccessTokenAppIdPair accessTokenAppIdPair) {
            boolean z10;
            boolean z11;
            String str = C8201h.f44393c;
            String str2 = C8199f.f44386a;
            if (!C6205a.m12742b(C8199f.class)) {
                try {
                    C5207g.m11111f(accessTokenAppIdPair, "accessTokenAppId");
                    C8199f.f44389d.execute(new RunnableC6590j(accessTokenAppIdPair, 5, appEvent));
                } catch (Throwable th2) {
                    C6205a.m12741a(C8199f.class, th2);
                }
            }
            FeatureManager featureManager = FeatureManager.f11546a;
            boolean zM6666c = FeatureManager.m6666c(FeatureManager.Feature.OnDevicePostInstallEventProcessing);
            String str3 = appEvent.f11483d;
            boolean z12 = appEvent.f11481b;
            boolean z13 = false;
            if (zM6666c && C10454b.m19414a()) {
                String str4 = accessTokenAppIdPair.f11475a;
                if (!C6205a.m12742b(C10454b.class)) {
                    try {
                        C5207g.m11111f(str4, "applicationId");
                        C10454b c10454b = C10454b.f52308a;
                        c10454b.getClass();
                        if (!C6205a.m12742b(c10454b)) {
                            if (z12) {
                                try {
                                    if (C10454b.f52309b.contains(str3)) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    if (!(!z12) || z10) {
                                        z11 = true;
                                        if (z11) {
                                            C8004n.m15873c().execute(new RunnableC5286r(str4, 8, appEvent));
                                        }
                                    }
                                } catch (Throwable th3) {
                                    C6205a.m12741a(c10454b, th3);
                                }
                            } else {
                                z10 = false;
                                if (!(!z12)) {
                                }
                                z11 = true;
                                if (z11) {
                                    C8004n.m15873c().execute(new RunnableC5286r(str4, 8, appEvent));
                                }
                            }
                        }
                        z11 = false;
                        if (z11) {
                            C8004n.m15873c().execute(new RunnableC5286r(str4, 8, appEvent));
                        }
                    } catch (Throwable th4) {
                        C6205a.m12741a(C10454b.class, th4);
                    }
                }
            }
            if (z12) {
                return;
            }
            if (!C6205a.m12742b(C8201h.class)) {
                try {
                    z13 = C8201h.f44398h;
                } catch (Throwable th5) {
                    C6205a.m12741a(C8201h.class, th5);
                }
            }
            if (z13) {
                return;
            }
            if (!C5207g.m11106a(str3, "fb_mobile_activate_app")) {
                C5078r.f32986e.m10780b(LoggingBehavior.APP_EVENTS, "AppEvents", "Warning: Please call AppEventsLogger.activateApp(...)from the long-lived activity's onResume() methodbefore logging other app events.");
            } else {
                if (C6205a.m12742b(C8201h.class)) {
                    return;
                }
                try {
                    C8201h.f44398h = true;
                } catch (Throwable th6) {
                    C6205a.m12741a(C8201h.class, th6);
                }
            }
        }

        /* JADX INFO: renamed from: b */
        public static AppEventsLogger$FlushBehavior m16337b() {
            AppEventsLogger$FlushBehavior appEventsLogger$FlushBehavior;
            synchronized (C8201h.m16331c()) {
                if (C6205a.m12742b(C8201h.class)) {
                    appEventsLogger$FlushBehavior = null;
                } else {
                    try {
                        appEventsLogger$FlushBehavior = C8201h.f44395e;
                    } catch (Throwable th2) {
                        C6205a.m12741a(C8201h.class, th2);
                        appEventsLogger$FlushBehavior = null;
                        return appEventsLogger$FlushBehavior;
                    }
                }
            }
            return appEventsLogger$FlushBehavior;
        }

        /* JADX INFO: renamed from: c */
        public static String m16338c() {
            C10666a c10666a = new C10666a();
            if (!C8004n.m15871a().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getBoolean("is_referrer_updated", false)) {
                C2078a c2078aM6226a = InstallReferrerClient.newBuilder(C8004n.m15871a()).m6226a();
                try {
                    c2078aM6226a.startConnection(new C5077q(c2078aM6226a, c10666a));
                } catch (Exception unused) {
                }
            }
            return C8004n.m15871a().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getString("install_referrer", null);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: d */
        public static void m16339d() {
            synchronized (C8201h.m16331c()) {
                if (C8201h.m16330b() != null) {
                    return;
                }
                int i10 = 1;
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
                if (!C6205a.m12742b(C8201h.class)) {
                    try {
                        C8201h.f44394d = scheduledThreadPoolExecutor;
                    } catch (Throwable th2) {
                        C6205a.m12741a(C8201h.class, th2);
                    }
                }
                C9072e c9072e = C9072e.f47360a;
                RunnableC8194a runnableC8194a = new RunnableC8194a(i10);
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutorM16330b = C8201h.m16330b();
                if (scheduledThreadPoolExecutorM16330b == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                }
                scheduledThreadPoolExecutorM16330b.scheduleAtFixedRate(runnableC8194a, 0L, 86400L, TimeUnit.SECONDS);
            }
        }
    }

    static {
        new a();
        String canonicalName = C8201h.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "com.facebook.appevents.AppEventsLoggerImpl";
        }
        f44393c = canonicalName;
        f44395e = AppEventsLogger$FlushBehavior.AUTO;
        f44396f = new Object();
    }

    public C8201h(Context context, String str) {
        this(C5086z.m10827l(context), str);
    }

    public C8201h(String str, String str2) {
        C5056a0.m10747e();
        this.f44399a = str;
        Date date = AccessToken.f11370l;
        AccessToken accessTokenM6595b = AccessToken.C2262b.m6595b();
        if (accessTokenM6595b == null || new Date().after(accessTokenM6595b.f11371a) || !(str2 == null || C5207g.m11106a(str2, accessTokenM6595b.f11378h))) {
            if (str2 == null) {
                C5086z c5086z = C5086z.f33015a;
                str2 = C5086z.m10832q(C8004n.m15871a());
            }
            this.f44400b = new AccessTokenAppIdPair(null, str2);
        } else {
            this.f44400b = new AccessTokenAppIdPair(accessTokenM6595b.f11375e, C8004n.m15872b());
        }
        a.m16339d();
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ String m16329a() {
        if (C6205a.m12742b(C8201h.class)) {
            return null;
        }
        try {
            return f44397g;
        } catch (Throwable th2) {
            C6205a.m12741a(C8201h.class, th2);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ ScheduledThreadPoolExecutor m16330b() {
        if (C6205a.m12742b(C8201h.class)) {
            return null;
        }
        try {
            return f44394d;
        } catch (Throwable th2) {
            C6205a.m12741a(C8201h.class, th2);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ Object m16331c() {
        if (C6205a.m12742b(C8201h.class)) {
            return null;
        }
        try {
            return f44396f;
        } catch (Throwable th2) {
            C6205a.m12741a(C8201h.class, th2);
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m16332d(Bundle bundle, String str) {
        if (C6205a.m12742b(this)) {
            return;
        }
        try {
            m16333e(str, null, bundle, false, C10105d.m18960a());
        } catch (Throwable th2) {
            C6205a.m12741a(this, th2);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m16333e(String str, Double d10, Bundle bundle, boolean z10, UUID uuid) {
        if (C6205a.m12742b(this) || str == null) {
            return;
        }
        try {
            if (str.length() == 0) {
                return;
            }
            C5073m c5073m = C5073m.f32961a;
            if (C5073m.m10770b("app_events_killswitch", C8004n.m15872b(), false)) {
                C5078r.f32986e.m10781c(LoggingBehavior.APP_EVENTS, "AppEvents", "KillSwitch is enabled and fail to log app event: %s", str);
                return;
            }
            try {
                a.m16336a(new AppEvent(this.f44399a, str, d10, bundle, z10, C10105d.f51259k == 0, uuid), this.f44400b);
            } catch (FacebookException e10) {
                C5078r.f32986e.m10781c(LoggingBehavior.APP_EVENTS, "AppEvents", "Invalid app event: %s", e10.toString());
            } catch (JSONException e11) {
                C5078r.f32986e.m10781c(LoggingBehavior.APP_EVENTS, "AppEvents", "JSON encoding for app event failed: '%s'", e11.toString());
            }
        } catch (Throwable th2) {
            C6205a.m12741a(this, th2);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m16334f(String str, Bundle bundle) {
        if (C6205a.m12742b(this)) {
            return;
        }
        try {
            m16333e(str, null, bundle, true, C10105d.m18960a());
        } catch (Throwable th2) {
            C6205a.m12741a(this, th2);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m16335g(BigDecimal bigDecimal, Currency currency, Bundle bundle) {
        if (C6205a.m12742b(this)) {
            return;
        }
        try {
            if (bigDecimal == null) {
                C5078r.f32986e.m10780b(LoggingBehavior.DEVELOPER_ERRORS, "AppEvents", "purchaseAmount cannot be null");
                return;
            }
            if (currency == null) {
                C5078r.f32986e.m10780b(LoggingBehavior.DEVELOPER_ERRORS, "AppEvents", "currency cannot be null");
                return;
            }
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = bundle;
            bundle2.putString("fb_currency", currency.getCurrencyCode());
            m16333e("fb_mobile_purchase", Double.valueOf(bigDecimal.doubleValue()), bundle2, true, C10105d.m18960a());
            if (a.m16337b() != AppEventsLogger$FlushBehavior.EXPLICIT_ONLY) {
                String str = C8199f.f44386a;
                C8199f.m16323c(FlushReason.EAGER_FLUSHING_EVENT);
            }
        } catch (Throwable th2) {
            C6205a.m12741a(this, th2);
        }
    }
}
