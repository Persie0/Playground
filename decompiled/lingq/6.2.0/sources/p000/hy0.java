package p000;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class hy0 implements ui3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f43139a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ jv0 f43140b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ t66 f43141c;

    public /* synthetic */ hy0(jv0 jv0Var, t66 t66Var, int i) {
        this.f43139a = i;
        this.f43140b = jv0Var;
        this.f43141c = t66Var;
    }

    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() {
        int i = this.f43139a;
        xfa xfaVar = xfa.f68157a;
        t66 t66Var = this.f43141c;
        jv0 jv0Var = this.f43140b;
        switch (i) {
            case 0:
                if (((Boolean) t66Var.getValue()).booleanValue()) {
                    jv0Var.mo8894u();
                }
                break;
            case 1:
                t66Var.setValue(Boolean.FALSE);
                jv0Var.mo8867A();
                break;
            default:
                t66Var.setValue(Boolean.FALSE);
                jv0Var.mo8867A();
                break;
        }
        return xfaVar;
    }
}
