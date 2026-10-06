package p000;

import androidx.wear.ambient.AmbientMode;
import com.google.android.apps.camera.jni.tracking.yRU.CswIK;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mdi implements mdc {

    /* JADX INFO: renamed from: a */
    public final drj f40079a;

    /* JADX INFO: renamed from: b */
    private final mav f40080b;

    /* JADX INFO: renamed from: c */
    private final mbb f40081c;

    /* JADX INFO: renamed from: d */
    private final lzv f40082d;

    /* JADX INFO: renamed from: e */
    private final lwz f40083e;

    /* JADX INFO: renamed from: f */
    private final mao f40084f;

    /* JADX INFO: renamed from: g */
    private final ksi f40085g;

    /* JADX INFO: renamed from: h */
    private final lwz f40086h;

    /* JADX INFO: renamed from: i */
    private final AmbientMode.AmbientController f40087i;

    public mdi(mav mavVar, mbb mbbVar, lzv lzvVar, lwz lwzVar, lwz lwzVar2, drj drjVar, mao maoVar, ksi ksiVar, AmbientMode.AmbientController ambientController, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        mavVar.getClass();
        lzvVar.getClass();
        lwzVar2.getClass();
        drjVar.getClass();
        maoVar.getClass();
        ksiVar.getClass();
        ambientController.getClass();
        this.f40080b = mavVar;
        this.f40081c = mbbVar;
        this.f40082d = lzvVar;
        this.f40086h = lwzVar;
        this.f40083e = lwzVar2;
        this.f40079a = drjVar;
        this.f40084f = maoVar;
        this.f40085g = ksiVar;
        this.f40087i = ambientController;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:31:0x0103  */
    /* JADX WARN: Code duplicated, block: B:34:0x0113  */
    /* JADX WARN: Code duplicated, block: B:37:0x011a  */
    /* JADX WARN: Code duplicated, block: B:39:0x012f  */
    /* JADX WARN: Code duplicated, block: B:41:0x0137  */
    /* JADX WARN: Code duplicated, block: B:42:0x0139  */
    /* JADX WARN: Code duplicated, block: B:44:0x013f  */
    /* JADX WARN: Code duplicated, block: B:48:0x0174  */
    /* JADX WARN: Code duplicated, block: B:51:0x019e  */
    /* JADX WARN: Code duplicated, block: B:54:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:56:0x01be A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:57:0x01bf A[PHI: r3
      0x01bf: PHI (r3v21 java.lang.Object) = (r3v20 java.lang.Object), (r3v1 java.lang.Object) binds: [B:55:0x01bc, B:12:0x0034] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Code duplicated, block: B:58:0x01c0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:59:0x01c1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:60:0x01c2 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:65:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:67:0x01e9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:69:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:76:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Instruction removed from duplicated block: B:37:0x011a, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:69:0x01eb, please report this as an issue */
    @Override // p000.mdc
    /* JADX INFO: renamed from: a */
    public final Object mo16328a(mau mauVar, lzc lzcVar, ols olsVar) throws Throwable {
        mdh mdhVar;
        mdi mdiVar;
        lzb lzbVar;
        Object objM18779Q;
        mdi mdiVar2;
        mau mauVar2;
        lzb lzbVar2;
        List list;
        Object objM16330c;
        mau mauVar3;
        List list2;
        lzb lzbVar3;
        ocq ocqVar;
        mdz mdzVar;
        int i;
        int iM18135M;
        int iM18135M2;
        mav mavVar;
        oer oerVar;
        List listM18668H;
        List list3;
        Object objM16261h;
        mdz mdzVar2;
        mdi mdiVar3;
        List list4;
        ocq ocqVar2;
        mau mauVar4;
        lvo lvoVarM16280a;
        mdi mdiVar4;
        lzc lzcVar2;
        mau mauVar5 = mauVar;
        lzc lzcVar3 = lzcVar;
        if (olsVar instanceof mdh) {
            mdhVar = (mdh) olsVar;
            int i2 = mdhVar.f40071e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mdhVar.f40071e = i2 - Integer.MIN_VALUE;
            } else {
                mdhVar = new mdh(this, olsVar);
            }
        } else {
            mdhVar = new mdh(this, olsVar);
        }
        Object objM16113h = mdhVar.f40069c;
        oma omaVar = oma.COROUTINE_SUSPENDED;
        switch (mdhVar.f40071e) {
            case 0:
                lkm.m15592s(objM16113h);
                mdhVar.f40067a = this;
                mdhVar.f40072f = mauVar5;
                mdhVar.f40068b = lzcVar3;
                mdhVar.f40071e = 1;
                if (m16329b(mauVar5, lzcVar3, mdhVar) != omaVar) {
                    mdiVar = this;
                    lzbVar = lzcVar3.f39614a;
                    List list5 = lzcVar3.f39615b;
                    mdhVar.f40067a = mdiVar;
                    mdhVar.f40072f = mauVar5;
                    mdhVar.f40068b = lzbVar;
                    mdhVar.f40071e = 2;
                    objM18779Q = ook.m18779Q(mpw.m16764c(new ouu((Iterable) list5, 1), ook.m18791e(list5.size(), 1, ovh.f46648a), new mdg(mdiVar, mauVar5, lzbVar, null)), new ArrayList(), mdhVar);
                    if (objM18779Q != omaVar) {
                        mdiVar2 = mdiVar;
                        mauVar2 = mauVar5;
                        lzbVar2 = lzbVar;
                        objM16113h = objM18779Q;
                        list = (List) objM16113h;
                        mdhVar.f40067a = mdiVar2;
                        mdhVar.f40072f = mauVar2;
                        mdhVar.f40068b = lzbVar2;
                        mdhVar.f40073g = list;
                        mdhVar.f40071e = 3;
                        objM16330c = mdiVar2.m16330c(mauVar2, lzbVar2, list, mdhVar);
                        if (objM16330c != omaVar) {
                            mauVar3 = mauVar2;
                            list2 = list;
                            objM16113h = objM16330c;
                            lzbVar3 = lzbVar2;
                            ocqVar = (ocq) objM16113h;
                            if (ocqVar.m18142ac()) {
                                iM18135M2 = ocqVar.m18135M(null);
                                if (iM18135M2 < 0) {
                                    throw new IllegalStateException("serialized size must be non-negative, was " + iM18135M2);
                                }
                            } else {
                                i = ocqVar.f44980aI & Integer.MAX_VALUE;
                                if (i != Integer.MAX_VALUE) {
                                    iM18135M2 = i;
                                } else {
                                    iM18135M = ocqVar.m18135M(null);
                                    if (iM18135M >= 0) {
                                        throw new IllegalStateException("serialized size must be non-negative, was " + iM18135M);
                                    }
                                    ocqVar.f44980aI = (Integer.MIN_VALUE & ocqVar.f44980aI) | iM18135M;
                                    iM18135M2 = iM18135M;
                                }
                            }
                            mdzVar = new mdz(lzbVar3, iM18135M2);
                            mavVar = mdiVar2.f40080b;
                            oerVar = oer.ERROR_UPDATE;
                            listM18668H = omn.m18668H(lzbVar3);
                            try {
                                lzv lzvVar = mdiVar2.f40082d;
                                double dM16332a = mdzVar.m16332a(0L);
                                mdhVar.f40067a = mdiVar2;
                                mdhVar.f40072f = mauVar3;
                                mdhVar.f40068b = lzbVar3;
                                mdhVar.f40073g = list2;
                                mdhVar.f40074h = ocqVar;
                                mdhVar.f40075i = mdzVar;
                                mdhVar.f40076j = oerVar;
                                mdhVar.f40077k = mavVar;
                                mdhVar.f40078l = listM18668H;
                                mdhVar.f40071e = 4;
                                objM16261h = lzvVar.m16261h(lzbVar3, dM16332a, mdhVar);
                                if (objM16261h != omaVar) {
                                    return omaVar;
                                }
                                mdzVar2 = mdzVar;
                                mdiVar3 = mdiVar2;
                                list4 = list2;
                                ocqVar2 = ocqVar;
                                objM16113h = objM16261h;
                                mauVar4 = mauVar3;
                                lwz lwzVar = mdiVar3.f40086h;
                                mdhVar.f40067a = mdiVar3;
                                mdhVar.f40072f = mauVar4;
                                mdhVar.f40068b = lzbVar3;
                                mdhVar.f40073g = list4;
                                mdhVar.f40074h = null;
                                mdhVar.f40075i = null;
                                mdhVar.f40076j = null;
                                mdhVar.f40077k = null;
                                mdhVar.f40078l = null;
                                mdhVar.f40071e = 6;
                                objM16113h = lwzVar.m16113h(mauVar4, ocqVar2, mdzVar2, (lzb) objM16113h, list4, mdhVar);
                                if (objM16113h == omaVar) {
                                    return omaVar;
                                }
                                mdiVar4 = mdiVar3;
                                lzcVar2 = new lzc((lzb) objM16113h, list4);
                                if (lzbVar3.f39603m) {
                                    return lzcVar2;
                                }
                                lwz lwzVar2 = mdiVar4.f40083e;
                                mdhVar.f40067a = null;
                                mdhVar.f40072f = null;
                                mdhVar.f40068b = null;
                                mdhVar.f40073g = null;
                                mdhVar.f40071e = 7;
                                objM16113h = lwzVar2.m16106a(mauVar4, lzcVar2, mdhVar);
                                if (objM16113h == omaVar) {
                                    return omaVar;
                                }
                                return objM16113h;
                            } catch (Throwable th) {
                                th = th;
                                list3 = listM18668H;
                                if (!(th instanceof CancellationException)) {
                                    throw th;
                                }
                                lvoVarM16280a = mauVar3.m16280a(list3, list2, oerVar, th);
                                mdhVar.f40067a = th;
                                mdhVar.f40072f = null;
                                mdhVar.f40068b = null;
                                mdhVar.f40073g = null;
                                mdhVar.f40074h = null;
                                mdhVar.f40075i = null;
                                mdhVar.f40076j = null;
                                mdhVar.f40077k = null;
                                mdhVar.f40078l = null;
                                mdhVar.f40071e = 5;
                                if (mavVar.m16285a(lvoVarM16280a, mdhVar) == omaVar) {
                                    return omaVar;
                                }
                                throw th;
                            }
                        }
                    }
                }
                return omaVar;
            case 1:
                lzc lzcVar4 = (lzc) mdhVar.f40068b;
                mau mauVar6 = mdhVar.f40072f;
                mdiVar = (mdi) mdhVar.f40067a;
                lkm.m15592s(objM16113h);
                lzcVar3 = lzcVar4;
                mauVar5 = mauVar6;
                lzbVar = lzcVar3.f39614a;
                List list6 = lzcVar3.f39615b;
                mdhVar.f40067a = mdiVar;
                mdhVar.f40072f = mauVar5;
                mdhVar.f40068b = lzbVar;
                mdhVar.f40071e = 2;
                objM18779Q = ook.m18779Q(mpw.m16764c(new ouu((Iterable) list6, 1), ook.m18791e(list6.size(), 1, ovh.f46648a), new mdg(mdiVar, mauVar5, lzbVar, null)), new ArrayList(), mdhVar);
                if (objM18779Q != omaVar) {
                    mdiVar2 = mdiVar;
                    mauVar2 = mauVar5;
                    lzbVar2 = lzbVar;
                    objM16113h = objM18779Q;
                    list = (List) objM16113h;
                    mdhVar.f40067a = mdiVar2;
                    mdhVar.f40072f = mauVar2;
                    mdhVar.f40068b = lzbVar2;
                    mdhVar.f40073g = list;
                    mdhVar.f40071e = 3;
                    objM16330c = mdiVar2.m16330c(mauVar2, lzbVar2, list, mdhVar);
                    if (objM16330c != omaVar) {
                        mauVar3 = mauVar2;
                        list2 = list;
                        objM16113h = objM16330c;
                        lzbVar3 = lzbVar2;
                        ocqVar = (ocq) objM16113h;
                        if (ocqVar.m18142ac()) {
                            iM18135M2 = ocqVar.m18135M(null);
                            if (iM18135M2 < 0) {
                                throw new IllegalStateException("serialized size must be non-negative, was " + iM18135M2);
                            }
                        } else {
                            i = ocqVar.f44980aI & Integer.MAX_VALUE;
                            if (i != Integer.MAX_VALUE) {
                                iM18135M2 = i;
                            } else {
                                iM18135M = ocqVar.m18135M(null);
                                if (iM18135M >= 0) {
                                    throw new IllegalStateException("serialized size must be non-negative, was " + iM18135M);
                                }
                                ocqVar.f44980aI = (Integer.MIN_VALUE & ocqVar.f44980aI) | iM18135M;
                                iM18135M2 = iM18135M;
                            }
                        }
                        mdzVar = new mdz(lzbVar3, iM18135M2);
                        mavVar = mdiVar2.f40080b;
                        oerVar = oer.ERROR_UPDATE;
                        listM18668H = omn.m18668H(lzbVar3);
                        lzv lzvVar2 = mdiVar2.f40082d;
                        double dM16332a2 = mdzVar.m16332a(0L);
                        mdhVar.f40067a = mdiVar2;
                        mdhVar.f40072f = mauVar3;
                        mdhVar.f40068b = lzbVar3;
                        mdhVar.f40073g = list2;
                        mdhVar.f40074h = ocqVar;
                        mdhVar.f40075i = mdzVar;
                        mdhVar.f40076j = oerVar;
                        mdhVar.f40077k = mavVar;
                        mdhVar.f40078l = listM18668H;
                        mdhVar.f40071e = 4;
                        objM16261h = lzvVar2.m16261h(lzbVar3, dM16332a2, mdhVar);
                        if (objM16261h != omaVar) {
                            return omaVar;
                        }
                        mdzVar2 = mdzVar;
                        mdiVar3 = mdiVar2;
                        list4 = list2;
                        ocqVar2 = ocqVar;
                        objM16113h = objM16261h;
                        mauVar4 = mauVar3;
                        lwz lwzVar3 = mdiVar3.f40086h;
                        mdhVar.f40067a = mdiVar3;
                        mdhVar.f40072f = mauVar4;
                        mdhVar.f40068b = lzbVar3;
                        mdhVar.f40073g = list4;
                        mdhVar.f40074h = null;
                        mdhVar.f40075i = null;
                        mdhVar.f40076j = null;
                        mdhVar.f40077k = null;
                        mdhVar.f40078l = null;
                        mdhVar.f40071e = 6;
                        objM16113h = lwzVar3.m16113h(mauVar4, ocqVar2, mdzVar2, (lzb) objM16113h, list4, mdhVar);
                        if (objM16113h == omaVar) {
                            return omaVar;
                        }
                        mdiVar4 = mdiVar3;
                        lzcVar2 = new lzc((lzb) objM16113h, list4);
                        if (lzbVar3.f39603m) {
                            return lzcVar2;
                        }
                        lwz lwzVar4 = mdiVar4.f40083e;
                        mdhVar.f40067a = null;
                        mdhVar.f40072f = null;
                        mdhVar.f40068b = null;
                        mdhVar.f40073g = null;
                        mdhVar.f40071e = 7;
                        objM16113h = lwzVar4.m16106a(mauVar4, lzcVar2, mdhVar);
                        if (objM16113h == omaVar) {
                            return omaVar;
                        }
                        return objM16113h;
                    }
                }
                return omaVar;
            case 2:
                lzbVar2 = (lzb) mdhVar.f40068b;
                mauVar2 = mdhVar.f40072f;
                mdi mdiVar5 = (mdi) mdhVar.f40067a;
                lkm.m15592s(objM16113h);
                mdiVar2 = mdiVar5;
                list = (List) objM16113h;
                mdhVar.f40067a = mdiVar2;
                mdhVar.f40072f = mauVar2;
                mdhVar.f40068b = lzbVar2;
                mdhVar.f40073g = list;
                mdhVar.f40071e = 3;
                objM16330c = mdiVar2.m16330c(mauVar2, lzbVar2, list, mdhVar);
                if (objM16330c != omaVar) {
                    mauVar3 = mauVar2;
                    list2 = list;
                    objM16113h = objM16330c;
                    lzbVar3 = lzbVar2;
                    ocqVar = (ocq) objM16113h;
                    if (ocqVar.m18142ac()) {
                        iM18135M2 = ocqVar.m18135M(null);
                        if (iM18135M2 < 0) {
                            throw new IllegalStateException("serialized size must be non-negative, was " + iM18135M2);
                        }
                    } else {
                        i = ocqVar.f44980aI & Integer.MAX_VALUE;
                        if (i != Integer.MAX_VALUE) {
                            iM18135M2 = i;
                        } else {
                            iM18135M = ocqVar.m18135M(null);
                            if (iM18135M >= 0) {
                                throw new IllegalStateException("serialized size must be non-negative, was " + iM18135M);
                            }
                            ocqVar.f44980aI = (Integer.MIN_VALUE & ocqVar.f44980aI) | iM18135M;
                            iM18135M2 = iM18135M;
                        }
                    }
                    mdzVar = new mdz(lzbVar3, iM18135M2);
                    mavVar = mdiVar2.f40080b;
                    oerVar = oer.ERROR_UPDATE;
                    listM18668H = omn.m18668H(lzbVar3);
                    lzv lzvVar3 = mdiVar2.f40082d;
                    double dM16332a3 = mdzVar.m16332a(0L);
                    mdhVar.f40067a = mdiVar2;
                    mdhVar.f40072f = mauVar3;
                    mdhVar.f40068b = lzbVar3;
                    mdhVar.f40073g = list2;
                    mdhVar.f40074h = ocqVar;
                    mdhVar.f40075i = mdzVar;
                    mdhVar.f40076j = oerVar;
                    mdhVar.f40077k = mavVar;
                    mdhVar.f40078l = listM18668H;
                    mdhVar.f40071e = 4;
                    objM16261h = lzvVar3.m16261h(lzbVar3, dM16332a3, mdhVar);
                    if (objM16261h != omaVar) {
                        return omaVar;
                    }
                    mdzVar2 = mdzVar;
                    mdiVar3 = mdiVar2;
                    list4 = list2;
                    ocqVar2 = ocqVar;
                    objM16113h = objM16261h;
                    mauVar4 = mauVar3;
                    lwz lwzVar5 = mdiVar3.f40086h;
                    mdhVar.f40067a = mdiVar3;
                    mdhVar.f40072f = mauVar4;
                    mdhVar.f40068b = lzbVar3;
                    mdhVar.f40073g = list4;
                    mdhVar.f40074h = null;
                    mdhVar.f40075i = null;
                    mdhVar.f40076j = null;
                    mdhVar.f40077k = null;
                    mdhVar.f40078l = null;
                    mdhVar.f40071e = 6;
                    objM16113h = lwzVar5.m16113h(mauVar4, ocqVar2, mdzVar2, (lzb) objM16113h, list4, mdhVar);
                    if (objM16113h == omaVar) {
                        return omaVar;
                    }
                    mdiVar4 = mdiVar3;
                    lzcVar2 = new lzc((lzb) objM16113h, list4);
                    if (lzbVar3.f39603m) {
                        return lzcVar2;
                    }
                    lwz lwzVar6 = mdiVar4.f40083e;
                    mdhVar.f40067a = null;
                    mdhVar.f40072f = null;
                    mdhVar.f40068b = null;
                    mdhVar.f40073g = null;
                    mdhVar.f40071e = 7;
                    objM16113h = lwzVar6.m16106a(mauVar4, lzcVar2, mdhVar);
                    if (objM16113h == omaVar) {
                        return omaVar;
                    }
                    return objM16113h;
                }
                return omaVar;
            case 3:
                List list7 = mdhVar.f40073g;
                lzbVar3 = (lzb) mdhVar.f40068b;
                mau mauVar7 = mdhVar.f40072f;
                mdiVar2 = (mdi) mdhVar.f40067a;
                lkm.m15592s(objM16113h);
                list2 = list7;
                mauVar3 = mauVar7;
                ocqVar = (ocq) objM16113h;
                if (ocqVar.m18142ac()) {
                    iM18135M2 = ocqVar.m18135M(null);
                    if (iM18135M2 < 0) {
                        throw new IllegalStateException("serialized size must be non-negative, was " + iM18135M2);
                    }
                } else {
                    i = ocqVar.f44980aI & Integer.MAX_VALUE;
                    if (i != Integer.MAX_VALUE) {
                        iM18135M2 = i;
                    } else {
                        iM18135M = ocqVar.m18135M(null);
                        if (iM18135M >= 0) {
                            throw new IllegalStateException("serialized size must be non-negative, was " + iM18135M);
                        }
                        ocqVar.f44980aI = (Integer.MIN_VALUE & ocqVar.f44980aI) | iM18135M;
                        iM18135M2 = iM18135M;
                    }
                }
                mdzVar = new mdz(lzbVar3, iM18135M2);
                mavVar = mdiVar2.f40080b;
                oerVar = oer.ERROR_UPDATE;
                listM18668H = omn.m18668H(lzbVar3);
                lzv lzvVar4 = mdiVar2.f40082d;
                double dM16332a4 = mdzVar.m16332a(0L);
                mdhVar.f40067a = mdiVar2;
                mdhVar.f40072f = mauVar3;
                mdhVar.f40068b = lzbVar3;
                mdhVar.f40073g = list2;
                mdhVar.f40074h = ocqVar;
                mdhVar.f40075i = mdzVar;
                mdhVar.f40076j = oerVar;
                mdhVar.f40077k = mavVar;
                mdhVar.f40078l = listM18668H;
                mdhVar.f40071e = 4;
                objM16261h = lzvVar4.m16261h(lzbVar3, dM16332a4, mdhVar);
                if (objM16261h != omaVar) {
                    return omaVar;
                }
                mdzVar2 = mdzVar;
                mdiVar3 = mdiVar2;
                list4 = list2;
                ocqVar2 = ocqVar;
                objM16113h = objM16261h;
                mauVar4 = mauVar3;
                lwz lwzVar7 = mdiVar3.f40086h;
                mdhVar.f40067a = mdiVar3;
                mdhVar.f40072f = mauVar4;
                mdhVar.f40068b = lzbVar3;
                mdhVar.f40073g = list4;
                mdhVar.f40074h = null;
                mdhVar.f40075i = null;
                mdhVar.f40076j = null;
                mdhVar.f40077k = null;
                mdhVar.f40078l = null;
                mdhVar.f40071e = 6;
                objM16113h = lwzVar7.m16113h(mauVar4, ocqVar2, mdzVar2, (lzb) objM16113h, list4, mdhVar);
                if (objM16113h == omaVar) {
                    return omaVar;
                }
                mdiVar4 = mdiVar3;
                lzcVar2 = new lzc((lzb) objM16113h, list4);
                if (lzbVar3.f39603m) {
                    return lzcVar2;
                }
                lwz lwzVar8 = mdiVar4.f40083e;
                mdhVar.f40067a = null;
                mdhVar.f40072f = null;
                mdhVar.f40068b = null;
                mdhVar.f40073g = null;
                mdhVar.f40071e = 7;
                objM16113h = lwzVar8.m16106a(mauVar4, lzcVar2, mdhVar);
                if (objM16113h == omaVar) {
                    return omaVar;
                }
                return objM16113h;
            case 4:
                list3 = mdhVar.f40078l;
                mavVar = mdhVar.f40077k;
                oerVar = mdhVar.f40076j;
                mdz mdzVar3 = mdhVar.f40075i;
                ocq ocqVar3 = mdhVar.f40074h;
                list2 = mdhVar.f40073g;
                lzb lzbVar4 = (lzb) mdhVar.f40068b;
                mauVar3 = mdhVar.f40072f;
                mdi mdiVar6 = (mdi) mdhVar.f40067a;
                try {
                    lkm.m15592s(objM16113h);
                    lzbVar3 = lzbVar4;
                    mauVar4 = mauVar3;
                    mdiVar3 = mdiVar6;
                    mdzVar2 = mdzVar3;
                    list4 = list2;
                    ocqVar2 = ocqVar3;
                    lwz lwzVar9 = mdiVar3.f40086h;
                    mdhVar.f40067a = mdiVar3;
                    mdhVar.f40072f = mauVar4;
                    mdhVar.f40068b = lzbVar3;
                    mdhVar.f40073g = list4;
                    mdhVar.f40074h = null;
                    mdhVar.f40075i = null;
                    mdhVar.f40076j = null;
                    mdhVar.f40077k = null;
                    mdhVar.f40078l = null;
                    mdhVar.f40071e = 6;
                    objM16113h = lwzVar9.m16113h(mauVar4, ocqVar2, mdzVar2, (lzb) objM16113h, list4, mdhVar);
                    if (objM16113h == omaVar) {
                        return omaVar;
                    }
                    mdiVar4 = mdiVar3;
                    lzcVar2 = new lzc((lzb) objM16113h, list4);
                    if (lzbVar3.f39603m) {
                        return lzcVar2;
                    }
                    lwz lwzVar10 = mdiVar4.f40083e;
                    mdhVar.f40067a = null;
                    mdhVar.f40072f = null;
                    mdhVar.f40068b = null;
                    mdhVar.f40073g = null;
                    mdhVar.f40071e = 7;
                    objM16113h = lwzVar10.m16106a(mauVar4, lzcVar2, mdhVar);
                    if (objM16113h == omaVar) {
                        return omaVar;
                    }
                    return objM16113h;
                } catch (Throwable th2) {
                    th = th2;
                    if (!(th instanceof CancellationException)) {
                        throw th;
                    }
                    lvoVarM16280a = mauVar3.m16280a(list3, list2, oerVar, th);
                    mdhVar.f40067a = th;
                    mdhVar.f40072f = null;
                    mdhVar.f40068b = null;
                    mdhVar.f40073g = null;
                    mdhVar.f40074h = null;
                    mdhVar.f40075i = null;
                    mdhVar.f40076j = null;
                    mdhVar.f40077k = null;
                    mdhVar.f40078l = null;
                    mdhVar.f40071e = 5;
                    if (mavVar.m16285a(lvoVarM16280a, mdhVar) == omaVar) {
                        return omaVar;
                    }
                    throw th;
                }
            case 5:
                Throwable th3 = (Throwable) mdhVar.f40067a;
                lkm.m15592s(objM16113h);
                throw th3;
            case 6:
                list4 = mdhVar.f40073g;
                lzbVar3 = (lzb) mdhVar.f40068b;
                mauVar4 = mdhVar.f40072f;
                mdiVar4 = (mdi) mdhVar.f40067a;
                lkm.m15592s(objM16113h);
                lzcVar2 = new lzc((lzb) objM16113h, list4);
                if (lzbVar3.f39603m) {
                    return lzcVar2;
                }
                lwz lwzVar11 = mdiVar4.f40083e;
                mdhVar.f40067a = null;
                mdhVar.f40072f = null;
                mdhVar.f40068b = null;
                mdhVar.f40073g = null;
                mdhVar.f40071e = 7;
                objM16113h = lwzVar11.m16106a(mauVar4, lzcVar2, mdhVar);
                if (objM16113h == omaVar) {
                    return omaVar;
                }
                return objM16113h;
            case 7:
                lkm.m15592s(objM16113h);
                return objM16113h;
            default:
                throw new IllegalStateException(CswIK.RucqURa);
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:34:0x011b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:35:0x011c  */
    /* JADX WARN: Code duplicated, block: B:40:0x0127  */
    /* JADX WARN: Code duplicated, block: B:42:0x0141 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:44:0x0143  */
    /* JADX WARN: Code duplicated, block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m16329b(mau mauVar, lzc lzcVar, ols olsVar) throws Throwable {
        mde mdeVar;
        lzb lzbVar;
        List list;
        mdi mdiVar;
        Throwable th;
        Object objM16292a;
        mav mavVar;
        oer oerVar;
        List listM18668H;
        List list2;
        mau mauVar2;
        Throwable th2;
        oer oerVar2;
        lzv lzvVar;
        lvo lvoVarM16280a;
        if (olsVar instanceof mde) {
            mdeVar = (mde) olsVar;
            int i = mdeVar.f40054h;
            if ((i & Integer.MIN_VALUE) != 0) {
                mdeVar.f40054h = i - Integer.MIN_VALUE;
            } else {
                mdeVar = new mde(this, olsVar);
            }
        } else {
            mdeVar = new mde(this, olsVar);
        }
        Object obj = mdeVar.f40052f;
        oma omaVar = oma.COROUTINE_SUSPENDED;
        switch (mdeVar.f40054h) {
            case 0:
                lkm.m15592s(obj);
                lzbVar = lzcVar.f39614a;
                list = lzcVar.f39615b;
                if (mdd.f40046a[lzbVar.f39610t.f39541e.ordinal()] == 1) {
                    mbb mbbVar = this.f40081c;
                    List listM18666F = omn.m18666F(lzcVar);
                    mdeVar.f40047a = this;
                    mdeVar.f40048b = mauVar;
                    mdeVar.f40049c = lzbVar;
                    mdeVar.f40050d = list;
                    mdeVar.f40054h = 1;
                    objM16292a = mbbVar.m16292a(mauVar, listM18666F, mdeVar);
                    if (objM16292a == omaVar) {
                        return omaVar;
                    }
                    mdiVar = this;
                    th = ((maz) objM16292a).f39748b;
                } else {
                    lwh lwhVar = lzbVar.f39610t.f39541e;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Resource upload state invalid ");
                    sb.append(lwhVar);
                    IllegalStateException illegalStateException = new IllegalStateException("Resource upload state invalid ".concat(lwhVar.toString()));
                    mav mavVar2 = this.f40080b;
                    lvo lvoVarM16277c = mau.m16277c(mauVar, oer.ERROR_BAD_STATUS, illegalStateException, lzbVar, 8);
                    mdeVar.f40047a = this;
                    mdeVar.f40048b = mauVar;
                    mdeVar.f40049c = lzbVar;
                    mdeVar.f40050d = list;
                    mdeVar.f40051e = illegalStateException;
                    mdeVar.f40054h = 2;
                    if (mavVar2.m16285a(lvoVarM16277c, mdeVar) == omaVar) {
                        return omaVar;
                    }
                    mdiVar = this;
                    th = illegalStateException;
                }
                if (th == null) {
                    return oki.f46196a;
                }
                mavVar = mdiVar.f40080b;
                oerVar = oer.ERROR_UPDATE;
                listM18668H = omn.m18668H(lzbVar);
                try {
                    lzvVar = mdiVar.f40082d;
                    mdeVar.f40047a = mauVar;
                    mdeVar.f40048b = list;
                    mdeVar.f40049c = th;
                    mdeVar.f40050d = oerVar;
                    mdeVar.f40051e = mavVar;
                    mdeVar.f40055i = listM18668H;
                    mdeVar.f40054h = 3;
                    if (lzvVar.mo16256a(lzbVar, mdeVar) == omaVar) {
                        return omaVar;
                    }
                    throw th;
                } catch (Throwable th3) {
                    list2 = list;
                    mauVar2 = mauVar;
                    th2 = th3;
                    oerVar2 = oerVar;
                    if (!(th2 instanceof CancellationException)) {
                        throw th2;
                    }
                    lvoVarM16280a = mauVar2.m16280a(listM18668H, list2, oerVar2, th2);
                    mdeVar.f40047a = th2;
                    mdeVar.f40048b = null;
                    mdeVar.f40049c = null;
                    mdeVar.f40050d = null;
                    mdeVar.f40051e = null;
                    mdeVar.f40055i = null;
                    mdeVar.f40054h = 4;
                    if (mavVar.m16285a(lvoVarM16280a, mdeVar) == omaVar) {
                        return omaVar;
                    }
                    throw th2;
                }
            case 1:
                List list3 = (List) mdeVar.f40050d;
                lzb lzbVar2 = (lzb) mdeVar.f40049c;
                mau mauVar3 = (mau) mdeVar.f40048b;
                mdi mdiVar2 = (mdi) mdeVar.f40047a;
                lkm.m15592s(obj);
                mdiVar = mdiVar2;
                list = list3;
                mauVar = mauVar3;
                lzbVar = lzbVar2;
                objM16292a = obj;
                th = ((maz) objM16292a).f39748b;
                if (th == null) {
                    return oki.f46196a;
                }
                mavVar = mdiVar.f40080b;
                oerVar = oer.ERROR_UPDATE;
                listM18668H = omn.m18668H(lzbVar);
                lzvVar = mdiVar.f40082d;
                mdeVar.f40047a = mauVar;
                mdeVar.f40048b = list;
                mdeVar.f40049c = th;
                mdeVar.f40050d = oerVar;
                mdeVar.f40051e = mavVar;
                mdeVar.f40055i = listM18668H;
                mdeVar.f40054h = 3;
                if (lzvVar.mo16256a(lzbVar, mdeVar) == omaVar) {
                    return omaVar;
                }
                throw th;
            case 2:
                IllegalStateException illegalStateException2 = (IllegalStateException) mdeVar.f40051e;
                List list4 = (List) mdeVar.f40050d;
                lzbVar = (lzb) mdeVar.f40049c;
                mau mauVar4 = (mau) mdeVar.f40048b;
                mdiVar = (mdi) mdeVar.f40047a;
                lkm.m15592s(obj);
                list = list4;
                th = illegalStateException2;
                mauVar = mauVar4;
                if (th == null) {
                    return oki.f46196a;
                }
                mavVar = mdiVar.f40080b;
                oerVar = oer.ERROR_UPDATE;
                listM18668H = omn.m18668H(lzbVar);
                lzvVar = mdiVar.f40082d;
                mdeVar.f40047a = mauVar;
                mdeVar.f40048b = list;
                mdeVar.f40049c = th;
                mdeVar.f40050d = oerVar;
                mdeVar.f40051e = mavVar;
                mdeVar.f40055i = listM18668H;
                mdeVar.f40054h = 3;
                if (lzvVar.mo16256a(lzbVar, mdeVar) == omaVar) {
                    return omaVar;
                }
                throw th;
            case 3:
                List list5 = mdeVar.f40055i;
                mavVar = (mav) mdeVar.f40051e;
                oerVar2 = (oer) mdeVar.f40050d;
                Throwable th4 = (Throwable) mdeVar.f40049c;
                list2 = (List) mdeVar.f40048b;
                mauVar2 = (mau) mdeVar.f40047a;
                try {
                    lkm.m15592s(obj);
                    throw th4;
                } catch (Throwable th5) {
                    listM18668H = list5;
                    th2 = th5;
                    if (!(th2 instanceof CancellationException)) {
                        throw th2;
                    }
                    lvoVarM16280a = mauVar2.m16280a(listM18668H, list2, oerVar2, th2);
                    mdeVar.f40047a = th2;
                    mdeVar.f40048b = null;
                    mdeVar.f40049c = null;
                    mdeVar.f40050d = null;
                    mdeVar.f40051e = null;
                    mdeVar.f40055i = null;
                    mdeVar.f40054h = 4;
                    if (mavVar.m16285a(lvoVarM16280a, mdeVar) == omaVar) {
                        return omaVar;
                    }
                    throw th2;
                }
            case 4:
                Throwable th6 = (Throwable) mdeVar.f40047a;
                lkm.m15592s(obj);
                throw th6;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0230  */
    /* JADX WARN: Code duplicated, block: B:103:0x0238  */
    /* JADX WARN: Code duplicated, block: B:107:0x0258  */
    /* JADX WARN: Code duplicated, block: B:111:0x027f  */
    /* JADX WARN: Code duplicated, block: B:113:0x028b  */
    /* JADX WARN: Code duplicated, block: B:115:0x029a  */
    /* JADX WARN: Code duplicated, block: B:117:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:121:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:123:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:129:0x02e6 A[Catch: all -> 0x0379, TryCatch #0 {all -> 0x0379, blocks: (B:126:0x02da, B:127:0x02e1, B:129:0x02e6, B:132:0x02f0, B:137:0x02fe, B:139:0x0304, B:140:0x0307, B:155:0x036c, B:135:0x02f6), top: B:223:0x02da }] */
    /* JADX WARN: Code duplicated, block: B:132:0x02f0 A[Catch: all -> 0x0379, LOOP:2: B:128:0x02e4->B:132:0x02f0, LOOP_END, TryCatch #0 {all -> 0x0379, blocks: (B:126:0x02da, B:127:0x02e1, B:129:0x02e6, B:132:0x02f0, B:137:0x02fe, B:139:0x0304, B:140:0x0307, B:155:0x036c, B:135:0x02f6), top: B:223:0x02da }] */
    /* JADX WARN: Code duplicated, block: B:134:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:135:0x02f6 A[Catch: all -> 0x0379, TryCatch #0 {all -> 0x0379, blocks: (B:126:0x02da, B:127:0x02e1, B:129:0x02e6, B:132:0x02f0, B:137:0x02fe, B:139:0x0304, B:140:0x0307, B:155:0x036c, B:135:0x02f6), top: B:223:0x02da }] */
    /* JADX WARN: Code duplicated, block: B:139:0x0304 A[Catch: all -> 0x0379, TryCatch #0 {all -> 0x0379, blocks: (B:126:0x02da, B:127:0x02e1, B:129:0x02e6, B:132:0x02f0, B:137:0x02fe, B:139:0x0304, B:140:0x0307, B:155:0x036c, B:135:0x02f6), top: B:223:0x02da }] */
    /* JADX WARN: Code duplicated, block: B:140:0x0307 A[Catch: all -> 0x0379, TRY_LEAVE, TryCatch #0 {all -> 0x0379, blocks: (B:126:0x02da, B:127:0x02e1, B:129:0x02e6, B:132:0x02f0, B:137:0x02fe, B:139:0x0304, B:140:0x0307, B:155:0x036c, B:135:0x02f6), top: B:223:0x02da }] */
    /* JADX WARN: Code duplicated, block: B:143:0x031f  */
    /* JADX WARN: Code duplicated, block: B:146:0x0332  */
    /* JADX WARN: Code duplicated, block: B:148:0x033a  */
    /* JADX WARN: Code duplicated, block: B:152:0x0351  */
    /* JADX WARN: Code duplicated, block: B:154:0x036b  */
    /* JADX WARN: Code duplicated, block: B:163:0x0382  */
    /* JADX WARN: Code duplicated, block: B:169:0x0398  */
    /* JADX WARN: Code duplicated, block: B:172:0x03a7  */
    /* JADX WARN: Code duplicated, block: B:176:0x03ce  */
    /* JADX WARN: Code duplicated, block: B:178:0x03da  */
    /* JADX WARN: Code duplicated, block: B:180:0x03e7  */
    /* JADX WARN: Code duplicated, block: B:182:0x03f3  */
    /* JADX WARN: Code duplicated, block: B:186:0x0406  */
    /* JADX WARN: Code duplicated, block: B:188:0x040e  */
    /* JADX WARN: Code duplicated, block: B:192:0x042a  */
    /* JADX WARN: Code duplicated, block: B:195:0x043e  */
    /* JADX WARN: Code duplicated, block: B:197:0x0444  */
    /* JADX WARN: Code duplicated, block: B:201:0x045b  */
    /* JADX WARN: Code duplicated, block: B:203:0x0475  */
    /* JADX WARN: Code duplicated, block: B:208:0x0486  */
    /* JADX WARN: Code duplicated, block: B:211:0x0495  */
    /* JADX WARN: Code duplicated, block: B:214:0x04a4  */
    /* JADX WARN: Code duplicated, block: B:216:0x04be  */
    /* JADX WARN: Code duplicated, block: B:219:0x04cd  */
    /* JADX WARN: Code duplicated, block: B:227:0x038c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:229:0x0386 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:233:0x02fe A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:235:0x02ef A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:236:0x0479 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:239:0x03c8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:24:0x0066  */
    /* JADX WARN: Code duplicated, block: B:25:0x0069  */
    /* JADX WARN: Code duplicated, block: B:32:0x007b  */
    /* JADX WARN: Code duplicated, block: B:35:0x0085  */
    /* JADX WARN: Code duplicated, block: B:36:0x0088  */
    /* JADX WARN: Code duplicated, block: B:41:0x0096  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d7 A[LOOP:4: B:48:0x00d1->B:50:0x00d7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:53:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:56:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:60:0x012f  */
    /* JADX WARN: Code duplicated, block: B:63:0x0141  */
    /* JADX WARN: Code duplicated, block: B:65:0x014d  */
    /* JADX WARN: Code duplicated, block: B:68:0x0164  */
    /* JADX WARN: Code duplicated, block: B:72:0x0177  */
    /* JADX WARN: Code duplicated, block: B:74:0x017f  */
    /* JADX WARN: Code duplicated, block: B:78:0x0192  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:80:0x019a  */
    /* JADX WARN: Code duplicated, block: B:89:0x01d0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:90:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:92:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:95:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:98:0x021f  */
    /* JADX INFO: renamed from: c */
    public final Object m16330c(mau mauVar, lzb lzbVar, List list, ols olsVar) throws IOException {
        mdf mdfVar;
        String str;
        List<lxm> list2;
        mdi mdiVar;
        nuw nuwVar;
        nxl nxlVarM18137O;
        ArrayList arrayList;
        Iterator it;
        nuw nuwVar2;
        nxy nxyVar;
        nxn nxnVar;
        lvn lvnVar;
        nut nutVar;
        ocl oclVar;
        nxl nxlVarM18137O2;
        nxd nxdVar;
        nxl nxlVarM18137O3;
        ArrayList arrayList2;
        ocq ocqVar;
        nxy nxyVar2;
        ArrayList arrayList3;
        ocq ocqVar2;
        nxy nxyVar3;
        ocm ocmVar;
        ocq ocqVar3;
        nxy nxyVar4;
        oco ocoVar;
        nxl nxlVarM18137O4;
        lvk lvkVar;
        String str2;
        nxq nxqVar;
        ocl oclVar2;
        ocn ocnVar;
        nxn nxnVar2;
        lvk lvkVar2;
        String str3;
        FileInputStream fileInputStream;
        ArrayList arrayList4;
        int iMin;
        byte[] bArr;
        int i;
        nwr nwrVarM17800v;
        int size;
        nwr nwrVarM17797s;
        ocl oclVar3;
        int i2;
        lve lveVar;
        lzb lzbVar2 = lzbVar;
        if (olsVar instanceof mdf) {
            mdfVar = (mdf) olsVar;
            int i3 = mdfVar.f40058c;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                mdfVar.f40058c = i3 - Integer.MIN_VALUE;
            } else {
                mdfVar = new mdf(this, olsVar);
            }
        } else {
            mdfVar = new mdf(this, olsVar);
        }
        Object objM16271b = mdfVar.f40056a;
        oma omaVar = oma.COROUTINE_SUSPENDED;
        int i4 = 1;
        switch (mdfVar.f40058c) {
            case 0:
                lkm.m15592s(objM16271b);
                if (lzbVar2.f39602l != null) {
                    list2 = list;
                    mdiVar = this;
                    str = null;
                } else {
                    str = lzbVar2.f39605o;
                    if (str == null) {
                        mao maoVar = this.f40084f;
                        mdfVar.f40059d = this;
                        mdfVar.f40060e = lzbVar2;
                        list2 = list;
                        mdfVar.f40061f = list2;
                        mdfVar.f40058c = 1;
                        objM16271b = maoVar.m16271b(mauVar, mdfVar);
                        if (objM16271b == omaVar) {
                            return omaVar;
                        }
                        mdiVar = this;
                        lveVar = (lve) objM16271b;
                        if (lveVar != null) {
                            str = lveVar.f39385a;
                        } else {
                            str = null;
                        }
                    } else {
                        list2 = list;
                        if (str.length() > 0) {
                            mdiVar = this;
                        } else {
                            mdiVar = this;
                            str = null;
                        }
                    }
                }
                nuwVar = lzbVar2.f39602l;
                if (nuwVar != null) {
                    if (ooc.m18737c(nuwVar, nuw.f44705d)) {
                        nuwVar = null;
                    }
                } else if (str == null || !lzbVar2.f39604n.isEmpty()) {
                    nxlVarM18137O = nuw.f44705d.m18137O();
                    nxlVarM18137O.getClass();
                    if (str != null) {
                        if (!nxlVarM18137O.f44974b.m18142ac()) {
                            nxlVarM18137O.mo18106p();
                        }
                        nuw nuwVar3 = (nuw) nxlVarM18137O.f44974b;
                        nuwVar3.f44707a = 3;
                        nuwVar3.f44708b = str;
                    }
                    Collections.unmodifiableList(((nuw) nxlVarM18137O.f44974b).f44709c).getClass();
                    List list3 = lzbVar2.f39604n;
                    arrayList = new ArrayList(omn.m18678R(list3));
                    it = list3.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((nfc) it.next()).toString());
                    }
                    if (!nxlVarM18137O.f44974b.m18142ac()) {
                        nxlVarM18137O.mo18106p();
                    }
                    nuwVar2 = (nuw) nxlVarM18137O.f44974b;
                    nxyVar = nuwVar2.f44709c;
                    if (!nxyVar.mo17770c()) {
                        nuwVar2.f44709c = nxq.m18127U(nxyVar);
                    }
                    nwb.m17749e(arrayList, nuwVar2.f44709c);
                    nxq nxqVarMo18103l = nxlVarM18137O.mo18103l();
                    nxqVarMo18103l.getClass();
                    nuwVar = (nuw) nxqVarMo18103l;
                } else {
                    nuwVar = null;
                }
                nxnVar = (nxn) ocq.f45502k.m18137O();
                nxnVar.getClass();
                nuu nuuVar = (nuu) lzbVar2.f39612v.mo18586a();
                nuuVar.getClass();
                if (!nxnVar.f44974b.m18142ac()) {
                    nxnVar.mo18106p();
                }
                ocq ocqVar4 = (ocq) nxnVar.f44974b;
                ocqVar4.f45505b = nuuVar;
                ocqVar4.f45504a |= 1;
                lvnVar = lzbVar2.f39613w;
                if (lvnVar != null) {
                    String strM16094b = lvnVar.m16094b();
                    if (!nxnVar.f44974b.m18142ac()) {
                        nxnVar.mo18106p();
                    }
                    ocq ocqVar5 = (ocq) nxnVar.f44974b;
                    ocqVar5.f45504a |= 2;
                    ocqVar5.f45506c = strM16094b;
                    if (!nxnVar.f44974b.m18142ac()) {
                        nxnVar.mo18106p();
                    }
                    ocq ocqVar6 = (ocq) nxnVar.f44974b;
                    ocqVar6.f45504a |= 128;
                    ocqVar6.f45510g = true;
                }
                nutVar = lzbVar2.f39609s;
                if (nutVar != null) {
                    if (!nxnVar.f44974b.m18142ac()) {
                        nxnVar.mo18106p();
                    }
                    ocq ocqVar7 = (ocq) nxnVar.f44974b;
                    ocqVar7.f45509f = nutVar;
                    ocqVar7.f45504a |= 64;
                }
                oclVar = lzbVar2.f39608r;
                if (oclVar != null) {
                    if (!nxnVar.f44974b.m18142ac()) {
                        nxnVar.mo18106p();
                    }
                    ocq ocqVar8 = (ocq) nxnVar.f44974b;
                    ocqVar8.f45508e = oclVar;
                    ocqVar8.f45504a |= 32;
                }
                nxlVarM18137O2 = nux.f44710e.m18137O();
                nxlVarM18137O2.getClass();
                nxdVar = lzbVar2.f39601k;
                if (nxdVar == null || nuwVar != null) {
                    if (nxdVar != null) {
                        nxlVarM18137O3 = nuv.f44700d.m18137O();
                        nxlVarM18137O3.getClass();
                        if (!nxlVarM18137O3.f44974b.m18142ac()) {
                            nxlVarM18137O3.mo18106p();
                        }
                        nuv nuvVar = (nuv) nxlVarM18137O3.f44974b;
                        nuvVar.f44703b = nxdVar;
                        nuvVar.f44702a |= 1;
                        nzw nzwVarM15687g = lle.m15687g(mdiVar.f40085g);
                        if (!nxlVarM18137O3.f44974b.m18142ac()) {
                            nxlVarM18137O3.mo18106p();
                        }
                        nuv nuvVar2 = (nuv) nxlVarM18137O3.f44974b;
                        nuvVar2.f44704c = nzwVarM15687g;
                        nuvVar2.f44702a |= 2;
                        nxq nxqVarMo18103l2 = nxlVarM18137O3.mo18103l();
                        nxqVarMo18103l2.getClass();
                        nuv nuvVar3 = (nuv) nxqVarMo18103l2;
                        if (!nxlVarM18137O2.f44974b.m18142ac()) {
                            nxlVarM18137O2.mo18106p();
                        }
                        nux nuxVar = (nux) nxlVarM18137O2.f44974b;
                        nuxVar.f44714c = nuvVar3;
                        nuxVar.f44712a |= 2;
                    }
                    if (nuwVar != null) {
                        if (!nxlVarM18137O2.f44974b.m18142ac()) {
                            nxlVarM18137O2.mo18106p();
                        }
                        nux nuxVar2 = (nux) nxlVarM18137O2.f44974b;
                        nuxVar2.f44715d = nuwVar;
                        nuxVar2.f44712a |= 4;
                    }
                } else {
                    if (!nxlVarM18137O2.f44974b.m18142ac()) {
                        nxlVarM18137O2.mo18106p();
                    }
                    nux nuxVar3 = (nux) nxlVarM18137O2.f44974b;
                    nuxVar3.f44712a |= 1;
                    nuxVar3.f44713b = true;
                }
                nxq nxqVarMo18103l3 = nxlVarM18137O2.mo18103l();
                nxqVarMo18103l3.getClass();
                nux nuxVar4 = (nux) nxqVarMo18103l3;
                if (!nxnVar.f44974b.m18142ac()) {
                    nxnVar.mo18106p();
                }
                ocq ocqVar9 = (ocq) nxnVar.f44974b;
                ocqVar9.f45507d = nuxVar4;
                ocqVar9.f45504a |= 16;
                Collections.unmodifiableList(ocqVar9.f45511h).getClass();
                arrayList2 = new ArrayList();
                for (lxm lxmVar : list2) {
                    if (lxmVar.f39512b == lvl.ANNOTATION) {
                        nxnVar2 = (nxn) ocn.f45483g.m18137O();
                        nxnVar2.getClass();
                        lvkVar2 = lxmVar.f39513c;
                        if (lvkVar2 != null) {
                            String strM16094b2 = lvkVar2.m16094b();
                            if (!nxnVar2.f44974b.m18142ac()) {
                                nxnVar2.mo18106p();
                            }
                            ocn ocnVar2 = (ocn) nxnVar2.f44974b;
                            ocnVar2.f45485a |= i4;
                            ocnVar2.f45486b = strM16094b2;
                        }
                        str3 = lxmVar.f39514d;
                        if (str3 != null) {
                            if (!nxnVar2.f44974b.m18142ac()) {
                                nxnVar2.mo18106p();
                            }
                            ocn ocnVar3 = (ocn) nxnVar2.f44974b;
                            ocnVar3.f45485a |= 2;
                            ocnVar3.f45487c = str3;
                        }
                        fileInputStream = new FileInputStream(mdiVar.f40087i.m1646s(lxmVar));
                        try {
                            arrayList4 = new ArrayList();
                            iMin = 256;
                            while (true) {
                                bArr = new byte[iMin];
                                i = 0;
                                while (i < iMin) {
                                    i2 = fileInputStream.read(bArr, i, iMin - i);
                                    if (i2 == -1) {
                                        if (i == 0) {
                                            nwrVarM17800v = null;
                                        } else {
                                            nwrVarM17800v = nwr.m17800v(bArr, 0, i);
                                        }
                                        if (nwrVarM17800v == null) {
                                            size = arrayList4.size();
                                            if (size == 0) {
                                                nwrVarM17797s = nwr.f44839b;
                                            } else {
                                                nwrVarM17797s = nwr.m17797s(arrayList4.iterator(), size);
                                            }
                                            omn.m18709n(fileInputStream, null);
                                            nwrVarM17797s.getClass();
                                            if (!nxnVar2.f44974b.m18142ac()) {
                                                nxnVar2.mo18106p();
                                            }
                                            ocn ocnVar4 = (ocn) nxnVar2.f44974b;
                                            ocnVar4.f45485a |= 4;
                                            ocnVar4.f45488d = nwrVarM17797s;
                                            oclVar3 = lxmVar.f39515e;
                                            if (oclVar3 != null) {
                                                if (!nxnVar2.f44974b.m18142ac()) {
                                                    nxnVar2.mo18106p();
                                                }
                                                ocn ocnVar5 = (ocn) nxnVar2.f44974b;
                                                ocnVar5.f45489e = oclVar3;
                                                ocnVar5.f45485a |= 8;
                                            }
                                            if (!nxnVar2.f44974b.m18142ac()) {
                                                nxnVar2.mo18106p();
                                            }
                                            ocn ocnVar6 = (ocn) nxnVar2.f44974b;
                                            ocnVar6.f45485a |= 16;
                                            ocnVar6.f45490f = true;
                                            nxq nxqVarMo18103l4 = nxnVar2.mo18103l();
                                            nxqVarMo18103l4.getClass();
                                            ocnVar = (ocn) nxqVarMo18103l4;
                                        } else {
                                            arrayList4.add(nwrVarM17800v);
                                            iMin = Math.min(iMin + iMin, 8192);
                                        }
                                    } else {
                                        i += i2;
                                    }
                                }
                                if (i == 0) {
                                    nwrVarM17800v = null;
                                } else {
                                    nwrVarM17800v = nwr.m17800v(bArr, 0, i);
                                }
                                if (nwrVarM17800v == null) {
                                    size = arrayList4.size();
                                    if (size == 0) {
                                        nwrVarM17797s = nwr.f44839b;
                                    } else {
                                        nwrVarM17797s = nwr.m17797s(arrayList4.iterator(), size);
                                    }
                                    omn.m18709n(fileInputStream, null);
                                    nwrVarM17797s.getClass();
                                    if (!nxnVar2.f44974b.m18142ac()) {
                                        nxnVar2.mo18106p();
                                    }
                                    ocn ocnVar7 = (ocn) nxnVar2.f44974b;
                                    ocnVar7.f45485a |= 4;
                                    ocnVar7.f45488d = nwrVarM17797s;
                                    oclVar3 = lxmVar.f39515e;
                                    if (oclVar3 != null) {
                                        if (!nxnVar2.f44974b.m18142ac()) {
                                            nxnVar2.mo18106p();
                                        }
                                        ocn ocnVar8 = (ocn) nxnVar2.f44974b;
                                        ocnVar8.f45489e = oclVar3;
                                        ocnVar8.f45485a |= 8;
                                    }
                                    if (!nxnVar2.f44974b.m18142ac()) {
                                        nxnVar2.mo18106p();
                                    }
                                    ocn ocnVar9 = (ocn) nxnVar2.f44974b;
                                    ocnVar9.f45485a |= 16;
                                    ocnVar9.f45490f = true;
                                    nxq nxqVarMo18103l5 = nxnVar2.mo18103l();
                                    nxqVarMo18103l5.getClass();
                                    ocnVar = (ocn) nxqVarMo18103l5;
                                } else {
                                    arrayList4.add(nwrVarM17800v);
                                    iMin = Math.min(iMin + iMin, 8192);
                                }
                            }
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                omn.m18709n(fileInputStream, th);
                                throw th2;
                            }
                        }
                    } else {
                        ocnVar = null;
                    }
                    if (ocnVar != null) {
                        arrayList2.add(ocnVar);
                        i4 = 1;
                    } else {
                        i4 = 1;
                    }
                }
                if (!nxnVar.f44974b.m18142ac()) {
                    nxnVar.mo18106p();
                }
                ocqVar = (ocq) nxnVar.f44974b;
                nxyVar2 = ocqVar.f45511h;
                if (!nxyVar2.mo17770c()) {
                    ocqVar.f45511h = nxq.m18127U(nxyVar2);
                }
                nwb.m17749e(arrayList2, ocqVar.f45511h);
                Collections.unmodifiableList(((ocq) nxnVar.f44974b).f45512i).getClass();
                arrayList3 = new ArrayList();
                for (lxm lxmVar2 : list2) {
                    if (lxmVar2.f39512b == lvl.ATTACHMENT) {
                        nxlVarM18137O4 = oco.f45492g.m18137O();
                        nxlVarM18137O4.getClass();
                        lvkVar = lxmVar2.f39513c;
                        if (lvkVar != null) {
                            String strM16094b3 = lvkVar.m16094b();
                            if (!nxlVarM18137O4.f44974b.m18142ac()) {
                                nxlVarM18137O4.mo18106p();
                            }
                            oco ocoVar2 = (oco) nxlVarM18137O4.f44974b;
                            ocoVar2.f45494a |= 1;
                            ocoVar2.f45495b = strM16094b3;
                        }
                        str2 = lxmVar2.f39514d;
                        if (str2 != null) {
                            if (!nxlVarM18137O4.f44974b.m18142ac()) {
                                nxlVarM18137O4.mo18106p();
                            }
                            oco ocoVar3 = (oco) nxlVarM18137O4.f44974b;
                            ocoVar3.f45494a |= 2;
                            ocoVar3.f45496c = str2;
                        }
                        String str4 = lxmVar2.f39518h;
                        str4.getClass();
                        if (!nxlVarM18137O4.f44974b.m18142ac()) {
                            nxlVarM18137O4.mo18106p();
                        }
                        nxqVar = nxlVarM18137O4.f44974b;
                        oco ocoVar4 = (oco) nxqVar;
                        ocoVar4.f45494a |= 4;
                        ocoVar4.f45497d = str4;
                        oclVar2 = lxmVar2.f39515e;
                        if (oclVar2 != null) {
                            if (!nxqVar.m18142ac()) {
                                nxlVarM18137O4.mo18106p();
                            }
                            oco ocoVar5 = (oco) nxlVarM18137O4.f44974b;
                            ocoVar5.f45498e = oclVar2;
                            ocoVar5.f45494a |= 8;
                        }
                        if (!nxlVarM18137O4.f44974b.m18142ac()) {
                            nxlVarM18137O4.mo18106p();
                        }
                        oco ocoVar6 = (oco) nxlVarM18137O4.f44974b;
                        ocoVar6.f45494a |= 32;
                        ocoVar6.f45499f = true;
                        nxq nxqVarMo18103l6 = nxlVarM18137O4.mo18103l();
                        nxqVarMo18103l6.getClass();
                        ocoVar = (oco) nxqVarMo18103l6;
                    } else {
                        ocoVar = null;
                    }
                    if (ocoVar != null) {
                        arrayList3.add(ocoVar);
                    }
                }
                if (!nxnVar.f44974b.m18142ac()) {
                    nxnVar.mo18106p();
                }
                ocqVar2 = (ocq) nxnVar.f44974b;
                nxyVar3 = ocqVar2.f45512i;
                if (!nxyVar3.mo17770c()) {
                    ocqVar2.f45512i = nxq.m18127U(nxyVar3);
                }
                nwb.m17749e(arrayList3, ocqVar2.f45512i);
                ocmVar = lzbVar2.f39607q;
                if (ocmVar != null) {
                    Collections.unmodifiableList(((ocq) nxnVar.f44974b).f45513j).getClass();
                    nxy nxyVar5 = ocmVar.f45482a;
                    nxyVar5.getClass();
                    if (!nxnVar.f44974b.m18142ac()) {
                        nxnVar.mo18106p();
                    }
                    ocqVar3 = (ocq) nxnVar.f44974b;
                    nxyVar4 = ocqVar3.f45513j;
                    if (!nxyVar4.mo17770c()) {
                        ocqVar3.f45513j = nxq.m18127U(nxyVar4);
                    }
                    nwb.m17749e(nxyVar5, ocqVar3.f45513j);
                }
                nxq nxqVarMo18103l7 = nxnVar.mo18103l();
                nxqVarMo18103l7.getClass();
                return (ocq) nxqVarMo18103l7;
            case 1:
                List list4 = mdfVar.f40061f;
                lzb lzbVar3 = mdfVar.f40060e;
                mdiVar = mdfVar.f40059d;
                lkm.m15592s(objM16271b);
                list2 = list4;
                lzbVar2 = lzbVar3;
                lveVar = (lve) objM16271b;
                if (lveVar != null) {
                    str = lveVar.f39385a;
                } else {
                    str = null;
                }
                nuwVar = lzbVar2.f39602l;
                if (nuwVar != null) {
                    if (ooc.m18737c(nuwVar, nuw.f44705d)) {
                        nuwVar = null;
                    }
                } else if (str == null) {
                    nxlVarM18137O = nuw.f44705d.m18137O();
                    nxlVarM18137O.getClass();
                    if (str != null) {
                        if (!nxlVarM18137O.f44974b.m18142ac()) {
                            nxlVarM18137O.mo18106p();
                        }
                        nuw nuwVar4 = (nuw) nxlVarM18137O.f44974b;
                        nuwVar4.f44707a = 3;
                        nuwVar4.f44708b = str;
                    }
                    Collections.unmodifiableList(((nuw) nxlVarM18137O.f44974b).f44709c).getClass();
                    List list5 = lzbVar2.f39604n;
                    arrayList = new ArrayList(omn.m18678R(list5));
                    it = list5.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((nfc) it.next()).toString());
                    }
                    if (!nxlVarM18137O.f44974b.m18142ac()) {
                        nxlVarM18137O.mo18106p();
                    }
                    nuwVar2 = (nuw) nxlVarM18137O.f44974b;
                    nxyVar = nuwVar2.f44709c;
                    if (!nxyVar.mo17770c()) {
                        nuwVar2.f44709c = nxq.m18127U(nxyVar);
                    }
                    nwb.m17749e(arrayList, nuwVar2.f44709c);
                    nxq nxqVarMo18103l8 = nxlVarM18137O.mo18103l();
                    nxqVarMo18103l8.getClass();
                    nuwVar = (nuw) nxqVarMo18103l8;
                } else {
                    nxlVarM18137O = nuw.f44705d.m18137O();
                    nxlVarM18137O.getClass();
                    if (str != null) {
                        if (!nxlVarM18137O.f44974b.m18142ac()) {
                            nxlVarM18137O.mo18106p();
                        }
                        nuw nuwVar5 = (nuw) nxlVarM18137O.f44974b;
                        nuwVar5.f44707a = 3;
                        nuwVar5.f44708b = str;
                    }
                    Collections.unmodifiableList(((nuw) nxlVarM18137O.f44974b).f44709c).getClass();
                    List list6 = lzbVar2.f39604n;
                    arrayList = new ArrayList(omn.m18678R(list6));
                    it = list6.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((nfc) it.next()).toString());
                    }
                    if (!nxlVarM18137O.f44974b.m18142ac()) {
                        nxlVarM18137O.mo18106p();
                    }
                    nuwVar2 = (nuw) nxlVarM18137O.f44974b;
                    nxyVar = nuwVar2.f44709c;
                    if (!nxyVar.mo17770c()) {
                        nuwVar2.f44709c = nxq.m18127U(nxyVar);
                    }
                    nwb.m17749e(arrayList, nuwVar2.f44709c);
                    nxq nxqVarMo18103l9 = nxlVarM18137O.mo18103l();
                    nxqVarMo18103l9.getClass();
                    nuwVar = (nuw) nxqVarMo18103l9;
                }
                nxnVar = (nxn) ocq.f45502k.m18137O();
                nxnVar.getClass();
                nuu nuuVar2 = (nuu) lzbVar2.f39612v.mo18586a();
                nuuVar2.getClass();
                if (!nxnVar.f44974b.m18142ac()) {
                    nxnVar.mo18106p();
                }
                ocq ocqVar10 = (ocq) nxnVar.f44974b;
                ocqVar10.f45505b = nuuVar2;
                ocqVar10.f45504a |= 1;
                lvnVar = lzbVar2.f39613w;
                if (lvnVar != null) {
                    String strM16094b4 = lvnVar.m16094b();
                    if (!nxnVar.f44974b.m18142ac()) {
                        nxnVar.mo18106p();
                    }
                    ocq ocqVar11 = (ocq) nxnVar.f44974b;
                    ocqVar11.f45504a |= 2;
                    ocqVar11.f45506c = strM16094b4;
                    if (!nxnVar.f44974b.m18142ac()) {
                        nxnVar.mo18106p();
                    }
                    ocq ocqVar12 = (ocq) nxnVar.f44974b;
                    ocqVar12.f45504a |= 128;
                    ocqVar12.f45510g = true;
                }
                nutVar = lzbVar2.f39609s;
                if (nutVar != null) {
                    if (!nxnVar.f44974b.m18142ac()) {
                        nxnVar.mo18106p();
                    }
                    ocq ocqVar13 = (ocq) nxnVar.f44974b;
                    ocqVar13.f45509f = nutVar;
                    ocqVar13.f45504a |= 64;
                }
                oclVar = lzbVar2.f39608r;
                if (oclVar != null) {
                    if (!nxnVar.f44974b.m18142ac()) {
                        nxnVar.mo18106p();
                    }
                    ocq ocqVar14 = (ocq) nxnVar.f44974b;
                    ocqVar14.f45508e = oclVar;
                    ocqVar14.f45504a |= 32;
                }
                nxlVarM18137O2 = nux.f44710e.m18137O();
                nxlVarM18137O2.getClass();
                nxdVar = lzbVar2.f39601k;
                if (nxdVar == null) {
                    if (nxdVar != null) {
                        nxlVarM18137O3 = nuv.f44700d.m18137O();
                        nxlVarM18137O3.getClass();
                        if (!nxlVarM18137O3.f44974b.m18142ac()) {
                            nxlVarM18137O3.mo18106p();
                        }
                        nuv nuvVar4 = (nuv) nxlVarM18137O3.f44974b;
                        nuvVar4.f44703b = nxdVar;
                        nuvVar4.f44702a |= 1;
                        nzw nzwVarM15687g2 = lle.m15687g(mdiVar.f40085g);
                        if (!nxlVarM18137O3.f44974b.m18142ac()) {
                            nxlVarM18137O3.mo18106p();
                        }
                        nuv nuvVar5 = (nuv) nxlVarM18137O3.f44974b;
                        nuvVar5.f44704c = nzwVarM15687g2;
                        nuvVar5.f44702a |= 2;
                        nxq nxqVarMo18103l10 = nxlVarM18137O3.mo18103l();
                        nxqVarMo18103l10.getClass();
                        nuv nuvVar6 = (nuv) nxqVarMo18103l10;
                        if (!nxlVarM18137O2.f44974b.m18142ac()) {
                            nxlVarM18137O2.mo18106p();
                        }
                        nux nuxVar5 = (nux) nxlVarM18137O2.f44974b;
                        nuxVar5.f44714c = nuvVar6;
                        nuxVar5.f44712a |= 2;
                    }
                    if (nuwVar != null) {
                        if (!nxlVarM18137O2.f44974b.m18142ac()) {
                            nxlVarM18137O2.mo18106p();
                        }
                        nux nuxVar6 = (nux) nxlVarM18137O2.f44974b;
                        nuxVar6.f44715d = nuwVar;
                        nuxVar6.f44712a |= 4;
                    }
                } else {
                    if (nxdVar != null) {
                        nxlVarM18137O3 = nuv.f44700d.m18137O();
                        nxlVarM18137O3.getClass();
                        if (!nxlVarM18137O3.f44974b.m18142ac()) {
                            nxlVarM18137O3.mo18106p();
                        }
                        nuv nuvVar7 = (nuv) nxlVarM18137O3.f44974b;
                        nuvVar7.f44703b = nxdVar;
                        nuvVar7.f44702a |= 1;
                        nzw nzwVarM15687g3 = lle.m15687g(mdiVar.f40085g);
                        if (!nxlVarM18137O3.f44974b.m18142ac()) {
                            nxlVarM18137O3.mo18106p();
                        }
                        nuv nuvVar8 = (nuv) nxlVarM18137O3.f44974b;
                        nuvVar8.f44704c = nzwVarM15687g3;
                        nuvVar8.f44702a |= 2;
                        nxq nxqVarMo18103l11 = nxlVarM18137O3.mo18103l();
                        nxqVarMo18103l11.getClass();
                        nuv nuvVar9 = (nuv) nxqVarMo18103l11;
                        if (!nxlVarM18137O2.f44974b.m18142ac()) {
                            nxlVarM18137O2.mo18106p();
                        }
                        nux nuxVar7 = (nux) nxlVarM18137O2.f44974b;
                        nuxVar7.f44714c = nuvVar9;
                        nuxVar7.f44712a |= 2;
                    }
                    if (nuwVar != null) {
                        if (!nxlVarM18137O2.f44974b.m18142ac()) {
                            nxlVarM18137O2.mo18106p();
                        }
                        nux nuxVar8 = (nux) nxlVarM18137O2.f44974b;
                        nuxVar8.f44715d = nuwVar;
                        nuxVar8.f44712a |= 4;
                    }
                }
                nxq nxqVarMo18103l12 = nxlVarM18137O2.mo18103l();
                nxqVarMo18103l12.getClass();
                nux nuxVar9 = (nux) nxqVarMo18103l12;
                if (!nxnVar.f44974b.m18142ac()) {
                    nxnVar.mo18106p();
                }
                ocq ocqVar15 = (ocq) nxnVar.f44974b;
                ocqVar15.f45507d = nuxVar9;
                ocqVar15.f45504a |= 16;
                Collections.unmodifiableList(ocqVar15.f45511h).getClass();
                arrayList2 = new ArrayList();
                while (r8.hasNext()) {
                    if (lxmVar.f39512b == lvl.ANNOTATION) {
                        nxnVar2 = (nxn) ocn.f45483g.m18137O();
                        nxnVar2.getClass();
                        lvkVar2 = lxmVar.f39513c;
                        if (lvkVar2 != null) {
                            String strM16094b5 = lvkVar2.m16094b();
                            if (!nxnVar2.f44974b.m18142ac()) {
                                nxnVar2.mo18106p();
                            }
                            ocn ocnVar10 = (ocn) nxnVar2.f44974b;
                            ocnVar10.f45485a |= i4;
                            ocnVar10.f45486b = strM16094b5;
                        }
                        str3 = lxmVar.f39514d;
                        if (str3 != null) {
                            if (!nxnVar2.f44974b.m18142ac()) {
                                nxnVar2.mo18106p();
                            }
                            ocn ocnVar11 = (ocn) nxnVar2.f44974b;
                            ocnVar11.f45485a |= 2;
                            ocnVar11.f45487c = str3;
                        }
                        fileInputStream = new FileInputStream(mdiVar.f40087i.m1646s(lxmVar));
                        arrayList4 = new ArrayList();
                        iMin = 256;
                        while (true) {
                            bArr = new byte[iMin];
                            i = 0;
                            while (i < iMin) {
                                i2 = fileInputStream.read(bArr, i, iMin - i);
                                if (i2 == -1) {
                                    if (i == 0) {
                                        nwrVarM17800v = null;
                                    } else {
                                        nwrVarM17800v = nwr.m17800v(bArr, 0, i);
                                    }
                                    if (nwrVarM17800v == null) {
                                        size = arrayList4.size();
                                        if (size == 0) {
                                            nwrVarM17797s = nwr.f44839b;
                                        } else {
                                            nwrVarM17797s = nwr.m17797s(arrayList4.iterator(), size);
                                        }
                                        omn.m18709n(fileInputStream, null);
                                        nwrVarM17797s.getClass();
                                        if (!nxnVar2.f44974b.m18142ac()) {
                                            nxnVar2.mo18106p();
                                        }
                                        ocn ocnVar12 = (ocn) nxnVar2.f44974b;
                                        ocnVar12.f45485a |= 4;
                                        ocnVar12.f45488d = nwrVarM17797s;
                                        oclVar3 = lxmVar.f39515e;
                                        if (oclVar3 != null) {
                                            if (!nxnVar2.f44974b.m18142ac()) {
                                                nxnVar2.mo18106p();
                                            }
                                            ocn ocnVar13 = (ocn) nxnVar2.f44974b;
                                            ocnVar13.f45489e = oclVar3;
                                            ocnVar13.f45485a |= 8;
                                        }
                                        if (!nxnVar2.f44974b.m18142ac()) {
                                            nxnVar2.mo18106p();
                                        }
                                        ocn ocnVar14 = (ocn) nxnVar2.f44974b;
                                        ocnVar14.f45485a |= 16;
                                        ocnVar14.f45490f = true;
                                        nxq nxqVarMo18103l13 = nxnVar2.mo18103l();
                                        nxqVarMo18103l13.getClass();
                                        ocnVar = (ocn) nxqVarMo18103l13;
                                    } else {
                                        arrayList4.add(nwrVarM17800v);
                                        iMin = Math.min(iMin + iMin, 8192);
                                    }
                                } else {
                                    i += i2;
                                }
                            }
                            if (i == 0) {
                                nwrVarM17800v = null;
                            } else {
                                nwrVarM17800v = nwr.m17800v(bArr, 0, i);
                            }
                            if (nwrVarM17800v == null) {
                                size = arrayList4.size();
                                if (size == 0) {
                                    nwrVarM17797s = nwr.f44839b;
                                } else {
                                    nwrVarM17797s = nwr.m17797s(arrayList4.iterator(), size);
                                }
                                omn.m18709n(fileInputStream, null);
                                nwrVarM17797s.getClass();
                                if (!nxnVar2.f44974b.m18142ac()) {
                                    nxnVar2.mo18106p();
                                }
                                ocn ocnVar15 = (ocn) nxnVar2.f44974b;
                                ocnVar15.f45485a |= 4;
                                ocnVar15.f45488d = nwrVarM17797s;
                                oclVar3 = lxmVar.f39515e;
                                if (oclVar3 != null) {
                                    if (!nxnVar2.f44974b.m18142ac()) {
                                        nxnVar2.mo18106p();
                                    }
                                    ocn ocnVar16 = (ocn) nxnVar2.f44974b;
                                    ocnVar16.f45489e = oclVar3;
                                    ocnVar16.f45485a |= 8;
                                }
                                if (!nxnVar2.f44974b.m18142ac()) {
                                    nxnVar2.mo18106p();
                                }
                                ocn ocnVar17 = (ocn) nxnVar2.f44974b;
                                ocnVar17.f45485a |= 16;
                                ocnVar17.f45490f = true;
                                nxq nxqVarMo18103l14 = nxnVar2.mo18103l();
                                nxqVarMo18103l14.getClass();
                                ocnVar = (ocn) nxqVarMo18103l14;
                            } else {
                                arrayList4.add(nwrVarM17800v);
                                iMin = Math.min(iMin + iMin, 8192);
                            }
                        }
                    } else {
                        ocnVar = null;
                    }
                    if (ocnVar != null) {
                        arrayList2.add(ocnVar);
                        i4 = 1;
                    } else {
                        i4 = 1;
                    }
                }
                if (!nxnVar.f44974b.m18142ac()) {
                    nxnVar.mo18106p();
                }
                ocqVar = (ocq) nxnVar.f44974b;
                nxyVar2 = ocqVar.f45511h;
                if (!nxyVar2.mo17770c()) {
                    ocqVar.f45511h = nxq.m18127U(nxyVar2);
                }
                nwb.m17749e(arrayList2, ocqVar.f45511h);
                Collections.unmodifiableList(((ocq) nxnVar.f44974b).f45512i).getClass();
                arrayList3 = new ArrayList();
                while (r4.hasNext()) {
                    if (lxmVar2.f39512b == lvl.ATTACHMENT) {
                        nxlVarM18137O4 = oco.f45492g.m18137O();
                        nxlVarM18137O4.getClass();
                        lvkVar = lxmVar2.f39513c;
                        if (lvkVar != null) {
                            String strM16094b6 = lvkVar.m16094b();
                            if (!nxlVarM18137O4.f44974b.m18142ac()) {
                                nxlVarM18137O4.mo18106p();
                            }
                            oco ocoVar7 = (oco) nxlVarM18137O4.f44974b;
                            ocoVar7.f45494a |= 1;
                            ocoVar7.f45495b = strM16094b6;
                        }
                        str2 = lxmVar2.f39514d;
                        if (str2 != null) {
                            if (!nxlVarM18137O4.f44974b.m18142ac()) {
                                nxlVarM18137O4.mo18106p();
                            }
                            oco ocoVar8 = (oco) nxlVarM18137O4.f44974b;
                            ocoVar8.f45494a |= 2;
                            ocoVar8.f45496c = str2;
                        }
                        String str5 = lxmVar2.f39518h;
                        str5.getClass();
                        if (!nxlVarM18137O4.f44974b.m18142ac()) {
                            nxlVarM18137O4.mo18106p();
                        }
                        nxqVar = nxlVarM18137O4.f44974b;
                        oco ocoVar9 = (oco) nxqVar;
                        ocoVar9.f45494a |= 4;
                        ocoVar9.f45497d = str5;
                        oclVar2 = lxmVar2.f39515e;
                        if (oclVar2 != null) {
                            if (!nxqVar.m18142ac()) {
                                nxlVarM18137O4.mo18106p();
                            }
                            oco ocoVar10 = (oco) nxlVarM18137O4.f44974b;
                            ocoVar10.f45498e = oclVar2;
                            ocoVar10.f45494a |= 8;
                        }
                        if (!nxlVarM18137O4.f44974b.m18142ac()) {
                            nxlVarM18137O4.mo18106p();
                        }
                        oco ocoVar11 = (oco) nxlVarM18137O4.f44974b;
                        ocoVar11.f45494a |= 32;
                        ocoVar11.f45499f = true;
                        nxq nxqVarMo18103l15 = nxlVarM18137O4.mo18103l();
                        nxqVarMo18103l15.getClass();
                        ocoVar = (oco) nxqVarMo18103l15;
                    } else {
                        ocoVar = null;
                    }
                    if (ocoVar != null) {
                        arrayList3.add(ocoVar);
                    }
                }
                if (!nxnVar.f44974b.m18142ac()) {
                    nxnVar.mo18106p();
                }
                ocqVar2 = (ocq) nxnVar.f44974b;
                nxyVar3 = ocqVar2.f45512i;
                if (!nxyVar3.mo17770c()) {
                    ocqVar2.f45512i = nxq.m18127U(nxyVar3);
                }
                nwb.m17749e(arrayList3, ocqVar2.f45512i);
                ocmVar = lzbVar2.f39607q;
                if (ocmVar != null) {
                    Collections.unmodifiableList(((ocq) nxnVar.f44974b).f45513j).getClass();
                    nxy nxyVar6 = ocmVar.f45482a;
                    nxyVar6.getClass();
                    if (!nxnVar.f44974b.m18142ac()) {
                        nxnVar.mo18106p();
                    }
                    ocqVar3 = (ocq) nxnVar.f44974b;
                    nxyVar4 = ocqVar3.f45513j;
                    if (!nxyVar4.mo17770c()) {
                        ocqVar3.f45513j = nxq.m18127U(nxyVar4);
                    }
                    nwb.m17749e(nxyVar6, ocqVar3.f45513j);
                }
                nxq nxqVarMo18103l16 = nxnVar.mo18103l();
                nxqVarMo18103l16.getClass();
                return (ocq) nxqVarMo18103l16;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
