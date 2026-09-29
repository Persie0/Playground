package com.google.common.util.concurrent;

import p000.InterfaceC3016fw;
import p000.bna;

/* JADX INFO: loaded from: classes2.dex */
final class TrustedListenableFutureTask$TrustedFutureInterruptibleAsyncTask extends InterruptibleTask<ListenableFuture> {

    /* JADX INFO: renamed from: c */
    public final InterfaceC3016fw f13514c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ RunnableFutureC1123m f13515d;

    public TrustedListenableFutureTask$TrustedFutureInterruptibleAsyncTask(RunnableFutureC1123m runnableFutureC1123m, InterfaceC3016fw interfaceC3016fw) {
        this.f13515d = runnableFutureC1123m;
        this.f13514c = interfaceC3016fw;
    }

    @Override // com.google.common.util.concurrent.InterruptibleTask
    /* JADX INFO: renamed from: a */
    public final void mo6371a(Throwable th) {
        this.f13515d.m6386n(th);
    }

    @Override // com.google.common.util.concurrent.InterruptibleTask
    /* JADX INFO: renamed from: b */
    public final void mo6372b(Object obj) {
        this.f13515d.m6387o((ListenableFuture) obj);
    }

    @Override // com.google.common.util.concurrent.InterruptibleTask
    /* JADX INFO: renamed from: d */
    public final boolean mo6373d() {
        return this.f13515d.isDone();
    }

    @Override // com.google.common.util.concurrent.InterruptibleTask
    /* JADX INFO: renamed from: e */
    public final Object mo6368e() {
        InterfaceC3016fw interfaceC3016fw = this.f13514c;
        ListenableFuture listenableFutureCall = interfaceC3016fw.call();
        bna.m3977u(listenableFutureCall, "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", interfaceC3016fw);
        return listenableFutureCall;
    }

    @Override // com.google.common.util.concurrent.InterruptibleTask
    /* JADX INFO: renamed from: f */
    public final String mo6369f() {
        return this.f13514c.toString();
    }
}
