package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class chd extends cmk {

    /* JADX INFO: renamed from: a */
    private final oju f5721a;

    /* JADX INFO: renamed from: b */
    private final kbz f5722b;

    /* JADX INFO: renamed from: c */
    private final fba f5723c;

    /* JADX INFO: renamed from: d */
    private boolean f5724d;

    public chd(oju ojuVar, jvd jvdVar, fba fbaVar, kbz kbzVar) {
        super(jvdVar);
        this.f5721a = ojuVar;
        this.f5722b = kbzVar;
        this.f5723c = fbaVar;
        this.f5724d = false;
    }

    @Override // p000.cmk
    /* JADX INFO: renamed from: a */
    public final void mo3531a() {
        if (m3667d()) {
            return;
        }
        this.f5723c.m8097e(new chc(this));
    }

    /* JADX INFO: renamed from: d */
    public final boolean m3667d() {
        if (this.f5724d) {
            return true;
        }
        this.f5722b.mo13961e("CameraActivityControllerInitializer#initialize");
        chk chkVar = (chk) this.f5721a.get();
        this.f5722b.mo13964h();
        this.f5724d = chkVar.mo3708v();
        this.f5722b.mo13964h();
        this.f5722b.mo13962f();
        return this.f5724d;
    }
}
