package p241le;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: le.g */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC7334g implements Callable<Void> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Runnable f41055a;

    public CallableC7334g(RunnableC7346q runnableC7346q) {
        this.f41055a = runnableC7346q;
    }

    @Override // java.util.concurrent.Callable
    public final Void call() throws Exception {
        this.f41055a.run();
        return null;
    }
}
