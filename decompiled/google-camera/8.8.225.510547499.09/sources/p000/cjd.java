package p000;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class cjd implements Executor, kba {

    /* JADX INFO: renamed from: a */
    public final Executor f5918a;

    /* JADX INFO: renamed from: b */
    private final int f5919b;

    /* JADX INFO: renamed from: c */
    private final ScheduledExecutorService f5920c;

    public cjd(String str, int i) {
        jvd jvdVar = new jvd();
        this.f5919b = i;
        this.f5920c = jzn.m13828p(str);
        this.f5918a = jvdVar;
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
        this.f5920c.shutdown();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        try {
            this.f5920c.schedule(new cgl(this, runnable, 8), this.f5919b, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e) {
        }
    }
}
