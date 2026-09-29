package p000;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes.dex */
public final class f62 extends du2 implements Runnable {

    /* JADX INFO: renamed from: H */
    public static final long f38511H;
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* JADX INFO: renamed from: l */
    public static final f62 f38512l;

    static {
        Long l;
        f62 f62Var = new f62();
        f38512l = f62Var;
        f62Var.m25313i0(false);
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        f38511H = TimeUnit.MILLISECONDS.toNanos(l.longValue());
    }

    @Override // p000.du2
    /* JADX INFO: renamed from: n0 */
    public final void mo10655n0(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.mo10655n0(runnable);
    }

    @Override // p000.du2
    /* JADX INFO: renamed from: r0 */
    public final Thread mo10659r0() {
        Thread thread;
        Thread thread2 = _thread;
        if (thread2 != null) {
            return thread2;
        }
        synchronized (this) {
            thread = _thread;
            if (thread == null) {
                thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                _thread = thread;
                thread.setContextClassLoader(f38512l.getClass().getClassLoader());
                thread.setDaemon(true);
                thread.start();
            }
        }
        return thread;
    }

    @Override // java.lang.Runnable
    public final void run() {
        qz9.f58430a.set(this);
        try {
            synchronized (this) {
                int i = debugStatus;
                if (i == 2 || i == 3) {
                    _thread = null;
                    m11564z0();
                    if (m10660s0()) {
                        return;
                    }
                    mo10659r0();
                    return;
                }
                debugStatus = 1;
                notifyAll();
                long j = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long jMo10652j0 = mo10652j0();
                    if (jMo10652j0 == Long.MAX_VALUE) {
                        long jNanoTime = System.nanoTime();
                        if (j == Long.MAX_VALUE) {
                            j = f38511H + jNanoTime;
                        }
                        long j2 = j - jNanoTime;
                        if (j2 <= 0) {
                            _thread = null;
                            m11564z0();
                            if (m10660s0()) {
                                return;
                            }
                            mo10659r0();
                            return;
                        }
                        if (jMo10652j0 > j2) {
                            jMo10652j0 = j2;
                        }
                    } else {
                        j = Long.MAX_VALUE;
                    }
                    if (jMo10652j0 > 0) {
                        int i2 = debugStatus;
                        if (i2 == 2 || i2 == 3) {
                            _thread = null;
                            m11564z0();
                            if (m10660s0()) {
                                return;
                            }
                            mo10659r0();
                            return;
                        }
                        LockSupport.parkNanos(this, jMo10652j0);
                    }
                }
            }
        } catch (Throwable th) {
            _thread = null;
            m11564z0();
            if (!m10660s0()) {
                mo10659r0();
            }
            throw th;
        }
    }

    @Override // p000.du2, p000.yt2
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // p000.du2
    /* JADX INFO: renamed from: t0 */
    public final void mo10661t0(long j, bu2 bu2Var) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // p000.nn1
    public final String toString() {
        return "DefaultExecutor";
    }

    @Override // p000.ca2
    /* JADX INFO: renamed from: x */
    public final ci2 mo4459x(long j, Runnable runnable, kn1 kn1Var) {
        long j2 = 0;
        if (j > 0) {
            j2 = j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j;
        }
        if (j2 >= 4611686018427387903L) {
            return yl6.f70031a;
        }
        long jNanoTime = System.nanoTime();
        au2 au2Var = new au2(runnable, j2 + jNanoTime);
        m10664w0(jNanoTime, au2Var);
        return au2Var;
    }

    /* JADX INFO: renamed from: z0 */
    public final synchronized void m11564z0() {
        int i = debugStatus;
        if (i == 2 || i == 3) {
            debugStatus = 3;
            m10663v0();
            notifyAll();
        }
    }
}
