package p000;

import java.util.List;
import kotlin.collections.EmptyList;

/* JADX INFO: loaded from: classes.dex */
public final class cj6 {

    /* JADX INFO: renamed from: a */
    public final List f10170a;

    /* JADX INFO: renamed from: b */
    public final int f10171b;

    public cj6(int i, List list) {
        this.f10170a = list;
        this.f10171b = i;
        if (list.isEmpty() && i == -1) {
            return;
        }
        List list2 = list;
        if (!list2.isEmpty()) {
            int size = list2.size();
            if (i >= 0 && i < size) {
                return;
            }
        }
        v63.m23139q(ux5.m22998u("Invalid 'NavigationEventHistory' state:  'currentIndex' must be within the bounds of 'mergedHistory' (or -1 if empty). Received: currentIndex = '", i, "', bounds = '"), vz1.m23601G(list2), "'.");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || cj6.class != obj.getClass()) {
            return false;
        }
        cj6 cj6Var = (cj6) obj;
        return this.f10171b == cj6Var.f10171b && fa4.m11650l(this.f10170a, cj6Var.f10170a);
    }

    public final int hashCode() {
        return this.f10170a.hashCode() + (this.f10171b * 31);
    }

    public final String toString() {
        return "NavigationEventHistory(currentIndex=" + this.f10171b + ", mergedHistory=" + this.f10170a + ')';
    }

    public cj6() {
        this(-1, EmptyList.f47638a);
    }
}
