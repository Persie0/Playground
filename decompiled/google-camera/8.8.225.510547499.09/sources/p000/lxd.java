package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class lxd {
    /* JADX INFO: renamed from: a */
    public Object mo16115a(List list, lvi lviVar, ols olsVar) {
        throw null;
    }

    /* JADX INFO: renamed from: c */
    public abstract Object mo16116c(List list, lvi lviVar, ols olsVar);

    /* JADX WARN: Code duplicated, block: B:24:0x0098  */
    /* JADX WARN: Code duplicated, block: B:27:0x00b3 A[LOOP:3: B:25:0x00ad->B:27:0x00b3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:38:0x011c A[LOOP:1: B:36:0x0116->B:38:0x011c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:41:0x0144 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    static /* synthetic */ Object m16114b(lxd lxdVar, List list, lvi lviVar, ols olsVar) {
        lxc lxcVar;
        ArrayList arrayList;
        Iterator it;
        lvi lviVar2;
        ArrayList arrayList2;
        Iterator it2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        if (olsVar instanceof lxc) {
            lxcVar = (lxc) olsVar;
            int i = lxcVar.f39503d;
            if ((i & Integer.MIN_VALUE) != 0) {
                lxcVar.f39503d = i - Integer.MIN_VALUE;
            } else {
                lxcVar = new lxc(lxdVar, olsVar);
            }
        } else {
            lxcVar = new lxc(lxdVar, olsVar);
        }
        Object obj = lxcVar.f39502c;
        oma omaVar = oma.COROUTINE_SUSPENDED;
        switch (lxcVar.f39503d) {
            case 0:
                lkm.m15592s(obj);
                ArrayList arrayList5 = new ArrayList(omn.m18678R(list));
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    arrayList5.add(omn.m18699d(((lzc) it3.next()).f39614a.f39611u));
                }
                lxcVar.f39500a = lxdVar;
                lxcVar.f39501b = list;
                lxcVar.f39504e = lviVar;
                lxcVar.f39503d = 1;
                lxl lxlVar = (lxl) lxdVar;
                if (adr.m307c(lxlVar.f39510a, new lxe(lxlVar, arrayList5, lviVar, 0), lxcVar) == omaVar) {
                    return omaVar;
                }
                arrayList = new ArrayList();
                it = list.iterator();
                while (it.hasNext()) {
                    List list2 = ((lzc) it.next()).f39615b;
                    arrayList2 = new ArrayList(omn.m18678R(list2));
                    it2 = list2.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(omn.m18699d(((lxm) it2.next()).f39521k));
                    }
                    omn.m18677Q(arrayList, arrayList2);
                }
                lxcVar.f39500a = list;
                lxcVar.f39501b = lviVar;
                lxcVar.f39504e = null;
                lxcVar.f39503d = 2;
                if (lxdVar.mo16116c(arrayList, lviVar, lxcVar) != omaVar) {
                    return omaVar;
                }
                lviVar2 = lviVar;
                arrayList3 = new ArrayList(omn.m18678R(list));
                for (lzc lzcVar : list) {
                    lzb lzbVar = lzcVar.f39614a;
                    List<lxm> list3 = lzcVar.f39615b;
                    lzb lzbVarM16222c = lzb.m16222c(lzbVar, null, null, lxv.m16126a(lzbVar.f39610t, null, null, lviVar2, null, 0.0d, 55), 3145727);
                    arrayList4 = new ArrayList(omn.m18678R(list3));
                    for (lxm lxmVar : list3) {
                        arrayList4.add(lxm.m16117a(lxmVar, null, null, lxv.m16126a(lxmVar.f39520j, null, null, lviVar2, null, 0.0d, 55), 1535));
                    }
                    arrayList3.add(new lzc(lzbVarM16222c, arrayList4));
                }
                return arrayList3;
            case 1:
                lviVar = lxcVar.f39504e;
                list = (List) lxcVar.f39501b;
                lxdVar = (lxd) lxcVar.f39500a;
                lkm.m15592s(obj);
                arrayList = new ArrayList();
                it = list.iterator();
                while (it.hasNext()) {
                    List list4 = ((lzc) it.next()).f39615b;
                    arrayList2 = new ArrayList(omn.m18678R(list4));
                    it2 = list4.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(omn.m18699d(((lxm) it2.next()).f39521k));
                    }
                    omn.m18677Q(arrayList, arrayList2);
                }
                lxcVar.f39500a = list;
                lxcVar.f39501b = lviVar;
                lxcVar.f39504e = null;
                lxcVar.f39503d = 2;
                if (lxdVar.mo16116c(arrayList, lviVar, lxcVar) != omaVar) {
                    return omaVar;
                }
                lviVar2 = lviVar;
                arrayList3 = new ArrayList(omn.m18678R(list));
                while (r13.hasNext()) {
                    lzb lzbVar2 = lzcVar.f39614a;
                    List<lxm> list5 = lzcVar.f39615b;
                    lzb lzbVarM16222c2 = lzb.m16222c(lzbVar2, null, null, lxv.m16126a(lzbVar2.f39610t, null, null, lviVar2, null, 0.0d, 55), 3145727);
                    arrayList4 = new ArrayList(omn.m18678R(list5));
                    while (r15.hasNext()) {
                        arrayList4.add(lxm.m16117a(lxmVar, null, null, lxv.m16126a(lxmVar.f39520j, null, null, lviVar2, null, 0.0d, 55), 1535));
                    }
                    arrayList3.add(new lzc(lzbVarM16222c2, arrayList4));
                }
                return arrayList3;
            case 2:
                lviVar2 = (lvi) lxcVar.f39501b;
                list = (List) lxcVar.f39500a;
                lkm.m15592s(obj);
                arrayList3 = new ArrayList(omn.m18678R(list));
                while (r13.hasNext()) {
                    lzb lzbVar3 = lzcVar.f39614a;
                    List<lxm> list6 = lzcVar.f39615b;
                    lzb lzbVarM16222c3 = lzb.m16222c(lzbVar3, null, null, lxv.m16126a(lzbVar3.f39610t, null, null, lviVar2, null, 0.0d, 55), 3145727);
                    arrayList4 = new ArrayList(omn.m18678R(list6));
                    while (r15.hasNext()) {
                        arrayList4.add(lxm.m16117a(lxmVar, null, null, lxv.m16126a(lxmVar.f39520j, null, null, lviVar2, null, 0.0d, 55), 1535));
                    }
                    arrayList3.add(new lzc(lzbVarM16222c3, arrayList4));
                }
                return arrayList3;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
