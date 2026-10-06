package p000;

import java.lang.reflect.Method;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class omm {

    /* JADX INFO: renamed from: a */
    public static final Method f46317a;

    static {
        int length;
        Method method;
        Method[] methods = Throwable.class.getMethods();
        methods.getClass();
        int i = 0;
        while (true) {
            length = methods.length;
            method = null;
            if (i >= length) {
                break;
            }
            Method method2 = methods[i];
            if (ooc.m18737c(method2.getName(), "addSuppressed")) {
                Class<?>[] parameterTypes = method2.getParameterTypes();
                parameterTypes.getClass();
                if (ooc.m18737c(parameterTypes.length == 1 ? parameterTypes[0] : null, Throwable.class)) {
                    method = method2;
                    break;
                }
            }
            i++;
        }
        f46317a = method;
        for (int i2 = 0; i2 < length && !ooc.m18737c(methods[i2].getName(), "getSuppressed"); i2++) {
        }
    }
}
