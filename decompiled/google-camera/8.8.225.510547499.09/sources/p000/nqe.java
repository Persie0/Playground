package p000;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nqe implements Executor {

    /* JADX INFO: renamed from: a */
    public static final Logger f44051a = Logger.getLogger(nqe.class.getName());

    /* JADX INFO: renamed from: e */
    private final Executor f44055e;

    /* JADX INFO: renamed from: b */
    public final Deque f44052b = new ArrayDeque();

    /* JADX INFO: renamed from: d */
    public int f44054d = 1;

    /* JADX INFO: renamed from: c */
    public long f44053c = 0;

    /* JADX INFO: renamed from: f */
    private final nqd f44056f = new nqd(this);

    public nqe(Executor executor) {
        executor.getClass();
        this.f44055e = executor;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x004e  */
    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        synchronized (this.f44052b) {
            int i = this.f44054d;
            if (i != 4 && i != 3) {
                long j = this.f44053c;
                nqc nqcVar = new nqc(runnable);
                this.f44052b.add(nqcVar);
                this.f44054d = 2;
                try {
                    this.f44055e.execute(this.f44056f);
                    if (this.f44054d != 2) {
                        return;
                    }
                    synchronized (this.f44052b) {
                        if (this.f44053c == j && this.f44054d == 2) {
                            this.f44054d = 3;
                        }
                    }
                    return;
                } catch (Error | RuntimeException e) {
                    synchronized (this.f44052b) {
                        int i2 = this.f44054d;
                        boolean z = false;
                        if (i2 == 1 || i2 == 2) {
                            if (this.f44052b.removeLastOccurrence(nqcVar)) {
                                z = true;
                            }
                        }
                        if (!(e instanceof RejectedExecutionException) || z) {
                            throw e;
                        }
                    }
                    return;
                }
            }
            this.f44052b.add(runnable);
        }
    }

    public final String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + String.valueOf(this.f44055e) + "}";
    }
}
