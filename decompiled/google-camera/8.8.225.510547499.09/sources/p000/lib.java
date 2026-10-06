package p000;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Process;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lib {

    /* JADX INFO: renamed from: b */
    static volatile boolean f38292b;

    /* JADX INFO: renamed from: a */
    public static volatile ActivityManager f38291a = null;

    /* JADX INFO: renamed from: c */
    private static volatile String f38293c = null;

    private lib() {
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0059  */
    /* JADX INFO: renamed from: a */
    public static String m15376a() throws Throwable {
        BufferedReader bufferedReader;
        if (f38293c != null) {
            return f38293c;
        }
        int iMyPid = Process.myPid();
        String strTrim = null;
        strTrim = null;
        strTrim = null;
        BufferedReader bufferedReader2 = null;
        strTrim = null;
        try {
            if (iMyPid > 0) {
                try {
                    bufferedReader = new BufferedReader(new FileReader("/proc/" + iMyPid + "/cmdline"));
                    try {
                        String line = bufferedReader.readLine();
                        line.getClass();
                        strTrim = line.trim();
                        bufferedReader.close();
                    } catch (IOException e) {
                        if (bufferedReader != null) {
                            bufferedReader.close();
                        }
                        if (strTrim != null) {
                            f38293c = strTrim;
                        }
                        return f38293c;
                    } catch (Throwable th) {
                        th = th;
                        bufferedReader2 = bufferedReader;
                        if (bufferedReader2 != null) {
                            try {
                                bufferedReader2.close();
                            } catch (IOException e2) {
                            }
                        }
                        throw th;
                    }
                } catch (IOException e3) {
                    bufferedReader = null;
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        } catch (IOException e4) {
        }
        if (strTrim != null) {
            f38293c = strTrim;
        }
        return f38293c;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m15377b(Context context) {
        Object systemService = context.getSystemService("activity");
        systemService.getClass();
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) systemService).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return false;
        }
        String packageName = context.getPackageName();
        String strValueOf = String.valueOf(packageName);
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.importance == 100) {
                if (!runningAppProcessInfo.processName.equals(packageName)) {
                    if (runningAppProcessInfo.processName.startsWith(strValueOf.concat(":"))) {
                    }
                }
                return true;
            }
        }
        return false;
    }
}
