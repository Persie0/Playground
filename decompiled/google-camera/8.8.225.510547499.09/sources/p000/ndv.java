package p000;

import android.os.Build;
import android.util.Log;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ndv extends ndn {

    /* JADX INFO: renamed from: a */
    public static final AtomicReference f42062a = new AtomicReference();

    /* JADX INFO: renamed from: b */
    private static final AtomicLong f42063b = new AtomicLong();

    /* JADX INFO: renamed from: c */
    private static final ConcurrentLinkedQueue f42064c = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: d */
    private volatile ncn f42065d;

    public ndv(String str) {
        ncn ncnVarMo17375a;
        super(str);
        boolean z = false;
        boolean z2 = Build.FINGERPRINT == null || "robolectric".equals(Build.FINGERPRINT);
        boolean z3 = "goldfish".equals(Build.HARDWARE) || "ranchu".equals(Build.HARDWARE);
        if ("eng".equals(Build.TYPE) || "userdebug".equals(Build.TYPE)) {
            z = true;
        }
        if (z2 || z3) {
            this.f42065d = new ndo().mo17375a(mo17338a());
            return;
        }
        if (z) {
            ndx ndxVar = new ndx();
            ncnVarMo17375a = new ndx(ndxVar.f42068a, ndxVar.f42069b, Level.OFF, ndxVar.f42071d, ndxVar.f42072e, ndxVar.f42073f).mo17375a(mo17338a());
        } else {
            ncnVarMo17375a = null;
        }
        this.f42065d = ncnVarMo17375a;
    }

    /* JADX INFO: renamed from: e */
    public static void m17383e() {
        while (true) {
            ndv ndvVar = (ndv) ndu.f42061a.poll();
            if (ndvVar == null) {
                m17384f();
                return;
            }
            ndvVar.f42065d = ((ndp) f42062a.get()).mo17375a(ndvVar.mo17338a());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, ncm] */
    /* JADX INFO: renamed from: f */
    private static void m17384f() {
        while (true) {
            mbb mbbVar = (mbb) f42064c.poll();
            if (mbbVar == null) {
                return;
            }
            f42063b.getAndDecrement();
            Object obj = mbbVar.f39761b;
            ?? r0 = mbbVar.f39760a;
            if (!r0.mo17274E()) {
                if (((ncn) obj).mo17341d(r0.mo17288m())) {
                }
            }
            ((ncn) obj).mo17340c(r0);
        }
    }

    @Override // p000.ndn, p000.ncn
    /* JADX INFO: renamed from: b */
    public final void mo17339b(RuntimeException runtimeException, ncm ncmVar) {
        if (this.f42065d != null) {
            this.f42065d.mo17339b(runtimeException, ncmVar);
        } else {
            Log.e("ProxyAndroidLoggerBackend", "Internal logging error before configuration", runtimeException);
        }
    }

    @Override // p000.ncn
    /* JADX INFO: renamed from: c */
    public final void mo17340c(ncm ncmVar) {
        if (this.f42065d != null) {
            this.f42065d.mo17340c(ncmVar);
            return;
        }
        if (f42063b.incrementAndGet() > 20) {
            f42064c.poll();
            Log.w("ProxyAndroidLoggerBackend", "Too many Flogger logs received before configuration. Dropping old logs.");
        }
        f42064c.offer(new mbb(this, ncmVar));
        if (this.f42065d != null) {
            m17384f();
        }
    }

    @Override // p000.ncn
    /* JADX INFO: renamed from: d */
    public final boolean mo17341d(Level level) {
        if (this.f42065d != null) {
            return this.f42065d.mo17341d(level);
        }
        return true;
    }
}
