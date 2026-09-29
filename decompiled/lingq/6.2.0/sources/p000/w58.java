package p000;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class w58 extends jq2 {

    /* JADX INFO: renamed from: d */
    public final int f66428d;

    /* JADX INFO: renamed from: e */
    public on3 f66429e;

    public w58(int i) {
        super(i, 2);
        this.f66428d = i;
        this.f66429e = mn3.f51554a;
    }

    @Override // p000.vp2
    /* JADX INFO: renamed from: a */
    public final on3 mo2977a() {
        return this.f66429e;
    }

    @Override // p000.vp2
    /* JADX INFO: renamed from: b */
    public final void mo2978b(on3 on3Var) {
        this.f66429e = on3Var;
    }

    @Override // p000.vp2
    public final vp2 copy() {
        w58 w58Var = new w58(this.f66428d);
        w58Var.f66429e = this.f66429e;
        ArrayList arrayList = this.f45997c;
        ArrayList arrayList2 = new ArrayList(v91.m23189q0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((vp2) it.next()).copy());
        }
        w58Var.f45997c.addAll(arrayList2);
        return w58Var;
    }

    public final String toString() {
        return "RemoteViewsRoot(modifier=" + this.f66429e + ", children=[\n" + m14615c() + "\n])";
    }
}
