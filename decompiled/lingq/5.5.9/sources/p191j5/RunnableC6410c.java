package p191j5;

import android.app.Notification;
import androidx.work.impl.foreground.SystemForegroundService;

/* JADX INFO: renamed from: j5.c */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC6410c implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f36874a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Notification f36875b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ SystemForegroundService f36876c;

    public RunnableC6410c(SystemForegroundService systemForegroundService, int i10, Notification notification) {
        this.f36876c = systemForegroundService;
        this.f36874a = i10;
        this.f36875b = notification;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f36876c.f7898e.notify(this.f36874a, this.f36875b);
    }
}
