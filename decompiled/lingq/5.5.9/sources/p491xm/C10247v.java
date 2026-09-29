package p491xm;

import dm.C5207g;
import gn.InterfaceC5842v;
import gn.InterfaceC5843w;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: xm.v */
/* JADX INFO: loaded from: classes2.dex */
public final class C10247v extends AbstractC10242q implements InterfaceC5842v {

    /* JADX INFO: renamed from: a */
    public final Object f51677a;

    public C10247v(Object obj) {
        C5207g.m11111f(obj, "recordComponent");
        this.f51677a = obj;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p491xm.AbstractC10242q
    /* JADX INFO: renamed from: Y */
    public final Member mo19214Y() throws IllegalAccessException, InvocationTargetException {
        Object obj = this.f51677a;
        C5207g.m11111f(obj, "recordComponent");
        C10226a.a aVar = C10226a.f51647a;
        Method method = null;
        if (aVar == null) {
            Class<?> cls = obj.getClass();
            try {
                aVar = new C10226a.a(cls.getMethod("getType", new Class[0]), cls.getMethod("getAccessor", new Class[0]));
            } catch (NoSuchMethodException unused) {
                aVar = new C10226a.a(null, null);
            }
            C10226a.f51647a = aVar;
        }
        Method method2 = aVar.f51649b;
        if (method2 != null) {
            Object objInvoke = method2.invoke(obj, new Object[0]);
            C5207g.m11109d(objInvoke, "null cannot be cast to non-null type java.lang.reflect.Method");
            method = (Method) objInvoke;
        }
        if (method != null) {
            return method;
        }
        throw new NoSuchMethodError("Can't find `getAccessor` method");
    }

    @Override // gn.InterfaceC5842v
    /* JADX INFO: renamed from: b */
    public final boolean mo12285b() {
        return false;
    }

    @Override // gn.InterfaceC5842v
    /* JADX INFO: renamed from: c */
    public final InterfaceC5843w mo12286c() throws IllegalAccessException, InvocationTargetException {
        Object obj = this.f51677a;
        C5207g.m11111f(obj, "recordComponent");
        C10226a.a aVar = C10226a.f51647a;
        Class cls = null;
        if (aVar == null) {
            Class<?> cls2 = obj.getClass();
            try {
                aVar = new C10226a.a(cls2.getMethod("getType", new Class[0]), cls2.getMethod("getAccessor", new Class[0]));
            } catch (NoSuchMethodException unused) {
                aVar = new C10226a.a(null, null);
            }
            C10226a.f51647a = aVar;
        }
        Method method = aVar.f51648a;
        if (method != null) {
            Object objInvoke = method.invoke(obj, new Object[0]);
            C5207g.m11109d(objInvoke, "null cannot be cast to non-null type java.lang.Class<*>");
            cls = (Class) objInvoke;
        }
        if (cls != null) {
            return new C10236k(cls);
        }
        throw new NoSuchMethodError("Can't find `getType` method");
    }
}
