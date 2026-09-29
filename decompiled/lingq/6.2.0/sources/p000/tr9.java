package p000;

import android.os.Handler;
import com.kochava.core.task.internal.TaskQueue;
import com.kochava.core.task.internal.TaskState;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes.dex */
public final class tr9 {

    /* JADX INFO: renamed from: c */
    public final Handler f62776c;

    /* JADX INFO: renamed from: d */
    public final Handler f62777d;

    /* JADX INFO: renamed from: e */
    public final ExecutorService f62778e;

    /* JADX INFO: renamed from: f */
    public final TaskQueue f62779f;

    /* JADX INFO: renamed from: g */
    public final ny8 f62780g;

    /* JADX INFO: renamed from: h */
    public final sq5 f62781h;

    /* JADX INFO: renamed from: i */
    public final vr9 f62782i;

    /* JADX INFO: renamed from: j */
    public final ks6 f62783j;

    /* JADX INFO: renamed from: k */
    public final ks6 f62784k;

    /* JADX INFO: renamed from: l */
    public final ks6 f62785l;

    /* JADX INFO: renamed from: a */
    public final Object f62774a = new Object();

    /* JADX INFO: renamed from: b */
    public final Object f62775b = new Object();

    /* JADX INFO: renamed from: m */
    public volatile TaskState f62786m = TaskState.Pending;

    /* JADX INFO: renamed from: n */
    public Future f62787n = null;

    public tr9(Handler handler, Handler handler2, ExecutorService executorService, TaskQueue taskQueue, ny8 ny8Var, sq5 sq5Var, vr9 vr9Var) {
        this.f62776c = handler;
        this.f62777d = handler2;
        this.f62778e = executorService;
        this.f62779f = taskQueue;
        this.f62780g = ny8Var;
        this.f62781h = sq5Var;
        this.f62782i = vr9Var;
        this.f62783j = new ks6(3, ny8Var, new qr9(this, 2));
        this.f62784k = new ks6(3, ny8Var, new qr9(this, 1));
        this.f62785l = new ks6(3, ny8Var, new qr9(this, 0));
    }

    /* JADX INFO: renamed from: a */
    public final void m22276a() {
        int i;
        boolean z;
        boolean z2;
        synchronized (this.f62774a) {
            synchronized (this.f62774a) {
                i = 0;
                z = true;
                z2 = this.f62786m == TaskState.Pending;
            }
            if (!z2) {
                synchronized (this.f62774a) {
                    if (this.f62786m != TaskState.Delayed) {
                        z = false;
                    }
                }
                if (!z && !m22278c() && !m22279d()) {
                    return;
                }
            }
            m22277b();
            this.f62786m = TaskState.Completed;
            Handler handler = this.f62776c;
            ny8 ny8Var = this.f62780g;
            pr9 pr9Var = new pr9(this, i);
            ny8Var.getClass();
            handler.post(new ks6(3, ny8Var, pr9Var));
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m22277b() {
        synchronized (this.f62774a) {
            try {
                this.f62786m = TaskState.Pending;
                sq5 sq5Var = this.f62781h;
                synchronized (sq5Var) {
                    sq5Var.f61250d = null;
                }
                this.f62776c.removeCallbacks(this.f62784k);
                this.f62776c.removeCallbacks(this.f62785l);
                this.f62776c.removeCallbacks(this.f62783j);
                this.f62777d.removeCallbacks(this.f62783j);
                Future future = this.f62787n;
                if (future != null) {
                    future.cancel(false);
                    this.f62787n = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m22278c() {
        boolean z;
        synchronized (this.f62774a) {
            z = this.f62786m == TaskState.Queued;
        }
        return z;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m22279d() {
        boolean z;
        synchronized (this.f62774a) {
            z = this.f62786m == TaskState.Started;
        }
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0028  */
    /* JADX WARN: Code duplicated, block: B:30:0x0032 A[Catch: all -> 0x004c, TryCatch #2 {all -> 0x004c, blocks: (B:4:0x0003, B:5:0x0005, B:12:0x0014, B:13:0x0016, B:34:0x0059, B:22:0x0024, B:23:0x0025, B:24:0x0027, B:27:0x002b, B:30:0x0032, B:33:0x004e, B:38:0x005d, B:41:0x0060, B:14:0x0017, B:17:0x001e, B:26:0x0029, B:6:0x0006, B:10:0x0011), top: B:48:0x0003, inners: #0, #1, #3 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x004e A[Catch: all -> 0x004c, TryCatch #2 {all -> 0x004c, blocks: (B:4:0x0003, B:5:0x0005, B:12:0x0014, B:13:0x0016, B:34:0x0059, B:22:0x0024, B:23:0x0025, B:24:0x0027, B:27:0x002b, B:30:0x0032, B:33:0x004e, B:38:0x005d, B:41:0x0060, B:14:0x0017, B:17:0x001e, B:26:0x0029, B:6:0x0006, B:10:0x0011), top: B:48:0x0003, inners: #0, #1, #3 }] */
    /* JADX INFO: renamed from: e */
    public final void m22280e(long j) {
        int i;
        boolean z;
        sq5 sq5Var;
        boolean z2;
        synchronized (this.f62774a) {
            try {
                synchronized (this.f62774a) {
                    i = 1;
                    z = this.f62786m == TaskState.Pending;
                }
                if (z) {
                    sq5Var = this.f62781h;
                    synchronized (sq5Var) {
                        sq5Var.f61250d = null;
                        if (j <= 0) {
                            this.f62786m = TaskState.Queued;
                            Handler handler = this.f62776c;
                            ny8 ny8Var = this.f62780g;
                            pr9 pr9Var = new pr9(this, i);
                            ny8Var.getClass();
                            handler.post(new ks6(3, ny8Var, pr9Var));
                        } else {
                            this.f62786m = TaskState.Delayed;
                            this.f62776c.postDelayed(this.f62784k, j);
                        }
                    }
                } else {
                    synchronized (this.f62774a) {
                        z2 = this.f62786m == TaskState.Completed;
                    }
                    if (z2) {
                        sq5Var = this.f62781h;
                        synchronized (sq5Var) {
                            sq5Var.f61250d = null;
                        }
                        if (j <= 0) {
                            this.f62786m = TaskState.Queued;
                            Handler handler2 = this.f62776c;
                            ny8 ny8Var2 = this.f62780g;
                            pr9 pr9Var2 = new pr9(this, i);
                            ny8Var2.getClass();
                            handler2.post(new ks6(3, ny8Var2, pr9Var2));
                        } else {
                            this.f62786m = TaskState.Delayed;
                            this.f62776c.postDelayed(this.f62784k, j);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
