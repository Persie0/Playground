package p000;

/* JADX INFO: loaded from: classes.dex */
final class y1a extends i16 {

    /* JADX INFO: renamed from: b */
    public final boolean f69101b;

    /* JADX INFO: renamed from: c */
    public final v56 f69102c;

    /* JADX INFO: renamed from: d */
    public final w34 f69103d;

    /* JADX INFO: renamed from: e */
    public final boolean f69104e;

    /* JADX INFO: renamed from: f */
    public final uh8 f69105f;

    /* JADX INFO: renamed from: g */
    public final vi3 f69106g;

    public y1a(boolean z, v56 v56Var, rh8 rh8Var, boolean z2, uh8 uh8Var, vi3 vi3Var) {
        this.f69101b = z;
        this.f69102c = v56Var;
        this.f69103d = rh8Var;
        this.f69104e = z2;
        this.f69105f = uh8Var;
        this.f69106g = vi3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || y1a.class != obj.getClass()) {
            return false;
        }
        y1a y1aVar = (y1a) obj;
        return this.f69101b == y1aVar.f69101b && fa4.m11650l(this.f69102c, y1aVar.f69102c) && fa4.m11650l(this.f69103d, y1aVar.f69103d) && this.f69104e == y1aVar.f69104e && this.f69105f.equals(y1aVar.f69105f) && this.f69106g == y1aVar.f69106g;
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: h */
    public final d16 mo21h() {
        return new a2a(this.f69101b, this.f69102c, this.f69103d, this.f69104e, this.f69105f, this.f69106g);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f69101b) * 31;
        v56 v56Var = this.f69102c;
        int iHashCode2 = (iHashCode + (v56Var != null ? v56Var.hashCode() : 0)) * 31;
        w34 w34Var = this.f69103d;
        return this.f69106g.hashCode() + wq1.m24106b(this.f69105f.f63934a, g9a.m12428e(g9a.m12428e((iHashCode2 + (w34Var != null ? w34Var.hashCode() : 0)) * 31, 31, false), 31, this.f69104e), 31);
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: n */
    public final void mo22n(y64 y64Var) {
        y64Var.f69365a = "toggleable";
        z91 z91Var = y64Var.f69367c;
        z91Var.m25511b(y64Var.f69366b, "value");
        z91Var.m25511b(this.f69102c, "interactionSource");
        z91Var.m25511b(this.f69103d, "indicationNodeFactory");
        z91Var.m25511b(Boolean.valueOf(this.f69104e), "enabled");
        z91Var.m25511b(this.f69105f, "role");
        z91Var.m25511b(this.f69106g, "onValueChange");
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: o */
    public final void mo23o(d16 d16Var) {
        a2a a2aVar = (a2a) d16Var;
        boolean z = a2aVar.f133h0;
        boolean z2 = this.f69101b;
        if (z != z2) {
            a2aVar.f133h0 = z2;
            thb.m22062u(a2aVar);
        }
        a2aVar.f134i0 = this.f69106g;
        a2aVar.m803o1(this.f69102c, this.f69103d, false, this.f69104e, null, this.f69105f, a2aVar.f135j0);
    }
}
