package p000;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class wp2 extends jq2 {

    /* JADX INFO: renamed from: d */
    public on3 f67149d;

    /* JADX INFO: renamed from: e */
    public C3532re f67150e;

    public wp2() {
        super(0, 3);
        this.f67149d = mn3.f51554a;
        this.f67150e = C3532re.f59143c;
    }

    @Override // p000.vp2
    /* JADX INFO: renamed from: a */
    public final on3 mo2977a() {
        return this.f67149d;
    }

    @Override // p000.vp2
    /* JADX INFO: renamed from: b */
    public final void mo2978b(on3 on3Var) {
        this.f67149d = on3Var;
    }

    @Override // p000.vp2
    public final vp2 copy() {
        wp2 wp2Var = new wp2();
        wp2Var.f67149d = this.f67149d;
        wp2Var.f67150e = this.f67150e;
        ArrayList arrayList = this.f45997c;
        ArrayList arrayList2 = new ArrayList(v91.m23189q0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((vp2) it.next()).copy());
        }
        wp2Var.f45997c.addAll(arrayList2);
        return wp2Var;
    }

    public final String toString() {
        return "EmittableBox(modifier=" + this.f67149d + ", contentAlignment=" + this.f67150e + "children=[\n" + m14615c() + "\n])";
    }
}
