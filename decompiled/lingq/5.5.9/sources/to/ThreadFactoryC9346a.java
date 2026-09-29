package to;

import dm.C5207g;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: to.a */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ThreadFactoryC9346a implements ThreadFactory {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f48080a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f48081b;

    public /* synthetic */ ThreadFactoryC9346a(String str, boolean z10) {
        this.f48080a = str;
        this.f48081b = z10;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        String str = this.f48080a;
        C5207g.m11111f(str, "$name");
        Thread thread = new Thread(runnable, str);
        thread.setDaemon(this.f48081b);
        return thread;
    }
}
