package p000;

/* JADX INFO: loaded from: classes.dex */
public final class lh9 extends rh9 {

    /* JADX INFO: renamed from: c */
    public AbstractC3096i1 f49672c;

    /* JADX INFO: renamed from: d */
    public int f49673d;

    /* JADX INFO: renamed from: e */
    public int f49674e;

    public lh9(long j, AbstractC3096i1 abstractC3096i1) {
        super(j);
        this.f49672c = abstractC3096i1;
    }

    @Override // p000.rh9
    /* JADX INFO: renamed from: a */
    public final void mo3651a(rh9 rh9Var) {
        synchronized (AbstractC3584sr.f61285l) {
            rh9Var.getClass();
            this.f49672c = ((lh9) rh9Var).f49672c;
            this.f49673d = ((lh9) rh9Var).f49673d;
            this.f49674e = ((lh9) rh9Var).f49674e;
        }
    }

    @Override // p000.rh9
    /* JADX INFO: renamed from: b */
    public final rh9 mo3652b(long j) {
        return new lh9(j, this.f49672c);
    }
}
