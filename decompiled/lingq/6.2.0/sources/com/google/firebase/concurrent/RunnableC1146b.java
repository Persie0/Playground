package com.google.firebase.concurrent;

/* JADX INFO: renamed from: com.google.firebase.concurrent.b */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1146b implements Runnable {

    /* JADX INFO: renamed from: a */
    public Runnable f13635a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ExecutorC1147c f13636b;

    public RunnableC1146b(ExecutorC1147c executorC1147c) {
        this.f13636b = executorC1147c;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0036 A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003d, code lost:
    
        if (r1 == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0046, code lost:
    
        r1 = r1 | java.lang.Thread.interrupted();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0048, code lost:
    
        r9.f13635a.run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0052, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0054, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0055, code lost:
    
        com.google.firebase.concurrent.ExecutorC1147c.f13637f.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + r9.f13635a, (java.lang.Throwable) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0070, code lost:
    
        r9.f13635a = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0072, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:?, code lost:
    
        return;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m6670a() {
        Runnable runnable;
        boolean z = false;
        boolean zInterrupted = false;
        while (true) {
            try {
                synchronized (this.f13636b.f13639b) {
                    if (z) {
                        runnable = (Runnable) this.f13636b.f13639b.poll();
                        this.f13635a = runnable;
                        if (runnable == null) {
                            this.f13636b.f13640c = SequentialExecutor$WorkerRunningState.IDLE;
                        }
                    } else {
                        ExecutorC1147c executorC1147c = this.f13636b;
                        SequentialExecutor$WorkerRunningState sequentialExecutor$WorkerRunningState = executorC1147c.f13640c;
                        SequentialExecutor$WorkerRunningState sequentialExecutor$WorkerRunningState2 = SequentialExecutor$WorkerRunningState.RUNNING;
                        if (sequentialExecutor$WorkerRunningState != sequentialExecutor$WorkerRunningState2) {
                            executorC1147c.f13641d++;
                            executorC1147c.f13640c = sequentialExecutor$WorkerRunningState2;
                            z = true;
                            runnable = (Runnable) this.f13636b.f13639b.poll();
                            this.f13635a = runnable;
                            if (runnable == null) {
                                this.f13636b.f13640c = SequentialExecutor$WorkerRunningState.IDLE;
                            }
                        }
                    }
                }
                if (zInterrupted) {
                    break;
                } else {
                    return;
                }
                this.f13635a = null;
            } catch (Throwable th) {
                if (zInterrupted) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        Thread.currentThread().interrupt();
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            m6670a();
        } catch (Error e) {
            synchronized (this.f13636b.f13639b) {
                this.f13636b.f13640c = SequentialExecutor$WorkerRunningState.IDLE;
                throw e;
            }
        }
    }

    public final String toString() {
        Runnable runnable = this.f13635a;
        if (runnable != null) {
            return "SequentialExecutorWorker{running=" + runnable + "}";
        }
        return "SequentialExecutorWorker{state=" + this.f13636b.f13640c + "}";
    }
}
