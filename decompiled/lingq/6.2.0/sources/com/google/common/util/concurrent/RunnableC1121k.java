package com.google.common.util.concurrent;

/* JADX INFO: renamed from: com.google.common.util.concurrent.k */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC1121k implements Runnable {

    /* JADX INFO: renamed from: a */
    public Runnable f13546a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ExecutorC1122l f13547b;

    public RunnableC1121k(ExecutorC1122l executorC1122l) {
        this.f13547b = executorC1122l;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0036 A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003d, code lost:
    
        if (r1 == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0046, code lost:
    
        r1 = r1 | java.lang.Thread.interrupted();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0048, code lost:
    
        r9.f13546a.run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0052, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0054, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0055, code lost:
    
        com.google.common.util.concurrent.ExecutorC1122l.f13548f.m17640a().log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + r9.f13546a, (java.lang.Throwable) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0074, code lost:
    
        r9.f13546a = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0076, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:?, code lost:
    
        return;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m6406a() {
        Runnable runnable;
        boolean z = false;
        boolean zInterrupted = false;
        while (true) {
            try {
                synchronized (this.f13547b.f13550b) {
                    if (z) {
                        runnable = (Runnable) this.f13547b.f13550b.poll();
                        this.f13546a = runnable;
                        if (runnable == null) {
                            this.f13547b.f13551c = SequentialExecutor$WorkerRunningState.IDLE;
                        }
                    } else {
                        ExecutorC1122l executorC1122l = this.f13547b;
                        SequentialExecutor$WorkerRunningState sequentialExecutor$WorkerRunningState = executorC1122l.f13551c;
                        SequentialExecutor$WorkerRunningState sequentialExecutor$WorkerRunningState2 = SequentialExecutor$WorkerRunningState.RUNNING;
                        if (sequentialExecutor$WorkerRunningState != sequentialExecutor$WorkerRunningState2) {
                            executorC1122l.f13552d++;
                            executorC1122l.f13551c = sequentialExecutor$WorkerRunningState2;
                            z = true;
                            runnable = (Runnable) this.f13547b.f13550b.poll();
                            this.f13546a = runnable;
                            if (runnable == null) {
                                this.f13547b.f13551c = SequentialExecutor$WorkerRunningState.IDLE;
                            }
                        }
                    }
                }
                if (zInterrupted) {
                    break;
                } else {
                    return;
                }
                this.f13546a = null;
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
            m6406a();
        } catch (Error e) {
            synchronized (this.f13547b.f13550b) {
                this.f13547b.f13551c = SequentialExecutor$WorkerRunningState.IDLE;
                throw e;
            }
        }
    }

    public final String toString() {
        Runnable runnable = this.f13546a;
        if (runnable != null) {
            return "SequentialExecutorWorker{running=" + runnable + "}";
        }
        return "SequentialExecutorWorker{state=" + this.f13547b.f13551c + "}";
    }
}
