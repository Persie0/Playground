package kotlin.reflect.jvm.internal.impl.load.kotlin;

import cm.InterfaceC2052l;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import kotlin.collections.C6752c;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C6899b {
    /* JADX INFO: renamed from: a */
    public static String[] m13773a(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add("<init>(" + str + ")V");
        }
        Object[] array = arrayList.toArray(new String[0]);
        C5207g.m11109d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        return (String[]) array;
    }

    /* JADX INFO: renamed from: b */
    public static LinkedHashSet m13774b(String str, String... strArr) {
        C5207g.m11111f(str, "internalName");
        C5207g.m11111f(strArr, "signatures");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str2 : strArr) {
            linkedHashSet.add(str + '.' + str2);
        }
        return linkedHashSet;
    }

    /* JADX INFO: renamed from: c */
    public static LinkedHashSet m13775c(String str, String... strArr) {
        C5207g.m11111f(strArr, "signatures");
        return m13774b("java/lang/".concat(str), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* JADX INFO: renamed from: d */
    public static LinkedHashSet m13776d(String str, String... strArr) {
        return m13774b("java/util/".concat(str), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* JADX INFO: renamed from: e */
    public static String m13777e(String str, String str2, ArrayList arrayList) {
        C5207g.m11111f(str, "name");
        C5207g.m11111f(str2, "ret");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append('(');
        sb2.append(C6752c.m13430X(arrayList, "", null, null, new InterfaceC2052l<String, CharSequence>() { // from class: kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents$jvmDescriptor$1
            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final CharSequence mo528n(String str3) {
                String str4 = str3;
                C5207g.m11111f(str4, "it");
                if (str4.length() <= 1) {
                    return str4;
                }
                return "L" + str4 + ';';
            }
        }, 30));
        sb2.append(')');
        if (str2.length() > 1) {
            str2 = "L" + str2 + ';';
        }
        sb2.append(str2);
        return sb2.toString();
    }

    /* JADX INFO: renamed from: f */
    public static String m13778f(String str, String str2) {
        C5207g.m11111f(str, "internalName");
        C5207g.m11111f(str2, "jvmDescriptor");
        return str + '.' + str2;
    }
}
