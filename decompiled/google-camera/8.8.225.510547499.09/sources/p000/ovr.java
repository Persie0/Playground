package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ovr {

    /* JADX INFO: renamed from: a */
    public static final oxz f46682a = new oxz("NO_VALUE");

    /* JADX INFO: renamed from: a */
    public static final Object m19104a(Object[] objArr, long j) {
        return objArr[((int) j) & (objArr.length - 1)];
    }

    /* JADX INFO: renamed from: b */
    public static final void m19105b(Object[] objArr, long j, Object obj) {
        objArr[((int) j) & (objArr.length - 1)] = obj;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ ovl m19106c(int i, int i2, int i3) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        int i4 = i & ((i3 & 1) ^ 1);
        return new ovq(i4, i2 + i4);
    }
}
