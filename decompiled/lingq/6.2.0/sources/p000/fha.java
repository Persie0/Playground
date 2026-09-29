package p000;

import androidx.compose.p002ui.node.AbstractC0359i;
import androidx.compose.p002ui.node.InterfaceC0354d;
import kotlin.collections.AbstractC3194a;

/* JADX INFO: loaded from: classes.dex */
public final class fha extends d16 implements InterfaceC0354d {

    /* JADX INFO: renamed from: J */
    public float f39112J;

    /* JADX INFO: renamed from: K */
    public float f39113K;

    @Override // androidx.compose.p002ui.node.InterfaceC0354d
    /* JADX INFO: renamed from: b */
    public final int mo967b(AbstractC0359i abstractC0359i, ct5 ct5Var, int i) {
        int iMo1512l = ct5Var.mo1512l(i);
        int iMo916w0 = !Float.isNaN(this.f39112J) ? abstractC0359i.mo916w0(this.f39112J) : 0;
        return iMo1512l < iMo916w0 ? iMo916w0 : iMo1512l;
    }

    @Override // androidx.compose.p002ui.node.InterfaceC0354d
    /* JADX INFO: renamed from: e */
    public final int mo968e(AbstractC0359i abstractC0359i, ct5 ct5Var, int i) {
        int iMo1510U = ct5Var.mo1510U(i);
        int iMo916w0 = !Float.isNaN(this.f39113K) ? abstractC0359i.mo916w0(this.f39113K) : 0;
        return iMo1510U < iMo916w0 ? iMo916w0 : iMo1510U;
    }

    @Override // androidx.compose.p002ui.node.InterfaceC0354d
    /* JADX INFO: renamed from: f */
    public final it5 mo575f(jt5 jt5Var, ct5 ct5Var, long j) {
        int iM3803k;
        int iM3802j;
        if (Float.isNaN(this.f39112J) || bk1.m3803k(j) != 0) {
            iM3803k = bk1.m3803k(j);
        } else {
            int iMo916w0 = jt5Var.mo916w0(this.f39112J);
            iM3803k = bk1.m3801i(j);
            if (iMo916w0 < 0) {
                iMo916w0 = 0;
            }
            if (iMo916w0 <= iM3803k) {
                iM3803k = iMo916w0;
            }
        }
        int iM3801i = bk1.m3801i(j);
        if (Float.isNaN(this.f39113K) || bk1.m3802j(j) != 0) {
            iM3802j = bk1.m3802j(j);
        } else {
            int iMo916w1 = jt5Var.mo916w0(this.f39113K);
            iM3802j = bk1.m3800h(j);
            int i = iMo916w1 >= 0 ? iMo916w1 : 0;
            if (i <= iM3802j) {
                iM3802j = i;
            }
        }
        l87 l87VarMo1514r = ct5Var.mo1514r(dk1.m10423a(iM3803k, iM3801i, iM3802j, bk1.m3800h(j)));
        return jt5Var.mo9895M0(l87VarMo1514r.f49301a, l87VarMo1514r.f49302b, AbstractC3194a.m15360M(), new C3773xv(l87VarMo1514r, 15));
    }

    @Override // androidx.compose.p002ui.node.InterfaceC0354d
    /* JADX INFO: renamed from: i */
    public final int mo969i(AbstractC0359i abstractC0359i, ct5 ct5Var, int i) {
        int iMo1513p = ct5Var.mo1513p(i);
        int iMo916w0 = !Float.isNaN(this.f39112J) ? abstractC0359i.mo916w0(this.f39112J) : 0;
        return iMo1513p < iMo916w0 ? iMo916w0 : iMo1513p;
    }

    @Override // androidx.compose.p002ui.node.InterfaceC0354d
    /* JADX INFO: renamed from: j */
    public final int mo970j(AbstractC0359i abstractC0359i, ct5 ct5Var, int i) {
        int iMo1511c = ct5Var.mo1511c(i);
        int iMo916w0 = !Float.isNaN(this.f39113K) ? abstractC0359i.mo916w0(this.f39113K) : 0;
        return iMo1511c < iMo916w0 ? iMo916w0 : iMo1511c;
    }
}
