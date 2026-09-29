package p000;

import androidx.compose.p002ui.node.InterfaceC0354d;
import kotlin.collections.AbstractC3194a;

/* JADX INFO: loaded from: classes.dex */
public class t64 extends o64 implements InterfaceC0354d {

    /* JADX INFO: renamed from: L */
    public e5b f61912L;

    public t64(e5b e5bVar) {
        this.f61912L = e5bVar;
    }

    @Override // p000.o64
    /* JADX INFO: renamed from: Z0 */
    public final e5b mo4501Z0(e5b e5bVar) {
        return new ufa(e5bVar, this.f61912L);
    }

    @Override // p000.o64
    /* JADX INFO: renamed from: a1 */
    public final void mo4502a1() {
        super.mo4502a1();
        d32.m10020R(this);
    }

    @Override // androidx.compose.p002ui.node.InterfaceC0354d
    /* JADX INFO: renamed from: f */
    public final it5 mo575f(jt5 jt5Var, ct5 ct5Var, long j) {
        int iMo4000b = this.f53892K.mo4000b(jt5Var, jt5Var.getLayoutDirection()) - this.f53891J.mo4000b(jt5Var, jt5Var.getLayoutDirection());
        int iMo3999a = this.f53892K.mo3999a(jt5Var) - this.f53891J.mo3999a(jt5Var);
        int iMo4002d = (this.f53892K.mo4002d(jt5Var, jt5Var.getLayoutDirection()) - this.f53891J.mo4002d(jt5Var, jt5Var.getLayoutDirection())) + iMo4000b;
        int iMo4001c = (this.f53892K.mo4001c(jt5Var) - this.f53891J.mo4001c(jt5Var)) + iMo3999a;
        l87 l87VarMo1514r = ct5Var.mo1514r(dk1.m10431i(j, -iMo4002d, -iMo4001c));
        return jt5Var.mo9895M0(dk1.m10429g(l87VarMo1514r.f49301a + iMo4002d, j), dk1.m10428f(l87VarMo1514r.f49302b + iMo4001c, j), AbstractC3194a.m15360M(), new s64(l87VarMo1514r, iMo4000b, iMo3999a, 0));
    }
}
