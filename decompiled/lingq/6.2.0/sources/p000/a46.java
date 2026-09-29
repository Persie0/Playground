package p000;

import androidx.media3.common.C0713b;
import com.google.common.base.AbstractC1081a;
import com.google.common.primitives.AbstractC1110a;
import java.io.EOFException;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes2.dex */
public final class a46 implements hy2 {

    /* JADX INFO: renamed from: v */
    public static final fg2 f220v = new fg2(12);

    /* JADX INFO: renamed from: a */
    public final int f221a;

    /* JADX INFO: renamed from: b */
    public final k47 f222b;

    /* JADX INFO: renamed from: c */
    public final m46 f223c;

    /* JADX INFO: renamed from: d */
    public final ak3 f224d;

    /* JADX INFO: renamed from: e */
    public final ck6 f225e;

    /* JADX INFO: renamed from: f */
    public final ug2 f226f;

    /* JADX INFO: renamed from: g */
    public jy2 f227g;

    /* JADX INFO: renamed from: h */
    public n8a f228h;

    /* JADX INFO: renamed from: i */
    public n8a f229i;

    /* JADX INFO: renamed from: j */
    public int f230j;

    /* JADX INFO: renamed from: k */
    public ey5 f231k;

    /* JADX INFO: renamed from: l */
    public ey5 f232l;

    /* JADX INFO: renamed from: m */
    public long f233m;

    /* JADX INFO: renamed from: n */
    public long f234n;

    /* JADX INFO: renamed from: o */
    public long f235o;

    /* JADX INFO: renamed from: p */
    public long f236p;

    /* JADX INFO: renamed from: q */
    public int f237q;

    /* JADX INFO: renamed from: r */
    public wt8 f238r;

    /* JADX INFO: renamed from: s */
    public boolean f239s;

    /* JADX INFO: renamed from: t */
    public boolean f240t;

    /* JADX INFO: renamed from: u */
    public long f241u;

    public a46(int i) {
        this.f221a = (i & 2) != 0 ? i | 1 : i;
        this.f222b = new k47(10);
        this.f223c = new m46();
        this.f224d = new ak3();
        this.f233m = -9223372036854775807L;
        this.f225e = new ck6(16);
        ug2 ug2Var = new ug2();
        this.f226f = ug2Var;
        this.f229i = ug2Var;
        this.f236p = -1L;
    }

    @Override // p000.hy2
    /* JADX INFO: renamed from: a */
    public final void mo109a() {
    }

