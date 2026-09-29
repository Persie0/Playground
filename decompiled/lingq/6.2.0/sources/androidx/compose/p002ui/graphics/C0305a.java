package androidx.compose.p002ui.graphics;

import p000.d16;
import p000.d32;
import p000.i16;
import p000.vi3;
import p000.y64;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.a */
/* JADX INFO: loaded from: classes.dex */
final class C0305a extends i16 {

    /* JADX INFO: renamed from: b */
    public final vi3 f3924b;

    public C0305a(vi3 vi3Var) {
        this.f3924b = vi3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0305a) {
            return this.f3924b == ((C0305a) obj).f3924b;
        }
        return false;
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: h */
    public final d16 mo21h() {
        return new C0306b(this.f3924b);
    }

    public final int hashCode() {
        return this.f3924b.hashCode();
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: n */
    public final void mo22n(y64 y64Var) {
        y64Var.f69365a = "graphicsLayer";
        y64Var.f69367c.m25511b(this.f3924b, "block");
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: o */
    public final void mo23o(d16 d16Var) {
        C0306b c0306b = (C0306b) d16Var;
        vi3 vi3Var = this.f3924b;
        c0306b.f3925J = vi3Var;
        d32.m10052m0(c0306b, vi3Var);
    }
}
