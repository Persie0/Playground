package p000;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class mya implements ui3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f52047a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ t66 f52048b;

    public /* synthetic */ mya(int i, t66 t66Var) {
        this.f52047a = i;
        this.f52048b = t66Var;
    }

    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() {
        int i = this.f52047a;
        xfa xfaVar = xfa.f68157a;
        t66 t66Var = this.f52048b;
        switch (i) {
            case 0:
                t66Var.setValue(Boolean.TRUE);
                break;
            case 1:
                t66Var.setValue(Boolean.FALSE);
                break;
            case 2:
                t66Var.setValue(Boolean.TRUE);
                break;
            case 3:
                t66Var.setValue(Boolean.FALSE);
                break;
            case 4:
                t66Var.setValue(Boolean.TRUE);
                break;
            case 5:
                t66Var.setValue(Boolean.TRUE);
                break;
            default:
                t66Var.setValue(Boolean.FALSE);
                break;
        }
        return xfaVar;
    }
}
