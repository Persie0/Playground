package p000;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class y42 implements sg5 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f69269a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C3496qf f69270b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f69271c;

    public /* synthetic */ y42(C3496qf c3496qf, String str, int i) {
        this.f69269a = i;
        this.f69270b = c3496qf;
        this.f69271c = str;
    }

    @Override // p000.sg5
    public final void invoke(Object obj) {
        int i = this.f69269a;
        String str = this.f69271c;
        C3496qf c3496qf = this.f69270b;
        InterfaceC3534rf interfaceC3534rf = (InterfaceC3534rf) obj;
        switch (i) {
            case 0:
                interfaceC3534rf.getClass();
                interfaceC3534rf.mo20621f(c3496qf, str);
                break;
            case 1:
                interfaceC3534rf.mo20637v(c3496qf, str);
                break;
            case 2:
                interfaceC3534rf.getClass();
                interfaceC3534rf.mo20610I(c3496qf, str);
                break;
            default:
                interfaceC3534rf.mo20618c(c3496qf, str);
                break;
        }
    }

    public /* synthetic */ y42(C3496qf c3496qf, String str, long j, long j2, int i) {
        this.f69269a = i;
        this.f69270b = c3496qf;
        this.f69271c = str;
    }
}
