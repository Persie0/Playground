package pf;

import java.util.Arrays;

/* JADX INFO: renamed from: pf.b */
/* JADX INFO: loaded from: classes.dex */
public final class C8239b {

    /* JADX INFO: renamed from: a */
    public final CharSequence f44506a;

    /* JADX INFO: renamed from: b */
    public final int f44507b;

    /* JADX INFO: renamed from: c */
    public final int f44508c;

    /* JADX INFO: renamed from: d */
    public final byte[] f44509d;

    public C8239b(String str, int i10, int i11) {
        this.f44506a = str;
        this.f44508c = i10;
        this.f44507b = i11;
        byte[] bArr = new byte[i10 * i11];
        this.f44509d = bArr;
        Arrays.fill(bArr, (byte) -1);
    }

    /* JADX INFO: renamed from: a */
    public final void m16382a(int i10, int i11, int i12, int i13) {
        if (i10 < 0) {
            int i14 = this.f44507b;
            i10 += i14;
            i11 += 4 - ((i14 + 4) % 8);
        }
        int i15 = this.f44508c;
        if (i11 < 0) {
            i11 += i15;
            i10 += 4 - ((i15 + 4) % 8);
        }
        int i16 = 1;
        if ((this.f44506a.charAt(i12) & (1 << (8 - i13))) == 0) {
            i16 = 0;
        }
        this.f44509d[(i10 * i15) + i11] = (byte) i16;
    }

    /* JADX INFO: renamed from: b */
    public final void m16383b(int i10, int i11, int i12) {
        int i13 = i10 - 2;
        int i14 = i11 - 2;
        m16382a(i13, i14, i12, 1);
        int i15 = i11 - 1;
        m16382a(i13, i15, i12, 2);
        int i16 = i10 - 1;
        m16382a(i16, i14, i12, 3);
        m16382a(i16, i15, i12, 4);
        m16382a(i16, i11, i12, 5);
        m16382a(i10, i14, i12, 6);
        m16382a(i10, i15, i12, 7);
        m16382a(i10, i11, i12, 8);
    }
}
