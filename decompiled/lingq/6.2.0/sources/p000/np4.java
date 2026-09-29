package p000;

import androidx.glance.AbstractC0640a;
import androidx.glance.layout.AbstractC0686a;
import com.lingq.feature.widget.R$drawable;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class np4 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f53093a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ long f53094b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f53095c;

    public /* synthetic */ np4(fk9 fk9Var, long j) {
        this.f53095c = fk9Var;
        this.f53094b = j;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f53093a;
        xfa xfaVar = xfa.f68157a;
        Object obj3 = this.f53095c;
        final long j = this.f53094b;
        switch (i) {
            case 0:
                final fk9 fk9Var = (fk9) obj3;
                ye1 ye1Var = (ye1) obj;
                int iIntValue = ((Integer) obj2).intValue();
                tj3 tj3Var = (tj3) ye1Var;
                if (!tj3Var.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    tj3Var.m22102U();
                } else {
                    C0850ck c0850ck = new C0850ck(R$drawable.streak_widget_ripples);
                    mn3 mn3Var = mn3.f51554a;
                    AbstractC0640a.m2210a(c0850ck, null, ci8.m4706S(mn3Var, 160.0f), 0, null, tj3Var, 48, 16);
                    AbstractC0686a.m2486b(ci8.m4734s(mn3Var), 0, 2, ci8.m4703P(239235709, new aj3() { // from class: pp4
                        @Override // p000.aj3
                        public final Object invoke(Object obj4, Object obj5, Object obj6) {
                            ye1 ye1Var2 = (ye1) obj5;
                            ((Integer) obj6).getClass();
                            ((cb1) obj4).getClass();
                            mn3 mn3Var2 = mn3.f51554a;
                            AbstractC0686a.m2485a(ci8.m4735t(mn3Var2).mo16935d(new cs3(og2.f54304a)), C3532re.f59144d, wsb.f67261c, ye1Var2, 384, 0);
                            AbstractC0686a.m2488d(cb1.m4485a(mn3Var2), ye1Var2, 0);
                            fk9 fk9Var2 = fk9Var;
                            AbstractC0686a.m2487c(null, 0, 0, ci8.m4703P(375445401, new qp4(fk9Var2, 0), ye1Var2), ye1Var2, 3072, 7);
                            AbstractC0686a.m2488d(cb1.m4485a(mn3Var2), ye1Var2, 0);
                            dk9.m10445d(fk9Var2.f39233g, wfb.m23928w(mn3Var2, 12.0f), xj2.m24559a(bk2.m3806b(j), 280.0f) < 0 ? 32.0f : 38.0f, d32.m10018P(14), ye1Var2, 3072, 0);
                            return xfa.f68157a;
                        }
                    }, tj3Var), tj3Var, 3072, 2);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                h5d.m13068a(pk9.m19383z(1), j, (ye1) obj, (String) obj3);
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ np4(String str, int i, long j) {
        this.f53094b = j;
        this.f53095c = str;
    }
}
