package p000;

import androidx.wear.ambient.AmbientDelegate;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class npt extends FutureTask implements nps {

    /* JADX INFO: renamed from: a */
    private final nov f44037a;

    public npt(Callable callable) {
        super(callable);
        this.f44037a = new nov();
    }

    /* JADX INFO: renamed from: a */
    public static npt m17615a(Callable callable) {
        return new npt(callable);
    }

    @Override // p000.nps
    /* JADX INFO: renamed from: d */
    public final void mo2282d(Runnable runnable, Executor executor) {
        nov novVar = this.f44037a;
        runnable.getClass();
        executor.getClass();
        synchronized (novVar) {
            if (novVar.f43996a) {
                nov.m17577a(runnable, executor);
            } else {
                novVar.f43997b = new AmbientDelegate(runnable, executor, novVar.f43997b, null);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // java.util.concurrent.FutureTask
    protected final void done() {
        nov novVar = this.f44037a;
        synchronized (novVar) {
            if (novVar.f43996a) {
                return;
            }
            novVar.f43996a = true;
            Object obj = novVar.f43997b;
            Object obj2 = null;
            novVar.f43997b = null;
            while (obj != null) {
                AmbientDelegate ambientDelegate = (AmbientDelegate) obj;
                Object obj3 = ambientDelegate.f1685a;
                ambientDelegate.f1685a = obj2;
                obj2 = obj;
                obj = obj3;
            }
            while (obj2 != null) {
                AmbientDelegate ambientDelegate2 = (AmbientDelegate) obj2;
                nov.m17577a(ambientDelegate2.f1686b, ambientDelegate2.f1687c);
                obj2 = ambientDelegate2.f1685a;
            }
        }
    }

    @Override // java.util.concurrent.FutureTask, java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j);
        return nanos <= 2147483647999999999L ? super.get(j, timeUnit) : super.get(Math.min(nanos, 2147483647999999999L), TimeUnit.NANOSECONDS);
    }
}
