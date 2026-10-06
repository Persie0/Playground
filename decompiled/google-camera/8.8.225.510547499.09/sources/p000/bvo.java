package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bvo implements bvl {

    /* JADX INFO: renamed from: a */
    private final List f4546a;

    /* JADX INFO: renamed from: b */
    private final aed f4547b;

    public bvo(List list, aed aedVar) {
        this.f4546a = list;
        this.f4547b = aedVar;
    }

    @Override // p000.bvl
    /* JADX INFO: renamed from: a */
    public final boolean mo3083a(Object obj) {
        Iterator it = this.f4546a.iterator();
        while (it.hasNext()) {
            if (((bvl) it.next()).mo3083a(obj)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [bqn] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4 */
    @Override // p000.bvl
    /* JADX INFO: renamed from: b */
    public final C1058va mo3084b(Object obj, int i, int i2, bqr bqrVar) {
        C1058va c1058vaMo3084b;
        int size = this.f4546a.size();
        ArrayList arrayList = new ArrayList(size);
        int i3 = 0;
        ?? r4 = 0;
        while (i3 < size) {
            bvl bvlVar = (bvl) this.f4546a.get(i3);
            if (bvlVar.mo3083a(obj) && (c1058vaMo3084b = bvlVar.mo3084b(obj, i, i2, bqrVar)) != null) {
                r4 = c1058vaMo3084b.f47803b;
                arrayList.add(c1058vaMo3084b.f47802a);
            }
            i3++;
            r4 = r4;
        }
        if (arrayList.isEmpty() || r4 == 0) {
            return null;
        }
        return new C1058va((bqn) r4, new bvn(arrayList, this.f4547b));
    }

    public final String toString() {
        return "MultiModelLoader{modelLoaders=" + Arrays.toString(this.f4546a.toArray()) + "}";
    }
}
