package p235l5;

import android.content.Context;
import android.os.PowerManager;
import dm.C5207g;
import p026b5.AbstractC1314g;

/* JADX INFO: renamed from: l5.u */
/* JADX INFO: loaded from: classes.dex */
public final class C7274u {

    /* JADX INFO: renamed from: a */
    public static final String f40773a;

    static {
        String strM4868f = AbstractC1314g.m4868f("WakeLocks");
        C5207g.m11110e(strM4868f, "tagWithPrefix(\"WakeLocks\")");
        f40773a = strM4868f;
    }

    /* JADX INFO: renamed from: a */
    public static final PowerManager.WakeLock m14661a(Context context, String str) {
        C5207g.m11111f(context, "context");
        C5207g.m11111f(str, "tag");
        Object systemService = context.getApplicationContext().getSystemService("power");
        C5207g.m11109d(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        String strConcat = "WorkManager: ".concat(str);
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) systemService).newWakeLock(1, strConcat);
        synchronized (C7275v.f40774a) {
            C7275v.f40775b.put(wakeLockNewWakeLock, strConcat);
        }
        C5207g.m11110e(wakeLockNewWakeLock, "wakeLock");
        return wakeLockNewWakeLock;
    }
}
