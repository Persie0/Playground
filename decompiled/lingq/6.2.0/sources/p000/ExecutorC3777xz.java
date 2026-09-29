package p000;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: xz */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ExecutorC3777xz implements Executor {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Handler f68978a;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f68978a.post(runnable);
    }
}
