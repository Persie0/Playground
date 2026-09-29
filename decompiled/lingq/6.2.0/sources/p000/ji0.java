package p000;

import androidx.compose.foundation.relocation.C0154a;

/* JADX INFO: loaded from: classes.dex */
final class ji0 extends i16 {

    /* JADX INFO: renamed from: b */
    public final C0154a f45560b;

    public ji0(C0154a c0154a) {
        this.f45560b = c0154a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ji0) {
            return fa4.m11650l(this.f45560b, ((ji0) obj).f45560b);
        }
        return false;
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: h */
    public final d16 mo21h() {
        ki0 ki0Var = new ki0();
        ki0Var.f47312J = this.f45560b;
        return ki0Var;
    }

    public final int hashCode() {
        return this.f45560b.hashCode();
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: n */
    public final void mo22n(y64 y64Var) {
        y64Var.f69365a = "bringIntoViewRequester";
        y64Var.f69367c.m25511b(this.f45560b, "bringIntoViewRequester");
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: o */
    public final void mo23o(d16 d16Var) {
        ki0 ki0Var = (ki0) d16Var;
        C0154a c0154a = ki0Var.f47312J;
        if (c0154a instanceof C0154a) {
            c0154a.f2721a.m24313k(ki0Var);
        }
        C0154a c0154a2 = this.f45560b;
        if (c0154a2 instanceof C0154a) {
            c0154a2.f2721a.m24305c(ki0Var);
        }
        ki0Var.f47312J = c0154a2;
    }
}
