package p307oo;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.lang.reflect.InvocationTargetException;
import kotlin.Result;
import kotlinx.coroutines.android.C7080a;
import p260m8.C7499b;

/* JADX INFO: renamed from: oo.f */
/* JADX INFO: loaded from: classes2.dex */
public final class C8102f {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f43924a = 0;
    private static volatile Choreographer choreographer;

    static {
        Object objM14967u;
        try {
            objM14967u = new C7080a(m16008a(Looper.getMainLooper()));
        } catch (Throwable th2) {
            objM14967u = C7499b.m14967u(th2);
        }
        if (objM14967u instanceof Result.Failure) {
            objM14967u = null;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public static final Handler m16008a(Looper looper) throws IllegalAccessException, InvocationTargetException {
        if (Build.VERSION.SDK_INT < 28) {
            try {
                return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
            } catch (NoSuchMethodException unused) {
                return new Handler(looper);
            }
        }
        Object objInvoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
        if (objInvoke != null) {
            return (Handler) objInvoke;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.os.Handler");
    }
}
