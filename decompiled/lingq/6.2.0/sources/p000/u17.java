package p000;

/* JADX INFO: loaded from: classes.dex */
final class u17 extends i16 {

    /* JADX INFO: renamed from: b */
    public final t17 f63246b;

    /* JADX INFO: renamed from: c */
    public final vi3 f63247c;

    public u17(t17 t17Var, vi3 vi3Var) {
        this.f63246b = t17Var;
        this.f63247c = vi3Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof u17) {
            return fa4.m11650l(((u17) obj).f63246b, this.f63246b);
        }
        return false;
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: h */
    public final d16 mo21h() {
        v17 v17Var = new v17();
        v17Var.f64699L = this.f63246b;
        return v17Var;
    }

    public final int hashCode() {
        return this.f63246b.hashCode();
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: n */
    public final void mo22n(y64 y64Var) {
        this.f63247c.invoke(y64Var);
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: o */
    public final void mo23o(d16 d16Var) {
        v17 v17Var = (v17) d16Var;
        t17 t17Var = v17Var.f64699L;
        t17 t17Var2 = this.f63246b;
        if (fa4.m11650l(t17Var2, t17Var)) {
            return;
        }
        v17Var.f64699L = t17Var2;
        v17Var.mo4502a1();
    }
}
