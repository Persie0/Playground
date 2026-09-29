package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class gmb extends vkb {

    /* JADX INFO: renamed from: c */
    public final ArrayList f41029c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f41030d;

    /* JADX INFO: renamed from: e */
    public final C3329mb f41031e;

    public gmb(String str, ArrayList arrayList, List list, C3329mb c3329mb) {
        super(str);
        this.f41029c = new ArrayList();
        this.f41031e = c3329mb;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this.f41029c.add(((kmb) it.next()).mo3809c());
            }
        }
        this.f41030d = new ArrayList(list);
    }

    @Override // p000.vkb
    /* JADX INFO: renamed from: a */
    public final kmb mo12757a(C3329mb c3329mb, List list) {
        cnb cnbVar;
        C3329mb c3329mbM16736n = this.f41031e.m16736n();
        cdb cdbVar = (cdb) c3329mbM16736n.f50861c;
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f41029c;
            int size = arrayList.size();
            cnbVar = kmb.f47523y;
            if (i >= size) {
                break;
            }
            if (i < list.size()) {
                c3329mbM16736n.m16739q((String) arrayList.get(i), ((cdb) c3329mb.f50861c).m4562k(c3329mb, (kmb) list.get(i)));
            } else {
                c3329mbM16736n.m16739q((String) arrayList.get(i), cnbVar);
            }
            i++;
        }
        for (kmb kmbVar : this.f41030d) {
            kmb kmbVarM4562k = cdbVar.m4562k(c3329mbM16736n, kmbVar);
            if (kmbVarM4562k instanceof rmb) {
                kmbVarM4562k = cdbVar.m4562k(c3329mbM16736n, kmbVar);
            }
            if (kmbVarM4562k instanceof jjb) {
                return ((jjb) kmbVarM4562k).f45637a;
            }
        }
        return cnbVar;
    }

    @Override // p000.vkb, p000.kmb
    /* JADX INFO: renamed from: k */
    public final kmb mo3813k() {
        return new gmb(this);
    }

    public gmb(gmb gmbVar) {
        super(gmbVar.f65549a);
        ArrayList arrayList = new ArrayList(gmbVar.f41029c.size());
        this.f41029c = arrayList;
        arrayList.addAll(gmbVar.f41029c);
        ArrayList arrayList2 = new ArrayList(gmbVar.f41030d.size());
        this.f41030d = arrayList2;
        arrayList2.addAll(gmbVar.f41030d);
        this.f41031e = gmbVar.f41031e;
    }
}
