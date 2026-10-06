package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fpe implements kbg {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ fpf f23022a;

    /* JADX INFO: renamed from: b */
    private boolean f23023b = true;

    /* JADX INFO: renamed from: c */
    private final /* synthetic */ int f23024c;

    public fpe(fpf fpfVar, int i) {
        this.f23024c = i;
        this.f23022a = fpfVar;
    }

    @Override // p000.kbg
    /* JADX INFO: renamed from: bf */
    public final /* synthetic */ void mo3415bf(Object obj) {
        switch (this.f23024c) {
            case 0:
                synchronized (this.f23022a.f23039k) {
                    if (this.f23023b) {
                        this.f23023b = false;
                        return;
                    }
                    if (this.f23022a.f23043o.m13088X("amethyst_edu") == 0) {
                        this.f23022a.f23041m.m5763a();
                        this.f23022a.f23043o.m13090Z("amethyst_edu");
                    } else {
                        this.f23022a.m8660w(8);
                    }
                    return;
                }
            default:
                synchronized (this.f23022a.f23039k) {
                    if (this.f23023b) {
                        this.f23023b = false;
                        return;
                    }
                    fpf fpfVar = this.f23022a;
                    cws cwsVarM5690a = fpfVar.f23031c.m5690a(ikw.VIDEO);
                    if (cwsVarM5690a instanceof cwq) {
                        fpfVar.f23034f.mo3415bf((jxn) cwsVarM5690a.mo3831be());
                    }
                    fpfVar.m8660w(5);
                    return;
                }
        }
    }
}
