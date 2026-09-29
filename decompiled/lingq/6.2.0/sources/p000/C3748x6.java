package p000;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.util.Log;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.facebook.LoggingBehavior;
import com.facebook.appevents.internal.C0926a;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: x6 */
/* JADX INFO: loaded from: classes.dex */
public final class C3748x6 implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f67807a;

    public /* synthetic */ C3748x6(int i) {
        this.f67807a = i;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        int i = this.f67807a;
        activity.getClass();
        switch (i) {
            case 0:
                iy5 iy5Var = qj5.f57852d;
                iy5.m14197m(LoggingBehavior.APP_EVENTS, AbstractC3785y6.f69338a, "onActivityCreated");
                AbstractC3785y6.f69339b.execute(new RunnableC3637u6(1));
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        int i = this.f67807a;
        activity.getClass();
        switch (i) {
            case 0:
                iy5 iy5Var = qj5.f57852d;
                iy5.m14197m(LoggingBehavior.APP_EVENTS, AbstractC3785y6.f69338a, "onActivityDestroyed");
                t41 t41Var = t41.f61839a;
                Set set = lp1.f49971a;
                if (!set.contains(t41.class)) {
                    try {
                        w41 w41VarM12855c = w41.f66359f.m12855c();
                        if (!set.contains(w41VarM12855c)) {
                            try {
                                ((HashMap) w41VarM12855c.f66369e).remove(Integer.valueOf(activity.hashCode()));
                            } catch (Throwable th) {
                                lp1.m16420a(w41VarM12855c, th);
                            }
                        }
                    } catch (Throwable th2) {
                        lp1.m16420a(t41.class, th2);
                        return;
                    }
                    break;
                }
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        int i = this.f67807a;
        activity.getClass();
        switch (i) {
            case 0:
                iy5 iy5Var = qj5.f57852d;
                LoggingBehavior loggingBehavior = LoggingBehavior.APP_EVENTS;
                String str = AbstractC3785y6.f69338a;
                iy5.m14197m(loggingBehavior, str, "onActivityPaused");
                AtomicInteger atomicInteger = AbstractC3785y6.f69343f;
                int i2 = 0;
                if (atomicInteger.decrementAndGet() < 0) {
                    atomicInteger.set(0);
                    Log.w(str, "Unexpected activity pause without a matching activity resume. Logging data may be incorrect. Make sure you call activateApp from your Application's onCreate method");
                }
                AbstractC3785y6.m24948a();
                long jCurrentTimeMillis = System.currentTimeMillis();
                String strM3927P = bna.m3927P(activity);
                t41 t41Var = t41.f61839a;
                if (!lp1.f49971a.contains(t41.class)) {
                    try {
                        if (t41.f61844f.get()) {
                            w41.f66359f.m12855c().m23710D(activity);
                            ota otaVar = t41.f61842d;
                            if (otaVar != null) {
                                otaVar.m18511d();
                            }
                            SensorManager sensorManager = t41.f61841c;
                            if (sensorManager != null) {
                                sensorManager.unregisterListener(t41.f61840b);
                            }
                            break;
                        }
                    } catch (Throwable th) {
                        lp1.m16420a(t41.class, th);
                    }
                }
                AbstractC3785y6.f69339b.execute(new RunnableC3711w6(strM3927P, i2, jCurrentTimeMillis));
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        int i = this.f67807a;
        activity.getClass();
        switch (i) {
            case 0:
                iy5 iy5Var = qj5.f57852d;
                iy5.m14197m(LoggingBehavior.APP_EVENTS, AbstractC3785y6.f69338a, "onActivityResumed");
                AbstractC3785y6.f69349l = new WeakReference(activity);
                AbstractC3785y6.f69343f.incrementAndGet();
                AbstractC3785y6.m24948a();
                final long jCurrentTimeMillis = System.currentTimeMillis();
                AbstractC3785y6.f69347j = jCurrentTimeMillis;
                final String strM3927P = bna.m3927P(activity);
                pta ptaVar = t41.f61840b;
                t41 t41Var = t41.f61839a;
                Set set = lp1.f49971a;
                int i2 = 0;
                if (!set.contains(t41.class)) {
                    try {
                        if (t41.f61844f.get()) {
                            w41.f66359f.m12855c().m23722i(activity);
                            Context applicationContext = activity.getApplicationContext();
                            String strM21767b = sy2.m21767b();
                            w23 w23VarM24854b = y23.m24854b(strM21767b);
                            if (w23VarM24854b == null || !w23VarM24854b.f66258g) {
                                set.contains(t41Var);
                            } else {
                                SensorManager sensorManager = (SensorManager) applicationContext.getSystemService("sensor");
                                if (sensorManager != null) {
                                    t41.f61841c = sensorManager;
                                    Sensor defaultSensor = sensorManager.getDefaultSensor(1);
                                    ota otaVar = new ota(activity);
                                    t41.f61842d = otaVar;
                                    r41 r41Var = new r41(i2, w23VarM24854b, strM21767b);
                                    if (!set.contains(ptaVar)) {
                                        try {
                                            ptaVar.f56787a = r41Var;
                                        } catch (Throwable th) {
                                            lp1.m16420a(ptaVar, th);
                                        }
                                    }
                                    sensorManager.registerListener(ptaVar, defaultSensor, 2);
                                    if (w23VarM24854b.f66258g) {
                                        otaVar.m18510c();
                                    }
                                    break;
                                }
                            }
                            lp1.f49971a.contains(t41Var);
                            break;
                        }
                    } catch (Throwable th2) {
                        lp1.m16420a(t41.class, th2);
                    }
                }
                iy5 iy5Var2 = iy5.f44766b;
                if (!lp1.f49971a.contains(iy5.class)) {
                    try {
                        if (iy5.f44767c) {
                            CopyOnWriteArraySet copyOnWriteArraySet = py5.f56994d;
                            if (!new HashSet(py5.m19568a()).isEmpty()) {
                                HashMap map = qy5.f58386e;
                                wkd.m24041c(activity);
                                break;
                            }
                        }
                    } catch (Exception unused) {
                    } catch (Throwable th3) {
                        lp1.m16420a(iy5.class, th3);
                    }
                }
                jn9.m14558d(activity);
                String str = AbstractC3785y6.f69350m;
                if (str != null && vk9.m23380c0(str, "ProxyBillingActivity", false) && !strM3927P.equals("ProxyBillingActivity")) {
                    AbstractC3785y6.f69340c.execute(new RunnableC3637u6(i2));
                }
                final Context applicationContext2 = activity.getApplicationContext();
                AbstractC3785y6.f69339b.execute(new Runnable() { // from class: v6
                    @Override // java.lang.Runnable
                    public final void run() {
                        C3488q8 c3488q8;
                        long j = jCurrentTimeMillis;
                        String str2 = strM3927P;
                        Context context = applicationContext2;
                        C3488q8 c3488q9 = AbstractC3785y6.f69344g;
                        Long l = c3488q9 != null ? (Long) c3488q9.f57370d : null;
                        if (AbstractC3785y6.f69344g == null) {
                            AbstractC3785y6.f69344g = new C3488q8(Long.valueOf(j), (Long) null);
                            String str3 = AbstractC3785y6.f69346i;
                            context.getClass();
                            gz8.m12978k(context, str2, str3);
                        } else if (l != null) {
                            long jLongValue = j - l.longValue();
                            String str4 = AbstractC3785y6.f69338a;
                            w23 w23VarM24854b2 = y23.m24854b(sy2.m21767b());
                            if (jLongValue > (w23VarM24854b2 == null ? 60 : w23VarM24854b2.f66253b) * DescriptorProtos.Edition.EDITION_2023_VALUE) {
                                gz8.m12979n(str2, AbstractC3785y6.f69344g, AbstractC3785y6.f69346i);
                                String str5 = AbstractC3785y6.f69346i;
                                context.getClass();
                                gz8.m12978k(context, str2, str5);
                                AbstractC3785y6.f69344g = new C3488q8(Long.valueOf(j), (Long) null);
                            } else if (jLongValue > 1000 && (c3488q8 = AbstractC3785y6.f69344g) != null) {
                                c3488q8.f57368b++;
                            }
                        }
                        C3488q8 c3488q10 = AbstractC3785y6.f69344g;
                        if (c3488q10 != null) {
                            c3488q10.f57370d = Long.valueOf(j);
                        }
                        C3488q8 c3488q11 = AbstractC3785y6.f69344g;
                        if (c3488q11 != null) {
                            c3488q11.m19732R();
                        }
                    }
                });
                AbstractC3785y6.f69350m = strM3927P;
                break;
            default:
                C0926a c0926aM18906g = C0926a.f11409b.m18906g();
                if (c0926aM18906g != null) {
                    c0926aM18906g.m5195b(activity);
                }
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        int i = this.f67807a;
        activity.getClass();
        bundle.getClass();
        switch (i) {
            case 0:
                iy5 iy5Var = qj5.f57852d;
                iy5.m14197m(LoggingBehavior.APP_EVENTS, AbstractC3785y6.f69338a, "onActivitySaveInstanceState");
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        int i = this.f67807a;
        activity.getClass();
        switch (i) {
            case 0:
                AbstractC3785y6.f69348k++;
                iy5 iy5Var = qj5.f57852d;
                iy5.m14197m(LoggingBehavior.APP_EVENTS, AbstractC3785y6.f69338a, "onActivityStarted");
                break;
            default:
                C0926a c0926aM18906g = C0926a.f11409b.m18906g();
                if (c0926aM18906g != null) {
                    c0926aM18906g.m5195b(activity);
                }
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        int i = this.f67807a;
        activity.getClass();
        switch (i) {
            case 0:
                iy5 iy5Var = qj5.f57852d;
                iy5.m14197m(LoggingBehavior.APP_EVENTS, AbstractC3785y6.f69338a, "onActivityStopped");
                String str = C3012fs.f39540c;
                qn3 qn3Var = AbstractC3546rr.f59732a;
                if (!lp1.f49971a.contains(AbstractC3546rr.class)) {
                    try {
                        AbstractC3546rr.f59733b.execute(new RunnableC3637u6(5));
                    } catch (Throwable th) {
                        lp1.m16420a(AbstractC3546rr.class, th);
                    }
                }
                AbstractC3785y6.f69348k--;
                break;
        }
    }
}
