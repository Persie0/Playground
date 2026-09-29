package p000;

/* JADX INFO: loaded from: classes.dex */
final class vfa extends i16 {

    /* JADX INFO: renamed from: b */
    public final e5b f65324b;

    /* JADX INFO: renamed from: c */
    public final vi3 f65325c;

    public vfa(e5b e5bVar, vi3 vi3Var) {
        this.f65324b = e5bVar;
        this.f65325c = vi3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof vfa) {
            return fa4.m11650l(((vfa) obj).f65324b, this.f65324b);
        }
        return false;
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: h */
    public final d16 mo21h() {
        wfa wfaVar = new wfa();
        wfaVar.f66764L = this.f65324b;
        return wfaVar;
    }

    public final int hashCode() {
        return this.f65324b.hashCode();
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: n */
    public final void mo22n(y64 y64Var) {
        this.f65325c.invoke(y64Var);
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: o */
    public final void mo23o(d16 d16Var) {
        wfa wfaVar = (wfa) d16Var;
        e5b e5bVar = wfaVar.f66764L;
        e5b e5bVar2 = this.f65324b;
        if (fa4.m11650l(e5bVar2, e5bVar)) {
            return;
        }
        wfaVar.f66764L = e5bVar2;
        wfaVar.mo4502a1();
    }
}
