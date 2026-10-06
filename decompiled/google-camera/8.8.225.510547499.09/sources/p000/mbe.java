package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mbe {

    /* JADX INFO: renamed from: a */
    private final mav f39775a;

    /* JADX INFO: renamed from: b */
    private final lxs f39776b;

    /* JADX INFO: renamed from: c */
    private final mat f39777c;

    /* JADX INFO: renamed from: d */
    private final mbb f39778d;

    public mbe(mav mavVar, lxs lxsVar, mat matVar, mbb mbbVar) {
        mavVar.getClass();
        lxsVar.getClass();
        matVar.getClass();
        this.f39775a = mavVar;
        this.f39776b = lxsVar;
        this.f39777c = matVar;
        this.f39778d = mbbVar;
    }

    /* JADX WARN: Code duplicated, block: B:110:0x028a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:115:0x019c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:33:0x0110  */
    /* JADX WARN: Code duplicated, block: B:34:0x0113  */
    /* JADX WARN: Code duplicated, block: B:37:0x012c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:38:0x012d  */
    /* JADX WARN: Code duplicated, block: B:45:0x013c  */
    /* JADX WARN: Code duplicated, block: B:47:0x0155 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:49:0x0157  */
    /* JADX WARN: Code duplicated, block: B:57:0x016d  */
    /* JADX WARN: Code duplicated, block: B:62:0x018a  */
    /* JADX WARN: Code duplicated, block: B:64:0x019a  */
    /* JADX WARN: Code duplicated, block: B:68:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:69:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:74:0x01e6 A[Catch: all -> 0x025f, LOOP:3: B:72:0x01e0->B:74:0x01e6, LOOP_END, TryCatch #3 {all -> 0x025f, blocks: (B:71:0x01bc, B:72:0x01e0, B:74:0x01e6, B:75:0x01f6, B:78:0x0201), top: B:107:0x01bc }] */
    /* JADX WARN: Code duplicated, block: B:77:0x0200  */
    /* JADX WARN: Code duplicated, block: B:78:0x0201 A[Catch: all -> 0x025f, TRY_LEAVE, TryCatch #3 {all -> 0x025f, blocks: (B:71:0x01bc, B:72:0x01e0, B:74:0x01e6, B:75:0x01f6, B:78:0x0201), top: B:107:0x01bc }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:80:0x0205  */
    /* JADX WARN: Code duplicated, block: B:83:0x0224  */
    /* JADX WARN: Code duplicated, block: B:87:0x0238 A[LOOP:0: B:85:0x0232->B:87:0x0238, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:94:0x026b  */
    /* JADX WARN: Code duplicated, block: B:96:0x0288 A[RETURN] */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Object m16295a(mbe mbeVar, mau mauVar, List list, axr axrVar, ols olsVar) throws Throwable {
        mbd mbdVar;
        Set setM18718w;
        mbe mbeVar2;
        Object obj;
        axr axrVar2;
        maz mazVar;
        Iterator it;
        ArrayList arrayList;
        Iterator it2;
        List list2;
        List list3;
        mav mavVar;
        oer oerVar;
        oer oerVar2;
        List list4;
        mbd mbdVar2;
        mau mauVar2;
        oer oerVar3;
        ArrayList arrayList2;
        Iterator it3;
        Object objMo16124c;
        List list5;
        mbe mbeVar3;
        List<lzb> list6;
        Iterable iterable;
        List list7;
        List list8;
        mav mavVar2;
        oer oerVar4;
        List list9;
        mau mauVar3;
        oer oerVar5;
        lxs lxsVar;
        maz mazVar2;
        lvo lvoVarM16280a;
        lvo lvoVarM16280a2;
        mat matVar;
        mau mauVar4;
        ArrayList arrayList3;
        mbe mbeVar4 = mbeVar;
        mau mauVar5 = mauVar;
        if (olsVar instanceof mbd) {
            mbdVar = (mbd) olsVar;
            int i = mbdVar.f39772i;
            if ((i & Integer.MIN_VALUE) != 0) {
                mbdVar.f39772i = i - Integer.MIN_VALUE;
            } else {
                mbdVar = new mbd(mbeVar4, olsVar);
            }
        } else {
            mbdVar = new mbd(mbeVar4, olsVar);
        }
        Object obj2 = mbdVar.f39770g;
        oma omaVar = oma.COROUTINE_SUSPENDED;
        switch (mbdVar.f39772i) {
            case 0:
                lkm.m15592s(obj2);
                setM18718w = omn.m18718w(lwh.UPLOAD_NOT_REQUESTED);
                mbb mbbVar = mbeVar4.f39778d;
                mbdVar.f39764a = mbeVar4;
                mbdVar.f39765b = mauVar5;
                mbdVar.f39766c = axrVar;
                mbdVar.f39767d = mbeVar4;
                mbdVar.f39768e = setM18718w;
                mbdVar.f39772i = 1;
                Object objM16292a = mbbVar.m16292a(mauVar5, list, mbdVar);
                if (objM16292a == omaVar) {
                    return omaVar;
                }
                mbeVar2 = mbeVar4;
                obj = objM16292a;
                axrVar2 = axrVar;
                mazVar = (maz) obj;
                if (mazVar.f39748b != null) {
                    Object obj3 = mazVar.f39747a.get(lwh.UPLOAD_FAILED_PERMANENTLY);
                    obj3.getClass();
                    okb okbVarM15860e = lqi.m15860e((List) obj3);
                    list7 = (List) okbVarM15860e.f46186a;
                    list8 = (List) okbVarM15860e.f46187b;
                    mavVar2 = mbeVar4.f39775a;
                    if (list7.isEmpty()) {
                        oerVar4 = oer.ERROR_QUERY;
                    } else {
                        oerVar4 = oer.ERROR_UPDATE;
                    }
                    try {
                        lxsVar = mbeVar4.f39776b;
                        mbdVar.f39764a = mauVar5;
                        mbdVar.f39765b = mazVar;
                        mbdVar.f39766c = list7;
                        mbdVar.f39767d = list8;
                        mbdVar.f39768e = mavVar2;
                        mbdVar.f39769f = oerVar4;
                        mbdVar.f39772i = 2;
                        if (lxsVar.mo16123a(list7, list8, mbdVar) == omaVar) {
                            return omaVar;
                        }
                        mazVar2 = mazVar;
                        throw mazVar2.f39748b;
                    } catch (Throwable th) {
                        th = th;
                        list9 = list8;
                        oer oerVar6 = oerVar4;
                        mauVar3 = mauVar5;
                        oerVar5 = oerVar6;
                        if (!(th instanceof CancellationException)) {
                            throw th;
                        }
                        lvoVarM16280a = mauVar3.m16280a(list7, list9, oerVar5, th);
                        mbdVar.f39764a = th;
                        mbdVar.f39765b = null;
                        mbdVar.f39766c = null;
                        mbdVar.f39767d = null;
                        mbdVar.f39768e = null;
                        mbdVar.f39769f = null;
                        mbdVar.f39772i = 3;
                        if (mavVar2.m16285a(lvoVarM16280a, mbdVar) == omaVar) {
                            return omaVar;
                        }
                        throw th;
                    }
                }
                if ((setM18718w instanceof Collection) || !setM18718w.isEmpty()) {
                    it = setM18718w.iterator();
                    do {
                        if (!it.hasNext()) {
                        }
                    } while (!mazVar.f39747a.containsKey((lwh) it.next()));
                    arrayList = new ArrayList();
                    it2 = setM18718w.iterator();
                    while (it2.hasNext()) {
                        iterable = (List) mazVar.f39747a.get((lwh) it2.next());
                        if (iterable == null) {
                            iterable = okv.f46215a;
                        }
                        omn.m18677Q(arrayList, iterable);
                    }
                    okb okbVarM15860e2 = lqi.m15860e(arrayList);
                    list2 = (List) okbVarM15860e2.f46186a;
                    list3 = (List) okbVarM15860e2.f46187b;
                    mavVar = mbeVar2.f39775a;
                    if (list2.isEmpty()) {
                        oerVar = oer.ERROR_QUERY;
                    } else {
                        oerVar = oer.ERROR_UPDATE;
                    }
                    oerVar2 = oerVar;
                    try {
                        lxs lxsVar2 = mbeVar2.f39776b;
                        nzw nzwVar = mauVar5.f39740a;
                        mbdVar.f39764a = mbeVar2;
                        mbdVar.f39765b = mauVar5;
                        mbdVar.f39766c = axrVar2;
                        mbdVar.f39767d = list2;
                        mbdVar.f39768e = list3;
                        mbdVar.f39769f = mavVar;
                        mbdVar.f39773j = mbdVar;
                        mbdVar.f39774k = oerVar2;
                        mbdVar.f39772i = 4;
                        arrayList2 = new ArrayList(omn.m18678R(list2));
                        it3 = list2.iterator();
                        while (it3.hasNext()) {
                            arrayList2.add(omn.m18699d(((lzb) it3.next()).f39611u));
                        }
                        objMo16124c = lxsVar2.mo16124c(arrayList2, lwh.UPLOAD_PENDING, nzwVar, mbdVar);
                        if (objMo16124c == oma.COROUTINE_SUSPENDED) {
                            objMo16124c = oki.f46196a;
                            break;
                        }
                        if (objMo16124c != omaVar) {
                            mauVar2 = mauVar5;
                            list5 = list3;
                            mbeVar3 = mbeVar2;
                            list6 = list2;
                            matVar = mbeVar3.f39777c;
                            mbdVar.f39764a = mauVar2;
                            mbdVar.f39765b = list6;
                            mbdVar.f39766c = list5;
                            mbdVar.f39767d = null;
                            mbdVar.f39768e = null;
                            mbdVar.f39769f = null;
                            mbdVar.f39773j = null;
                            mbdVar.f39774k = null;
                            mbdVar.f39772i = 6;
                            if (matVar.mo16276b(mauVar2, axrVar2, mbdVar) != omaVar) {
                                mauVar4 = mauVar2;
                                arrayList3 = new ArrayList(omn.m18678R(list6));
                                for (lzb lzbVar : list6) {
                                    arrayList3.add(lzb.m16222c(lzbVar, null, null, lxv.m16126a(lzbVar.f39610t, mauVar4.f39740a, null, null, lwh.UPLOAD_PENDING, 0.0d, 45), 3145727));
                                }
                                return lkm.m15590q(arrayList3, list5);
                            }
                        }
                        return omaVar;
                    } catch (Throwable th2) {
                        th = th2;
                        list4 = list3;
                        mbdVar2 = mbdVar;
                        mauVar2 = mauVar5;
                        oerVar3 = oerVar2;
                        if (!(th instanceof CancellationException)) {
                            throw th;
                        }
                        lvoVarM16280a2 = mauVar2.m16280a(list2, list4, oerVar3, th);
                        mbdVar.f39764a = th;
                        mbdVar.f39765b = null;
                        mbdVar.f39766c = null;
                        mbdVar.f39767d = null;
                        mbdVar.f39768e = null;
                        mbdVar.f39769f = null;
                        mbdVar.f39773j = null;
                        mbdVar.f39774k = null;
                        mbdVar.f39772i = 5;
                        if (mavVar.m16285a(lvoVarM16280a2, mbdVar2) == omaVar) {
                            return omaVar;
                        }
                        throw th;
                    }
                }
                okv okvVar = okv.f46215a;
                return lkm.m15590q(okvVar, okvVar);
            case 1:
                Set set = (Set) mbdVar.f39768e;
                mbe mbeVar5 = (mbe) mbdVar.f39767d;
                axrVar2 = (axr) mbdVar.f39766c;
                mau mauVar6 = (mau) mbdVar.f39765b;
                mbeVar2 = (mbe) mbdVar.f39764a;
                lkm.m15592s(obj2);
                setM18718w = set;
                mbeVar4 = mbeVar5;
                mauVar5 = mauVar6;
                obj = obj2;
                mazVar = (maz) obj;
                if (mazVar.f39748b != null) {
                    Object obj4 = mazVar.f39747a.get(lwh.UPLOAD_FAILED_PERMANENTLY);
                    obj4.getClass();
                    okb okbVarM15860e3 = lqi.m15860e((List) obj4);
                    list7 = (List) okbVarM15860e3.f46186a;
                    list8 = (List) okbVarM15860e3.f46187b;
                    mavVar2 = mbeVar4.f39775a;
                    if (list7.isEmpty()) {
                        oerVar4 = oer.ERROR_QUERY;
                    } else {
                        oerVar4 = oer.ERROR_UPDATE;
                    }
                    lxsVar = mbeVar4.f39776b;
                    mbdVar.f39764a = mauVar5;
                    mbdVar.f39765b = mazVar;
                    mbdVar.f39766c = list7;
                    mbdVar.f39767d = list8;
                    mbdVar.f39768e = mavVar2;
                    mbdVar.f39769f = oerVar4;
                    mbdVar.f39772i = 2;
                    if (lxsVar.mo16123a(list7, list8, mbdVar) == omaVar) {
                        return omaVar;
                    }
                    mazVar2 = mazVar;
                    throw mazVar2.f39748b;
                }
                if (setM18718w instanceof Collection) {
                    break;
                }
                it = setM18718w.iterator();
                do {
                    if (!it.hasNext()) {
                        okv okvVar2 = okv.f46215a;
                        return lkm.m15590q(okvVar2, okvVar2);
                    }
                } while (!mazVar.f39747a.containsKey((lwh) it.next()));
                arrayList = new ArrayList();
                it2 = setM18718w.iterator();
                while (it2.hasNext()) {
                    iterable = (List) mazVar.f39747a.get((lwh) it2.next());
                    if (iterable == null) {
                        iterable = okv.f46215a;
                    }
                    omn.m18677Q(arrayList, iterable);
                }
                okb okbVarM15860e4 = lqi.m15860e(arrayList);
                list2 = (List) okbVarM15860e4.f46186a;
                list3 = (List) okbVarM15860e4.f46187b;
                mavVar = mbeVar2.f39775a;
                if (list2.isEmpty()) {
                    oerVar = oer.ERROR_QUERY;
                } else {
                    oerVar = oer.ERROR_UPDATE;
                }
                oerVar2 = oerVar;
                lxs lxsVar3 = mbeVar2.f39776b;
                nzw nzwVar2 = mauVar5.f39740a;
                mbdVar.f39764a = mbeVar2;
                mbdVar.f39765b = mauVar5;
                mbdVar.f39766c = axrVar2;
                mbdVar.f39767d = list2;
                mbdVar.f39768e = list3;
                mbdVar.f39769f = mavVar;
                mbdVar.f39773j = mbdVar;
                mbdVar.f39774k = oerVar2;
                mbdVar.f39772i = 4;
                arrayList2 = new ArrayList(omn.m18678R(list2));
                it3 = list2.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(omn.m18699d(((lzb) it3.next()).f39611u));
                }
                objMo16124c = lxsVar3.mo16124c(arrayList2, lwh.UPLOAD_PENDING, nzwVar2, mbdVar);
                if (objMo16124c == oma.COROUTINE_SUSPENDED) {
                    objMo16124c = oki.f46196a;
                    break;
                }
                if (objMo16124c != omaVar) {
                    mauVar2 = mauVar5;
                    list5 = list3;
                    mbeVar3 = mbeVar2;
                    list6 = list2;
                    matVar = mbeVar3.f39777c;
                    mbdVar.f39764a = mauVar2;
                    mbdVar.f39765b = list6;
                    mbdVar.f39766c = list5;
                    mbdVar.f39767d = null;
                    mbdVar.f39768e = null;
                    mbdVar.f39769f = null;
                    mbdVar.f39773j = null;
                    mbdVar.f39774k = null;
                    mbdVar.f39772i = 6;
                    if (matVar.mo16276b(mauVar2, axrVar2, mbdVar) != omaVar) {
                        mauVar4 = mauVar2;
                        arrayList3 = new ArrayList(omn.m18678R(list6));
                        while (r1.hasNext()) {
                            arrayList3.add(lzb.m16222c(lzbVar, null, null, lxv.m16126a(lzbVar.f39610t, mauVar4.f39740a, null, null, lwh.UPLOAD_PENDING, 0.0d, 45), 3145727));
                        }
                        return lkm.m15590q(arrayList3, list5);
                    }
                }
                return omaVar;
            case 2:
                oerVar5 = (oer) mbdVar.f39769f;
                mavVar2 = (mav) mbdVar.f39768e;
                list9 = (List) mbdVar.f39767d;
                list7 = (List) mbdVar.f39766c;
                mazVar2 = (maz) mbdVar.f39765b;
                mauVar3 = (mau) mbdVar.f39764a;
                try {
                    lkm.m15592s(obj2);
                    throw mazVar2.f39748b;
                } catch (Throwable th3) {
                    th = th3;
                    if (!(th instanceof CancellationException)) {
                        throw th;
                    }
                    lvoVarM16280a = mauVar3.m16280a(list7, list9, oerVar5, th);
                    mbdVar.f39764a = th;
                    mbdVar.f39765b = null;
                    mbdVar.f39766c = null;
                    mbdVar.f39767d = null;
                    mbdVar.f39768e = null;
                    mbdVar.f39769f = null;
                    mbdVar.f39772i = 3;
                    if (mavVar2.m16285a(lvoVarM16280a, mbdVar) == omaVar) {
                        return omaVar;
                    }
                    throw th;
                }
            case 3:
                Throwable th4 = (Throwable) mbdVar.f39764a;
                lkm.m15592s(obj2);
                throw th4;
            case 4:
                oerVar3 = mbdVar.f39774k;
                mbdVar2 = mbdVar.f39773j;
                mavVar = (mav) mbdVar.f39769f;
                list4 = (List) mbdVar.f39768e;
                list2 = (List) mbdVar.f39767d;
                axr axrVar3 = (axr) mbdVar.f39766c;
                mauVar2 = (mau) mbdVar.f39765b;
                mbeVar3 = (mbe) mbdVar.f39764a;
                try {
                    lkm.m15592s(obj2);
                    axrVar2 = axrVar3;
                    list5 = list4;
                    list6 = list2;
                    matVar = mbeVar3.f39777c;
                    mbdVar.f39764a = mauVar2;
                    mbdVar.f39765b = list6;
                    mbdVar.f39766c = list5;
                    mbdVar.f39767d = null;
                    mbdVar.f39768e = null;
                    mbdVar.f39769f = null;
                    mbdVar.f39773j = null;
                    mbdVar.f39774k = null;
                    mbdVar.f39772i = 6;
                    if (matVar.mo16276b(mauVar2, axrVar2, mbdVar) != omaVar) {
                        mauVar4 = mauVar2;
                        arrayList3 = new ArrayList(omn.m18678R(list6));
                        while (r1.hasNext()) {
                            arrayList3.add(lzb.m16222c(lzbVar, null, null, lxv.m16126a(lzbVar.f39610t, mauVar4.f39740a, null, null, lwh.UPLOAD_PENDING, 0.0d, 45), 3145727));
                        }
                        return lkm.m15590q(arrayList3, list5);
                    }
                    return omaVar;
                } catch (Throwable th5) {
                    th = th5;
                    if (!(th instanceof CancellationException)) {
                        throw th;
                    }
                    lvoVarM16280a2 = mauVar2.m16280a(list2, list4, oerVar3, th);
                    mbdVar.f39764a = th;
                    mbdVar.f39765b = null;
                    mbdVar.f39766c = null;
                    mbdVar.f39767d = null;
                    mbdVar.f39768e = null;
                    mbdVar.f39769f = null;
                    mbdVar.f39773j = null;
                    mbdVar.f39774k = null;
                    mbdVar.f39772i = 5;
                    if (mavVar.m16285a(lvoVarM16280a2, mbdVar2) == omaVar) {
                        return omaVar;
                    }
                    throw th;
                }
            case 5:
                Throwable th6 = (Throwable) mbdVar.f39764a;
                lkm.m15592s(obj2);
                throw th6;
            case 6:
                list5 = (List) mbdVar.f39766c;
                list6 = (List) mbdVar.f39765b;
                mauVar4 = (mau) mbdVar.f39764a;
                lkm.m15592s(obj2);
                arrayList3 = new ArrayList(omn.m18678R(list6));
                while (r1.hasNext()) {
                    arrayList3.add(lzb.m16222c(lzbVar, null, null, lxv.m16126a(lzbVar.f39610t, mauVar4.f39740a, null, null, lwh.UPLOAD_PENDING, 0.0d, 45), 3145727));
                }
                return lkm.m15590q(arrayList3, list5);
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
