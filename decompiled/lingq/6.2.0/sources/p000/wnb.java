package p000;

import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.runtime.internal.C0282a;
import com.lingq.core.premium.R$string;
import com.lingq.core.premium.upgrade.UpgradeBadgeTier;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.Result;
import org.joda.time.LocalDateTime;
import org.joda.time.format.AbstractC3432a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class wnb {

    /* JADX INFO: renamed from: a */
    public static final C0282a f67100a = new C0282a(-95927471, false, new z70(22));

    /* JADX INFO: renamed from: b */
    public static final C0282a f67101b = new C0282a(-1627935002, false, new jd1(7));

    /* JADX INFO: renamed from: c */
    public static final C0282a f67102c = new C0282a(-1446450869, false, new jd1(8));

    /* JADX INFO: renamed from: a */
    public static final void m24084a(boolean z, ui3 ui3Var, ye1 ye1Var, int i) {
        int i2;
        boolean z2;
        ui3 ui3Var2;
        ui3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1397079047);
        if ((i & 6) == 0) {
            i2 = (tj3Var.m22122h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= tj3Var.m22124i(ui3Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= tj3Var.m22120g(b16.f7762a) ? 256 : 128;
        }
        if (tj3Var.m22099R(i2 & 1, (i2 & 147) != 146)) {
            int i3 = (i2 & 14) | 384;
            int i4 = i2 << 6;
            z2 = z;
            ui3Var2 = ui3Var;
            m24087d(i3 | (i4 & 7168) | (i4 & 57344), tj3Var, ui3Var2, vz1.m23620a0(tj3Var, R$string.upgrade_prompt_gated_title), null, z2);
        } else {
            z2 = z;
            ui3Var2 = ui3Var;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new go5(z2, ui3Var2, i, 0);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m24085b(boolean z, boolean z2, String str, ui3 ui3Var, ui3 ui3Var2, ye1 ye1Var, int i) {
        int i2;
        ui3 ui3Var3;
        tj3 tj3Var;
        Object failure;
        String strM23620a0;
        str.getClass();
        ui3Var.getClass();
        ui3Var2.getClass();
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(-1966808500);
        if ((i & 6) == 0) {
            i2 = (tj3Var2.m22122h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= tj3Var2.m22122h(z2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= tj3Var2.m22120g(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            ui3Var3 = ui3Var;
            i2 |= tj3Var2.m22124i(ui3Var3) ? 2048 : 1024;
        } else {
            ui3Var3 = ui3Var;
        }
        if ((i & 24576) == 0) {
            i2 |= tj3Var2.m22124i(ui3Var2) ? 16384 : 8192;
        }
        int i3 = 196608 & i;
        b16 b16Var = b16.f7762a;
        if (i3 == 0) {
            i2 |= tj3Var2.m22120g(b16Var) ? 131072 : 65536;
        }
        int i4 = i2;
        boolean z3 = true;
        if (!tj3Var2.m22099R(i4 & 1, (74899 & i4) != 74898)) {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
        } else if (z2) {
            tj3Var2.m22111b0(-1247950653);
            int i5 = i4 >> 6;
            if ((((i5 & 14) ^ 6) <= 4 || !tj3Var2.m22120g(str)) && (i5 & 6) != 4) {
                z3 = false;
            }
            Object objM22097O = tj3Var2.m22097O();
            if (z3 || objM22097O == we1.f66679a) {
                Object obj = "";
                if (!vk9.m23391n0(str)) {
                    try {
                        failure = AbstractC3432a.m18451a("MMMM d").m14769d(Locale.getDefault()).m14767b(LocalDateTime.m18367g(str));
                    } catch (Throwable th) {
                        failure = new Result.Failure(th);
                    }
                    obj = (String) (failure instanceof Result.Failure ? "" : failure);
                }
                objM22097O = obj;
                tj3Var2.m22131l0(objM22097O);
            }
            String str2 = (String) objM22097O;
            str2.getClass();
            UpgradeBadgeTier upgradeBadgeTier = UpgradeBadgeTier.PremiumPlus;
            String strM23620a1 = vz1.m23620a0(tj3Var2, R$string.upgrade_prompt_lynx_credits_title);
            if (vk9.m23391n0(str2)) {
                tj3Var2.m22111b0(-1247581164);
                strM23620a0 = vz1.m23620a0(tj3Var2, R$string.upgrade_prompt_lynx_credits_renew_unknown);
                tj3Var2.m22139q(false);
            } else {
                tj3Var2.m22111b0(-1247691059);
                strM23620a0 = vz1.m23618Z(R$string.upgrade_prompt_lynx_credits_renew, new Object[]{str2}, tj3Var2);
                tj3Var2.m22139q(false);
            }
            int i6 = i4 >> 3;
            s9d.m21184c(upgradeBadgeTier, strM23620a1, vz1.m23620a0(tj3Var2, R$string.upgrade_prompt_got_it), ui3Var2, b16Var, strM23620a0, true, false, nzb.f53481a, tj3Var2, (i6 & 7168) | 114819078 | (57344 & i6), 0);
            tj3Var = tj3Var2;
            tj3Var.m22139q(false);
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22111b0(-1247172739);
            m24087d((57344 & (i4 >> 3)) | (i4 & 7182), tj3Var, ui3Var3, vz1.m23620a0(tj3Var, R$string.upgrade_prompt_lynx_credits_title), vz1.m23620a0(tj3Var, z ? R$string.upgrade_prompt_lynx_credits_subtitle_plus : R$string.upgrade_prompt_lynx_credits_subtitle_premium), z);
            tj3Var.m22139q(false);
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new k04(z, z2, str, ui3Var, ui3Var2, i);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m24086c(boolean z, ye1 ye1Var, int i) {
        List<Pair> listM23605K;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-71799432);
        int i2 = i | (tj3Var.m22122h(z) ? 4 : 2);
        boolean z2 = false;
        if (tj3Var.m22099R(i2 & 1, (i2 & 3) != 2)) {
            if (z) {
                tj3Var.m22111b0(-83044371);
                Pair pair = new Pair(zdd.m25562a(), vz1.m23620a0(tj3Var, R$string.upgrade_prompt_lynx_plus_feature_usage));
                Pair pair2 = new Pair(bic.m3744a(), vz1.m23620a0(tj3Var, R$string.upgrade_prompt_lynx_plus_feature_personalized));
                p04 p04VarM17721b = b2d.f7826a;
                if (p04VarM17721b == null) {
                    o04 o04Var = new o04("Rounded.AddCircle", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                    int i3 = soa.f61116a;
                    pd9 pd9Var = new pd9(aa1.f403b);
                    f57 f57VarM17730e = AbstractC3393o1.m17730e(12.0f, 2.0f);
                    f57VarM17730e.m11547b(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
                    f57VarM17730e.m11555j(4.48f, 10.0f, 10.0f, 10.0f);
                    f57VarM17730e.m11555j(10.0f, -4.48f, 10.0f, -10.0f);
                    f57VarM17730e.m11554i(17.52f, 2.0f, 12.0f, 2.0f);
                    f57VarM17730e.m11546a();
                    f57VarM17730e.m11553h(16.0f, 13.0f);
                    f57VarM17730e.m11550e(-3.0f);
                    f57VarM17730e.m11557l(3.0f);
                    f57VarM17730e.m11548c(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
                    f57VarM17730e.m11555j(-1.0f, -0.45f, -1.0f, -1.0f);
                    f57VarM17730e.m11557l(-3.0f);
                    f57VarM17730e.m11551f(8.0f, 13.0f);
                    f57VarM17730e.m11548c(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
                    f57VarM17730e.m11555j(0.45f, -1.0f, 1.0f, -1.0f);
                    f57VarM17730e.m11550e(3.0f);
                    f57VarM17730e.m11551f(11.0f, 8.0f);
                    f57VarM17730e.m11548c(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
                    f57VarM17730e.m11555j(1.0f, 0.45f, 1.0f, 1.0f);
                    f57VarM17730e.m11557l(3.0f);
                    f57VarM17730e.m11550e(3.0f);
                    f57VarM17730e.m11548c(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
                    f57VarM17730e.m11555j(-0.45f, 1.0f, -1.0f, 1.0f);
                    f57VarM17730e.m11546a();
                    o04.m17720a(o04Var, f57VarM17730e.f38440a, pd9Var);
                    p04VarM17721b = o04Var.m17721b();
                    b2d.f7826a = p04VarM17721b;
                }
                listM23605K = vz1.m23605K(pair, pair2, new Pair(p04VarM17721b, vz1.m23620a0(tj3Var, R$string.upgrade_prompt_lynx_plus_feature_tools)));
                tj3Var.m22139q(false);
            } else {
                tj3Var.m22111b0(-82692769);
                Pair pair3 = new Pair(zdd.m25562a(), vz1.m23620a0(tj3Var, R$string.upgrade_prompt_lynx_feature_credits));
                p04 p04VarM17721b2 = d1c.f34857b;
                if (p04VarM17721b2 == null) {
                    o04 o04Var2 = new o04("Rounded.Person", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                    int i4 = soa.f61116a;
                    pd9 pd9Var2 = new pd9(aa1.f403b);
                    f57 f57VarM17730e2 = AbstractC3393o1.m17730e(12.0f, 12.0f);
                    f57VarM17730e2.m11548c(2.21f, 0.0f, 4.0f, -1.79f, 4.0f, -4.0f);
                    f57VarM17730e2.m11555j(-1.79f, -4.0f, -4.0f, -4.0f);
                    f57VarM17730e2.m11555j(-4.0f, 1.79f, -4.0f, 4.0f);
                    f57VarM17730e2.m11555j(1.79f, 4.0f, 4.0f, 4.0f);
                    f57VarM17730e2.m11546a();
                    f57VarM17730e2.m11553h(12.0f, 14.0f);
                    f57VarM17730e2.m11548c(-2.67f, 0.0f, -8.0f, 1.34f, -8.0f, 4.0f);
                    f57VarM17730e2.m11557l(1.0f);
                    f57VarM17730e2.m11548c(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
                    f57VarM17730e2.m11550e(14.0f);
                    f57VarM17730e2.m11548c(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
                    f57VarM17730e2.m11557l(-1.0f);
                    f57VarM17730e2.m11548c(0.0f, -2.66f, -5.33f, -4.0f, -8.0f, -4.0f);
                    f57VarM17730e2.m11546a();
                    o04.m17720a(o04Var2, f57VarM17730e2.f38440a, pd9Var2);
                    p04VarM17721b2 = o04Var2.m17721b();
                    d1c.f34857b = p04VarM17721b2;
                }
                listM23605K = vz1.m23605K(pair3, new Pair(p04VarM17721b2, vz1.m23620a0(tj3Var, R$string.upgrade_prompt_lynx_feature_feedback)), new Pair(bic.m3744a(), vz1.m23620a0(tj3Var, R$string.upgrade_prompt_lynx_feature_smarter)));
                tj3Var.m22139q(false);
            }
            zf1 zf1Var = ge9.f40637a;
            int i5 = 28;
            C3661uu c3661uu = new C3661uu(((fe9) tj3Var.m22128k(zf1Var)).f38956e, true, new gm5(28));
            float f = ((fe9) tj3Var.m22128k(zf1Var)).f38955d;
            b16 b16Var = b16.f7762a;
            e16 e16VarM21609V = AbstractC3584sr.m21609V(b16Var, 0.0f, f, 1);
            bb1 bb1VarM230a = ab1.m230a(c3661uu, nj0.f52791J, tj3Var, 0);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM21609V);
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
            tj3Var.m22111b0(676662529);
            for (Pair pair4 : listM23605K) {
                p04 p04Var = (p04) pair4.f47623a;
                String str = (String) pair4.f47624b;
                sj8 sj8VarM20003a = qj8.m20003a(new C3661uu(((fe9) tj3Var.m22128k(ge9.f40637a)).f38952a, true, new gm5(i5)), nj0.f52789H, tj3Var, 48);
                int iHashCode2 = Long.hashCode(tj3Var.f62385T);
                l77 l77VarM22132m2 = tj3Var.m22132m();
                e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var, b16Var);
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
                vh9 vh9Var = ps5.f56764b;
                ty3.m22351a(p04Var, null, c99.m4422o(b16Var, 22.0f), ((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55873q, tj3Var, 432, 0);
                tj3 tj3Var2 = tj3Var;
                lw9.m16554b(str, null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var.m22128k(vh9Var)).f51800b.f71406j, tj3Var2, 0, 0, 131070);
                tj3Var = tj3Var2;
                tj3Var.m22139q(true);
                z2 = z2;
                i5 = i5;
                b16Var = b16Var;
            }
            tj3Var.m22139q(z2);
            tj3Var.m22139q(true);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new c81(i, 6, z);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m24087d(int i, ye1 ye1Var, ui3 ui3Var, String str, String str2, boolean z) {
        int i2;
        String str3;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1284603542);
        if ((i & 6) == 0) {
            i2 = (tj3Var.m22122h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            str3 = str;
            i2 |= tj3Var.m22120g(str3) ? 32 : 16;
        } else {
            str3 = str;
        }
        if ((i & 384) == 0) {
            i2 |= tj3Var.m22120g(str2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= tj3Var.m22124i(ui3Var) ? 2048 : 1024;
        }
        int i3 = i & 24576;
        b16 b16Var = b16.f7762a;
        if (i3 == 0) {
            i2 |= tj3Var.m22120g(b16Var) ? 16384 : 8192;
        }
        int i4 = 1;
        if (tj3Var.m22099R(i2 & 1, (i2 & 9363) != 9362)) {
            s9d.m21184c(z ? UpgradeBadgeTier.PremiumPlus : UpgradeBadgeTier.Premium, str3, vz1.m23620a0(tj3Var, R$string.upgrade_prompt_lynx_button), ui3Var, b16Var, str2, z, false, ci8.m4703P(1864605533, new l04(i4, z), tj3Var), tj3Var, (i2 & 112) | 100663296 | (i2 & 7168) | (57344 & i2) | ((i2 << 9) & 458752) | ((i2 << 18) & 3670016), 128);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new fo5(i, 0, ui3Var, str, str2, z);
        }
    }
}
