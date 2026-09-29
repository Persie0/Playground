package p000;

import androidx.compose.foundation.gestures.C0097e;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.p002ui.node.InterfaceC0354d;
import kotlin.Pair;
import kotlin.collections.AbstractC3194a;

/* JADX INFO: loaded from: classes2.dex */
public final class dl2 extends d16 implements InterfaceC0354d {

    /* JADX INFO: renamed from: J */
    public C0097e f35777J;

    /* JADX INFO: renamed from: K */
    public zi3 f35778K;

    /* JADX INFO: renamed from: L */
    public Orientation f35779L;

    /* JADX INFO: renamed from: M */
    public boolean f35780M;

    @Override // p000.d16
    /* JADX INFO: renamed from: S0 */
    public final void mo37S0() {
        this.f35780M = false;
    }

    @Override // androidx.compose.p002ui.node.InterfaceC0354d
    /* JADX INFO: renamed from: f */
    public final it5 mo575f(jt5 jt5Var, ct5 ct5Var, long j) {
        Object objM22592J0;
        l87 l87VarMo1514r = ct5Var.mo1514r(j);
        boolean z = true;
        if (!jt5Var.mo211f0() || !this.f35780M) {
            Pair pair = (Pair) this.f35778K.invoke(new n84((((long) l87VarMo1514r.f49301a) << 32) | (((long) l87VarMo1514r.f49302b) & 4294967295L)), new bk1(j));
            a62 a62Var = (a62) pair.f47623a;
            Object obj = pair.f47624b;
            if (!a62Var.m130c(obj) && (objM22592J0 = u91.m22592J0(0, a62Var.f277a)) != null) {
                obj = objM22592J0;
            }
            this.f35777J.m854h(a62Var, obj);
            this.f35780M = true;
        }
        if (!jt5Var.mo211f0() && !this.f35780M) {
            z = false;
        }
        this.f35780M = z;
        return jt5Var.mo9895M0(l87VarMo1514r.f49301a, l87VarMo1514r.f49302b, AbstractC3194a.m15360M(), new C3485q5(jt5Var, this, l87VarMo1514r, 13));
    }
}
