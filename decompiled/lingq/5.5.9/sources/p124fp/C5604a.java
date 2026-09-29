package p124fp;

import dm.C5207g;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import sl.C9072e;

/* JADX INFO: renamed from: fp.a */
/* JADX INFO: loaded from: classes2.dex */
public class C5604a extends C5628y {

    /* JADX INFO: renamed from: h */
    public static final long f34424h;

    /* JADX INFO: renamed from: i */
    public static final long f34425i;

    /* JADX INFO: renamed from: j */
    public static C5604a f34426j;

    /* JADX INFO: renamed from: e */
    public boolean f34427e;

    /* JADX INFO: renamed from: f */
    public C5604a f34428f;

    /* JADX INFO: renamed from: g */
    public long f34429g;

    /* JADX INFO: renamed from: fp.a$a */
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static C5604a m11920a() throws InterruptedException {
            C5604a c5604a = C5604a.f34426j;
            C5207g.m11108c(c5604a);
            C5604a c5604a2 = c5604a.f34428f;
            C5604a c5604a3 = null;
            if (c5604a2 == null) {
                long jNanoTime = System.nanoTime();
                C5604a.class.wait(C5604a.f34424h);
                C5604a c5604a4 = C5604a.f34426j;
                C5207g.m11108c(c5604a4);
                if (c5604a4.f34428f == null && System.nanoTime() - jNanoTime >= C5604a.f34425i) {
                    c5604a3 = C5604a.f34426j;
                }
                return c5604a3;
            }
            long jNanoTime2 = c5604a2.f34429g - System.nanoTime();
            if (jNanoTime2 > 0) {
                long j10 = jNanoTime2 / 1000000;
                C5604a.class.wait(j10, (int) (jNanoTime2 - (1000000 * j10)));
                return null;
            }
            C5604a c5604a5 = C5604a.f34426j;
            C5207g.m11108c(c5604a5);
            c5604a5.f34428f = c5604a2.f34428f;
            c5604a2.f34428f = null;
            return c5604a2;
        }
    }

    /* JADX INFO: renamed from: fp.a$b */
    public static final class b extends Thread {
        public b() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            C5604a c5604aM11920a;
            while (true) {
                try {
                    synchronized (C5604a.class) {
                        try {
                            C5604a c5604a = C5604a.f34426j;
                            c5604aM11920a = a.m11920a();
                            if (c5604aM11920a == C5604a.f34426j) {
                                C5604a.f34426j = null;
                                return;
                            }
                            C9072e c9072e = C9072e.f47360a;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    if (c5604aM11920a != null) {
                        c5604aM11920a.mo11919k();
                    }
                } catch (InterruptedException unused) {
                    continue;
                }
            }
        }
    }

    static {
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f34424h = millis;
        f34425i = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: h */
    public final void m11916h() {
        C5604a c5604a;
        long j10 = this.f34477c;
        boolean z10 = this.f34475a;
        if (j10 != 0 || z10) {
            synchronized (C5604a.class) {
                if (!(!this.f34427e)) {
                    throw new IllegalStateException("Unbalanced enter/exit".toString());
                }
                this.f34427e = true;
                if (f34426j == null) {
                    f34426j = new C5604a();
                    new b().start();
                }
                long jNanoTime = System.nanoTime();
                if (j10 != 0 && z10) {
                    this.f34429g = Math.min(j10, mo11982c() - jNanoTime) + jNanoTime;
                } else if (j10 != 0) {
                    this.f34429g = j10 + jNanoTime;
                } else {
                    if (!z10) {
                        throw new AssertionError();
                    }
                    this.f34429g = mo11982c();
                }
                long j11 = this.f34429g - jNanoTime;
                C5604a c5604a2 = f34426j;
                C5207g.m11108c(c5604a2);
                while (true) {
                    c5604a = c5604a2.f34428f;
                    if (c5604a == null || j11 < c5604a.f34429g - jNanoTime) {
                        break;
                        break;
                    }
                    c5604a2 = c5604a;
                }
                this.f34428f = c5604a;
                c5604a2.f34428f = this;
                if (c5604a2 == f34426j) {
                    C5604a.class.notify();
                }
                C9072e c9072e = C9072e.f47360a;
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final boolean m11917i() {
        synchronized (C5604a.class) {
            try {
                if (!this.f34427e) {
                    return false;
                }
                this.f34427e = false;
                C5604a c5604a = f34426j;
                while (c5604a != null) {
                    C5604a c5604a2 = c5604a.f34428f;
                    if (c5604a2 == this) {
                        c5604a.f34428f = this.f34428f;
                        this.f34428f = null;
                        return false;
                    }
                    c5604a = c5604a2;
                }
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public IOException mo11918j(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    /* JADX INFO: renamed from: k */
    public void mo11919k() {
    }
}
