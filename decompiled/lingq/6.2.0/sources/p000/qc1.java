package p000;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class qc1 implements ViewTreeObserver.OnDrawListener, Runnable, Executor {

    /* JADX INFO: renamed from: a */
    public final long f57556a = SystemClock.uptimeMillis() + 10000;

    /* JADX INFO: renamed from: b */
    public Runnable f57557b;

    /* JADX INFO: renamed from: c */
    public boolean f57558c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ uc1 f57559d;

    public qc1(uc1 uc1Var) {
        this.f57559d = uc1Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m19858a(View view) {
        if (this.f57558c) {
            return;
        }
        this.f57558c = true;
        view.getViewTreeObserver().addOnDrawListener(this);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        this.f57557b = runnable;
        View decorView = this.f57559d.getWindow().getDecorView();
        decorView.getClass();
        if (!this.f57558c) {
            decorView.postOnAnimation(new RunnableC3781y2(this, 11));
        } else if (fa4.m11650l(Looper.myLooper(), Looper.getMainLooper())) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z;
        Runnable runnable = this.f57557b;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.f57556a) {
                this.f57558c = false;
                this.f57559d.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.f57557b = null;
        ti3 ti3Var = (ti3) this.f57559d.f63703g.getValue();
        synchronized (ti3Var.f62337a) {
            z = ti3Var.f62338b;
        }
        if (z) {
            this.f57558c = false;
            this.f57559d.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f57559d.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
