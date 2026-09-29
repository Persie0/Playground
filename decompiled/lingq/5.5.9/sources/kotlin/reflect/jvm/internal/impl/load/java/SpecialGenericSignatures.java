package kotlin.reflect.jvm.internal.impl.load.java;

import dm.C5207g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.C6752c;
import kotlin.collections.C6753d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import mn.C7648e;
import p003a2.C0009a;
import p260m8.C7499b;
import tl.C9325m;
import tl.C9338z;

/* JADX INFO: loaded from: classes2.dex */
public class SpecialGenericSignatures {

    /* JADX INFO: renamed from: a */
    public static final C6839a f38615a = new C6839a();

    /* JADX INFO: renamed from: b */
    public static final ArrayList f38616b;

    /* JADX INFO: renamed from: c */
    public static final ArrayList f38617c;

    /* JADX INFO: renamed from: d */
    public static final Map<C6839a.a, TypeSafeBarrierDescription> f38618d;

    /* JADX INFO: renamed from: e */
    public static final LinkedHashMap f38619e;

    /* JADX INFO: renamed from: f */
    public static final Set<C7648e> f38620f;

    /* JADX INFO: renamed from: g */
    public static final Set<String> f38621g;

    /* JADX INFO: renamed from: h */
    public static final C6839a.a f38622h;

    /* JADX INFO: renamed from: i */
    public static final Map<C6839a.a, C7648e> f38623i;

    /* JADX INFO: renamed from: j */
    public static final LinkedHashMap f38624j;

    /* JADX INFO: renamed from: k */
    public static final ArrayList f38625k;

    /* JADX INFO: renamed from: l */
    public static final LinkedHashMap f38626l;

    public enum SpecialSignatureInfo {
        ONE_COLLECTION_PARAMETER("Ljava/util/Collection<+Ljava/lang/Object;>;", false),
        OBJECT_PARAMETER_NON_GENERIC(null, true),
        OBJECT_PARAMETER_GENERIC("Ljava/lang/Object;", true);

        private final boolean isObjectReplacedWithTypeParameter;
        private final String valueParametersSignature;

