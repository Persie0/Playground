package androidx.view;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: androidx.lifecycle.c */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class C1023c {

    /* JADX INFO: renamed from: c */
    public static final C1023c f6608c = new C1023c();

    /* JADX INFO: renamed from: a */
    public final HashMap f6609a = new HashMap();

    /* JADX INFO: renamed from: b */
    public final HashMap f6610b = new HashMap();

    /* JADX INFO: renamed from: androidx.lifecycle.c$a */
    @Deprecated
    public static class a {

        /* JADX INFO: renamed from: a */
        public final HashMap f6611a = new HashMap();

        /* JADX INFO: renamed from: b */
        public final Map<b, Lifecycle.Event> f6612b;

        public a(HashMap map) {
            this.f6612b = map;
            for (Map.Entry entry : map.entrySet()) {
                Lifecycle.Event event = (Lifecycle.Event) entry.getValue();
                List arrayList = (List) this.f6611a.get(event);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    this.f6611a.put(event, arrayList);
                }
                arrayList.add((b) entry.getKey());
            }
        }

        /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
        /* JADX INFO: renamed from: a */
        public static void m3927a(List<b> list, InterfaceC1051q interfaceC1051q, Lifecycle.Event event, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    b bVar = list.get(size);
                    bVar.getClass();
                    try {
                        int i10 = bVar.f6613a;
                        Method method = bVar.f6614b;
                        if (i10 == 0) {
                            method.invoke(obj, new Object[0]);
                        } else if (i10 == 1) {
                            method.invoke(obj, interfaceC1051q);
                        } else if (i10 == 2) {
                            method.invoke(obj, interfaceC1051q, event);
                        }
                    } catch (IllegalAccessException e10) {
                        throw new RuntimeException(e10);
                    } catch (InvocationTargetException e11) {
                        throw new RuntimeException("Failed to call observer method", e11.getCause());
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.c$b */
    @Deprecated
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final int f6613a;

        /* JADX INFO: renamed from: b */
        public final Method f6614b;

        public b(int i10, Method method) {
            this.f6613a = i10;
            this.f6614b = method;
            method.setAccessible(true);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f6613a == bVar.f6613a && this.f6614b.getName().equals(bVar.f6614b.getName());
        }

        public final int hashCode() {
            return this.f6614b.getName().hashCode() + (this.f6613a * 31);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m3924c(HashMap map, b bVar, Lifecycle.Event event, Class cls) {
        Lifecycle.Event event2 = (Lifecycle.Event) map.get(bVar);
        if (event2 == null || event == event2) {
            if (event2 == null) {
                map.put(bVar, event);
            }
            return;
        }
        throw new IllegalArgumentException("Method " + bVar.f6614b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + event2 + ", new value " + event);
    }

    /* JADX WARN: Unreachable blocks removed: 4, instructions: 4 */
    /* JADX INFO: renamed from: a */
    public final a m3925a(Class<?> cls, Method[] methodArr) {
        int i10;
        Class<? super Object> superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        if (superclass != null) {
            map.putAll(m3926b(superclass).f6612b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry<b, Lifecycle.Event> entry : m3926b(cls2).f6612b.entrySet()) {
                m3924c(map, entry.getKey(), entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e10) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e10);
            }
        }
        boolean z10 = false;
        for (Method method : methodArr) {
            InterfaceC1058x interfaceC1058x = (InterfaceC1058x) method.getAnnotation(InterfaceC1058x.class);
            if (interfaceC1058x != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i10 = 0;
                } else {
                    if (!InterfaceC1051q.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i10 = 1;
                }
                Lifecycle.Event eventValue = interfaceC1058x.value();
                if (parameterTypes.length > 1) {
                    if (!Lifecycle.Event.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (eventValue != Lifecycle.Event.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i10 = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                m3924c(map, new b(i10, method), eventValue, cls);
                z10 = true;
            }
        }
        a aVar = new a(map);
        this.f6609a.put(cls, aVar);
        this.f6610b.put(cls, Boolean.valueOf(z10));
        return aVar;
    }

    /* JADX INFO: renamed from: b */
    public final a m3926b(Class<?> cls) {
        a aVar = (a) this.f6609a.get(cls);
        return aVar != null ? aVar : m3925a(cls, null);
    }
}
