package p000;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lau implements nps {

    /* JADX INFO: renamed from: a */
    private final /* synthetic */ int f37854a;

    /* JADX INFO: renamed from: b */
    private final Object f37855b;

    public lau(lav lavVar, int i) {
        this.f37854a = i;
        this.f37855b = lavVar;
    }

    private lau(nps npsVar, int i) {
        this.f37854a = i;
        this.f37855b = npsVar;
    }

    /* JADX INFO: renamed from: a */
    public static nps m15120a(nps npsVar) {
        return new lau(npsVar, 1);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        switch (this.f37854a) {
            case 0:
                return false;
            default:
                throw new UnsupportedOperationException("Cancellation of future is invalid.");
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, nps] */
    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        switch (this.f37854a) {
            case 0:
                return false;
            default:
                return this.f37855b.isCancelled();
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, nps] */
    @Override // java.util.concurrent.Future
    public final Object get() throws ExecutionException {
        switch (this.f37854a) {
            case 0:
                try {
                    return ((lav) this.f37855b).mo15107f();
                } catch (kzy e) {
                    throw new ExecutionException(e);
                }
            default:
                return this.f37855b.get();
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, nps] */
    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        switch (this.f37854a) {
            case 0:
                return ((lav) this.f37855b).mo15108g();
            default:
                return this.f37855b.isDone();
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, nps] */
    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        Object obj;
        switch (this.f37854a) {
            case 0:
                synchronized (this.f37855b) {
                    if (!isDone()) {
                        timeUnit.timedWait(this.f37855b, j);
                        if (!isDone()) {
                            throw new TimeoutException();
                        }
                    }
                    obj = ((lav) this.f37855b).f37856a;
                    if (obj == null) {
                        throw new ExecutionException(((lav) this.f37855b).f37857b);
                    }
                }
                return obj;
            default:
                return this.f37855b.get(j, timeUnit);
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, nps] */
    @Override // p000.nps
    /* JADX INFO: renamed from: d */
    public final void mo2282d(Runnable runnable, Executor executor) {
        switch (this.f37854a) {
            case 0:
                if (((lav) this.f37855b).mo15108g()) {
                    executor.execute(runnable);
                    return;
                }
                synchronized (this.f37855b) {
                    if (((lav) this.f37855b).mo15108g()) {
                        executor.execute(runnable);
                        return;
                    } else {
                        ((lav) this.f37855b).m15132n(executor, runnable);
                        return;
                    }
                }
            default:
                this.f37855b.mo2282d(runnable, executor);
                return;
        }
    }
}
