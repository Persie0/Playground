package p000;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class alp {

    /* JADX INFO: renamed from: a */
    public static final List f656a = omn.m18683W(new Class[]{Application.class, alj.class});

    /* JADX INFO: renamed from: b */
    public static final List f657b = omn.m18666F(alj.class);

    /* JADX INFO: renamed from: a */
    public static final alr m920a(Class cls, Constructor constructor, Object... objArr) {
        try {
            return (alr) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to access ");
            sb.append(cls);
            throw new RuntimeException("Failed to access ".concat(cls.toString()), e);
        } catch (InstantiationException e2) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e2);
        } catch (InvocationTargetException e3) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("An exception happened in constructor of ");
            sb2.append(cls);
            throw new RuntimeException("An exception happened in constructor of ".concat(cls.toString()), e3.getCause());
        }
    }

    /* JADX INFO: renamed from: b */
    public static final Constructor m921b(Class cls, List list) {
        list.getClass();
        Constructor<?>[] constructors = cls.getConstructors();
        constructors.getClass();
        for (Constructor<?> constructor : constructors) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            parameterTypes.getClass();
            List listM18687aa = omn.m18687aa(parameterTypes);
            if (ooc.m18737c(list, listM18687aa)) {
                constructor.getClass();
                return constructor;
            }
            if (list.size() == listM18687aa.size() && listM18687aa.containsAll(list)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }
}
