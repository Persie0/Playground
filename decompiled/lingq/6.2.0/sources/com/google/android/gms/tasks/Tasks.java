package com.google.android.gms.tasks;

import android.os.Looper;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p000.C3386nv;
import p000.fib;
import p000.lda;
import p000.mh2;
import p000.pg1;
import p000.qg2;
import p000.rk8;
import p000.tld;
import p000.u62;
import p000.xr9;

/* JADX INFO: loaded from: classes.dex */
public final class Tasks {
    /* JADX INFO: renamed from: a */
    public static tld m5973a(Callable callable, Executor executor) {
        lda.m16131q(executor, "Executor must not be null");
        tld tldVar = new tld();
        executor.execute(new u62(tldVar, callable, false, 15));
        return tldVar;
    }

    public static <TResult> TResult await(Task<TResult> task, long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        lda.m16129o("Must not be called on the main application thread");
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != null && Objects.equals(looperMyLooper.getThread().getName(), "GoogleApiHandler")) {
            C3386nv.m17633t("Must not be called on GoogleApiHandler thread.");
            return null;
        }
        lda.m16131q(task, "Task must not be null");
        lda.m16131q(timeUnit, "TimeUnit must not be null");
        if (task.mo5970l()) {
            return (TResult) m5978f(task);
        }
        pg1 pg1Var = new pg1(1);
        qg2 qg2Var = xr9.f68588b;
        task.mo5963e(qg2Var, pg1Var);
        task.mo5962d(qg2Var, pg1Var);
        task.mo5959a(qg2Var, pg1Var);
        if (pg1Var.f56084b.await(j, timeUnit)) {
            return (TResult) m5978f(task);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    /* JADX INFO: renamed from: b */
    public static tld m5974b(Exception exc) {
        tld tldVar = new tld();
        tldVar.m22203r(exc);
        return tldVar;
    }

    /* JADX INFO: renamed from: c */
    public static tld m5975c(Object obj) {
        tld tldVar = new tld();
        tldVar.m22201p(obj);
        return tldVar;
    }

    /* JADX INFO: renamed from: d */
    public static tld m5976d(List list) {
        if (list == null || list.isEmpty()) {
            return m5975c(null);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((Task) it.next()) == null) {
                C3386nv.m17635v("null tasks are not accepted");
                return null;
            }
        }
        tld tldVar = new tld();
        fib fibVar = new fib(list.size(), tldVar);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Task task = (Task) it2.next();
            qg2 qg2Var = xr9.f68588b;
            task.mo5963e(qg2Var, fibVar);
            task.mo5962d(qg2Var, fibVar);
            task.mo5959a(qg2Var, fibVar);
        }
        return tldVar;
    }

    /* JADX INFO: renamed from: e */
    public static Task m5977e(Task... taskArr) {
        if (taskArr.length == 0) {
            return m5975c(Collections.EMPTY_LIST);
        }
        List listAsList = Arrays.asList(taskArr);
        rk8 rk8Var = xr9.f68587a;
        if (listAsList == null || listAsList.isEmpty()) {
            return m5975c(Collections.EMPTY_LIST);
        }
        List list = listAsList;
        return m5976d(list).mo5965g(rk8Var, new mh2(1, list));
    }

    /* JADX INFO: renamed from: f */
    public static Object m5978f(Task task) throws ExecutionException {
        if (task.mo5971m()) {
            return task.mo5967i();
        }
        if (task.mo5969k()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(task.mo5966h());
    }

    public static <TResult> TResult await(Task<TResult> task) throws ExecutionException, InterruptedException {
        lda.m16129o("Must not be called on the main application thread");
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != null && Objects.equals(looperMyLooper.getThread().getName(), "GoogleApiHandler")) {
            C3386nv.m17633t("Must not be called on GoogleApiHandler thread.");
            return null;
        }
        lda.m16131q(task, "Task must not be null");
        if (task.mo5970l()) {
            return (TResult) m5978f(task);
        }
        pg1 pg1Var = new pg1(1);
        qg2 qg2Var = xr9.f68588b;
        task.mo5963e(qg2Var, pg1Var);
        task.mo5962d(qg2Var, pg1Var);
        task.mo5959a(qg2Var, pg1Var);
        pg1Var.f56084b.await();
        return (TResult) m5978f(task);
    }
}
