package p000;

import android.app.job.JobParameters;
import android.content.Context;
import android.net.Uri;
import androidx.compose.foundation.AbstractC0080f;
import androidx.compose.material3.AbstractC0231g;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.p002ui.platform.AbstractC0394f;
import androidx.compose.runtime.AbstractC0278f;
import com.lingq.core.domain.model.challenge.Challenge;
import com.lingq.core.domain.model.challenge.ChallengeProfile;
import com.lingq.core.domain.model.challenge.ChallengeRanking;
import com.lingq.core.p012ui.challenges.ChallengeType;
import com.lingq.feature.challenges.R$string;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class q5d {
    /* JADX INFO: renamed from: a */
    public static final void m19667a(int i, ye1 ye1Var, e16 e16Var, List list) {
        e16 e16Var2;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-685414037);
        int i2 = i | 6 | (tj3Var.m22124i(list) ? 32 : 16);
        if (tj3Var.m22099R(i2 & 1, (i2 & 19) != 18)) {
            bb1 bb1VarM230a = ab1.m230a(new C3661uu(((fe9) tj3Var.m22128k(ge9.f40637a)).f38956e, true, new gm5(28)), nj0.f52791J, tj3Var, 0);
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
            lw9.m16554b(vz1.m23620a0(tj3Var, R$string.challenge_completed_books), null, 0L, null, 0L, null, bc3.f8322h, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var.m22128k(ps5.f56764b)).f51800b.f71403g, tj3Var, 1572864, 0, 131006);
            tj3Var = tj3Var;
            r46.m20381f(null, null, te1.m22000n(62, 4.0f), null, ci8.m4703P(1692185271, new eq0(list), tj3Var), tj3Var, 24576, 11);
            tj3Var.m22139q(true);
            e16Var2 = b16Var;
        } else {
            tj3Var.m22102U();
            e16Var2 = e16Var;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new fq0(e16Var2, list, i);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m19668b(e16 e16Var, ChallengeRanking challengeRanking, ChallengeType challengeType, ye1 ye1Var, int i) {
        e16 e16Var2;
        String str;
        tj3 tj3Var;
        String str2;
        String str3;
        ChallengeRanking challengeRanking2 = challengeRanking;
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(-2119164025);
        int i2 = i | 6 | (tj3Var2.m22124i(challengeRanking2) ? 32 : 16) | (tj3Var2.m22116e(challengeType.ordinal()) ? 256 : 128);
        if (tj3Var2.m22099R(i2 & 1, (i2 & 147) != 146)) {
            Context context = (Context) tj3Var2.m22128k(AbstractC0394f.f4761b);
            b16 b16Var = b16.f7762a;
            e16 e16VarM4412e = c99.m4412e(b16Var, 1.0f);
            zf1 zf1Var = ge9.f40637a;
            C3661uu c3661uu = new C3661uu(((fe9) tj3Var2.m22128k(zf1Var)).f38956e, true, new gm5(28));
            fc0 fc0Var = nj0.f52789H;
            sj8 sj8VarM20003a = qj8.m20003a(c3661uu, fc0Var, tj3Var2, 48);
            int iHashCode = Long.hashCode(tj3Var2.f62385T);
            l77 l77VarM22132m = tj3Var2.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var2, e16VarM4412e);
            se1.f60731q.getClass();
            ui3 ui3Var = C0352b.f4299b;
            tj3Var2.m22119f0();
            if (tj3Var2.f62384S) {
                tj3Var2.m22130l(ui3Var);
            } else {
                tj3Var2.m22137o0();
            }
            zi3 zi3Var = C0352b.f4303f;
            oha.m18001g(tj3Var2, zi3Var, sj8VarM20003a);
            zi3 zi3Var2 = C0352b.f4302e;
            oha.m18001g(tj3Var2, zi3Var2, l77VarM22132m);
            Integer numValueOf = Integer.valueOf(iHashCode);
            zi3 zi3Var3 = C0352b.f4304g;
            oha.m18001g(tj3Var2, zi3Var3, numValueOf);
            vi3 vi3Var = C0352b.f4305h;
            oha.m18000f(tj3Var2, vi3Var);
            zi3 zi3Var4 = C0352b.f4301d;
            oha.m18001g(tj3Var2, zi3Var4, e16VarM1322c);
            e16 e16VarM4426s = c99.m4426s(b16Var, 25.0f);
            int i3 = challengeRanking2.f18891a;
            ChallengeProfile challengeProfile = challengeRanking2.f18894d;
            String strValueOf = String.valueOf(i3);
            vh9 vh9Var = ps5.f56764b;
            lw9.m16554b(strValueOf, e16VarM4426s, 0L, new m20(vs9.f65864a, ((ms5) tj3Var2.m22128k(vh9Var)).f51800b.f71406j.f66065a.f42265b, d32.m10017O(0.25d)), 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var2.m22128k(vh9Var)).f51800b.f71406j, tj3Var2, 48, 0, 131060);
            if (challengeProfile == null || (str = challengeProfile.f18889g) == null) {
                str = "";
            }
            e16 e16VarM4422o = c99.m4422o(b16Var, 40.0f);
            si8 si8Var = ui8.f63972a;
            ss5.m21702b(str, null, pb1.m19045o(e16VarM4422o, si8Var), null, null, tj3Var2, 48, 4088);
            ChallengeType challengeType2 = ChallengeType.BookChallenge;
            if (challengeType == challengeType2) {
                tj3Var2.m22111b0(163946771);
                if (1.0f <= 0.0d) {
                    g54.m12362a("invalid weight; must be greater than zero");
                }
                as4 as4Var = new as4(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true);
                bb1 bb1VarM230a = ab1.m230a(eh0.f37238d, nj0.f52791J, tj3Var2, 0);
                int iHashCode2 = Long.hashCode(tj3Var2.f62385T);
                l77 l77VarM22132m2 = tj3Var2.m22132m();
                e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var2, as4Var);
                tj3Var2.m22119f0();
                if (tj3Var2.f62384S) {
                    tj3Var2.m22130l(ui3Var);
                } else {
                    tj3Var2.m22137o0();
                }
                oha.m18001g(tj3Var2, zi3Var, bb1VarM230a);
                oha.m18001g(tj3Var2, zi3Var2, l77VarM22132m2);
                AbstractC3393o1.m17747v(iHashCode2, tj3Var2, zi3Var3, tj3Var2, vi3Var);
                oha.m18001g(tj3Var2, zi3Var4, e16VarM1322c2);
                if (challengeProfile == null || (str3 = challengeProfile.f18884b) == null) {
                    str3 = "";
                }
                lw9.m16554b(str3, null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var2.m22128k(vh9Var)).f51800b.f71404h, tj3Var2, 0, 0, 131070);
                sj8 sj8VarM20003a2 = qj8.m20003a(new C3661uu(((fe9) tj3Var2.m22128k(zf1Var)).f38952a, true, new gm5(28)), fc0Var, tj3Var2, 48);
                int iHashCode3 = Long.hashCode(tj3Var2.f62385T);
                l77 l77VarM22132m3 = tj3Var2.m22132m();
                e16 e16VarM1322c3 = AbstractC0287b.m1322c(tj3Var2, b16Var);
                tj3Var2.m22119f0();
                if (tj3Var2.f62384S) {
                    tj3Var2.m22130l(ui3Var);
                } else {
                    tj3Var2.m22137o0();
                }
                oha.m18001g(tj3Var2, zi3Var, sj8VarM20003a2);
                oha.m18001g(tj3Var2, zi3Var2, l77VarM22132m3);
                AbstractC3393o1.m17747v(iHashCode3, tj3Var2, zi3Var3, tj3Var2, vi3Var);
                oha.m18001g(tj3Var2, zi3Var4, e16VarM1322c3);
                challengeRanking2 = challengeRanking;
                bq1.m4042R(AbstractC3423or.m18236U(AbstractC3423or.m18282v(context, challengeRanking2.f18896f), tj3Var2, 0), null, pb1.m19045o(c99.m4422o(b16Var, 16.0f), si8Var), null, null, 0.0f, null, tj3Var2, 56, 120);
                g4d.m12360a(challengeRanking2.f18895e, null, 0L, null, 0L, 0, false, 1, null, null, tj3Var2, 12582912, 894);
                tj3Var = tj3Var2;
                AbstractC3393o1.m17723A(tj3Var, true, true, false);
            } else {
                challengeRanking2 = challengeRanking;
                tj3Var2.m22111b0(164836967);
                if (1.0f <= 0.0d) {
                    g54.m12362a("invalid weight; must be greater than zero");
                }
                lw9.m16554b((challengeProfile == null || (str2 = challengeProfile.f18884b) == null) ? "" : str2, new as4(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 0L, null, 0L, null, null, 0L, null, new ks9(5), 0L, 0, false, 0, 0, null, null, tj3Var2, 0, 0, 261116);
                tj3Var = tj3Var2;
                tj3Var.m22139q(false);
            }
            tj3 tj3Var3 = tj3Var;
            lw9.m16554b(AbstractC3393o1.m17732g(challengeRanking2.f18892b, challengeType == challengeType2 ? "%" : ""), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var3, 0, 0, 262142);
            tj3Var2 = tj3Var3;
            tj3Var2.m22139q(true);
            e16Var2 = b16Var;
        } else {
            tj3Var2.m22102U();
            e16Var2 = e16Var;
        }
        x18 x18VarM22143u = tj3Var2.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3836zk(i, 2, e16Var2, challengeRanking2, challengeType);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m19669c(e16 e16Var, Challenge challenge, ye1 ye1Var, int i) {
        Challenge challenge2;
        e16 e16Var2;
        ui3 ui3Var;
        challenge.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1087841524);
        int i2 = i | 6 | (tj3Var.m22124i(challenge) ? 32 : 16);
        if (tj3Var.m22099R(i2 & 1, (i2 & 19) != 18)) {
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var = we1.f66679a;
            if (objM22097O == p84Var) {
                objM22097O = AbstractC0278f.m1260j(Boolean.FALSE);
                tj3Var.m22131l0(objM22097O);
            }
            t66 t66Var = (t66) objM22097O;
            C3661uu c3661uu = new C3661uu(ge9.m12515a(tj3Var).f38956e, true, new gm5(28));
            ec0 ec0Var = nj0.f52791J;
            bb1 bb1VarM230a = ab1.m230a(c3661uu, ec0Var, tj3Var, 0);
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
            e16 e16VarM4412e = c99.m4412e(b16Var, 1.0f);
            sj8 sj8VarM20003a = qj8.m20003a(new C3661uu(ge9.m12515a(tj3Var).f38956e, true, new gm5(28)), nj0.f52789H, tj3Var, 48);
            int iHashCode2 = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m2 = tj3Var.m22132m();
            e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var, e16VarM4412e);
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var2);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, zi3Var, sj8VarM20003a);
            oha.m18001g(tj3Var, zi3Var2, l77VarM22132m2);
            AbstractC3393o1.m17747v(iHashCode2, tj3Var, zi3Var3, tj3Var, vi3Var);
            oha.m18001g(tj3Var, zi3Var4, e16VarM1322c2);
            ss5.m21702b(challenge.f18861i, null, pb1.m19045o(c99.m4422o(b16Var, 80.0f), p58.m18901i(tj3Var).f64857c), null, null, tj3Var, 48, 4088);
            lw9.m16554b(challenge.f18855c, null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var).f71404h, tj3Var, 0, 0, 131070);
            tj3Var.m22139q(true);
            C3587su c3587su = eh0.f37238d;
            bb1 bb1VarM230a2 = ab1.m230a(c3587su, ec0Var, tj3Var, 0);
            int iHashCode3 = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m3 = tj3Var.m22132m();
            e16 e16VarM1322c3 = AbstractC0287b.m1322c(tj3Var, b16Var);
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                ui3Var = ui3Var2;
                tj3Var.m22130l(ui3Var);
            } else {
                ui3Var = ui3Var2;
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, zi3Var, bb1VarM230a2);
            oha.m18001g(tj3Var, zi3Var2, l77VarM22132m3);
            AbstractC3393o1.m17747v(iHashCode3, tj3Var, zi3Var3, tj3Var, vi3Var);
            oha.m18001g(tj3Var, zi3Var4, e16VarM1322c3);
            ui3 ui3Var3 = ui3Var;
            lw9.m16554b(String.valueOf(challenge.f18860h), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var).f71403g, tj3Var, 0, 0, 131070);
            lw9.m16554b(vz1.m23620a0(tj3Var, R$string.challenges_participants), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var, 0, 0, 262142);
            tj3Var.m22139q(true);
            bb1 bb1VarM230a3 = ab1.m230a(c3587su, nj0.f52793L, tj3Var, 48);
            int iHashCode4 = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m4 = tj3Var.m22132m();
            e16 e16VarM1322c4 = AbstractC0287b.m1322c(tj3Var, b16Var);
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var3);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, zi3Var, bb1VarM230a3);
            oha.m18001g(tj3Var, zi3Var2, l77VarM22132m4);
            AbstractC3393o1.m17747v(iHashCode4, tj3Var, zi3Var3, tj3Var, vi3Var);
            oha.m18001g(tj3Var, zi3Var4, e16VarM1322c4);
            challenge2 = challenge;
            e16Var2 = b16Var;
            lw9.m16554b(challenge2.f18856d, null, 0L, null, 0L, null, null, 0L, null, new ks9(5), 0L, 0, false, ((Boolean) t66Var.getValue()).booleanValue() ? Integer.MAX_VALUE : 3, 0, null, null, tj3Var, 0, 0, 244734);
            tj3Var = tj3Var;
            if (((Boolean) t66Var.getValue()).booleanValue()) {
                tj3Var.m22111b0(-398882863);
                tj3Var.m22139q(false);
            } else {
                tj3Var.m22111b0(-399130274);
                Object objM22097O2 = tj3Var.m22097O();
                if (objM22097O2 == p84Var) {
                    objM22097O2 = new C3799yk(2, t66Var);
                    tj3Var.m22131l0(objM22097O2);
                }
                lw9.m16554b(vz1.m23620a0(tj3Var, com.lingq.core.p012ui.R$string.ui_show_all), AbstractC0080f.m815b(null, false, (ui3) objM22097O2, e16Var2, 15), cx2.m9917a(tj3Var).m4208a(), null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var, 0, 0, 262136);
                tj3Var = tj3Var;
                tj3Var.m22139q(false);
            }
            tj3Var.m22139q(true);
            tj3Var.m22139q(true);
        } else {
            challenge2 = challenge;
            tj3Var.m22102U();
            e16Var2 = e16Var;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3598t4(e16Var2, i, 4, challenge2);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m19670d(fr0 fr0Var, vi3 vi3Var, vi3 vi3Var2, ye1 ye1Var, int i) {
        tj3 tj3Var;
        fr0Var.getClass();
        vi3Var.getClass();
        vi3Var2.getClass();
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(-901090738);
        int i2 = (tj3Var2.m22124i(fr0Var) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= tj3Var2.m22124i(vi3Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= tj3Var2.m22124i(vi3Var2) ? 256 : 128;
        }
        int i3 = 0;
        int i4 = 1;
        if (tj3Var2.m22099R(i2 & 1, (i2 & 147) != 146)) {
            tj3Var = tj3Var2;
            b34.m3232b(null, ci8.m4703P(-186138350, new dq0(vi3Var2, i3), tj3Var2), null, null, null, 0, 0L, 0L, null, ci8.m4703P(1006356317, new bq0(fr0Var, vi3Var, vi3Var2, i4), tj3Var2), tj3Var, 805306416, 509);
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C2956e9(i, 6, fr0Var, vi3Var, vi3Var2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [tj3, ye1] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v2, types: [int] */
    /* JADX WARN: Type inference failed for: r5v8, types: [boolean] */
    /* JADX INFO: renamed from: e */
    public static final void m19671e(int i, int i2, ye1 ye1Var, e16 e16Var) {
        ?? r5;
        int i3;
        e16 e16Var2;
        ec0 ec0Var = nj0.f52791J;
        ?? r2 = (tj3) ye1Var;
        r2.m22115d0(444734862);
        int i4 = i2 | 54;
        int i5 = 0;
        if (r2.m22099R(i4 & 1, (i4 & 19) != 18)) {
            e16Var2 = b16.f7762a;
            float f = 1.0f;
            e16 e16VarM4412e = c99.m4412e(e16Var2, 1.0f);
            bb1 bb1VarM230a = ab1.m230a(eh0.f37238d, ec0Var, r2, 0);
            int iHashCode = Long.hashCode(r2.f62385T);
            l77 l77VarM22132m = r2.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(r2, e16VarM4412e);
            se1.f60731q.getClass();
            ui3 ui3Var = C0352b.f4299b;
            r2.m22119f0();
            if (r2.f62384S) {
                r2.m22130l(ui3Var);
            } else {
                r2.m22137o0();
            }
            oha.m18001g(r2, C0352b.f4303f, bb1VarM230a);
            oha.m18001g(r2, C0352b.f4302e, l77VarM22132m);
            oha.m18001g(r2, C0352b.f4304g, Integer.valueOf(iHashCode));
            oha.m18000f(r2, C0352b.f4305h);
            oha.m18001g(r2, C0352b.f4301d, e16VarM1322c);
            r2.m22111b0(6606022);
            int i6 = 0;
            while (true) {
                i3 = 3;
                if (i6 >= 3) {
                    break;
                }
                e16 e16VarM4412e2 = c99.m4412e(e16Var2, f);
                sj8 sj8VarM20003a = qj8.m20003a(new C3661uu(ge9.m12515a(r2).f38956e, true, new gm5(28)), nj0.f52789H, r2, 48);
                int iHashCode2 = Long.hashCode(r2.f62385T);
                l77 l77VarM22132m2 = r2.m22132m();
                e16 e16VarM1322c2 = AbstractC0287b.m1322c(r2, e16VarM4412e2);
                se1.f60731q.getClass();
                ui3 ui3Var2 = C0352b.f4299b;
                r2.m22119f0();
                if (r2.f62384S) {
                    r2.m22130l(ui3Var2);
                } else {
                    r2.m22137o0();
                }
                zi3 zi3Var = C0352b.f4303f;
                oha.m18001g(r2, zi3Var, sj8VarM20003a);
                zi3 zi3Var2 = C0352b.f4302e;
                oha.m18001g(r2, zi3Var2, l77VarM22132m2);
                Integer numValueOf = Integer.valueOf(iHashCode2);
                zi3 zi3Var3 = C0352b.f4304g;
                oha.m18001g(r2, zi3Var3, numValueOf);
                vi3 vi3Var = C0352b.f4305h;
                oha.m18000f(r2, vi3Var);
                zi3 zi3Var4 = C0352b.f4301d;
                oha.m18001g(r2, zi3Var4, e16VarM1322c2);
                qh0.m19963a(x74.m24341H(pb1.m19045o(c99.m4422o(AbstractC3584sr.m21611X(AbstractC3584sr.m21607T(e16Var2, ge9.m12515a(r2).f38952a), ge9.m12515a(r2).f38955d, 0.0f, 0.0f, 0.0f, 14), 12.0f), ui8.m22752a(50))), r2, i5);
                qh0.m19963a(x74.m24341H(pb1.m19045o(c99.m4422o(AbstractC3584sr.m21611X(AbstractC3584sr.m21607T(e16Var2, ge9.m12515a(r2).f38952a), ge9.m12515a(r2).f38955d, 0.0f, 0.0f, 0.0f, 14), 40.0f), ui8.f63972a)), r2, i5);
                as4 as4Var = new as4(f, true);
                int i7 = i6;
                bb1 bb1VarM230a2 = ab1.m230a(new C3661uu(ge9.m12515a(r2).f38952a, true, new gm5(28)), ec0Var, r2, 0);
                int iHashCode3 = Long.hashCode(r2.f62385T);
                l77 l77VarM22132m3 = r2.m22132m();
                e16 e16VarM1322c3 = AbstractC0287b.m1322c(r2, as4Var);
                r2.m22119f0();
                if (r2.f62384S) {
                    r2.m22130l(ui3Var2);
                } else {
                    r2.m22137o0();
                }
                oha.m18001g(r2, zi3Var, bb1VarM230a2);
                oha.m18001g(r2, zi3Var2, l77VarM22132m3);
                AbstractC3393o1.m17747v(iHashCode3, r2, zi3Var3, r2, vi3Var);
                oha.m18001g(r2, zi3Var4, e16VarM1322c3);
                qh0.m19963a(x74.m24341H(pb1.m19045o(c99.m4414g(c99.m4412e(e16Var2, 0.5f), 12.0f), ui8.m22752a(50))), r2, 0);
                qh0.m19963a(x74.m24341H(pb1.m19045o(c99.m4414g(c99.m4412e(e16Var2, 0.3f), 8.0f), ui8.m22752a(50))), r2, 0);
                r2.m22139q(true);
                qh0.m19963a(x74.m24341H(pb1.m19045o(c99.m4426s(c99.m4414g(AbstractC3584sr.m21607T(e16Var2, ge9.m12515a(r2).f38952a), 12.0f), 24.0f), ui8.m22752a(50))), r2, 0);
                r2.m22139q(true);
                i5 = 0;
                i6 = i7 + 1;
                f = 1.0f;
            }
            ?? r6 = i5;
            r2.m22139q(r6);
            r2.m22139q(true);
            r5 = r6;
        } else {
            r5 = 0;
            r2.m22102U();
            i3 = i;
            e16Var2 = e16Var;
        }
        x18 x18VarM22143u = r2.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zp0(i3, i2, r5, e16Var2);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m19672f(e16 e16Var, ChallengeType challengeType, ye1 ye1Var, int i) {
        challengeType.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(736623651);
        int i2 = i | 6 | (tj3Var.m22116e(challengeType.ordinal()) ? 32 : 16);
        int i3 = 1;
        if (tj3Var.m22099R(i2 & 1, (i2 & 19) != 18)) {
            b16 b16Var = b16.f7762a;
            r46.m20381f(c99.m4412e(b16Var, 1.0f), null, te1.m22000n(62, 4.0f), null, ci8.m4703P(146844025, new se0(challengeType, i3), tj3Var), tj3Var, 24576, 10);
            e16Var = b16Var;
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3598t4(e16Var, i, 5, challengeType);
        }
    }

    /* JADX INFO: renamed from: g */
    public static final void m19673g(e16 e16Var, t17 t17Var, fr0 fr0Var, vi3 vi3Var, vi3 vi3Var2, ye1 ye1Var, int i) {
        int i2;
        vi3 vi3Var3;
        tj3 tj3Var;
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(-779279910);
        if ((i & 6) == 0) {
            i2 = (tj3Var2.m22120g(e16Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= tj3Var2.m22120g(t17Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= tj3Var2.m22124i(fr0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= tj3Var2.m22124i(vi3Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            vi3Var3 = vi3Var2;
            i2 |= tj3Var2.m22124i(vi3Var3) ? 16384 : 8192;
        } else {
            vi3Var3 = vi3Var2;
        }
        if (tj3Var2.m22099R(i2 & 1, (i2 & 9363) != 9362)) {
            Context context = (Context) tj3Var2.m22128k(AbstractC0394f.f4761b);
            zf1 zf1Var = ge9.f40637a;
            boolean z = true;
            e16 e16VarM21611X = AbstractC3584sr.m21611X(e16Var, ((fe9) tj3Var2.m22128k(zf1Var)).f38960i, t17Var.mo14021d(), ((fe9) tj3Var2.m22128k(zf1Var)).f38960i, 0.0f, 8);
            C3661uu c3661uu = new C3661uu(((fe9) tj3Var2.m22128k(zf1Var)).f38957f, true, new gm5(28));
            boolean zM22124i = tj3Var2.m22124i(fr0Var) | ((57344 & i2) == 16384);
            if ((i2 & 7168) != 2048) {
                z = false;
            }
            boolean zM22124i2 = zM22124i | z | tj3Var2.m22124i(context);
            Object objM22097O = tj3Var2.m22097O();
            if (zM22124i2 || objM22097O == we1.f66679a) {
                C3445p2 c3445p2 = new C3445p2((Object) fr0Var, vi3Var3, (Object) vi3Var, (Object) context, 4);
                tj3Var2.m22131l0(c3445p2);
                objM22097O = c3445p2;
            }
            tj3Var = tj3Var2;
            fa4.m11642c(e16VarM21611X, null, null, c3661uu, null, null, false, null, (vi3) objM22097O, tj3Var, 0, 494);
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new rb0(e16Var, (Object) t17Var, (Object) fr0Var, (Object) vi3Var, vi3Var2, i, 1);
        }
    }

    /* JADX INFO: renamed from: h */
    public static final void m19674h(e16 e16Var, ArrayList arrayList, String str, vi3 vi3Var, ye1 ye1Var, int i) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(363579719);
        int i2 = i | (tj3Var.m22124i(arrayList) ? 32 : 16) | (tj3Var.m22120g(str) ? 256 : 128) | (tj3Var.m22124i(vi3Var) ? 2048 : 1024);
        int i3 = 0;
        if (tj3Var.m22099R(i2 & 1, (i2 & 1171) != 1170)) {
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var = we1.f66679a;
            if (objM22097O == p84Var) {
                objM22097O = AbstractC0278f.m1260j(Boolean.FALSE);
                tj3Var.m22131l0(objM22097O);
            }
            t66 t66Var = (t66) objM22097O;
            e16 e16VarM4430w = c99.m4430w(e16Var, null, 3);
            ht5 ht5VarM19966d = qh0.m19966d(nj0.f52808c, false);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM4430w);
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
            Object objM22097O2 = tj3Var.m22097O();
            if (objM22097O2 == p84Var) {
                objM22097O2 = new C3799yk(3, t66Var);
                tj3Var.m22131l0(objM22097O2);
            }
            AbstractC0231g.m1153f(817889334, 380, null, tj3Var, (ui3) objM22097O2, ci8.m4703P(630031114, new iq0(str, i3), tj3Var), c99.m4430w(b16.f7762a, null, 3), AbstractC3584sr.m21622e(0.0f, 0.0f, 2), null, false);
            boolean zBooleanValue = ((Boolean) t66Var.getValue()).booleanValue();
            Object objM22097O3 = tj3Var.m22097O();
            if (objM22097O3 == p84Var) {
                objM22097O3 = new C3799yk(4, t66Var);
                tj3Var.m22131l0(objM22097O3);
            }
            AbstractC3003fj.m11885a(zBooleanValue, (ui3) objM22097O3, null, 0L, null, null, null, 0L, 0.0f, ci8.m4703P(1332465522, new ik0(arrayList, vi3Var, t66Var, 1), tj3Var), tj3Var, 48, 2044);
            tj3Var = tj3Var;
            tj3Var.m22139q(true);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C2919d9((Object) e16Var, (Object) arrayList, (Object) str, (xi3) vi3Var, i, 3);
        }
    }

    /* JADX INFO: renamed from: i */
    public static String[] m19675i(JobParameters jobParameters) {
        return jobParameters.getTriggeredContentAuthorities();
    }

    /* JADX INFO: renamed from: j */
    public static Uri[] m19676j(JobParameters jobParameters) {
        return jobParameters.getTriggeredContentUris();
    }
}
