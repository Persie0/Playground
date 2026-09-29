package p000;

/* JADX INFO: loaded from: classes.dex */
public final class r98 implements lj8 {

    /* JADX INFO: renamed from: a */
    public final j18 f58947a;

    public r98(j18 j18Var) {
        j18Var.getClass();
        this.f58947a = j18Var;
    }

    @Override // p000.lj8
    /* JADX INFO: renamed from: a */
    public final boolean mo11843a() {
        return true;
    }

    @Override // p000.lj8
    /* JADX INFO: renamed from: b */
    public final lj8 mo11844b() {
        throw new IllegalStateException("unexpected retry");
    }

    @Override // p000.lj8
    /* JADX INFO: renamed from: c */
    public final j18 mo11845c() {
        return this.f58947a;
    }

    @Override // p000.lj8, p000.qu2
    public final void cancel() {
        throw new IllegalStateException("unexpected cancel");
    }

    @Override // p000.lj8
    /* JADX INFO: renamed from: d */
    public final kj8 mo11846d() {
        throw new IllegalStateException("already connected");
    }

    @Override // p000.lj8
    /* JADX INFO: renamed from: g */
    public final kj8 mo11849g() {
        throw new IllegalStateException("already connected");
    }
}
