package p000;

import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes2.dex */
public final class f78 implements Executor {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f38575a;

    /* JADX INFO: renamed from: b */
    public final Handler f38576b;

    public /* synthetic */ f78(Handler handler, int i) {
        this.f38575a = i;
        this.f38576b = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i = this.f38575a;
        Handler handler = this.f38576b;
        switch (i) {
            case 0:
                runnable.getClass();
                if (handler.post(runnable)) {
                    return;
                }
                throw new RejectedExecutionException(handler + " is shutting down");
            default:
                handler.post(runnable);
                return;
        }
    }
}
