package p000;

import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class tic extends ooc {

    /* JADX INFO: renamed from: k */
    public static final AtomicLong f62353k = new AtomicLong(Long.MIN_VALUE);

    /* JADX INFO: renamed from: c */
    public nic f62354c;

    /* JADX INFO: renamed from: d */
    public nic f62355d;

    /* JADX INFO: renamed from: e */
    public final PriorityBlockingQueue f62356e;

    /* JADX INFO: renamed from: f */
    public final LinkedBlockingQueue f62357f;

    /* JADX INFO: renamed from: g */
    public final eic f62358g;

    /* JADX INFO: renamed from: h */
    public final eic f62359h;

    /* JADX INFO: renamed from: i */
    public final Object f62360i;

    /* JADX INFO: renamed from: j */
    public final Semaphore f62361j;

    public tic(kjc kjcVar) {
        super(kjcVar);
        this.f62360i = new Object();
        this.f62361j = new Semaphore(2);
        this.f62356e = new PriorityBlockingQueue();
        this.f62357f = new LinkedBlockingQueue();
        this.f62358g = new eic(this, "Thread death: Uncaught exception on worker thread");
        this.f62359h = new eic(this, "Thread death: Uncaught exception on network thread");
    }

    @Override // p000.AbstractC3572sf
    /* JADX INFO: renamed from: D */
    public final void mo12359D() {
        if (Thread.currentThread() == this.f62354c) {
            return;
        }
        C3386nv.m17633t("Call expected from worker thread");
    }

    @Override // p000.ooc
    /* JADX INFO: renamed from: E */
    public final boolean mo12250E() {
        return false;
    }

    /* JADX INFO: renamed from: H */
    public final void m22071H() {
        if (Thread.currentThread() == this.f62355d) {
            return;
        }
        C3386nv.m17633t("Call expected from network thread");
    }

    /* JADX INFO: renamed from: I */
    public final void m22072I() {
        if (Thread.currentThread() != this.f62354c) {
            return;
        }
        C3386nv.m17633t("Call not expected from worker thread");
    }

    /* JADX INFO: renamed from: J */
    public final boolean m22073J() {
        return Thread.currentThread() == this.f62354c;
    }

    /* JADX INFO: renamed from: K */
    public final jic m22074K(Callable callable) {
        m18192F();
        jic jicVar = new jic(this, callable, false);
        if (Thread.currentThread() != this.f62354c) {
            m22080Q(jicVar);
            return jicVar;
        }
        if (!this.f62356e.isEmpty()) {
            xcc xccVar = ((kjc) this.f60774a).f47438f;
            kjc.m15280l(xccVar);
            xccVar.f68083i.m17923a("Callable skipped the worker queue.");
        }
        jicVar.run();
        return jicVar;
    }

    /* JADX INFO: renamed from: L */
    public final jic m22075L(Callable callable) {
        m18192F();
        jic jicVar = new jic(this, callable, true);
        if (Thread.currentThread() == this.f62354c) {
            jicVar.run();
            return jicVar;
        }
        m22080Q(jicVar);
        return jicVar;
    }

    /* JADX INFO: renamed from: M */
    public final void m22076M(Runnable runnable) {
        m18192F();
        lda.m16130p(runnable);
        m22080Q(new jic(this, runnable, false, "Task exception on worker thread"));
    }

    /* JADX INFO: renamed from: N */
    public final Object m22077N(AtomicReference atomicReference, long j, String str, Runnable runnable) {
        synchronized (atomicReference) {
            tic ticVar = ((kjc) this.f60774a).f47439g;
            kjc.m15280l(ticVar);
            ticVar.m22076M(runnable);
            try {
                atomicReference.wait(j);
            } catch (InterruptedException unused) {
                xcc xccVar = ((kjc) this.f60774a).f47438f;
                kjc.m15280l(xccVar);
                occ occVar = xccVar.f68083i;
                StringBuilder sb = new StringBuilder(str.length() + 24);
                sb.append("Interrupted waiting for ");
                sb.append(str);
                occVar.m17923a(sb.toString());
                return null;
            }
        }
        Object obj = atomicReference.get();
        if (obj == null) {
            xcc xccVar2 = ((kjc) this.f60774a).f47438f;
            kjc.m15280l(xccVar2);
            xccVar2.f68083i.m17923a("Timed out waiting for ".concat(str));
        }
        return obj;
    }

    /* JADX INFO: renamed from: O */
    public final void m22078O(Runnable runnable) {
        m18192F();
        m22080Q(new jic(this, runnable, true, "Task exception on worker thread"));
    }

    /* JADX INFO: renamed from: P */
    public final void m22079P(Runnable runnable) {
        m18192F();
        jic jicVar = new jic(this, runnable, false, "Task exception on network thread");
        synchronized (this.f62360i) {
            try {
                LinkedBlockingQueue linkedBlockingQueue = this.f62357f;
                linkedBlockingQueue.add(jicVar);
                nic nicVar = this.f62355d;
                if (nicVar == null) {
                    nic nicVar2 = new nic(this, "Measurement Network", linkedBlockingQueue);
                    this.f62355d = nicVar2;
                    nicVar2.setUncaughtExceptionHandler(this.f62359h);
                    this.f62355d.start();
                } else {
                    Object obj = nicVar.f52780a;
                    synchronized (obj) {
                        obj.notifyAll();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: Q */
    public final void m22080Q(jic jicVar) {
        synchronized (this.f62360i) {
            try {
                PriorityBlockingQueue priorityBlockingQueue = this.f62356e;
                priorityBlockingQueue.add(jicVar);
                nic nicVar = this.f62354c;
                if (nicVar == null) {
                    nic nicVar2 = new nic(this, "Measurement Worker", priorityBlockingQueue);
                    this.f62354c = nicVar2;
                    nicVar2.setUncaughtExceptionHandler(this.f62358g);
                    this.f62354c.start();
                } else {
                    Object obj = nicVar.f52780a;
                    synchronized (obj) {
                        obj.notifyAll();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
