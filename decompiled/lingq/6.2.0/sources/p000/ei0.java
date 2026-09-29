package p000;

import androidx.compose.p002ui.platform.AbstractC0406r;

/* JADX INFO: loaded from: classes.dex */
public final class ei0 implements bi0 {

    /* JADX INFO: renamed from: a */
    public final fb2 f37274a;

    /* JADX INFO: renamed from: b */
    public final long f37275b;

    public ei0(qm9 qm9Var, long j) {
        this.f37274a = qm9Var;
        this.f37275b = j;
    }

    @Override // p000.bi0
    /* JADX INFO: renamed from: a */
    public final e16 mo3727a(e16 e16Var, gc0 gc0Var) {
        return e16Var.mo3161g(new lh0(gc0Var, false, AbstractC0406r.m1816b()));
    }

    /* JADX INFO: renamed from: b */
    public final float m11159b() {
        long j = this.f37275b;
        if (!bk1.m3797e(j)) {
            return Float.POSITIVE_INFINITY;
        }
        return this.f37274a.mo905T(bk1.m3801i(j));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ei0)) {
            return false;
        }
        ei0 ei0Var = (ei0) obj;
        return fa4.m11650l(this.f37274a, ei0Var.f37274a) && bk1.m3795c(this.f37275b, ei0Var.f37275b);
    }

    public final int hashCode() {
        return Long.hashCode(this.f37275b) + (this.f37274a.hashCode() * 31);
    }

    public final String toString() {
        return "BoxWithConstraintsScopeImpl(density=" + this.f37274a + ", constraints=" + ((Object) bk1.m3804l(this.f37275b)) + ')';
    }
}
