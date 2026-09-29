package p000;

import androidx.media3.common.C0713b;
import androidx.media3.common.ParserException;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class y1b extends ik9 {

    /* JADX INFO: renamed from: n */
    public fn3 f69107n;

    /* JADX INFO: renamed from: o */
    public int f69108o;

    /* JADX INFO: renamed from: p */
    public boolean f69109p;

    /* JADX INFO: renamed from: q */
    public m46 f69110q;

    /* JADX INFO: renamed from: r */
    public nha f69111r;

    @Override // p000.ik9
    /* JADX INFO: renamed from: a */
    public final void mo13995a(long j) {
        this.f44230g = j;
        this.f69109p = j != 0;
        m46 m46Var = this.f69110q;
        this.f69108o = m46Var != null ? m46Var.f50577e : 0;
    }

    @Override // p000.ik9
    /* JADX INFO: renamed from: b */
    public final long mo13996b(k47 k47Var) {
        byte b = k47Var.f46700a[0];
        if ((b & 1) == 1) {
            return -1L;
        }
        fn3 fn3Var = this.f69107n;
        fn3Var.getClass();
        boolean z = ((l34[]) fn3Var.f39337f)[(b >> 1) & (255 >>> (8 - fn3Var.f39333b))].f48986b;
        m46 m46Var = (m46) fn3Var.f39334c;
        int i = !z ? m46Var.f50577e : m46Var.f50578f;
        long j = this.f69109p ? (this.f69108o + i) / 4 : 0;
        byte[] bArr = k47Var.f46700a;
        int length = bArr.length;
        int i2 = k47Var.f46702c + 4;
        if (length < i2) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, i2);
            k47Var.m14816K(bArrCopyOf.length, bArrCopyOf);
        } else {
            k47Var.m14817L(i2);
        }
        byte[] bArr2 = k47Var.f46700a;
        int i3 = k47Var.f46702c;
        bArr2[i3 - 4] = (byte) (j & 255);
        bArr2[i3 - 3] = (byte) ((j >>> 8) & 255);
        bArr2[i3 - 2] = (byte) ((j >>> 16) & 255);
        bArr2[i3 - 1] = (byte) ((j >>> 24) & 255);
        this.f69109p = true;
        this.f69108o = i;
        return j;
    }

    /* JADX WARN: Code duplicated, block: B:166:0x03ae A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:168:0x03b1  */
    /* JADX WARN: Type inference failed for: r1v48, types: [byte[], java.io.Serializable] */
    @Override // p000.ik9
    /* JADX INFO: renamed from: c */
    public final boolean mo13997c(k47 k47Var, long j, p33 p33Var) throws ParserException {
        fn3 fn3Var;
        if (this.f69107n != null) {
            ((C0713b) p33Var.f55513b).getClass();
            return false;
        }
        m46 m46Var = this.f69110q;
        int i = 4;
        if (m46Var != null) {
            nha nhaVar = this.f69111r;
            if (nhaVar == null) {
                this.f69111r = lbd.m16064d(k47Var, true, true);
            } else {
                int i2 = k47Var.f46702c;
                byte[] bArr = new byte[i2];
                System.arraycopy(k47Var.f46700a, 0, bArr, 0, i2);
                int i3 = m46Var.f50573a;
                int i4 = 5;
                lbd.m16065e(5, k47Var, false);
                int iM14842z = k47Var.m14842z() + 1;
                so0 so0Var = new so0(k47Var.f46700a);
                int i5 = 8;
                so0Var.m21511o(k47Var.f46701b * 8);
                int i6 = 0;
                while (true) {
                    int i7 = 16;
                    if (i6 < iM14842z) {
                        int i8 = i5;
                        if (so0Var.m21503g(24) != 5653314) {
                            throw ParserException.m2516a(null, "expected code book to start with [0x56, 0x43, 0x42] at " + ((so0Var.f61085d * 8) + so0Var.f61086e));
                        }
                        int iM21503g = so0Var.m21503g(16);
                        int iM21503g2 = so0Var.m21503g(24);
                        if (so0Var.m21502f()) {
                            so0Var.m21511o(i4);
                            int iM21503g3 = 0;
                            while (iM21503g3 < iM21503g2) {
                                int i9 = 0;
                                for (int i10 = iM21503g2 - iM21503g3; i10 > 0; i10 >>>= 1) {
                                    i9++;
                                }
                                iM21503g3 += so0Var.m21503g(i9);
                            }
                        } else {
                            boolean zM21502f = so0Var.m21502f();
                            for (int i11 = 0; i11 < iM21503g2; i11++) {
                                if (!zM21502f) {
                                    so0Var.m21511o(i4);
                                } else if (so0Var.m21502f()) {
                                    so0Var.m21511o(i4);
                                }
                            }
                        }
                        int iM21503g4 = so0Var.m21503g(4);
                        if (iM21503g4 > 2) {
                            throw ParserException.m2516a(null, "lookup type greater than 2 not decodable: " + iM21503g4);
                        }
                        if (iM21503g4 == 1 || iM21503g4 == 2) {
                            so0Var.m21511o(32);
                            so0Var.m21511o(32);
                            int iM21503g5 = so0Var.m21503g(4) + 1;
                            so0Var.m21511o(1);
                            so0Var.m21511o((int) ((iM21503g4 == 1 ? iM21503g != 0 ? (long) Math.floor(Math.pow(iM21503g2, 1.0d / ((double) iM21503g))) : 0L : ((long) iM21503g2) * ((long) iM21503g)) * ((long) iM21503g5)));
                        }
                        i6++;
                        i5 = i8;
                        i4 = 5;
                    } else {
                        int i12 = i5;
                        int i13 = 6;
                        int iM21503g6 = so0Var.m21503g(6) + 1;
                        for (int i14 = 0; i14 < iM21503g6; i14++) {
                            if (so0Var.m21503g(16) != 0) {
                                throw ParserException.m2516a(null, "placeholder of time domain transforms not zeroed out");
                            }
                        }
                        int i15 = 1;
                        int iM21503g7 = so0Var.m21503g(6) + 1;
                        int i16 = 0;
                        while (true) {
                            int i17 = 3;
                            if (i16 >= iM21503g7) {
                                int iM21503g8 = so0Var.m21503g(i13) + 1;
                                int i18 = 0;
                                while (i18 < iM21503g8) {
                                    if (so0Var.m21503g(16) > 2) {
                                        throw ParserException.m2516a(null, "residueType greater than 2 is not decodable");
                                    }
                                    so0Var.m21511o(24);
                                    so0Var.m21511o(24);
                                    so0Var.m21511o(24);
                                    int iM21503g9 = so0Var.m21503g(i13) + 1;
                                    int i19 = 8;
                                    so0Var.m21511o(8);
                                    int[] iArr = new int[iM21503g9];
                                    for (int i20 = 0; i20 < iM21503g9; i20++) {
                                        iArr[i20] = ((so0Var.m21502f() ? so0Var.m21503g(5) : 0) * 8) + so0Var.m21503g(3);
                                    }
                                    int i21 = 0;
                                    while (i21 < iM21503g9) {
                                        int i22 = 0;
                                        while (i22 < i19) {
                                            if ((iArr[i21] & (1 << i22)) != 0) {
                                                so0Var.m21511o(i19);
                                            }
                                            i22++;
                                            i19 = 8;
                                        }
                                        i21++;
                                        i19 = 8;
                                    }
                                    i18++;
                                    i13 = 6;
                                }
                                int iM21503g10 = so0Var.m21503g(i13) + 1;
                                for (int i23 = 0; i23 < iM21503g10; i23++) {
                                    int iM21503g11 = so0Var.m21503g(16);
                                    if (iM21503g11 != 0) {
                                        ss5.m21723u("VorbisUtil", "mapping type other than 0 not supported: " + iM21503g11);
                                    } else {
                                        int iM21503g12 = so0Var.m21502f() ? so0Var.m21503g(4) + 1 : 1;
                                        if (so0Var.m21502f()) {
                                            int iM21503g13 = so0Var.m21503g(8) + 1;
                                            for (int i24 = 0; i24 < iM21503g13; i24++) {
                                                int i25 = i3 - 1;
                                                int i26 = 0;
                                                for (int i27 = i25; i27 > 0; i27 >>>= 1) {
                                                    i26++;
                                                }
                                                so0Var.m21511o(i26);
                                                int i28 = 0;
                                                while (i25 > 0) {
                                                    i28++;
                                                    i25 >>>= 1;
                                                }
                                                so0Var.m21511o(i28);
                                            }
                                        }
                                        if (so0Var.m21503g(2) != 0) {
                                            throw ParserException.m2516a(null, "to reserved bits must be zero after mapping coupling steps");
                                        }
                                        if (iM21503g12 > 1) {
                                            for (int i29 = 0; i29 < i3; i29++) {
                                                so0Var.m21511o(4);
                                            }
                                        }
                                        for (int i30 = 0; i30 < iM21503g12; i30++) {
                                            so0Var.m21511o(8);
                                            so0Var.m21511o(8);
                                            so0Var.m21511o(8);
                                        }
                                    }
                                }
                                int iM21503g14 = so0Var.m21503g(6);
                                int i31 = iM21503g14 + 1;
                                l34[] l34VarArr = new l34[i31];
                                for (int i32 = 0; i32 < i31; i32++) {
                                    boolean zM21502f2 = so0Var.m21502f();
                                    so0Var.m21503g(16);
                                    so0Var.m21503g(16);
                                    so0Var.m21503g(8);
                                    l34VarArr[i32] = new l34(1, zM21502f2);
                                }
                                if (!so0Var.m21502f()) {
                                    throw ParserException.m2516a(null, "framing bit after modes not set as expected");
                                }
                                int i33 = 0;
                                while (iM21503g14 > 0) {
                                    i33++;
                                    iM21503g14 >>>= 1;
                                }
                                fn3Var = new fn3(m46Var, nhaVar, bArr, l34VarArr, i33);
                                break;
                            }
                            int iM21503g15 = so0Var.m21503g(i7);
                            if (iM21503g15 == 0) {
                                int i34 = i12;
                                so0Var.m21511o(i34);
                                so0Var.m21511o(16);
                                so0Var.m21511o(16);
                                so0Var.m21511o(6);
                                so0Var.m21511o(i34);
                                int iM21503g16 = so0Var.m21503g(4) + 1;
                                int i35 = 0;
                                while (i35 < iM21503g16) {
                                    so0Var.m21511o(i34);
                                    i35++;
                                    i34 = 8;
                                }
                            } else {
                                if (iM21503g15 != i15) {
                                    throw ParserException.m2516a(null, "floor type greater than 1 not decodable: " + iM21503g15);
                                }
                                int iM21503g17 = so0Var.m21503g(5);
                                int[] iArr2 = new int[iM21503g17];
                                int i36 = -1;
                                for (int i37 = 0; i37 < iM21503g17; i37++) {
                                    int iM21503g18 = so0Var.m21503g(i);
                                    iArr2[i37] = iM21503g18;
                                    if (iM21503g18 > i36) {
                                        i36 = iM21503g18;
                                    }
                                }
                                int i38 = i36 + 1;
                                int[] iArr3 = new int[i38];
                                int i39 = 0;
                                while (i39 < i38) {
                                    iArr3[i39] = so0Var.m21503g(i17) + 1;
                                    int iM21503g19 = so0Var.m21503g(2);
                                    int i40 = i12;
                                    if (iM21503g19 > 0) {
                                        so0Var.m21511o(i40);
                                    }
                                    int[] iArr4 = iArr3;
                                    int i41 = 0;
                                    for (int i42 = 1; i41 < (i42 << iM21503g19); i42 = 1) {
                                        so0Var.m21511o(i40);
                                        i41++;
                                        i40 = 8;
                                    }
                                    i39++;
                                    iArr3 = iArr4;
                                    i12 = 8;
                                    i17 = 3;
                                }
                                int[] iArr5 = iArr3;
                                so0Var.m21511o(2);
                                int iM21503g20 = so0Var.m21503g(4);
                                int i43 = 0;
                                int i44 = 0;
                                for (int i45 = 0; i45 < iM21503g17; i45++) {
                                    i43 += iArr5[iArr2[i45]];
                                    while (i44 < i43) {
                                        so0Var.m21511o(iM21503g20);
                                        i44++;
                                    }
                                }
                            }
                            i16++;
                            i12 = 8;
                            i13 = 6;
                            i = 4;
                            i7 = 16;
                            i15 = 1;
                        }
                    }
                }
            }
            this.f69107n = fn3Var;
            if (fn3Var == null) {
                return true;
            }
            m46 m46Var2 = (m46) fn3Var.f39334c;
            ArrayList arrayList = new ArrayList();
            arrayList.add((byte[]) m46Var2.f50579g);
            arrayList.add((byte[]) fn3Var.f39336e);
            ey5 ey5VarM16063c = lbd.m16063c(ImmutableList.m6288s((String[]) ((nha) fn3Var.f39335d).f52742a));
            lc3 lc3Var = new lc3();
            lc3Var.f49452m = ez5.m11402l("audio/ogg");
            lc3Var.f49453n = ez5.m11402l("audio/vorbis");
            lc3Var.f49447h = m46Var2.f50576d;
            lc3Var.f49448i = m46Var2.f50575c;
            lc3Var.f49430F = m46Var2.f50573a;
            lc3Var.f49431G = m46Var2.f50574b;
            lc3Var.f49456q = arrayList;
            lc3Var.f49450k = ey5VarM16063c;
            p33Var.f55513b = new C0713b(lc3Var);
            return true;
        }
        lbd.m16065e(1, k47Var, false);
        k47Var.m14834r();
        int iM14842z2 = k47Var.m14842z();
        int iM14834r = k47Var.m14834r();
        int iM14831o = k47Var.m14831o();
        if (iM14831o <= 0) {
            iM14831o = -1;
        }
        int iM14831o2 = k47Var.m14831o();
        int i46 = iM14831o2 > 0 ? iM14831o2 : -1;
        k47Var.m14831o();
        int iM14842z3 = k47Var.m14842z();
        int iPow = (int) Math.pow(2.0d, iM14842z3 & 15);
        int iPow2 = (int) Math.pow(2.0d, (iM14842z3 & 240) >> 4);
        k47Var.m14842z();
        ?? CopyOf = Arrays.copyOf(k47Var.f46700a, k47Var.f46702c);
        m46 m46Var3 = new m46();
        m46Var3.f50573a = iM14842z2;
        m46Var3.f50574b = iM14834r;
        m46Var3.f50575c = iM14831o;
        m46Var3.f50576d = i46;
        m46Var3.f50577e = iPow;
        m46Var3.f50578f = iPow2;
        m46Var3.f50579g = CopyOf;
        this.f69110q = m46Var3;
        fn3Var = null;
        this.f69107n = fn3Var;
        if (fn3Var == null) {
            return true;
        }
        m46 m46Var4 = (m46) fn3Var.f39334c;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add((byte[]) m46Var4.f50579g);
        arrayList2.add((byte[]) fn3Var.f39336e);
        ey5 ey5VarM16063c2 = lbd.m16063c(ImmutableList.m6288s((String[]) ((nha) fn3Var.f39335d).f52742a));
        lc3 lc3Var2 = new lc3();
        lc3Var2.f49452m = ez5.m11402l("audio/ogg");
        lc3Var2.f49453n = ez5.m11402l("audio/vorbis");
        lc3Var2.f49447h = m46Var4.f50576d;
        lc3Var2.f49448i = m46Var4.f50575c;
        lc3Var2.f49430F = m46Var4.f50573a;
        lc3Var2.f49431G = m46Var4.f50574b;
        lc3Var2.f49456q = arrayList2;
        lc3Var2.f49450k = ey5VarM16063c2;
        p33Var.f55513b = new C0713b(lc3Var2);
        return true;
    }

    @Override // p000.ik9
    /* JADX INFO: renamed from: d */
    public final void mo13998d(boolean z) {
        super.mo13998d(z);
        if (z) {
            this.f69107n = null;
            this.f69110q = null;
            this.f69111r = null;
        }
        this.f69108o = 0;
        this.f69109p = false;
    }
}
