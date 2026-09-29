package p267n0;

import tl.C9322j;

/* JADX INFO: renamed from: n0.f */
/* JADX INFO: loaded from: classes.dex */
public final class C7675f {

    /* JADX INFO: renamed from: a */
    public int f42163a;

    /* JADX INFO: renamed from: b */
    public int[] f42164b = new int[16];

    /* JADX INFO: renamed from: c */
    public int[] f42165c = new int[16];

    /* JADX INFO: renamed from: d */
    public int[] f42166d;

    /* JADX INFO: renamed from: e */
    public int f42167e;

    public C7675f() {
        int[] iArr = new int[16];
        int i10 = 0;
        while (i10 < 16) {
            int i11 = i10 + 1;
            iArr[i10] = i11;
            i10 = i11;
        }
        this.f42166d = iArr;
    }

    /* JADX INFO: renamed from: a */
    public final int m15275a(int i10) {
        int i11 = this.f42163a + 1;
        int[] iArr = this.f42164b;
        int length = iArr.length;
        if (i11 > length) {
            int i12 = length * 2;
            int[] iArr2 = new int[i12];
            int[] iArr3 = new int[i12];
            C9322j.m17674b0(iArr, iArr2, 0, 14);
            C9322j.m17674b0(this.f42165c, iArr3, 0, 14);
            this.f42164b = iArr2;
            this.f42165c = iArr3;
        }
        int i13 = this.f42163a;
        this.f42163a = i13 + 1;
        int length2 = this.f42166d.length;
        if (this.f42167e >= length2) {
            int i14 = length2 * 2;
            int[] iArr4 = new int[i14];
            int i15 = 0;
            while (i15 < i14) {
                int i16 = i15 + 1;
                iArr4[i15] = i16;
                i15 = i16;
            }
            C9322j.m17674b0(this.f42166d, iArr4, 0, 14);
            this.f42166d = iArr4;
        }
        int i17 = this.f42167e;
        int[] iArr5 = this.f42166d;
        this.f42167e = iArr5[i17];
        int[] iArr6 = this.f42164b;
        iArr6[i13] = i10;
        this.f42165c[i13] = i17;
        iArr5[i17] = i13;
        int i18 = iArr6[i13];
        while (i13 > 0) {
            int i19 = ((i13 + 1) >> 1) - 1;
            if (iArr6[i19] <= i18) {
                break;
            }
            m15276b(i19, i13);
            i13 = i19;
        }
        return i17;
    }

    /* JADX INFO: renamed from: b */
    public final void m15276b(int i10, int i11) {
        int[] iArr = this.f42164b;
        int[] iArr2 = this.f42165c;
        int[] iArr3 = this.f42166d;
        int i12 = iArr[i10];
        iArr[i10] = iArr[i11];
        iArr[i11] = i12;
        int i13 = iArr2[i10];
        iArr2[i10] = iArr2[i11];
        iArr2[i11] = i13;
        iArr3[iArr2[i10]] = i10;
        iArr3[iArr2[i11]] = i11;
    }
}
