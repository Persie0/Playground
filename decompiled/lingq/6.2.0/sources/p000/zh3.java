package p000;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class zh3 implements ui3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f71574a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vi3 f71575b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ vi3 f71576c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ t66 f71577d;

    public /* synthetic */ zh3(vi3 vi3Var, vi3 vi3Var2, t66 t66Var, int i) {
        this.f71574a = i;
        this.f71575b = vi3Var;
        this.f71576c = vi3Var2;
        this.f71577d = t66Var;
    }

    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() {
        int i = this.f71574a;
        sh3 sh3Var = sh3.f60862a;
        fh3 fh3Var = fh3.f39103a;
        xfa xfaVar = xfa.f68157a;
        t66 t66Var = this.f71577d;
        vi3 vi3Var = this.f71576c;
        vi3 vi3Var2 = this.f71575b;
        switch (i) {
            case 0:
                t66Var.setValue(Boolean.TRUE);
                vi3Var2.invoke(fh3Var);
                vi3Var.invoke(sh3Var);
                break;
            case 1:
                t66Var.setValue(Boolean.TRUE);
                vi3Var2.invoke(fh3Var);
                vi3Var.invoke(sh3Var);
                break;
            default:
                vi3Var2.invoke(new wja((String) t66Var.getValue()));
                vi3Var.invoke(bka.f8646a);
                break;
        }
        return xfaVar;
    }
}
