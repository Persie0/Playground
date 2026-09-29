package p000;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class kca implements hy2 {

    /* JADX INFO: renamed from: a */
    public final int f47034a;

    /* JADX INFO: renamed from: b */
    public final List f47035b;

    /* JADX INFO: renamed from: c */
    public final k47 f47036c = new k47(0, new byte[9400]);

    /* JADX INFO: renamed from: d */
    public final SparseIntArray f47037d;

    /* JADX INFO: renamed from: e */
    public final d40 f47038e;

    /* JADX INFO: renamed from: f */
    public final bn9 f47039f;

    /* JADX INFO: renamed from: g */
    public final SparseArray f47040g;

    /* JADX INFO: renamed from: h */
    public final SparseBooleanArray f47041h;

    /* JADX INFO: renamed from: i */
    public final SparseBooleanArray f47042i;

    /* JADX INFO: renamed from: j */
    public final xo7 f47043j;

    /* JADX INFO: renamed from: k */
    public l63 f47044k;

    /* JADX INFO: renamed from: l */
    public jy2 f47045l;

    /* JADX INFO: renamed from: m */
    public int f47046m;

    /* JADX INFO: renamed from: n */
    public boolean f47047n;

    /* JADX INFO: renamed from: o */
    public boolean f47048o;

    /* JADX INFO: renamed from: p */
    public boolean f47049p;

    /* JADX INFO: renamed from: q */
    public int f47050q;

    public kca(int i, bn9 bn9Var, g1a g1aVar, d40 d40Var) {
        this.f47038e = d40Var;
        this.f47034a = i;
        this.f47039f = bn9Var;
        this.f47035b = Collections.singletonList(g1aVar);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.f47041h = sparseBooleanArray;
        this.f47042i = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.f47040g = sparseArray;
        this.f47037d = new SparseIntArray();
        this.f47043j = new xo7(1);
        this.f47045l = jy2.f46384t;
        this.f47050q = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i2 = 0; i2 < size; i2++) {
            sparseArray.put(sparseArray2.keyAt(i2), (nca) sparseArray2.valueAt(i2));
        }
        sparseArray.put(0, new ot8(new p33(this)));
    }

    @Override // p000.hy2
    /* JADX INFO: renamed from: a */
    public final void mo109a() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12, types: [int] */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [int] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v0, types: [android.util.SparseArray] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [nca] */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [android.util.SparseBooleanArray] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    @Override // p000.hy2
    /* JADX INFO: renamed from: b */
    public final int mo110b(iy2 iy2Var, n63 n63Var) {
        iy2 iy2Var2;
        int i;
        ?? r1;
        ?? r7;
        nca ncaVar;
        boolean z;
        long jM4433b;
        long length = iy2Var.getLength();
        if (this.f47047n) {
            long j = -9223372036854775807L;
            xo7 xo7Var = this.f47043j;
            if (length != -1 && !xo7Var.f68438d) {
                int i2 = this.f47050q;
                g1a g1aVar = xo7Var.f68436b;
                k47 k47Var = xo7Var.f68437c;
                if (i2 <= 0) {
                    xo7Var.m24628a(iy2Var);
                    return 0;
                }
                if (xo7Var.f68440f) {
                    if (xo7Var.f68442h == -9223372036854775807L) {
                        xo7Var.m24628a(iy2Var);
                        return 0;
                    }
                    if (xo7Var.f68439e) {
                        long j2 = xo7Var.f68441g;
                        if (j2 == -9223372036854775807L) {
                            xo7Var.m24628a(iy2Var);
                            return 0;
                        }
                        xo7Var.f68443i = g1aVar.m12281c(xo7Var.f68442h) - g1aVar.m12280b(j2);
                        xo7Var.m24628a(iy2Var);
                        return 0;
                    }
                    int iMin = (int) Math.min(112800L, iy2Var.getLength());
                    if (iy2Var.getPosition() != 0) {
                        n63Var.f52394a = 0L;
                        return 1;
                    }
                    k47Var.m14815J(iMin);
                    iy2Var.mo13080i();
                    iy2Var.mo13085o(k47Var.f46700a, 0, iMin);
                    int i3 = k47Var.f46702c;
                    for (int i4 = k47Var.f46701b; i4 < i3; i4++) {
                        if (k47Var.f46700a[i4] == 71) {
                            jM4433b = c9d.m4433b(k47Var, i4, i2);
                            if (jM4433b != -9223372036854775807L) {
                                xo7Var.f68441g = jM4433b;
                                xo7Var.f68439e = true;
                                return 0;
                            }
                        }
                    }
                    jM4433b = -9223372036854775807L;
                    xo7Var.f68441g = jM4433b;
                    xo7Var.f68439e = true;
                    return 0;
                }
                long length2 = iy2Var.getLength();
                int iMin2 = (int) Math.min(112800L, length2);
                long j3 = length2 - ((long) iMin2);
                if (iy2Var.getPosition() != j3) {
                    n63Var.f52394a = j3;
                    return 1;
                }
                k47Var.m14815J(iMin2);
                iy2Var.mo13080i();
                iy2Var.mo13085o(k47Var.f46700a, 0, iMin2);
                int i5 = k47Var.f46701b;
                int i6 = k47Var.f46702c;
                for (int i7 = i6 - 188; i7 >= i5; i7--) {
                    byte[] bArr = k47Var.f46700a;
                    int i8 = 0;
                    for (int i9 = -4; i9 <= 4; i9++) {
                        int i10 = (i9 * 188) + i7;
                        if (i10 >= i5 && i10 < i6 && bArr[i10] == 71) {
                            i8++;
                            if (i8 == 5) {
                                long jM4433b2 = c9d.m4433b(k47Var, i7, i2);
                                if (jM4433b2 == -9223372036854775807L) {
                                    break;
                                }
                                j = jM4433b2;
                                break;
                            }
                        } else {
                            i8 = 0;
                        }
                    }
                }
                xo7Var.f68442h = j;
                xo7Var.f68440f = true;
                return 0;
            }
            if (this.f47048o) {
                i = 1;
                z = false;
            } else {
                this.f47048o = true;
                long j4 = xo7Var.f68443i;
                if (j4 != -9223372036854775807L) {
                    g1a g1aVar2 = xo7Var.f68436b;
                    int i11 = this.f47050q;
                    x24 x24Var = new x24();
                    C3299li c3299li = new C3299li();
                    c3299li.f49690a = i11;
                    c3299li.f49691b = g1aVar2;
                    c3299li.f49692c = new k47();
                    i = 1;
                    z = false;
                    l63 l63Var = new l63(x24Var, c3299li, j4, j4 + 1, 0L, length, 188L, 940);
                    this.f47044k = l63Var;
                    this.f47045l.mo2558q(l63Var.f49111a);
                } else {
                    z = false;
                    i = 1;
                    this.f47045l.mo2558q(new h60(j4));
                }
            }
            if (this.f47049p) {
                this.f47049p = z;
                mo112d(0L, 0L);
                if (iy2Var.getPosition() != 0) {
                    n63Var.f52394a = 0L;
                    return i;
                }
            }
            l63 l63Var2 = this.f47044k;
            if (l63Var2 != null && l63Var2.f49113c != null) {
                return l63Var2.m15826b(iy2Var, n63Var);
            }
            iy2Var2 = iy2Var;
            r1 = z;
        } else {
            iy2Var2 = iy2Var;
            i = 1;
            r1 = 0;
        }
        k47 k47Var2 = this.f47036c;
        byte[] bArr2 = k47Var2.f46700a;
        if (9400 - k47Var2.f46701b < 188) {
            int iM14820a = k47Var2.m14820a();
            if (iM14820a > 0) {
                System.arraycopy(bArr2, k47Var2.f46701b, bArr2, r1, iM14820a);
            }
            k47Var2.m14816K(iM14820a, bArr2);
        }
        while (true) {
            int iM14820a2 = k47Var2.m14820a();
            ?? r8 = this.f47040g;
            if (iM14820a2 >= 188) {
                int i12 = k47Var2.f46701b;
                int i13 = k47Var2.f46702c;
                byte[] bArr3 = k47Var2.f46700a;
                while (i12 < i13 && bArr3[i12] != 71) {
                    i12++;
                }
                k47Var2.m14818M(i12);
                int i14 = i12 + 188;
                int i15 = k47Var2.f46702c;
                if (i14 > i15) {
                    return r1;
                }
                int iM14829m = k47Var2.m14829m();
                if ((8388608 & iM14829m) != 0) {
                    k47Var2.m14818M(i14);
                    return r1;
                }
                ?? r6 = (4194304 & iM14829m) != 0 ? 1 : r1;
                int i16 = (2096896 & iM14829m) >> 8;
                ?? r9 = (iM14829m & 32) != 0 ? 1 : r1;
                if ((iM14829m & 16) != 0) {
                    ncaVar = (nca) r8.get(i16);
                } else {
                    r7 = 0;
                }
                if (r7 == 0) {
                    r7 = ncaVar;
                    k47Var2.m14818M(i14);
                    return r1;
                }
                int i17 = iM14829m & 15;
                SparseIntArray sparseIntArray = this.f47037d;
                int i18 = sparseIntArray.get(i16, i17 - 1);
                sparseIntArray.put(i16, i17);
                if (i18 == i17) {
                    r7 = ncaVar;
                    k47Var2.m14818M(i14);
                    return r1;
                }
                if (i17 != ((i18 + 1) & 15)) {
                    r7 = ncaVar;
                    r7.mo3477d();
                }
                if (r9 != 0) {
                    int iM14842z = k47Var2.m14842z();
                    r6 = (r6 == true ? 1 : 0) | ((k47Var2.m14842z() & 64) != 0 ? 2 : r1);
                    k47Var2.m14819N(iM14842z - 1);
                }
                boolean z2 = this.f47047n;
                if (z2 || !this.f47042i.get(i16, r1)) {
                    k47Var2.m14817L(i14);
                    r7.mo3474a(r6, k47Var2);
                    k47Var2.m14817L(i15);
                }
                if (!z2 && this.f47047n && length != -1) {
                    this.f47049p = true;
                }
                k47Var2.m14818M(i14);
                return r1;
            }
            int i19 = k47Var2.f46702c;
            int i20 = iy2Var2.read(bArr2, i19, 9400 - i19);
            if (i20 == -1) {
                for (?? r10 = r1; r10 < r8.size(); r10++) {
                    nca ncaVar2 = (nca) r8.valueAt(r10);
                    if (ncaVar2 instanceof b87) {
                        b87 b87Var = (b87) ncaVar2;
                        if (b87Var.f8112c == 3 && b87Var.f8119j == -1) {
                            b87Var.mo3474a(i, new k47());
                        }
                    }
                    i = 1;
                }
                return -1;
            }
            k47Var2.m14817L(i19 + i20);
            i = 1;
        }
    }

    @Override // p000.hy2
    /* JADX INFO: renamed from: c */
    public final boolean mo111c(iy2 iy2Var) throws EOFException, InterruptedIOException {
        byte[] bArr = this.f47036c.f46700a;
        h62 h62Var = (h62) iy2Var;
        h62Var.mo13076d(bArr, 0, 940, false);
        for (int i = 0; i < 188; i++) {
            int i2 = 0;
            while (true) {
                if (i2 >= 5) {
                    h62Var.mo13075c(i, false);
                    return true;
                }
                if (bArr[(i2 * 188) + i] != 71) {
                    break;
                }
                i2++;
            }
        }
        return false;
    }

    @Override // p000.hy2
    /* JADX INFO: renamed from: d */
    public final void mo112d(long j, long j2) {
        l63 l63Var;
        long j3;
        SparseArray sparseArray = this.f47040g;
        List list = this.f47035b;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            g1a g1aVar = (g1a) list.get(i);
            synchronized (g1aVar) {
                j3 = g1aVar.f40052b;
            }
            boolean z = j3 == -9223372036854775807L;
            if (!z) {
                long jM12282d = g1aVar.m12282d();
                z = (jM12282d == -9223372036854775807L || jM12282d == 0 || jM12282d == j2) ? false : true;
            }
            if (z) {
                g1aVar.m12283e(j2);
            }
        }
        if (j2 != 0 && (l63Var = this.f47044k) != null) {
            l63Var.m15827d(j2);
        }
        this.f47036c.m14815J(0);
        this.f47037d.clear();
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            ((nca) sparseArray.valueAt(i2)).mo3477d();
        }
    }

    @Override // p000.hy2
    /* JADX INFO: renamed from: f */
    public final void mo113f(jy2 jy2Var) {
        if ((this.f47034a & 1) == 0) {
            jy2Var = new nc0(jy2Var, this.f47039f);
        }
        this.f47045l = jy2Var;
    }
}
