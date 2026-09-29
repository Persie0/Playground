package p000;

import androidx.compose.p002ui.layout.InterfaceC0338e;
import kotlin.collections.AbstractC3194a;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;

/* JADX INFO: loaded from: classes.dex */
public final class ek1 implements i99, InterfaceC0338e {

    /* JADX INFO: renamed from: a */
    public final C3244l f37378a = AbstractC3352my.m17114d(new bk1(kna.f47563a));

    @Override // androidx.compose.p002ui.layout.InterfaceC0338e
    /* JADX INFO: renamed from: f */
    public final it5 mo1491f(jt5 jt5Var, ct5 ct5Var, long j) {
        bk1 bk1Var = new bk1(j);
        C3244l c3244l = this.f37378a;
        c3244l.getClass();
        c3244l.m15572j(null, bk1Var);
        l87 l87VarMo1514r = ct5Var.mo1514r(j);
        return jt5Var.mo9895M0(l87VarMo1514r.f49301a, l87VarMo1514r.f49302b, AbstractC3194a.m15360M(), new C3773xv(l87VarMo1514r, 1));
    }

    @Override // p000.i99
    /* JADX INFO: renamed from: h */
    public final Object mo11204h(Continuation continuation) {
        return AbstractC3224d.m15541t(new C3540rl(this.f37378a, 1), continuation);
    }
}
