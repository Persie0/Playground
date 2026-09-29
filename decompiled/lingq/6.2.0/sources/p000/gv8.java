package p000;

/* JADX INFO: loaded from: classes.dex */
public abstract class gv8 {

    /* JADX INFO: renamed from: a */
    public static final C2970en f41396a = new C2970en(Float.NaN, Float.NaN);

    /* JADX INFO: renamed from: b */
    public static final jda f41397b = new jda(new qv7(22), new qv7(23));

    /* JADX INFO: renamed from: c */
    public static final long f41398c;

    /* JADX INFO: renamed from: d */
    public static final bg9 f41399d;

    static {
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.01f)) << 32) | (((long) Float.floatToRawIntBits(0.01f)) & 4294967295L);
        f41398c = jFloatToRawIntBits;
        f41399d = new bg9(new gq6(jFloatToRawIntBits));
    }
}
