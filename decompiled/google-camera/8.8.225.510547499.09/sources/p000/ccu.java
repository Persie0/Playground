package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ccu implements ccl, kbg {

    /* JADX INFO: renamed from: a */
    public final dxh f5202a;

    /* JADX INFO: renamed from: b */
    public ilv f5203b;

    /* JADX INFO: renamed from: c */
    public ilv f5204c;

    /* JADX INFO: renamed from: d */
    public nqf f5205d;

    /* JADX INFO: renamed from: e */
    private final jvd f5206e;

    /* JADX INFO: renamed from: f */
    private final jvb f5207f;

    /* JADX INFO: renamed from: g */
    private volatile boolean f5208g;

    /* JADX INFO: renamed from: h */
    private final juw f5209h;

    public ccu(jvd jvdVar, dxh dxhVar, jwn jwnVar) {
        jvb jvbVar = new jvb();
        this.f5207f = jvbVar;
        this.f5208g = true;
        this.f5203b = null;
        this.f5204c = null;
        this.f5209h = new cct(this, 0);
        this.f5206e = jvdVar;
        this.f5202a = dxhVar;
        jvbVar.m13537d(jwnVar.mo3830a(this, jvdVar));
    }

    @Override // p000.hrv
    /* JADX INFO: renamed from: b */
    public final void mo3448b() {
        this.f5208g = true;
    }

    @Override // p000.kbg
    /* JADX INFO: renamed from: bf */
    public final /* bridge */ /* synthetic */ void mo3415bf(Object obj) {
        gtd gtdVar = (gtd) obj;
        if (this.f5208g) {
            if (this.f5203b == null && this.f5204c == null && ((fuo) gtdVar.f26335b).f23596b != gst.PASSIVE_SCAN && ((fuo) gtdVar.f26334a).f23596b == gst.PASSIVE_SCAN) {
                ilv ilvVarMo4143B = this.f5202a.mo4143B();
                this.f5203b = ilvVarMo4143B;
                ilvVarMo4143B.mo11450b(new ccb(this, 7));
                if (this.f5203b != null) {
                    this.f5205d = nqf.m17621g();
                    jvh.m13563k(this.f5203b.mo11449a(), this.f5205d, this.f5209h, this.f5206e);
                }
            }
            if (this.f5205d != null && ((fuo) gtdVar.f26335b).f23596b == gst.PASSIVE_SCAN && ((fuo) gtdVar.f26334a).f23596b.m9712b()) {
                gst gstVar = ((fuo) gtdVar.f26334a).f23596b;
                boolean z = true;
                if (gstVar != gst.PASSIVE_FOCUSED && gstVar != gst.FOCUSED_LOCKED) {
                    z = false;
                }
                this.f5205d.mo14894e(Boolean.valueOf(z));
            }
        }
    }

    @Override // p000.hrv
    /* JADX INFO: renamed from: c */
    public final void mo3449c(hrw hrwVar) {
        this.f5208g = false;
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
        this.f5207f.close();
    }
}
