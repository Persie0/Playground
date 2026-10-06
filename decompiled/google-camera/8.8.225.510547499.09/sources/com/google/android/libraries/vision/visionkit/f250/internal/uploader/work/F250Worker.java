package com.google.android.libraries.vision.visionkit.f250.internal.uploader.work;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import p000.ksi;
import p000.lkm;
import p000.lqi;
import p000.lvo;
import p000.lwh;
import p000.lxs;
import p000.lzb;
import p000.lzh;
import p000.mau;
import p000.mav;
import p000.maz;
import p000.mbb;
import p000.mbs;
import p000.mbu;
import p000.mbv;
import p000.mbw;
import p000.mdc;
import p000.oer;
import p000.okb;
import p000.oki;
import p000.okv;
import p000.ols;
import p000.oma;
import p000.omn;
import p000.ook;
import p000.oqo;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class F250Worker extends CoroutineWorker {

    /* JADX INFO: renamed from: g */
    public final ksi f7988g;

    /* JADX INFO: renamed from: h */
    public final lzh f7989h;

    /* JADX INFO: renamed from: i */
    public final mdc f7990i;

    /* JADX INFO: renamed from: j */
    public final mav f7991j;

    /* JADX INFO: renamed from: k */
    private final lxs f7992k;

    /* JADX INFO: renamed from: l */
    private final mbb f7993l;

    /* JADX INFO: renamed from: m */
    private final int f7994m;

    /* JADX INFO: renamed from: n */
    private final oqo f7995n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F250Worker(ksi ksiVar, lzh lzhVar, lxs lxsVar, mdc mdcVar, mav mavVar, mbb mbbVar, int i, oqo oqoVar, Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        ksiVar.getClass();
        lzhVar.getClass();
        lxsVar.getClass();
        mdcVar.getClass();
        mavVar.getClass();
        mbbVar.getClass();
        oqoVar.getClass();
        context.getClass();
        workerParameters.getClass();
        this.f7988g = ksiVar;
        this.f7989h = lzhVar;
        this.f7992k = lxsVar;
        this.f7990i = mdcVar;
        this.f7991j = mavVar;
        this.f7993l = mbbVar;
        this.f7994m = i;
        this.f7995n = oqoVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.work.CoroutineWorker
    /* JADX INFO: renamed from: b */
    public final Object mo1696b(ols olsVar) throws Throwable {
        mbs mbsVar;
        if (olsVar instanceof mbs) {
            mbsVar = (mbs) olsVar;
            int i = mbsVar.f39865c;
            if ((i & Integer.MIN_VALUE) != 0) {
                mbsVar.f39865c = i - Integer.MIN_VALUE;
            } else {
                mbsVar = new mbs(this, olsVar);
            }
        } else {
            mbsVar = new mbs(this, olsVar);
        }
        Object objM18774L = mbsVar.f39863a;
        oma omaVar = oma.COROUTINE_SUSPENDED;
        switch (mbsVar.f39865c) {
            case 0:
                lkm.m15592s(objM18774L);
                oqo oqoVar = this.f7995n;
                mbu mbuVar = new mbu(this, null);
                mbsVar.f39865c = 1;
                objM18774L = ook.m18774L(oqoVar, mbuVar, mbsVar);
                if (objM18774L == omaVar) {
                    return omaVar;
                }
                break;
            case 1:
                lkm.m15592s(objM18774L);
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        objM18774L.getClass();
        return objM18774L;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x007a  */
    /* JADX WARN: Code duplicated, block: B:28:0x00a5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:35:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ca A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: i */
    public final Object m4730i(mau mauVar, ols olsVar) throws Throwable {
        mbv mbvVar;
        mav mavVar;
        okv okvVar;
        oer oerVar;
        mau mauVar2;
        Throwable th;
        okv okvVar2;
        F250Worker f250Worker;
        lvo lvoVarM16280a;
        List list;
        mav mavVar2;
        lvo lvoVarM16279e;
        if (olsVar instanceof mbv) {
            mbvVar = (mbv) olsVar;
            int i = mbvVar.f39874d;
            if ((i & Integer.MIN_VALUE) != 0) {
                mbvVar.f39874d = i - Integer.MIN_VALUE;
            } else {
                mbvVar = new mbv(this, olsVar);
            }
        } else {
            mbvVar = new mbv(this, olsVar);
        }
        Object objMo16247a = mbvVar.f39872b;
        oma omaVar = oma.COROUTINE_SUSPENDED;
        switch (mbvVar.f39874d) {
            case 0:
                lkm.m15592s(objMo16247a);
                mavVar = this.f7991j;
                okvVar = okv.f46215a;
                oerVar = oer.ERROR_QUERY;
                try {
                    lzh lzhVar = this.f7989h;
                    mbvVar.f39871a = this;
                    mbvVar.f39875e = mauVar;
                    mbvVar.f39876f = mavVar;
                    mbvVar.f39878h = okvVar;
                    mbvVar.f39879i = okvVar;
                    mbvVar.f39877g = oerVar;
                    mbvVar.f39874d = 1;
                    objMo16247a = lzhVar.mo16247a(mbvVar);
                    if (objMo16247a == omaVar) {
                        return omaVar;
                    }
                    f250Worker = this;
                    list = (List) objMo16247a;
                    if (!list.isEmpty()) {
                        okb okbVarM15860e = lqi.m15860e(list);
                        List list2 = (List) okbVarM15860e.f46186a;
                        List list3 = (List) okbVarM15860e.f46187b;
                        mavVar2 = f250Worker.f7991j;
                        lvoVarM16279e = mau.m16279e(mauVar, list2, list3, oer.SUCCESS_PARTIAL_UPLOAD_INVALID_FAILED, 8);
                        mbvVar.f39871a = null;
                        mbvVar.f39875e = null;
                        mbvVar.f39876f = null;
                        mbvVar.f39878h = null;
                        mbvVar.f39879i = null;
                        mbvVar.f39877g = null;
                        mbvVar.f39874d = 3;
                        if (mavVar2.m16285a(lvoVarM16279e, mbvVar) == omaVar) {
                            return omaVar;
                        }
                    }
                    return oki.f46196a;
                } catch (Throwable th2) {
                    mauVar2 = mauVar;
                    th = th2;
                    okvVar2 = okvVar;
                    if (!(th instanceof CancellationException)) {
                        throw th;
                    }
                    lvoVarM16280a = mauVar2.m16280a(okvVar2, okvVar, oerVar, th);
                    mbvVar.f39871a = th;
                    mbvVar.f39875e = null;
                    mbvVar.f39876f = null;
                    mbvVar.f39878h = null;
                    mbvVar.f39879i = null;
                    mbvVar.f39877g = null;
                    mbvVar.f39874d = 2;
                    if (mavVar.m16285a(lvoVarM16280a, mbvVar) == omaVar) {
                        return omaVar;
                    }
                    throw th;
                }
            case 1:
                oer oerVar2 = mbvVar.f39877g;
                okvVar = mbvVar.f39879i;
                okvVar2 = mbvVar.f39878h;
                mavVar = mbvVar.f39876f;
                mauVar2 = mbvVar.f39875e;
                f250Worker = (F250Worker) mbvVar.f39871a;
                try {
                    lkm.m15592s(objMo16247a);
                    mauVar = mauVar2;
                    list = (List) objMo16247a;
                    if (!list.isEmpty()) {
                        okb okbVarM15860e2 = lqi.m15860e(list);
                        List list4 = (List) okbVarM15860e2.f46186a;
                        List list5 = (List) okbVarM15860e2.f46187b;
                        mavVar2 = f250Worker.f7991j;
                        lvoVarM16279e = mau.m16279e(mauVar, list4, list5, oer.SUCCESS_PARTIAL_UPLOAD_INVALID_FAILED, 8);
                        mbvVar.f39871a = null;
                        mbvVar.f39875e = null;
                        mbvVar.f39876f = null;
                        mbvVar.f39878h = null;
                        mbvVar.f39879i = null;
                        mbvVar.f39877g = null;
                        mbvVar.f39874d = 3;
                        if (mavVar2.m16285a(lvoVarM16279e, mbvVar) == omaVar) {
                            return omaVar;
                        }
                    }
                    return oki.f46196a;
                } catch (Throwable th3) {
                    oerVar = oerVar2;
                    th = th3;
                    if (!(th instanceof CancellationException)) {
                        throw th;
                    }
                    lvoVarM16280a = mauVar2.m16280a(okvVar2, okvVar, oerVar, th);
                    mbvVar.f39871a = th;
                    mbvVar.f39875e = null;
                    mbvVar.f39876f = null;
                    mbvVar.f39878h = null;
                    mbvVar.f39879i = null;
                    mbvVar.f39877g = null;
                    mbvVar.f39874d = 2;
                    if (mavVar.m16285a(lvoVarM16280a, mbvVar) == omaVar) {
                        return omaVar;
                    }
                    throw th;
                }
            case 2:
                Throwable th4 = (Throwable) mbvVar.f39871a;
                lkm.m15592s(objMo16247a);
                throw th4;
            case 3:
                lkm.m15592s(objMo16247a);
                return oki.f46196a;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0263  */
    /* JADX WARN: Code duplicated, block: B:109:0x027c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:42:0x0105  */
    /* JADX WARN: Code duplicated, block: B:45:0x010e  */
    /* JADX WARN: Code duplicated, block: B:47:0x0131  */
    /* JADX WARN: Code duplicated, block: B:48:0x0134  */
    /* JADX WARN: Code duplicated, block: B:54:0x0171  */
    /* JADX WARN: Code duplicated, block: B:55:0x0174 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:56:0x0175 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:61:0x017c  */
    /* JADX WARN: Code duplicated, block: B:63:0x0197 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:66:0x019a  */
    /* JADX WARN: Code duplicated, block: B:69:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:71:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:72:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:77:0x01f3 A[Catch: all -> 0x0235, LOOP:0: B:75:0x01ed->B:77:0x01f3, LOOP_END, TryCatch #2 {all -> 0x0235, blocks: (B:74:0x01cf, B:75:0x01ed, B:77:0x01f3, B:78:0x0203, B:81:0x020e), top: B:118:0x01cf }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:80:0x020d  */
    /* JADX WARN: Code duplicated, block: B:81:0x020e A[Catch: all -> 0x0235, TRY_LEAVE, TryCatch #2 {all -> 0x0235, blocks: (B:74:0x01cf, B:75:0x01ed, B:77:0x01f3, B:78:0x0203, B:81:0x020e), top: B:118:0x01cf }] */
    /* JADX WARN: Code duplicated, block: B:85:0x0230 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:88:0x0234 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:92:0x023a  */
    /* JADX WARN: Code duplicated, block: B:94:0x0252 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:97:0x0255  */
    /* JADX WARN: Code duplicated, block: B:99:0x0258 A[RETURN] */
    /* JADX INFO: renamed from: j */
    public final Object m4731j(mau mauVar, ols olsVar) throws Throwable {
        mbw mbwVar;
        mav mavVar;
        List list;
        oer oerVar;
        mau mauVar2;
        List list2;
        F250Worker f250Worker;
        lvo lvoVarM16280a;
        F250Worker f250Worker2;
        mau mauVar3;
        maz mazVar;
        mau mauVar4;
        F250Worker f250Worker3;
        List list3;
        List list4;
        mav mavVar2;
        oer oerVar2;
        oer oerVar3;
        oer oerVar4;
        lxs lxsVar;
        lvo lvoVarM16280a2;
        mav mavVar3;
        lvo lvoVarM16280a3;
        List list5;
        List list6;
        mav mavVar4;
        oer oerVar5;
        oer oerVar6;
        ArrayList arrayList;
        Iterator it;
        Object objMo16125d;
        lvo lvoVarM16280a4;
        mav mavVar5;
        lvo lvoVarM16279e;
        if (olsVar instanceof mbw) {
            mbwVar = (mbw) olsVar;
            int i = mbwVar.f39886g;
            if ((i & Integer.MIN_VALUE) != 0) {
                mbwVar.f39886g = i - Integer.MIN_VALUE;
            } else {
                mbwVar = new mbw(this, olsVar);
            }
        } else {
            mbwVar = new mbw(this, olsVar);
        }
        Object objMo16249e = mbwVar.f39884e;
        oma omaVar = oma.COROUTINE_SUSPENDED;
        switch (mbwVar.f39886g) {
            case 0:
                lkm.m15592s(objMo16249e);
                mavVar = this.f7991j;
                list = okv.f46215a;
                oerVar = oer.ERROR_QUERY;
                try {
                    lzh lzhVar = this.f7989h;
                    mbwVar.f39880a = this;
                    mauVar2 = mauVar;
                    try {
                        mbwVar.f39887h = mauVar2;
                        mbwVar.f39881b = mavVar;
                        mbwVar.f39888i = list;
                        mbwVar.f39882c = list;
                        mbwVar.f39883d = oerVar;
                        mbwVar.f39886g = 1;
                        objMo16249e = lzhVar.mo16249e(lwh.UPLOAD_IN_PROGRESS, mbwVar);
                        if (objMo16249e == omaVar) {
                            return omaVar;
                        }
                        f250Worker = this;
                        mbb mbbVar = f250Worker.f7993l;
                        mbwVar.f39880a = f250Worker;
                        mbwVar.f39887h = mauVar2;
                        mbwVar.f39881b = null;
                        mbwVar.f39888i = null;
                        mbwVar.f39882c = null;
                        mbwVar.f39883d = null;
                        mbwVar.f39886g = 3;
                        objMo16249e = mbbVar.m16292a(mauVar2, (List) objMo16249e, mbwVar);
                        if (objMo16249e != omaVar) {
                            return omaVar;
                        }
                        f250Worker2 = f250Worker;
                        mauVar3 = mauVar2;
                        mazVar = (maz) objMo16249e;
                        if (mazVar.f39748b != null) {
                            Object obj = mazVar.f39747a.get(lwh.UPLOAD_FAILED_PERMANENTLY);
                            obj.getClass();
                            okb okbVarM15860e = lqi.m15860e((List) obj);
                            list3 = (List) okbVarM15860e.f46186a;
                            list4 = (List) okbVarM15860e.f46187b;
                            mavVar2 = f250Worker2.f7991j;
                            if (list3.isEmpty()) {
                                oerVar2 = oer.ERROR_QUERY;
                            } else {
                                oerVar2 = oer.ERROR_UPDATE;
                            }
                            oerVar3 = oerVar2;
                            try {
                                lxsVar = f250Worker2.f7992k;
                                mbwVar.f39880a = f250Worker2;
                                mbwVar.f39887h = mauVar3;
                                mbwVar.f39881b = mazVar;
                                mbwVar.f39888i = list3;
                                mbwVar.f39882c = list4;
                                mbwVar.f39883d = mavVar2;
                                mbwVar.f39889j = oerVar3;
                                mbwVar.f39886g = 4;
                                if (lxsVar.mo16123a(list3, list4, mbwVar) == omaVar) {
                                    return omaVar;
                                }
                                mavVar3 = f250Worker2.f7991j;
                                lvoVarM16280a3 = mauVar3.m16280a(list3, list4, oer.SUCCESS_PARTIAL_UPLOAD_INVALID_FAILED, mazVar.f39748b);
                                mbwVar.f39880a = f250Worker2;
                                mbwVar.f39887h = mauVar3;
                                mbwVar.f39881b = mazVar;
                                mbwVar.f39888i = null;
                                mbwVar.f39882c = null;
                                mbwVar.f39883d = null;
                                mbwVar.f39889j = null;
                                mbwVar.f39886g = 6;
                                if (mavVar3.m16285a(lvoVarM16280a3, mbwVar) != omaVar) {
                                    return omaVar;
                                }
                                mauVar4 = mauVar3;
                                f250Worker3 = f250Worker2;
                            } catch (Throwable th) {
                                th = th;
                                oerVar4 = oerVar3;
                                if (!(th instanceof CancellationException)) {
                                    lvoVarM16280a2 = mauVar3.m16280a(list3, list4, oerVar4, th);
                                    mbwVar.f39880a = th;
                                    mbwVar.f39887h = null;
                                    mbwVar.f39881b = null;
                                    mbwVar.f39888i = null;
                                    mbwVar.f39882c = null;
                                    mbwVar.f39883d = null;
                                    mbwVar.f39889j = null;
                                    mbwVar.f39886g = 5;
                                    if (mavVar2.m16285a(lvoVarM16280a2, mbwVar) == omaVar) {
                                        return omaVar;
                                    }
                                }
                                throw th;
                            }
                        } else {
                            mauVar4 = mauVar3;
                            f250Worker3 = f250Worker2;
                        }
                        if (!mazVar.f39747a.containsKey(lwh.UPLOAD_IN_PROGRESS)) {
                            return oki.f46196a;
                        }
                        Object obj2 = mazVar.f39747a.get(lwh.UPLOAD_IN_PROGRESS);
                        obj2.getClass();
                        okb okbVarM15860e2 = lqi.m15860e((List) obj2);
                        list5 = (List) okbVarM15860e2.f46186a;
                        list6 = (List) okbVarM15860e2.f46187b;
                        mavVar4 = f250Worker3.f7991j;
                        if (list5.isEmpty()) {
                            oerVar5 = oer.ERROR_QUERY;
                        } else {
                            oerVar5 = oer.ERROR_UPDATE;
                        }
                        oerVar6 = oerVar5;
                        try {
                            lxs lxsVar2 = f250Worker3.f7992k;
                            mbwVar.f39880a = f250Worker3;
                            mbwVar.f39887h = mauVar4;
                            mbwVar.f39881b = list5;
                            mbwVar.f39888i = list6;
                            mbwVar.f39882c = mavVar4;
                            mbwVar.f39883d = oerVar6;
                            mbwVar.f39886g = 7;
                            arrayList = new ArrayList(omn.m18678R(list5));
                            it = list5.iterator();
                            while (it.hasNext()) {
                                arrayList.add(omn.m18699d(((lzb) it.next()).f39611u));
                            }
                            objMo16125d = lxsVar2.mo16125d(arrayList, lwh.UPLOAD_PAUSED, mbwVar);
                            if (objMo16125d != oma.COROUTINE_SUSPENDED) {
                                objMo16125d = oki.f46196a;
                                break;
                            }
                            if (objMo16125d == omaVar) {
                                return omaVar;
                            }
                            mavVar5 = f250Worker3.f7991j;
                            lvoVarM16279e = mau.m16279e(mauVar4, list5, list6, oer.SUCCESS_PARTIAL_UPLOAD_PAUSED, 8);
                            mbwVar.f39880a = null;
                            mbwVar.f39887h = null;
                            mbwVar.f39881b = null;
                            mbwVar.f39888i = null;
                            mbwVar.f39882c = null;
                            mbwVar.f39883d = null;
                            mbwVar.f39886g = 9;
                            if (mavVar5.m16285a(lvoVarM16279e, mbwVar) == omaVar) {
                                return omaVar;
                            }
                            return oki.f46196a;
                        } catch (Throwable th2) {
                            th = th2;
                            if (!(th instanceof CancellationException)) {
                                lvoVarM16280a4 = mauVar4.m16280a(list5, list6, oerVar6, th);
                                mbwVar.f39880a = th;
                                mbwVar.f39887h = null;
                                mbwVar.f39881b = null;
                                mbwVar.f39888i = null;
                                mbwVar.f39882c = null;
                                mbwVar.f39883d = null;
                                mbwVar.f39886g = 8;
                                if (mavVar4.m16285a(lvoVarM16280a4, mbwVar) == omaVar) {
                                    return omaVar;
                                }
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        list2 = list;
                        if (!(th instanceof CancellationException)) {
                            lvoVarM16280a = mauVar2.m16280a(list2, list, oerVar, th);
                            mbwVar.f39880a = th;
                            mbwVar.f39887h = null;
                            mbwVar.f39881b = null;
                            mbwVar.f39888i = null;
                            mbwVar.f39882c = null;
                            mbwVar.f39883d = null;
                            mbwVar.f39886g = 2;
                            if (mavVar.m16285a(lvoVarM16280a, mbwVar) == omaVar) {
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
                oerVar = (oer) mbwVar.f39883d;
                list = (List) mbwVar.f39882c;
                List list7 = mbwVar.f39888i;
                mavVar = (mav) mbwVar.f39881b;
                mau mauVar5 = mbwVar.f39887h;
                f250Worker = (F250Worker) mbwVar.f39880a;
                try {
                    lkm.m15592s(objMo16249e);
                    mauVar2 = mauVar5;
                    mbb mbbVar2 = f250Worker.f7993l;
                    mbwVar.f39880a = f250Worker;
                    mbwVar.f39887h = mauVar2;
                    mbwVar.f39881b = null;
                    mbwVar.f39888i = null;
                    mbwVar.f39882c = null;
                    mbwVar.f39883d = null;
                    mbwVar.f39886g = 3;
                    objMo16249e = mbbVar2.m16292a(mauVar2, (List) objMo16249e, mbwVar);
                    if (objMo16249e != omaVar) {
                        return omaVar;
                    }
                    f250Worker2 = f250Worker;
                    mauVar3 = mauVar2;
                    mazVar = (maz) objMo16249e;
                    if (mazVar.f39748b != null) {
                        Object obj3 = mazVar.f39747a.get(lwh.UPLOAD_FAILED_PERMANENTLY);
                        obj3.getClass();
                        okb okbVarM15860e3 = lqi.m15860e((List) obj3);
                        list3 = (List) okbVarM15860e3.f46186a;
                        list4 = (List) okbVarM15860e3.f46187b;
                        mavVar2 = f250Worker2.f7991j;
                        if (list3.isEmpty()) {
                            oerVar2 = oer.ERROR_QUERY;
                        } else {
                            oerVar2 = oer.ERROR_UPDATE;
                        }
                        oerVar3 = oerVar2;
                        lxsVar = f250Worker2.f7992k;
                        mbwVar.f39880a = f250Worker2;
                        mbwVar.f39887h = mauVar3;
                        mbwVar.f39881b = mazVar;
                        mbwVar.f39888i = list3;
                        mbwVar.f39882c = list4;
                        mbwVar.f39883d = mavVar2;
                        mbwVar.f39889j = oerVar3;
                        mbwVar.f39886g = 4;
                        if (lxsVar.mo16123a(list3, list4, mbwVar) == omaVar) {
                            return omaVar;
                        }
                        mavVar3 = f250Worker2.f7991j;
                        lvoVarM16280a3 = mauVar3.m16280a(list3, list4, oer.SUCCESS_PARTIAL_UPLOAD_INVALID_FAILED, mazVar.f39748b);
                        mbwVar.f39880a = f250Worker2;
                        mbwVar.f39887h = mauVar3;
                        mbwVar.f39881b = mazVar;
                        mbwVar.f39888i = null;
                        mbwVar.f39882c = null;
                        mbwVar.f39883d = null;
                        mbwVar.f39889j = null;
                        mbwVar.f39886g = 6;
                        if (mavVar3.m16285a(lvoVarM16280a3, mbwVar) != omaVar) {
                            return omaVar;
                        }
                        mauVar4 = mauVar3;
                        f250Worker3 = f250Worker2;
                    } else {
                        mauVar4 = mauVar3;
                        f250Worker3 = f250Worker2;
                    }
                    if (!mazVar.f39747a.containsKey(lwh.UPLOAD_IN_PROGRESS)) {
                        return oki.f46196a;
                    }
                    Object obj4 = mazVar.f39747a.get(lwh.UPLOAD_IN_PROGRESS);
                    obj4.getClass();
                    okb okbVarM15860e4 = lqi.m15860e((List) obj4);
                    list5 = (List) okbVarM15860e4.f46186a;
                    list6 = (List) okbVarM15860e4.f46187b;
                    mavVar4 = f250Worker3.f7991j;
                    if (list5.isEmpty()) {
                        oerVar5 = oer.ERROR_QUERY;
                    } else {
                        oerVar5 = oer.ERROR_UPDATE;
                    }
                    oerVar6 = oerVar5;
                    lxs lxsVar3 = f250Worker3.f7992k;
                    mbwVar.f39880a = f250Worker3;
                    mbwVar.f39887h = mauVar4;
                    mbwVar.f39881b = list5;
                    mbwVar.f39888i = list6;
                    mbwVar.f39882c = mavVar4;
                    mbwVar.f39883d = oerVar6;
                    mbwVar.f39886g = 7;
                    arrayList = new ArrayList(omn.m18678R(list5));
                    it = list5.iterator();
                    while (it.hasNext()) {
                        arrayList.add(omn.m18699d(((lzb) it.next()).f39611u));
                    }
                    objMo16125d = lxsVar3.mo16125d(arrayList, lwh.UPLOAD_PAUSED, mbwVar);
                    if (objMo16125d != oma.COROUTINE_SUSPENDED) {
                        objMo16125d = oki.f46196a;
                        break;
                    }
                    if (objMo16125d == omaVar) {
                        return omaVar;
                    }
                    mavVar5 = f250Worker3.f7991j;
                    lvoVarM16279e = mau.m16279e(mauVar4, list5, list6, oer.SUCCESS_PARTIAL_UPLOAD_PAUSED, 8);
                    mbwVar.f39880a = null;
                    mbwVar.f39887h = null;
                    mbwVar.f39881b = null;
                    mbwVar.f39888i = null;
                    mbwVar.f39882c = null;
                    mbwVar.f39883d = null;
                    mbwVar.f39886g = 9;
                    if (mavVar5.m16285a(lvoVarM16279e, mbwVar) == omaVar) {
                        return omaVar;
                    }
                    return oki.f46196a;
                } catch (Throwable th5) {
                    th = th5;
                    list2 = list7;
                    mauVar2 = mauVar5;
                    if (!(th instanceof CancellationException)) {
                        lvoVarM16280a = mauVar2.m16280a(list2, list, oerVar, th);
                        mbwVar.f39880a = th;
                        mbwVar.f39887h = null;
                        mbwVar.f39881b = null;
                        mbwVar.f39888i = null;
                        mbwVar.f39882c = null;
                        mbwVar.f39883d = null;
                        mbwVar.f39886g = 2;
                        if (mavVar.m16285a(lvoVarM16280a, mbwVar) == omaVar) {
                            return omaVar;
                        }
                    }
                    throw th;
                }
            case 2:
                Throwable th6 = (Throwable) mbwVar.f39880a;
                lkm.m15592s(objMo16249e);
                throw th6;
            case 3:
                mau mauVar6 = mbwVar.f39887h;
                F250Worker f250Worker4 = (F250Worker) mbwVar.f39880a;
                lkm.m15592s(objMo16249e);
                mauVar3 = mauVar6;
                f250Worker2 = f250Worker4;
                mazVar = (maz) objMo16249e;
                if (mazVar.f39748b != null) {
                    Object obj5 = mazVar.f39747a.get(lwh.UPLOAD_FAILED_PERMANENTLY);
                    obj5.getClass();
                    okb okbVarM15860e5 = lqi.m15860e((List) obj5);
                    list3 = (List) okbVarM15860e5.f46186a;
                    list4 = (List) okbVarM15860e5.f46187b;
                    mavVar2 = f250Worker2.f7991j;
                    if (list3.isEmpty()) {
                        oerVar2 = oer.ERROR_QUERY;
                    } else {
                        oerVar2 = oer.ERROR_UPDATE;
                    }
                    oerVar3 = oerVar2;
                    lxsVar = f250Worker2.f7992k;
                    mbwVar.f39880a = f250Worker2;
                    mbwVar.f39887h = mauVar3;
                    mbwVar.f39881b = mazVar;
                    mbwVar.f39888i = list3;
                    mbwVar.f39882c = list4;
                    mbwVar.f39883d = mavVar2;
                    mbwVar.f39889j = oerVar3;
                    mbwVar.f39886g = 4;
                    if (lxsVar.mo16123a(list3, list4, mbwVar) == omaVar) {
                        return omaVar;
                    }
                    mavVar3 = f250Worker2.f7991j;
                    lvoVarM16280a3 = mauVar3.m16280a(list3, list4, oer.SUCCESS_PARTIAL_UPLOAD_INVALID_FAILED, mazVar.f39748b);
                    mbwVar.f39880a = f250Worker2;
                    mbwVar.f39887h = mauVar3;
                    mbwVar.f39881b = mazVar;
                    mbwVar.f39888i = null;
                    mbwVar.f39882c = null;
                    mbwVar.f39883d = null;
                    mbwVar.f39889j = null;
                    mbwVar.f39886g = 6;
                    if (mavVar3.m16285a(lvoVarM16280a3, mbwVar) != omaVar) {
                        return omaVar;
                    }
                    mauVar4 = mauVar3;
                    f250Worker3 = f250Worker2;
                } else {
                    mauVar4 = mauVar3;
                    f250Worker3 = f250Worker2;
                }
                if (!mazVar.f39747a.containsKey(lwh.UPLOAD_IN_PROGRESS)) {
                    return oki.f46196a;
                }
                Object obj6 = mazVar.f39747a.get(lwh.UPLOAD_IN_PROGRESS);
                obj6.getClass();
                okb okbVarM15860e6 = lqi.m15860e((List) obj6);
                list5 = (List) okbVarM15860e6.f46186a;
                list6 = (List) okbVarM15860e6.f46187b;
                mavVar4 = f250Worker3.f7991j;
                if (list5.isEmpty()) {
                    oerVar5 = oer.ERROR_QUERY;
                } else {
                    oerVar5 = oer.ERROR_UPDATE;
                }
                oerVar6 = oerVar5;
                lxs lxsVar4 = f250Worker3.f7992k;
                mbwVar.f39880a = f250Worker3;
                mbwVar.f39887h = mauVar4;
                mbwVar.f39881b = list5;
                mbwVar.f39888i = list6;
                mbwVar.f39882c = mavVar4;
                mbwVar.f39883d = oerVar6;
                mbwVar.f39886g = 7;
                arrayList = new ArrayList(omn.m18678R(list5));
                it = list5.iterator();
                while (it.hasNext()) {
                    arrayList.add(omn.m18699d(((lzb) it.next()).f39611u));
                }
                objMo16125d = lxsVar4.mo16125d(arrayList, lwh.UPLOAD_PAUSED, mbwVar);
                if (objMo16125d != oma.COROUTINE_SUSPENDED) {
                    objMo16125d = oki.f46196a;
                    break;
                }
                if (objMo16125d == omaVar) {
                    return omaVar;
                }
                mavVar5 = f250Worker3.f7991j;
                lvoVarM16279e = mau.m16279e(mauVar4, list5, list6, oer.SUCCESS_PARTIAL_UPLOAD_PAUSED, 8);
                mbwVar.f39880a = null;
                mbwVar.f39887h = null;
                mbwVar.f39881b = null;
                mbwVar.f39888i = null;
                mbwVar.f39882c = null;
                mbwVar.f39883d = null;
                mbwVar.f39886g = 9;
                if (mavVar5.m16285a(lvoVarM16279e, mbwVar) == omaVar) {
                    return omaVar;
                }
                return oki.f46196a;
            case 4:
                oerVar4 = mbwVar.f39889j;
                mavVar2 = (mav) mbwVar.f39883d;
                list4 = (List) mbwVar.f39882c;
                list3 = mbwVar.f39888i;
                maz mazVar2 = (maz) mbwVar.f39881b;
                mauVar3 = mbwVar.f39887h;
                f250Worker2 = (F250Worker) mbwVar.f39880a;
                try {
                    lkm.m15592s(objMo16249e);
                    mazVar = mazVar2;
                    mavVar3 = f250Worker2.f7991j;
                    lvoVarM16280a3 = mauVar3.m16280a(list3, list4, oer.SUCCESS_PARTIAL_UPLOAD_INVALID_FAILED, mazVar.f39748b);
                    mbwVar.f39880a = f250Worker2;
                    mbwVar.f39887h = mauVar3;
                    mbwVar.f39881b = mazVar;
                    mbwVar.f39888i = null;
                    mbwVar.f39882c = null;
                    mbwVar.f39883d = null;
                    mbwVar.f39889j = null;
                    mbwVar.f39886g = 6;
                    if (mavVar3.m16285a(lvoVarM16280a3, mbwVar) != omaVar) {
                        return omaVar;
                    }
                    mauVar4 = mauVar3;
                    f250Worker3 = f250Worker2;
                    if (!mazVar.f39747a.containsKey(lwh.UPLOAD_IN_PROGRESS)) {
                        return oki.f46196a;
                    }
                    Object obj7 = mazVar.f39747a.get(lwh.UPLOAD_IN_PROGRESS);
                    obj7.getClass();
                    okb okbVarM15860e7 = lqi.m15860e((List) obj7);
                    list5 = (List) okbVarM15860e7.f46186a;
                    list6 = (List) okbVarM15860e7.f46187b;
                    mavVar4 = f250Worker3.f7991j;
                    if (list5.isEmpty()) {
                        oerVar5 = oer.ERROR_QUERY;
                    } else {
                        oerVar5 = oer.ERROR_UPDATE;
                    }
                    oerVar6 = oerVar5;
                    lxs lxsVar5 = f250Worker3.f7992k;
                    mbwVar.f39880a = f250Worker3;
                    mbwVar.f39887h = mauVar4;
                    mbwVar.f39881b = list5;
                    mbwVar.f39888i = list6;
                    mbwVar.f39882c = mavVar4;
                    mbwVar.f39883d = oerVar6;
                    mbwVar.f39886g = 7;
                    arrayList = new ArrayList(omn.m18678R(list5));
                    it = list5.iterator();
                    while (it.hasNext()) {
                        arrayList.add(omn.m18699d(((lzb) it.next()).f39611u));
                    }
                    objMo16125d = lxsVar5.mo16125d(arrayList, lwh.UPLOAD_PAUSED, mbwVar);
                    if (objMo16125d != oma.COROUTINE_SUSPENDED) {
                        objMo16125d = oki.f46196a;
                        break;
                    }
                    if (objMo16125d == omaVar) {
                        return omaVar;
                    }
                    mavVar5 = f250Worker3.f7991j;
                    lvoVarM16279e = mau.m16279e(mauVar4, list5, list6, oer.SUCCESS_PARTIAL_UPLOAD_PAUSED, 8);
                    mbwVar.f39880a = null;
                    mbwVar.f39887h = null;
                    mbwVar.f39881b = null;
                    mbwVar.f39888i = null;
                    mbwVar.f39882c = null;
                    mbwVar.f39883d = null;
                    mbwVar.f39886g = 9;
                    if (mavVar5.m16285a(lvoVarM16279e, mbwVar) == omaVar) {
                        return omaVar;
                    }
                    return oki.f46196a;
                } catch (Throwable th7) {
                    th = th7;
                    if (!(th instanceof CancellationException)) {
                        lvoVarM16280a2 = mauVar3.m16280a(list3, list4, oerVar4, th);
                        mbwVar.f39880a = th;
                        mbwVar.f39887h = null;
                        mbwVar.f39881b = null;
                        mbwVar.f39888i = null;
                        mbwVar.f39882c = null;
                        mbwVar.f39883d = null;
                        mbwVar.f39889j = null;
                        mbwVar.f39886g = 5;
                        if (mavVar2.m16285a(lvoVarM16280a2, mbwVar) == omaVar) {
                            return omaVar;
                        }
                    }
                    throw th;
                }
            case 5:
                Throwable th8 = (Throwable) mbwVar.f39880a;
                lkm.m15592s(objMo16249e);
                throw th8;
            case 6:
                mazVar = (maz) mbwVar.f39881b;
                mau mauVar7 = mbwVar.f39887h;
                F250Worker f250Worker5 = (F250Worker) mbwVar.f39880a;
                lkm.m15592s(objMo16249e);
                mauVar4 = mauVar7;
                f250Worker3 = f250Worker5;
                if (!mazVar.f39747a.containsKey(lwh.UPLOAD_IN_PROGRESS)) {
                    return oki.f46196a;
                }
                Object obj8 = mazVar.f39747a.get(lwh.UPLOAD_IN_PROGRESS);
                obj8.getClass();
                okb okbVarM15860e8 = lqi.m15860e((List) obj8);
                list5 = (List) okbVarM15860e8.f46186a;
                list6 = (List) okbVarM15860e8.f46187b;
                mavVar4 = f250Worker3.f7991j;
                if (list5.isEmpty()) {
                    oerVar5 = oer.ERROR_QUERY;
                } else {
                    oerVar5 = oer.ERROR_UPDATE;
                }
                oerVar6 = oerVar5;
                lxs lxsVar6 = f250Worker3.f7992k;
                mbwVar.f39880a = f250Worker3;
                mbwVar.f39887h = mauVar4;
                mbwVar.f39881b = list5;
                mbwVar.f39888i = list6;
                mbwVar.f39882c = mavVar4;
                mbwVar.f39883d = oerVar6;
                mbwVar.f39886g = 7;
                arrayList = new ArrayList(omn.m18678R(list5));
                it = list5.iterator();
                while (it.hasNext()) {
                    arrayList.add(omn.m18699d(((lzb) it.next()).f39611u));
                }
                objMo16125d = lxsVar6.mo16125d(arrayList, lwh.UPLOAD_PAUSED, mbwVar);
                if (objMo16125d != oma.COROUTINE_SUSPENDED) {
                    objMo16125d = oki.f46196a;
                    break;
                }
                if (objMo16125d == omaVar) {
                    return omaVar;
                }
                mavVar5 = f250Worker3.f7991j;
                lvoVarM16279e = mau.m16279e(mauVar4, list5, list6, oer.SUCCESS_PARTIAL_UPLOAD_PAUSED, 8);
                mbwVar.f39880a = null;
                mbwVar.f39887h = null;
                mbwVar.f39881b = null;
                mbwVar.f39888i = null;
                mbwVar.f39882c = null;
                mbwVar.f39883d = null;
                mbwVar.f39886g = 9;
                if (mavVar5.m16285a(lvoVarM16279e, mbwVar) == omaVar) {
                    return omaVar;
                }
                return oki.f46196a;
            case 7:
                oerVar6 = (oer) mbwVar.f39883d;
                mavVar4 = (mav) mbwVar.f39882c;
                list6 = mbwVar.f39888i;
                list5 = (List) mbwVar.f39881b;
                mauVar4 = mbwVar.f39887h;
                f250Worker3 = (F250Worker) mbwVar.f39880a;
                try {
                    lkm.m15592s(objMo16249e);
                    mavVar5 = f250Worker3.f7991j;
                    lvoVarM16279e = mau.m16279e(mauVar4, list5, list6, oer.SUCCESS_PARTIAL_UPLOAD_PAUSED, 8);
                    mbwVar.f39880a = null;
                    mbwVar.f39887h = null;
                    mbwVar.f39881b = null;
                    mbwVar.f39888i = null;
                    mbwVar.f39882c = null;
                    mbwVar.f39883d = null;
                    mbwVar.f39886g = 9;
                    if (mavVar5.m16285a(lvoVarM16279e, mbwVar) == omaVar) {
                        return omaVar;
                    }
                    return oki.f46196a;
                } catch (Throwable th9) {
                    th = th9;
                    if (!(th instanceof CancellationException)) {
                        lvoVarM16280a4 = mauVar4.m16280a(list5, list6, oerVar6, th);
                        mbwVar.f39880a = th;
                        mbwVar.f39887h = null;
                        mbwVar.f39881b = null;
                        mbwVar.f39888i = null;
                        mbwVar.f39882c = null;
                        mbwVar.f39883d = null;
                        mbwVar.f39886g = 8;
                        if (mavVar4.m16285a(lvoVarM16280a4, mbwVar) == omaVar) {
                            return omaVar;
                        }
                    }
                    throw th;
                }
            case 8:
                Throwable th10 = (Throwable) mbwVar.f39880a;
                lkm.m15592s(objMo16249e);
                throw th10;
            case 9:
                lkm.m15592s(objMo16249e);
                return oki.f46196a;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0051  */
    /* JADX WARN: Code duplicated, block: B:19:0x007a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x007b  */
    /* JADX WARN: Code duplicated, block: B:23:0x0088  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x007b -> B:21:0x0080). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: k */
    public final java.lang.Object m4732k(p000.mau r10, p000.ols r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof p000.mbx
            if (r0 == 0) goto L13
            r0 = r11
            mbx r0 = (p000.mbx) r0
            int r1 = r0.f39892c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f39892c = r1
            goto L18
        L13:
            mbx r0 = new mbx
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.f39890a
            oma r1 = p000.oma.COROUTINE_SUSPENDED
            int r2 = r0.f39892c
            r3 = 0
            switch(r2) {
                case 0: goto L3e;
                case 1: goto L2f;
                case 2: goto L2a;
                default: goto L22;
            }
        L22:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L2a:
            p000.lkm.m15592s(r11)
            goto Lb8
        L2f:
            java.util.ArrayList r10 = r0.f39895f
            mau r2 = r0.f39894e
            com.google.android.libraries.vision.visionkit.f250.internal.uploader.work.F250Worker r4 = r0.f39893d
            p000.lkm.m15592s(r11)
            r8 = r0
            r0 = r10
            r10 = r2
            r2 = r1
            r1 = r8
            goto L80
        L3e:
            p000.lkm.m15592s(r11)
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            r4 = r9
        L47:
            oly r2 = r0.mo18639d()
            boolean r2 = p000.ooc.m18757w(r2)
            if (r2 == 0) goto L92
            mby r2 = new mby
            r2.<init>(r4, r10, r3)
            our r2 = p000.ook.m18783U(r2)
            int r5 = r4.f7994m
            int r5 = r5 + (-1)
            r6 = 1
            int r5 = p000.ook.m18789c(r5, r6)
            mbz r7 = new mbz
            r7.<init>(r4, r10, r3)
            our r2 = p000.mpw.m16764c(r2, r5, r7)
            r0.f39893d = r4
            r0.f39894e = r10
            r0.f39895f = r11
            r0.f39892c = r6
            java.lang.Object r2 = p000.ook.m18784V(r2, r0)
            if (r2 != r1) goto L7b
            return r1
        L7b:
            r8 = r0
            r0 = r11
            r11 = r2
            r2 = r1
            r1 = r8
        L80:
            java.util.List r11 = (java.util.List) r11
            boolean r5 = r11.isEmpty()
            if (r5 != 0) goto L8f
            p000.omn.m18677Q(r0, r11)
            r11 = r0
            r0 = r1
            r1 = r2
            goto L47
        L8f:
            r11 = r0
            r0 = r1
            r1 = r2
        L92:
            okb r11 = p000.lqi.m15860e(r11)
            java.lang.Object r2 = r11.f46186a
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r11 = r11.f46187b
            java.util.List r11 = (java.util.List) r11
            mav r4 = r4.f7991j
            oer r5 = p000.oer.SUCCESS
            r6 = 8
            lvo r10 = p000.mau.m16279e(r10, r2, r11, r5, r6)
            r0.f39893d = r3
            r0.f39894e = r3
            r0.f39895f = r3
            r11 = 2
            r0.f39892c = r11
            java.lang.Object r10 = r4.m16285a(r10, r0)
            if (r10 != r1) goto Lb8
            return r1
        Lb8:
            oki r10 = p000.oki.f46196a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.vision.visionkit.f250.internal.uploader.work.F250Worker.m4732k(mau, ols):java.lang.Object");
    }
}
