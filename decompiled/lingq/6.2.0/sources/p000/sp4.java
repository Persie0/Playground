package p000;

import androidx.media3.common.C0713b;
import androidx.media3.common.ParserException;
import java.util.Collections;

/* JADX INFO: loaded from: classes2.dex */
public final class sp4 implements yo2 {

    /* JADX INFO: renamed from: a */
    public final String f61181a;

    /* JADX INFO: renamed from: b */
    public final int f61182b;

    /* JADX INFO: renamed from: c */
    public final k47 f61183c;

    /* JADX INFO: renamed from: d */
    public final so0 f61184d;

    /* JADX INFO: renamed from: e */
    public n8a f61185e;

    /* JADX INFO: renamed from: f */
    public String f61186f;

    /* JADX INFO: renamed from: g */
    public C0713b f61187g;

    /* JADX INFO: renamed from: h */
    public int f61188h;

    /* JADX INFO: renamed from: i */
    public int f61189i;

    /* JADX INFO: renamed from: j */
    public int f61190j;

    /* JADX INFO: renamed from: k */
    public int f61191k;

    /* JADX INFO: renamed from: l */
    public long f61192l;

    /* JADX INFO: renamed from: m */
    public boolean f61193m;

    /* JADX INFO: renamed from: n */
    public int f61194n;

    /* JADX INFO: renamed from: o */
    public int f61195o;

    /* JADX INFO: renamed from: p */
    public int f61196p;

    /* JADX INFO: renamed from: q */
    public boolean f61197q;

    /* JADX INFO: renamed from: r */
    public long f61198r;

    /* JADX INFO: renamed from: s */
    public int f61199s;

    /* JADX INFO: renamed from: t */
    public long f61200t;

    /* JADX INFO: renamed from: u */
    public int f61201u;

    /* JADX INFO: renamed from: v */
    public String f61202v;

    public sp4(String str, int i) {
        this.f61181a = str;
        this.f61182b = i;
        k47 k47Var = new k47(1024);
        this.f61183c = k47Var;
        byte[] bArr = k47Var.f46700a;
        this.f61184d = new so0(bArr.length, bArr);
        this.f61192l = -9223372036854775807L;
    }

