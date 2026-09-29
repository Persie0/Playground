package androidx.compose.foundation.lazy;

import androidx.compose.foundation.C0077c;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.AbstractC0126a;
import androidx.compose.p002ui.platform.AbstractC0402n;
import androidx.compose.runtime.AbstractC0278f;
import p000.InterfaceC3457pe;
import p000.InterfaceC3624tu;
import p000.InterfaceC3735wu;
import p000.b16;
import p000.bq1;
import p000.bu4;
import p000.d32;
import p000.dh9;
import p000.e16;
import p000.fc0;
import p000.ft4;
import p000.gv4;
import p000.gz8;
import p000.kb0;
import p000.lda;
import p000.nu4;
import p000.p84;
import p000.pu4;
import p000.qp3;
import p000.r60;
import p000.s46;
import p000.t17;
import p000.t66;
import p000.ti9;
import p000.tj3;
import p000.tu4;
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

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0126a {
    /* JADX WARN: Code duplicated, block: B:204:0x0303  */
    /* JADX INFO: renamed from: a */
    public static final void m972a(final e16 e16Var, C0127b c0127b, final t17 t17Var, final boolean z, final x63 x63Var, final boolean z2, final C0077c c0077c, InterfaceC3457pe interfaceC3457pe, InterfaceC3735wu interfaceC3735wu, fc0 fc0Var, InterfaceC3624tu interfaceC3624tu, final vi3 vi3Var, ye1 ye1Var, final int i, final int i2, final int i3) {
        int i4;
        InterfaceC3457pe interfaceC3457pe2;
        int i5;
        int i6;
        C0127b c0127b2;
        tj3 tj3Var;
        final InterfaceC3735wu interfaceC3735wu2;
        final fc0 fc0Var2;
        final InterfaceC3624tu interfaceC3624tu2;
        int i7;
        InterfaceC3735wu interfaceC3735wu3;
        InterfaceC3624tu interfaceC3624tu3;
        fc0 fc0Var3;
        boolean z3;
        tj3 tj3Var2;
        int i8;
        InterfaceC3735wu interfaceC3735wu4;
        zg4 zg4Var;
        boolean z4;
        e16 e16VarM4059j0;
        tj3 tj3Var3 = (tj3) ye1Var;
        tj3Var3.m22115d0(924924659);
        if ((i & 6) == 0) {
            i4 = (tj3Var3.m22120g(e16Var) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= tj3Var3.m22120g(c0127b) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= tj3Var3.m22120g(t17Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i4 |= tj3Var3.m22122h(false) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i4 |= tj3Var3.m22122h(z) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i4 |= tj3Var3.m22120g(x63Var) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i4 |= tj3Var3.m22122h(z2) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i4 |= tj3Var3.m22120g(c0077c) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i4 |= 33554432;
        }
        int i9 = i3 & 512;
        if (i9 != 0) {
            i4 |= 805306368;
            interfaceC3457pe2 = interfaceC3457pe;
        } else {
            interfaceC3457pe2 = interfaceC3457pe;
            if ((i & 805306368) == 0) {
                i4 |= tj3Var3.m22120g(interfaceC3457pe2) ? 536870912 : 268435456;
            }
        }
        int i10 = i3 & 1024;
        if (i10 != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = i2 | (tj3Var3.m22120g(interfaceC3735wu) ? 4 : 2);
        } else {
            i5 = i2;
        }
        int i11 = i3 & 2048;
        if (i11 != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= tj3Var3.m22120g(fc0Var) ? 32 : 16;
        }
        int i12 = i5;
        int i13 = i4;
        int i14 = i3 & 4096;
        if (i14 != 0) {
            i6 = i12 | 384;
        } else if ((i2 & 384) == 0) {
            i6 = i12 | (tj3Var3.m22120g(interfaceC3624tu) ? 256 : 128);
        } else {
            i6 = i12;
        }
        if ((i2 & 3072) == 0) {
            i6 |= tj3Var3.m22124i(vi3Var) ? 2048 : 1024;
        }
        int i15 = i6;
        boolean z5 = true;
        if (tj3Var3.m22099R(i13 & 1, ((i13 & 306783379) == 306783378 && (i15 & 1171) == 1170) ? false : true)) {
            tj3Var3.m22104W();
            if ((i & 1) == 0 || tj3Var3.m22084B()) {
                i7 = i13 & (-234881025);
                if (i9 != 0) {
                    interfaceC3457pe2 = null;
                }
                interfaceC3735wu3 = i10 != 0 ? null : interfaceC3735wu;
                fc0 fc0Var4 = i11 != 0 ? null : fc0Var;
                interfaceC3624tu3 = i14 != 0 ? null : interfaceC3624tu;
                fc0Var3 = fc0Var4;
            } else {
                tj3Var3.m22102U();
                i7 = i13 & (-234881025);
                interfaceC3735wu3 = interfaceC3735wu;
                interfaceC3624tu3 = interfaceC3624tu;
                interfaceC3457pe2 = interfaceC3457pe2;
                fc0Var3 = fc0Var;
            }
            tj3Var3.m22140r();
            int i16 = i7 >> 3;
            int i17 = i16 & 14;
            int i18 = i17 | ((i15 >> 6) & 112);
            t66 t66VarM1263m = AbstractC0278f.m1263m(vi3Var, tj3Var3);
            int i19 = i7;
            boolean z6 = (((i18 & 14) ^ 6) > 4 && tj3Var3.m22120g(c0127b)) || (i18 & 6) == 4;
            Object objM22097O = tj3Var3.m22097O();
            boolean z7 = z6;
            p84 p84Var = we1.f66679a;
            if (z7 || objM22097O == p84Var) {
                ft4 ft4Var = new ft4();
                ft4Var.f39615a = AbstractC0278f.m1257g(Integer.MAX_VALUE);
                ft4Var.f39616b = AbstractC0278f.m1257g(Integer.MAX_VALUE);
                s46 s46Var = s46.f60290e;
                objM22097O = new LazyListItemProviderKt$rememberLazyListItemProviderLambda$1$1(AbstractC0278f.m1255e(new r60(AbstractC0278f.m1255e(new kb0(4, t66VarM1263m), s46Var), c0127b, ft4Var, 7), s46Var), dh9.class, "value", "getValue()Ljava/lang/Object;", 0);
                tj3Var3.m22131l0(objM22097O);
            }
            zg4 zg4Var2 = (zg4) objM22097O;
            int i20 = i19 >> 9;
            int i21 = i17 | (i20 & 112);
            boolean z8 = ((((i21 & 112) ^ 48) > 32 && tj3Var3.m22122h(z)) || (i21 & 48) == 32) | ((((i21 & 14) ^ 6) > 4 && tj3Var3.m22120g(c0127b)) || (i21 & 6) == 4);
            Object objM22097O2 = tj3Var3.m22097O();
            if (z8 || objM22097O2 == p84Var) {
                objM22097O2 = new pu4(c0127b, z);
                tj3Var3.m22131l0(objM22097O2);
            }
            nu4 nu4Var = (nu4) objM22097O2;
            Object objM22097O3 = tj3Var3.m22097O();
            if (objM22097O3 == p84Var) {
                objM22097O3 = d32.m10013K(tj3Var3);
                tj3Var3.m22131l0(objM22097O3);
            }
            un1 un1Var = (un1) objM22097O3;
            qp3 qp3Var = (qp3) tj3Var3.m22128k(AbstractC0402n.f4815g);
            gz8 gz8Var = ((Boolean) tj3Var3.m22128k(AbstractC0402n.f4832x)).booleanValue() ? null : ti9.f62348a;
            int i22 = i15 << 18;
            int i23 = (i19 & 65520) | (i20 & 3670016) | (i22 & 29360128) | (i22 & 234881024) | ((i15 << 27) & 1879048192);
            boolean z9 = ((((i23 & 112) ^ 48) > 32 && tj3Var3.m22120g(c0127b)) || (i23 & 48) == 32) | ((((i23 & 896) ^ 384) > 256 && tj3Var3.m22120g(t17Var)) || (i23 & 384) == 256);
            if (((i23 & 7168) ^ 3072) > 2048 && tj3Var3.m22122h(false)) {
                z3 = true;
            } else if ((i23 & 3072) == 2048) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean zM22116e = z9 | z3 | ((((57344 & i23) ^ 24576) > 16384 && tj3Var3.m22122h(z)) || (i23 & 24576) == 16384) | tj3Var3.m22116e(0) | ((((i23 & 3670016) ^ 1572864) > 1048576 && tj3Var3.m22120g(interfaceC3457pe2)) || (i23 & 1572864) == 1048576) | ((((i23 & 29360128) ^ 12582912) > 8388608 && tj3Var3.m22120g(fc0Var3)) || (i23 & 12582912) == 8388608) | ((((i23 & 234881024) ^ 100663296) > 67108864 && tj3Var3.m22120g(interfaceC3624tu3)) || (i23 & 100663296) == 67108864) | ((((i23 & 1879048192) ^ 805306368) > 536870912 && tj3Var3.m22120g(interfaceC3735wu3)) || (i23 & 805306368) == 536870912) | tj3Var3.m22120g(qp3Var) | tj3Var3.m22120g(gz8Var);
            Object objM22097O4 = tj3Var3.m22097O();
            if (zM22116e || objM22097O4 == p84Var) {
                tj3Var2 = tj3Var3;
                i8 = 4;
                InterfaceC3735wu interfaceC3735wu5 = interfaceC3735wu3;
                gv4 gv4Var = new gv4(c0127b, z, t17Var, zg4Var2, interfaceC3735wu5, interfaceC3624tu3, un1Var, qp3Var, gz8Var, interfaceC3457pe2, fc0Var3);
                interfaceC3735wu4 = interfaceC3735wu5;
                zg4Var = zg4Var2;
                tj3Var2.m22131l0(gv4Var);
                objM22097O4 = gv4Var;
            } else {
                interfaceC3735wu4 = interfaceC3735wu3;
                tj3Var2 = tj3Var3;
                i8 = 4;
                zg4Var = zg4Var2;
            }
            bu4 bu4Var = (bu4) objM22097O4;
            Orientation orientation = z ? Orientation.Vertical : Orientation.Horizontal;
            if (z2) {
                tj3Var2.m22111b0(-2077147368);
                if ((((i16 & 14) ^ 6) <= i8 || !tj3Var2.m22120g(c0127b)) && (i16 & 6) != i8) {
                    z5 = false;
                }
                boolean zM22116e2 = z5 | tj3Var2.m22116e(0);
                Object objM22097O5 = tj3Var2.m22097O();
                if (zM22116e2 || objM22097O5 == p84Var) {
                    objM22097O5 = new tu4(r3);
                    tj3Var2.m22131l0(objM22097O5);
                }
                z4 = false;
                e16VarM4059j0 = bq1.m4059j0((tu4) objM22097O5, r3.f2451p, false, orientation);
                tj3Var2.m22139q(false);
            } else {
                z4 = false;
                tj3Var2.m22111b0(-2076718545);
                tj3Var2.m22139q(false);
                e16VarM4059j0 = b16.f7762a;
            }
            c0127b2 = r3;
            tj3Var = tj3Var2;
            lda.m16115a(zg4Var, wfb.m23901C(d32.m10025W(x74.m24367x(e16Var.mo3161g(r3.f2448m).mo3161g(r3.f2449n), zg4Var, nu4Var, orientation, z2, z4).mo3161g(e16VarM4059j0), r3.f2450o), r3, orientation, c0077c, z2, false, x63Var, r3.f2442g, null), c0127b2.f2452q, bu4Var, tj3Var, 0);
            interfaceC3735wu2 = interfaceC3735wu4;
            fc0Var2 = fc0Var3;
            interfaceC3624tu2 = interfaceC3624tu3;
        } else {
            c0127b2 = c0127b;
            tj3Var = tj3Var3;
            tj3Var.m22102U();
            interfaceC3735wu2 = interfaceC3735wu;
            fc0Var2 = fc0Var;
            interfaceC3624tu2 = interfaceC3624tu;
            interfaceC3457pe2 = interfaceC3457pe2;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            final C0127b c0127b3 = c0127b2;
            final InterfaceC3457pe interfaceC3457pe3 = interfaceC3457pe2;
            x18VarM22143u.f67642d = new zi3() { // from class: xu4
                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM19383z = pk9.m19383z(i | 1);
                    int iM19383z2 = pk9.m19383z(i2);
                    AbstractC0126a.m972a(e16Var, c0127b3, t17Var, z, x63Var, z2, c0077c, interfaceC3457pe3, interfaceC3735wu2, fc0Var2, interfaceC3624tu2, vi3Var, (ye1) obj, iM19383z, iM19383z2, i3);
                    return xfa.f68157a;
                }
            };
        }
    }
}
