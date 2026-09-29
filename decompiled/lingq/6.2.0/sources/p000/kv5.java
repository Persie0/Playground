package p000;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class kv5 implements kk1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f48464a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ fm2 f48465b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ eh5 f48466c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ru5 f48467d;

    public /* synthetic */ kv5(fm2 fm2Var, eh5 eh5Var, ru5 ru5Var, int i) {
        this.f48464a = i;
        this.f48465b = fm2Var;
        this.f48466c = eh5Var;
        this.f48467d = ru5Var;
    }

    @Override // p000.kk1
    public final void accept(Object obj) {
        int i = this.f48464a;
        ru5 ru5Var = this.f48467d;
        eh5 eh5Var = this.f48466c;
        fm2 fm2Var = this.f48465b;
        ov5 ov5Var = (ov5) obj;
        switch (i) {
            case 0:
                ov5Var.mo11809j(fm2Var.f39277a, fm2Var.f39278b, eh5Var, ru5Var);
                break;
            default:
                ov5Var.mo11808g(fm2Var.f39277a, fm2Var.f39278b, eh5Var, ru5Var);
                break;
        }
    }
}
