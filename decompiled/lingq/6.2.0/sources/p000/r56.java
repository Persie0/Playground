package p000;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class r56 {

    /* JADX INFO: renamed from: a */
    public long[] f58761a;

    /* JADX INFO: renamed from: b */
    public int[] f58762b;

    /* JADX INFO: renamed from: c */
    public int[] f58763c;

    /* JADX INFO: renamed from: d */
    public int f58764d;

    /* JADX INFO: renamed from: e */
    public int f58765e;

    /* JADX INFO: renamed from: f */
    public int f58766f;

    public r56(int i) {
        this.f58761a = om8.f54590a;
        int[] iArr = m84.f50750a;
        this.f58762b = iArr;
        this.f58763c = iArr;
        if (i >= 0) {
            m20410e(om8.m18111d(i));
        } else {
            C3386nv.m17626m("Capacity must be a positive value.");
            throw null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m20406a() {
        this.f58765e = 0;
        long[] jArr = this.f58761a;
        if (jArr != om8.f54590a) {
            AbstractC3550rv.m20835c0(jArr, -9187201950435737472L);
            long[] jArr2 = this.f58761a;
            int i = this.f58764d;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        this.f58766f = om8.m18108a(this.f58764d) - this.f58765e;
    }

    /* JADX INFO: renamed from: b */
    public final int m20407b(int i) {
        int i2 = this.f58764d;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.f58761a;
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

    /* JADX INFO: renamed from: c */
    public final int m20408c(int i) {
        int iHashCode = Integer.hashCode(i) * (-862048943);
        int i2 = iHashCode ^ (iHashCode << 16);
        int i3 = i2 & 127;
        int i4 = this.f58764d;
        int i5 = (i2 >>> 7) & i4;
        int i6 = 0;
        while (true) {
            long[] jArr = this.f58761a;
            int i7 = i5 >> 3;
            int i8 = (i5 & 7) << 3;
            long j = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j2 = (((long) i3) * 72340172838076673L) ^ j;
            for (long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i5) & i4;
                if (this.f58762b[iNumberOfTrailingZeros] == i) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i6 += 8;
            i5 = (i5 + i6) & i4;
        }
    }

    /* JADX INFO: renamed from: d */
    public final int m20409d(int i) {
        int iM20408c = m20408c(i);
        if (iM20408c >= 0) {
            return this.f58763c[iM20408c];
        }
        return -1;
    }

    /* JADX INFO: renamed from: e */
    public final void m20410e(int i) {
        long[] jArr;
        int iMax = i > 0 ? Math.max(7, om8.m18110c(i)) : 0;
        this.f58764d = iMax;
        if (iMax == 0) {
            jArr = om8.f54590a;
        } else {
            int i2 = ((iMax + 15) & (-8)) >> 3;
            long[] jArr2 = new long[i2];
            Arrays.fill(jArr2, 0, i2, -9187201950435737472L);
            jArr = jArr2;
        }
        this.f58761a = jArr;
        int i3 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i3] = (jArr[i3] & (~j)) | j;
        this.f58766f = om8.m18108a(this.f58764d) - this.f58765e;
        this.f58762b = new int[iMax];
        this.f58763c = new int[iMax];
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0062 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x0064 A[LOOP:0: B:14:0x0023->B:28:0x0064, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:33:0x0067 A[SYNTHETIC] */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r56)) {
            return false;
        }
        r56 r56Var = (r56) obj;
        if (r56Var.f58765e != this.f58765e) {
            return false;
        }
        int[] iArr = this.f58762b;
        int[] iArr2 = this.f58763c;
        long[] jArr = this.f58761a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            loop0: while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            int i5 = iArr[i4];
                            int i6 = iArr2[i4];
                            int iM20408c = r56Var.m20408c(i5);
                            if (iM20408c < 0 || i6 != r56Var.f58763c[iM20408c]) {
                                break loop0;
                            }
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
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final void m20411f(int i, int i2) {
        long j;
        long j2;
        int i3;
        int i4;
        long j3;
        int iNumberOfTrailingZeros;
        long[] jArr;
        int[] iArr;
        int[] iArr2;
        int i5 = i;
        int i6 = -862048943;
        int iHashCode = Integer.hashCode(i5) * (-862048943);
        int i7 = iHashCode ^ (iHashCode << 16);
        int i8 = i7 >>> 7;
        int i9 = i7 & 127;
        int i10 = this.f58764d;
        int i11 = i8 & i10;
        int i12 = 0;
        loop0: while (true) {
            long[] jArr2 = this.f58761a;
            int i13 = i11 >> 3;
            int i14 = (i11 & 7) << 3;
            int i15 = 1;
            int i16 = i12;
            int i17 = 0;
            long j4 = (((-i14) >> 63) & (jArr2[i13 + 1] << (64 - i14))) | (jArr2[i13] >>> i14);
            long j5 = i9;
            long j6 = j4 ^ (j5 * 72340172838076673L);
            long j7 = (j6 - 72340172838076673L) & (~j6) & (-9187201950435737472L);
            while (j7 != 0) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j7) >> 3) + i11) & i10;
                int i18 = i6;
                if (this.f58762b[iNumberOfTrailingZeros] == i5) {
                    break loop0;
                }
                j7 &= j7 - 1;
                i6 = i18;
            }
            int i19 = i6;
            if ((j4 & ((~j4) << 6) & (-9187201950435737472L)) != 0) {
                int iM20407b = m20407b(i8);
                long j8 = 255;
                if (this.f58766f != 0 || ((this.f58761a[iM20407b >> 3] >> ((iM20407b & 7) << 3)) & 255) == 254) {
                    j = j5;
                    j2 = 255;
                    i3 = 1;
                    i4 = 0;
                    j3 = 128;
                } else {
                    int i20 = this.f58764d;
                    if (i20 > 8) {
                        j3 = 128;
                        if (Long.compareUnsigned(((long) this.f58765e) * 32, ((long) i20) * 25) <= 0) {
                            long[] jArr3 = this.f58761a;
                            int i21 = this.f58764d;
                            int[] iArr3 = this.f58762b;
                            int[] iArr4 = this.f58763c;
                            int i22 = (i21 + 7) >> 3;
                            int i23 = 0;
                            while (i23 < i22) {
                                long j9 = jArr3[i23] & (-9187201950435737472L);
                                jArr3[i23] = (-72340172838076674L) & ((~j9) + (j9 >>> 7));
                                i23++;
                                j8 = j8;
                                j5 = j5;
                            }
                            j = j5;
                            j2 = j8;
                            char c = 7;
                            int iM20841i0 = AbstractC3550rv.m20841i0(jArr3);
                            int i24 = iM20841i0 - 1;
                            jArr3[i24] = (jArr3[i24] & 72057594037927935L) | (-72057594037927936L);
                            jArr3[iM20841i0] = jArr3[0];
                            int i25 = 0;
                            while (i25 != i21) {
                                int i26 = i25 >> 3;
                                int i27 = (i25 & 7) << 3;
                                long j10 = (jArr3[i26] >> i27) & j2;
                                if (j10 != 128 && j10 == 254) {
                                    int iHashCode2 = Integer.hashCode(iArr3[i25]) * i19;
                                    int i28 = iHashCode2 ^ (iHashCode2 << 16);
                                    int i29 = i28 >>> 7;
                                    int iM20407b2 = m20407b(i29);
                                    int i30 = i29 & i21;
                                    char c2 = c;
                                    if (((iM20407b2 - i30) & i21) / 8 == ((i25 - i30) & i21) / 8) {
                                        int i31 = i17;
                                        jArr3[i26] = (((long) (i28 & 127)) << i27) | (jArr3[i26] & (~(j2 << i27)));
                                        jArr3[jArr3.length - 1] = (jArr3[i31] & 72057594037927935L) | Long.MIN_VALUE;
                                        i25++;
                                        i15 = i15;
                                        c = c2;
                                        i17 = i31;
                                    } else {
                                        int i32 = i15;
                                        int i33 = i17;
                                        int i34 = iM20407b2 >> 3;
                                        long j11 = jArr3[i34];
                                        int i35 = (iM20407b2 & 7) << 3;
                                        if (((j11 >> i35) & j2) == 128) {
                                            iArr = iArr3;
                                            iArr2 = iArr4;
                                            jArr3[i34] = ((~(j2 << i35)) & j11) | (((long) (i28 & 127)) << i35);
                                            jArr3[i26] = (jArr3[i26] & (~(j2 << i27))) | (128 << i27);
                                            iArr[iM20407b2] = iArr[i25];
                                            iArr[i25] = i33;
                                            iArr2[iM20407b2] = iArr2[i25];
                                            iArr2[i25] = i33;
                                        } else {
                                            iArr = iArr3;
                                            iArr2 = iArr4;
                                            jArr3[i34] = (((long) (i28 & 127)) << i35) | ((~(j2 << i35)) & j11);
                                            int i36 = iArr[iM20407b2];
                                            iArr[iM20407b2] = iArr[i25];
                                            iArr[i25] = i36;
                                            int i37 = iArr2[iM20407b2];
                                            iArr2[iM20407b2] = iArr2[i25];
                                            iArr2[i25] = i37;
                                            i25--;
                                        }
                                        jArr3[jArr3.length - 1] = (jArr3[i33] & 72057594037927935L) | Long.MIN_VALUE;
                                        i25++;
                                        i15 = i32;
                                        c = c2;
                                        i17 = i33;
                                        iArr3 = iArr;
                                        iArr4 = iArr2;
                                    }
                                } else {
                                    i25++;
                                }
                            }
                            i3 = i15;
                            i4 = i17;
                            this.f58766f = om8.m18108a(this.f58764d) - this.f58765e;
                        }
                        iM20407b = m20407b(i8);
                    } else {
                        j3 = 128;
                    }
                    j = j5;
                    j2 = 255;
                    i3 = 1;
                    i4 = 0;
                    int iM18109b = om8.m18109b(this.f58764d);
                    long[] jArr4 = this.f58761a;
                    int[] iArr5 = this.f58762b;
                    int[] iArr6 = this.f58763c;
                    int i38 = this.f58764d;
                    m20410e(iM18109b);
                    long[] jArr5 = this.f58761a;
                    int[] iArr7 = this.f58762b;
                    int[] iArr8 = this.f58763c;
                    int i39 = this.f58764d;
                    int i40 = 0;
                    while (i40 < i38) {
                        if (((jArr4[i40 >> 3] >> ((i40 & 7) << 3)) & 255) < j3) {
                            int i41 = iArr5[i40];
                            int iHashCode3 = Integer.hashCode(i41) * i19;
                            int i42 = iHashCode3 ^ (iHashCode3 << 16);
                            int iM20407b3 = m20407b(i42 >>> 7);
                            jArr = jArr5;
                            long j12 = i42 & 127;
                            int i43 = iM20407b3 >> 3;
                            int i44 = (iM20407b3 & 7) << 3;
                            long j13 = (jArr[i43] & (~(255 << i44))) | (j12 << i44);
                            jArr[i43] = j13;
                            jArr[(((iM20407b3 - 7) & i39) + (i39 & 7)) >> 3] = j13;
                            iArr7[iM20407b3] = i41;
                            iArr8[iM20407b3] = iArr6[i40];
                        } else {
                            jArr = jArr5;
                        }
                        i40++;
                        jArr5 = jArr;
                    }
                    iM20407b = m20407b(i8);
                }
                this.f58765e++;
                int i45 = this.f58766f;
                long[] jArr6 = this.f58761a;
                int i46 = iM20407b >> 3;
                long j14 = jArr6[i46];
                int i47 = (iM20407b & 7) << 3;
                if (((j14 >> i47) & j2) == j3) {
                    i4 = i3;
                }
                this.f58766f = i45 - i4;
                int i48 = this.f58764d;
                long j15 = (j14 & (~(j2 << i47))) | (j << i47);
                jArr6[i46] = j15;
                jArr6[(((iM20407b - 7) & i48) + (i48 & 7)) >> 3] = j15;
                iNumberOfTrailingZeros = ~iM20407b;
                break;
            }
            i12 = i16 + 8;
            i11 = (i11 + i12) & i10;
            i5 = i;
            i6 = i19;
        }
        if (iNumberOfTrailingZeros < 0) {
            iNumberOfTrailingZeros = ~iNumberOfTrailingZeros;
        }
        this.f58762b[iNumberOfTrailingZeros] = i;
        this.f58763c[iNumberOfTrailingZeros] = i2;
    }

    public final int hashCode() {
        int[] iArr = this.f58762b;
        int[] iArr2 = this.f58763c;
        long[] jArr = this.f58761a;
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
                        int i4 = (i << 3) + i3;
                        int i5 = iArr[i4];
                        iHashCode += Integer.hashCode(iArr2[i4]) ^ Integer.hashCode(i5);
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

    /* JADX WARN: Code duplicated, block: B:20:0x0066 A[DONT_INVERT, PHI: r8
      0x0066: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:10:0x002c, B:19:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:21:0x0068 A[LOOP:0: B:9:0x001e->B:21:0x0068, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:25:0x006b A[EDGE_INSN: B:25:0x006b->B:22:0x006b BREAK  A[LOOP:0: B:9:0x001e->B:21:0x0068], SYNTHETIC] */
    public final String toString() {
        if (this.f58765e == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        int[] iArr = this.f58762b;
        int[] iArr2 = this.f58763c;
        long[] jArr = this.f58761a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            int i2 = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i3 = 8 - ((~(i - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            int i5 = (i << 3) + i4;
                            int i6 = iArr[i5];
                            int i7 = iArr2[i5];
                            sb.append(i6);
                            sb.append("=");
                            sb.append(i7);
                            i2++;
                            if (i2 < this.f58765e) {
                                sb.append(", ");
                            }
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                    if (i != length) {
                        break;
                    }
                    i++;
                }
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public /* synthetic */ r56() {
        this(6);
    }
}
