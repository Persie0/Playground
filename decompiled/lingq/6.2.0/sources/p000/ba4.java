package p000;

import androidx.compose.p002ui.node.AbstractC0359i;
import androidx.compose.p002ui.node.InterfaceC0354d;
import kotlin.collections.AbstractC3194a;

/* JADX INFO: loaded from: classes.dex */
public abstract class ba4 extends d16 implements InterfaceC0354d {

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ int f8219J;

    /* JADX INFO: renamed from: Z0 */
    public abstract long mo3503Z0(ct5 ct5Var, long j);

    /* JADX INFO: renamed from: a1 */
    public abstract boolean mo3504a1();

    @Override // androidx.compose.p002ui.node.InterfaceC0354d
    /* JADX INFO: renamed from: b */
    public int mo967b(AbstractC0359i abstractC0359i, ct5 ct5Var, int i) {
        switch (this.f8219J) {
            case 0:
                break;
        }
        return ct5Var.mo1512l(i);
    }

    @Override // androidx.compose.p002ui.node.InterfaceC0354d
    /* JADX INFO: renamed from: e */
    public int mo968e(AbstractC0359i abstractC0359i, ct5 ct5Var, int i) {
        switch (this.f8219J) {
            case 0:
                break;
        }
        return ct5Var.mo1510U(i);
    }

    /* JADX INFO: renamed from: f */
    public it5 mo575f(jt5 jt5Var, ct5 ct5Var, long j) {
        long jMo3503Z0 = mo3503Z0(ct5Var, j);
        if (mo3504a1()) {
            jMo3503Z0 = dk1.m10427e(j, jMo3503Z0);
        }
        l87 l87VarMo1514r = ct5Var.mo1514r(jMo3503Z0);
        return jt5Var.mo9895M0(l87VarMo1514r.f49301a, l87VarMo1514r.f49302b, AbstractC3194a.m15360M(), new C3773xv(l87VarMo1514r, 7));
    }

    @Override // androidx.compose.p002ui.node.InterfaceC0354d
    /* JADX INFO: renamed from: i */
    public int mo969i(AbstractC0359i abstractC0359i, ct5 ct5Var, int i) {
        switch (this.f8219J) {
            case 0:
                break;
        }
        return ct5Var.mo1513p(i);
    }

    @Override // androidx.compose.p002ui.node.InterfaceC0354d
    /* JADX INFO: renamed from: j */
    public int mo970j(AbstractC0359i abstractC0359i, ct5 ct5Var, int i) {
        switch (this.f8219J) {
            case 0:
                break;
        }
        return ct5Var.mo1511c(i);
    }
}
