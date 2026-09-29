package p481xc;

import android.view.ViewTreeObserver;
import com.google.android.material.floatingactionbutton.C3035d;

/* JADX INFO: renamed from: xc.b */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC10167b implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C3035d f51470a;

    public ViewTreeObserverOnPreDrawListenerC10167b(C3035d c3035d) {
        this.f51470a = c3035d;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        C3035d c3035d = this.f51470a;
        float rotation = c3035d.f15285q.getRotation();
        if (c3035d.f15278j != rotation) {
            c3035d.f15278j = rotation;
            c3035d.mo8789m();
        }
        return true;
    }
}
