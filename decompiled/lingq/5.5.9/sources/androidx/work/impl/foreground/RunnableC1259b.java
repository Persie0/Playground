package androidx.work.impl.foreground;

import android.app.Notification;
import android.os.Build;

/* JADX INFO: renamed from: androidx.work.impl.foreground.b */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1259b implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f7909a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Notification f7910b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f7911c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ SystemForegroundService f7912d;

    public RunnableC1259b(SystemForegroundService systemForegroundService, int i10, Notification notification, int i11) {
        this.f7912d = systemForegroundService;
        this.f7909a = i10;
        this.f7910b = notification;
        this.f7911c = i11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = Build.VERSION.SDK_INT;
        int i11 = this.f7911c;
        Notification notification = this.f7910b;
        int i12 = this.f7909a;
        SystemForegroundService systemForegroundService = this.f7912d;
        if (i10 >= 31) {
            SystemForegroundService.C1257b.m4747a(systemForegroundService, i12, notification, i11);
        } else if (i10 >= 29) {
            SystemForegroundService.C1256a.m4746a(systemForegroundService, i12, notification, i11);
        } else {
            systemForegroundService.startForeground(i12, notification);
        }
    }
}
