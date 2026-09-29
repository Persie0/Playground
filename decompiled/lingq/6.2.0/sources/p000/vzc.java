package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class vzc extends enc {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ wr9 f66148b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ b4c f66149c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ajd f66150d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vzc(ajd ajdVar, wr9 wr9Var, wr9 wr9Var2, b4c b4cVar) {
        super(wr9Var);
        this.f66148b = wr9Var2;
        this.f66149c = b4cVar;
        this.f66150d = ajdVar;
    }

    @Override // p000.enc
    /* JADX INFO: renamed from: a */
    public final void mo3295a() {
        synchronized (this.f66150d.f740f) {
            try {
                ajd ajdVar = this.f66150d;
                wr9 wr9Var = this.f66148b;
                ajdVar.f739e.add(wr9Var);
                wr9Var.f67208a.m22200o(new cdb(ajdVar, wr9Var, false, 15));
                if (this.f66150d.f745k.getAndIncrement() > 0) {
                    this.f66150d.f736b.m12786b("Already connected to the service.", new Object[0]);
                }
                ajd.m506b(this.f66150d, this.f66149c);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
