package p000;

/* JADX INFO: loaded from: classes.dex */
public final class iz2 implements lj8 {

    /* JADX INFO: renamed from: a */
    public final kj8 f44796a;

    public iz2(Throwable th) {
        this.f44796a = new kj8(this, th, 2);
    }

    @Override // p000.lj8
    /* JADX INFO: renamed from: a */
    public final boolean mo11843a() {
        return false;
    }

    @Override // p000.lj8
    /* JADX INFO: renamed from: b */
    public final lj8 mo11844b() {
        throw new IllegalStateException("unexpected retry");
    }

    @Override // p000.lj8
    /* JADX INFO: renamed from: c */
    public final j18 mo11845c() {
        throw new IllegalStateException("unexpected call");
    }

    @Override // p000.lj8, p000.qu2
    public final void cancel() {
        throw new IllegalStateException("unexpected cancel");
    }

    @Override // p000.lj8
    /* JADX INFO: renamed from: d */
    public final kj8 mo11846d() {
        return this.f44796a;
    }

    @Override // p000.lj8
    /* JADX INFO: renamed from: g */
    public final kj8 mo11849g() {
        return this.f44796a;
    }
}
