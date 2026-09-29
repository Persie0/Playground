package p000;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class zh7 implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: a */
    public final Handler f71580a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: b */
    public final AtomicReference f71581b;

    /* JADX INFO: renamed from: c */
    public final RunnableC3547rs f71582c;

    /* JADX INFO: renamed from: d */
    public final RunnableC3547rs f71583d;

    public zh7(View view, RunnableC3547rs runnableC3547rs, RunnableC3547rs runnableC3547rs2) {
        this.f71581b = new AtomicReference(view);
        this.f71582c = runnableC3547rs;
        this.f71583d = runnableC3547rs2;
    }

    /* JADX INFO: renamed from: a */
    public static void m25657a(View view, RunnableC3547rs runnableC3547rs, RunnableC3547rs runnableC3547rs2) {
        view.getViewTreeObserver().addOnPreDrawListener(new zh7(view, runnableC3547rs, runnableC3547rs2));
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        View view = (View) this.f71581b.getAndSet(null);
        if (view == null) {
            return true;
        }
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        RunnableC3547rs runnableC3547rs = this.f71582c;
        Handler handler = this.f71580a;
        handler.post(runnableC3547rs);
        handler.postAtFrontOfQueue(this.f71583d);
        return true;
    }
}
