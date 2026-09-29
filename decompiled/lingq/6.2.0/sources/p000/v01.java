package p000;

/* JADX INFO: loaded from: classes.dex */
public final class v01 extends i16 {

    /* JADX INFO: renamed from: b */
    public final vp6 f64654b;

    public v01(vp6 vp6Var) {
        this.f64654b = vp6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof v01) {
            return this.f64654b == ((v01) obj).f64654b;
        }
        return false;
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: h */
    public final d16 mo21h() {
        u01 u01Var = new u01();
        u01Var.f63162J = this.f64654b;
        return u01Var;
    }

    public final int hashCode() {
        return this.f64654b.hashCode();
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: n */
    public final void mo22n(y64 y64Var) {
        y64Var.f69365a = "childSemantics";
        y64Var.f69367c.m25511b(this.f64654b, "properties");
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: o */
    public final void mo23o(d16 d16Var) {
        u01 u01Var = (u01) d16Var;
        u01Var.f63162J = this.f64654b;
        thb.m22062u(u01Var);
    }
}
