package p000;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ib4 implements ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, "IterableBackgroundInit");
        thread.setDaemon(true);
        thread.setPriority(5);
        return thread;
    }
}
