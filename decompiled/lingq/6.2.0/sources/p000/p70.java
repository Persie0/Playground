package p000;

import androidx.compose.p002ui.graphics.drawscope.InterfaceC0310a;
import androidx.compose.p002ui.node.AbstractC0356f;
import androidx.compose.p002ui.node.C0358h;
import androidx.compose.p002ui.semantics.AbstractC0426f;
import androidx.compose.p002ui.unit.LayoutDirection;

/* JADX INFO: loaded from: classes.dex */
public final class p70 extends d16 implements ll2, qp6, ov8 {

    /* JADX INFO: renamed from: J */
    public long f55676J;

    /* JADX INFO: renamed from: K */
    public vi0 f55677K;

    /* JADX INFO: renamed from: L */
    public float f55678L;

    /* JADX INFO: renamed from: M */
    public o39 f55679M;

    /* JADX INFO: renamed from: N */
    public long f55680N;

    /* JADX INFO: renamed from: O */
    public LayoutDirection f55681O;

    /* JADX INFO: renamed from: P */
    public pk9 f55682P;

    /* JADX INFO: renamed from: Q */
    public o39 f55683Q;

    /* JADX INFO: renamed from: R */
    public pk9 f55684R;

    @Override // p000.ov8
    /* JADX INFO: renamed from: H0 */
    public final void mo787H0(tv8 tv8Var) {
        AbstractC0426f.m1865i(tv8Var, this.f55679M);
    }

    @Override // p000.ll2
    /* JADX INFO: renamed from: i0 */
    public final void mo952i0(C0358h c0358h) {
        pk9 pk9Var;
        if (this.f55679M == ss5.f61356d) {
            if (!aa1.m199c(this.f55676J, aa1.f412k)) {
                InterfaceC0310a.m1414L0(c0358h, this.f55676J, 0L, 0L, 0.0f, null, 0, 126);
            }
            vi0 vi0Var = this.f55677K;
            if (vi0Var != null) {
                InterfaceC0310a.m1418s0(c0358h, vi0Var, 0L, 0L, this.f55678L, null, null, 0, 118);
            }
        } else {
            an0 an0Var = c0358h.f4358a;
            if (x89.m24404a(an0Var.mo1422h(), this.f55680N) && c0358h.getLayoutDirection() == this.f55681O && fa4.m11650l(this.f55683Q, this.f55679M)) {
                pk9Var = this.f55682P;
                pk9Var.getClass();
            } else {
                AbstractC0356f.m1552b(this, new C3006fm(2, this, c0358h));
                pk9Var = this.f55684R;
                this.f55684R = null;
            }
            this.f55682P = pk9Var;
            this.f55680N = an0Var.mo1422h();
            this.f55681O = c0358h.getLayoutDirection();
            this.f55683Q = this.f55679M;
            pk9Var.getClass();
            if (!aa1.m199c(this.f55676J, aa1.f412k)) {
                lda.m16136v(c0358h, pk9Var, this.f55676J);
            }
            vi0 vi0Var2 = this.f55677K;
            if (vi0Var2 != null) {
                lda.m16135u(c0358h, pk9Var, vi0Var2, this.f55678L, 56);
            }
        }
        c0358h.m1614b();
    }

    @Override // p000.ov8
    /* JADX INFO: renamed from: m */
    public final boolean mo1399m() {
        return false;
    }

    @Override // p000.qp6
    /* JADX INFO: renamed from: r0 */
    public final void mo804r0() {
        this.f55680N = 9205357640488583168L;
        this.f55681O = null;
        this.f55682P = null;
        this.f55683Q = null;
        AbstractC3489q9.m19789s(this);
    }
}
