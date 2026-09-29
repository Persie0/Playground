package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class uk4 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f64020a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ul0 f64021b;

    public /* synthetic */ uk4(ul0 ul0Var, int i) {
        this.f64020a = i;
        this.f64021b = ul0Var;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        int i = this.f64020a;
        xfa xfaVar = xfa.f68157a;
        ul0 ul0Var = this.f64021b;
        switch (i) {
            case 0:
                ul0Var.cancel();
                break;
            default:
                ul0Var.cancel();
                break;
        }
        return xfaVar;
    }
}
