package p000;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class d52 implements sg5, kk1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f35006a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f35007b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f35008c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f35009d;

    public /* synthetic */ d52(int i, C3496qf c3496qf, ca7 ca7Var, ca7 ca7Var2) {
        this.f35007b = c3496qf;
        this.f35006a = i;
        this.f35008c = ca7Var;
        this.f35009d = ca7Var2;
    }

    @Override // p000.kk1
    public void accept(Object obj) {
        fm2 fm2Var = (fm2) this.f35007b;
        ((ov5) obj).mo11804C(fm2Var.f39277a, fm2Var.f39278b, (eh5) this.f35008c, (ru5) this.f35009d, this.f35006a);
    }

    @Override // p000.sg5
    public void invoke(Object obj) {
        C3496qf c3496qf = (C3496qf) this.f35007b;
        ca7 ca7Var = (ca7) this.f35008c;
        ca7 ca7Var2 = (ca7) this.f35009d;
        InterfaceC3534rf interfaceC3534rf = (InterfaceC3534rf) obj;
        interfaceC3534rf.getClass();
        interfaceC3534rf.mo20608G(this.f35006a, c3496qf, ca7Var, ca7Var2);
    }

    public /* synthetic */ d52(fm2 fm2Var, eh5 eh5Var, ru5 ru5Var, int i) {
        this.f35007b = fm2Var;
        this.f35008c = eh5Var;
        this.f35009d = ru5Var;
        this.f35006a = i;
    }
}
