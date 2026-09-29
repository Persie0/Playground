package p515yl;

import dm.C5207g;
import hm.C6080b;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.random.Random;

/* JADX INFO: renamed from: yl.a */
/* JADX INFO: loaded from: classes2.dex */
public class C10414a {

    /* JADX INFO: renamed from: yl.a$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public static final Method f52218a;

        /* JADX WARN: Code duplicated, block: B:13:0x0041  */
        static {
            Method method;
            boolean z10;
            Class<?> cls;
            Method[] methods = Throwable.class.getMethods();
            C5207g.m11110e(methods, "throwableMethods");
            int length = methods.length;
            int i10 = 0;
            while (true) {
                Method method2 = null;
                if (i10 >= length) {
                    method = method2;
                    break;
                }
                Method method3 = methods[i10];
                if (C5207g.m11106a(method3.getName(), "addSuppressed")) {
                    Class<?>[] parameterTypes = method3.getParameterTypes();
                    C5207g.m11110e(parameterTypes, "it.parameterTypes");
                    if (parameterTypes.length == 1) {
                        cls = method2;
                        cls = parameterTypes[0];
                    }
                    cls = method2;
                    z10 = C5207g.m11106a(cls, Throwable.class);
                }
                if (z10) {
                    method = method3;
                    break;
                }
                i10++;
            }
            f52218a = method;
            int length2 = methods.length;
            for (int i11 = 0; i11 < length2 && !C5207g.m11106a(methods[i11].getName(), "getSuppressed"); i11++) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void mo19395a(Throwable th2, Throwable th3) throws IllegalAccessException, InvocationTargetException {
        C5207g.m11111f(th2, "cause");
        C5207g.m11111f(th3, "exception");
        Method method = a.f52218a;
        if (method != null) {
            method.invoke(th2, th3);
        }
    }

    /* JADX INFO: renamed from: b */
    public Random mo523b() {
        return new C6080b();
    }
}
