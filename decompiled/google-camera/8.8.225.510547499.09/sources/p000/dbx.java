package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dbx implements kev {

    /* JADX INFO: renamed from: a */
    public final dbr f10458a;

    /* JADX INFO: renamed from: b */
    public final Runnable f10459b;

    /* JADX INFO: renamed from: c */
    public final kmq f10460c;

    /* JADX INFO: renamed from: d */
    private final dhv f10461d;

    /* JADX INFO: renamed from: e */
    private final jvd f10462e;

    /* JADX INFO: renamed from: f */
    private final doe f10463f;

    /* JADX INFO: renamed from: g */
    private final dnn f10464g;

    /* JADX INFO: renamed from: h */
    private final ddq f10465h;

    /* JADX INFO: renamed from: i */
    private final kms f10466i;

    /* JADX INFO: renamed from: j */
    private final cwd f10467j;

    public dbx(dhv dhvVar, cwd cwdVar, dbr dbrVar, jvd jvdVar, kms kmsVar, doe doeVar, dnn dnnVar, ddq ddqVar, kmq kmqVar, Runnable runnable, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f10461d = dhvVar;
        this.f10467j = cwdVar;
        this.f10458a = dbrVar;
        this.f10462e = jvdVar;
        this.f10466i = kmsVar;
        this.f10463f = doeVar;
        this.f10464g = dnnVar;
        this.f10465h = ddqVar;
        this.f10459b = runnable;
        this.f10460c = kmqVar;
    }

    @Override // p000.kev
    /* JADX INFO: renamed from: a */
    public final void mo5508a(kcl kclVar, long j) {
        if (kcl.m13982e(kclVar)) {
            if (j < this.f10467j.m5669q() && this.f10467j.m5672t()) {
                this.f10465h.mo5948h(this.f10460c);
                this.f10462e.execute(new czx(this, 6));
            } else {
                kmg kmgVarM6439b = this.f10464g.m6439b(this.f10466i, this.f10461d, this.f10460c);
                kmgVarM6439b.getClass();
                this.f10463f.mo6458f(new dof(kmgVarM6439b, kclVar, j));
            }
        }
    }

    @Override // p000.kev
    /* JADX INFO: renamed from: b */
    public final void mo5509b() {
        this.f10465h.mo5947g(this.f10460c);
    }
}
