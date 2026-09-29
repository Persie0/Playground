package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.C0077c;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.grid.AbstractC0128a;
import androidx.compose.p002ui.platform.AbstractC0402n;
import androidx.compose.runtime.AbstractC0278f;
import p000.C3006fm;
import p000.InterfaceC3624tu;
import p000.InterfaceC3735wu;
import p000.b16;
import p000.bq1;
import p000.bu4;
import p000.cq3;
import p000.d32;
import p000.dh9;
import p000.e16;
import p000.gs4;
import p000.gz8;
import p000.kb0;
import p000.lda;
import p000.p84;
import p000.qp3;
import p000.qs4;
import p000.s46;
import p000.t17;
import p000.t66;
import p000.ti9;
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

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.grid.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0128a {
    /* JADX INFO: renamed from: a */
    public static final void m983a(final e16 e16Var, C0129b c0129b, final cq3 cq3Var, final t17 t17Var, final x63 x63Var, final boolean z, final C0077c c0077c, final InterfaceC3735wu interfaceC3735wu, final InterfaceC3624tu interfaceC3624tu, final vi3 vi3Var, ye1 ye1Var, final int i, final int i2) {
        int i3;
        int i4;
        C0129b c0129b2;
        tj3 tj3Var;
        Object qs4Var;
        boolean z2;
        boolean z3;
        C0129b c0129b3;
        zg4 zg4Var;
        boolean z4;
        e16 e16VarM4059j0;
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(708740370);
        if ((i & 6) == 0) {
            i3 = (tj3Var2.m22120g(e16Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= tj3Var2.m22120g(c0129b) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= (i & 512) == 0 ? tj3Var2.m22120g(cq3Var) : tj3Var2.m22124i(cq3Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= tj3Var2.m22120g(t17Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= tj3Var2.m22122h(false) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i3 |= tj3Var2.m22122h(true) ? 131072 : 65536;
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
            i3 |= tj3Var2.m22120g(interfaceC3735wu) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (tj3Var2.m22120g(interfaceC3624tu) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= tj3Var2.m22124i(vi3Var) ? 32 : 16;
        }
        if (tj3Var2.m22099R(i3 & 1, ((i3 & 306783379) == 306783378 && (i4 & 19) == 18) ? false : true)) {
            tj3Var2.m22104W();
            if ((i & 1) != 0 && !tj3Var2.m22084B()) {
                tj3Var2.m22102U();
            }
            tj3Var2.m22140r();
            int i5 = i3 >> 3;
            int i6 = i5 & 14;
            int i7 = i6 | (i4 & 112);
            t66 t66VarM1263m = AbstractC0278f.m1263m(vi3Var, tj3Var2);
            boolean z5 = (((i7 & 14) ^ 6) > 4 && tj3Var2.m22120g(c0129b)) || (i7 & 6) == 4;
            Object objM22097O = tj3Var2.m22097O();
            p84 p84Var = we1.f66679a;
            if (z5 || objM22097O == p84Var) {
                s46 s46Var = s46.f60290e;
                objM22097O = new LazyGridItemProviderKt$rememberLazyGridItemProviderLambda$1$1(AbstractC0278f.m1255e(new C3006fm(14, AbstractC0278f.m1255e(new kb0(2, t66VarM1263m), s46Var), c0129b), s46Var), dh9.class, "value", "getValue()Ljava/lang/Object;", 0);
                tj3Var2.m22131l0(objM22097O);
            }
            zg4 zg4Var2 = (zg4) objM22097O;
            int i8 = i6 | ((i3 >> 9) & 112);
            boolean z6 = ((((i8 & 14) ^ 6) > 4 && tj3Var2.m22120g(c0129b)) || (i8 & 6) == 4) | ((((i8 & 112) ^ 48) > 32 && tj3Var2.m22122h(false)) || (i8 & 48) == 32);
            Object objM22097O2 = tj3Var2.m22097O();
            if (z6 || objM22097O2 == p84Var) {
                objM22097O2 = new C0130c(c0129b);
                tj3Var2.m22131l0(objM22097O2);
            }
            C0130c c0130c = (C0130c) objM22097O2;
            Object objM22097O3 = tj3Var2.m22097O();
            if (objM22097O3 == p84Var) {
                objM22097O3 = d32.m10013K(tj3Var2);
                tj3Var2.m22131l0(objM22097O3);
            }
            un1 un1Var = (un1) objM22097O3;
            qp3 qp3Var = (qp3) tj3Var2.m22128k(AbstractC0402n.f4815g);
            gz8 gz8Var = !((Boolean) tj3Var2.m22128k(AbstractC0402n.f4832x)).booleanValue() ? ti9.f62348a : null;
            int i9 = (i3 & 524272) | ((i4 << 18) & 3670016) | ((i3 >> 6) & 29360128);
            boolean zM22120g = ((((i9 & 29360128) ^ 12582912) > 8388608 && tj3Var2.m22120g(interfaceC3735wu)) || (i9 & 12582912) == 8388608) | ((((i9 & 896) ^ 384) > 256 && tj3Var2.m22120g(cq3Var)) || (i9 & 384) == 256) | ((((i9 & 112) ^ 48) > 32 && tj3Var2.m22120g(c0129b)) || (i9 & 48) == 32) | ((((i9 & 7168) ^ 3072) > 2048 && tj3Var2.m22120g(t17Var)) || (i9 & 3072) == 2048) | ((((57344 & i9) ^ 24576) > 16384 && tj3Var2.m22122h(false)) || (i9 & 24576) == 16384) | ((((458752 & i9) ^ 196608) > 131072 && tj3Var2.m22122h(true)) || (i9 & 196608) == 131072) | ((((i9 & 3670016) ^ 1572864) > 1048576 && tj3Var2.m22120g(interfaceC3624tu)) || (i9 & 1572864) == 1048576) | tj3Var2.m22120g(qp3Var);
            Object objM22097O4 = tj3Var2.m22097O();
            if (zM22120g || objM22097O4 == p84Var) {
                z2 = false;
                z3 = true;
                qs4Var = new qs4(c0129b, t17Var, zg4Var2, cq3Var, interfaceC3735wu, interfaceC3624tu, un1Var, qp3Var, gz8Var);
                c0129b3 = c0129b;
                zg4Var = zg4Var2;
                tj3Var2.m22131l0(qs4Var);
            } else {
                c0129b3 = c0129b;
                qs4Var = objM22097O4;
                zg4Var = zg4Var2;
                z2 = false;
                z3 = true;
            }
            bu4 bu4Var = (bu4) qs4Var;
            Orientation orientation = Orientation.Vertical;
            if (z) {
                tj3Var2.m22111b0(27281635);
                boolean z7 = (((i6 ^ 6) <= 4 || !tj3Var2.m22120g(c0129b3)) && (i5 & 6) != 4) ? z2 : z3;
                Object objM22097O5 = tj3Var2.m22097O();
                if (z7 || objM22097O5 == p84Var) {
                    objM22097O5 = new gs4(c0129b3);
                    tj3Var2.m22131l0(objM22097O5);
                }
                z4 = false;
                e16VarM4059j0 = bq1.m4059j0((gs4) objM22097O5, c0129b3.f2481n, false, orientation);
                tj3Var2.m22139q(z2);
            } else {
                z4 = false;
                tj3Var2.m22111b0(27577840);
                tj3Var2.m22139q(z2);
                e16VarM4059j0 = b16.f7762a;
            }
            zg4 zg4Var3 = zg4Var;
            C0129b c0129b4 = c0129b3;
            e16 e16VarM23901C = wfb.m23901C(d32.m10025W(x74.m24367x(e16Var.mo3161g(c0129b3.f2478k).mo3161g(c0129b3.f2479l), zg4Var, c0130c, orientation, z, z4).mo3161g(e16VarM4059j0), c0129b3.f2480m), c0129b4, orientation, c0077c, z, false, x63Var, c0129b3.f2473f, null);
            c0129b2 = c0129b4;
            tj3Var = tj3Var2;
            lda.m16115a(zg4Var3, e16VarM23901C, c0129b2.f2482o, bu4Var, tj3Var, 0);
        } else {
            c0129b2 = c0129b;
            tj3Var = tj3Var2;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            final C0129b c0129b5 = c0129b2;
            x18VarM22143u.f67642d = new zi3() { // from class: ns4
                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    AbstractC0128a.m983a(e16Var, c0129b5, cq3Var, t17Var, x63Var, z, c0077c, interfaceC3735wu, interfaceC3624tu, vi3Var, (ye1) obj, pk9.m19383z(i | 1), pk9.m19383z(i2));
                    return xfa.f68157a;
                }
            };
        }
    }
}
