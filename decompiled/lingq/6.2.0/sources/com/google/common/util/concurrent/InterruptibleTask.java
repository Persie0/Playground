package com.google.common.util.concurrent;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.AbstractOwnableSynchronizer;
import java.util.concurrent.locks.LockSupport;
import p000.sq2;
import p000.ux5;

/* JADX INFO: loaded from: classes.dex */
abstract class InterruptibleTask<T> extends AtomicReference<Runnable> implements Runnable {

    /* JADX INFO: renamed from: a */
    public static final sq2 f13511a = new sq2(1);

    /* JADX INFO: renamed from: b */
    public static final sq2 f13512b = new sq2(1);

    /* JADX INFO: loaded from: classes2.dex */
    public static final class Blocker extends AbstractOwnableSynchronizer implements Runnable {

        /* JADX INFO: renamed from: a */
        public final InterruptibleTask f13513a;

        public Blocker(InterruptibleTask interruptibleTask) {
            this.f13513a = interruptibleTask;
        }

        /* JADX INFO: renamed from: a */
        public static void m6376a(Blocker blocker, Thread thread) {
            blocker.setExclusiveOwnerThread(thread);
        }

        @Override // java.lang.Runnable
        public final void run() {
        }

        public final String toString() {
            return this.f13513a.toString();
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo6371a(Throwable th);

    /* JADX INFO: renamed from: b */
    public abstract void mo6372b(Object obj);

    /* JADX INFO: renamed from: c */
    public final void m6374c() {
        sq2 sq2Var = f13512b;
        sq2 sq2Var2 = f13511a;
        Runnable runnable = get();
        if (runnable instanceof Thread) {
            Blocker blocker = new Blocker(this);
            Blocker.m6376a(blocker, Thread.currentThread());
            if (compareAndSet(runnable, blocker)) {
                try {
                    ((Thread) runnable).interrupt();
                } finally {
                    if (getAndSet(sq2Var2) == sq2Var) {
                        LockSupport.unpark((Thread) runnable);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public abstract boolean mo6373d();

    /* JADX INFO: renamed from: e */
    public abstract Object mo6368e();

    /* JADX INFO: renamed from: f */
    public abstract String mo6369f();

    /* JADX INFO: renamed from: g */
    public final void m6375g(Thread thread) {
        Runnable runnable = get();
        Blocker blocker = null;
        boolean z = false;
        int i = 0;
        while (true) {
            boolean z2 = runnable instanceof Blocker;
            sq2 sq2Var = f13512b;
            if (!z2 && runnable != sq2Var) {
                break;
            }
            if (z2) {
                blocker = (Blocker) runnable;
            }
            i++;
            if (i <= 1000) {
                Thread.yield();
            } else if (runnable == sq2Var || compareAndSet(runnable, sq2Var)) {
                z = Thread.interrupted() || z;
                LockSupport.park(blocker);
            }
            runnable = get();
        }
        if (z) {
            thread.interrupt();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Thread threadCurrentThread = Thread.currentThread();
        Object objMo6368e = null;
        if (compareAndSet(null, threadCurrentThread)) {
            boolean zMo6373d = mo6373d();
            sq2 sq2Var = f13511a;
            if (!zMo6373d) {
                try {
                    objMo6368e = mo6368e();
                } catch (Throwable th) {
                    try {
                        if (th instanceof InterruptedException) {
                            Thread.currentThread().interrupt();
                        }
                        if (!compareAndSet(threadCurrentThread, sq2Var)) {
                            m6375g(threadCurrentThread);
                        }
                        if (zMo6373d) {
                            return;
                        }
                        mo6371a(th);
                        return;
                    } catch (Throwable th2) {
                        if (!compareAndSet(threadCurrentThread, sq2Var)) {
                            m6375g(threadCurrentThread);
                        }
                        if (!zMo6373d) {
                            mo6372b(null);
                        }
                        throw th2;
                    }
                }
            }
            if (!compareAndSet(threadCurrentThread, sq2Var)) {
                m6375g(threadCurrentThread);
            }
            if (zMo6373d) {
                return;
            }
            mo6372b(objMo6368e);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String str;
        Runnable runnable = get();
        if (runnable == f13511a) {
            str = "running=[DONE]";
        } else if (runnable instanceof Blocker) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            str = "running=[RUNNING ON " + ((Thread) runnable).getName() + "]";
        } else {
            str = "running=[NOT STARTED YET]";
        }
        StringBuilder sbM22999v = ux5.m22999v(str, ", ");
        sbM22999v.append(mo6369f());
        return sbM22999v.toString();
    }
}
