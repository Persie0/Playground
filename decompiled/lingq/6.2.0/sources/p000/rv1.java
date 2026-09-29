package p000;

import android.content.Context;
import androidx.compose.foundation.AbstractC0080f;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.p002ui.platform.AbstractC0394f;
import androidx.compose.runtime.internal.C0282a;
import com.lingq.core.domain.model.cup.CupPrizeSource;
import com.lingq.feature.challenges.R$plurals;
import com.lingq.feature.challenges.R$string;
import com.lingq.feature.challenges.cup.data.CupPhase;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public abstract class rv1 {

    /* JADX INFO: renamed from: a */
    public static final long f59842a = d32.m10018P(1);

    /* JADX INFO: renamed from: a */
    public static final void m20856a(zt1 zt1Var, e16 e16Var, ye1 ye1Var, int i) {
        e16 e16Var2;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(446414384);
        int i2 = (tj3Var.m22120g(zt1Var) ? 4 : 2) | i | 48;
        if (tj3Var.m22099R(i2 & 1, (i2 & 19) != 18)) {
            long jM198b = aa1.m198b(0.18f, xs1.f68632y);
            si8 si8VarM22753b = ui8.m22753b(((fe9) tj3Var.m22128k(ge9.f40637a)).f38958g);
            e16Var2 = b16.f7762a;
            e16 e16VarM18285y = AbstractC3423or.m18285y(r46.m20387m(pb1.m19045o(c99.m4412e(e16Var2, 1.0f), si8VarM22753b), 1.0f, jM198b, si8VarM22753b), IntrinsicSize.Min);
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
            as4 as4Var = new as4(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            String strM23620a0 = vz1.m23620a0(tj3Var, R$string.cup_stat_total_coins);
            Integer num = zt1Var.f72136m;
            m20865j(strM23620a0, new C3419on(String.format("%,d", Arrays.copyOf(new Object[]{Integer.valueOf(num != null ? num.intValue() : 0)}, 1))), as4Var, tj3Var, 0);
            pb1.m19037g(0.0f, 384, 3, jM198b, tj3Var, null);
            if (1.0f <= 0.0d) {
                g54.m12362a("invalid weight; must be greater than zero");
            }
            as4 as4Var2 = new as4(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            String strM23620a1 = vz1.m23620a0(tj3Var, R$string.cup_stat_participants);
            Integer num2 = zt1Var.f72137n;
            m20865j(strM23620a1, new C3419on(String.format("%,d", Arrays.copyOf(new Object[]{Integer.valueOf(num2 != null ? num2.intValue() : 0)}, 1))), as4Var2, tj3Var, 0);
            tj3Var.m22139q(true);
        } else {
            tj3Var.m22102U();
            e16Var2 = e16Var;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new mv1(zt1Var, e16Var2, i, 1);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m20857b(final zt1 zt1Var, CupPhase cupPhase, e16 e16Var, ye1 ye1Var, int i) {
        e16 e16Var2;
        C0282a c0282aM4703P;
        boolean z;
        ec0 ec0Var = nj0.f52791J;
        final int i2 = 0;
        zt1Var.getClass();
        cupPhase.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(290790917);
        int i3 = i | (tj3Var.m22120g(zt1Var) ? 4 : 2) | (tj3Var.m22116e(cupPhase.ordinal()) ? 32 : 16) | 384;
        final int i4 = 1;
        if (tj3Var.m22099R(i3 & 1, (i3 & 147) != 146)) {
            b16 b16Var = b16.f7762a;
            e16 e16VarM4412e = c99.m4412e(b16Var, 1.0f);
            zf1 zf1Var = ge9.f40637a;
            e16 e16VarM21607T = AbstractC3584sr.m21607T(d32.m10006C(pb1.m19045o(e16VarM4412e, ui8.m22753b(((fe9) tj3Var.m22128k(zf1Var)).f38957f)), ui0.m22747c(vi0.Companion, vz1.m23605K(new aa1(xs1.f68610c), new aa1(xs1.f68611d)), 0L, 0L, 14)), ((fe9) tj3Var.m22128k(zf1Var)).f38958g);
            boolean zM12248c = fy9.m12248c(t9a.m21912b(tj3Var));
            if (zt1Var.f72130g) {
                tj3Var.m22111b0(3754311);
                c0282aM4703P = ci8.m4703P(-1249681855, new zi3() { // from class: pv1
                    @Override // p000.zi3
                    public final Object invoke(Object obj, Object obj2) {
                        int i5 = i2;
                        xfa xfaVar = xfa.f68157a;
                        zt1 zt1Var2 = zt1Var;
                        ye1 ye1Var2 = (ye1) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        switch (i5) {
                            case 0:
                                tj3 tj3Var2 = (tj3) ye1Var2;
                                if (!tj3Var2.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    tj3Var2.m22102U();
                                } else {
                                    rv1.m20858c(zt1Var2, null, tj3Var2, 0);
                                }
                                break;
                            default:
                                tj3 tj3Var3 = (tj3) ye1Var2;
                                if (!tj3Var3.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    tj3Var3.m22102U();
                                } else {
                                    rv1.m20856a(zt1Var2, null, tj3Var3, 0);
                                }
                                break;
                        }
                        return xfaVar;
                    }
                }, tj3Var);
                tj3Var.m22139q(false);
            } else if (cupPhase == CupPhase.Finished) {
                tj3Var.m22111b0(3847714);
                c0282aM4703P = ci8.m4703P(-96334728, new zi3() { // from class: pv1
                    @Override // p000.zi3
                    public final Object invoke(Object obj, Object obj2) {
                        int i5 = i4;
                        xfa xfaVar = xfa.f68157a;
                        zt1 zt1Var2 = zt1Var;
                        ye1 ye1Var2 = (ye1) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        switch (i5) {
                            case 0:
                                tj3 tj3Var2 = (tj3) ye1Var2;
                                if (!tj3Var2.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    tj3Var2.m22102U();
                                } else {
                                    rv1.m20858c(zt1Var2, null, tj3Var2, 0);
                                }
                                break;
                            default:
                                tj3 tj3Var3 = (tj3) ye1Var2;
                                if (!tj3Var3.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    tj3Var3.m22102U();
                                } else {
                                    rv1.m20856a(zt1Var2, null, tj3Var3, 0);
                                }
                                break;
                        }
                        return xfaVar;
                    }
                }, tj3Var);
                tj3Var.m22139q(false);
            } else {
                tj3Var.m22111b0(3922392);
                tj3Var.m22139q(false);
                c0282aM4703P = null;
            }
            if (!zM12248c || c0282aM4703P == null) {
                tj3Var.m22111b0(4712676);
                bb1 bb1VarM230a = ab1.m230a(new C3661uu(((fe9) tj3Var.m22128k(zf1Var)).f38956e, true, new gm5(28)), ec0Var, tj3Var, 0);
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
                int i5 = i3 & 126;
                m20860e(zt1Var, cupPhase, tj3Var, i5);
                if (c0282aM4703P != null) {
                    tj3Var.m22111b0(762082265);
                    c0282aM4703P.invoke(tj3Var, 0);
                    z = false;
                    tj3Var.m22139q(false);
                } else {
                    z = false;
                    tj3Var.m22111b0(762130377);
                    m20861f(zt1Var, cupPhase, tj3Var, i5);
                    tj3Var.m22139q(false);
                }
                tj3Var.m22139q(true);
                tj3Var.m22139q(z);
            } else {
                tj3Var.m22111b0(4195348);
                sj8 sj8VarM20003a = qj8.m20003a(new C3661uu(((fe9) tj3Var.m22128k(zf1Var)).f38958g, true, new gm5(28)), nj0.f52789H, tj3Var, 48);
                int iHashCode2 = Long.hashCode(tj3Var.f62385T);
                l77 l77VarM22132m2 = tj3Var.m22132m();
                e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var, e16VarM21607T);
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
                oha.m18001g(tj3Var, zi3Var2, l77VarM22132m2);
                Integer numValueOf = Integer.valueOf(iHashCode2);
                zi3 zi3Var3 = C0352b.f4304g;
                oha.m18001g(tj3Var, zi3Var3, numValueOf);
                vi3 vi3Var = C0352b.f4305h;
                oha.m18000f(tj3Var, vi3Var);
                zi3 zi3Var4 = C0352b.f4301d;
                oha.m18001g(tj3Var, zi3Var4, e16VarM1322c2);
                if (1.0f <= 0.0d) {
                    g54.m12362a("invalid weight; must be greater than zero");
                }
                as4 as4Var = new as4(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                C0282a c0282a = c0282aM4703P;
                bb1 bb1VarM230a2 = ab1.m230a(new C3661uu(((fe9) tj3Var.m22128k(zf1Var)).f38956e, true, new gm5(28)), ec0Var, tj3Var, 0);
                int iHashCode3 = Long.hashCode(tj3Var.f62385T);
                l77 l77VarM22132m3 = tj3Var.m22132m();
                e16 e16VarM1322c3 = AbstractC0287b.m1322c(tj3Var, as4Var);
                tj3Var.m22119f0();
                if (tj3Var.f62384S) {
                    tj3Var.m22130l(ui3Var2);
                } else {
                    tj3Var.m22137o0();
                }
                oha.m18001g(tj3Var, zi3Var, bb1VarM230a2);
                oha.m18001g(tj3Var, zi3Var2, l77VarM22132m3);
                AbstractC3393o1.m17747v(iHashCode3, tj3Var, zi3Var3, tj3Var, vi3Var);
                oha.m18001g(tj3Var, zi3Var4, e16VarM1322c3);
                m20860e(zt1Var, cupPhase, tj3Var, i3 & 126);
                tj3Var.m22139q(true);
                if (1.0f <= 0.0d) {
                    g54.m12362a("invalid weight; must be greater than zero");
                }
                as4 as4Var2 = new as4(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                ht5 ht5VarM19966d = qh0.m19966d(nj0.f52808c, false);
                int iHashCode4 = Long.hashCode(tj3Var.f62385T);
                l77 l77VarM22132m4 = tj3Var.m22132m();
                e16 e16VarM1322c4 = AbstractC0287b.m1322c(tj3Var, as4Var2);
                tj3Var.m22119f0();
                if (tj3Var.f62384S) {
                    tj3Var.m22130l(ui3Var2);
                } else {
                    tj3Var.m22137o0();
                }
                oha.m18001g(tj3Var, zi3Var, ht5VarM19966d);
                oha.m18001g(tj3Var, zi3Var2, l77VarM22132m4);
                AbstractC3393o1.m17747v(iHashCode4, tj3Var, zi3Var3, tj3Var, vi3Var);
                oha.m18001g(tj3Var, zi3Var4, e16VarM1322c4);
                c0282a.invoke(tj3Var, 0);
                tj3Var.m22139q(true);
                tj3Var.m22139q(true);
                tj3Var.m22139q(false);
            }
            e16Var2 = b16Var;
        } else {
            tj3Var.m22102U();
            e16Var2 = e16Var;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3836zk(zt1Var, cupPhase, e16Var2, i, 9);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m20858c(zt1 zt1Var, e16 e16Var, ye1 ye1Var, int i) {
        zt1 zt1Var2;
        int i2;
        e16 e16Var2;
        int i3;
        String strM23618Z;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1471158678);
        int i4 = i | (tj3Var.m22120g(zt1Var) ? 4 : 2) | 48;
        if (tj3Var.m22099R(i4 & 1, (i4 & 19) != 18)) {
            long jM198b = aa1.m198b(0.18f, xs1.f68632y);
            si8 si8VarM22753b = ui8.m22753b(((fe9) tj3Var.m22128k(ge9.f40637a)).f38958g);
            b16 b16Var = b16.f7762a;
            e16 e16VarM20387m = r46.m20387m(pb1.m19045o(c99.m4412e(b16Var, 1.0f), si8VarM22753b), 1.0f, jM198b, si8VarM22753b);
            bb1 bb1VarM230a = ab1.m230a(eh0.f37238d, nj0.f52791J, tj3Var, 0);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM20387m);
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
            vi3 vi3Var = C0352b.f4305h;
            oha.m18000f(tj3Var, vi3Var);
            zi3 zi3Var4 = C0352b.f4301d;
            oha.m18001g(tj3Var, zi3Var4, e16VarM1322c);
            IntrinsicSize intrinsicSize = IntrinsicSize.Min;
            e16 e16VarM18285y = AbstractC3423or.m18285y(b16Var, intrinsicSize);
            C3549ru c3549ru = eh0.f37236b;
            fc0 fc0Var = nj0.f52817l;
            sj8 sj8VarM20003a = qj8.m20003a(c3549ru, fc0Var, tj3Var, 0);
            int iHashCode2 = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m2 = tj3Var.m22132m();
            e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var, e16VarM18285y);
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, zi3Var, sj8VarM20003a);
            oha.m18001g(tj3Var, zi3Var2, l77VarM22132m2);
            AbstractC3393o1.m17747v(iHashCode2, tj3Var, zi3Var3, tj3Var, vi3Var);
            oha.m18001g(tj3Var, zi3Var4, e16VarM1322c2);
            vj8 vj8Var = vj8.f65508a;
            e16Var2 = b16Var;
            e16 e16VarMo12420a = vj8Var.mo12420a(1.0f, e16Var2, true);
            String strM23620a0 = vz1.m23620a0(tj3Var, R$string.cup_stat_days_remaining);
            Integer num = zt1Var.f72126c;
            Integer num2 = zt1Var.f72132i;
            Integer num3 = zt1Var.f72131h;
            m20865j(strM23620a0, new C3419on(String.valueOf(num != null ? num.intValue() : 0)), e16VarMo12420a, tj3Var, 0);
            pb1.m19037g(0.0f, 384, 3, jM198b, tj3Var, null);
            e16 e16VarMo12420a2 = vj8Var.mo12420a(1.0f, e16Var2, true);
            String strM23620a1 = vz1.m23620a0(tj3Var, R$string.cup_stat_team_rank);
            if (num3 == null || num2 == null) {
                i3 = 0;
                tj3Var.m22111b0(1047923391);
                tj3Var.m22139q(false);
                strM23618Z = "–";
            } else {
                tj3Var.m22111b0(1047803421);
                strM23618Z = vz1.m23618Z(R$string.cup_rank_of, new Object[]{num3, num2}, tj3Var);
                i3 = 0;
                tj3Var.m22139q(false);
            }
            m20865j(strM23620a1, new C3419on(strM23618Z), e16VarMo12420a2, tj3Var, i3);
            tj3Var.m22139q(true);
            pb1.m19031a(0.0f, 384, 3, jM198b, tj3Var, null);
            e16 e16VarM18285y2 = AbstractC3423or.m18285y(e16Var2, intrinsicSize);
            sj8 sj8VarM20003a2 = qj8.m20003a(c3549ru, fc0Var, tj3Var, i3);
            int iHashCode3 = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m3 = tj3Var.m22132m();
            e16 e16VarM1322c3 = AbstractC0287b.m1322c(tj3Var, e16VarM18285y2);
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, zi3Var, sj8VarM20003a2);
            oha.m18001g(tj3Var, zi3Var2, l77VarM22132m3);
            AbstractC3393o1.m17747v(iHashCode3, tj3Var, zi3Var3, tj3Var, vi3Var);
            oha.m18001g(tj3Var, zi3Var4, e16VarM1322c3);
            e16 e16VarMo12420a3 = vj8Var.mo12420a(1.0f, e16Var2, true);
            String strM23620a2 = vz1.m23620a0(tj3Var, R$string.cup_stat_contribution);
            zt1Var2 = zt1Var;
            Integer num4 = zt1Var2.f72134k;
            m20865j(strM23620a2, new C3419on(String.format("%,d", Arrays.copyOf(new Object[]{Integer.valueOf(num4 != null ? num4.intValue() : 0)}, 1))), e16VarMo12420a3, tj3Var, 0);
            pb1.m19037g(0.0f, 384, 3, jM198b, tj3Var, null);
            e16 e16VarMo12420a4 = vj8Var.mo12420a(1.0f, e16Var2, true);
            String strM23620a3 = vz1.m23620a0(tj3Var, R$string.cup_stat_days_active);
            Integer num5 = zt1Var2.f72135l;
            i2 = 0;
            m20865j(strM23620a3, new C3419on(String.valueOf(num5 != null ? num5.intValue() : 0)), e16VarMo12420a4, tj3Var, 0);
            tj3Var.m22139q(true);
            tj3Var.m22139q(true);
        } else {
            zt1Var2 = zt1Var;
            i2 = 0;
            tj3Var.m22102U();
            e16Var2 = e16Var;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new mv1(zt1Var2, e16Var2, i, i2);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m20859d(e16 e16Var, ye1 ye1Var, int i) {
        e16 e16Var2;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1777650611);
        int i2 = i | 6;
        if (tj3Var.m22099R(i2 & 1, (i2 & 3) != 2)) {
            b16 b16Var = b16.f7762a;
            e16 e16VarM21607T = AbstractC3584sr.m21607T(r46.m20387m(d32.m10007D(pb1.m19045o(c99.m4412e(b16Var, 1.0f), ui8.m22753b(ge9.m12515a(tj3Var).f38957f)), p58.m18900f(tj3Var).f55872p, ss5.f61356d), 1.0f, p58.m18900f(tj3Var).f55817B, ui8.m22753b(ge9.m12515a(tj3Var).f38957f)), ge9.m12515a(tj3Var).f38957f);
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
            tj3Var.m22111b0(-739011304);
            C3341mn c3341mn = new C3341mn();
            tj3Var.m22111b0(-739010204);
            int iM16932g = c3341mn.m16932g(new he9(0L, 0L, bc3.f8323i, null, null, null, null, 0L, null, null, null, 0L, null, null, 65531));
            try {
                c3341mn.m16929d(vz1.m23620a0(tj3Var, R$string.cup_tallying_lead));
                c3341mn.m16931f(iM16932g);
                tj3Var.m22139q(false);
                c3341mn.m16929d(" ");
                c3341mn.m16929d(vz1.m23620a0(tj3Var, R$string.cup_tallying_body));
                C3419on c3419onM16933h = c3341mn.m16933h();
                tj3Var.m22139q(false);
                lw9.m16555c(c3419onM16933h, null, p58.m18900f(tj3Var).f55875s, null, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, p58.m18902j(tj3Var).f71407k, tj3Var, 0, 0, 262138);
                tj3Var = tj3Var;
                tj3Var.m22139q(true);
                e16Var2 = b16Var;
            } catch (Throwable th) {
                c3341mn.m16931f(iM16932g);
                throw th;
            }
        } else {
            tj3Var.m22102U();
            e16Var2 = e16Var;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3456pd(i, 4, e16Var2);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m20860e(zt1 zt1Var, CupPhase cupPhase, ye1 ye1Var, int i) {
        int i2;
        tj3 tj3Var;
        int i3;
        String strM23618Z;
        boolean z;
        String strM23620a0;
        String str;
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(1367018388);
        if ((i & 6) == 0) {
            i2 = i | (tj3Var2.m22120g(zt1Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= tj3Var2.m22116e(cupPhase.ordinal()) ? 32 : 16;
        }
        if (tj3Var2.m22099R(i2 & 1, (i2 & 19) != 18)) {
            int[] iArr = qv1.f58240a;
            int i4 = iArr[cupPhase.ordinal()];
            String strM17093L = null;
            if (i4 == 1 || i4 == 2 || i4 == 3 || i4 == 4) {
                Integer num = zt1Var.f72124a;
                Integer num2 = zt1Var.f72125b;
                if (num == null || num2 == null) {
                    tj3Var2.m22111b0(-381979305);
                    tj3Var2.m22139q(false);
                    strM23618Z = null;
                } else {
                    tj3Var2.m22111b0(-382080303);
                    strM23618Z = vz1.m23618Z(R$string.cup_hub_eyebrow, new Object[]{zt1Var.f72124a, num2}, tj3Var2);
                    tj3Var2.m22139q(false);
                }
            } else if (i4 != 5) {
                strM23618Z = null;
            } else if (zt1Var.f72128e == null) {
                tj3Var2.m22111b0(126234014);
                strM23618Z = vz1.m23620a0(tj3Var2, R$string.cup_hero_ended_eyebrow);
                tj3Var2.m22139q(false);
            } else if (zt1Var.f72131h == null || (str = zt1Var.f72129f) == null || vk9.m23391n0(str)) {
                tj3Var2.m22111b0(126240062);
                strM23618Z = vz1.m23620a0(tj3Var2, R$string.cup_hero_ended_eyebrow);
                tj3Var2.m22139q(false);
            } else {
                tj3Var2.m22111b0(126238137);
                strM23618Z = vz1.m23620a0(tj3Var2, R$string.cup_results_label);
                tj3Var2.m22139q(false);
            }
            if (strM23618Z == null) {
                tj3Var2.m22111b0(-35011197);
                tj3Var2.m22139q(false);
                z = false;
            } else {
                tj3Var2.m22111b0(-35011196);
                String upperCase = strM23618Z.toUpperCase(Locale.ROOT);
                upperCase.getClass();
                z = false;
                lw9.m16554b(upperCase, null, xs1.f68632y, null, 0L, null, bc3.f8324j, f59842a, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var2.m22128k(ps5.f56764b)).f51800b.f71410n, tj3Var2, 102236544, 0, 130746);
                tj3Var2 = tj3Var2;
                tj3Var2.m22139q(false);
            }
            int i5 = iArr[cupPhase.ordinal()];
            if (i5 == 3) {
                tj3Var2.m22111b0(-402024200);
                strM23620a0 = vz1.m23620a0(tj3Var2, R$string.cup_hero_in_progress);
                tj3Var2.m22139q(z);
            } else if (i5 == 5) {
                tj3Var2.m22111b0(422250611);
                Context context = (Context) tj3Var2.m22128k(AbstractC0394f.f4761b);
                String str2 = zt1Var.f72128e;
                Integer num3 = zt1Var.f72133j;
                String str3 = zt1Var.f72129f;
                if (str3 != null) {
                    if (vk9.m23391n0(str3)) {
                        str3 = null;
                    }
                    if (str3 != null) {
                        strM17093L = AbstractC3352my.m17093L(context, str3);
                    }
                }
                String str4 = strM17093L;
                if (str2 == null) {
                    tj3Var2.m22111b0(-402010536);
                    strM23620a0 = vz1.m23620a0(tj3Var2, R$string.cup_champion_pending);
                    tj3Var2.m22139q(z);
                } else if (num3 == null || str4 == null || vk9.m23391n0(str4)) {
                    tj3Var2.m22111b0(-401994272);
                    strM23620a0 = vz1.m23618Z(R$string.cup_champion_wins, new Object[]{AbstractC3352my.m17093L(context, str2)}, tj3Var2);
                    tj3Var2.m22139q(z);
                } else {
                    tj3Var2.m22111b0(-402000224);
                    strM23620a0 = vz1.m23618Z(R$string.cup_results_finished_title, new Object[]{num3, str4}, tj3Var2);
                    tj3Var2.m22139q(z);
                }
                tj3Var2.m22139q(z);
            } else if (i5 != 6) {
                tj3Var2.m22111b0(-401990636);
                strM23620a0 = vz1.m23620a0(tj3Var2, R$string.cup_hub_headline);
                tj3Var2.m22139q(z);
            } else {
                tj3Var2.m22111b0(-402026477);
                strM23620a0 = vz1.m23620a0(tj3Var2, R$string.cup_hero_precup);
                tj3Var2.m22139q(z);
            }
            tj3Var = tj3Var2;
            i3 = 1;
            lw9.m16554b(strM23620a0, null, xs1.f68632y, null, 0L, new wb3(1), bc3.f8324j, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var2.m22128k(ps5.f56764b)).f51800b.f71399c, tj3Var, 1573248, 0, 130970);
        } else {
            tj3Var = tj3Var2;
            i3 = 1;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new nv1(zt1Var, cupPhase, i, i3);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m20861f(zt1 zt1Var, CupPhase cupPhase, ye1 ye1Var, int i) {
        int i2;
        int i3;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1268963282);
        if ((i & 6) == 0) {
            i2 = i | (tj3Var.m22120g(zt1Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= tj3Var.m22116e(cupPhase.ordinal()) ? 32 : 16;
        }
        if (tj3Var.m22099R(i2 & 1, (i2 & 19) != 18)) {
            String strM23612R = null;
            switch (qv1.f58240a[cupPhase.ordinal()]) {
                case 1:
                case 2:
                case 4:
                    tj3Var.m22111b0(-371618619);
                    Integer num = zt1Var.f72126c;
                    if (num == null) {
                        tj3Var.m22111b0(-371618620);
                    } else {
                        tj3Var.m22111b0(-371618619);
                        int iIntValue = num.intValue();
                        strM23612R = vz1.m23612R(R$plurals.cup_days_remaining, iIntValue, new Object[]{Integer.valueOf(iIntValue)}, tj3Var);
                    }
                    tj3Var.m22139q(false);
                    tj3Var.m22139q(false);
                    break;
                case 3:
                    tj3Var.m22111b0(-1674564404);
                    strM23612R = vz1.m23620a0(tj3Var, R$string.cup_in_progress_subtitle);
                    tj3Var.m22139q(false);
                    break;
                case 5:
                    tj3Var.m22111b0(-371724702);
                    tj3Var.m22139q(false);
                    break;
                case 6:
                    tj3Var.m22111b0(-371980823);
                    Integer num2 = zt1Var.f72126c;
                    if (num2 == null) {
                        tj3Var.m22111b0(-371980824);
                    } else {
                        tj3Var.m22111b0(-371980823);
                        int iIntValue2 = num2.intValue();
                        strM23612R = vz1.m23612R(R$plurals.cup_days_until, iIntValue2, new Object[]{Integer.valueOf(iIntValue2)}, tj3Var);
                    }
                    tj3Var.m22139q(false);
                    tj3Var.m22139q(false);
                    break;
                default:
                    tj3Var.m22111b0(-371541182);
                    tj3Var.m22139q(false);
                    break;
            }
            if (strM23612R == null) {
                tj3Var.m22111b0(617111785);
                tj3Var.m22139q(false);
                i3 = 0;
            } else {
                tj3Var.m22111b0(617111786);
                zf1 zf1Var = ge9.f40637a;
                sj8 sj8VarM20003a = qj8.m20003a(new C3661uu(((fe9) tj3Var.m22128k(zf1Var)).f38952a, true, new gm5(28)), nj0.f52789H, tj3Var, 48);
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
                oha.m18001g(tj3Var, C0352b.f4303f, sj8VarM20003a);
                oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
                oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
                oha.m18000f(tj3Var, C0352b.f4305h);
                oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
                e16 e16VarM19045o = pb1.m19045o(c99.m4422o(b16Var, ((fe9) tj3Var.m22128k(zf1Var)).f38952a), ui8.f63972a);
                String str = strM23612R;
                long j = xs1.f68632y;
                qh0.m19963a(d32.m10007D(e16VarM19045o, j, ss5.f61356d), tj3Var, 0);
                i3 = 0;
                lw9.m16554b(str, null, j, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var.m22128k(ps5.f56764b)).f51800b.f71407k, tj3Var, 384, 0, 131066);
                tj3Var = tj3Var;
                tj3Var.m22139q(true);
                tj3Var.m22139q(false);
            }
        } else {
            i3 = 0;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new nv1(zt1Var, cupPhase, i, i3);
        }
    }

    /* JADX INFO: renamed from: g */
    public static final void m20862g(int i, ye1 ye1Var, ui3 ui3Var, e16 e16Var) {
        e16 e16Var2;
        ui3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1585932458);
        int i2 = i | (tj3Var.m22124i(ui3Var) ? 4 : 2) | 48;
        if (tj3Var.m22099R(i2 & 1, (i2 & 19) != 18)) {
            b16 b16Var = b16.f7762a;
            e16 e16VarM21607T = AbstractC3584sr.m21607T(AbstractC0080f.m815b(null, false, ui3Var, r46.m20387m(d32.m10007D(pb1.m19045o(c99.m4412e(b16Var, 1.0f), ui8.m22753b(ge9.m12515a(tj3Var).f38957f)), p58.m18900f(tj3Var).f55872p, ss5.f61356d), 1.0f, p58.m18900f(tj3Var).f55817B, ui8.m22753b(ge9.m12515a(tj3Var).f38957f)), 15), ge9.m12515a(tj3Var).f38957f);
            sj8 sj8VarM20003a = qj8.m20003a(new C3661uu(ge9.m12515a(tj3Var).f38956e, true, new gm5(28)), nj0.f52789H, tj3Var, 48);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM21607T);
            se1.f60731q.getClass();
            ui3 ui3Var2 = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var2);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, C0352b.f4303f, sj8VarM20003a);
            oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
            oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
            oha.m18000f(tj3Var, C0352b.f4305h);
            oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
            lw9.m16554b("🏅", null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var).f71403g, tj3Var, 6, 0, 131070);
            as4 as4Var = new as4(1.0f, true);
            lw9.m16554b(vz1.m23620a0(tj3Var, R$string.cup_level_progress), as4Var, p58.m18900f(tj3Var).f55873q, null, 0L, null, bc3.f8323i, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var).f71404h, tj3Var, 1572864, 0, 131000);
            p04 p04VarM13932a = ihd.m13932a();
            long j = p58.m18900f(tj3Var).f55875s;
            tj3Var = tj3Var;
            ty3.m22351a(p04VarM13932a, null, null, j, tj3Var, 48, 4);
            tj3Var.m22139q(true);
            e16Var2 = b16Var;
        } else {
            tj3Var.m22102U();
            e16Var2 = e16Var;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new ov1(ui3Var, e16Var2, i, 0);
        }
    }

    /* JADX INFO: renamed from: h */
    public static final void m20863h(n56 n56Var, e16 e16Var, ye1 ye1Var, int i) {
        long jM198b;
        long j;
        int i2;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1319827828);
        int i3 = (tj3Var.m22120g(n56Var) ? 4 : 2) | i | (tj3Var.m22120g(e16Var) ? 32 : 16);
        if (tj3Var.m22099R(i3 & 1, (i3 & 19) != 18)) {
            e16 e16VarM19045o = pb1.m19045o(e16Var, ui8.m22753b(ge9.m12515a(tj3Var).f38956e));
            if (n56Var.f52367c) {
                tj3Var.m22111b0(-1434525751);
                jM198b = aa1.m198b(0.2f, p58.m18900f(tj3Var).f55846c);
                tj3Var.m22139q(false);
            } else {
                tj3Var.m22111b0(-1434420475);
                jM198b = p58.m18900f(tj3Var).f55872p;
                tj3Var.m22139q(false);
            }
            e16 e16VarM21607T = AbstractC3584sr.m21607T(r46.m20387m(d32.m10007D(e16VarM19045o, jM198b, ss5.f61356d), 1.0f, p58.m18900f(tj3Var).f55817B, ui8.m22753b(ge9.m12515a(tj3Var).f38956e)), ge9.m12515a(tj3Var).f38956e);
            bb1 bb1VarM230a = ab1.m230a(new C3661uu(ge9.m12515a(tj3Var).f38955d, true, new gm5(28)), nj0.f52792K, tj3Var, 48);
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
            String strM23618Z = vz1.m23618Z(R$string.cup_multiplier_format, new Object[]{Integer.valueOf(n56Var.f52366b)}, tj3Var);
            vx9 vx9Var = p58.m18902j(tj3Var).f71404h;
            bc3 bc3Var = bc3.f8323i;
            if (n56Var.f52367c) {
                tj3Var.m22111b0(-312743825);
                tj3Var.m22139q(false);
                j = xs1.f68608a;
            } else {
                tj3Var.m22111b0(-312742637);
                long j2 = p58.m18900f(tj3Var).f55873q;
                tj3Var.m22139q(false);
                j = j2;
            }
            lw9.m16554b(strM23618Z, null, j, null, 0L, null, bc3Var, 0L, null, null, 0L, 0, false, 0, 0, null, vx9Var, tj3Var, 1572864, 0, 131002);
            CupPrizeSource cupPrizeSource = n56Var.f52365a;
            cupPrizeSource.getClass();
            switch (at1.f7453a[cupPrizeSource.ordinal()]) {
                case 1:
                    i2 = R$string.cup_source_read_short;
                    break;
                case 2:
                    i2 = R$string.cup_source_listen_short;
                    break;
                case 3:
                    i2 = R$string.cup_source_lingq_short;
                    break;
                case 4:
                    i2 = R$string.cup_source_known_short;
                    break;
                case 5:
                    i2 = R$string.cup_source_all;
                    break;
                case 6:
                    i2 = R$string.cup_source_all;
                    break;
                default:
                    gm5.m12750e();
                    return;
            }
            String upperCase = vz1.m23620a0(tj3Var, i2).toUpperCase(Locale.ROOT);
            upperCase.getClass();
            vx9 vx9Var2 = p58.m18902j(tj3Var).f71411o;
            lw9.m16554b(upperCase, null, p58.m18900f(tj3Var).f55875s, new m20(d32.m10018P(7), d32.m10018P(11), d32.m10017O(0.5d)), 0L, null, bc3.f8320f, f59842a, null, new ks9(3), 0L, 0, false, 1, 0, null, vx9Var2, tj3Var, 102236160, 24576, 113330);
            tj3Var = tj3Var;
            tj3Var.m22139q(true);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3598t4(n56Var, e16Var, i, 27);
        }
    }

    /* JADX INFO: renamed from: i */
    public static final void m20864i(int i, ye1 ye1Var, ui3 ui3Var, e16 e16Var, List list) {
        e16 e16Var2;
        list.getClass();
        ui3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(2122717201);
        int i2 = (tj3Var.m22124i(list) ? 4 : 2) | i | (tj3Var.m22124i(ui3Var) ? 32 : 16) | 384;
        if (tj3Var.m22099R(i2 & 1, (i2 & 147) != 146)) {
            b16 b16Var = b16.f7762a;
            e16 e16VarM815b = AbstractC0080f.m815b(null, false, ui3Var, c99.m4412e(b16Var, 1.0f), 15);
            sj8 sj8VarM20003a = qj8.m20003a(new C3661uu(((fe9) tj3Var.m22128k(ge9.f40637a)).f38952a, true, new gm5(28)), nj0.f52817l, tj3Var, 0);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM815b);
            se1.f60731q.getClass();
            ui3 ui3Var2 = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var2);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, C0352b.f4303f, sj8VarM20003a);
            oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
            oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
            oha.m18000f(tj3Var, C0352b.f4305h);
            oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
            tj3Var.m22111b0(208313240);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                m20863h((n56) it.next(), new as4(1.0f, true), tj3Var, 0);
            }
            tj3Var.m22139q(false);
            tj3Var.m22139q(true);
            e16Var2 = b16Var;
        } else {
            tj3Var.m22102U();
            e16Var2 = e16Var;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3836zk(list, ui3Var, e16Var2, i, 10);
        }
    }

    /* JADX INFO: renamed from: j */
    public static final void m20865j(String str, C3419on c3419on, e16 e16Var, ye1 ye1Var, int i) {
        tj3 tj3Var;
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(-876919803);
        int i2 = i | (tj3Var2.m22120g(str) ? 4 : 2) | (tj3Var2.m22120g(c3419on) ? 32 : 16) | (tj3Var2.m22120g(e16Var) ? 256 : 128);
        if (tj3Var2.m22099R(i2 & 1, (i2 & 147) != 146)) {
            e16 e16VarM4410c = c99.m4410c(e16Var, 1.0f);
            zf1 zf1Var = ge9.f40637a;
            e16 e16VarM21607T = AbstractC3584sr.m21607T(e16VarM4410c, ((fe9) tj3Var2.m22128k(zf1Var)).f38956e);
            bb1 bb1VarM230a = ab1.m230a(new C3661uu(((fe9) tj3Var2.m22128k(zf1Var)).f38955d, true, new gm5(28)), nj0.f52791J, tj3Var2, 0);
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
            vx9 vx9Var = ((ms5) tj3Var2.m22128k(ps5.f56764b)).f51800b.f71411o;
            long jM10017O = d32.m10017O(0.8d);
            long j = xs1.f68632y;
            lw9.m16554b(upperCase, null, aa1.m198b(0.7f, j), null, 0L, null, null, jM10017O, null, null, 0L, 0, false, 0, 0, null, vx9Var, tj3Var2, 100663680, 0, 130810);
            lw9.m16555c(c3419on, null, j, new m20(d32.m10018P(11), d32.m10018P(18), d32.m10018P(1)), 0L, null, bc3.f8326l, 0L, null, 0L, 0, false, 1, 0, null, null, null, tj3Var2, ((i2 >> 3) & 14) | 1573248, 24576, 507826);
            tj3Var = tj3Var2;
            tj3Var.m22139q(true);
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3836zk(str, c3419on, e16Var, i, 8);
        }
    }
}
