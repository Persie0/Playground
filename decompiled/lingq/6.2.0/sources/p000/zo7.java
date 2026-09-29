package p000;

import android.util.SparseArray;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: loaded from: classes2.dex */
public final class zo7 implements hy2 {

    /* JADX INFO: renamed from: e */
    public boolean f71855e;

    /* JADX INFO: renamed from: f */
    public boolean f71856f;

    /* JADX INFO: renamed from: g */
    public boolean f71857g;

    /* JADX INFO: renamed from: h */
    public long f71858h;

    /* JADX INFO: renamed from: i */
    public l63 f71859i;

    /* JADX INFO: renamed from: j */
    public jy2 f71860j;

    /* JADX INFO: renamed from: k */
    public boolean f71861k;

    /* JADX INFO: renamed from: a */
    public final g1a f71851a = new g1a(0);

    /* JADX INFO: renamed from: c */
    public final k47 f71853c = new k47(4096);

    /* JADX INFO: renamed from: b */
    public final SparseArray f71852b = new SparseArray();

    /* JADX INFO: renamed from: d */
    public final xo7 f71854d = new xo7(0);

    @Override // p000.hy2
    /* JADX INFO: renamed from: a */
    public final void mo109a() {
    }

    @Override // p000.hy2
    /* JADX INFO: renamed from: b */
    public final int mo110b(iy2 iy2Var, n63 n63Var) {
        char c;
        int i;
        yo2 kq3Var;
        long j;
        this.f71860j.getClass();
        long length = iy2Var.getLength();
        long j2 = -9223372036854775807L;
        xo7 xo7Var = this.f71854d;
        if (length != -1) {
            c = 3;
            if (!xo7Var.f68438d) {
                g1a g1aVar = xo7Var.f68436b;
                k47 k47Var = xo7Var.f68437c;
                if (!xo7Var.f68440f) {
                    long length2 = iy2Var.getLength();
                    int iMin = (int) Math.min(20000L, length2);
                    long j3 = length2 - ((long) iMin);
                    if (iy2Var.getPosition() != j3) {
                        n63Var.f52394a = j3;
                        return 1;
                    }
                    k47Var.m14815J(iMin);
                    iy2Var.mo13080i();
                    iy2Var.mo13085o(k47Var.f46700a, 0, iMin);
                    int i2 = k47Var.f46701b;
                    for (int i3 = k47Var.f46702c - 4; i3 >= i2; i3--) {
                        if (xo7.m24626b(i3, k47Var.f46700a) == 442) {
                            k47Var.m14818M(i3 + 4);
                            long jM24627c = xo7.m24627c(k47Var);
                            if (jM24627c != -9223372036854775807L) {
                                j2 = jM24627c;
                                break;
                            }
                        }
                    }
                    xo7Var.f68442h = j2;
                    xo7Var.f68440f = true;
                    return 0;
                }
                if (xo7Var.f68442h == -9223372036854775807L) {
                    xo7Var.m24628a(iy2Var);
                    return 0;
                }
                if (xo7Var.f68439e) {
                    long j4 = xo7Var.f68441g;
                    if (j4 == -9223372036854775807L) {
                        xo7Var.m24628a(iy2Var);
                        return 0;
                    }
                    xo7Var.f68443i = g1aVar.m12281c(xo7Var.f68442h) - g1aVar.m12280b(j4);
                    xo7Var.m24628a(iy2Var);
                    return 0;
                }
                int iMin2 = (int) Math.min(20000L, iy2Var.getLength());
                if (iy2Var.getPosition() != 0) {
                    n63Var.f52394a = 0L;
                    return 1;
                }
                k47Var.m14815J(iMin2);
                iy2Var.mo13080i();
                iy2Var.mo13085o(k47Var.f46700a, 0, iMin2);
                int i4 = k47Var.f46702c;
                for (int i5 = k47Var.f46701b; i5 < i4 - 3; i5++) {
                    if (xo7.m24626b(i5, k47Var.f46700a) == 442) {
                        k47Var.m14818M(i5 + 4);
                        long jM24627c2 = xo7.m24627c(k47Var);
                        if (jM24627c2 != -9223372036854775807L) {
                            j = jM24627c2;
                            xo7Var.f68441g = j;
                            xo7Var.f68439e = true;
                            return 0;
                        }
                    }
                }
                j = -9223372036854775807L;
                xo7Var.f68441g = j;
                xo7Var.f68439e = true;
                return 0;
            }
        } else {
            c = 3;
        }
        if (this.f71861k) {
            i = 4;
        } else {
            this.f71861k = true;
            long j5 = xo7Var.f68443i;
            if (j5 != -9223372036854775807L) {
                i = 4;
                l63 l63Var = new l63(new x24(), new p33(xo7Var.f68436b), j5, j5 + 1, 0L, length, 188L, DescriptorProtos.Edition.EDITION_2023_VALUE);
                this.f71859i = l63Var;
                this.f71860j.mo2558q(l63Var.f49111a);
            } else {
                i = 4;
                this.f71860j.mo2558q(new h60(j5));
            }
        }
        l63 l63Var2 = this.f71859i;
        if (l63Var2 != null && l63Var2.f49113c != null) {
            return l63Var2.m15826b(iy2Var, n63Var);
        }
        iy2Var.mo13080i();
        long jMo13077e = length != -1 ? length - iy2Var.mo13077e() : -1L;
        if (jMo13077e != -1 && jMo13077e < 4) {
            return -1;
        }
        k47 k47Var2 = this.f71853c;
        if (!iy2Var.mo13076d(k47Var2.f46700a, 0, i, true)) {
            return -1;
        }
        k47Var2.m14818M(0);
        int iM14829m = k47Var2.m14829m();
        if (iM14829m == 441) {
            return -1;
        }
        if (iM14829m == 442) {
            iy2Var.mo13085o(k47Var2.f46700a, 0, 10);
            k47Var2.m14818M(9);
            iy2Var.mo13082k((k47Var2.m14842z() & 7) + 14);
            return 0;
        }
        if (iM14829m == 443) {
            iy2Var.mo13085o(k47Var2.f46700a, 0, 2);
            k47Var2.m14818M(0);
            iy2Var.mo13082k(k47Var2.m14812G() + 6);
            return 0;
        }
        if (((iM14829m & (-256)) >> 8) != 1) {
            iy2Var.mo13082k(1);
            return 0;
        }
        int i6 = iM14829m & 255;
        SparseArray sparseArray = this.f71852b;
        yo7 yo7Var = (yo7) sparseArray.get(i6);
        if (!this.f71855e) {
            if (yo7Var == null) {
                if (i6 == 189) {
                    kq3Var = new C3097i2("video/mp2p");
                    this.f71856f = true;
                    this.f71858h = iy2Var.getPosition();
                } else if ((iM14829m & 224) == 192) {
                    kq3Var = new l46(null, 0, "video/mp2p");
                    this.f71856f = true;
                    this.f71858h = iy2Var.getPosition();
                } else if ((iM14829m & 240) == 224) {
                    kq3Var = new kq3(null, "video/mp2p");
                    this.f71857g = true;
                    this.f71858h = iy2Var.getPosition();
                } else {
                    kq3Var = null;
                }
                if (kq3Var != null) {
                    kq3Var.mo614g(this.f71860j, new mca(i6, 256));
                    yo7Var = new yo7(kq3Var, this.f71851a);
                    sparseArray.put(i6, yo7Var);
                }
            }
            if (iy2Var.getPosition() > ((this.f71856f && this.f71857g) ? this.f71858h + 8192 : 1048576L)) {
                this.f71855e = true;
                this.f71860j.mo2551j();
            }
        }
        iy2Var.mo13085o(k47Var2.f46700a, 0, 2);
        k47Var2.m14818M(0);
        int iM14812G = k47Var2.m14812G() + 6;
        if (yo7Var == null) {
            iy2Var.mo13082k(iM14812G);
            return 0;
        }
        k47Var2.m14815J(iM14812G);
        iy2Var.readFully(k47Var2.f46700a, 0, iM14812G);
        k47Var2.m14818M(6);
        yo2 yo2Var = yo7Var.f70168a;
        so0 so0Var = yo7Var.f70170c;
        k47Var2.m14827k(so0Var.f61083b, 0, 3);
        so0Var.m21509m(0);
        so0Var.m21511o(8);
        yo7Var.f70171d = so0Var.m21502f();
        yo7Var.f70172e = so0Var.m21502f();
        so0Var.m21511o(6);
        k47Var2.m14827k(so0Var.f61083b, 0, so0Var.m21503g(8));
        so0Var.m21509m(0);
        g1a g1aVar2 = yo7Var.f70169b;
        yo7Var.f70174g = 0L;
        if (yo7Var.f70171d) {
            so0Var.m21511o(4);
            long jM21503g = ((long) so0Var.m21503g(3)) << 30;
            so0Var.m21511o(1);
            long jM21503g2 = jM21503g | ((long) (so0Var.m21503g(15) << 15));
            so0Var.m21511o(1);
            long jM21503g3 = jM21503g2 | ((long) so0Var.m21503g(15));
            so0Var.m21511o(1);
            if (!yo7Var.f70173f && yo7Var.f70172e) {
                so0Var.m21511o(4);
                long jM21503g4 = ((long) so0Var.m21503g(3)) << 30;
                so0Var.m21511o(1);
                long jM21503g5 = jM21503g4 | ((long) (so0Var.m21503g(15) << 15));
                so0Var.m21511o(1);
                long jM21503g6 = jM21503g5 | ((long) so0Var.m21503g(15));
                so0Var.m21511o(1);
                g1aVar2.m12280b(jM21503g6);
                yo7Var.f70173f = true;
            }
            yo7Var.f70174g = g1aVar2.m12280b(jM21503g3);
        }
        yo2Var.mo613f(4, yo7Var.f70174g);
        yo2Var.mo609b(k47Var2);
        yo2Var.mo612e(false);
        k47Var2.m14817L(k47Var2.f46700a.length);
        return 0;
    }

