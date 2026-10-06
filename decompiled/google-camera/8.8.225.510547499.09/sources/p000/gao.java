package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gao implements gau {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ gar f24034a;

    /* JADX INFO: renamed from: b */
    private boolean f24035b = false;

    /* JADX INFO: renamed from: c */
    private boolean f24036c = false;

    /* JADX INFO: renamed from: d */
    private int f24037d = 1;

    /* JADX INFO: renamed from: e */
    private int f24038e = 0;

    /* JADX INFO: renamed from: f */
    private long f24039f = -1;

    public gao(gar garVar) {
        this.f24034a = garVar;
    }

    @Override // p000.gau
    /* JADX INFO: renamed from: b */
    public final synchronized void mo8999b() {
        this.f24034a.f24049b.execute(new fzz(this, 5));
    }

    @Override // p000.kbg
    /* JADX INFO: renamed from: bf */
    public final /* bridge */ /* synthetic */ void mo3415bf(Object obj) {
        this.f24034a.f24049b.execute(new fzz(this, 4));
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m9000c() {
        if (this.f24034a.f24050c.get()) {
            synchronized (this) {
                while (this.f24038e < this.f24037d) {
                    m9006i();
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m9001d() {
        if (this.f24035b || !this.f24034a.f24050c.get()) {
            return;
        }
        this.f24035b = true;
        this.f24034a.f24051d.mo9919y();
        synchronized (this) {
            long j = this.f24039f;
            if (j > 0) {
                this.f24034a.f24048a.f23574b.mo7888f(0.0f, j);
            } else {
                this.f24034a.f24048a.f23574b.mo7886d(0.0f);
            }
        }
    }

    @Override // p000.gau
    /* JADX INFO: renamed from: e */
    public final synchronized void mo9002e(int i) {
        lku.m15669w(i > 0);
        this.f24037d = i;
    }

    @Override // p000.gau
    /* JADX INFO: renamed from: f */
    public final synchronized void mo9003f(boolean z) {
        if (!z) {
            if (this.f24036c) {
                this.f24034a.f24048a.f23574b.mo7884b(this.f24039f);
            }
        }
        this.f24036c = z;
    }

    @Override // p000.gau
    /* JADX INFO: renamed from: g */
    public final synchronized void mo9004g(long j) {
        this.f24039f = j;
    }

    @Override // p000.gau
    /* JADX INFO: renamed from: h */
    public final void mo9005h() {
        this.f24034a.f24049b.execute(new fzz(this, 6));
    }

    /* JADX INFO: renamed from: i */
    public final void m9006i() {
        m9001d();
        if (this.f24034a.f24050c.get()) {
            synchronized (this) {
                boolean z = true;
                int i = this.f24038e + 1;
                this.f24038e = i;
                if (i > this.f24037d) {
                    z = false;
                }
                lku.m15613H(z);
                float f = this.f24038e / this.f24037d;
                if (f == 1.0f) {
                    this.f24034a.f24050c.set(false);
                }
                long j = this.f24039f;
                if (j > 0) {
                    this.f24034a.f24048a.f23574b.mo7888f(f, j);
                } else {
                    this.f24034a.f24048a.f23574b.mo7886d(f);
                }
            }
        }
    }
}
