package p392t5;

import android.os.Process;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: t5.a */
/* JADX INFO: loaded from: classes.dex */
public final class ThreadFactoryC9195a implements ThreadFactory {

    /* JADX INFO: renamed from: t5.a$a */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Runnable f47736a;

        public a(Runnable runnable) {
            this.f47736a = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Process.setThreadPriority(10);
            this.f47736a.run();
        }
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(new a(runnable), "glide-active-resources");
    }
}
