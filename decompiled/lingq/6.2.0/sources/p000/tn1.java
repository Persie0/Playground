package p000;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState;

/* JADX INFO: loaded from: classes.dex */
public final class tn1 implements Executor, Closeable {

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ AtomicLongFieldUpdater f62552h = AtomicLongFieldUpdater.newUpdater(tn1.class, "parkedWorkersStack$volatile");

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ AtomicLongFieldUpdater f62553i = AtomicLongFieldUpdater.newUpdater(tn1.class, "controlState$volatile");

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f62554j = AtomicIntegerFieldUpdater.newUpdater(tn1.class, "_isTerminated$volatile");

    /* JADX INFO: renamed from: k */
    public static final C0842cc f62555k = new C0842cc("NOT_IN_STACK", 5);
    private volatile /* synthetic */ int _isTerminated$volatile;

    /* JADX INFO: renamed from: a */
    public final int f62556a;

    /* JADX INFO: renamed from: b */
    public final int f62557b;

    /* JADX INFO: renamed from: c */
    public final long f62558c;
    private volatile /* synthetic */ long controlState$volatile;

    /* JADX INFO: renamed from: d */
    public final String f62559d;

    /* JADX INFO: renamed from: e */
    public final vn3 f62560e;

    /* JADX INFO: renamed from: f */
    public final vn3 f62561f;

