package p000;

import androidx.compose.foundation.text.handwriting.C0181a;
import androidx.compose.p002ui.focus.FocusStateImpl;
import androidx.compose.p002ui.input.pointer.C0333g;
import androidx.compose.p002ui.input.pointer.PointerEventPass;

/* JADX INFO: loaded from: classes.dex */
public final class im9 extends fa2 implements ng7, p93, ba3 {

    /* JADX INFO: renamed from: L */
    public ui3 f44294L;

    /* JADX INFO: renamed from: M */
    public boolean f44295M;

    /* JADX INFO: renamed from: N */
    public final C0333g f44296N;

    public im9(ui3 ui3Var) {
        this.f44294L = ui3Var;
        C0181a c0181a = new C0181a(this);
        fg7 fg7Var = mo9.f51649a;
        C0333g c0333g = new C0333g(null, null, null, c0181a);
        m11624Z0(c0333g);
        this.f44296N = c0333g;
    }

    @Override // p000.ng7
    /* JADX INFO: renamed from: D */
    public final void mo786D(fg7 fg7Var, PointerEventPass pointerEventPass, long j) {
        this.f44296N.mo786D(fg7Var, pointerEventPass, j);
    }

    @Override // p000.ng7
    /* JADX INFO: renamed from: K */
    public final void mo818K() {
        this.f44296N.mo818K();
    }

    @Override // p000.p93
    /* JADX INFO: renamed from: j0 */
    public final void mo971j0(FocusStateImpl focusStateImpl) {
        this.f44295M = focusStateImpl.isFocused();
    }

    @Override // p000.ng7
    /* JADX INFO: renamed from: s */
    public final long mo1462s() {
        ck2 ck2Var = l70.f49236g;
        fb2 fb2Var = te1.m21979L(this).f4327T;
        ck2Var.getClass();
        int i = x7a.f67906b;
        return ho5.m13404z(fb2Var.mo916w0(10.0f), fb2Var.mo916w0(40.0f), fb2Var.mo916w0(10.0f), fb2Var.mo916w0(40.0f));
    }
}
