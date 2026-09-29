package p452w8;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import p010a9.C0051a;

/* JADX INFO: renamed from: w8.q */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC9836q implements Executor {

    /* JADX INFO: renamed from: a */
    public final Executor f50042a;

    /* JADX INFO: renamed from: w8.q$a */
    public static class a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final Runnable f50043a;

        public a(Runnable runnable) {
            this.f50043a = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                this.f50043a.run();
            } catch (Exception e10) {
                C0051a.m209b("Executor", "Background execution failure.", e10);
            }
        }
    }

    public ExecutorC9836q(ExecutorService executorService) {
        this.f50042a = executorService;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f50042a.execute(new a(runnable));
    }
}
