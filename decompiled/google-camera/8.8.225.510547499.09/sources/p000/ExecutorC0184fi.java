package p000;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: fi */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC0184fi implements Executor {

    /* JADX INFO: renamed from: b */
    final Executor f22091b;

    /* JADX INFO: renamed from: c */
    Runnable f22092c;

    /* JADX INFO: renamed from: d */
    private final Object f22093d = new Object();

    /* JADX INFO: renamed from: a */
    final Queue f22090a = new ArrayDeque();

    public ExecutorC0184fi(Executor executor) {
        this.f22091b = executor;
    }

    /* JADX INFO: renamed from: a */
    public final void m8455a() {
        synchronized (this.f22093d) {
            Runnable runnable = (Runnable) this.f22090a.poll();
            this.f22092c = runnable;
            if (runnable != null) {
                this.f22091b.execute(runnable);
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.f22093d) {
            this.f22090a.add(new RunnableC0058bd(this, runnable, 5));
            if (this.f22092c == null) {
                m8455a();
            }
        }
    }
}
