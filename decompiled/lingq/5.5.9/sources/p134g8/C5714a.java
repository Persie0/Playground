package p134g8;

import android.app.ActivityManager;
import android.os.Looper;
import android.os.Process;
import com.facebook.internal.instrument.InstrumentData;
import dm.C5206f;
import dm.C5207g;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONArray;
import p173i8.C6205a;
import p317p7.RunnableC8197d;

/* JADX INFO: renamed from: g8.a */
/* JADX INFO: loaded from: classes.dex */
public final class C5714a {

    /* JADX INFO: renamed from: a */
    public static final int f34727a;

    /* JADX INFO: renamed from: b */
    public static final ScheduledExecutorService f34728b;

    /* JADX INFO: renamed from: c */
    public static String f34729c;

    /* JADX INFO: renamed from: d */
    public static final RunnableC8197d f34730d;

    static {
        new C5714a();
        f34727a = Process.myUid();
        f34728b = Executors.newSingleThreadScheduledExecutor();
        f34729c = "";
        f34730d = new RunnableC8197d(4);
    }

    /* JADX INFO: renamed from: a */
    public static final void m12073a(ActivityManager activityManager) {
        if (C6205a.m12742b(C5714a.class)) {
            return;
        }
        try {
            List<ActivityManager.ProcessErrorStateInfo> processesInErrorState = activityManager.getProcessesInErrorState();
            if (processesInErrorState == null) {
                return;
            }
            for (ActivityManager.ProcessErrorStateInfo processErrorStateInfo : processesInErrorState) {
                if (processErrorStateInfo.condition == 2 && processErrorStateInfo.uid == f34727a) {
                    Thread thread = Looper.getMainLooper().getThread();
                    C5207g.m11110e(thread, "getMainLooper().thread");
                    StackTraceElement[] stackTrace = thread.getStackTrace();
                    JSONArray jSONArray = new JSONArray();
                    C5207g.m11110e(stackTrace, "stackTrace");
                    int length = stackTrace.length;
                    int i10 = 0;
                    while (i10 < length) {
                        StackTraceElement stackTraceElement = stackTrace[i10];
                        i10++;
                        jSONArray.put(stackTraceElement.toString());
                    }
                    String string = jSONArray.toString();
                    if (!C5207g.m11106a(string, f34729c) && C5206f.m11007e1(thread)) {
                        f34729c = string;
                        new InstrumentData(processErrorStateInfo.shortMsg, string).m6680c();
                    }
                }
            }
        } catch (Throwable th2) {
            C6205a.m12741a(C5714a.class, th2);
        }
    }
}
