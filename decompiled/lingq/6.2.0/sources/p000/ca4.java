package p000;

import androidx.compose.foundation.layout.IntrinsicSize;

/* JADX INFO: loaded from: classes.dex */
final class ca4 extends i16 {

    /* JADX INFO: renamed from: b */
    public final IntrinsicSize f9787b;

    /* JADX INFO: renamed from: c */
    public final vi3 f9788c;

    public ca4(IntrinsicSize intrinsicSize, vi3 vi3Var) {
        this.f9787b = intrinsicSize;
        this.f9788c = vi3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        ca4 ca4Var = obj instanceof ca4 ? (ca4) obj : null;
        return ca4Var != null && this.f9787b == ca4Var.f9787b;
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: h */
    public final d16 mo21h() {
        da4 da4Var = new da4(0);
        da4Var.f35289K = this.f9787b;
        da4Var.f35290L = true;
        return da4Var;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.f9787b.hashCode() * 31);
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: n */
    public final void mo22n(y64 y64Var) {
        this.f9788c.invoke(y64Var);
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: o */
    public final void mo23o(d16 d16Var) {
        da4 da4Var = (da4) d16Var;
        da4Var.f35289K = this.f9787b;
        da4Var.f35290L = true;
    }
}
