package p476x7;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.util.Log;
import com.facebook.LoggingBehavior;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.FetchedAppSettingsManager;
import dm.C5207g;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Timer;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import p029b8.C1338d;
import p067d8.C5074n;
import p067d8.C5078r;
import p067d8.C5086z;
import p173i8.C6205a;
import p291o7.C7993c0;
import p291o7.C8002l;
import p291o7.C8004n;
import p317p7.C8199f;
import p317p7.C8201h;
import p317p7.RunnableC8197d;
import p333q7.C8500b;
import p333q7.C8502d;
import p333q7.RunnableC8499a;
import p333q7.ViewTreeObserverOnGlobalFocusChangeListenerC8503e;
import p382s7.C8969b;
import p382s7.C8970c;
import p382s7.C8971d;
import p382s7.C8974g;
import p382s7.C8975h;
import p431v7.C9665i;
import sl.C9072e;

/* JADX INFO: renamed from: x7.d */
/* JADX INFO: loaded from: classes.dex */
public final class C10105d {

    /* JADX INFO: renamed from: a */
    public static final C10105d f51249a = new C10105d();

    /* JADX INFO: renamed from: b */
    public static final String f51250b;

    /* JADX INFO: renamed from: c */
    public static final ScheduledExecutorService f51251c;

    /* JADX INFO: renamed from: d */
    public static volatile ScheduledFuture<?> f51252d;

    /* JADX INFO: renamed from: e */
    public static final Object f51253e;

    /* JADX INFO: renamed from: f */
    public static final AtomicInteger f51254f;

    /* JADX INFO: renamed from: g */
    public static volatile C10111j f51255g;

    /* JADX INFO: renamed from: h */
    public static final AtomicBoolean f51256h;

    /* JADX INFO: renamed from: i */
    public static String f51257i;

    /* JADX INFO: renamed from: j */
    public static long f51258j;

    /* JADX INFO: renamed from: k */
    public static int f51259k;

    /* JADX INFO: renamed from: l */
    public static WeakReference<Activity> f51260l;

