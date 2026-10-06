package p000;

import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.app.Service;
import android.util.Log;
import androidx.work.impl.foreground.SystemForegroundService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bbu {
    /* JADX INFO: renamed from: a */
    static void m2188a(Service service, int i, Notification notification, int i2) {
        try {
            service.startForeground(i, notification, i2);
        } catch (ForegroundServiceStartNotAllowedException e) {
            ayc.m2099a();
            Log.w(SystemForegroundService.f1818a, "Unable to start foreground service", e);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final bcj m2189b(bcv bcvVar) {
        bcvVar.getClass();
        return new bcj(bcvVar.f2964a, bcvVar.f2980q);
    }
}
