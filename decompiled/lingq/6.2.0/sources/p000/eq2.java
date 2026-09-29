package p000;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class eq2 extends bq2 {

    /* JADX INFO: renamed from: e */
    public on3 f37702e = ci8.m4735t(new cs3(og2.f54304a));

    /* JADX INFO: renamed from: f */
    public long f37703f;

    @Override // p000.vp2
    /* JADX INFO: renamed from: a */
    public final on3 mo2977a() {
        return this.f37702e;
    }

    @Override // p000.vp2
    /* JADX INFO: renamed from: b */
    public final void mo2978b(on3 on3Var) {
        this.f37702e = on3Var;
    }

    @Override // p000.vp2
    public final vp2 copy() {
        eq2 eq2Var = new eq2();
        eq2Var.f37703f = this.f37703f;
        eq2Var.f8864d = this.f8864d;
        ArrayList arrayList = this.f45997c;
        ArrayList arrayList2 = new ArrayList(v91.m23189q0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((vp2) it.next()).copy());
        }
        eq2Var.f45997c.addAll(arrayList2);
        return eq2Var;
    }

    public final String toString() {
        return "EmittableLazyVerticalGridListItem(modifier=" + this.f37702e + ", alignment=" + this.f8864d + ", children=[\n" + m14615c() + "\n])";
    }
}
