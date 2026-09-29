package p000;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class x42 implements sg5 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f67746a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C3496qf f67747b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f67748c;

    public /* synthetic */ x42(C3496qf c3496qf, boolean z, int i) {
        this.f67746a = i;
        this.f67747b = c3496qf;
        this.f67748c = z;
    }

    @Override // p000.sg5
    public final void invoke(Object obj) {
        int i = this.f67746a;
        boolean z = this.f67748c;
        C3496qf c3496qf = this.f67747b;
        InterfaceC3534rf interfaceC3534rf = (InterfaceC3534rf) obj;
        switch (i) {
            case 0:
                interfaceC3534rf.mo20617b(c3496qf, z);
                break;
            case 1:
                interfaceC3534rf.mo20616a(c3496qf, z);
                break;
            case 2:
                interfaceC3534rf.mo20619d(c3496qf, z);
                break;
            default:
                interfaceC3534rf.getClass();
                interfaceC3534rf.mo20611J(c3496qf, z);
                break;
        }
    }
}
