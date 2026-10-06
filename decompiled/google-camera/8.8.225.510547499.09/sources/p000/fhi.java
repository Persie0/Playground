package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fhi implements fle {

    /* JADX INFO: renamed from: a */
    public final gyu f21989a;

    /* JADX INFO: renamed from: b */
    public mzj f21990b;

    /* JADX INFO: renamed from: e */
    public final boolean f21993e;

    /* JADX INFO: renamed from: f */
    public boolean f21994f;

    /* JADX INFO: renamed from: g */
    final /* synthetic */ fhj f21995g;

    /* JADX INFO: renamed from: h */
    public fhl f21996h;

    /* JADX INFO: renamed from: i */
    public fhl f21997i;

    /* JADX INFO: renamed from: j */
    public fhl f21998j;

    /* JADX INFO: renamed from: k */
    public final C1058va f21999k;

    /* JADX INFO: renamed from: d */
    public boolean f21992d = false;

    /* JADX INFO: renamed from: c */
    public boolean f21991c = false;

    public fhi(fhj fhjVar, gyu gyuVar, C1058va c1058va, mzj mzjVar, boolean z, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f21995g = fhjVar;
        this.f21989a = gyuVar;
        this.f21999k = c1058va;
        this.f21990b = mzjVar;
        this.f21993e = z;
    }

    @Override // p000.fle
    /* JADX INFO: renamed from: a */
    public final void mo8368a(fkv fkvVar) {
        synchronized (this.f21995g.f22003d) {
            if (this.f21994f) {
                return;
            }
            if (this.f21990b.m17184m()) {
                ((nbe) ((nbe) fhj.f22000a.m17252c()).mo17276G(2275)).mo17301z("Cancelling session %s that already ended: %s", this.f21989a, fkvVar);
                return;
            }
            if (this.f21993e) {
                ((nbe) ((nbe) fhj.f22000a.m17252c()).mo17276G(2274)).mo17301z("Cancelled a long shot for %s: %s", this.f21989a, fkvVar);
            }
            this.f21994f = true;
            this.f21995g.m8426e();
        }
    }

    @Override // p000.fle
    /* JADX INFO: renamed from: b */
    public final void mo8369b(long j, fli fliVar) {
        synchronized (this.f21995g.f22003d) {
            if (this.f21990b.m17184m()) {
                ((nbe) ((nbe) fhj.f22000a.m17252c()).mo17276G(2279)).mo17301z("Ending session %s twice: %s", this.f21989a, fliVar);
                return;
            }
            if (this.f21994f) {
                ((nbe) ((nbe) fhj.f22000a.m17252c()).mo17276G(2278)).mo17301z("Ending already cancelled session %s: %s", this.f21989a, fliVar);
                return;
            }
            if (((Long) this.f21990b.m17180i()).longValue() > j) {
                ((nbe) ((nbe) fhj.f22000a.m17252c()).mo17276G(2277)).mo17272C("%s: Invalid range: %d to %d, with reason: %s", this.f21989a, this.f21990b.m17180i(), Long.valueOf(j), fliVar);
            }
            this.f21990b = mzj.m17175e((Long) this.f21990b.m17180i(), Long.valueOf(Math.max(j, ((Long) this.f21990b.m17180i()).longValue())));
            this.f21995g.m8426e();
            this.f21995g.m8425d();
        }
    }
}
