package p000;

/* JADX INFO: loaded from: classes.dex */
final class z07 extends i16 {
    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof z07);
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: h */
    public final d16 mo21h() {
        a17 a17Var = new a17();
        a17Var.f65L = null;
        return a17Var;
    }

    public final int hashCode() {
        return 0;
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: n */
    public final void mo22n(y64 y64Var) {
        y64Var.f69365a = "overscroll";
        y64Var.f69367c.m25511b(null, "overscrollEffect");
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: o */
    public final void mo23o(d16 d16Var) {
        a17 a17Var = (a17) d16Var;
        ea2 ea2Var = a17Var.f65L;
        if (ea2Var != null) {
            a17Var.m11625a1(ea2Var);
        }
        a17Var.f65L = null;
        a17Var.f65L = null;
    }
}
