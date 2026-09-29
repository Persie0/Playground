package com.google.common.util.concurrent;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import p000.nv4;
import p000.xx8;

/* JADX INFO: renamed from: com.google.common.util.concurrent.l */
/* JADX INFO: loaded from: classes2.dex */
public final class ExecutorC1122l implements Executor {

    /* JADX INFO: renamed from: f */
    public static final nv4 f13548f = new nv4(ExecutorC1122l.class);

    /* JADX INFO: renamed from: a */
    public final Executor f13549a;

    /* JADX INFO: renamed from: b */
    public final ArrayDeque f13550b = new ArrayDeque();

    /* JADX INFO: renamed from: c */
    public SequentialExecutor$WorkerRunningState f13551c = SequentialExecutor$WorkerRunningState.IDLE;

    /* JADX INFO: renamed from: d */
    public long f13552d = 0;

    /* JADX INFO: renamed from: e */
    public final RunnableC1121k f13553e = new RunnableC1121k(this);

    public ExecutorC1122l(Executor executor) {
        executor.getClass();
        this.f13549a = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        SequentialExecutor$WorkerRunningState sequentialExecutor$WorkerRunningState;
        runnable.getClass();
        synchronized (this.f13550b) {
            SequentialExecutor$WorkerRunningState sequentialExecutor$WorkerRunningState2 = this.f13551c;
            if (sequentialExecutor$WorkerRunningState2 != SequentialExecutor$WorkerRunningState.RUNNING && sequentialExecutor$WorkerRunningState2 != (sequentialExecutor$WorkerRunningState = SequentialExecutor$WorkerRunningState.QUEUED)) {
                long j = this.f13552d;
                boolean z = false;
                xx8 xx8Var = new xx8(runnable, 0);
                this.f13550b.add(xx8Var);
                SequentialExecutor$WorkerRunningState sequentialExecutor$WorkerRunningState3 = SequentialExecutor$WorkerRunningState.QUEUING;
                this.f13551c = sequentialExecutor$WorkerRunningState3;
                try {
                    this.f13549a.execute(this.f13553e);
                    if (this.f13551c != sequentialExecutor$WorkerRunningState3) {
                        return;
                    }
                    synchronized (this.f13550b) {
                        try {
                            if (this.f13552d == j && this.f13551c == sequentialExecutor$WorkerRunningState3) {
                                this.f13551c = sequentialExecutor$WorkerRunningState;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return;
                } catch (Throwable th2) {
                    synchronized (this.f13550b) {
                        try {
                            SequentialExecutor$WorkerRunningState sequentialExecutor$WorkerRunningState4 = this.f13551c;
                            if (sequentialExecutor$WorkerRunningState4 == SequentialExecutor$WorkerRunningState.IDLE || sequentialExecutor$WorkerRunningState4 == SequentialExecutor$WorkerRunningState.QUEUING) {
                                if (this.f13550b.removeLastOccurrence(xx8Var)) {
                                    z = true;
                                }
                            }
                            if (!(th2 instanceof RejectedExecutionException) || z) {
                                throw th2;
                            }
                            return;
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                }
            }
            this.f13550b.add(runnable);
        }
    }

    public final String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.f13549a + "}";
    }
}
