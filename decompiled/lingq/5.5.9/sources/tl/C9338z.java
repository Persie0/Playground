package tl;

import dm.C5207g;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import p260m8.C7499b;

/* JADX INFO: renamed from: tl.z */
/* JADX INFO: loaded from: classes2.dex */
public final class C9338z extends C7499b {
    /* JADX INFO: renamed from: L0 */
    public static final LinkedHashSet m17689L0(Set set, Object obj) {
        C5207g.m11111f(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(C7499b.m14941g0(set.size()));
        boolean z10 = false;
        while (true) {
            for (Object obj2 : set) {
                boolean z11 = true;
                if (!z10 && C5207g.m11106a(obj2, obj)) {
                    z10 = true;
                    z11 = false;
                }
                if (z11) {
                    linkedHashSet.add(obj2);
                }
            }
            return linkedHashSet;
        }
    }

    /* JADX INFO: renamed from: M0 */
    public static final LinkedHashSet m17690M0(Set set, Object obj) {
        C5207g.m11111f(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(C7499b.m14941g0(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(obj);
        return linkedHashSet;
    }

    /* JADX INFO: renamed from: N0 */
    public static final LinkedHashSet m17691N0(Set set, Collection collection) {
        int size;
        C5207g.m11111f(set, "<this>");
        C5207g.m11111f(collection, "elements");
        Integer numValueOf = Integer.valueOf(collection.size());
        if (numValueOf != null) {
            size = set.size() + numValueOf.intValue();
        } else {
            size = set.size() * 2;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(C7499b.m14941g0(size));
        linkedHashSet.addAll(set);
        C9327o.m17684D(collection, linkedHashSet);
        return linkedHashSet;
    }
}
