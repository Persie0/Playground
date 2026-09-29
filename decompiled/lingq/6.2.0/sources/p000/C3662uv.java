package p000;

/* JADX INFO: renamed from: uv */
/* JADX INFO: loaded from: classes.dex */
final class C3662uv extends i16 {

    /* JADX INFO: renamed from: b */
    public final float f64386b;

    /* JADX INFO: renamed from: c */
    public final boolean f64387c;

    /* JADX INFO: renamed from: d */
    public final vi3 f64388d;

    public C3662uv(float f, boolean z, vi3 vi3Var) {
        this.f64386b = f;
        this.f64387c = z;
        this.f64388d = vi3Var;
        if (f > 0.0f) {
            return;
        }
        g54.m12362a("aspectRatio " + f + " must be > 0");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        C3662uv c3662uv = obj instanceof C3662uv ? (C3662uv) obj : null;
        if (c3662uv != null && this.f64386b == c3662uv.f64386b) {
            return this.f64387c == ((C3662uv) obj).f64387c;
        }
        return false;
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: h */
    public final d16 mo21h() {
        C3810yv c3810yv = new C3810yv();
        c3810yv.f70525J = this.f64386b;
        c3810yv.f70526K = this.f64387c;
        return c3810yv;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f64387c) + (Float.hashCode(this.f64386b) * 31);
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: n */
    public final void mo22n(y64 y64Var) {
        this.f64388d.invoke(y64Var);
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: o */
    public final void mo23o(d16 d16Var) {
        C3810yv c3810yv = (C3810yv) d16Var;
        c3810yv.f70525J = this.f64386b;
        c3810yv.f70526K = this.f64387c;
    }
}
