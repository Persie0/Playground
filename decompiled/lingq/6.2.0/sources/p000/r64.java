package p000;

/* JADX INFO: loaded from: classes.dex */
final class r64 extends i16 {

    /* JADX INFO: renamed from: b */
    public final e5b f58795b;

    /* JADX INFO: renamed from: c */
    public final vi3 f58796c;

    public r64(e5b e5bVar, vi3 vi3Var) {
        this.f58795b = e5bVar;
        this.f58796c = vi3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r64) {
            return fa4.m11650l(((r64) obj).f58795b, this.f58795b);
        }
        return false;
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: h */
    public final d16 mo21h() {
        return new t64(this.f58795b);
    }

    public final int hashCode() {
        return this.f58795b.hashCode();
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: n */
    public final void mo22n(y64 y64Var) {
        this.f58796c.invoke(y64Var);
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: o */
    public final void mo23o(d16 d16Var) {
        t64 t64Var = (t64) d16Var;
        e5b e5bVar = t64Var.f61912L;
        e5b e5bVar2 = this.f58795b;
        if (fa4.m11650l(e5bVar2, e5bVar)) {
            return;
        }
        t64Var.f61912L = e5bVar2;
        t64Var.mo4502a1();
    }
}
