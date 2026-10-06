package p000;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lwz {

    /* JADX INFO: renamed from: a */
    public final Object f39489a;

    /* JADX INFO: renamed from: b */
    public final Object f39490b;

    /* JADX INFO: renamed from: c */
    private final mav f39491c;

    /* JADX INFO: renamed from: d */
    private final Object f39492d;

    public lwz(mav mavVar, lxd lxdVar, File file, lwo lwoVar) {
        mavVar.getClass();
        lxdVar.getClass();
        file.getClass();
        lwoVar.getClass();
        this.f39491c = mavVar;
        this.f39489a = lxdVar;
        this.f39492d = file;
        this.f39490b = lwoVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m16106a(mau mauVar, lzc lzcVar, ols olsVar) throws Throwable {
        lwx lwxVar;
        if (olsVar instanceof lwx) {
            lwxVar = (lwx) olsVar;
            int i = lwxVar.f39478c;
            if ((i & Integer.MIN_VALUE) != 0) {
                lwxVar.f39478c = i - Integer.MIN_VALUE;
            } else {
                lwxVar = new lwx(this, olsVar);
            }
        } else {
            lwxVar = new lwx(this, olsVar);
        }
        Object objM16107b = lwxVar.f39476a;
        Object obj = oma.COROUTINE_SUSPENDED;
        switch (lwxVar.f39478c) {
            case 0:
                lkm.m15592s(objM16107b);
                List listM18666F = omn.m18666F(lzcVar);
                lwxVar.f39478c = 1;
                objM16107b = m16107b(mauVar, listM18666F, lwxVar);
                if (objM16107b == obj) {
                    return obj;
                }
                break;
            case 1:
                lkm.m15592s(objM16107b);
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return omn.m18671K((List) objM16107b);
    }

    /* JADX WARN: Code duplicated, block: B:103:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:105:0x02bf A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:125:0x0164 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:126:0x0160 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x010f  */
    /* JADX WARN: Code duplicated, block: B:45:0x0145  */
    /* JADX WARN: Code duplicated, block: B:57:0x017b  */
    /* JADX WARN: Code duplicated, block: B:60:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:64:0x01df A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:65:0x01e0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:70:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:72:0x0205 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:75:0x0208  */
    /* JADX WARN: Code duplicated, block: B:78:0x0214  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:83:0x0271 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:84:0x0272  */
    /* JADX WARN: Code duplicated, block: B:86:0x0274 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:91:0x027c  */
    /* JADX WARN: Code duplicated, block: B:93:0x0298 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:96:0x029b A[RETURN] */
    /* JADX WARN: Instruction removed from duplicated block: B:42:0x010f, please report this as an issue */
    /* JADX INFO: renamed from: b */
    public final Object m16107b(mau mauVar, List list, ols olsVar) throws Throwable {
        lwy lwyVar;
        mav mavVar;
        oer oerVar;
        List list2;
        List list3;
        mau mauVar2;
        lwz lwzVar;
        lvo lvoVarM16280a;
        ArrayList arrayList;
        ArrayList arrayList2;
        List list4;
        List list5;
        mau mauVar3;
        lwz lwzVar2;
        List list6;
        List list7;
        mav mavVar2;
        oer oerVar2;
        List list8;
        List list9;
        List list10;
        List list11;
        Object objMo16115a;
        Iterator itMo18817a;
        boolean z;
        lvo lvoVarM16280a2;
        mav mavVar3;
        lvo lvoVarM16279e;
        okb okbVarM15860e;
        mav mavVar4;
        oer oerVar3;
        List list12;
        List list13;
        List list14;
        List list15;
        Object obj;
        lvi lviVar;
        lvo lvoVarM16280a3;
        IOException iOException;
        mav mavVar5;
        lvo lvoVarM16280a4;
        if (olsVar instanceof lwy) {
            lwyVar = (lwy) olsVar;
            int i = lwyVar.f39485g;
            if ((i & Integer.MIN_VALUE) != 0) {
                lwyVar.f39485g = i - Integer.MIN_VALUE;
            } else {
                lwyVar = new lwy(this, olsVar);
            }
        } else {
            lwyVar = new lwy(this, olsVar);
        }
        Object objMo16115a2 = lwyVar.f39483e;
        oma omaVar = oma.COROUTINE_SUSPENDED;
        switch (lwyVar.f39485g) {
            case 0:
                lkm.m15592s(objMo16115a2);
                mavVar = this.f39491c;
                okb okbVarM15860e2 = lqi.m15860e(list);
                oerVar = oer.ERROR_UPDATE;
                list2 = (List) okbVarM15860e2.f46186a;
                list3 = (List) okbVarM15860e2.f46187b;
                try {
                    Object obj2 = this.f39489a;
                    lvi lviVar2 = lvi.FILES_DELETION_IN_PROGRESS;
                    lwyVar.f39479a = this;
                    mauVar2 = mauVar;
                    try {
                        lwyVar.f39486h = mauVar2;
                        lwyVar.f39480b = oerVar;
                        lwyVar.f39481c = mavVar;
                        lwyVar.f39482d = list2;
                        lwyVar.f39487i = list3;
                        lwyVar.f39485g = 1;
                        objMo16115a2 = ((lxd) obj2).mo16115a(list, lviVar2, lwyVar);
                        if (objMo16115a2 == omaVar) {
                            return omaVar;
                        }
                        lwzVar = this;
                        arrayList = new ArrayList();
                        arrayList2 = new ArrayList();
                        for (Object obj3 : (List) objMo16115a2) {
                            Object obj4 = lwzVar.f39490b;
                            itMo18817a = new ooz(omn.m18708m((File) lwzVar.f39492d, "resource_" + ((lzc) obj3).f39614a.f39611u), 1).mo18817a();
                            z = true;
                            while (itMo18817a.hasNext()) {
                                File file = (File) itMo18817a.next();
                                z = !(file.delete() && file.exists()) && z;
                            }
                            if (z) {
                                arrayList.add(obj3);
                            } else {
                                arrayList2.add(obj3);
                            }
                        }
                        okb okbVar = new okb(arrayList, arrayList2);
                        list4 = (List) okbVar.f46186a;
                        list5 = (List) okbVar.f46187b;
                        if (list4.isEmpty()) {
                            mauVar3 = mauVar2;
                            lwzVar2 = lwzVar;
                            list6 = okv.f46215a;
                            list7 = list5;
                        } else {
                            mavVar2 = lwzVar.f39491c;
                            okb okbVarM15860e3 = lqi.m15860e(list4);
                            oerVar2 = oer.ERROR_UPDATE;
                            list8 = (List) okbVarM15860e3.f46186a;
                            list9 = (List) okbVarM15860e3.f46187b;
                            try {
                                Object obj5 = lwzVar.f39489a;
                                lvi lviVar3 = lvi.FILES_DELETED_FROM_AIRLOCK;
                                lwyVar.f39479a = lwzVar;
                                lwyVar.f39486h = mauVar2;
                                lwyVar.f39480b = list5;
                                lwyVar.f39481c = oerVar2;
                                lwyVar.f39482d = mavVar2;
                                lwyVar.f39487i = list8;
                                lwyVar.f39488j = list9;
                                lwyVar.f39485g = 3;
                                objMo16115a = ((lxd) obj5).mo16115a(list4, lviVar3, lwyVar);
                                if (objMo16115a != omaVar) {
                                    return omaVar;
                                }
                                mauVar3 = mauVar2;
                                lwzVar2 = lwzVar;
                                list7 = list5;
                                objMo16115a2 = objMo16115a;
                                list6 = (List) objMo16115a2;
                                okb okbVarM15860e4 = lqi.m15860e(list6);
                                List list16 = (List) okbVarM15860e4.f46186a;
                                List list17 = (List) okbVarM15860e4.f46187b;
                                mavVar3 = lwzVar2.f39491c;
                                lvoVarM16279e = mau.m16279e(mauVar3, list16, list17, oer.SUCCESS_PARTIAL_AIRLOCK_FILES_DELETED, 8);
                                lwyVar.f39479a = lwzVar2;
                                lwyVar.f39486h = mauVar3;
                                lwyVar.f39480b = list7;
                                lwyVar.f39481c = list6;
                                lwyVar.f39482d = null;
                                lwyVar.f39487i = null;
                                lwyVar.f39488j = null;
                                lwyVar.f39485g = 5;
                                if (mavVar3.m16285a(lvoVarM16279e, lwyVar) == omaVar) {
                                    return omaVar;
                                }
                            } catch (Throwable th) {
                                th = th;
                                list10 = list9;
                                list11 = list8;
                                mauVar3 = mauVar2;
                                if (!(th instanceof CancellationException)) {
                                    lvoVarM16280a2 = mauVar3.m16280a(list11, list10, oerVar2, th);
                                    lwyVar.f39479a = th;
                                    lwyVar.f39486h = null;
                                    lwyVar.f39480b = null;
                                    lwyVar.f39481c = null;
                                    lwyVar.f39482d = null;
                                    lwyVar.f39487i = null;
                                    lwyVar.f39488j = null;
                                    lwyVar.f39485g = 4;
                                    if (mavVar2.m16285a(lvoVarM16280a2, lwyVar) == omaVar) {
                                        return omaVar;
                                    }
                                }
                                throw th;
                            }
                        }
                        if (!list7.isEmpty()) {
                            return list6;
                        }
                        okbVarM15860e = lqi.m15860e(list7);
                        mavVar4 = lwzVar2.f39491c;
                        oerVar3 = oer.ERROR_UPDATE;
                        list12 = (List) okbVarM15860e.f46186a;
                        list13 = (List) okbVarM15860e.f46187b;
                        try {
                            obj = lwzVar2.f39489a;
                            lviVar = lvi.FAILED_TO_DELETE_FROM_AIRLOCK;
                            lwyVar.f39479a = lwzVar2;
                            lwyVar.f39486h = mauVar3;
                            lwyVar.f39480b = okbVarM15860e;
                            lwyVar.f39481c = oerVar3;
                            lwyVar.f39482d = mavVar4;
                            lwyVar.f39487i = list12;
                            lwyVar.f39488j = list13;
                            lwyVar.f39485g = 6;
                            if (((lxd) obj).mo16115a(list7, lviVar, lwyVar) == omaVar) {
                                return omaVar;
                            }
                            List list18 = (List) okbVarM15860e.f46186a;
                            List list19 = (List) okbVarM15860e.f46187b;
                            iOException = new IOException("File deletion failed");
                            mavVar5 = lwzVar2.f39491c;
                            lvoVarM16280a4 = mauVar3.m16280a(list18, list19, oer.ERROR_DELETE_ON_DEVICE, iOException);
                            lwyVar.f39479a = iOException;
                            lwyVar.f39486h = null;
                            lwyVar.f39480b = null;
                            lwyVar.f39481c = null;
                            lwyVar.f39482d = null;
                            lwyVar.f39487i = null;
                            lwyVar.f39488j = null;
                            lwyVar.f39485g = 8;
                            if (mavVar5.m16285a(lvoVarM16280a4, lwyVar) == omaVar) {
                                return omaVar;
                            }
                            throw iOException;
                        } catch (Throwable th2) {
                            th = th2;
                            list14 = list12;
                            list15 = list13;
                            if (!(th instanceof CancellationException)) {
                                lvoVarM16280a3 = mauVar3.m16280a(list14, list15, oerVar3, th);
                                lwyVar.f39479a = th;
                                lwyVar.f39486h = null;
                                lwyVar.f39480b = null;
                                lwyVar.f39481c = null;
                                lwyVar.f39482d = null;
                                lwyVar.f39487i = null;
                                lwyVar.f39488j = null;
                                lwyVar.f39485g = 7;
                                if (mavVar4.m16285a(lvoVarM16280a3, lwyVar) == omaVar) {
                                    return omaVar;
                                }
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        if (!(th instanceof CancellationException)) {
                            lvoVarM16280a = mauVar2.m16280a(list2, list3, oerVar, th);
                            lwyVar.f39479a = th;
                            lwyVar.f39486h = null;
                            lwyVar.f39480b = null;
                            lwyVar.f39481c = null;
                            lwyVar.f39482d = null;
                            lwyVar.f39487i = null;
                            lwyVar.f39485g = 2;
                            if (mavVar.m16285a(lvoVarM16280a, lwyVar) == omaVar) {
                                return omaVar;
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    mauVar2 = mauVar;
                }
                break;
            case 1:
                list3 = lwyVar.f39487i;
                list2 = (List) lwyVar.f39482d;
                mavVar = (mav) lwyVar.f39481c;
                oerVar = (oer) lwyVar.f39480b;
                mau mauVar4 = lwyVar.f39486h;
                lwz lwzVar3 = (lwz) lwyVar.f39479a;
                try {
                    lkm.m15592s(objMo16115a2);
                    lwzVar = lwzVar3;
                    mauVar2 = mauVar4;
                    arrayList = new ArrayList();
                    arrayList2 = new ArrayList();
                    while (r0.hasNext()) {
                        Object obj6 = lwzVar.f39490b;
                        itMo18817a = new ooz(omn.m18708m((File) lwzVar.f39492d, "resource_" + ((lzc) obj3).f39614a.f39611u), 1).mo18817a();
                        z = true;
                        while (itMo18817a.hasNext()) {
                            File file2 = (File) itMo18817a.next();
                            if (file2.delete()) {
                            }
                        }
                        if (z) {
                            arrayList.add(obj3);
                        } else {
                            arrayList2.add(obj3);
                        }
                    }
                    okb okbVar2 = new okb(arrayList, arrayList2);
                    list4 = (List) okbVar2.f46186a;
                    list5 = (List) okbVar2.f46187b;
                    if (list4.isEmpty()) {
                        mavVar2 = lwzVar.f39491c;
                        okb okbVarM15860e5 = lqi.m15860e(list4);
                        oerVar2 = oer.ERROR_UPDATE;
                        list8 = (List) okbVarM15860e5.f46186a;
                        list9 = (List) okbVarM15860e5.f46187b;
                        Object obj7 = lwzVar.f39489a;
                        lvi lviVar4 = lvi.FILES_DELETED_FROM_AIRLOCK;
                        lwyVar.f39479a = lwzVar;
                        lwyVar.f39486h = mauVar2;
                        lwyVar.f39480b = list5;
                        lwyVar.f39481c = oerVar2;
                        lwyVar.f39482d = mavVar2;
                        lwyVar.f39487i = list8;
                        lwyVar.f39488j = list9;
                        lwyVar.f39485g = 3;
                        objMo16115a = ((lxd) obj7).mo16115a(list4, lviVar4, lwyVar);
                        if (objMo16115a != omaVar) {
                            return omaVar;
                        }
                        mauVar3 = mauVar2;
                        lwzVar2 = lwzVar;
                        list7 = list5;
                        objMo16115a2 = objMo16115a;
                        list6 = (List) objMo16115a2;
                        okb okbVarM15860e6 = lqi.m15860e(list6);
                        List list110 = (List) okbVarM15860e6.f46186a;
                        List list111 = (List) okbVarM15860e6.f46187b;
                        mavVar3 = lwzVar2.f39491c;
                        lvoVarM16279e = mau.m16279e(mauVar3, list110, list111, oer.SUCCESS_PARTIAL_AIRLOCK_FILES_DELETED, 8);
                        lwyVar.f39479a = lwzVar2;
                        lwyVar.f39486h = mauVar3;
                        lwyVar.f39480b = list7;
                        lwyVar.f39481c = list6;
                        lwyVar.f39482d = null;
                        lwyVar.f39487i = null;
                        lwyVar.f39488j = null;
                        lwyVar.f39485g = 5;
                        if (mavVar3.m16285a(lvoVarM16279e, lwyVar) == omaVar) {
                            return omaVar;
                        }
                    } else {
                        mauVar3 = mauVar2;
                        lwzVar2 = lwzVar;
                        list6 = okv.f46215a;
                        list7 = list5;
                    }
                    if (!list7.isEmpty()) {
                        return list6;
                    }
                    okbVarM15860e = lqi.m15860e(list7);
                    mavVar4 = lwzVar2.f39491c;
                    oerVar3 = oer.ERROR_UPDATE;
                    list12 = (List) okbVarM15860e.f46186a;
                    list13 = (List) okbVarM15860e.f46187b;
                    obj = lwzVar2.f39489a;
                    lviVar = lvi.FAILED_TO_DELETE_FROM_AIRLOCK;
                    lwyVar.f39479a = lwzVar2;
                    lwyVar.f39486h = mauVar3;
                    lwyVar.f39480b = okbVarM15860e;
                    lwyVar.f39481c = oerVar3;
                    lwyVar.f39482d = mavVar4;
                    lwyVar.f39487i = list12;
                    lwyVar.f39488j = list13;
                    lwyVar.f39485g = 6;
                    if (((lxd) obj).mo16115a(list7, lviVar, lwyVar) == omaVar) {
                        return omaVar;
                    }
                    List list112 = (List) okbVarM15860e.f46186a;
                    List list113 = (List) okbVarM15860e.f46187b;
                    iOException = new IOException("File deletion failed");
                    mavVar5 = lwzVar2.f39491c;
                    lvoVarM16280a4 = mauVar3.m16280a(list112, list113, oer.ERROR_DELETE_ON_DEVICE, iOException);
                    lwyVar.f39479a = iOException;
                    lwyVar.f39486h = null;
                    lwyVar.f39480b = null;
                    lwyVar.f39481c = null;
                    lwyVar.f39482d = null;
                    lwyVar.f39487i = null;
                    lwyVar.f39488j = null;
                    lwyVar.f39485g = 8;
                    if (mavVar5.m16285a(lvoVarM16280a4, lwyVar) == omaVar) {
                        return omaVar;
                    }
                    throw iOException;
                } catch (Throwable th5) {
                    th = th5;
                    mauVar2 = mauVar4;
                    if (!(th instanceof CancellationException)) {
                        lvoVarM16280a = mauVar2.m16280a(list2, list3, oerVar, th);
                        lwyVar.f39479a = th;
                        lwyVar.f39486h = null;
                        lwyVar.f39480b = null;
                        lwyVar.f39481c = null;
                        lwyVar.f39482d = null;
                        lwyVar.f39487i = null;
                        lwyVar.f39485g = 2;
                        if (mavVar.m16285a(lvoVarM16280a, lwyVar) == omaVar) {
                            return omaVar;
                        }
                    }
                    throw th;
                }
            case 2:
                Throwable th6 = (Throwable) lwyVar.f39479a;
                lkm.m15592s(objMo16115a2);
                throw th6;
            case 3:
                list10 = lwyVar.f39488j;
                list11 = lwyVar.f39487i;
                mavVar2 = (mav) lwyVar.f39482d;
                oerVar2 = (oer) lwyVar.f39481c;
                List list20 = (List) lwyVar.f39480b;
                mauVar3 = lwyVar.f39486h;
                lwzVar2 = (lwz) lwyVar.f39479a;
                try {
                    lkm.m15592s(objMo16115a2);
                    list7 = list20;
                    list6 = (List) objMo16115a2;
                    okb okbVarM15860e7 = lqi.m15860e(list6);
                    List list114 = (List) okbVarM15860e7.f46186a;
                    List list115 = (List) okbVarM15860e7.f46187b;
                    mavVar3 = lwzVar2.f39491c;
                    lvoVarM16279e = mau.m16279e(mauVar3, list114, list115, oer.SUCCESS_PARTIAL_AIRLOCK_FILES_DELETED, 8);
                    lwyVar.f39479a = lwzVar2;
                    lwyVar.f39486h = mauVar3;
                    lwyVar.f39480b = list7;
                    lwyVar.f39481c = list6;
                    lwyVar.f39482d = null;
                    lwyVar.f39487i = null;
                    lwyVar.f39488j = null;
                    lwyVar.f39485g = 5;
                    if (mavVar3.m16285a(lvoVarM16279e, lwyVar) == omaVar) {
                        return omaVar;
                    }
                    if (!list7.isEmpty()) {
                        return list6;
                    }
                    okbVarM15860e = lqi.m15860e(list7);
                    mavVar4 = lwzVar2.f39491c;
                    oerVar3 = oer.ERROR_UPDATE;
                    list12 = (List) okbVarM15860e.f46186a;
                    list13 = (List) okbVarM15860e.f46187b;
                    obj = lwzVar2.f39489a;
                    lviVar = lvi.FAILED_TO_DELETE_FROM_AIRLOCK;
                    lwyVar.f39479a = lwzVar2;
                    lwyVar.f39486h = mauVar3;
                    lwyVar.f39480b = okbVarM15860e;
                    lwyVar.f39481c = oerVar3;
                    lwyVar.f39482d = mavVar4;
                    lwyVar.f39487i = list12;
                    lwyVar.f39488j = list13;
                    lwyVar.f39485g = 6;
                    if (((lxd) obj).mo16115a(list7, lviVar, lwyVar) == omaVar) {
                        return omaVar;
                    }
                    List list116 = (List) okbVarM15860e.f46186a;
                    List list117 = (List) okbVarM15860e.f46187b;
                    iOException = new IOException("File deletion failed");
                    mavVar5 = lwzVar2.f39491c;
                    lvoVarM16280a4 = mauVar3.m16280a(list116, list117, oer.ERROR_DELETE_ON_DEVICE, iOException);
                    lwyVar.f39479a = iOException;
                    lwyVar.f39486h = null;
                    lwyVar.f39480b = null;
                    lwyVar.f39481c = null;
                    lwyVar.f39482d = null;
                    lwyVar.f39487i = null;
                    lwyVar.f39488j = null;
                    lwyVar.f39485g = 8;
                    if (mavVar5.m16285a(lvoVarM16280a4, lwyVar) == omaVar) {
                        return omaVar;
                    }
                    throw iOException;
                } catch (Throwable th7) {
                    th = th7;
                    if (!(th instanceof CancellationException)) {
                        lvoVarM16280a2 = mauVar3.m16280a(list11, list10, oerVar2, th);
                        lwyVar.f39479a = th;
                        lwyVar.f39486h = null;
                        lwyVar.f39480b = null;
                        lwyVar.f39481c = null;
                        lwyVar.f39482d = null;
                        lwyVar.f39487i = null;
                        lwyVar.f39488j = null;
                        lwyVar.f39485g = 4;
                        if (mavVar2.m16285a(lvoVarM16280a2, lwyVar) == omaVar) {
                            return omaVar;
                        }
                    }
                    throw th;
                }
            case 4:
                Throwable th8 = (Throwable) lwyVar.f39479a;
                lkm.m15592s(objMo16115a2);
                throw th8;
            case 5:
                list6 = (List) lwyVar.f39481c;
                list7 = (List) lwyVar.f39480b;
                mau mauVar5 = lwyVar.f39486h;
                lwz lwzVar4 = (lwz) lwyVar.f39479a;
                lkm.m15592s(objMo16115a2);
                mauVar3 = mauVar5;
                lwzVar2 = lwzVar4;
                if (!list7.isEmpty()) {
                    return list6;
                }
                okbVarM15860e = lqi.m15860e(list7);
                mavVar4 = lwzVar2.f39491c;
                oerVar3 = oer.ERROR_UPDATE;
                list12 = (List) okbVarM15860e.f46186a;
                list13 = (List) okbVarM15860e.f46187b;
                obj = lwzVar2.f39489a;
                lviVar = lvi.FAILED_TO_DELETE_FROM_AIRLOCK;
                lwyVar.f39479a = lwzVar2;
                lwyVar.f39486h = mauVar3;
                lwyVar.f39480b = okbVarM15860e;
                lwyVar.f39481c = oerVar3;
                lwyVar.f39482d = mavVar4;
                lwyVar.f39487i = list12;
                lwyVar.f39488j = list13;
                lwyVar.f39485g = 6;
                if (((lxd) obj).mo16115a(list7, lviVar, lwyVar) == omaVar) {
                    return omaVar;
                }
                List list118 = (List) okbVarM15860e.f46186a;
                List list119 = (List) okbVarM15860e.f46187b;
                iOException = new IOException("File deletion failed");
                mavVar5 = lwzVar2.f39491c;
                lvoVarM16280a4 = mauVar3.m16280a(list118, list119, oer.ERROR_DELETE_ON_DEVICE, iOException);
                lwyVar.f39479a = iOException;
                lwyVar.f39486h = null;
                lwyVar.f39480b = null;
                lwyVar.f39481c = null;
                lwyVar.f39482d = null;
                lwyVar.f39487i = null;
                lwyVar.f39488j = null;
                lwyVar.f39485g = 8;
                if (mavVar5.m16285a(lvoVarM16280a4, lwyVar) == omaVar) {
                    return omaVar;
                }
                throw iOException;
            case 6:
                list15 = lwyVar.f39488j;
                list14 = lwyVar.f39487i;
                mavVar4 = (mav) lwyVar.f39482d;
                oerVar3 = (oer) lwyVar.f39481c;
                okbVarM15860e = (okb) lwyVar.f39480b;
                mauVar3 = lwyVar.f39486h;
                lwzVar2 = (lwz) lwyVar.f39479a;
                try {
                    lkm.m15592s(objMo16115a2);
                    List list1110 = (List) okbVarM15860e.f46186a;
                    List list1111 = (List) okbVarM15860e.f46187b;
                    iOException = new IOException("File deletion failed");
                    mavVar5 = lwzVar2.f39491c;
                    lvoVarM16280a4 = mauVar3.m16280a(list1110, list1111, oer.ERROR_DELETE_ON_DEVICE, iOException);
                    lwyVar.f39479a = iOException;
                    lwyVar.f39486h = null;
                    lwyVar.f39480b = null;
                    lwyVar.f39481c = null;
                    lwyVar.f39482d = null;
                    lwyVar.f39487i = null;
                    lwyVar.f39488j = null;
                    lwyVar.f39485g = 8;
                    if (mavVar5.m16285a(lvoVarM16280a4, lwyVar) == omaVar) {
                        return omaVar;
                    }
                    throw iOException;
                } catch (Throwable th9) {
                    th = th9;
                    if (!(th instanceof CancellationException)) {
                        lvoVarM16280a3 = mauVar3.m16280a(list14, list15, oerVar3, th);
                        lwyVar.f39479a = th;
                        lwyVar.f39486h = null;
                        lwyVar.f39480b = null;
                        lwyVar.f39481c = null;
                        lwyVar.f39482d = null;
                        lwyVar.f39487i = null;
                        lwyVar.f39488j = null;
                        lwyVar.f39485g = 7;
                        if (mavVar4.m16285a(lvoVarM16280a3, lwyVar) == omaVar) {
                            return omaVar;
                        }
                    }
                    throw th;
                }
            case 7:
                Throwable th10 = (Throwable) lwyVar.f39479a;
                lkm.m15592s(objMo16115a2);
                throw th10;
            case 8:
                IOException iOException2 = (IOException) lwyVar.f39479a;
                lkm.m15592s(objMo16115a2);
                throw iOException2;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX INFO: renamed from: c */
    public final Object m16108c(mea meaVar, String str, ols olsVar) throws Throwable {
        mdj mdjVar;
        lwz lwzVar;
        mea meaVarM16334a;
        mav mavVar;
        oer oerVar;
        if (olsVar instanceof mdj) {
            mdjVar = (mdj) olsVar;
            int i = mdjVar.f40090c;
            if ((i & Integer.MIN_VALUE) != 0) {
                mdjVar.f40090c = i - Integer.MIN_VALUE;
            } else {
                mdjVar = new mdj(this, olsVar, null);
            }
        } else {
            mdjVar = new mdj(this, olsVar, null);
        }
        Object objM16228f = mdjVar.f40089b;
        oma omaVar = oma.COROUTINE_SUSPENDED;
        switch (mdjVar.f40090c) {
            case 0:
                lkm.m15592s(objM16228f);
                mav mavVar2 = this.f39491c;
                mdk mdkVar = new mdk(this, meaVar, str, null, null);
                mdjVar.f40088a = this;
                mdjVar.f40091d = meaVar;
                mdjVar.f40090c = 1;
                objM16228f = lzd.m16228f(mavVar2, meaVar, mdkVar, mdjVar);
                if (objM16228f != omaVar) {
                    lwzVar = this;
                    meaVarM16334a = mea.m16334a(meaVar, (lzb) objM16228f);
                    mavVar = lwzVar.f39491c;
                    oerVar = oer.SUCCESS_PARTIAL_UPLOAD_RESOURCE;
                    mdjVar.f40088a = meaVarM16334a;
                    mdjVar.f40091d = null;
                    mdjVar.f40090c = 2;
                    if (lzd.m16227e(mavVar, meaVarM16334a, oerVar, null, mdjVar) != omaVar) {
                        return meaVarM16334a;
                    }
                }
                return omaVar;
            case 1:
                meaVar = mdjVar.f40091d;
                lwzVar = (lwz) mdjVar.f40088a;
                lkm.m15592s(objM16228f);
                meaVarM16334a = mea.m16334a(meaVar, (lzb) objM16228f);
                mavVar = lwzVar.f39491c;
                oerVar = oer.SUCCESS_PARTIAL_UPLOAD_RESOURCE;
                mdjVar.f40088a = meaVarM16334a;
                mdjVar.f40091d = null;
                mdjVar.f40090c = 2;
                if (lzd.m16227e(mavVar, meaVarM16334a, oerVar, null, mdjVar) != omaVar) {
                    return meaVarM16334a;
                }
                return omaVar;
            case 2:
                mea meaVar2 = (mea) mdjVar.f40088a;
                lkm.m15592s(objM16228f);
                return meaVar2;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX INFO: renamed from: d */
    public final Object m16109d(mea meaVar, ols olsVar) {
        mdl mdlVar;
        IllegalStateException illegalStateException;
        lwz lwzVar;
        if (olsVar instanceof mdl) {
            mdlVar = (mdl) olsVar;
            int i = mdlVar.f40099c;
            if ((i & Integer.MIN_VALUE) != 0) {
                mdlVar.f40099c = i - Integer.MIN_VALUE;
            } else {
                mdlVar = new mdl(this, olsVar, null);
            }
        } else {
            mdlVar = new mdl(this, olsVar, null);
        }
        Object obj = mdlVar.f40098b;
        oma omaVar = oma.COROUTINE_SUSPENDED;
        switch (mdlVar.f40099c) {
            case 0:
                lkm.m15592s(obj);
                illegalStateException = new IllegalStateException("UploadAttachmentComplete for resource");
                mav mavVar = this.f39491c;
                oer oerVar = oer.ERROR_UPLOAD_SERVER_FAILURE;
                mdlVar.f40097a = this;
                mdlVar.f40100d = meaVar;
                mdlVar.f40101e = illegalStateException;
                mdlVar.f40099c = 1;
                if (lzd.m16227e(mavVar, meaVar, oerVar, illegalStateException, mdlVar) == omaVar) {
                    return omaVar;
                }
                lwzVar = this;
                break;
                break;
            case 1:
                IllegalStateException illegalStateException2 = mdlVar.f40101e;
                mea meaVar2 = mdlVar.f40100d;
                lwzVar = (lwz) mdlVar.f40097a;
                lkm.m15592s(obj);
                illegalStateException = illegalStateException2;
                meaVar = meaVar2;
                break;
            case 2:
                IllegalStateException illegalStateException3 = (IllegalStateException) mdlVar.f40097a;
                lkm.m15592s(obj);
                throw illegalStateException3;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        mav mavVar2 = lwzVar.f39491c;
        mdm mdmVar = new mdm(lwzVar, meaVar, null, null);
        mdlVar.f40097a = illegalStateException;
        mdlVar.f40100d = null;
        mdlVar.f40101e = null;
        mdlVar.f40099c = 2;
        if (lzd.m16228f(mavVar2, meaVar, mdmVar, mdlVar) == omaVar) {
            return omaVar;
        }
        throw illegalStateException;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0075  */
    /* JADX WARN: Code duplicated, block: B:23:0x008f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x0090  */
    /* JADX WARN: Code duplicated, block: B:26:0x00ae A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:27:0x00af  */
    /* JADX WARN: Code duplicated, block: B:29:0x00c9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX INFO: renamed from: e */
    public final Object m16110e(mea meaVar, mdz mdzVar, mec mecVar, ols olsVar) throws Throwable {
        mdn mdnVar;
        Throwable th;
        lwz lwzVar;
        mdz mdzVar2;
        oer oerVar;
        mav mavVar;
        mdp mdpVar;
        mav mavVar2;
        mdo mdoVar;
        mav mavVar3;
        mdq mdqVar;
        Object obj;
        if (olsVar instanceof mdn) {
            mdnVar = (mdn) olsVar;
            int i = mdnVar.f40108c;
            if ((i & Integer.MIN_VALUE) != 0) {
                mdnVar.f40108c = i - Integer.MIN_VALUE;
            } else {
                mdnVar = new mdn(this, olsVar, null);
            }
        } else {
            mdnVar = new mdn(this, olsVar, null);
        }
        Object obj2 = mdnVar.f40107b;
        oma omaVar = oma.COROUTINE_SUSPENDED;
        switch (mdnVar.f40108c) {
            case 0:
                lkm.m15592s(obj2);
                oer oerVar2 = mecVar.f40165a;
                th = mecVar.f40166b;
                mav mavVar4 = this.f39491c;
                mdnVar.f40106a = this;
                mdnVar.f40109d = meaVar;
                mdnVar.f40110e = mdzVar;
                mdnVar.f40111f = oerVar2;
                mdnVar.f40112g = (oeq) th;
                mdnVar.f40108c = 1;
                if (lzd.m16227e(mavVar4, meaVar, oerVar2, th, mdnVar) == omaVar) {
                    return omaVar;
                }
                lwzVar = this;
                mdzVar2 = mdzVar;
                oerVar = oerVar2;
                oer oerVar3 = oer.UNKNOWN_F250_LOG_REASON;
                switch (oerVar.ordinal()) {
                    case 24:
                        mavVar = lwzVar.f39491c;
                        mdpVar = new mdp(lwzVar, meaVar, null, null);
                        mdnVar.f40106a = th;
                        mdnVar.f40109d = null;
                        mdnVar.f40110e = null;
                        mdnVar.f40111f = null;
                        mdnVar.f40112g = null;
                        mdnVar.f40108c = 3;
                        if (lzd.m16228f(mavVar, meaVar, mdpVar, mdnVar) == omaVar) {
                            return omaVar;
                        }
                        break;
                    case 25:
                    case 26:
                        mavVar2 = lwzVar.f39491c;
                        mdoVar = new mdo(lwzVar, meaVar, mdzVar2, null, null);
                        mdnVar.f40106a = th;
                        mdnVar.f40109d = null;
                        mdnVar.f40110e = null;
                        mdnVar.f40111f = null;
                        mdnVar.f40112g = null;
                        mdnVar.f40108c = 2;
                        if (lzd.m16228f(mavVar2, meaVar, mdoVar, mdnVar) == omaVar) {
                            return omaVar;
                        }
                        break;
                    default:
                        mavVar3 = lwzVar.f39491c;
                        mdqVar = new mdq(lwzVar, meaVar, null, null);
                        mdnVar.f40106a = th;
                        mdnVar.f40109d = null;
                        mdnVar.f40110e = null;
                        mdnVar.f40111f = null;
                        mdnVar.f40112g = null;
                        mdnVar.f40108c = 4;
                        if (lzd.m16228f(mavVar3, meaVar, mdqVar, mdnVar) == omaVar) {
                            return omaVar;
                        }
                        break;
                }
                throw th;
            case 1:
                oeq oeqVar = mdnVar.f40112g;
                oerVar = mdnVar.f40111f;
                mdz mdzVar3 = mdnVar.f40110e;
                mea meaVar2 = mdnVar.f40109d;
                lwz lwzVar2 = (lwz) mdnVar.f40106a;
                lkm.m15592s(obj2);
                mdzVar2 = mdzVar3;
                lwzVar = lwzVar2;
                th = oeqVar;
                meaVar = meaVar2;
                oer oerVar4 = oer.UNKNOWN_F250_LOG_REASON;
                switch (oerVar.ordinal()) {
                    case 24:
                        mavVar = lwzVar.f39491c;
                        mdpVar = new mdp(lwzVar, meaVar, null, null);
                        mdnVar.f40106a = th;
                        mdnVar.f40109d = null;
                        mdnVar.f40110e = null;
                        mdnVar.f40111f = null;
                        mdnVar.f40112g = null;
                        mdnVar.f40108c = 3;
                        if (lzd.m16228f(mavVar, meaVar, mdpVar, mdnVar) == omaVar) {
                            return omaVar;
                        }
                        break;
                    case 25:
                    case 26:
                        mavVar2 = lwzVar.f39491c;
                        mdoVar = new mdo(lwzVar, meaVar, mdzVar2, null, null);
                        mdnVar.f40106a = th;
                        mdnVar.f40109d = null;
                        mdnVar.f40110e = null;
                        mdnVar.f40111f = null;
                        mdnVar.f40112g = null;
                        mdnVar.f40108c = 2;
                        if (lzd.m16228f(mavVar2, meaVar, mdoVar, mdnVar) == omaVar) {
                            return omaVar;
                        }
                        break;
                    default:
                        mavVar3 = lwzVar.f39491c;
                        mdqVar = new mdq(lwzVar, meaVar, null, null);
                        mdnVar.f40106a = th;
                        mdnVar.f40109d = null;
                        mdnVar.f40110e = null;
                        mdnVar.f40111f = null;
                        mdnVar.f40112g = null;
                        mdnVar.f40108c = 4;
                        if (lzd.m16228f(mavVar3, meaVar, mdqVar, mdnVar) == omaVar) {
                            return omaVar;
                        }
                        break;
                }
                throw th;
            case 2:
            case 4:
                obj = mdnVar.f40106a;
                Throwable th2 = (Throwable) obj;
                lkm.m15592s(obj2);
                throw th2;
            case 3:
                obj = mdnVar.f40106a;
                Throwable th3 = (Throwable) obj;
                lkm.m15592s(obj2);
                throw th3;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: f */
    public final Object m16111f(mea meaVar, String str, ols olsVar) throws Throwable {
        mdr mdrVar;
        if (olsVar instanceof mdr) {
            mdrVar = (mdr) olsVar;
            int i = mdrVar.f40125b;
            if ((i & Integer.MIN_VALUE) != 0) {
                mdrVar.f40125b = i - Integer.MIN_VALUE;
            } else {
                mdrVar = new mdr(this, olsVar, null);
            }
        } else {
            mdrVar = new mdr(this, olsVar, null);
        }
        Object objM16228f = mdrVar.f40124a;
        oma omaVar = oma.COROUTINE_SUSPENDED;
        switch (mdrVar.f40125b) {
            case 0:
                lkm.m15592s(objM16228f);
                if (ooc.m18737c(str, meaVar.f40161a.f39606p)) {
                    return meaVar;
                }
                mav mavVar = this.f39491c;
                mds mdsVar = new mds(this, meaVar, str, null, null);
                mdrVar.f40126c = meaVar;
                mdrVar.f40125b = 1;
                objM16228f = lzd.m16228f(mavVar, meaVar, mdsVar, mdrVar);
                if (objM16228f == omaVar) {
                    return omaVar;
                }
                break;
            case 1:
                meaVar = mdrVar.f40126c;
                lkm.m15592s(objM16228f);
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return mea.m16334a(meaVar, (lzb) objM16228f);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: g */
    public final Object m16112g(mea meaVar, mdz mdzVar, long j, ols olsVar) throws Throwable {
        mdt mdtVar;
        if (olsVar instanceof mdt) {
            mdtVar = (mdt) olsVar;
            int i = mdtVar.f40133b;
            if ((i & Integer.MIN_VALUE) != 0) {
                mdtVar.f40133b = i - Integer.MIN_VALUE;
            } else {
                mdtVar = new mdt(this, olsVar, null);
            }
        } else {
            mdtVar = new mdt(this, olsVar, null);
        }
        Object objM16228f = mdtVar.f40132a;
        oma omaVar = oma.COROUTINE_SUSPENDED;
        switch (mdtVar.f40133b) {
            case 0:
                lkm.m15592s(objM16228f);
                double dM16332a = mdzVar.m16332a(j);
                mav mavVar = this.f39491c;
                mdu mduVar = new mdu(this, meaVar, dM16332a, null, null);
                mdtVar.f40134c = meaVar;
                mdtVar.f40133b = 1;
                objM16228f = lzd.m16228f(mavVar, meaVar, mduVar, mdtVar);
                if (objM16228f == omaVar) {
                    return omaVar;
                }
                break;
            case 1:
                meaVar = mdtVar.f40134c;
                lkm.m15592s(objM16228f);
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return mea.m16334a(meaVar, (lzb) objM16228f);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: h */
    public final Object m16113h(mau mauVar, ocq ocqVar, mdz mdzVar, lzb lzbVar, List list, ols olsVar) {
        mdw mdwVar;
        ooi ooiVar;
        if (olsVar instanceof mdw) {
            mdwVar = (mdw) olsVar;
            int i = mdwVar.f40145b;
            if ((i & Integer.MIN_VALUE) != 0) {
                mdwVar.f40145b = i - Integer.MIN_VALUE;
            } else {
                mdwVar = new mdw(this, olsVar, null);
            }
        } else {
            mdwVar = new mdw(this, olsVar, null);
        }
        Object obj = mdwVar.f40144a;
        oma omaVar = oma.COROUTINE_SUSPENDED;
        switch (mdwVar.f40145b) {
            case 0:
                lkm.m15592s(obj);
                mea meaVar = new mea(lzbVar, list, mauVar);
                Object obj2 = this.f39492d;
                byte[] bArrMo17760J = ocqVar.mo17760J();
                bArrMo17760J.getClass();
                lzd lzdVar = (lzd) obj2;
                our ourVarM16244i = lzdVar.m16244i(new oen(bArrMo17760J), lzbVar.f39606p, "https://mobile-vision-f250-uploads.googleapis.com/upload/assemble");
                ooi ooiVar2 = new ooi();
                ooiVar2.f46351a = meaVar;
                oup oupVar = new oup(ooiVar2, this, mdzVar, 1, null);
                mdwVar.f40146c = ooiVar2;
                mdwVar.f40145b = 1;
                if (owg.m19113d((owg) ourVarM16244i, oupVar, mdwVar) == omaVar) {
                    return omaVar;
                }
                ooiVar = ooiVar2;
                break;
                break;
            case 1:
                ooiVar = mdwVar.f40146c;
                lkm.m15592s(obj);
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return ((mea) ooiVar.f46351a).f40161a;
    }

    public lwz(lzd lzdVar, mav mavVar, lzv lzvVar, ksi ksiVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        lzdVar.getClass();
        mavVar.getClass();
        lzvVar.getClass();
        ksiVar.getClass();
        this.f39492d = lzdVar;
        this.f39491c = mavVar;
        this.f39489a = lzvVar;
        this.f39490b = ksiVar;
    }
}
