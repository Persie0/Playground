package p000;

/* JADX INFO: loaded from: classes.dex */
public abstract class a56 {

    /* JADX INFO: renamed from: a */
    public static final long f267a = d32.m10018P(14);

    /* JADX INFO: renamed from: a */
    public static final long m124a(long j, long j2) {
        if (!zx9.m25849d(j2)) {
            throw new IllegalArgumentException("The multiplier must be in em, but was " + ((Object) zx9.m25850e(j2)) + '.');
        }
        if (zx9.m25849d(j)) {
            C3386nv.m17629p("Cannot convert Em to Px when style.fontSize is Em (", zx9.m25850e(j2), "). Please declare the style.fontSize with Sp units instead.");
            return 0L;
        }
        long j3 = j & 1095216660480L;
        if (j3 != 0) {
            float fM25848c = zx9.m25848c(j2);
            d32.m10009G(j);
            return d32.m10032c0(zx9.m25848c(j) * fM25848c, j3);
        }
        float fM25848c2 = zx9.m25848c(j2);
        long j4 = f267a;
        d32.m10009G(j4);
        return d32.m10032c0(zx9.m25848c(j4) * fM25848c2, j4 & 1095216660480L);
    }
}
