package p000;

import android.os.Build;
import android.util.Log;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes.dex */
public final class bgb extends AbstractC3572sf {

    /* JADX INFO: renamed from: c */
    public static final boolean f8520c;

    /* JADX INFO: renamed from: d */
    public static final boolean f8521d;

    /* JADX INFO: renamed from: e */
    public static final boolean f8522e;

    /* JADX INFO: renamed from: f */
    public static final AtomicReference f8523f;

    /* JADX INFO: renamed from: g */
    public static final AtomicLong f8524g;

    /* JADX INFO: renamed from: h */
    public static final ConcurrentLinkedQueue f8525h;

    /* JADX INFO: renamed from: b */
    public volatile AbstractC3572sf f8526b;

    static {
        String str = Build.FINGERPRINT;
        f8520c = str == null || "robolectric".equals(str);
        String str2 = Build.HARDWARE;
        f8521d = "goldfish".equals(str2) || "ranchu".equals(str2);
        String str3 = Build.TYPE;
        f8522e = "eng".equals(str3) || "userdebug".equals(str3);
        f8523f = new AtomicReference();
        f8524g = new AtomicLong();
        f8525h = new ConcurrentLinkedQueue();
    }

    /* JADX INFO: renamed from: E */
    public static void m3703E() {
        while (true) {
            agb agbVar = (agb) f8525h.poll();
            if (agbVar == null) {
                return;
            }
            f8524g.getAndDecrement();
            AbstractC3572sf abstractC3572sfM388a = agbVar.m388a();
            rmd rmdVarM389b = agbVar.m389b();
            vmd vmdVar = rmdVarM389b.f59561c;
            if ((vmdVar != null && Boolean.TRUE.equals(vmdVar.mo360j(umd.f64098g))) || abstractC3572sfM388a.mo3704A(rmdVarM389b.f59559a)) {
                abstractC3572sfM388a.mo3705B(rmdVarM389b);
            }
        }
    }

    @Override // p000.AbstractC3572sf
    /* JADX INFO: renamed from: A */
    public final boolean mo3704A(Level level) {
        return this.f8526b == null || this.f8526b.mo3704A(level);
    }

    @Override // p000.AbstractC3572sf
    /* JADX INFO: renamed from: B */
    public final void mo3705B(rmd rmdVar) {
        if (this.f8526b != null) {
            this.f8526b.mo3705B(rmdVar);
            return;
        }
        if (f8524g.incrementAndGet() > 20) {
            f8525h.poll();
            Log.w("ProxyAndroidLoggerBackend", "Too many Flogger logs received before configuration. Dropping old logs.");
        }
        f8525h.offer(new agb(this, rmdVar));
        if (this.f8526b != null) {
            m3703E();
        }
    }

    @Override // p000.AbstractC3572sf
    /* JADX INFO: renamed from: C */
    public final void mo3706C(RuntimeException runtimeException, rmd rmdVar) {
        if (this.f8526b != null) {
            this.f8526b.mo3706C(runtimeException, rmdVar);
        } else {
            Log.e("ProxyAndroidLoggerBackend", "Internal logging error before configuration", runtimeException);
        }
    }
}
