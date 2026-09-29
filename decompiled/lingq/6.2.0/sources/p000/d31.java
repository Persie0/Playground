package p000;

import androidx.lifecycle.Lifecycle$Event;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class d31 {

    /* JADX INFO: renamed from: c */
    public static final d31 f34889c = new d31();

    /* JADX INFO: renamed from: a */
    public final HashMap f34890a = new HashMap();

    /* JADX INFO: renamed from: b */
    public final HashMap f34891b = new HashMap();

    /* JADX INFO: renamed from: b */
    public static void m10003b(HashMap map, c31 c31Var, Lifecycle$Event lifecycle$Event, Class cls) {
        Lifecycle$Event lifecycle$Event2 = (Lifecycle$Event) map.get(c31Var);
        if (lifecycle$Event2 == null || lifecycle$Event == lifecycle$Event2) {
            if (lifecycle$Event2 == null) {
                map.put(c31Var, lifecycle$Event);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + c31Var.f9386b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + lifecycle$Event2 + ", new value " + lifecycle$Event);
    }

    /* JADX INFO: renamed from: a */
    public final b31 m10004a(Class cls, Method[] methodArr) {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        HashMap map2 = this.f34890a;
        if (superclass != null) {
            b31 b31VarM10004a = (b31) map2.get(superclass);
            if (b31VarM10004a == null) {
                b31VarM10004a = m10004a(superclass, null);
            }
            map.putAll(b31VarM10004a.f7835b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            b31 b31VarM10004a2 = (b31) map2.get(cls2);
            if (b31VarM10004a2 == null) {
                b31VarM10004a2 = m10004a(cls2, null);
            }
            for (Map.Entry entry : b31VarM10004a2.f7835b.entrySet()) {
                m10003b(map, (c31) entry.getKey(), (Lifecycle$Event) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
            }
        }
        boolean z = false;
        for (Method method : methodArr) {
            ds6 ds6Var = (ds6) method.getAnnotation(ds6.class);
            if (ds6Var != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else {
                    if (!ub5.class.isAssignableFrom(parameterTypes[0])) {
                        C3386nv.m17626m("invalid parameter type. Must be one and instanceof LifecycleOwner");
                        return null;
                    }
                    i = 1;
                }
                Lifecycle$Event lifecycle$EventValue = ds6Var.value();
                if (parameterTypes.length > 1) {
                    if (!Lifecycle$Event.class.isAssignableFrom(parameterTypes[1])) {
                        C3386nv.m17626m("invalid parameter type. second arg must be an event");
                        return null;
                    }
                    if (lifecycle$EventValue != Lifecycle$Event.ON_ANY) {
                        C3386nv.m17626m("Second arg is supported only for ON_ANY value");
                        return null;
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    C3386nv.m17626m("cannot have more than 2 params");
                    return null;
                }
                m10003b(map, new c31(i, method), lifecycle$EventValue, cls);
                z = true;
            }
        }
        b31 b31Var = new b31(map);
        map2.put(cls, b31Var);
        this.f34891b.put(cls, Boolean.valueOf(z));
        return b31Var;
    }
}
