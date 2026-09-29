package p000;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class dq2 extends jq2 {

    /* JADX INFO: renamed from: d */
    public on3 f36015d;

    /* JADX INFO: renamed from: e */
    public int f36016e;

    /* JADX INFO: renamed from: f */
    public xp3 f36017f;

    public dq2() {
        super(0, 1);
        this.f36015d = mn3.f51554a;
        this.f36016e = 0;
        this.f36017f = new xp3(1);
    }

    @Override // p000.vp2
    /* JADX INFO: renamed from: a */
    public final on3 mo2977a() {
        return this.f36015d;
    }

    @Override // p000.vp2
    /* JADX INFO: renamed from: b */
    public final void mo2978b(on3 on3Var) {
        this.f36015d = on3Var;
    }

    @Override // p000.vp2
    public final vp2 copy() {
        dq2 dq2Var = new dq2();
        dq2Var.f36015d = this.f36015d;
        dq2Var.f36016e = this.f36016e;
        dq2Var.f36017f = this.f36017f;
        ArrayList arrayList = this.f45997c;
        ArrayList arrayList2 = new ArrayList(v91.m23189q0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((vp2) it.next()).copy());
        }
        dq2Var.f45997c.addAll(arrayList2);
        return dq2Var;
    }

    public final String toString() {
        return "EmittableLazyVerticalGridList(modifier=" + this.f36015d + ", horizontalAlignment=" + ((Object) C3406oe.m17945b(this.f36016e)) + ", numColumn=" + this.f36017f + ", activityOptions=null, children=[\n" + m14615c() + "\n])";
    }
}
