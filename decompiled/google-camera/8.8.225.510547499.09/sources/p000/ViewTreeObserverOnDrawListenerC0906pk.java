package p000;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: pk */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ViewTreeObserverOnDrawListenerC0906pk implements ViewTreeObserver.OnDrawListener, Runnable, Executor {

    /* JADX INFO: renamed from: b */
    public Runnable f47417b;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ ActivityC0907pl f47419d;

    /* JADX INFO: renamed from: a */
    final long f47416a = SystemClock.uptimeMillis() + 10000;

    /* JADX INFO: renamed from: c */
    boolean f47418c = false;

    public ViewTreeObserverOnDrawListenerC0906pk(ActivityC0907pl activityC0907pl) {
        this.f47419d = activityC0907pl;
    }

    /* JADX INFO: renamed from: a */
    public final void m19314a(View view) {
        if (this.f47418c) {
            return;
        }
        this.f47418c = true;
        view.getViewTreeObserver().addOnDrawListener(this);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f47417b = runnable;
        View decorView = this.f47419d.getWindow().getDecorView();
        if (!this.f47418c) {
            decorView.postOnAnimation(new RunnableC0852nk(this, 7));
        } else if (Looper.myLooper() == Looper.getMainLooper()) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z;
        Runnable runnable = this.f47417b;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.f47416a) {
                this.f47418c = false;
                this.f47419d.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.f47417b = null;
        bzm bzmVar = this.f47419d.f47434o;
        synchronized (bzmVar.f4820b) {
            z = bzmVar.f4819a;
        }
        if (z) {
            this.f47418c = false;
            this.f47419d.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f47419d.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
