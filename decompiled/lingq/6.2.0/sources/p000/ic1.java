package p000;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ic1 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f43917a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ uc1 f43918b;

    public /* synthetic */ ic1(uc1 uc1Var, int i) {
        this.f43917a = i;
        this.f43918b = uc1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f43917a;
        uc1 uc1Var = this.f43918b;
        switch (i) {
            case 0:
                uc1.m22668f(uc1Var);
                break;
            default:
                uc1Var.invalidateOptionsMenu();
                break;
        }
    }
}
