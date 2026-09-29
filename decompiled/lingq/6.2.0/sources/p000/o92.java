package p000;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o92 implements Executor {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f54075a;

    /* JADX INFO: renamed from: a */
    private final void m17870a(Runnable runnable) {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f54075a) {
            case 0:
                break;
            default:
                runnable.run();
                break;
        }
    }
}
