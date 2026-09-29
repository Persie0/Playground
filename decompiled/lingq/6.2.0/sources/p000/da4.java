package p000;

import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.p002ui.node.AbstractC0359i;

/* JADX INFO: loaded from: classes.dex */
public final class da4 extends ba4 {

    /* JADX INFO: renamed from: K */
    public IntrinsicSize f35289K;

    /* JADX INFO: renamed from: L */
    public boolean f35290L;

    @Override // p000.ba4
    /* JADX INFO: renamed from: Z0 */
    public final long mo3503Z0(ct5 ct5Var, long j) {
        int iMo1512l = this.f35289K == IntrinsicSize.Min ? ct5Var.mo1512l(bk1.m3800h(j)) : ct5Var.mo1513p(bk1.m3800h(j));
        if (iMo1512l < 0) {
            iMo1512l = 0;
        }
        if (iMo1512l < 0) {
            k54.m14852a("width must be >= 0");
        }
        return dk1.m10430h(iMo1512l, iMo1512l, 0, Integer.MAX_VALUE);
    }

    @Override // p000.ba4
    /* JADX INFO: renamed from: a1 */
    public final boolean mo3504a1() {
        return this.f35290L;
    }

    @Override // p000.ba4, androidx.compose.p002ui.node.InterfaceC0354d
    /* JADX INFO: renamed from: b */
    public final int mo967b(AbstractC0359i abstractC0359i, ct5 ct5Var, int i) {
        return this.f35289K == IntrinsicSize.Min ? ct5Var.mo1512l(i) : ct5Var.mo1513p(i);
    }

    @Override // p000.ba4, androidx.compose.p002ui.node.InterfaceC0354d
    /* JADX INFO: renamed from: i */
    public final int mo969i(AbstractC0359i abstractC0359i, ct5 ct5Var, int i) {
        return this.f35289K == IntrinsicSize.Min ? ct5Var.mo1512l(i) : ct5Var.mo1513p(i);
    }
}
