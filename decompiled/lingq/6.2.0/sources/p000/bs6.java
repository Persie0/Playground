package p000;

/* JADX INFO: loaded from: classes.dex */
final class bs6 extends i16 {

    /* JADX INFO: renamed from: b */
    public final vi3 f8946b;

    public bs6(vi3 vi3Var) {
        this.f8946b = vi3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bs6) && this.f8946b == ((bs6) obj).f8946b;
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: h */
    public final d16 mo21h() {
        cs6 cs6Var = new cs6();
        cs6Var.f34490J = 64L;
        cs6Var.f34491K = this.f8946b;
        return cs6Var;
    }

    public final int hashCode() {
        return this.f8946b.hashCode() + ux5.m22981d(64L, Long.hashCode(0L) * 31, 31);
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: n */
    public final void mo22n(y64 y64Var) {
        y64Var.f69365a = "onRectChanged";
        z91 z91Var = y64Var.f69367c;
        z91Var.m25511b(0L, "throttleMillis");
        z91Var.m25511b(64L, "debounceMillis");
        z91Var.m25511b(this.f8946b, "callback");
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: o */
    public final void mo23o(d16 d16Var) {
        cs6 cs6Var = (cs6) d16Var;
        cs6Var.getClass();
        cs6Var.f34490J = 64L;
        cs6Var.f34491K = this.f8946b;
        xz9 xz9Var = cs6Var.f34492L;
        if (xz9Var != null) {
            xz9Var.m24800b();
        }
        cs6Var.f34492L = omd.m18140b0(cs6Var, cs6Var.f34490J, cs6Var.f34491K);
    }
}
