package p000;

import android.os.Process;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class izn extends Thread {
    public izn(Runnable runnable, String str) {
        super(runnable, str);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        super.run();
    }
}
