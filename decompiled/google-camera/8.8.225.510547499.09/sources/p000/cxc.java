package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cxc implements cww {

    /* JADX INFO: renamed from: a */
    public static final nbh f9947a = nbh.m17259h("com/google/android/apps/camera/camcorder/snapshot/SnapshotTakerViewfinderImpl");

    /* JADX INFO: renamed from: b */
    public final cxd f9948b;

    /* JADX INFO: renamed from: c */
    public long f9949c;

    /* JADX INFO: renamed from: d */
    private final iht f9950d;

    /* JADX INFO: renamed from: e */
    private final dbr f9951e;

    /* JADX INFO: renamed from: f */
    private final juy f9952f;

    /* JADX INFO: renamed from: g */
    private final csl f9953g;

    /* JADX INFO: renamed from: h */
    private final jwn f9954h;

    /* JADX INFO: renamed from: i */
    private final jwn f9955i;

    /* JADX INFO: renamed from: j */
    private final dhv f9956j;

    public cxc(cuh cuhVar, csm csmVar, iht ihtVar, dbr dbrVar, cxd cxdVar, jwn jwnVar, jwn jwnVar2, dhv dhvVar) {
        this.f9952f = cuhVar.m5526b();
        this.f9950d = ihtVar;
        this.f9951e = dbrVar;
        this.f9948b = cxdVar;
        this.f9953g = csmVar.m5464a();
        this.f9954h = jwnVar;
        this.f9955i = jwnVar2;
        this.f9956j = dhvVar;
    }

    @Override // p000.cww
    /* JADX INFO: renamed from: a */
    public final nps mo5692a(gyv gyvVar) {
        this.f9949c = System.currentTimeMillis();
        nqf nqfVarM17621g = nqf.m17621g();
        kmq kmqVarMo5895d = this.f9951e.mo5895d();
        kmq kmqVar = ((Boolean) this.f9955i.mo3831be()).booleanValue() ? kmq.f36557a : kmqVarMo5895d;
        int iMo14553f = 90;
        if (this.f9956j.mo6184l(dib.f11315bV)) {
            jwn jwnVar = this.f9954h;
            if (jwnVar != null) {
                iMo14553f = ((Integer) jwnVar.mo3831be()).intValue();
            }
        } else {
            mrm mrmVarM5896e = this.f9951e.m5896e();
            if (mrmVarM5896e.mo16813g()) {
                iMo14553f = ((fvu) mrmVarM5896e.mo16809c()).mo14553f();
            }
        }
        int i = ((kay) ((jwf) this.f9953g.f9285o).f34942d).f35503e - iMo14553f;
        if (kmqVar.equals(kmq.f36557a)) {
            i = (360 - i) % 360;
        }
        kxk.m14975U(mo5693b(kmqVar, kay.m13889b(i)), new cxb(this, nqfVarM17621g, kmqVarMo5895d, gyvVar), this.f9952f);
        return nqfVarM17621g;
    }

    @Override // p000.cww
    /* JADX INFO: renamed from: b */
    public final nps mo5693b(kmq kmqVar, kay kayVar) {
        mrm mrmVarM11366e = this.f9950d.m11366e(kmqVar == kmq.f36557a, 1, kayVar);
        return mrmVarM11366e.mo16813g() ? kxk.m14965K(((ihy) mrmVarM11366e.mo16809c()).f31023a) : kxk.m14964J(new IllegalStateException("Can't take screen snapshot."));
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
    }
}
