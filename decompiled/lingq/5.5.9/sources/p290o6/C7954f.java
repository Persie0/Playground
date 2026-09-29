package p290o6;

import android.annotation.TargetApi;
import android.app.Application;
import com.clevertap.android.sdk.C2181a;

/* JADX INFO: renamed from: o6.f */
/* JADX INFO: loaded from: classes.dex */
public final class C7954f {

    /* JADX INFO: renamed from: a */
    public static boolean f43321a;

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @TargetApi(14)
    /* JADX INFO: renamed from: a */
    public static synchronized void m15770a(Application application) {
        try {
            if (application == null) {
                C2181a.m6454f("Application instance is null/system API is too old");
            } else {
                if (f43321a) {
                    C2181a.m6455h("Lifecycle callbacks have already been registered");
                    return;
                }
                f43321a = true;
                application.registerActivityLifecycleCallbacks(new C7952e());
                C2181a.m6454f("Activity Lifecycle Callback successfully registered");
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
