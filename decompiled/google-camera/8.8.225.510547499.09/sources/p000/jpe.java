package p000;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.PowerManager;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.apps.camera.legacy.app.activity.main.kuX.PMZiHihxLGEy;
import com.google.android.apps.camera.smarts.ScBZ.IuyLAqNmW;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jpe {

    /* JADX INFO: renamed from: b */
    public final Object f34534b;

    /* JADX INFO: renamed from: c */
    public final PowerManager.WakeLock f34535c;

    /* JADX INFO: renamed from: d */
    public int f34536d;

    /* JADX INFO: renamed from: e */
    public Future f34537e;

    /* JADX INFO: renamed from: f */
    public long f34538f;

    /* JADX INFO: renamed from: g */
    public boolean f34539g;

    /* JADX INFO: renamed from: h */
    public int f34540h;

    /* JADX INFO: renamed from: i */
    public jmt f34541i;

    /* JADX INFO: renamed from: j */
    public final String f34542j;

    /* JADX INFO: renamed from: k */
    public final String f34543k;

    /* JADX INFO: renamed from: l */
    public final Map f34544l;

    /* JADX INFO: renamed from: m */
    public AtomicInteger f34545m;

    /* JADX INFO: renamed from: n */
    public final ScheduledExecutorService f34546n;

    /* JADX INFO: renamed from: o */
    public jis f34547o;

    /* JADX INFO: renamed from: s */
    private final Set f34548s;

    /* JADX INFO: renamed from: t */
    private WorkSource f34549t;

    /* JADX INFO: renamed from: a */
    public static final long f34530a = TimeUnit.DAYS.toMillis(366);

    /* JADX INFO: renamed from: q */
    private static volatile ScheduledExecutorService f34532q = null;

    /* JADX INFO: renamed from: r */
    private static final Object f34533r = new Object();

    /* JADX INFO: renamed from: p */
    public static volatile jpd f34531p = new jpd();

    public jpe(Context context) {
        String packageName = context.getPackageName();
        this.f34534b = new Object();
        this.f34536d = 0;
        this.f34548s = new HashSet();
        this.f34539g = true;
        this.f34547o = jis.f34138a;
        this.f34544l = new HashMap();
        this.f34545m = new AtomicInteger(0);
        jib.m13206k(context, "WakeLock: context must not be null");
        jib.m13204i("Analytics WakeLock", "WakeLock: wakeLockName must not be empty");
        context.getApplicationContext();
        this.f34543k = "Analytics WakeLock";
        WorkSource workSource = null;
        this.f34541i = null;
        if ("com.google.android.gms".equals(context.getPackageName())) {
            this.f34542j = "Analytics WakeLock";
        } else {
            this.f34542j = "*gcore*:Analytics WakeLock";
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        lku.m15662p(powerManager);
        this.f34535c = powerManager.newWakeLock(1, "Analytics WakeLock");
        if (jix.m13238b(context)) {
            int i = jiw.f34144a;
            packageName = (packageName == null || packageName.trim().isEmpty()) ? context.getPackageName() : packageName;
            if (context != null && context.getPackageManager() != null && packageName != null) {
                try {
                    ApplicationInfo applicationInfoM14247m = jiz.m13300b(context).m14247m(packageName, 0);
                    if (applicationInfoM14247m == null) {
                        Log.e("WorkSourceUtil", "Could not get applicationInfo from package: ".concat(packageName));
                    } else {
                        int i2 = applicationInfoM14247m.uid;
                        workSource = new WorkSource();
                        jix.m13237a(workSource, i2, packageName);
                    }
                } catch (PackageManager.NameNotFoundException e) {
                    Log.e("WorkSourceUtil", "Could not find package: ".concat(packageName));
                }
            }
            this.f34549t = workSource;
            if (workSource != null) {
                m13441e(this.f34535c, workSource);
            }
        }
        ScheduledExecutorService scheduledExecutorServiceUnconfigurableScheduledExecutorService = f34532q;
        if (scheduledExecutorServiceUnconfigurableScheduledExecutorService == null) {
            synchronized (f34533r) {
                scheduledExecutorServiceUnconfigurableScheduledExecutorService = f34532q;
                if (scheduledExecutorServiceUnconfigurableScheduledExecutorService == null) {
                    jmv jmvVar = jmw.f34379a;
                    scheduledExecutorServiceUnconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                    f34532q = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
                }
            }
        }
        this.f34546n = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
    }

    /* JADX INFO: renamed from: e */
    private static void m13441e(PowerManager.WakeLock wakeLock, WorkSource workSource) {
        try {
            wakeLock.setWorkSource(workSource);
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e) {
            Log.wtf(IuyLAqNmW.qoKULljGyIeu, e.toString());
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m13442a() {
        if (this.f34548s.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.f34548s);
        this.f34548s.clear();
        if (arrayList.size() <= 0) {
            return;
        }
        throw null;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m13443b() {
        boolean z;
        synchronized (this.f34534b) {
            z = this.f34536d > 0;
        }
        return z;
    }

    /* JADX INFO: renamed from: c */
    public final void m13444c() {
        if (this.f34539g) {
            TextUtils.isEmpty(null);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m13445d() {
        synchronized (this.f34534b) {
            if (m13443b()) {
                if (this.f34539g) {
                    int i = this.f34536d - 1;
                    this.f34536d = i;
                    if (i > 0) {
                        return;
                    }
                } else {
                    this.f34536d = 0;
                }
                m13442a();
                Iterator it = this.f34544l.values().iterator();
                while (it.hasNext()) {
                    ((luc) it.next()).f39211a = 0;
                }
                this.f34544l.clear();
                Future future = this.f34537e;
                if (future != null) {
                    future.cancel(false);
                    this.f34537e = null;
                    this.f34538f = 0L;
                }
                this.f34540h = 0;
                try {
                    if (this.f34535c.isHeld()) {
                        try {
                            this.f34535c.release();
                            if (this.f34541i != null) {
                                this.f34541i = null;
                            }
                        } catch (RuntimeException e) {
                            if (!e.getClass().equals(RuntimeException.class)) {
                                throw e;
                            }
                            Log.e("WakeLock", this.f34542j + " failed to release!", e);
                            if (this.f34541i != null) {
                                this.f34541i = null;
                            }
                        }
                    } else {
                        Log.e("WakeLock", this.f34542j + PMZiHihxLGEy.JUgjCKsB);
                    }
                } catch (Throwable th) {
                    if (this.f34541i != null) {
                        this.f34541i = null;
                    }
                    throw th;
                }
            }
        }
    }
}
