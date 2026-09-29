package p471x2;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: renamed from: x2.u */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC10066u implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a */
    public final View f51109a;

    /* JADX INFO: renamed from: b */
    public ViewTreeObserver f51110b;

    /* JADX INFO: renamed from: c */
    public final Runnable f51111c;

    public ViewTreeObserverOnPreDrawListenerC10066u(View view, Runnable runnable) {
        this.f51109a = view;
        this.f51110b = view.getViewTreeObserver();
        this.f51111c = runnable;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public static void m18905a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        if (runnable == null) {
            throw new NullPointerException("runnable == null");
        }
        ViewTreeObserverOnPreDrawListenerC10066u viewTreeObserverOnPreDrawListenerC10066u = new ViewTreeObserverOnPreDrawListenerC10066u(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC10066u);
        view.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC10066u);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean zIsAlive = this.f51110b.isAlive();
        View view = this.f51109a;
        if (zIsAlive) {
            this.f51110b.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.f51111c.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f51110b = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean zIsAlive = this.f51110b.isAlive();
        View view2 = this.f51109a;
        if (zIsAlive) {
            this.f51110b.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
