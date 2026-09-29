package p000;

import android.app.Application;
import com.facebook.internal.FeatureManager$Feature;
import java.lang.ref.WeakReference;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: y6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3785y6 {

    /* JADX INFO: renamed from: a */
    public static final String f69338a;

    /* JADX INFO: renamed from: b */
    public static final ScheduledExecutorService f69339b;

    /* JADX INFO: renamed from: c */
    public static final ScheduledExecutorService f69340c;

    /* JADX INFO: renamed from: d */
    public static volatile ScheduledFuture f69341d;

    /* JADX INFO: renamed from: e */
    public static final Object f69342e;

    /* JADX INFO: renamed from: f */
    public static final AtomicInteger f69343f;

    /* JADX INFO: renamed from: g */
    public static volatile C3488q8 f69344g;

    /* JADX INFO: renamed from: h */
    public static final AtomicBoolean f69345h;

    /* JADX INFO: renamed from: i */
    public static String f69346i;

    /* JADX INFO: renamed from: j */
    public static long f69347j;

    /* JADX INFO: renamed from: k */
    public static int f69348k;

    /* JADX INFO: renamed from: l */
    public static WeakReference f69349l;

    /* JADX INFO: renamed from: m */
    public static String f69350m;

    static {
        String canonicalName = AbstractC3785y6.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "com.facebook.appevents.internal.ActivityLifecycleTracker";
        }
        f69338a = canonicalName;
        f69339b = Executors.newSingleThreadScheduledExecutor();
        f69340c = Executors.newSingleThreadScheduledExecutor();
        f69342e = new Object();
        f69343f = new AtomicInteger(0);
        f69345h = new AtomicBoolean(false);
    }

    /* JADX INFO: renamed from: a */
    public static void m24948a() {
        ScheduledFuture scheduledFuture;
        synchronized (f69342e) {
            try {
                if (f69341d != null && (scheduledFuture = f69341d) != null) {
                    scheduledFuture.cancel(false);
                }
                f69341d = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static final UUID m24949b() {
        C3488q8 c3488q8;
        if (f69344g == null || (c3488q8 = f69344g) == null) {
            return null;
        }
        return (UUID) c3488q8.f57371e;
    }

    /* JADX INFO: renamed from: c */
    public static final void m24950c(Application application, String str) {
        application.getClass();
        int i = 0;
        if (f69345h.compareAndSet(false, true)) {
            p13.m18851a(new gm5(5), FeatureManager$Feature.CodelessEvents);
            f69346i = str;
            application.registerActivityLifecycleCallbacks(new C3748x6(i));
        }
    }
}
