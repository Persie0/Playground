package p000;

import android.content.Context;
import android.view.DisplayCutout;
import androidx.compose.foundation.AbstractC0080f;
import androidx.compose.material3.AbstractC0231g;
import androidx.compose.material3.C0269z;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.p002ui.platform.AbstractC0394f;
import androidx.compose.runtime.AbstractC0278f;
import androidx.compose.runtime.internal.C0282a;
import com.lingq.core.p012ui.R$string;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ebd {
    /* JADX INFO: renamed from: a */
    public static final void m11016a(fv8 fv8Var, ui3 ui3Var, ye1 ye1Var, int i) {
        boolean z;
        String str;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1833402279);
        int i2 = (tj3Var.m22124i(fv8Var) ? 4 : 2) | i | (tj3Var.m22124i(ui3Var) ? 32 : 16);
        if (tj3Var.m22099R(i2 & 1, (i2 & 19) != 18)) {
            zf1 zf1Var = ge9.f40637a;
            float f = ((fe9) tj3Var.m22128k(zf1Var)).f38952a;
            fc0 fc0Var = nj0.f52789H;
            bb1 bb1VarM230a = ab1.m230a(new C3661uu(f, false, new gm5(29)), nj0.f52791J, tj3Var, 0);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            b16 b16Var = b16.f7762a;
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, b16Var);
            se1.f60731q.getClass();
            ui3 ui3Var2 = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var2);
            } else {
                tj3Var.m22137o0();
            }
            zi3 zi3Var = C0352b.f4303f;
            oha.m18001g(tj3Var, zi3Var, bb1VarM230a);
            zi3 zi3Var2 = C0352b.f4302e;
            oha.m18001g(tj3Var, zi3Var2, l77VarM22132m);
            Integer numValueOf = Integer.valueOf(iHashCode);
            zi3 zi3Var3 = C0352b.f4304g;
            oha.m18001g(tj3Var, zi3Var3, numValueOf);
            vi3 vi3Var = C0352b.f4305h;
            oha.m18000f(tj3Var, vi3Var);
            zi3 zi3Var4 = C0352b.f4301d;
            oha.m18001g(tj3Var, zi3Var4, e16VarM1322c);
            e16 e16VarM815b = AbstractC0080f.m815b(null, false, ui3Var, c99.m4412e(b16Var, 1.0f), 15);
            sj8 sj8VarM20003a = qj8.m20003a(new C3661uu(((fe9) tj3Var.m22128k(zf1Var)).f38952a, true, new gm5(28)), fc0Var, tj3Var, 48);
            int iHashCode2 = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m2 = tj3Var.m22132m();
            e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var, e16VarM815b);
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var2);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, zi3Var, sj8VarM20003a);
            oha.m18001g(tj3Var, zi3Var2, l77VarM22132m2);
            AbstractC3393o1.m17747v(iHashCode2, tj3Var, zi3Var3, tj3Var, vi3Var);
            as4 as4VarM10871c = e65.m10871c(tj3Var, e16VarM1322c2, zi3Var4, 1.0f, true);
            if (vk9.m23391n0(fv8Var.f39759b)) {
                tj3Var.m22111b0(1100243468);
                Integer num = fv8Var.f39758a;
                if (num == null) {
                    tj3Var.m22111b0(1100274312);
                    z = false;
                    tj3Var.m22139q(false);
                    str = null;
                } else {
                    z = false;
                    tj3Var.m22111b0(1100274313);
                    String strM23620a0 = vz1.m23620a0(tj3Var, num.intValue());
                    tj3Var.m22139q(false);
                    str = strM23620a0;
                }
                if (str == null) {
                    str = "";
                }
                tj3Var.m22139q(z);
            } else {
                z = false;
                tj3Var.m22111b0(1100334763);
                tj3Var.m22139q(false);
                str = fv8Var.f39759b;
            }
            boolean z2 = z;
            lw9.m16554b(str, as4VarM10871c, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var.m22128k(ps5.f56764b)).f51800b.f71406j, tj3Var, 0, 0, 131068);
            tj3Var = tj3Var;
            if (fv8Var.f39760c) {
                tj3Var.m22111b0(1100499745);
                ty3.m22351a(f7d.m11590a(), null, null, 0L, tj3Var, 48, 12);
                tj3Var.m22139q(z2);
            } else {
                tj3Var.m22111b0(1100593923);
                tj3Var.m22139q(z2);
            }
            tj3Var.m22139q(true);
            pb1.m19031a(0.0f, 0, 7, 0L, tj3Var, null);
            tj3Var.m22139q(true);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new nya(fv8Var, ui3Var, i);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m11017b(String str, vi3 vi3Var, ye1 ye1Var, int i) {
        int i2;
        vi3 vi3Var2 = vi3Var;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1557259529);
        int i3 = i | (tj3Var.m22120g(str) ? 4 : 2) | (tj3Var.m22124i(vi3Var2) ? 32 : 16);
        if (tj3Var.m22099R(i3 & 1, (i3 & 19) != 18)) {
            boolean z = (i3 & 14) == 4;
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var = we1.f66679a;
            if (z || objM22097O == p84Var) {
                objM22097O = AbstractC0278f.m1260j(str);
                tj3Var.m22131l0(objM22097O);
            }
            t66 t66Var = (t66) objM22097O;
            String str2 = (String) t66Var.getValue();
            e16 e16VarM4412e = c99.m4412e(b16.f7762a, 1.0f);
            vh9 vh9Var = ps5.f56764b;
            vx9 vx9Var = ((ms5) tj3Var.m22128k(vh9Var)).f51800b.f71406j;
            hj4 hj4Var = new hj4(1, 3, null, 115);
            long j = aa1.f411j;
            eu9 eu9VarM16905h = mkd.m16905h(0L, 0L, j, j, j, tj3Var, 2147469311);
            si8 si8Var = ((ms5) tj3Var.m22128k(vh9Var)).f51801c.f64857c;
            boolean zM22120g = tj3Var.m22120g(t66Var) | ((i3 & 112) == 32);
            Object objM22097O2 = tj3Var.m22097O();
            if (zM22120g || objM22097O2 == p84Var) {
                vi3Var2 = vi3Var;
                objM22097O2 = new rza(vi3Var2, t66Var, 0);
                tj3Var.m22131l0(objM22097O2);
            } else {
                vi3Var2 = vi3Var;
            }
            i2 = 4;
            q6d.m19686c(str2, (vi3) objM22097O2, e16VarM4412e, false, vx9Var, null, psc.f56774b, psc.f56775c, null, null, false, null, hj4Var, null, true, 0, 0, si8Var, eu9VarM16905h, tj3Var, 113246592, 12779520, 1932888);
            tj3Var = tj3Var;
        } else {
            i2 = 4;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new nya(str, vi3Var2, i, i2);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m11018c(List list, vi3 vi3Var, ye1 ye1Var, int i) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(49583061);
        int i2 = (tj3Var.m22124i(list) ? 4 : 2) | i | (tj3Var.m22124i(vi3Var) ? 32 : 16);
        if (tj3Var.m22099R(i2 & 1, (i2 & 19) != 18)) {
            Context context = (Context) tj3Var.m22128k(AbstractC0394f.f4761b);
            e16 e16VarM21607T = AbstractC3584sr.m21607T(thb.m22066y(c99.m4412e(b16.f7762a, 1.0f)), ((fe9) tj3Var.m22128k(ge9.f40637a)).f38960i);
            ec0 ec0Var = nj0.f52792K;
            boolean zM22124i = tj3Var.m22124i(list) | tj3Var.m22124i(context) | ((i2 & 112) == 32);
            Object objM22097O = tj3Var.m22097O();
            if (zM22124i || objM22097O == we1.f66679a) {
                objM22097O = new ws6((Object) list, vi3Var, context, 22);
                tj3Var.m22131l0(objM22097O);
            }
            fa4.m11642c(e16VarM21607T, null, null, null, ec0Var, null, false, null, (vi3) objM22097O, tj3Var, 196608, 478);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new nya(list, vi3Var, i, 6);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m11019d(g43 g43Var, vi3 vi3Var, ye1 ye1Var, int i) {
        vi3 vi3Var2;
        b16 b16Var;
        float f;
        boolean z;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1812670234);
        int i2 = i | (tj3Var.m22124i(g43Var) ? 4 : 2) | (tj3Var.m22124i(vi3Var) ? 32 : 16);
        if (tj3Var.m22099R(i2 & 1, (i2 & 19) != 18)) {
            b16 b16Var2 = b16.f7762a;
            e16 e16VarM22066y = thb.m22066y(c99.m4412e(b16Var2, 1.0f));
            zf1 zf1Var = ge9.f40637a;
            e16 e16VarM21607T = AbstractC3584sr.m21607T(e16VarM22066y, ((fe9) tj3Var.m22128k(zf1Var)).f38960i);
            C3661uu c3661uu = new C3661uu(((fe9) tj3Var.m22128k(zf1Var)).f38952a, true, new gm5(28));
            ec0 ec0Var = nj0.f52792K;
            bb1 bb1VarM230a = ab1.m230a(c3661uu, ec0Var, tj3Var, 48);
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
            zi3 zi3Var = C0352b.f4303f;
            oha.m18001g(tj3Var, zi3Var, bb1VarM230a);
            zi3 zi3Var2 = C0352b.f4302e;
            oha.m18001g(tj3Var, zi3Var2, l77VarM22132m);
            Integer numValueOf = Integer.valueOf(iHashCode);
            zi3 zi3Var3 = C0352b.f4304g;
            oha.m18001g(tj3Var, zi3Var3, numValueOf);
            vi3 vi3Var3 = C0352b.f4305h;
            oha.m18000f(tj3Var, vi3Var3);
            zi3 zi3Var4 = C0352b.f4301d;
            oha.m18001g(tj3Var, zi3Var4, e16VarM1322c);
            e16 e16VarM4412e = c99.m4412e(b16Var2, 1.0f);
            sj8 sj8VarM20003a = qj8.m20003a(eh0.f37242h, nj0.f52817l, tj3Var, 6);
            int iHashCode2 = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m2 = tj3Var.m22132m();
            e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var, e16VarM4412e);
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, zi3Var, sj8VarM20003a);
            oha.m18001g(tj3Var, zi3Var2, l77VarM22132m2);
            AbstractC3393o1.m17747v(iHashCode2, tj3Var, zi3Var3, tj3Var, vi3Var3);
            oha.m18001g(tj3Var, zi3Var4, e16VarM1322c2);
            int i3 = i2 & 112;
            boolean z2 = i3 == 32;
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var = we1.f66679a;
            if (z2 || objM22097O == p84Var) {
                objM22097O = new hsa(vi3Var, 8);
                tj3Var.m22131l0(objM22097O);
            }
            ty3.m22351a(r3d.m20287b(), vz1.m23620a0(tj3Var, R$string.ui_back), AbstractC0080f.m815b(null, false, (ui3) objM22097O, b16Var2, 15), 0L, tj3Var, 0, 8);
            if (g43Var.f40166c) {
                tj3Var.m22111b0(1809753920);
                boolean z3 = i3 == 32;
                Object objM22097O2 = tj3Var.m22097O();
                if (z3 || objM22097O2 == p84Var) {
                    objM22097O2 = new hsa(vi3Var, 9);
                    tj3Var.m22131l0(objM22097O2);
                }
                b16Var = b16Var2;
                f = 1.0f;
                AbstractC0231g.m1153f(805306368, 510, null, tj3Var, (ui3) objM22097O2, psc.f56773a, null, null, null, false);
                tj3Var = tj3Var;
                tj3Var.m22139q(false);
            } else {
                b16Var = b16Var2;
                f = 1.0f;
                tj3Var.m22111b0(1809951886);
                tj3Var.m22139q(false);
            }
            tj3Var.m22139q(true);
            if (g43Var.f40167d) {
                tj3Var.m22111b0(879691974);
                do7.m10527c(null, 0L, 0.0f, 0.0f, tj3Var, 0, 15);
                z = false;
                tj3Var.m22139q(false);
            } else {
                z = false;
                tj3Var.m22111b0(879734258);
                tj3Var.m22139q(false);
            }
            e16 e16VarM4412e2 = c99.m4412e(b16Var, f);
            boolean z4 = z;
            C3661uu c3661uu2 = new C3661uu(((fe9) tj3Var.m22128k(zf1Var)).f38956e, true, new gm5(28));
            boolean zM22124i = tj3Var.m22124i(g43Var);
            if (i3 == 32) {
                z4 = true;
            }
            boolean z5 = zM22124i | z4;
            Object objM22097O3 = tj3Var.m22097O();
            if (z5 || objM22097O3 == p84Var) {
                vi3Var2 = vi3Var;
                objM22097O3 = new r3a(13, g43Var, vi3Var2);
                tj3Var.m22131l0(objM22097O3);
            } else {
                vi3Var2 = vi3Var;
            }
            tj3 tj3Var2 = tj3Var;
            fa4.m11642c(e16VarM4412e2, null, null, c3661uu2, ec0Var, null, false, null, (vi3) objM22097O3, tj3Var2, 196614, 462);
            tj3Var = tj3Var2;
            tj3Var.m22139q(true);
        } else {
            vi3Var2 = vi3Var;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new nya(g43Var, vi3Var2, i, 5);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m11020e(tza tzaVar, List list, vi3 vi3Var, e16 e16Var, ye1 ye1Var, int i) {
        tj3 tj3Var;
        e16 e16Var2;
        tzaVar.getClass();
        list.getClass();
        vi3Var.getClass();
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(181494314);
        int i2 = i | (tj3Var2.m22124i(tzaVar) ? 4 : 2) | (tj3Var2.m22124i(list) ? 32 : 16) | (tj3Var2.m22124i(vi3Var) ? 256 : 128) | 3072;
        if (tj3Var2.m22099R(i2 & 1, (i2 & 1171) != 1170)) {
            C0269z c0269zM1154g = AbstractC0231g.m1154g(true, tj3Var2, 6, 2);
            boolean z = (i2 & 896) == 256;
            Object objM22097O = tj3Var2.m22097O();
            if (z || objM22097O == we1.f66679a) {
                objM22097O = new hsa(vi3Var, 7);
                tj3Var2.m22131l0(objM22097O);
            }
            cx7 cx7Var = new cx7(20);
            C0282a c0282aM4703P = ci8.m4703P(-2071630584, new a05(tzaVar, vi3Var, list, 23), tj3Var2);
            b16 b16Var = b16.f7762a;
            tj3Var = tj3Var2;
            AbstractC0231g.m1150c((ui3) objM22097O, b16Var, c0269zM1154g, 0.0f, false, null, 0L, 0L, 0L, null, cx7Var, null, c0282aM4703P, tj3Var, 48, 3072, 6136);
            e16Var2 = b16Var;
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
            e16Var2 = e16Var;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new h39(tzaVar, list, vi3Var, e16Var2, i, 9);
        }
    }

    /* JADX INFO: renamed from: f */
    public static List m11021f(DisplayCutout displayCutout) {
        return displayCutout.getBoundingRects();
    }

    /* JADX INFO: renamed from: g */
    public static int m11022g(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetBottom();
    }

    /* JADX INFO: renamed from: h */
    public static int m11023h(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetLeft();
    }

    /* JADX INFO: renamed from: i */
    public static int m11024i(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetRight();
    }

    /* JADX INFO: renamed from: j */
    public static int m11025j(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetTop();
    }
}
