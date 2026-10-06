package p000;

import com.google.android.play.core.common.wMe.NptsKnlVczSZ;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ony implements oov, onx {

    /* JADX INFO: renamed from: a */
    public static final Map f46338a;

    /* JADX INFO: renamed from: b */
    public static final HashMap f46339b;

    /* JADX INFO: renamed from: c */
    public static final Map f46340c;

    /* JADX INFO: renamed from: e */
    private static final HashMap f46341e;

    /* JADX INFO: renamed from: f */
    private static final HashMap f46342f;

    /* JADX INFO: renamed from: d */
    public final Class f46343d;

    static {
        int i = 0;
        List listM18683W = omn.m18683W(new Class[]{omx.class, oni.class, onm.class, onn.class, ono.class, onp.class, onq.class, onr.class, ons.class, ont.class, omy.class, omz.class, ona.class, onb.class, onc.class, ond.class, one.class, onf.class, ong.class, onh.class, onj.class, onk.class, onl.class});
        ArrayList arrayList = new ArrayList(omn.m18678R(listM18683W));
        for (Object obj : listM18683W) {
            int i2 = i + 1;
            if (i < 0) {
                omn.m18670J();
            }
            arrayList.add(lkm.m15590q((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        f46338a = omn.m18663C(arrayList);
        HashMap map = new HashMap();
        map.put("boolean", "kotlin.Boolean");
        map.put("char", "kotlin.Char");
        map.put("byte", "kotlin.Byte");
        map.put("short", "kotlin.Short");
        map.put("int", "kotlin.Int");
        map.put("float", "kotlin.Float");
        map.put("long", "kotlin.Long");
        map.put("double", "kotlin.Double");
        f46341e = map;
        HashMap map2 = new HashMap();
        map2.put("java.lang.Boolean", "kotlin.Boolean");
        map2.put("java.lang.Character", "kotlin.Char");
        map2.put("java.lang.Byte", "kotlin.Byte");
        map2.put("java.lang.Short", "kotlin.Short");
        map2.put("java.lang.Integer", "kotlin.Int");
        map2.put("java.lang.Float", "kotlin.Float");
        map2.put("java.lang.Long", "kotlin.Long");
        map2.put("java.lang.Double", "kotlin.Double");
        f46342f = map2;
        HashMap map3 = new HashMap();
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
        map3.put(NptsKnlVczSZ.Cio, "kotlin.collections.Iterator");
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
        collectionValues.getClass();
        for (String str : collectionValues) {
            StringBuilder sb = new StringBuilder();
            sb.append("kotlin.jvm.internal.");
            str.getClass();
            sb.append(ook.m18767E(str));
            sb.append("CompanionObject");
            okb okbVarM15590q = lkm.m15590q(sb.toString(), str.concat(".Companion"));
            map3.put(okbVarM15590q.f46186a, okbVarM15590q.f46187b);
        }
        for (Map.Entry entry : f46338a.entrySet()) {
            Class cls = (Class) entry.getKey();
            int iIntValue = ((Number) entry.getValue()).intValue();
            map3.put(cls.getName(), "kotlin.Function" + iIntValue);
        }
        f46339b = map3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(omn.m18721z(map3.size()));
        for (Map.Entry entry2 : map3.entrySet()) {
            linkedHashMap.put(entry2.getKey(), ook.m18767E((String) entry2.getValue()));
        }
        f46340c = linkedHashMap;
    }

    public ony(Class cls) {
        cls.getClass();
        this.f46343d = cls;
    }

    @Override // p000.onx
    /* JADX INFO: renamed from: a */
    public final Class mo18730a() {
        return this.f46343d;
    }

    @Override // p000.oov
    /* JADX INFO: renamed from: b */
    public final void mo18731b() {
        Class cls = this.f46343d;
        if (cls.isAnonymousClass()) {
            return;
        }
        if (!cls.isLocalClass()) {
            if (!cls.isArray()) {
                if (((String) f46340c.get(cls.getName())) == null) {
                    cls.getSimpleName();
                    return;
                }
                return;
            } else {
                Class<?> componentType = cls.getComponentType();
                if (componentType.isPrimitive()) {
                    return;
                }
                return;
            }
        }
        String simpleName = cls.getSimpleName();
        Method enclosingMethod = cls.getEnclosingMethod();
        if (enclosingMethod != null) {
            simpleName.getClass();
            ook.m18768F(simpleName, enclosingMethod.getName() + '$');
            return;
        }
        Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
        if (enclosingConstructor != null) {
            simpleName.getClass();
            ook.m18768F(simpleName, enclosingConstructor.getName() + '$');
            return;
        }
        simpleName.getClass();
        int iM18807u = ook.m18807u(simpleName, '$', 0, 6);
        if (iM18807u != -1) {
            simpleName.substring(iM18807u + 1, simpleName.length()).getClass();
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ony) && ooc.m18737c(omn.m18706k(this), omn.m18706k((oov) obj));
    }

    public final int hashCode() {
        return omn.m18706k(this).hashCode();
    }

    public final String toString() {
        return String.valueOf(this.f46343d.toString()).concat(" (Kotlin reflection is not available)");
    }
}
