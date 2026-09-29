package p000;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class gq2 extends jq2 {

    /* JADX INFO: renamed from: d */
    public long f41177d;

    /* JADX INFO: renamed from: e */
    public g99 f41178e;

    public gq2() {
        super(0, 3);
        this.f41177d = 9205357640488583168L;
        this.f41178e = f99.f38689a;
    }

    @Override // p000.vp2
    /* JADX INFO: renamed from: a */
    public final on3 mo2977a() {
        on3 on3VarMo2977a;
        ArrayList arrayList = this.f45997c;
        arrayList.getClass();
        vp2 vp2Var = (vp2) (arrayList.size() == 1 ? arrayList.get(0) : null);
        return (vp2Var == null || (on3VarMo2977a = vp2Var.mo2977a()) == null) ? ci8.m4734s(mn3.f51554a) : on3VarMo2977a;
    }

    @Override // p000.vp2
    /* JADX INFO: renamed from: b */
    public final void mo2978b(on3 on3Var) {
        throw new IllegalAccessError("You cannot set the modifier of an EmittableSizeBox");
    }

    @Override // p000.vp2
    public final vp2 copy() {
        gq2 gq2Var = new gq2();
        gq2Var.f41177d = this.f41177d;
        gq2Var.f41178e = this.f41178e;
        ArrayList arrayList = this.f45997c;
        ArrayList arrayList2 = new ArrayList(v91.m23189q0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((vp2) it.next()).copy());
        }
        gq2Var.f45997c.addAll(arrayList2);
        return gq2Var;
    }

    public final String toString() {
        return "EmittableSizeBox(size=" + ((Object) bk2.m3807c(this.f41177d)) + ", sizeMode=" + this.f41178e + ", children=[\n" + m14615c() + "\n])";
    }
}
