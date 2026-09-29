package p000;

import android.view.ViewTreeObserver;
import com.google.firebase.perf.metrics.AppStartTrace;

/* JADX INFO: renamed from: ss */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnDrawListenerC3585ss implements ViewTreeObserver.OnDrawListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AppStartTrace f61327a;

    public ViewTreeObserverOnDrawListenerC3585ss(AppStartTrace appStartTrace) {
        this.f61327a = appStartTrace;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        this.f61327a.f13754O++;
    }
}
