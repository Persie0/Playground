package p000;

import android.content.Context;
import androidx.compose.animation.AbstractC0054a;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.p002ui.platform.AbstractC0394f;
import androidx.compose.runtime.AbstractC0278f;
import com.lingq.core.achievements.DailyGoal;
import com.lingq.feature.onboarding.R$string;
import p000.C3661uu;
import p000.ab1;
import p000.b16;
import p000.bb1;
import p000.ct6;
import p000.d32;
import p000.db1;
import p000.dt6;
import p000.e16;
import p000.fe9;
import p000.ge9;
import p000.gm5;
import p000.l77;
import p000.nj0;
import p000.oha;
import p000.p84;
import p000.se1;
import p000.t66;
import p000.tj3;
import p000.txb;
import p000.ui3;
import p000.vi3;
import p000.vz1;
import p000.we1;
import p000.xfa;
import p000.ye1;
import p000.ypc;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
public abstract class n7d {

    /* JADX INFO: renamed from: a */
    public static p04 f52469a;

    /* JADX INFO: renamed from: a */
    public static final void m17275a(final String str, final int i, final String str2, final vi3 vi3Var, boolean z, ui3 ui3Var, e16 e16Var, ye1 ye1Var, int i2) {
        e16 e16Var2;
        str.getClass();
        str2.getClass();
        vi3Var.getClass();
        ui3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1781969560);
        int i3 = i2 | (tj3Var.m22120g(str) ? 4 : 2) | (tj3Var.m22116e(i) ? 32 : 16) | (tj3Var.m22120g(str2) ? 256 : 128) | (tj3Var.m22124i(vi3Var) ? 2048 : 1024) | (tj3Var.m22122h(z) ? 16384 : 8192) | (tj3Var.m22124i(ui3Var) ? 131072 : 65536) | 1572864;
        if (tj3Var.m22099R(i3 & 1, (599187 & i3) != 599186)) {
            b16 b16Var = b16.f7762a;
            gxb.m12966b(vz1.m23618Z(R$string.onboarding_v2_time_title_dynamic, new Object[]{AbstractC3352my.m17093L((Context) tj3Var.m22128k(AbstractC0394f.f4761b), str)}, tj3Var), z, vz1.m23620a0(tj3Var, com.lingq.core.p012ui.R$string.ui_continue), ui3Var, b16Var, null, ci8.m4703P(-332574282, new aj3() { // from class: com.lingq.feature.onboarding.v2.pages.b
                @Override // p000.aj3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    Object timeCommitmentPageKt$TimeCommitmentPage$1$1$1;
                    ye1 ye1Var2 = (ye1) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((db1) obj).getClass();
                    tj3 tj3Var2 = (tj3) ye1Var2;
                    if (tj3Var2.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
                        Object objM22097O = tj3Var2.m22097O();
                        p84 p84Var = we1.f66679a;
                        if (objM22097O == p84Var) {
                            objM22097O = AbstractC0278f.m1260j(null);
                            tj3Var2.m22131l0(objM22097O);
                        }
                        t66 t66Var = (t66) objM22097O;
                        Object objM22097O2 = tj3Var2.m22097O();
                        if (objM22097O2 == p84Var) {
                            objM22097O2 = AbstractC0278f.m1260j(Boolean.TRUE);
                            tj3Var2.m22131l0(objM22097O2);
                        }
                        t66 t66Var2 = (t66) objM22097O2;
                        int i4 = i;
                        Integer numValueOf = Integer.valueOf(i4);
                        String str3 = str;
                        boolean zM22120g = tj3Var2.m22120g(str3);
                        String str4 = str2;
                        boolean zM22120g2 = zM22120g | tj3Var2.m22120g(str4) | tj3Var2.m22116e(i4);
                        Object objM22097O3 = tj3Var2.m22097O();
                        if (zM22120g2 || objM22097O3 == p84Var) {
                            timeCommitmentPageKt$TimeCommitmentPage$1$1$1 = new TimeCommitmentPageKt$TimeCommitmentPage$1$1$1(str3, str4, i4, t66Var, t66Var2, null);
                            tj3Var2.m22131l0(timeCommitmentPageKt$TimeCommitmentPage$1$1$1);
                        } else {
                            timeCommitmentPageKt$TimeCommitmentPage$1$1$1 = objM22097O3;
                        }
                        d32.m10047k(tj3Var2, (zi3) timeCommitmentPageKt$TimeCommitmentPage$1$1$1, numValueOf);
                        bb1 bb1VarM230a = ab1.m230a(new C3661uu(((fe9) tj3Var2.m22128k(ge9.f40637a)).f38963l, true, new gm5(28)), nj0.f52791J, tj3Var2, 0);
                        int iHashCode = Long.hashCode(tj3Var2.f62385T);
                        l77 l77VarM22132m = tj3Var2.m22132m();
                        e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var2, b16.f7762a);
                        se1.f60731q.getClass();
                        ui3 ui3Var2 = C0352b.f4299b;
                        tj3Var2.m22119f0();
                        if (tj3Var2.f62384S) {
                            tj3Var2.m22130l(ui3Var2);
                        } else {
                            tj3Var2.m22137o0();
                        }
                        oha.m18001g(tj3Var2, C0352b.f4303f, bb1VarM230a);
                        oha.m18001g(tj3Var2, C0352b.f4302e, l77VarM22132m);
                        oha.m18001g(tj3Var2, C0352b.f4304g, Integer.valueOf(iHashCode));
                        oha.m18000f(tj3Var2, C0352b.f4305h);
                        oha.m18001g(tj3Var2, C0352b.f4301d, e16VarM1322c);
                        tj3Var2.m22111b0(1301847127);
                        for (DailyGoal dailyGoal : DailyGoal.getEntries()) {
                            String strM23618Z = vz1.m23618Z(dailyGoal.getDescExtra(), new Object[]{Integer.valueOf(dailyGoal.getMins())}, tj3Var2);
                            String strM23620a0 = vz1.m23620a0(tj3Var2, dailyGoal.getDesc());
                            boolean z2 = i4 == dailyGoal.getMins();
                            vi3 vi3Var2 = vi3Var;
                            boolean zM22120g3 = tj3Var2.m22120g(vi3Var2) | tj3Var2.m22116e(dailyGoal.ordinal());
                            Object objM22097O4 = tj3Var2.m22097O();
                            if (zM22120g3 || objM22097O4 == p84Var) {
                                objM22097O4 = new ct6(vi3Var2, dailyGoal, 1);
                                tj3Var2.m22131l0(objM22097O4);
                            }
                            txb.m22339e(0, tj3Var2, (ui3) objM22097O4, null, strM23618Z, strM23620a0, z2);
                        }
                        tj3Var2.m22139q(false);
                        Integer num = (Integer) t66Var.getValue();
                        Object objM22097O5 = tj3Var2.m22097O();
                        if (objM22097O5 == p84Var) {
                            objM22097O5 = new dt6(20, t66Var2);
                            tj3Var2.m22131l0(objM22097O5);
                        }
                        AbstractC0054a.m727b(num, null, (vi3) objM22097O5, nj0.f52812g, "learnWords", null, ypc.f70279a, tj3Var2, 1600896, 34);
                        tj3Var2.m22139q(true);
                    } else {
                        tj3Var2.m22102U();
                    }
                    return xfa.f68157a;
                }
            }, tj3Var), tj3Var, ((i3 >> 6) & 7168) | 1572864 | ((i3 >> 9) & 112) | 24576, 32);
            e16Var2 = b16Var;
        } else {
            tj3Var.m22102U();
            e16Var2 = e16Var;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new gb5(str, i, str2, vi3Var, z, ui3Var, e16Var2, i2);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final p04 m17276b() {
        p04 p04Var = f52469a;
        if (p04Var != null) {
            return p04Var;
        }
        o04 o04Var = new o04("Rounded.ChevronRight", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = soa.f61116a;
        pd9 pd9Var = new pd9(aa1.f403b);
        f57 f57VarM17730e = AbstractC3393o1.m17730e(9.29f, 6.71f);
        f57VarM17730e.m11548c(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        f57VarM17730e.m11551f(13.17f, 12.0f);
        f57VarM17730e.m11552g(-3.88f, 3.88f);
        f57VarM17730e.m11548c(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        f57VarM17730e.m11548c(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        f57VarM17730e.m11552g(4.59f, -4.59f);
        f57VarM17730e.m11548c(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        f57VarM17730e.m11551f(10.7f, 6.7f);
        f57VarM17730e.m11548c(-0.38f, -0.38f, -1.02f, -0.38f, -1.41f, 0.01f);
        f57VarM17730e.m11546a();
        o04.m17720a(o04Var, f57VarM17730e.f38440a, pd9Var);
        p04 p04VarM17721b = o04Var.m17721b();
        f52469a = p04VarM17721b;
        return p04VarM17721b;
    }
}
