package p000;

/* JADX INFO: renamed from: xh */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C1119xh {

    /* JADX INFO: renamed from: a */
    public static final Object f48009a = new Object();

    /* JADX INFO: renamed from: a */
    public static final Object m19566a(C1118xg c1118xg, int i) {
        Object obj;
        int iM19568a = C1120xi.m19568a(c1118xg.f48006b, c1118xg.f48008d, i);
        if (iM19568a < 0 || (obj = c1118xg.f48007c[iM19568a]) == f48009a) {
            return null;
        }
        return obj;
    }

    /* JADX INFO: renamed from: b */
    public static final void m19567b(C1118xg c1118xg) {
        int i = c1118xg.f48008d;
        int[] iArr = c1118xg.f48006b;
        Object[] objArr = c1118xg.f48007c;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f48009a) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        c1118xg.f48005a = false;
        c1118xg.f48008d = i2;
    }
}
