package p000;

import com.google.android.gms.measurement.internal.C1045d;

/* JADX INFO: loaded from: classes2.dex */
public final class o9d {

    /* JADX INFO: renamed from: a */
    public final C1045d f54093a;

    /* JADX INFO: renamed from: b */
    public int f54094b = 1;

    /* JADX INFO: renamed from: c */
    public long f54095c = m17882b();

    public o9d(C1045d c1045d) {
        this.f54093a = c1045d;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m17881a() {
        this.f54093a.mo5911c().getClass();
        return System.currentTimeMillis() >= this.f54095c;
    }

    /* JADX INFO: renamed from: b */
    public final long m17882b() {
        C1045d c1045d = this.f54093a;
        lda.m16130p(c1045d);
        long jLongValue = ((Long) z8c.f71205v.m21901a(null)).longValue();
        long jLongValue2 = ((Long) z8c.f71207w.m21901a(null)).longValue();
        for (int i = 1; i < this.f54094b; i++) {
            jLongValue += jLongValue;
            if (jLongValue >= jLongValue2) {
                break;
            }
        }
        c1045d.mo5911c().getClass();
        return Math.min(jLongValue, jLongValue2) + System.currentTimeMillis();
    }
}
