package kotlin.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Pair;
import p000.pvc;

/* JADX INFO: renamed from: kotlin.collections.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3194a extends pvc {
    /* JADX INFO: renamed from: M */
    public static Map m15360M() {
        return EmptyMap.f47639a;
    }

    /* JADX INFO: renamed from: N */
    public static Object m15361N(Object obj, Map map) {
        map.getClass();
        Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return obj2;
        }
        throw new NoSuchElementException("Key " + obj + " is missing in the map.");
    }

    /* JADX INFO: renamed from: O */
    public static HashMap m15362O(Pair... pairArr) {
        HashMap map = new HashMap(m15363P(pairArr.length));
        m15369V(map, pairArr);
        return map;
    }

    /* JADX INFO: renamed from: P */
    public static int m15363P(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    /* JADX INFO: renamed from: Q */
    public static Map m15364Q(Pair pair) {
        pair.getClass();
        Map mapSingletonMap = Collections.singletonMap(pair.f47623a, pair.f47624b);
        mapSingletonMap.getClass();
        return mapSingletonMap;
    }

    /* JADX INFO: renamed from: R */
    public static Map m15365R(Pair... pairArr) {
        if (pairArr.length <= 0) {
            return EmptyMap.f47639a;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(m15363P(pairArr.length));
        m15369V(linkedHashMap, pairArr);
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: S */
    public static final Map m15366S(LinkedHashMap linkedHashMap) {
        int size = linkedHashMap.size();
        if (size == 0) {
            return EmptyMap.f47639a;
        }
        if (size != 1) {
            return linkedHashMap;
        }
        Map.Entry entry = (Map.Entry) linkedHashMap.entrySet().iterator().next();
        Map mapSingletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        mapSingletonMap.getClass();
        return mapSingletonMap;
    }

    /* JADX INFO: renamed from: T */
    public static LinkedHashMap m15367T(Map map, Map map2) {
        map.getClass();
        map2.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: U */
    public static Map m15368U(Map map, Pair pair) {
        map.getClass();
        if (map.isEmpty()) {
            return m15364Q(pair);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(pair.f47623a, pair.f47624b);
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: V */
    public static final void m15369V(HashMap map, Pair[] pairArr) {
        for (Pair pair : pairArr) {
            map.put(pair.f47623a, pair.f47624b);
        }
    }

    /* JADX INFO: renamed from: W */
    public static Map m15370W(ArrayList arrayList) {
        int size = arrayList.size();
        if (size == 0) {
            return EmptyMap.f47639a;
        }
        if (size == 1) {
            return m15364Q((Pair) arrayList.get(0));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(m15363P(arrayList.size()));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            linkedHashMap.put(pair.f47623a, pair.f47624b);
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: X */
    public static Map m15371X(Map map) {
        map.getClass();
        int size = map.size();
        if (size == 0) {
            return EmptyMap.f47639a;
        }
        if (size != 1) {
            return new LinkedHashMap(map);
        }
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map mapSingletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        mapSingletonMap.getClass();
        return mapSingletonMap;
    }

    /* JADX INFO: renamed from: Y */
    public static LinkedHashMap m15372Y(Map map) {
        map.getClass();
        return new LinkedHashMap(map);
    }
}
