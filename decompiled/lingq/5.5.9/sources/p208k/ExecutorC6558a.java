package p208k;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: k.a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ExecutorC6558a implements Executor {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f37352a;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f37352a) {
            case 1:
                runnable.run();
                break;
            case 2:
                runnable.run();
                break;
            default:
                runnable.run();
                break;
        }
    }
}
