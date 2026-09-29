package com.google.android.gms.tasks;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p136gc.AbstractC5751g;
import p136gc.C5753i;
import p136gc.C5754j;
import p136gc.C5755k;
import p136gc.C5761q;
import p136gc.ExecutorC5760p;
import p152hb.RunnableC5959c1;
import p176ib.C6272i;

/* JADX INFO: loaded from: classes.dex */
public final class Tasks {
    /* JADX INFO: renamed from: a */
    public static <TResult> TResult m8537a(AbstractC5751g<TResult> abstractC5751g) throws ExecutionException, InterruptedException {
        C6272i.m12914h("Must not be called on the main application thread");
        if (abstractC5751g == null) {
            throw new NullPointerException("Task must not be null");
        }
        if (abstractC5751g.mo12110l()) {
            return (TResult) m8541e(abstractC5751g);
        }
        C5754j c5754j = new C5754j();
        ExecutorC5760p executorC5760p = C5753i.f34814b;
        abstractC5751g.mo12103e(executorC5760p, c5754j);
        abstractC5751g.mo12102d(executorC5760p, c5754j);
        abstractC5751g.mo12099a(executorC5760p, c5754j);
        c5754j.f34815a.await();
        return (TResult) m8541e(abstractC5751g);
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public static <TResult> TResult await(AbstractC5751g<TResult> abstractC5751g, long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        C6272i.m12914h("Must not be called on the main application thread");
        if (abstractC5751g == null) {
            throw new NullPointerException("Task must not be null");
        }
        if (timeUnit == null) {
            throw new NullPointerException("TimeUnit must not be null");
        }
        if (abstractC5751g.mo12110l()) {
            return (TResult) m8541e(abstractC5751g);
        }
        C5754j c5754j = new C5754j();
        ExecutorC5760p executorC5760p = C5753i.f34814b;
        abstractC5751g.mo12103e(executorC5760p, c5754j);
        abstractC5751g.mo12102d(executorC5760p, c5754j);
        abstractC5751g.mo12099a(executorC5760p, c5754j);
        if (c5754j.f34815a.await(j10, timeUnit)) {
            return (TResult) m8541e(abstractC5751g);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    @Deprecated
    /* JADX INFO: renamed from: b */
    public static C5761q m8538b(Executor executor, Callable callable) {
        if (executor == null) {
            throw new NullPointerException("Executor must not be null");
        }
        C5761q c5761q = new C5761q();
        executor.execute(new RunnableC5959c1(c5761q, 5, callable));
        return c5761q;
    }

    /* JADX INFO: renamed from: c */
    public static C5761q m8539c(Object obj) {
        C5761q c5761q = new C5761q();
        c5761q.m12123q(obj);
        return c5761q;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: d */
    public static C5761q m8540d(List list) {
        if (list == null || list.isEmpty()) {
            return m8539c(null);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((AbstractC5751g) it.next()) == null) {
                throw new NullPointerException("null tasks are not accepted");
            }
        }
        C5761q c5761q = new C5761q();
        C5755k c5755k = new C5755k(list.size(), c5761q);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            AbstractC5751g abstractC5751g = (AbstractC5751g) it2.next();
            ExecutorC5760p executorC5760p = C5753i.f34814b;
            abstractC5751g.mo12103e(executorC5760p, c5755k);
            abstractC5751g.mo12102d(executorC5760p, c5755k);
            abstractC5751g.mo12099a(executorC5760p, c5755k);
        }
        return c5761q;
    }

    /* JADX INFO: renamed from: e */
    public static Object m8541e(AbstractC5751g abstractC5751g) throws ExecutionException {
        if (abstractC5751g.mo12111m()) {
            return abstractC5751g.mo12107i();
        }
        if (abstractC5751g.mo12109k()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(abstractC5751g.mo12106h());
    }
}
