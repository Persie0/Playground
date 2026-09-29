package p000;

import androidx.compose.p002ui.draw.C0297d;

/* JADX INFO: loaded from: classes.dex */
final class z27 extends i16 {

    /* JADX INFO: renamed from: b */
    public final y27 f70794b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC3571se f70795c;

    /* JADX INFO: renamed from: d */
    public final jl1 f70796d;

    /* JADX INFO: renamed from: e */
    public final float f70797e;

    /* JADX INFO: renamed from: f */
    public final fa1 f70798f;

    public z27(y27 y27Var, InterfaceC3571se interfaceC3571se, jl1 jl1Var, float f, fa1 fa1Var) {
        this.f70794b = y27Var;
        this.f70795c = interfaceC3571se;
        this.f70796d = jl1Var;
        this.f70797e = f;
        this.f70798f = fa1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z27)) {
            return false;
        }
        z27 z27Var = (z27) obj;
        return fa4.m11650l(this.f70794b, z27Var.f70794b) && fa4.m11650l(this.f70795c, z27Var.f70795c) && fa4.m11650l(this.f70796d, z27Var.f70796d) && Float.compare(this.f70797e, z27Var.f70797e) == 0 && fa4.m11650l(this.f70798f, z27Var.f70798f);
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: h */
    public final d16 mo21h() {
        C0297d c0297d = new C0297d();
        c0297d.f3866J = this.f70794b;
        c0297d.f3867K = true;
        c0297d.f3868L = this.f70795c;
        c0297d.f3869M = this.f70796d;
        c0297d.f3870N = this.f70797e;
        c0297d.f3871O = this.f70798f;
        return c0297d;
    }

    public final int hashCode() {
        int iM24105a = wq1.m24105a((this.f70796d.hashCode() + ((this.f70795c.hashCode() + g9a.m12428e(this.f70794b.hashCode() * 31, 31, true)) * 31)) * 31, this.f70797e, 31);
        fa1 fa1Var = this.f70798f;
        return iM24105a + (fa1Var == null ? 0 : fa1Var.hashCode());
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: n */
    public final void mo22n(y64 y64Var) {
        y64Var.f69365a = "paint";
        z91 z91Var = y64Var.f69367c;
        z91Var.m25511b(this.f70794b, "painter");
        z91Var.m25511b(Boolean.TRUE, "sizeToIntrinsics");
        z91Var.m25511b(this.f70795c, "alignment");
        z91Var.m25511b(this.f70796d, "contentScale");
        z91Var.m25511b(Float.valueOf(this.f70797e), "alpha");
        z91Var.m25511b(this.f70798f, "colorFilter");
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: o */
    public final void mo23o(d16 d16Var) {
        C0297d c0297d = (C0297d) d16Var;
        boolean z = c0297d.f3867K;
        y27 y27Var = this.f70794b;
        boolean z2 = (z && x89.m24404a(c0297d.f3866J.mo1445i(), y27Var.mo1445i())) ? false : true;
        c0297d.f3866J = y27Var;
        c0297d.f3867K = true;
        c0297d.f3868L = this.f70795c;
        c0297d.f3869M = this.f70796d;
        c0297d.f3870N = this.f70797e;
        c0297d.f3871O = this.f70798f;
        if (z2) {
            d32.m10020R(c0297d);
        }
        AbstractC3489q9.m19789s(c0297d);
    }

    public final String toString() {
        return "PainterElement(painter=" + this.f70794b + ", sizeToIntrinsics=true, alignment=" + this.f70795c + ", contentScale=" + this.f70796d + ", alpha=" + this.f70797e + ", colorFilter=" + this.f70798f + ')';
    }
}
