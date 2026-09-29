package zm;

import ae.C0062b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.C6752c;
import kotlin.collections.C6753d;
import kotlin.reflect.jvm.internal.impl.builtins.C6797e;
import mn.C7646c;
import mn.C7647d;
import mn.C7648e;
import p260m8.C7499b;
import tl.C9325m;

/* JADX INFO: renamed from: zm.d */
/* JADX INFO: loaded from: classes2.dex */
public final class C10519d {

    /* JADX INFO: renamed from: a */
    public static final Map<C7646c, C7648e> f52506a;

    /* JADX INFO: renamed from: b */
    public static final LinkedHashMap f52507b;

    /* JADX INFO: renamed from: c */
    public static final Set<C7646c> f52508c;

    /* JADX INFO: renamed from: d */
    public static final Set<C7648e> f52509d;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        C7647d c7647d = C6797e.a.f38387j;
        C7646c c7646c = C6797e.a.f38354F;
        Map<C7646c, C7648e> mapM13462O0 = C6753d.m13462O0(new Pair(C0062b.m396t(c7647d, "name"), C7648e.m15232l("name")), new Pair(C0062b.m396t(c7647d, "ordinal"), C7648e.m15232l("ordinal")), new Pair(C6797e.a.f38350B.m15215c(C7648e.m15232l("size")), C7648e.m15232l("size")), new Pair(c7646c.m15215c(C7648e.m15232l("size")), C7648e.m15232l("size")), new Pair(C0062b.m396t(C6797e.a.f38382e, "length"), C7648e.m15232l("length")), new Pair(c7646c.m15215c(C7648e.m15232l("keys")), C7648e.m15232l("keySet")), new Pair(c7646c.m15215c(C7648e.m15232l("values")), C7648e.m15232l("values")), new Pair(c7646c.m15215c(C7648e.m15232l("entries")), C7648e.m15232l("entrySet")));
        f52506a = mapM13462O0;
        Set<Map.Entry<C7646c, C7648e>> setEntrySet = mapM13462O0.entrySet();
        ArrayList<Pair> arrayList = new ArrayList(C9325m.m17681z(setEntrySet, 10));
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            arrayList.add(new Pair(((C7646c) entry.getKey()).m15218f(), entry.getValue()));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Pair pair : arrayList) {
            C7648e c7648e = (C7648e) pair.f38013b;
            Object arrayList2 = linkedHashMap.get(c7648e);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(c7648e, arrayList2);
            }
            ((List) arrayList2).add((C7648e) pair.f38012a);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(C7499b.m14941g0(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry2.getKey(), C6752c.m13416J((Iterable) entry2.getValue()));
        }
        f52507b = linkedHashMap2;
        Set<C7646c> setKeySet = f52506a.keySet();
        f52508c = setKeySet;
        ArrayList arrayList3 = new ArrayList(C9325m.m17681z(setKeySet, 10));
        Iterator<T> it2 = setKeySet.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((C7646c) it2.next()).m15218f());
        }
        f52509d = C6752c.m13457y0(arrayList3);
    }
}
