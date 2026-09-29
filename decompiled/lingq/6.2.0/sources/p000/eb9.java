package p000;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;

/* JADX INFO: loaded from: classes.dex */
public abstract class eb9 {
    /* JADX INFO: renamed from: a */
    public static final int m11010a(ArrayList arrayList, int i, int i2) {
        int iM11014e = m11014e(arrayList, i, i2);
        return iM11014e >= 0 ? iM11014e : -(iM11014e + 1);
    }

    /* JADX INFO: renamed from: b */
    public static final int m11011b(int[] iArr, int i) {
        int i2 = i * 5;
        return Integer.bitCount(iArr[i2 + 1] >> 28) + iArr[i2 + 4];
    }

    /* JADX INFO: renamed from: c */
    public static final void m11012c(int i, int i2, int[] iArr) {
        if (i2 >= 0) {
        }
        int i3 = (i * 5) + 1;
        iArr[i3] = i2 | (iArr[i3] & (-67108864));
    }

    /* JADX INFO: renamed from: d */
    public static final cb9 m11013d(cb9 cb9Var) {
        if (!(cb9Var instanceof cb9)) {
            cb9Var = null;
        }
        if (cb9Var != null) {
            return cb9Var;
        }
        cf1.m4606b("Inconsistent composition");
        C3386nv.m17631r();
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static final int m11014e(ArrayList arrayList, int i, int i2) {
        int size = arrayList.size() - 1;
        int i3 = 0;
        while (i3 <= size) {
            int i4 = (i3 + size) >>> 1;
            int i5 = ((oj3) arrayList.get(i4)).f54459a;
            if (i5 < 0) {
                i5 += i2;
            }
            int iM11651m = fa4.m11651m(i5, i);
            if (iM11651m < 0) {
                i3 = i4 + 1;
            } else {
                if (iM11651m <= 0) {
                    return i4;
                }
                size = i4 - 1;
            }
        }
        return -(i3 + 1);
    }

    /* JADX INFO: renamed from: f */
    public static final void m11015f() {
        throw new ConcurrentModificationException();
    }
}
