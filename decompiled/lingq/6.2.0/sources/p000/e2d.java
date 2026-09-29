package p000;

import android.content.Context;
import androidx.compose.material3.AbstractC0231g;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.p002ui.platform.AbstractC0394f;
import androidx.compose.runtime.AbstractC0278f;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class e2d {

    /* JADX INFO: renamed from: a */
    public static p04 f36632a;

    /* JADX INFO: renamed from: a */
    public static final void m10812a(String str, ye1 ye1Var, int i) {
        tj3 tj3Var;
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(-2048889130);
        int i2 = i | (tj3Var2.m22120g(str) ? 4 : 2);
        if (tj3Var2.m22099R(i2 & 1, (i2 & 3) != 2)) {
            tj3Var = tj3Var2;
            lw9.m16554b(str, AbstractC3584sr.m21609V(b16.f7762a, 0.0f, ((fe9) tj3Var2.m22128k(ge9.f40637a)).f38952a, 1), 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var2.m22128k(ps5.f56764b)).f51800b.f71405i, tj3Var, i2 & 14, 0, 131068);
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3441oz(str, i, 26);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m10813b(kx8 kx8Var, vi3 vi3Var, e16 e16Var, ye1 ye1Var, int i) {
        e16 e16Var2;
        kx8Var.getClass();
        List list = kx8Var.f48554g;
        List list2 = kx8Var.f48557j;
        vi3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-2121392111);
        int i2 = i | (tj3Var.m22124i(kx8Var) ? 4 : 2);
        if ((i & 48) == 0) {
            i2 |= tj3Var.m22124i(vi3Var) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (tj3Var.m22099R(i3 & 1, (i3 & 147) != 146)) {
            Context context = (Context) tj3Var.m22128k(AbstractC0394f.f4761b);
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var = we1.f66679a;
            if (objM22097O == p84Var) {
                objM22097O = AbstractC0278f.m1260j(Boolean.FALSE);
                tj3Var.m22131l0(objM22097O);
            }
            t66 t66Var = (t66) objM22097O;
            Object objM22097O2 = tj3Var.m22097O();
            if (objM22097O2 == p84Var) {
                objM22097O2 = AbstractC0278f.m1260j(Boolean.FALSE);
                tj3Var.m22131l0(objM22097O2);
            }
            t66 t66Var2 = (t66) objM22097O2;
            if (!((Boolean) t66Var.getValue()).booleanValue() || list2.isEmpty()) {
                tj3Var.m22111b0(2052025649);
                tj3Var.m22139q(false);
            } else {
                tj3Var.m22111b0(2051780594);
                boolean z = (i3 & 112) == 32;
                Object objM22097O3 = tj3Var.m22097O();
                if (z || objM22097O3 == p84Var) {
                    objM22097O3 = new wh7(vi3Var, 27);
                    tj3Var.m22131l0(objM22097O3);
                }
                vi3 vi3Var2 = (vi3) objM22097O3;
                Object objM22097O4 = tj3Var.m22097O();
                if (objM22097O4 == p84Var) {
                    objM22097O4 = new un7(16, t66Var);
                    tj3Var.m22131l0(objM22097O4);
                }
                n2d.m17192a(list2, vi3Var2, (ui3) objM22097O4, tj3Var, 384);
                tj3Var.m22139q(false);
            }
            if (!((Boolean) t66Var2.getValue()).booleanValue() || list.isEmpty()) {
                tj3Var.m22111b0(2052346065);
                tj3Var.m22139q(false);
            } else {
                tj3Var.m22111b0(2052110620);
                boolean z2 = (i3 & 112) == 32;
                Object objM22097O5 = tj3Var.m22097O();
                if (z2 || objM22097O5 == p84Var) {
                    objM22097O5 = new wh7(vi3Var, 29);
                    tj3Var.m22131l0(objM22097O5);
                }
                vi3 vi3Var3 = (vi3) objM22097O5;
                Object objM22097O6 = tj3Var.m22097O();
                if (objM22097O6 == p84Var) {
                    objM22097O6 = new un7(19, t66Var2);
                    tj3Var.m22131l0(objM22097O6);
                }
                n2d.m17192a(list, vi3Var3, (ui3) objM22097O6, tj3Var, 384);
                tj3Var.m22139q(false);
            }
            b16 b16Var = b16.f7762a;
            e16 e16VarM21609V = AbstractC3584sr.m21609V(c99.m4411d(b16Var, 1.0f), ((fe9) tj3Var.m22128k(ge9.f40637a)).f38960i, 0.0f, 2);
            boolean zM22124i = tj3Var.m22124i(kx8Var) | ((i3 & 112) == 32) | tj3Var.m22124i(context);
            Object objM22097O7 = tj3Var.m22097O();
            if (zM22124i || objM22097O7 == p84Var) {
                C3537ri c3537ri = new C3537ri(8, vi3Var, t66Var2, kx8Var, t66Var, context);
                tj3Var.m22131l0(c3537ri);
                objM22097O7 = c3537ri;
            }
            fa4.m11642c(e16VarM21609V, null, null, null, null, null, false, null, (vi3) objM22097O7, tj3Var, 0, 510);
            e16Var2 = b16Var;
        } else {
            tj3Var.m22102U();
            e16Var2 = e16Var;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new y35(i, 14, kx8Var, vi3Var, e16Var2);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m10814c(int i, ye1 ye1Var, ui3 ui3Var, ui3 ui3Var2, String str, String str2, boolean z) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-2016910910);
        int i2 = i | (tj3Var.m22120g(str) ? 4 : 2) | (tj3Var.m22124i(ui3Var) ? 32 : 16) | (tj3Var.m22122h(z) ? 2048 : 1024) | (tj3Var.m22120g(str2) ? 16384 : 8192);
        if (tj3Var.m22099R(i2 & 1, (i2 & 9363) != 9362)) {
            e16 e16VarM4412e = c99.m4412e(b16.f7762a, 1.0f);
            sj8 sj8VarM20003a = qj8.m20003a(eh0.f37242h, nj0.f52789H, tj3Var, 54);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM4412e);
            se1.f60731q.getClass();
            ui3 ui3Var3 = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var3);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, C0352b.f4303f, sj8VarM20003a);
            oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
            oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
            oha.m18000f(tj3Var, C0352b.f4305h);
            oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
            AbstractC0231g.m1153f(((i2 >> 3) & 14) | 805306368, 510, null, tj3Var, ui3Var, ci8.m4703P(-2014716159, new iq0(str, 13), tj3Var), null, null, null, false);
            if (z) {
                tj3Var.m22111b0(-241857678);
                omd.m18141c(ui3Var2, null, false, null, null, ci8.m4703P(1043334853, new C3441oz(str2, 25), tj3Var), tj3Var, 1572870, 62);
                tj3Var = tj3Var;
                tj3Var.m22139q(false);
            } else {
                tj3Var.m22111b0(-241655868);
                tj3Var.m22139q(false);
            }
            tj3Var.m22139q(true);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new uy0(i, ui3Var, ui3Var2, str, str2, z);
        }
    }
}
