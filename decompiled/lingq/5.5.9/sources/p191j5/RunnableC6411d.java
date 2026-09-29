package p191j5;

import androidx.work.impl.foreground.SystemForegroundService;

/* JADX INFO: renamed from: j5.d */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC6411d implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f36877a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ SystemForegroundService f36878b;

    public RunnableC6411d(SystemForegroundService systemForegroundService, int i10) {
        this.f36878b = systemForegroundService;
        this.f36877a = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f36878b.f7898e.cancel(this.f36877a);
    }
}
