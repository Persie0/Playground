package com.clevertap.android.sdk.task;

import com.clevertap.android.sdk.CleverTapInstanceConfig;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p043c7.C1744j;
import p043c7.ExecutorC1741g;
import p043c7.InterfaceC1742h;
import p043c7.RunnableC1745k;

/* JADX INFO: loaded from: classes.dex */
public final class Task<TResult> {

    /* JADX INFO: renamed from: a */
    public final CleverTapInstanceConfig f11354a;

    /* JADX INFO: renamed from: b */
    public final Executor f11355b;

    /* JADX INFO: renamed from: c */
    public final Executor f11356c;

    /* JADX INFO: renamed from: e */
    public TResult f11358e;

    /* JADX INFO: renamed from: g */
    public final String f11360g;

    /* JADX INFO: renamed from: d */
    public final ArrayList f11357d = new ArrayList();

    /* JADX INFO: renamed from: f */
    public final ArrayList f11359f = new ArrayList();

    public enum STATE {
        FAILED,
        SUCCESS,
        READY_TO_RUN,
        RUNNING
    }

    public Task(CleverTapInstanceConfig cleverTapInstanceConfig, Executor executor, ExecutorC1741g executorC1741g, String str) {
        STATE state = STATE.FAILED;
        this.f11356c = executor;
        this.f11355b = executorC1741g;
        this.f11354a = cleverTapInstanceConfig;
        this.f11360g = str;
    }

    /* JADX INFO: renamed from: a */
    public final void m6584a(InterfaceC1742h interfaceC1742h) {
        this.f11359f.add(new C1744j(this.f11355b, interfaceC1742h));
    }

    /* JADX INFO: renamed from: b */
    public final void m6585b(String str, Callable<TResult> callable) {
        this.f11356c.execute(new RunnableC1745k(this, str, callable));
    }
}
