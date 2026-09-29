package p470x1;

import ae.C0062b;

/* JADX INFO: renamed from: x1.m */
/* JADX INFO: loaded from: classes.dex */
public final class C10025m {

    /* JADX INFO: renamed from: b */
    public static final long f50985b = C0062b.m388r(0.0f, 0.0f);

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ int f50986c = 0;

    /* JADX INFO: renamed from: a */
    public final long f50987a;

    /* JADX INFO: renamed from: a */
    public static long m18635a(long j10, float f3, float f10, int i10) {
        if ((i10 & 1) != 0) {
            f3 = m18636b(j10);
        }
        if ((i10 & 2) != 0) {
            f10 = m18637c(j10);
        }
        return C0062b.m388r(f3, f10);
    }

    /* JADX INFO: renamed from: b */
    public static final float m18636b(long j10) {
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    /* JADX INFO: renamed from: c */
    public static final float m18637c(long j10) {
        return Float.intBitsToFloat((int) (j10 & 4294967295L));
    }

    /* JADX INFO: renamed from: d */
    public static final long m18638d(long j10, long j11) {
        return C0062b.m388r(m18636b(j10) - m18636b(j11), m18637c(j10) - m18637c(j11));
    }

    /* JADX INFO: renamed from: e */
    public static final long m18639e(long j10, long j11) {
        return C0062b.m388r(m18636b(j11) + m18636b(j10), m18637c(j11) + m18637c(j10));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C10025m) {
            return this.f50987a == ((C10025m) obj).f50987a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f50987a);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("(");
        long j10 = this.f50987a;
        sb2.append(m18636b(j10));
        sb2.append(", ");
        sb2.append(m18637c(j10));
        sb2.append(") px/sec");
        return sb2.toString();
    }
}
