package p457wd;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: wd.i */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC9908i implements Executor {
    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
