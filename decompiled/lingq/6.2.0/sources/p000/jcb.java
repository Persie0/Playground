package p000;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jcb implements ThreadFactory {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f45421a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f45422b;

    public /* synthetic */ jcb(String str, boolean z) {
        this.f45421a = str;
        this.f45422b = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.f45421a);
        thread.setDaemon(this.f45422b);
        return thread;
    }
}
