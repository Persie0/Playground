package p000;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;

/* JADX INFO: renamed from: jf */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class C0739jf implements PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f33856a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C0740jg f33857b;

    public C0739jf(C0740jg c0740jg, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        this.f33857b = c0740jg;
        this.f33856a = onGlobalLayoutListener;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.f33857b.f33936d.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f33856a);
        }
    }
}
