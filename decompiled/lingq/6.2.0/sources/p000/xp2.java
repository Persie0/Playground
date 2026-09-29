package p000;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class xp2 extends jq2 {

    /* JADX INFO: renamed from: d */
    public on3 f68480d;

    /* JADX INFO: renamed from: e */
    public int f68481e;

    /* JADX INFO: renamed from: f */
    public int f68482f;

    public xp2() {
        super(0, 3);
        this.f68480d = mn3.f51554a;
        this.f68481e = 0;
        this.f68482f = 0;
    }

    @Override // p000.vp2
    /* JADX INFO: renamed from: a */
    public final on3 mo2977a() {
        return this.f68480d;
    }

    @Override // p000.vp2
    /* JADX INFO: renamed from: b */
    public final void mo2978b(on3 on3Var) {
        this.f68480d = on3Var;
    }

    @Override // p000.vp2
    public final vp2 copy() {
        xp2 xp2Var = new xp2();
        xp2Var.f68480d = this.f68480d;
        xp2Var.f68481e = this.f68481e;
        xp2Var.f68482f = this.f68482f;
        ArrayList arrayList = this.f45997c;
        ArrayList arrayList2 = new ArrayList(v91.m23189q0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((vp2) it.next()).copy());
        }
        xp2Var.f45997c.addAll(arrayList2);
        return xp2Var;
    }

    public final String toString() {
        return "EmittableColumn(modifier=" + this.f68480d + ", verticalAlignment=" + ((Object) C3494qe.m19887b(this.f68481e)) + ", horizontalAlignment=" + ((Object) C3406oe.m17945b(this.f68482f)) + ", children=[\n" + m14615c() + "\n])";
    }
}
