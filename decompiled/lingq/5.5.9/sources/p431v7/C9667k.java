package p431v7;

import dm.C5207g;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import p173i8.C6205a;

/* JADX INFO: renamed from: v7.k */
/* JADX INFO: loaded from: classes.dex */
public final class C9667k {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f49506a = 0;

    static {
        new C9667k();
    }

    /* JADX INFO: renamed from: a */
    public static final Class<?> m18152a(String str) {
        if (C6205a.m12742b(C9667k.class)) {
            return null;
        }
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (Throwable th2) {
            C6205a.m12741a(C9667k.class, th2);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static final Method m18153b(Class<?> cls, String str, Class<?>... clsArr) {
        if (C6205a.m12742b(C9667k.class)) {
            return null;
        }
        try {
            C5207g.m11111f(clsArr, "args");
            try {
                return cls.getDeclaredMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            } catch (NoSuchMethodException unused) {
                return null;
            }
        } catch (Throwable th2) {
            C6205a.m12741a(C9667k.class, th2);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static final Method m18154c(Class<?> cls, String str, Class<?>... clsArr) {
        if (C6205a.m12742b(C9667k.class)) {
            return null;
        }
        try {
            C5207g.m11111f(cls, "clazz");
            try {
                return cls.getMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            } catch (NoSuchMethodException unused) {
                return null;
            }
        } catch (Throwable th2) {
            C6205a.m12741a(C9667k.class, th2);
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public static final Object m18155d(Class cls, Object obj, Method method, Object... objArr) {
        if (C6205a.m12742b(C9667k.class)) {
            return null;
        }
        try {
            C5207g.m11111f(cls, "clazz");
            C5207g.m11111f(method, "method");
            C5207g.m11111f(objArr, "args");
            if (obj != null) {
                obj = cls.cast(obj);
            }
            try {
                return method.invoke(obj, Arrays.copyOf(objArr, objArr.length));
            } catch (IllegalAccessException | InvocationTargetException unused) {
                return null;
            }
        } catch (Throwable th2) {
            C6205a.m12741a(C9667k.class, th2);
            return null;
        }
    }
}
