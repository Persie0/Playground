package p000;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class z42 implements sg5 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f70857a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C3496qf f70858b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f70859c;

    public /* synthetic */ z42(C3496qf c3496qf, int i, long j) {
        this.f70857a = 3;
        this.f70858b = c3496qf;
        this.f70859c = i;
    }

    @Override // p000.sg5
    public final void invoke(Object obj) {
        int i = this.f70857a;
        int i2 = this.f70859c;
        C3496qf c3496qf = this.f70858b;
        InterfaceC3534rf interfaceC3534rf = (InterfaceC3534rf) obj;
        switch (i) {
            case 0:
                interfaceC3534rf.mo20615N(c3496qf, i2);
                break;
            case 1:
                interfaceC3534rf.mo20634s(c3496qf, i2);
                break;
            case 2:
                interfaceC3534rf.mo20624i(c3496qf, i2);
                break;
            case 3:
                interfaceC3534rf.mo20627l(c3496qf, i2);
                break;
            case 4:
                interfaceC3534rf.mo20633r(c3496qf, i2);
                break;
            default:
                interfaceC3534rf.mo20636u(c3496qf, i2);
                break;
        }
    }

    public /* synthetic */ z42(C3496qf c3496qf, int i, int i2) {
        this.f70857a = i2;
        this.f70858b = c3496qf;
        this.f70859c = i;
    }

    public /* synthetic */ z42(C3496qf c3496qf, pu5 pu5Var, int i) {
        this.f70857a = 5;
        this.f70858b = c3496qf;
        this.f70859c = i;
    }
}
