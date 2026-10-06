package p000;

import android.os.Process;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class adx extends Thread {

    /* JADX INFO: renamed from: a */
    private final int f183a;

    public adx(Runnable runnable) {
        super(runnable, "fonts-androidx");
        this.f183a = 10;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.f183a);
        super.run();
    }
}
