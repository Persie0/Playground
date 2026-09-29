package p000;

/* JADX INFO: loaded from: classes.dex */
public abstract class bca {
    /* JADX INFO: renamed from: a */
    public static final Object[] m3609a(Object[] objArr, int i, Object obj, Object obj2) {
        Object[] objArr2 = new Object[objArr.length + 2];
        AbstractC3550rv.m20830X(0, i, 6, objArr, objArr2);
        AbstractC3550rv.m20826T(i + 2, i, objArr.length, objArr, objArr2);
        objArr2[i] = obj;
        objArr2[i + 1] = obj2;
        return objArr2;
    }

    /* JADX INFO: renamed from: b */
    public static final Object[] m3610b(Object[] objArr, int i) {
        Object[] objArr2 = new Object[objArr.length - 2];
        AbstractC3550rv.m20830X(0, i, 6, objArr, objArr2);
        AbstractC3550rv.m20826T(i, i + 2, objArr.length, objArr, objArr2);
        return objArr2;
    }

    /* JADX INFO: renamed from: c */
    public static final Object[] m3611c(Object[] objArr, int i) {
        Object[] objArr2 = new Object[objArr.length - 1];
        AbstractC3550rv.m20830X(0, i, 6, objArr, objArr2);
        AbstractC3550rv.m20826T(i, i + 1, objArr.length, objArr, objArr2);
        return objArr2;
    }

    /* JADX INFO: renamed from: e */
    public static final int m3612e(int i, int i2) {
        return (i >> i2) & 31;
    }

    /* JADX INFO: renamed from: f */
    public static final int m3613f(int i, int i2) {
        return (i >> i2) & 31;
    }

    /* JADX INFO: renamed from: j */
    public static void m3614j(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    /* JADX INFO: renamed from: d */
    public abstract void mo3615d();

    /* JADX INFO: renamed from: g */
    public abstract boolean mo3616g();

    /* JADX INFO: renamed from: h */
    public abstract void mo3617h(boolean z);

    /* JADX INFO: renamed from: i */
    public abstract void mo3618i(boolean z);
}
