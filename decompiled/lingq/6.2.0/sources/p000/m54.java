package p000;

/* JADX INFO: loaded from: classes.dex */
public abstract class m54 {

    /* JADX INFO: renamed from: a */
    public static final long f50600a = m16632a(Float.NaN, Float.NaN);

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int f50601b = 0;

    /* JADX INFO: renamed from: a */
    public static long m16632a(float f, float f2) {
        return (((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    /* JADX INFO: renamed from: b */
    public static String m16633b(long j) {
        return "InlineDensity(density=" + Float.intBitsToFloat((int) (j >> 32)) + ", fontScale=" + Float.intBitsToFloat((int) (j & 4294967295L)) + ')';
    }
}
