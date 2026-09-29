package p000;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class u56 {

    /* JADX INFO: renamed from: a */
    public long[] f63436a;

    /* JADX INFO: renamed from: b */
    public int[] f63437b;

    /* JADX INFO: renamed from: c */
    public int f63438c;

    /* JADX INFO: renamed from: d */
    public int f63439d;

    /* JADX INFO: renamed from: e */
    public int f63440e;

    public u56(int i) {
        this.f63436a = om8.f54590a;
        this.f63437b = m84.f50750a;
        if (i >= 0) {
            m22479f(om8.m18111d(i));
        } else {
            C3386nv.m17626m("Capacity must be a positive value.");
            throw null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m22474a(int i) {
        int i2 = this.f63439d;
        this.f63437b[m22477d(i)] = i;
        return this.f63439d != i2;
    }

    /* JADX INFO: renamed from: b */
    public final void m22475b() {
        this.f63439d = 0;
        long[] jArr = this.f63436a;
        if (jArr != om8.f54590a) {
            AbstractC3550rv.m20835c0(jArr, -9187201950435737472L);
            long[] jArr2 = this.f63436a;
            int i = this.f63438c;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        this.f63440e = om8.m18108a(this.f63438c) - this.f63439d;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m22476c(int i) {
        int iNumberOfTrailingZeros;
        int iHashCode = Integer.hashCode(i) * (-862048943);
        int i2 = iHashCode ^ (iHashCode << 16);
        int i3 = i2 & 127;
        int i4 = this.f63438c;
        int i5 = (i2 >>> 7) & i4;
        int i6 = 0;
        loop0: while (true) {
            long[] jArr = this.f63436a;
            int i7 = i5 >> 3;
            int i8 = (i5 & 7) << 3;
            long j = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j2 = (((long) i3) * 72340172838076673L) ^ j;
            for (long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i5) & i4;
                if (this.f63437b[iNumberOfTrailingZeros] == i) {
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
        return iNumberOfTrailingZeros >= 0;
    }

    /* JADX INFO: renamed from: d */
    public final int m22477d(int i) {
        long j;
        long j2;
        int i2;
        long j3;
        long[] jArr;
        int[] iArr;
        int i3;
        int i4 = -862048943;
        int iHashCode = Integer.hashCode(i) * (-862048943);
        int i5 = iHashCode ^ (iHashCode << 16);
        int i6 = i5 >>> 7;
        int i7 = i5 & 127;
        int i8 = this.f63438c;
        int i9 = i6 & i8;
        int i10 = 0;
        while (true) {
            long[] jArr2 = this.f63436a;
            int i11 = i9 >> 3;
            int i12 = (i9 & 7) << 3;
            int i13 = 1;
            long j4 = ((jArr2[i11 + 1] << (64 - i12)) & ((-i12) >> 63)) | (jArr2[i11] >>> i12);
            long j5 = i7;
            int i14 = i10;
            int i15 = 0;
            long j6 = j4 ^ (j5 * 72340172838076673L);
            long j7 = (~j6) & (j6 - 72340172838076673L) & (-9187201950435737472L);
            while (j7 != 0) {
                int iNumberOfTrailingZeros = (i9 + (Long.numberOfTrailingZeros(j7) >> 3)) & i8;
                int i16 = i4;
                int i17 = i15;
                if (this.f63437b[iNumberOfTrailingZeros] == i) {
                    return iNumberOfTrailingZeros;
                }
                j7 &= j7 - 1;
                i4 = i16;
                i15 = i17;
            }
            int i18 = i4;
            int i19 = i15;
            char c = '\b';
            if ((((~j4) << 6) & j4 & (-9187201950435737472L)) != 0) {
                int iM22478e = m22478e(i6);
                long j8 = 255;
                if (this.f63440e != 0 || ((this.f63436a[iM22478e >> 3] >> ((iM22478e & 7) << 3)) & 255) == 254) {
                    j = 255;
                    j2 = j5;
                    i2 = 1;
                    j3 = 128;
                } else {
                    int i20 = this.f63438c;
                    if (i20 > 8) {
                        j3 = 128;
                        if (Long.compareUnsigned(((long) this.f63439d) * 32, ((long) i20) * 25) <= 0) {
                            long[] jArr3 = this.f63436a;
                            int i21 = this.f63438c;
                            int[] iArr2 = this.f63437b;
                            int i22 = (i21 + 7) >> 3;
                            int i23 = i19;
                            while (i23 < i22) {
                                char c2 = c;
                                long j9 = jArr3[i23] & (-9187201950435737472L);
                                jArr3[i23] = (-72340172838076674L) & ((~j9) + (j9 >>> 7));
                                i23++;
                                j5 = j5;
                                c = c2;
                                j8 = j8;
                            }
                            j = j8;
                            j2 = j5;
                            int iM20841i0 = AbstractC3550rv.m20841i0(jArr3);
                            int i24 = iM20841i0 - 1;
                            long j10 = 72057594037927935L;
                            jArr3[i24] = (jArr3[i24] & 72057594037927935L) | (-72057594037927936L);
                            jArr3[iM20841i0] = jArr3[i19];
                            int i25 = i19;
                            while (i25 != i21) {
                                int i26 = i25 >> 3;
                                int i27 = (i25 & 7) << 3;
                                long j11 = (jArr3[i26] >> i27) & j;
                                if (j11 != 128 && j11 == 254) {
                                    int iHashCode2 = Integer.hashCode(iArr2[i25]) * i18;
                                    int i28 = iHashCode2 ^ (iHashCode2 << 16);
                                    int i29 = i28 >>> 7;
                                    int iM22478e2 = m22478e(i29);
                                    int i30 = i29 & i21;
                                    if (((iM22478e2 - i30) & i21) / 8 == ((i25 - i30) & i21) / 8) {
                                        long j12 = j10;
                                        jArr3[i26] = (((long) (i28 & 127)) << i27) | ((~(j << i27)) & jArr3[i26]);
                                        jArr3[jArr3.length - i13] = (jArr3[i19] & j12) | Long.MIN_VALUE;
                                        i25++;
                                        j10 = j12;
                                    } else {
                                        long j13 = j10;
                                        int i31 = iM22478e2 >> 3;
                                        long j14 = jArr3[i31];
                                        int i32 = (iM22478e2 & 7) << 3;
                                        if (((j14 >> i32) & j) == 128) {
                                            iArr = iArr2;
                                            int i33 = i25;
                                            jArr3[i31] = ((~(j << i32)) & j14) | (((long) (i28 & 127)) << i32);
                                            jArr3[i26] = (jArr3[i26] & (~(j << i27))) | (128 << i27);
                                            iArr[iM22478e2] = iArr[i33];
                                            iArr[i33] = i19;
                                            i3 = i33;
                                        } else {
                                            iArr = iArr2;
                                            int i34 = i25;
                                            jArr3[i31] = (((long) (i28 & 127)) << i32) | ((~(j << i32)) & j14);
                                            int i35 = iArr[iM22478e2];
                                            iArr[iM22478e2] = iArr[i34];
                                            iArr[i34] = i35;
                                            i3 = i34 - 1;
                                        }
                                        jArr3[jArr3.length - i13] = (jArr3[i19] & j13) | Long.MIN_VALUE;
                                        i25 = i3 + i13;
                                        i13 = i13;
                                        j10 = j13;
                                        iArr2 = iArr;
                                    }
                                } else {
                                    i25++;
                                }
                            }
                            i2 = i13;
                            this.f63440e = om8.m18108a(this.f63438c) - this.f63439d;
                        }
                        iM22478e = m22478e(i6);
                    } else {
                        j3 = 128;
                    }
                    j = 255;
                    j2 = j5;
                    i2 = 1;
                    int iM18109b = om8.m18109b(this.f63438c);
                    long[] jArr4 = this.f63436a;
                    int[] iArr3 = this.f63437b;
                    int i36 = this.f63438c;
                    m22479f(iM18109b);
                    long[] jArr5 = this.f63436a;
                    int[] iArr4 = this.f63437b;
                    int i37 = this.f63438c;
                    int i38 = i19;
                    while (i38 < i36) {
                        if (((jArr4[i38 >> 3] >> ((i38 & 7) << 3)) & 255) < j3) {
                            int i39 = iArr3[i38];
                            int iHashCode3 = Integer.hashCode(i39) * i18;
                            int i40 = iHashCode3 ^ (iHashCode3 << 16);
                            int iM22478e3 = m22478e(i40 >>> 7);
                            long j15 = i40 & 127;
                            int i41 = iM22478e3 >> 3;
                            int i42 = (iM22478e3 & 7) << 3;
                            jArr = jArr5;
                            long j16 = (jArr5[i41] & (~(255 << i42))) | (j15 << i42);
                            jArr[i41] = j16;
                            jArr[(((iM22478e3 - 7) & i37) + (i37 & 7)) >> 3] = j16;
                            iArr4[iM22478e3] = i39;
                        } else {
                            jArr = jArr5;
                        }
                        i38++;
                        jArr4 = jArr4;
                        jArr5 = jArr;
                    }
                    iM22478e = m22478e(i6);
                }
                this.f63439d += i2;
                int i43 = this.f63440e;
                long[] jArr6 = this.f63436a;
                int i44 = iM22478e >> 3;
                long j17 = jArr6[i44];
                int i45 = (iM22478e & 7) << 3;
                if (((j17 >> i45) & j) != j3) {
                    i2 = i19;
                }
                this.f63440e = i43 - i2;
                int i46 = this.f63438c;
                long j18 = (j17 & (~(j << i45))) | (j2 << i45);
                jArr6[i44] = j18;
                jArr6[(((iM22478e - 7) & i46) + (i46 & 7)) >> 3] = j18;
                return iM22478e;
            }
            i10 = i14 + 8;
            i9 = (i9 + i10) & i8;
            i4 = i18;
        }
    }

    /* JADX INFO: renamed from: e */
    public final int m22478e(int i) {
        int i2 = this.f63438c;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.f63436a;
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

    /* JADX WARN: Code duplicated, block: B:25:0x0054 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0056 A[LOOP:0: B:14:0x001d->B:26:0x0056, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x0059 A[SYNTHETIC] */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof u56)) {
            return false;
        }
        u56 u56Var = (u56) obj;
        if (u56Var.f63439d != this.f63439d) {
            return false;
        }
        int[] iArr = this.f63437b;
        long[] jArr = this.f63436a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128 && !u56Var.m22476c(iArr[(i << 3) + i3])) {
                            return false;
                        }
                        j >>= 8;
                    }
                    if (i2 == 8) {
                        if (i != length) {
                            i++;
                        }
                    }
                } else if (i != length) {
                    i++;
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final void m22479f(int i) {
        long[] jArr;
        int iMax = i > 0 ? Math.max(7, om8.m18110c(i)) : 0;
        this.f63438c = iMax;
        if (iMax == 0) {
            jArr = om8.f54590a;
        } else {
            int i2 = ((iMax + 15) & (-8)) >> 3;
            long[] jArr2 = new long[i2];
            Arrays.fill(jArr2, 0, i2, -9187201950435737472L);
            jArr = jArr2;
        }
        this.f63436a = jArr;
        int i3 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i3] = (jArr[i3] & (~j)) | j;
        this.f63440e = om8.m18108a(this.f63438c) - this.f63439d;
        this.f63437b = new int[iMax];
    }

    /* JADX INFO: renamed from: g */
    public final boolean m22480g(int i) {
        int iNumberOfTrailingZeros;
        int iHashCode = Integer.hashCode(i) * (-862048943);
        int i2 = iHashCode ^ (iHashCode << 16);
        int i3 = i2 & 127;
        int i4 = this.f63438c;
        int i5 = (i2 >>> 7) & i4;
        int i6 = 0;
        loop0: while (true) {
            long[] jArr = this.f63436a;
            int i7 = i5 >> 3;
            int i8 = (i5 & 7) << 3;
            long j = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j2 = (((long) i3) * 72340172838076673L) ^ j;
            for (long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i5) & i4;
                if (this.f63437b[iNumberOfTrailingZeros] == i) {
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
        boolean z = iNumberOfTrailingZeros >= 0;
        if (z) {
            m22481h(iNumberOfTrailingZeros);
        }
        return z;
    }

    /* JADX INFO: renamed from: h */
    public final void m22481h(int i) {
        this.f63439d--;
        long[] jArr = this.f63436a;
        int i2 = this.f63438c;
        int i3 = i >> 3;
        int i4 = (i & 7) << 3;
        long j = (jArr[i3] & (~(255 << i4))) | (254 << i4);
        jArr[i3] = j;
        jArr[(((i - 7) & i2) + (i2 & 7)) >> 3] = j;
    }

    public final int hashCode() {
        int[] iArr = this.f63437b;
        long[] jArr = this.f63436a;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i = 0;
        int iHashCode = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        iHashCode = Integer.hashCode(iArr[(i << 3) + i3]) + iHashCode;
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

    /* JADX WARN: Code duplicated, block: B:19:0x005b A[DONT_INVERT, PHI: r5
      0x005b: PHI (r5v2 int) = (r5v1 int), (r5v3 int) binds: [B:6:0x0024, B:18:0x0059] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x005d A[LOOP:0: B:5:0x0016->B:20:0x005d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x0060 A[SYNTHETIC] */
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        int[] iArr = this.f63437b;
        long[] jArr = this.f63436a;
        int length = jArr.length - 2;
        if (length < 0) {
            sb.append((CharSequence) "]");
            break;
        }
        int i = 0;
        int i2 = 0;
        loop0: while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((255 & j) < 128) {
                        int i5 = iArr[(i << 3) + i4];
                        if (i2 == -1) {
                            sb.append((CharSequence) "...");
                            break loop0;
                        }
                        if (i2 != 0) {
                            sb.append((CharSequence) ", ");
                        }
                        sb.append(i5);
                        i2++;
                    }
                    j >>= 8;
                }
                if (i3 == 8) {
                    if (i == length) {
                        i++;
                    }
                }
                sb.append((CharSequence) "]");
                break;
            }
            if (i == length) {
                sb.append((CharSequence) "]");
                break;
            }
            i++;
        }
        return sb.toString();
    }

    public /* synthetic */ u56() {
        this(6);
    }
}
