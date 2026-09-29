package p000;

import android.content.Context;
import android.os.PowerManager;

/* JADX INFO: loaded from: classes2.dex */
public abstract class e2b {
    static {
        oj5.m18041h("WakeLocks");
    }

    /* JADX INFO: renamed from: a */
    public static final PowerManager.WakeLock m10811a(Context context) {
        context.getClass();
        Object systemService = context.getApplicationContext().getSystemService("power");
        systemService.getClass();
        String strConcat = "WorkManager: ".concat("ProcessorForegroundLck");
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) systemService).newWakeLock(1, strConcat);
        synchronized (f2b.f38315a) {
        }
        wakeLockNewWakeLock.getClass();
        return wakeLockNewWakeLock;
    }
}
