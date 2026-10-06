package p000;

import java.util.TreeMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ins {

    /* JADX INFO: renamed from: a */
    private static final TreeMap f31613a = new TreeMap();

    /* JADX INFO: renamed from: a */
    public static synchronized long m11547a(long j) {
        Long l;
        l = (Long) f31613a.get(Long.valueOf(j));
        return l != null ? l.longValue() : System.currentTimeMillis();
    }

    /* JADX INFO: renamed from: b */
    public static synchronized void m11548b(long j) {
        TreeMap treeMap = f31613a;
        Long lValueOf = Long.valueOf(j);
        if (!treeMap.containsKey(lValueOf)) {
            treeMap.put(lValueOf, Long.valueOf(System.currentTimeMillis()));
        }
        while (true) {
            TreeMap treeMap2 = f31613a;
            if (treeMap2.size() > 1800) {
                treeMap2.pollFirstEntry();
            }
        }
    }
}
