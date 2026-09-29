package p000;

import android.content.Context;
import androidx.compose.foundation.AbstractC0080f;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.p002ui.platform.AbstractC0394f;
import androidx.compose.runtime.internal.C0282a;
import com.lingq.feature.challenges.R$string;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class qu1 {

    /* JADX INFO: renamed from: a */
    public static final long f58210a = d32.m10017O(0.8d);

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int f58211b = 0;

    /* JADX INFO: renamed from: a */
    public static final void m20164a(ru1 ru1Var, List list, ui3 ui3Var, ui3 ui3Var2, vi3 vi3Var, e16 e16Var, ye1 ye1Var, int i) {
        e16 e16Var2;
        ru1Var.getClass();
        list.getClass();
        ui3Var.getClass();
        ui3Var2.getClass();
        vi3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(318525375);
        int i2 = i | (tj3Var.m22124i(ru1Var) ? 4 : 2) | (tj3Var.m22124i(list) ? 32 : 16) | (tj3Var.m22124i(ui3Var) ? 256 : 128) | (tj3Var.m22124i(ui3Var2) ? 2048 : 1024) | (tj3Var.m22124i(vi3Var) ? 16384 : 8192) | 196608;
        if (tj3Var.m22099R(i2 & 1, (74899 & i2) != 74898)) {
            e16Var2 = b16.f7762a;
            e16 e16VarM4412e = c99.m4412e(e16Var2, 1.0f);
            bb1 bb1VarM230a = ab1.m230a(new C3661uu(((fe9) tj3Var.m22128k(ge9.f40637a)).f38957f, true, new gm5(28)), nj0.f52791J, tj3Var, 0);
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
            oha.m18001g(tj3Var, C0352b.f4303f, bb1VarM230a);
            oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
            oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
            oha.m18000f(tj3Var, C0352b.f4305h);
            oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
            int i3 = i2 << 3;
            int i4 = (i3 & 112) | 6;
            db1 db1Var = db1.f35347a;
            m20174k(db1Var, ru1Var, ui3Var2, tj3Var, ((i2 >> 3) & 896) | i4);
            m20175l(db1Var, ru1Var, list, ui3Var, ui3Var2, vi3Var, tj3Var, (i3 & 896) | i4 | (i3 & 7168) | (57344 & i3) | (i3 & 458752));
            tj3Var.m22139q(true);
        } else {
            tj3Var.m22102U();
            e16Var2 = e16Var;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zs0(ru1Var, list, ui3Var, ui3Var2, vi3Var, e16Var2, i);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m20165b(ru1 ru1Var, ye1 ye1Var, int i) {
        int i2;
        Integer num;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(586250893);
        if ((i & 6) == 0) {
            i2 = (tj3Var.m22124i(ru1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (tj3Var.m22099R(i2 & 1, (i2 & 3) != 2)) {
            String strM17093L = AbstractC3352my.m17093L((Context) tj3Var.m22128k(AbstractC0394f.f4761b), ru1Var.f59814c);
            int i3 = ru1Var.f59821j;
            if (i3 == 2) {
                num = 50;
            } else if (i3 == 3) {
                num = 20;
            } else if (i3 != 4) {
                num = i3 != 5 ? null : 5;
            } else {
                num = 10;
            }
            m20167d(ci8.m4703P(1562589895, new ik0(ru1Var, num, strM17093L, 12), tj3Var), tj3Var, 6);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new ou1(ru1Var, i, 2);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m20166c(ye1 ye1Var, int i) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(673108376);
        if (tj3Var.m22099R(i & 1, i != 0)) {
            m20167d(gpb.f41167a, tj3Var, 6);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new je1(i, 16);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m20167d(C0282a c0282a, ye1 ye1Var, int i) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(939311939);
        int i2 = 2;
        if (tj3Var.m22099R(i & 1, (i & 3) != 2)) {
            zf1 zf1Var = ge9.f40637a;
            e16 e16VarM21607T = AbstractC3584sr.m21607T(d32.m10006C(pb1.m19045o(c99.m4412e(b16.f7762a, 1.0f), ui8.m22753b(((fe9) tj3Var.m22128k(zf1Var)).f38958g)), ui0.m22749e(vi0.Companion, vz1.m23605K(new aa1(xs1.f68615h), new aa1(xs1.f68614g)), 0.0f, 0.0f, 14)), ((fe9) tj3Var.m22128k(zf1Var)).f38958g);
            bb1 bb1VarM230a = ab1.m230a(new C3661uu(((fe9) tj3Var.m22128k(zf1Var)).f38956e, true, new gm5(28)), nj0.f52792K, tj3Var, 48);
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
            oha.m18001g(tj3Var, C0352b.f4303f, bb1VarM230a);
            oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
            oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
            oha.m18000f(tj3Var, C0352b.f4305h);
            oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
            c0282a.invoke(db1.f35347a, tj3Var, 54);
            tj3Var.m22139q(true);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new ry3(c0282a, i, i2);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m20168e(String str, Integer num, Integer num2, e16 e16Var, ye1 ye1Var, int i) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-548235105);
        int i2 = (tj3Var.m22120g(str) ? 4 : 2) | i | (tj3Var.m22120g(num) ? 32 : 16) | (tj3Var.m22120g(num2) ? 256 : 128) | (tj3Var.m22120g(e16Var) ? 2048 : 1024);
        if (tj3Var.m22099R(i2 & 1, (i2 & 1171) != 1170)) {
            r9d.m20479a(e16Var, ci8.m4703P(-1081473011, new ik0(str, num, num2, 11), tj3Var), tj3Var, ((i2 >> 9) & 14) | 48, 0);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C2919d9(str, num, num2, e16Var, i, 6);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m20169f(ru1 ru1Var, ye1 ye1Var, int i) {
        int i2;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(386020305);
        if ((i & 6) == 0) {
            i2 = (tj3Var.m22124i(ru1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (tj3Var.m22099R(i2 & 1, (i2 & 3) != 2)) {
            String strM17093L = AbstractC3352my.m17093L((Context) tj3Var.m22128k(AbstractC0394f.f4761b), ru1Var.f59814c);
            sj8 sj8VarM20003a = qj8.m20003a(new C3661uu(((fe9) tj3Var.m22128k(ge9.f40637a)).f38952a, true, new gm5(28)), nj0.f52817l, tj3Var, 0);
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
            oha.m18001g(tj3Var, C0352b.f4303f, sj8VarM20003a);
            oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
            oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
            oha.m18000f(tj3Var, C0352b.f4305h);
            oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
            if (1.0f <= 0.0d) {
                g54.m12362a("invalid weight; must be greater than zero");
            }
            m20168e(vz1.m23618Z(R$string.cup_results_team_rank_label, new Object[]{strM17093L}, tj3Var), ru1Var.f59817f, ru1Var.f59818g, new as4(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), tj3Var, 0);
            if (1.0f <= 0.0d) {
                g54.m12362a("invalid weight; must be greater than zero");
            }
            m20168e(vz1.m23620a0(tj3Var, R$string.cup_results_global_rank_label), ru1Var.f59819h, ru1Var.f59820i, new as4(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), tj3Var, 0);
            tj3Var.m22139q(true);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new ou1(ru1Var, i, 1);
        }
    }

    /* JADX INFO: renamed from: g */
    public static final void m20170g(String str, long j, String str2, String str3, ye1 ye1Var, int i) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1434747511);
        int i2 = i | (tj3Var.m22120g(str2) ? 256 : 128) | (tj3Var.m22120g(str3) ? 2048 : 1024);
        if (tj3Var.m22099R(i2 & 1, (i2 & 1171) != 1170)) {
            b16 b16Var = b16.f7762a;
            e16 e16VarM21608U = AbstractC3584sr.m21608U(c99.m4412e(b16Var, 1.0f), ge9.m12515a(tj3Var).f38958g, ge9.m12515a(tj3Var).f38956e);
            sj8 sj8VarM20003a = qj8.m20003a(new C3661uu(ge9.m12515a(tj3Var).f38956e, true, new gm5(28)), nj0.f52789H, tj3Var, 48);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM21608U);
            se1.f60731q.getClass();
            ui3 ui3Var = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
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
            vi3 vi3Var = C0352b.f4305h;
            oha.m18000f(tj3Var, vi3Var);
            zi3 zi3Var4 = C0352b.f4301d;
            oha.m18001g(tj3Var, zi3Var4, e16VarM1322c);
            e16 e16VarM19045o = pb1.m19045o(c99.m4422o(b16Var, 40.0f), ui8.f63972a);
            mv3 mv3Var = ss5.f61356d;
            e16 e16VarM10007D = d32.m10007D(e16VarM19045o, j, mv3Var);
            ht5 ht5VarM19966d = qh0.m19966d(nj0.f52812g, false);
            int iHashCode2 = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m2 = tj3Var.m22132m();
            e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var, e16VarM10007D);
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, zi3Var, ht5VarM19966d);
            oha.m18001g(tj3Var, zi3Var2, l77VarM22132m2);
            AbstractC3393o1.m17747v(iHashCode2, tj3Var, zi3Var3, tj3Var, vi3Var);
            oha.m18001g(tj3Var, zi3Var4, e16VarM1322c2);
            lw9.m16554b(str, null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var, 6, 0, 262142);
            tj3Var.m22139q(true);
            lw9.m16554b(str2, new as4(1.0f, true), p58.m18900f(tj3Var).f55873q, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var).f71406j, tj3Var, (i2 >> 6) & 14, 0, 131064);
            e16 e16VarM21608U2 = AbstractC3584sr.m21608U(d32.m10007D(pb1.m19045o(b16Var, ui8.m22753b(ge9.m12515a(tj3Var).f38952a)), xs1.f68624q, mv3Var), ge9.m12515a(tj3Var).f38956e, ge9.m12515a(tj3Var).f38955d);
            ht5 ht5VarM19966d2 = qh0.m19966d(nj0.f52808c, false);
            int iHashCode3 = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m3 = tj3Var.m22132m();
            e16 e16VarM1322c3 = AbstractC0287b.m1322c(tj3Var, e16VarM21608U2);
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, zi3Var, ht5VarM19966d2);
            oha.m18001g(tj3Var, zi3Var2, l77VarM22132m3);
            AbstractC3393o1.m17747v(iHashCode3, tj3Var, zi3Var3, tj3Var, vi3Var);
            oha.m18001g(tj3Var, zi3Var4, e16VarM1322c3);
            lw9.m16554b(str3, null, xs1.f68625r, null, 0L, null, bc3.f8324j, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var).f71404h, tj3Var, ((i2 >> 9) & 14) | 1573248, 0, 131002);
            tj3Var = tj3Var;
            tj3Var.m22139q(true);
            tj3Var.m22139q(true);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new ds0(str, j, str2, str3, i);
        }
    }

    /* JADX INFO: renamed from: h */
    public static final void m20171h(ru1 ru1Var, ye1 ye1Var, int i) {
        int i2;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1693666935);
        if ((i & 6) == 0) {
            i2 = (tj3Var.m22124i(ru1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (tj3Var.m22099R(i2 & 1, (i2 & 3) != 2)) {
            r9d.m20479a(null, ci8.m4703P(1976017371, new se0(ru1Var, 10), tj3Var), tj3Var, 48, 1);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new ou1(ru1Var, i, 0);
        }
    }

    /* JADX INFO: renamed from: i */
    public static final void m20172i(ru1 ru1Var, ui3 ui3Var, ye1 ye1Var, int i) {
        int i2;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-2099071223);
        if ((i & 6) == 0) {
            i2 = (tj3Var.m22124i(ru1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= tj3Var.m22124i(ui3Var) ? 32 : 16;
        }
        if (tj3Var.m22099R(i2 & 1, (i2 & 19) != 18)) {
            r9d.m20479a(AbstractC0080f.m815b(null, false, ui3Var, b16.f7762a, 15), ci8.m4703P(855376631, new C3180kd(12, ru1Var, AbstractC3352my.m17093L((Context) tj3Var.m22128k(AbstractC0394f.f4761b), ru1Var.f59814c)), tj3Var), tj3Var, 48, 0);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new pu1(ru1Var, ui3Var, i, 1);
        }
    }

    /* JADX INFO: renamed from: j */
    public static final void m20173j(ru1 ru1Var, ui3 ui3Var, ye1 ye1Var, int i) {
        int i2;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1687084280);
        if ((i & 6) == 0) {
            i2 = (tj3Var.m22124i(ru1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= tj3Var.m22124i(ui3Var) ? 32 : 16;
        }
        if (tj3Var.m22099R(i2 & 1, (i2 & 19) != 18)) {
            r9d.m20479a(null, ci8.m4703P(878305866, new C3180kd(ui3Var, ru1Var), tj3Var), tj3Var, 48, 1);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new pu1(ru1Var, ui3Var, i, 0);
        }
    }

    /* JADX INFO: renamed from: k */
    public static final void m20174k(db1 db1Var, ru1 ru1Var, ui3 ui3Var, ye1 ye1Var, int i) {
        int i2;
        db1Var.getClass();
        ru1Var.getClass();
        ui3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1772953637);
        if ((i & 48) == 0) {
            i2 = (tj3Var.m22124i(ru1Var) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            i2 |= tj3Var.m22124i(ui3Var) ? 256 : 128;
        }
        if (tj3Var.m22099R(i2 & 1, (i2 & 145) != 144)) {
            if (ru1Var.f59823l) {
                tj3Var.m22111b0(1446130405);
                w9d.m23821b(ru1Var.f59814c, ru1Var.f59815d, ru1Var.f59816e, ui3Var, null, tj3Var, (i2 << 3) & 7168);
                tj3Var.m22139q(false);
            } else {
                tj3Var.m22111b0(1446511240);
                int i3 = i2 >> 3;
                m20171h(ru1Var, tj3Var, i3 & 14);
                if (ru1Var.f59815d != null) {
                    tj3Var.m22111b0(1293589961);
                    m20172i(ru1Var, ui3Var, tj3Var, i3 & 126);
                } else {
                    tj3Var.m22111b0(1446627335);
                }
                tj3Var.m22139q(false);
                tj3Var.m22139q(false);
            }
            m20169f(ru1Var, tj3Var, (i2 >> 3) & 14);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C2956e9(i, 14, db1Var, ru1Var, ui3Var);
        }
    }

    /* JADX INFO: renamed from: l */
    public static final void m20175l(db1 db1Var, ru1 ru1Var, List list, ui3 ui3Var, ui3 ui3Var2, vi3 vi3Var, ye1 ye1Var, int i) {
        int i2;
        vi3 vi3Var2;
        db1Var.getClass();
        ru1Var.getClass();
        boolean z = ru1Var.f59823l;
        list.getClass();
        ui3Var.getClass();
        ui3Var2.getClass();
        vi3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-634425514);
        if ((i & 48) == 0) {
            i2 = (tj3Var.m22124i(ru1Var) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            i2 |= tj3Var.m22124i(list) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= tj3Var.m22124i(ui3Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= tj3Var.m22124i(ui3Var2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            vi3Var2 = vi3Var;
            i2 |= tj3Var.m22124i(vi3Var2) ? 131072 : 65536;
        } else {
            vi3Var2 = vi3Var;
        }
        int i3 = i2;
        if (tj3Var.m22099R(i3 & 1, (74897 & i3) != 74896)) {
            if (z || ru1Var.f59821j < 1) {
                tj3Var.m22111b0(1980853932);
            } else {
                tj3Var.m22111b0(202445164);
                m20165b(ru1Var, tj3Var, (i3 >> 3) & 14);
            }
            tj3Var.m22139q(false);
            if (z || !ru1Var.f59822k) {
                tj3Var.m22111b0(1980924364);
            } else {
                tj3Var.m22111b0(202447498);
                m20166c(tj3Var, 0);
            }
            tj3Var.m22139q(false);
            if (list.isEmpty()) {
                tj3Var.m22111b0(1981137644);
                tj3Var.m22139q(false);
            } else {
                tj3Var.m22111b0(1981037700);
                int i4 = i3 >> 9;
                w9d.m23820a(list, ui3Var2, vi3Var2, null, tj3Var, ((i3 >> 6) & 14) | (i4 & 112) | (i4 & 896));
                tj3Var.m22139q(false);
            }
            if (ru1Var.f59824m.isEmpty()) {
                tj3Var.m22111b0(1981302316);
            } else {
                tj3Var.m22111b0(202458977);
                m20173j(ru1Var, ui3Var, tj3Var, ((i3 >> 3) & 14) | ((i3 >> 6) & 112));
            }
            tj3Var.m22139q(false);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new nu1(db1Var, ru1Var, list, ui3Var, ui3Var2, vi3Var, i);
        }
    }
}
