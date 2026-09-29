package p000;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class tf2 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f62216a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f62217b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ui3 f62218c;

    public /* synthetic */ tf2(String str, ui3 ui3Var, int i, int i2) {
        this.f62216a = i2;
        this.f62217b = str;
        this.f62218c = ui3Var;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f62216a;
        xfa xfaVar = xfa.f68157a;
        ui3 ui3Var = this.f62218c;
        String str = this.f62217b;
        ye1 ye1Var = (ye1) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                vf2.m23259a(str, ui3Var, ye1Var, pk9.m19383z(1));
                break;
            case 1:
                ejd.m11202d(str, ui3Var, ye1Var, pk9.m19383z(1));
                break;
            case 2:
                ejd.m11203e(str, ui3Var, ye1Var, pk9.m19383z(1));
                break;
            case 3:
                ejd.m11199a(str, ui3Var, ye1Var, pk9.m19383z(1));
                break;
            case 4:
                xb8.m24440a(str, ui3Var, ye1Var, pk9.m19383z(3073));
                break;
            case 5:
                uwc.m22970b(str, ui3Var, ye1Var, pk9.m19383z(1));
                break;
            default:
                ecd.m11040b(str, ui3Var, ye1Var, pk9.m19383z(1));
                break;
        }
        return xfaVar;
    }
}
