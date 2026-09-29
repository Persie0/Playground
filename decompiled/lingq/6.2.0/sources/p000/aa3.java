package p000;

/* JADX INFO: loaded from: classes.dex */
final class aa3 extends i16 {

    /* JADX INFO: renamed from: b */
    public final z93 f417b;

    public aa3(z93 z93Var) {
        this.f417b = z93Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aa3) && fa4.m11650l(this.f417b, ((aa3) obj).f417b);
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: h */
    public final d16 mo21h() {
        ca3 ca3Var = new ca3();
        ca3Var.f9786J = this.f417b;
        return ca3Var;
    }

    public final int hashCode() {
        return this.f417b.hashCode();
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: n */
    public final void mo22n(y64 y64Var) {
        y64Var.f69365a = "focusRequester";
        y64Var.f69367c.m25511b(this.f417b, "focusRequester");
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: o */
    public final void mo23o(d16 d16Var) {
        ca3 ca3Var = (ca3) d16Var;
        ca3Var.f9786J.f71222a.m24313k(ca3Var);
        z93 z93Var = this.f417b;
        ca3Var.f9786J = z93Var;
        z93Var.f71222a.m24305c(ca3Var);
    }

    public final String toString() {
        return "FocusRequesterElement(focusRequester=" + this.f417b + ')';
    }
}
