package kotlin.collections;

import dm.C5207g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Pair;
import p260m8.C7499b;
import tl.InterfaceC9335w;

/* JADX INFO: renamed from: kotlin.collections.d */
/* JADX INFO: loaded from: classes2.dex */
public class C6753d extends C7499b {
    /* JADX INFO: renamed from: L0 */
    public static final Map m13459L0() {
        EmptyMap emptyMap = EmptyMap.f38033a;
        C5207g.m11109d(emptyMap, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        return emptyMap;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: M0 */
    public static final Object m13460M0(Object obj, Map map) {
        C5207g.m11111f(map, "<this>");
        if (map instanceof InterfaceC9335w) {
            return ((InterfaceC9335w) map).m17687s();
        }
        Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return obj2;
        }
        throw new NoSuchElementException("Key " + obj + " is missing in the map.");
    }

    /* JADX INFO: renamed from: N0 */
    public static final HashMap m13461N0(Pair... pairArr) {
        HashMap map = new HashMap(C7499b.m14941g0(pairArr.length));
        for (Pair pair : pairArr) {
            map.put(pair.f38012a, pair.f38013b);
        }
        return map;
    }

    /* JADX INFO: renamed from: O0 */
    public static final Map m13462O0(Pair... pairArr) {
        Map mapM13459L0;
        if (pairArr.length > 0) {
            mapM13459L0 = new LinkedHashMap(C7499b.m14941g0(pairArr.length));
            for (Pair pair : pairArr) {
                mapM13459L0.put(pair.f38012a, pair.f38013b);
            }
        } else {
            mapM13459L0 = m13459L0();
        }
        return mapM13459L0;
    }

    /* JADX INFO: renamed from: P0 */
    public static final LinkedHashMap m13463P0(Map map, Map map2) {
        C5207g.m11111f(map, "<this>");
        C5207g.m11111f(map2, "map");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: Q0 */
    public static final Map m13464Q0(ArrayList arrayList) {
        int size = arrayList.size();
        if (size == 0) {
            return m13459L0();
        }
        if (size == 1) {
            return C7499b.m14943h0((Pair) arrayList.get(0));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(C7499b.m14941g0(arrayList.size()));
        m13466S0(arrayList, linkedHashMap);
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: R0 */
    public static final Map m13465R0(Map map) {
        C5207g.m11111f(map, "<this>");
        int size = map.size();
        if (size != 0) {
            return size != 1 ? m13467T0(map) : C7499b.m14901E0(map);
        }
        return m13459L0();
    }

    /* JADX INFO: renamed from: S0 */
    public static final void m13466S0(ArrayList arrayList, LinkedHashMap linkedHashMap) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            linkedHashMap.put(pair.f38012a, pair.f38013b);
        }
    }

    /* JADX INFO: renamed from: T0 */
    public static final LinkedHashMap m13467T0(Map map) {
        C5207g.m11111f(map, "<this>");
        return new LinkedHashMap(map);
    }
}
