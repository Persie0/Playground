package p351r0;

import androidx.compose.p017ui.InterfaceC0500b;
import androidx.compose.p017ui.focus.FocusStateImpl;
import cm.InterfaceC2052l;
import dm.C5207g;
import sl.C9072e;

/* JADX INFO: renamed from: r0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C8683b extends InterfaceC0500b.c implements InterfaceC8686e {

    /* JADX INFO: renamed from: k */
    public InterfaceC2052l<? super InterfaceC8697p, C9072e> f46275k;

    /* JADX INFO: renamed from: l */
    public InterfaceC8697p f46276l;

    public C8683b(InterfaceC2052l<? super InterfaceC8697p, C9072e> interfaceC2052l) {
        C5207g.m11111f(interfaceC2052l, "onFocusChanged");
        this.f46275k = interfaceC2052l;
    }

    @Override // p351r0.InterfaceC8686e
    /* JADX INFO: renamed from: w */
    public final void mo2095w(FocusStateImpl focusStateImpl) {
        C5207g.m11111f(focusStateImpl, "focusState");
        if (!C5207g.m11106a(this.f46276l, focusStateImpl)) {
            this.f46276l = focusStateImpl;
            this.f46275k.mo528n(focusStateImpl);
        }
    }
}
