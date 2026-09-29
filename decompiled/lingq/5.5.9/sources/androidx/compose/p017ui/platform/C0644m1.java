package androidx.compose.p017ui.platform;

import androidx.view.InterfaceC1049o;
import androidx.view.InterfaceC1051q;
import androidx.view.Lifecycle;
import cm.InterfaceC2041a;
import sl.C9072e;

/* JADX INFO: renamed from: androidx.compose.ui.platform.m1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0644m1 {
    /* JADX INFO: renamed from: a */
    public static final InterfaceC2041a m2424a(final AbstractComposeView abstractComposeView, final Lifecycle lifecycle) {
        if (lifecycle.mo3884b().compareTo(Lifecycle.State.DESTROYED) > 0) {
            final InterfaceC1049o interfaceC1049o = new InterfaceC1049o() { // from class: androidx.compose.ui.platform.ViewCompositionStrategy_androidKt$installForLifecycle$observer$1
                @Override // androidx.view.InterfaceC1049o
                /* JADX INFO: renamed from: e */
                public final void mo800e(InterfaceC1051q interfaceC1051q, Lifecycle.Event event) {
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        abstractComposeView.m2242c();
                    }
                }
            };
            lifecycle.mo3883a(interfaceC1049o);
            return new InterfaceC2041a<C9072e>() { // from class: androidx.compose.ui.platform.ViewCompositionStrategy_androidKt$installForLifecycle$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // cm.InterfaceC2041a
                /* JADX INFO: renamed from: E */
                public final C9072e mo807E() {
                    lifecycle.mo3885c(interfaceC1049o);
                    return C9072e.f47360a;
                }
            };
        }
        throw new IllegalStateException(("Cannot configure " + abstractComposeView + " to disposeComposition at Lifecycle ON_DESTROY: " + lifecycle + "is already destroyed").toString());
    }
}
