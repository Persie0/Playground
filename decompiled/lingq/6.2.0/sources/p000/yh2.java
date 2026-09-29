package p000;

/* JADX INFO: loaded from: classes.dex */
public final class yh2 implements x48 {

    /* JADX INFO: renamed from: a */
    public final vi3 f69840a;

    /* JADX INFO: renamed from: b */
    public zh2 f69841b;

    public yh2(vi3 vi3Var) {
        this.f69840a = vi3Var;
    }

    @Override // p000.x48
    /* JADX INFO: renamed from: d */
    public final void mo1245d() {
    }

    @Override // p000.x48
    /* JADX INFO: renamed from: f */
    public final void mo1246f() {
        zh2 zh2Var = this.f69841b;
        if (zh2Var != null) {
            zh2Var.mo1799a();
        }
        this.f69841b = null;
    }

    @Override // p000.x48
    /* JADX INFO: renamed from: g */
    public final void mo1247g() {
        this.f69841b = (zh2) this.f69840a.invoke(d32.f34892a);
    }
}
