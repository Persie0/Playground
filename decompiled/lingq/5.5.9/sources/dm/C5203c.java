package dm;

import cm.InterfaceC2041a;
import cm.InterfaceC2042b;
import cm.InterfaceC2043c;
import cm.InterfaceC2044d;
import cm.InterfaceC2045e;
import cm.InterfaceC2046f;
import cm.InterfaceC2047g;
import cm.InterfaceC2048h;
import cm.InterfaceC2049i;
import cm.InterfaceC2050j;
import cm.InterfaceC2051k;
import cm.InterfaceC2052l;
import cm.InterfaceC2053m;
import cm.InterfaceC2054n;
import cm.InterfaceC2055o;
import cm.InterfaceC2056p;
import cm.InterfaceC2057q;
import cm.InterfaceC2058r;
import cm.InterfaceC2059s;
import cm.InterfaceC2060t;
import cm.InterfaceC2061u;
import cm.InterfaceC2062v;
import cm.InterfaceC2063w;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import km.InterfaceC6719b;
import kotlin.Pair;
import kotlin.collections.C6753d;
import kotlin.jvm.KotlinReflectionNotSupportedError;
import kotlin.text.C7076b;
import p260m8.C7499b;
import p385sf.C9000b;
import sl.InterfaceC9068a;
import tl.C9325m;

