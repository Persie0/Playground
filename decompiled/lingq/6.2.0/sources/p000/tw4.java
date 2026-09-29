package p000;

import androidx.compose.foundation.text.input.internal.C0187a;
import androidx.compose.foundation.text.selection.C0205f;
import androidx.compose.p002ui.node.AbstractC0362l;
import androidx.compose.runtime.AbstractC0278f;

/* JADX INFO: loaded from: classes.dex */
public final class tw4 extends d16 implements tf1, un3, ea2 {

    /* JADX INFO: renamed from: J */
    public C0187a f63006J;

    /* JADX INFO: renamed from: K */
    public yw4 f63007K;

    /* JADX INFO: renamed from: L */
    public C0205f f63008L;

    /* JADX INFO: renamed from: M */
    public final t66 f63009M = AbstractC0278f.m1260j(null);

    public tw4(C0187a c0187a, yw4 yw4Var, C0205f c0205f) {
        this.f63006J = c0187a;
        this.f63007K = yw4Var;
        this.f63008L = c0205f;
    }

    @Override // p000.un3
    /* JADX INFO: renamed from: J0 */
    public final void mo953J0(AbstractC0362l abstractC0362l) {
        ((xc9) this.f63009M).setValue(abstractC0362l);
    }

    @Override // p000.d16
    /* JADX INFO: renamed from: R0 */
    public final void mo36R0() {
        C0187a c0187a = this.f63006J;
        if (c0187a.f2940a != null) {
            l54.m15816c("Expected textInputModifierNode to be null");
        }
        c0187a.f2940a = this;
    }

    @Override // p000.d16
    /* JADX INFO: renamed from: S0 */
    public final void mo37S0() {
        this.f63006J.m1089k(this);
    }
}
