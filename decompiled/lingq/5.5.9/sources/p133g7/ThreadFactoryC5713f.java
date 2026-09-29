package p133g7;

import android.os.Process;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: g7.f */
/* JADX INFO: loaded from: classes.dex */
public final class ThreadFactoryC5713f implements ThreadFactory {

    /* JADX INFO: renamed from: g7.f$a */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Runnable f34725a;

        public a(Runnable runnable) {
            this.f34725a = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                ThreadFactoryC5713f.this.getClass();
                Process.setThreadPriority(10);
            } catch (Throwable unused) {
            }
            this.f34725a.run();
        }
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(new a(runnable));
    }
}
