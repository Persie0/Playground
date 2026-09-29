package p195j9;

import java.util.Arrays;
import p479xa.C10129a;

/* JADX INFO: renamed from: j9.n */
/* JADX INFO: loaded from: classes.dex */
public final class C6437n {

    /* JADX INFO: renamed from: a */
    public final int f36965a;

    /* JADX INFO: renamed from: b */
    public final int f36966b;

    /* JADX INFO: renamed from: c */
    public final float f36967c;

    /* JADX INFO: renamed from: d */
    public final float f36968d;

    /* JADX INFO: renamed from: e */
    public final float f36969e;

    /* JADX INFO: renamed from: f */
    public final int f36970f;

    /* JADX INFO: renamed from: g */
    public final int f36971g;

    /* JADX INFO: renamed from: h */
    public final int f36972h;

    /* JADX INFO: renamed from: i */
    public final short[] f36973i;

    /* JADX INFO: renamed from: j */
    public short[] f36974j;

    /* JADX INFO: renamed from: k */
    public int f36975k;

    /* JADX INFO: renamed from: l */
    public short[] f36976l;

    /* JADX INFO: renamed from: m */
    public int f36977m;

    /* JADX INFO: renamed from: n */
    public short[] f36978n;

    /* JADX INFO: renamed from: o */
    public int f36979o;

    /* JADX INFO: renamed from: p */
    public int f36980p;

    /* JADX INFO: renamed from: q */
    public int f36981q;

    /* JADX INFO: renamed from: r */
    public int f36982r;

    /* JADX INFO: renamed from: s */
    public int f36983s;

    /* JADX INFO: renamed from: t */
    public int f36984t;

    /* JADX INFO: renamed from: u */
    public int f36985u;

    /* JADX INFO: renamed from: v */
    public int f36986v;

    public C6437n(int i10, int i11, float f3, float f10, int i12) {
        this.f36965a = i10;
        this.f36966b = i11;
        this.f36967c = f3;
        this.f36968d = f10;
        this.f36969e = i10 / i12;
        this.f36970f = i10 / 400;
        int i13 = i10 / 65;
        this.f36971g = i13;
        int i14 = i13 * 2;
        this.f36972h = i14;
        this.f36973i = new short[i14];
        this.f36974j = new short[i14 * i11];
        this.f36976l = new short[i14 * i11];
        this.f36978n = new short[i14 * i11];
    }

