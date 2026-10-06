package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fvy {

    /* JADX INFO: renamed from: a */
    public final kbz f23725a;

    /* JADX INFO: renamed from: b */
    public final jvd f23726b;

    /* JADX INFO: renamed from: c */
    public final Object f23727c;

    /* JADX INFO: renamed from: d */
    public npu f23728d;

    /* JADX INFO: renamed from: e */
    public boolean f23729e;

    public fvy(kbn kbnVar, kbz kbzVar, jvd jvdVar) {
        this.f23726b = jvdVar;
        this.f23725a = kbzVar;
        kbnVar.mo6314a("CommandExecutor");
        this.f23727c = new Object();
        this.f23729e = false;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m8842a() {
        boolean z;
        synchronized (this.f23727c) {
            z = this.f23729e;
        }
        return z;
    }

    /* JADX INFO: renamed from: b */
    public final void m8843b(fvw fvwVar) {
        synchronized (this.f23727c) {
            if (this.f23729e) {
                kxk.m14965K(null);
                return;
            }
            if (this.f23728d == null) {
                this.f23728d = kxk.m15032y(ftx.m8796b());
            }
            npu npuVar = this.f23728d;
            npuVar.getClass();
            npuVar.submit(new fvx(this, fvwVar, 0));
        }
    }
}
