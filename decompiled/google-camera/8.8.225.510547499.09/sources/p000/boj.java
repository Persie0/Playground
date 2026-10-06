package p000;

import android.os.SystemClock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class boj {

    /* JADX INFO: renamed from: a */
    private static final boo f4010a = new boo("CamStateHolder");

    /* JADX INFO: renamed from: b */
    private int f4011b;

    /* JADX INFO: renamed from: c */
    private boolean f4012c;

    public boj() {
        m2802c(1);
        this.f4012c = false;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized int m2800a() {
        return this.f4011b;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m2801b() {
        this.f4012c = true;
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m2802c(int i) {
        if (this.f4011b != i) {
            boo booVar = f4010a;
            Integer.toBinaryString(i);
            bop.m2818g(booVar);
        }
        this.f4011b = i;
        notifyAll();
    }

    /* JADX INFO: renamed from: d */
    public final synchronized boolean m2803d() {
        return this.f4012c;
    }

    /* JADX INFO: renamed from: e */
    public final void m2804e(int i) {
        boo booVar = f4010a;
        Integer.toBinaryString(i);
        bop.m2818g(booVar);
        long jUptimeMillis = SystemClock.uptimeMillis() + 3500;
        synchronized (this) {
            while ((m2800a() | i) != i) {
                try {
                    wait(3500L);
                } catch (InterruptedException e) {
                    if (SystemClock.uptimeMillis() > jUptimeMillis) {
                        bop.m2814c(f4010a, "Timeout waiting.");
                    }
                    return;
                }
            }
        }
    }
}