    /* JADX WARN: Code duplicated, block: B:103:0x022e  */
    /* JADX WARN: Code duplicated, block: B:105:0x023b  */
    /* JADX WARN: Code duplicated, block: B:113:0x027f  */
    /* JADX WARN: Code duplicated, block: B:116:0x028a  */
    /* JADX WARN: Code duplicated, block: B:122:0x029e  */
    /* JADX WARN: Code duplicated, block: B:126:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:127:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:133:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:137:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:139:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:141:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:143:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:147:0x0319  */
    /* JADX WARN: Code duplicated, block: B:155:0x0342  */
    /* JADX WARN: Code duplicated, block: B:170:0x037a  */
    /* JADX WARN: Code duplicated, block: B:22:0x0065  */
    /* JADX WARN: Code duplicated, block: B:24:0x006b  */
    /* JADX WARN: Code duplicated, block: B:26:0x0074  */
    /* JADX WARN: Code duplicated, block: B:27:0x0076  */
    /* JADX WARN: Code duplicated, block: B:289:0x05f6  */
    /* JADX WARN: Code duplicated, block: B:290:0x05f8  */
    /* JADX WARN: Code duplicated, block: B:293:0x0600  */
    /* JADX WARN: Code duplicated, block: B:33:0x0090 A[PHI: r0 r2 r26 r38
      0x0090: PHI (r0v56 ak3) = (r13v7 ak3), (r13v7 ak3), (r13v7 ak3), (r0v78 ak3) binds: [B:135:0x02ce, B:142:0x02e2, B:124:0x02a2, B:32:0x0084] A[DONT_GENERATE, DONT_INLINE]
      0x0090: PHI (r2v17 a46) = (r2v11 a46), (r2v11 a46), (r2v11 a46), (r2v20 a46) binds: [B:135:0x02ce, B:142:0x02e2, B:124:0x02a2, B:32:0x0084] A[DONT_GENERATE, DONT_INLINE]
      0x0090: PHI (r26v4 long) = (r26v1 long), (r26v1 long), (r26v1 long), (r26v6 long) binds: [B:135:0x02ce, B:142:0x02e2, B:124:0x02a2, B:32:0x0084] A[DONT_GENERATE, DONT_INLINE]
      0x0090: PHI (r38v2 int) = (r38v0 int), (r38v0 int), (r38v0 int), (r38v7 int) binds: [B:135:0x02ce, B:142:0x02e2, B:124:0x02a2, B:32:0x0084] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:34:0x0094  */
    /* JADX WARN: Code duplicated, block: B:68:0x0192  */
    /* JADX WARN: Code duplicated, block: B:69:0x0197  */
    /* JADX WARN: Code duplicated, block: B:72:0x019c  */
    /* JADX WARN: Code duplicated, block: B:73:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:76:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:78:0x01b2 A[LOOP:4: B:77:0x01b0->B:78:0x01b2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:80:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:83:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:86:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:91:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:93:0x020e  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.hy2
    /* JADX INFO: renamed from: b */
    public final int mo110b(iy2 iy2Var, n63 n63Var) {
        a46 a46Var;
        int i;
        int i2;
        long j;
        int iMo2533c;
        int i3;
        int iM14829m;
        int i4;
        long j2;
        int iM14829m2;
        int iM14809D;
        long jM14807B;
        long[] jArr;
        int i5;
        int i6;
        c46 c46Var;
        long j3;
        int i7;
        int i8;
        ey5 ey5Var;
        long position;
        long length;
        long jM22801F;
        long j4;
        wt8 xi1Var;
        long jM22801F2;
        float fIntBitsToFloat;
        b46 b46VarM3286a;
        b46 b46VarM3286a2;
        long[] jArr2;
        int i9;
        dy5 dy5Var;
        dy5 dy5Var2;
        int i10;
        long jM22797B;
        wt8 j06Var;
        long j5;
        long jMax;
        int iM14842z;
        iy2 iy2Var2 = iy2Var;
        this.f228h.getClass();
        String str = uma.f64080a;
        int i11 = this.f230j;
        m46 m46Var = this.f223c;
        if (i11 == 0) {
            try {
                m117j(iy2Var2, false);
            } catch (EOFException unused) {
                a46Var = this;
                i = -1;
                i2 = -1;
                j = 1000000;
            }
        }
        if (this.f238r == null) {
            k47 k47Var = new k47(m46Var.f50574b);
            iy2Var2.mo13085o(k47Var.f46700a, 0, m46Var.f50574b);
            int i12 = m46Var.f50573a & 1;
            int i13 = m46Var.f50576d;
            int i14 = 21;
            j = 1000000;
            if (i12 != 0) {
                if (i13 != 1) {
                    i14 = 36;
                }
            } else if (i13 == 1) {
                i14 = 13;
            }
            if (k47Var.f46702c >= i14 + 4) {
                k47Var.m14818M(i14);
                iM14829m = k47Var.m14829m();
                if (iM14829m != 1483304551 && iM14829m != 1231971951) {
                    if (k47Var.f46702c >= 40) {
                        k47Var.m14818M(36);
                        if (k47Var.m14829m() == 1447187017) {
                            iM14829m = 1447187017;
                        } else {
                            iM14829m = 0;
                        }
                    } else {
                        iM14829m = 0;
                    }
                }
            } else if (k47Var.f46702c >= 40) {
                k47Var.m14818M(36);
                if (k47Var.m14829m() == 1447187017) {
                    iM14829m = 1447187017;
                } else {
                    iM14829m = 0;
                }
            } else {
                iM14829m = 0;
            }
            ak3 ak3Var = this.f224d;
            if (iM14829m == 1231971951) {
                i4 = 0;
                j2 = -9223372036854775807L;
                iM14829m2 = k47Var.m14829m();
                if ((iM14829m2 & 1) != 0) {
                    iM14809D = k47Var.m14809D();
                } else {
                    iM14809D = -1;
                }
                if ((iM14829m2 & 2) != 0) {
                    jM14807B = k47Var.m14807B();
                } else {
                    jM14807B = -1;
                }
                if ((iM14829m2 & 4) == 4) {
                    jArr2 = new long[100];
                    for (i9 = 0; i9 < 100; i9++) {
                        jArr2[i9] = k47Var.m14842z();
                    }
                    jArr = jArr2;
                } else {
                    jArr = null;
                }
                if ((iM14829m2 & 8) != 0) {
                    k47Var.m14819N(4);
                }
                if (k47Var.m14820a() >= 24) {
                    k47Var.m14819N(11);
                    fIntBitsToFloat = Float.intBitsToFloat(k47Var.m14829m());
                    int iM14812G = k47Var.m14812G();
                    int iM14812G2 = k47Var.m14812G();
                    b46VarM3286a = b46.m3286a(iM14812G);
                    b46VarM3286a2 = b46.m3286a(iM14812G2);
                    if (fIntBitsToFloat > 0.0f && b46VarM3286a == null && b46VarM3286a2 == null) {
                        c46Var = null;
                    } else {
                        c46Var = new c46(fIntBitsToFloat, b46VarM3286a, b46VarM3286a2);
                    }
                    k47Var.m14819N(2);
                    int iM14808C = k47Var.m14808C();
                    i6 = (16773120 & iM14808C) >> 12;
                    i5 = iM14808C & 4095;
                } else {
                    i5 = -1;
                    i6 = -1;
                    c46Var = null;
                }
                j3 = iM14809D;
                i7 = m46Var.f50574b;
                int i15 = m46Var.f50575c;
                i8 = m46Var.f50577e;
                int i16 = m46Var.f50578f;
                if ((ak3Var.f763a != -1 || ak3Var.f764b == -1) && i6 != -1 && i5 != -1) {
                    ak3Var.f763a = i6;
                    ak3Var.f764b = i5;
                }
                if (c46Var != null) {
                    ey5Var = new ey5(c46Var);
                } else {
                    ey5Var = null;
                }
                a46Var = this;
                a46Var.f232l = ey5Var;
                position = iy2Var2.getPosition();
                if (iy2Var2.getLength() == -1 && jM14807B != -1) {
                    long j6 = position + jM14807B;
                    if (iy2Var2.getLength() != j6) {
                        ss5.m21686M("Mp3Extractor", "Data size mismatch between stream (" + iy2Var2.getLength() + ") and Xing frame (" + j6 + "), using Xing value.");
                    }
                }
                iy2Var2.mo13082k(m46Var.f50574b);
                if (iM14829m == 1483304551) {
                    if (j3 != -1 || j3 == 0) {
                        jM22801F2 = -9223372036854775807L;
                    } else {
                        jM22801F2 = uma.m22801F(i15, (j3 * ((long) i16)) - 1);
                    }
                    if (jM22801F2 != -9223372036854775807L) {
                        xi1Var = null;
                    } else {
                        xi1Var = new bab(position, i7, jM22801F2, i8, jM14807B, jArr);
                    }
                } else {
                    length = iy2Var2.getLength();
                    if (j3 != -1 || j3 == 0) {
                        jM22801F = -9223372036854775807L;
                    } else {
                        jM22801F = uma.m22801F(i15, (((long) i16) * j3) - 1);
                    }
                    if (jM22801F != -9223372036854775807L) {
                        if (jM14807B != -1) {
                            length = position + jM14807B;
                            j4 = jM14807B - ((long) i7);
                        } else if (length != -1) {
                            j4 = (length - position) - ((long) i7);
                        } else {
                            xi1Var = null;
                        }
                        long j7 = length;
                        long j8 = j4;
                        RoundingMode roundingMode = RoundingMode.HALF_UP;
                        xi1Var = new xi1(j7, position + ((long) i7), AbstractC1110a.m6362b(uma.m22803H(j8, 8000000L, jM22801F, roundingMode)), AbstractC1110a.m6362b(anb.m620b(j8, j3, roundingMode)), false, true);
                    } else {
                        xi1Var = null;
                    }
                }
            } else if (iM14829m != 1447187017) {
                if (iM14829m != 1483304551) {
                    iy2Var2.mo13080i();
                    a46Var = this;
                    i4 = 0;
                    ak3Var = ak3Var;
                    j2 = -9223372036854775807L;
                } else {
                    i4 = 0;
                    j2 = -9223372036854775807L;
                    iM14829m2 = k47Var.m14829m();
                    if ((iM14829m2 & 1) != 0) {
                        iM14809D = k47Var.m14809D();
                    } else {
                        iM14809D = -1;
                    }
                    if ((iM14829m2 & 2) != 0) {
                        jM14807B = k47Var.m14807B();
                    } else {
                        jM14807B = -1;
                    }
                    if ((iM14829m2 & 4) == 4) {
                        jArr2 = new long[100];
                        while (i9 < 100) {
                            jArr2[i9] = k47Var.m14842z();
                        }
                        jArr = jArr2;
                    } else {
                        jArr = null;
                    }
                    if ((iM14829m2 & 8) != 0) {
                        k47Var.m14819N(4);
                    }
                    if (k47Var.m14820a() >= 24) {
                        k47Var.m14819N(11);
                        fIntBitsToFloat = Float.intBitsToFloat(k47Var.m14829m());
                        int iM14812G3 = k47Var.m14812G();
                        int iM14812G4 = k47Var.m14812G();
                        b46VarM3286a = b46.m3286a(iM14812G3);
                        b46VarM3286a2 = b46.m3286a(iM14812G4);
                        if (fIntBitsToFloat > 0.0f) {
                            c46Var = new c46(fIntBitsToFloat, b46VarM3286a, b46VarM3286a2);
                        } else {
                            c46Var = new c46(fIntBitsToFloat, b46VarM3286a, b46VarM3286a2);
                        }
                        k47Var.m14819N(2);
                        int iM14808C2 = k47Var.m14808C();
                        i6 = (16773120 & iM14808C2) >> 12;
                        i5 = iM14808C2 & 4095;
                    } else {
                        i5 = -1;
                        i6 = -1;
                        c46Var = null;
                    }
                    j3 = iM14809D;
                    i7 = m46Var.f50574b;
                    int i17 = m46Var.f50575c;
                    i8 = m46Var.f50577e;
                    int i18 = m46Var.f50578f;
                    if (ak3Var.f763a != -1) {
                        ak3Var.f763a = i6;
                        ak3Var.f764b = i5;
                    } else {
                        ak3Var.f763a = i6;
                        ak3Var.f764b = i5;
                    }
                    if (c46Var != null) {
                        ey5Var = new ey5(c46Var);
                    } else {
                        ey5Var = null;
                    }
                    a46Var = this;
                    a46Var.f232l = ey5Var;
                    position = iy2Var2.getPosition();
                    if (iy2Var2.getLength() == -1) {
                    }
                    iy2Var2.mo13082k(m46Var.f50574b);
                    if (iM14829m == 1483304551) {
                        if (j3 != -1) {
                            jM22801F2 = -9223372036854775807L;
                        } else {
                            jM22801F2 = -9223372036854775807L;
                        }
                        if (jM22801F2 != -9223372036854775807L) {
                            xi1Var = new bab(position, i7, jM22801F2, i8, jM14807B, jArr);
                        }
                    } else {
                        length = iy2Var2.getLength();
                        if (j3 != -1) {
                            jM22801F = -9223372036854775807L;
                        } else {
                            jM22801F = -9223372036854775807L;
                        }
                        if (jM22801F != -9223372036854775807L) {
                            if (jM14807B != -1) {
                                length = position + jM14807B;
                                j4 = jM14807B - ((long) i7);
                            } else if (length != -1) {
                                j4 = (length - position) - ((long) i7);
                            }
                            long j9 = length;
                            long j10 = j4;
                            RoundingMode roundingMode2 = RoundingMode.HALF_UP;
                            xi1Var = new xi1(j9, position + ((long) i7), AbstractC1110a.m6362b(uma.m22803H(j10, 8000000L, jM22801F, roundingMode2)), AbstractC1110a.m6362b(anb.m620b(j10, j3, roundingMode2)), false, true);
                        }
                    }
                }
                xi1Var = null;
            } else {
                long length2 = iy2Var2.getLength();
                long position2 = iy2Var2.getPosition();
                k47Var.m14819N(6);
                int iM14829m3 = k47Var.m14829m();
                j2 = -9223372036854775807L;
                long j11 = position2 + ((long) m46Var.f50574b);
                long j12 = j11 + ((long) iM14829m3);
                int iM14829m4 = k47Var.m14829m();
                if (iM14829m4 <= 0) {
                    i4 = 0;
                } else {
                    i4 = 0;
                    long jM22801F3 = uma.m22801F(m46Var.f50575c, (((long) iM14829m4) * ((long) m46Var.f50578f)) - 1);
                    int iM14812G5 = k47Var.m14812G();
                    int iM14812G6 = k47Var.m14812G();
                    int iM14812G7 = k47Var.m14812G();
                    k47Var.m14819N(2);
                    long[] jArr3 = new long[iM14812G5];
                    long[] jArr4 = new long[iM14812G5];
                    long j13 = position2 + ((long) m46Var.f50574b);
                    int i19 = 0;
                    while (true) {
                        if (i19 >= iM14812G5) {
                            if (length2 == -1 || length2 == j12) {
                                j5 = j12;
                            } else {
                                StringBuilder sbM22996s = ux5.m22996s(length2, "VBRI data size mismatch: ", ", ");
                                j5 = j12;
                                sbM22996s.append(j5);
                                ss5.m21707d0("VbriSeeker", sbM22996s.toString());
                            }
                            if (j5 != j13) {
                                StringBuilder sbM22996s2 = ux5.m22996s(j5, "VBRI bytes and ToC mismatch (using max): ", ", ");
                                sbM22996s2.append(j13);
                                sbM22996s2.append("\nSeeking will be inaccurate.");
                                ss5.m21707d0("VbriSeeker", sbM22996s2.toString());
                                jMax = Math.max(j5, j13);
                            } else {
                                jMax = j5;
                            }
                            xi1Var = new eoa(jArr3, jArr4, jM22801F3, j11, jMax, m46Var.f50577e);
                            break;
                        }
                        jArr3[i19] = (((long) i19) * jM22801F3) / ((long) iM14812G5);
                        jArr4[i19] = j13;
                        if (iM14812G7 == 1) {
                            iM14842z = k47Var.m14842z();
                        } else if (iM14812G7 == 2) {
                            iM14842z = k47Var.m14812G();
                        } else if (iM14812G7 == 3) {
                            iM14842z = k47Var.m14808C();
                        } else if (iM14812G7 == 4) {
                            iM14842z = k47Var.m14809D();
                        }
                        j13 += ((long) iM14812G6) * ((long) iM14842z);
                        i19++;
                    }
                    iy2Var2 = iy2Var;
                    iy2Var2.mo13082k(m46Var.f50574b);
                    a46Var = this;
                    ak3Var = ak3Var;
                }
                xi1Var = null;
                iy2Var2 = iy2Var;
                iy2Var2.mo13082k(m46Var.f50574b);
                a46Var = this;
                ak3Var = ak3Var;
            }
            ey5 ey5Var2 = a46Var.f231k;
            long position3 = iy2Var2.getPosition();
            if (ey5Var2 == null) {
                j06Var = null;
            } else {
                li7 li7VarM6264a = AbstractC1081a.m6264a();
                dy5[] dy5VarArr = ey5Var2.f38074a;
                int length3 = dy5VarArr.length;
                int i20 = i4;
                while (true) {
                    if (i20 >= length3) {
                        dy5Var = null;
                        break;
                    }
                    dy5 dy5Var3 = dy5VarArr[i20];
                    if (i06.class.isAssignableFrom(dy5Var3.getClass())) {
                        dy5Var = (dy5) i06.class.cast(dy5Var3);
                        if (!li7VarM6264a.apply(dy5Var)) {
                            dy5Var = null;
                        }
                    } else {
                        dy5Var = null;
                    }
                    if (dy5Var != null) {
                        break;
                    }
                    i20++;
                }
                i06 i06Var = (i06) dy5Var;
                if (i06Var == null) {
                    j06Var = null;
                } else {
                    int[] iArr = i06Var.f43286e;
                    dy5[] dy5VarArr2 = ey5Var2.f38074a;
                    int length4 = dy5VarArr2.length;
                    int i21 = i4;
                    while (true) {
                        if (i21 >= length4) {
                            dy5Var2 = null;
                            break;
                        }
                        dy5 dy5Var4 = dy5VarArr2[i21];
                        if (bw9.class.isAssignableFrom(dy5Var4.getClass())) {
                            dy5Var2 = (dy5) bw9.class.cast(dy5Var4);
                            if (!((bw9) dy5Var2).f7687a.equals("TLEN")) {
                                dy5Var2 = null;
                            }
                        } else {
                            dy5Var2 = null;
                        }
                        if (dy5Var2 != null) {
                            break;
                        }
                        i21++;
                    }
                    bw9 bw9Var = (bw9) dy5Var2;
                    if (bw9Var == null) {
                        jM22797B = j2;
                        i10 = i4;
                    } else {
                        i10 = i4;
                        jM22797B = uma.m22797B(Long.parseLong((String) bw9Var.f9105c.get(i10)));
                    }
                    int length5 = iArr.length;
                    int i22 = length5 + 1;
                    long[] jArr5 = new long[i22];
                    long[] jArr6 = new long[i22];
                    jArr5[i10] = position3;
                    jArr6[i10] = 0;
                    long j14 = 0;
                    int i23 = 1;
                    while (i23 <= length5) {
                        int i24 = i23 - 1;
                        long j15 = position3 + ((long) (i06Var.f43284c + iArr[i24]));
                        j14 += (long) (i06Var.f43285d + i06Var.f43287f[i24]);
                        jArr5[i23] = j15;
                        jArr6[i23] = j14;
                        i23++;
                        length5 = length5;
                        position3 = j15;
                    }
                    j06Var = new j06(jM22797B, jArr5, jArr6);
                }
            }
            boolean z = a46Var.f239s;
            int i25 = a46Var.f221a;
            if (z) {
                j06Var = new vt8(j2);
            } else {
                if (j06Var == null) {
                    j06Var = xi1Var != null ? xi1Var : null;
                }
                if (j06Var == null) {
                    j06Var = a46Var.m114g(iy2Var2, (i25 & 2) != 0);
                }
                if ((i25 & 4) != 0 && !j06Var.mo3541c()) {
                    j06Var = new q34(j06Var.mo3545h(), iy2Var2.getPosition(), j06Var.mo3539a());
                }
                if (!j06Var.mo3541c() && !(j06Var instanceof xi1) && (i25 & 1) != 0 && j06Var.mo3545h() != -9223372036854775807L && (j06Var.mo3539a() != -1 || iy2Var2.getLength() != -1)) {
                    long jMo3540b = j06Var.mo3540b() != -1 ? j06Var.mo3540b() : 0L;
                    long jMo3539a = j06Var.mo3539a() != -1 ? j06Var.mo3539a() : iy2Var2.getLength();
                    j06Var = new xi1(jMo3539a, jMo3540b, AbstractC1110a.m6364d(uma.m22803H(jMo3539a - jMo3540b, 8000000L, j06Var.mo3545h(), RoundingMode.HALF_UP)), -1, false, true);
                } else if (!j06Var.mo3541c() && !(j06Var instanceof xi1) && (i25 & 1) != 0) {
                    j06Var = a46Var.m114g(iy2Var2, (i25 & 2) != 0);
                }
                a46Var.f228h.mo2534d(j06Var.mo3545h());
            }
            a46Var.f238r = j06Var;
            a46Var.f227g.mo2558q(j06Var);
            ey5 ey5VarM11387b = a46Var.f231k;
            if (ey5VarM11387b == null || (i25 & 8) != 0) {
                ey5VarM11387b = a46Var.f232l;
            } else {
                ey5 ey5Var3 = a46Var.f232l;
                if (ey5Var3 != null) {
                    ey5VarM11387b = ey5VarM11387b.m11387b(ey5Var3);
                }
            }
            lc3 lc3Var = new lc3();
            lc3Var.f49452m = ez5.m11402l("audio/mpeg");
            lc3Var.f49453n = ez5.m11402l((String) m46Var.f50579g);
            lc3Var.f49454o = 4096;
            lc3Var.f49430F = m46Var.f50576d;
            lc3Var.f49431G = m46Var.f50575c;
            lc3Var.f49433I = ak3Var.f763a;
            lc3Var.f49434J = ak3Var.f764b;
            lc3Var.f49450k = ey5VarM11387b;
            if (a46Var.f238r.mo3544g() != -2147483647) {
                lc3Var.f49447h = a46Var.f238r.mo3544g();
            }
            a46Var.f229i.mo2537g(new C0713b(lc3Var));
            a46Var.f235o = iy2Var2.getPosition();
        } else {
            a46Var = this;
            j = 1000000;
            if (a46Var.f235o != 0) {
                long position4 = iy2Var2.getPosition();
                long j16 = a46Var.f235o;
                if (position4 < j16) {
                    iy2Var2.mo13082k((int) (j16 - position4));
                }
            }
        }
        if (a46Var.f237q == 0) {
            iy2Var2.mo13080i();
            if (m116i(iy2Var)) {
                i = -1;
            } else {
                k47 k47Var2 = a46Var.f222b;
                k47Var2.m14818M(0);
                int iM14829m5 = k47Var2.m14829m();
                if (((-128000) & iM14829m5) != (((long) a46Var.f230j) & (-128000)) || tuc.m22309a(iM14829m5) == -1) {
                    iy2Var2.mo13082k(1);
                    a46Var.f230j = 0;
                } else {
                    m46Var.m16621a(iM14829m5);
                    if (a46Var.f233m == -9223372036854775807L) {
                        a46Var.f233m = a46Var.f238r.mo3542d(iy2Var2.getPosition());
                    }
                    a46Var.f237q = m46Var.f50574b;
                    long position5 = iy2Var2.getPosition() + ((long) m46Var.f50574b);
                    a46Var.f236p = position5;
                    wt8 wt8Var = a46Var.f238r;
                    if (wt8Var instanceof q34) {
                        p34 p34Var = ((q34) wt8Var).f57188d;
                        long j17 = (((a46Var.f234n + ((long) m46Var.f50578f)) * j) / ((long) m46Var.f50575c)) + a46Var.f233m;
                        ztb ztbVar = p34Var.f55516b;
                        int i26 = ztbVar.f72161b;
                        if (i26 == 0 || j17 - ztbVar.m25782d(i26 - 1) >= 100000) {
                            p34Var.m18880i(j17, position5);
                        }
                        if (a46Var.f240t) {
                            long j18 = a46Var.f241u;
                            ztb ztbVar2 = p34Var.f55516b;
                            int i27 = ztbVar2.f72161b;
                            if (i27 != 0 && j18 - ztbVar2.m25782d(i27 - 1) < 100000) {
                                a46Var.f240t = false;
                                a46Var.f229i = a46Var.f228h;
                            }
                        }
                    }
                    iMo2533c = a46Var.f229i.mo2533c(iy2Var2, a46Var.f237q, true);
                    if (iMo2533c == -1) {
                        i = -1;
                    } else {
                        i3 = a46Var.f237q - iMo2533c;
                        a46Var.f237q = i3;
                        if (i3 <= 0) {
                            a46Var.f229i.mo2531a(((a46Var.f234n * j) / ((long) m46Var.f50575c)) + a46Var.f233m, 1, m46Var.f50574b, 0, null);
                            a46Var.f234n += (long) m46Var.f50578f;
                            a46Var.f237q = 0;
                            i = 0;
                        }
                    }
                }
                i = 0;
            }
        } else {
            iMo2533c = a46Var.f229i.mo2533c(iy2Var2, a46Var.f237q, true);
            if (iMo2533c == -1) {
                i = -1;
            } else {
                i3 = a46Var.f237q - iMo2533c;
                a46Var.f237q = i3;
                if (i3 <= 0) {
                    i = 0;
                } else {
                    a46Var.f229i.mo2531a(((a46Var.f234n * j) / ((long) m46Var.f50575c)) + a46Var.f233m, 1, m46Var.f50574b, 0, null);
                    a46Var.f234n += (long) m46Var.f50578f;
                    a46Var.f237q = 0;
                    i = 0;
                }
            }
        }
        i2 = -1;
        if (i == i2) {
            wt8 wt8Var2 = a46Var.f238r;
            if (wt8Var2 instanceof q34) {
                long j19 = ((a46Var.f234n * j) / ((long) m46Var.f50575c)) + a46Var.f233m;
                if (wt8Var2.mo3545h() != j19) {
                    wt8 wt8Var3 = a46Var.f238r;
                    ((q34) wt8Var3).f57188d.f55517c = j19;
                    a46Var.f227g.mo2558q(wt8Var3);
                    a46Var.f228h.mo2534d(a46Var.f238r.mo3545h());
                }
            }
        }
        return i;
    }

