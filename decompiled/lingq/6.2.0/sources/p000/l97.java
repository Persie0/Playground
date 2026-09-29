package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class l97 {
    /* JADX INFO: renamed from: a */
    public static m97 m16033a(Double d, Double d2) {
        if (d == null || d2 == null || Math.abs(d.doubleValue()) > Double.MAX_VALUE || Math.abs(d2.doubleValue()) > Double.MAX_VALUE) {
            return null;
        }
        long jM21694U = ss5.m21694U(d.doubleValue() * 1000.0d);
        long jM21694U2 = ss5.m21694U(d2.doubleValue() * 1000.0d);
        if (jM21694U < 0 || jM21694U2 <= jM21694U) {
            return null;
        }
        return new m97(jM21694U, jM21694U2);
    }
}
