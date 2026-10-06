package p000;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class juy implements Executor, jve {

    /* JADX INFO: renamed from: a */
    private final Handler f34867a;

    public juy(Handler handler) {
        this.f34867a = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f34867a.post(runnable);
    }
}
