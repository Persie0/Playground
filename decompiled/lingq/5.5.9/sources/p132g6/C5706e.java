package p132g6;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: g6.e */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class C5706e {
    /* JADX WARN: Unreachable blocks removed: 3, instructions: 3 */
    /* JADX INFO: renamed from: a */
    public static InterfaceC5704c m12069a(String str) {
        try {
            Class<?> cls = Class.forName(str);
            try {
                Object objNewInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                if (objNewInstance instanceof InterfaceC5704c) {
                    return (InterfaceC5704c) objNewInstance;
                }
                throw new RuntimeException("Expected instanceof GlideModule, but found: " + objNewInstance);
            } catch (IllegalAccessException e10) {
                m12070b(cls, e10);
                throw null;
            } catch (InstantiationException e11) {
                m12070b(cls, e11);
                throw null;
            } catch (NoSuchMethodException e12) {
                m12070b(cls, e12);
                throw null;
            } catch (InvocationTargetException e13) {
                m12070b(cls, e13);
                throw null;
            }
        } catch (ClassNotFoundException e14) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", e14);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: b */
    public static void m12070b(Class cls, ReflectiveOperationException reflectiveOperationException) {
        throw new RuntimeException("Unable to instantiate GlideModule implementation for " + cls, reflectiveOperationException);
    }
}
