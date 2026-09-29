package p291o7;

import ae.C0062b;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.AsyncTask;
import android.util.Log;
import com.facebook.AccessToken;
import com.facebook.FacebookException;
import com.facebook.LoggingBehavior;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.FetchedAppSettingsManager;
import com.kochava.tracker.BuildConfig;
import dm.C5207g;
import ge.C5789m;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantLock;
import mo.C7661i;
import p067d8.C5056a0;
import p067d8.C5057b;
import p067d8.C5079s;
import p067d8.C5083w;
import p067d8.C5086z;
import p150h9.C5931p;
import p173i8.C6205a;
import p260m8.C7499b;
import p289o5.C7940t;
import p402u0.C9362e;
import p476x7.C10105d;
import sl.C9072e;

/* JADX INFO: renamed from: o7.n */
/* JADX INFO: loaded from: classes.dex */
public final class C8004n {

    /* JADX INFO: renamed from: d */
    public static Executor f43553d;

    /* JADX INFO: renamed from: e */
    public static volatile String f43554e;

    /* JADX INFO: renamed from: f */
    public static volatile String f43555f;

    /* JADX INFO: renamed from: g */
    public static volatile String f43556g;

    /* JADX INFO: renamed from: h */
    public static volatile Boolean f43557h;

    /* JADX INFO: renamed from: j */
    public static volatile boolean f43559j;

    /* JADX INFO: renamed from: k */
    public static Context f43560k;

    /* JADX INFO: renamed from: n */
    public static final String f43563n;

    /* JADX INFO: renamed from: o */
    public static boolean f43564o;

    /* JADX INFO: renamed from: p */
    public static boolean f43565p;

    /* JADX INFO: renamed from: q */
    public static boolean f43566q;

    /* JADX INFO: renamed from: r */
    public static final AtomicBoolean f43567r;

    /* JADX INFO: renamed from: s */
    public static volatile String f43568s;

    /* JADX INFO: renamed from: t */
    public static volatile String f43569t;

    /* JADX INFO: renamed from: u */
    public static final C8002l f43570u;

    /* JADX INFO: renamed from: v */
    public static boolean f43571v;

    /* JADX INFO: renamed from: a */
    public static final C8004n f43550a = new C8004n();

    /* JADX INFO: renamed from: b */
    public static final String f43551b = C8004n.class.getCanonicalName();

    /* JADX INFO: renamed from: c */
    public static final HashSet<LoggingBehavior> f43552c = C7499b.m14921S(LoggingBehavior.DEVELOPER_ERRORS);

    /* JADX INFO: renamed from: i */
    public static final AtomicLong f43558i = new AtomicLong(65536);

    /* JADX INFO: renamed from: l */
    public static int f43561l = 64206;

    /* JADX INFO: renamed from: m */
    public static final ReentrantLock f43562m = new ReentrantLock();

    static {
        int i10 = C5083w.f33011a;
        f43563n = "v16.0";
        f43567r = new AtomicBoolean(false);
        f43568s = "instagram.com";
        f43569t = "facebook.com";
        f43570u = new C8002l(1);
    }

    /* JADX INFO: renamed from: a */
    public static final Context m15871a() {
        C5056a0.m10747e();
        Context context = f43560k;
        if (context != null) {
            return context;
        }
        C5207g.m11117l("applicationContext");
        throw null;
    }

