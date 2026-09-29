package p248ln;

import android.support.v4.media.session.C0166e;
import androidx.activity.result.C0204c;
import dm.C5207g;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.C6752c;
import mo.C7661i;
import p003a2.C0009a;
import p349qo.C8656b;
import p385sf.C9000b;

/* JADX INFO: renamed from: ln.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C7401b {

    /* JADX INFO: renamed from: a */
    public static final String f41215a = C6752c.m13430X(C9000b.m17252r('k', 'o', 't', 'l', 'i', 'n'), "", null, null, null, 62);

    /* JADX INFO: renamed from: b */
    public static final LinkedHashMap f41216b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List listM17252r = C9000b.m17252r("Boolean", "Z", "Char", "C", "Byte", "B", "Short", "S", "Int", "I", "Float", "F", "Long", "J", "Double", "D");
        int iM16915w = C8656b.m16915w(0, listM17252r.size() - 1, 2);
        if (iM16915w >= 0) {
            int i10 = 0;
            while (true) {
                StringBuilder sb2 = new StringBuilder();
                String str = f41215a;
                sb2.append(str);
                sb2.append('/');
                sb2.append((String) listM17252r.get(i10));
                int i11 = i10 + 1;
                linkedHashMap.put(sb2.toString(), listM17252r.get(i11));
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append('/');
                linkedHashMap.put(C0009a.m23l(sb3, (String) listM17252r.get(i10), "Array"), "[" + ((String) listM17252r.get(i11)));
                if (i10 == iM16915w) {
                    break;
                } else {
                    i10 += 2;
                }
            }
        }
        linkedHashMap.put(f41215a + "/Unit", "V");
        m14801a("Any", "java/lang/Object", linkedHashMap);
        m14801a("Nothing", "java/lang/Void", linkedHashMap);
        m14801a("Annotation", "java/lang/annotation/Annotation", linkedHashMap);
        for (String str2 : C9000b.m17252r("String", "CharSequence", "Throwable", "Cloneable", "Number", "Comparable", "Enum")) {
            m14801a(str2, "java/lang/" + str2, linkedHashMap);
        }
        for (String str3 : C9000b.m17252r("Iterator", "Collection", "List", "Set", "Map", "ListIterator")) {
            m14801a(C0204c.m852k("collections/", str3), "java/util/" + str3, linkedHashMap);
            m14801a("collections/Mutable" + str3, "java/util/" + str3, linkedHashMap);
        }
        m14801a("collections/Iterable", "java/lang/Iterable", linkedHashMap);
        m14801a("collections/MutableIterable", "java/lang/Iterable", linkedHashMap);
        m14801a("collections/Map.Entry", "java/util/Map$Entry", linkedHashMap);
        m14801a("collections/MutableMap.MutableEntry", "java/util/Map$Entry", linkedHashMap);
        for (int i12 = 0; i12 < 23; i12++) {
            String strM761g = C0166e.m761g("Function", i12);
            StringBuilder sb4 = new StringBuilder();
            String str4 = f41215a;
            sb4.append(str4);
            sb4.append("/jvm/functions/Function");
            sb4.append(i12);
            m14801a(strM761g, sb4.toString(), linkedHashMap);
            m14801a("reflect/KFunction" + i12, str4 + "/reflect/KFunction", linkedHashMap);
        }
        for (String str5 : C9000b.m17252r("Char", "Byte", "Short", "Int", "Float", "Long", "Double", "String", "Enum")) {
            m14801a(C0166e.m765k(str5, ".Companion"), f41215a + "/jvm/internal/" + str5 + "CompanionObject", linkedHashMap);
        }
        f41216b = linkedHashMap;
    }

    /* JADX INFO: renamed from: a */
    public static final void m14801a(String str, String str2, LinkedHashMap linkedHashMap) {
        linkedHashMap.put(f41215a + '/' + str, "L" + str2 + ';');
    }

    /* JADX INFO: renamed from: b */
    public static final String m14802b(String str) {
        C5207g.m11111f(str, "classId");
        String str2 = (String) f41216b.get(str);
        if (str2 == null) {
            str2 = "L" + C7661i.m15253S2(str, '.', '$') + ';';
        }
        return str2;
    }
}
