package p000;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class oxh {

    /* JADX INFO: renamed from: a */
    public static final oxe f46772a;

    /* JADX INFO: renamed from: b */
    private static final int f46773b = m19131b(Throwable.class, -1);

    static {
        oxe oxeVar;
        try {
            oxeVar = oxi.f46774a ? oyh.f46818a : owz.f46747a;
        } catch (Throwable th) {
            oxeVar = oyh.f46818a;
        }
        f46772a = oxeVar;
    }

    /* JADX INFO: renamed from: a */
    public static final oni m19130a(Class cls) {
        axf axfVar = axf.f2646j;
        if (f46773b != m19131b(cls, 0)) {
            return axfVar;
        }
        Object[] constructors = cls.getConstructors();
        ned nedVar = new ned(4);
        constructors.getClass();
        int length = constructors.length;
        if (length != 0) {
            constructors = Arrays.copyOf(constructors, length);
            constructors.getClass();
            if (constructors.length > 1) {
                Arrays.sort(constructors, nedVar);
            }
        }
        for (Constructor constructor : omn.m18683W(constructors)) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            avu avuVar = null;
            switch (parameterTypes.length) {
                case 0:
                    avuVar = new avu(constructor, 15);
                    break;
                case 1:
                    Class<?> cls2 = parameterTypes[0];
                    if (ooc.m18737c(cls2, Throwable.class)) {
                        avuVar = new avu(constructor, 13);
                    } else if (ooc.m18737c(cls2, String.class)) {
                        avuVar = new avu(constructor, 14);
                    }
                    break;
                case 2:
                    if (ooc.m18737c(parameterTypes[0], String.class) && ooc.m18737c(parameterTypes[1], Throwable.class)) {
                        avuVar = new avu(constructor, 12);
                    }
                    break;
            }
            if (avuVar != null) {
                return avuVar;
            }
        }
        return axfVar;
    }

    /* JADX INFO: renamed from: b */
    private static final int m19131b(Class cls, int i) {
        Object objM15591r;
        ooj.m18762a(cls);
        int i2 = 0;
        do {
            try {
                int i3 = 0;
                for (Field field : cls.getDeclaredFields()) {
                    if (!Modifier.isStatic(field.getModifiers())) {
                        i3++;
                    }
                }
                i2 += i3;
                cls = cls.getSuperclass();
            } catch (Throwable th) {
                objM15591r = lkm.m15591r(th);
            }
        } while (cls != null);
        objM15591r = Integer.valueOf(i2);
        Object objValueOf = Integer.valueOf(i);
        if (true == (objM15591r instanceof okc)) {
            objM15591r = objValueOf;
        }
        return ((Number) objM15591r).intValue();
    }
}
