package p000;

/* JADX INFO: renamed from: gz */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC3056gz implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f41538a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C3165jz f41539b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C3279kz f41540c;

    public /* synthetic */ RunnableC3056gz(C3165jz c3165jz, C3279kz c3279kz, int i) {
        this.f41538a = i;
        this.f41539b = c3165jz;
        this.f41540c = c3279kz;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f41538a;
        final C3279kz c3279kz = this.f41540c;
        C3165jz c3165jz = this.f41539b;
        switch (i) {
            case 0:
                ew2 ew2Var = c3165jz.f46414b;
                String str = uma.f64080a;
                l52 l52Var = ew2Var.f37985a.f46300r;
                final C3496qf c3496qfM15807I = l52Var.m15807I();
                final int i2 = 0;
                l52Var.m15808J(c3496qfM15807I, 1032, new sg5() { // from class: v42
                    @Override // p000.sg5
                    public final void invoke(Object obj) {
                        int i3 = i2;
                        C3279kz c3279kz2 = c3279kz;
                        C3496qf c3496qf = c3496qfM15807I;
                        InterfaceC3534rf interfaceC3534rf = (InterfaceC3534rf) obj;
                        switch (i3) {
                            case 0:
                                interfaceC3534rf.mo20638w(c3496qf, c3279kz2);
                                break;
                            default:
                                interfaceC3534rf.mo20630o(c3496qf, c3279kz2);
                                break;
                        }
                    }
                });
                break;
            default:
                ew2 ew2Var2 = c3165jz.f46414b;
                String str2 = uma.f64080a;
                l52 l52Var2 = ew2Var2.f37985a.f46300r;
                final C3496qf c3496qfM15807I2 = l52Var2.m15807I();
                final int i3 = 1;
                l52Var2.m15808J(c3496qfM15807I2, 1031, new sg5() { // from class: v42
                    @Override // p000.sg5
                    public final void invoke(Object obj) {
                        int i4 = i3;
                        C3279kz c3279kz2 = c3279kz;
                        C3496qf c3496qf = c3496qfM15807I2;
                        InterfaceC3534rf interfaceC3534rf = (InterfaceC3534rf) obj;
                        switch (i4) {
                            case 0:
                                interfaceC3534rf.mo20638w(c3496qf, c3279kz2);
                                break;
                            default:
                                interfaceC3534rf.mo20630o(c3496qf, c3279kz2);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
