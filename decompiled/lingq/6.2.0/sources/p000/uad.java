package p000;

import android.view.ViewGroup;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public abstract class uad {

    /* JADX INFO: renamed from: a */
    public static Constructor f63658a;

    /* JADX INFO: renamed from: a */
    public static Object m22663a(Class cls, Object obj, Method method, Object[] objArr) throws NoSuchMethodException {
        Constructor declaredConstructor = f63658a;
        if (declaredConstructor == null) {
            declaredConstructor = MethodHandles.Lookup.class.getDeclaredConstructor(Class.class, Integer.TYPE);
            declaredConstructor.setAccessible(true);
            f63658a = declaredConstructor;
        }
        return ((MethodHandles.Lookup) declaredConstructor.newInstance(cls, -1)).unreflectSpecial(method, cls).bindTo(obj).invokeWithArguments(objArr);
    }

    /* JADX INFO: renamed from: b */
    public static void m22664b(ViewGroup viewGroup) {
        kta.m15689b(viewGroup, true);
    }
}
