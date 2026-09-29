package p000;

import androidx.compose.p002ui.layout.C0341h;

/* JADX INFO: loaded from: classes.dex */
final class ms6 extends i16 {

    /* JADX INFO: renamed from: b */
    public final vi3 f51803b;

    public ms6(vi3 vi3Var) {
        this.f51803b = vi3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && ms6.class == obj.getClass() && this.f51803b == ((ms6) obj).f51803b;
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: h */
    public final d16 mo21h() {
        return new C0341h(this.f51803b);
    }

    public final int hashCode() {
        return this.f51803b.hashCode() + wq1.m24105a(Long.hashCode(200L) * 31, 0.3f, 961);
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: n */
    public final void mo22n(y64 y64Var) {
        y64Var.f69365a = "onViewportVisibilityChanged";
        z91 z91Var = y64Var.f69367c;
        z91Var.m25511b(200L, "minDurationMs");
        z91Var.m25511b(Float.valueOf(0.3f), "minFractionVisible");
        z91Var.m25511b(null, "viewportRef");
        z91Var.m25511b(this.f51803b, "callback");
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: o */
    public final void mo23o(d16 d16Var) {
        C0341h c0341h = (C0341h) d16Var;
        c0341h.getClass();
        c0341h.f4208J = this.f51803b;
        r48 r48Var = c0341h.f4213O;
        if (r48Var != null) {
            c0341h.m1515Z0(r48Var);
        }
    }
}
