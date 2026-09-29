package com.google.android.gms.internal.measurement;

import com.kochava.tracker.BuildConfig;
import java.io.IOException;
import java.util.logging.Level;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.v5 */
/* JADX INFO: loaded from: classes.dex */
public final class C2874v5 extends AbstractC2887w5 {

    /* JADX INFO: renamed from: S */
    public final byte[] f14474S;

    /* JADX INFO: renamed from: T */
    public final int f14475T;

    /* JADX INFO: renamed from: U */
    public int f14476U;

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public C2874v5(byte[] bArr, int i10) {
        super(0);
        int length = bArr.length;
        if (((length - i10) | i10) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i10)));
        }
        this.f14474S = bArr;
        this.f14476U = 0;
        this.f14475T = i10;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2887w5
    /* JADX INFO: renamed from: A1 */
    public final void mo8308A1(int i10, long j10) throws IOException {
        mo8315H1((i10 << 3) | 1);
        mo8309B1(j10);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.google.android.gms.internal.measurement.AbstractC2887w5
    /* JADX INFO: renamed from: B1 */
    public final void mo8309B1(long j10) throws IOException {
        try {
            byte[] bArr = this.f14474S;
            int i10 = this.f14476U;
            int i11 = i10 + 1;
            bArr[i10] = (byte) (((int) j10) & 255);
            int i12 = i11 + 1;
            bArr[i11] = (byte) (((int) (j10 >> 8)) & 255);
            int i13 = i12 + 1;
            bArr[i12] = (byte) (((int) (j10 >> 16)) & 255);
            int i14 = i13 + 1;
            bArr[i13] = (byte) (((int) (j10 >> 24)) & 255);
            int i15 = i14 + 1;
            bArr[i14] = (byte) (((int) (j10 >> 32)) & 255);
            int i16 = i15 + 1;
            bArr[i15] = (byte) (((int) (j10 >> 40)) & 255);
            int i17 = i16 + 1;
            bArr[i16] = (byte) (((int) (j10 >> 48)) & 255);
            this.f14476U = i17 + 1;
            bArr[i17] = (byte) (((int) (j10 >> 56)) & 255);
        } catch (IndexOutOfBoundsException e10) {
            throw new zzkg(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f14476U), Integer.valueOf(this.f14475T), 1), e10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2887w5
    /* JADX INFO: renamed from: C1 */
    public final void mo8310C1(int i10, int i11) throws IOException {
        mo8315H1(i10 << 3);
        mo8311D1(i11);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2887w5
    /* JADX INFO: renamed from: D1 */
    public final void mo8311D1(int i10) throws IOException {
        if (i10 >= 0) {
            mo8315H1(i10);
        } else {
            mo8317J1(i10);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.google.android.gms.internal.measurement.AbstractC2887w5
    /* JADX INFO: renamed from: E1 */
    public final void mo8312E1(String str, int i10) throws IOException {
        mo8315H1((i10 << 3) | 2);
        int i11 = this.f14476U;
        try {
            int iM8334N1 = AbstractC2887w5.m8334N1(str.length() * 3);
            int iM8334N2 = AbstractC2887w5.m8334N1(str.length());
            int i12 = this.f14475T;
            byte[] bArr = this.f14474S;
            if (iM8334N2 == iM8334N1) {
                int i13 = i11 + iM8334N2;
                this.f14476U = i13;
                int iM8262b = C2851t8.m8262b(str, bArr, i13, i12 - i13);
                this.f14476U = i11;
                mo8315H1((iM8262b - i11) - iM8334N2);
                this.f14476U = iM8262b;
            } else {
                mo8315H1(C2851t8.m8263c(str));
                int i14 = this.f14476U;
                this.f14476U = C2851t8.m8262b(str, bArr, i14, i12 - i14);
            }
        } catch (zzny e10) {
            this.f14476U = i11;
            AbstractC2887w5.f14492Q.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e10);
            byte[] bytes = str.getBytes(C2849t6.f14439a);
            try {
                int length = bytes.length;
                mo8315H1(length);
                m8319Q1(bytes, length);
            } catch (IndexOutOfBoundsException e11) {
                throw new zzkg(e11);
            }
        } catch (IndexOutOfBoundsException e12) {
            throw new zzkg(e12);
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2887w5
    /* JADX INFO: renamed from: F1 */
    public final void mo8313F1(int i10, int i11) throws IOException {
        mo8315H1((i10 << 3) | i11);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2887w5
    /* JADX INFO: renamed from: G1 */
    public final void mo8314G1(int i10, int i11) throws IOException {
        mo8315H1(i10 << 3);
        mo8315H1(i11);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2887w5
    /* JADX INFO: renamed from: H1 */
    public final void mo8315H1(int i10) throws IOException {
        while (true) {
            int i11 = i10 & (-128);
            byte[] bArr = this.f14474S;
            if (i11 == 0) {
                int i12 = this.f14476U;
                this.f14476U = i12 + 1;
                bArr[i12] = (byte) i10;
                return;
            } else {
                try {
                    int i13 = this.f14476U;
                    this.f14476U = i13 + 1;
                    bArr[i13] = (byte) ((i10 & 127) | BuildConfig.SDK_TRUNCATE_LENGTH);
                    i10 >>>= 7;
                } catch (IndexOutOfBoundsException e10) {
                    throw new zzkg(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f14476U), Integer.valueOf(this.f14475T), 1), e10);
                }
            }
            throw new zzkg(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f14476U), Integer.valueOf(this.f14475T), 1), e10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2887w5
    /* JADX INFO: renamed from: I1 */
    public final void mo8316I1(int i10, long j10) throws IOException {
        mo8315H1(i10 << 3);
        mo8317J1(j10);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2887w5
    /* JADX INFO: renamed from: J1 */
    public final void mo8317J1(long j10) throws IOException {
        boolean z10 = AbstractC2887w5.f14493R;
        int i10 = this.f14475T;
        byte[] bArr = this.f14474S;
        if (!z10 || i10 - this.f14476U < 10) {
            while ((j10 & (-128)) != 0) {
                try {
                    int i11 = this.f14476U;
                    this.f14476U = i11 + 1;
                    bArr[i11] = (byte) ((((int) j10) & 127) | BuildConfig.SDK_TRUNCATE_LENGTH);
                    j10 >>>= 7;
                } catch (IndexOutOfBoundsException e10) {
                    throw new zzkg(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f14476U), Integer.valueOf(i10), 1), e10);
                }
            }
            int i12 = this.f14476U;
            this.f14476U = i12 + 1;
            bArr[i12] = (byte) j10;
            return;
        }
        while ((j10 & (-128)) != 0) {
            int i13 = this.f14476U;
            this.f14476U = i13 + 1;
            C2812q8.f14401c.mo8130d(bArr, C2812q8.f14404f + i13, (byte) ((((int) j10) & 127) | BuildConfig.SDK_TRUNCATE_LENGTH));
            j10 >>>= 7;
        }
        int i14 = this.f14476U;
        this.f14476U = i14 + 1;
        C2812q8.f14401c.mo8130d(bArr, C2812q8.f14404f + ((long) i14), (byte) j10);
    }

    /* JADX INFO: renamed from: P1 */
    public final int m8318P1() {
        return this.f14475T - this.f14476U;
    }

    /* JADX INFO: renamed from: Q1 */
    public final void m8319Q1(byte[] bArr, int i10) throws IOException {
        try {
            System.arraycopy(bArr, 0, this.f14474S, this.f14476U, i10);
            this.f14476U += i10;
        } catch (IndexOutOfBoundsException e10) {
            throw new zzkg(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f14476U), Integer.valueOf(this.f14475T), Integer.valueOf(i10)), e10);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.google.android.gms.internal.measurement.AbstractC2887w5
    /* JADX INFO: renamed from: v1 */
    public final void mo8320v1(byte b10) throws IOException {
        try {
            byte[] bArr = this.f14474S;
            int i10 = this.f14476U;
            this.f14476U = i10 + 1;
            bArr[i10] = b10;
        } catch (IndexOutOfBoundsException e10) {
            throw new zzkg(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f14476U), Integer.valueOf(this.f14475T), 1), e10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2887w5
    /* JADX INFO: renamed from: w1 */
    public final void mo8321w1(int i10, boolean z10) throws IOException {
        mo8315H1(i10 << 3);
        mo8320v1(z10 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2887w5
    /* JADX INFO: renamed from: x1 */
    public final void mo8322x1(int i10, zzka zzkaVar) throws IOException {
        mo8315H1((i10 << 3) | 2);
        mo8315H1(zzkaVar.mo8492q());
        zzkaVar.mo8493C(this);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2887w5
    /* JADX INFO: renamed from: y1 */
    public final void mo8323y1(int i10, int i11) throws IOException {
        mo8315H1((i10 << 3) | 5);
        mo8324z1(i11);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2887w5
    /* JADX INFO: renamed from: z1 */
    public final void mo8324z1(int i10) throws IOException {
        try {
            byte[] bArr = this.f14474S;
            int i11 = this.f14476U;
            int i12 = i11 + 1;
            bArr[i11] = (byte) (i10 & 255);
            int i13 = i12 + 1;
            bArr[i12] = (byte) ((i10 >> 8) & 255);
            int i14 = i13 + 1;
            bArr[i13] = (byte) ((i10 >> 16) & 255);
            this.f14476U = i14 + 1;
            bArr[i14] = (byte) ((i10 >> 24) & 255);
        } catch (IndexOutOfBoundsException e10) {
            throw new zzkg(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f14476U), Integer.valueOf(this.f14475T), 1), e10);
        }
    }
}
