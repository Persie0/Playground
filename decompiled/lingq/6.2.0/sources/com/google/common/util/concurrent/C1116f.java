package com.google.common.util.concurrent;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import p000.InterfaceC3016fw;
import p000.f09;
import p000.gv5;
import p000.y04;

/* JADX INFO: renamed from: com.google.common.util.concurrent.f */
/* JADX INFO: loaded from: classes2.dex */
public final class C1116f implements InterfaceC3016fw {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f13540a;

    /* JADX INFO: renamed from: b */
    public final AtomicReference f13541b;

    /* JADX INFO: renamed from: c */
    public Object f13542c;

    public C1116f() {
        this.f13540a = 1;
        this.f13541b = new AtomicReference(y04.f69048b);
        this.f13542c = new gv5(18, (byte) 0);
    }

    /* JADX INFO: renamed from: a */
    public ListenableFuture m6394a(InterfaceC3016fw interfaceC3016fw, Executor executor) {
        executor.getClass();
        final ExecutionSequencer$TaskNonReentrantExecutor executionSequencer$TaskNonReentrantExecutor = new ExecutionSequencer$TaskNonReentrantExecutor(ExecutionSequencer$RunningState.NOT_RUN);
        executionSequencer$TaskNonReentrantExecutor.f13508b = executor;
        executionSequencer$TaskNonReentrantExecutor.f13507a = this;
        C1116f c1116f = new C1116f(executionSequencer$TaskNonReentrantExecutor, interfaceC3016fw);
        final f09 f09Var = new f09();
        final ListenableFuture listenableFuture = (ListenableFuture) this.f13541b.getAndSet(f09Var);
        final RunnableFutureC1123m runnableFutureC1123m = new RunnableFutureC1123m();
        runnableFutureC1123m.f13554i = new TrustedListenableFutureTask$TrustedFutureInterruptibleAsyncTask(runnableFutureC1123m, c1116f);
        listenableFuture.mo52a(runnableFutureC1123m, executionSequencer$TaskNonReentrantExecutor);
        final ListenableFuture listenableFutureM6400d = AbstractC1118h.m6400d(runnableFutureC1123m);
        Runnable runnable = new Runnable() { // from class: com.google.common.util.concurrent.e
            @Override // java.lang.Runnable
            public final void run() {
                RunnableFutureC1123m runnableFutureC1123m2 = runnableFutureC1123m;
                if (runnableFutureC1123m2.isDone()) {
                    f09Var.m6387o(listenableFuture);
                    return;
                }
                if (listenableFutureM6400d.isCancelled()) {
                    int i = ExecutionSequencer$TaskNonReentrantExecutor.f13506e;
                    if (executionSequencer$TaskNonReentrantExecutor.compareAndSet(ExecutionSequencer$RunningState.NOT_RUN, ExecutionSequencer$RunningState.CANCELLED)) {
                        runnableFutureC1123m2.cancel(false);
                    }
                }
            }
        };
        DirectExecutor directExecutor = DirectExecutor.INSTANCE;
        listenableFutureM6400d.mo52a(runnable, directExecutor);
        runnableFutureC1123m.mo52a(runnable, directExecutor);
        return listenableFutureM6400d;
    }

    @Override // p000.InterfaceC3016fw
    public ListenableFuture call() {
        ExecutionSequencer$TaskNonReentrantExecutor executionSequencer$TaskNonReentrantExecutor = (ExecutionSequencer$TaskNonReentrantExecutor) this.f13541b;
        int i = ExecutionSequencer$TaskNonReentrantExecutor.f13506e;
        if (executionSequencer$TaskNonReentrantExecutor.compareAndSet(ExecutionSequencer$RunningState.NOT_RUN, ExecutionSequencer$RunningState.STARTED)) {
            return ((InterfaceC3016fw) this.f13542c).call();
        }
        C1119i c1119i = C1119i.f13545h;
        return c1119i != null ? c1119i : new C1119i();
    }

    public String toString() {
        switch (this.f13540a) {
            case 0:
                return ((InterfaceC3016fw) this.f13542c).toString();
            default:
                return super.toString();
        }
    }

    public C1116f(ExecutionSequencer$TaskNonReentrantExecutor executionSequencer$TaskNonReentrantExecutor, InterfaceC3016fw interfaceC3016fw) {
        this.f13540a = 0;
        this.f13541b = executionSequencer$TaskNonReentrantExecutor;
        this.f13542c = interfaceC3016fw;
    }
}
