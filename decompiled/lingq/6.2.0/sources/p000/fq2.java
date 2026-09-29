package p000;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class fq2 extends jq2 {

    /* JADX INFO: renamed from: d */
    public on3 f39450d;

    /* JADX INFO: renamed from: e */
    public int f39451e;

    /* JADX INFO: renamed from: f */
    public int f39452f;

    public fq2() {
        super(0, 3);
        this.f39450d = mn3.f51554a;
        this.f39451e = 0;
        this.f39452f = 0;
    }

    @Override // p000.vp2
    /* JADX INFO: renamed from: a */
    public final on3 mo2977a() {
        return this.f39450d;
    }

    @Override // p000.vp2
    /* JADX INFO: renamed from: b */
    public final void mo2978b(on3 on3Var) {
        this.f39450d = on3Var;
    }

    @Override // p000.vp2
    public final vp2 copy() {
        fq2 fq2Var = new fq2();
        fq2Var.f39450d = this.f39450d;
        fq2Var.f39451e = this.f39451e;
        fq2Var.f39452f = this.f39452f;
        ArrayList arrayList = this.f45997c;
        ArrayList arrayList2 = new ArrayList(v91.m23189q0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((vp2) it.next()).copy());
        }
        fq2Var.f45997c.addAll(arrayList2);
        return fq2Var;
    }

    public final String toString() {
        return "EmittableRow(modifier=" + this.f39450d + ", horizontalAlignment=" + ((Object) C3406oe.m17945b(this.f39451e)) + ", verticalAlignment=" + ((Object) C3494qe.m19887b(this.f39452f)) + ", children=[\n" + m14615c() + "\n])";
    }
}
