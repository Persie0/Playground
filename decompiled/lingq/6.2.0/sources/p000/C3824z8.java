package p000;

/* JADX INFO: renamed from: z8 */
/* JADX INFO: loaded from: classes.dex */
final class C3824z8 extends i16 {

    /* JADX INFO: renamed from: b */
    public final eq8 f71039b;

    public C3824z8(eq8 eq8Var) {
        this.f71039b = eq8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3824z8) {
            return this.f71039b == ((C3824z8) obj).f71039b;
        }
        return false;
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: h */
    public final d16 mo21h() {
        C0802b9 c0802b9 = new C0802b9();
        c0802b9.f8125L = this.f71039b;
        C0011a9 c0011a9 = new C0011a9(c0802b9, 0);
        C3787y8 c3787y8 = new C3787y8();
        c3787y8.f69455J = c0011a9;
        c0802b9.m11624Z0(c3787y8);
        return c0802b9;
    }

    public final int hashCode() {
        return this.f71039b.hashCode();
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: n */
    public final void mo22n(y64 y64Var) {
        y64Var.f69365a = "addTextContextMenuDataComponentsWithResources";
        y64Var.f69367c.m25511b(this.f71039b, "builder");
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: o */
    public final void mo23o(d16 d16Var) {
        ((C0802b9) d16Var).f8125L = this.f71039b;
    }
}
