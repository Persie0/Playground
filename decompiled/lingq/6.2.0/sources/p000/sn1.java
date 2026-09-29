package p000;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState;

/* JADX INFO: loaded from: classes.dex */
public final class sn1 extends Thread {

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f61046i = AtomicIntegerFieldUpdater.newUpdater(sn1.class, "workerCtl$volatile");

    /* JADX INFO: renamed from: a */
    public final j8b f61047a;

    /* JADX INFO: renamed from: b */
    public final Ref$ObjectRef f61048b;

    /* JADX INFO: renamed from: c */
    public CoroutineScheduler$WorkerState f61049c;

    /* JADX INFO: renamed from: d */
    public long f61050d;

    /* JADX INFO: renamed from: e */
    public long f61051e;

    /* JADX INFO: renamed from: f */
    public int f61052f;

    /* JADX INFO: renamed from: g */
    public boolean f61053g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ tn1 f61054h;
    private volatile int indexInArray;
    private volatile Object nextParkedWorker;
    private volatile /* synthetic */ int workerCtl$volatile;

    public sn1(tn1 tn1Var, int i) {
        this.f61054h = tn1Var;
        setDaemon(true);
        setContextClassLoader(tn1.class.getClassLoader());
        this.f61047a = new j8b();
        this.f61048b = new Ref$ObjectRef();
        this.f61049c = CoroutineScheduler$WorkerState.DORMANT;
        this.nextParkedWorker = tn1.f62555k;
        int iNanoTime = (int) System.nanoTime();
        this.f61052f = iNanoTime == 0 ? 42 : iNanoTime;
        m21490f(i);
    }

