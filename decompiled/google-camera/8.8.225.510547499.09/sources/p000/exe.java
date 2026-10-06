package p000;

import android.os.SystemClock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class exe {

    /* JADX INFO: renamed from: a */
    public boolean f20726a = true;

    /* JADX INFO: renamed from: b */
    private long f20727b;

    /* JADX INFO: renamed from: c */
    private double f20728c;

    /* JADX INFO: renamed from: a */
    public final double m7980a() {
        if (this.f20726a) {
            return 1.0d;
        }
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos() - this.f20727b;
        double d = this.f20728c;
        double d2 = jElapsedRealtimeNanos;
        Double.isNaN(d2);
        double dMin = Math.min(d, d2 / 1.0E9d) / this.f20728c;
        if (Math.abs((-1.0d) + dMin) < 1.0E-4d) {
            this.f20726a = true;
        }
        return 1.0d - Math.exp(dMin * (-6.5d));
    }

    /* JADX INFO: renamed from: b */
    public final void m7981b() {
        this.f20727b = SystemClock.elapsedRealtimeNanos();
        this.f20728c = 0.7d;
        this.f20726a = false;
    }
}
