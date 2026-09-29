package p235l5;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: l5.t */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC7273t implements Executor {
    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
