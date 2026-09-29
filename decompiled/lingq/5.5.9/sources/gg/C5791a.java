package gg;

import android.os.SystemClock;

/* JADX INFO: renamed from: gg.a */
/* JADX INFO: loaded from: classes.dex */
public final class C5791a {

    /* JADX INFO: renamed from: a */
    public long f34996a = 0;

    /* JADX INFO: renamed from: b */
    public long f34997b = 0;

    /* JADX INFO: renamed from: c */
    public boolean f34998c = false;

    /* JADX INFO: renamed from: a */
    public final synchronized C5792b m12179a() {
        synchronized (this) {
            try {
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (this.f34996a < 0) {
            return new C5792b(0L, false, false);
        }
        synchronized (this) {
            boolean z10 = this.f34996a == 0;
            if (z10) {
                return new C5792b(0L, true, true);
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j10 = this.f34997b;
            long j11 = this.f34996a;
            if (jElapsedRealtime >= j10 + j11) {
                this.f34997b = jElapsedRealtime;
                this.f34998c = false;
            }
            if (this.f34998c) {
                return new C5792b(Math.max(0L, (this.f34997b + j11) - SystemClock.elapsedRealtime()), false, true);
            }
            this.f34998c = true;
            return new C5792b(0L, true, true);
        }
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m12180b(long j10) {
        try {
            this.f34996a = j10;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (jElapsedRealtime >= this.f34997b + this.f34996a) {
                this.f34997b = jElapsedRealtime;
                this.f34998c = false;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
