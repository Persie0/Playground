package p000;

import com.kochava.core.task.action.internal.TaskFailedException;
import com.kochava.core.task.internal.TaskState;

/* JADX INFO: loaded from: classes.dex */
public final class qr9 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f58114a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ tr9 f58115b;

    public /* synthetic */ qr9(tr9 tr9Var, int i) {
        this.f58114a = i;
        this.f58115b = tr9Var;
    }

    /* JADX INFO: renamed from: a */
    private final void m20126a() {
        boolean z;
        synchronized (this.f58115b.f62774a) {
            try {
                tr9 tr9Var = this.f58115b;
                synchronized (tr9Var.f62774a) {
                    z = tr9Var.f62786m == TaskState.Delayed;
                }
                if (z) {
                    this.f58115b.f62786m = TaskState.Queued;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        tr9 tr9Var2 = this.f58115b;
        tr9Var2.f62780g.m17681H(tr9Var2);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        switch (this.f58114a) {
            case 0:
                synchronized (this.f58115b.f62774a) {
                    try {
                        if (this.f58115b.m22279d()) {
                            tr9 tr9Var = this.f58115b;
                            TaskState taskState = TaskState.Completed;
                            tr9Var.f62786m = taskState;
                            tr9 tr9Var2 = this.f58115b;
                            synchronized (tr9Var2.f62774a) {
                                try {
                                    synchronized (tr9Var2.f62774a) {
                                        z = tr9Var2.f62786m == taskState;
                                        break;
                                    }
                                    if (z) {
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                            vr9 vr9Var = this.f58115b.f62782i;
                            if (vr9Var != null) {
                                vr9Var.mo2997a();
                            }
                            tr9 tr9Var3 = this.f58115b;
                            tr9Var3.f62780g.m17680G(tr9Var3);
                            return;
                        }
                        return;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            case 1:
                m20126a();
                return;
            default:
                if (!this.f58115b.m22279d()) {
                    return;
                }
                try {
                    synchronized (this.f58115b.f62775b) {
                        try {
                            this.f58115b.f62781h.m21563d();
                            if (this.f58115b.m22279d()) {
                                tr9 tr9Var4 = this.f58115b;
                                tr9Var4.f62776c.post(tr9Var4.f62785l);
                                return;
                            }
                            return;
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                } catch (TaskFailedException unused) {
                } catch (Throwable th4) {
                    this.f58115b.f62780g.m17682I(Thread.currentThread(), th4);
                }
                break;
        }
    }
}