    @Override // p000.yo2
    /* JADX INFO: renamed from: b */
    public final void mo609b(k47 k47Var) throws ParserException {
        int iM21503g;
        boolean zM21502f;
        this.f61185e.getClass();
        while (k47Var.m14820a() > 0) {
            int i = this.f61188h;
            if (i != 0) {
                if (i != 1) {
                    k47 k47Var2 = this.f61183c;
                    so0 so0Var = this.f61184d;
                    if (i == 2) {
                        int iM14842z = ((this.f61191k & (-225)) << 8) | k47Var.m14842z();
                        this.f61190j = iM14842z;
                        if (iM14842z > k47Var2.f46700a.length) {
                            k47Var2.m14815J(iM14842z);
                            byte[] bArr = k47Var2.f46700a;
                            so0Var.getClass();
                            so0Var.m21507k(bArr.length, bArr);
                        }
                        this.f61189i = 0;
                        this.f61188h = 3;
                    } else {
                        if (i != 3) {
                            uk9.m22770c();
                            return;
                        }
                        int iMin = Math.min(k47Var.m14820a(), this.f61190j - this.f61189i);
                        k47Var.m14827k(so0Var.f61083b, this.f61189i, iMin);
                        int i2 = this.f61189i + iMin;
                        this.f61189i = i2;
                        if (i2 == this.f61190j) {
                            so0Var.m21509m(0);
                            if (so0Var.m21502f()) {
                                if (this.f61193m) {
                                }
                                this.f61188h = 0;
                            } else {
                                this.f61193m = true;
                                int iM21503g2 = so0Var.m21503g(1);
                                int iM21503g3 = iM21503g2 == 1 ? so0Var.m21503g(1) : 0;
                                this.f61194n = iM21503g3;
                                if (iM21503g3 != 0) {
                                    throw ParserException.m2516a(null, null);
                                }
                                if (iM21503g2 == 1) {
                                    so0Var.m21503g((so0Var.m21503g(2) + 1) * 8);
                                }
                                if (!so0Var.m21502f()) {
                                    throw ParserException.m2516a(null, null);
                                }
                                this.f61195o = so0Var.m21503g(6);
                                int iM21503g4 = so0Var.m21503g(4);
                                int iM21503g5 = so0Var.m21503g(3);
                                if (iM21503g4 != 0 || iM21503g5 != 0) {
                                    throw ParserException.m2516a(null, null);
                                }
                                if (iM21503g2 == 0) {
                                    int iM21501e = so0Var.m21501e();
                                    int iM21498b = so0Var.m21498b();
                                    C3354n c3354nM18560f = ox1.m18560f(so0Var, true);
                                    this.f61202v = c3354nM18560f.f52092a;
                                    this.f61199s = c3354nM18560f.f52093b;
                                    this.f61201u = c3354nM18560f.f52094c;
                                    int iM21498b2 = iM21498b - so0Var.m21498b();
                                    so0Var.m21509m(iM21501e);
                                    byte[] bArr2 = new byte[(iM21498b2 + 7) / 8];
                                    so0Var.m21504h(iM21498b2, bArr2);
                                    lc3 lc3Var = new lc3();
                                    lc3Var.f49440a = this.f61186f;
                                    lc3Var.f49452m = ez5.m11402l("video/mp2t");
                                    lc3Var.f49453n = ez5.m11402l("audio/mp4a-latm");
                                    lc3Var.f49449j = this.f61202v;
                                    lc3Var.f49430F = this.f61201u;
                                    lc3Var.f49431G = this.f61199s;
                                    lc3Var.f49456q = Collections.singletonList(bArr2);
                                    lc3Var.f49443d = this.f61181a;
                                    lc3Var.f49445f = this.f61182b;
                                    C0713b c0713b = new C0713b(lc3Var);
                                    if (!c0713b.equals(this.f61187g)) {
                                        this.f61187g = c0713b;
                                        this.f61200t = 1024000000 / ((long) c0713b.f6382H);
                                        this.f61185e.mo2537g(c0713b);
                                    }
                                } else {
                                    int iM21503g6 = so0Var.m21503g((so0Var.m21503g(2) + 1) * 8);
                                    int iM21498b3 = so0Var.m21498b();
                                    C3354n c3354nM18560f2 = ox1.m18560f(so0Var, true);
                                    this.f61202v = c3354nM18560f2.f52092a;
                                    this.f61199s = c3354nM18560f2.f52093b;
                                    this.f61201u = c3354nM18560f2.f52094c;
                                    so0Var.m21511o(iM21503g6 - (iM21498b3 - so0Var.m21498b()));
                                }
                                int iM21503g7 = so0Var.m21503g(3);
                                this.f61196p = iM21503g7;
                                if (iM21503g7 == 0) {
                                    so0Var.m21511o(8);
                                } else if (iM21503g7 == 1) {
                                    so0Var.m21511o(9);
                                } else if (iM21503g7 == 3 || iM21503g7 == 4 || iM21503g7 == 5) {
                                    so0Var.m21511o(6);
                                } else {
                                    if (iM21503g7 != 6 && iM21503g7 != 7) {
                                        uk9.m22770c();
                                        return;
                                    }
                                    so0Var.m21511o(1);
                                }
                                boolean zM21502f2 = so0Var.m21502f();
                                this.f61197q = zM21502f2;
                                this.f61198r = 0L;
                                if (zM21502f2) {
                                    if (iM21503g2 == 1) {
                                        this.f61198r = so0Var.m21503g((so0Var.m21503g(2) + 1) * 8);
                                    } else {
                                        do {
                                            zM21502f = so0Var.m21502f();
                                            this.f61198r = (this.f61198r << 8) + ((long) so0Var.m21503g(8));
                                        } while (zM21502f);
                                    }
                                }
                                if (so0Var.m21502f()) {
                                    so0Var.m21511o(8);
                                }
                            }
                            if (this.f61194n != 0) {
                                throw ParserException.m2516a(null, null);
                            }
                            if (this.f61195o != 0) {
                                throw ParserException.m2516a(null, null);
                            }
                            if (this.f61196p != 0) {
                                throw ParserException.m2516a(null, null);
                            }
                            int i3 = 0;
                            do {
                                iM21503g = so0Var.m21503g(8);
                                i3 += iM21503g;
                            } while (iM21503g == 255);
                            int iM21501e2 = so0Var.m21501e();
                            if ((iM21501e2 & 7) == 0) {
                                k47Var2.m14818M(iM21501e2 >> 3);
                            } else {
                                so0Var.m21504h(i3 * 8, k47Var2.f46700a);
                                k47Var2.m14818M(0);
                            }
                            this.f61185e.mo2535e(i3, k47Var2);
                            bna.m3987z(this.f61192l != -9223372036854775807L);
                            this.f61185e.mo2531a(this.f61192l, 1, i3, 0, null);
                            this.f61192l += this.f61200t;
                            if (this.f61197q) {
                                so0Var.m21511o((int) this.f61198r);
                            }
                            this.f61188h = 0;
                        } else {
                            continue;
                        }
                    }
                } else {
                    int iM14842z2 = k47Var.m14842z();
                    if ((iM14842z2 & 224) == 224) {
                        this.f61191k = iM14842z2;
                        this.f61188h = 2;
                    } else if (iM14842z2 != 86) {
                        this.f61188h = 0;
                    }
                }
            } else if (k47Var.m14842z() == 86) {
                this.f61188h = 1;
            }
        }
    }

    @Override // p000.yo2
    /* JADX INFO: renamed from: d */
    public final void mo611d() {
        this.f61188h = 0;
        this.f61192l = -9223372036854775807L;
        this.f61193m = false;
    }

    @Override // p000.yo2
    /* JADX INFO: renamed from: e */
    public final void mo612e(boolean z) {
    }

    @Override // p000.yo2
    /* JADX INFO: renamed from: f */
    public final void mo613f(int i, long j) {
        this.f61192l = j;
    }

    @Override // p000.yo2
    /* JADX INFO: renamed from: g */
    public final void mo614g(jy2 jy2Var, mca mcaVar) {
        mcaVar.m16767a();
        mcaVar.m16768b();
        this.f61185e = jy2Var.mo2555n(mcaVar.f51086d, 1);
        mcaVar.m16768b();
        this.f61186f = mcaVar.f51087e;
    }
}
