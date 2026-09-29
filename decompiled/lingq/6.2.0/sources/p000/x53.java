package p000;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class x53 implements ViewTreeObserver.OnDrawListener {

    /* JADX INFO: renamed from: a */
    public final Handler f67771a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: b */
    public final AtomicReference f67772b;

    /* JADX INFO: renamed from: c */
    public final RunnableC3547rs f67773c;

    public x53(View view, RunnableC3547rs runnableC3547rs) {
        this.f67772b = new AtomicReference(view);
        this.f67773c = runnableC3547rs;
    }

    /* JADX INFO: renamed from: a */
    public static void m24286a(View view, RunnableC3547rs runnableC3547rs) {
        view.getViewTreeObserver().addOnDrawListener(new x53(view, runnableC3547rs));
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        final View view = (View) this.f67772b.getAndSet(null);
        if (view == null) {
            return;
        }
        view.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: w53
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                view.getViewTreeObserver().removeOnDrawListener(this.f66404a);
            }
        });
        this.f67771a.postAtFrontOfQueue(this.f67773c);
    }
}
