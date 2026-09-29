package p312p2;

import android.graphics.Typeface;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: p2.h */
/* JADX INFO: loaded from: classes.dex */
public final class C8176h extends C8175g {
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p312p2.C8175g
    /* JADX INFO: renamed from: i */
    public final Typeface mo16240i(Object obj) {
        try {
            Object objNewInstance = Array.newInstance(this.f44317f, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.f44323l.invoke(null, objNewInstance, "sans-serif", -1, -1);
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // p312p2.C8175g
    /* JADX INFO: renamed from: n */
    public final Method mo16243n(Class<?> cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass(), String.class, cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