    /* JADX INFO: renamed from: x7.d$a */
    public static final class a implements Application.ActivityLifecycleCallbacks {
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
            C5207g.m11111f(activity, "activity");
            C5078r.f32986e.m10780b(LoggingBehavior.APP_EVENTS, C10105d.f51250b, "onActivityCreated");
            int i10 = C10106e.f51261a;
            C10105d.f51251c.execute(new RunnableC8499a(2));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
            C5207g.m11111f(activity, "activity");
            C5078r.f32986e.m10780b(LoggingBehavior.APP_EVENTS, C10105d.f51250b, "onActivityDestroyed");
            C10105d.f51249a.getClass();
            C8970c c8970c = C8970c.f46998a;
            if (C6205a.m12742b(C8970c.class)) {
                return;
            }
            try {
                C8971d c8971dM17205a = C8971d.f47006f.m17205a();
                if (C6205a.m12742b(c8971dM17205a)) {
                    return;
                }
                try {
                    c8971dM17205a.f47012e.remove(Integer.valueOf(activity.hashCode()));
                } catch (Throwable th2) {
                    C6205a.m12741a(c8971dM17205a, th2);
                }
            } catch (Throwable th3) {
                C6205a.m12741a(C8970c.class, th3);
            }
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
            ScheduledFuture<?> scheduledFuture;
            C5207g.m11111f(activity, "activity");
            C5078r.a aVar = C5078r.f32986e;
            LoggingBehavior loggingBehavior = LoggingBehavior.APP_EVENTS;
            String str = C10105d.f51250b;
            aVar.m10780b(loggingBehavior, str, "onActivityPaused");
            int i10 = C10106e.f51261a;
            C10105d.f51249a.getClass();
            AtomicInteger atomicInteger = C10105d.f51254f;
            if (atomicInteger.decrementAndGet() < 0) {
                atomicInteger.set(0);
                Log.w(str, "Unexpected activity pause without a matching activity resume. Logging data may be incorrect. Make sure you call activateApp from your Application's onCreate method");
            }
            synchronized (C10105d.f51253e) {
                if (C10105d.f51252d != null && (scheduledFuture = C10105d.f51252d) != null) {
                    scheduledFuture.cancel(false);
                }
                C10105d.f51252d = null;
                C9072e c9072e = C9072e.f47360a;
            }
            final long jCurrentTimeMillis = System.currentTimeMillis();
            final String strM10827l = C5086z.m10827l(activity);
            C8970c c8970c = C8970c.f46998a;
            if (!C6205a.m12742b(C8970c.class)) {
                try {
                    if (C8970c.f47003f.get()) {
                        C8971d.f47006f.m17205a().m17203c(activity);
                        C8974g c8974g = C8970c.f47001d;
                        if (c8974g != null && !C6205a.m12742b(c8974g)) {
                            try {
                                if (c8974g.f47027b.get() != null) {
                                    try {
                                        Timer timer = c8974g.f47028c;
                                        if (timer != null) {
                                            timer.cancel();
                                        }
                                        c8974g.f47028c = null;
                                    } catch (Exception e10) {
                                        Log.e(C8974g.f47025e, "Error unscheduling indexing job", e10);
                                    }
                                }
                            } catch (Throwable th2) {
                                C6205a.m12741a(c8974g, th2);
                            }
                        }
                        SensorManager sensorManager = C8970c.f47000c;
                        if (sensorManager != null) {
                            sensorManager.unregisterListener(C8970c.f46999b);
                        }
                    }
                } catch (Throwable th3) {
                    C6205a.m12741a(C8970c.class, th3);
                }
            }
            C10105d.f51251c.execute(new Runnable() { // from class: x7.a
                /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                @Override // java.lang.Runnable
                public final void run() {
                    long j10 = jCurrentTimeMillis;
                    String str2 = strM10827l;
                    C5207g.m11111f(str2, "$activityName");
                    if (C10105d.f51255g == null) {
                        C10105d.f51255g = new C10111j(Long.valueOf(j10), null);
                    }
                    C10111j c10111j = C10105d.f51255g;
                    if (c10111j != null) {
                        c10111j.f51279b = Long.valueOf(j10);
                    }
                    if (C10105d.f51254f.get() <= 0) {
                        RunnableC10104c runnableC10104c = new RunnableC10104c(str2, j10);
                        synchronized (C10105d.f51253e) {
                            try {
                                ScheduledExecutorService scheduledExecutorService = C10105d.f51251c;
                                C10105d.f51249a.getClass();
                                FetchedAppSettingsManager fetchedAppSettingsManager = FetchedAppSettingsManager.f11550a;
                                C5074n c5074nM6670b = FetchedAppSettingsManager.m6670b(C8004n.m15872b());
                                C10105d.f51252d = scheduledExecutorService.schedule(runnableC10104c, c5074nM6670b == null ? 60 : c5074nM6670b.f32970d, TimeUnit.SECONDS);
                                C9072e c9072e2 = C9072e.f47360a;
                            } catch (Throwable th4) {
                                throw th4;
                            }
                        }
                    }
                    long j11 = C10105d.f51258j;
                    long j12 = j11 > 0 ? (j10 - j11) / ((long) 1000) : 0L;
                    C10107f c10107f = C10107f.f51262a;
                    Context contextM15871a = C8004n.m15871a();
                    C5074n c5074nM6673f = FetchedAppSettingsManager.m6673f(C8004n.m15872b(), false);
                    if (c5074nM6673f != null && c5074nM6673f.f32973g && j12 > 0) {
                        C8201h c8201h = new C8201h(contextM15871a, (String) null);
                        Bundle bundle = new Bundle(1);
                        bundle.putCharSequence("fb_aa_time_spent_view_name", str2);
                        double d10 = j12;
                        if (C7993c0.m15849b() && !C6205a.m12742b(c8201h)) {
                            try {
                                c8201h.m16333e("fb_aa_time_spent_on_view", Double.valueOf(d10), bundle, false, C10105d.m18960a());
                            } catch (Throwable th5) {
                                C6205a.m12741a(c8201h, th5);
                            }
                        }
                    }
                    C10111j c10111j2 = C10105d.f51255g;
                    if (c10111j2 == null) {
                        return;
                    }
                    c10111j2.m18969a();
                }
            });
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
            int i10;
            Boolean boolValueOf;
            ScheduledFuture<?> scheduledFuture;
            C5207g.m11111f(activity, "activity");
            C5078r.f32986e.m10780b(LoggingBehavior.APP_EVENTS, C10105d.f51250b, "onActivityResumed");
            int i11 = C10106e.f51261a;
            C10105d.f51260l = new WeakReference<>(activity);
            C10105d.f51254f.incrementAndGet();
            C10105d.f51249a.getClass();
            synchronized (C10105d.f51253e) {
                try {
                    i10 = 0;
                    if (C10105d.f51252d != null && (scheduledFuture = C10105d.f51252d) != null) {
                        scheduledFuture.cancel(false);
                    }
                    boolValueOf = null;
                    C10105d.f51252d = null;
                    C9072e c9072e = C9072e.f47360a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            final long jCurrentTimeMillis = System.currentTimeMillis();
            C10105d.f51258j = jCurrentTimeMillis;
            final String strM10827l = C5086z.m10827l(activity);
            C8975h c8975h = C8970c.f46999b;
            if (!C6205a.m12742b(C8970c.class)) {
                try {
                    if (C8970c.f47003f.get()) {
                        C8971d.f47006f.m17205a().m17201a(activity);
                        Context applicationContext = activity.getApplicationContext();
                        String strM15872b = C8004n.m15872b();
                        C5074n c5074nM6670b = FetchedAppSettingsManager.m6670b(strM15872b);
                        if (c5074nM6670b != null) {
                            boolValueOf = Boolean.valueOf(c5074nM6670b.f32976j);
                        }
                        boolean zM11106a = C5207g.m11106a(boolValueOf, Boolean.TRUE);
                        C8970c c8970c = C8970c.f46998a;
                        if (zM11106a) {
                            SensorManager sensorManager = (SensorManager) applicationContext.getSystemService("sensor");
                            if (sensorManager != null) {
                                C8970c.f47000c = sensorManager;
                                Sensor defaultSensor = sensorManager.getDefaultSensor(1);
                                C8974g c8974g = new C8974g(activity);
                                C8970c.f47001d = c8974g;
                                C8969b c8969b = new C8969b(c5074nM6670b, i10, strM15872b);
                                c8975h.getClass();
                                if (!C6205a.m12742b(c8975h)) {
                                    try {
                                        c8975h.f47032a = c8969b;
                                    } catch (Throwable th3) {
                                        C6205a.m12741a(c8975h, th3);
                                    }
                                }
                                sensorManager.registerListener(c8975h, defaultSensor, 2);
                                if (c5074nM6670b != null && c5074nM6670b.f32976j) {
                                    c8974g.m17215c();
                                }
                            }
                        } else {
                            c8970c.getClass();
                            C6205a.m12742b(c8970c);
                        }
                        c8970c.getClass();
                        C6205a.m12742b(c8970c);
                    }
                } catch (Throwable th4) {
                    C6205a.m12741a(C8970c.class, th4);
                }
            }
            C8500b c8500b = C8500b.f45741a;
            if (!C6205a.m12742b(C8500b.class)) {
                try {
                    if (C8500b.f45743c) {
                        CopyOnWriteArraySet copyOnWriteArraySet = C8502d.f45745d;
                        if (!new HashSet(C8502d.m16602a()).isEmpty()) {
                            HashMap map = ViewTreeObserverOnGlobalFocusChangeListenerC8503e.f45749e;
                            ViewTreeObserverOnGlobalFocusChangeListenerC8503e.a.m16608b(activity);
                        }
                    }
                } catch (Exception unused) {
                } catch (Throwable th5) {
                    C6205a.m12741a(C8500b.class, th5);
                }
            }
            C1338d.m4915d(activity);
            C9665i.m18149a();
            final Context applicationContext2 = activity.getApplicationContext();
            C10105d.f51251c.execute(new Runnable() { // from class: x7.b
                @Override // java.lang.Runnable
                public final void run() {
                    C10111j c10111j;
                    long j10 = jCurrentTimeMillis;
                    String str = strM10827l;
                    Context context = applicationContext2;
                    C5207g.m11111f(str, "$activityName");
                    C10111j c10111j2 = C10105d.f51255g;
                    Long l10 = c10111j2 == null ? null : c10111j2.f51279b;
                    if (C10105d.f51255g == null) {
                        C10105d.f51255g = new C10111j(Long.valueOf(j10), null);
                        C10112k c10112k = C10112k.f51284a;
                        String str2 = C10105d.f51257i;
                        C5207g.m11110e(context, "appContext");
                        C10112k.m18970b(str, str2, context);
                    } else if (l10 != null) {
                        long jLongValue = j10 - l10.longValue();
                        C10105d.f51249a.getClass();
                        FetchedAppSettingsManager fetchedAppSettingsManager = FetchedAppSettingsManager.f11550a;
                        C5074n c5074nM6670b2 = FetchedAppSettingsManager.m6670b(C8004n.m15872b());
                        if (jLongValue > (c5074nM6670b2 == null ? 60 : c5074nM6670b2.f32970d) * 1000) {
                            C10112k c10112k2 = C10112k.f51284a;
                            C10112k.m18971c(str, C10105d.f51255g, C10105d.f51257i);
                            String str3 = C10105d.f51257i;
                            C5207g.m11110e(context, "appContext");
                            C10112k.m18970b(str, str3, context);
                            C10105d.f51255g = new C10111j(Long.valueOf(j10), null);
                        } else if (jLongValue > 1000 && (c10111j = C10105d.f51255g) != null) {
                            c10111j.f51281d++;
                        }
                    }
                    C10111j c10111j3 = C10105d.f51255g;
                    if (c10111j3 != null) {
                        c10111j3.f51279b = Long.valueOf(j10);
                    }
                    C10111j c10111j4 = C10105d.f51255g;
                    if (c10111j4 == null) {
                        return;
                    }
                    c10111j4.m18969a();
                }
            });
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            C5207g.m11111f(activity, "activity");
            C5207g.m11111f(bundle, "outState");
            C5078r.f32986e.m10780b(LoggingBehavior.APP_EVENTS, C10105d.f51250b, "onActivitySaveInstanceState");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
            C5207g.m11111f(activity, "activity");
            C10105d.f51259k++;
            C5078r.f32986e.m10780b(LoggingBehavior.APP_EVENTS, C10105d.f51250b, "onActivityStarted");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
            C5207g.m11111f(activity, "activity");
            C5078r.f32986e.m10780b(LoggingBehavior.APP_EVENTS, C10105d.f51250b, "onActivityStopped");
            String str = C8201h.f44393c;
            String str2 = C8199f.f44386a;
            if (!C6205a.m12742b(C8199f.class)) {
                try {
                    C8199f.f44389d.execute(new RunnableC8197d(1));
                } catch (Throwable th2) {
                    C6205a.m12741a(C8199f.class, th2);
                }
            }
            C10105d.f51259k--;
        }
    }

    static {
        String canonicalName = C10105d.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "com.facebook.appevents.internal.ActivityLifecycleTracker";
        }
        f51250b = canonicalName;
        f51251c = Executors.newSingleThreadScheduledExecutor();
        f51253e = new Object();
        f51254f = new AtomicInteger(0);
        f51256h = new AtomicBoolean(false);
    }

    /* JADX INFO: renamed from: a */
    public static final UUID m18960a() {
        UUID uuid = null;
        if (f51255g != null) {
            C10111j c10111j = f51255g;
            uuid = c10111j != null ? c10111j.f51280c : null;
        }
        return uuid;
    }

    /* JADX INFO: renamed from: b */
    public static final void m18961b(Application application, String str) {
        if (f51256h.compareAndSet(false, true)) {
            FeatureManager featureManager = FeatureManager.f11546a;
            FeatureManager.m6664a(new C8002l(4), FeatureManager.Feature.CodelessEvents);
            f51257i = str;
            application.registerActivityLifecycleCallbacks(new a());
        }
    }
}
