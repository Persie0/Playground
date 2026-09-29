package p000;

/* JADX INFO: loaded from: classes.dex */
public final class g31 extends i16 implements mv8 {

    /* JADX INFO: renamed from: b */
    public final vi3 f40104b;

    public g31(vi3 vi3Var) {
        this.f40104b = vi3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g31) {
            return this.f40104b == ((g31) obj).f40104b;
        }
        return false;
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: h */
    public final d16 mo21h() {
        return new om1(false, true, this.f40104b);
    }

    public final int hashCode() {
        return this.f40104b.hashCode();
    }

    @Override // p000.mv8
    /* JADX INFO: renamed from: k */
    public final kv8 mo12308k() {
        kv8 kv8Var = new kv8();
        kv8Var.f48473c = false;
        kv8Var.f48474d = true;
        this.f40104b.invoke(kv8Var);
        return kv8Var;
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: n */
    public final void mo22n(y64 y64Var) {
        y64Var.f69365a = "clearAndSetSemantics";
        nv8.m17641a(y64Var, mo12308k());
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: o */
    public final void mo23o(d16 d16Var) {
        ((om1) d16Var).f54566L = this.f40104b;
    }
}
