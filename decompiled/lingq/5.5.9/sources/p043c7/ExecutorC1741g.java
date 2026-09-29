package p043c7;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: c7.g */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC1741g implements Executor {

    /* JADX INFO: renamed from: a */
    public final Handler f9592a = new Handler(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f9592a.post(runnable);
    }
}
