package p000;

import android.content.Context;
import android.graphics.ColorMatrixColorFilter;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.p002ui.platform.AbstractC0394f;
import androidx.lifecycle.compose.AbstractC0711a;
import com.lingq.feature.challenges.R$string;
import com.lingq.feature.challenges.cup.C1974a;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public abstract class us1 {

    /* JADX INFO: renamed from: a */
    public static final ka1 f64281a;

    static {
        float[] fArr = {1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f};
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        fArr[5] = 0.0f;
        fArr[6] = 1.0f;
        fArr[7] = 0.0f;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 0.0f;
        fArr[11] = 0.0f;
        fArr[12] = 1.0f;
        fArr[13] = 0.0f;
        fArr[14] = 0.0f;
        fArr[15] = 0.0f;
        fArr[16] = 0.0f;
        fArr[17] = 0.0f;
        fArr[18] = 1.0f;
        fArr[19] = 0.0f;
        fArr[0] = 0.213f;
        fArr[1] = 0.715f;
        fArr[2] = 0.072f;
        fArr[5] = 0.213f;
        fArr[6] = 0.715f;
        fArr[7] = 0.072f;
        fArr[10] = 0.213f;
        fArr[11] = 0.715f;
        fArr[12] = 0.072f;
        ka1 ka1Var = new ka1(new ColorMatrixColorFilter(fArr));
        ka1Var.f46931b = fArr;
        f64281a = ka1Var;
    }

    /* JADX INFO: renamed from: a */
    public static final void m22888a(int i, ye1 ye1Var, e16 e16Var, String str) {
        int i2;
        e16 e16Var2;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1648865077);
        int i3 = i | (tj3Var.m22120g(str) ? 4 : 2) | 48;
        if (tj3Var.m22099R(i3 & 1, (i3 & 19) != 18)) {
            Context context = (Context) tj3Var.m22128k(AbstractC0394f.f4761b);
            b16 b16Var = b16.f7762a;
            e16 e16VarM21607T = AbstractC3584sr.m21607T(r46.m20387m(d32.m10007D(pb1.m19045o(c99.m4412e(b16Var, 1.0f), ui8.m22753b(20.0f)), p58.m18900f(tj3Var).f55872p, ss5.f61356d), 1.0f, p58.m18900f(tj3Var).f55817B, ui8.m22753b(20.0f)), ge9.m12515a(tj3Var).f38958g);
            bb1 bb1VarM230a = ab1.m230a(new C3661uu(ge9.m12515a(tj3Var).f38955d, true, new gm5(28)), nj0.f52791J, tj3Var, 0);
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
            i2 = 1;
            lw9.m16554b(vz1.m23620a0(tj3Var, R$string.cup_active_day_bonus_title), null, p58.m18900f(tj3Var).f55873q, null, 0L, null, bc3.f8323i, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var).f71404h, tj3Var, 1572864, 0, 131002);
            lw9.m16554b(vz1.m23618Z(R$string.cup_active_day_bonus_blurb, new Object[]{AbstractC3352my.m17093L(context, str == null ? "" : str)}, tj3Var), null, p58.m18900f(tj3Var).f55875s, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var).f71406j, tj3Var, 0, 0, 131066);
            tj3Var = tj3Var;
            tj3Var.m22139q(true);
            e16Var2 = b16Var;
        } else {
            i2 = 1;
            tj3Var.m22102U();
            e16Var2 = e16Var;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new gs0(str, e16Var2, i, i2);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m22889b(qs1 qs1Var, e16 e16Var, ye1 ye1Var, int i) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1018548705);
        int i2 = (tj3Var.m22120g(qs1Var) ? 4 : 2) | i | (tj3Var.m22120g(e16Var) ? 32 : 16);
        if (tj3Var.m22099R(i2 & 1, (i2 & 19) != 18)) {
            r46.m20381f(AbstractC3584sr.m21607T(c99.m4412e(e16Var, 1.0f), ((fe9) tj3Var.m22128k(ge9.f40637a)).f38955d), null, null, null, ci8.m4703P(-1583073993, new se0(qs1Var, 7), tj3Var), tj3Var, 24576, 14);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3598t4(qs1Var, e16Var, i, 22);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m22890c(int i, ye1 ye1Var, e16 e16Var, List list) {
        e16 e16Var2;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1193773970);
        int i2 = (tj3Var.m22124i(list) ? 4 : 2) | i | 48;
        if (tj3Var.m22099R(i2 & 1, (i2 & 19) != 18)) {
            e16Var2 = b16.f7762a;
            e16 e16VarM4412e = c99.m4412e(e16Var2, 1.0f);
            int i3 = 28;
            bb1 bb1VarM230a = ab1.m230a(new C3661uu(((fe9) tj3Var.m22128k(ge9.f40637a)).f38952a, true, new gm5(28)), nj0.f52791J, tj3Var, 0);
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
            oha.m18001g(tj3Var, C0352b.f4303f, bb1VarM230a);
            oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
            oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
            oha.m18000f(tj3Var, C0352b.f4305h);
            oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
            tj3Var.m22111b0(1416957163);
            for (List<qs1> list2 : u91.m22632y0(list, 2)) {
                sj8 sj8VarM20003a = qj8.m20003a(new C3661uu(((fe9) tj3Var.m22128k(ge9.f40637a)).f38952a, true, new gm5(i3)), nj0.f52817l, tj3Var, 0);
                int iHashCode2 = Long.hashCode(tj3Var.f62385T);
                l77 l77VarM22132m2 = tj3Var.m22132m();
                e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var, e16Var2);
                se1.f60731q.getClass();
                ui3 ui3Var2 = C0352b.f4299b;
                tj3Var.m22119f0();
                if (tj3Var.f62384S) {
                    tj3Var.m22130l(ui3Var2);
                } else {
                    tj3Var.m22137o0();
                }
                oha.m18001g(tj3Var, C0352b.f4303f, sj8VarM20003a);
                oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m2);
                oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode2));
                oha.m18000f(tj3Var, C0352b.f4305h);
                oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c2);
                tj3Var.m22111b0(-1953719534);
                for (qs1 qs1Var : list2) {
                    if (1.0f <= 0.0d) {
                        g54.m12362a("invalid weight; must be greater than zero");
                    }
                    m22889b(qs1Var, new as4(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), tj3Var, 0);
                }
                tj3Var.m22139q(false);
                if (list2.size() == 1) {
                    tj3Var.m22111b0(-1953714684);
                    if (1.0f <= 0.0d) {
                        g54.m12362a("invalid weight; must be greater than zero");
                    }
                    qh0.m19963a(new as4(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), tj3Var, 0);
                } else {
                    tj3Var.m22111b0(-435579423);
                }
                tj3Var.m22139q(false);
                tj3Var.m22139q(true);
                i3 = 28;
            }
            tj3Var.m22139q(false);
            tj3Var.m22139q(true);
        } else {
            tj3Var.m22102U();
            e16Var2 = e16Var;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new fq0(list, e16Var2, i, 1);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m22891d(qs1 qs1Var, ye1 ye1Var, int i) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(2092115997);
        int i2 = (tj3Var.m22120g(qs1Var) ? 4 : 2) | i;
        if (tj3Var.m22099R(i2 & 1, (i2 & 3) != 2)) {
            y27 y27VarM18236U = AbstractC3423or.m18236U(qs1Var.f58123d, tj3Var, 0);
            String str = qs1Var.f58120a;
            e16 e16VarM4422o = c99.m4422o(b16.f7762a, 124.0f);
            boolean z = qs1Var.f58122c;
            bq1.m4042R(y27VarM18236U, str, e16VarM4422o, null, null, z ? 1.0f : 0.6f, z ? null : f64281a, tj3Var, 392, 24);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3368nd(qs1Var, i, 15);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m22892e(String str, String str2, e16 e16Var, ye1 ye1Var, int i) {
        tj3 tj3Var;
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(347827694);
        int i2 = i | (tj3Var2.m22120g(str) ? 4 : 2) | (tj3Var2.m22120g(str2) ? 32 : 16) | (tj3Var2.m22120g(e16Var) ? 256 : 128);
        if (tj3Var2.m22099R(i2 & 1, (i2 & 147) != 146)) {
            e16 e16VarM21607T = AbstractC3584sr.m21607T(c99.m4410c(e16Var, 1.0f), ge9.m12515a(tj3Var2).f38958g);
            bb1 bb1VarM230a = ab1.m230a(new C3661uu(ge9.m12515a(tj3Var2).f38955d, true, new gm5(28)), nj0.f52791J, tj3Var2, 0);
            int iHashCode = Long.hashCode(tj3Var2.f62385T);
            l77 l77VarM22132m = tj3Var2.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var2, e16VarM21607T);
            se1.f60731q.getClass();
            ui3 ui3Var = C0352b.f4299b;
            tj3Var2.m22119f0();
            if (tj3Var2.f62384S) {
                tj3Var2.m22130l(ui3Var);
            } else {
                tj3Var2.m22137o0();
            }
            oha.m18001g(tj3Var2, C0352b.f4303f, bb1VarM230a);
            oha.m18001g(tj3Var2, C0352b.f4302e, l77VarM22132m);
            oha.m18001g(tj3Var2, C0352b.f4304g, Integer.valueOf(iHashCode));
            oha.m18000f(tj3Var2, C0352b.f4305h);
            oha.m18001g(tj3Var2, C0352b.f4301d, e16VarM1322c);
            String upperCase = str.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            lw9.m16554b(upperCase, null, p58.m18900f(tj3Var2).f55875s, null, 0L, null, null, d32.m10017O(0.8d), null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var2).f71411o, tj3Var2, 100663296, 0, 130810);
            lw9.m16554b(str2, null, p58.m18900f(tj3Var2).f55873q, null, 0L, null, bc3.f8326l, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var2).f71402f, tj3Var2, ((i2 >> 3) & 14) | 1572864, 0, 131002);
            tj3Var = tj3Var2;
            tj3Var.m22139q(true);
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new ts1(str, str2, e16Var, i, 0);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m22893f(int i, int i2, e16 e16Var, ye1 ye1Var, int i3) {
        e16 e16Var2;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1509936711);
        int i4 = (tj3Var.m22116e(i) ? 4 : 2) | i3 | (tj3Var.m22116e(i2) ? 32 : 16) | 384;
        if (tj3Var.m22099R(i4 & 1, (i4 & 147) != 146)) {
            si8 si8VarM22753b = ui8.m22753b(20.0f);
            e16Var2 = b16.f7762a;
            e16 e16VarM19045o = pb1.m19045o(c99.m4412e(e16Var2, 1.0f), si8VarM22753b);
            vh9 vh9Var = ps5.f56764b;
            e16 e16VarM18285y = AbstractC3423or.m18285y(r46.m20387m(d32.m10007D(e16VarM19045o, ((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55872p, ss5.f61356d), 1.0f, ((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55817B, si8VarM22753b), IntrinsicSize.Min);
            sj8 sj8VarM20003a = qj8.m20003a(eh0.f37236b, nj0.f52817l, tj3Var, 0);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM18285y);
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
            m22892e(vz1.m23620a0(tj3Var, R$string.cup_stat_contribution), String.format("%,d", Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1)), new as4(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), tj3Var, 0);
            pb1.m19037g(0.0f, 0, 3, ((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55817B, tj3Var, null);
            if (1.0f <= 0.0d) {
                g54.m12362a("invalid weight; must be greater than zero");
            }
            m22892e(vz1.m23620a0(tj3Var, R$string.cup_stat_days_active), String.valueOf(i2), new as4(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), tj3Var, 0);
            tj3Var.m22139q(true);
        } else {
            tj3Var.m22102U();
            e16Var2 = e16Var;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3783y4(i, i2, i3, e16Var2);
        }
    }

    /* JADX INFO: renamed from: g */
    public static final void m22894g(vs1 vs1Var, ye1 ye1Var, int i) {
        String strM23618Z;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1954399930);
        int i2 = i | (tj3Var.m22124i(vs1Var) ? 4 : 2);
        if (tj3Var.m22099R(i2 & 1, (i2 & 3) != 2)) {
            b16 b16Var = b16.f7762a;
            e16 e16VarM4412e = c99.m4412e(b16Var, 1.0f);
            bb1 bb1VarM230a = ab1.m230a(new C3661uu(ge9.m12515a(tj3Var).f38957f, true, new gm5(28)), nj0.f52792K, tj3Var, 48);
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
            oha.m18001g(tj3Var, C0352b.f4303f, bb1VarM230a);
            oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
            oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
            oha.m18000f(tj3Var, C0352b.f4305h);
            oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
            tj3Var.m22111b0(-1813531724);
            C3341mn c3341mn = new C3341mn();
            c3341mn.m16929d(vz1.m23620a0(tj3Var, R$string.cup_cup_progress));
            c3341mn.m16929d(" ");
            tj3Var.m22111b0(-1813527615);
            int iM16932g = c3341mn.m16932g(new he9(xs1.f68608a, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534));
            try {
                int i3 = R$string.cup_cup_level;
                int i4 = vs1Var.f65834b;
                int i5 = vs1Var.f65837e;
                int i6 = vs1Var.f65836d;
                c3341mn.m16929d(vz1.m23618Z(i3, new Object[]{Integer.valueOf(i4)}, tj3Var));
                c3341mn.m16931f(iM16932g);
                tj3Var.m22139q(false);
                C3419on c3419onM16933h = c3341mn.m16933h();
                tj3Var.m22139q(false);
                lw9.m16555c(c3419onM16933h, null, p58.m18900f(tj3Var).f55873q, null, 0L, null, bc3.f8324j, 0L, new ks9(3), 0L, 0, false, 0, 0, null, null, p58.m18902j(tj3Var).f71399c, tj3Var, 1572864, 0, 261050);
                Integer num = vs1Var.f65838f;
                if (num == null) {
                    tj3Var.m22111b0(-384361321);
                    tj3Var.m22139q(false);
                    strM23618Z = null;
                } else {
                    tj3Var.m22111b0(-384361320);
                    strM23618Z = vz1.m23618Z(R$string.cup_progress_next_tier, new Object[]{Integer.valueOf(i6), Integer.valueOf(i5), Integer.valueOf(num.intValue())}, tj3Var);
                    tj3Var.m22139q(false);
                }
                if (strM23618Z == null) {
                    tj3Var.m22111b0(-1813510083);
                    strM23618Z = vz1.m23618Z(R$string.cup_progress_days, new Object[]{Integer.valueOf(i6), Integer.valueOf(i5)}, tj3Var);
                } else {
                    tj3Var.m22111b0(-1813514640);
                }
                tj3Var.m22139q(false);
                lw9.m16554b(strM23618Z, null, p58.m18900f(tj3Var).f55875s, null, 0L, null, null, 0L, null, new ks9(3), 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var).f71406j, tj3Var, 0, 0, 130042);
                tj3Var = tj3Var;
                boolean zM22124i = tj3Var.m22124i(vs1Var);
                Object objM22097O = tj3Var.m22097O();
                if (zM22124i || objM22097O == we1.f66679a) {
                    objM22097O = new C3539rk(vs1Var, 11);
                    tj3Var.m22131l0(objM22097O);
                }
                dn7.m10494c((ui3) objM22097O, c99.m4412e(b16Var, 1.0f), cx2.m9917a(tj3Var).m4212e(), p58.m18900f(tj3Var).f55823H, 0, 0.0f, null, tj3Var, 48, 112);
                tj3Var.m22139q(true);
            } catch (Throwable th) {
                c3341mn.m16931f(iM16932g);
                throw th;
            }
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3368nd(vs1Var, i, 16);
        }
    }

    /* JADX INFO: renamed from: h */
    public static final void m22895h(C1974a c1974a, vi3 vi3Var, ye1 ye1Var, int i) {
        vi3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1143641276);
        int i2 = i | 2 | (tj3Var.m22124i(vi3Var) ? 32 : 16);
        if (tj3Var.m22099R(i2 & 1, (i2 & 19) != 18)) {
            tj3Var.m22104W();
            if ((i & 1) == 0 || tj3Var.m22084B()) {
                dua duaVarM21396a = si5.m21396a(tj3Var);
                if (duaVarM21396a == null) {
                    C3386nv.m17633t("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
                c1974a = (C1974a) pfa.m19114d(y38.m24933a(C1974a.class), duaVarM21396a, null, AbstractC3584sr.m21591B(duaVarM21396a, tj3Var), duaVarM21396a instanceof gr3 ? ((gr3) duaVarM21396a).mo2103e() : or1.f54780b, tj3Var);
            } else {
                tj3Var.m22102U();
            }
            int i3 = i2 & (-15);
            tj3Var.m22140r();
            m22896i((vs1) AbstractC0711a.m2513c(c1974a.f24680c, tj3Var).getValue(), vi3Var, tj3Var, i3 & 112);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3598t4(c1974a, i, 21, vi3Var);
        }
    }

    /* JADX INFO: renamed from: i */
    public static final void m22896i(vs1 vs1Var, vi3 vi3Var, ye1 ye1Var, int i) {
        int i2;
        vs1Var.getClass();
        vi3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1898407494);
        if ((i & 6) == 0) {
            i2 = (tj3Var.m22124i(vs1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= tj3Var.m22124i(vi3Var) ? 32 : 16;
        }
        if (tj3Var.m22099R(i2 & 1, (i2 & 19) != 18)) {
            b34.m3232b(null, ci8.m4703P(-1075191806, new dq0(vi3Var, 15), tj3Var), null, null, null, 0, 0L, 0L, null, ci8.m4703P(-1883228393, new se0(vs1Var, 8), tj3Var), tj3Var, 805306416, 509);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3709w4(vs1Var, i, 7, vi3Var);
        }
    }
}
