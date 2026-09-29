package p000;

import androidx.compose.runtime.internal.C0282a;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class f61 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f38508a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ui3 f38509b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0282a f38510c;

    public /* synthetic */ f61(ui3 ui3Var, C0282a c0282a) {
        this.f38509b = ui3Var;
        this.f38510c = c0282a;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f38508a;
        xfa xfaVar = xfa.f68157a;
        C0282a c0282a = this.f38510c;
        switch (i) {
            case 0:
                ye1 ye1Var = (ye1) obj;
                int iIntValue = ((Integer) obj2).intValue();
                tj3 tj3Var = (tj3) ye1Var;
                if (!tj3Var.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    tj3Var.m22102U();
                } else {
                    omd.m18141c(this.f38509b, c99.m4422o(b16.f7762a, 40.0f), false, null, null, ci8.m4703P(-703406093, new ry3(c0282a, 1), tj3Var), tj3Var, 1572912, 60);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                w7d.m23810e(this.f38509b, c0282a, (ye1) obj, pk9.m19383z(49));
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ f61(ui3 ui3Var, C0282a c0282a, int i) {
        this.f38509b = ui3Var;
        this.f38510c = c0282a;
    }
}
