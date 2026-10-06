package p000;

import android.os.Handler;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class jai {

    /* JADX INFO: renamed from: a */
    private static volatile Handler f33568a;

    /* JADX INFO: renamed from: b */
    public final izv f33569b;

    /* JADX INFO: renamed from: c */
    public final Runnable f33570c = new ith(this, 12);

    /* JADX INFO: renamed from: d */
    public volatile long f33571d;

    public jai(izv izvVar) {
        this.f33569b = izvVar;
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo11953a();

    /* JADX INFO: renamed from: b */
    public final Handler m12780b() {
        Handler handler;
        if (f33568a != null) {
            return f33568a;
        }
        synchronized (jai.class) {
            if (f33568a == null) {
                f33568a = new jmx(this.f33569b.f32728a.getMainLooper());
            }
            handler = f33568a;
        }
        return handler;
    }

    /* JADX INFO: renamed from: c */
    public final void m12781c() {
        this.f33571d = 0L;
        m12780b().removeCallbacks(this.f33570c);
    }

    /* JADX INFO: renamed from: d */
    public final void m12782d(long j) {
        m12781c();
        if (j >= 0) {
            this.f33571d = System.currentTimeMillis();
            if (m12780b().postDelayed(this.f33570c, j)) {
                return;
            }
            this.f33569b.m11951d().m11934o("Failed to schedule delayed post. time", Long.valueOf(j));
        }
    }

    /* JADX INFO: renamed from: e */
    public final boolean m12783e() {
        return this.f33571d != 0;
    }
}
