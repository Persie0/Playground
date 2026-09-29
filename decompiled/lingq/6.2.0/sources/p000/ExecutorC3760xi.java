package p000;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: xi */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC3760xi implements Executor {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f68229a;

    /* JADX INFO: renamed from: b */
    public final Handler f68230b;

    public ExecutorC3760xi(int i) {
        this.f68229a = i;
        switch (i) {
            case 1:
                this.f68230b = new Handler(Looper.getMainLooper());
                break;
            default:
                this.f68230b = new Handler(Looper.getMainLooper());
                break;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f68229a) {
            case 0:
                this.f68230b.post(runnable);
                break;
            default:
                this.f68230b.post(runnable);
                break;
        }
    }
}
