package p000;

/* JADX INFO: renamed from: dz */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC2945dz implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f36434a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C3165jz f36435b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ l32 f36436c;

    public /* synthetic */ RunnableC2945dz(C3165jz c3165jz, l32 l32Var, int i) {
        this.f36434a = i;
        this.f36435b = c3165jz;
        this.f36436c = l32Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f36434a) {
            case 0:
                C3165jz c3165jz = this.f36435b;
                l32 l32Var = this.f36436c;
                synchronized (l32Var) {
                }
                ew2 ew2Var = c3165jz.f46414b;
                String str = uma.f64080a;
                l52 l52Var = ew2Var.f37985a.f46300r;
                C3496qf c3496qfM15804F = l52Var.m15804F((jv5) l52Var.f49067d.f10363f);
                l52Var.m15808J(c3496qfM15804F, 1013, new f52(c3496qfM15804F, l32Var, 1));
                break;
            default:
                C3165jz c3165jz2 = this.f36435b;
                l32 l32Var2 = this.f36436c;
                ew2 ew2Var2 = c3165jz2.f46414b;
                String str2 = uma.f64080a;
                l52 l52Var2 = ew2Var2.f37985a.f46300r;
                C3496qf c3496qfM15807I = l52Var2.m15807I();
                l52Var2.m15808J(c3496qfM15807I, 1007, new f52(c3496qfM15807I, l32Var2, 0));
                break;
        }
    }
}
