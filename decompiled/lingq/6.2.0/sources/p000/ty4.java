package p000;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ty4 implements ui3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f63093a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vi3 f63094b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ w65 f63095c;

    public /* synthetic */ ty4(vi3 vi3Var, w65 w65Var, int i) {
        this.f63093a = i;
        this.f63094b = vi3Var;
        this.f63095c = w65Var;
    }

    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() {
        int i = this.f63093a;
        xfa xfaVar = xfa.f68157a;
        w65 w65Var = this.f63095c;
        vi3 vi3Var = this.f63094b;
        switch (i) {
            case 0:
                vi3Var.invoke(w65Var);
                break;
            case 1:
                vi3Var.invoke(new s1b(w65Var));
                break;
            case 2:
                vi3Var.invoke(w65Var);
                break;
            default:
                vi3Var.invoke(w65Var);
                break;
        }
        return xfaVar;
    }
}
