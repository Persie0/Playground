package p000;

import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.p002ui.node.AbstractC0359i;

/* JADX INFO: loaded from: classes.dex */
public final class z94 extends ba4 {

    /* JADX INFO: renamed from: K */
    public IntrinsicSize f71223K;

    /* JADX INFO: renamed from: L */
    public boolean f71224L;

    @Override // p000.ba4
    /* JADX INFO: renamed from: Z0 */
    public final long mo3503Z0(ct5 ct5Var, long j) {
        int iMo1510U = this.f71223K == IntrinsicSize.Min ? ct5Var.mo1510U(bk1.m3801i(j)) : ct5Var.mo1511c(bk1.m3801i(j));
        if (iMo1510U < 0) {
            iMo1510U = 0;
        }
        if (iMo1510U < 0) {
            k54.m14852a("height must be >= 0");
        }
        return dk1.m10430h(0, Integer.MAX_VALUE, iMo1510U, iMo1510U);
    }

    @Override // p000.ba4
    /* JADX INFO: renamed from: a1 */
    public final boolean mo3504a1() {
        return this.f71224L;
    }

    @Override // p000.ba4, androidx.compose.p002ui.node.InterfaceC0354d
    /* JADX INFO: renamed from: e */
    public final int mo968e(AbstractC0359i abstractC0359i, ct5 ct5Var, int i) {
        return this.f71223K == IntrinsicSize.Min ? ct5Var.mo1510U(i) : ct5Var.mo1511c(i);
    }

    @Override // p000.ba4, androidx.compose.p002ui.node.InterfaceC0354d
    /* JADX INFO: renamed from: j */
    public final int mo970j(AbstractC0359i abstractC0359i, ct5 ct5Var, int i) {
        return this.f71223K == IntrinsicSize.Min ? ct5Var.mo1510U(i) : ct5Var.mo1511c(i);
    }
}
