package p000;

/* JADX INFO: loaded from: classes.dex */
final class tp9 extends i16 {

    /* JADX INFO: renamed from: b */
    public final vi3 f62704b;

    /* JADX INFO: renamed from: c */
    public final vi3 f62705c;

    public tp9(vi3 vi3Var, vi3 vi3Var2) {
        this.f62704b = vi3Var;
        this.f62705c = vi3Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof tp9) {
            return this.f62705c == ((tp9) obj).f62705c;
        }
        return false;
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: h */
    public final d16 mo21h() {
        up9 up9Var = new up9(bna.f8739l);
        up9Var.f64193M = this.f62705c;
        return up9Var;
    }

    public final int hashCode() {
        return this.f62705c.hashCode();
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: n */
    public final void mo22n(y64 y64Var) {
        this.f62704b.invoke(y64Var);
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: o */
    public final void mo23o(d16 d16Var) {
        up9 up9Var = (up9) d16Var;
        vi3 vi3Var = up9Var.f64193M;
        vi3 vi3Var2 = this.f62705c;
        if (vi3Var != vi3Var2) {
            up9Var.f64193M = vi3Var2;
            l6b l6bVar = up9Var.f64194N;
            if (l6bVar != null) {
                e5b e5bVar = (e5b) vi3Var2.invoke(l6bVar);
                if (fa4.m11650l(e5bVar, up9Var.f61912L)) {
                    return;
                }
                up9Var.f61912L = e5bVar;
                up9Var.mo4502a1();
            }
        }
    }
}
