package com.google.common.util.concurrent;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
abstract class CombinedFuture$CombinedFutureInterruptibleTask<T> extends InterruptibleTask<T> {

    /* JADX INFO: renamed from: c */
    public final Executor f13504c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1114d f13505d;

    public CombinedFuture$CombinedFutureInterruptibleTask(C1114d c1114d, Executor executor) {
        this.f13505d = c1114d;
        executor.getClass();
        this.f13504c = executor;
    }

    @Override // com.google.common.util.concurrent.InterruptibleTask
    /* JADX INFO: renamed from: a */
    public final void mo6371a(Throwable th) {
        C1114d c1114d = this.f13505d;
        c1114d.f13533I = null;
        if (th instanceof ExecutionException) {
            c1114d.m6386n(((ExecutionException) th).getCause());
        } else if (th instanceof CancellationException) {
            c1114d.cancel(false);
        } else {
            c1114d.m6386n(th);
        }
    }

    @Override // com.google.common.util.concurrent.InterruptibleTask
    /* JADX INFO: renamed from: b */
    public final void mo6372b(Object obj) {
        this.f13505d.f13533I = null;
        mo6370h(obj);
    }

    @Override // com.google.common.util.concurrent.InterruptibleTask
    /* JADX INFO: renamed from: d */
    public final boolean mo6373d() {
        return this.f13505d.isDone();
    }

    /* JADX INFO: renamed from: h */
    public abstract void mo6370h(Object obj);
}