/* JADX INFO: renamed from: dm.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C5203c implements InterfaceC6719b<Object>, InterfaceC5202b {

    /* JADX INFO: renamed from: b */
    public static final Map<Class<? extends InterfaceC9068a<?>>, Integer> f33262b;

    /* JADX INFO: renamed from: c */
    public static final HashMap<String, String> f33263c;

    /* JADX INFO: renamed from: d */
    public static final LinkedHashMap f33264d;

    /* JADX INFO: renamed from: a */
    public final Class<?> f33265a;

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    static {
        int i10 = 0;
        List listM17252r = C9000b.m17252r(InterfaceC2041a.class, InterfaceC2052l.class, InterfaceC2056p.class, InterfaceC2057q.class, InterfaceC2058r.class, InterfaceC2059s.class, InterfaceC2060t.class, InterfaceC2061u.class, InterfaceC2062v.class, InterfaceC2063w.class, InterfaceC2042b.class, InterfaceC2043c.class, InterfaceC2044d.class, InterfaceC2045e.class, InterfaceC2046f.class, InterfaceC2047g.class, InterfaceC2048h.class, InterfaceC2049i.class, InterfaceC2050j.class, InterfaceC2051k.class, InterfaceC2053m.class, InterfaceC2054n.class, InterfaceC2055o.class);
        ArrayList arrayList = new ArrayList(C9325m.m17681z(listM17252r, 10));
        for (Object obj : listM17252r) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                C9000b.m17257w();
                throw null;
            }
            arrayList.add(new Pair((Class) obj, Integer.valueOf(i10)));
            i10 = i11;
        }
        f33262b = C6753d.m13464Q0(arrayList);
        HashMap map = new HashMap();
        map.put("boolean", "kotlin.Boolean");
        map.put("char", "kotlin.Char");
        map.put("byte", "kotlin.Byte");
        map.put("short", "kotlin.Short");
        map.put("int", "kotlin.Int");
        map.put("float", "kotlin.Float");
        map.put("long", "kotlin.Long");
        map.put("double", "kotlin.Double");
        HashMap map2 = new HashMap();
        map2.put("java.lang.Boolean", "kotlin.Boolean");
        map2.put("java.lang.Character", "kotlin.Char");
        map2.put("java.lang.Byte", "kotlin.Byte");
        map2.put("java.lang.Short", "kotlin.Short");
        map2.put("java.lang.Integer", "kotlin.Int");
        map2.put("java.lang.Float", "kotlin.Float");
        map2.put("java.lang.Long", "kotlin.Long");
        map2.put("java.lang.Double", "kotlin.Double");
        HashMap<String, String> map3 = new HashMap<>();
        map3.put("java.lang.Object", "kotlin.Any");
        map3.put("java.lang.String", "kotlin.String");
        map3.put("java.lang.CharSequence", "kotlin.CharSequence");
        map3.put("java.lang.Throwable", "kotlin.Throwable");
        map3.put("java.lang.Cloneable", "kotlin.Cloneable");
        map3.put("java.lang.Number", "kotlin.Number");
        map3.put("java.lang.Comparable", "kotlin.Comparable");
        map3.put("java.lang.Enum", "kotlin.Enum");
        map3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        map3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        map3.put("java.util.Iterator", "kotlin.collections.Iterator");
        map3.put("java.util.Collection", "kotlin.collections.Collection");
        map3.put("java.util.List", "kotlin.collections.List");
        map3.put("java.util.Set", "kotlin.collections.Set");
        map3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        map3.put("java.util.Map", "kotlin.collections.Map");
        map3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        map3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        map3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        map3.putAll(map);
        map3.putAll(map2);
        Collection<String> collectionValues = map.values();
        C5207g.m11110e(collectionValues, "primitiveFqNames.values");
        for (String str : collectionValues) {
            StringBuilder sb2 = new StringBuilder("kotlin.jvm.internal.");
            C5207g.m11110e(str, "kotlinName");
            sb2.append(C7076b.m14304x3(str, '.', str));
            sb2.append("CompanionObject");
            map3.put(sb2.toString(), str.concat(".Companion"));
        }
        for (Map.Entry<Class<? extends InterfaceC9068a<?>>, Integer> entry : f33262b.entrySet()) {
            Class<? extends InterfaceC9068a<?>> key = entry.getKey();
            int iIntValue = entry.getValue().intValue();
            map3.put(key.getName(), "kotlin.Function" + iIntValue);
        }
        f33263c = map3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C7499b.m14941g0(map3.size()));
        Iterator<T> it = map3.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            Object key2 = entry2.getKey();
            String str2 = (String) entry2.getValue();
            linkedHashMap.put(key2, C7076b.m14304x3(str2, '.', str2));
        }
        f33264d = linkedHashMap;
    }

    public C5203c(Class<?> cls) {
        C5207g.m11111f(cls, "jClass");
        this.f33265a = cls;
    }

    @Override // dm.InterfaceC5202b
    /* JADX INFO: renamed from: b */
    public final Class<?> mo10973b() {
        return this.f33265a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C5203c) && C5207g.m11106a(C5206f.m10999U0(this), C5206f.m10999U0((InterfaceC6719b) obj));
    }

    public final int hashCode() {
        return C5206f.m10999U0(this).hashCode();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // km.InterfaceC6719b
    /* JADX INFO: renamed from: m */
    public final List<InterfaceC6719b<? extends Object>> mo10974m() {
        throw new KotlinReflectionNotSupportedError();
    }

    @Override // km.InterfaceC6719b
    /* JADX INFO: renamed from: o */
    public final String mo10975o() {
        String str;
        Class<?> cls = this.f33265a;
        C5207g.m11111f(cls, "jClass");
        String canonicalName = null;
        if (cls.isAnonymousClass() || cls.isLocalClass()) {
            return null;
        }
        boolean zIsArray = cls.isArray();
        HashMap<String, String> map = f33263c;
        if (zIsArray) {
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (str = map.get(componentType.getName())) != null) {
                canonicalName = str.concat("Array");
            }
            if (canonicalName == null) {
                return "kotlin.Array";
            }
        } else {
            canonicalName = map.get(cls.getName());
            if (canonicalName == null) {
                canonicalName = cls.getCanonicalName();
            }
        }
        return canonicalName;
    }

    @Override // km.InterfaceC6719b
    /* JADX INFO: renamed from: p */
    public final String mo10976p() {
        String str;
        Class<?> cls = this.f33265a;
        C5207g.m11111f(cls, "jClass");
        String strConcat = null;
        if (cls.isAnonymousClass()) {
            return null;
        }
        if (!cls.isLocalClass()) {
            boolean zIsArray = cls.isArray();
            LinkedHashMap linkedHashMap = f33264d;
            if (!zIsArray) {
                String str2 = (String) linkedHashMap.get(cls.getName());
                return str2 == null ? cls.getSimpleName() : str2;
            }
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (str = (String) linkedHashMap.get(componentType.getName())) != null) {
                strConcat = str.concat("Array");
            }
            return strConcat == null ? "Array" : strConcat;
        }
        String simpleName = cls.getSimpleName();
        Method enclosingMethod = cls.getEnclosingMethod();
        if (enclosingMethod != null) {
            return C7076b.m14302v3(simpleName, enclosingMethod.getName() + '$', simpleName);
        }
        Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
        if (enclosingConstructor == null) {
            return C7076b.m14303w3(simpleName, '$');
        }
        return C7076b.m14302v3(simpleName, enclosingConstructor.getName() + '$', simpleName);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // km.InterfaceC6719b
    /* JADX INFO: renamed from: q */
    public final Object mo10977q() {
        throw new KotlinReflectionNotSupportedError();
    }

    public final String toString() {
        return this.f33265a.toString() + " (Kotlin reflection is not available)";
    }
}
