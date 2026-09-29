package ng;

import ag.C0075b;
import ag.C0076c;
import android.annotation.SuppressLint;
import android.content.Context;
import android.os.SystemClock;
import com.kochava.tracker.BuildConfig;
import com.kochava.tracker.log.LogLevel;
import eg.C5403a;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.ArrayBlockingQueue;
import mg.C7557a;
import p003a2.C0009a;
import p006a5.C0020c;
import p202jh.C6478a;
import p243lg.C7360b;
import p341qg.C8618d;
import p341qg.C8620f;
import p341qg.C8624j;
import p535zg.C10489a;

/* JADX INFO: renamed from: ng.b */
/* JADX INFO: loaded from: classes.dex */
public final class C7773b {

    /* JADX INFO: renamed from: i */
    public static final C0076c f42700i;

    /* JADX INFO: renamed from: j */
    public static final Object f42701j;

    /* JADX INFO: renamed from: k */
    public static C7773b f42702k;

    /* JADX INFO: renamed from: a */
    public final C0020c f42703a = new C0020c();

    /* JADX INFO: renamed from: b */
    public final C7360b f42704b;

    /* JADX INFO: renamed from: c */
    public final C8624j f42705c;

    /* JADX INFO: renamed from: d */
    public final ArrayBlockingQueue f42706d;

    /* JADX INFO: renamed from: e */
    public final ArrayBlockingQueue f42707e;

    /* JADX INFO: renamed from: f */
    public final ArrayBlockingQueue f42708f;

    /* JADX INFO: renamed from: g */
    public Boolean f42709g;

    /* JADX INFO: renamed from: h */
    public C8618d f42710h;

    /* JADX INFO: renamed from: ng.b$a */
    public static class a {
    }

    static {
        C0075b c0075bM19476b = C10489a.m19476b();
        f42700i = C0009a.m17e(c0075bM19476b, c0075bM19476b, BuildConfig.SDK_MODULE_NAME, BuildConfig.SDK_MODULE_NAME);
        f42701j = new Object();
        f42702k = null;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public C7773b() {
        if (C6478a.f37051b == null) {
            synchronized (C6478a.f37050a) {
                if (C6478a.f37051b == null) {
                    C6478a.f37051b = new C7360b();
                }
            }
        }
        C7360b c7360b = C6478a.f37051b;
        this.f42704b = c7360b;
        this.f42705c = new C8624j(c7360b);
        this.f42706d = new ArrayBlockingQueue(100);
        this.f42707e = new ArrayBlockingQueue(100);
        this.f42708f = new ArrayBlockingQueue(100);
        this.f42709g = null;
        this.f42710h = null;
    }

    @SuppressLint({"ObsoleteSdkInt"})
    /* JADX INFO: renamed from: a */
    public final void m15479a(Context context, String str) {
        boolean z10;
        String str2;
        String str3;
        if (context == null || context.getApplicationContext() == null) {
            f42700i.m458b("start failed, invalid context");
            return;
        }
        if (C5403a.f33819b == null) {
            synchronized (C5403a.f33818a) {
                if (C5403a.f33819b == null) {
                    C5403a.f33819b = new C5403a();
                }
            }
        }
        C5403a c5403a = C5403a.f33819b;
        Context applicationContext = context.getApplicationContext();
        synchronized (c5403a) {
            String packageName = applicationContext.getPackageName();
            String strM15077a = C7557a.m15077a(applicationContext);
            z10 = strM15077a.equals(packageName) || strM15077a.equals(null);
        }
        if (!z10) {
            f42700i.m460d("start failed, not running in the primary process");
            return;
        }
        if (this.f42710h != null) {
            f42700i.m460d("start failed, already started");
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        SystemClock.elapsedRealtime();
        Context applicationContext2 = context.getApplicationContext();
        C0020c c0020c = this.f42703a;
        synchronized (c0020c) {
            if (((String) c0020c.f13a) == null || ((String) c0020c.f14b) == null) {
                str2 = "AndroidTracker 4.3.0";
            } else {
                str2 = "AndroidTracker 4.3.0 (" + ((String) c0020c.f13a) + " " + ((String) c0020c.f14b) + ")";
            }
        }
        C0020c c0020c2 = this.f42703a;
        synchronized (c0020c2) {
            Date date = new Date(BuildConfig.SDK_BUILD_TIME_MILLIS);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            str3 = simpleDateFormat.format(date);
            if (((String) c0020c2.f15c) != null) {
                str3 = str3 + " (" + ((String) c0020c2.f15c) + ")";
            }
        }
        if (this.f42709g == null) {
            this.f42709g = Boolean.valueOf(applicationContext2.getPackageManager().isInstantApp());
        }
        String str4 = this.f42709g.booleanValue() ? "android-instantapp" : "android";
        String strSubstring = UUID.randomUUID().toString().substring(0, 5);
        C7360b c7360b = this.f42704b;
        boolean zBooleanValue = this.f42709g.booleanValue();
        C8620f c8620f = new C8620f(jCurrentTimeMillis, applicationContext2, str, c7360b, str2, strSubstring, zBooleanValue, str4, this.f42705c, this.f42703a.m64a());
        C0076c c0076c = f42700i;
        C10489a.m19477c(c0076c, "Started SDK " + str2 + " published " + str3);
        StringBuilder sb2 = new StringBuilder("The log level is set to ");
        sb2.append(LogLevel.fromLevel(C10489a.m19476b().f200b));
        C10489a.m19477c(c0076c, sb2.toString());
        StringBuilder sb3 = new StringBuilder("The kochava app GUID provided was ");
        sb3.append((c8620f.m16845a() && zBooleanValue) ? null : str);
        C10489a.m19475a(c0076c, sb3.toString());
        c0076c.m459c(BuildConfig.SDK_VERSION_DECLARATION);
        try {
            C8618d c8618d = new C8618d(c8620f);
            this.f42710h = c8618d;
            c8618d.m16843t();
        } catch (Throwable th2) {
            C0076c c0076c2 = f42700i;
            c0076c2.m458b("start failed, unknown error occurred");
            c0076c2.m458b(th2);
        }
        C8618d c8618d2 = this.f42710h;
        if (c8618d2 == null) {
            f42700i.m459c("Cannot flush queue, SDK not started");
        } else {
            ((C7360b) c8618d2.f46126x.f46132f).m14769f(new RunnableC7772a(this, c8618d2));
        }
    }
}
