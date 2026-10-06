package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kih implements kbg {

    /* JADX INFO: renamed from: a */
    public final nps f36161a;

    /* JADX INFO: renamed from: b */
    private final Set f36162b;

    public kih(mxk mxkVar) {
        ArrayList arrayList = new ArrayList();
        this.f36162b = mxkVar;
        naz nazVarListIterator = mxkVar.listIterator();
        while (nazVarListIterator.hasNext()) {
            arrayList.add(((kgc) nazVarListIterator.next()).f35866a);
        }
        this.f36161a = nod.m17554j(kxk.m14961G(arrayList), etv.f19880e, not.INSTANCE);
    }

    @Override // p000.kbg
    /* JADX INFO: renamed from: bf */
    public final /* bridge */ /* synthetic */ void mo3415bf(Object obj) {
        kpl kplVar = (kpl) obj;
        Iterator it = this.f36162b.iterator();
        while (it.hasNext()) {
            ((kgc) it.next()).mo3415bf(kplVar);
        }
    }
}
