package p000;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jpr implements Executor {

    /* JADX INFO: renamed from: a */
    private final Handler f34559a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f34560b;

    public jpr(Looper looper, int i) {
        this.f34560b = i;
        this.f34559a = new jmx(looper);
    }

    public jpr(int i) {
        this.f34560b = i;
        this.f34559a = new jmx(Looper.getMainLooper());
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f34560b) {
            case 0:
                this.f34559a.post(runnable);
                break;
            default:
                this.f34559a.post(runnable);
                break;
        }
    }
}
