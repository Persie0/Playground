package p000;

import android.os.Process;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bug extends Thread {
    public bug(Runnable runnable) {
        super(runnable);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(9);
        super.run();
    }
}
