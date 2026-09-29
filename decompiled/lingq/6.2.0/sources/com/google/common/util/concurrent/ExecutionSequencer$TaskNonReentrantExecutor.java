package com.google.common.util.concurrent;

import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import p000.bna;
import p000.gv5;

/* JADX INFO: loaded from: classes2.dex */
final class ExecutionSequencer$TaskNonReentrantExecutor extends AtomicReference<ExecutionSequencer$RunningState> implements Executor, Runnable {

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ int f13506e = 0;

    /* JADX INFO: renamed from: a */
    public C1116f f13507a;

    /* JADX INFO: renamed from: b */
    public Executor f13508b;

    /* JADX INFO: renamed from: c */
    public Runnable f13509c;

    /* JADX INFO: renamed from: d */
    public Thread f13510d;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (get() == ExecutionSequencer$RunningState.CANCELLED) {
            this.f13508b = null;
            this.f13507a = null;
            return;
        }
        this.f13510d = Thread.currentThread();
        try {
            C1116f c1116f = this.f13507a;
            Objects.requireNonNull(c1116f);
            gv5 gv5Var = (gv5) c1116f.f13542c;
            if (((Thread) gv5Var.f41392b) == this.f13510d) {
                this.f13507a = null;
                bna.m3987z(((Runnable) gv5Var.f41393c) == null);
                gv5Var.f41393c = runnable;
                Executor executor = this.f13508b;
                Objects.requireNonNull(executor);
                gv5Var.f41394d = executor;
                this.f13508b = null;
            } else {
                Executor executor2 = this.f13508b;
                Objects.requireNonNull(executor2);
                this.f13508b = null;
                this.f13509c = runnable;
                executor2.execute(this);
            }
        } finally {
            this.f13510d = null;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Executor executor;
        Thread threadCurrentThread = Thread.currentThread();
        if (threadCurrentThread != this.f13510d) {
            Runnable runnable = this.f13509c;
            Objects.requireNonNull(runnable);
            this.f13509c = null;
            runnable.run();
            return;
        }
        gv5 gv5Var = new gv5(18, (byte) 0);
        gv5Var.f41392b = threadCurrentThread;
        C1116f c1116f = this.f13507a;
        Objects.requireNonNull(c1116f);
        c1116f.f13542c = gv5Var;
        this.f13507a = null;
        try {
            Runnable runnable2 = this.f13509c;
            Objects.requireNonNull(runnable2);
            this.f13509c = null;
            runnable2.run();
            while (true) {
                Runnable runnable3 = (Runnable) gv5Var.f41393c;
                if (runnable3 == null || (executor = (Executor) gv5Var.f41394d) == null) {
                    break;
                }
                gv5Var.f41393c = null;
                gv5Var.f41394d = null;
                executor.execute(runnable3);
            }
            gv5Var.f41392b = null;
        } catch (Throwable th) {
            gv5Var.f41392b = null;
            throw th;
        }
    }
}
