package p000;

import androidx.compose.foundation.layout.IntrinsicSize;

/* JADX INFO: loaded from: classes.dex */
final class y94 extends i16 {

    /* JADX INFO: renamed from: b */
    public final IntrinsicSize f69509b;

    /* JADX INFO: renamed from: c */
    public final boolean f69510c;

    /* JADX INFO: renamed from: d */
    public final vi3 f69511d;

    public y94(IntrinsicSize intrinsicSize, boolean z, vi3 vi3Var) {
        this.f69509b = intrinsicSize;
        this.f69510c = z;
        this.f69511d = vi3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        y94 y94Var = obj instanceof y94 ? (y94) obj : null;
        return y94Var != null && this.f69509b == y94Var.f69509b && this.f69510c == y94Var.f69510c;
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: h */
    public final d16 mo21h() {
        z94 z94Var = new z94(0);
        z94Var.f71223K = this.f69509b;
        z94Var.f71224L = this.f69510c;
        return z94Var;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f69510c) + (this.f69509b.hashCode() * 31);
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: n */
    public final void mo22n(y64 y64Var) {
        this.f69511d.invoke(y64Var);
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: o */
    public final void mo23o(d16 d16Var) {
        z94 z94Var = (z94) d16Var;
        z94Var.f71223K = this.f69509b;
        z94Var.f71224L = this.f69510c;
    }
}
