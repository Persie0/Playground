package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

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
import dm.C5206f;
import dm.C5207g;
import dm.C5209i;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import km.InterfaceC6719b;
import kotlin.Pair;
import kotlin.collections.C6744b;
import kotlin.collections.C6753d;
import kotlin.collections.EmptyList;
import kotlin.sequences.C7073a;
import kotlin.sequences.SequencesKt__SequencesKt;
import mn.C7645b;
import mn.C7646c;
import mn.C7648e;
import mo.C7661i;
import p249lo.InterfaceC7415h;
import p385sf.C9000b;
import sl.InterfaceC9068a;
import tl.C9325m;

/* JADX INFO: loaded from: classes2.dex */
public final class ReflectClassUtilKt {

    /* JADX INFO: renamed from: a */
    public static final List<InterfaceC6719b<? extends Object>> f38580a;

    /* JADX INFO: renamed from: b */
    public static final Map<Class<? extends Object>, Class<? extends Object>> f38581b;

    /* JADX INFO: renamed from: c */
    public static final Map<Class<? extends Object>, Class<? extends Object>> f38582c;

    /* JADX INFO: renamed from: d */
    public static final Map<Class<? extends InterfaceC9068a<?>>, Integer> f38583d;

    static {
        int i10 = 0;
        List<InterfaceC6719b<? extends Object>> listM17252r = C9000b.m17252r(C5209i.m11118a(Boolean.TYPE), C5209i.m11118a(Byte.TYPE), C5209i.m11118a(Character.TYPE), C5209i.m11118a(Double.TYPE), C5209i.m11118a(Float.TYPE), C5209i.m11118a(Integer.TYPE), C5209i.m11118a(Long.TYPE), C5209i.m11118a(Short.TYPE));
        f38580a = listM17252r;
        ArrayList arrayList = new ArrayList(C9325m.m17681z(listM17252r, 10));
        Iterator<T> it = listM17252r.iterator();
        while (it.hasNext()) {
            InterfaceC6719b interfaceC6719b = (InterfaceC6719b) it.next();
            arrayList.add(new Pair(C5206f.m10999U0(interfaceC6719b), C5206f.m11000V0(interfaceC6719b)));
        }
        f38581b = C6753d.m13464Q0(arrayList);
        List<InterfaceC6719b<? extends Object>> list = f38580a;
        ArrayList arrayList2 = new ArrayList(C9325m.m17681z(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            InterfaceC6719b interfaceC6719b2 = (InterfaceC6719b) it2.next();
            arrayList2.add(new Pair(C5206f.m11000V0(interfaceC6719b2), C5206f.m10999U0(interfaceC6719b2)));
        }
        f38582c = C6753d.m13464Q0(arrayList2);
        List listM17252r2 = C9000b.m17252r(InterfaceC2041a.class, InterfaceC2052l.class, InterfaceC2056p.class, InterfaceC2057q.class, InterfaceC2058r.class, InterfaceC2059s.class, InterfaceC2060t.class, InterfaceC2061u.class, InterfaceC2062v.class, InterfaceC2063w.class, InterfaceC2042b.class, InterfaceC2043c.class, InterfaceC2044d.class, InterfaceC2045e.class, InterfaceC2046f.class, InterfaceC2047g.class, InterfaceC2048h.class, InterfaceC2049i.class, InterfaceC2050j.class, InterfaceC2051k.class, InterfaceC2053m.class, InterfaceC2054n.class, InterfaceC2055o.class);
        ArrayList arrayList3 = new ArrayList(C9325m.m17681z(listM17252r2, 10));
        for (Object obj : listM17252r2) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                C9000b.m17257w();
                throw null;
            }
            arrayList3.add(new Pair((Class) obj, Integer.valueOf(i10)));
            i10 = i11;
        }
        f38583d = C6753d.m13464Q0(arrayList3);
    }

    /* JADX INFO: renamed from: a */
    public static final C7645b m13648a(Class<?> cls) {
        C7645b c7645bM13648a;
        C5207g.m11111f(cls, "<this>");
        if (cls.isPrimitive()) {
            throw new IllegalArgumentException("Can't compute ClassId for primitive type: " + cls);
        }
        if (cls.isArray()) {
            throw new IllegalArgumentException("Can't compute ClassId for array type: " + cls);
        }
        if (cls.getEnclosingMethod() == null && cls.getEnclosingConstructor() == null) {
            if (!(cls.getSimpleName().length() == 0)) {
                Class<?> declaringClass = cls.getDeclaringClass();
                return (declaringClass == null || (c7645bM13648a = m13648a(declaringClass)) == null) ? C7645b.m15203l(new C7646c(cls.getName())) : c7645bM13648a.m15206d(C7648e.m15232l(cls.getSimpleName()));
            }
        }
        C7646c c7646c = new C7646c(cls.getName());
        return new C7645b(c7646c.m15217e(), C7646c.m15213j(c7646c.m15218f()), true);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: b */
    public static final String m13649b(Class<?> cls) {
        C5207g.m11111f(cls, "<this>");
        if (!cls.isPrimitive()) {
            if (cls.isArray()) {
                return C7661i.m15253S2(cls.getName(), '.', '/');
            }
            return "L" + C7661i.m15253S2(cls.getName(), '.', '/') + ';';
        }
        String name = cls.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals("double")) {
                    return "D";
                }
                break;
            case 104431:
                if (name.equals("int")) {
                    return "I";
                }
                break;
            case 3039496:
                if (name.equals("byte")) {
                    return "B";
                }
                break;
            case 3052374:
                if (name.equals("char")) {
                    return "C";
                }
                break;
            case 3327612:
                if (name.equals("long")) {
                    return "J";
                }
                break;
            case 3625364:
                if (name.equals("void")) {
                    return "V";
                }
                break;
            case 64711720:
                if (name.equals("boolean")) {
                    return "Z";
                }
                break;
            case 97526364:
                if (name.equals("float")) {
                    return "F";
                }
                break;
            case 109413500:
                if (name.equals("short")) {
                    return "S";
                }
                break;
            default:
                throw new IllegalArgumentException("Unsupported primitive type: " + cls);
        }
        throw new IllegalArgumentException("Unsupported primitive type: " + cls);
    }

    /* JADX INFO: renamed from: c */
    public static final List<Type> m13650c(Type type) {
        C5207g.m11111f(type, "<this>");
        if (!(type instanceof ParameterizedType)) {
            return EmptyList.f38032a;
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        if (parameterizedType.getOwnerType() != null) {
            return C9000b.m17255u(C7073a.m14267b3(C7073a.m14260U2(SequencesKt__SequencesKt.m14252M2(type, new InterfaceC2052l<ParameterizedType, ParameterizedType>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt$parameterizedTypeArguments$1
                @Override // cm.InterfaceC2052l
                /* JADX INFO: renamed from: n */
                public final ParameterizedType mo528n(ParameterizedType parameterizedType2) {
                    ParameterizedType parameterizedType3 = parameterizedType2;
                    C5207g.m11111f(parameterizedType3, "it");
                    Type ownerType = parameterizedType3.getOwnerType();
                    if (ownerType instanceof ParameterizedType) {
                        return (ParameterizedType) ownerType;
                    }
                    return null;
                }
            }), new InterfaceC2052l<ParameterizedType, InterfaceC7415h<? extends Type>>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt$parameterizedTypeArguments$2
                @Override // cm.InterfaceC2052l
                /* JADX INFO: renamed from: n */
                public final InterfaceC7415h<? extends Type> mo528n(ParameterizedType parameterizedType2) {
                    ParameterizedType parameterizedType3 = parameterizedType2;
                    C5207g.m11111f(parameterizedType3, "it");
                    Type[] actualTypeArguments = parameterizedType3.getActualTypeArguments();
                    C5207g.m11110e(actualTypeArguments, "it.actualTypeArguments");
                    return C6744b.m13376h0(actualTypeArguments);
                }
            })));
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        C5207g.m11110e(actualTypeArguments, "actualTypeArguments");
        return C6744b.m13391w0(actualTypeArguments);
    }

    /* JADX INFO: renamed from: d */
    public static final ClassLoader m13651d(Class<?> cls) {
        C5207g.m11111f(cls, "<this>");
        ClassLoader classLoader = cls.getClassLoader();
        if (classLoader == null) {
            classLoader = ClassLoader.getSystemClassLoader();
            C5207g.m11110e(classLoader, "getSystemClassLoader()");
        }
        return classLoader;
    }
}
