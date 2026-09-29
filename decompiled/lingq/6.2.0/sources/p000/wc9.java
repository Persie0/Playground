package p000;

/* JADX INFO: loaded from: classes.dex */
public final class wc9 extends rh9 {

    /* JADX INFO: renamed from: c */
    public Object f66620c;

    public wc9(Object obj, long j) {
        super(j);
        this.f66620c = obj;
    }

    @Override // p000.rh9
    /* JADX INFO: renamed from: a */
    public final void mo3651a(rh9 rh9Var) {
        rh9Var.getClass();
        this.f66620c = ((wc9) rh9Var).f66620c;
    }

    @Override // p000.rh9
    /* JADX INFO: renamed from: b */
    public final rh9 mo3652b(long j) {
        return new wc9(this.f66620c, nc9.m17358j().mo3582g());
    }
}
