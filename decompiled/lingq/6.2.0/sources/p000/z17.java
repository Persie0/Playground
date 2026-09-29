package p000;

import androidx.compose.p002ui.node.InterfaceC0354d;
import kotlin.collections.AbstractC3194a;

/* JADX INFO: loaded from: classes.dex */
public final class z17 extends d16 implements InterfaceC0354d {

    /* JADX INFO: renamed from: J */
    public t17 f70751J;

    @Override // androidx.compose.p002ui.node.InterfaceC0354d
    /* JADX INFO: renamed from: f */
    public final it5 mo575f(jt5 jt5Var, ct5 ct5Var, long j) {
        float fMo14019b = this.f70751J.mo14019b(jt5Var.getLayoutDirection());
        float fMo14021d = this.f70751J.mo14021d();
        float fMo14020c = this.f70751J.mo14020c(jt5Var.getLayoutDirection());
        float fMo14018a = this.f70751J.mo14018a();
        if (!((xj2.m24559a(fMo14019b, 0.0f) >= 0) & (xj2.m24559a(fMo14021d, 0.0f) >= 0) & (xj2.m24559a(fMo14020c, 0.0f) >= 0) & (xj2.m24559a(fMo14018a, 0.0f) >= 0))) {
            g54.m12362a("Padding must be non-negative");
        }
        int iMo916w0 = jt5Var.mo916w0(fMo14019b);
        int iMo916w1 = jt5Var.mo916w0(fMo14020c) + iMo916w0;
        int iMo916w2 = jt5Var.mo916w0(fMo14021d);
        int iMo916w3 = jt5Var.mo916w0(fMo14018a) + iMo916w2;
        l87 l87VarMo1514r = ct5Var.mo1514r(dk1.m10431i(j, -iMo916w1, -iMo916w3));
        return jt5Var.mo9895M0(dk1.m10429g(l87VarMo1514r.f49301a + iMo916w1, j), dk1.m10428f(l87VarMo1514r.f49302b + iMo916w3, j), AbstractC3194a.m15360M(), new s64(l87VarMo1514r, iMo916w0, iMo916w2, 2));
    }
}
