package p000;

import androidx.compose.foundation.AbstractC0080f;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import com.lingq.core.domain.model.challenge.Challenge;
import com.lingq.core.domain.model.challenge.ChallengeStatus;
import com.lingq.core.p012ui.R$string;
import com.lingq.feature.challenges.R$plurals;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public abstract class t5d {
    /* JADX INFO: renamed from: a */
    public static final void m21852a(Challenge challenge, vi3 vi3Var, ui3 ui3Var, ye1 ye1Var, int i) {
        boolean z;
        zi3 zi3Var;
        boolean z2;
        long jM198b;
        String strM23620a0;
        long jM4212e;
        challenge.getClass();
        int i2 = challenge.f18863k;
        int i3 = challenge.f18860h;
        String str = challenge.f18858f;
        String str2 = challenge.f18857e;
        vi3Var.getClass();
        ui3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(2115975306);
        int i4 = i | (tj3Var.m22124i(challenge) ? 4 : 2) | (tj3Var.m22124i(vi3Var) ? 32 : 16) | (tj3Var.m22124i(ui3Var) ? 256 : 128);
        if (tj3Var.m22099R(i4 & 1, (i4 & 147) != 146)) {
            b16 b16Var = b16.f7762a;
            e16 e16VarM19045o = pb1.m19045o(AbstractC3584sr.m21609V(c99.m4412e(b16Var, 1.0f), ge9.m12515a(tj3Var).f38956e, 0.0f, 2), p58.m18901i(tj3Var).f64857c);
            boolean zM22124i = ((i4 & 112) == 32) | tj3Var.m22124i(challenge);
            Object objM22097O = tj3Var.m22097O();
            int i5 = 5;
            if (zM22124i || objM22097O == we1.f66679a) {
                objM22097O = new C3577sk(i5, vi3Var, challenge);
                tj3Var.m22131l0(objM22097O);
            }
            e16 e16VarM815b = AbstractC0080f.m815b(null, false, (ui3) objM22097O, e16VarM19045o, 15);
            jj5 jj5Var = eh0.f37242h;
            fc0 fc0Var = nj0.f52789H;
            sj8 sj8VarM20003a = qj8.m20003a(jj5Var, fc0Var, tj3Var, 54);
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
            zi3 zi3Var2 = C0352b.f4303f;
            oha.m18001g(tj3Var, zi3Var2, sj8VarM20003a);
            zi3 zi3Var3 = C0352b.f4302e;
            oha.m18001g(tj3Var, zi3Var3, l77VarM22132m);
            Integer numValueOf = Integer.valueOf(iHashCode);
            zi3 zi3Var4 = C0352b.f4304g;
            oha.m18001g(tj3Var, zi3Var4, numValueOf);
            vi3 vi3Var2 = C0352b.f4305h;
            oha.m18000f(tj3Var, vi3Var2);
            zi3 zi3Var5 = C0352b.f4301d;
            oha.m18001g(tj3Var, zi3Var5, e16VarM1322c);
            ss5.m21702b(challenge.f18861i, null, AbstractC3584sr.m21609V(AbstractC3584sr.m21611X(c99.m4422o(b16Var, 90.0f), 0.0f, 0.0f, ge9.m12515a(tj3Var).f38965n, 0.0f, 11), 0.0f, ge9.m12515a(tj3Var).f38952a, 1), null, null, tj3Var, 48, 4088);
            tj3 tj3Var2 = tj3Var;
            e16 e16VarM21609V = AbstractC3584sr.m21609V(new as4(1.0f, true), ge9.m12515a(tj3Var2).f38952a, 0.0f, 2);
            bb1 bb1VarM230a = ab1.m230a(new C3661uu(ge9.m12515a(tj3Var2).f38954c, true, new gm5(28)), nj0.f52791J, tj3Var2, 0);
            int iHashCode2 = Long.hashCode(tj3Var2.f62385T);
            l77 l77VarM22132m2 = tj3Var2.m22132m();
            e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var2, e16VarM21609V);
            tj3Var2.m22119f0();
            if (tj3Var2.f62384S) {
                tj3Var2.m22130l(ui3Var2);
            } else {
                tj3Var2.m22137o0();
            }
            oha.m18001g(tj3Var2, zi3Var2, bb1VarM230a);
            oha.m18001g(tj3Var2, zi3Var3, l77VarM22132m2);
            AbstractC3393o1.m17747v(iHashCode2, tj3Var2, zi3Var4, tj3Var2, vi3Var2);
            oha.m18001g(tj3Var2, zi3Var5, e16VarM1322c2);
            if (str2 == null || str == null) {
                z = false;
                zi3Var = zi3Var4;
                tj3Var2.m22111b0(110841214);
                tj3Var2.m22139q(false);
            } else {
                tj3Var2.m22111b0(110454458);
                zi3Var = zi3Var4;
                z = false;
                lw9.m16554b(String.format(Locale.US, "%s - %s", Arrays.copyOf(new Object[]{y02.m24807e(str2, (3 & 1) != 0 ? "yyyy-MM-dd'T'HH:mm:ss" : "yyyy-MM-dd", (3 & 2) != 0 ? "MMM dd, yyyy" : "dd MMM, yyyy"), y02.m24807e(str, (3 & 1) != 0 ? "yyyy-MM-dd'T'HH:mm:ss" : "yyyy-MM-dd", (3 & 2) != 0 ? "MMM dd, yyyy" : "dd MMM, yyyy")}, 2)), null, 0L, null, 0L, null, bc3.f8320f, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var2).f71411o, tj3Var2, 1572864, 0, 131006);
                tj3Var2 = tj3Var2;
                tj3Var2.m22139q(false);
            }
            tj3 tj3Var3 = tj3Var2;
            lw9.m16554b(challenge.f18855c, null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var2).f71404h, tj3Var3, 0, 0, 131070);
            lw9.m16554b(vz1.m23612R(R$plurals.challenges_participants, i3, new Object[]{Integer.valueOf(i3)}, tj3Var3), null, aa1.m198b(0.5f, p58.m18900f(tj3Var3).f55870o), null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var3).f71411o, tj3Var3, 0, 0, 131066);
            tj3Var3.m22139q(true);
            ChallengeStatus challengeStatusM148f = a6d.m148f(challenge);
            challengeStatusM148f.getClass();
            if (challengeStatusM148f == ChallengeStatus.Joined || challengeStatusM148f == ChallengeStatus.CanJoin) {
                tj3Var3.m22111b0(1167494815);
                if (challenge.f18862j) {
                    tj3Var3.m22111b0(1167491002);
                    e16 e16VarM10007D = d32.m10007D(pb1.m19045o(te1.m21995i(1.0f, c99.m4422o(b16Var, 48.0f), z), p58.m18901i(tj3Var3).f64859e), p58.m18900f(tj3Var3).f55874r, ss5.f61356d);
                    ht5 ht5VarM19966d = qh0.m19966d(nj0.f52812g, z);
                    int iHashCode3 = Long.hashCode(tj3Var3.f62385T);
                    l77 l77VarM22132m3 = tj3Var3.m22132m();
                    e16 e16VarM1322c3 = AbstractC0287b.m1322c(tj3Var3, e16VarM10007D);
                    tj3Var3.m22119f0();
                    if (tj3Var3.f62384S) {
                        tj3Var3.m22130l(ui3Var2);
                    } else {
                        tj3Var3.m22137o0();
                    }
                    oha.m18001g(tj3Var3, zi3Var2, ht5VarM19966d);
                    oha.m18001g(tj3Var3, zi3Var3, l77VarM22132m3);
                    AbstractC3393o1.m17747v(iHashCode3, tj3Var3, zi3Var, tj3Var3, vi3Var2);
                    oha.m18001g(tj3Var3, zi3Var5, e16VarM1322c3);
                    if (i2 > 0) {
                        tj3Var3.m22111b0(800787473);
                        String strM23620a1 = vz1.m23620a0(tj3Var3, R$string.challenges_rank);
                        int i6 = i2;
                        if (i6 > i3) {
                            i6 = i3;
                        }
                        g4d.m12360a(strM23620a1 + "\n" + i6, null, 0L, new ks9(3), 0L, 0, false, 2, p58.m18902j(tj3Var3).f71407k, null, tj3Var3, 12582912, 630);
                        tj3Var = tj3Var3;
                        tj3Var.m22139q(z);
                    } else {
                        tj3Var3.m22111b0(801229998);
                        dn7.m10492a(c99.m4422o(b16Var, 24.0f), p58.m18900f(tj3Var3).f55852f, 0.0f, 0L, 0, 0.0f, tj3Var3, 6, 60);
                        tj3Var = tj3Var3;
                        tj3Var.m22139q(z);
                    }
                    tj3Var.m22139q(true);
                    tj3Var.m22139q(z);
                    z2 = true;
                } else {
                    tj3Var3.m22111b0(1168668847);
                    e16 e16VarM21608U = AbstractC3584sr.m21608U(AbstractC0080f.m815b(null, z, ui3Var, pb1.m19045o(d32.m10007D(b16Var, aa1.m198b(0.2f, cx2.m9917a(tj3Var3).m4208a()), p58.m18901i(tj3Var3).f64855a), p58.m18901i(tj3Var3).f64855a), 15), ge9.m12515a(tj3Var3).f38952a, ge9.m12515a(tj3Var3).f38955d);
                    sj8 sj8VarM20003a2 = qj8.m20003a(eh0.f37236b, fc0Var, tj3Var3, 48);
                    int iHashCode4 = Long.hashCode(tj3Var3.f62385T);
                    l77 l77VarM22132m4 = tj3Var3.m22132m();
                    e16 e16VarM1322c4 = AbstractC0287b.m1322c(tj3Var3, e16VarM21608U);
                    tj3Var3.m22119f0();
                    if (tj3Var3.f62384S) {
                        tj3Var3.m22130l(ui3Var2);
                    } else {
                        tj3Var3.m22137o0();
                    }
                    oha.m18001g(tj3Var3, zi3Var2, sj8VarM20003a2);
                    oha.m18001g(tj3Var3, zi3Var3, l77VarM22132m4);
                    AbstractC3393o1.m17747v(iHashCode4, tj3Var3, zi3Var, tj3Var3, vi3Var2);
                    oha.m18001g(tj3Var3, zi3Var5, e16VarM1322c4);
                    lw9.m16554b(vz1.m23620a0(tj3Var3, com.lingq.feature.challenges.R$string.challenges_join), null, cx2.m9917a(tj3Var3).m4208a(), null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var3).f71410n, tj3Var3, 0, 0, 131066);
                    tj3Var = tj3Var3;
                    bq1.m4041Q(h2d.m13016b(), null, c99.m4422o(b16Var, 16.0f), new qd0(5, cx2.m9917a(tj3Var3).m4208a()), tj3Var, 432, 56);
                    z2 = true;
                    tj3Var.m22139q(true);
                    tj3Var.m22139q(z);
                }
                tj3Var.m22139q(z);
            } else {
                tj3Var3.m22111b0(1169958416);
                e16 e16VarM21611X = AbstractC3584sr.m21611X(b16Var, 0.0f, ge9.m12515a(tj3Var3).f38952a, 0.0f, 0.0f, 13);
                ChallengeStatus challengeStatusM148f2 = a6d.m148f(challenge);
                ChallengeStatus challengeStatus = ChallengeStatus.Successful;
                if (challengeStatusM148f2 == challengeStatus) {
                    tj3Var3.m22111b0(1170164194);
                    jM198b = aa1.m198b(0.3f, cx2.m9917a(tj3Var3).m4212e());
                    tj3Var3.m22139q(z);
                } else {
                    tj3Var3.m22111b0(1170282335);
                    tj3Var3.m22139q(z);
                    jM198b = aa1.m198b(0.3f, aa1.f404c);
                }
                e16 e16VarMo3161g = AbstractC3584sr.m21607T(d32.m10007D(e16VarM21611X, jM198b, p58.m18901i(tj3Var3).f64855a), ge9.m12515a(tj3Var3).f38955d).mo3161g(new opa(nj0.f52817l));
                ht5 ht5VarM19966d2 = qh0.m19966d(nj0.f52808c, z);
                int iHashCode5 = Long.hashCode(tj3Var3.f62385T);
                l77 l77VarM22132m5 = tj3Var3.m22132m();
                e16 e16VarM1322c5 = AbstractC0287b.m1322c(tj3Var3, e16VarMo3161g);
                tj3Var3.m22119f0();
                if (tj3Var3.f62384S) {
                    tj3Var3.m22130l(ui3Var2);
                } else {
                    tj3Var3.m22137o0();
                }
                oha.m18001g(tj3Var3, zi3Var2, ht5VarM19966d2);
                oha.m18001g(tj3Var3, zi3Var3, l77VarM22132m5);
                AbstractC3393o1.m17747v(iHashCode5, tj3Var3, zi3Var, tj3Var3, vi3Var2);
                oha.m18001g(tj3Var3, zi3Var5, e16VarM1322c5);
                if (a6d.m148f(challenge) == challengeStatus) {
                    tj3Var3.m22111b0(-1779371805);
                    strM23620a0 = vz1.m23620a0(tj3Var3, com.lingq.feature.challenges.R$string.challenge_successful);
                    tj3Var3.m22139q(z);
                } else {
                    tj3Var3.m22111b0(-1779263615);
                    strM23620a0 = vz1.m23620a0(tj3Var3, com.lingq.feature.challenges.R$string.challenge_unsuccessful);
                    tj3Var3.m22139q(z);
                }
                String str3 = strM23620a0;
                if (a6d.m148f(challenge) == challengeStatus) {
                    tj3Var3.m22111b0(-1779073709);
                    jM4212e = cx2.m9917a(tj3Var3).m4212e();
                    tj3Var3.m22139q(z);
                } else {
                    tj3Var3.m22111b0(-1778982352);
                    tj3Var3.m22139q(z);
                    jM4212e = aa1.f404c;
                }
                lw9.m16554b(str3, null, jM4212e, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var3, 0, 0, 262138);
                tj3Var = tj3Var3;
                tj3Var.m22139q(true);
                tj3Var.m22139q(z);
                z2 = true;
            }
            tj3Var.m22139q(z2);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3836zk(i, 3, challenge, vi3Var, ui3Var);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final int m21853b(c06 c06Var) {
        return System.identityHashCode(c06Var);
    }
}
