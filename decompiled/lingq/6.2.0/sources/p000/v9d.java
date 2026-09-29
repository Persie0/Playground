package p000;

import android.content.Context;
import androidx.compose.foundation.AbstractC0080f;
import androidx.compose.material3.AbstractC0231g;
import androidx.compose.material3.C0269z;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.p002ui.platform.AbstractC0394f;
import com.lingq.feature.challenges.R$string;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public abstract class v9d {

    /* JADX INFO: renamed from: a */
    public static p04 f65086a;

    /* JADX INFO: renamed from: a */
    public static final void m23199a(vv1 vv1Var, vi3 vi3Var, ye1 ye1Var, int i) {
        int i2;
        vv1Var.getClass();
        vi3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-378159438);
        if ((i & 6) == 0) {
            i2 = i | (tj3Var.m22124i(vv1Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= tj3Var.m22124i(vi3Var) ? 32 : 16;
        }
        int i3 = i2;
        if (tj3Var.m22099R(i3 & 1, (i3 & 19) != 18)) {
            C0269z c0269zM1154g = AbstractC0231g.m1154g(true, tj3Var, 6, 2);
            boolean z = (i3 & 112) == 32;
            Object objM22097O = tj3Var.m22097O();
            if (z || objM22097O == we1.f66679a) {
                objM22097O = new hv1(vi3Var, 20);
                tj3Var.m22131l0(objM22097O);
            }
            AbstractC0231g.m1150c((ui3) objM22097O, null, c0269zM1154g, 0.0f, false, null, ((ms5) tj3Var.m22128k(ps5.f56764b)).f51799a.f55825J, 0L, 0L, null, null, null, ci8.m4703P(-204274800, new C3180kd(15, vi3Var, vv1Var), tj3Var), tj3Var, 0, 3078, 7098);
            tj3Var = tj3Var;
            if (vv1Var.f65968g) {
                tj3Var.m22111b0(-46689952);
                m23202d(vv1Var.f65962a, vv1Var.f65970i, vi3Var, tj3Var, (i3 << 3) & 896);
                tj3Var.m22139q(false);
            } else {
                tj3Var.m22111b0(-46582320);
                tj3Var.m22139q(false);
            }
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3709w4(vv1Var, i, 9, vi3Var);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m23200b(vv1 vv1Var, vi3 vi3Var, ye1 ye1Var, int i) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-2043967545);
        int i2 = (tj3Var.m22124i(vv1Var) ? 4 : 2) | i | (tj3Var.m22124i(vi3Var) ? 32 : 16);
        if (tj3Var.m22099R(i2 & 1, (i2 & 19) != 18)) {
            zf1 zf1Var = ge9.f40637a;
            bb1 bb1VarM230a = ab1.m230a(new C3661uu(((fe9) tj3Var.m22128k(zf1Var)).f38956e, true, new gm5(28)), nj0.f52791J, tj3Var, 0);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            b16 b16Var = b16.f7762a;
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, b16Var);
            se1.f60731q.getClass();
            ui3 ui3Var = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, C0352b.f4303f, bb1VarM230a);
            oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
            oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
            oha.m18000f(tj3Var, C0352b.f4305h);
            oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
            e16 e16VarM4412e = c99.m4412e(b16Var, 1.0f);
            boolean z = !vv1Var.f65970i;
            si8 si8VarM22753b = ui8.m22753b(36.0f);
            x17 x17Var = wj0.f66899a;
            vj0 vj0VarM23996a = wj0.m23996a(xs1.f68608a, xs1.f68632y, 0L, tj3Var, 12);
            int i3 = i2 & 112;
            boolean z2 = i3 == 32;
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var = we1.f66679a;
            if (z2 || objM22097O == p84Var) {
                objM22097O = new hv1(vi3Var, 22);
                tj3Var.m22131l0(objM22097O);
            }
            ss5.m21710f(e16VarM4412e, vj0VarM23996a, si8VarM22753b, z, (ui3) objM22097O, ipb.f44413c, tj3Var, 196614, 0);
            e16 e16VarM4412e2 = c99.m4412e(b16Var, 1.0f);
            boolean z3 = i3 == 32;
            Object objM22097O2 = tj3Var.m22097O();
            if (z3 || objM22097O2 == p84Var) {
                objM22097O2 = new hv1(vi3Var, 23);
                tj3Var.m22131l0(objM22097O2);
            }
            e16 e16VarM21609V = AbstractC3584sr.m21609V(AbstractC0080f.m815b(null, false, (ui3) objM22097O2, e16VarM4412e2, 15), 0.0f, ((fe9) tj3Var.m22128k(zf1Var)).f38956e, 1);
            String strM23620a0 = vz1.m23620a0(tj3Var, R$string.cup_not_now);
            vh9 vh9Var = ps5.f56764b;
            lw9.m16554b(strM23620a0, e16VarM21609V, ((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55875s, null, 0L, null, null, 0L, null, new ks9(3), 0L, 0, false, 0, 0, null, ((ms5) tj3Var.m22128k(vh9Var)).f51800b.f71406j, tj3Var, 0, 0, 130040);
            tj3Var = tj3Var;
            tj3Var.m22139q(true);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new tv1(vv1Var, vi3Var, i, 0);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m23201c(String str, ye1 ye1Var, int i) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-145144353);
        int i2 = i | (tj3Var.m22120g(str) ? 4 : 2);
        if (tj3Var.m22099R(i2 & 1, (i2 & 3) != 2)) {
            b16 b16Var = b16.f7762a;
            e16 e16VarM4412e = c99.m4412e(b16Var, 1.0f);
            zf1 zf1Var = ge9.f40637a;
            sj8 sj8VarM20003a = qj8.m20003a(new C3661uu(((fe9) tj3Var.m22128k(zf1Var)).f38957f, true, new gm5(28)), nj0.f52789H, tj3Var, 48);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM4412e);
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
            ((fe9) tj3Var.m22128k(zf1Var)).getClass();
            ty3.m22351a(d7d.m10143a(), null, c99.m4422o(b16Var, 24.0f), xs1.f68608a, tj3Var, 3120, 0);
            as4 as4Var = new as4(1.0f, true);
            vh9 vh9Var = ps5.f56764b;
            lw9.m16554b(str, as4Var, ((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55875s, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var.m22128k(vh9Var)).f51800b.f71406j, tj3Var, i2 & 14, 0, 131064);
            tj3Var = tj3Var;
            tj3Var.m22139q(true);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3441oz(str, i, 9);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m23202d(String str, boolean z, vi3 vi3Var, ye1 ye1Var, int i) {
        int i2;
        tj3 tj3Var;
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(2015132782);
        if ((i & 6) == 0) {
            i2 = (tj3Var2.m22120g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= tj3Var2.m22122h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= tj3Var2.m22124i(vi3Var) ? 256 : 128;
        }
        int i3 = 0;
        if (tj3Var2.m22099R(i2 & 1, (i2 & 147) != 146)) {
            String strM17093L = AbstractC3352my.m17093L((Context) tj3Var2.m22128k(AbstractC0394f.f4761b), str);
            boolean z2 = (i2 & 896) == 256;
            Object objM22097O = tj3Var2.m22097O();
            if (z2 || objM22097O == we1.f66679a) {
                objM22097O = new hv1(vi3Var, 28);
                tj3Var2.m22131l0(objM22097O);
            }
            tj3Var = tj3Var2;
            q2d.m19625a((ui3) objM22097O, ci8.m4703P(-522242378, new uv1(z, vi3Var, strM17093L, i3), tj3Var2), null, ci8.m4703P(-136379976, new dq0(vi3Var, 23), tj3Var2), null, ci8.m4703P(249482426, new C3441oz(strM17093L, 10), tj3Var2), ci8.m4703P(442413627, new C3441oz(strM17093L, 11), tj3Var2), null, 0L, 0L, 0L, 0L, null, tj3Var, 1772592, 16276);
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3493qd(str, z, vi3Var, i, 3);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m23203e(vv1 vv1Var, ye1 ye1Var, int i) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1693972719);
        int i2 = (tj3Var.m22124i(vv1Var) ? 4 : 2) | i;
        if (tj3Var.m22099R(i2 & 1, (i2 & 3) != 2)) {
            fad.m11681d(null, null, ci8.m4703P(-1794808663, new C3180kd(14, vv1Var, (Context) tj3Var.m22128k(AbstractC0394f.f4761b)), tj3Var), tj3Var, 384, 3);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new sv1(vv1Var, i, 1);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m23204f(ye1 ye1Var, int i) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1080988375);
        if (tj3Var.m22099R(i & 1, i != 0)) {
            bb1 bb1VarM230a = ab1.m230a(new C3661uu(((fe9) tj3Var.m22128k(ge9.f40637a)).f38956e, true, new gm5(28)), nj0.f52791J, tj3Var, 0);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, b16.f7762a);
            se1.f60731q.getClass();
            ui3 ui3Var = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, C0352b.f4303f, bb1VarM230a);
            oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
            oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
            oha.m18000f(tj3Var, C0352b.f4305h);
            oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
            String upperCase = vz1.m23620a0(tj3Var, R$string.cup_how_does_it_work).toUpperCase(Locale.ROOT);
            upperCase.getClass();
            lw9.m16554b(upperCase, null, xs1.f68608a, null, 0L, null, bc3.f8323i, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var.m22128k(ps5.f56764b)).f51800b.f71404h, tj3Var, 1573248, 0, 131002);
            tj3Var = tj3Var;
            tj3Var.m22111b0(66246490);
            Iterator it = vz1.m23605K(Integer.valueOf(R$string.cup_signup_point_coins), Integer.valueOf(R$string.cup_signup_point_bonus), Integer.valueOf(R$string.cup_signup_point_ranking)).iterator();
            while (it.hasNext()) {
                m23201c(vz1.m23620a0(tj3Var, ((Number) it.next()).intValue()), tj3Var, 0);
            }
            tj3Var.m22139q(false);
            tj3Var.m22139q(true);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new je1(i, 17);
        }
    }

    /* JADX INFO: renamed from: g */
    public static final void m23205g(vv1 vv1Var, vi3 vi3Var, ye1 ye1Var, int i) {
        int i2;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1703286148);
        int i3 = (tj3Var.m22124i(vv1Var) ? 4 : 2) | i | (tj3Var.m22124i(vi3Var) ? 32 : 16);
        if (tj3Var.m22099R(i3 & 1, (i3 & 19) != 18)) {
            e16 e16VarM4412e = c99.m4412e(b16.f7762a, 1.0f);
            boolean zM22124i = ((i3 & 112) == 32) | tj3Var.m22124i(vv1Var);
            Object objM22097O = tj3Var.m22097O();
            if (zM22124i || objM22097O == we1.f66679a) {
                objM22097O = new C3577sk(10, vi3Var, vv1Var);
                tj3Var.m22131l0(objM22097O);
            }
            e16 e16VarM815b = AbstractC0080f.m815b(null, false, (ui3) objM22097O, e16VarM4412e, 15);
            sj8 sj8VarM20003a = qj8.m20003a(new C3661uu(((fe9) tj3Var.m22128k(ge9.f40637a)).f38952a, true, new gm5(28)), nj0.f52789H, tj3Var, 48);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM815b);
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
            boolean z = vv1Var.f65964c;
            long j = xs1.f68608a;
            long j2 = aa1.f412k;
            vh9 vh9Var = ps5.f56764b;
            h01 h01VarM14320b = j7d.m14320b(((ms5) tj3Var.m22128k(vh9Var)).f51799a);
            long j3 = aa1.f411j;
            long j4 = j2 != 16 ? j2 : h01VarM14320b.f41590a;
            long j5 = j3 != 16 ? j3 : h01VarM14320b.f41591b;
            long j6 = j != 16 ? j : h01VarM14320b.f41592c;
            long j7 = j3 != 16 ? j3 : h01VarM14320b.f41593d;
            long j8 = j2 != 16 ? j2 : h01VarM14320b.f41594e;
            if (j3 == 16) {
                j3 = h01VarM14320b.f41595f;
            }
            long j9 = j3;
            long j10 = j2 != 16 ? j2 : h01VarM14320b.f41596g;
            long j11 = j != 16 ? j : h01VarM14320b.f41597h;
            long j12 = j2 != 16 ? j2 : h01VarM14320b.f41598i;
            long j13 = j2 != 16 ? j2 : h01VarM14320b.f41599j;
            long j14 = j2 != 16 ? j2 : h01VarM14320b.f41600k;
            long j15 = j2 != 16 ? j2 : h01VarM14320b.f41601l;
            if (j2 == 16) {
                j2 = h01VarM14320b.f41602m;
            }
            pvc.m19505a(z, null, null, false, new h01(j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j2), tj3Var, 48, 44);
            i2 = 1;
            lw9.m16554b(vz1.m23620a0(tj3Var, R$string.cup_signup_notifications), new as4(1.0f, true), ((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55873q, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var.m22128k(vh9Var)).f51800b.f71406j, tj3Var, 0, 0, 131064);
            tj3Var = tj3Var;
            tj3Var.m22139q(true);
        } else {
            i2 = 1;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new tv1(vv1Var, vi3Var, i, i2);
        }
    }

    /* JADX INFO: renamed from: h */
    public static final void m23206h(vv1 vv1Var, vi3 vi3Var, ye1 ye1Var, int i) {
        String strM23618Z;
        boolean z;
        ui3 ui3Var;
        vi3 vi3Var2;
        vi3 vi3Var3 = vi3Var;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1287257465);
        int i2 = i | (tj3Var.m22124i(vv1Var) ? 4 : 2) | (tj3Var.m22124i(vi3Var3) ? 32 : 16);
        if (tj3Var.m22099R(i2 & 1, (i2 & 19) != 18)) {
            Context context = (Context) tj3Var.m22128k(AbstractC0394f.f4761b);
            b16 b16Var = b16.f7762a;
            e16 e16VarM4412e = c99.m4412e(b16Var, 1.0f);
            C3661uu c3661uu = new C3661uu(ge9.m12515a(tj3Var).f38956e, true, new gm5(28));
            fc0 fc0Var = nj0.f52789H;
            sj8 sj8VarM20003a = qj8.m20003a(c3661uu, fc0Var, tj3Var, 48);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM4412e);
            se1.f60731q.getClass();
            ui3 ui3Var2 = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var2);
            } else {
                tj3Var.m22137o0();
            }
            zi3 zi3Var = C0352b.f4303f;
            oha.m18001g(tj3Var, zi3Var, sj8VarM20003a);
            zi3 zi3Var2 = C0352b.f4302e;
            oha.m18001g(tj3Var, zi3Var2, l77VarM22132m);
            Integer numValueOf = Integer.valueOf(iHashCode);
            zi3 zi3Var3 = C0352b.f4304g;
            oha.m18001g(tj3Var, zi3Var3, numValueOf);
            vi3 vi3Var4 = C0352b.f4305h;
            oha.m18000f(tj3Var, vi3Var4);
            zi3 zi3Var4 = C0352b.f4301d;
            oha.m18001g(tj3Var, zi3Var4, e16VarM1322c);
            e16 e16VarM10007D = d32.m10007D(pb1.m19045o(c99.m4422o(b16Var, 56.0f), ui8.f63972a), p58.m18900f(tj3Var).f55825J, ss5.f61356d);
            ht5 ht5VarM19966d = qh0.m19966d(nj0.f52812g, false);
            int iHashCode2 = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m2 = tj3Var.m22132m();
            e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var, e16VarM10007D);
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var2);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, zi3Var, ht5VarM19966d);
            oha.m18001g(tj3Var, zi3Var2, l77VarM22132m2);
            AbstractC3393o1.m17747v(iHashCode2, tj3Var, zi3Var3, tj3Var, vi3Var4);
            oha.m18001g(tj3Var, zi3Var4, e16VarM1322c2);
            String str = vv1Var.f65962a;
            int i3 = vv1Var.f65963b;
            r9d.m20481c(0, tj3Var, wq1.m24108d(tj3Var, b16Var, 32.0f), str);
            tj3Var.m22139q(true);
            as4 as4Var = new as4(1.0f, true);
            bb1 bb1VarM230a = ab1.m230a(new C3661uu(ge9.m12515a(tj3Var).f38954c, true, new gm5(28)), nj0.f52791J, tj3Var, 0);
            int iHashCode3 = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m3 = tj3Var.m22132m();
            e16 e16VarM1322c3 = AbstractC0287b.m1322c(tj3Var, as4Var);
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var2);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, zi3Var, bb1VarM230a);
            oha.m18001g(tj3Var, zi3Var2, l77VarM22132m3);
            AbstractC3393o1.m17747v(iHashCode3, tj3Var, zi3Var3, tj3Var, vi3Var4);
            oha.m18001g(tj3Var, zi3Var4, e16VarM1322c3);
            lw9.m16554b(vz1.m23618Z(R$string.cup_team_name, new Object[]{AbstractC3352my.m17093L(context, vv1Var.f65962a)}, tj3Var), null, p58.m18900f(tj3Var).f55873q, null, 0L, null, bc3.f8323i, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var).f71404h, tj3Var, 1572864, 0, 131002);
            if (i3 < 100) {
                tj3Var.m22111b0(-333684768);
                strM23618Z = vz1.m23620a0(tj3Var, R$string.cup_be_first_to_join);
                tj3Var.m22139q(false);
            } else {
                tj3Var.m22111b0(-333593473);
                strM23618Z = vz1.m23618Z(R$string.cup_fellow_learners, new Object[]{String.format("%,d", Arrays.copyOf(new Object[]{Integer.valueOf(i3)}, 1))}, tj3Var);
                tj3Var.m22139q(false);
            }
            lw9.m16554b(strM23618Z, null, p58.m18900f(tj3Var).f55875s, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var).f71407k, tj3Var, 0, 0, 131066);
            tj3Var = tj3Var;
            tj3Var.m22139q(true);
            if (vv1Var.f65966e) {
                tj3Var.m22111b0(-131492793);
                ht5 ht5VarM19966d2 = qh0.m19966d(nj0.f52808c, false);
                int iHashCode4 = Long.hashCode(tj3Var.f62385T);
                l77 l77VarM22132m4 = tj3Var.m22132m();
                e16 e16VarM1322c4 = AbstractC0287b.m1322c(tj3Var, b16Var);
                tj3Var.m22119f0();
                if (tj3Var.f62384S) {
                    ui3Var = ui3Var2;
                    tj3Var.m22130l(ui3Var);
                } else {
                    ui3Var = ui3Var2;
                    tj3Var.m22137o0();
                }
                oha.m18001g(tj3Var, zi3Var, ht5VarM19966d2);
                oha.m18001g(tj3Var, zi3Var2, l77VarM22132m4);
                AbstractC3393o1.m17747v(iHashCode4, tj3Var, zi3Var3, tj3Var, vi3Var4);
                oha.m18001g(tj3Var, zi3Var4, e16VarM1322c4);
                int i4 = i2 & 112;
                boolean z2 = i4 == 32;
                Object objM22097O = tj3Var.m22097O();
                p84 p84Var = we1.f66679a;
                if (z2 || objM22097O == p84Var) {
                    objM22097O = new hv1(vi3Var, 25);
                    tj3Var.m22131l0(objM22097O);
                }
                e16 e16VarM815b = AbstractC0080f.m815b(null, false, (ui3) objM22097O, b16Var, 15);
                sj8 sj8VarM20003a2 = qj8.m20003a(eh0.f37236b, fc0Var, tj3Var, 48);
                int iHashCode5 = Long.hashCode(tj3Var.f62385T);
                l77 l77VarM22132m5 = tj3Var.m22132m();
                e16 e16VarM1322c5 = AbstractC0287b.m1322c(tj3Var, e16VarM815b);
                tj3Var.m22119f0();
                if (tj3Var.f62384S) {
                    tj3Var.m22130l(ui3Var);
                } else {
                    tj3Var.m22137o0();
                }
                oha.m18001g(tj3Var, zi3Var, sj8VarM20003a2);
                oha.m18001g(tj3Var, zi3Var2, l77VarM22132m5);
                AbstractC3393o1.m17747v(iHashCode5, tj3Var, zi3Var3, tj3Var, vi3Var4);
                oha.m18001g(tj3Var, zi3Var4, e16VarM1322c5);
                String strM23620a0 = vz1.m23620a0(tj3Var, R$string.cup_change);
                vx9 vx9Var = p58.m18902j(tj3Var).f71409m;
                bc3 bc3Var = bc3.f8322h;
                long j = xs1.f68609b;
                lw9.m16554b(strM23620a0, null, j, null, 0L, null, bc3Var, 0L, null, null, 0L, 0, false, 0, 0, null, vx9Var, tj3Var, 1573248, 0, 131002);
                tj3Var = tj3Var;
                ty3.m22351a(ihd.m13932a(), null, wq1.m24108d(tj3Var, b16Var, 24.0f), j, tj3Var, 3120, 0);
                tj3Var.m22139q(true);
                boolean z3 = vv1Var.f65965d;
                boolean z4 = i4 == 32;
                Object objM22097O2 = tj3Var.m22097O();
                if (z4 || objM22097O2 == p84Var) {
                    vi3Var2 = vi3Var;
                    objM22097O2 = new hv1(vi3Var2, 26);
                    tj3Var.m22131l0(objM22097O2);
                } else {
                    vi3Var2 = vi3Var;
                }
                vi3Var3 = vi3Var2;
                AbstractC3003fj.m11885a(z3, (ui3) objM22097O2, null, 0L, null, null, null, 0L, 0.0f, ci8.m4703P(1156111325, new ik0(vv1Var, vi3Var2, context, 18), tj3Var), tj3Var, 0, 2044);
                z = true;
                tj3Var.m22139q(true);
                tj3Var.m22139q(false);
            } else {
                z = true;
                vi3Var3 = vi3Var;
                tj3Var.m22111b0(-129563105);
                tj3Var.m22139q(false);
            }
            tj3Var.m22139q(z);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new tv1(vv1Var, vi3Var3, i, 2);
        }
    }

    /* JADX INFO: renamed from: i */
    public static final void m23207i(vv1 vv1Var, ye1 ye1Var, int i) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(360231099);
        int i2 = (tj3Var.m22124i(vv1Var) ? 4 : 2) | i;
        if (tj3Var.m22099R(i2 & 1, (i2 & 3) != 2)) {
            Context context = (Context) tj3Var.m22128k(AbstractC0394f.f4761b);
            e16 e16VarM4412e = c99.m4412e(b16.f7762a, 1.0f);
            zf1 zf1Var = ge9.f40637a;
            e16 e16VarM21607T = AbstractC3584sr.m21607T(r46.m20387m(d32.m10007D(pb1.m19045o(e16VarM4412e, ui8.m22753b(((fe9) tj3Var.m22128k(zf1Var)).f38956e)), xs1.f68622o, ss5.f61356d), 1.0f, xs1.f68623p, ui8.m22753b(((fe9) tj3Var.m22128k(zf1Var)).f38956e)), ((fe9) tj3Var.m22128k(zf1Var)).f38957f);
            ht5 ht5VarM19966d = qh0.m19966d(nj0.f52808c, false);
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
            oha.m18001g(tj3Var, C0352b.f4303f, ht5VarM19966d);
            oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
            oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
            oha.m18000f(tj3Var, C0352b.f4305h);
            oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
            lw9.m16554b(vz1.m23618Z(R$string.cup_signup_language_warning, new Object[]{AbstractC3352my.m17093L(context, vv1Var.f65962a)}, tj3Var), null, xs1.f68629v, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var.m22128k(ps5.f56764b)).f51800b.f71407k, tj3Var, 384, 0, 131066);
            tj3Var = tj3Var;
            tj3Var.m22139q(true);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new sv1(vv1Var, i, 0);
        }
    }
}
