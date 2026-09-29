package cc;

import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p176ib.C6272i;

/* JADX INFO: renamed from: cc.m4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1879m4 extends AbstractC1772a5 {

    /* JADX INFO: renamed from: k */
    public static final AtomicLong f9992k = new AtomicLong(Long.MIN_VALUE);

    /* JADX INFO: renamed from: c */
    public C1870l4 f9993c;

    /* JADX INFO: renamed from: d */
    public C1870l4 f9994d;

    /* JADX INFO: renamed from: e */
    public final PriorityBlockingQueue f9995e;

    /* JADX INFO: renamed from: f */
    public final LinkedBlockingQueue f9996f;

    /* JADX INFO: renamed from: g */
    public final C1852j4 f9997g;

    /* JADX INFO: renamed from: h */
    public final C1852j4 f9998h;

    /* JADX INFO: renamed from: i */
    public final Object f9999i;

    /* JADX INFO: renamed from: j */
    public final Semaphore f10000j;

    public C1879m4(C1897o4 c1897o4) {
        super(c1897o4);
        this.f9999i = new Object();
        this.f10000j = new Semaphore(2);
        this.f9995e = new PriorityBlockingQueue();
        this.f9996f = new LinkedBlockingQueue();
        this.f9997g = new C1852j4(this, "Thread death: Uncaught exception on worker thread");
        this.f9998h = new C1852j4(this, "Thread death: Uncaught exception on network thread");
    }

    @Override // cc.C1995z4
    /* JADX INFO: renamed from: g */
    public final void mo5748g() {
        if (Thread.currentThread() != this.f9993c) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    @Override // cc.AbstractC1772a5
    /* JADX INFO: renamed from: h */
    public final boolean mo5491h() {
        return false;
    }

    /* JADX INFO: renamed from: l */
    public final void m5749l() {
        if (Thread.currentThread() != this.f9994d) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: m */
    public final Object m5750m(AtomicReference atomicReference, long j10, String str, Runnable runnable) {
        synchronized (atomicReference) {
            C1879m4 c1879m4 = ((C1897o4) this.f10430a).f10087j;
            C1897o4.m5776k(c1879m4);
            c1879m4.m5753p(runnable);
            try {
                atomicReference.wait(j10);
            } catch (InterruptedException unused) {
                C1860k3 c1860k3 = ((C1897o4) this.f10430a).f10086i;
                C1897o4.m5776k(c1860k3);
                c1860k3.f9945i.m5623a("Interrupted waiting for ".concat(str));
                return null;
            }
        }
        Object obj = atomicReference.get();
        if (obj == null) {
            C1860k3 c1860k4 = ((C1897o4) this.f10430a).f10086i;
            C1897o4.m5776k(c1860k4);
            c1860k4.f9945i.m5623a("Timed out waiting for ".concat(str));
        }
        return obj;
    }

    /* JADX INFO: renamed from: n */
    public final C1861k4 m5751n(Callable callable) throws IllegalStateException {
        m5492j();
        C1861k4 c1861k4 = new C1861k4(this, callable, false);
        if (Thread.currentThread() == this.f9993c) {
            if (!this.f9995e.isEmpty()) {
                C1860k3 c1860k3 = ((C1897o4) this.f10430a).f10086i;
                C1897o4.m5776k(c1860k3);
                c1860k3.f9945i.m5623a("Callable skipped the worker queue.");
            }
            c1861k4.run();
        } else {
            m5756s(c1861k4);
        }
        return c1861k4;
    }

    /* JADX INFO: renamed from: o */
    public final void m5752o(Runnable runnable) throws IllegalStateException {
        m5492j();
        C1861k4 c1861k4 = new C1861k4(this, runnable, false, "Task exception on network thread");
        synchronized (this.f9999i) {
            this.f9996f.add(c1861k4);
            C1870l4 c1870l4 = this.f9994d;
            if (c1870l4 == null) {
                C1870l4 c1870l5 = new C1870l4(this, "Measurement Network", this.f9996f);
                this.f9994d = c1870l5;
                c1870l5.setUncaughtExceptionHandler(this.f9998h);
                this.f9994d.start();
            } else {
                synchronized (c1870l4.f9975a) {
                    c1870l4.f9975a.notifyAll();
                }
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m5753p(Runnable runnable) throws IllegalStateException {
        m5492j();
        C6272i.m12915i(runnable);
        m5756s(new C1861k4(this, runnable, false, "Task exception on worker thread"));
    }

    /* JADX INFO: renamed from: q */
    public final void m5754q(Runnable runnable) throws IllegalStateException {
        m5492j();
        m5756s(new C1861k4(this, runnable, true, "Task exception on worker thread"));
    }

    /* JADX INFO: renamed from: r */
    public final boolean m5755r() {
        return Thread.currentThread() == this.f9993c;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: s */
    public final void m5756s(C1861k4 c1861k4) {
        synchronized (this.f9999i) {
            this.f9995e.add(c1861k4);
            C1870l4 c1870l4 = this.f9993c;
            if (c1870l4 == null) {
                C1870l4 c1870l5 = new C1870l4(this, "Measurement Worker", this.f9995e);
                this.f9993c = c1870l5;
                c1870l5.setUncaughtExceptionHandler(this.f9997g);
                this.f9993c.start();
            } else {
                synchronized (c1870l4.f9975a) {
                    try {
                        c1870l4.f9975a.notifyAll();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
    }
}
