package p000;

/* JADX INFO: loaded from: classes.dex */
public final class tc9 extends rh9 {

    /* JADX INFO: renamed from: c */
    public long f62155c;

    public tc9(long j, long j2) {
        super(j);
        this.f62155c = j2;
    }

    @Override // p000.rh9
    /* JADX INFO: renamed from: a */
    public final void mo3651a(rh9 rh9Var) {
        rh9Var.getClass();
        this.f62155c = ((tc9) rh9Var).f62155c;
    }

    @Override // p000.rh9
    /* JADX INFO: renamed from: b */
    public final rh9 mo3652b(long j) {
        return new tc9(j, this.f62155c);
    }
}
