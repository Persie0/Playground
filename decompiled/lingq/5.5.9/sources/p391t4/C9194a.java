package p391t4;

import android.annotation.SuppressLint;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: t4.a */
/* JADX INFO: loaded from: classes.dex */
public final class C9194a {

    /* JADX INFO: renamed from: a */
    public static long f47734a;

    /* JADX INFO: renamed from: b */
    public static Method f47735b;

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: a */
    public static boolean m17534a() {
        try {
            if (f47735b == null) {
                return Trace.isEnabled();
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        try {
            if (f47735b == null) {
                f47734a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f47735b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f47735b.invoke(null, Long.valueOf(f47734a))).booleanValue();
        } catch (Exception e10) {
            if (!(e10 instanceof InvocationTargetException)) {
                Log.v("Trace", "Unable to call isTagEnabled via reflection", e10);
                return false;
            }
            Throwable cause = e10.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
    }
}
