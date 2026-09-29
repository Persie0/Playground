package p000;

import androidx.compose.p002ui.focus.FocusStateImpl;

/* JADX INFO: loaded from: classes.dex */
public final class n93 extends d16 implements p93 {

    /* JADX INFO: renamed from: J */
    public vi3 f52506J;

    /* JADX INFO: renamed from: K */
    public FocusStateImpl f52507K;

    @Override // p000.p93
    /* JADX INFO: renamed from: j0 */
    public final void mo971j0(FocusStateImpl focusStateImpl) {
        if (fa4.m11650l(this.f52507K, focusStateImpl)) {
            return;
        }
        this.f52507K = focusStateImpl;
        this.f52506J.invoke(focusStateImpl);
    }
}
