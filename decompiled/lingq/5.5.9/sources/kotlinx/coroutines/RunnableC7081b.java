package kotlinx.coroutines;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import kotlin.coroutines.CoroutineContext;
import no.C7827e1;
import no.C7857o1;
import no.InterfaceC7838i0;

/* JADX INFO: renamed from: kotlinx.coroutines.b */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC7081b extends AbstractC7082c implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* JADX INFO: renamed from: i */
    public static final RunnableC7081b f40007i;

    /* JADX INFO: renamed from: j */
    public static final long f40008j;

    static {
        Long l10;
        RunnableC7081b runnableC7081b = new RunnableC7081b();
        f40007i = runnableC7081b;
        runnableC7081b.m15602E1(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l10 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l10 = 1000L;
        }
        f40008j = timeUnit.toNanos(l10.longValue());
    }

    @Override // kotlinx.coroutines.AbstractC7082c, no.InterfaceC7820c0
    /* JADX INFO: renamed from: G0 */
    public final InterfaceC7838i0 mo14318G0(long j10, Runnable runnable, CoroutineContext coroutineContext) {
        long j11 = 0;
        if (j10 > 0) {
            j11 = j10 >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j10;
        }
        if (j11 >= 4611686018427387903L) {
            return C7827e1.f42925a;
        }
        long jNanoTime = System.nanoTime();
        AbstractC7082c.b bVar = new AbstractC7082c.b(runnable, j11 + jNanoTime);
        m14329P1(jNanoTime, bVar);
        return bVar;
    }

    @Override // no.AbstractC7850m0
    /* JADX INFO: renamed from: I1 */
    public final Thread mo14320I1() {
        Thread thread = _thread;
        if (thread == null) {
            synchronized (this) {
                thread = _thread;
                if (thread == null) {
                    thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                    _thread = thread;
                    thread.setDaemon(true);
                    thread.start();
                }
            }
        }
        return thread;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // no.AbstractC7850m0
    /* JADX INFO: renamed from: J1 */
    public final void mo14321J1(long j10, AbstractC7082c.c cVar) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // kotlinx.coroutines.AbstractC7082c
    /* JADX INFO: renamed from: L1 */
    public final void mo14322L1(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.mo14322L1(runnable);
    }

    /* JADX INFO: renamed from: Q1 */
    public final synchronized void m14323Q1() {
        try {
            int i10 = debugStatus;
            if (i10 == 2 || i10 == 3) {
                debugStatus = 3;
                m14328O1();
                notifyAll();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        C7857o1.f42954a.set(this);
        try {
            synchronized (this) {
                int i10 = debugStatus;
                if (i10 == 2 || i10 == 3) {
                    z10 = false;
                } else {
                    debugStatus = 1;
                    notifyAll();
                    z10 = true;
                }
            }
            if (!z10) {
                _thread = null;
                m14323Q1();
                if (m14327N1()) {
                    return;
                }
                mo14320I1();
                return;
            }
            long j10 = Long.MAX_VALUE;
            while (true) {
                Thread.interrupted();
                long jMo14325G1 = mo14325G1();
                if (jMo14325G1 == Long.MAX_VALUE) {
                    long jNanoTime = System.nanoTime();
                    if (j10 == Long.MAX_VALUE) {
                        j10 = f40008j + jNanoTime;
                    }
                    long j11 = j10 - jNanoTime;
                    if (j11 <= 0) {
                        _thread = null;
                        m14323Q1();
                        if (m14327N1()) {
                            return;
                        }
                        mo14320I1();
                        return;
                    }
                    if (jMo14325G1 > j11) {
                        jMo14325G1 = j11;
                    }
                } else {
                    j10 = Long.MAX_VALUE;
                }
                if (jMo14325G1 > 0) {
                    int i11 = debugStatus;
                    if (i11 == 2 || i11 == 3) {
                        _thread = null;
                        m14323Q1();
                        if (m14327N1()) {
                            return;
                        }
                        mo14320I1();
                        return;
                    }
                    LockSupport.parkNanos(this, jMo14325G1);
                }
            }
        } catch (Throwable th2) {
            _thread = null;
            m14323Q1();
            if (!m14327N1()) {
                mo14320I1();
            }
            throw th2;
        }
    }

    @Override // kotlinx.coroutines.AbstractC7082c, no.AbstractC7847l0
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }
}
