package p000;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class t56 extends d84 {

    /* JADX INFO: renamed from: f */
    public int f61877f;

    public t56(int i) {
        this.f35143a = om8.f54590a;
        this.f35144b = m84.f50750a;
        this.f35145c = AbstractC3423or.f54766d;
        if (i >= 0) {
            m21847f(om8.m18111d(i));
        } else {
            C3386nv.m17626m("Capacity must be a positive value.");
            throw null;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m21844c() {
        this.f35147e = 0;
        long[] jArr = this.f35143a;
        if (jArr != om8.f54590a) {
            AbstractC3550rv.m20835c0(jArr, -9187201950435737472L);
            long[] jArr2 = this.f35143a;
            int i = this.f35146d;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        AbstractC3550rv.m20833a0(0, this.f35146d, null, this.f35145c);
        this.f61877f = om8.m18108a(this.f35146d) - this.f35147e;
    }

    /* JADX INFO: renamed from: d */
    public final int m21845d(int i) {
        long j;
        long j2;
        int i2;
        long j3;
        long[] jArr;
        int[] iArr;
        Object[] objArr;
        int i3 = -862048943;
        int iHashCode = Integer.hashCode(i) * (-862048943);
        int i4 = iHashCode ^ (iHashCode << 16);
        int i5 = i4 >>> 7;
        int i6 = i4 & 127;
        int i7 = this.f35146d;
        int i8 = i5 & i7;
        int i9 = 0;
        while (true) {
            long[] jArr2 = this.f35143a;
            int i10 = i8 >> 3;
            int i11 = (i8 & 7) << 3;
            int i12 = 1;
            long j4 = ((jArr2[i10 + 1] << (64 - i11)) & ((-i11) >> 63)) | (jArr2[i10] >>> i11);
            long j5 = i6;
            int i13 = i9;
            int i14 = 0;
            long j6 = j4 ^ (j5 * 72340172838076673L);
            long j7 = (~j6) & (j6 - 72340172838076673L) & (-9187201950435737472L);
            while (j7 != 0) {
                int iNumberOfTrailingZeros = (i8 + (Long.numberOfTrailingZeros(j7) >> 3)) & i7;
                int i15 = i3;
                int i16 = i14;
                if (this.f35144b[iNumberOfTrailingZeros] == i) {
                    return iNumberOfTrailingZeros;
                }
                j7 &= j7 - 1;
                i3 = i15;
                i14 = i16;
            }
            int i17 = i3;
            int i18 = i14;
            if ((((~j4) << 6) & j4 & (-9187201950435737472L)) != 0) {
                int iM21846e = m21846e(i5);
                long j8 = 255;
                if (this.f61877f != 0 || ((this.f35143a[iM21846e >> 3] >> ((iM21846e & 7) << 3)) & 255) == 254) {
                    j = 255;
                    j2 = j5;
                    i2 = 1;
                    j3 = 128;
                } else {
                    int i19 = this.f35146d;
                    if (i19 > 8) {
                        j3 = 128;
                        if (Long.compareUnsigned(((long) this.f35147e) * 32, ((long) i19) * 25) <= 0) {
                            long[] jArr3 = this.f35143a;
                            int i20 = this.f35146d;
                            int[] iArr2 = this.f35144b;
                            Object[] objArr2 = this.f35145c;
                            int i21 = (i20 + 7) >> 3;
                            int i22 = i18;
                            while (i22 < i21) {
                                long j9 = j8;
                                long j10 = jArr3[i22] & (-9187201950435737472L);
                                jArr3[i22] = (-72340172838076674L) & ((~j10) + (j10 >>> 7));
                                i22++;
                                j5 = j5;
                                j8 = j9;
                            }
                            j = j8;
                            j2 = j5;
                            int iM20841i0 = AbstractC3550rv.m20841i0(jArr3);
                            int i23 = iM20841i0 - 1;
                            long j11 = 72057594037927935L;
                            jArr3[i23] = (jArr3[i23] & 72057594037927935L) | (-72057594037927936L);
                            jArr3[iM20841i0] = jArr3[i18];
                            int i24 = i18;
                            while (i24 != i20) {
                                int i25 = i24 >> 3;
                                int i26 = (i24 & 7) << 3;
                                long j12 = (jArr3[i25] >> i26) & j;
                                if (j12 != 128 && j12 == 254) {
                                    int iHashCode2 = Integer.hashCode(iArr2[i24]) * i17;
                                    int i27 = iHashCode2 ^ (iHashCode2 << 16);
                                    int i28 = i27 >>> 7;
                                    int iM21846e2 = m21846e(i28);
                                    int i29 = i28 & i20;
                                    if (((iM21846e2 - i29) & i20) / 8 == ((i24 - i29) & i20) / 8) {
                                        long j13 = j11;
                                        jArr3[i25] = (((long) (i27 & 127)) << i26) | ((~(j << i26)) & jArr3[i25]);
                                        jArr3[jArr3.length - i12] = (jArr3[i18] & j13) | Long.MIN_VALUE;
                                        i24++;
                                        j11 = j13;
                                    } else {
                                        long j14 = j11;
                                        int i30 = iM21846e2 >> 3;
                                        long j15 = jArr3[i30];
                                        int i31 = (iM21846e2 & 7) << 3;
                                        if (((j15 >> i31) & j) == 128) {
                                            iArr = iArr2;
                                            objArr = objArr2;
                                            jArr3[i30] = ((~(j << i31)) & j15) | (((long) (i27 & 127)) << i31);
                                            jArr3[i25] = (jArr3[i25] & (~(j << i26))) | (128 << i26);
                                            iArr[iM21846e2] = iArr[i24];
                                            iArr[i24] = i18;
                                            objArr[iM21846e2] = objArr[i24];
                                            objArr[i24] = null;
                                        } else {
                                            iArr = iArr2;
                                            objArr = objArr2;
                                            jArr3[i30] = (((long) (i27 & 127)) << i31) | ((~(j << i31)) & j15);
                                            int i32 = iArr[iM21846e2];
                                            iArr[iM21846e2] = iArr[i24];
                                            iArr[i24] = i32;
                                            Object obj = objArr[iM21846e2];
                                            objArr[iM21846e2] = objArr[i24];
                                            objArr[i24] = obj;
                                            i24--;
                                        }
                                        jArr3[jArr3.length - 1] = (jArr3[i18] & j14) | Long.MIN_VALUE;
                                        i24++;
                                        j11 = j14;
                                        i12 = i12;
                                        iArr2 = iArr;
                                        objArr2 = objArr;
                                    }
                                } else {
                                    i24++;
                                }
                            }
                            i2 = i12;
                            this.f61877f = om8.m18108a(this.f35146d) - this.f35147e;
                        }
                        iM21846e = m21846e(i5);
                    } else {
                        j3 = 128;
                    }
                    j = 255;
                    j2 = j5;
                    i2 = 1;
                    int iM18109b = om8.m18109b(this.f35146d);
                    long[] jArr4 = this.f35143a;
                    int[] iArr3 = this.f35144b;
                    Object[] objArr3 = this.f35145c;
                    int i33 = this.f35146d;
                    m21847f(iM18109b);
                    long[] jArr5 = this.f35143a;
                    int[] iArr4 = this.f35144b;
                    Object[] objArr4 = this.f35145c;
                    int i34 = this.f35146d;
                    int i35 = i18;
                    while (i35 < i33) {
                        if (((jArr4[i35 >> 3] >> ((i35 & 7) << 3)) & 255) < j3) {
                            int i36 = iArr3[i35];
                            int iHashCode3 = Integer.hashCode(i36) * i17;
                            int i37 = iHashCode3 ^ (iHashCode3 << 16);
                            int iM21846e3 = m21846e(i37 >>> 7);
                            long j16 = i37 & 127;
                            int i38 = iM21846e3 >> 3;
                            int i39 = (iM21846e3 & 7) << 3;
                            jArr = jArr5;
                            long j17 = (jArr5[i38] & (~(255 << i39))) | (j16 << i39);
                            jArr[i38] = j17;
                            jArr[(((iM21846e3 - 7) & i34) + (i34 & 7)) >> 3] = j17;
                            iArr4[iM21846e3] = i36;
                            objArr4[iM21846e3] = objArr3[i35];
                        } else {
                            jArr = jArr5;
                        }
                        i35++;
                        jArr4 = jArr4;
                        jArr5 = jArr;
                    }
                    iM21846e = m21846e(i5);
                }
                this.f35147e++;
                int i40 = this.f61877f;
                long[] jArr6 = this.f35143a;
                int i41 = iM21846e >> 3;
                long j18 = jArr6[i41];
                int i42 = (iM21846e & 7) << 3;
                if (((j18 >> i42) & j) != j3) {
                    i2 = i18;
                }
                this.f61877f = i40 - i2;
                int i43 = this.f35146d;
                long j19 = (j18 & (~(j << i42))) | (j2 << i42);
                jArr6[i41] = j19;
                jArr6[(((iM21846e - 7) & i43) + (i43 & 7)) >> 3] = j19;
                return iM21846e;
            }
            i9 = i13 + 8;
            i8 = (i8 + i9) & i7;
            i3 = i17;
        }
    }

    /* JADX INFO: renamed from: e */
    public final int m21846e(int i) {
        int i2 = this.f35146d;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.f35143a;
            int i5 = i3 >> 3;
            int i6 = (i3 & 7) << 3;
            long j = ((jArr[i5 + 1] << (64 - i6)) & ((-i6) >> 63)) | (jArr[i5] >>> i6);
            long j2 = j & ((~j) << 7) & (-9187201950435737472L);
            if (j2 != 0) {
                return (i3 + (Long.numberOfTrailingZeros(j2) >> 3)) & i2;
            }
            i4 += 8;
            i3 = (i3 + i4) & i2;
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m21847f(int i) {
        long[] jArr;
        int iMax = i > 0 ? Math.max(7, om8.m18110c(i)) : 0;
        this.f35146d = iMax;
        if (iMax == 0) {
            jArr = om8.f54590a;
        } else {
            int i2 = ((iMax + 15) & (-8)) >> 3;
            long[] jArr2 = new long[i2];
            Arrays.fill(jArr2, 0, i2, -9187201950435737472L);
            jArr = jArr2;
        }
        this.f35143a = jArr;
        int i3 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i3] = (jArr[i3] & (~j)) | j;
        this.f61877f = om8.m18108a(this.f35146d) - this.f35147e;
        this.f35144b = new int[iMax];
        this.f35145c = new Object[iMax];
    }

    /* JADX INFO: renamed from: g */
    public final Object m21848g(int i) {
        int iNumberOfTrailingZeros;
        int iHashCode = Integer.hashCode(i) * (-862048943);
        int i2 = iHashCode ^ (iHashCode << 16);
        int i3 = i2 & 127;
        int i4 = this.f35146d;
        int i5 = (i2 >>> 7) & i4;
        int i6 = 0;
        loop0: while (true) {
            long[] jArr = this.f35143a;
            int i7 = i5 >> 3;
            int i8 = (i5 & 7) << 3;
            long j = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j2 = (((long) i3) * 72340172838076673L) ^ j;
            for (long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i5) & i4;
                if (this.f35144b[iNumberOfTrailingZeros] == i) {
                    break loop0;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i6 += 8;
            i5 = (i5 + i6) & i4;
        }
        if (iNumberOfTrailingZeros >= 0) {
            return m21849h(iNumberOfTrailingZeros);
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public final Object m21849h(int i) {
        this.f35147e--;
        long[] jArr = this.f35143a;
        int i2 = this.f35146d;
        int i3 = i >> 3;
        int i4 = (i & 7) << 3;
        long j = (jArr[i3] & (~(255 << i4))) | (254 << i4);
        jArr[i3] = j;
        jArr[(((i - 7) & i2) + (i2 & 7)) >> 3] = j;
        Object[] objArr = this.f35145c;
        Object obj = objArr[i];
        objArr[i] = null;
        return obj;
    }

    /* JADX INFO: renamed from: i */
    public final void m21850i(int i, Object obj) {
        int iM21845d = m21845d(i);
        this.f35144b[iM21845d] = i;
        this.f35145c[iM21845d] = obj;
    }

    public /* synthetic */ t56() {
        this(6);
    }
}