    @Override // p000.hy2
    /* JADX INFO: renamed from: c */
    public final boolean mo111c(iy2 iy2Var) {
        return m117j(iy2Var, true);
    }

    @Override // p000.hy2
    /* JADX INFO: renamed from: d */
    public final void mo112d(long j, long j2) {
        this.f230j = 0;
        this.f233m = -9223372036854775807L;
        this.f234n = 0L;
        this.f237q = 0;
        this.f236p = -1L;
        this.f241u = j2;
        wt8 wt8Var = this.f238r;
        if (wt8Var instanceof q34) {
            ztb ztbVar = ((q34) wt8Var).f57188d.f55516b;
            int i = ztbVar.f72161b;
            if (i != 0 && j2 - ztbVar.m25782d(i - 1) < 100000) {
                return;
            }
            this.f240t = true;
            this.f229i = this.f226f;
        }
    }

    @Override // p000.hy2
    /* JADX INFO: renamed from: f */
    public final void mo113f(jy2 jy2Var) {
        this.f227g = jy2Var;
        n8a n8aVarMo2555n = jy2Var.mo2555n(0, 1);
        this.f228h = n8aVarMo2555n;
        this.f229i = n8aVarMo2555n;
        this.f227g.mo2551j();
    }

    /* JADX INFO: renamed from: g */
    public final xi1 m114g(iy2 iy2Var, boolean z) {
        k47 k47Var = this.f222b;
        iy2Var.mo13085o(k47Var.f46700a, 0, 4);
        k47Var.m14818M(0);
        int iM14829m = k47Var.m14829m();
        m46 m46Var = this.f223c;
        m46Var.m16621a(iM14829m);
        return new xi1(iy2Var.getLength(), iy2Var.getPosition(), m46Var.f50577e, m46Var.f50574b, z, true);
    }

