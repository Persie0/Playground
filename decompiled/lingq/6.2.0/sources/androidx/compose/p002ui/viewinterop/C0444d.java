package androidx.compose.p002ui.viewinterop;

import p000.d16;
import p000.i16;
import p000.vi3;
import p000.y64;

/* JADX INFO: renamed from: androidx.compose.ui.viewinterop.d */
/* JADX INFO: loaded from: classes2.dex */
final class C0444d extends i16 {

    /* JADX INFO: renamed from: b */
    public final vi3 f5203b;

    public C0444d(vi3 vi3Var) {
        this.f5203b = vi3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0444d) {
            return this.f5203b == ((C0444d) obj).f5203b;
        }
        return false;
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: h */
    public final d16 mo21h() {
        return new C0445e(this.f5203b);
    }

    public final int hashCode() {
        return this.f5203b.hashCode();
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: n */
    public final void mo22n(y64 y64Var) {
        y64Var.f69365a = "requestRectangleBringIntoViewBridge";
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: o */
    public final void mo23o(d16 d16Var) {
        C0445e c0445e = (C0445e) d16Var;
        vi3 vi3Var = this.f5203b;
        c0445e.f5204J = vi3Var;
        if (c0445e.f34836I) {
            ((AndroidViewHolder$layoutNode$1$coreModifier$4) vi3Var).invoke(c0445e.f5205K);
        }
    }
}
