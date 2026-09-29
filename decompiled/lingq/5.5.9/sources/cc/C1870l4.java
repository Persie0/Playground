package cc;

import android.os.Process;
import java.util.concurrent.BlockingQueue;
import p176ib.C6272i;

/* JADX INFO: renamed from: cc.l4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1870l4 extends Thread {

    /* JADX INFO: renamed from: a */
    public final Object f9975a;

    /* JADX INFO: renamed from: b */
    public final BlockingQueue f9976b;

    /* JADX INFO: renamed from: c */
    public boolean f9977c = false;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1879m4 f9978d;

    public C1870l4(C1879m4 c1879m4, String str, BlockingQueue blockingQueue) {
        this.f9978d = c1879m4;
        C6272i.m12915i(blockingQueue);
        this.f9975a = new Object();
        this.f9976b = blockingQueue;
        setName(str);
    }

    /* JADX INFO: renamed from: a */
    public final void m5739a() {
        synchronized (this.f9978d.f9999i) {
            try {
                if (!this.f9977c) {
                    this.f9978d.f10000j.release();
                    this.f9978d.f9999i.notifyAll();
                    C1879m4 c1879m4 = this.f9978d;
                    if (this == c1879m4.f9993c) {
                        c1879m4.f9993c = null;
                    } else if (this == c1879m4.f9994d) {
                        c1879m4.f9994d = null;
                    } else {
                        C1860k3 c1860k3 = ((C1897o4) c1879m4.f10430a).f10086i;
                        C1897o4.m5776k(c1860k3);
                        c1860k3.f9942f.m5623a("Current scheduler thread is neither worker nor network");
                    }
                    this.f9977c = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m5740b(InterruptedException interruptedException) {
        C1860k3 c1860k3 = ((C1897o4) this.f9978d.f10430a).f10086i;
        C1897o4.m5776k(c1860k3);
        c1860k3.f9945i.m5624b(interruptedException, String.valueOf(getName()).concat(" was interrupted"));
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        boolean z10 = false;
        while (!z10) {
            try {
                this.f9978d.f10000j.acquire();
                z10 = true;
            } catch (InterruptedException e10) {
                m5740b(e10);
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                C1861k4 c1861k4 = (C1861k4) this.f9976b.poll();
                if (c1861k4 != null) {
                    Process.setThreadPriority(true != c1861k4.f9950b ? 10 : threadPriority);
                    c1861k4.run();
                } else {
                    synchronized (this.f9975a) {
                        try {
                            if (this.f9976b.peek() == null) {
                                this.f9978d.getClass();
                                try {
                                    this.f9975a.wait(30000L);
                                } catch (InterruptedException e11) {
                                    m5740b(e11);
                                }
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    synchronized (this.f9978d.f9999i) {
                        try {
                            if (this.f9976b.peek() == null) {
                                m5739a();
                                m5739a();
                                return;
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                }
            }
        } catch (Throwable th4) {
            m5739a();
            throw th4;
        }
    }
}
