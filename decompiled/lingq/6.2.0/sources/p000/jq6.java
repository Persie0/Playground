package p000;

/* JADX INFO: loaded from: classes.dex */
final class jq6 extends i16 {

    /* JADX INFO: renamed from: b */
    public final float f46007b;

    /* JADX INFO: renamed from: c */
    public final float f46008c;

    /* JADX INFO: renamed from: d */
    public final kq6 f46009d;

    public jq6(float f, float f2, kq6 kq6Var) {
        this.f46007b = f;
        this.f46008c = f2;
        this.f46009d = kq6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        jq6 jq6Var = obj instanceof jq6 ? (jq6) obj : null;
        return jq6Var != null && xj2.m24560b(this.f46007b, jq6Var.f46007b) && xj2.m24560b(this.f46008c, jq6Var.f46008c);
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: h */
    public final d16 mo21h() {
        nq6 nq6Var = new nq6();
        nq6Var.f53136J = this.f46007b;
        nq6Var.f53137K = this.f46008c;
        nq6Var.f53138L = true;
        return nq6Var;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + wq1.m24105a(Float.hashCode(this.f46007b) * 31, this.f46008c, 31);
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: n */
    public final void mo22n(y64 y64Var) {
        this.f46009d.invoke(y64Var);
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: o */
    public final void mo23o(d16 d16Var) {
        nq6 nq6Var = (nq6) d16Var;
        float f = nq6Var.f53136J;
        float f2 = this.f46007b;
        boolean zM24560b = xj2.m24560b(f, f2);
        float f3 = this.f46008c;
        if (!zM24560b || !xj2.m24560b(nq6Var.f53137K, f3) || !nq6Var.f53138L) {
            te1.m21979L(nq6Var).m1582a0(false);
        }
        nq6Var.f53136J = f2;
        nq6Var.f53137K = f3;
        nq6Var.f53138L = true;
    }

    public final String toString() {
        return "OffsetModifierElement(x=" + ((Object) xj2.m24561c(this.f46007b)) + ", y=" + ((Object) xj2.m24561c(this.f46008c)) + ", rtlAware=true)";
    }
}
