package p000;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class akk {

    /* JADX INFO: renamed from: a */
    public static final akk f589a = new akk();

    /* JADX INFO: renamed from: c */
    private final Map f591c = new HashMap();

    /* JADX INFO: renamed from: b */
    public final Map f590b = new HashMap();

    /* JADX INFO: renamed from: d */
    private static final void m864d(Map map, akj akjVar, akq akqVar, Class cls) {
        akq akqVar2 = (akq) map.get(akjVar);
        if (akqVar2 == null || akqVar == akqVar2) {
            if (akqVar2 == null) {
                map.put(akjVar, akqVar);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + akjVar.f588b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + akqVar2 + ", new value " + akqVar);
    }

    /* JADX INFO: renamed from: a */
    public final aki m865a(Class cls, Method[] methodArr) {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        if (superclass != null) {
            map.putAll(m866b(superclass).f586b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry entry : m866b(cls2).f586b.entrySet()) {
                m864d(map, (akj) entry.getKey(), (akq) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = m867c(cls);
        }
        boolean z = false;
        for (Method method : methodArr) {
            alf alfVar = (alf) method.getAnnotation(alf.class);
            if (alfVar != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                int length = parameterTypes.length;
                if (length <= 0) {
                    i = 0;
                } else {
                    if (!akv.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i = 1;
                }
                akq akqVarM907a = alfVar.m907a();
                if (length > 1) {
                    if (!akq.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (akqVarM907a != akq.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i = 2;
                }
                if (length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                m864d(map, new akj(i, method), akqVarM907a, cls);
                z = true;
            }
        }
        aki akiVar = new aki(map);
        this.f591c.put(cls, akiVar);
        this.f590b.put(cls, Boolean.valueOf(z));
        return akiVar;
    }

    /* JADX INFO: renamed from: b */
    public final aki m866b(Class cls) {
        aki akiVar = (aki) this.f591c.get(cls);
        return akiVar != null ? akiVar : m865a(cls, null);
    }

    /* JADX INFO: renamed from: c */
    public final Method[] m867c(Class cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
        }
    }
}
