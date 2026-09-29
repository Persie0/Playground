package p000;

/* JADX INFO: loaded from: classes.dex */
final class u34 extends i16 {

    /* JADX INFO: renamed from: b */
    public final v56 f63346b;

    /* JADX INFO: renamed from: c */
    public final w34 f63347c;

    public u34(v56 v56Var, w34 w34Var) {
        this.f63346b = v56Var;
        this.f63347c = w34Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u34)) {
            return false;
        }
        u34 u34Var = (u34) obj;
        return fa4.m11650l(this.f63346b, u34Var.f63346b) && fa4.m11650l(this.f63347c, u34Var.f63347c);
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: h */
    public final d16 mo21h() {
        ea2 ea2VarMo20662a = this.f63347c.mo20662a(this.f63346b);
        v34 v34Var = new v34();
        v34Var.f64782L = ea2VarMo20662a;
        v34Var.m11624Z0(ea2VarMo20662a);
        return v34Var;
    }

    public final int hashCode() {
        return this.f63347c.hashCode() + (this.f63346b.hashCode() * 31);
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: n */
    public final void mo22n(y64 y64Var) {
        y64Var.f69365a = "indication";
        z91 z91Var = y64Var.f69367c;
        z91Var.m25511b(this.f63346b, "interactionSource");
        z91Var.m25511b(this.f63347c, "indication");
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: o */
    public final void mo23o(d16 d16Var) {
        v34 v34Var = (v34) d16Var;
        ea2 ea2VarMo20662a = this.f63347c.mo20662a(this.f63346b);
        v34Var.m11625a1(v34Var.f64782L);
        v34Var.f64782L = ea2VarMo20662a;
        v34Var.m11624Z0(ea2VarMo20662a);
    }
}
