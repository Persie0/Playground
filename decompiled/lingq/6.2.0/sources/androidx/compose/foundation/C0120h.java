package androidx.compose.foundation;

import androidx.compose.p002ui.graphics.drawscope.InterfaceC0310a;
import androidx.compose.p002ui.node.C0358h;
import p000.aa1;
import p000.an0;
import p000.d16;
import p000.ll2;
import p000.v56;
import p000.wfb;

/* JADX INFO: renamed from: androidx.compose.foundation.h */
/* JADX INFO: loaded from: classes.dex */
public final class C0120h extends d16 implements ll2 {

    /* JADX INFO: renamed from: J */
    public final v56 f2382J;

    /* JADX INFO: renamed from: K */
    public boolean f2383K;

    /* JADX INFO: renamed from: L */
    public boolean f2384L;

    /* JADX INFO: renamed from: M */
    public boolean f2385M;

    public C0120h(v56 v56Var) {
        this.f2382J = v56Var;
    }

    @Override // p000.d16
    /* JADX INFO: renamed from: R0 */
    public final void mo36R0() {
        wfb.m23926u(m9971N0(), null, null, new DefaultDebugIndication$DefaultDebugIndicationInstance$onAttach$1(this, null), 3);
    }

    @Override // p000.ll2
    /* JADX INFO: renamed from: i0 */
    public final void mo952i0(C0358h c0358h) {
        c0358h.m1614b();
        an0 an0Var = c0358h.f4358a;
        if (this.f2383K) {
            InterfaceC0310a.m1414L0(c0358h, aa1.m198b(0.3f, aa1.f403b), 0L, an0Var.mo1422h(), 0.0f, null, 0, 122);
        } else if (this.f2384L || this.f2385M) {
            InterfaceC0310a.m1414L0(c0358h, aa1.m198b(0.1f, aa1.f403b), 0L, an0Var.mo1422h(), 0.0f, null, 0, 122);
        }
    }
}
