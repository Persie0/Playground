package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gap implements gau {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ gar f24043d;

    /* JADX INFO: renamed from: e */
    private boolean f24044e = false;

    /* JADX INFO: renamed from: f */
    private boolean f24045f = false;

    /* JADX INFO: renamed from: a */
    public int f24040a = 1;

    /* JADX INFO: renamed from: b */
    public int f24041b = 0;

    /* JADX INFO: renamed from: c */
    public long f24042c = -1;

    public gap(gar garVar) {
        this.f24043d = garVar;
    }

    @Override // p000.gau
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void mo8999b() {
    }

    @Override // p000.kbg
    /* JADX INFO: renamed from: bf */
    public final /* bridge */ /* synthetic */ void mo3415bf(Object obj) {
        this.f24043d.f24049b.execute(new fzz(this, 8));
    }

    /* JADX INFO: renamed from: c */
    public final void m9007c() {
        synchronized (this) {
            if (this.f24040a == 0) {
                if (!this.f24044e && this.f24043d.f24050c.get()) {
                    this.f24044e = true;
                    this.f24043d.m9014g();
                }
                this.f24043d.f24050c.set(false);
                return;
            }
            if (this.f24044e || !this.f24043d.f24050c.get()) {
                return;
            }
            this.f24044e = true;
            this.f24043d.f24051d.mo9919y();
            synchronized (this) {
                long j = this.f24042c;
                if (j > 0) {
                    this.f24043d.f24048a.f23574b.mo7888f(0.0f, j);
                } else {
                    this.f24043d.f24048a.f23574b.mo7887e(0.0f, this.f24040a);
                }
            }
        }
    }

    @Override // p000.gau
    /* JADX INFO: renamed from: e */
    public final synchronized void mo9002e(int i) {
        this.f24040a = i;
    }

    @Override // p000.gau
    /* JADX INFO: renamed from: f */
    public final synchronized void mo9003f(boolean z) {
        if (!z) {
            if (this.f24045f) {
                this.f24043d.f24048a.f23574b.mo7884b(this.f24042c);
            }
        }
        this.f24045f = z;
    }

    @Override // p000.gau
    /* JADX INFO: renamed from: g */
    public final synchronized void mo9004g(long j) {
        this.f24042c = j;
    }

    @Override // p000.gau
    /* JADX INFO: renamed from: h */
    public final void mo9005h() {
        this.f24043d.f24049b.execute(new fzz(this, 7));
    }
}
