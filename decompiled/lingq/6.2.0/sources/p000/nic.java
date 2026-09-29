package p000;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: loaded from: classes.dex */
public final class nic extends Thread {

    /* JADX INFO: renamed from: a */
    public final Object f52780a;

    /* JADX INFO: renamed from: b */
    public final BlockingQueue f52781b;

    /* JADX INFO: renamed from: c */
    public boolean f52782c = false;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ tic f52783d;

    public nic(tic ticVar, String str, BlockingQueue blockingQueue) {
        this.f52783d = ticVar;
        lda.m16130p(blockingQueue);
        this.f52780a = new Object();
        this.f52781b = blockingQueue;
        setName(str);
    }

    /* JADX INFO: renamed from: a */
    public final void m17445a() {
        tic ticVar = this.f52783d;
        synchronized (ticVar.f62360i) {
            try {
                if (!this.f52782c) {
                    ticVar.f62361j.release();
                    ticVar.f62360i.notifyAll();
                    if (this == ticVar.f62354c) {
                        ticVar.f62354c = null;
                    } else if (this == ticVar.f62355d) {
                        ticVar.f62355d = null;
                    } else {
                        xcc xccVar = ((kjc) ticVar.f60774a).f47438f;
                        kjc.m15280l(xccVar);
                        xccVar.f68080f.m17923a("Current scheduler thread is neither worker nor network");
                    }
                    this.f52782c = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        boolean z = false;
        while (!z) {
            try {
                this.f52783d.f62361j.acquire();
                z = true;
            } catch (InterruptedException e) {
                xcc xccVar = ((kjc) this.f52783d.f60774a).f47438f;
                kjc.m15280l(xccVar);
                xccVar.f68083i.m17924b(e, String.valueOf(getName()).concat(" was interrupted"));
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                BlockingQueue blockingQueue = this.f52781b;
                jic jicVar = (jic) blockingQueue.poll();
                if (jicVar != null) {
                    Process.setThreadPriority(true != jicVar.f45594b ? 10 : threadPriority);
                    jicVar.run();
                } else {
                    Object obj = this.f52780a;
                    synchronized (obj) {
                        if (blockingQueue.peek() == null) {
                            this.f52783d.getClass();
                            try {
                                obj.wait(30000L);
                            } catch (InterruptedException e2) {
                                xcc xccVar2 = ((kjc) this.f52783d.f60774a).f47438f;
                                kjc.m15280l(xccVar2);
                                xccVar2.f68083i.m17924b(e2, String.valueOf(getName()).concat(" was interrupted"));
                            }
                        }
                    }
                    synchronized (this.f52783d.f62360i) {
                        if (this.f52781b.peek() == null) {
                            m17445a();
                            m17445a();
                            return;
                        }
                    }
                }
            }
        } catch (Throwable th) {
            m17445a();
            throw th;
        }
    }
}
