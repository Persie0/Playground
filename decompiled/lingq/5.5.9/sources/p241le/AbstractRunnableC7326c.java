package p241le;

import android.os.Process;

/* JADX INFO: renamed from: le.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractRunnableC7326c implements Runnable {
    /* JADX INFO: renamed from: a */
    public abstract void mo14742a();

    @Override // java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        mo14742a();
    }
}
