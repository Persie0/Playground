package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bsy implements bsz, cbn {

    /* JADX INFO: renamed from: a */
    private static final aed f4394a = cbp.m3396b(20, new bud(1));

    /* JADX INFO: renamed from: b */
    private bsz f4395b;

    /* JADX INFO: renamed from: c */
    private boolean f4396c;

    /* JADX INFO: renamed from: d */
    private boolean f4397d;

    /* JADX INFO: renamed from: e */
    private final fky f4398e = fky.m8534d();

    /* JADX INFO: renamed from: d */
    static bsy m3027d(bsz bszVar) {
        bsy bsyVar = (bsy) f4394a.mo320a();
        bzq.m3278r(bsyVar);
        bsyVar.f4397d = false;
        bsyVar.f4396c = true;
        bsyVar.f4395b = bszVar;
        return bsyVar;
    }

    @Override // p000.bsz
    /* JADX INFO: renamed from: a */
    public final int mo3014a() {
        return this.f4395b.mo3014a();
    }

    @Override // p000.bsz
    /* JADX INFO: renamed from: b */
    public final Class mo3015b() {
        return this.f4395b.mo3015b();
    }

    @Override // p000.bsz
    /* JADX INFO: renamed from: c */
    public final Object mo3016c() {
        return this.f4395b.mo3016c();
    }

    @Override // p000.bsz
    /* JADX INFO: renamed from: e */
    public final synchronized void mo3018e() {
        this.f4398e.m8537c();
        this.f4397d = true;
        if (!this.f4396c) {
            this.f4395b.mo3018e();
            this.f4395b = null;
            f4394a.mo321b(this);
        }
    }

    @Override // p000.cbn
    /* JADX INFO: renamed from: f */
    public final fky mo2992f() {
        return this.f4398e;
    }

    /* JADX INFO: renamed from: g */
    final synchronized void m3028g() {
        this.f4398e.m8537c();
        if (!this.f4396c) {
            throw new IllegalStateException("Already unlocked");
        }
        this.f4396c = false;
        if (this.f4397d) {
            mo3018e();
        }
    }
}
