package p000;

import androidx.compose.material3.AbstractC0231g;
import androidx.compose.p002ui.window.AbstractC0454b;
import androidx.compose.runtime.internal.C0282a;
import com.lingq.core.achievements.StreakChallengeType;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class u4d {
    /* JADX INFO: renamed from: a */
    public static final void m22466a(df0 df0Var, vi3 vi3Var, ye1 ye1Var, int i) {
        df0Var.getClass();
        vi3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-492471003);
        int i2 = (tj3Var.m22124i(df0Var) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= tj3Var.m22124i(vi3Var) ? 32 : 16;
        }
        int i3 = 1;
        if (tj3Var.m22099R(i2 & 1, (i2 & 19) != 18)) {
            e16 e16VarM4411d = c99.m4411d(b16.f7762a, 1.0f);
            zf1 zf1Var = ge9.f40637a;
            e16 e16VarM21607T = AbstractC3584sr.m21607T(e16VarM4411d, ((fe9) tj3Var.m22128k(zf1Var)).f38957f);
            C3661uu c3661uu = new C3661uu(((fe9) tj3Var.m22128k(zf1Var)).f38952a, true, new gm5(28));
            boolean zM22124i = tj3Var.m22124i(df0Var) | ((i2 & 112) == 32);
            Object objM22097O = tj3Var.m22097O();
            if (zM22124i || objM22097O == we1.f66679a) {
                objM22097O = new s70(i3, df0Var, vi3Var);
                tj3Var.m22131l0(objM22097O);
            }
            fa4.m11642c(e16VarM21607T, null, null, c3661uu, null, null, false, null, (vi3) objM22097O, tj3Var, 0, 494);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3709w4(df0Var, i, 2, vi3Var);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m22467b(e16 e16Var, StreakChallengeType streakChallengeType, ui3 ui3Var, ye1 ye1Var, int i) {
        streakChallengeType.getClass();
        ui3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-690891865);
        int i2 = 4;
        int i3 = (tj3Var.m22120g(e16Var) ? 4 : 2) | i | (tj3Var.m22116e(streakChallengeType.ordinal()) ? 32 : 16) | (tj3Var.m22124i(ui3Var) ? 256 : 128);
        if (tj3Var.m22099R(i3 & 1, (i3 & 147) != 146)) {
            e16 e16VarM4409b = c99.m4409b(c99.m4412e(e16Var, 1.0f), 0.0f, 48.0f, 1);
            vh9 vh9Var = ps5.f56764b;
            si8 si8Var = ((ms5) tj3Var.m22128k(vh9Var)).f51801c.f64856b;
            vf0 vf0VarM4714a = ci8.m4714a(1.0f, aa1.m198b(0.5f, ((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55875s));
            boolean z = (i3 & 896) == 256;
            Object objM22097O = tj3Var.m22097O();
            if (z || objM22097O == we1.f66679a) {
                objM22097O = new zy7(14, ui3Var);
                tj3Var.m22131l0(objM22097O);
            }
            AbstractC0231g.m1151d((ui3) objM22097O, e16VarM4409b, false, si8Var, null, vf0VarM4714a, null, ci8.m4703P(-751829863, new iq8(streakChallengeType, i2), tj3Var), tj3Var, 805306368, 436);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new g39((Object) e16Var, (Object) streakChallengeType, ui3Var, i, 7);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m22468c(boolean z, vi3 vi3Var, ui3 ui3Var, ye1 ye1Var, int i) {
        int i2;
        vi3Var.getClass();
        ui3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(541351492);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (tj3Var.m22122h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= tj3Var.m22124i(vi3Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= tj3Var.m22124i(ui3Var) ? 256 : 128;
        }
        if (!tj3Var.m22099R(i2 & 1, (i2 & 147) != 146)) {
            tj3Var.m22102U();
        } else if (z) {
            tj3Var.m22111b0(-199686142);
            boolean z2 = (i2 & 896) == 256;
            Object objM22097O = tj3Var.m22097O();
            if (z2 || objM22097O == we1.f66679a) {
                objM22097O = new zy7(12, ui3Var);
                tj3Var.m22131l0(objM22097O);
            }
            AbstractC0454b.m1895a((ui3) objM22097O, null, ci8.m4703P(-206369838, new ju6(ui3Var, vi3Var, i3), tj3Var), tj3Var, 384, 2);
            tj3Var.m22139q(false);
        } else {
            tj3Var.m22111b0(-197106818);
            tj3Var.m22139q(false);
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new vb3(z, vi3Var, ui3Var, i);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m22469d(vu4 vu4Var, int i, List list, Integer num, String str, vi3 vi3Var) {
        int i2 = 0;
        vu4.m23545g(vu4Var, str.concat("Title"), new C0282a(-439899256, true, new pe0(i, i2)), 2);
        vu4Var.m23547h(list.size(), new ue0(i2, new t70(str, 3), list), new C3520r2(2, list), new C0282a(802480018, true, new ve0(list, vi3Var, num, i2)));
    }
}
