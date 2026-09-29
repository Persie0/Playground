package p000;

import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.runtime.AbstractC0278f;
import androidx.compose.runtime.internal.C0282a;
import com.lingq.core.domain.model.token.TokenMeaning;

/* JADX INFO: loaded from: classes2.dex */
public abstract class i1c {

    /* JADX INFO: renamed from: a */
    public static final C0282a f43358a = new C0282a(-651211686, false, new wd1(4));

    /* JADX INFO: renamed from: a */
    public static final void m13629a(e16 e16Var, vs3 vs3Var, w65 w65Var, boolean z, vi3 vi3Var, zi3 zi3Var, vi3 vi3Var2, ye1 ye1Var, int i) {
        vi3 vi3Var3;
        String str;
        boolean z2;
        fc0 fc0Var = nj0.f52789H;
        vs3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(157255116);
        int i2 = i | (tj3Var.m22120g(e16Var) ? 4 : 2) | (tj3Var.m22124i(vs3Var) ? 32 : 16) | (tj3Var.m22124i(w65Var) ? 256 : 128) | (tj3Var.m22122h(z) ? 2048 : 1024) | (tj3Var.m22124i(vi3Var) ? 16384 : 8192) | (tj3Var.m22124i(zi3Var) ? 131072 : 65536) | (tj3Var.m22124i(vi3Var2) ? 1048576 : 524288);
        if (tj3Var.m22099R(i2 & 1, (i2 & 599187) != 599186)) {
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var = we1.f66679a;
            if (objM22097O == p84Var) {
                objM22097O = AbstractC0278f.m1260j(Boolean.FALSE);
                tj3Var.m22131l0(objM22097O);
            }
            t66 t66Var = (t66) objM22097O;
            String strMo8037d = w65Var.mo8037d();
            TokenMeaning tokenMeaning = (TokenMeaning) u91.m22591I0(w65Var.mo8034a());
            if (tokenMeaning == null || (str = tokenMeaning.f19596c) == null) {
                str = "";
            }
            String str2 = str;
            C3549ru c3549ru = eh0.f37236b;
            sj8 sj8VarM20003a = qj8.m20003a(c3549ru, fc0Var, tj3Var, 48);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16Var);
            se1.f60731q.getClass();
            ui3 ui3Var = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            zi3 zi3Var2 = C0352b.f4303f;
            oha.m18001g(tj3Var, zi3Var2, sj8VarM20003a);
            zi3 zi3Var3 = C0352b.f4302e;
            oha.m18001g(tj3Var, zi3Var3, l77VarM22132m);
            Integer numValueOf = Integer.valueOf(iHashCode);
            zi3 zi3Var4 = C0352b.f4304g;
            oha.m18001g(tj3Var, zi3Var4, numValueOf);
            vi3 vi3Var4 = C0352b.f4305h;
            oha.m18000f(tj3Var, vi3Var4);
            zi3 zi3Var5 = C0352b.f4301d;
            oha.m18001g(tj3Var, zi3Var5, e16VarM1322c);
            b16 b16Var = b16.f7762a;
            e16 e16VarM4430w = c99.m4430w(b16Var, null, 3);
            ht5 ht5VarM19966d = qh0.m19966d(nj0.f52808c, false);
            int iHashCode2 = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m2 = tj3Var.m22132m();
            e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var, e16VarM4430w);
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, zi3Var2, ht5VarM19966d);
            oha.m18001g(tj3Var, zi3Var3, l77VarM22132m2);
            AbstractC3393o1.m17747v(iHashCode2, tj3Var, zi3Var4, tj3Var, vi3Var4);
            oha.m18001g(tj3Var, zi3Var5, e16VarM1322c2);
            boolean zM22124i = tj3Var.m22124i(w65Var) | ((i2 & 57344) == 16384);
            Object objM22097O2 = tj3Var.m22097O();
            if (zM22124i || objM22097O2 == p84Var) {
                objM22097O2 = new e87(w65Var, vi3Var, t66Var, 0);
                tj3Var.m22131l0(objM22097O2);
            }
            int i3 = i2 >> 3;
            int i4 = i3 & 14;
            i4d.m13659a(i3 & 126, tj3Var, (ui3) objM22097O2, vs3Var, w65Var);
            boolean zBooleanValue = ((Boolean) t66Var.getValue()).booleanValue();
            Object objM22097O3 = tj3Var.m22097O();
            if (objM22097O3 == p84Var) {
                objM22097O3 = new dt6(7, t66Var);
                tj3Var.m22131l0(objM22097O3);
            }
            vi3 vi3Var5 = (vi3) objM22097O3;
            boolean zM22120g = ((i2 & 458752) == 131072) | tj3Var.m22120g(strMo8037d);
            Object objM22097O4 = tj3Var.m22097O();
            if (zM22120g || objM22097O4 == p84Var) {
                z2 = true;
                objM22097O4 = new sy4(zi3Var, strMo8037d, t66Var, 1);
                tj3Var.m22131l0(objM22097O4);
            } else {
                z2 = true;
            }
            o4d.m17800a(vs3Var, zBooleanValue, vi3Var5, (vi3) objM22097O4, tj3Var, i4 | 384);
            tj3Var.m22139q(z2);
            e16 e16VarM21607T = AbstractC3584sr.m21607T(b16Var, ge9.m12515a(tj3Var).f38952a);
            if (1.0f <= 0.0d) {
                g54.m12362a("invalid weight; must be greater than zero");
            }
            e16 e16VarMo3161g = e16VarM21607T.mo3161g(new as4(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true)).mo3161g(new opa(fc0Var));
            ht5 ht5VarM19966d2 = qh0.m19966d(nj0.f52811f, false);
            int iHashCode3 = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m3 = tj3Var.m22132m();
            e16 e16VarM1322c3 = AbstractC0287b.m1322c(tj3Var, e16VarMo3161g);
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, zi3Var2, ht5VarM19966d2);
            oha.m18001g(tj3Var, zi3Var3, l77VarM22132m3);
            AbstractC3393o1.m17747v(iHashCode3, tj3Var, zi3Var4, tj3Var, vi3Var4);
            oha.m18001g(tj3Var, zi3Var5, e16VarM1322c3);
            bb1 bb1VarM230a = ab1.m230a(eh0.f37238d, nj0.f52791J, tj3Var, 0);
            int iHashCode4 = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m4 = tj3Var.m22132m();
            e16 e16VarM1322c4 = AbstractC0287b.m1322c(tj3Var, b16Var);
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, zi3Var2, bb1VarM230a);
            oha.m18001g(tj3Var, zi3Var3, l77VarM22132m4);
            AbstractC3393o1.m17747v(iHashCode4, tj3Var, zi3Var4, tj3Var, vi3Var4);
            oha.m18001g(tj3Var, zi3Var5, e16VarM1322c4);
            sj8 sj8VarM20003a2 = qj8.m20003a(c3549ru, nj0.f52817l, tj3Var, 0);
            int iHashCode5 = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m5 = tj3Var.m22132m();
            e16 e16VarM1322c5 = AbstractC0287b.m1322c(tj3Var, b16Var);
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, zi3Var2, sj8VarM20003a2);
            oha.m18001g(tj3Var, zi3Var3, l77VarM22132m5);
            AbstractC3393o1.m17747v(iHashCode5, tj3Var, zi3Var4, tj3Var, vi3Var4);
            oha.m18001g(tj3Var, zi3Var5, e16VarM1322c5);
            lw9.m16554b(strMo8037d, c99.m4430w(b16Var, null, 3), p58.m18900f(tj3Var).f55873q, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var).f71406j, tj3Var, 48, 0, 131064);
            if (z) {
                tj3Var.m22111b0(-1102541658);
                boolean zM22120g2 = tj3Var.m22120g(strMo8037d) | ((i2 & 3670016) == 1048576);
                Object objM22097O5 = tj3Var.m22097O();
                if (zM22120g2 || objM22097O5 == p84Var) {
                    vi3Var3 = vi3Var2;
                    objM22097O5 = new pw1(vi3Var3, strMo8037d, 1);
                    tj3Var.m22131l0(objM22097O5);
                } else {
                    vi3Var3 = vi3Var2;
                }
                omd.m18141c((ui3) objM22097O5, c99.m4422o(AbstractC3584sr.m21611X(b16Var, ge9.m12515a(tj3Var).f38952a, 0.0f, 0.0f, 0.0f, 14).mo3161g(new opa(fc0Var)), ge9.m12515a(tj3Var).f38957f), false, null, null, bgc.f8527a, tj3Var, 1572864, 60);
                tj3Var.m22139q(false);
            } else {
                vi3Var3 = vi3Var2;
                tj3Var.m22111b0(-1101700783);
                tj3Var.m22139q(false);
            }
            tj3Var.m22139q(true);
            if (str2.length() > 0) {
                tj3Var.m22111b0(1828091993);
                lw9.m16554b(str2, AbstractC3584sr.m21611X(c99.m4430w(b16Var, null, 3), 0.0f, ge9.m12515a(tj3Var).f38955d, 0.0f, 0.0f, 13), p58.m18900f(tj3Var).f55873q, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var).f71407k, tj3Var, 0, 0, 131064);
                tj3Var.m22139q(false);
            } else {
                tj3Var.m22111b0(1828485197);
                qh0.m19963a(x74.m24341H(d32.m10007D(pb1.m19045o(c99.m4414g(c99.m4426s(b16Var, 70.0f), 10.0f), p58.m18901i(tj3Var).f64858d), p58.m18900f(tj3Var).f55817B, ss5.f61356d)), tj3Var, 0);
                tj3Var.m22139q(false);
            }
            AbstractC3393o1.m17723A(tj3Var, true, true, true);
        } else {
            vi3Var3 = vi3Var2;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new f87(e16Var, vs3Var, w65Var, z, vi3Var, zi3Var, vi3Var3, i);
        }
    }
}