    /* JADX INFO: renamed from: d */
    public static void m13061d(int i10, int i11, short[] sArr, int i12, short[] sArr2, int i13, short[] sArr3, int i14) {
        for (int i15 = 0; i15 < i11; i15++) {
            int i16 = (i12 * i11) + i15;
            int i17 = (i14 * i11) + i15;
            int i18 = (i13 * i11) + i15;
            for (int i19 = 0; i19 < i10; i19++) {
                sArr[i16] = (short) (((sArr3[i17] * i19) + ((i10 - i19) * sArr2[i18])) / i10);
                i16 += i11;
                i18 += i11;
                i17 += i11;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m13062a(short[] sArr, int i10, int i11) {
        int i12 = this.f36972h / i11;
        int i13 = this.f36966b;
        int i14 = i11 * i13;
        int i15 = i10 * i13;
        for (int i16 = 0; i16 < i12; i16++) {
            int i17 = 0;
            for (int i18 = 0; i18 < i14; i18++) {
                i17 += sArr[(i16 * i14) + i15 + i18];
            }
            this.f36973i[i16] = (short) (i17 / i14);
        }
    }

    /* JADX INFO: renamed from: b */
    public final short[] m13063b(short[] sArr, int i10, int i11) {
        int length = sArr.length;
        int i12 = this.f36966b;
        int i13 = length / i12;
        return i10 + i11 <= i13 ? sArr : Arrays.copyOf(sArr, (((i13 * 3) / 2) + i11) * i12);
    }

    /* JADX INFO: renamed from: c */
    public final int m13064c(short[] sArr, int i10, int i11, int i12) {
        int i13 = i10 * this.f36966b;
        int i14 = 255;
        int i15 = 1;
        int i16 = 0;
        int i17 = 0;
        while (i11 <= i12) {
            int iAbs = 0;
            for (int i18 = 0; i18 < i11; i18++) {
                iAbs += Math.abs(sArr[i13 + i18] - sArr[(i13 + i11) + i18]);
            }
            if (iAbs * i16 < i15 * i11) {
                i16 = i11;
                i15 = iAbs;
            }
            if (iAbs * i14 > i17 * i11) {
                i14 = i11;
                i17 = iAbs;
            }
            i11++;
        }
        this.f36985u = i15 / i16;
        this.f36986v = i17 / i14;
        return i16;
    }

    /* JADX INFO: renamed from: e */
    public final void m13065e() {
        int i10;
        int i11;
        float f3;
        int iM13064c;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19 = this.f36977m;
        float f10 = this.f36967c;
        float f11 = this.f36968d;
        float f12 = f10 / f11;
        float f13 = this.f36969e * f11;
        double d10 = f12;
        int i20 = this.f36965a;
        int i21 = this.f36966b;
        if (d10 > 1.00001d || d10 < 0.99999d) {
            int i22 = this.f36975k;
            int i23 = this.f36972h;
            if (i22 >= i23) {
                int i24 = 0;
                while (true) {
                    int i25 = this.f36982r;
                    if (i25 > 0) {
                        int iMin = Math.min(i23, i25);
                        short[] sArr = this.f36974j;
                        short[] sArrM13063b = m13063b(this.f36976l, this.f36977m, iMin);
                        this.f36976l = sArrM13063b;
                        i10 = i19;
                        System.arraycopy(sArr, i24 * i21, sArrM13063b, this.f36977m * i21, i21 * iMin);
                        this.f36977m += iMin;
                        this.f36982r -= iMin;
                        i24 += iMin;
                        f3 = f13;
                        i11 = i20;
                    } else {
                        i10 = i19;
                        short[] sArr2 = this.f36974j;
                        int i26 = i20 > 4000 ? i20 / 4000 : 1;
                        int i27 = this.f36971g;
                        int i28 = this.f36970f;
                        if (i21 == 1 && i26 == 1) {
                            iM13064c = m13064c(sArr2, i24, i28, i27);
                            f3 = f13;
                            i11 = i20;
                        } else {
                            m13062a(sArr2, i24, i26);
                            i11 = i20;
                            short[] sArr3 = this.f36973i;
                            f3 = f13;
                            int iM13064c2 = m13064c(sArr3, 0, i28 / i26, i27 / i26);
                            if (i26 != 1) {
                                int i29 = iM13064c2 * i26;
                                int i30 = i26 * 4;
                                int i31 = i29 - i30;
                                int i32 = i29 + i30;
                                if (i31 >= i28) {
                                    i28 = i31;
                                }
                                if (i32 <= i27) {
                                    i27 = i32;
                                }
                                if (i21 == 1) {
                                    iM13064c = m13064c(sArr2, i24, i28, i27);
                                } else {
                                    m13062a(sArr2, i24, 1);
                                    iM13064c = m13064c(sArr3, 0, i28, i27);
                                }
                            } else {
                                iM13064c = iM13064c2;
                            }
                        }
                        int i33 = this.f36985u;
                        int i34 = i33 != 0 && this.f36983s != 0 && this.f36986v <= i33 * 3 && i33 * 2 > this.f36984t * 3 ? this.f36983s : iM13064c;
                        this.f36984t = i33;
                        this.f36983s = iM13064c;
                        if (d10 > 1.0d) {
                            short[] sArr4 = this.f36974j;
                            if (f12 >= 2.0f) {
                                i13 = (int) (i34 / (f12 - 1.0f));
                            } else {
                                this.f36982r = (int) (((2.0f - f12) * i34) / (f12 - 1.0f));
                                i13 = i34;
                            }
                            short[] sArrM13063b2 = m13063b(this.f36976l, this.f36977m, i13);
                            this.f36976l = sArrM13063b2;
                            int i35 = i24;
                            m13061d(i13, this.f36966b, sArrM13063b2, this.f36977m, sArr4, i35, sArr4, i24 + i34);
                            this.f36977m += i13;
                            i24 = i34 + i13 + i35;
                        } else {
                            int i36 = i24;
                            short[] sArr5 = this.f36974j;
                            if (f12 < 0.5f) {
                                i12 = (int) ((i34 * f12) / (1.0f - f12));
                            } else {
                                this.f36982r = (int) ((((2.0f * f12) - 1.0f) * i34) / (1.0f - f12));
                                i12 = i34;
                            }
                            int i37 = i34 + i12;
                            short[] sArrM13063b3 = m13063b(this.f36976l, this.f36977m, i37);
                            this.f36976l = sArrM13063b3;
                            System.arraycopy(sArr5, i36 * i21, sArrM13063b3, this.f36977m * i21, i21 * i34);
                            m13061d(i12, this.f36966b, this.f36976l, this.f36977m + i34, sArr5, i36 + i34, sArr5, i36);
                            this.f36977m += i37;
                            i24 = i36 + i12;
                        }
                    }
                    if (i24 + i23 > i22) {
                        break;
                    }
                    i19 = i10;
                    i20 = i11;
                    f13 = f3;
                }
                int i38 = this.f36975k - i24;
                short[] sArr6 = this.f36974j;
                System.arraycopy(sArr6, i24 * i21, sArr6, 0, i21 * i38);
                this.f36975k = i38;
            }
            if (f3 != 1.0f || this.f36977m == (i14 = i10)) {
            }
            int i39 = i11;
            int i40 = (int) (i39 / f3);
            int i41 = i39;
            while (true) {
                if (i40 <= 16384 && i41 <= 16384) {
                    break;
                }
                i40 /= 2;
                i41 /= 2;
            }
            int i42 = this.f36977m - i14;
            short[] sArrM13063b4 = m13063b(this.f36978n, this.f36979o, i42);
            this.f36978n = sArrM13063b4;
            System.arraycopy(this.f36976l, i14 * i21, sArrM13063b4, this.f36979o * i21, i21 * i42);
            this.f36977m = i14;
            this.f36979o += i42;
            int i43 = 0;
            while (true) {
                i15 = this.f36979o;
                i16 = i15 - 1;
                if (i43 >= i16) {
                    break;
                }
                while (true) {
                    i17 = this.f36980p + 1;
                    int i44 = i17 * i40;
                    i18 = this.f36981q;
                    if (i44 <= i18 * i41) {
                        break;
                    }
                    this.f36976l = m13063b(this.f36976l, this.f36977m, 1);
                    for (int i45 = 0; i45 < i21; i45++) {
                        short[] sArr7 = this.f36976l;
                        int i46 = (this.f36977m * i21) + i45;
                        short[] sArr8 = this.f36978n;
                        int i47 = (i43 * i21) + i45;
                        short s10 = sArr8[i47];
                        short s11 = sArr8[i47 + i21];
                        int i48 = this.f36981q * i41;
                        int i49 = this.f36980p;
                        int i50 = i49 * i40;
                        int i51 = (i49 + 1) * i40;
                        int i52 = i51 - i48;
                        int i53 = i51 - i50;
                        sArr7[i46] = (short) ((((i53 - i52) * s11) + (s10 * i52)) / i53);
                    }
                    this.f36981q++;
                    this.f36977m++;
                }
                this.f36980p = i17;
                if (i17 == i41) {
                    this.f36980p = 0;
                    C10129a.m18992d(i18 == i40);
                    this.f36981q = 0;
                }
                i43++;
            }
            if (i16 == 0) {
                return;
            }
            short[] sArr9 = this.f36978n;
            System.arraycopy(sArr9, i16 * i21, sArr9, 0, (i15 - i16) * i21);
            this.f36979o -= i16;
            return;
        }
        short[] sArr10 = this.f36974j;
        int i54 = this.f36975k;
        short[] sArrM13063b5 = m13063b(this.f36976l, i19, i54);
        this.f36976l = sArrM13063b5;
        System.arraycopy(sArr10, 0 * i21, sArrM13063b5, this.f36977m * i21, i21 * i54);
        this.f36977m += i54;
        this.f36975k = 0;
        i10 = i19;
        f3 = f13;
        i11 = i20;
        if (f3 != 1.0f) {
        }
    }
}
