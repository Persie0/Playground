package com.google.firebase.concurrent;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;
import p176ib.C6272i;

/* JADX INFO: loaded from: classes.dex */
public final class SequentialExecutor implements Executor {

    /* JADX INFO: renamed from: f */
    public static final Logger f16191f = Logger.getLogger(SequentialExecutor.class.getName());

    /* JADX INFO: renamed from: a */
    public final Executor f16192a;

    /* JADX INFO: renamed from: b */
    public final ArrayDeque f16193b = new ArrayDeque();

    /* JADX INFO: renamed from: c */
    public WorkerRunningState f16194c = WorkerRunningState.IDLE;

    /* JADX INFO: renamed from: d */
    public long f16195d = 0;

    /* JADX INFO: renamed from: e */
    public final RunnableC3211b f16196e = new RunnableC3211b();

    public enum WorkerRunningState {
        IDLE,
        QUEUING,
        QUEUED,
        RUNNING
    }

    /* JADX INFO: renamed from: com.google.firebase.concurrent.SequentialExecutor$a */
    public class RunnableC3210a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Runnable f16197a;

        public RunnableC3210a(Runnable runnable) {
            this.f16197a = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f16197a.run();
        }

        public final String toString() {
            return this.f16197a.toString();
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.concurrent.SequentialExecutor$b */
    public final class RunnableC3211b implements Runnable {

        /* JADX INFO: renamed from: a */
        public Runnable f16198a;

        public RunnableC3211b() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x004a, code lost:
        
            if (r1 == false) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x004c, code lost:
        
            java.lang.Thread.currentThread().interrupt();
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0054, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x005b, code lost:
        
            r1 = r1 | java.lang.Thread.interrupted();
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x005e, code lost:
        
            r12.f16198a.run();
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0064, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0066, code lost:
        
            r3 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0067, code lost:
        
            com.google.firebase.concurrent.SequentialExecutor.f16191f.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + r12.f16198a, (java.lang.Throwable) r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x008b, code lost:
        
            r12.f16198a = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x008d, code lost:
        
            throw r0;
         */
        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void m9148a() {
            boolean z10 = false;
            boolean zInterrupted = false;
            while (true) {
                try {
                    synchronized (SequentialExecutor.this.f16193b) {
                        if (!z10) {
                            try {
                                SequentialExecutor sequentialExecutor = SequentialExecutor.this;
                                WorkerRunningState workerRunningState = sequentialExecutor.f16194c;
                                WorkerRunningState workerRunningState2 = WorkerRunningState.RUNNING;
                                if (workerRunningState != workerRunningState2) {
                                    sequentialExecutor.f16195d++;
                                    sequentialExecutor.f16194c = workerRunningState2;
                                    z10 = true;
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                        Runnable runnable = (Runnable) SequentialExecutor.this.f16193b.poll();
                        this.f16198a = runnable;
                        if (runnable == null) {
                            SequentialExecutor.this.f16194c = WorkerRunningState.IDLE;
                        }
                    }
                    if (zInterrupted) {
                        Thread.currentThread().interrupt();
                    }
                    return;
                    this.f16198a = null;
                } catch (Throwable th3) {
                    if (zInterrupted) {
                        Thread.currentThread().interrupt();
                    }
                    throw th3;
                }
            }
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // java.lang.Runnable
        public final void run() {
            try {
                m9148a();
            } catch (Error e10) {
                synchronized (SequentialExecutor.this.f16193b) {
                    SequentialExecutor.this.f16194c = WorkerRunningState.IDLE;
                    throw e10;
                }
            }
        }

        public final String toString() {
            Runnable runnable = this.f16198a;
            if (runnable != null) {
                return "SequentialExecutorWorker{running=" + runnable + "}";
            }
            return "SequentialExecutorWorker{state=" + SequentialExecutor.this.f16194c + "}";
        }
    }

    public SequentialExecutor(Executor executor) {
        C6272i.m12915i(executor);
        this.f16192a = executor;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0077  */
    /* JADX WARN: Unreachable blocks removed: 3, instructions: 3 */
    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        WorkerRunningState workerRunningState;
        C6272i.m12915i(runnable);
        synchronized (this.f16193b) {
            WorkerRunningState workerRunningState2 = this.f16194c;
            if (workerRunningState2 == WorkerRunningState.RUNNING || workerRunningState2 == (workerRunningState = WorkerRunningState.QUEUED)) {
                this.f16193b.add(runnable);
                return;
            }
            long j10 = this.f16195d;
            RunnableC3210a runnableC3210a = new RunnableC3210a(runnable);
            this.f16193b.add(runnableC3210a);
            WorkerRunningState workerRunningState3 = WorkerRunningState.QUEUING;
            this.f16194c = workerRunningState3;
            boolean z10 = true;
            try {
                this.f16192a.execute(this.f16196e);
                if (this.f16194c == workerRunningState3) {
                    z10 = false;
                }
                if (z10) {
                    return;
                }
                synchronized (this.f16193b) {
                    if (this.f16195d == j10 && this.f16194c == workerRunningState3) {
                        this.f16194c = workerRunningState;
                    }
                }
            } catch (Error | RuntimeException e10) {
                synchronized (this.f16193b) {
                    WorkerRunningState workerRunningState4 = this.f16194c;
                    if (workerRunningState4 != WorkerRunningState.IDLE && workerRunningState4 != WorkerRunningState.QUEUING) {
                        z10 = false;
                    } else if (!this.f16193b.removeLastOccurrence(runnableC3210a)) {
                        z10 = false;
                    }
                    if (!(e10 instanceof RejectedExecutionException) || z10) {
                        throw e10;
                    }
                }
            }
        }
    }

    public final String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.f16192a + "}";
    }
}
