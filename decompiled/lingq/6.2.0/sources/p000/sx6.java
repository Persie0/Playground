package p000;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes.dex */
public final class sx6 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a */
    public final View f61549a;

    /* JADX INFO: renamed from: b */
    public ViewTreeObserver f61550b;

    /* JADX INFO: renamed from: c */
    public final Runnable f61551c;

    public sx6(View view, Runnable runnable) {
        this.f61549a = view;
        this.f61550b = view.getViewTreeObserver();
        this.f61551c = runnable;
    }

    /* JADX INFO: renamed from: a */
    public static void m21765a(View view, Runnable runnable) {
        if (view == null) {
            C3386nv.m17635v("view == null");
            return;
        }
        sx6 sx6Var = new sx6(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(sx6Var);
        view.addOnAttachStateChangeListener(sx6Var);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean zIsAlive = this.f61550b.isAlive();
        View view = this.f61549a;
        if (zIsAlive) {
            this.f61550b.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.f61551c.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f61550b = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean zIsAlive = this.f61550b.isAlive();
        View view2 = this.f61549a;
        if (zIsAlive) {
            this.f61550b.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