        SpecialSignatureInfo(String str, boolean z10) {
            this.valueParametersSignature = str;
            this.isObjectReplacedWithTypeParameter = z10;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class TypeSafeBarrierDescription {
        private final Object defaultValue;
        public static final TypeSafeBarrierDescription NULL = new TypeSafeBarrierDescription("NULL", 0, null);
        public static final TypeSafeBarrierDescription INDEX = new TypeSafeBarrierDescription("INDEX", 1, -1);
        public static final TypeSafeBarrierDescription FALSE = new TypeSafeBarrierDescription("FALSE", 2, Boolean.FALSE);
        public static final TypeSafeBarrierDescription MAP_GET_OR_DEFAULT = new MAP_GET_OR_DEFAULT();
        private static final /* synthetic */ TypeSafeBarrierDescription[] $VALUES = $values();

        public static final class MAP_GET_OR_DEFAULT extends TypeSafeBarrierDescription {
            /* JADX WARN: Illegal instructions before constructor call */
            public MAP_GET_OR_DEFAULT() {
                DefaultConstructorMarker defaultConstructorMarker = null;
                super("MAP_GET_OR_DEFAULT", 3, defaultConstructorMarker, defaultConstructorMarker);
            }
        }

        private static final /* synthetic */ TypeSafeBarrierDescription[] $values() {
            return new TypeSafeBarrierDescription[]{NULL, INDEX, FALSE, MAP_GET_OR_DEFAULT};
        }

        private TypeSafeBarrierDescription(String str, int i10, Object obj) {
            super(str, i10);
            this.defaultValue = obj;
        }

        public /* synthetic */ TypeSafeBarrierDescription(String str, int i10, Object obj, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i10, obj);
        }

        public static TypeSafeBarrierDescription valueOf(String str) {
            return (TypeSafeBarrierDescription) Enum.valueOf(TypeSafeBarrierDescription.class, str);
        }

        public static TypeSafeBarrierDescription[] values() {
            return (TypeSafeBarrierDescription[]) $VALUES.clone();
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$a */
    public static final class C6839a {

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$a$a */
        public static final class a {

            /* JADX INFO: renamed from: a */
            public final C7648e f38627a;

            /* JADX INFO: renamed from: b */
            public final String f38628b;

            public a(C7648e c7648e, String str) {
                C5207g.m11111f(str, "signature");
                this.f38627a = c7648e;
                this.f38628b = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return C5207g.m11106a(this.f38627a, aVar.f38627a) && C5207g.m11106a(this.f38628b, aVar.f38628b);
            }

            public final int hashCode() {
                return this.f38628b.hashCode() + (this.f38627a.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb2 = new StringBuilder("NameAndSignature(name=");
                sb2.append(this.f38627a);
                sb2.append(", signature=");
                return C0009a.m22j(sb2, this.f38628b, ')');
            }
        }

        /* JADX INFO: renamed from: a */
        public static final a m13662a(C6839a c6839a, String str, String str2, String str3, String str4) {
            c6839a.getClass();
            C7648e c7648eM15232l = C7648e.m15232l(str2);
            String str5 = str2 + '(' + str3 + ')' + str4;
            C5207g.m11111f(str, "internalName");
            C5207g.m11111f(str5, "jvmDescriptor");
            return new a(c7648eM15232l, str + '.' + str5);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Set<String> setM14973x0 = C7499b.m14973x0("containsAll", "removeAll", "retainAll");
        ArrayList arrayList = new ArrayList(C9325m.m17681z(setM14973x0, 10));
        for (String str : setM14973x0) {
            C6839a c6839a = f38615a;
            String desc = JvmPrimitiveType.BOOLEAN.getDesc();
            C5207g.m11110e(desc, "BOOLEAN.desc");
            arrayList.add(C6839a.m13662a(c6839a, "java/util/Collection", str, "Ljava/util/Collection;", desc));
        }
        f38616b = arrayList;
        ArrayList arrayList2 = new ArrayList(C9325m.m17681z(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((C6839a.a) it.next()).f38628b);
        }
        f38617c = arrayList2;
        ArrayList arrayList3 = f38616b;
        ArrayList arrayList4 = new ArrayList(C9325m.m17681z(arrayList3, 10));
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            arrayList4.add(((C6839a.a) it2.next()).f38627a.m15235f());
        }
        C6839a c6839a2 = f38615a;
        String strConcat = "java/util/".concat("Collection");
        JvmPrimitiveType jvmPrimitiveType = JvmPrimitiveType.BOOLEAN;
        String desc2 = jvmPrimitiveType.getDesc();
        C5207g.m11110e(desc2, "BOOLEAN.desc");
        C6839a.a aVarM13662a = C6839a.m13662a(c6839a2, strConcat, "contains", "Ljava/lang/Object;", desc2);
        TypeSafeBarrierDescription typeSafeBarrierDescription = TypeSafeBarrierDescription.FALSE;
        String strConcat2 = "java/util/".concat("Collection");
        String desc3 = jvmPrimitiveType.getDesc();
        C5207g.m11110e(desc3, "BOOLEAN.desc");
        String strConcat3 = "java/util/".concat("Map");
        String desc4 = jvmPrimitiveType.getDesc();
        C5207g.m11110e(desc4, "BOOLEAN.desc");
        String strConcat4 = "java/util/".concat("Map");
        String desc5 = jvmPrimitiveType.getDesc();
        C5207g.m11110e(desc5, "BOOLEAN.desc");
        String strConcat5 = "java/util/".concat("Map");
        String desc6 = jvmPrimitiveType.getDesc();
        C5207g.m11110e(desc6, "BOOLEAN.desc");
        C6839a.a aVarM13662a2 = C6839a.m13662a(c6839a2, "java/util/".concat("Map"), "get", "Ljava/lang/Object;", "Ljava/lang/Object;");
        TypeSafeBarrierDescription typeSafeBarrierDescription2 = TypeSafeBarrierDescription.NULL;
        String strConcat6 = "java/util/".concat("List");
        JvmPrimitiveType jvmPrimitiveType2 = JvmPrimitiveType.INT;
        String desc7 = jvmPrimitiveType2.getDesc();
        C5207g.m11110e(desc7, "INT.desc");
        C6839a.a aVarM13662a3 = C6839a.m13662a(c6839a2, strConcat6, "indexOf", "Ljava/lang/Object;", desc7);
        TypeSafeBarrierDescription typeSafeBarrierDescription3 = TypeSafeBarrierDescription.INDEX;
        String strConcat7 = "java/util/".concat("List");
        String desc8 = jvmPrimitiveType2.getDesc();
        C5207g.m11110e(desc8, "INT.desc");
        Map<C6839a.a, TypeSafeBarrierDescription> mapM13462O0 = C6753d.m13462O0(new Pair(aVarM13662a, typeSafeBarrierDescription), new Pair(C6839a.m13662a(c6839a2, strConcat2, "remove", "Ljava/lang/Object;", desc3), typeSafeBarrierDescription), new Pair(C6839a.m13662a(c6839a2, strConcat3, "containsKey", "Ljava/lang/Object;", desc4), typeSafeBarrierDescription), new Pair(C6839a.m13662a(c6839a2, strConcat4, "containsValue", "Ljava/lang/Object;", desc5), typeSafeBarrierDescription), new Pair(C6839a.m13662a(c6839a2, strConcat5, "remove", "Ljava/lang/Object;Ljava/lang/Object;", desc6), typeSafeBarrierDescription), new Pair(C6839a.m13662a(c6839a2, "java/util/".concat("Map"), "getOrDefault", "Ljava/lang/Object;Ljava/lang/Object;", "Ljava/lang/Object;"), TypeSafeBarrierDescription.MAP_GET_OR_DEFAULT), new Pair(aVarM13662a2, typeSafeBarrierDescription2), new Pair(C6839a.m13662a(c6839a2, "java/util/".concat("Map"), "remove", "Ljava/lang/Object;", "Ljava/lang/Object;"), typeSafeBarrierDescription2), new Pair(aVarM13662a3, typeSafeBarrierDescription3), new Pair(C6839a.m13662a(c6839a2, strConcat7, "lastIndexOf", "Ljava/lang/Object;", desc8), typeSafeBarrierDescription3));
        f38618d = mapM13462O0;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C7499b.m14941g0(mapM13462O0.size()));
        Iterator<T> it3 = mapM13462O0.entrySet().iterator();
        while (it3.hasNext()) {
            Map.Entry entry = (Map.Entry) it3.next();
            linkedHashMap.put(((C6839a.a) entry.getKey()).f38628b, entry.getValue());
        }
        f38619e = linkedHashMap;
        LinkedHashSet linkedHashSetM17691N0 = C9338z.m17691N0(f38618d.keySet(), f38616b);
        ArrayList arrayList5 = new ArrayList(C9325m.m17681z(linkedHashSetM17691N0, 10));
        Iterator it4 = linkedHashSetM17691N0.iterator();
        while (it4.hasNext()) {
            arrayList5.add(((C6839a.a) it4.next()).f38627a);
        }
        f38620f = C6752c.m13457y0(arrayList5);
        ArrayList arrayList6 = new ArrayList(C9325m.m17681z(linkedHashSetM17691N0, 10));
        Iterator it5 = linkedHashSetM17691N0.iterator();
        while (it5.hasNext()) {
            arrayList6.add(((C6839a.a) it5.next()).f38628b);
        }
        f38621g = C6752c.m13457y0(arrayList6);
        C6839a c6839a3 = f38615a;
        JvmPrimitiveType jvmPrimitiveType3 = JvmPrimitiveType.INT;
        String desc9 = jvmPrimitiveType3.getDesc();
        C5207g.m11110e(desc9, "INT.desc");
        C6839a.a aVarM13662a4 = C6839a.m13662a(c6839a3, "java/util/List", "removeAt", desc9, "Ljava/lang/Object;");
        f38622h = aVarM13662a4;
        String strConcat8 = "java/lang/".concat("Number");
        String desc10 = JvmPrimitiveType.BYTE.getDesc();
        C5207g.m11110e(desc10, "BYTE.desc");
        String strConcat9 = "java/lang/".concat("Number");
        String desc11 = JvmPrimitiveType.SHORT.getDesc();
        C5207g.m11110e(desc11, "SHORT.desc");
        String strConcat10 = "java/lang/".concat("Number");
        String desc12 = jvmPrimitiveType3.getDesc();
        C5207g.m11110e(desc12, "INT.desc");
        String strConcat11 = "java/lang/".concat("Number");
        String desc13 = JvmPrimitiveType.LONG.getDesc();
        C5207g.m11110e(desc13, "LONG.desc");
        String strConcat12 = "java/lang/".concat("Number");
        String desc14 = JvmPrimitiveType.FLOAT.getDesc();
        C5207g.m11110e(desc14, "FLOAT.desc");
        String strConcat13 = "java/lang/".concat("Number");
        String desc15 = JvmPrimitiveType.DOUBLE.getDesc();
        C5207g.m11110e(desc15, "DOUBLE.desc");
        String strConcat14 = "java/lang/".concat("CharSequence");
        String desc16 = jvmPrimitiveType3.getDesc();
        C5207g.m11110e(desc16, "INT.desc");
        String desc17 = JvmPrimitiveType.CHAR.getDesc();
        C5207g.m11110e(desc17, "CHAR.desc");
        Map<C6839a.a, C7648e> mapM13462O1 = C6753d.m13462O0(new Pair(C6839a.m13662a(c6839a3, strConcat8, "toByte", "", desc10), C7648e.m15232l("byteValue")), new Pair(C6839a.m13662a(c6839a3, strConcat9, "toShort", "", desc11), C7648e.m15232l("shortValue")), new Pair(C6839a.m13662a(c6839a3, strConcat10, "toInt", "", desc12), C7648e.m15232l("intValue")), new Pair(C6839a.m13662a(c6839a3, strConcat11, "toLong", "", desc13), C7648e.m15232l("longValue")), new Pair(C6839a.m13662a(c6839a3, strConcat12, "toFloat", "", desc14), C7648e.m15232l("floatValue")), new Pair(C6839a.m13662a(c6839a3, strConcat13, "toDouble", "", desc15), C7648e.m15232l("doubleValue")), new Pair(aVarM13662a4, C7648e.m15232l("remove")), new Pair(C6839a.m13662a(c6839a3, strConcat14, "get", desc16, desc17), C7648e.m15232l("charAt")));
        f38623i = mapM13462O1;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(C7499b.m14941g0(mapM13462O1.size()));
        Iterator<T> it6 = mapM13462O1.entrySet().iterator();
        while (it6.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it6.next();
            linkedHashMap2.put(((C6839a.a) entry2.getKey()).f38628b, entry2.getValue());
        }
        f38624j = linkedHashMap2;
        Set<C6839a.a> setKeySet = f38623i.keySet();
        ArrayList arrayList7 = new ArrayList(C9325m.m17681z(setKeySet, 10));
        Iterator<T> it7 = setKeySet.iterator();
        while (it7.hasNext()) {
            arrayList7.add(((C6839a.a) it7.next()).f38627a);
        }
        f38625k = arrayList7;
        Set<Map.Entry<C6839a.a, C7648e>> setEntrySet = f38623i.entrySet();
        ArrayList<Pair> arrayList8 = new ArrayList(C9325m.m17681z(setEntrySet, 10));
        Iterator<T> it8 = setEntrySet.iterator();
        while (it8.hasNext()) {
            Map.Entry entry3 = (Map.Entry) it8.next();
            arrayList8.add(new Pair(((C6839a.a) entry3.getKey()).f38627a, entry3.getValue()));
        }
        int iM14941g0 = C7499b.m14941g0(C9325m.m17681z(arrayList8, 10));
        if (iM14941g0 < 16) {
            iM14941g0 = 16;
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(iM14941g0);
        for (Pair pair : arrayList8) {
            linkedHashMap3.put((C7648e) pair.f38013b, (C7648e) pair.f38012a);
        }
        f38626l = linkedHashMap3;
    }
}
