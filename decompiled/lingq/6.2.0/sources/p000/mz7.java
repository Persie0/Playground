package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class mz7 implements ui3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f52083a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vi3 f52084b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ e29 f52085c;

    public /* synthetic */ mz7(vi3 vi3Var, e29 e29Var, int i) {
        this.f52083a = i;
        this.f52084b = vi3Var;
        this.f52085c = e29Var;
    }

    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() {
        int i = this.f52083a;
        xfa xfaVar = xfa.f68157a;
        e29 e29Var = this.f52085c;
        vi3 vi3Var = this.f52084b;
        switch (i) {
            case 0:
                vi3Var.invoke(new ez7(e29Var.f36626c));
                break;
            case 1:
                vi3Var.invoke(new ff8(e29Var.f36626c));
                break;
            default:
                vi3Var.invoke(new u09(e29Var.f36626c));
                break;
        }
        return xfaVar;
    }
}
