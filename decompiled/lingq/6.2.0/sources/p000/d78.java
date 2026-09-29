package p000;

import android.os.Process;

/* JADX INFO: loaded from: classes2.dex */
public final class d78 extends Thread {

    /* JADX INFO: renamed from: a */
    public final int f35090a;

    public d78(Runnable runnable) {
        super(runnable, "fonts-androidx");
        this.f35090a = 10;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.f35090a);
        super.run();
    }
}
