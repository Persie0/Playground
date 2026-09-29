package com.google.common.util.concurrent;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import p000.AbstractRunnableC0004a2;
import p000.AbstractRunnableC3630u;
import p000.C3386nv;
import p000.C3555s;
import p000.C3780y1;
import p000.C3817z1;
import p000.InterfaceC3016fw;
import p000.InterfaceC3053gw;
import p000.b34;
import p000.gj3;
import p000.lj3;
import p000.y04;

/* JADX INFO: renamed from: com.google.common.util.concurrent.h */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1118h {
    /* JADX INFO: renamed from: a */
    public static C3555s m6397a(ListenableFuture listenableFuture, Class cls, InterfaceC3053gw interfaceC3053gw, Executor executor) {
        int i = AbstractRunnableC3630u.f63155l;
        C3555s c3555s = new C3555s(listenableFuture, cls, interfaceC3053gw);
        listenableFuture.mo52a(c3555s, AbstractC1120j.m6405b(executor, c3555s));
        return c3555s;
    }

    /* JADX INFO: renamed from: b */
    public static Object m6398b(Future future) {
        Object obj;
        if (!future.isDone()) {
            C3386nv.m17633t(b34.m3207B("Future was expected to be done: %s", future));
            return null;
        }
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    /* JADX INFO: renamed from: c */
    public static y04 m6399c(Object obj) {
        return obj == null ? y04.f69048b : new y04(obj);
    }

    /* JADX INFO: renamed from: d */
    public static ListenableFuture m6400d(ListenableFuture listenableFuture) {
        if (listenableFuture.isDone()) {
            return listenableFuture;
        }
        lj3 lj3Var = new lj3();
        lj3Var.f49737h = listenableFuture;
        listenableFuture.mo52a(lj3Var, DirectExecutor.INSTANCE);
        return lj3Var;
    }

    /* JADX INFO: renamed from: e */
    public static RunnableFutureC1123m m6401e(InterfaceC3016fw interfaceC3016fw, Executor executor) {
        RunnableFutureC1123m runnableFutureC1123m = new RunnableFutureC1123m();
        runnableFutureC1123m.f13554i = new TrustedListenableFutureTask$TrustedFutureInterruptibleAsyncTask(runnableFutureC1123m, interfaceC3016fw);
        executor.execute(runnableFutureC1123m);
        return runnableFutureC1123m;
    }

    /* JADX INFO: renamed from: f */
    public static C3817z1 m6402f(ListenableFuture listenableFuture, gj3 gj3Var, Executor executor) {
        int i = AbstractRunnableC0004a2.f81k;
        C3817z1 c3817z1 = new C3817z1(listenableFuture, gj3Var);
        listenableFuture.mo52a(c3817z1, AbstractC1120j.m6405b(executor, c3817z1));
        return c3817z1;
    }

    /* JADX INFO: renamed from: g */
    public static C3780y1 m6403g(ListenableFuture listenableFuture, InterfaceC3053gw interfaceC3053gw, Executor executor) {
        int i = AbstractRunnableC0004a2.f81k;
        executor.getClass();
        C3780y1 c3780y1 = new C3780y1(listenableFuture, interfaceC3053gw);
        listenableFuture.mo52a(c3780y1, AbstractC1120j.m6405b(executor, c3780y1));
        return c3780y1;
    }
}
