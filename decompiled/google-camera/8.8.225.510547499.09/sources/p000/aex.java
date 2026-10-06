package p000;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class aex implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a */
    private final View f265a;

    /* JADX INFO: renamed from: b */
    private ViewTreeObserver f266b;

    /* JADX INFO: renamed from: c */
    private final Runnable f267c;

    private aex(View view, Runnable runnable) {
        this.f265a = view;
        this.f266b = view.getViewTreeObserver();
        this.f267c = runnable;
    }

    /* JADX INFO: renamed from: b */
    public static void m403b(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        if (runnable == null) {
            throw new NullPointerException("runnable == null");
        }
        aex aexVar = new aex(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(aexVar);
        view.addOnAttachStateChangeListener(aexVar);
    }

    /* JADX INFO: renamed from: a */
    public final void m404a() {
        if (this.f266b.isAlive()) {
            this.f266b.removeOnPreDrawListener(this);
        } else {
            this.f265a.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f265a.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        m404a();
        this.f267c.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f266b = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        m404a();
    }
}
