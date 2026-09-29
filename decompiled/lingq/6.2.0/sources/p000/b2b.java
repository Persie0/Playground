package p000;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.PowerManager;
import android.os.SystemClock;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.stats.zzi;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class b2b {

    /* JADX INFO: renamed from: n */
    public static volatile ScheduledExecutorService f7810n;

    /* JADX INFO: renamed from: o */
    public static final Object f7811o = new Object();

    /* JADX INFO: renamed from: a */
    public final Object f7812a;

    /* JADX INFO: renamed from: b */
    public final PowerManager.WakeLock f7813b;

    /* JADX INFO: renamed from: c */
    public int f7814c;

    /* JADX INFO: renamed from: d */
    public ScheduledFuture f7815d;

    /* JADX INFO: renamed from: e */
    public long f7816e;

    /* JADX INFO: renamed from: f */
    public final HashSet f7817f;

    /* JADX INFO: renamed from: g */
    public boolean f7818g;

    /* JADX INFO: renamed from: h */
    public aob f7819h;

    /* JADX INFO: renamed from: i */
    public final gr7 f7820i;

    /* JADX INFO: renamed from: j */
    public final String f7821j;

    /* JADX INFO: renamed from: k */
    public final HashMap f7822k;

    /* JADX INFO: renamed from: l */
    public final AtomicInteger f7823l;

    /* JADX INFO: renamed from: m */
    public final ScheduledExecutorService f7824m;

    public b2b(Context context) {
        boolean zBooleanValue;
        String packageName = context.getPackageName();
        this.f7812a = new Object();
        this.f7814c = 0;
        this.f7817f = new HashSet();
        this.f7818g = true;
        this.f7820i = gr7.f41237b;
        this.f7822k = new HashMap();
        this.f7823l = new AtomicInteger(0);
        lda.m16128n("wake:com.google.firebase.iid.WakeLockHolder", "WakeLock: wakeLockName must not be empty");
        context.getApplicationContext();
        WorkSource workSource = null;
        this.f7819h = null;
        if ("com.google.android.gms".equals(context.getPackageName())) {
            this.f7821j = "wake:com.google.firebase.iid.WakeLockHolder";
        } else {
            this.f7821j = "wake:com.google.firebase.iid.WakeLockHolder".length() != 0 ? "*gcore*:".concat("wake:com.google.firebase.iid.WakeLockHolder") : new String("*gcore*:");
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager == null) {
            StringBuilder sb = new StringBuilder(29);
            sb.append((CharSequence) "expected a non-null reference", 0, 29);
            throw new zzi(sb.toString());
        }
        this.f7813b = powerManager.newWakeLock(1, "wake:com.google.firebase.iid.WakeLockHolder");
        Method method = m8b.f50768a;
        synchronized (m8b.class) {
            Boolean bool = m8b.f50770c;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                zBooleanValue = do7.m10532h(context, "android.permission.UPDATE_DEVICE_STATS") == 0;
                m8b.f50770c = Boolean.valueOf(zBooleanValue);
            }
        }
        if (zBooleanValue) {
            int i = tk9.f62458a;
            packageName = (packageName == null || packageName.trim().isEmpty()) ? context.getPackageName() : packageName;
            if (context.getPackageManager() != null && packageName != null) {
                try {
                    ApplicationInfo applicationInfoM23948a = m9b.m16702a(context).m23948a(0, packageName);
                    if (applicationInfoM23948a == null) {
                        Log.e("WorkSourceUtil", "Could not get applicationInfo from package: ".concat(packageName));
                    } else {
                        int i2 = applicationInfoM23948a.uid;
                        workSource = new WorkSource();
                        Method method2 = m8b.f50769b;
                        if (method2 != null) {
                            try {
                                method2.invoke(workSource, Integer.valueOf(i2), packageName);
                            } catch (Exception e) {
                                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
                            }
                        } else {
                            Method method3 = m8b.f50768a;
                            if (method3 != null) {
                                try {
                                    method3.invoke(workSource, Integer.valueOf(i2));
                                } catch (Exception e2) {
                                    Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e2);
                                }
                            }
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    Log.e("WorkSourceUtil", "Could not find package: ".concat(packageName));
                }
            }
            if (workSource != null) {
                try {
                    this.f7813b.setWorkSource(workSource);
                } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e3) {
                    Log.wtf("WakeLock", e3.toString());
                }
            }
        }
        ScheduledExecutorService scheduledExecutorServiceUnconfigurableScheduledExecutorService = f7810n;
        if (scheduledExecutorServiceUnconfigurableScheduledExecutorService == null) {
            synchronized (f7811o) {
                try {
                    scheduledExecutorServiceUnconfigurableScheduledExecutorService = f7810n;
                    if (scheduledExecutorServiceUnconfigurableScheduledExecutorService == null) {
                        scheduledExecutorServiceUnconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                        f7810n = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.f7824m = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
    }

    /* JADX INFO: renamed from: a */
    public final void m3197a() {
        this.f7823l.incrementAndGet();
        long jMin = Math.min(60000L, Math.max(Math.min(Long.MAX_VALUE, 31622400000L), 1L));
        synchronized (this.f7812a) {
            try {
                if (!m3198b()) {
                    this.f7819h = aob.f7307a;
                    this.f7813b.acquire();
                    this.f7820i.getClass();
                    SystemClock.elapsedRealtime();
                }
                this.f7814c++;
                if (this.f7818g) {
                    TextUtils.isEmpty(null);
                }
                srb srbVar = (srb) this.f7822k.get(null);
                if (srbVar == null) {
                    srbVar = new srb();
                    this.f7822k.put(null, srbVar);
                }
                srbVar.f61325a++;
                this.f7820i.getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                long j = Long.MAX_VALUE - jElapsedRealtime > jMin ? jElapsedRealtime + jMin : Long.MAX_VALUE;
                if (j > this.f7816e) {
                    this.f7816e = j;
                    ScheduledFuture scheduledFuture = this.f7815d;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.f7815d = this.f7824m.schedule(new RunnableC3468pp(this, 23), jMin, TimeUnit.MILLISECONDS);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m3198b() {
        boolean z;
        synchronized (this.f7812a) {
            z = this.f7814c > 0;
        }
        return z;
    }

    /* JADX INFO: renamed from: c */
    public final void m3199c() {
        if (this.f7823l.decrementAndGet() < 0) {
            Log.e("WakeLock", String.valueOf(this.f7821j).concat(" release without a matched acquire!"));
        }
        synchronized (this.f7812a) {
            try {
                if (this.f7818g) {
                    TextUtils.isEmpty(null);
                }
                if (this.f7822k.containsKey(null)) {
                    srb srbVar = (srb) this.f7822k.get(null);
                    if (srbVar != null) {
                        int i = srbVar.f61325a - 1;
                        srbVar.f61325a = i;
                        if (i == 0) {
                            this.f7822k.remove(null);
                        }
                    }
                } else {
                    Log.w("WakeLock", String.valueOf(this.f7821j).concat(" counter does not exist"));
                }
                m3201e();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m3200d() {
        HashSet hashSet = this.f7817f;
        if (hashSet.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(hashSet);
        hashSet.clear();
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        ho2.m13383c();
    }

    /* JADX INFO: renamed from: e */
    public final void m3201e() {
        synchronized (this.f7812a) {
            try {
                if (m3198b()) {
                    if (this.f7818g) {
                        int i = this.f7814c - 1;
                        this.f7814c = i;
                        if (i > 0) {
                            return;
                        }
                    } else {
                        this.f7814c = 0;
                    }
                    m3200d();
                    Iterator it = this.f7822k.values().iterator();
                    while (it.hasNext()) {
                        ((srb) it.next()).f61325a = 0;
                    }
                    this.f7822k.clear();
                    ScheduledFuture scheduledFuture = this.f7815d;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                        this.f7815d = null;
                        this.f7816e = 0L;
                    }
                    if (this.f7813b.isHeld()) {
                        try {
                            try {
                                this.f7813b.release();
                                if (this.f7819h != null) {
                                    this.f7819h = null;
                                }
                            } catch (RuntimeException e) {
                                if (!e.getClass().equals(RuntimeException.class)) {
                                    throw e;
                                }
                                Log.e("WakeLock", String.valueOf(this.f7821j).concat(" failed to release!"), e);
                                if (this.f7819h != null) {
                                    this.f7819h = null;
                                }
                            }
                        } catch (Throwable th) {
                            if (this.f7819h != null) {
                                this.f7819h = null;
                            }
                            throw th;
                        }
                    } else {
                        Log.e("WakeLock", String.valueOf(this.f7821j).concat(" should be held!"));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