    /* JADX INFO: renamed from: h */
    public final void m115h() {
        wt8 wt8Var = this.f238r;
        if ((wt8Var instanceof xi1) && ((xi1) wt8Var).mo3541c()) {
            long j = this.f236p;
            if (j == -1 || j == this.f238r.mo3539a()) {
                return;
            }
            xi1 xi1Var = (xi1) this.f238r;
            this.f238r = new xi1(this.f236p, xi1Var.f68241i, xi1Var.f68242j, xi1Var.f68243k, xi1Var.f68244l, false);
            jy2 jy2Var = this.f227g;
            jy2Var.getClass();
            jy2Var.mo2558q(this.f238r);
            n8a n8aVar = this.f228h;
            n8aVar.getClass();
            n8aVar.mo2534d(this.f238r.mo3545h());
        }
    }

    /* JADX INFO: renamed from: i */
    public final boolean m116i(iy2 iy2Var) {
        wt8 wt8Var = this.f238r;
        if (wt8Var != null) {
            long jMo3539a = wt8Var.mo3539a();
            if (jMo3539a == -1 || iy2Var.mo13077e() <= jMo3539a - 4) {
            }
            return true;
        }
        try {
            return !iy2Var.mo13076d(this.f222b.f46700a, 0, 4, true);
        } catch (EOFException unused) {
        }
    }

