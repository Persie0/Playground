package p000;

import android.media.MediaCodec;
import android.os.SystemClock;
import androidx.wear.ambient.AmbientModeSupport;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class hpa {

    /* JADX INFO: renamed from: a */
    public static final nbh f28726a = nbh.m17259h("com/google/android/apps/camera/timelapse/TimelapseFrameSelector");

    /* JADX INFO: renamed from: A */
    public hqn f28727A;

    /* JADX INFO: renamed from: B */
    public klx f28728B;

    /* JADX INFO: renamed from: C */
    public jxj f28729C;

    /* JADX INFO: renamed from: D */
    public AmbientModeSupport.AmbientController f28730D;

    /* JADX INFO: renamed from: E */
    public AmbientModeSupport.AmbientController f28731E;

    /* JADX INFO: renamed from: r */
    public final dhv f28748r;

    /* JADX INFO: renamed from: s */
    public final MediaCodec.Callback f28749s;

    /* JADX INFO: renamed from: u */
    public final jww f28751u;

    /* JADX INFO: renamed from: v */
    public final jww f28752v;

    /* JADX INFO: renamed from: w */
    public hqm f28753w;

    /* JADX INFO: renamed from: x */
    public hqq f28754x;

    /* JADX INFO: renamed from: y */
    public nqf f28755y;

    /* JADX INFO: renamed from: z */
    public hqo f28756z;

    /* JADX INFO: renamed from: b */
    public final AtomicBoolean f28732b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c */
    public final AtomicBoolean f28733c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d */
    public final AtomicBoolean f28734d = new AtomicBoolean(false);

    /* JADX INFO: renamed from: e */
    public final non f28735e = new non(null);

    /* JADX INFO: renamed from: f */
    public final AtomicLong f28736f = new AtomicLong(0);

    /* JADX INFO: renamed from: g */
    public final AtomicLong f28737g = new AtomicLong(0);

    /* JADX INFO: renamed from: h */
    public final AtomicLong f28738h = new AtomicLong(0);

    /* JADX INFO: renamed from: i */
    public final AtomicLong f28739i = new AtomicLong(0);

    /* JADX INFO: renamed from: j */
    public final AtomicLong f28740j = new AtomicLong(0);

    /* JADX INFO: renamed from: k */
    public final AtomicLong f28741k = new AtomicLong(0);

    /* JADX INFO: renamed from: l */
    public final AtomicLong f28742l = new AtomicLong(0);

    /* JADX INFO: renamed from: m */
    public final AtomicLong f28743m = new AtomicLong(0);

    /* JADX INFO: renamed from: n */
    public final AtomicLong f28744n = new AtomicLong(0);

    /* JADX INFO: renamed from: o */
    public final AtomicLong f28745o = new AtomicLong(0);

    /* JADX INFO: renamed from: p */
    public final AtomicLong f28746p = new AtomicLong(0);

    /* JADX INFO: renamed from: q */
    public final AtomicLong f28747q = new AtomicLong(0);

    /* JADX INFO: renamed from: t */
    public final Object f28750t = new Object();

    public hpa(dhv dhvVar, jww jwwVar, jww jwwVar2, hqo hqoVar) {
        this.f28748r = dhvVar;
        this.f28751u = jwwVar;
        this.f28752v = jwwVar2;
        this.f28756z = hqoVar;
        this.f28749s = new hoy(this, dhvVar, hqoVar);
    }

    /* JADX INFO: renamed from: a */
    public final long m10556a() {
        return this.f28737g.get();
    }

    /* JADX INFO: renamed from: b */
    public final long m10557b() {
        return this.f28738h.get() - this.f28737g.get();
    }

    /* JADX INFO: renamed from: c */
    public final long m10558c() {
        return TimeUnit.SECONDS.toMillis(this.f28738h.get()) / ((long) m10565j().f29162h);
    }

    /* JADX INFO: renamed from: d */
    public final long m10559d() {
        return this.f28736f.get();
    }

    /* JADX INFO: renamed from: e */
    public final long m10560e() {
        return this.f28742l.get() - this.f28744n.get();
    }

    /* JADX INFO: renamed from: f */
    public final long m10561f() {
        return this.f28744n.get();
    }

    /* JADX INFO: renamed from: g */
    public final long m10562g() {
        return TimeUnit.SECONDS.toMillis(this.f28742l.get()) / ((long) m10565j().f29162h);
    }

    /* JADX INFO: renamed from: h */
    final long m10563h() {
        long j = 1;
        if (m10568m()) {
            while (m10564i() / j >= 30000) {
                j += j;
            }
        }
        return j;
    }

    /* JADX INFO: renamed from: i */
    public final long m10564i() {
        return this.f28747q.get();
    }

    /* JADX INFO: renamed from: j */
    final hqo m10565j() {
        hqo hqoVar;
        synchronized (this.f28750t) {
            hqoVar = this.f28756z;
        }
        return hqoVar;
    }

    /* JADX INFO: renamed from: k */
    public final void m10566k() {
        if (this.f28745o.get() > 0) {
            AtomicLong atomicLong = this.f28746p;
            atomicLong.set((atomicLong.get() + TimeUnit.MILLISECONDS.toNanos(SystemClock.uptimeMillis())) - this.f28745o.get());
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m10567l() {
        synchronized (this.f28750t) {
            hqm hqmVar = this.f28753w;
            hqmVar.getClass();
            hqmVar.m10610e(m10562g());
            hqmVar.m10612g(m10564i());
            m10561f();
            hqmVar.m10613h();
            m10560e();
            hqmVar.m10614i();
        }
    }

    /* JADX INFO: renamed from: m */
    final boolean m10568m() {
        boolean zEquals;
        synchronized (this.f28750t) {
            zEquals = this.f28727A.equals(hqn.AUTO);
        }
        return zEquals;
    }
}
