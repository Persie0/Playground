package p000;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes.dex */
public final class z16 implements Executor {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Executor f70749a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ j93 f70750b;

    public z16(Executor executor, j93 j93Var) {
        this.f70749a = executor;
        this.f70750b = j93Var;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        try {
            this.f70749a.execute(runnable);
        } catch (RejectedExecutionException e) {
            this.f70750b.m6386n(e);
        }
    }
}