    /* JADX INFO: renamed from: b */
    public static final String m15872b() {
        C5056a0.m10747e();
        String str = f43554e;
        if (str != null) {
            return str;
        }
        throw new FacebookException("A valid Facebook app id must be set in the AndroidManifest.xml or set by calling FacebookSdk.setApplicationId before initializing the sdk.");
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: c */
    public static final Executor m15873c() {
        ReentrantLock reentrantLock = f43562m;
        reentrantLock.lock();
        try {
            if (f43553d == null) {
                f43553d = AsyncTask.THREAD_POOL_EXECUTOR;
            }
            C9072e c9072e = C9072e.f47360a;
            reentrantLock.unlock();
            Executor executor = f43553d;
            if (executor != null) {
                return executor;
            }
            throw new IllegalStateException("Required value was null.".toString());
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: d */
    public static final String m15874d() {
        C5086z c5086z = C5086z.f33015a;
        String str = f43563n;
        String str2 = String.format("getGraphApiVersion: %s", Arrays.copyOf(new Object[]{str}, 1));
        C5207g.m11110e(str2, "java.lang.String.format(format, *args)");
        C5086z.m10807F(f43551b, str2);
        return str;
    }

    /* JADX INFO: renamed from: e */
    public static final String m15875e() {
        Date date = AccessToken.f11370l;
        AccessToken accessTokenM6595b = AccessToken.C2262b.m6595b();
        String str = accessTokenM6595b != null ? accessTokenM6595b.f11381k : null;
        C5086z c5086z = C5086z.f33015a;
        String strM15254T2 = f43569t;
        if (str == null) {
            return strM15254T2;
        }
        if (C5207g.m11106a(str, "gaming")) {
            return C7661i.m15254T2(strM15254T2, "facebook.com", "fb.gg");
        }
        if (C5207g.m11106a(str, "instagram")) {
            strM15254T2 = C7661i.m15254T2(strM15254T2, "facebook.com", "instagram.com");
        }
        return strM15254T2;
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m15876f(Context context) {
        C5056a0.m10747e();
        return context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getBoolean("limitEventUsage", false);
    }

    /* JADX INFO: renamed from: g */
    public static final synchronized boolean m15877g() {
        return f43571v;
    }

    /* JADX INFO: renamed from: h */
    public static final boolean m15878h() {
        return f43567r.get();
    }

    /* JADX INFO: renamed from: i */
    public static final boolean m15879i(LoggingBehavior loggingBehavior) {
        boolean z10;
        C5207g.m11111f(loggingBehavior, "behavior");
        HashSet<LoggingBehavior> hashSet = f43552c;
        synchronized (hashSet) {
            z10 = f43559j && hashSet.contains(loggingBehavior);
        }
        return z10;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: j */
    public static final void m15880j(Context context) {
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), BuildConfig.SDK_TRUNCATE_LENGTH);
            C5207g.m11110e(applicationInfo, "try {\n          context.packageManager.getApplicationInfo(\n              context.packageName, PackageManager.GET_META_DATA)\n        } catch (e: PackageManager.NameNotFoundException) {\n          return\n        }");
            if (applicationInfo.metaData == null) {
                return;
            }
            if (f43554e == null) {
                Object obj = applicationInfo.metaData.get("com.facebook.sdk.ApplicationId");
                if (obj instanceof String) {
                    String str = (String) obj;
                    Locale locale = Locale.ROOT;
                    C5207g.m11110e(locale, "ROOT");
                    String lowerCase = str.toLowerCase(locale);
                    C5207g.m11110e(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                    if (C7661i.m15256V2(lowerCase, "fb", false)) {
                        String strSubstring = str.substring(2);
                        C5207g.m11110e(strSubstring, "(this as java.lang.String).substring(startIndex)");
                        f43554e = strSubstring;
                    } else {
                        f43554e = str;
                    }
                } else if (obj instanceof Number) {
                    throw new FacebookException("App Ids cannot be directly placed in the manifest.They must be prefixed by 'fb' or be placed in the string resource file.");
                }
            }
            if (f43555f == null) {
                f43555f = applicationInfo.metaData.getString("com.facebook.sdk.ApplicationName");
            }
            if (f43556g == null) {
                f43556g = applicationInfo.metaData.getString("com.facebook.sdk.ClientToken");
            }
            if (f43561l == 64206) {
                f43561l = applicationInfo.metaData.getInt("com.facebook.sdk.CallbackOffset", 64206);
            }
            if (f43557h == null) {
                f43557h = Boolean.valueOf(applicationInfo.metaData.getBoolean("com.facebook.sdk.CodelessDebugLogEnabled", false));
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [o7.k] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: k */
    public static final synchronized void m15881k(Context context) {
        ActivityInfo activityInfo;
        boolean zM15858a;
        if (f43567r.get()) {
            return;
        }
        String str = C5056a0.f32910a;
        PackageManager packageManager = context.getPackageManager();
        Object obj = null;
        int i10 = 1;
        if (packageManager != null) {
            try {
                activityInfo = packageManager.getActivityInfo(new ComponentName(context, "com.facebook.FacebookActivity"), 1);
            } catch (PackageManager.NameNotFoundException unused) {
                activityInfo = null;
            }
        } else {
            activityInfo = null;
        }
        if (activityInfo == null) {
            Log.w(C5056a0.f32910a, "FacebookActivity is not declared in the AndroidManifest.xml. If you are using the facebook-common module or dependent modules please add com.facebook.FacebookActivity to your AndroidManifest.xml file. See https://developers.facebook.com/docs/android/getting-started for more info.");
        }
        String str2 = C5056a0.f32910a;
        if (context.checkCallingOrSelfPermission("android.permission.INTERNET") == -1) {
            Log.w(C5056a0.f32910a, "No internet permissions granted for the app, please add <uses-permission android:name=\"android.permission.INTERNET\" /> to your AndroidManifest.xml.");
        }
        Context applicationContext = context.getApplicationContext();
        C5207g.m11110e(applicationContext, "applicationContext.applicationContext");
        f43560k = applicationContext;
        C0062b.m328Z0(context);
        Context context2 = f43560k;
        if (context2 == null) {
            C5207g.m11117l("applicationContext");
            throw null;
        }
        m15880j(context2);
        String str3 = f43554e;
        int i11 = 0;
        if (str3 == null || str3.length() == 0) {
            throw new FacebookException("A valid Facebook app id must be set in the AndroidManifest.xml or set by calling FacebookSdk.setApplicationId before initializing the sdk.");
        }
        String str4 = f43556g;
        if (str4 == null || str4.length() == 0) {
            throw new FacebookException("A valid Facebook app client token must be set in the AndroidManifest.xml or set by calling FacebookSdk.setClientToken before initializing the sdk.");
        }
        f43567r.set(true);
        C7993c0 c7993c0 = C7993c0.f43496a;
        if (C6205a.m12742b(C7993c0.class)) {
            zM15858a = false;
        } else {
            try {
                C7993c0.f43496a.m15851d();
                zM15858a = C7993c0.f43500e.m15858a();
            } catch (Throwable th2) {
                C6205a.m12741a(C7993c0.class, th2);
                zM15858a = false;
            }
        }
        if (zM15858a) {
            f43571v = true;
        }
        Context context3 = f43560k;
        if (context3 == null) {
            C5207g.m11117l("applicationContext");
            throw null;
        }
        if ((context3 instanceof Application) && C7993c0.m15849b()) {
            C10105d c10105d = C10105d.f51249a;
            Context context4 = f43560k;
            if (context4 == null) {
                C5207g.m11117l("applicationContext");
                throw null;
            }
            C10105d.m18961b((Application) context4, f43554e);
        }
        FetchedAppSettingsManager.m6671c();
        C5079s.m10789k();
        C5057b c5057b = C5057b.f32911b;
        Context context5 = f43560k;
        if (context5 == null) {
            C5207g.m11117l("applicationContext");
            throw null;
        }
        C5057b.a.m10749a(context5);
        new C7940t((CallableC8001k) new Callable() { // from class: o7.k
            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Context context6 = C8004n.f43560k;
                if (context6 != null) {
                    return context6.getCacheDir();
                }
                C5207g.m11117l("applicationContext");
                throw null;
            }
        });
        FeatureManager featureManager = FeatureManager.f11546a;
        FeatureManager.m6664a(new C9362e(3), FeatureManager.Feature.Instrument);
        FeatureManager.m6664a(new C5931p(i10), FeatureManager.Feature.AppEvents);
        FeatureManager.m6664a(new C8002l(i11), FeatureManager.Feature.ChromeCustomTabsPrefetching);
        FeatureManager.m6664a(new C5789m(i11), FeatureManager.Feature.IgnoreAppSwitchToLoggedOut);
        FeatureManager.m6664a(new C9362e(4), FeatureManager.Feature.BypassAppSwitch);
        m15873c().execute(new FutureTask(new CallableC8003m(i11, obj)));
    }
}
