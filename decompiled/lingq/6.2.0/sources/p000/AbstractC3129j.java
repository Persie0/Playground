package p000;

import android.app.ActivityManager;
import android.os.Looper;
import android.os.Process;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONArray;

/* JADX INFO: renamed from: j */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3129j {

    /* JADX INFO: renamed from: a */
    public static final int f44817a = Process.myUid();

    /* JADX INFO: renamed from: b */
    public static final ScheduledExecutorService f44818b = Executors.newSingleThreadScheduledExecutor();

    /* JADX INFO: renamed from: c */
    public static String f44819c = "";

    /* JADX INFO: renamed from: d */
    public static final RunnableC3094i f44820d = new RunnableC3094i(0);

    /* JADX INFO: renamed from: a */
    public static final void m14228a(ActivityManager activityManager) {
        if (lp1.f49971a.contains(AbstractC3129j.class)) {
            return;
        }
        try {
            List<ActivityManager.ProcessErrorStateInfo> processesInErrorState = activityManager.getProcessesInErrorState();
            if (processesInErrorState != null) {
                for (ActivityManager.ProcessErrorStateInfo processErrorStateInfo : processesInErrorState) {
                    if (processErrorStateInfo.condition == 2 && processErrorStateInfo.uid == f44817a) {
                        Thread thread = Looper.getMainLooper().getThread();
                        thread.getClass();
                        StackTraceElement[] stackTrace = thread.getStackTrace();
                        JSONArray jSONArray = new JSONArray();
                        stackTrace.getClass();
                        for (StackTraceElement stackTraceElement : stackTrace) {
                            jSONArray.put(stackTraceElement.toString());
                        }
                        String string = jSONArray.toString();
                        if (!fa4.m11650l(string, f44819c) && thb.m22065x(thread)) {
                            f44819c = string;
                            egd.m11099a(processErrorStateInfo.shortMsg, string).m20433d();
                        }
                    }
                }
            }
        } catch (Throwable th) {
            lp1.m16420a(AbstractC3129j.class, th);
        }
    }
}
