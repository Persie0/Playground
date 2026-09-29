package p000;

import java.net.URL;

/* JADX INFO: renamed from: zu */
/* JADX INFO: loaded from: classes.dex */
public final class C3846zu {

    /* JADX INFO: renamed from: a */
    public int f72164a;

    /* JADX INFO: renamed from: b */
    public long f72165b;

    /* JADX INFO: renamed from: c */
    public Object f72166c;

    public C3846zu(int i, URL url, long j) {
        this.f72164a = i;
        this.f72166c = url;
        this.f72165b = j;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001d  */
    /* JADX INFO: renamed from: a */
    public synchronized boolean m25788a() {
        boolean z;
        if (this.f72164a != 0) {
            ((ina) this.f72166c).f44331a.getClass();
            if (System.currentTimeMillis() > this.f72165b) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = true;
        }
        return z;
    }

    /* JADX INFO: renamed from: b */
    public synchronized void m25789b(int i) {
        long jMin;
        if ((i >= 200 && i < 300) || i == 401 || i == 404) {
            synchronized (this) {
                this.f72164a = 0;
            }
            return;
        }
        this.f72164a++;
        synchronized (this) {
            if (i == 429 || (i >= 500 && i < 600)) {
                double dPow = Math.pow(2.0d, this.f72164a);
                ((ina) this.f72166c).getClass();
                jMin = (long) Math.min(dPow + ((long) (Math.random() * 1000.0d)), 1800000.0d);
            } else {
                jMin = 86400000;
            }
            ((ina) this.f72166c).f44331a.getClass();
            this.f72165b = System.currentTimeMillis() + jMin;
        }
        return;
        throw th;
    }
}
