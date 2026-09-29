package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.C0077c;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.staggeredgrid.AbstractC0141a;
import androidx.compose.p002ui.platform.AbstractC0402n;
import androidx.compose.runtime.AbstractC0278f;
import p000.C3006fm;
import p000.b16;
import p000.bq1;
import p000.bu4;
import p000.d32;
import p000.dh9;
import p000.e16;
import p000.gw4;
import p000.kb0;
import p000.lda;
import p000.p84;
import p000.qp3;
import p000.qv4;
import p000.s46;
import p000.t17;
import p000.t66;
import p000.tj3;
import p000.un1;
import p000.vi3;
import p000.we1;
import p000.wfb;
import p000.x18;
import p000.x63;
import p000.x74;
import p000.ye1;
import p000.zg4;
import p000.zi3;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.staggeredgrid.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0141a {
    /* JADX INFO: renamed from: a */
    public static final void m1020a(C0144d c0144d, final Orientation orientation, final gw4 gw4Var, final e16 e16Var, final t17 t17Var, final x63 x63Var, final boolean z, final C0077c c0077c, final float f, final float f2, final vi3 vi3Var, ye1 ye1Var, final int i, final int i2) {
        int i3;
        int i4;
        C0144d c0144d2;
        tj3 tj3Var;
        int i5;
        C0144d c0144d3;
        Orientation orientation2;
        e16 e16VarM4059j0;
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(-1904835166);
        if ((i & 6) == 0) {
            i3 = (tj3Var2.m22120g(c0144d) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= tj3Var2.m22116e(orientation.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= (i & 512) == 0 ? tj3Var2.m22120g(gw4Var) : tj3Var2.m22124i(gw4Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= tj3Var2.m22120g(e16Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= tj3Var2.m22120g(t17Var) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i3 |= tj3Var2.m22122h(false) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= tj3Var2.m22120g(x63Var) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= tj3Var2.m22122h(z) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= tj3Var2.m22120g(c0077c) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= tj3Var2.m22114d(f) ? 536870912 : 268435456;
        }
        int i6 = i3;
        if ((i2 & 6) == 0) {
            i4 = i2 | (tj3Var2.m22114d(f2) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= tj3Var2.m22124i(vi3Var) ? 32 : 16;
        }
        boolean z2 = true;
        if (tj3Var2.m22099R(i6 & 1, ((i6 & 306783379) == 306783378 && (i4 & 19) == 18) ? false : true)) {
            tj3Var2.m22104W();
            if ((i & 1) != 0 && !tj3Var2.m22084B()) {
                tj3Var2.m22102U();
            }
            tj3Var2.m22140r();
            int i7 = i6 & 14;
            int i8 = i7 | (i4 & 112);
            t66 t66VarM1263m = AbstractC0278f.m1263m(vi3Var, tj3Var2);
            int i9 = i4;
            boolean z3 = (((i8 & 14) ^ 6) > 4 && tj3Var2.m22120g(c0144d)) || (i8 & 6) == 4;
            Object objM22097O = tj3Var2.m22097O();
            p84 p84Var = we1.f66679a;
            if (z3 || objM22097O == p84Var) {
                s46 s46Var = s46.f60290e;
                objM22097O = new C0140xd7762911(AbstractC0278f.m1255e(new C3006fm(17, AbstractC0278f.m1255e(new kb0(5, t66VarM1263m), s46Var), c0144d), s46Var), dh9.class, "value", "getValue()Ljava/lang/Object;", 0);
                tj3Var2.m22131l0(objM22097O);
            }
            zg4 zg4Var = (zg4) objM22097O;
            Object objM22097O2 = tj3Var2.m22097O();
            if (objM22097O2 == p84Var) {
                objM22097O2 = d32.m10013K(tj3Var2);
                tj3Var2.m22131l0(objM22097O2);
            }
            un1 un1Var = (un1) objM22097O2;
            qp3 qp3Var = (qp3) tj3Var2.m22128k(AbstractC0402n.f4815g);
            int i10 = i6 >> 6;
            int i11 = i6 >> 12;
            int i12 = (i10 & 7168) | i7 | (i10 & 896) | ((i6 << 9) & 57344) | (i11 & 458752) | ((i9 << 18) & 3670016) | ((i6 << 18) & 234881024);
            boolean zM22120g = ((((i12 & 896) ^ 384) > 256 && tj3Var2.m22120g(t17Var)) || (i12 & 384) == 256) | ((((i12 & 14) ^ 6) > 4 && tj3Var2.m22120g(c0144d)) || (i12 & 6) == 4) | tj3Var2.m22120g(zg4Var) | ((((i12 & 7168) ^ 3072) > 2048 && tj3Var2.m22122h(false)) || (i12 & 3072) == 2048) | ((((i12 & 57344) ^ 24576) > 16384 && tj3Var2.m22116e(orientation.ordinal())) || (i12 & 24576) == 16384) | ((((i12 & 458752) ^ 196608) > 131072 && tj3Var2.m22114d(f)) || (i12 & 196608) == 131072) | ((((i12 & 3670016) ^ 1572864) > 1048576 && tj3Var2.m22114d(f2)) || (i12 & 1572864) == 1048576) | ((((i12 & 234881024) ^ 100663296) > 67108864 && tj3Var2.m22120g(gw4Var)) || (i12 & 100663296) == 67108864) | tj3Var2.m22120g(qp3Var);
            Object objM22097O3 = tj3Var2.m22097O();
            if (zM22120g || objM22097O3 == p84Var) {
                i5 = 32;
                C0142b c0142b = new C0142b(c0144d, orientation, gw4Var, zg4Var, t17Var, f, un1Var, qp3Var);
                c0144d3 = c0144d;
                tj3Var2.m22131l0(c0142b);
                objM22097O3 = c0142b;
            } else {
                i5 = 32;
                c0144d3 = c0144d;
            }
            bu4 bu4Var = (bu4) objM22097O3;
            int i13 = i7 | (i11 & 112);
            boolean z4 = ((((i13 & 112) ^ 48) > i5 && tj3Var2.m22122h(false)) || (i13 & 48) == i5) | ((((i13 & 14) ^ 6) > 4 && tj3Var2.m22120g(c0144d3)) || (i13 & 6) == 4);
            Object objM22097O4 = tj3Var2.m22097O();
            if (z4 || objM22097O4 == p84Var) {
                objM22097O4 = new C0143c(c0144d3);
                tj3Var2.m22131l0(objM22097O4);
            }
            C0143c c0143c = (C0143c) objM22097O4;
            if (z) {
                tj3Var2.m22111b0(-1834596342);
                if (((i7 ^ 6) <= 4 || !tj3Var2.m22120g(c0144d3)) && (i6 & 6) != 4) {
                    z2 = false;
                }
                Object objM22097O5 = tj3Var2.m22097O();
                if (z2 || objM22097O5 == p84Var) {
                    objM22097O5 = new qv4(c0144d3);
                    tj3Var2.m22131l0(objM22097O5);
                }
                orientation2 = orientation;
                e16VarM4059j0 = bq1.m4059j0((qv4) objM22097O5, c0144d3.f2608k, false, orientation2);
                tj3Var2.m22139q(false);
            } else {
                orientation2 = orientation;
                tj3Var2.m22111b0(-1834291488);
                tj3Var2.m22139q(false);
                e16VarM4059j0 = b16.f7762a;
            }
            C0144d c0144d4 = c0144d3;
            e16 e16VarM23901C = wfb.m23901C(d32.m10025W(x74.m24367x(e16Var.mo3161g(c0144d3.f2606i).mo3161g(c0144d3.f2607j), zg4Var, c0143c, orientation2, z, false).mo3161g(e16VarM4059j0), c0144d3.f2617t), c0144d4, orientation, c0077c, z, false, x63Var, c0144d3.f2615r, null);
            c0144d2 = c0144d4;
            tj3Var = tj3Var2;
            lda.m16115a(zg4Var, e16VarM23901C, c0144d2.f2610m, bu4Var, tj3Var, 0);
        } else {
            c0144d2 = c0144d;
            tj3Var = tj3Var2;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            final C0144d c0144d5 = c0144d2;
            x18VarM22143u.f67642d = new zi3() { // from class: wv4
                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM19383z = pk9.m19383z(i | 1);
                    int iM19383z2 = pk9.m19383z(i2);
                    AbstractC0141a.m1020a(c0144d5, orientation, gw4Var, e16Var, t17Var, x63Var, z, c0077c, f, f2, vi3Var, (ye1) obj, iM19383z, iM19383z2);
                    return xfa.f68157a;
                }
            };
        }
    }
}
