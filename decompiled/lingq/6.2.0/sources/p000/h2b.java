package p000;

import androidx.media3.common.C0713b;
import androidx.media3.common.ParserException;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes2.dex */
public final class h2b implements i2b {

    /* JADX INFO: renamed from: m */
    public static final int[] f41718m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

    /* JADX INFO: renamed from: n */
    public static final int[] f41719n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

    /* JADX INFO: renamed from: a */
    public final jy2 f41720a;

    /* JADX INFO: renamed from: b */
    public final n8a f41721b;

    /* JADX INFO: renamed from: c */
    public final l47 f41722c;

    /* JADX INFO: renamed from: d */
    public final int f41723d;

    /* JADX INFO: renamed from: e */
    public final byte[] f41724e;

    /* JADX INFO: renamed from: f */
    public final k47 f41725f;

    /* JADX INFO: renamed from: g */
    public final int f41726g;

    /* JADX INFO: renamed from: h */
    public final C0713b f41727h;

    /* JADX INFO: renamed from: i */
    public int f41728i;

    /* JADX INFO: renamed from: j */
    public long f41729j;

    /* JADX INFO: renamed from: k */
    public int f41730k;

    /* JADX INFO: renamed from: l */
    public long f41731l;

    public h2b(jy2 jy2Var, n8a n8aVar, l47 l47Var) throws ParserException {
        this.f41720a = jy2Var;
        this.f41721b = n8aVar;
        this.f41722c = l47Var;
        int i = l47Var.f49039b;
        int iMax = Math.max(1, i / 10);
        this.f41726g = iMax;
        k47 k47Var = new k47(l47Var.f49042e);
        k47Var.m14835s();
        int iM14835s = k47Var.m14835s();
        this.f41723d = iM14835s;
        int i2 = l47Var.f49038a;
        int i3 = l47Var.f49040c;
        int i4 = (((i3 - (i2 * 4)) * 8) / (l47Var.f49041d * i2)) + 1;
        if (iM14835s != i4) {
            throw ParserException.m2516a(null, "Expected frames per block: " + i4 + "; got: " + iM14835s);
        }
        int iM22810e = uma.m22810e(iMax, iM14835s);
        this.f41724e = new byte[iM22810e * i3];
        this.f41725f = new k47(iM14835s * 2 * i2 * iM22810e);
        int i5 = ((i3 * i) * 8) / iM14835s;
        lc3 lc3Var = new lc3();
        lc3Var.f49453n = ez5.m11402l("audio/raw");
        lc3Var.f49447h = i5;
        lc3Var.f49448i = i5;
        lc3Var.f49454o = iMax * 2 * i2;
        lc3Var.f49430F = i2;
        lc3Var.f49431G = i;
        lc3Var.f49432H = 2;
        this.f41727h = new C0713b(lc3Var);
    }

