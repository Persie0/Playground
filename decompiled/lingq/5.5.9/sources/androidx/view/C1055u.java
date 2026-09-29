package androidx.view;

import dm.C5207g;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import mo.C7661i;
import p385sf.C9000b;

/* JADX INFO: renamed from: androidx.lifecycle.u */
/* JADX INFO: loaded from: classes.dex */
public final class C1055u {

    /* JADX INFO: renamed from: a */
    public static final HashMap f6690a = new HashMap();

    /* JADX INFO: renamed from: b */
    public static final HashMap f6691b = new HashMap();

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: a */
    public static InterfaceC1035h m3961a(Constructor constructor, Object obj) {
        try {
            Object objNewInstance = constructor.newInstance(obj);
            C5207g.m11110e(objNewInstance, "{\n            constructo…tance(`object`)\n        }");
            return (InterfaceC1035h) objNewInstance;
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException(e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException(e12);
        }
    }

    /* JADX WARN: Code duplicated, block: B:66:0x0159  */
    /* JADX WARN: Code duplicated, block: B:71:0x0169  */
    /* JADX WARN: Code duplicated, block: B:74:0x016e  */
    /* JADX WARN: Code duplicated, block: B:77:0x017f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:78:0x0181  */
    /* JADX WARN: Code duplicated, block: B:83:0x019c  */
    /* JADX WARN: Code duplicated, block: B:97:0x017d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x0195 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: b */
    public static int m3962b(Class cls) {
        Constructor declaredConstructor;
        boolean zBooleanValue;
        Class<?>[] interfaces;
        int i10;
        boolean z10;
        HashMap map = f6690a;
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int i11 = 1;
        if (cls.getCanonicalName() != null) {
            ArrayList arrayList = null;
            try {
                Package r10 = cls.getPackage();
                String canonicalName = cls.getCanonicalName();
                String name = r10 != null ? r10.getName() : "";
                C5207g.m11110e(name, "fullPackage");
                if (!(name.length() == 0)) {
                    C5207g.m11110e(canonicalName, "name");
                    canonicalName = canonicalName.substring(name.length() + 1);
                    C5207g.m11110e(canonicalName, "this as java.lang.String).substring(startIndex)");
                }
                C5207g.m11110e(canonicalName, "if (fullPackage.isEmpty(…g(fullPackage.length + 1)");
                String strConcat = C7661i.m15254T2(canonicalName, ".", "_").concat("_LifecycleAdapter");
                if (!(name.length() == 0)) {
                    strConcat = name + '.' + strConcat;
                }
                declaredConstructor = Class.forName(strConcat).getDeclaredConstructor(cls);
                if (!declaredConstructor.isAccessible()) {
                    declaredConstructor.setAccessible(true);
                }
            } catch (ClassNotFoundException unused) {
                declaredConstructor = null;
            } catch (NoSuchMethodException e10) {
                throw new RuntimeException(e10);
            }
            HashMap map2 = f6691b;
            if (declaredConstructor != null) {
                map2.put(cls, C9000b.m17251q(declaredConstructor));
            } else {
                C1023c c1023c = C1023c.f6608c;
                HashMap map3 = c1023c.f6610b;
                Boolean bool = (Boolean) map3.get(cls);
                if (bool != null) {
                    zBooleanValue = bool.booleanValue();
                } else {
                    try {
                        Method[] declaredMethods = cls.getDeclaredMethods();
                        int length = declaredMethods.length;
                        int i12 = 0;
                        while (true) {
                            if (i12 >= length) {
                                map3.put(cls, Boolean.FALSE);
                                zBooleanValue = false;
                                break;
                            }
                            if (((InterfaceC1058x) declaredMethods[i12].getAnnotation(InterfaceC1058x.class)) != null) {
                                c1023c.m3925a(cls, declaredMethods);
                                zBooleanValue = true;
                                break;
                            }
                            i12++;
                        }
                    } catch (NoClassDefFoundError e11) {
                        throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e11);
                    }
                }
                if (!zBooleanValue) {
                    Class superclass = cls.getSuperclass();
                    if (superclass != null && InterfaceC1050p.class.isAssignableFrom(superclass)) {
                        C5207g.m11110e(superclass, "superclass");
                        if (m3962b(superclass) != 1) {
                            Object obj = map2.get(superclass);
                            C5207g.m11108c(obj);
                            arrayList = new ArrayList((Collection) obj);
                            interfaces = cls.getInterfaces();
                            C5207g.m11110e(interfaces, "klass.interfaces");
                            for (Class<?> cls2 : interfaces) {
                                if (cls2 == null && InterfaceC1050p.class.isAssignableFrom(cls2)) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (!z10) {
                                    C5207g.m11110e(cls2, "intrface");
                                    if (m3962b(cls2) == 1) {
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                        }
                                        Object obj2 = map2.get(cls2);
                                        C5207g.m11108c(obj2);
                                        arrayList.addAll((Collection) obj2);
                                    }
                                }
                            }
                            if (arrayList != null) {
                                map2.put(cls, arrayList);
                            }
                        }
                    } else {
                        interfaces = cls.getInterfaces();
                        C5207g.m11110e(interfaces, "klass.interfaces");
                        while (i10 < r7) {
                            if (cls2 == null) {
                                z10 = false;
                            } else {
                                z10 = false;
                            }
                            if (!z10) {
                                C5207g.m11110e(cls2, "intrface");
                                if (m3962b(cls2) == 1) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    Object obj3 = map2.get(cls2);
                                    C5207g.m11108c(obj3);
                                    arrayList.addAll((Collection) obj3);
                                }
                            }
                        }
                        if (arrayList != null) {
                            map2.put(cls, arrayList);
                        }
                    }
                }
            }
            i11 = 2;
        }
        map.put(cls, Integer.valueOf(i11));
        return i11;
    }
}
