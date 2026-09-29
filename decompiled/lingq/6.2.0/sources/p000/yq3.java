package p000;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.lang.reflect.InvocationTargetException;
import kotlin.Result;

/* JADX INFO: loaded from: classes.dex */
public abstract class yq3 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f70287a = 0;
    private static volatile Choreographer choreographer;

    static {
        Object failure;
        try {
            failure = new xq3(m25282a(Looper.getMainLooper()));
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            failure = null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final Handler m25282a(Looper looper) throws IllegalAccessException, InvocationTargetException {
        Object objInvoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
        objInvoke.getClass();
        return (Handler) objInvoke;
    }
}
