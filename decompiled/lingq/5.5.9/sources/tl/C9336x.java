package tl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.C6753d;
import kotlin.collections.EmptyList;
import p385sf.C9000b;

/* JADX INFO: renamed from: tl.x */
/* JADX INFO: loaded from: classes2.dex */
public final class C9336x extends C6753d {
    /* JADX INFO: renamed from: U0 */
    public static final List m17688U0(Map map) {
        if (map.size() == 0) {
            return EmptyList.f38032a;
        }
        Iterator it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return EmptyList.f38032a;
        }
        Map.Entry entry = (Map.Entry) it.next();
        if (!it.hasNext()) {
            return C9000b.m17251q(new Pair(entry.getKey(), entry.getValue()));
        }
        ArrayList arrayList = new ArrayList(map.size());
        arrayList.add(new Pair(entry.getKey(), entry.getValue()));
        do {
            Map.Entry entry2 = (Map.Entry) it.next();
            arrayList.add(new Pair(entry2.getKey(), entry2.getValue()));
        } while (it.hasNext());
        return arrayList;
    }
}
