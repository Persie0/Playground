package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class nz7 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f53451a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vi3 f53452b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ z19 f53453c;

    public /* synthetic */ nz7(vi3 vi3Var, z19 z19Var, int i) {
        this.f53451a = i;
        this.f53452b = vi3Var;
        this.f53453c = z19Var;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        int i = this.f53451a;
        xfa xfaVar = xfa.f68157a;
        z19 z19Var = this.f53453c;
        vi3 vi3Var = this.f53452b;
        switch (i) {
            case 0:
                vi3Var.invoke(new iz7(z19Var.f70756d, ((Boolean) obj).booleanValue()));
                break;
            case 1:
                vi3Var.invoke(new gf8(z19Var.f70756d, ((Boolean) obj).booleanValue()));
                break;
            default:
                vi3Var.invoke(new c19(z19Var.f70756d, ((Boolean) obj).booleanValue()));
                break;
        }
        return xfaVar;
    }
}
