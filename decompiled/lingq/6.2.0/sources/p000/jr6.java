package p000;

/* JADX INFO: loaded from: classes.dex */
public final class jr6 extends bj6 {

    /* JADX INFO: renamed from: d */
    public final kr6 f46040d;

    /* JADX INFO: renamed from: e */
    public boolean f46041e;

    public jr6(kr6 kr6Var, lr6 lr6Var) {
        boolean z = kr6Var.f48365b;
        this.f8609a = lr6Var;
        this.f8610b = z;
        this.f46040d = kr6Var;
        this.f46041e = true;
    }

    @Override // p000.bj6
    /* JADX INFO: renamed from: a */
    public final void mo3780a() {
        this.f46040d.mo15654a();
    }

    @Override // p000.bj6
    /* JADX INFO: renamed from: b */
    public final void mo3781b() {
        this.f46040d.mo15655b();
    }

    @Override // p000.bj6
    /* JADX INFO: renamed from: c */
    public final void mo3782c(zi6 zi6Var) {
        this.f46040d.mo15656c(new u60(zi6Var));
    }

    @Override // p000.bj6
    /* JADX INFO: renamed from: d */
    public final void mo3783d(zi6 zi6Var) {
        zi6Var.getClass();
        this.f46040d.mo15657d(new u60(zi6Var));
    }

    /* JADX INFO: renamed from: g */
    public final void m14628g(boolean z) {
        this.f46041e = z;
        m3785f(z && this.f46040d.f48365b);
    }
}