    /* JADX INFO: renamed from: g */
    public final q78 f62562g;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    public tn1(int i, long j, String str, int i2) {
        this.f62556a = i;
        this.f62557b = i2;
        this.f62558c = j;
        this.f62559d = str;
        if (i < 1) {
            C3386nv.m17624j(ux5.m22989l("Core pool size ", i, " should be at least 1"));
            throw null;
        }
        if (i2 < i) {
            C3386nv.m17624j(wq1.m24115k("Max pool size ", i2, i, " should be greater than or equals to core pool size "));
            throw null;
        }
        if (i2 > 2097150) {
            C3386nv.m17624j(ux5.m22989l("Max pool size ", i2, " should not exceed maximal supported number of threads 2097150"));
            throw null;
        }
        if (j <= 0) {
            C3386nv.m17628o("Idle worker keep alive time ", j, " must be positive");
            throw null;
        }
        this.f62560e = new vn3();
        this.f62561f = new vn3();
        this.f62562g = new q78((i + 1) * 2);
        this.controlState$volatile = ((long) i) << 42;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m22239c(tn1 tn1Var, Runnable runnable, int i) {
        tn1Var.m22241b(runnable, false, (i & 4) == 0);
    }

    /* JADX INFO: renamed from: a */
    public final int m22240a() {
        synchronized (this.f62562g) {
            try {
                if (f62554j.get(this) == 1) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = f62553i;
                long j = atomicLongFieldUpdater.get(this);
                int i = (int) (j & 2097151);
                int i2 = i - ((int) ((j & 4398044413952L) >> 21));
                if (i2 < 0) {
                    i2 = 0;
                }
                if (i2 >= this.f62556a) {
                    return 0;
                }
                if (i >= this.f62557b) {
                    return 0;
                }
                int i3 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i3 <= 0 || this.f62562g.m19704b(i3) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                sn1 sn1Var = new sn1(this, i3);
                this.f62562g.m19705c(i3, sn1Var);
                if (i3 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i4 = i2 + 1;
                sn1Var.start();
                return i4;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m22241b(Runnable runnable, boolean z, boolean z2) {
        rr9 yr9Var;
        CoroutineScheduler$WorkerState coroutineScheduler$WorkerState;
        bs9.f8955f.getClass();
        long jNanoTime = System.nanoTime();
        if (runnable instanceof rr9) {
            yr9Var = (rr9) runnable;
            yr9Var.f59742a = jNanoTime;
            yr9Var.f59743b = z;
        } else {
            yr9Var = new yr9(runnable, jNanoTime, z);
        }
        boolean z3 = yr9Var.f59743b;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f62553i;
        long jAddAndGet = z3 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread threadCurrentThread = Thread.currentThread();
        sn1 sn1Var = null;
        sn1 sn1Var2 = threadCurrentThread instanceof sn1 ? (sn1) threadCurrentThread : null;
        if (sn1Var2 != null && sn1Var2.f61054h == this) {
            sn1Var = sn1Var2;
        }
        if (sn1Var != null && (coroutineScheduler$WorkerState = sn1Var.f61049c) != CoroutineScheduler$WorkerState.TERMINATED && (yr9Var.f59743b || coroutineScheduler$WorkerState != CoroutineScheduler$WorkerState.BLOCKING)) {
            sn1Var.f61053g = true;
            yr9Var = sn1Var.f61047a.m14329a(yr9Var, z2);
        }
        if (yr9Var != null) {
            if (!(yr9Var.f59743b ? this.f62561f.m3776a(yr9Var) : this.f62560e.m3776a(yr9Var))) {
                throw new RejectedExecutionException(AbstractC3393o1.m17738m(new StringBuilder(), this.f62559d, " was terminated"));
            }
        }
        if (z3) {
            if (m22244p() || m22243n(jAddAndGet)) {
                return;
            }
            m22244p();
            return;
        }
        if (m22244p() || m22243n(atomicLongFieldUpdater.get(this))) {
            return;
        }
        m22244p();
    }

    /* JADX WARN: Code duplicated, block: B:33:0x006e  */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws InterruptedException {
        int i;
        rr9 rr9VarM21485a;
        if (f62554j.compareAndSet(this, 0, 1)) {
            Thread threadCurrentThread = Thread.currentThread();
            sn1 sn1Var = null;
            sn1 sn1Var2 = threadCurrentThread instanceof sn1 ? (sn1) threadCurrentThread : null;
            if (sn1Var2 != null && sn1Var2.f61054h == this) {
                sn1Var = sn1Var2;
            }
            synchronized (this.f62562g) {
                i = (int) (f62553i.get(this) & 2097151);
            }
            if (1 <= i) {
                int i2 = 1;
                while (true) {
                    Object objM19704b = this.f62562g.m19704b(i2);
                    objM19704b.getClass();
                    sn1 sn1Var3 = (sn1) objM19704b;
                    if (sn1Var3 != sn1Var) {
                        while (sn1Var3.getState() != Thread.State.TERMINATED) {
                            LockSupport.unpark(sn1Var3);
                            sn1Var3.join(10000L);
                        }
                        sn1Var3.f61047a.m14332d(this.f62561f);
                    }
                    if (i2 == i) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            this.f62561f.m3777b();
            this.f62560e.m3777b();
            while (true) {
                if (sn1Var != null) {
                    rr9VarM21485a = sn1Var.m21485a(true);
                    if (rr9VarM21485a == null) {
                        rr9VarM21485a = (rr9) this.f62560e.m3779d();
                        if (rr9VarM21485a == null) {
                            break;
                            break;
                        }
                    }
                } else {
                    rr9VarM21485a = (rr9) this.f62560e.m3779d();
                    if (rr9VarM21485a == null && (rr9VarM21485a = (rr9) this.f62561f.m3779d()) == null) {
                        break;
                    }
                }
                try {
                    rr9VarM21485a.run();
                } catch (Throwable th) {
                    Thread threadCurrentThread2 = Thread.currentThread();
                    threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
                }
            }
            if (sn1Var != null) {
                sn1Var.m21492h(CoroutineScheduler$WorkerState.TERMINATED);
            }
            f62552h.set(this, 0L);
            f62553i.set(this, 0L);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m22242e(sn1 sn1Var, int i, int i2) {
        while (true) {
            long j = f62552h.get(this);
            int i3 = (int) (2097151 & j);
            long j2 = (2097152 + j) & (-2097152);
            if (i3 == i) {
                if (i2 == 0) {
                    Object objM21487c = sn1Var.m21487c();
                    while (true) {
                        if (objM21487c == f62555k) {
                            i3 = -1;
                            break;
                        }
                        if (objM21487c == null) {
                            i3 = 0;
                            break;
                        }
                        sn1 sn1Var2 = (sn1) objM21487c;
                        int iM21486b = sn1Var2.m21486b();
                        if (iM21486b != 0) {
                            i3 = iM21486b;
                            break;
                        }
                        objM21487c = sn1Var2.m21487c();
                    }
                } else {
                    i3 = i2;
                }
            }
            if (i3 >= 0) {
                tn1 tn1Var = this;
                if (f62552h.compareAndSet(tn1Var, j, ((long) i3) | j2)) {
                    return;
                } else {
                    this = tn1Var;
                }
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        m22239c(this, runnable, 6);
    }

    /* JADX INFO: renamed from: n */
    public final boolean m22243n(long j) {
        int i = ((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21));
        if (i < 0) {
            i = 0;
        }
        int i2 = this.f62556a;
        if (i < i2) {
            int iM22240a = m22240a();
            if (iM22240a == 1 && i2 > 1) {
                m22240a();
            }
            if (iM22240a > 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m22244p() {
        tn1 tn1Var;
        C0842cc c0842cc;
        int iM21486b;
        while (true) {
            long j = f62552h.get(this);
            sn1 sn1Var = (sn1) this.f62562g.m19704b((int) (2097151 & j));
            if (sn1Var == null) {
                sn1Var = null;
                tn1Var = this;
            } else {
                long j2 = (2097152 + j) & (-2097152);
                Object objM21487c = sn1Var.m21487c();
                while (true) {
                    c0842cc = f62555k;
                    if (objM21487c == c0842cc) {
                        iM21486b = -1;
                        break;
                    }
                    if (objM21487c == null) {
                        iM21486b = 0;
                        break;
                    }
                    sn1 sn1Var2 = (sn1) objM21487c;
                    iM21486b = sn1Var2.m21486b();
                    if (iM21486b != 0) {
                        break;
                    }
                    objM21487c = sn1Var2.m21487c();
                    j = j;
                }
                if (iM21486b >= 0) {
                    tn1 tn1Var2 = this;
                    boolean zCompareAndSet = f62552h.compareAndSet(tn1Var2, j, ((long) iM21486b) | j2);
                    tn1Var = tn1Var2;
                    if (zCompareAndSet) {
                        sn1Var.m21491g(c0842cc);
                    }
                    this = tn1Var;
                } else {
                    continue;
                }
            }
            if (sn1Var == null) {
                return false;
            }
            if (sn1.f61046i.compareAndSet(sn1Var, -1, 0)) {
                LockSupport.unpark(sn1Var);
                return true;
            }
            this = tn1Var;
        }
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        q78 q78Var = this.f62562g;
        int iM19703a = q78Var.m19703a();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 1; i6 < iM19703a; i6++) {
            sn1 sn1Var = (sn1) q78Var.m19704b(i6);
            if (sn1Var != null) {
                int iM14331c = sn1Var.f61047a.m14331c();
                int i7 = rn1.f59571a[sn1Var.f61049c.ordinal()];
                if (i7 == 1) {
                    i3++;
                } else if (i7 == 2) {
                    i2++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(iM14331c);
                    sb.append('b');
                    arrayList.add(sb.toString());
                } else if (i7 == 3) {
                    i++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(iM14331c);
                    sb2.append('c');
                    arrayList.add(sb2.toString());
                } else if (i7 == 4) {
                    i4++;
                    if (iM14331c > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(iM14331c);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else {
                    if (i7 != 5) {
                        gm5.m12750e();
                        return null;
                    }
                    i5++;
                }
            }
        }
        long j = f62553i.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.f62559d);
        sb4.append('@');
        sb4.append(d32.m10016N(this));
        sb4.append("[Pool Size {core = ");
        int i8 = this.f62556a;
        sb4.append(i8);
        sb4.append(", max = ");
        hn1.m13360j(this.f62557b, i, "}, Worker States {CPU = ", ", blocking = ", sb4);
        hn1.m13360j(i2, i3, ", parked = ", ", dormant = ", sb4);
        hn1.m13360j(i4, i5, ", terminated = ", "}, running workers queues = ", sb4);
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.f62560e.m3778c());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.f62561f.m3778c());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i8 - ((int) ((j & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }
}
