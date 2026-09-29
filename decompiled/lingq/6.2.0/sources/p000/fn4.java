package p000;

import androidx.lifecycle.compose.AbstractC0711a;
import com.lingq.core.domain.model.language.LanguageProgressMetric;
import com.lingq.core.domain.model.language.LanguageProgressPeriod;
import com.lingq.feature.statistics.C2810a;
import com.lingq.feature.statistics.LanguageStatsAllFragment;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class fn4 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f39338a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ LanguageStatsAllFragment f39339b;

    public /* synthetic */ fn4(LanguageStatsAllFragment languageStatsAllFragment, int i) {
        this.f39338a = i;
        this.f39339b = languageStatsAllFragment;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f39338a;
        xfa xfaVar = xfa.f68157a;
        LanguageStatsAllFragment languageStatsAllFragment = this.f39339b;
        switch (i) {
            case 0:
                w41 w41Var = languageStatsAllFragment.f33120B0;
                ye1 ye1Var = (ye1) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i2 = 1;
                tj3 tj3Var = (tj3) ye1Var;
                if (!tj3Var.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    tj3Var.m22102U();
                } else {
                    t66 t66VarM2513c = AbstractC0711a.m2513c(((C2810a) w41Var.getValue()).f33382g, tj3Var);
                    String strM17093L = AbstractC3352my.m17093L(languageStatsAllFragment.m2090R(), ((C2810a) w41Var.getValue()).f33377b.mo4589b2());
                    zh9 zh9Var = (zh9) t66VarM2513c.getValue();
                    boolean zM22124i = tj3Var.m22124i(languageStatsAllFragment);
                    Object objM22097O = tj3Var.m22097O();
                    p84 p84Var = we1.f66679a;
                    if (zM22124i || objM22097O == p84Var) {
                        objM22097O = new C3539rk(languageStatsAllFragment, 24);
                        tj3Var.m22131l0(objM22097O);
                    }
                    ui3 ui3Var = (ui3) objM22097O;
                    boolean zM22124i2 = tj3Var.m22124i(languageStatsAllFragment);
                    Object objM22097O2 = tj3Var.m22097O();
                    if (zM22124i2 || objM22097O2 == p84Var) {
                        objM22097O2 = new fn4(languageStatsAllFragment, i2);
                        tj3Var.m22131l0(objM22097O2);
                    }
                    zi3 zi3Var = (zi3) objM22097O2;
                    boolean zM22124i3 = tj3Var.m22124i(languageStatsAllFragment);
                    Object objM22097O3 = tj3Var.m22097O();
                    if (zM22124i3 || objM22097O3 == p84Var) {
                        objM22097O3 = new C3741x(languageStatsAllFragment, 28);
                        tj3Var.m22131l0(objM22097O3);
                    }
                    yhd.m25145a(strM17093L, zh9Var, ui3Var, zi3Var, (vi3) objM22097O3, tj3Var, 0, 0);
                }
                break;
            default:
                LanguageProgressPeriod languageProgressPeriod = (LanguageProgressPeriod) obj;
                LanguageProgressMetric languageProgressMetric = (LanguageProgressMetric) obj2;
                languageProgressPeriod.getClass();
                languageProgressMetric.getClass();
                ud6 ud6VarM3244j = b34.m3244j(languageStatsAllFragment);
                uo4 uo4Var = vo4.Companion;
                if (languageProgressPeriod == LanguageProgressPeriod.Today) {
                    languageProgressPeriod = LanguageProgressPeriod.Last7Days;
                }
                uo4Var.getClass();
                languageProgressPeriod.getClass();
                jfa.m14428k(ud6VarM3244j, new to4(languageProgressPeriod, languageProgressMetric), null);
                break;
        }
        return xfaVar;
    }
}
