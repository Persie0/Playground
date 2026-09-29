package p232l2;

import android.util.Log;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: l2.d */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC7225d implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f40609a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f40610b;

    public RunnableC7225d(Object obj, Object obj2) {
        this.f40609a = obj;
        this.f40610b = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Method method = C7226e.f40614d;
            Object obj = this.f40610b;
            Object obj2 = this.f40609a;
            if (method != null) {
                method.invoke(obj2, obj, Boolean.FALSE, "AppCompat recreation");
            } else {
                C7226e.f40615e.invoke(obj2, obj, Boolean.FALSE);
            }
        } catch (RuntimeException e10) {
            if (e10.getClass() == RuntimeException.class && e10.getMessage() != null && e10.getMessage().startsWith("Unable to stop")) {
                throw e10;
            }
        } catch (Throwable th2) {
            Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th2);
        }
    }
}
