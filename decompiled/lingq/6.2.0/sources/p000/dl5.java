package p000;

import com.airbnb.lottie.compose.C0873c;

/* JADX INFO: loaded from: classes2.dex */
public final class dl5 extends i16 {

    /* JADX INFO: renamed from: b */
    public final int f35787b;

    /* JADX INFO: renamed from: c */
    public final int f35788c;

    public dl5(int i, int i2) {
        this.f35787b = i;
        this.f35788c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dl5)) {
            return false;
        }
        dl5 dl5Var = (dl5) obj;
        return this.f35787b == dl5Var.f35787b && this.f35788c == dl5Var.f35788c;
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: h */
    public final d16 mo21h() {
        C0873c c0873c = new C0873c();
        c0873c.f10728J = this.f35787b;
        c0873c.f10729K = this.f35788c;
        return c0873c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f35788c) + (Integer.hashCode(this.f35787b) * 31);
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: n */
    public final void mo22n(y64 y64Var) {
        y64Var.f69365a = "Lottie Size";
        z91 z91Var = y64Var.f69367c;
        z91Var.m25511b(Integer.valueOf(this.f35787b), "width");
        z91Var.m25511b(Integer.valueOf(this.f35788c), "height");
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: o */
    public final void mo23o(d16 d16Var) {
        C0873c c0873c = (C0873c) d16Var;
        c0873c.getClass();
        c0873c.f10728J = this.f35787b;
        c0873c.f10729K = this.f35788c;
    }

    public final String toString() {
        return ux5.m22987j(this.f35787b, this.f35788c, "LottieAnimationSizeElement(width=", ", height=", ")");
    }
}
