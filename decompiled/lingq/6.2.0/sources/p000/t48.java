package p000;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class t48 implements Executor {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Executor f61860a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ fg2 f61861b;

    public t48(ExecutorService executorService, fg2 fg2Var) {
        this.f61860a = executorService;
        this.f61861b = fg2Var;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f61860a.execute(runnable);
    }
}
