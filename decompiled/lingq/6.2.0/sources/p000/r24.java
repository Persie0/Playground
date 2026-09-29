package p000;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public final class r24 implements InvocationHandler {
    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        if (lp1.f49971a.contains(this)) {
            return null;
        }
        try {
            obj.getClass();
            method.getClass();
            return null;
        } catch (Throwable th) {
            lp1.m16420a(this, th);
            return null;
        }
    }
}
