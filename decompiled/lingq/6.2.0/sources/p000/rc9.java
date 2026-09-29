package p000;

/* JADX INFO: loaded from: classes.dex */
public final class rc9 extends rh9 {

    /* JADX INFO: renamed from: c */
    public int f59074c;

    public rc9(int i, long j) {
        super(j);
        this.f59074c = i;
    }

    @Override // p000.rh9
    /* JADX INFO: renamed from: a */
    public final void mo3651a(rh9 rh9Var) {
        rh9Var.getClass();
        this.f59074c = ((rc9) rh9Var).f59074c;
    }

    @Override // p000.rh9
    /* JADX INFO: renamed from: b */
    public final rh9 mo3652b(long j) {
        return new rc9(this.f59074c, j);
    }
}
