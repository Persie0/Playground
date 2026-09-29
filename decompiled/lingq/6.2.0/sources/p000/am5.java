package p000;

import android.util.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class am5 extends FutureTask {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f827a = 0;

    /* JADX INFO: renamed from: b */
    public Object f828b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public am5(RunnableC3700vw runnableC3700vw, z06 z06Var) {
        super(z06Var);
        this.f828b = runnableC3700vw;
    }

    @Override // java.util.concurrent.FutureTask
    public final void done() {
        switch (this.f827a) {
            case 0:
                try {
                    if (!isCancelled()) {
                        try {
                            ((bm5) this.f828b).m3876d((zl5) get());
                        } catch (InterruptedException | ExecutionException e) {
                            ((bm5) this.f828b).m3876d(new zl5(e));
                        }
                        break;
                    }
                    this.f828b = null;
                    return;
                } catch (Throwable th) {
                    this.f828b = null;
                    throw th;
                }
            default:
                RunnableC3700vw runnableC3700vw = (RunnableC3700vw) this.f828b;
                AtomicBoolean atomicBoolean = runnableC3700vw.f66000d;
                try {
                    Object obj = get();
                    if (atomicBoolean.get()) {
                        return;
                    }
                    runnableC3700vw.m23561a(obj);
                    return;
                } catch (InterruptedException e2) {
                    Log.w("AsyncTask", e2);
                    return;
                } catch (CancellationException unused) {
                    if (atomicBoolean.get()) {
                        return;
                    }
                    runnableC3700vw.m23561a(null);
                    return;
                } catch (ExecutionException e3) {
                    ij6.m13958p("An error occurred while executing doInBackground()", e3.getCause());
                    return;
                } catch (Throwable th2) {
                    ij6.m13958p("An error occurred while executing doInBackground()", th2);
                    return;
                }
        }
    }

    public /* synthetic */ am5(Callable callable) {
        super(callable);
    }
}
