package p000;

import android.os.Trace;
import android.view.Choreographer;
import android.view.Display;
import android.view.View;
import java.util.PriorityQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: bk */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC0813bk implements fj7, View.OnAttachStateChangeListener, Runnable, Choreographer.FrameCallback {

    /* JADX INFO: renamed from: h */
    public static long f8622h;

    /* JADX INFO: renamed from: a */
    public final View f8623a;

    /* JADX INFO: renamed from: c */
    public boolean f8625c;

    /* JADX INFO: renamed from: f */
    public boolean f8628f;

    /* JADX INFO: renamed from: g */
    public long f8629g;

    /* JADX INFO: renamed from: b */
    public final PriorityQueue f8624b = new PriorityQueue(11, new C3835zj(0));

    /* JADX INFO: renamed from: d */
    public final Choreographer f8626d = Choreographer.getInstance();

    /* JADX INFO: renamed from: e */
    public final C0022ak f8627e = new C0022ak();

    /* JADX WARN: Code duplicated, block: B:10:0x0040  */
    public ViewOnAttachStateChangeListenerC0813bk(View view) {
        float refreshRate;
        this.f8623a = view;
        if (f8622h == 0) {
            Display display = view.getDisplay();
            if (!view.isInEditMode() && display != null) {
                refreshRate = display.getRefreshRate();
                refreshRate = refreshRate < 30.0f ? 60.0f : refreshRate;
            }
            f8622h = (long) (1.0E9f / refreshRate);
        }
        view.addOnAttachStateChangeListener(this);
        if (view.isAttachedToWindow()) {
            this.f8628f = true;
        }
    }

    @Override // p000.fj7
    /* JADX INFO: renamed from: a */
    public final void mo3791a(ej7 ej7Var) {
        this.f8624b.add(new nk7(1, ej7Var));
        if (this.f8625c) {
            return;
        }
        this.f8625c = true;
        this.f8623a.post(this);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m3792b() {
        C0022ak c0022ak = this.f8627e;
        long jM512a = c0022ak.m512a();
        Trace.setCounter("compose:lazy:prefetch:available_time_nanos", jM512a);
        boolean z = true;
        if (jM512a > 0) {
            PriorityQueue priorityQueue = this.f8624b;
            Object objPeek = priorityQueue.peek();
            objPeek.getClass();
            if (!((nk7) objPeek).f52887b.m11177c(c0022ak)) {
                priorityQueue.poll();
                z = false;
            }
            c0022ak.f748a = false;
        }
        return z;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        if (this.f8628f) {
            this.f8629g = j;
            this.f8623a.post(this);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f8628f = true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f8628f = false;
        this.f8623a.removeCallbacks(this);
        this.f8626d.removeFrameCallback(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        PriorityQueue priorityQueue = this.f8624b;
        if (!priorityQueue.isEmpty() && this.f8625c && this.f8628f) {
            View view = this.f8623a;
            if (view.getWindowVisibility() == 0) {
                long nanos = TimeUnit.MILLISECONDS.toNanos(view.getDrawingTime());
                boolean z = System.nanoTime() > (2 * f8622h) + nanos;
                C0022ak c0022ak = this.f8627e;
                c0022ak.f748a = z;
                c0022ak.f749b = Math.max(this.f8629g, nanos) + f8622h;
                boolean zM3792b = false;
                while (!priorityQueue.isEmpty() && !zM3792b) {
                    if (c0022ak.f748a) {
                        Trace.beginSection("compose:lazy:prefetch:idle_frame");
                        try {
                            zM3792b = m3792b();
                            Trace.endSection();
                        } catch (Throwable th) {
                            Trace.endSection();
                            throw th;
                        }
                    } else {
                        zM3792b = m3792b();
                    }
                }
                if (zM3792b) {
                    this.f8626d.postFrameCallback(this);
                } else {
                    this.f8625c = false;
                }
                Trace.setCounter("compose:lazy:prefetch:available_time_nanos", 0L);
                return;
            }
        }
        this.f8625c = false;
    }
}
