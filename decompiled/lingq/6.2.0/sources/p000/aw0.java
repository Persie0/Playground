package p000;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class aw0 implements ui3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f7599a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ jv0 f7600b;

    public /* synthetic */ aw0(jv0 jv0Var, int i) {
        this.f7599a = i;
        this.f7600b = jv0Var;
    }

    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() {
        int i = this.f7599a;
        xfa xfaVar = xfa.f68157a;
        jv0 jv0Var = this.f7600b;
        switch (i) {
            case 0:
                jv0Var.mo8873G();
                break;
            case 1:
                jv0Var.mo8872F();
                break;
            case 2:
                jv0Var.mo8886m();
                break;
            case 3:
                jv0Var.mo8885l();
                break;
            case 4:
                jv0Var.mo8886m();
                break;
            default:
                jv0Var.mo8885l();
                break;
        }
        return xfaVar;
    }
}
