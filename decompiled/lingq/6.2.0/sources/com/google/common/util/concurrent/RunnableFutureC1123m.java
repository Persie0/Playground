package com.google.common.util.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;
import p000.j93;

/* JADX INFO: renamed from: com.google.common.util.concurrent.m */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableFutureC1123m extends j93 implements RunnableFuture {

    /* JADX INFO: renamed from: i */
    public volatile InterruptibleTask f13554i;

    public RunnableFutureC1123m(final Callable callable) {
        this.f13554i = new InterruptibleTask<Object>(callable) { // from class: com.google.common.util.concurrent.TrustedListenableFutureTask$TrustedFutureInterruptibleTask

            /* JADX INFO: renamed from: c */
            public final Callable f13516c;

            {
                callable.getClass();
                this.f13516c = callable;
            }

            @Override // com.google.common.util.concurrent.InterruptibleTask
            /* JADX INFO: renamed from: a */
            public final void mo6371a(Throwable th) {
                this.f13517d.m6386n(th);
            }

            @Override // com.google.common.util.concurrent.InterruptibleTask
            /* JADX INFO: renamed from: b */
            public final void mo6372b(Object obj) {
                this.f13517d.m6385m(obj);
            }

            @Override // com.google.common.util.concurrent.InterruptibleTask
            /* JADX INFO: renamed from: d */
            public final boolean mo6373d() {
                return this.f13517d.isDone();
            }

            @Override // com.google.common.util.concurrent.InterruptibleTask
            /* JADX INFO: renamed from: e */
            public final Object mo6368e() {
                return this.f13516c.call();
            }

            @Override // com.google.common.util.concurrent.InterruptibleTask
            /* JADX INFO: renamed from: f */
            public final String mo6369f() {
                return this.f13516c.toString();
            }
        };
    }

    @Override // com.google.common.util.concurrent.AbstractC1112b
    /* JADX INFO: renamed from: d */
    public final void mo42d() {
        InterruptibleTask interruptibleTask;
        if (m6389q() && (interruptibleTask = this.f13554i) != null) {
            interruptibleTask.m6374c();
        }
        this.f13554i = null;
    }

    @Override // com.google.common.util.concurrent.AbstractC1112b
    /* JADX INFO: renamed from: k */
    public final String mo43k() {
        InterruptibleTask interruptibleTask = this.f13554i;
        if (interruptibleTask == null) {
            return super.mo43k();
        }
        return "task=[" + interruptibleTask + "]";
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        InterruptibleTask interruptibleTask = this.f13554i;
        if (interruptibleTask != null) {
            interruptibleTask.run();
        }
        this.f13554i = null;
    }
}
