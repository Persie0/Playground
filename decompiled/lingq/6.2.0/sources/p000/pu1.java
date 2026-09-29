package p000;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class pu1 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f56794a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ru1 f56795b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ui3 f56796c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f56797d;

    public /* synthetic */ pu1(ru1 ru1Var, ui3 ui3Var, int i, int i2) {
        this.f56794a = i2;
        this.f56795b = ru1Var;
        this.f56796c = ui3Var;
        this.f56797d = i;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f56794a;
        xfa xfaVar = xfa.f68157a;
        int i2 = this.f56797d;
        ui3 ui3Var = this.f56796c;
        ru1 ru1Var = this.f56795b;
        ye1 ye1Var = (ye1) obj;
        ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                qu1.m20173j(ru1Var, ui3Var, ye1Var, pk9.m19383z(i2 | 1));
                break;
            default:
                qu1.m20172i(ru1Var, ui3Var, ye1Var, pk9.m19383z(i2 | 1));
                break;
        }
        return xfaVar;
    }
}
