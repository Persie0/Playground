package com.google.firebase.concurrent;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;
import p000.lda;
import p000.qk8;

/* JADX INFO: renamed from: com.google.firebase.concurrent.c */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC1147c implements Executor {

    /* JADX INFO: renamed from: f */
    public static final Logger f13637f = Logger.getLogger(ExecutorC1147c.class.getName());

    /* JADX INFO: renamed from: a */
    public final Executor f13638a;

    /* JADX INFO: renamed from: b */
    public final ArrayDeque f13639b = new ArrayDeque();

    /* JADX INFO: renamed from: c */
    public SequentialExecutor$WorkerRunningState f13640c = SequentialExecutor$WorkerRunningState.IDLE;

    /* JADX INFO: renamed from: d */
    public long f13641d = 0;

    /* JADX INFO: renamed from: e */
    public final RunnableC1146b f13642e = new RunnableC1146b(this);

    public ExecutorC1147c(Executor executor) {
        lda.m16130p(executor);
        this.f13638a = executor;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x005f  */
    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        SequentialExecutor$WorkerRunningState sequentialExecutor$WorkerRunningState;
        lda.m16130p(runnable);
        synchronized (this.f13639b) {
            SequentialExecutor$WorkerRunningState sequentialExecutor$WorkerRunningState2 = this.f13640c;
            if (sequentialExecutor$WorkerRunningState2 != SequentialExecutor$WorkerRunningState.RUNNING && sequentialExecutor$WorkerRunningState2 != (sequentialExecutor$WorkerRunningState = SequentialExecutor$WorkerRunningState.QUEUED)) {
                long j = this.f13641d;
                boolean z = true;
                qk8 qk8Var = new qk8(runnable, 1);
                this.f13639b.add(qk8Var);
                SequentialExecutor$WorkerRunningState sequentialExecutor$WorkerRunningState3 = SequentialExecutor$WorkerRunningState.QUEUING;
                this.f13640c = sequentialExecutor$WorkerRunningState3;
                try {
                    this.f13638a.execute(this.f13642e);
                    if (this.f13640c != sequentialExecutor$WorkerRunningState3) {
                        return;
                    }
                    synchronized (this.f13639b) {
                        try {
                            if (this.f13641d == j && this.f13640c == sequentialExecutor$WorkerRunningState3) {
                                this.f13640c = sequentialExecutor$WorkerRunningState;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return;
                } catch (Error | RuntimeException e) {
                    synchronized (this.f13639b) {
                        try {
                            SequentialExecutor$WorkerRunningState sequentialExecutor$WorkerRunningState4 = this.f13640c;
                            if (sequentialExecutor$WorkerRunningState4 != SequentialExecutor$WorkerRunningState.IDLE && sequentialExecutor$WorkerRunningState4 != SequentialExecutor$WorkerRunningState.QUEUING) {
                                z = false;
                            } else if (!this.f13639b.removeLastOccurrence(qk8Var)) {
                                z = false;
                            }
                            if (!(e instanceof RejectedExecutionException) || z) {
                                throw e;
                            }
                            return;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            }
            this.f13639b.add(runnable);
        }
    }

    public final String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.f13638a + "}";
    }
}
