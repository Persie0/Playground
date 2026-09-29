package p000;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kq6 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f48334a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ float f48335b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ float f48336c;

    public /* synthetic */ kq6(float f, float f2, int i) {
        this.f48334a = i;
        this.f48335b = f;
        this.f48336c = f2;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        int i = this.f48334a;
        xfa xfaVar = xfa.f68157a;
        float f = this.f48336c;
        float f2 = this.f48335b;
        y64 y64Var = (y64) obj;
        switch (i) {
            case 0:
                y64Var.f69365a = "offset";
                z91 z91Var = y64Var.f69367c;
                z91Var.m25511b(new xj2(f2), "x");
                z91Var.m25511b(new xj2(f), "y");
                break;
            default:
                y64Var.f69365a = "padding";
                z91 z91Var2 = y64Var.f69367c;
                z91Var2.m25511b(new xj2(f2), "horizontal");
                z91Var2.m25511b(new xj2(f), "vertical");
                break;
        }
        return xfaVar;
    }
}
