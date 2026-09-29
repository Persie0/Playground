package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class wz4 implements ui3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f67548a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vi3 f67549b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ w65 f67550c;

    public /* synthetic */ wz4(vi3 vi3Var, w65 w65Var, int i) {
        this.f67548a = i;
        this.f67549b = vi3Var;
        this.f67550c = w65Var;
    }

    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() {
        int i = this.f67548a;
        xfa xfaVar = xfa.f68157a;
        w65 w65Var = this.f67550c;
        vi3 vi3Var = this.f67549b;
        switch (i) {
            case 0:
                vi3Var.invoke(new t1b(w65Var));
                break;
            default:
                vi3Var.invoke(w65Var);
                break;
        }
        return xfaVar;
    }
}
