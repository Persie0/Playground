package p000;

import androidx.glance.AbstractC0640a;
import com.lingq.core.p012ui.R$string;
import com.lingq.feature.onboarding.p014v2.pages.p023long.AbstractC2231b;
import com.lingq.feature.reader.R$drawable;
import com.lingq.feature.reader.stats.p019ui.components.AbstractC2558b;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class fn5 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f39340a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ float f39341b;

    public /* synthetic */ fn5(int i, float f) {
        this.f39340a = i;
        this.f39341b = f;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f39340a;
        mn3 mn3Var = mn3.f51554a;
        xfa xfaVar = xfa.f68157a;
        float f = this.f39341b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC2558b.m9480m(f, (ye1) obj, pk9.m19383z(7));
                break;
            case 1:
                ((Integer) obj2).getClass();
                AbstractC2231b.m9195h(f, (ye1) obj, pk9.m19383z(1));
                break;
            case 2:
                ye1 ye1Var = (ye1) obj;
                int iIntValue = ((Integer) obj2).intValue();
                tj3 tj3Var = (tj3) ye1Var;
                if (!tj3Var.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    tj3Var.m22102U();
                } else {
                    ty3.m22352b(AbstractC3423or.m18236U(R$drawable.ic_video_s, tj3Var, 0), vz1.m23620a0(tj3Var, R$string.ui_video), null, aa1.m198b(f, ((ms5) tj3Var.m22128k(ps5.f56764b)).f51799a.f55873q), tj3Var, 8, 4);
                }
                break;
            case 3:
                ye1 ye1Var2 = (ye1) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                tj3 tj3Var2 = (tj3) ye1Var2;
                if (!tj3Var2.m22099R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    tj3Var2.m22102U();
                } else {
                    AbstractC0640a.m2210a(new C0850ck(com.lingq.feature.widget.R$drawable.streak_play_button_bg), null, ci8.m4734s(mn3Var), 0, null, tj3Var2, 48, 24);
                    AbstractC0640a.m2210a(new C0850ck(com.lingq.feature.widget.R$drawable.ic_play_widget), vz1.m23620a0(tj3Var2, R$string.ui_play), ci8.m4706S(mn3Var, f / 2.0f), 0, null, tj3Var2, 0, 24);
                }
                break;
            default:
                ye1 ye1Var3 = (ye1) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                tj3 tj3Var3 = (tj3) ye1Var3;
                if (!tj3Var3.m22099R(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    tj3Var3.m22102U();
                } else {
                    AbstractC0640a.m2210a(new C0850ck(com.lingq.feature.widget.R$drawable.streak_day_circle_filled), null, ci8.m4734s(mn3Var), 0, null, tj3Var3, 48, 24);
                    AbstractC0640a.m2210a(new C0850ck(com.lingq.core.p012ui.R$drawable.ic_close_s), vz1.m23620a0(tj3Var3, com.lingq.feature.widget.R$string.widget_missed), ci8.m4706S(mn3Var, f), 0, new ea1(new j1a(dk9.f35750c)), tj3Var3, 32768, 8);
                }
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ fn5(int i, float f, int i2) {
        this.f39340a = i2;
        this.f39341b = f;
    }
}
