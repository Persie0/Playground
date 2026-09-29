package androidx.view;

import android.app.Application;
import dm.C5207g;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.C6744b;
import p385sf.C9000b;

/* JADX INFO: renamed from: androidx.lifecycle.f0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1032f0 {

    /* JADX INFO: renamed from: a */
    public static final List<Class<?>> f6647a = C9000b.m17252r(Application.class, C1024c0.class);

    /* JADX INFO: renamed from: b */
    public static final List<Class<?>> f6648b = C9000b.m17251q(C1024c0.class);

    /* JADX INFO: renamed from: a */
    public static final <T> Constructor<T> m3936a(Class<T> cls, List<? extends Class<?>> list) {
        C5207g.m11111f(list, "signature");
        Object[] constructors = cls.getConstructors();
        C5207g.m11110e(constructors, "modelClass.constructors");
        for (Object obj : constructors) {
            Constructor<T> constructor = (Constructor<T>) obj;
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            C5207g.m11110e(parameterTypes, "constructor.parameterTypes");
            List listM13391w0 = C6744b.m13391w0(parameterTypes);
            if (C5207g.m11106a(list, listM13391w0)) {
                return constructor;
            }
            if (list.size() == listM13391w0.size() && listM13391w0.containsAll(list)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: b */
    public static final <T extends AbstractC1036h0> T m3937b(Class<T> cls, Constructor<T> constructor, Object... objArr) {
        try {
            return constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Failed to access " + cls, e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException("An exception happened in constructor of " + cls, e12.getCause());
        }
    }
}
