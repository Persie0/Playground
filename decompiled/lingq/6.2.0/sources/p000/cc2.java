package p000;

import androidx.compose.p002ui.node.InterfaceC0354d;
import kotlin.collections.AbstractC3194a;

/* JADX INFO: loaded from: classes.dex */
public final class cc2 extends o64 implements InterfaceC0354d {

    /* JADX INFO: renamed from: L */
    public e5b f9877L;

    /* JADX INFO: renamed from: M */
    public uk9 f9878M;

    /* JADX INFO: renamed from: N */
    public e5b f9879N;

    @Override // p000.o64
    /* JADX INFO: renamed from: Z0 */
    public final e5b mo4501Z0(e5b e5bVar) {
        return e5bVar;
    }

    @Override // p000.o64
    /* JADX INFO: renamed from: a1 */
    public final void mo4502a1() {
        this.f9879N = new tu2(this.f9877L, this.f53891J);
        super.mo4502a1();
        d32.m10020R(this);
    }

    @Override // androidx.compose.p002ui.node.InterfaceC0354d
    /* JADX INFO: renamed from: f */
    public final it5 mo575f(jt5 jt5Var, ct5 ct5Var, long j) {
        uk9 uk9Var = this.f9878M;
        e5b e5bVar = this.f9879N;
        uk9Var.getClass();
        int iMo4001c = e5bVar.mo4001c(jt5Var);
        if (iMo4001c == 0) {
            return jt5Var.mo9895M0(0, 0, AbstractC3194a.m15360M(), new C2951e4(29));
        }
        l87 l87VarMo1514r = ct5Var.mo1514r(bk1.m3794b(0, 0, iMo4001c, iMo4001c, 3, j));
        return jt5Var.mo9895M0(l87VarMo1514r.f49301a, iMo4001c, AbstractC3194a.m15360M(), new C3773xv(l87VarMo1514r, 3));
    }
}
