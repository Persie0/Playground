package p000;

import coil.compose.C0858a;

/* JADX INFO: loaded from: classes.dex */
public final class el1 extends i16 {

    /* JADX INFO: renamed from: b */
    public final C0858a f37406b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC3571se f37407c;

    /* JADX INFO: renamed from: d */
    public final jl1 f37408d;

    public el1(C0858a c0858a, InterfaceC3571se interfaceC3571se, jl1 jl1Var) {
        this.f37406b = c0858a;
        this.f37407c = interfaceC3571se;
        this.f37408d = jl1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof el1) {
            el1 el1Var = (el1) obj;
            if (this.f37406b == el1Var.f37406b && fa4.m11650l(this.f37407c, el1Var.f37407c) && fa4.m11650l(this.f37408d, el1Var.f37408d) && Float.compare(1.0f, 1.0f) == 0) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: h */
    public final d16 mo21h() {
        fl1 fl1Var = new fl1();
        fl1Var.f39241J = this.f37406b;
        fl1Var.f39242K = this.f37407c;
        fl1Var.f39243L = this.f37408d;
        fl1Var.f39244M = 1.0f;
        return fl1Var;
    }

    public final int hashCode() {
        return wq1.m24105a((this.f37408d.hashCode() + ((this.f37407c.hashCode() + (this.f37406b.hashCode() * 31)) * 31)) * 31, 1.0f, 31);
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: n */
    public final void mo22n(y64 y64Var) {
        y64Var.f69365a = "content";
        z91 z91Var = y64Var.f69367c;
        z91Var.m25511b(this.f37406b, "painter");
        z91Var.m25511b(this.f37407c, "alignment");
        z91Var.m25511b(this.f37408d, "contentScale");
        z91Var.m25511b(Float.valueOf(1.0f), "alpha");
        z91Var.m25511b(null, "colorFilter");
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: o */
    public final void mo23o(d16 d16Var) {
        fl1 fl1Var = (fl1) d16Var;
        long jMo1445i = fl1Var.f39241J.mo1445i();
        C0858a c0858a = this.f37406b;
        boolean zM24404a = x89.m24404a(jMo1445i, c0858a.mo1445i());
        fl1Var.f39241J = c0858a;
        fl1Var.f39242K = this.f37407c;
        fl1Var.f39243L = this.f37408d;
        fl1Var.f39244M = 1.0f;
        if (!zM24404a) {
            d32.m10020R(fl1Var);
        }
        AbstractC3489q9.m19789s(fl1Var);
    }

    public final String toString() {
        return "ContentPainterElement(painter=" + this.f37406b + ", alignment=" + this.f37407c + ", contentScale=" + this.f37408d + ", alpha=1.0, colorFilter=null)";
    }
}
