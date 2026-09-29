package p000;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class xl8 {

    /* JADX INFO: renamed from: a */
    public static final List f68329a = vz1.m23605K(Application.class, nl8.class);

    /* JADX INFO: renamed from: b */
    public static final List f68330b = vz1.m23604J(nl8.class);

    /* JADX INFO: renamed from: c */
    public static final Constructor m24608c(Class cls, List list) {
        list.getClass();
        Constructor<?>[] constructors = cls.getConstructors();
        constructors.getClass();
        for (Constructor<?> constructor : constructors) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            parameterTypes.getClass();
            List listM20852t0 = AbstractC3550rv.m20852t0(parameterTypes);
            if (list.equals(listM20852t0)) {
                return constructor;
            }
            if (list.size() == listM20852t0.size() && listM20852t0.containsAll(list)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static final wta m24609d(Class cls, Constructor constructor, Object... objArr) {
        try {
            return (wta) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e) {
            v63.m23137o("Failed to access ", cls, e);
            return null;
        } catch (InstantiationException e2) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e2);
        } catch (InvocationTargetException e3) {
            ij6.m13958p("An exception happened in constructor of " + cls, e3.getCause());
            return null;
        }
    }
}
