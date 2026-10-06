package p000;

import android.support.wearable.complications.rendering.p002EM.voNZjxiJou;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class avz implements InvocationHandler {

    /* JADX INFO: renamed from: a */
    private final oov f2568a;

    /* JADX INFO: renamed from: b */
    private final oni f2569b;

    public avz(oov oovVar, oni oniVar) {
        this.f2568a = oovVar;
        this.f2569b = oniVar;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        boolean zIsInstance;
        String str;
        obj.getClass();
        method.getClass();
        if (!ooc.m18737c(method.getName(), "accept") || objArr == null || objArr.length != 1) {
            if (ooc.m18737c(method.getName(), voNZjxiJou.GUwJynXBUUqQ) && method.getReturnType().equals(Boolean.TYPE) && objArr != null && objArr.length == 1) {
                return Boolean.valueOf(obj == objArr[0]);
            }
            if (ooc.m18737c(method.getName(), "hashCode") && method.getReturnType().equals(Integer.TYPE) && objArr == null) {
                return Integer.valueOf(this.f2569b.hashCode());
            }
            if (ooc.m18737c(method.getName(), "toString") && method.getReturnType().equals(String.class) && objArr == null) {
                return this.f2569b.toString();
            }
            throw new UnsupportedOperationException("Unexpected method call object:" + obj + ", method: " + method + ", args: " + objArr);
        }
        oov oovVar = this.f2568a;
        Object obj2 = objArr[0];
        ony onyVar = (ony) oovVar;
        Class clsM18706k = onyVar.f46343d;
        Map map = ony.f46338a;
        map.getClass();
        Integer num = (Integer) map.get(clsM18706k);
        if (num != null) {
            zIsInstance = ook.m18787a(obj2, num.intValue());
        } else {
            if (clsM18706k.isPrimitive()) {
                clsM18706k = omn.m18706k(ooj.m18762a(clsM18706k));
            }
            zIsInstance = clsM18706k.isInstance(obj2);
        }
        if (zIsInstance) {
            obj2.getClass();
            this.f2569b.mo1803a(obj2);
            return oki.f46196a;
        }
        Class cls = onyVar.f46343d;
        String canonicalName = null;
        if (!cls.isAnonymousClass() && !cls.isLocalClass()) {
            if (cls.isArray()) {
                Class<?> componentType = cls.getComponentType();
                if (componentType.isPrimitive() && (str = (String) ony.f46339b.get(componentType.getName())) != null) {
                    canonicalName = str.concat("Array");
                }
                if (canonicalName == null) {
                    canonicalName = "kotlin.Array";
                }
            } else {
                canonicalName = (String) ony.f46339b.get(cls.getName());
                if (canonicalName == null) {
                    canonicalName = cls.getCanonicalName();
                }
            }
        }
        throw new ClassCastException("Value cannot be cast to ".concat(String.valueOf(canonicalName)));
    }
}
