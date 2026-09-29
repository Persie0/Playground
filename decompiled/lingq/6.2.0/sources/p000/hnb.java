package p000;

import androidx.compose.runtime.internal.C0282a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class hnb {

    /* JADX INFO: renamed from: a */
    public static final C0282a f42671a = new C0282a(-1269727624, false, new jx0(17));

    /* JADX INFO: renamed from: a */
    public static long[] m13379a(long[]... jArr) {
        long length = 0;
        for (long[] jArr2 : jArr) {
            length += (long) jArr2.length;
        }
        int i = (int) length;
        bna.m3963n(length, "the total number of elements (%s) in the arrays must fit in an int", length == ((long) i));
        long[] jArr3 = new long[i];
        int length2 = 0;
        for (long[] jArr4 : jArr) {
            System.arraycopy(jArr4, 0, jArr3, length2, jArr4.length);
            length2 += jArr4.length;
        }
        return jArr3;
    }

    /* JADX INFO: renamed from: b */
    public static int m13380b(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* JADX INFO: renamed from: c */
    public static long m13381c(long... jArr) {
        bna.m3969q(jArr.length > 0);
        long j = jArr[0];
        for (int i = 1; i < jArr.length; i++) {
            long j2 = jArr[i];
            if (j2 > j) {
                j = j2;
            }
        }
        return j;
    }
}
