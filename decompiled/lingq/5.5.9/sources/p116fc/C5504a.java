package p116fc;

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
import p176ib.C6272i;
import p254m2.C7472a;
import p260m8.C7499b;
import p262mb.C7532e;
import p262mb.C7534g;
import p289o5.RunnableC7930j;
import p295ob.C8032b;
import p506yb.C10333a;

/* JADX INFO: renamed from: fc.a */
/* JADX INFO: loaded from: classes.dex */
public final class C5504a {

    /* JADX INFO: renamed from: n */
    public static final long f34118n = TimeUnit.DAYS.toMillis(366);

    /* JADX INFO: renamed from: o */
    public static volatile ScheduledExecutorService f34119o = null;

    /* JADX INFO: renamed from: p */
    public static final Object f34120p = new Object();

    /* JADX INFO: renamed from: a */
    public final Object f34121a;

    /* JADX INFO: renamed from: b */
    public final PowerManager.WakeLock f34122b;

    /* JADX INFO: renamed from: c */
    public int f34123c;

    /* JADX INFO: renamed from: d */
    public ScheduledFuture f34124d;

    /* JADX INFO: renamed from: e */
    public long f34125e;

    /* JADX INFO: renamed from: f */
    public final HashSet f34126f;

    /* JADX INFO: renamed from: g */
    public boolean f34127g;

    /* JADX INFO: renamed from: h */
    public C10333a f34128h;

    /* JADX INFO: renamed from: i */
    public final C7499b f34129i;

    /* JADX INFO: renamed from: j */
    public final String f34130j;

    /* JADX INFO: renamed from: k */
    public final HashMap f34131k;

    /* JADX INFO: renamed from: l */
    public final AtomicInteger f34132l;

    /* JADX INFO: renamed from: m */
    public final ScheduledExecutorService f34133m;

    /* JADX WARN: Code duplicated, block: B:53:0x012f A[PHI: r4
      0x012f: PHI (r4v5 android.os.WorkSource) = (r4v4 android.os.WorkSource), (r4v4 android.os.WorkSource), (r4v4 android.os.WorkSource), (r4v7 android.os.WorkSource) binds: [B:32:0x00c9, B:33:0x00cb, B:52:0x0125, B:46:0x0110] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unreachable blocks removed: 3, instructions: 3 */
    public C5504a(Context context) {
        boolean zBooleanValue;
        String packageName = context.getPackageName();
        this.f34121a = new Object();
        this.f34123c = 0;
        this.f34126f = new HashSet();
        this.f34127g = true;
        this.f34129i = C7499b.f41437l;
        this.f34131k = new HashMap();
        this.f34132l = new AtomicInteger(0);
        C6272i.m12913g("WakeLock: wakeLockName must not be empty", "wake:com.google.firebase.iid.WakeLockHolder");
        context.getApplicationContext();
        WorkSource workSource = null;
        this.f34128h = null;
        if ("com.google.android.gms".equals(context.getPackageName())) {
            this.f34130j = "wake:com.google.firebase.iid.WakeLockHolder";
        } else {
            this.f34130j = "wake:com.google.firebase.iid.WakeLockHolder".length() != 0 ? "*gcore*:".concat("wake:com.google.firebase.iid.WakeLockHolder") : new String("*gcore*:");
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager == null) {
            StringBuilder sb2 = new StringBuilder(29);
            sb2.append((CharSequence) "expected a non-null reference", 0, 29);
            throw new zzi(sb2.toString());
        }
        this.f34122b = powerManager.newWakeLock(1, "wake:com.google.firebase.iid.WakeLockHolder");
        Method method = C7534g.f41605a;
        synchronized (C7534g.class) {
            Boolean bool = C7534g.f41607c;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                Boolean boolValueOf = Boolean.valueOf(C7472a.m14841a(context, "android.permission.UPDATE_DEVICE_STATS") == 0);
                C7534g.f41607c = boolValueOf;
                zBooleanValue = boolValueOf.booleanValue();
            }
        }
        if (zBooleanValue) {
            packageName = C7532e.m15044a(packageName) ? context.getPackageName() : packageName;
            if (context.getPackageManager() != null && packageName != null) {
                try {
                    ApplicationInfo applicationInfoM15899a = C8032b.m15902a(context).m15899a(packageName, 0);
                    if (applicationInfoM15899a == null) {
                        Log.e("WorkSourceUtil", "Could not get applicationInfo from package: ".concat(packageName));
                    } else {
                        int i10 = applicationInfoM15899a.uid;
                        workSource = new WorkSource();
                        Method method2 = C7534g.f41606b;
                        if (method2 != null) {
                            try {
                                method2.invoke(workSource, Integer.valueOf(i10), packageName);
                            } catch (Exception e10) {
                                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e10);
                            }
                        } else {
                            Method method3 = C7534g.f41605a;
                            if (method3 != null) {
                                try {
                                    method3.invoke(workSource, Integer.valueOf(i10));
                                } catch (Exception e11) {
                                    Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e11);
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
                    this.f34122b.setWorkSource(workSource);
                } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e12) {
                    Log.wtf("WakeLock", e12.toString());
                }
            }
        }
        ScheduledExecutorService scheduledExecutorServiceUnconfigurableScheduledExecutorService = f34119o;
        if (scheduledExecutorServiceUnconfigurableScheduledExecutorService == null) {
            synchronized (f34120p) {
                scheduledExecutorServiceUnconfigurableScheduledExecutorService = f34119o;
                if (scheduledExecutorServiceUnconfigurableScheduledExecutorService == null) {
                    scheduledExecutorServiceUnconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                    f34119o = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
                }
            }
        }
        this.f34133m = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
    }

