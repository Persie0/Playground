package p000;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class esa implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f37780a = 1;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C3165jz f37781b;

    public /* synthetic */ esa(int i, long j, C3165jz c3165jz) {
        this.f37781b = c3165jz;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f37780a;
        C3165jz c3165jz = this.f37781b;
        switch (i) {
            case 0:
                ew2 ew2Var = c3165jz.f46414b;
                String str = uma.f64080a;
                l52 l52Var = ew2Var.f37985a.f46300r;
                l52Var.m15808J(l52Var.m15807I(), 1030, new hm2(16));
                break;
            default:
                ew2 ew2Var2 = c3165jz.f46414b;
                String str2 = uma.f64080a;
                l52 l52Var2 = ew2Var2.f37985a.f46300r;
                l52Var2.m15808J(l52Var2.m15804F((jv5) l52Var2.f49067d.f10363f), 1021, new hm2(21));
                break;
        }
    }

    public /* synthetic */ esa(C3165jz c3165jz, Exception exc) {
        this.f37781b = c3165jz;
    }
}
