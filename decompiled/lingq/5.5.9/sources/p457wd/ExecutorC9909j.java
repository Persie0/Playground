package p457wd;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: wd.j */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC9909j implements Executor {

    /* JADX INFO: renamed from: a */
    public final Handler f50542a = new Handler(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f50542a.post(runnable);
    }
}
