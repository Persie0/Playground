package p000;

/* JADX INFO: loaded from: classes.dex */
final class zr3 extends i16 {

    /* JADX INFO: renamed from: b */
    public final vx9 f72001b;

    /* JADX INFO: renamed from: c */
    public final int f72002c;

    /* JADX INFO: renamed from: d */
    public final int f72003d;

    public zr3(vx9 vx9Var, int i, int i2) {
        this.f72001b = vx9Var;
        this.f72002c = i;
        this.f72003d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zr3)) {
            return false;
        }
        zr3 zr3Var = (zr3) obj;
        return fa4.m11650l(this.f72001b, zr3Var.f72001b) && this.f72002c == zr3Var.f72002c && this.f72003d == zr3Var.f72003d;
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: h */
    public final d16 mo21h() {
        bs3 bs3Var = new bs3();
        bs3Var.f8932J = this.f72001b;
        bs3Var.f8933K = this.f72002c;
        bs3Var.f8934L = this.f72003d;
        bs3Var.f8936N = -1;
        bs3Var.f8937O = -1;
        return bs3Var;
    }

    public final int hashCode() {
        return (((this.f72001b.hashCode() * 31) + this.f72002c) * 31) + this.f72003d;
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: n */
    public final void mo22n(y64 y64Var) {
        y64Var.f69365a = "heightInLines";
        z91 z91Var = y64Var.f69367c;
        z91Var.m25511b(Integer.valueOf(this.f72002c), "minLines");
        z91Var.m25511b(Integer.valueOf(this.f72003d), "maxLines");
        z91Var.m25511b(this.f72001b, "textStyle");
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: o */
    public final void mo23o(d16 d16Var) {
        bs3 bs3Var = (bs3) d16Var;
        vx9 vx9Var = bs3Var.f8932J;
        vx9 vx9Var2 = this.f72001b;
        boolean zM11650l = fa4.m11650l(vx9Var, vx9Var2);
        int i = this.f72002c;
        int i2 = this.f72003d;
        if (zM11650l && bs3Var.f8933K == i && bs3Var.f8934L == i2) {
            return;
        }
        bs3Var.f8932J = vx9Var2;
        bs3Var.f8933K = i;
        bs3Var.f8934L = i2;
        bs3Var.f8938P = vz1.m23615W(vx9Var2, te1.m21979L(bs3Var).f4328U);
        bs3Var.f8935M = true;
        d32.m10020R(bs3Var);
    }
}
