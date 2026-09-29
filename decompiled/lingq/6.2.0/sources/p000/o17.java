package p000;

/* JADX INFO: loaded from: classes.dex */
final class o17 extends i16 {

    /* JADX INFO: renamed from: b */
    public final float f53591b;

    /* JADX INFO: renamed from: c */
    public final float f53592c;

    /* JADX INFO: renamed from: d */
    public final float f53593d;

    /* JADX INFO: renamed from: e */
    public final float f53594e;

    /* JADX INFO: renamed from: f */
    public final vi3 f53595f;

    public o17(float f, float f2, float f3, float f4, vi3 vi3Var) {
        this.f53591b = f;
        this.f53592c = f2;
        this.f53593d = f3;
        this.f53594e = f4;
        this.f53595f = vi3Var;
        boolean z = true;
        boolean z2 = (f >= 0.0f || Float.isNaN(f)) & (f2 >= 0.0f || Float.isNaN(f2)) & (f3 >= 0.0f || Float.isNaN(f3));
        if (f4 < 0.0f && !Float.isNaN(f4)) {
            z = false;
        }
        if (!z2 || !z) {
            g54.m12362a("Padding must be non-negative");
        }
    }

    public final boolean equals(Object obj) {
        o17 o17Var = obj instanceof o17 ? (o17) obj : null;
        return o17Var != null && xj2.m24560b(this.f53591b, o17Var.f53591b) && xj2.m24560b(this.f53592c, o17Var.f53592c) && xj2.m24560b(this.f53593d, o17Var.f53593d) && xj2.m24560b(this.f53594e, o17Var.f53594e);
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: h */
    public final d16 mo21h() {
        s17 s17Var = new s17();
        s17Var.f60152J = this.f53591b;
        s17Var.f60153K = this.f53592c;
        s17Var.f60154L = this.f53593d;
        s17Var.f60155M = this.f53594e;
        s17Var.f60156N = true;
        return s17Var;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + wq1.m24105a(wq1.m24105a(wq1.m24105a(Float.hashCode(this.f53591b) * 31, this.f53592c, 31), this.f53593d, 31), this.f53594e, 31);
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: n */
    public final void mo22n(y64 y64Var) {
        this.f53595f.invoke(y64Var);
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: o */
    public final void mo23o(d16 d16Var) {
        s17 s17Var = (s17) d16Var;
        s17Var.f60152J = this.f53591b;
        s17Var.f60153K = this.f53592c;
        s17Var.f60154L = this.f53593d;
        s17Var.f60155M = this.f53594e;
        s17Var.f60156N = true;
    }
}
