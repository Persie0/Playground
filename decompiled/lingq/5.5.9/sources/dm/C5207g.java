package dm;

import android.support.v4.media.C0141b;
import androidx.activity.result.C0204c;
import java.util.Arrays;
import kotlin.UninitializedPropertyAccessException;

/* JADX INFO: renamed from: dm.g */
/* JADX INFO: loaded from: classes2.dex */
public final class C5207g {

    /* JADX INFO: renamed from: dm.g$a */
    public static class a {
    }

    /* JADX INFO: renamed from: a */
    public static boolean m11106a(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    /* JADX INFO: renamed from: b */
    public static void m11107b(Object obj, String str) {
        if (obj != null) {
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException(str.concat(" must not be null"));
        m11115j(C5207g.class.getName(), illegalStateException);
        throw illegalStateException;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: c */
    public static void m11108c(Object obj) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException();
        m11115j(C5207g.class.getName(), nullPointerException);
        throw nullPointerException;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: d */
    public static void m11109d(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(str);
        m11115j(C5207g.class.getName(), nullPointerException);
        throw nullPointerException;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: e */
    public static void m11110e(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(str.concat(" must not be null"));
        m11115j(C5207g.class.getName(), nullPointerException);
        throw nullPointerException;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: f */
    public static void m11111f(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(m11114i(str));
        m11115j(C5207g.class.getName(), nullPointerException);
        throw nullPointerException;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: g */
    public static void m11112g(Object obj, String str) {
        if (obj != null) {
            return;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(m11114i(str));
        m11115j(C5207g.class.getName(), illegalArgumentException);
        throw illegalArgumentException;
    }

    /* JADX INFO: renamed from: h */
    public static int m11113h(int i10, int i11) {
        if (i10 < i11) {
            return -1;
        }
        return i10 == i11 ? 0 : 1;
    }

    /* JADX INFO: renamed from: i */
    public static String m11114i(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        String name = C5207g.class.getName();
        int i10 = 0;
        while (!stackTrace[i10].getClassName().equals(name)) {
            i10++;
        }
        while (stackTrace[i10].getClassName().equals(name)) {
            i10++;
        }
        StackTraceElement stackTraceElement = stackTrace[i10];
        StringBuilder sbM855o = C0204c.m855o("Parameter specified as non-null is null: method ", stackTraceElement.getClassName(), ".", stackTraceElement.getMethodName(), ", parameter ");
        sbM855o.append(str);
        return sbM855o.toString();
    }

    /* JADX INFO: renamed from: j */
    public static void m11115j(String str, RuntimeException runtimeException) {
        StackTraceElement[] stackTrace = runtimeException.getStackTrace();
        int length = stackTrace.length;
        int i10 = -1;
        for (int i11 = 0; i11 < length; i11++) {
            if (str.equals(stackTrace[i11].getClassName())) {
                i10 = i11;
            }
        }
        runtimeException.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i10 + 1, length));
    }

    /* JADX INFO: renamed from: k */
    public static String m11116k(Object obj, String str) {
        return str + obj;
    }

    /* JADX INFO: renamed from: l */
    public static void m11117l(String str) {
        UninitializedPropertyAccessException uninitializedPropertyAccessException = new UninitializedPropertyAccessException(C0141b.m611g("lateinit property ", str, " has not been initialized"));
        m11115j(C5207g.class.getName(), uninitializedPropertyAccessException);
        throw uninitializedPropertyAccessException;
    }
}
