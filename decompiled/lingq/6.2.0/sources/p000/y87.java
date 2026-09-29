package p000;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public abstract class y87 {

    /* JADX INFO: renamed from: a */
    public static final Method f69480a;

    /* JADX INFO: renamed from: b */
    public static final Method f69481b;

    static {
        Method method;
        Method method2;
        Method[] methods = Throwable.class.getMethods();
        methods.getClass();
        int length = methods.length;
        int i = 0;
        while (true) {
            method = null;
            if (i >= length) {
                method2 = null;
                break;
            }
            method2 = methods[i];
            if (fa4.m11650l(method2.getName(), "addSuppressed")) {
                Class<?>[] parameterTypes = method2.getParameterTypes();
                parameterTypes.getClass();
                if (fa4.m11650l(parameterTypes.length == 1 ? parameterTypes[0] : null, Throwable.class)) {
                    break;
                }
            }
            i++;
        }
        f69480a = method2;
        for (Method method3 : methods) {
            if (fa4.m11650l(method3.getName(), "getSuppressed")) {
                method = method3;
                break;
            }
        }
        f69481b = method;
    }
}
