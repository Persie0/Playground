package p000;

import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.AsyncTask;
import android.util.Log;
import com.facebook.AccessToken;
import com.facebook.FacebookActivity;
import com.facebook.FacebookException;
import com.facebook.LoggingBehavior;
import com.facebook.appevents.internal.C0926a;
import com.facebook.internal.FeatureManager$Feature;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public final class sy2 {

    /* JADX INFO: renamed from: a */
    public static final sy2 f61585a = new sy2();

    /* JADX INFO: renamed from: b */
    public static final HashSet f61586b = AbstractC3489q9.m19788r(LoggingBehavior.DEVELOPER_ERRORS);

    /* JADX INFO: renamed from: c */
    public static Executor f61587c;

    /* JADX INFO: renamed from: d */
    public static volatile String f61588d;

    /* JADX INFO: renamed from: e */
    public static volatile String f61589e;

    /* JADX INFO: renamed from: f */
    public static String f61590f;

    /* JADX INFO: renamed from: g */
    public static String f61591g;

    /* JADX INFO: renamed from: h */
    public static volatile String f61592h;

    /* JADX INFO: renamed from: i */
    public static volatile Boolean f61593i;

    /* JADX INFO: renamed from: j */
    public static Context f61594j;

    /* JADX INFO: renamed from: k */
    public static int f61595k;

    /* JADX INFO: renamed from: l */
    public static final ReentrantLock f61596l;

    /* JADX INFO: renamed from: m */
    public static final String f61597m;

    /* JADX INFO: renamed from: n */
    public static boolean f61598n;

    /* JADX INFO: renamed from: o */
    public static boolean f61599o;

    /* JADX INFO: renamed from: p */
    public static boolean f61600p;

    /* JADX INFO: renamed from: q */
    public static final AtomicBoolean f61601q;

    /* JADX INFO: renamed from: r */
    public static volatile String f61602r;

    /* JADX INFO: renamed from: s */
    public static volatile String f61603s;

    /* JADX INFO: renamed from: t */
    public static final ho2 f61604t;

    /* JADX INFO: renamed from: u */
    public static boolean f61605u;

    static {
        new AtomicLong(65536L);
        f61595k = 64206;
        f61596l = new ReentrantLock();
        f61597m = "v16.0";
        f61601q = new AtomicBoolean(false);
        f61602r = "instagram.com";
        f61603s = "facebook.com";
        f61604t = new ho2(8);
    }

    /* JADX INFO: renamed from: a */
    public static final Context m21766a() {
        eda.m11074g();
        Context context = f61594j;
        if (context != null) {
            return context;
        }
        fa4.m11636J("applicationContext");
        throw null;
    }

    /* JADX INFO: renamed from: b */
    public static final String m21767b() {
        eda.m11074g();
        String str = f61588d;
        if (str != null) {
            return str;
        }
        throw new FacebookException("A valid Facebook app id must be set in the AndroidManifest.xml or set by calling FacebookSdk.setApplicationId before initializing the sdk.");
    }

    /* JADX INFO: renamed from: c */
    public static final Executor m21768c() {
        ReentrantLock reentrantLock = f61596l;
        reentrantLock.lock();
        try {
            if (f61587c == null) {
                f61587c = AsyncTask.THREAD_POOL_EXECUTOR;
            }
            reentrantLock.unlock();
            Executor executor = f61587c;
            if (executor != null) {
                return executor;
            }
            C3386nv.m17633t("Required value was null.");
            return null;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* JADX INFO: renamed from: d */
    public static final String m21769d() {
        String str = f61597m;
        String.format("getGraphApiVersion: %s", Arrays.copyOf(new Object[]{str}, 1));
        return str;
    }

    /* JADX INFO: renamed from: e */
    public static final String m21770e() {
        Date date = AccessToken.f11306l;
        AccessToken accessTokenM24363t = x74.m24363t();
        String str = accessTokenM24363t != null ? accessTokenM24363t.f11317k : null;
        String str2 = f61603s;
        if (str != null) {
            if (str.equals("gaming")) {
                return cl9.m4839V(str2, "facebook.com", "fb.gg");
            }
            if (str.equals("instagram")) {
                return cl9.m4839V(str2, "facebook.com", "instagram.com");
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m21771f(Context context) {
        eda.m11074g();
        return context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getBoolean("limitEventUsage", false);
    }

    /* JADX INFO: renamed from: g */
    public static final synchronized boolean m21772g() {
        return f61605u;
    }

    /* JADX INFO: renamed from: h */
    public static final void m21773h(LoggingBehavior loggingBehavior) {
        loggingBehavior.getClass();
        synchronized (f61586b) {
        }
    }

    /* JADX INFO: renamed from: i */
    public static final void m21774i(Context context) {
        if (context == null) {
            return;
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            applicationInfo.getClass();
            if (applicationInfo.metaData == null) {
                return;
            }
            if (f61588d == null) {
                Object obj = applicationInfo.metaData.get("com.facebook.sdk.ApplicationId");
                if (obj instanceof String) {
                    String str = (String) obj;
                    Locale locale = Locale.ROOT;
                    locale.getClass();
                    String lowerCase = str.toLowerCase(locale);
                    lowerCase.getClass();
                    if (cl9.m4842Y(lowerCase, "fb", false)) {
                        f61588d = str.substring(2);
                    } else {
                        f61588d = str;
                    }
                } else if (obj instanceof Number) {
                    throw new FacebookException("App Ids cannot be directly placed in the manifest.They must be prefixed by 'fb' or be placed in the string resource file.");
                }
            }
            f61590f = applicationInfo.metaData.getString("com.facebook.sdk.RedirectURI");
            f61591g = applicationInfo.metaData.getString("com.facebook.sdk.IntentUriPackageTarget");
            if (f61589e == null) {
                f61589e = applicationInfo.metaData.getString("com.facebook.sdk.ApplicationName");
            }
            if (f61592h == null) {
                f61592h = applicationInfo.metaData.getString("com.facebook.sdk.ClientToken");
            }
            if (f61595k == 64206) {
                f61595k = applicationInfo.metaData.getInt("com.facebook.sdk.CallbackOffset", 64206);
            }
            if (f61593i == null) {
                f61593i = Boolean.valueOf(applicationInfo.metaData.getBoolean("com.facebook.sdk.CodelessDebugLogEnabled", false));
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0076 A[Catch: all -> 0x0013, TryCatch #1 {, blocks: (B:4:0x0003, B:8:0x000d, B:12:0x0016, B:14:0x0021, B:15:0x0026, B:17:0x0037, B:19:0x003e, B:21:0x0044, B:23:0x0048, B:25:0x004e, B:34:0x0076, B:35:0x0078, B:37:0x007c, B:39:0x0080, B:41:0x0086, B:43:0x008a, B:47:0x009b, B:49:0x00a3, B:51:0x00a7, B:57:0x00bc, B:58:0x00c0, B:59:0x00c5, B:60:0x00c6, B:62:0x00d2, B:65:0x0146, B:66:0x014b, B:44:0x0092, B:45:0x0097, B:46:0x0098, B:67:0x014c, B:68:0x0151, B:32:0x0070, B:69:0x0152, B:70:0x0159, B:71:0x015a, B:72:0x0161, B:73:0x0162, B:74:0x0167, B:54:0x00b2, B:29:0x0063), top: B:80:0x0003, inners: #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x007c A[Catch: all -> 0x0013, TryCatch #1 {, blocks: (B:4:0x0003, B:8:0x000d, B:12:0x0016, B:14:0x0021, B:15:0x0026, B:17:0x0037, B:19:0x003e, B:21:0x0044, B:23:0x0048, B:25:0x004e, B:34:0x0076, B:35:0x0078, B:37:0x007c, B:39:0x0080, B:41:0x0086, B:43:0x008a, B:47:0x009b, B:49:0x00a3, B:51:0x00a7, B:57:0x00bc, B:58:0x00c0, B:59:0x00c5, B:60:0x00c6, B:62:0x00d2, B:65:0x0146, B:66:0x014b, B:44:0x0092, B:45:0x0097, B:46:0x0098, B:67:0x014c, B:68:0x0151, B:32:0x0070, B:69:0x0152, B:70:0x0159, B:71:0x015a, B:72:0x0161, B:73:0x0162, B:74:0x0167, B:54:0x00b2, B:29:0x0063), top: B:80:0x0003, inners: #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x0098 A[Catch: all -> 0x0013, TryCatch #1 {, blocks: (B:4:0x0003, B:8:0x000d, B:12:0x0016, B:14:0x0021, B:15:0x0026, B:17:0x0037, B:19:0x003e, B:21:0x0044, B:23:0x0048, B:25:0x004e, B:34:0x0076, B:35:0x0078, B:37:0x007c, B:39:0x0080, B:41:0x0086, B:43:0x008a, B:47:0x009b, B:49:0x00a3, B:51:0x00a7, B:57:0x00bc, B:58:0x00c0, B:59:0x00c5, B:60:0x00c6, B:62:0x00d2, B:65:0x0146, B:66:0x014b, B:44:0x0092, B:45:0x0097, B:46:0x0098, B:67:0x014c, B:68:0x0151, B:32:0x0070, B:69:0x0152, B:70:0x0159, B:71:0x015a, B:72:0x0161, B:73:0x0162, B:74:0x0167, B:54:0x00b2, B:29:0x0063), top: B:80:0x0003, inners: #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00a3 A[Catch: all -> 0x0013, TryCatch #1 {, blocks: (B:4:0x0003, B:8:0x000d, B:12:0x0016, B:14:0x0021, B:15:0x0026, B:17:0x0037, B:19:0x003e, B:21:0x0044, B:23:0x0048, B:25:0x004e, B:34:0x0076, B:35:0x0078, B:37:0x007c, B:39:0x0080, B:41:0x0086, B:43:0x008a, B:47:0x009b, B:49:0x00a3, B:51:0x00a7, B:57:0x00bc, B:58:0x00c0, B:59:0x00c5, B:60:0x00c6, B:62:0x00d2, B:65:0x0146, B:66:0x014b, B:44:0x0092, B:45:0x0097, B:46:0x0098, B:67:0x014c, B:68:0x0151, B:32:0x0070, B:69:0x0152, B:70:0x0159, B:71:0x015a, B:72:0x0161, B:73:0x0162, B:74:0x0167, B:54:0x00b2, B:29:0x0063), top: B:80:0x0003, inners: #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00a7 A[Catch: all -> 0x0013, TRY_LEAVE, TryCatch #1 {, blocks: (B:4:0x0003, B:8:0x000d, B:12:0x0016, B:14:0x0021, B:15:0x0026, B:17:0x0037, B:19:0x003e, B:21:0x0044, B:23:0x0048, B:25:0x004e, B:34:0x0076, B:35:0x0078, B:37:0x007c, B:39:0x0080, B:41:0x0086, B:43:0x008a, B:47:0x009b, B:49:0x00a3, B:51:0x00a7, B:57:0x00bc, B:58:0x00c0, B:59:0x00c5, B:60:0x00c6, B:62:0x00d2, B:65:0x0146, B:66:0x014b, B:44:0x0092, B:45:0x0097, B:46:0x0098, B:67:0x014c, B:68:0x0151, B:32:0x0070, B:69:0x0152, B:70:0x0159, B:71:0x015a, B:72:0x0161, B:73:0x0162, B:74:0x0167, B:54:0x00b2, B:29:0x0063), top: B:80:0x0003, inners: #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x00c0 A[Catch: all -> 0x0013, TryCatch #1 {, blocks: (B:4:0x0003, B:8:0x000d, B:12:0x0016, B:14:0x0021, B:15:0x0026, B:17:0x0037, B:19:0x003e, B:21:0x0044, B:23:0x0048, B:25:0x004e, B:34:0x0076, B:35:0x0078, B:37:0x007c, B:39:0x0080, B:41:0x0086, B:43:0x008a, B:47:0x009b, B:49:0x00a3, B:51:0x00a7, B:57:0x00bc, B:58:0x00c0, B:59:0x00c5, B:60:0x00c6, B:62:0x00d2, B:65:0x0146, B:66:0x014b, B:44:0x0092, B:45:0x0097, B:46:0x0098, B:67:0x014c, B:68:0x0151, B:32:0x0070, B:69:0x0152, B:70:0x0159, B:71:0x015a, B:72:0x0161, B:73:0x0162, B:74:0x0167, B:54:0x00b2, B:29:0x0063), top: B:80:0x0003, inners: #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x00d2 A[Catch: all -> 0x0013, TRY_LEAVE, TryCatch #1 {, blocks: (B:4:0x0003, B:8:0x000d, B:12:0x0016, B:14:0x0021, B:15:0x0026, B:17:0x0037, B:19:0x003e, B:21:0x0044, B:23:0x0048, B:25:0x004e, B:34:0x0076, B:35:0x0078, B:37:0x007c, B:39:0x0080, B:41:0x0086, B:43:0x008a, B:47:0x009b, B:49:0x00a3, B:51:0x00a7, B:57:0x00bc, B:58:0x00c0, B:59:0x00c5, B:60:0x00c6, B:62:0x00d2, B:65:0x0146, B:66:0x014b, B:44:0x0092, B:45:0x0097, B:46:0x0098, B:67:0x014c, B:68:0x0151, B:32:0x0070, B:69:0x0152, B:70:0x0159, B:71:0x015a, B:72:0x0161, B:73:0x0162, B:74:0x0167, B:54:0x00b2, B:29:0x0063), top: B:80:0x0003, inners: #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x0146 A[Catch: all -> 0x0013, TRY_ENTER, TryCatch #1 {, blocks: (B:4:0x0003, B:8:0x000d, B:12:0x0016, B:14:0x0021, B:15:0x0026, B:17:0x0037, B:19:0x003e, B:21:0x0044, B:23:0x0048, B:25:0x004e, B:34:0x0076, B:35:0x0078, B:37:0x007c, B:39:0x0080, B:41:0x0086, B:43:0x008a, B:47:0x009b, B:49:0x00a3, B:51:0x00a7, B:57:0x00bc, B:58:0x00c0, B:59:0x00c5, B:60:0x00c6, B:62:0x00d2, B:65:0x0146, B:66:0x014b, B:44:0x0092, B:45:0x0097, B:46:0x0098, B:67:0x014c, B:68:0x0151, B:32:0x0070, B:69:0x0152, B:70:0x0159, B:71:0x015a, B:72:0x0161, B:73:0x0162, B:74:0x0167, B:54:0x00b2, B:29:0x0063), top: B:80:0x0003, inners: #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x014c A[Catch: all -> 0x0013, TryCatch #1 {, blocks: (B:4:0x0003, B:8:0x000d, B:12:0x0016, B:14:0x0021, B:15:0x0026, B:17:0x0037, B:19:0x003e, B:21:0x0044, B:23:0x0048, B:25:0x004e, B:34:0x0076, B:35:0x0078, B:37:0x007c, B:39:0x0080, B:41:0x0086, B:43:0x008a, B:47:0x009b, B:49:0x00a3, B:51:0x00a7, B:57:0x00bc, B:58:0x00c0, B:59:0x00c5, B:60:0x00c6, B:62:0x00d2, B:65:0x0146, B:66:0x014b, B:44:0x0092, B:45:0x0097, B:46:0x0098, B:67:0x014c, B:68:0x0151, B:32:0x0070, B:69:0x0152, B:70:0x0159, B:71:0x015a, B:72:0x0161, B:73:0x0162, B:74:0x0167, B:54:0x00b2, B:29:0x0063), top: B:80:0x0003, inners: #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x00b2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: j */
    public static final synchronized void m21775j(Context context) {
        boolean zM22852a;
        Context context2;
        C0926a c0926aM18906g;
        Context context3;
        Context context4;
        Application application;
        if (f61601q.get()) {
            return;
        }
        try {
            int i = FacebookActivity.f11350W;
            eda.m11070c(context);
        } catch (ClassNotFoundException unused) {
        }
        if (context.checkCallingOrSelfPermission("android.permission.INTERNET") == -1) {
            Log.w("eda", "No internet permissions granted for the app, please add <uses-permission android:name=\"android.permission.INTERNET\" /> to your AndroidManifest.xml.");
        }
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        f61594j = applicationContext;
        thb.m22056o(context);
        Context context5 = f61594j;
        if (context5 == null) {
            fa4.m11636J("applicationContext");
            throw null;
        }
        m21774i(context5);
        String str = f61588d;
        if (str == null || str.length() == 0) {
            throw new FacebookException("A valid Facebook app id must be set in the AndroidManifest.xml or set by calling FacebookSdk.setApplicationId before initializing the sdk.");
        }
        String str2 = f61592h;
        if (str2 == null || str2.length() == 0) {
            throw new FacebookException("A valid Facebook app client token must be set in the AndroidManifest.xml or set by calling FacebookSdk.setClientToken before initializing the sdk.");
        }
        int i2 = 1;
        f61601q.set(true);
        ema emaVar = ema.f37526a;
        int i3 = 0;
        if (!lp1.f49971a.contains(ema.class)) {
            try {
                ema.f37526a.m11260e();
                zM22852a = ema.f37529d.m22852a();
            } catch (Throwable th) {
                lp1.m16420a(ema.class, th);
                zM22852a = false;
            }
            if (zM22852a) {
                f61605u = true;
            }
            context2 = f61594j;
            if (context2 != null) {
                fa4.m11636J("applicationContext");
                throw null;
            }
            if (context2 instanceof Application) {
                x24.m24244m();
            } else {
                x24.m24244m();
            }
            c0926aM18906g = C0926a.f11409b.m18906g();
            if (c0926aM18906g != null) {
                context4 = f61594j;
                if (context4 != null) {
                    fa4.m11636J("applicationContext");
                    throw null;
                }
                application = (Application) context4;
                if (!lp1.f49971a.contains(c0926aM18906g)) {
                    application.registerActivityLifecycleCallbacks(new C3748x6(i2));
                }
            }
            y23.m24856d();
            s76.m21142l();
            ce0 ce0Var = ce0.f9960c;
            context3 = f61594j;
            if (context3 != null) {
                fa4.m11636J("applicationContext");
                throw null;
            }
            x74.m24364u(context3);
            ry2 ry2Var = new ry2(i3);
            bl2 bl2Var = new bl2();
            bl2Var.f8656b = new CountDownLatch(1);
            m21768c().execute(new FutureTask(new og1(i2, bl2Var, ry2Var)));
            p13.m18851a(new ho2(9), FeatureManager$Feature.Instrument);
            p13.m18851a(new ho2(10), FeatureManager$Feature.AppEvents);
            p13.m18851a(new ho2(11), FeatureManager$Feature.ChromeCustomTabsPrefetching);
            p13.m18851a(new ho2(12), FeatureManager$Feature.IgnoreAppSwitchToLoggedOut);
            p13.m18851a(new ho2(13), FeatureManager$Feature.BypassAppSwitch);
            m21768c().execute(new FutureTask(new ry2(i2)));
            return;
        }
        zM22852a = false;
        if (zM22852a) {
            f61605u = true;
        }
        context2 = f61594j;
        if (context2 != null) {
            fa4.m11636J("applicationContext");
            throw null;
        }
        if ((context2 instanceof Application) || !ema.m11256c()) {
            x24.m24244m();
        } else {
            Context context6 = f61594j;
            if (context6 == null) {
                fa4.m11636J("applicationContext");
                throw null;
            }
            AbstractC3785y6.m24950c((Application) context6, f61588d);
        }
        c0926aM18906g = C0926a.f11409b.m18906g();
        if (c0926aM18906g != null) {
            context4 = f61594j;
            if (context4 != null) {
                fa4.m11636J("applicationContext");
                throw null;
            }
            application = (Application) context4;
            if (!lp1.f49971a.contains(c0926aM18906g)) {
                try {
                    application.registerActivityLifecycleCallbacks(new C3748x6(i2));
                } catch (Throwable th2) {
                    lp1.m16420a(c0926aM18906g, th2);
                }
            }
        }
        y23.m24856d();
        s76.m21142l();
        ce0 ce0Var2 = ce0.f9960c;
        context3 = f61594j;
        if (context3 != null) {
            fa4.m11636J("applicationContext");
            throw null;
        }
        x74.m24364u(context3);
        ry2 ry2Var2 = new ry2(i3);
        bl2 bl2Var2 = new bl2();
        bl2Var2.f8656b = new CountDownLatch(1);
        m21768c().execute(new FutureTask(new og1(i2, bl2Var2, ry2Var2)));
        p13.m18851a(new ho2(9), FeatureManager$Feature.Instrument);
        p13.m18851a(new ho2(10), FeatureManager$Feature.AppEvents);
        p13.m18851a(new ho2(11), FeatureManager$Feature.ChromeCustomTabsPrefetching);
        p13.m18851a(new ho2(12), FeatureManager$Feature.IgnoreAppSwitchToLoggedOut);
        p13.m18851a(new ho2(13), FeatureManager$Feature.BypassAppSwitch);
        m21768c().execute(new FutureTask(new ry2(i2)));
        return;
        throw th;
    }
}
