package p000;

import android.content.res.Configuration;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.p002ui.platform.AbstractC0394f;
import androidx.compose.runtime.internal.C0282a;
import com.lingq.feature.onboarding.R$drawable;
import com.lingq.feature.onboarding.R$string;
import com.lingq.feature.onboarding.p014v2.domain.MiniLessonTemplate;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class spb {

    /* JADX INFO: renamed from: a */
    public static final C0282a f61209a = new C0282a(872341446, false, new nd1(16));

    /* JADX INFO: renamed from: b */
    public static final C0282a f61210b = new C0282a(-1158719386, false, new nd1(17));

    /* JADX INFO: renamed from: c */
    public static final C0282a f61211c = new C0282a(1632341080, false, new nd1(18));

    /* JADX INFO: renamed from: d */
    public static final C0282a f61212d = new C0282a(-431375682, false, new od1(4));

    /* JADX INFO: renamed from: a */
    public static final void m21533a(MiniLessonTemplate miniLessonTemplate, vz5 vz5Var, Set set, String str, ui3 ui3Var, e16 e16Var, ye1 ye1Var, int i) {
        int i2;
        e16 e16Var2;
        float f;
        b16 b16Var;
        str.getClass();
        ui3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1547727505);
        if ((i & 6) == 0) {
            i2 = (tj3Var.m22124i(miniLessonTemplate) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= tj3Var.m22124i(vz5Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= tj3Var.m22124i(set) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= tj3Var.m22120g(str) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= tj3Var.m22124i(ui3Var) ? 16384 : 8192;
        }
        int i3 = i2 | 196608;
        if (!tj3Var.m22099R(i3 & 1, (74899 & i3) != 74898)) {
            tj3Var.m22102U();
            e16Var2 = e16Var;
        } else {
            if (miniLessonTemplate == null || vz5Var == null) {
                tj3Var.m22111b0(-1875898374);
                ppb.m19441a(R$string.onboarding_v2_mini_lesson_lynx_ai_title, R$string.onboarding_v2_mini_lesson_lynx_ai_subtitle, ui3Var, tj3Var, (i3 >> 6) & 8064);
                tj3Var.m22139q(false);
                x18 x18VarM22143u = tj3Var.m22143u();
                if (x18VarM22143u != null) {
                    x18VarM22143u.f67642d = new tz5(miniLessonTemplate, vz5Var, set, str, ui3Var, i, 1);
                    return;
                }
                return;
            }
            tj3Var.m22111b0(-1875628333);
            tj3Var.m22139q(false);
            String str2 = miniLessonTemplate.f27420e;
            if (vk9.m23391n0(str2)) {
                str2 = miniLessonTemplate.f27418c;
            }
            String str3 = miniLessonTemplate.f27421f;
            boolean zM22120g = tj3Var.m22120g(str2) | tj3Var.m22120g(set);
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var = we1.f66679a;
            if (zM22120g || objM22097O == p84Var) {
                objM22097O = sz5.m21796g(str2, set);
                tj3Var.m22131l0(objM22097O);
            }
            List list = (List) objM22097O;
            boolean zM22120g2 = tj3Var.m22120g(str3) | tj3Var.m22120g(set);
            Object objM22097O2 = tj3Var.m22097O();
            if (zM22120g2 || objM22097O2 == p84Var) {
                objM22097O2 = sz5.m21796g(str3, set);
                tj3Var.m22131l0(objM22097O2);
            }
            List list2 = (List) objM22097O2;
            float f2 = ((Configuration) tj3Var.m22128k(AbstractC0394f.f4760a)).screenWidthDp * 0.78f;
            b16 b16Var2 = b16.f7762a;
            e16 e16VarM21609V = AbstractC3584sr.m21609V(l70.m15962y(c99.m4411d(b16Var2, 1.0f)), ge9.m12515a(tj3Var).f38957f, 0.0f, 2);
            ec0 ec0Var = nj0.f52792K;
            C3587su c3587su = eh0.f37238d;
            bb1 bb1VarM230a = ab1.m230a(c3587su, ec0Var, tj3Var, 48);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM21609V);
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
            thb.m22044c(tj3Var, c99.m4414g(b16Var2, ge9.m12515a(tj3Var).f38957f));
            String str4 = str2;
            lw9.m16554b(vz1.m23620a0(tj3Var, R$string.onboarding_v2_mini_lesson_lynx_ai_title), null, p58.m18900f(tj3Var).f55870o, null, 0L, null, null, 0L, null, new ks9(3), 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var).f71400d, tj3Var, 0, 0, 130042);
            e16 e16VarM19045o = pb1.m19045o(ux5.m22984g(b16Var2, ge9.m12515a(tj3Var).f38958g, tj3Var, b16Var2, 1.0f), ui8.m22753b(24.0f));
            long j = p58.m18900f(tj3Var).f55824I;
            mv3 mv3Var = ss5.f61356d;
            e16 e16VarM21607T = AbstractC3584sr.m21607T(d32.m10007D(e16VarM19045o, j, mv3Var), ge9.m12515a(tj3Var).f38956e);
            ec0 ec0Var2 = nj0.f52791J;
            bb1 bb1VarM230a2 = ab1.m230a(c3587su, ec0Var2, tj3Var, 0);
            int iHashCode2 = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m2 = tj3Var.m22132m();
            e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var, e16VarM21607T);
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var2);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, zi3Var, bb1VarM230a2);
            oha.m18001g(tj3Var, zi3Var2, l77VarM22132m2);
            AbstractC3393o1.m17747v(iHashCode2, tj3Var, zi3Var3, tj3Var, vi3Var);
            oha.m18001g(tj3Var, zi3Var4, e16VarM1322c2);
            e16 e16VarM4412e = c99.m4412e(b16Var2, 1.0f);
            bb1 bb1VarM230a3 = ab1.m230a(c3587su, nj0.f52793L, tj3Var, 48);
            int iHashCode3 = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m3 = tj3Var.m22132m();
            e16 e16VarM1322c3 = AbstractC0287b.m1322c(tj3Var, e16VarM4412e);
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var2);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, zi3Var, bb1VarM230a3);
            oha.m18001g(tj3Var, zi3Var2, l77VarM22132m3);
            AbstractC3393o1.m17747v(iHashCode3, tj3Var, zi3Var3, tj3Var, vi3Var);
            oha.m18001g(tj3Var, zi3Var4, e16VarM1322c3);
            e16 e16VarM21608U = AbstractC3584sr.m21608U(d32.m10007D(pb1.m19045o(c99.m4428u(b16Var2, 0.0f, f2, 1), ui8.m22753b(18.0f)), p58.m18900f(tj3Var).f55823H, mv3Var), ge9.m12515a(tj3Var).f38956e, ge9.m12515a(tj3Var).f38952a);
            ht5 ht5VarM19966d = qh0.m19966d(nj0.f52808c, false);
            int iHashCode4 = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m4 = tj3Var.m22132m();
            e16 e16VarM1322c4 = AbstractC0287b.m1322c(tj3Var, e16VarM21608U);
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
            int i4 = i3 & 7280;
            tj3 tj3Var2 = tj3Var;
            sz5.m21793d(i4, tj3Var2, vz5Var, str4, str, list);
            tj3Var2.m22139q(true);
            tj3Var2.m22139q(true);
            if (vk9.m23391n0(str3)) {
                f = 1.0f;
                b16Var = b16Var2;
                tj3Var2.m22111b0(-1285598337);
                tj3Var2.m22139q(false);
            } else {
                tj3Var2.m22111b0(-1286699643);
                e16 e16VarM22984g = ux5.m22984g(b16Var2, ge9.m12515a(tj3Var2).f38956e, tj3Var2, b16Var2, 1.0f);
                sj8 sj8VarM20003a = qj8.m20003a(eh0.f37236b, nj0.f52817l, tj3Var2, 0);
                int iHashCode5 = Long.hashCode(tj3Var2.f62385T);
                l77 l77VarM22132m5 = tj3Var2.m22132m();
                e16 e16VarM1322c5 = AbstractC0287b.m1322c(tj3Var2, e16VarM22984g);
                tj3Var2.m22119f0();
                if (tj3Var2.f62384S) {
                    tj3Var2.m22130l(ui3Var2);
                } else {
                    tj3Var2.m22137o0();
                }
                oha.m18001g(tj3Var2, zi3Var, sj8VarM20003a);
                oha.m18001g(tj3Var2, zi3Var2, l77VarM22132m5);
                AbstractC3393o1.m17747v(iHashCode5, tj3Var2, zi3Var3, tj3Var2, vi3Var);
                oha.m18001g(tj3Var2, zi3Var4, e16VarM1322c5);
                bq1.m4042R(AbstractC3423or.m18236U(R$drawable.im_onboarding_lynx_icon, tj3Var2, 0), null, c99.m4422o(b16Var2, 36.0f), null, null, 0.0f, null, tj3Var2, 440, 120);
                thb.m22044c(tj3Var2, c99.m4426s(b16Var2, ge9.m12515a(tj3Var2).f38952a));
                as4 as4Var = new as4(1.0f, true);
                bb1 bb1VarM230a4 = ab1.m230a(c3587su, ec0Var2, tj3Var2, 0);
                int iHashCode6 = Long.hashCode(tj3Var2.f62385T);
                l77 l77VarM22132m6 = tj3Var2.m22132m();
                e16 e16VarM1322c6 = AbstractC0287b.m1322c(tj3Var2, as4Var);
                tj3Var2.m22119f0();
                if (tj3Var2.f62384S) {
                    tj3Var2.m22130l(ui3Var2);
                } else {
                    tj3Var2.m22137o0();
                }
                oha.m18001g(tj3Var2, zi3Var, bb1VarM230a4);
                oha.m18001g(tj3Var2, zi3Var2, l77VarM22132m6);
                AbstractC3393o1.m17747v(iHashCode6, tj3Var2, zi3Var3, tj3Var2, vi3Var);
                oha.m18001g(tj3Var2, zi3Var4, e16VarM1322c6);
                lw9.m16554b(vz1.m23620a0(tj3Var2, R$string.onboarding_v2_mini_lesson_lynx_ai_name), null, p58.m18900f(tj3Var2).f55873q, null, 0L, null, bc3.f8323i, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var2).f71405i, tj3Var2, 1572864, 0, 131002);
                tj3Var2 = tj3Var2;
                thb.m22044c(tj3Var2, c99.m4414g(b16Var2, ge9.m12515a(tj3Var2).f38954c));
                f = 1.0f;
                b16Var = b16Var2;
                sz5.m21793d(i4, tj3Var2, vz5Var, str3, str, list2);
                AbstractC3393o1.m17723A(tj3Var2, true, true, false);
            }
            tj3Var2.m22139q(true);
            thb.m22044c(tj3Var2, c99.m4414g(b16Var, ge9.m12515a(tj3Var2).f38958g));
            tj3 tj3Var3 = tj3Var2;
            lw9.m16554b(vz1.m23620a0(tj3Var2, R$string.onboarding_v2_mini_lesson_lynx_ai_subtitle), null, p58.m18900f(tj3Var2).f55875s, null, 0L, null, null, 0L, null, new ks9(3), 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var2).f71406j, tj3Var3, 0, 0, 130042);
            thb.m22044c(tj3Var2, new as4(f, true));
            ss5.m21710f(AbstractC3584sr.m21611X(c99.m4412e(b16Var, f), 0.0f, 0.0f, 0.0f, ge9.m12515a(tj3Var2).f38957f, 7), null, null, false, ui3Var, q0c.f57111a, tj3Var3, (i3 & 57344) | 196608, 14);
            tj3Var = tj3Var3;
            tj3Var.m22139q(true);
            e16Var2 = b16Var;
        }
        x18 x18VarM22143u2 = tj3Var.m22143u();
        if (x18VarM22143u2 != null) {
            x18VarM22143u2.f67642d = new uz5(miniLessonTemplate, vz5Var, set, str, ui3Var, e16Var2, i, 1);
        }
    }
}
