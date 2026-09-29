package p136gc;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: gc.p */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC5760p implements Executor {
    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
