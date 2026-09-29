package p000;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.AbstractC3194a;

/* JADX INFO: loaded from: classes.dex */
public final class z21 implements y21 {

    /* JADX INFO: renamed from: b */
    public static final Map f70780b;

    /* JADX INFO: renamed from: a */
    public final Class f70781a;

    static {
        List listM23605K = vz1.m23605K(ui3.class, vi3.class, zi3.class, aj3.class, bj3.class, cj3.class, dj3.class, ej3.class, fj3.class, fd1.class, fd1.class, fd1.class, wi3.class, fd1.class, fd1.class, fd1.class, fd1.class, fd1.class, fd1.class, fd1.class, fd1.class, fd1.class, yi3.class);
        ArrayList arrayList = new ArrayList(v91.m23189q0(listM23605K, 10));
        int i = 0;
        for (Object obj : listM23605K) {
            int i2 = i + 1;
            if (i < 0) {
                vz1.m23628e0();
                throw null;
            }
            arrayList.add(new Pair((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        f70780b = AbstractC3194a.m15370W(arrayList);
    }

    public z21(Class cls) {
        cls.getClass();
        this.f70781a = cls;
    }

    @Override // p000.y21
    /* JADX INFO: renamed from: a */
    public final Class mo16595a() {
        return this.f70781a;
    }

    /* JADX INFO: renamed from: b */
    public final String m25413b() {
        String strM18161q;
        Class cls = this.f70781a;
        cls.getClass();
        String strConcat = null;
        if (cls.isAnonymousClass() || cls.isLocalClass()) {
            return null;
        }
        if (!cls.isArray()) {
            String strM18161q2 = omd.m18161q(cls.getName());
            return strM18161q2 == null ? cls.getCanonicalName() : strM18161q2;
        }
        Class<?> componentType = cls.getComponentType();
        if (componentType.isPrimitive() && (strM18161q = omd.m18161q(componentType.getName())) != null) {
            strConcat = strM18161q.concat("Array");
        }
        return strConcat == null ? "kotlin.Array" : strConcat;
    }

    /* JADX INFO: renamed from: c */
    public final String m25414c() {
        String strM18144d0;
        Class cls = this.f70781a;
        cls.getClass();
        String strConcat = null;
        if (cls.isAnonymousClass()) {
            return null;
        }
        if (!cls.isLocalClass()) {
            if (!cls.isArray()) {
                String strM18144d1 = omd.m18144d0(cls.getName());
                return strM18144d1 == null ? cls.getSimpleName() : strM18144d1;
            }
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (strM18144d0 = omd.m18144d0(componentType.getName())) != null) {
                strConcat = strM18144d0.concat("Array");
            }
            return strConcat == null ? "Array" : strConcat;
        }
        String simpleName = cls.getSimpleName();
        Method enclosingMethod = cls.getEnclosingMethod();
        if (enclosingMethod != null) {
            return vk9.m23368D0(simpleName, enclosingMethod.getName() + '$', simpleName);
        }
        Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
        if (enclosingConstructor == null) {
            int iM23388k0 = vk9.m23388k0(simpleName, '$', 0, 6);
            return iM23388k0 == -1 ? simpleName : simpleName.substring(iM23388k0 + 1, simpleName.length());
        }
        return vk9.m23368D0(simpleName, enclosingConstructor.getName() + '$', simpleName);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m25415d(Object obj) {
        Class clsM20397x = this.f70781a;
        clsM20397x.getClass();
        Map map = f70780b;
        map.getClass();
        Integer num = (Integer) map.get(clsM20397x);
        if (num != null) {
            return lda.m16105E(num.intValue(), obj);
        }
        if (clsM20397x.isPrimitive()) {
            clsM20397x = r46.m20397x(y38.m24933a(clsM20397x));
        }
        return clsM20397x.isInstance(obj);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof z21) && r46.m20397x(this).equals(r46.m20397x((z21) obj));
    }

    public final int hashCode() {
        return r46.m20397x(this).hashCode();
    }

    public final String toString() {
        return this.f70781a.toString() + " (Kotlin reflection is not available)";
    }
}
