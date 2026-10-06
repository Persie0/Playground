package p000;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class oqw extends oro implements Runnable {
    private static volatile Thread _thread;

    /* JADX INFO: renamed from: c */
    public static final oqw f46435c;
    private static volatile int debugStatus;

    /* JADX INFO: renamed from: g */
    private static final long f46436g;

    static {
        Long l;
        oqw oqwVar = new oqw();
        f46435c = oqwVar;
        oqwVar.m18956m(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException e) {
            l = 1000L;
        }
        f46436g = timeUnit.toNanos(l.longValue());
    }

    private oqw() {
    }

    /* JADX INFO: renamed from: v */
    private final synchronized Thread m18935v() {
        Thread thread = _thread;
        if (thread != null) {
            return thread;
        }
        Thread thread2 = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
        _thread = thread2;
        thread2.setDaemon(true);
        thread2.start();
        return thread2;
    }

    /* JADX INFO: renamed from: w */
    private final synchronized void m18936w() {
        if (m18938y()) {
            debugStatus = 3;
            ((oro) this).f46462e.m18855c(null);
            this.f46463f.m18855c(null);
            notifyAll();
        }
    }

    /* JADX INFO: renamed from: x */
    private final synchronized boolean m18937x() {
        if (m18938y()) {
            return false;
        }
        debugStatus = 1;
        notifyAll();
        return true;
    }

    /* JADX INFO: renamed from: y */
    private static final boolean m18938y() {
        int i = debugStatus;
        return i == 2 || i == 3;
    }

    /* JADX INFO: renamed from: z */
    private static final void m18939z() {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // p000.orj
    /* JADX INFO: renamed from: c */
    protected final Thread mo18868c() {
        Thread thread = _thread;
        return thread == null ? m18935v() : thread;
    }

    @Override // p000.oro, p000.oqy
    /* JADX INFO: renamed from: f */
    public final orf mo18940f(long j, Runnable runnable, oly olyVar) {
        olyVar.getClass();
        long jNanoTime = System.nanoTime();
        orl orlVar = new orl(orp.m18969a(j) + jNanoTime, runnable);
        m18966s(jNanoTime, orlVar);
        return orlVar;
    }

    @Override // p000.oro
    /* JADX INFO: renamed from: g */
    public final void mo18941g(Runnable runnable) {
        if (debugStatus == 4) {
            m18939z();
        }
        super.mo18941g(runnable);
    }

    @Override // p000.orj
    /* JADX INFO: renamed from: h */
    protected final void mo18942h(long j, orm ormVar) {
        m18939z();
    }

    @Override // p000.oro, p000.orj
    /* JADX INFO: renamed from: i */
    public final void mo18943i() {
        debugStatus = 4;
        super.mo18943i();
    }

    @Override // java.lang.Runnable
    public final void run() {
        ThreadLocal threadLocal = oss.f46499a;
        oss.f46499a.set(this);
        try {
            if (!m18937x()) {
                _thread = null;
                m18936w();
                if (m18968u()) {
                    return;
                } else {
                    return;
                }
            }
            long j = Long.MAX_VALUE;
            while (true) {
                Thread.interrupted();
                long jMo18953j = mo18953j();
                if (jMo18953j == Long.MAX_VALUE) {
                    long jNanoTime = System.nanoTime();
                    if (j == Long.MAX_VALUE) {
                        j = f46436g + jNanoTime;
                    }
                    long j2 = j - jNanoTime;
                    if (j2 <= 0) {
                        _thread = null;
                        m18936w();
                        if (m18968u()) {
                            return;
                        } else {
                            return;
                        }
                    }
                    jMo18953j = ook.m18792f(Long.MAX_VALUE, j2);
                } else {
                    j = Long.MAX_VALUE;
                }
                if (jMo18953j > 0) {
                    if (m18938y()) {
                        _thread = null;
                        m18936w();
                        if (m18968u()) {
                            return;
                        } else {
                            return;
                        }
                    }
                    LockSupport.parkNanos(this, jMo18953j);
                }
            }
        } finally {
            _thread = null;
            m18936w();
            if (!m18968u()) {
                mo18868c();
            }
        }
    }
}
