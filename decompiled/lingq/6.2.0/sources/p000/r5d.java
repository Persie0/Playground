package p000;

import android.app.job.JobParameters;
import androidx.compose.foundation.AbstractC0080f;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import com.lingq.core.domain.model.challenge.Challenge;
import com.lingq.core.p012ui.R$string;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public abstract class r5d {
    /* JADX INFO: renamed from: a */
    public static final void m20417a(final Challenge challenge, final zi3 zi3Var, ye1 ye1Var, int i) {
        int i2;
        b16 b16Var;
        boolean z;
        challenge.getClass();
        String str = challenge.f18858f;
        String str2 = challenge.f18857e;
        zi3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1617942286);
        int i3 = i | (tj3Var.m22124i(challenge) ? 4 : 2);
        if ((i & 48) == 0) {
            i3 |= tj3Var.m22124i(zi3Var) ? 32 : 16;
        }
        final int i4 = 0;
        if (tj3Var.m22099R(i3 & 1, (i3 & 19) != 18)) {
            b16 b16Var2 = b16.f7762a;
            e16 e16VarM19045o = pb1.m19045o(AbstractC3584sr.m21609V(c99.m4412e(b16Var2, 1.0f), ge9.m12515a(tj3Var).f38956e, 0.0f, 2), p58.m18901i(tj3Var).f64857c);
            int i5 = i3 & 112;
            boolean zM22124i = (i5 == 32) | tj3Var.m22124i(challenge);
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var = we1.f66679a;
            if (zM22124i || objM22097O == p84Var) {
                objM22097O = new ui3() { // from class: ir0
                    @Override // p000.ui3
                    /* JADX INFO: renamed from: a */
                    public final Object mo0a() {
                        int i6 = i4;
                        xfa xfaVar = xfa.f68157a;
                        Challenge challenge2 = challenge;
                        zi3 zi3Var2 = zi3Var;
                        switch (i6) {
                            case 0:
                                zi3Var2.invoke(challenge2, Boolean.FALSE);
                                break;
                            default:
                                zi3Var2.invoke(challenge2, Boolean.TRUE);
                                break;
                        }
                        return xfaVar;
                    }
                };
                tj3Var.m22131l0(objM22097O);
            }
            e16 e16VarM815b = AbstractC0080f.m815b(null, false, (ui3) objM22097O, e16VarM19045o, 15);
            sj8 sj8VarM20003a = qj8.m20003a(eh0.f37242h, nj0.f52789H, tj3Var, 54);
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
            zi3 zi3Var2 = C0352b.f4303f;
            oha.m18001g(tj3Var, zi3Var2, sj8VarM20003a);
            zi3 zi3Var3 = C0352b.f4302e;
            oha.m18001g(tj3Var, zi3Var3, l77VarM22132m);
            Integer numValueOf = Integer.valueOf(iHashCode);
            zi3 zi3Var4 = C0352b.f4304g;
            oha.m18001g(tj3Var, zi3Var4, numValueOf);
            vi3 vi3Var = C0352b.f4305h;
            oha.m18000f(tj3Var, vi3Var);
            zi3 zi3Var5 = C0352b.f4301d;
            oha.m18001g(tj3Var, zi3Var5, e16VarM1322c);
            String str3 = challenge.f18861i;
            if (1.0f <= 0.0d) {
                g54.m12362a("invalid weight; must be greater than zero");
            }
            ss5.m21702b(str3, null, AbstractC3584sr.m21609V(AbstractC3584sr.m21611X(te1.m21995i(1.0f, new as4(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), false), 0.0f, 0.0f, ge9.m12515a(tj3Var).f38965n, 0.0f, 11), 0.0f, ge9.m12515a(tj3Var).f38952a, 1), null, null, tj3Var, 48, 4088);
            if (3.0f <= 0.0d) {
                g54.m12362a("invalid weight; must be greater than zero");
            }
            e16 e16VarM21609V = AbstractC3584sr.m21609V(new as4(3.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 3.0f, true), ge9.m12515a(tj3Var).f38952a, 0.0f, 2);
            bb1 bb1VarM230a = ab1.m230a(eh0.f37240f, nj0.f52791J, tj3Var, 6);
            int iHashCode2 = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m2 = tj3Var.m22132m();
            e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var, e16VarM21609V);
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, zi3Var2, bb1VarM230a);
            oha.m18001g(tj3Var, zi3Var3, l77VarM22132m2);
            AbstractC3393o1.m17747v(iHashCode2, tj3Var, zi3Var4, tj3Var, vi3Var);
            oha.m18001g(tj3Var, zi3Var5, e16VarM1322c2);
            lw9.m16554b(challenge.f18855c, null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var).f71405i, tj3Var, 0, 0, 131070);
            tj3 tj3Var2 = tj3Var;
            thb.m22044c(tj3Var2, c99.m4414g(b16Var2, ge9.m12515a(tj3Var2).f38952a));
            if (str2 == null || str == null) {
                b16Var = b16Var2;
                i2 = 3;
                z = false;
                tj3Var2.m22111b0(2085041078);
                tj3Var2.m22139q(false);
            } else {
                tj3Var2.m22111b0(2084687430);
                i2 = 3;
                b16Var = b16Var2;
                lw9.m16554b(String.format(Locale.US, "%s - %s", Arrays.copyOf(new Object[]{y02.m24807e(str2, (3 & 1) != 0 ? "yyyy-MM-dd'T'HH:mm:ss" : "yyyy-MM-dd", (3 & 2) != 0 ? "MMM dd, yyyy" : "dd MMM, yyyy"), y02.m24807e(str, (3 & 1) != 0 ? "yyyy-MM-dd'T'HH:mm:ss" : "yyyy-MM-dd", (3 & 2) != 0 ? "MMM dd, yyyy" : "dd MMM, yyyy")}, 2)), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var2).f71408l, tj3Var2, 0, 0, 131070);
                tj3Var2 = tj3Var2;
                z = false;
                tj3Var2.m22139q(false);
            }
            tj3Var2.m22139q(true);
            if (challenge.f18862j) {
                tj3Var2.m22111b0(-1055683714);
                e16 e16VarM10007D = d32.m10007D(pb1.m19045o(te1.m21995i(1.0f, c99.m4422o(b16Var, 48.0f), z), p58.m18901i(tj3Var2).f64859e), p58.m18900f(tj3Var2).f55874r, ss5.f61356d);
                ht5 ht5VarM19966d = qh0.m19966d(nj0.f52812g, z);
                int iHashCode3 = Long.hashCode(tj3Var2.f62385T);
                l77 l77VarM22132m3 = tj3Var2.m22132m();
                e16 e16VarM1322c3 = AbstractC0287b.m1322c(tj3Var2, e16VarM10007D);
                tj3Var2.m22119f0();
                if (tj3Var2.f62384S) {
                    tj3Var2.m22130l(ui3Var);
                } else {
                    tj3Var2.m22137o0();
                }
                oha.m18001g(tj3Var2, zi3Var2, ht5VarM19966d);
                oha.m18001g(tj3Var2, zi3Var3, l77VarM22132m3);
                AbstractC3393o1.m17747v(iHashCode3, tj3Var2, zi3Var4, tj3Var2, vi3Var);
                oha.m18001g(tj3Var2, zi3Var5, e16VarM1322c3);
                tj3 tj3Var3 = tj3Var2;
                g4d.m12360a(vz1.m23620a0(tj3Var2, R$string.challenges_rank) + "\n" + Math.min(challenge.f18863k, challenge.f18860h), null, 0L, new ks9(i2), 0L, 0, false, 2, p58.m18902j(tj3Var2).f71407k, null, tj3Var3, 12582912, 630);
                tj3Var = tj3Var3;
                tj3Var.m22139q(true);
                tj3Var.m22139q(z);
            } else {
                tj3Var2.m22111b0(-1054934289);
                boolean zM22124i2 = tj3Var2.m22124i(challenge) | (i5 == 32 ? true : z);
                Object objM22097O2 = tj3Var2.m22097O();
                if (zM22124i2 || objM22097O2 == p84Var) {
                    final int i6 = 1;
                    objM22097O2 = new ui3() { // from class: ir0
                        @Override // p000.ui3
                        /* JADX INFO: renamed from: a */
                        public final Object mo0a() {
                            int i7 = i6;
                            xfa xfaVar = xfa.f68157a;
                            Challenge challenge2 = challenge;
                            zi3 zi3Var6 = zi3Var;
                            switch (i7) {
                                case 0:
                                    zi3Var6.invoke(challenge2, Boolean.FALSE);
                                    break;
                                default:
                                    zi3Var6.invoke(challenge2, Boolean.TRUE);
                                    break;
                            }
                            return xfaVar;
                        }
                    };
                    tj3Var2.m22131l0(objM22097O2);
                }
                e16 e16VarM19045o2 = pb1.m19045o(te1.m21995i(1.0f, c99.m4422o(b16Var, 48.0f), z), p58.m18901i(tj3Var2).f64859e);
                int i7 = my3.f52030a;
                tj3 tj3Var4 = tj3Var2;
                omd.m18141c((ui3) objM22097O2, e16VarM19045o2, false, my3.m17149b(p58.m18900f(tj3Var2).f55874r, cx2.m9917a(tj3Var2).m4208a(), tj3Var2, 12), null, pnb.f56537a, tj3Var4, 1572864, 52);
                tj3Var = tj3Var4;
                tj3Var.m22139q(z);
            }
            tj3Var.m22139q(true);
        } else {
            i2 = 3;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3709w4(challenge, i, i2, zi3Var);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m20418b(JobParameters jobParameters) {
        jobParameters.getNetwork();
    }
}
