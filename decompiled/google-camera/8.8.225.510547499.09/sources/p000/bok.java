package p000;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import java.util.LinkedList;
import java.util.Queue;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bok extends Thread {

    /* JADX INFO: renamed from: c */
    private static final boo f4013c = new boo("DispatchThread");

    /* JADX INFO: renamed from: a */
    public final Queue f4014a;

    /* JADX INFO: renamed from: b */
    public Boolean f4015b;

    /* JADX INFO: renamed from: d */
    private final Handler f4016d;

    /* JADX INFO: renamed from: e */
    private final HandlerThread f4017e;

    public bok(Handler handler, HandlerThread handlerThread) {
        super("Camera Job Dispatch Thread");
        this.f4014a = new LinkedList();
        this.f4015b = new Boolean(false);
        this.f4016d = handler;
        this.f4017e = handlerThread;
    }

    /* JADX INFO: renamed from: c */
    private final boolean m2805c() {
        boolean zBooleanValue;
        synchronized (this.f4015b) {
            zBooleanValue = this.f4015b.booleanValue();
        }
        return zBooleanValue;
    }

    /* JADX INFO: renamed from: a */
    public final void m2806a(Runnable runnable) {
        if (m2805c()) {
            throw new IllegalStateException("Trying to run job on interrupted dispatcher thread");
        }
        synchronized (this.f4014a) {
            if (this.f4014a.size() == 256) {
                throw new RuntimeException("Camera master thread job queue full");
            }
            this.f4014a.add(runnable);
            this.f4014a.notifyAll();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m2807b(Runnable runnable, Object obj, String str) {
        String strConcat = "Timeout waiting 3500ms for ".concat(str);
        synchronized (obj) {
            long jUptimeMillis = SystemClock.uptimeMillis() + 3500;
            try {
                m2806a(runnable);
                obj.wait(3500L);
                if (SystemClock.uptimeMillis() > jUptimeMillis) {
                    throw new IllegalStateException(strConcat);
                }
            } catch (InterruptedException e) {
                if (SystemClock.uptimeMillis() > jUptimeMillis) {
                    throw new IllegalStateException(strConcat);
                }
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Runnable runnable;
        while (true) {
            synchronized (this.f4014a) {
                while (this.f4014a.size() == 0 && !m2805c()) {
                    try {
                        try {
                            this.f4014a.wait();
                        } catch (InterruptedException e) {
                            bop.m2814c(f4013c, "Dispatcher thread wait() interrupted, exiting");
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                runnable = (Runnable) this.f4014a.poll();
            }
            if (runnable != null) {
                runnable.run();
                synchronized (this) {
                    this.f4016d.post(new baa(this, 10));
                    try {
                        wait();
                    } catch (InterruptedException e2) {
                    }
                }
            } else if (m2805c()) {
                this.f4017e.quitSafely();
                return;
            }
        }
    }
}
