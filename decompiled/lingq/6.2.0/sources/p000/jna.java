package p000;

/* JADX INFO: loaded from: classes.dex */
public abstract class jna {

    /* JADX INFO: renamed from: a */
    public static final long f45882a = i73.m13710a(0.0f, 0.0f);

    /* JADX INFO: renamed from: b */
    public static final float f45883b = 3.1415927f;

    /* JADX INFO: renamed from: a */
    public static final long m14561a(float f, float f2) {
        float fSqrt = (float) Math.sqrt((f2 * f2) + (f * f));
        if (fSqrt > 0.0f) {
            return i73.m13710a(f / fSqrt, f2 / fSqrt);
        }
        C3386nv.m17626m("Required distance greater than zero");
        return 0L;
    }

    /* JADX INFO: renamed from: b */
    public static final float m14562b(float f, float f2, float f3) {
        return (f3 * f2) + ((1.0f - f3) * f);
    }

    /* JADX INFO: renamed from: c */
    public static long m14563c(float f, float f2) {
        double d = f2;
        return do7.m10549y(do7.m10519F(f, i73.m13710a((float) Math.cos(d), (float) Math.sin(d))), f45882a);
    }
}
