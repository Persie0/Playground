package p000;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class cc5 {

    /* JADX INFO: renamed from: a */
    public static final HashMap f9882a = new HashMap();

    /* JADX INFO: renamed from: b */
    public static final HashMap f9883b = new HashMap();

    /* JADX INFO: renamed from: a */
    public static void m4525a(Constructor constructor, tb5 tb5Var) {
        try {
            Object objNewInstance = constructor.newInstance(tb5Var);
            objNewInstance.getClass();
            e65.m10881m(objNewInstance);
            throw null;
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:58:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:70:0x012b  */
    /* JADX INFO: renamed from: b */
    public static int m4526b(Class cls) {
        Constructor<?> declaredConstructor;
        boolean zBooleanValue;
        Class<?>[] interfaces;
        HashMap map = f9882a;
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int i = 1;
        if (cls.getCanonicalName() != null) {
            ArrayList arrayList = null;
            try {
                Package r4 = cls.getPackage();
                String canonicalName = cls.getCanonicalName();
                String name = r4 != null ? r4.getName() : "";
                name.getClass();
                if (name.length() != 0) {
                    canonicalName.getClass();
                    canonicalName = canonicalName.substring(name.length() + 1);
                }
                canonicalName.getClass();
                String strConcat = cl9.m4839V(canonicalName, ".", "_").concat("_LifecycleAdapter");
                if (name.length() != 0) {
                    strConcat = name + '.' + strConcat;
                }
                declaredConstructor = Class.forName(strConcat).getDeclaredConstructor(cls);
                if (!declaredConstructor.isAccessible()) {
                    declaredConstructor.setAccessible(true);
                }
            } catch (ClassNotFoundException unused) {
                declaredConstructor = null;
            } catch (NoSuchMethodException e) {
                v63.m23141s(e);
                return 0;
            }
            HashMap map2 = f9883b;
            if (declaredConstructor != null) {
                map2.put(cls, vz1.m23604J(declaredConstructor));
            } else {
                d31 d31Var = d31.f34889c;
                HashMap map3 = d31Var.f34891b;
                Boolean bool = (Boolean) map3.get(cls);
                if (bool != null) {
                    zBooleanValue = bool.booleanValue();
                } else {
                    try {
                        Method[] declaredMethods = cls.getDeclaredMethods();
                        int length = declaredMethods.length;
                        int i2 = 0;
                        while (true) {
                            if (i2 >= length) {
                                map3.put(cls, Boolean.FALSE);
                                zBooleanValue = false;
                                break;
                            }
                            if (((ds6) declaredMethods[i2].getAnnotation(ds6.class)) != null) {
                                d31Var.m10004a(cls, declaredMethods);
                                zBooleanValue = true;
                                break;
                            }
                            i2++;
                        }
                    } catch (NoClassDefFoundError e2) {
                        throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e2);
                    }
                }
                if (!zBooleanValue) {
                    Class superclass = cls.getSuperclass();
                    if (superclass == null || !tb5.class.isAssignableFrom(superclass)) {
                        interfaces = cls.getInterfaces();
                        interfaces.getClass();
                        for (Class<?> cls2 : interfaces) {
                            if (cls2 == null && tb5.class.isAssignableFrom(cls2)) {
                                cls2.getClass();
                                if (m4526b(cls2) != 1) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    Object obj = map2.get(cls2);
                                    obj.getClass();
                                    arrayList.addAll((Collection) obj);
                                }
                            }
                        }
                        if (arrayList != null) {
                            map2.put(cls, arrayList);
                        }
                    } else {
                        superclass.getClass();
                        if (m4526b(superclass) != 1) {
                            Object obj2 = map2.get(superclass);
                            obj2.getClass();
                            arrayList = new ArrayList((Collection) obj2);
                            interfaces = cls.getInterfaces();
                            interfaces.getClass();
                            while (i < r8) {
                                if (cls2 == null) {
                                }
                            }
                            if (arrayList != null) {
                                map2.put(cls, arrayList);
                            }
                        }
                    }
                }
            }
            i = 2;
        }
        map.put(cls, Integer.valueOf(i));
        return i;
    }
}