    @Override // p000.hy2
    /* JADX INFO: renamed from: c */
    public final boolean mo111c(iy2 iy2Var) throws EOFException, InterruptedIOException {
        byte[] bArr = new byte[14];
        h62 h62Var = (h62) iy2Var;
        h62Var.mo13076d(bArr, 0, 14, false);
        if (442 == (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) && (bArr[4] & 196) == 68 && (bArr[6] & 4) == 4 && (bArr[8] & 4) == 4 && (bArr[9] & 1) == 1 && (bArr[12] & 3) == 3) {
            h62Var.m13081j(bArr[13] & 7, false);
            h62Var.mo13076d(bArr, 0, 3, false);
            if (1 == (((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8) | (bArr[2] & 255))) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.hy2
    /* JADX INFO: renamed from: d */
    public final void mo112d(long j, long j2) {
        long j3;
        SparseArray sparseArray = this.f71852b;
        g1a g1aVar = this.f71851a;
        synchronized (g1aVar) {
            j3 = g1aVar.f40052b;
        }
        boolean z = j3 == -9223372036854775807L;
        if (!z) {
            long jM12282d = g1aVar.m12282d();
            z = (jM12282d == -9223372036854775807L || jM12282d == 0 || jM12282d == j2) ? false : true;
        }
        if (z) {
            g1aVar.m12283e(j2);
        }
        l63 l63Var = this.f71859i;
        if (l63Var != null) {
            l63Var.m15827d(j2);
        }
        for (int i = 0; i < sparseArray.size(); i++) {
            yo7 yo7Var = (yo7) sparseArray.valueAt(i);
            yo7Var.f70173f = false;
            yo7Var.f70168a.mo611d();
        }
    }

    @Override // p000.hy2
    /* JADX INFO: renamed from: f */
    public final void mo113f(jy2 jy2Var) {
        this.f71860j = jy2Var;
    }
}
