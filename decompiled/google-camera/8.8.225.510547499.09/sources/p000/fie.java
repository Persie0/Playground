package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fie {

    /* JADX INFO: renamed from: a */
    private final fgy f22096a;

    /* JADX INFO: renamed from: b */
    private final mrm f22097b;

    /* JADX INFO: renamed from: c */
    private boolean f22098c = false;

    /* JADX INFO: renamed from: d */
    private boolean f22099d = false;

    /* JADX INFO: renamed from: e */
    private boolean f22100e = true;

    /* JADX INFO: renamed from: f */
    private boolean f22101f = false;

    public fie(fgy fgyVar, mrm mrmVar) {
        this.f22096a = fgyVar;
        this.f22097b = mrmVar;
    }

    /* JADX INFO: renamed from: c */
    private final void m8457c() {
        boolean z = this.f22100e || this.f22101f;
        if (this.f22099d == z && this.f22098c) {
            return;
        }
        this.f22098c = true;
        if (z) {
            this.f22096a.mo8334i();
            if (this.f22097b.mo16813g()) {
                ((dxi) this.f22097b.mo16809c()).mo6843a(true);
            }
        } else {
            this.f22096a.mo8334i();
            if (this.f22097b.mo16813g()) {
                ((dxi) this.f22097b.mo16809c()).mo6843a(false);
            }
        }
        this.f22099d = z;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m8458a(boolean z) {
        this.f22100e = z;
        m8457c();
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m8459b(boolean z) {
        this.f22101f = z;
        m8457c();
    }
}
