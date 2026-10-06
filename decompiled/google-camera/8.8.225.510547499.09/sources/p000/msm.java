package p000;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class msm {

    /* JADX INFO: renamed from: a */
    private static final Object f41552a;

    static {
        Object objM16870e = m16870e();
        f41552a = objM16870e;
        if (objM16870e != null) {
            m16871f("getStackTraceElement", Throwable.class, Integer.TYPE);
        }
        if (objM16870e == null) {
            return;
        }
        m16872g(objM16870e);
    }

    @Deprecated
    /* JADX INFO: renamed from: a */
    public static RuntimeException m16866a(Throwable th) {
        m16869d(th);
        throw new RuntimeException(th);
    }

    /* JADX INFO: renamed from: b */
    public static String m16867b(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    /* JADX INFO: renamed from: c */
    public static void m16868c(Throwable th, Class cls) throws Throwable {
        if (cls.isInstance(th)) {
            throw ((Throwable) cls.cast(th));
        }
        m16869d(th);
    }

    /* JADX INFO: renamed from: d */
    public static void m16869d(Throwable th) {
        th.getClass();
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        }
        if (th instanceof Error) {
            throw ((Error) th);
        }
    }

    /* JADX INFO: renamed from: e */
    private static Object m16870e() {
        try {
            return Class.forName("sun.misc.SharedSecrets", false, null).getMethod("getJavaLangAccess", new Class[0]).invoke(null, new Object[0]);
        } catch (ThreadDeath e) {
            throw e;
        } catch (Throwable th) {
            return null;
        }
    }

    /* JADX INFO: renamed from: f */
    private static Method m16871f(String str, Class... clsArr) {
        try {
            return Class.forName("sun.misc.JavaLangAccess", false, null).getMethod(str, clsArr);
        } catch (ThreadDeath e) {
            throw e;
        } catch (Throwable th) {
            return null;
        }
    }

    /* JADX INFO: renamed from: g */
    private static void m16872g(Object obj) {
        try {
            Method methodM16871f = m16871f("getStackTraceDepth", Throwable.class);
            if (methodM16871f == null) {
                return;
            }
            methodM16871f.invoke(obj, new Throwable());
        } catch (IllegalAccessException | UnsupportedOperationException | InvocationTargetException e) {
        }
    }
}
