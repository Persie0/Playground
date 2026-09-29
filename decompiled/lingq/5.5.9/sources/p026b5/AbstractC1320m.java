package p026b5;

import android.content.Context;
import android.support.v4.media.session.C0166e;
import androidx.work.AbstractC1246d;
import androidx.work.WorkerParameters;

/* JADX INFO: renamed from: b5.m */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1320m {

    /* JADX INFO: renamed from: a */
    public static final String f8073a = AbstractC1314g.m4868f("WorkerFactory");

    /* JADX INFO: renamed from: a */
    public abstract AbstractC1246d mo4881a(Context context, String str, WorkerParameters workerParameters);

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: b */
    public final AbstractC1246d m4882b(Context context, String str, WorkerParameters workerParameters) {
        Class clsAsSubclass;
        String str2 = f8073a;
        AbstractC1246d abstractC1246dMo4881a = mo4881a(context, str, workerParameters);
        if (abstractC1246dMo4881a == null) {
            try {
                clsAsSubclass = Class.forName(str).asSubclass(AbstractC1246d.class);
            } catch (Throwable th2) {
                AbstractC1314g.m4867d().mo4871c(str2, "Invalid class: " + str, th2);
                clsAsSubclass = null;
            }
            if (clsAsSubclass != null) {
                try {
                    abstractC1246dMo4881a = (AbstractC1246d) clsAsSubclass.getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
                } catch (Throwable th3) {
                    AbstractC1314g.m4867d().mo4871c(str2, "Could not instantiate " + str, th3);
                }
            }
        }
        if (abstractC1246dMo4881a == null || !abstractC1246dMo4881a.f7831d) {
            return abstractC1246dMo4881a;
        }
        throw new IllegalStateException(C0166e.m766l("WorkerFactory (", getClass().getName(), ") returned an instance of a ListenableWorker (", str, ") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker."));
    }
}
