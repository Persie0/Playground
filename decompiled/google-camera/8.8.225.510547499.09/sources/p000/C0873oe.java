package p000;

import java.util.ConcurrentModificationException;

/* JADX INFO: renamed from: oe */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C0873oe {
    /* JADX INFO: renamed from: a */
    public static final int m18403a(C1112xa c1112xa, int i) {
        try {
            return C1120xi.m19568a(c1112xa.f47983a, c1112xa.f47985c, i);
        } catch (IndexOutOfBoundsException e) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX INFO: renamed from: b */
    public static final int m18404b(C1112xa c1112xa, Object obj, int i) {
        int i2 = c1112xa.f47985c;
        if (i2 == 0) {
            return -1;
        }
        int iM18403a = m18403a(c1112xa, i);
        if (iM18403a < 0 || ooc.m18737c(obj, c1112xa.f47984b[iM18403a])) {
            return iM18403a;
        }
        int i3 = iM18403a + 1;
        while (i3 < i2 && c1112xa.f47983a[i3] == i) {
            if (ooc.m18737c(obj, c1112xa.f47984b[i3])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = iM18403a - 1; i4 >= 0 && c1112xa.f47983a[i4] == i; i4--) {
            if (ooc.m18737c(obj, c1112xa.f47984b[i4])) {
                return i4;
            }
        }
        return i3 ^ (-1);
    }

    /* JADX INFO: renamed from: c */
    public static final int m18405c(C1112xa c1112xa) {
        return m18404b(c1112xa, null, 0);
    }

    /* JADX INFO: renamed from: d */
    public static final void m18406d(C1112xa c1112xa, int i) {
        c1112xa.m19541d(new int[i]);
        c1112xa.m19540c(new Object[i]);
    }
}
