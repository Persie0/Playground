package p000;

/* JADX INFO: loaded from: classes.dex */
final class pq6 extends i16 {

    /* JADX INFO: renamed from: b */
    public final vi3 f56678b;

    /* JADX INFO: renamed from: c */
    public final boolean f56679c;

    /* JADX INFO: renamed from: d */
    public final vi3 f56680d;

    public pq6(vi3 vi3Var, vi3 vi3Var2, boolean z) {
        this.f56678b = vi3Var;
        this.f56679c = z;
        this.f56680d = vi3Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        pq6 pq6Var = obj instanceof pq6 ? (pq6) obj : null;
        return pq6Var != null && this.f56678b == pq6Var.f56678b && this.f56679c == pq6Var.f56679c;
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: h */
    public final d16 mo21h() {
        qq6 qq6Var = new qq6();
        qq6Var.f58080J = this.f56678b;
        qq6Var.f58081K = this.f56679c;
        return qq6Var;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f56679c) + (this.f56678b.hashCode() * 31);
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: n */
    public final void mo22n(y64 y64Var) {
        this.f56680d.invoke(y64Var);
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: o */
    public final void mo23o(d16 d16Var) {
        qq6 qq6Var = (qq6) d16Var;
        vi3 vi3Var = qq6Var.f58080J;
        vi3 vi3Var2 = this.f56678b;
        boolean z = this.f56679c;
        if (vi3Var != vi3Var2 || qq6Var.f58081K != z) {
            te1.m21979L(qq6Var).m1582a0(false);
        }
        qq6Var.f58080J = vi3Var2;
        qq6Var.f58081K = z;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OffsetPxModifier(offset=");
        sb.append(this.f56678b);
        sb.append(", rtlAware=");
        return ux5.m22993p(sb, this.f56679c, ')');
    }
}
