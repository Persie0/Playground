package p000;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class f52 implements sg5 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f38428a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C3496qf f38429b;

    public /* synthetic */ f52(C3496qf c3496qf, l32 l32Var, int i) {
        this.f38428a = i;
        this.f38429b = c3496qf;
    }

    @Override // p000.sg5
    public final void invoke(Object obj) {
        int i = this.f38428a;
        C3496qf c3496qf = this.f38429b;
        InterfaceC3534rf interfaceC3534rf = (InterfaceC3534rf) obj;
        switch (i) {
            case 0:
                interfaceC3534rf.mo20640y(c3496qf);
                break;
            case 1:
                interfaceC3534rf.mo20603B(c3496qf);
                break;
            default:
                interfaceC3534rf.mo20631p(c3496qf);
                break;
        }
    }
}