    /* JADX INFO: renamed from: j */
    public final boolean m117j(iy2 iy2Var, boolean z) throws EOFException {
        int iMo13077e;
        int i;
        int iM22309a;
        iy2Var.mo13080i();
        if (iy2Var.getPosition() == 0) {
            ey5 ey5VarM4793D = this.f225e.m4793D(iy2Var, (this.f221a & 8) == 0 ? null : f220v, 131072);
            this.f231k = ey5VarM4793D;
            if (ey5VarM4793D != null) {
                this.f224d.m528b(ey5VarM4793D);
            }
            iMo13077e = (int) iy2Var.mo13077e();
            if (!z) {
                iy2Var.mo13082k(iMo13077e);
            }
            i = 0;
        } else {
            iMo13077e = 0;
            i = 0;
        }
        int i2 = i;
        int i3 = i2;
        while (true) {
            if (m116i(iy2Var)) {
                if (i2 > 0) {
                    break;
                }
                m115h();
                throw new EOFException();
            }
            k47 k47Var = this.f222b;
            k47Var.m14818M(0);
            int iM14829m = k47Var.m14829m();
            if ((i == 0 || ((-128000) & iM14829m) == (((long) i) & (-128000))) && (iM22309a = tuc.m22309a(iM14829m)) != -1) {
                i2++;
                if (i2 != 1) {
                    if (i2 == 4) {
                        break;
                    }
                } else {
                    this.f223c.m16621a(iM14829m);
                    i = iM14829m;
                }
                iy2Var.mo13078f(iM22309a - 4);
            } else {
                int i4 = i3 + 1;
                if (i3 == 131072) {
                    if (z) {
                        return false;
                    }
                    m115h();
                    throw new EOFException();
                }
                if (z) {
                    iy2Var.mo13080i();
                    iy2Var.mo13078f(iMo13077e + i4);
                } else {
                    iy2Var.mo13082k(1);
                }
                i2 = 0;
                i3 = i4;
                i = 0;
            }
        }
        if (z) {
            iy2Var.mo13082k(iMo13077e + i3);
        } else {
            iy2Var.mo13080i();
        }
        this.f230j = i;
        return true;
    }
}
