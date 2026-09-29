package p000;

import androidx.lifecycle.compose.AbstractC0711a;
import com.lingq.core.premium.R$string;
import com.lingq.core.premium.upgrade.AiVoiceSampleState;
import com.lingq.core.premium.upgrade.UpgradeBadgeTier;
import java.util.List;
import kotlinx.coroutines.flow.C3244l;
import p000.AbstractC3108id;
import p000.C3143jd;
import p000.gm5;
import p000.lda;
import p000.wfb;
import p000.xfa;

/* JADX INFO: renamed from: td */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3607td {

    /* JADX INFO: renamed from: a */
    public static final List f62159a;

    static {
        Float fValueOf = Float.valueOf(0.3f);
        Float fValueOf2 = Float.valueOf(0.6f);
        Float fValueOf3 = Float.valueOf(0.4f);
        Float fValueOf4 = Float.valueOf(0.85f);
        Float fValueOf5 = Float.valueOf(0.5f);
        Float fValueOf6 = Float.valueOf(0.7f);
        Float fValueOf7 = Float.valueOf(0.35f);
        Float fValueOf8 = Float.valueOf(0.9f);
        Float fValueOf9 = Float.valueOf(0.45f);
        f62159a = vz1.m23605K(fValueOf, fValueOf2, fValueOf3, fValueOf4, fValueOf5, fValueOf6, fValueOf7, fValueOf8, fValueOf9, Float.valueOf(0.65f), fValueOf, Float.valueOf(0.8f), fValueOf5, fValueOf3, Float.valueOf(0.75f), Float.valueOf(0.55f), fValueOf7, fValueOf2, fValueOf9, fValueOf);
    }

    /* JADX INFO: renamed from: a */
    public static final void m21957a(final boolean z, ui3 ui3Var, final C3143jd c3143jd, ye1 ye1Var, int i) {
        int i2;
        boolean z2;
        ui3 ui3Var2;
        ui3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1541610385);
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
        if ((i & 3072) == 0) {
            i2 |= 1024;
        }
        if (tj3Var.m22099R(i2 & 1, (i2 & 1171) != 1170)) {
            tj3Var.m22104W();
            if ((i & 1) == 0 || tj3Var.m22084B()) {
                dua duaVarM21396a = si5.m21396a(tj3Var);
                if (duaVarM21396a == null) {
                    C3386nv.m17633t("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                } else {
                    wta wtaVarM19114d = pfa.m19114d(y38.m24933a(C3143jd.class), duaVarM21396a, null, AbstractC3584sr.m21591B(duaVarM21396a, tj3Var), duaVarM21396a instanceof gr3 ? ((gr3) duaVarM21396a).mo2103e() : or1.f54780b, tj3Var);
                    tj3Var = tj3Var;
                    c3143jd = (C3143jd) wtaVarM19114d;
                }
            } else {
                tj3Var.m22102U();
            }
            int i3 = i2 & (-7169);
            tj3Var.m22140r();
            t66 t66VarM2513c = AbstractC0711a.m2513c(c3143jd.f45432d, tj3Var);
            boolean zM22124i = tj3Var.m22124i(c3143jd);
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var = we1.f66679a;
            if (zM22124i || objM22097O == p84Var) {
                objM22097O = new C3741x(c3143jd, 2);
                tj3Var.m22131l0(objM22097O);
            }
            d32.m10041h(xfa.f68157a, (vi3) objM22097O, tj3Var);
            AiVoiceSampleState aiVoiceSampleState = (AiVoiceSampleState) t66VarM2513c.getValue();
            int i4 = i3 & 14;
            boolean zM22124i2 = tj3Var.m22124i(c3143jd) | (i4 == 4);
            Object objM22097O2 = tj3Var.m22097O();
            if (zM22124i2 || objM22097O2 == p84Var) {
                objM22097O2 = new ui3() { // from class: com.lingq.core.premium.upgrade.b
                    @Override // p000.ui3
                    /* JADX INFO: renamed from: a */
                    public final Object mo0a() {
                        C3143jd c3143jd2 = c3143jd;
                        C3244l c3244l = c3143jd2.f45431c;
                        int i5 = AbstractC3108id.f43949a[((AiVoiceSampleState) c3244l.getValue()).ordinal()];
                        if (i5 != 1) {
                            if (i5 == 2) {
                                c3143jd2.m14400W2();
                            } else {
                                if (i5 != 3) {
                                    gm5.m12750e();
                                    return null;
                                }
                                c3244l.m15571i(AiVoiceSampleState.Loading);
                                wfb.m23926u(lda.m16103C(c3143jd2), null, null, new AiVoiceSampleViewModel$loadAndPlay$1(c3143jd2, z, null), 3);
                            }
                        }
                        return xfa.f68157a;
                    }
                };
                tj3Var.m22131l0(objM22097O2);
            }
            int i5 = i3 << 6;
            z2 = z;
            ui3Var2 = ui3Var;
            m21958b(z2, aiVoiceSampleState, (ui3) objM22097O2, ui3Var2, tj3Var, (i5 & 57344) | (i5 & 7168) | i4);
        } else {
            z2 = z;
            ui3Var2 = ui3Var;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3493qd(z2, ui3Var2, c3143jd, i);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m21958b(boolean z, AiVoiceSampleState aiVoiceSampleState, ui3 ui3Var, ui3 ui3Var2, ye1 ye1Var, int i) {
        int i2;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-666583153);
        if ((i & 6) == 0) {
            i2 = (tj3Var.m22122h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= tj3Var.m22116e(aiVoiceSampleState.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= tj3Var.m22124i(ui3Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= tj3Var.m22124i(ui3Var2) ? 2048 : 1024;
        }
        int i3 = i & 24576;
        b16 b16Var = b16.f7762a;
        if (i3 == 0) {
            i2 |= tj3Var.m22120g(b16Var) ? 16384 : 8192;
        }
        if (tj3Var.m22099R(i2 & 1, (i2 & 9363) != 9362)) {
            s9d.m21184c(z ? UpgradeBadgeTier.PremiumPlus : UpgradeBadgeTier.Premium, vz1.m23620a0(tj3Var, R$string.upgrade_prompt_voices_title), vz1.m23620a0(tj3Var, R$string.upgrade_prompt_voices_button), ui3Var2, b16Var, vz1.m23620a0(tj3Var, R$string.upgrade_prompt_voices_subtitle), false, false, ci8.m4703P(2051466748, new C3180kd(0, aiVoiceSampleState, ui3Var), tj3Var), tj3Var, (i2 & 7168) | 100663296 | (i2 & 57344), 192);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3294ld(z, aiVoiceSampleState, ui3Var, ui3Var2, i);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m21959c(AiVoiceSampleState aiVoiceSampleState, ui3 ui3Var, ye1 ye1Var, int i) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(926485968);
        int i2 = (tj3Var.m22116e(aiVoiceSampleState.ordinal()) ? 4 : 2) | i | (tj3Var.m22124i(ui3Var) ? 32 : 16);
        if (tj3Var.m22099R(i2 & 1, (i2 & 19) != 18)) {
            ho9.m13414a(c99.m4412e(b16.f7762a, 1.0f), ui8.m22753b(((fe9) tj3Var.m22128k(ge9.f40637a)).f38956e), ((ms5) tj3Var.m22128k(ps5.f56764b)).f51799a.f55823H, 0L, 0.0f, 0.0f, null, ci8.m4703P(-1159858709, new C3331md(ui3Var, aiVoiceSampleState), tj3Var), tj3Var, 12582918, 120);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3331md(aiVoiceSampleState, ui3Var, i);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m21960d(e16 e16Var, ye1 ye1Var, int i) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(710215739);
        int i2 = (tj3Var.m22120g(e16Var) ? 4 : 2) | i;
        if (tj3Var.m22099R(i2 & 1, (i2 & 3) != 2)) {
            long j = ((ms5) tj3Var.m22128k(ps5.f56764b)).f51799a.f55873q;
            boolean zM22118f = tj3Var.m22118f(j);
            Object objM22097O = tj3Var.m22097O();
            if (zM22118f || objM22097O == we1.f66679a) {
                objM22097O = new C3405od(0, j);
                tj3Var.m22131l0(objM22097O);
            }
            eh0.m11124d(e16Var, (vi3) objM22097O, tj3Var, i2 & 14);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3456pd(i, 0, e16Var);
        }
    }
}
