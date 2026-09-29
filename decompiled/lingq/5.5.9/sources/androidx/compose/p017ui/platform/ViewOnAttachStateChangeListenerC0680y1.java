package androidx.compose.p017ui.platform;

import android.view.View;
import androidx.compose.runtime.Recomposer;
import dm.C5207g;

/* JADX INFO: renamed from: androidx.compose.ui.platform.y1 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC0680y1 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ View f4390a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Recomposer f4391b;

    public ViewOnAttachStateChangeListenerC0680y1(View view, Recomposer recomposer) {
        this.f4390a = view;
        this.f4391b = recomposer;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        C5207g.m11111f(view, "v");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        C5207g.m11111f(view, "v");
        this.f4390a.removeOnAttachStateChangeListener(this);
        this.f4391b.m1710s();
    }
}
