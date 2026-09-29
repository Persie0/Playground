package p000;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
public final class qq7 {

    /* JADX INFO: renamed from: a */
    public long f58082a;

    /* JADX INFO: renamed from: b */
    public long f58083b;

    /* JADX INFO: renamed from: c */
    public boolean f58084c;

    /* JADX INFO: renamed from: a */
    public final rq7 m20117a(boolean z) {
        boolean z2;
        boolean z3;
        synchronized (this) {
            z2 = this.f58082a < 0;
        }
        if (z2) {
            return rq7.m20748c();
        }
        synchronized (this) {
            z3 = this.f58082a == 0;
        }
        if (z3) {
            return rq7.m20746a();
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.f58083b;
        long j2 = this.f58082a;
        if (jElapsedRealtime >= j + j2) {
            this.f58083b = jElapsedRealtime;
            this.f58084c = false;
        }
        if (this.f58084c) {
            return rq7.m20747b((this.f58083b + j2) - SystemClock.elapsedRealtime());
        }
        if (z) {
            this.f58084c = true;
        }
        return rq7.m20746a();
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m20118b(long j) {
        this.f58082a = j;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime >= this.f58083b + this.f58082a) {
            this.f58083b = jElapsedRealtime;
            this.f58084c = false;
        }
    }
}