    @Override // p000.i2b
    /* JADX INFO: renamed from: a */
    public final void mo13011a(long j) {
        this.f41728i = 0;
        this.f41729j = j;
        this.f41730k = 0;
        this.f41731l = 0L;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004a  */
    /* JADX WARN: Code duplicated, block: B:19:0x004f  */
    /* JADX WARN: Code duplicated, block: B:22:0x0054  */
    /* JADX WARN: Code duplicated, block: B:25:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:27:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:28:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:31:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:37:0x0135  */
    /* JADX WARN: Code duplicated, block: B:43:0x0045 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x010b A[EDGE_INSN: B:47:0x010b->B:35:0x010b BREAK  A[LOOP:1: B:17:0x004b->B:34:0x0101], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x00cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x003c -> B:4:0x0020). Please report as a decompilation issue!!! */
    @Override // p000.i2b
    /* JADX INFO: renamed from: b */
    public final boolean mo13012b(iy2 iy2Var, long j) {
        byte[] bArr;
        int i;
        int i2;
        int i3;
        k47 k47Var;
        int i4;
        int i5;
        int i6;
        byte[] bArr2;
        int i7;
        int i8;
        int iM22812g;
        int iMin;
        int[] iArr;
        int i9;
        int i10;
        int i11;
        byte b;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18 = this.f41730k;
        l47 l47Var = this.f41722c;
        int i19 = i18 / (l47Var.f49038a * 2);
        int i20 = this.f41726g;
        int i21 = this.f41723d;
        int iM22810e = uma.m22810e(i20 - i19, i21);
        int i22 = l47Var.f49040c;
        int i23 = iM22810e * i22;
        boolean z = j == 0;
        while (true) {
            bArr = this.f41724e;
            if (z && (i16 = this.f41728i) < i23) {
                i17 = iy2Var.read(bArr, this.f41728i, (int) Math.min(i23 - i16, j));
                if (i17 == -1) {
                    break;
                }
                this.f41728i += i17;
                bArr = this.f41724e;
                if (z) {
                }
            }
            i = this.f41728i / i22;
            if (i > 0) {
                i3 = 0;
                while (true) {
                    k47Var = this.f41725f;
                    if (i3 < i) {
                        break;
                    }
                    i5 = 0;
                    while (true) {
                        i6 = l47Var.f49038a;
                        if (i5 < i6) {
                            bArr2 = k47Var.f46700a;
                            int i24 = (i5 * 4) + (i3 * i22);
                            i7 = (i6 * 4) + i24;
                            i8 = (i22 / i6) - 4;
                            iM22812g = (short) ((bArr[i24] & 255) | ((bArr[i24 + 1] & 255) << 8));
                            int i25 = i;
                            iMin = Math.min(bArr[i24 + 2] & 255, 88);
                            iArr = f41719n;
                            i9 = iArr[iMin];
                            i10 = ((i3 * i21 * i6) + i5) * 2;
                            bArr2[i10] = (byte) (iM22812g & 255);
                            bArr2[i10 + 1] = (byte) (iM22812g >> 8);
                            int i26 = i3;
                            i11 = 0;
                            while (i11 < i8 * 2) {
                                b = bArr[((i11 / 8) * i6 * 4) + i7 + ((i11 / 2) % 4)];
                                i12 = i11;
                                i13 = b & 255;
                                if (i12 % 2 == 0) {
                                    i14 = b & 15;
                                } else {
                                    i14 = i13 >> 4;
                                }
                                i15 = ((((i14 & 7) * 2) + 1) * i9) >> 3;
                                if ((i14 & 8) != 0) {
                                    i15 = -i15;
                                }
                                iM22812g = uma.m22812g(iM22812g + i15, -32768, 32767);
                                i10 = (i6 * 2) + i10;
                                bArr2[i10] = (byte) (iM22812g & 255);
                                bArr2[i10 + 1] = (byte) (iM22812g >> 8);
                                iMin = uma.m22812g(iMin + f41718m[i14], 0, 88);
                                i9 = iArr[iMin];
                                i11 = i12 + 1;
                            }
                            i5++;
                            i = i25;
                            i3 = i26;
                        }
                    }
                    i3++;
                }
                int i27 = i;
                int i28 = i21 * i27 * 2 * l47Var.f49038a;
                k47Var.m14818M(0);
                k47Var.m14817L(i28);
                this.f41728i -= i27 * i22;
                int i29 = k47Var.f46702c;
                this.f41721b.mo2535e(i29, k47Var);
                i4 = this.f41730k + i29;
                this.f41730k = i4;
                if (i4 / (l47Var.f49038a * 2) >= i20) {
                    m13014d(i20);
                }
            }
            if (z && (i2 = this.f41730k / (l47Var.f49038a * 2)) > 0) {
                m13014d(i2);
            }
            return z;
        }
        while (true) {
            bArr = this.f41724e;
            if (z) {
            }
            i = this.f41728i / i22;
            if (i > 0) {
                i3 = 0;
                while (true) {
                    k47Var = this.f41725f;
                    if (i3 < i) {
                        break;
                        break;
                    }
                    i5 = 0;
                    while (true) {
                        i6 = l47Var.f49038a;
                        if (i5 < i6) {
                            bArr2 = k47Var.f46700a;
                            int i210 = (i5 * 4) + (i3 * i22);
                            i7 = (i6 * 4) + i210;
                            i8 = (i22 / i6) - 4;
                            iM22812g = (short) ((bArr[i210] & 255) | ((bArr[i210 + 1] & 255) << 8));
                            int i211 = i;
                            iMin = Math.min(bArr[i210 + 2] & 255, 88);
                            iArr = f41719n;
                            i9 = iArr[iMin];
                            i10 = ((i3 * i21 * i6) + i5) * 2;
                            bArr2[i10] = (byte) (iM22812g & 255);
                            bArr2[i10 + 1] = (byte) (iM22812g >> 8);
                            int i212 = i3;
                            i11 = 0;
                            while (i11 < i8 * 2) {
                                b = bArr[((i11 / 8) * i6 * 4) + i7 + ((i11 / 2) % 4)];
                                i12 = i11;
                                i13 = b & 255;
                                if (i12 % 2 == 0) {
                                    i14 = b & 15;
                                } else {
                                    i14 = i13 >> 4;
                                }
                                i15 = ((((i14 & 7) * 2) + 1) * i9) >> 3;
                                if ((i14 & 8) != 0) {
                                    i15 = -i15;
                                }
                                iM22812g = uma.m22812g(iM22812g + i15, -32768, 32767);
                                i10 = (i6 * 2) + i10;
                                bArr2[i10] = (byte) (iM22812g & 255);
                                bArr2[i10 + 1] = (byte) (iM22812g >> 8);
                                iMin = uma.m22812g(iMin + f41718m[i14], 0, 88);
                                i9 = iArr[iMin];
                                i11 = i12 + 1;
                            }
                            i5++;
                            i = i211;
                            i3 = i212;
                        }
                    }
                    i3++;
                }
                int i213 = i;
                int i214 = i21 * i213 * 2 * l47Var.f49038a;
                k47Var.m14818M(0);
                k47Var.m14817L(i214);
                this.f41728i -= i213 * i22;
                int i215 = k47Var.f46702c;
                this.f41721b.mo2535e(i215, k47Var);
                i4 = this.f41730k + i215;
                this.f41730k = i4;
                if (i4 / (l47Var.f49038a * 2) >= i20) {
                    m13014d(i20);
                }
            }
            if (z) {
                m13014d(i2);
            }
            return z;
            this.f41728i += i17;
        }
    }

    @Override // p000.i2b
    /* JADX INFO: renamed from: c */
    public final void mo13013c(int i, long j) {
        l2b l2bVar = new l2b(this.f41722c, this.f41723d, i, j);
        this.f41720a.mo2558q(l2bVar);
        C0713b c0713b = this.f41727h;
        n8a n8aVar = this.f41721b;
        n8aVar.mo2537g(c0713b);
        n8aVar.mo2534d(l2bVar.f48948e);
    }

    /* JADX INFO: renamed from: d */
    public final void m13014d(int i) {
        long j = this.f41729j;
        long j2 = this.f41731l;
        l47 l47Var = this.f41722c;
        long j3 = l47Var.f49039b;
        String str = uma.f64080a;
        long jM22803H = j + uma.m22803H(j2, 1000000L, j3, RoundingMode.DOWN);
        int i2 = i * 2 * l47Var.f49038a;
        this.f41721b.mo2531a(jM22803H, 1, i2, this.f41730k - i2, null);
        this.f41731l += (long) i;
        this.f41730k -= i2;
    }
}
