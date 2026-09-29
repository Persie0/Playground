package p000;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class aq2 extends jq2 {

    /* JADX INFO: renamed from: d */
    public on3 f7356d;

    /* JADX INFO: renamed from: e */
    public int f7357e;

    public aq2() {
        super(0, 1);
        this.f7356d = mn3.f51554a;
        this.f7357e = 0;
    }

    @Override // p000.vp2
    /* JADX INFO: renamed from: a */
    public final on3 mo2977a() {
        return this.f7356d;
    }

    @Override // p000.vp2
    /* JADX INFO: renamed from: b */
    public final void mo2978b(on3 on3Var) {
        this.f7356d = on3Var;
    }

    @Override // p000.vp2
    public final vp2 copy() {
        aq2 aq2Var = new aq2();
        aq2Var.f7356d = this.f7356d;
        aq2Var.f7357e = this.f7357e;
        ArrayList arrayList = this.f45997c;
        ArrayList arrayList2 = new ArrayList(v91.m23189q0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((vp2) it.next()).copy());
        }
        aq2Var.f45997c.addAll(arrayList2);
        return aq2Var;
    }

    public final String toString() {
        return "EmittableLazyList(modifier=" + this.f7356d + ", horizontalAlignment=" + ((Object) C3406oe.m17945b(this.f7357e)) + ", activityOptions=null, children=[\n" + m14615c() + "\n])";
    }
}
