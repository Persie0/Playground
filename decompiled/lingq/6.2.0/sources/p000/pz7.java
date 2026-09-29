package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class pz7 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f57052a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vi3 f57053b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ a29 f57054c;

    public /* synthetic */ pz7(vi3 vi3Var, a29 a29Var, int i) {
        this.f57052a = i;
        this.f57053b = vi3Var;
        this.f57054c = a29Var;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        int i = this.f57052a;
        xfa xfaVar = xfa.f68157a;
        a29 a29Var = this.f57054c;
        vi3 vi3Var = this.f57053b;
        switch (i) {
            case 0:
                vi3Var.invoke(new iz7(a29Var.f131c, ((Boolean) obj).booleanValue()));
                break;
            case 1:
                vi3Var.invoke(new gf8(a29Var.f131c, ((Boolean) obj).booleanValue()));
                break;
            default:
                vi3Var.invoke(new c19(a29Var.f131c, ((Boolean) obj).booleanValue()));
                break;
        }
        return xfaVar;
    }
}