    /* JADX INFO: renamed from: a */
    public final rr9 m21485a(boolean z) {
        rr9 rr9VarM21489e;
        rr9 rr9VarM21489e2;
        long j;
        CoroutineScheduler$WorkerState coroutineScheduler$WorkerState = this.f61049c;
        CoroutineScheduler$WorkerState coroutineScheduler$WorkerState2 = CoroutineScheduler$WorkerState.CPU_ACQUIRED;
        tn1 tn1Var = this.f61054h;
        j8b j8bVar = this.f61047a;
        if (coroutineScheduler$WorkerState != coroutineScheduler$WorkerState2) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = tn1.f62553i;
            do {
                j = atomicLongFieldUpdater.get(tn1Var);
                if (((int) ((9223367638808264704L & j) >> 42)) == 0) {
                    rr9 rr9VarM14335g = j8bVar.m14335g();
                    return (rr9VarM14335g == null && (rr9VarM14335g = (rr9) tn1Var.f62561f.m3779d()) == null) ? m21493i(1) : rr9VarM14335g;
                }
            } while (!tn1.f62553i.compareAndSet(tn1Var, j, j - 4398046511104L));
            this.f61049c = CoroutineScheduler$WorkerState.CPU_ACQUIRED;
        }
        if (z) {
            boolean z2 = m21488d(tn1Var.f62556a * 2) == 0;
            if (z2 && (rr9VarM21489e2 = m21489e()) != null) {
                return rr9VarM21489e2;
            }
            rr9 rr9VarM14333e = j8bVar.m14333e();
            if (rr9VarM14333e != null) {
                return rr9VarM14333e;
            }
            if (!z2 && (rr9VarM21489e = m21489e()) != null) {
                return rr9VarM21489e;
            }
        } else {
            rr9 rr9VarM21489e3 = m21489e();
            if (rr9VarM21489e3 != null) {
                return rr9VarM21489e3;
            }
        }
        return m21493i(3);
    }

    /* JADX INFO: renamed from: b */
    public final int m21486b() {
        return this.indexInArray;
    }

    /* JADX INFO: renamed from: c */
    public final Object m21487c() {
        return this.nextParkedWorker;
    }

    /* JADX INFO: renamed from: d */
    public final int m21488d(int i) {
        int i2 = this.f61052f;
        int i3 = i2 ^ (i2 << 13);
        int i4 = i3 ^ (i3 >> 17);
        int i5 = i4 ^ (i4 << 5);
        this.f61052f = i5;
        int i6 = i - 1;
        return (i6 & i) == 0 ? i6 & i5 : (Integer.MAX_VALUE & i5) % i;
    }

    /* JADX INFO: renamed from: e */
    public final rr9 m21489e() {
        int iM21488d = m21488d(2);
        tn1 tn1Var = this.f61054h;
        vn3 vn3Var = tn1Var.f62561f;
        vn3 vn3Var2 = tn1Var.f62560e;
        if (iM21488d == 0) {
            rr9 rr9Var = (rr9) vn3Var2.m3779d();
            return rr9Var != null ? rr9Var : (rr9) vn3Var.m3779d();
        }
        rr9 rr9Var2 = (rr9) vn3Var.m3779d();
        return rr9Var2 != null ? rr9Var2 : (rr9) vn3Var2.m3779d();
    }

    /* JADX INFO: renamed from: f */
    public final void m21490f(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f61054h.f62559d);
        sb.append("-worker-");
        sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
        setName(sb.toString());
        this.indexInArray = i;
    }

    /* JADX INFO: renamed from: g */
    public final void m21491g(Object obj) {
        this.nextParkedWorker = obj;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m21492h(CoroutineScheduler$WorkerState coroutineScheduler$WorkerState) {
        CoroutineScheduler$WorkerState coroutineScheduler$WorkerState2 = this.f61049c;
        boolean z = coroutineScheduler$WorkerState2 == CoroutineScheduler$WorkerState.CPU_ACQUIRED;
        if (z) {
            tn1.f62553i.addAndGet(this.f61054h, 4398046511104L);
        }
        if (coroutineScheduler$WorkerState2 != coroutineScheduler$WorkerState) {
            this.f61049c = coroutineScheduler$WorkerState;
        }
        return z;
    }

    /* JADX INFO: renamed from: i */
    public final rr9 m21493i(int i) {
        rr9 rr9VarM14336h;
        long jM14337i;
        AtomicLongFieldUpdater atomicLongFieldUpdater = tn1.f62553i;
        tn1 tn1Var = this.f61054h;
        int i2 = (int) (atomicLongFieldUpdater.get(tn1Var) & 2097151);
        if (i2 < 2) {
            return null;
        }
        int iM21488d = m21488d(i2);
        long jMin = Long.MAX_VALUE;
        for (int i3 = 0; i3 < i2; i3++) {
            iM21488d++;
            if (iM21488d > i2) {
                iM21488d = 1;
            }
            sn1 sn1Var = (sn1) tn1Var.f62562g.m19704b(iM21488d);
            if (sn1Var != null && sn1Var != this) {
                j8b j8bVar = sn1Var.f61047a;
                j8bVar.getClass();
                if (i != 3) {
                    boolean z = i == 1;
                    int i4 = j8b.f45221d.get(j8bVar);
                    int i5 = j8b.f45220c.get(j8bVar);
                    while (true) {
                        if (i4 == i5 || (z && j8b.f45222e.get(j8bVar) == 0)) {
                            rr9VarM14336h = null;
                            break;
                        }
                        int i6 = i4 + 1;
                        rr9VarM14336h = j8bVar.m14336h(i4, z);
                        if (rr9VarM14336h != null) {
                            break;
                        }
                        i4 = i6;
                    }
                } else {
                    rr9VarM14336h = j8bVar.m14334f();
                }
                Ref$ObjectRef ref$ObjectRef = this.f61048b;
                if (rr9VarM14336h != null) {
                    ref$ObjectRef.f47718a = rr9VarM14336h;
                    jM14337i = -1;
                } else {
                    jM14337i = j8bVar.m14337i(i, ref$ObjectRef);
                }
                if (jM14337i == -1) {
                    rr9 rr9Var = (rr9) ref$ObjectRef.f47718a;
                    ref$ObjectRef.f47718a = null;
                    return rr9Var;
                }
                if (jM14337i > 0) {
                    jMin = Math.min(jMin, jM14337i);
                }
            }
        }
        if (jMin == Long.MAX_VALUE) {
            jMin = 0;
        }
        this.f61051e = jMin;
        return null;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        long j;
        loop0: while (true) {
            boolean z = false;
            while (true) {
                if (tn1.f62554j.get(this.f61054h) != 1) {
                    CoroutineScheduler$WorkerState coroutineScheduler$WorkerState = this.f61049c;
                    CoroutineScheduler$WorkerState coroutineScheduler$WorkerState2 = CoroutineScheduler$WorkerState.TERMINATED;
                    if (coroutineScheduler$WorkerState == coroutineScheduler$WorkerState2) {
                        break loop0;
                    }
                    rr9 rr9VarM21485a = m21485a(this.f61053g);
                    if (rr9VarM21485a != null) {
                        this.f61051e = 0L;
                        tn1 tn1Var = this.f61054h;
                        this.f61050d = 0L;
                        if (this.f61049c == CoroutineScheduler$WorkerState.PARKING) {
                            this.f61049c = CoroutineScheduler$WorkerState.BLOCKING;
                        }
                        if (!rr9VarM21485a.f59743b) {
                            try {
                                rr9VarM21485a.run();
                                break;
                            } catch (Throwable th) {
                                Thread threadCurrentThread = Thread.currentThread();
                                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
                                break;
                            }
                        }
                        if (m21492h(CoroutineScheduler$WorkerState.BLOCKING) && !tn1Var.m22244p() && !tn1Var.m22243n(tn1.f62553i.get(tn1Var))) {
                            tn1Var.m22244p();
                        }
                        try {
                            rr9VarM21485a.run();
                        } catch (Throwable th2) {
                            Thread threadCurrentThread2 = Thread.currentThread();
                            threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th2);
                        }
                        tn1.f62553i.addAndGet(tn1Var, -2097152L);
                        if (this.f61049c == coroutineScheduler$WorkerState2) {
                            break;
                        }
                        this.f61049c = CoroutineScheduler$WorkerState.DORMANT;
                        break;
                    }
                    this.f61053g = false;
                    if (this.f61051e == 0) {
                        Object obj = this.nextParkedWorker;
                        C0842cc c0842cc = tn1.f62555k;
                        if (obj != c0842cc) {
                            f61046i.set(this, -1);
                            while (this.nextParkedWorker != tn1.f62555k) {
                                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f61046i;
                                if (atomicIntegerFieldUpdater.get(this) != -1) {
                                    break;
                                }
                                tn1 tn1Var2 = this.f61054h;
                                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = tn1.f62554j;
                                if (atomicIntegerFieldUpdater2.get(tn1Var2) == 1) {
                                    break;
                                }
                                CoroutineScheduler$WorkerState coroutineScheduler$WorkerState3 = this.f61049c;
                                CoroutineScheduler$WorkerState coroutineScheduler$WorkerState4 = CoroutineScheduler$WorkerState.TERMINATED;
                                if (coroutineScheduler$WorkerState3 == coroutineScheduler$WorkerState4) {
                                    break;
                                }
                                m21492h(CoroutineScheduler$WorkerState.PARKING);
                                Thread.interrupted();
                                if (this.f61050d == 0) {
                                    j = 2097151;
                                    this.f61050d = System.nanoTime() + this.f61054h.f62558c;
                                } else {
                                    j = 2097151;
                                }
                                LockSupport.parkNanos(this.f61054h.f62558c);
                                if (System.nanoTime() - this.f61050d >= 0) {
                                    this.f61050d = 0L;
                                    tn1 tn1Var3 = this.f61054h;
                                    synchronized (tn1Var3.f62562g) {
                                        try {
                                            if (!(atomicIntegerFieldUpdater2.get(tn1Var3) == 1)) {
                                                AtomicLongFieldUpdater atomicLongFieldUpdater = tn1.f62553i;
                                                if (((int) (atomicLongFieldUpdater.get(tn1Var3) & j)) > tn1Var3.f62556a && atomicIntegerFieldUpdater.compareAndSet(this, -1, 1)) {
                                                    int i = this.indexInArray;
                                                    m21490f(0);
                                                    tn1Var3.m22242e(this, i, 0);
                                                    int andDecrement = (int) (atomicLongFieldUpdater.getAndDecrement(tn1Var3) & j);
                                                    if (andDecrement != i) {
                                                        Object objM19704b = tn1Var3.f62562g.m19704b(andDecrement);
                                                        objM19704b.getClass();
                                                        sn1 sn1Var = (sn1) objM19704b;
                                                        tn1Var3.f62562g.m19705c(i, sn1Var);
                                                        sn1Var.m21490f(i);
                                                        tn1Var3.m22242e(sn1Var, andDecrement, i);
                                                    }
                                                    tn1Var3.f62562g.m19705c(andDecrement, null);
                                                    this.f61049c = coroutineScheduler$WorkerState4;
                                                }
                                            }
                                        } catch (Throwable th3) {
                                            throw th3;
                                        }
                                    }
                                }
                            }
                        } else {
                            tn1 tn1Var4 = this.f61054h;
                            if (this.nextParkedWorker == c0842cc) {
                                AtomicLongFieldUpdater atomicLongFieldUpdater2 = tn1.f62552h;
                                while (true) {
                                    long j2 = atomicLongFieldUpdater2.get(tn1Var4);
                                    int i2 = this.indexInArray;
                                    this.nextParkedWorker = tn1Var4.f62562g.m19704b((int) (j2 & 2097151));
                                    tn1 tn1Var5 = tn1Var4;
                                    if (tn1.f62552h.compareAndSet(tn1Var5, j2, ((j2 + 2097152) & (-2097152)) | ((long) i2))) {
                                        break;
                                    } else {
                                        tn1Var4 = tn1Var5;
                                    }
                                }
                            }
                        }
                    } else {
                        if (z) {
                            m21492h(CoroutineScheduler$WorkerState.PARKING);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.f61051e);
                            this.f61051e = 0L;
                            break;
                        }
                        z = true;
                    }
                } else {
                    break loop0;
                }
            }
        }
        m21492h(CoroutineScheduler$WorkerState.TERMINATED);
    }
}
