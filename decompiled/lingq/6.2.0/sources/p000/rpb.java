package p000;

import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.runtime.internal.C0282a;
import com.lingq.feature.onboarding.R$string;
import com.lingq.feature.onboarding.p014v2.domain.MiniLessonTemplate;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class rpb {

    /* JADX INFO: renamed from: a */
    public static final C0282a f59694a = new C0282a(-507687541, false, new nd1(11));

    /* JADX INFO: renamed from: b */
    public static final C0282a f59695b = new C0282a(1973752144, false, new nd1(12));

    /* JADX INFO: renamed from: c */
    public static final C0282a f59696c = new C0282a(1262432652, false, new od1(2));

    /* JADX INFO: renamed from: d */
    public static final C0282a f59697d = new C0282a(1129741986, false, new nd1(13));

    /* JADX INFO: renamed from: e */
    public static final C0282a f59698e = new C0282a(-128749853, false, new od1(3));

    /* JADX INFO: renamed from: f */
    public static final C0282a f59699f = new C0282a(1210633168, false, new nd1(14));

    /* JADX INFO: renamed from: g */
    public static final C0282a f59700g = new C0282a(-1219948726, false, new nd1(15));

    /* JADX INFO: renamed from: a */
    public static final void m20742a(MiniLessonTemplate miniLessonTemplate, vz5 vz5Var, Set set, String str, ui3 ui3Var, e16 e16Var, ye1 ye1Var, int i) {
        int i2;
        String str2;
        e16 e16Var2;
        str.getClass();
        ui3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-2025382769);
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
            str2 = str;
            i2 |= tj3Var.m22120g(str2) ? 2048 : 1024;
        } else {
            str2 = str;
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
                tj3Var.m22111b0(1817763270);
                ppb.m19441a(R$string.onboarding_v2_mini_lesson_keep_encountering_title, R$string.onboarding_v2_mini_lesson_keep_encountering_subtitle, ui3Var, tj3Var, (i3 >> 6) & 8064);
                tj3Var.m22139q(false);
                x18 x18VarM22143u = tj3Var.m22143u();
                if (x18VarM22143u != null) {
                    x18VarM22143u.f67642d = new tz5(miniLessonTemplate, vz5Var, set, str, ui3Var, i, 0);
                    return;
                }
                return;
            }
            tj3Var.m22111b0(1818052531);
            tj3Var.m22139q(false);
            boolean zM22120g = tj3Var.m22120g(miniLessonTemplate) | tj3Var.m22120g(set);
            Object objM22097O = tj3Var.m22097O();
            if (zM22120g || objM22097O == we1.f66679a) {
                objM22097O = sz5.m21798i(miniLessonTemplate, set);
                tj3Var.m22131l0(objM22097O);
            }
            List list = (List) objM22097O;
            b16 b16Var = b16.f7762a;
            e16 e16VarM21609V = AbstractC3584sr.m21609V(l70.m15962y(c99.m4411d(b16Var, 1.0f)), ge9.m12515a(tj3Var).f38957f, 0.0f, 2);
            bb1 bb1VarM230a = ab1.m230a(eh0.f37238d, nj0.f52792K, tj3Var, 48);
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
            oha.m18001g(tj3Var, C0352b.f4303f, bb1VarM230a);
            oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
            oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
            oha.m18000f(tj3Var, C0352b.f4305h);
            oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
            thb.m22044c(tj3Var, c99.m4414g(b16Var, ge9.m12515a(tj3Var).f38957f));
            lw9.m16554b(vz1.m23620a0(tj3Var, R$string.onboarding_v2_mini_lesson_keep_encountering_title), null, p58.m18900f(tj3Var).f55870o, null, 0L, null, null, 0L, null, new ks9(3), 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var).f71400d, tj3Var, 0, 0, 130042);
            thb.m22044c(tj3Var, c99.m4414g(b16Var, ge9.m12515a(tj3Var).f38957f));
            tpb.m22264a(null, ci8.m4703P(1082681897, new oz5(miniLessonTemplate, vz5Var, list, str2, 1), tj3Var), tj3Var, 48);
            thb.m22044c(tj3Var, c99.m4414g(b16Var, ge9.m12515a(tj3Var).f38957f));
            lw9.m16554b(vz1.m23620a0(tj3Var, R$string.onboarding_v2_mini_lesson_keep_encountering_subtitle), null, p58.m18900f(tj3Var).f55875s, null, 0L, null, null, 0L, null, new ks9(3), 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var).f71406j, tj3Var, 0, 0, 130042);
            tj3Var = tj3Var;
            thb.m22044c(tj3Var, new as4(1.0f, true));
            ss5.m21710f(AbstractC3584sr.m21611X(c99.m4412e(b16Var, 1.0f), 0.0f, 0.0f, 0.0f, ge9.m12515a(tj3Var).f38957f, 7), null, null, false, ui3Var, g0c.f40038a, tj3Var, (57344 & i3) | 196608, 14);
            tj3Var.m22139q(true);
            e16Var2 = b16Var;
        }
        x18 x18VarM22143u2 = tj3Var.m22143u();
        if (x18VarM22143u2 != null) {
            x18VarM22143u2.f67642d = new uz5(miniLessonTemplate, vz5Var, set, str, ui3Var, e16Var2, i, 0);
        }
    }
}
