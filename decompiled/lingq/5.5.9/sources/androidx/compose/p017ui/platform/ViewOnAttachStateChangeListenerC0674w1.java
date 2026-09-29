package androidx.compose.p017ui.platform;

import android.view.View;
import dm.C5207g;
import no.C7848l1;
import no.InterfaceC7875v0;

/* JADX INFO: renamed from: androidx.compose.ui.platform.w1 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC0674w1 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC7875v0 f4378a;

    public ViewOnAttachStateChangeListenerC0674w1(C7848l1 c7848l1) {
        this.f4378a = c7848l1;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        C5207g.m11111f(view, "v");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        C5207g.m11111f(view, "v");
        view.removeOnAttachStateChangeListener(this);
        this.f4378a.mo15618a(null);
    }
}
