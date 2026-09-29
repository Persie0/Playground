package com.google.common.util.concurrent;

import com.google.common.collect.ImmutableList;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p000.cdb;

/* JADX INFO: renamed from: com.google.common.util.concurrent.g */
/* JADX INFO: loaded from: classes2.dex */
public final class C1117g {

    /* JADX INFO: renamed from: a */
    public final boolean f13543a;

    /* JADX INFO: renamed from: b */
    public final ImmutableList f13544b;

    public C1117g(boolean z, ImmutableList immutableList) {
        this.f13543a = z;
        this.f13544b = immutableList;
    }

    /* JADX INFO: renamed from: a */
    public final C1114d m6395a(final Callable callable, final Executor executor) {
        final C1114d c1114d = new C1114d(this.f13544b, this.f13543a);
        c1114d.f13533I = new CombinedFuture$CombinedFutureInterruptibleTask<Object>(callable, executor) { // from class: com.google.common.util.concurrent.CombinedFuture$CallableInterruptibleTask

            /* JADX INFO: renamed from: e */
            public final Callable f13502e;

            {
                super(this.f13503f, executor);
                this.f13502e = callable;
            }

            @Override // com.google.common.util.concurrent.InterruptibleTask
            /* JADX INFO: renamed from: e */
            public final Object mo6368e() {
                return this.f13502e.call();
            }

            @Override // com.google.common.util.concurrent.InterruptibleTask
            /* JADX INFO: renamed from: f */
            public final String mo6369f() {
                return this.f13502e.toString();
            }

            @Override // com.google.common.util.concurrent.CombinedFuture$CombinedFutureInterruptibleTask
            /* JADX INFO: renamed from: h */
            public final void mo6370h(Object obj) {
                this.f13503f.m6385m(obj);
            }
        };
        c1114d.m6392t();
        return c1114d;
    }

    /* JADX INFO: renamed from: b */
    public final C1114d m6396b(final cdb cdbVar, final Executor executor) {
        final C1114d c1114d = new C1114d(this.f13544b, this.f13543a);
        c1114d.f13533I = new CombinedFuture$CombinedFutureInterruptibleTask<ListenableFuture>(cdbVar, executor) { // from class: com.google.common.util.concurrent.CombinedFuture$AsyncCallableInterruptibleTask

            /* JADX INFO: renamed from: e */
            public final cdb f13500e;

            {
                super(this.f13501f, executor);
                this.f13500e = cdbVar;
            }

            @Override // com.google.common.util.concurrent.InterruptibleTask
            /* JADX INFO: renamed from: e */
            public final Object mo6368e() {
                return this.f13500e.call();
            }

            @Override // com.google.common.util.concurrent.InterruptibleTask
            /* JADX INFO: renamed from: f */
            public final String mo6369f() {
                return this.f13500e.toString();
            }

            @Override // com.google.common.util.concurrent.CombinedFuture$CombinedFutureInterruptibleTask
            /* JADX INFO: renamed from: h */
            public final void mo6370h(Object obj) {
                this.f13501f.m6387o((ListenableFuture) obj);
            }
        };
        c1114d.m6392t();
        return c1114d;
    }
}
