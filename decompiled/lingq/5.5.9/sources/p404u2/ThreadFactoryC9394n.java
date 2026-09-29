package p404u2;

import android.os.Process;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: u2.n */
/* JADX INFO: loaded from: classes.dex */
public final class ThreadFactoryC9394n implements ThreadFactory {

    /* JADX INFO: renamed from: a */
    public final String f48207a = "fonts-androidx";

    /* JADX INFO: renamed from: b */
    public final int f48208b = 10;

    /* JADX INFO: renamed from: u2.n$a */
    public static class a extends Thread {

        /* JADX INFO: renamed from: a */
        public final int f48209a;

        public a(Runnable runnable, String str, int i10) {
            super(runnable, str);
            this.f48209a = i10;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            Process.setThreadPriority(this.f48209a);
            super.run();
        }
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new a(runnable, this.f48207a, this.f48208b);
    }
}
