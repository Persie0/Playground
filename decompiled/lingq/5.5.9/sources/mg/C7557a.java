package mg;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Process;

/* JADX INFO: renamed from: mg.a */
/* JADX INFO: loaded from: classes.dex */
public final class C7557a {
    /* JADX INFO: renamed from: a */
    public static String m15077a(Context context) {
        try {
            int iMyPid = Process.myPid();
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager == null) {
                return context.getPackageName();
            }
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : activityManager.getRunningAppProcesses()) {
                if (runningAppProcessInfo != null && runningAppProcessInfo.pid == iMyPid) {
                    return runningAppProcessInfo.processName;
                }
            }
            for (ActivityManager.RunningServiceInfo runningServiceInfo : activityManager.getRunningServices(Integer.MAX_VALUE)) {
                if (runningServiceInfo != null && runningServiceInfo.pid == iMyPid) {
                    return runningServiceInfo.process;
                }
            }
            return context.getPackageName();
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m15078b(Context context, String str) {
        return context.getPackageManager().checkPermission(str, context.getPackageName()) == 0;
    }
}