    /* JADX INFO: renamed from: a */
    public final void m11733a(long j10) {
        this.f34132l.incrementAndGet();
        long jMax = Math.max(Math.min(Long.MAX_VALUE, f34118n), 1L);
        if (j10 > 0) {
            jMax = Math.min(j10, jMax);
        }
        synchronized (this.f34121a) {
            try {
                if (!m11734b()) {
                    this.f34128h = C10333a.f52020a;
                    this.f34122b.acquire();
                    this.f34129i.getClass();
                    SystemClock.elapsedRealtime();
                }
                this.f34123c++;
                if (this.f34127g) {
                    TextUtils.isEmpty(null);
                }
                C5505b c5505b = (C5505b) this.f34131k.get(null);
                if (c5505b == null) {
                    c5505b = new C5505b(0);
                    this.f34131k.put(null, c5505b);
                }
                c5505b.f34134a++;
                this.f34129i.getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                long j11 = Long.MAX_VALUE - jElapsedRealtime > jMax ? jElapsedRealtime + jMax : Long.MAX_VALUE;
                if (j11 > this.f34125e) {
                    this.f34125e = j11;
                    ScheduledFuture scheduledFuture = this.f34124d;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.f34124d = this.f34133m.schedule(new RunnableC7930j(5, this), jMax, TimeUnit.MILLISECONDS);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m11734b() {
        boolean z10;
        synchronized (this.f34121a) {
            z10 = this.f34123c > 0;
        }
        return z10;
    }

    /* JADX INFO: renamed from: c */
    public final void m11735c() {
        if (this.f34132l.decrementAndGet() < 0) {
            Log.e("WakeLock", String.valueOf(this.f34130j).concat(" release without a matched acquire!"));
        }
        synchronized (this.f34121a) {
            try {
                if (this.f34127g) {
                    TextUtils.isEmpty(null);
                }
                if (this.f34131k.containsKey(null)) {
                    C5505b c5505b = (C5505b) this.f34131k.get(null);
                    if (c5505b != null) {
                        int i10 = c5505b.f34134a - 1;
                        c5505b.f34134a = i10;
                        if (i10 == 0) {
                            this.f34131k.remove(null);
                        }
                    }
                    m11737e();
                } else {
                    Log.w("WakeLock", String.valueOf(this.f34130j).concat(" counter does not exist"));
                }
                m11737e();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m11736d() {
        HashSet hashSet = this.f34126f;
        if (hashSet.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(hashSet);
        hashSet.clear();
        if (arrayList.size() <= 0) {
            return;
        }
        throw null;
    }

    /* JADX INFO: renamed from: e */
    public final void m11737e() {
        synchronized (this.f34121a) {
            if (m11734b()) {
                if (this.f34127g) {
                    int i10 = this.f34123c - 1;
                    this.f34123c = i10;
                    if (i10 > 0) {
                        return;
                    }
                } else {
                    this.f34123c = 0;
                }
                m11736d();
                Iterator it = this.f34131k.values().iterator();
                while (it.hasNext()) {
                    ((C5505b) it.next()).f34134a = 0;
                }
                this.f34131k.clear();
                ScheduledFuture scheduledFuture = this.f34124d;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                    this.f34124d = null;
                    this.f34125e = 0L;
                }
                if (this.f34122b.isHeld()) {
                    try {
                        try {
                            this.f34122b.release();
                            if (this.f34128h != null) {
                                this.f34128h = null;
                            }
                        } catch (RuntimeException e10) {
                            if (!e10.getClass().equals(RuntimeException.class)) {
                                throw e10;
                            }
                            Log.e("WakeLock", String.valueOf(this.f34130j).concat(" failed to release!"), e10);
                            if (this.f34128h != null) {
                                this.f34128h = null;
                            }
                        }
                    } catch (Throwable th2) {
                        if (this.f34128h != null) {
                            this.f34128h = null;
                        }
                        throw th2;
                    }
                } else {
                    Log.e("WakeLock", String.valueOf(this.f34130j).concat(" should be held!"));
                }
            }
        }
    }
}
