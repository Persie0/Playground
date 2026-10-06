package p000;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cwy implements cww {

    /* JADX INFO: renamed from: i */
    private static final nbh f9909i = nbh.m17259h("com/google/android/apps/camera/camcorder/snapshot/SnapshotTakerFrameServerImpl");

    /* JADX INFO: renamed from: a */
    public final csl f9910a;

    /* JADX INFO: renamed from: b */
    public final cwj f9911b;

    /* JADX INFO: renamed from: c */
    public final cxd f9912c;

    /* JADX INFO: renamed from: e */
    public int f9914e;

    /* JADX INFO: renamed from: f */
    public long f9915f;

    /* JADX INFO: renamed from: g */
    public nqf f9916g;

    /* JADX INFO: renamed from: h */
    public nps f9917h;

    /* JADX INFO: renamed from: j */
    private final juy f9918j;

    /* JADX INFO: renamed from: k */
    private final idl f9919k;

    /* JADX INFO: renamed from: l */
    private final dbr f9920l;

    /* JADX INFO: renamed from: d */
    public final ScheduledExecutorService f9913d = jzn.m13828p("snapshot-taker");

    /* JADX INFO: renamed from: m */
    private boolean f9921m = false;

    public cwy(cuh cuhVar, csm csmVar, idl idlVar, cwj cwjVar, dbr dbrVar, cxd cxdVar) {
        this.f9918j = cuhVar.m5526b();
        this.f9919k = idlVar;
        this.f9910a = csmVar.m5464a();
        this.f9911b = cwjVar;
        this.f9920l = dbrVar;
        this.f9912c = cxdVar;
    }

    @Override // p000.cww
    /* JADX INFO: renamed from: a */
    public final nps mo5692a(gyv gyvVar) {
        this.f9914e = 0;
        nqf nqfVarM17621g = nqf.m17621g();
        this.f9916g = nqfVarM17621g;
        this.f9917h = null;
        this.f9915f = System.currentTimeMillis();
        m5694c(gyvVar, null);
        return nqfVarM17621g;
    }

    @Override // p000.cww
    /* JADX INFO: renamed from: b */
    public final nps mo5693b(kmq kmqVar, kay kayVar) {
        return kxk.m14964J(new UnsupportedOperationException("Not implemented."));
    }

    /* JADX INFO: renamed from: c */
    public final void m5694c(gyv gyvVar, Throwable th) {
        nps npsVar = this.f9917h;
        if (npsVar != null) {
            npsVar.cancel(true);
        }
        if (this.f9921m) {
            this.f9916g.mo8566a(new IllegalStateException("Snapshot taker has been closed."));
            return;
        }
        kmq kmqVarMo5895d = this.f9920l.mo5895d();
        int i = this.f9914e;
        this.f9914e = i + 1;
        if (i < 3) {
            this.f9918j.execute(new bmj(this, kmqVarMo5895d, gyvVar, 9));
            return;
        }
        nbw nbwVarM17251b = f9909i.m17251b();
        th.getClass();
        ((nbe) ((nbe) ((nbe) nbwVarM17251b).mo17283h(th)).mo17276G((char) 749)).mo17290o("Failed to take snapshot.");
        this.f9916g.mo8566a(th);
        this.f9919k.m11118c(idj.SNAPSHOT_FAILURE);
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
        this.f9921m = true;
        this.f9913d.shutdown();
    }
}
