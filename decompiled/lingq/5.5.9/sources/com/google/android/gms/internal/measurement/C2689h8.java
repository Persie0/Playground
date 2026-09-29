package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Logger;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.h8 */
/* JADX INFO: loaded from: classes.dex */
public final class C2689h8 {

    /* JADX INFO: renamed from: f */
    public static final C2689h8 f14234f = new C2689h8(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a */
    public int f14235a;

    /* JADX INFO: renamed from: b */
    public int[] f14236b;

    /* JADX INFO: renamed from: c */
    public Object[] f14237c;

    /* JADX INFO: renamed from: d */
    public int f14238d;

    /* JADX INFO: renamed from: e */
    public boolean f14239e;

    public C2689h8() {
        this(0, new int[8], new Object[8], true);
    }

    public C2689h8(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.f14238d = -1;
        this.f14235a = i10;
        this.f14236b = iArr;
        this.f14237c = objArr;
        this.f14239e = z10;
    }

    /* JADX INFO: renamed from: b */
    public static C2689h8 m7871b() {
        return new C2689h8(0, new int[8], new Object[8], true);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public final int m7872a() {
        int iM8335O1;
        int iM8334N1;
        int iM8334N2;
        int i10 = this.f14238d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f14235a; i12++) {
            int i13 = this.f14236b[i12];
            int i14 = i13 >>> 3;
            int i15 = i13 & 7;
            if (i15 != 0) {
                if (i15 == 1) {
                    ((Long) this.f14237c[i12]).longValue();
                    iM8334N2 = AbstractC2887w5.m8334N1(i14 << 3) + 8;
                } else if (i15 == 2) {
                    zzka zzkaVar = (zzka) this.f14237c[i12];
                    Logger logger = AbstractC2887w5.f14492Q;
                    int iMo8492q = zzkaVar.mo8492q();
                    iM8334N2 = AbstractC2887w5.m8334N1(i14 << 3) + AbstractC2887w5.m8334N1(iMo8492q) + iMo8492q;
                } else if (i15 == 3) {
                    int i16 = i14 << 3;
                    Logger logger2 = AbstractC2887w5.f14492Q;
                    iM8335O1 = ((C2689h8) this.f14237c[i12]).m7872a();
                    int iM8334N3 = AbstractC2887w5.m8334N1(i16);
                    iM8334N1 = iM8334N3 + iM8334N3;
                } else {
                    if (i15 != 5) {
                        int i17 = zzll.f14565a;
                        throw new IllegalStateException(new zzlk());
                    }
                    ((Integer) this.f14237c[i12]).intValue();
                    iM8334N2 = AbstractC2887w5.m8334N1(i14 << 3) + 4;
                }
                i11 += iM8334N2;
            } else {
                int i18 = i14 << 3;
                iM8335O1 = AbstractC2887w5.m8335O1(((Long) this.f14237c[i12]).longValue());
                iM8334N1 = AbstractC2887w5.m8334N1(i18);
            }
            iM8334N2 = iM8334N1 + iM8335O1;
            i11 += iM8334N2;
        }
        this.f14238d = i11;
        return i11;
    }

    /* JADX INFO: renamed from: c */
    public final void m7873c(int i10, Object obj) {
        if (!this.f14239e) {
            throw new UnsupportedOperationException();
        }
        m7875e(this.f14235a + 1);
        int[] iArr = this.f14236b;
        int i11 = this.f14235a;
        iArr[i11] = i10;
        this.f14237c[i11] = obj;
        this.f14235a = i11 + 1;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: d */
    public final void m7874d(C2900x5 c2900x5) throws IOException {
        if (this.f14235a != 0) {
            for (int i10 = 0; i10 < this.f14235a; i10++) {
                int i11 = this.f14236b[i10];
                Object obj = this.f14237c[i10];
                int i12 = i11 & 7;
                int i13 = i11 >>> 3;
                if (i12 == 0) {
                    c2900x5.m8425n(i13, ((Long) obj).longValue());
                } else if (i12 == 1) {
                    c2900x5.m8421j(i13, ((Long) obj).longValue());
                } else if (i12 == 2) {
                    c2900x5.m8417f(i13, (zzka) obj);
                } else if (i12 == 3) {
                    c2900x5.f14506a.mo8313F1(i13, 3);
                    ((C2689h8) obj).m7874d(c2900x5);
                    c2900x5.f14506a.mo8313F1(i13, 4);
                } else {
                    if (i12 != 5) {
                        int i14 = zzll.f14565a;
                        throw new RuntimeException(new zzlk());
                    }
                    c2900x5.m8420i(i13, ((Integer) obj).intValue());
                }
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m7875e(int i10) {
        int[] iArr = this.f14236b;
        if (i10 > iArr.length) {
            int i11 = this.f14235a;
            int i12 = (i11 / 2) + i11;
            if (i12 >= i10) {
                i10 = i12;
            }
            if (i10 < 8) {
                i10 = 8;
            }
            this.f14236b = Arrays.copyOf(iArr, i10);
            this.f14237c = Arrays.copyOf(this.f14237c, i10);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof C2689h8)) {
            C2689h8 c2689h8 = (C2689h8) obj;
            int i10 = this.f14235a;
            if (i10 == c2689h8.f14235a) {
                int[] iArr = this.f14236b;
                int[] iArr2 = c2689h8.f14236b;
                for (int i11 = 0; i11 < i10; i11++) {
                    if (iArr[i11] == iArr2[i11]) {
                    }
                }
                Object[] objArr = this.f14237c;
                Object[] objArr2 = c2689h8.f14237c;
                int i12 = this.f14235a;
                for (int i13 = 0; i13 < i12; i13++) {
                    if (objArr[i13].equals(objArr2[i13])) {
                    }
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f14235a;
        int i11 = i10 + 527;
        int[] iArr = this.f14236b;
        int iHashCode = 17;
        int i12 = 17;
        for (int i13 = 0; i13 < i10; i13++) {
            i12 = (i12 * 31) + iArr[i13];
        }
        int i14 = (i11 * 31) + i12;
        Object[] objArr = this.f14237c;
        int i15 = this.f14235a;
        for (int i16 = 0; i16 < i15; i16++) {
            iHashCode = (iHashCode * 31) + objArr[i16].hashCode();
        }
        return (i14 * 31) + iHashCode;
    }
}
