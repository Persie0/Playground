package p000;

import android.content.Context;
import android.os.PowerManager;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bee {

    /* JADX INFO: renamed from: a */
    public static final String f3031a = ayc.m2100b("WakeLocks");

    /* JADX INFO: renamed from: a */
    public static final PowerManager.WakeLock m2264a(Context context, String str) {
        context.getClass();
        Object systemService = context.getApplicationContext().getSystemService("power");
        systemService.getClass();
        String strConcat = "WorkManager: ".concat(str);
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) systemService).newWakeLock(1, strConcat);
        synchronized (bef.f3032a) {
        }
        wakeLockNewWakeLock.getClass();
        return wakeLockNewWakeLock;
    }
}
