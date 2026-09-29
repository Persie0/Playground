package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class bg1 implements mc3 {

    /* JADX INFO: renamed from: a */
    public final List f8488a;

    public bg1(List list) {
        list.getClass();
        this.f8488a = list;
    }

    @Override // p000.mc3
    /* JADX INFO: renamed from: a */
    public pc3 mo337a() {
        List list = this.f8488a;
        ArrayList arrayList = new ArrayList(v91.m23189q0(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((xl6) it.next()).mo337a());
        }
        return arrayList.size() == 1 ? (pc3) u91.m22611c1(arrayList) : new cg1();
    }

    @Override // p000.mc3
    /* JADX INFO: renamed from: b */
    public t47 mo338b() {
        List list = this.f8488a;
        ArrayList arrayList = new ArrayList(v91.m23189q0(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((xl6) it.next()).mo338b());
        }
        return nzb.m17712a(arrayList);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bg1) {
            return fa4.m11650l(this.f8488a, ((bg1) obj).f8488a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f8488a.hashCode();
    }

    public final String toString() {
        return ux5.m22992o(new StringBuilder("ConcatenatedFormatStructure("), u91.m22596N0(this.f8488a, ", ", null, null, null, 62), ')');
    }
}
