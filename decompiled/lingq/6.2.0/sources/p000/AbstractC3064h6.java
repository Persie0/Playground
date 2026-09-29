package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.collections.AbstractC3194a;

/* JADX INFO: renamed from: h6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3064h6 {
    /* JADX INFO: renamed from: a */
    public static final o56 m13073a(C2990f6... c2990f6Arr) {
        ArrayList arrayList = new ArrayList(c2990f6Arr.length);
        for (C2990f6 c2990f6 : c2990f6Arr) {
            arrayList.add(new Pair(c2990f6.f38501a, c2990f6.f38502b));
        }
        Pair[] pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
        Pair[] pairArr2 = (Pair[]) Arrays.copyOf(pairArr, pairArr.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC3194a.m15363P(pairArr2.length));
        AbstractC3194a.m15369V(linkedHashMap, pairArr2);
        return new o56(linkedHashMap);
    }
}
