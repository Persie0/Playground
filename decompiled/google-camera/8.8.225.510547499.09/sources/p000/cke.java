package p000;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cke implements Executor, jve {

    /* JADX INFO: renamed from: a */
    public final Executor f5970a;

    /* JADX INFO: renamed from: b */
    private final nps f5971b;

    public cke(Executor executor, nps npsVar) {
        this.f5970a = executor;
        this.f5971b = npsVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (this.f5971b.isDone()) {
            this.f5970a.execute(runnable);
        } else {
            jvh.m13562j(this.f5971b, new cdc(this, runnable, 3), not.INSTANCE);
        }
    }
}
