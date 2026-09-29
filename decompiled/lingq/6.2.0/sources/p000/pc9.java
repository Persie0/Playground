package p000;

/* JADX INFO: loaded from: classes.dex */
public final class pc9 extends rh9 {

    /* JADX INFO: renamed from: c */
    public float f55951c;

    public pc9(float f, long j) {
        super(j);
        this.f55951c = f;
    }

    @Override // p000.rh9
    /* JADX INFO: renamed from: a */
    public final void mo3651a(rh9 rh9Var) {
        rh9Var.getClass();
        this.f55951c = ((pc9) rh9Var).f55951c;
    }

    @Override // p000.rh9
    /* JADX INFO: renamed from: b */
    public final rh9 mo3652b(long j) {
        return new pc9(this.f55951c, j);
    }
}
