package zm;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.C6753d;
import mn.C7645b;
import mn.C7646c;
import mn.C7651h;

/* JADX INFO: renamed from: zm.g */
/* JADX INFO: loaded from: classes2.dex */
public final class C10522g {

    /* JADX INFO: renamed from: a */
    public static final LinkedHashMap f52511a;

    /* JADX INFO: renamed from: b */
    public static final Map<C7646c, C7646c> f52512b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        f52511a = linkedHashMap;
        m19497b(C7651h.f42112q, m19496a("java.util.ArrayList", "java.util.LinkedList"));
        m19497b(C7651h.f42113r, m19496a("java.util.HashSet", "java.util.TreeSet", "java.util.LinkedHashSet"));
        m19497b(C7651h.f42114s, m19496a("java.util.HashMap", "java.util.TreeMap", "java.util.LinkedHashMap", "java.util.concurrent.ConcurrentHashMap", "java.util.concurrent.ConcurrentSkipListMap"));
        m19497b(C7645b.m15203l(new C7646c("java.util.function.Function")), m19496a("java.util.function.UnaryOperator"));
        m19497b(C7645b.m15203l(new C7646c("java.util.function.BiFunction")), m19496a("java.util.function.BinaryOperator"));
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            arrayList.add(new Pair(((C7645b) entry.getKey()).m15204b(), ((C7645b) entry.getValue()).m15204b()));
        }
        f52512b = C6753d.m13464Q0(arrayList);
    }

    /* JADX INFO: renamed from: a */
    public static ArrayList m19496a(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(C7645b.m15203l(new C7646c(str)));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public static void m19497b(C7645b c7645b, ArrayList arrayList) {
        for (Object obj : arrayList) {
            f52511a.put(obj, c7645b);
        }
    }
}
