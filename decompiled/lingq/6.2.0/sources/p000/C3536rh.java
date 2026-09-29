package p000;

import androidx.glance.appwidget.AbstractC0659g;

/* JADX INFO: renamed from: rh */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3536rh implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f59250a = 2;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ long f59251b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f59252c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f59253d;

    public /* synthetic */ C3536rh(long j, t17 t17Var, aj3 aj3Var) {
        this.f59251b = j;
        this.f59252c = t17Var;
        this.f59253d = aj3Var;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00af  */
    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f59250a;
        xfa xfaVar = xfa.f68157a;
        Object obj3 = this.f59253d;
        Object obj4 = this.f59252c;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC3685vh.m23281a((oq6) obj4, (e16) obj3, this.f59251b, (ye1) obj, pk9.m19383z(1));
                break;
            case 1:
                AbstractC0659g abstractC0659g = (AbstractC0659g) obj4;
                zi3 zi3Var = (zi3) obj3;
                ye1 ye1Var = (ye1) obj;
                if ((((Integer) obj2).intValue() & 3) != 2) {
                    r46.m20378c(0, this.f59251b, ye1Var, zi3Var, abstractC0659g.mo2234c());
                } else {
                    tj3 tj3Var = (tj3) ye1Var;
                    if (!tj3Var.m22086D()) {
                        r46.m20378c(0, this.f59251b, ye1Var, zi3Var, abstractC0659g.mo2234c());
                    } else {
                        tj3Var.m22102U();
                    }
                }
                break;
            case 2:
                t17 t17Var = (t17) obj4;
                aj3 aj3Var = (aj3) obj3;
                ye1 ye1Var2 = (ye1) obj;
                int iIntValue = ((Integer) obj2).intValue();
                tj3 tj3Var2 = (tj3) ye1Var2;
                if (!tj3Var2.m22099R(1 & iIntValue, (iIntValue & 3) != 2)) {
                    tj3Var2.m22102U();
                } else {
                    AbstractC3489q9.m19773c(this.f59251b, ((ms5) tj3Var2.m22128k(ps5.f56764b)).f51800b.f71409m, ci8.m4703P(417635459, new C3794yf(3, t17Var, aj3Var), tj3Var2), tj3Var2, 384);
                }
                break;
            case 3:
                ((Integer) obj2).getClass();
                pb1.m19032b((e16) obj3, (String) obj4, this.f59251b, (ye1) obj, pk9.m19383z(1));
                break;
            default:
                ((Integer) obj2).getClass();
                int iM19383z = pk9.m19383z(1);
                long j = this.f59251b;
                r46.m20378c(iM19383z, j, (ye1) obj, (zi3) obj3, (g99) obj4);
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ C3536rh(e16 e16Var, String str, long j, int i) {
        this.f59253d = e16Var;
        this.f59252c = str;
        this.f59251b = j;
    }

    public /* synthetic */ C3536rh(oq6 oq6Var, e16 e16Var, long j, int i) {
        this.f59252c = oq6Var;
        this.f59253d = e16Var;
        this.f59251b = j;
    }

    public /* synthetic */ C3536rh(g99 g99Var, long j, zi3 zi3Var, int i) {
        this.f59252c = g99Var;
        this.f59251b = j;
        this.f59253d = zi3Var;
    }

    public /* synthetic */ C3536rh(AbstractC0659g abstractC0659g, long j, zi3 zi3Var) {
        this.f59252c = abstractC0659g;
        this.f59251b = j;
        this.f59253d = zi3Var;
    }
}
