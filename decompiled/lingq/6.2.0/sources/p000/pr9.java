package p000;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pr9 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f56730a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ tr9 f56731b;

    public /* synthetic */ pr9(tr9 tr9Var, int i) {
        this.f56730a = i;
        this.f56731b = tr9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f56730a;
        tr9 tr9Var = this.f56731b;
        switch (i) {
            case 0:
                tr9Var.f62780g.m17680G(tr9Var);
                break;
            default:
                tr9Var.f62780g.m17681H(tr9Var);
                break;
        }
    }
}
