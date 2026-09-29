package p000;

/* JADX INFO: loaded from: classes.dex */
final class w17 extends i16 {

    /* JADX INFO: renamed from: b */
    public final t17 f66223b;

    /* JADX INFO: renamed from: c */
    public final kv4 f66224c;

    public w17(t17 t17Var, kv4 kv4Var) {
        this.f66223b = t17Var;
        this.f66224c = kv4Var;
    }

    public final boolean equals(Object obj) {
        w17 w17Var = obj instanceof w17 ? (w17) obj : null;
        if (w17Var == null) {
            return false;
        }
        return fa4.m11650l(this.f66223b, w17Var.f66223b);
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: h */
    public final d16 mo21h() {
        z17 z17Var = new z17();
        z17Var.f70751J = this.f66223b;
        return z17Var;
    }

    public final int hashCode() {
        return this.f66223b.hashCode();
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: n */
    public final void mo22n(y64 y64Var) {
        this.f66224c.invoke(y64Var);
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: o */
    public final void mo23o(d16 d16Var) {
        ((z17) d16Var).f70751J = this.f66223b;
    }
}
