package p000;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fvm implements nph {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ cjp f23644a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ fmc f23645b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ jvb f23646c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ fvn f23647d;

    public fvm(fvn fvnVar, cjp cjpVar, fmc fmcVar, jvb jvbVar) {
        this.f23647d = fvnVar;
        this.f23644a = cjpVar;
        this.f23645b = fmcVar;
        this.f23646c = jvbVar;
    }

    @Override // p000.nph
    /* JADX INFO: renamed from: a */
    public final void mo3810a(Throwable th) {
        if (!(th instanceof CancellationException)) {
            ((nbe) ((nbe) ((nbe) fvn.f23648a.m17252c()).mo17283h(th)).mo17276G((char) 2520)).mo17290o("OneCamera failed to open, closing lifetime.");
        }
        this.f23646c.close();
        this.f23645b.mo8566a(new kec("OneCamera failed to open"));
    }

    @Override // p000.nph
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ void mo3811b(Object obj) {
        fuc fucVar = (fuc) obj;
        fucVar.getClass();
        fvn fvnVar = this.f23647d;
        fvnVar.f23651d = fucVar;
        fvnVar.f23650c = null;
        if (this.f23644a.m3826a()) {
            return;
        }
        fmc fmcVar = this.f23645b;
        fvn fvnVar2 = this.f23647d;
        fmcVar.m8567b(new fmd(fvnVar2.f23651d, this.f23646c, fvnVar2.f23653f, fvnVar2.f23654g));
    }
}
