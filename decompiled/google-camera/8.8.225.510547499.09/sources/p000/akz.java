package p000;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class akz {

    /* JADX INFO: renamed from: a */
    public static final akz f608a = new akz();

    /* JADX INFO: renamed from: c */
    private static final Map f610c = new HashMap();

    /* JADX INFO: renamed from: b */
    public static final Map f609b = new HashMap();

    private akz() {
    }

    /* JADX INFO: renamed from: b */
    public static final akm m888b(Constructor constructor, Object obj) {
        try {
            Object objNewInstance = constructor.newInstance(obj);
            objNewInstance.getClass();
            return (akm) objNewInstance;
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    /* JADX INFO: renamed from: c */
    private static final boolean m889c(Class cls) {
        return cls != null && aku.class.isAssignableFrom(cls);
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00df  */
    /* JADX WARN: Code duplicated, block: B:48:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:50:0x00fb A[PHI: r0
      0x00fb: PHI (r0v7 java.util.ArrayList) = (r0v5 java.util.ArrayList), (r0v13 java.util.ArrayList) binds: [B:44:0x00dd, B:48:0x00e9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:53:0x0105  */
    /* JADX WARN: Code duplicated, block: B:55:0x010d  */
    /* JADX WARN: Code duplicated, block: B:58:0x0117 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:59:0x0119  */
    /* JADX WARN: Code duplicated, block: B:63:0x0131  */
    /* JADX WARN: Code duplicated, block: B:72:0x0139 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x012c A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public final int m890a(Class cls) {
        Constructor declaredConstructor;
        Class superclass;
        Class<?>[] interfaces;
        Integer num = (Integer) f610c.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int i = 1;
        if (cls.getCanonicalName() != null) {
            ArrayList arrayList = null;
            try {
                Package r3 = cls.getPackage();
                String canonicalName = cls.getCanonicalName();
                String name = r3 != null ? r3.getName() : "";
                name.getClass();
                if (name.length() != 0) {
                    canonicalName.getClass();
                    canonicalName = canonicalName.substring(name.length() + 1);
                    canonicalName.getClass();
                }
                canonicalName.getClass();
                String strConcat = ook.m18763A(canonicalName, ".", "_").concat("_LifecycleAdapter");
                if (name.length() != 0) {
                    strConcat = name + '.' + strConcat;
                }
                Class<?> cls2 = Class.forName(strConcat);
                cls2.getClass();
                declaredConstructor = cls2.getDeclaredConstructor(cls);
                if (!declaredConstructor.isAccessible()) {
                    declaredConstructor.setAccessible(true);
                }
            } catch (ClassNotFoundException e) {
                declaredConstructor = null;
            } catch (NoSuchMethodException e2) {
                throw new RuntimeException(e2);
            }
            if (declaredConstructor != null) {
                f609b.put(cls, omn.m18666F(declaredConstructor));
                i = 2;
            } else {
                akk akkVar = akk.f589a;
                Boolean bool = (Boolean) akkVar.f590b.get(cls);
                if (bool == null) {
                    Method[] methodArrM867c = akkVar.m867c(cls);
                    for (Method method : methodArrM867c) {
                        if (((alf) method.getAnnotation(alf.class)) != null) {
                            akkVar.m865a(cls, methodArrM867c);
                        }
                    }
                    akkVar.f590b.put(cls, false);
                    superclass = cls.getSuperclass();
                    if (m889c(superclass)) {
                        superclass.getClass();
                        if (m890a(superclass) != 1) {
                            Object obj = f609b.get(superclass);
                            obj.getClass();
                            arrayList = new ArrayList((Collection) obj);
                            interfaces = cls.getInterfaces();
                            interfaces.getClass();
                            for (Class<?> cls3 : interfaces) {
                                if (m889c(cls3)) {
                                    cls3.getClass();
                                    if (m890a(cls3) == 1) {
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                        }
                                        Object obj2 = f609b.get(cls3);
                                        obj2.getClass();
                                        arrayList.addAll((Collection) obj2);
                                    }
                                }
                            }
                            if (arrayList != null) {
                                f609b.put(cls, arrayList);
                                i = 2;
                            }
                        }
                    } else {
                        interfaces = cls.getInterfaces();
                        interfaces.getClass();
                        while (i < interfaces.length) {
                            if (m889c(cls3)) {
                                cls3.getClass();
                                if (m890a(cls3) == 1) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    Object obj3 = f609b.get(cls3);
                                    obj3.getClass();
                                    arrayList.addAll((Collection) obj3);
                                }
                            }
                        }
                        if (arrayList != null) {
                            f609b.put(cls, arrayList);
                            i = 2;
                        }
                    }
                } else if (!bool.booleanValue()) {
                    superclass = cls.getSuperclass();
                    if (m889c(superclass)) {
                        superclass.getClass();
                        if (m890a(superclass) != 1) {
                            Object obj4 = f609b.get(superclass);
                            obj4.getClass();
                            arrayList = new ArrayList((Collection) obj4);
                            interfaces = cls.getInterfaces();
                            interfaces.getClass();
                            while (i < interfaces.length) {
                                if (m889c(cls3)) {
                                    cls3.getClass();
                                    if (m890a(cls3) == 1) {
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                        }
                                        Object obj5 = f609b.get(cls3);
                                        obj5.getClass();
                                        arrayList.addAll((Collection) obj5);
                                    }
                                }
                            }
                            if (arrayList != null) {
                                f609b.put(cls, arrayList);
                                i = 2;
                            }
                        }
                    } else {
                        interfaces = cls.getInterfaces();
                        interfaces.getClass();
                        while (i < interfaces.length) {
                            if (m889c(cls3)) {
                                cls3.getClass();
                                if (m890a(cls3) == 1) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    Object obj6 = f609b.get(cls3);
                                    obj6.getClass();
                                    arrayList.addAll((Collection) obj6);
                                }
                            }
                        }
                        if (arrayList != null) {
                            f609b.put(cls, arrayList);
                            i = 2;
                        }
                    }
                }
            }
        }
        f610c.put(cls, Integer.valueOf(i));
        return i;
    }
}
