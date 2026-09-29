package p235l5;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.util.Log;
import androidx.work.C1243a;
import dm.C5207g;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import p026b5.AbstractC1314g;
import p026b5.AbstractC1317j;

/* JADX INFO: renamed from: l5.p */
/* JADX INFO: loaded from: classes.dex */
public final class C7269p {

    /* JADX INFO: renamed from: a */
    public static final String f40759a;

    static {
        String strM4868f = AbstractC1314g.m4868f("ProcessUtils");
        C5207g.m11110e(strM4868f, "tagWithPrefix(\"ProcessUtils\")");
        f40759a = strM4868f;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00b0  */
    /* JADX INFO: renamed from: a */
    public static final boolean m14659a(Context context, C1243a c1243a) {
        String strM14600a;
        Object next;
        C5207g.m11111f(context, "context");
        C5207g.m11111f(c1243a, "configuration");
        if (Build.VERSION.SDK_INT >= 28) {
            strM14600a = C7253a.f40735a.m14600a();
        } else {
            try {
                Method declaredMethod = Class.forName("android.app.ActivityThread", false, AbstractC1317j.class.getClassLoader()).getDeclaredMethod("currentProcessName", new Class[0]);
                declaredMethod.setAccessible(true);
                Object objInvoke = declaredMethod.invoke(null, new Object[0]);
                C5207g.m11108c(objInvoke);
                if (objInvoke instanceof String) {
                    strM14600a = (String) objInvoke;
                } else {
                    int iMyPid = Process.myPid();
                    Object systemService = context.getSystemService("activity");
                    C5207g.m11109d(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
                    List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) systemService).getRunningAppProcesses();
                    if (runningAppProcesses != null) {
                        Iterator<T> it = runningAppProcesses.iterator();
                        do {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                        } while (!(((ActivityManager.RunningAppProcessInfo) next).pid == iMyPid));
                        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) next;
                        if (runningAppProcessInfo != null) {
                            strM14600a = runningAppProcessInfo.processName;
                        } else {
                            strM14600a = null;
                        }
                    } else {
                        strM14600a = null;
                    }
                }
            } catch (Throwable th2) {
                if (((AbstractC1314g.a) AbstractC1314g.m4867d()).f8062c <= 3) {
                    Log.d(f40759a, "Unable to check ActivityThread for processName", th2);
                }
            }
        }
        return C5207g.m11106a(strM14600a, context.getApplicationInfo().processName);
    }
}
