package p000;

/* JADX INFO: loaded from: classes.dex */
public abstract class gh8 {

    /* JADX INFO: renamed from: a */
    public static final zf1 f40823a = new zf1(new b98(11));

    /* JADX INFO: renamed from: b */
    public static final zf1 f40824b = new zf1(new vp6(23));

    /* JADX INFO: renamed from: c */
    public static final rh8 f40825c;

    /* JADX INFO: renamed from: d */
    public static final rh8 f40826d;

    static {
        long j = aa1.f412k;
        f40825c = new rh8(true, Float.NaN, j, null, true);
        f40826d = new rh8(false, Float.NaN, j, null, true);
    }

    /* JADX INFO: renamed from: a */
    public static rh8 m12656a(boolean z, float f, long j, o39 o39Var, int i) {
        if ((i & 1) != 0) {
            z = true;
        }
        boolean z2 = z;
        float f2 = (i & 2) != 0 ? Float.NaN : f;
        if ((i & 4) != 0) {
            j = aa1.f412k;
        }
        long j2 = j;
        if ((i & 8) != 0) {
            o39Var = null;
        }
        o39 o39Var2 = o39Var;
        if (xj2.m24560b(f2, Float.NaN) && aa1.m199c(j2, aa1.f412k) && o39Var2 == null) {
            return z2 ? f40825c : f40826d;
        }
        return new rh8(z2, f2, j2, o39Var2, true);
    }
}
