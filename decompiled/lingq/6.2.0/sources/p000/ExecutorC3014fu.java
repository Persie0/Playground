package p000;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: fu */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ExecutorC3014fu implements Executor {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f39636a;

    public /* synthetic */ ExecutorC3014fu(int i) {
        this.f39636a = i;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f39636a) {
            case 0:
                C3051gu.m12863O().f41318s.f60505t.execute(runnable);
                break;
            default:
                runnable.run();
                break;
        }
    }
}
