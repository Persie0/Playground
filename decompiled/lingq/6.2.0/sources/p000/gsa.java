package p000;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class gsa implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f41269a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C3165jz f41270b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ l32 f41271c;

    public /* synthetic */ gsa(C3165jz c3165jz, l32 l32Var, int i) {
        this.f41269a = i;
        this.f41270b = c3165jz;
        this.f41271c = l32Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f41269a) {
            case 0:
                C3165jz c3165jz = this.f41270b;
                l32 l32Var = this.f41271c;
                ew2 ew2Var = c3165jz.f46414b;
                String str = uma.f64080a;
                l52 l52Var = ew2Var.f37985a.f46300r;
                C3496qf c3496qfM15807I = l52Var.m15807I();
                l52Var.m15808J(c3496qfM15807I, 1015, new f52(c3496qfM15807I, l32Var, 2));
                break;
            default:
                C3165jz c3165jz2 = this.f41270b;
                l32 l32Var2 = this.f41271c;
                synchronized (l32Var2) {
                }
                ew2 ew2Var2 = c3165jz2.f46414b;
                String str2 = uma.f64080a;
                l52 l52Var2 = ew2Var2.f37985a.f46300r;
                C3496qf c3496qfM15804F = l52Var2.m15804F((jv5) l52Var2.f49067d.f10363f);
                l52Var2.m15808J(c3496qfM15804F, 1020, new vg1(7, c3496qfM15804F, l32Var2));
                break;
        }
    }
}
