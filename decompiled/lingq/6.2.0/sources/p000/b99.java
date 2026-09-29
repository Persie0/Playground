package p000;

/* JADX INFO: loaded from: classes.dex */
final class b99 extends i16 {

    /* JADX INFO: renamed from: b */
    public final float f8179b;

    /* JADX INFO: renamed from: c */
    public final float f8180c;

    /* JADX INFO: renamed from: d */
    public final float f8181d;

    /* JADX INFO: renamed from: e */
    public final float f8182e;

    /* JADX INFO: renamed from: f */
    public final boolean f8183f;

    /* JADX INFO: renamed from: g */
    public final vi3 f8184g;

    public /* synthetic */ b99(float f, float f2, float f3, float f4, boolean z, vi3 vi3Var, int i) {
        this((i & 1) != 0 ? Float.NaN : f, (i & 2) != 0 ? Float.NaN : f2, (i & 4) != 0 ? Float.NaN : f3, (i & 8) != 0 ? Float.NaN : f4, z, vi3Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b99)) {
            return false;
        }
        b99 b99Var = (b99) obj;
        return xj2.m24560b(this.f8179b, b99Var.f8179b) && xj2.m24560b(this.f8180c, b99Var.f8180c) && xj2.m24560b(this.f8181d, b99Var.f8181d) && xj2.m24560b(this.f8182e, b99Var.f8182e) && this.f8183f == b99Var.f8183f;
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: h */
    public final d16 mo21h() {
        h99 h99Var = new h99();
        h99Var.f42048J = this.f8179b;
        h99Var.f42049K = this.f8180c;
        h99Var.f42050L = this.f8181d;
        h99Var.f42051M = this.f8182e;
        h99Var.f42052N = this.f8183f;
        return h99Var;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f8183f) + wq1.m24105a(wq1.m24105a(wq1.m24105a(Float.hashCode(this.f8179b) * 31, this.f8180c, 31), this.f8181d, 31), this.f8182e, 31);
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: n */
    public final void mo22n(y64 y64Var) {
        this.f8184g.invoke(y64Var);
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: o */
    public final void mo23o(d16 d16Var) {
        h99 h99Var = (h99) d16Var;
        h99Var.f42048J = this.f8179b;
        h99Var.f42049K = this.f8180c;
        h99Var.f42050L = this.f8181d;
        h99Var.f42051M = this.f8182e;
        h99Var.f42052N = this.f8183f;
    }

    public b99(float f, float f2, float f3, float f4, boolean z, vi3 vi3Var) {
        this.f8179b = f;
        this.f8180c = f2;
        this.f8181d = f3;
        this.f8182e = f4;
        this.f8183f = z;
        this.f8184g = vi3Var;
    }
}
