package p336qb;

import android.os.Process;

/* JADX INFO: renamed from: qb.c */
/* JADX INFO: loaded from: classes.dex */
public final class C8511c extends Thread {
    public C8511c(ThreadGroup threadGroup) {
        super(threadGroup, "GmsDynamite");
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(19);
        synchronized (this) {
            while (true) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    return;
                }
            }
        }
    }
}
