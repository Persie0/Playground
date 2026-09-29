package p000;

import androidx.media3.common.C0713b;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: s8 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3565s8 {

    /* JADX INFO: renamed from: a */
    public final j8a f60498a;

    /* JADX INFO: renamed from: b */
    public final int f60499b;

    /* JADX INFO: renamed from: c */
    public final int[] f60500c;

    /* JADX INFO: renamed from: d */
    public final C0713b[] f60501d;

    /* JADX INFO: renamed from: e */
    public int f60502e;

    public C3565s8(j8a j8aVar, int[] iArr) {
        C0713b[] c0713bArr;
        bna.m3987z(iArr.length > 0);
        j8aVar.getClass();
        C0713b[] c0713bArr2 = j8aVar.f45217d;
        this.f60498a = j8aVar;
        int length = iArr.length;
        this.f60499b = length;
        this.f60501d = new C0713b[length];
        int i = 0;
        while (true) {
            int length2 = iArr.length;
            c0713bArr = this.f60501d;
            if (i >= length2) {
                break;
            }
            c0713bArr[i] = c0713bArr2[iArr[i]];
            i++;
        }
        Arrays.sort(c0713bArr, new C3166k(2));
        this.f60500c = new int[this.f60499b];
        int i2 = 0;
        while (true) {
            int i3 = this.f60499b;
            if (i2 >= i3) {
                long[] jArr = new long[i3];
                return;
            }
            int[] iArr2 = this.f60500c;
            C0713b c0713b = this.f60501d[i2];
            int i4 = 0;
            while (true) {
                if (i4 >= c0713bArr2.length) {
                    i4 = -1;
                    break;
                } else if (c0713b == c0713bArr2[i4]) {
                    break;
                } else {
                    i4++;
                }
            }
            iArr2[i2] = i4;
            i2++;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m21150a(ArrayList arrayList, long[] jArr) {
        long j = 0;
        for (long j2 : jArr) {
            j += j2;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            c14 c14Var = (c14) arrayList.get(i);
            if (c14Var != null) {
                c14Var.m3157b(new C3526r8(j, jArr[i]));
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final C0713b m21151b(int i) {
        return this.f60501d[i];
    }

    /* JADX INFO: renamed from: c */
    public final C0713b m21152c() {
        return this.f60501d[0];
    }

    /* JADX INFO: renamed from: d */
    public final j8a m21153d() {
        return this.f60498a;
    }

    /* JADX INFO: renamed from: e */
    public final int m21154e() {
        return this.f60500c.length;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C3565s8 c3565s8 = (C3565s8) obj;
            if (this.f60498a.equals(c3565s8.f60498a) && Arrays.equals(this.f60500c, c3565s8.f60500c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f60502e == 0) {
            this.f60502e = Arrays.hashCode(this.f60500c) + (System.identityHashCode(this.f60498a) * 31);
        }
        return this.f60502e;
    }
}
