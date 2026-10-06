package com.google.android.libraries.vision.visionkit.f250.internal.uploader.work;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import java.util.List;
import java.util.concurrent.CancellationException;
import p000.axr;
import p000.ksi;
import p000.lkm;
import p000.lqi;
import p000.lvf;
import p000.lvi;
import p000.lvo;
import p000.lwh;
import p000.lwz;
import p000.lxn;
import p000.mat;
import p000.mau;
import p000.mav;
import p000.mbe;
import p000.mbg;
import p000.mbh;
import p000.mbi;
import p000.mbj;
import p000.mbk;
import p000.nzw;
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
/* JADX INFO: loaded from: classes2.dex */
public final class F250AutoWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: g */
    public final ksi f7981g;

    /* JADX INFO: renamed from: h */
    public final mav f7982h;

    /* JADX INFO: renamed from: i */
    private final lxn f7983i;

    /* JADX INFO: renamed from: j */
    private final mbe f7984j;

    /* JADX INFO: renamed from: k */
    private final lwz f7985k;

    /* JADX INFO: renamed from: l */
    private final mat f7986l;

    /* JADX INFO: renamed from: m */
    private final oqo f7987m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F250AutoWorker(ksi ksiVar, mav mavVar, lxn lxnVar, mbe mbeVar, lwz lwzVar, mat matVar, oqo oqoVar, Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        ksiVar.getClass();
        mavVar.getClass();
        lxnVar.getClass();
        mbeVar.getClass();
        lwzVar.getClass();
        matVar.getClass();
        oqoVar.getClass();
        context.getClass();
        workerParameters.getClass();
        this.f7981g = ksiVar;
        this.f7982h = mavVar;
        this.f7983i = lxnVar;
        this.f7984j = mbeVar;
        this.f7985k = lwzVar;
        this.f7986l = matVar;
        this.f7987m = oqoVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.work.CoroutineWorker
    /* JADX INFO: renamed from: b */
    public final Object mo1696b(ols olsVar) throws Throwable {
        mbh mbhVar;
        if (olsVar instanceof mbh) {
            mbhVar = (mbh) olsVar;
            int i = mbhVar.f39794c;
            if ((i & Integer.MIN_VALUE) != 0) {
                mbhVar.f39794c = i - Integer.MIN_VALUE;
            } else {
                mbhVar = new mbh(this, olsVar);
            }
        } else {
            mbhVar = new mbh(this, olsVar);
        }
        Object objM18774L = mbhVar.f39792a;
        oma omaVar = oma.COROUTINE_SUSPENDED;
        switch (mbhVar.f39794c) {
            case 0:
                lkm.m15592s(objM18774L);
                oqo oqoVar = this.f7987m;
                mbi mbiVar = new mbi(this, null);
                mbhVar.f39794c = 1;
                objM18774L = ook.m18774L(oqoVar, mbiVar, mbhVar);
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

    /* JADX WARN: Code duplicated, block: B:29:0x00db A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:32:0x00df A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:37:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:39:0x00fe A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX INFO: renamed from: i */
    public final Object m4727i(mau mauVar, ols olsVar) throws Throwable {
        mbg mbgVar;
        mav mavVar;
        okv okvVar;
        oer oerVar;
        okv okvVar2;
        F250AutoWorker f250AutoWorker;
        lvo lvoVarM16280a;
        mav mavVar2;
        lvo lvoVarM16279e;
        mau mauVar2 = mauVar;
        if (olsVar instanceof mbg) {
            mbgVar = (mbg) olsVar;
            int i = mbgVar.f39786d;
            if ((i & Integer.MIN_VALUE) != 0) {
                mbgVar.f39786d = i - Integer.MIN_VALUE;
            } else {
                mbgVar = new mbg(this, olsVar);
            }
        } else {
            mbgVar = new mbg(this, olsVar);
        }
        Object objMo16119b = mbgVar.f39784b;
        oma omaVar = oma.COROUTINE_SUSPENDED;
        switch (mbgVar.f39786d) {
            case 0:
                lkm.m15592s(objMo16119b);
                mavVar = this.f7982h;
                okvVar = okv.f46215a;
                oerVar = oer.ERROR_QUERY;
                try {
                    lxn lxnVar = this.f7983i;
                    nzw nzwVar = mauVar2.f39740a;
                    mbgVar.f39783a = this;
                    mbgVar.f39787e = mauVar2;
                    mbgVar.f39788f = mavVar;
                    mbgVar.f39790h = okvVar;
                    mbgVar.f39791i = okvVar;
                    mbgVar.f39789g = oerVar;
                    mbgVar.f39786d = 1;
                    objMo16119b = lxnVar.mo16119b(nzwVar, omn.m18689ac(new lwh[]{lwh.UPLOAD_NOT_REQUESTED, lwh.UPLOADED_TO_F250, lwh.UPLOAD_FAILED_PERMANENTLY}), lvi.IN_AIRLOCK, mbgVar);
                    if (objMo16119b == omaVar) {
                        return omaVar;
                    }
                    f250AutoWorker = this;
                    lwz lwzVar = f250AutoWorker.f7985k;
                    mbgVar.f39783a = f250AutoWorker;
                    mbgVar.f39787e = mauVar2;
                    mbgVar.f39788f = null;
                    mbgVar.f39790h = null;
                    mbgVar.f39791i = null;
                    mbgVar.f39789g = null;
                    mbgVar.f39786d = 3;
                    objMo16119b = lwzVar.m16107b(mauVar2, (List) objMo16119b, mbgVar);
                    if (objMo16119b == omaVar) {
                        return omaVar;
                    }
                    okb okbVarM15860e = lqi.m15860e((List) objMo16119b);
                    List list = (List) okbVarM15860e.f46186a;
                    List list2 = (List) okbVarM15860e.f46187b;
                    mavVar2 = f250AutoWorker.f7982h;
                    lvoVarM16279e = mau.m16279e(mauVar2, list, list2, oer.SUCCESS_PARTIAL_AUTO_EXPIRE_DELETED, 8);
                    mbgVar.f39783a = null;
                    mbgVar.f39787e = null;
                    mbgVar.f39786d = 4;
                    if (mavVar2.m16285a(lvoVarM16279e, mbgVar) == omaVar) {
                        return omaVar;
                    }
                    return oki.f46196a;
                } catch (Throwable th) {
                    th = th;
                    okvVar2 = okvVar;
                    if (!(th instanceof CancellationException)) {
                        lvoVarM16280a = mauVar2.m16280a(okvVar2, okvVar, oerVar, th);
                        mbgVar.f39783a = th;
                        mbgVar.f39787e = null;
                        mbgVar.f39788f = null;
                        mbgVar.f39790h = null;
                        mbgVar.f39791i = null;
                        mbgVar.f39789g = null;
                        mbgVar.f39786d = 2;
                        if (mavVar.m16285a(lvoVarM16280a, mbgVar) == omaVar) {
                            return omaVar;
                        }
                    }
                    throw th;
                }
            case 1:
                oer oerVar2 = mbgVar.f39789g;
                okvVar = mbgVar.f39791i;
                okv okvVar3 = mbgVar.f39790h;
                mavVar = mbgVar.f39788f;
                mau mauVar3 = mbgVar.f39787e;
                F250AutoWorker f250AutoWorker2 = (F250AutoWorker) mbgVar.f39783a;
                try {
                    lkm.m15592s(objMo16119b);
                    mauVar2 = mauVar3;
                    f250AutoWorker = f250AutoWorker2;
                    lwz lwzVar2 = f250AutoWorker.f7985k;
                    mbgVar.f39783a = f250AutoWorker;
                    mbgVar.f39787e = mauVar2;
                    mbgVar.f39788f = null;
                    mbgVar.f39790h = null;
                    mbgVar.f39791i = null;
                    mbgVar.f39789g = null;
                    mbgVar.f39786d = 3;
                    objMo16119b = lwzVar2.m16107b(mauVar2, (List) objMo16119b, mbgVar);
                    if (objMo16119b == omaVar) {
                        return omaVar;
                    }
                    okb okbVarM15860e2 = lqi.m15860e((List) objMo16119b);
                    List list3 = (List) okbVarM15860e2.f46186a;
                    List list4 = (List) okbVarM15860e2.f46187b;
                    mavVar2 = f250AutoWorker.f7982h;
                    lvoVarM16279e = mau.m16279e(mauVar2, list3, list4, oer.SUCCESS_PARTIAL_AUTO_EXPIRE_DELETED, 8);
                    mbgVar.f39783a = null;
                    mbgVar.f39787e = null;
                    mbgVar.f39786d = 4;
                    if (mavVar2.m16285a(lvoVarM16279e, mbgVar) == omaVar) {
                        return omaVar;
                    }
                    return oki.f46196a;
                } catch (Throwable th2) {
                    th = th2;
                    okvVar2 = okvVar3;
                    oerVar = oerVar2;
                    mauVar2 = mauVar3;
                    if (!(th instanceof CancellationException)) {
                        lvoVarM16280a = mauVar2.m16280a(okvVar2, okvVar, oerVar, th);
                        mbgVar.f39783a = th;
                        mbgVar.f39787e = null;
                        mbgVar.f39788f = null;
                        mbgVar.f39790h = null;
                        mbgVar.f39791i = null;
                        mbgVar.f39789g = null;
                        mbgVar.f39786d = 2;
                        if (mavVar.m16285a(lvoVarM16280a, mbgVar) == omaVar) {
                            return omaVar;
                        }
                    }
                    throw th;
                }
            case 2:
                Throwable th3 = (Throwable) mbgVar.f39783a;
                lkm.m15592s(objMo16119b);
                throw th3;
            case 3:
                mauVar2 = mbgVar.f39787e;
                f250AutoWorker = (F250AutoWorker) mbgVar.f39783a;
                lkm.m15592s(objMo16119b);
                okb okbVarM15860e3 = lqi.m15860e((List) objMo16119b);
                List list5 = (List) okbVarM15860e3.f46186a;
                List list6 = (List) okbVarM15860e3.f46187b;
                mavVar2 = f250AutoWorker.f7982h;
                lvoVarM16279e = mau.m16279e(mauVar2, list5, list6, oer.SUCCESS_PARTIAL_AUTO_EXPIRE_DELETED, 8);
                mbgVar.f39783a = null;
                mbgVar.f39787e = null;
                mbgVar.f39786d = 4;
                if (mavVar2.m16285a(lvoVarM16279e, mbgVar) == omaVar) {
                    return omaVar;
                }
                return oki.f46196a;
            case 4:
                lkm.m15592s(objMo16119b);
                return oki.f46196a;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0088  */
    /* JADX WARN: Code duplicated, block: B:30:0x00a0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:33:0x00bc A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:40:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:42:0x00e1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: j */
    public final Object m4728j(mau mauVar, ols olsVar) throws Throwable {
        mbj mbjVar;
        mav mavVar;
        okv okvVar;
        oer oerVar;
        mau mauVar2;
        Throwable th;
        okv okvVar2;
        F250AutoWorker f250AutoWorker;
        lvo lvoVarM16280a;
        nzw nzwVar;
        mat matVar;
        mav mavVar2;
        lvo lvoVarM16278d;
        if (olsVar instanceof mbj) {
            mbjVar = (mbj) olsVar;
            int i = mbjVar.f39801d;
            if ((i & Integer.MIN_VALUE) != 0) {
                mbjVar.f39801d = i - Integer.MIN_VALUE;
            } else {
                mbjVar = new mbj(this, olsVar);
            }
        } else {
            mbjVar = new mbj(this, olsVar);
        }
        Object objMo16118a = mbjVar.f39799b;
        oma omaVar = oma.COROUTINE_SUSPENDED;
        switch (mbjVar.f39801d) {
            case 0:
                lkm.m15592s(objMo16118a);
                mavVar = this.f7982h;
                okvVar = okv.f46215a;
                oerVar = oer.ERROR_QUERY;
                try {
                    lxn lxnVar = this.f7983i;
                    nzw nzwVar2 = mauVar.f39740a;
                    mbjVar.f39798a = this;
                    mbjVar.f39802e = mauVar;
                    mbjVar.f39803f = mavVar;
                    mbjVar.f39805h = okvVar;
                    mbjVar.f39806i = okvVar;
                    mbjVar.f39804g = oerVar;
                    mbjVar.f39801d = 1;
                    objMo16118a = lxnVar.mo16118a(nzwVar2, lwh.UPLOAD_NOT_REQUESTED, lvi.IN_AIRLOCK, mbjVar);
                    if (objMo16118a == omaVar) {
                        return omaVar;
                    }
                    f250AutoWorker = this;
                    nzwVar = (nzw) objMo16118a;
                    if (nzwVar != null) {
                        matVar = f250AutoWorker.f7986l;
                        mbjVar.f39798a = f250AutoWorker;
                        mbjVar.f39802e = mauVar;
                        mbjVar.f39803f = null;
                        mbjVar.f39805h = null;
                        mbjVar.f39806i = null;
                        mbjVar.f39804g = null;
                        mbjVar.f39801d = 3;
                        if (matVar.mo16275a(mauVar, nzwVar, mbjVar) == omaVar) {
                            return omaVar;
                        }
                    }
                    mavVar2 = f250AutoWorker.f7982h;
                    lvoVarM16278d = mau.m16278d(mauVar);
                    mbjVar.f39798a = null;
                    mbjVar.f39802e = null;
                    mbjVar.f39803f = null;
                    mbjVar.f39805h = null;
                    mbjVar.f39806i = null;
                    mbjVar.f39804g = null;
                    mbjVar.f39801d = 4;
                    if (mavVar2.m16285a(lvoVarM16278d, mbjVar) == omaVar) {
                        return omaVar;
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
                    mbjVar.f39798a = th;
                    mbjVar.f39802e = null;
                    mbjVar.f39803f = null;
                    mbjVar.f39805h = null;
                    mbjVar.f39806i = null;
                    mbjVar.f39804g = null;
                    mbjVar.f39801d = 2;
                    if (mavVar.m16285a(lvoVarM16280a, mbjVar) == omaVar) {
                        return omaVar;
                    }
                    throw th;
                }
            case 1:
                oer oerVar2 = mbjVar.f39804g;
                okvVar = mbjVar.f39806i;
                okvVar2 = mbjVar.f39805h;
                mavVar = mbjVar.f39803f;
                mauVar2 = mbjVar.f39802e;
                F250AutoWorker f250AutoWorker2 = (F250AutoWorker) mbjVar.f39798a;
                try {
                    lkm.m15592s(objMo16118a);
                    mauVar = mauVar2;
                    f250AutoWorker = f250AutoWorker2;
                    nzwVar = (nzw) objMo16118a;
                    if (nzwVar != null) {
                        matVar = f250AutoWorker.f7986l;
                        mbjVar.f39798a = f250AutoWorker;
                        mbjVar.f39802e = mauVar;
                        mbjVar.f39803f = null;
                        mbjVar.f39805h = null;
                        mbjVar.f39806i = null;
                        mbjVar.f39804g = null;
                        mbjVar.f39801d = 3;
                        if (matVar.mo16275a(mauVar, nzwVar, mbjVar) == omaVar) {
                            return omaVar;
                        }
                    }
                    mavVar2 = f250AutoWorker.f7982h;
                    lvoVarM16278d = mau.m16278d(mauVar);
                    mbjVar.f39798a = null;
                    mbjVar.f39802e = null;
                    mbjVar.f39803f = null;
                    mbjVar.f39805h = null;
                    mbjVar.f39806i = null;
                    mbjVar.f39804g = null;
                    mbjVar.f39801d = 4;
                    if (mavVar2.m16285a(lvoVarM16278d, mbjVar) == omaVar) {
                        return omaVar;
                    }
                    return oki.f46196a;
                } catch (Throwable th3) {
                    oerVar = oerVar2;
                    th = th3;
                    if (!(th instanceof CancellationException)) {
                        throw th;
                    }
                    lvoVarM16280a = mauVar2.m16280a(okvVar2, okvVar, oerVar, th);
                    mbjVar.f39798a = th;
                    mbjVar.f39802e = null;
                    mbjVar.f39803f = null;
                    mbjVar.f39805h = null;
                    mbjVar.f39806i = null;
                    mbjVar.f39804g = null;
                    mbjVar.f39801d = 2;
                    if (mavVar.m16285a(lvoVarM16280a, mbjVar) == omaVar) {
                        return omaVar;
                    }
                    throw th;
                }
            case 2:
                Throwable th4 = (Throwable) mbjVar.f39798a;
                lkm.m15592s(objMo16118a);
                throw th4;
            case 3:
                mauVar = mbjVar.f39802e;
                f250AutoWorker = (F250AutoWorker) mbjVar.f39798a;
                lkm.m15592s(objMo16118a);
                mavVar2 = f250AutoWorker.f7982h;
                lvoVarM16278d = mau.m16278d(mauVar);
                mbjVar.f39798a = null;
                mbjVar.f39802e = null;
                mbjVar.f39803f = null;
                mbjVar.f39805h = null;
                mbjVar.f39806i = null;
                mbjVar.f39804g = null;
                mbjVar.f39801d = 4;
                if (mavVar2.m16285a(lvoVarM16278d, mbjVar) == omaVar) {
                    return omaVar;
                }
                return oki.f46196a;
            case 4:
                lkm.m15592s(objMo16118a);
                return oki.f46196a;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00bf A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:32:0x00c3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:37:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:39:0x00e5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: k */
    public final Object m4729k(mau mauVar, ols olsVar) throws Throwable {
        mbk mbkVar;
        mav mavVar;
        okv okvVar;
        oer oerVar;
        mau mauVar2;
        Throwable th;
        okv okvVar2;
        F250AutoWorker f250AutoWorker;
        lvo lvoVarM16280a;
        mav mavVar2;
        lvo lvoVarM16279e;
        if (olsVar instanceof mbk) {
            mbkVar = (mbk) olsVar;
            int i = mbkVar.f39810d;
            if ((i & Integer.MIN_VALUE) != 0) {
                mbkVar.f39810d = i - Integer.MIN_VALUE;
            } else {
                mbkVar = new mbk(this, olsVar);
            }
        } else {
            mbkVar = new mbk(this, olsVar);
        }
        Object objMo16120c = mbkVar.f39808b;
        oma omaVar = oma.COROUTINE_SUSPENDED;
        switch (mbkVar.f39810d) {
            case 0:
                lkm.m15592s(objMo16120c);
                mavVar = this.f7982h;
                okvVar = okv.f46215a;
                oerVar = oer.ERROR_QUERY;
                try {
                    lxn lxnVar = this.f7983i;
                    nzw nzwVar = mauVar.f39740a;
                    mbkVar.f39807a = this;
                    mbkVar.f39811e = mauVar;
                    mbkVar.f39812f = mavVar;
                    mbkVar.f39814h = okvVar;
                    mbkVar.f39815i = okvVar;
                    mbkVar.f39813g = oerVar;
                    mbkVar.f39810d = 1;
                    objMo16120c = lxnVar.mo16120c(nzwVar, lwh.UPLOAD_NOT_REQUESTED, lvi.IN_AIRLOCK, mbkVar);
                    if (objMo16120c == omaVar) {
                        return omaVar;
                    }
                    f250AutoWorker = this;
                    mbe mbeVar = f250AutoWorker.f7984j;
                    axr axrVar = lvf.f39389a;
                    mbkVar.f39807a = f250AutoWorker;
                    mbkVar.f39811e = mauVar;
                    mbkVar.f39812f = null;
                    mbkVar.f39814h = null;
                    mbkVar.f39815i = null;
                    mbkVar.f39813g = null;
                    mbkVar.f39810d = 3;
                    objMo16120c = mbe.m16295a(mbeVar, mauVar, (List) objMo16120c, axrVar, mbkVar);
                    if (objMo16120c == omaVar) {
                        return omaVar;
                    }
                    okb okbVar = (okb) objMo16120c;
                    List list = (List) okbVar.f46186a;
                    List list2 = (List) okbVar.f46187b;
                    mavVar2 = f250AutoWorker.f7982h;
                    lvoVarM16279e = mau.m16279e(mauVar, list, list2, oer.SUCCESS_PARTIAL_AUTO_UPLOAD_ENQUEUED, 8);
                    mbkVar.f39807a = null;
                    mbkVar.f39811e = null;
                    mbkVar.f39810d = 4;
                    if (mavVar2.m16285a(lvoVarM16279e, mbkVar) == omaVar) {
                        return omaVar;
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
                    mbkVar.f39807a = th;
                    mbkVar.f39811e = null;
                    mbkVar.f39812f = null;
                    mbkVar.f39814h = null;
                    mbkVar.f39815i = null;
                    mbkVar.f39813g = null;
                    mbkVar.f39810d = 2;
                    if (mavVar.m16285a(lvoVarM16280a, mbkVar) == omaVar) {
                        return omaVar;
                    }
                    throw th;
                }
            case 1:
                oer oerVar2 = mbkVar.f39813g;
                okvVar = mbkVar.f39815i;
                okvVar2 = mbkVar.f39814h;
                mavVar = mbkVar.f39812f;
                mauVar2 = mbkVar.f39811e;
                F250AutoWorker f250AutoWorker2 = (F250AutoWorker) mbkVar.f39807a;
                try {
                    lkm.m15592s(objMo16120c);
                    mauVar = mauVar2;
                    f250AutoWorker = f250AutoWorker2;
                    mbe mbeVar2 = f250AutoWorker.f7984j;
                    axr axrVar2 = lvf.f39389a;
                    mbkVar.f39807a = f250AutoWorker;
                    mbkVar.f39811e = mauVar;
                    mbkVar.f39812f = null;
                    mbkVar.f39814h = null;
                    mbkVar.f39815i = null;
                    mbkVar.f39813g = null;
                    mbkVar.f39810d = 3;
                    objMo16120c = mbe.m16295a(mbeVar2, mauVar, (List) objMo16120c, axrVar2, mbkVar);
                    if (objMo16120c == omaVar) {
                        return omaVar;
                    }
                    okb okbVar2 = (okb) objMo16120c;
                    List list3 = (List) okbVar2.f46186a;
                    List list4 = (List) okbVar2.f46187b;
                    mavVar2 = f250AutoWorker.f7982h;
                    lvoVarM16279e = mau.m16279e(mauVar, list3, list4, oer.SUCCESS_PARTIAL_AUTO_UPLOAD_ENQUEUED, 8);
                    mbkVar.f39807a = null;
                    mbkVar.f39811e = null;
                    mbkVar.f39810d = 4;
                    if (mavVar2.m16285a(lvoVarM16279e, mbkVar) == omaVar) {
                        return omaVar;
                    }
                    return oki.f46196a;
                } catch (Throwable th3) {
                    oerVar = oerVar2;
                    th = th3;
                    if (!(th instanceof CancellationException)) {
                        throw th;
                    }
                    lvoVarM16280a = mauVar2.m16280a(okvVar2, okvVar, oerVar, th);
                    mbkVar.f39807a = th;
                    mbkVar.f39811e = null;
                    mbkVar.f39812f = null;
                    mbkVar.f39814h = null;
                    mbkVar.f39815i = null;
                    mbkVar.f39813g = null;
                    mbkVar.f39810d = 2;
                    if (mavVar.m16285a(lvoVarM16280a, mbkVar) == omaVar) {
                        return omaVar;
                    }
                    throw th;
                }
            case 2:
                Throwable th4 = (Throwable) mbkVar.f39807a;
                lkm.m15592s(objMo16120c);
                throw th4;
            case 3:
                mauVar = mbkVar.f39811e;
                f250AutoWorker = (F250AutoWorker) mbkVar.f39807a;
                lkm.m15592s(objMo16120c);
                okb okbVar3 = (okb) objMo16120c;
                List list5 = (List) okbVar3.f46186a;
                List list6 = (List) okbVar3.f46187b;
                mavVar2 = f250AutoWorker.f7982h;
                lvoVarM16279e = mau.m16279e(mauVar, list5, list6, oer.SUCCESS_PARTIAL_AUTO_UPLOAD_ENQUEUED, 8);
                mbkVar.f39807a = null;
                mbkVar.f39811e = null;
                mbkVar.f39810d = 4;
                if (mavVar2.m16285a(lvoVarM16279e, mbkVar) == omaVar) {
                    return omaVar;
                }
                return oki.f46196a;
            case 4:
                lkm.m15592s(objMo16120c);
                return oki.f46196a;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
