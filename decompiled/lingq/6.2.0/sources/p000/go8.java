package p000;

/* JADX INFO: loaded from: classes.dex */
public final class go8 extends i16 {

    /* JADX INFO: renamed from: b */
    public final yn8 f41086b;

    /* JADX INFO: renamed from: c */
    public final boolean f41087c;

    public go8(yn8 yn8Var, boolean z) {
        this.f41086b = yn8Var;
        this.f41087c = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof go8)) {
            return false;
        }
        go8 go8Var = (go8) obj;
        return fa4.m11650l(this.f41086b, go8Var.f41086b) && this.f41087c == go8Var.f41087c;
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: h */
    public final d16 mo21h() {
        un8 un8Var = new un8();
        un8Var.f64111J = this.f41086b;
        un8Var.f64112K = this.f41087c;
        return un8Var;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f41087c) + g9a.m12428e(this.f41086b.hashCode() * 31, 31, false);
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: n */
    public final void mo22n(y64 y64Var) {
        y64Var.f69365a = "scroll";
        z91 z91Var = y64Var.f69367c;
        z91Var.m25511b(this.f41086b, "state");
        z91Var.m25511b(Boolean.FALSE, "reverseScrolling");
        z91Var.m25511b(Boolean.valueOf(this.f41087c), "isVertical");
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: o */
    public final void mo23o(d16 d16Var) {
        un8 un8Var = (un8) d16Var;
        un8Var.f64111J = this.f41086b;
        un8Var.f64112K = this.f41087c;
    }
}
