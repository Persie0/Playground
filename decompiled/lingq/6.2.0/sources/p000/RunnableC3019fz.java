package p000;

/* JADX INFO: renamed from: fz */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC3019fz implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f39941a = 1;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ long f39942b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f39943c;

    public /* synthetic */ RunnableC3019fz(C3165jz c3165jz, long j) {
        this.f39943c = c3165jz;
        this.f39942b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f39941a;
        final long j = this.f39942b;
        Object obj = this.f39943c;
        switch (i) {
            case 0:
                ew2 ew2Var = ((C3165jz) obj).f46414b;
                String str = uma.f64080a;
                l52 l52Var = ew2Var.f37985a.f46300r;
                final C3496qf c3496qfM15807I = l52Var.m15807I();
                l52Var.m15808J(c3496qfM15807I, 1010, new sg5() { // from class: k52
                    @Override // p000.sg5
                    public final void invoke(Object obj2) {
                        ((InterfaceC3534rf) obj2).mo20626k(c3496qfM15807I, j);
                    }
                });
                break;
            default:
                if (((abb) obj).f478b.remove(Long.valueOf(j)) != null) {
                    ho2.m13383c();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ RunnableC3019fz(abb abbVar, long j, boolean z) {
        this.f39943c = abbVar;
        this.f39942b = j;
    }
}
