package p000;

/* JADX INFO: loaded from: classes.dex */
public final class bd9 extends rh9 {

    /* JADX INFO: renamed from: c */
    public m77 f8392c;

    /* JADX INFO: renamed from: d */
    public int f8393d;

    public bd9(long j, m77 m77Var) {
        super(j);
        this.f8392c = m77Var;
    }

    @Override // p000.rh9
    /* JADX INFO: renamed from: a */
    public final void mo3651a(rh9 rh9Var) {
        rh9Var.getClass();
        bd9 bd9Var = (bd9) rh9Var;
        synchronized (AbstractC3695vr.f65812g) {
            this.f8392c = bd9Var.f8392c;
            this.f8393d = bd9Var.f8393d;
        }
    }

    @Override // p000.rh9
    /* JADX INFO: renamed from: b */
    public final rh9 mo3652b(long j) {
        return new bd9(j, this.f8392c);
    }
}
