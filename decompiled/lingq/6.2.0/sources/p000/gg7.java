package p000;

/* JADX INFO: loaded from: classes.dex */
public final class gg7 extends i16 {

    /* JADX INFO: renamed from: b */
    public final C3724wj f40774b;

    public gg7(C3724wj c3724wj) {
        this.f40774b = c3724wj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gg7) && this.f40774b.equals(((gg7) obj).f40774b);
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: h */
    public final d16 mo21h() {
        return new hg7(this.f40774b, null);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.f40774b.f66898b * 31);
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: n */
    public final void mo22n(y64 y64Var) {
        y64Var.f69365a = "pointerHoverIcon";
        z91 z91Var = y64Var.f69367c;
        z91Var.m25511b(this.f40774b, "icon");
        z91Var.m25511b(Boolean.FALSE, "overrideDescendants");
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: o */
    public final void mo23o(d16 d16Var) {
        hg7 hg7Var = (hg7) d16Var;
        C3724wj c3724wj = hg7Var.f4125K;
        C3724wj c3724wj2 = this.f40774b;
        if (fa4.m11650l(c3724wj, c3724wj2)) {
            return;
        }
        hg7Var.f4125K = c3724wj2;
        if (hg7Var.f4126L) {
            hg7Var.m1459b1();
        }
    }

    public final String toString() {
        return "PointerHoverIconModifierElement(icon=" + this.f40774b + ", overrideDescendants=false)";
    }
}
