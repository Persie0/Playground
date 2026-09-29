package p000;

import android.content.Context;
import androidx.compose.foundation.lazy.C0127b;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.p002ui.platform.AbstractC0394f;
import com.lingq.core.achievements.R$string;
import com.lingq.core.domain.model.milestones.DailyGoalMet;
import com.lingq.core.p012ui.R$drawable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class r0d {
    /* JADX INFO: renamed from: a */
    public static final void m20231a(e16 e16Var, AbstractC2952e5 abstractC2952e5, ye1 ye1Var, int i) {
        abstractC2952e5.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1541579433);
        int i2 = (tj3Var.m22120g(e16Var) ? 4 : 2) | i | (tj3Var.m22120g(abstractC2952e5) ? 32 : 16);
        if (!tj3Var.m22099R(i2 & 1, (i2 & 19) != 18)) {
            tj3Var.m22102U();
        } else if (abstractC2952e5 instanceof C0007a5) {
            tj3Var.m22111b0(892586714);
            m20232b(e16Var, ((C0007a5) abstractC2952e5).f246a, tj3Var, i2 & 14);
            tj3Var.m22139q(false);
        } else if (abstractC2952e5 instanceof C2915d5) {
            tj3Var.m22111b0(892717751);
            m20236f(((C2915d5) abstractC2952e5).f35000a, i2 & 14, tj3Var, e16Var);
            tj3Var.m22139q(false);
        } else if (abstractC2952e5 instanceof C0798b5) {
            tj3Var.m22111b0(893110459);
            C0798b5 c0798b5 = (C0798b5) abstractC2952e5;
            m20233c(c0798b5.f7943a, i2 & 14, tj3Var, e16Var, c0798b5.f7944b);
            tj3Var.m22139q(false);
        } else {
            if (!(abstractC2952e5 instanceof C0835c5)) {
                throw ux5.m23001x(tj3Var, 305886467, false);
            }
            tj3Var.m22111b0(893270295);
            m20234d(e16Var, ((C0835c5) abstractC2952e5).f9500a, tj3Var, i2 & 14);
            tj3Var.m22139q(false);
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3598t4(e16Var, i, 0, abstractC2952e5);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m20232b(e16 e16Var, final DailyGoalMet dailyGoalMet, ye1 ye1Var, int i) {
        int i2;
        e16 e16Var2;
        tj3 tj3Var;
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(605550838);
        if ((i & 6) == 0) {
            i2 = (tj3Var2.m22120g(e16Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= tj3Var2.m22124i(dailyGoalMet) ? 32 : 16;
        }
        if (tj3Var2.m22099R(i2 & 1, (i2 & 19) != 18)) {
            final boolean z = dailyGoalMet.f19518e;
            vh9 vh9Var = cx2.f34676a;
            long jM198b = aa1.m198b(0.1f, ((bx2) tj3Var2.m22128k(vh9Var)).m4218k());
            final long jM4218k = ((bx2) tj3Var2.m22128k(vh9Var)).m4218k();
            e16Var2 = e16Var;
            r46.m20381f(e16Var2, null, null, te1.m21999m(0, 14, jM198b, 0L, tj3Var2), ci8.m4703P(-782905140, new aj3() { // from class: z4
                @Override // p000.aj3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    boolean z2;
                    String strM23620a0;
                    boolean z3;
                    String strM23620a1;
                    ye1 ye1Var2 = (ye1) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((db1) obj).getClass();
                    tj3 tj3Var3 = (tj3) ye1Var2;
                    if (tj3Var3.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
                        b16 b16Var = b16.f7762a;
                        e16 e16VarM21607T = AbstractC3584sr.m21607T(c99.m4412e(b16Var, 1.0f), ge9.m12515a(tj3Var3).f38956e);
                        fc0 fc0Var = nj0.f52789H;
                        sj8 sj8VarM20003a = qj8.m20003a(eh0.f37236b, fc0Var, tj3Var3, 48);
                        int iHashCode = Long.hashCode(tj3Var3.f62385T);
                        l77 l77VarM22132m = tj3Var3.m22132m();
                        e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var3, e16VarM21607T);
                        se1.f60731q.getClass();
                        ui3 ui3Var = C0352b.f4299b;
                        tj3Var3.m22119f0();
                        if (tj3Var3.f62384S) {
                            tj3Var3.m22130l(ui3Var);
                        } else {
                            tj3Var3.m22137o0();
                        }
                        zi3 zi3Var = C0352b.f4303f;
                        oha.m18001g(tj3Var3, zi3Var, sj8VarM20003a);
                        zi3 zi3Var2 = C0352b.f4302e;
                        oha.m18001g(tj3Var3, zi3Var2, l77VarM22132m);
                        Integer numValueOf = Integer.valueOf(iHashCode);
                        zi3 zi3Var3 = C0352b.f4304g;
                        oha.m18001g(tj3Var3, zi3Var3, numValueOf);
                        vi3 vi3Var = C0352b.f4305h;
                        oha.m18000f(tj3Var3, vi3Var);
                        zi3 zi3Var4 = C0352b.f4301d;
                        oha.m18001g(tj3Var3, zi3Var4, e16VarM1322c);
                        e16 e16VarM10007D = d32.m10007D(pb1.m19045o(c99.m4422o(b16Var, 56.0f), p58.m18901i(tj3Var3).f64857c), jM4218k, ss5.f61356d);
                        ht5 ht5VarM19966d = qh0.m19966d(nj0.f52812g, false);
                        int iHashCode2 = Long.hashCode(tj3Var3.f62385T);
                        l77 l77VarM22132m2 = tj3Var3.m22132m();
                        e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var3, e16VarM10007D);
                        tj3Var3.m22119f0();
                        if (tj3Var3.f62384S) {
                            tj3Var3.m22130l(ui3Var);
                        } else {
                            tj3Var3.m22137o0();
                        }
                        oha.m18001g(tj3Var3, zi3Var, ht5VarM19966d);
                        oha.m18001g(tj3Var3, zi3Var2, l77VarM22132m2);
                        AbstractC3393o1.m17747v(iHashCode2, tj3Var3, zi3Var3, tj3Var3, vi3Var);
                        oha.m18001g(tj3Var3, zi3Var4, e16VarM1322c2);
                        ge9.m12515a(tj3Var3).getClass();
                        e16 e16VarM4422o = c99.m4422o(b16Var, 40.0f);
                        DailyGoalMet dailyGoalMet2 = dailyGoalMet;
                        int i3 = dailyGoalMet2.f19515b;
                        int i4 = dailyGoalMet2.f19520g;
                        m1d.m16596a(e16VarM4422o, i3, dailyGoalMet2.f19516c, dailyGoalMet2.f19517d, true, false, tj3Var3, 24576, 32);
                        tj3Var3.m22139q(true);
                        thb.m22044c(tj3Var3, c99.m4426s(b16Var, ge9.m12515a(tj3Var3).f38952a));
                        as4 as4Var = new as4(1.0f, true);
                        bb1 bb1VarM230a = ab1.m230a(eh0.f37238d, nj0.f52791J, tj3Var3, 0);
                        int iHashCode3 = Long.hashCode(tj3Var3.f62385T);
                        l77 l77VarM22132m3 = tj3Var3.m22132m();
                        e16 e16VarM1322c3 = AbstractC0287b.m1322c(tj3Var3, as4Var);
                        tj3Var3.m22119f0();
                        if (tj3Var3.f62384S) {
                            tj3Var3.m22130l(ui3Var);
                        } else {
                            tj3Var3.m22137o0();
                        }
                        oha.m18001g(tj3Var3, zi3Var, bb1VarM230a);
                        oha.m18001g(tj3Var3, zi3Var2, l77VarM22132m3);
                        AbstractC3393o1.m17747v(iHashCode3, tj3Var3, zi3Var3, tj3Var3, vi3Var);
                        oha.m18001g(tj3Var3, zi3Var4, e16VarM1322c3);
                        boolean z4 = z;
                        if (z4) {
                            tj3Var3.m22111b0(1139779860);
                            strM23620a0 = vz1.m23620a0(tj3Var3, R$string.milestones_daily_goal_double_notification);
                            z2 = false;
                        } else {
                            z2 = false;
                            tj3Var3.m22111b0(1139782578);
                            strM23620a0 = vz1.m23620a0(tj3Var3, R$string.milestones_daily_goal_met);
                        }
                        tj3Var3.m22139q(z2);
                        vx9 vx9Var = p58.m18902j(tj3Var3).f71404h;
                        bc3 bc3Var = bc3.f8322h;
                        lw9.m16554b(strM23620a0, null, p58.m18900f(tj3Var3).f55873q, null, 0L, null, bc3Var, 0L, null, null, 0L, 0, false, 0, 0, null, vx9Var, tj3Var3, 1572864, 0, 131002);
                        if (z4) {
                            tj3Var3.m22111b0(1139794455);
                            strM23620a1 = vz1.m23620a0(tj3Var3, com.lingq.feature.reader.R$string.milestones_youre_on_fire);
                            z3 = false;
                        } else {
                            z3 = false;
                            tj3Var3.m22111b0(1139796263);
                            strM23620a1 = vz1.m23620a0(tj3Var3, com.lingq.feature.reader.R$string.complete_keep_up_good_work);
                        }
                        tj3Var3.m22139q(z3);
                        lw9.m16554b(strM23620a1, null, p58.m18900f(tj3Var3).f55875s, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var3).f71407k, tj3Var3, 0, 0, 131066);
                        thb.m22044c(tj3Var3, c99.m4414g(b16Var, ge9.m12515a(tj3Var3).f38955d));
                        sj8 sj8VarM20003a2 = qj8.m20003a(new C3661uu(ge9.m12515a(tj3Var3).f38955d, true, new gm5(28)), fc0Var, tj3Var3, 48);
                        int iHashCode4 = Long.hashCode(tj3Var3.f62385T);
                        l77 l77VarM22132m4 = tj3Var3.m22132m();
                        e16 e16VarM1322c4 = AbstractC0287b.m1322c(tj3Var3, b16Var);
                        tj3Var3.m22119f0();
                        if (tj3Var3.f62384S) {
                            tj3Var3.m22130l(ui3Var);
                        } else {
                            tj3Var3.m22137o0();
                        }
                        oha.m18001g(tj3Var3, zi3Var, sj8VarM20003a2);
                        oha.m18001g(tj3Var3, zi3Var2, l77VarM22132m4);
                        AbstractC3393o1.m17747v(iHashCode4, tj3Var3, zi3Var3, tj3Var3, vi3Var);
                        oha.m18001g(tj3Var3, zi3Var4, e16VarM1322c4);
                        bq1.m4042R(AbstractC3423or.m18236U(R$drawable.ic_coin_s, tj3Var3, 0), null, wq1.m24108d(tj3Var3, b16Var, 16.0f), null, null, 0.0f, null, tj3Var3, 56, 120);
                        lw9.m16554b(dailyGoalMet2.f19515b + "/" + dailyGoalMet2.f19516c, null, p58.m18900f(tj3Var3).f55873q, null, 0L, null, bc3Var, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var3).f71408l, tj3Var3, 1572864, 0, 131002);
                        tj3 tj3Var4 = tj3Var3;
                        if (i4 > 1) {
                            tj3Var4.m22111b0(-1119409045);
                            bq1.m4042R(AbstractC3423or.m18236U(com.lingq.core.achievements.R$drawable.ic_fire_big, tj3Var4, 0), null, wq1.m24108d(tj3Var4, b16Var, 16.0f), null, null, 0.0f, null, tj3Var4, 56, 120);
                            lw9.m16554b(vz1.m23618Z(R$string.stats_n_day_streak, new Object[]{Integer.valueOf(i4)}, tj3Var4), null, p58.m18900f(tj3Var4).f55873q, null, 0L, null, bc3Var, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var4).f71408l, tj3Var4, 1572864, 0, 131002);
                            tj3Var4 = tj3Var4;
                            tj3Var4.m22139q(false);
                        } else {
                            tj3Var4.m22111b0(-1118750760);
                            tj3Var4.m22139q(false);
                        }
                        AbstractC3393o1.m17723A(tj3Var4, true, true, true);
                    } else {
                        tj3Var3.m22102U();
                    }
                    return xfa.f68157a;
                }
            }, tj3Var2), tj3Var2, (i2 & 14) | 24576, 6);
            tj3Var = tj3Var2;
        } else {
            e16Var2 = e16Var;
            tj3Var = tj3Var2;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3709w4(e16Var2, i, 1, dailyGoalMet);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m20233c(final int i, int i2, ye1 ye1Var, e16 e16Var, final String str) {
        int i3;
        e16 e16Var2;
        tj3 tj3Var;
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(-1115051214);
        if ((i2 & 6) == 0) {
            i3 = (tj3Var2.m22120g(e16Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= tj3Var2.m22116e(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= tj3Var2.m22120g(str) ? 256 : 128;
        }
        if (tj3Var2.m22099R(i3 & 1, (i3 & 147) != 146)) {
            vh9 vh9Var = cx2.f34676a;
            long jM198b = aa1.m198b(0.1f, ((bx2) tj3Var2.m22128k(vh9Var)).m4214g());
            final long jM4218k = ((bx2) tj3Var2.m22128k(vh9Var)).m4218k();
            e16Var2 = e16Var;
            r46.m20381f(e16Var2, null, null, te1.m21999m(0, 14, jM198b, 0L, tj3Var2), ci8.m4703P(1211452680, new aj3() { // from class: u4
                @Override // p000.aj3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    ye1 ye1Var2 = (ye1) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((db1) obj).getClass();
                    tj3 tj3Var3 = (tj3) ye1Var2;
                    if (tj3Var3.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
                        b16 b16Var = b16.f7762a;
                        e16 e16VarM21607T = AbstractC3584sr.m21607T(c99.m4412e(b16Var, 1.0f), ge9.m12515a(tj3Var3).f38956e);
                        sj8 sj8VarM20003a = qj8.m20003a(eh0.f37236b, nj0.f52789H, tj3Var3, 48);
                        int iHashCode = Long.hashCode(tj3Var3.f62385T);
                        l77 l77VarM22132m = tj3Var3.m22132m();
                        e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var3, e16VarM21607T);
                        se1.f60731q.getClass();
                        ui3 ui3Var = C0352b.f4299b;
                        tj3Var3.m22119f0();
                        if (tj3Var3.f62384S) {
                            tj3Var3.m22130l(ui3Var);
                        } else {
                            tj3Var3.m22137o0();
                        }
                        zi3 zi3Var = C0352b.f4303f;
                        oha.m18001g(tj3Var3, zi3Var, sj8VarM20003a);
                        zi3 zi3Var2 = C0352b.f4302e;
                        oha.m18001g(tj3Var3, zi3Var2, l77VarM22132m);
                        Integer numValueOf = Integer.valueOf(iHashCode);
                        zi3 zi3Var3 = C0352b.f4304g;
                        oha.m18001g(tj3Var3, zi3Var3, numValueOf);
                        vi3 vi3Var = C0352b.f4305h;
                        oha.m18000f(tj3Var3, vi3Var);
                        zi3 zi3Var4 = C0352b.f4301d;
                        oha.m18001g(tj3Var3, zi3Var4, e16VarM1322c);
                        e16 e16VarM10007D = d32.m10007D(pb1.m19045o(c99.m4422o(b16Var, 56.0f), p58.m18901i(tj3Var3).f64857c), jM4218k, ss5.f61356d);
                        ht5 ht5VarM19966d = qh0.m19966d(nj0.f52812g, false);
                        int iHashCode2 = Long.hashCode(tj3Var3.f62385T);
                        l77 l77VarM22132m2 = tj3Var3.m22132m();
                        e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var3, e16VarM10007D);
                        tj3Var3.m22119f0();
                        if (tj3Var3.f62384S) {
                            tj3Var3.m22130l(ui3Var);
                        } else {
                            tj3Var3.m22137o0();
                        }
                        oha.m18001g(tj3Var3, zi3Var, ht5VarM19966d);
                        oha.m18001g(tj3Var3, zi3Var2, l77VarM22132m2);
                        AbstractC3393o1.m17747v(iHashCode2, tj3Var3, zi3Var3, tj3Var3, vi3Var);
                        oha.m18001g(tj3Var3, zi3Var4, e16VarM1322c2);
                        lw9.m16554b("📚", null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var3).f71401e, tj3Var3, 6, 0, 131070);
                        tj3Var3.m22139q(true);
                        thb.m22044c(tj3Var3, c99.m4426s(b16Var, ge9.m12515a(tj3Var3).f38952a));
                        Context context = (Context) tj3Var3.m22128k(AbstractC0394f.f4761b);
                        as4 as4Var = new as4(1.0f, true);
                        bb1 bb1VarM230a = ab1.m230a(eh0.f37238d, nj0.f52791J, tj3Var3, 0);
                        int iHashCode3 = Long.hashCode(tj3Var3.f62385T);
                        l77 l77VarM22132m3 = tj3Var3.m22132m();
                        e16 e16VarM1322c3 = AbstractC0287b.m1322c(tj3Var3, as4Var);
                        tj3Var3.m22119f0();
                        if (tj3Var3.f62384S) {
                            tj3Var3.m22130l(ui3Var);
                        } else {
                            tj3Var3.m22137o0();
                        }
                        oha.m18001g(tj3Var3, zi3Var, bb1VarM230a);
                        oha.m18001g(tj3Var3, zi3Var2, l77VarM22132m3);
                        AbstractC3393o1.m17747v(iHashCode3, tj3Var3, zi3Var3, tj3Var3, vi3Var);
                        oha.m18001g(tj3Var3, zi3Var4, e16VarM1322c3);
                        int i4 = com.lingq.feature.reader.R$string.milestones_n_known_words;
                        int i5 = i;
                        lw9.m16554b(vz1.m23618Z(i4, new Object[]{Integer.valueOf(i5)}, tj3Var3), null, p58.m18900f(tj3Var3).f55873q, null, 0L, null, bc3.f8322h, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var3).f71404h, tj3Var3, 1572864, 0, 131002);
                        lw9.m16554b(vz1.m23618Z(com.lingq.feature.reader.R$string.complete_wow_you_know, new Object[]{Integer.valueOf(i5), AbstractC3352my.m17093L(context, str)}, tj3Var3), null, p58.m18900f(tj3Var3).f55875s, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var3).f71407k, tj3Var3, 0, 0, 131066);
                        tj3Var3.m22139q(true);
                        tj3Var3.m22139q(true);
                    } else {
                        tj3Var3.m22102U();
                    }
                    return xfa.f68157a;
                }
            }, tj3Var2), tj3Var2, (i3 & 14) | 24576, 6);
            tj3Var = tj3Var2;
        } else {
            e16Var2 = e16Var;
            tj3Var = tj3Var2;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3672v4(e16Var2, i, str, i2);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m20234d(e16 e16Var, wy5 wy5Var, ye1 ye1Var, int i) {
        int i2;
        e16 e16Var2;
        tj3 tj3Var;
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(-1443208042);
        if ((i & 6) == 0) {
            i2 = (tj3Var2.m22120g(e16Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= tj3Var2.m22124i(wy5Var) ? 32 : 16;
        }
        if (tj3Var2.m22099R(i2 & 1, (i2 & 19) != 18)) {
            vh9 vh9Var = cx2.f34676a;
            e16Var2 = e16Var;
            r46.m20381f(e16Var2, null, null, te1.m21999m(0, 14, aa1.m198b(0.1f, ((bx2) tj3Var2.m22128k(vh9Var)).m4212e()), 0L, tj3Var2), ci8.m4703P(17313792, new bk9(((bx2) tj3Var2.m22128k(vh9Var)).m4212e(), (Context) tj3Var2.m22128k(AbstractC0394f.f4761b), wy5Var), tj3Var2), tj3Var2, (i2 & 14) | 24576, 6);
            tj3Var = tj3Var2;
        } else {
            e16Var2 = e16Var;
            tj3Var = tj3Var2;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3709w4(e16Var2, i, 0, wy5Var);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m20235e(zq8 zq8Var, vi3 vi3Var, vi3 vi3Var2, ye1 ye1Var, int i) {
        vi3Var.getClass();
        vi3Var2.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1631089079);
        int i2 = (tj3Var.m22124i(zq8Var) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= tj3Var.m22124i(vi3Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= tj3Var.m22124i(vi3Var2) ? 256 : 128;
        }
        if (tj3Var.m22099R(i2 & 1, (i2 & 147) != 146)) {
            C0127b c0127b = zq8Var.f71986b;
            e16 e16VarM21606S = AbstractC3584sr.m21606S(c99.m4412e(b16.f7762a, 1.0f), zq8Var.f71987c);
            zf1 zf1Var = ge9.f40637a;
            e16 e16VarM21609V = AbstractC3584sr.m21609V(e16VarM21606S, ((fe9) tj3Var.m22128k(zf1Var)).f38952a, 0.0f, 2);
            C3661uu c3661uu = new C3661uu(((fe9) tj3Var.m22128k(zf1Var)).f38952a, true, new gm5(28));
            boolean zM22124i = ((i2 & 112) == 32) | tj3Var.m22124i(zq8Var) | ((i2 & 896) == 256);
            Object objM22097O = tj3Var.m22097O();
            if (zM22124i || objM22097O == we1.f66679a) {
                objM22097O = new ws6(zq8Var, vi3Var, vi3Var2, 9);
                tj3Var.m22131l0(objM22097O);
            }
            fa4.m11642c(e16VarM21609V, c0127b, null, c3661uu, null, null, false, null, (vi3) objM22097O, tj3Var, 0, 492);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new y35(i, 13, zq8Var, vi3Var, vi3Var2);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m20236f(final int i, int i2, ye1 ye1Var, e16 e16Var) {
        int i3;
        e16 e16Var2;
        tj3 tj3Var;
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(1487681571);
        if ((i2 & 6) == 0) {
            i3 = (tj3Var2.m22120g(e16Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= tj3Var2.m22116e(i) ? 32 : 16;
        }
        if (tj3Var2.m22099R(i3 & 1, (i3 & 19) != 18)) {
            vh9 vh9Var = cx2.f34676a;
            long jM198b = aa1.m198b(0.1f, ((bx2) tj3Var2.m22128k(vh9Var)).m4212e());
            final long jM4212e = ((bx2) tj3Var2.m22128k(vh9Var)).m4212e();
            e16Var2 = e16Var;
            r46.m20381f(e16Var2, null, null, te1.m21999m(0, 14, jM198b, 0L, tj3Var2), ci8.m4703P(1009999885, new aj3() { // from class: x4
                @Override // p000.aj3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    ye1 ye1Var2 = (ye1) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((db1) obj).getClass();
                    tj3 tj3Var3 = (tj3) ye1Var2;
                    if (tj3Var3.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
                        b16 b16Var = b16.f7762a;
                        e16 e16VarM21607T = AbstractC3584sr.m21607T(c99.m4412e(b16Var, 1.0f), ge9.m12515a(tj3Var3).f38956e);
                        sj8 sj8VarM20003a = qj8.m20003a(eh0.f37236b, nj0.f52789H, tj3Var3, 48);
                        int iHashCode = Long.hashCode(tj3Var3.f62385T);
                        l77 l77VarM22132m = tj3Var3.m22132m();
                        e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var3, e16VarM21607T);
                        se1.f60731q.getClass();
                        ui3 ui3Var = C0352b.f4299b;
                        tj3Var3.m22119f0();
                        if (tj3Var3.f62384S) {
                            tj3Var3.m22130l(ui3Var);
                        } else {
                            tj3Var3.m22137o0();
                        }
                        zi3 zi3Var = C0352b.f4303f;
                        oha.m18001g(tj3Var3, zi3Var, sj8VarM20003a);
                        zi3 zi3Var2 = C0352b.f4302e;
                        oha.m18001g(tj3Var3, zi3Var2, l77VarM22132m);
                        Integer numValueOf = Integer.valueOf(iHashCode);
                        zi3 zi3Var3 = C0352b.f4304g;
                        oha.m18001g(tj3Var3, zi3Var3, numValueOf);
                        vi3 vi3Var = C0352b.f4305h;
                        oha.m18000f(tj3Var3, vi3Var);
                        zi3 zi3Var4 = C0352b.f4301d;
                        oha.m18001g(tj3Var3, zi3Var4, e16VarM1322c);
                        e16 e16VarM10007D = d32.m10007D(pb1.m19045o(c99.m4422o(b16Var, 56.0f), p58.m18901i(tj3Var3).f64857c), jM4212e, ss5.f61356d);
                        ht5 ht5VarM19966d = qh0.m19966d(nj0.f52812g, false);
                        int iHashCode2 = Long.hashCode(tj3Var3.f62385T);
                        l77 l77VarM22132m2 = tj3Var3.m22132m();
                        e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var3, e16VarM10007D);
                        tj3Var3.m22119f0();
                        if (tj3Var3.f62384S) {
                            tj3Var3.m22130l(ui3Var);
                        } else {
                            tj3Var3.m22137o0();
                        }
                        oha.m18001g(tj3Var3, zi3Var, ht5VarM19966d);
                        oha.m18001g(tj3Var3, zi3Var2, l77VarM22132m2);
                        AbstractC3393o1.m17747v(iHashCode2, tj3Var3, zi3Var3, tj3Var3, vi3Var);
                        oha.m18001g(tj3Var3, zi3Var4, e16VarM1322c2);
                        ty3.m22352b(AbstractC3423or.m18236U(com.lingq.core.achievements.R$drawable.ic_fire_big, tj3Var3, 0), null, c99.m4422o(b16Var, 32.0f), p58.m18900f(tj3Var3).f55844b, tj3Var3, 440, 0);
                        tj3Var3.m22139q(true);
                        thb.m22044c(tj3Var3, c99.m4426s(b16Var, ge9.m12515a(tj3Var3).f38952a));
                        as4 as4Var = new as4(1.0f, true);
                        bb1 bb1VarM230a = ab1.m230a(eh0.f37238d, nj0.f52791J, tj3Var3, 0);
                        int iHashCode3 = Long.hashCode(tj3Var3.f62385T);
                        l77 l77VarM22132m3 = tj3Var3.m22132m();
                        e16 e16VarM1322c3 = AbstractC0287b.m1322c(tj3Var3, as4Var);
                        tj3Var3.m22119f0();
                        if (tj3Var3.f62384S) {
                            tj3Var3.m22130l(ui3Var);
                        } else {
                            tj3Var3.m22137o0();
                        }
                        oha.m18001g(tj3Var3, zi3Var, bb1VarM230a);
                        oha.m18001g(tj3Var3, zi3Var2, l77VarM22132m3);
                        AbstractC3393o1.m17747v(iHashCode3, tj3Var3, zi3Var3, tj3Var3, vi3Var);
                        oha.m18001g(tj3Var3, zi3Var4, e16VarM1322c3);
                        lw9.m16554b(vz1.m23618Z(com.lingq.feature.reader.R$string.stats_n_day_streak_title, new Object[]{Integer.valueOf(i)}, tj3Var3), null, p58.m18900f(tj3Var3).f55873q, null, 0L, null, bc3.f8322h, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var3).f71404h, tj3Var3, 1572864, 0, 131002);
                        lw9.m16554b(vz1.m23620a0(tj3Var3, com.lingq.feature.reader.R$string.stats_streak_milestone_desc), null, p58.m18900f(tj3Var3).f55875s, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var3).f71407k, tj3Var3, 0, 0, 131066);
                        tj3Var3.m22139q(true);
                        tj3Var3.m22139q(true);
                    } else {
                        tj3Var3.m22102U();
                    }
                    return xfa.f68157a;
                }
            }, tj3Var2), tj3Var2, (i3 & 14) | 24576, 6);
            tj3Var = tj3Var2;
        } else {
            e16Var2 = e16Var;
            tj3Var = tj3Var2;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3783y4(i, i2, e16Var2);
        }
    }
}
