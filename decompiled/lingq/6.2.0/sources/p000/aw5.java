package p000;

import androidx.glance.AbstractC0640a;
import androidx.glance.layout.AbstractC0686a;
import com.lingq.feature.widget.R$drawable;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class aw5 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f7611a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ fk9 f7612b;

    public /* synthetic */ aw5(fk9 fk9Var, int i) {
        this.f7611a = i;
        this.f7612b = fk9Var;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f7611a;
        fk9 fk9Var = this.f7612b;
        xfa xfaVar = xfa.f68157a;
        mn3 mn3Var = mn3.f51554a;
        int i2 = 2;
        int i3 = 1;
        switch (i) {
            case 0:
                ye1 ye1Var = (ye1) obj;
                int iIntValue = ((Integer) obj2).intValue();
                tj3 tj3Var = (tj3) ye1Var;
                if (!tj3Var.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    tj3Var.m22102U();
                } else {
                    AbstractC0640a.m2210a(new C0850ck(R$drawable.streak_widget_ripples), null, ci8.m4706S(mn3Var, 120.0f), 0, null, tj3Var, 48, 16);
                    AbstractC0686a.m2486b(wfb.m23928w(ci8.m4734s(mn3Var), 12.0f), 0, 2, ci8.m4703P(-791847003, new qp4(fk9Var, i3), tj3Var), tj3Var, 3072, 2);
                }
                break;
            case 1:
                ye1 ye1Var2 = (ye1) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                tj3 tj3Var2 = (tj3) ye1Var2;
                if (!tj3Var2.m22099R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    tj3Var2.m22102U();
                } else {
                    dk9.m10442a(ci8.m4735t(mn3Var).mo16935d(new cs3(og2.f54304a)), 0.0f, tj3Var2, 0, 2);
                    dk9.m10444c(this.f7612b, wfb.m23928w(ci8.m4735t(mn3Var), 8.0f), 0L, 0L, tj3Var2, 0, 12);
                }
                break;
            default:
                ye1 ye1Var3 = (ye1) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                tj3 tj3Var3 = (tj3) ye1Var3;
                if (!tj3Var3.m22099R(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    tj3Var3.m22102U();
                } else {
                    AbstractC0686a.m2485a(ci8.m4734s(mn3Var), C3532re.f59147g, qoc.f58023a, tj3Var3, 384, 0);
                    AbstractC0686a.m2486b(wfb.m23928w(ci8.m4734s(mn3Var), 12.0f), 1, 2, ci8.m4703P(-56250603, new qp4(fk9Var, i2), tj3Var3), tj3Var3, 3072, 0);
                }
                break;
        }
        return xfaVar;
    }
}
