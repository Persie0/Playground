package p000;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class cq2 extends bq2 {

    /* JADX INFO: renamed from: e */
    public on3 f34371e = ci8.m4735t(new cs3(og2.f54304a));

    /* JADX INFO: renamed from: f */
    public long f34372f;

    @Override // p000.vp2
    /* JADX INFO: renamed from: a */
    public final on3 mo2977a() {
        return this.f34371e;
    }

    @Override // p000.vp2
    /* JADX INFO: renamed from: b */
    public final void mo2978b(on3 on3Var) {
        this.f34371e = on3Var;
    }

    @Override // p000.vp2
    public final vp2 copy() {
        cq2 cq2Var = new cq2();
        cq2Var.f34372f = this.f34372f;
        cq2Var.f8864d = this.f8864d;
        ArrayList arrayList = this.f45997c;
        ArrayList arrayList2 = new ArrayList(v91.m23189q0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((vp2) it.next()).copy());
        }
        cq2Var.f45997c.addAll(arrayList2);
        return cq2Var;
    }

    public final String toString() {
        return "EmittableLazyListItem(modifier=" + this.f34371e + ", alignment=" + this.f8864d + ", children=[\n" + m14615c() + "\n])";
    }
}
