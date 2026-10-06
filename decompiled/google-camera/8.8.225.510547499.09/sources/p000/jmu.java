package p000;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.os.UserHandle;
import android.util.Log;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jmu {

    /* JADX INFO: renamed from: a */
    public static final Method f34377a;

    /* JADX INFO: renamed from: b */
    public static final Method f34378b;

    static {
        Method declaredMethod;
        Method declaredMethod2 = null;
        try {
            declaredMethod = JobScheduler.class.getDeclaredMethod("scheduleAsPackage", JobInfo.class, String.class, Integer.TYPE, String.class);
        } catch (NoSuchMethodException e) {
            if (Log.isLoggable("JobSchedulerCompat", 6)) {
                Log.e("JobSchedulerCompat", "No scheduleAsPackage method available, falling back to schedule");
                declaredMethod = null;
            } else {
                declaredMethod = null;
            }
        }
        f34377a = declaredMethod;
        try {
            declaredMethod2 = UserHandle.class.getDeclaredMethod("myUserId", new Class[0]);
        } catch (NoSuchMethodException e2) {
            if (Log.isLoggable("JobSchedulerCompat", 6)) {
                Log.e("JobSchedulerCompat", "No myUserId method available");
            }
        }
        f34378b = declaredMethod2;
    }
}
