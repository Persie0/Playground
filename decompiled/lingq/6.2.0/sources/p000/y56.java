package p000;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class y56 {

    /* JADX INFO: renamed from: a */
    public long[] f69316a = om8.f54590a;

    /* JADX INFO: renamed from: b */
    public long[] f69317b = sk5.f60953a;

    /* JADX INFO: renamed from: c */
    public Object[] f69318c = AbstractC3423or.f54766d;

    /* JADX INFO: renamed from: d */
    public int f69319d;

    /* JADX INFO: renamed from: e */
    public int f69320e;

    /* JADX INFO: renamed from: f */
    public int f69321f;

    public y56(int i) {
        if (i >= 0) {
            m24943e(om8.m18111d(i));
        } else {
            C3386nv.m17626m("Capacity must be a positive value.");
            throw null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m24939a() {
        this.f69320e = 0;
        long[] jArr = this.f69316a;
        if (jArr != om8.f54590a) {
            AbstractC3550rv.m20835c0(jArr, -9187201950435737472L);
            long[] jArr2 = this.f69316a;
            int i = this.f69319d;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        AbstractC3550rv.m20833a0(0, this.f69319d, null, this.f69318c);
        this.f69321f = om8.m18108a(this.f69319d) - this.f69320e;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m24940b(long j) {
        int iNumberOfTrailingZeros;
        int iHashCode = Long.hashCode(j) * (-862048943);
        int i = iHashCode ^ (iHashCode << 16);
        int i2 = i & 127;
        int i3 = this.f69319d;
        int i4 = (i >>> 7) & i3;
        int i5 = 0;
        loop0: while (true) {
            long[] jArr = this.f69316a;
            int i6 = i4 >> 3;
            int i7 = (i4 & 7) << 3;
            long j2 = ((jArr[i6 + 1] << (64 - i7)) & ((-i7) >> 63)) | (jArr[i6] >>> i7);
            long j3 = (((long) i2) * 72340172838076673L) ^ j2;
            for (long j4 = (~j3) & (j3 - 72340172838076673L) & (-9187201950435737472L); j4 != 0; j4 &= j4 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j4) >> 3) + i4) & i3;
                if (this.f69317b[iNumberOfTrailingZeros] == j) {
                    break loop0;
                }
            }
            if ((j2 & ((~j2) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i5 += 8;
            i4 = (i4 + i5) & i3;
        }
        return iNumberOfTrailingZeros >= 0;
    }

    /* JADX INFO: renamed from: c */
    public final int m24941c(int i) {
        int i2 = this.f69319d;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.f69316a;
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

    /* JADX INFO: renamed from: d */
    public final Object m24942d(long j) {
        int iNumberOfTrailingZeros;
        int iHashCode = Long.hashCode(j) * (-862048943);
        int i = iHashCode ^ (iHashCode << 16);
        int i2 = i & 127;
        int i3 = this.f69319d;
        int i4 = (i >>> 7) & i3;
        int i5 = 0;
        loop0: while (true) {
            long[] jArr = this.f69316a;
            int i6 = i4 >> 3;
            int i7 = (i4 & 7) << 3;
            long j2 = ((jArr[i6 + 1] << (64 - i7)) & ((-i7) >> 63)) | (jArr[i6] >>> i7);
            long j3 = (((long) i2) * 72340172838076673L) ^ j2;
            for (long j4 = (~j3) & (j3 - 72340172838076673L) & (-9187201950435737472L); j4 != 0; j4 &= j4 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j4) >> 3) + i4) & i3;
                if (this.f69317b[iNumberOfTrailingZeros] == j) {
                    break loop0;
                }
            }
            if ((j2 & ((~j2) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i5 += 8;
            i4 = (i4 + i5) & i3;
        }
        if (iNumberOfTrailingZeros >= 0) {
            return this.f69318c[iNumberOfTrailingZeros];
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public final void m24943e(int i) {
        long[] jArr;
        int iMax = i > 0 ? Math.max(7, om8.m18110c(i)) : 0;
        this.f69319d = iMax;
        if (iMax == 0) {
            jArr = om8.f54590a;
        } else {
            int i2 = ((iMax + 15) & (-8)) >> 3;
            long[] jArr2 = new long[i2];
            Arrays.fill(jArr2, 0, i2, -9187201950435737472L);
            jArr = jArr2;
        }
        this.f69316a = jArr;
        int i3 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i3] = (jArr[i3] & (~j)) | j;
        this.f69321f = om8.m18108a(this.f69319d) - this.f69320e;
        this.f69317b = new long[iMax];
        this.f69318c = new Object[iMax];
    }

    /* JADX WARN: Code duplicated, block: B:32:0x006f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x0071 A[LOOP:0: B:14:0x0023->B:33:0x0071, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:35:0x0074 A[EDGE_INSN: B:35:0x0074->B:34:0x0074 BREAK  A[LOOP:0: B:14:0x0023->B:33:0x0071], SYNTHETIC] */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof y56)) {
            return false;
        }
        y56 y56Var = (y56) obj;
        if (y56Var.f69320e != this.f69320e) {
            return false;
        }
        long[] jArr = this.f69317b;
        Object[] objArr = this.f69318c;
        long[] jArr2 = this.f69316a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr2[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            long j2 = jArr[i4];
                            Object obj2 = objArr[i4];
                            if (obj2 == null) {
                                if (y56Var.m24942d(j2) != null || !y56Var.m24940b(j2)) {
                                    return false;
                                }
                            } else if (!obj2.equals(y56Var.m24942d(j2))) {
                                return false;
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                    if (i != length) {
                        break;
                    }
                    i++;
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final Object m24944f(long j) {
        int iNumberOfTrailingZeros;
        int iHashCode = Long.hashCode(j) * (-862048943);
        int i = iHashCode ^ (iHashCode << 16);
        int i2 = i & 127;
        int i3 = this.f69319d;
        int i4 = (i >>> 7) & i3;
        int i5 = 0;
        loop0: while (true) {
            long[] jArr = this.f69316a;
            int i6 = i4 >> 3;
            int i7 = (i4 & 7) << 3;
            long j2 = ((jArr[i6 + 1] << (64 - i7)) & ((-i7) >> 63)) | (jArr[i6] >>> i7);
            long j3 = (((long) i2) * 72340172838076673L) ^ j2;
            for (long j4 = (~j3) & (j3 - 72340172838076673L) & (-9187201950435737472L); j4 != 0; j4 &= j4 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j4) >> 3) + i4) & i3;
                if (this.f69317b[iNumberOfTrailingZeros] == j) {
                    break loop0;
                }
            }
            if ((j2 & ((~j2) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i5 += 8;
            i4 = (i4 + i5) & i3;
        }
        if (iNumberOfTrailingZeros < 0) {
            return null;
        }
        this.f69320e--;
        long[] jArr2 = this.f69316a;
        int i8 = this.f69319d;
        int i9 = iNumberOfTrailingZeros >> 3;
        int i10 = (iNumberOfTrailingZeros & 7) << 3;
        long j5 = (jArr2[i9] & (~(255 << i10))) | (254 << i10);
        jArr2[i9] = j5;
        jArr2[(((iNumberOfTrailingZeros - 7) & i8) + (i8 & 7)) >> 3] = j5;
        Object[] objArr = this.f69318c;
        Object obj = objArr[iNumberOfTrailingZeros];
        objArr[iNumberOfTrailingZeros] = null;
        return obj;
    }

    /* JADX INFO: renamed from: g */
    public final void m24945g(Object obj, long j) {
        long j2;
        long j3;
        int i;
        int i2;
        long j4;
        int iNumberOfTrailingZeros;
        long[] jArr;
        Object[] objArr;
        long[] jArr2;
        int i3 = -862048943;
        int iHashCode = Long.hashCode(j) * (-862048943);
        int i4 = iHashCode ^ (iHashCode << 16);
        int i5 = i4 >>> 7;
        int i6 = i4 & 127;
        int i7 = this.f69319d;
        int i8 = i5 & i7;
        int i9 = 0;
        loop0: while (true) {
            long[] jArr3 = this.f69316a;
            int i10 = i8 >> 3;
            int i11 = (i8 & 7) << 3;
            int i12 = 1;
            long j5 = ((jArr3[i10 + 1] << (64 - i11)) & ((-i11) >> 63)) | (jArr3[i10] >>> i11);
            long j6 = i6;
            int i13 = i9;
            int i14 = 0;
            long j7 = j5 ^ (j6 * 72340172838076673L);
            long j8 = (~j7) & (j7 - 72340172838076673L) & (-9187201950435737472L);
            while (j8 != 0) {
                iNumberOfTrailingZeros = (i8 + (Long.numberOfTrailingZeros(j8) >> 3)) & i7;
                int i15 = i3;
                if (this.f69317b[iNumberOfTrailingZeros] == j) {
                    break loop0;
                }
                j8 &= j8 - 1;
                i3 = i15;
            }
            int i16 = i3;
            if ((((~j5) << 6) & j5 & (-9187201950435737472L)) != 0) {
                int iM24941c = m24941c(i5);
                if (this.f69321f != 0 || ((this.f69316a[iM24941c >> 3] >> ((iM24941c & 7) << 3)) & 255) == 254) {
                    j2 = 255;
                    j3 = j6;
                    i = 0;
                    i2 = 1;
                    j4 = 128;
                } else {
                    int i17 = this.f69319d;
                    if (i17 > 8) {
                        j4 = 128;
                        if (Long.compareUnsigned(((long) this.f69320e) * 32, ((long) i17) * 25) <= 0) {
                            long[] jArr4 = this.f69316a;
                            int i18 = this.f69319d;
                            long[] jArr5 = this.f69317b;
                            Object[] objArr2 = this.f69318c;
                            int i19 = (i18 + 7) >> 3;
                            j2 = 255;
                            int i20 = 0;
                            while (i20 < i19) {
                                long j9 = jArr4[i20] & (-9187201950435737472L);
                                jArr4[i20] = (-72340172838076674L) & ((~j9) + (j9 >>> 7));
                                i20++;
                                i12 = i12;
                                i14 = i14;
                                j6 = j6;
                            }
                            j3 = j6;
                            i = i14;
                            int i21 = i12;
                            char c = 7;
                            int iM20841i0 = AbstractC3550rv.m20841i0(jArr4);
                            int i22 = iM20841i0 - 1;
                            long j10 = 72057594037927935L;
                            jArr4[i22] = (jArr4[i22] & 72057594037927935L) | (-72057594037927936L);
                            jArr4[iM20841i0] = jArr4[i];
                            int i23 = i;
                            while (i23 != i18) {
                                int i24 = i23 >> 3;
                                int i25 = (i23 & 7) << 3;
                                long j11 = (jArr4[i24] >> i25) & 255;
                                if (j11 != 128 && j11 == 254) {
                                    int iHashCode2 = Long.hashCode(jArr5[i23]) * i16;
                                    int i26 = iHashCode2 ^ (iHashCode2 << 16);
                                    int i27 = i26 >>> 7;
                                    int iM24941c2 = m24941c(i27);
                                    int i28 = i27 & i18;
                                    char c2 = c;
                                    if (((iM24941c2 - i28) & i18) / 8 == ((i23 - i28) & i18) / 8) {
                                        int i29 = i21;
                                        long j12 = j10;
                                        jArr4[i24] = (((long) (i26 & 127)) << i25) | (jArr4[i24] & (~(255 << i25)));
                                        jArr4[jArr4.length - i29] = (jArr4[i] & j12) | Long.MIN_VALUE;
                                        i23++;
                                        i21 = i29;
                                        c = c2;
                                        j10 = j12;
                                    } else {
                                        int i30 = i21;
                                        long j13 = j10;
                                        int i31 = iM24941c2 >> 3;
                                        long j14 = jArr4[i31];
                                        int i32 = (iM24941c2 & 7) << 3;
                                        if (((j14 >> i32) & 255) == 128) {
                                            jArr2 = jArr5;
                                            objArr = objArr2;
                                            jArr4[i31] = (j14 & (~(255 << i32))) | (((long) (i26 & 127)) << i32);
                                            jArr4[i24] = (jArr4[i24] & (~(255 << i25))) | (128 << i25);
                                            jArr2[iM24941c2] = jArr2[i23];
                                            jArr2[i23] = 0;
                                            objArr[iM24941c2] = objArr[i23];
                                            objArr[i23] = null;
                                        } else {
                                            objArr = objArr2;
                                            jArr2 = jArr5;
                                            jArr4[i31] = (((long) (i26 & 127)) << i32) | (j14 & (~(255 << i32)));
                                            long j15 = jArr2[iM24941c2];
                                            jArr2[iM24941c2] = jArr2[i23];
                                            jArr2[i23] = j15;
                                            Object obj2 = objArr[iM24941c2];
                                            objArr[iM24941c2] = objArr[i23];
                                            objArr[i23] = obj2;
                                            i23--;
                                        }
                                        jArr4[jArr4.length - 1] = (jArr4[i] & j13) | Long.MIN_VALUE;
                                        i23++;
                                        jArr5 = jArr2;
                                        i21 = i30;
                                        c = c2;
                                        j10 = j13;
                                        objArr2 = objArr;
                                    }
                                } else {
                                    i23++;
                                }
                            }
                            i2 = i21;
                            this.f69321f = om8.m18108a(this.f69319d) - this.f69320e;
                        }
                        iM24941c = m24941c(i5);
                    } else {
                        j4 = 128;
                    }
                    j2 = 255;
                    j3 = j6;
                    i = 0;
                    i2 = 1;
                    int iM18109b = om8.m18109b(this.f69319d);
                    long[] jArr6 = this.f69316a;
                    long[] jArr7 = this.f69317b;
                    Object[] objArr3 = this.f69318c;
                    int i33 = this.f69319d;
                    m24943e(iM18109b);
                    long[] jArr8 = this.f69316a;
                    long[] jArr9 = this.f69317b;
                    Object[] objArr4 = this.f69318c;
                    int i34 = this.f69319d;
                    int i35 = 0;
                    while (i35 < i33) {
                        if (((jArr6[i35 >> 3] >> ((i35 & 7) << 3)) & 255) < j4) {
                            long j16 = jArr7[i35];
                            int iHashCode3 = Long.hashCode(j16) * i16;
                            int i36 = iHashCode3 ^ (iHashCode3 << 16);
                            int iM24941c3 = m24941c(i36 >>> 7);
                            jArr = jArr8;
                            long j17 = i36 & 127;
                            int i37 = iM24941c3 >> 3;
                            int i38 = (iM24941c3 & 7) << 3;
                            long j18 = (jArr[i37] & (~(255 << i38))) | (j17 << i38);
                            jArr[i37] = j18;
                            jArr[(((iM24941c3 - 7) & i34) + (i34 & 7)) >> 3] = j18;
                            jArr9[iM24941c3] = j16;
                            objArr4[iM24941c3] = objArr3[i35];
                        } else {
                            jArr = jArr8;
                        }
                        i35++;
                        jArr6 = jArr6;
                        jArr8 = jArr;
                    }
                    iM24941c = m24941c(i5);
                }
                iNumberOfTrailingZeros = iM24941c;
                this.f69320e++;
                int i39 = this.f69321f;
                long[] jArr10 = this.f69316a;
                int i40 = iNumberOfTrailingZeros >> 3;
                long j19 = jArr10[i40];
                int i41 = (iNumberOfTrailingZeros & 7) << 3;
                if (((j19 >> i41) & j2) != j4) {
                    i2 = i;
                }
                this.f69321f = i39 - i2;
                int i42 = this.f69319d;
                long j20 = (j19 & (~(j2 << i41))) | (j3 << i41);
                jArr10[i40] = j20;
                jArr10[(((iNumberOfTrailingZeros - 7) & i42) + (i42 & 7)) >> 3] = j20;
                break;
            }
            i9 = i13 + 8;
            i8 = (i8 + i9) & i7;
            i3 = i16;
        }
        this.f69317b[iNumberOfTrailingZeros] = j;
        this.f69318c[iNumberOfTrailingZeros] = obj;
    }

    public final int hashCode() {
        long[] jArr = this.f69317b;
        Object[] objArr = this.f69318c;
        long[] jArr2 = this.f69316a;
        int length = jArr2.length - 2;
        if (length < 0) {
            return 0;
        }
        int i = 0;
        int iHashCode = 0;
        while (true) {
            long j = jArr2[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        long j2 = jArr[i4];
                        Object obj = objArr[i4];
                        iHashCode += (obj != null ? obj.hashCode() : 0) ^ Long.hashCode(j2);
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return iHashCode;
                }
            }
            if (i == length) {
                return iHashCode;
            }
            i++;
        }
    }

    public final String toString() {
        int i;
        int i2;
        if (this.f69320e == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        long[] jArr = this.f69317b;
        Object[] objArr = this.f69318c;
        long[] jArr2 = this.f69316a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i3 = 0;
            int i4 = 0;
            while (true) {
                long j = jArr2[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i3 - length)) >>> 31);
                    int i6 = 0;
                    while (i6 < i5) {
                        if ((255 & j) < 128) {
                            int i7 = (i3 << 3) + i6;
                            i2 = i3;
                            long j2 = jArr[i7];
                            Object obj = objArr[i7];
                            sb.append(j2);
                            sb.append("=");
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            i4++;
                            if (i4 < this.f69320e) {
                                sb.append(", ");
                            }
                        } else {
                            i2 = i3;
                        }
                        j >>= 8;
                        i6++;
                        i3 = i2;
                    }
                    int i8 = i3;
                    if (i5 != 8) {
                        break;
                    }
                    i = i8;
                } else {
                    i = i3;
                }
                if (i == length) {
                    break;
                }
                i3 = i + 1;
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
