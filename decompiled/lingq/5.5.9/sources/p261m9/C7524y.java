package p261m9;

import java.lang.reflect.Array;
import p082e1.C5352b;
import p479xa.C10129a;

/* JADX INFO: renamed from: m9.y */
/* JADX INFO: loaded from: classes.dex */
public final class C7524y {

    /* JADX INFO: renamed from: a */
    public int f41535a;

    /* JADX INFO: renamed from: b */
    public int f41536b;

    /* JADX INFO: renamed from: c */
    public int f41537c;

    /* JADX INFO: renamed from: d */
    public final Object f41538d;

    public C7524y(int i10, int i11) {
        C5352b[] c5352bArr = new C5352b[i10];
        this.f41538d = c5352bArr;
        int length = c5352bArr.length;
        for (int i12 = 0; i12 < length; i12++) {
            ((C5352b[]) this.f41538d)[i12] = new C5352b(((i11 + 4) * 17) + 1, 3);
        }
        this.f41537c = i11 * 17;
        this.f41536b = i10;
        this.f41535a = -1;
    }

    public C7524y(byte[] bArr) {
        this.f41538d = bArr;
        this.f41535a = bArr.length;
    }

    /* JADX INFO: renamed from: a */
    public final C5352b m15026a() {
        return ((C5352b[]) this.f41538d)[this.f41535a];
    }

    /* JADX INFO: renamed from: b */
    public final byte[][] m15027b(int i10, int i11) {
        byte[][] bArr = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, this.f41536b * i11, this.f41537c * i10);
        int i12 = this.f41536b * i11;
        for (int i13 = 0; i13 < i12; i13++) {
            int i14 = (i12 - i13) - 1;
            byte[] bArr2 = (byte[]) ((C5352b[]) this.f41538d)[i13 / i11].f33657b;
            int length = bArr2.length * i10;
            byte[] bArr3 = new byte[length];
            for (int i15 = 0; i15 < length; i15++) {
                bArr3[i15] = bArr2[i15 / i10];
            }
            bArr[i14] = bArr3;
        }
        return bArr;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m15028c() {
        boolean z10 = (((((byte[]) this.f41538d)[this.f41536b] & 255) >> this.f41537c) & 1) == 1;
        m15030e(1);
        return z10;
    }

    /* JADX INFO: renamed from: d */
    public final int m15029d(int i10) {
        int i11 = this.f41536b;
        int iMin = Math.min(i10, 8 - this.f41537c);
        Object obj = this.f41538d;
        int i12 = i11 + 1;
        int i13 = ((((byte[]) obj)[i11] & 255) >> this.f41537c) & (255 >> (8 - iMin));
        while (iMin < i10) {
            i13 |= (((byte[]) obj)[i12] & 255) << iMin;
            iMin += 8;
            i12++;
        }
        int i14 = i13 & ((-1) >>> (32 - i10));
        m15030e(i10);
        return i14;
    }

    /* JADX INFO: renamed from: e */
    public final void m15030e(int i10) {
        int i11;
        int i12 = i10 / 8;
        int i13 = this.f41536b + i12;
        this.f41536b = i13;
        int i14 = (i10 - (i12 * 8)) + this.f41537c;
        this.f41537c = i14;
        boolean z10 = true;
        if (i14 > 7) {
            this.f41536b = i13 + 1;
            this.f41537c = i14 - 8;
        }
        int i15 = this.f41536b;
        if (i15 < 0 || (i15 >= (i11 = this.f41535a) && (i15 != i11 || this.f41537c != 0))) {
            z10 = false;
        }
        C10129a.m18992d(z10);
    }
}
