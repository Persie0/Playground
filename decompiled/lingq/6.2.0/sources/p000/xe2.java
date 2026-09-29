package p000;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class xe2 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f68118a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ sc9 f68119b;

    public /* synthetic */ xe2(sc9 sc9Var, int i) {
        this.f68118a = i;
        this.f68119b = sc9Var;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        int i = this.f68118a;
        xfa xfaVar = xfa.f68157a;
        sc9 sc9Var = this.f68119b;
        switch (i) {
            case 0:
                sc9Var.m21223i((int) (((n84) obj).f52482a & 4294967295L));
                break;
            case 1:
                sc9Var.m21223i((int) (((n84) obj).f52482a & 4294967295L));
                break;
            case 2:
                sc9Var.m21223i((int) (((n84) obj).f52482a >> 32));
                break;
            default:
                aq4 aq4Var = (aq4) obj;
                aq4Var.getClass();
                sc9Var.m21223i((int) (aq4Var.mo1687j() & 4294967295L));
                break;
        }
        return xfaVar;
    }
}
