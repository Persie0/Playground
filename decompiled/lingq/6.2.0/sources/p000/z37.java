package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.AbstractC3194a;

/* JADX INFO: loaded from: classes.dex */
public final class z37 implements Iterable, tg4 {

    /* JADX INFO: renamed from: b */
    public static final z37 f70834b = new z37(AbstractC3194a.m15360M());

    /* JADX INFO: renamed from: a */
    public final Map f70835a;

    public z37(Map map) {
        this.f70835a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof z37) {
            return fa4.m11650l(this.f70835a, ((z37) obj).f70835a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f70835a.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Map map = this.f70835a;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            g9a.m12435l(entry.getValue());
            arrayList.add(new Pair(str, null));
        }
        return arrayList.iterator();
    }

    public final String toString() {
        return "Parameters(entries=" + this.f70835a + ')';
    }
}
