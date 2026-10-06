package p000;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
abstract class npr extends AtomicReference implements Runnable {

    /* JADX INFO: renamed from: a */
    private static final Runnable f44035a = new lcg(4);

    /* JADX INFO: renamed from: b */
    private static final Runnable f44036b = new lcg(4);

    /* JADX INFO: renamed from: c */
    private final void m17613c(Thread thread) {
        Runnable runnable = (Runnable) get();
        npq npqVar = null;
        boolean z = false;
        int i = 0;
        while (true) {
            if (!(runnable instanceof npq)) {
                if (runnable != f44036b) {
                    break;
                }
            } else {
                npqVar = (npq) runnable;
            }
            i++;
            if (i > 1000) {
                Runnable runnable2 = f44036b;
                if (runnable == runnable2 || compareAndSet(runnable, runnable2)) {
                    z = Thread.interrupted() || z;
                    LockSupport.park(npqVar);
                }
            } else {
                Thread.yield();
            }
            runnable = (Runnable) get();
        }
        if (z) {
            thread.interrupt();
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract Object mo17569a();

    /* JADX INFO: renamed from: b */
    public abstract String mo17570b();

    /* JADX INFO: renamed from: d */
    public abstract void mo17572d(Throwable th);

    /* JADX INFO: renamed from: e */
    public abstract void mo17573e(Object obj);

    /* JADX INFO: renamed from: g */
    public abstract boolean mo17575g();

    /* JADX INFO: renamed from: h */
    final void m17614h() {
        Runnable runnable = (Runnable) get();
        if (runnable instanceof Thread) {
            npq npqVar = new npq(this);
            npqVar.m17612a(Thread.currentThread());
            if (compareAndSet(runnable, npqVar)) {
                try {
                    ((Thread) runnable).interrupt();
                    if (((Runnable) getAndSet(f44035a)) == f44036b) {
                    }
                } finally {
                    if (((Runnable) getAndSet(f44035a)) == f44036b) {
                        LockSupport.unpark((Thread) runnable);
                    }
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Thread threadCurrentThread = Thread.currentThread();
        Object objMo17569a = null;
        if (compareAndSet(null, threadCurrentThread)) {
            boolean z = !mo17575g();
            if (z) {
                try {
                    objMo17569a = mo17569a();
                } catch (Throwable th) {
                    try {
                        ntw.m17728n(th);
                        if (!compareAndSet(threadCurrentThread, f44035a)) {
                            m17613c(threadCurrentThread);
                        }
                        mo17572d(th);
                        return;
                    } catch (Throwable th2) {
                        if (!compareAndSet(threadCurrentThread, f44035a)) {
                            m17613c(threadCurrentThread);
                        }
                        mo17573e(null);
                        throw th2;
                    }
                }
            }
            if (!compareAndSet(threadCurrentThread, f44035a)) {
                m17613c(threadCurrentThread);
            }
            if (z) {
                mo17573e(objMo17569a);
            }
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String str;
        Runnable runnable = (Runnable) get();
        if (runnable == f44035a) {
            str = "running=[DONE]";
        } else if (runnable instanceof npq) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            str = "running=[RUNNING ON " + ((Thread) runnable).getName() + "]";
        } else {
            str = "running=[NOT STARTED YET]";
        }
        return str + ", " + mo17570b();
    }
}
