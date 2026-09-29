package p000;

import androidx.compose.material3.AbstractC0231g;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class y53 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f69303a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f69304b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ui3 f69305c;

    public /* synthetic */ y53(ui3 ui3Var, boolean z) {
        this.f69303a = 2;
        this.f69305c = ui3Var;
        this.f69304b = z;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f69303a;
        ui3 ui3Var = this.f69305c;
        boolean z = this.f69304b;
        xfa xfaVar = xfa.f68157a;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                mdd.m16791a(z, ui3Var, (ye1) obj, pk9.m19383z(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                mdd.m16791a(z, ui3Var, (ye1) obj, pk9.m19383z(1));
                break;
            default:
                ye1 ye1Var = (ye1) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i2 = 2;
                tj3 tj3Var = (tj3) ye1Var;
                if (!tj3Var.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    tj3Var.m22102U();
                } else {
                    boolean z2 = this.f69304b;
                    AbstractC0231g.m1153f(805306368, 506, null, tj3Var, this.f69305c, ci8.m4703P(1959686698, new l04(i2, z2), tj3Var), null, null, null, z2);
                }
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ y53(boolean z, ui3 ui3Var, int i, int i2) {
        this.f69303a = i2;
        this.f69304b = z;
        this.f69305c = ui3Var;
    }
}
