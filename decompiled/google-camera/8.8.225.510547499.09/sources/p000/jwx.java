package p000;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jwx implements Executor {

    /* JADX INFO: renamed from: a */
    private boolean f34972a = false;

    /* JADX INFO: renamed from: b */
    private final Queue f34973b = new LinkedList();

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        Runnable runnable2;
        synchronized (this.f34973b) {
            if (this.f34972a) {
                this.f34973b.add(runnable);
                return;
            }
            this.f34972a = true;
            while (runnable != null) {
                runnable.run();
                synchronized (this.f34973b) {
                    runnable2 = (Runnable) this.f34973b.poll();
                    if (runnable2 == null) {
                        this.f34972a = false;
                    }
                }
                runnable = runnable2;
            }
        }
    }
}
