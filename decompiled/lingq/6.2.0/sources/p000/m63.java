package p000;

import androidx.media3.common.C0713b;
import androidx.media3.common.ParserException;
import com.google.common.collect.ImmutableList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class m63 implements hy2 {

    /* JADX INFO: renamed from: e */
    public jy2 f50643e;

    /* JADX INFO: renamed from: f */
    public n8a f50644f;

    /* JADX INFO: renamed from: h */
    public ey5 f50646h;

    /* JADX INFO: renamed from: i */
    public p63 f50647i;

    /* JADX INFO: renamed from: j */
    public int f50648j;

    /* JADX INFO: renamed from: k */
    public int f50649k;

    /* JADX INFO: renamed from: l */
    public l63 f50650l;

    /* JADX INFO: renamed from: m */
    public int f50651m;

    /* JADX INFO: renamed from: n */
    public long f50652n;

    /* JADX INFO: renamed from: a */
    public final byte[] f50639a = new byte[42];

    /* JADX INFO: renamed from: b */
    public final k47 f50640b = new k47(0, new byte[32768]);

    /* JADX INFO: renamed from: c */
    public final boolean f50641c = false;

    /* JADX INFO: renamed from: d */
    public final n63 f50642d = new n63();

    /* JADX INFO: renamed from: g */
    public int f50645g = 0;

    @Override // p000.hy2
    /* JADX INFO: renamed from: a */
    public final void mo109a() {
    }

    @Override // p000.hy2
    /* JADX INFO: renamed from: b */
    public final int mo110b(iy2 iy2Var, n63 n63Var) throws ParserException {
        p63 p63Var;
        st8 h60Var;
        long j;
        long j2;
        long j3;
        boolean zM17390a;
        int i = this.f50645g;
        ey5 ey5Var = null;
        boolean z = true;
        int i2 = 0;
        if (i == 0) {
            iy2Var.mo13080i();
            long jMo13077e = iy2Var.mo13077e();
            ey5 ey5VarM4793D = new ck6(16).m4793D(iy2Var, !this.f50641c ? null : zy3.f72377b, 0);
            if (ey5VarM4793D != null && ey5VarM4793D.f38074a.length != 0) {
                ey5Var = ey5VarM4793D;
            }
            iy2Var.mo13082k((int) (iy2Var.mo13077e() - jMo13077e));
            this.f50646h = ey5Var;
            this.f50645g = 1;
            return 0;
        }
        byte[] bArr = this.f50639a;
        if (i == 1) {
            iy2Var.mo13085o(bArr, 0, bArr.length);
            iy2Var.mo13080i();
            this.f50645g = 2;
            return 0;
        }
        int i3 = 3;
        if (i == 2) {
            k47 k47Var = new k47(4);
            iy2Var.readFully(k47Var.f46700a, 0, 4);
            if (k47Var.m14807B() != 1716281667) {
                throw ParserException.m2516a(null, "Failed to read FLAC stream marker.");
            }
            this.f50645g = 3;
            return 0;
        }
        int i4 = 7;
        if (i == 3) {
            int i5 = 0;
            p63 p63Var2 = this.f50647i;
            boolean z2 = false;
            while (!z2) {
                iy2Var.mo13080i();
                byte[] bArr2 = new byte[4];
                so0 so0Var = new so0(4, bArr2);
                iy2Var.mo13085o(bArr2, i5, 4);
                boolean zM21502f = so0Var.m21502f();
                int iM21503g = so0Var.m21503g(i4);
                int iM21503g2 = so0Var.m21503g(24) + 4;
                if (iM21503g == 0) {
                    byte[] bArr3 = new byte[38];
                    iy2Var.readFully(bArr3, i5, 38);
                    p63Var2 = new p63(4, bArr3);
                } else {
                    if (p63Var2 == null) {
                        ij6.m13959q();
                        return 0;
                    }
                    ey5 ey5Var2 = p63Var2.f55643l;
                    if (iM21503g == i3) {
                        k47 k47Var2 = new k47(iM21503g2);
                        iy2Var.readFully(k47Var2.f46700a, i5, iM21503g2);
                        p63Var = new p63(p63Var2.f55632a, p63Var2.f55633b, p63Var2.f55634c, p63Var2.f55635d, p63Var2.f55636e, p63Var2.f55638g, p63Var2.f55639h, p63Var2.f55641j, odd.m17941a(k47Var2), p63Var2.f55643l);
                    } else if (iM21503g == 4) {
                        k47 k47Var3 = new k47(iM21503g2);
                        iy2Var.readFully(k47Var3.f46700a, 0, iM21503g2);
                        k47Var3.m14819N(4);
                        ey5 ey5VarM16063c = lbd.m16063c(Arrays.asList((String[]) lbd.m16064d(k47Var3, false, false).f52742a));
                        if (ey5Var2 != null) {
                            ey5VarM16063c = ey5Var2.m11387b(ey5VarM16063c);
                        }
                        p63Var = new p63(p63Var2.f55632a, p63Var2.f55633b, p63Var2.f55634c, p63Var2.f55635d, p63Var2.f55636e, p63Var2.f55638g, p63Var2.f55639h, p63Var2.f55641j, p63Var2.f55642k, ey5VarM16063c);
                    } else if (iM21503g == 6) {
                        k47 k47Var4 = new k47(iM21503g2);
                        iy2Var.readFully(k47Var4.f46700a, 0, iM21503g2);
                        k47Var4.m14819N(4);
                        ey5 ey5Var3 = new ey5(ImmutableList.m6291y(h87.m13141d(k47Var4)));
                        if (ey5Var2 != null) {
                            ey5Var3 = ey5Var2.m11387b(ey5Var3);
                        }
                        p63Var = new p63(p63Var2.f55632a, p63Var2.f55633b, p63Var2.f55634c, p63Var2.f55635d, p63Var2.f55636e, p63Var2.f55638g, p63Var2.f55639h, p63Var2.f55641j, p63Var2.f55642k, ey5Var3);
                    } else {
                        iy2Var.mo13082k(iM21503g2);
                    }
                    p63Var2 = p63Var;
                }
                String str = uma.f64080a;
                this.f50647i = p63Var2;
                z2 = zM21502f;
                i3 = 3;
                i4 = 7;
                i5 = 0;
            }
            this.f50647i.getClass();
            this.f50648j = Math.max(this.f50647i.f55634c, 6);
            C0713b c0713bM18920c = this.f50647i.m18920c(bArr, this.f50646h);
            n8a n8aVar = this.f50644f;
            lc3 lc3VarM2520a = c0713bM18920c.m2520a();
            lc3VarM2520a.f49452m = ez5.m11402l("audio/flac");
            n8aVar.mo2537g(new C0713b(lc3VarM2520a));
            this.f50644f.mo2534d(this.f50647i.m18919b());
            this.f50645g = 4;
            return 0;
        }
        long j4 = 0;
        if (i == 4) {
            iy2Var.mo13080i();
            k47 k47Var5 = new k47(2);
            iy2Var.mo13085o(k47Var5.f46700a, 0, 2);
            int iM14812G = k47Var5.m14812G();
            if ((iM14812G >> 2) != 16382) {
                iy2Var.mo13080i();
                throw ParserException.m2516a(null, "First frame does not start with sync code.");
            }
            iy2Var.mo13080i();
            this.f50649k = iM14812G;
            jy2 jy2Var = this.f50643e;
            String str2 = uma.f64080a;
            long position = iy2Var.getPosition();
            long length = iy2Var.getLength();
            this.f50647i.getClass();
            p63 p63Var3 = this.f50647i;
            p33 p33Var = p63Var3.f55642k;
            if (p33Var != null && ((long[]) p33Var.f55513b).length > 0) {
                h60Var = new h60(p63Var3, position, 1);
                i2 = 0;
            } else if (length == -1 || p63Var3.f55641j <= 0) {
                i2 = 0;
                h60Var = new h60(p63Var3.m18919b());
            } else {
                int i6 = this.f50649k;
                int i7 = p63Var3.f55634c;
                C3440oy c3440oy = new C3440oy(p63Var3, 16);
                k63 k63Var = new k63(p63Var3, i6);
                long jM18919b = p63Var3.m18919b();
                long j5 = p63Var3.f55641j;
                int i8 = p63Var3.f55635d;
                if (i8 > 0) {
                    j = (((long) i8) + ((long) i7)) / 2;
                    j2 = 1;
                } else {
                    int i9 = p63Var3.f55632a;
                    j = ((((i9 != p63Var3.f55633b || i9 <= 0) ? 4096L : i9) * ((long) p63Var3.f55638g)) * ((long) p63Var3.f55639h)) / 8;
                    j2 = 64;
                }
                l63 l63Var = new l63(c3440oy, k63Var, jM18919b, j5, position, length, j + j2, Math.max(6, i7));
                this.f50650l = l63Var;
                h60Var = l63Var.f49111a;
            }
            jy2Var.mo2558q(h60Var);
            this.f50645g = 5;
            return i2;
        }
        if (i != 5) {
            uk9.m22770c();
            return 0;
        }
        this.f50644f.getClass();
        this.f50647i.getClass();
        l63 l63Var2 = this.f50650l;
        if (l63Var2 != null && l63Var2.f49113c != null) {
            return l63Var2.m15826b(iy2Var, n63Var);
        }
        if (this.f50652n == -1) {
            p63 p63Var4 = this.f50647i;
            iy2Var.mo13080i();
            iy2Var.mo13078f(1);
            byte[] bArr4 = new byte[1];
            iy2Var.mo13085o(bArr4, 0, 1);
            boolean z3 = (bArr4[0] & 1) == 1;
            iy2Var.mo13078f(2);
            i4 = z3 ? 7 : 6;
            k47 k47Var6 = new k47(i4);
            byte[] bArr5 = k47Var6.f46700a;
            int i10 = 0;
            while (i10 < i4) {
                int iMo13079g = iy2Var.mo13079g(bArr5, i10, i4 - i10);
                if (iMo13079g == -1) {
                    break;
                }
                i10 += iMo13079g;
            }
            k47Var6.m14817L(i10);
            iy2Var.mo13080i();
            try {
                long jM14813H = k47Var6.m14813H();
                if (!z3) {
                    jM14813H *= (long) p63Var4.f55633b;
                }
                long j6 = p63Var4.f55641j;
                if (j6 == 0 || jM14813H <= j6) {
                    j4 = jM14813H;
                } else {
                    z = false;
                }
            } catch (NumberFormatException unused) {
            }
            if (!z) {
                throw ParserException.m2516a(null, null);
            }
            this.f50652n = j4;
        } else {
            k47 k47Var7 = this.f50640b;
            int i11 = k47Var7.f46702c;
            if (i11 < 32768) {
                int i12 = iy2Var.read(k47Var7.f46700a, i11, 32768 - i11);
                z = i12 == -1;
                if (!z) {
                    k47Var7.m14817L(i11 + i12);
                } else if (k47Var7.m14820a() == 0) {
                    long j7 = this.f50652n * 1000000;
                    p63 p63Var5 = this.f50647i;
                    String str3 = uma.f64080a;
                    this.f50644f.mo2531a(j7 / ((long) p63Var5.f55636e), 1, this.f50651m, 0, null);
                    return -1;
                }
            } else {
                z = false;
            }
            int i13 = k47Var7.f46701b;
            int i14 = this.f50651m;
            int i15 = this.f50648j;
            if (i14 < i15) {
                k47Var7.m14819N(Math.min(i15 - i14, k47Var7.m14820a()));
            }
            this.f50647i.getClass();
            int i16 = k47Var7.f46701b;
            while (true) {
                int i17 = k47Var7.f46702c - 16;
                n63 n63Var2 = this.f50642d;
                if (i16 > i17) {
                    if (z) {
                        while (true) {
                            int i18 = k47Var7.f46702c;
                            if (i16 <= i18 - this.f50648j) {
                                k47Var7.m14818M(i16);
                                try {
                                    zM17390a = ndd.m17390a(k47Var7, this.f50647i, this.f50649k, n63Var2);
                                } catch (IndexOutOfBoundsException unused2) {
                                    zM17390a = false;
                                }
                                if (k47Var7.f46701b > k47Var7.f46702c) {
                                    zM17390a = false;
                                }
                                if (zM17390a) {
                                    k47Var7.m14818M(i16);
                                    j3 = n63Var2.f52394a;
                                    break;
                                }
                                i16++;
                            } else {
                                k47Var7.m14818M(i18);
                            }
                        }
                    } else {
                        k47Var7.m14818M(i16);
                    }
                    j3 = -1;
                    break;
                }
                k47Var7.m14818M(i16);
                if (ndd.m17390a(k47Var7, this.f50647i, this.f50649k, n63Var2)) {
                    k47Var7.m14818M(i16);
                    j3 = n63Var2.f52394a;
                    break;
                }
                i16++;
            }
            int i19 = k47Var7.f46701b - i13;
            k47Var7.m14818M(i13);
            this.f50644f.mo2535e(i19, k47Var7);
            int i20 = this.f50651m + i19;
            this.f50651m = i20;
            if (j3 != -1) {
                long j8 = this.f50652n * 1000000;
                p63 p63Var6 = this.f50647i;
                String str4 = uma.f64080a;
                this.f50644f.mo2531a(j8 / ((long) p63Var6.f55636e), 1, i20, 0, null);
                this.f50651m = 0;
                this.f50652n = j3;
            }
            int length2 = k47Var7.f46700a.length - k47Var7.f46702c;
            if (k47Var7.m14820a() < 16 && length2 < 16) {
                int iM14820a = k47Var7.m14820a();
                byte[] bArr6 = k47Var7.f46700a;
                System.arraycopy(bArr6, k47Var7.f46701b, bArr6, 0, iM14820a);
                k47Var7.m14818M(0);
                k47Var7.m14817L(iM14820a);
            }
        }
        return 0;
    }

    @Override // p000.hy2
    /* JADX INFO: renamed from: c */
    public final boolean mo111c(iy2 iy2Var) {
        ey5 ey5VarM4793D = new ck6(16).m4793D(iy2Var, zy3.f72377b, 0);
        if (ey5VarM4793D != null) {
            int length = ey5VarM4793D.f38074a.length;
        }
        k47 k47Var = new k47(4);
        ((h62) iy2Var).mo13076d(k47Var.f46700a, 0, 4, false);
        return k47Var.m14807B() == 1716281667;
    }

    @Override // p000.hy2
    /* JADX INFO: renamed from: d */
    public final void mo112d(long j, long j2) {
        if (j == 0) {
            this.f50645g = 0;
        } else {
            l63 l63Var = this.f50650l;
            if (l63Var != null) {
                l63Var.m15827d(j2);
            }
        }
        this.f50652n = j2 != 0 ? -1L : 0L;
        this.f50651m = 0;
        this.f50640b.m14815J(0);
    }

    @Override // p000.hy2
    /* JADX INFO: renamed from: f */
    public final void mo113f(jy2 jy2Var) {
        this.f50643e = jy2Var;
        this.f50644f = jy2Var.mo2555n(0, 1);
        jy2Var.mo2551j();
    }
}
