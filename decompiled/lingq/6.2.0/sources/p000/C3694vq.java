package p000;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;

/* JADX INFO: renamed from: vq */
/* JADX INFO: loaded from: classes2.dex */
public final class C3694vq implements PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC3507qq f65775a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C3731wq f65776b;

    public C3694vq(C3731wq c3731wq, ViewTreeObserverOnGlobalLayoutListenerC3507qq viewTreeObserverOnGlobalLayoutListenerC3507qq) {
        this.f65776b = c3731wq;
        this.f65775a = viewTreeObserverOnGlobalLayoutListenerC3507qq;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.f65776b.f67167Z.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f65775a);
        }
    }
}
