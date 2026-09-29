package p000;

import android.content.Context;
import androidx.compose.foundation.AbstractC0080f;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.focus.InterfaceC0300b;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.p002ui.platform.AbstractC0394f;
import androidx.compose.p002ui.platform.AbstractC0402n;
import androidx.compose.p002ui.window.AbstractC0454b;
import androidx.compose.runtime.AbstractC0278f;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class g6d {
    /* JADX INFO: renamed from: a */
    public static final void m12388a(String str, final boolean z, final boolean z2, vi3 vi3Var, ye1 ye1Var, final int i) {
        int i2;
        String str2;
        vi3 vi3Var2;
        boolean z3;
        str.getClass();
        vi3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(134230193);
        if ((i & 6) == 0) {
            i2 = (tj3Var.m22120g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= tj3Var.m22122h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= tj3Var.m22122h(z2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= tj3Var.m22124i(vi3Var) ? 2048 : 1024;
        }
        if (tj3Var.m22099R(i2 & 1, (i2 & 1171) != 1170)) {
            e16 e16VarM4412e = c99.m4412e(b16.f7762a, 1.0f);
            int i3 = i2 & 7168;
            int i4 = i2 & 14;
            boolean z4 = (i3 == 2048) | (i4 == 4);
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var = we1.f66679a;
            if (z4 || objM22097O == p84Var) {
                objM22097O = new pw1(vi3Var, str, 2);
                tj3Var.m22131l0(objM22097O);
            }
            e16 e16VarM21607T = AbstractC3584sr.m21607T(AbstractC0080f.m815b(null, z2, (ui3) objM22097O, e16VarM4412e, 14), ((fe9) tj3Var.m22128k(ge9.f40637a)).f38955d);
            sj8 sj8VarM20003a = qj8.m20003a(eh0.f37242h, nj0.f52789H, tj3Var, 54);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM21607T);
            se1.f60731q.getClass();
            ui3 ui3Var = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, C0352b.f4303f, sj8VarM20003a);
            oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
            oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
            oha.m18000f(tj3Var, C0352b.f4305h);
            oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
            int i5 = i2;
            lw9.m16554b(str, null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var.m22128k(ps5.f56764b)).f51800b.f71406j, tj3Var, i4, 0, 131070);
            str2 = str;
            tj3Var = tj3Var;
            boolean z5 = (i3 == 2048) | ((i5 & 896) == 256) | (i4 == 4);
            Object objM22097O2 = tj3Var.m22097O();
            if (z5 || objM22097O2 == p84Var) {
                z3 = z2;
                vi3Var2 = vi3Var;
                objM22097O2 = new fi3(z3, vi3Var2, str2);
                tj3Var.m22131l0(objM22097O2);
            } else {
                z3 = z2;
                vi3Var2 = vi3Var;
            }
            pvc.m19505a(z, (vi3) objM22097O2, null, z3, null, tj3Var, ((i5 >> 3) & 14) | ((i5 << 3) & 7168), 52);
            tj3Var.m22139q(true);
        } else {
            str2 = str;
            vi3Var2 = vi3Var;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            final String str3 = str2;
            final vi3 vi3Var3 = vi3Var2;
            x18VarM22143u.f67642d = new zi3() { // from class: hr9
                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    g6d.m12388a(str3, z, z2, vi3Var3, (ye1) obj, pk9.m19383z(i | 1));
                    return xfa.f68157a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m12389b(String str, ye1 ye1Var, int i) {
        str.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-909851341);
        int i2 = (tj3Var.m22120g(str) ? 32 : 16) | i;
        if (tj3Var.m22099R(i2 & 1, (i2 & 19) != 18)) {
            Context context = (Context) tj3Var.m22128k(AbstractC0394f.f4761b);
            tj3Var.m22111b0(157476199);
            Object objM22097O = tj3Var.m22097O();
            if (objM22097O == we1.f66679a) {
                objM22097O = new C3288l7(7);
                tj3Var.m22131l0(objM22097O);
            }
            AbstractC0454b.m1895a((ui3) objM22097O, null, ci8.m4703P(768895425, new C3598t4(6, context, str), tj3Var), tj3Var, 390, 2);
            tj3Var.m22139q(false);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3441oz(str, i, 3);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m12390c(List list, List list2, boolean z, ui3 ui3Var, vi3 vi3Var, vi3 vi3Var2, ye1 ye1Var, int i) {
        int i2;
        boolean z2;
        vi3 vi3Var3;
        tj3 tj3Var;
        list.getClass();
        list2.getClass();
        ui3Var.getClass();
        vi3Var.getClass();
        vi3Var2.getClass();
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(200369106);
        if ((i & 6) == 0) {
            i2 = (tj3Var2.m22124i(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | (tj3Var2.m22124i(list2) ? 32 : 16);
        if ((i & 384) == 0) {
            z2 = z;
            i3 |= tj3Var2.m22122h(z2) ? 256 : 128;
        } else {
            z2 = z;
        }
        if ((i & 3072) == 0) {
            i3 |= tj3Var2.m22124i(ui3Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            vi3Var3 = vi3Var;
            i3 |= tj3Var2.m22124i(vi3Var3) ? 16384 : 8192;
        } else {
            vi3Var3 = vi3Var;
        }
        if ((196608 & i) == 0) {
            i3 |= tj3Var2.m22124i(vi3Var2) ? 131072 : 65536;
        }
        int i4 = i3;
        if (tj3Var2.m22099R(i4 & 1, (74899 & i4) != 74898)) {
            Object objM22097O = tj3Var2.m22097O();
            if (objM22097O == we1.f66679a) {
                objM22097O = AbstractC0278f.m1260j("");
                tj3Var2.m22131l0(objM22097O);
            }
            t66 t66Var = (t66) objM22097O;
            tj3Var = tj3Var2;
            q2d.m19625a(ui3Var, ci8.m4703P(1554176026, new ku6(vi3Var2, ui3Var, t66Var), tj3Var2), null, null, null, spc.f61214b, ci8.m4703P(1379468767, new f87(vi3Var2, (InterfaceC0300b) tj3Var2.m22128k(AbstractC0402n.f4817i), z2, list, list2, vi3Var3, t66Var), tj3Var2), null, 0L, 0L, 0L, 0L, null, tj3Var, ((i4 >> 9) & 14) | 1769520, 16284);
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new qb0(list, list2, z, ui3Var, vi3Var, vi3Var2, i, 4);
        }
    }
}
