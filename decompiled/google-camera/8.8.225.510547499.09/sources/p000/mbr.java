package p000;

import com.google.android.libraries.vision.visionkit.f250.internal.uploader.work.F250AutoWorker;
import com.google.android.libraries.vision.visionkit.f250.internal.uploader.work.F250Worker;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mbr implements mat {

    /* JADX INFO: renamed from: a */
    private final mav f39860a;

    /* JADX INFO: renamed from: b */
    private final ksi f39861b;

    /* JADX INFO: renamed from: c */
    private final ojy f39862c;

    public mbr(ohb ohbVar, mav mavVar, ksi ksiVar) {
        ohbVar.getClass();
        mavVar.getClass();
        ksiVar.getClass();
        this.f39860a = mavVar;
        this.f39861b = ksiVar;
        this.f39862c = lkm.m15593t(new mbq(ohbVar));
    }

    /* JADX INFO: renamed from: d */
    private final ayi m16301d() {
        return (ayi) this.f39862c.mo18586a();
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:102:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:106:0x021e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:107:0x021f  */
    /* JADX WARN: Code duplicated, block: B:110:0x0240 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:117:0x024c  */
    /* JADX WARN: Code duplicated, block: B:119:0x0266 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:122:0x0269  */
    /* JADX WARN: Code duplicated, block: B:124:0x0271  */
    /* JADX WARN: Code duplicated, block: B:126:0x0295 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:141:0x00f0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:144:0x010e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:59:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:62:0x0101  */
    /* JADX WARN: Code duplicated, block: B:65:0x010e  */
    /* JADX WARN: Code duplicated, block: B:67:0x0111  */
    /* JADX WARN: Code duplicated, block: B:68:0x011a  */
    /* JADX WARN: Code duplicated, block: B:71:0x0121  */
    /* JADX WARN: Code duplicated, block: B:72:0x0123  */
    /* JADX WARN: Code duplicated, block: B:75:0x0137  */
    /* JADX WARN: Code duplicated, block: B:77:0x013d  */
    /* JADX WARN: Code duplicated, block: B:78:0x0140 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:79:0x0142  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:80:0x0144  */
    /* JADX WARN: Code duplicated, block: B:81:0x0146 A[DONT_INVERT, PHI: r16
      0x0146: PHI (r16v1 int) = (r16v0 int), (r16v2 int), (r16v3 int) binds: [B:73:0x0134, B:80:0x0144, B:77:0x013d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:85:0x017a  */
    /* JADX WARN: Code duplicated, block: B:87:0x018e  */
    /* JADX WARN: Code duplicated, block: B:88:0x0190  */
    /* JADX WARN: Code duplicated, block: B:90:0x0198  */
    /* JADX WARN: Code duplicated, block: B:92:0x019b  */
    /* JADX WARN: Code duplicated, block: B:95:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:97:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:98:0x01db  */
    /* JADX WARN: Instruction removed from duplicated block: B:124:0x0271, please report this as an issue */
    @Override // p000.mat
    /* JADX INFO: renamed from: a */
    public final Object mo16275a(mau mauVar, nzw nzwVar, ols olsVar) throws Throwable {
        mbo mboVar;
        mau mauVar2;
        nzw nzwVar2;
        mbr mbrVar;
        mav mavVar;
        lvo lvoVarM16277c;
        mau mauVar3;
        nzw nzwVar3;
        List list;
        ListIterator listIterator;
        Object objPrevious;
        ayh ayhVar;
        Long lM18799m;
        nzw nzwVarM18392b;
        long j;
        long j2;
        int i;
        int i2;
        int i3;
        ayj ayjVar;
        long jM14996an;
        int i4;
        int i5;
        int i6;
        nzw nzwVar4;
        long j3;
        int i7;
        nxd nxdVarM18389a;
        long jM14994al;
        long jM18391a;
        mav mavVar2;
        oer oerVar;
        okv okvVar;
        mau mauVar4;
        oer oerVar2;
        okv okvVar2;
        bev bevVar;
        Iterator it;
        lvo lvoVarM16280a;
        mav mavVar3;
        lvo lvoVarM16279e;
        if (olsVar instanceof mbo) {
            mboVar = (mbo) olsVar;
            int i8 = mboVar.f39845e;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                mboVar.f39845e = i8 - Integer.MIN_VALUE;
            } else {
                mboVar = new mbo(this, olsVar);
            }
        } else {
            mboVar = new mbo(this, olsVar);
        }
        Object objM15644am = mboVar.f39843c;
        oma omaVar = oma.COROUTINE_SUSPENDED;
        int i9 = 2;
        switch (mboVar.f39845e) {
            case 0:
                lkm.m15592s(objM15644am);
                try {
                    nps npsVarMo2101a = m16301d().mo2101a("F250_AUTO_WORKER_TAG");
                    mboVar.f39841a = this;
                    mauVar2 = mauVar;
                    try {
                        mboVar.f39846f = mauVar2;
                        nzwVar2 = nzwVar;
                        try {
                            mboVar.f39842b = nzwVar2;
                            mboVar.f39845e = 1;
                            objM15644am = lku.m15644am(npsVarMo2101a, mboVar);
                            if (objM15644am == omaVar) {
                                return omaVar;
                            }
                            mbrVar = this;
                            try {
                                list = (List) objM15644am;
                                break;
                            } catch (Throwable th) {
                                th = th;
                                mavVar = mbrVar.f39860a;
                                lvoVarM16277c = mau.m16277c(mauVar2, oer.ERROR_PARTIAL_QUERY_WORK, th, null, 12);
                                mboVar.f39841a = mbrVar;
                                mboVar.f39846f = mauVar2;
                                mboVar.f39842b = nzwVar2;
                                mboVar.f39845e = 2;
                                if (mavVar.m16285a(lvoVarM16277c, mboVar) != omaVar) {
                                    return omaVar;
                                }
                                nzw nzwVar5 = nzwVar2;
                                mauVar3 = mauVar2;
                                nzwVar3 = nzwVar5;
                                list = okv.f46215a;
                                mau mauVar5 = mauVar3;
                                nzwVar2 = nzwVar3;
                                mauVar2 = mauVar5;
                            }
                            list.getClass();
                            listIterator = list.listIterator(list.size());
                            do {
                                if (listIterator.hasPrevious()) {
                                    objPrevious = listIterator.previous();
                                } else {
                                    objPrevious = null;
                                }
                                ayhVar = (ayh) objPrevious;
                                if (ayhVar != null) {
                                    it = ayhVar.f2714a.iterator();
                                    do {
                                        if (it.hasNext()) {
                                            lM18799m = ook.m18799m((String) it.next());
                                        } else {
                                            lM18799m = null;
                                        }
                                    } while (lM18799m == null);
                                } else {
                                    lM18799m = null;
                                }
                                if (lM18799m != null) {
                                    nzwVarM18392b = oaq.m18392b(lM18799m.longValue());
                                } else {
                                    nzwVarM18392b = oaq.f45169b;
                                }
                                nzwVarM18392b.getClass();
                                if (ayhVar == null) {
                                    i9 = 4;
                                } else {
                                    nzwVar2.getClass();
                                    oaq.m18393c(nzwVar2);
                                    oaq.m18393c(nzwVarM18392b);
                                    j = nzwVar2.f45103a;
                                    j2 = nzwVarM18392b.f45103a;
                                    i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
                                    if (j == j2) {
                                        i2 = nzwVar2.f45104b;
                                        i3 = nzwVarM18392b.f45104b;
                                        if (i2 == i3) {
                                            i = 0;
                                        } else if (i2 < i3) {
                                            i9 = 1;
                                        } else {
                                            i = 1;
                                        }
                                        if (i < 0) {
                                            i9 = 1;
                                        }
                                    } else if (i < 0) {
                                        i9 = 1;
                                    }
                                }
                                ayjVar = new ayj(F250AutoWorker.class);
                                nzw nzwVarM15687g = lle.m15687g(mbrVar.f39861b);
                                nzwVar2.getClass();
                                oaq.m18393c(nzwVarM15687g);
                                oaq.m18393c(nzwVar2);
                                jM14996an = kxk.m14996an(nzwVar2.f45103a, nzwVarM15687g.f45103a);
                                i4 = nzwVar2.f45104b;
                                i5 = nzwVarM15687g.f45104b;
                                i6 = i9;
                                nzwVar4 = nzwVar2;
                                j3 = ((long) i4) - ((long) i5);
                                i7 = (int) j3;
                                if (j3 == i7) {
                                    throw new ArithmeticException("overflow: checkedSubtract(" + i4 + ", " + i5 + ")");
                                }
                                nxdVarM18389a = oao.m18389a(jM14996an, i7);
                                nxdVarM18389a.getClass();
                                if (ooc.m18737c(nxdVarM18389a, oao.f45167b)) {
                                    jM14994al = Long.MAX_VALUE;
                                } else if (ooc.m18737c(nxdVarM18389a, oao.f45166a)) {
                                    jM14994al = Long.MIN_VALUE;
                                } else {
                                    oao.m18390b(nxdVarM18389a);
                                    jM14994al = kxk.m14994al(kxk.m14995am(nxdVarM18389a.f44900a, 1000L), nxdVarM18389a.f44901b / 1000000);
                                }
                                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                                timeUnit.getClass();
                                ayjVar.f2722b.f2969f = timeUnit.toMillis(jM14994al);
                                if (Long.MAX_VALUE - System.currentTimeMillis() > ayjVar.f2722b.f2969f) {
                                    throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!");
                                }
                                nzwVar4.getClass();
                                if (ooc.m18737c(nzwVar4, oaq.f45169b)) {
                                    jM18391a = Long.MAX_VALUE;
                                } else if (ooc.m18737c(nzwVar4, oaq.f45168a)) {
                                    jM18391a = Long.MIN_VALUE;
                                } else {
                                    jM18391a = oaq.m18391a(nzwVar4);
                                }
                                ayjVar.m2105a(String.valueOf(jM18391a));
                                C1058va c1058vaM2106b = ayjVar.m2106b();
                                mavVar2 = mbrVar.f39860a;
                                oerVar = oer.ERROR_ENQUEUE_WORK;
                                okvVar = okv.f46215a;
                                try {
                                    bevVar = ((ayz) mbrVar.m16301d().m2104d("F250_AUTO_WORKER_TAG", i6, c1058vaM2106b)).f2738c;
                                    mboVar.f39841a = mbrVar;
                                    mboVar.f39846f = mauVar2;
                                    mboVar.f39842b = mavVar2;
                                    mboVar.f39848h = okvVar;
                                    mboVar.f39849i = okvVar;
                                    mboVar.f39847g = oerVar;
                                    mboVar.f39845e = 3;
                                    if (lku.m15644am(bevVar, mboVar) == omaVar) {
                                        return omaVar;
                                    }
                                    mauVar4 = mauVar2;
                                    mavVar3 = mbrVar.f39860a;
                                    lvoVarM16279e = mau.m16279e(mauVar4, null, null, oer.SUCCESS_PARTIAL_AUTO_WORK_ENQUEUED, 11);
                                    mboVar.f39841a = null;
                                    mboVar.f39846f = null;
                                    mboVar.f39842b = null;
                                    mboVar.f39848h = null;
                                    mboVar.f39849i = null;
                                    mboVar.f39847g = null;
                                    mboVar.f39845e = 5;
                                    if (mavVar3.m16285a(lvoVarM16279e, mboVar) == omaVar) {
                                        return omaVar;
                                    }
                                    return oki.f46196a;
                                } catch (Throwable th2) {
                                    th = th2;
                                    mauVar4 = mauVar2;
                                    oerVar2 = oerVar;
                                    okvVar2 = okvVar;
                                    if (!(th instanceof CancellationException)) {
                                        lvoVarM16280a = mauVar4.m16280a(okvVar2, okvVar, oerVar2, th);
                                        mboVar.f39841a = th;
                                        mboVar.f39846f = null;
                                        mboVar.f39842b = null;
                                        mboVar.f39848h = null;
                                        mboVar.f39849i = null;
                                        mboVar.f39847g = null;
                                        mboVar.f39845e = 4;
                                        if (mavVar2.m16285a(lvoVarM16280a, mboVar) == omaVar) {
                                            return omaVar;
                                        }
                                    }
                                    throw th;
                                }
                            } while (((ayh) objPrevious).f2715b != 1);
                            ayhVar = (ayh) objPrevious;
                            if (ayhVar != null) {
                                it = ayhVar.f2714a.iterator();
                                do {
                                    if (it.hasNext()) {
                                        lM18799m = ook.m18799m((String) it.next());
                                    } else {
                                        lM18799m = null;
                                    }
                                } while (lM18799m == null);
                            } else {
                                lM18799m = null;
                            }
                            if (lM18799m != null) {
                                nzwVarM18392b = oaq.m18392b(lM18799m.longValue());
                            } else {
                                nzwVarM18392b = oaq.f45169b;
                            }
                            nzwVarM18392b.getClass();
                            if (ayhVar == null) {
                                i9 = 4;
                            } else {
                                nzwVar2.getClass();
                                oaq.m18393c(nzwVar2);
                                oaq.m18393c(nzwVarM18392b);
                                j = nzwVar2.f45103a;
                                j2 = nzwVarM18392b.f45103a;
                                i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
                                if (j == j2) {
                                    i2 = nzwVar2.f45104b;
                                    i3 = nzwVarM18392b.f45104b;
                                    if (i2 == i3) {
                                        i = 0;
                                    } else if (i2 < i3) {
                                        i9 = 1;
                                    } else {
                                        i = 1;
                                    }
                                    if (i < 0) {
                                        i9 = 1;
                                    }
                                } else if (i < 0) {
                                    i9 = 1;
                                }
                            }
                            ayjVar = new ayj(F250AutoWorker.class);
                            nzw nzwVarM15687g2 = lle.m15687g(mbrVar.f39861b);
                            nzwVar2.getClass();
                            oaq.m18393c(nzwVarM15687g2);
                            oaq.m18393c(nzwVar2);
                            jM14996an = kxk.m14996an(nzwVar2.f45103a, nzwVarM15687g2.f45103a);
                            i4 = nzwVar2.f45104b;
                            i5 = nzwVarM15687g2.f45104b;
                            i6 = i9;
                            nzwVar4 = nzwVar2;
                            j3 = ((long) i4) - ((long) i5);
                            i7 = (int) j3;
                            if (j3 == i7) {
                                throw new ArithmeticException("overflow: checkedSubtract(" + i4 + ", " + i5 + ")");
                            }
                            nxdVarM18389a = oao.m18389a(jM14996an, i7);
                            nxdVarM18389a.getClass();
                            if (ooc.m18737c(nxdVarM18389a, oao.f45167b)) {
                                jM14994al = Long.MAX_VALUE;
                            } else if (ooc.m18737c(nxdVarM18389a, oao.f45166a)) {
                                jM14994al = Long.MIN_VALUE;
                            } else {
                                oao.m18390b(nxdVarM18389a);
                                jM14994al = kxk.m14994al(kxk.m14995am(nxdVarM18389a.f44900a, 1000L), nxdVarM18389a.f44901b / 1000000);
                            }
                            TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
                            timeUnit2.getClass();
                            ayjVar.f2722b.f2969f = timeUnit2.toMillis(jM14994al);
                            if (Long.MAX_VALUE - System.currentTimeMillis() > ayjVar.f2722b.f2969f) {
                                throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!");
                            }
                            nzwVar4.getClass();
                            if (ooc.m18737c(nzwVar4, oaq.f45169b)) {
                                jM18391a = Long.MAX_VALUE;
                            } else if (ooc.m18737c(nzwVar4, oaq.f45168a)) {
                                jM18391a = Long.MIN_VALUE;
                            } else {
                                jM18391a = oaq.m18391a(nzwVar4);
                            }
                            ayjVar.m2105a(String.valueOf(jM18391a));
                            C1058va c1058vaM2106b2 = ayjVar.m2106b();
                            mavVar2 = mbrVar.f39860a;
                            oerVar = oer.ERROR_ENQUEUE_WORK;
                            okvVar = okv.f46215a;
                            bevVar = ((ayz) mbrVar.m16301d().m2104d("F250_AUTO_WORKER_TAG", i6, c1058vaM2106b2)).f2738c;
                            mboVar.f39841a = mbrVar;
                            mboVar.f39846f = mauVar2;
                            mboVar.f39842b = mavVar2;
                            mboVar.f39848h = okvVar;
                            mboVar.f39849i = okvVar;
                            mboVar.f39847g = oerVar;
                            mboVar.f39845e = 3;
                            if (lku.m15644am(bevVar, mboVar) == omaVar) {
                                return omaVar;
                            }
                            mauVar4 = mauVar2;
                            mavVar3 = mbrVar.f39860a;
                            lvoVarM16279e = mau.m16279e(mauVar4, null, null, oer.SUCCESS_PARTIAL_AUTO_WORK_ENQUEUED, 11);
                            mboVar.f39841a = null;
                            mboVar.f39846f = null;
                            mboVar.f39842b = null;
                            mboVar.f39848h = null;
                            mboVar.f39849i = null;
                            mboVar.f39847g = null;
                            mboVar.f39845e = 5;
                            if (mavVar3.m16285a(lvoVarM16279e, mboVar) == omaVar) {
                                return omaVar;
                            }
                            return oki.f46196a;
                        } catch (Throwable th3) {
                            th = th3;
                            mbrVar = this;
                            mavVar = mbrVar.f39860a;
                            lvoVarM16277c = mau.m16277c(mauVar2, oer.ERROR_PARTIAL_QUERY_WORK, th, null, 12);
                            mboVar.f39841a = mbrVar;
                            mboVar.f39846f = mauVar2;
                            mboVar.f39842b = nzwVar2;
                            mboVar.f39845e = 2;
                            if (mavVar.m16285a(lvoVarM16277c, mboVar) != omaVar) {
                                return omaVar;
                            }
                            nzw nzwVar6 = nzwVar2;
                            mauVar3 = mauVar2;
                            nzwVar3 = nzwVar6;
                            list = okv.f46215a;
                            mau mauVar6 = mauVar3;
                            nzwVar2 = nzwVar3;
                            mauVar2 = mauVar6;
                            list.getClass();
                            listIterator = list.listIterator(list.size());
                            do {
                                if (listIterator.hasPrevious()) {
                                    objPrevious = listIterator.previous();
                                } else {
                                    objPrevious = null;
                                }
                                ayhVar = (ayh) objPrevious;
                                if (ayhVar != null) {
                                    it = ayhVar.f2714a.iterator();
                                    do {
                                        if (it.hasNext()) {
                                            lM18799m = ook.m18799m((String) it.next());
                                        } else {
                                            lM18799m = null;
                                        }
                                    } while (lM18799m == null);
                                } else {
                                    lM18799m = null;
                                }
                                if (lM18799m != null) {
                                    nzwVarM18392b = oaq.m18392b(lM18799m.longValue());
                                } else {
                                    nzwVarM18392b = oaq.f45169b;
                                }
                                nzwVarM18392b.getClass();
                                if (ayhVar == null) {
                                    i9 = 4;
                                } else {
                                    nzwVar2.getClass();
                                    oaq.m18393c(nzwVar2);
                                    oaq.m18393c(nzwVarM18392b);
                                    j = nzwVar2.f45103a;
                                    j2 = nzwVarM18392b.f45103a;
                                    i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
                                    if (j == j2) {
                                        i2 = nzwVar2.f45104b;
                                        i3 = nzwVarM18392b.f45104b;
                                        if (i2 == i3) {
                                            i = 0;
                                        } else if (i2 < i3) {
                                            i9 = 1;
                                        } else {
                                            i = 1;
                                        }
                                        if (i < 0) {
                                            i9 = 1;
                                        }
                                    } else if (i < 0) {
                                        i9 = 1;
                                    }
                                }
                                ayjVar = new ayj(F250AutoWorker.class);
                                nzw nzwVarM15687g3 = lle.m15687g(mbrVar.f39861b);
                                nzwVar2.getClass();
                                oaq.m18393c(nzwVarM15687g3);
                                oaq.m18393c(nzwVar2);
                                jM14996an = kxk.m14996an(nzwVar2.f45103a, nzwVarM15687g3.f45103a);
                                i4 = nzwVar2.f45104b;
                                i5 = nzwVarM15687g3.f45104b;
                                i6 = i9;
                                nzwVar4 = nzwVar2;
                                j3 = ((long) i4) - ((long) i5);
                                i7 = (int) j3;
                                if (j3 == i7) {
                                    throw new ArithmeticException("overflow: checkedSubtract(" + i4 + ", " + i5 + ")");
                                }
                                nxdVarM18389a = oao.m18389a(jM14996an, i7);
                                nxdVarM18389a.getClass();
                                if (ooc.m18737c(nxdVarM18389a, oao.f45167b)) {
                                    jM14994al = Long.MAX_VALUE;
                                } else if (ooc.m18737c(nxdVarM18389a, oao.f45166a)) {
                                    jM14994al = Long.MIN_VALUE;
                                } else {
                                    oao.m18390b(nxdVarM18389a);
                                    jM14994al = kxk.m14994al(kxk.m14995am(nxdVarM18389a.f44900a, 1000L), nxdVarM18389a.f44901b / 1000000);
                                }
                                TimeUnit timeUnit3 = TimeUnit.MILLISECONDS;
                                timeUnit3.getClass();
                                ayjVar.f2722b.f2969f = timeUnit3.toMillis(jM14994al);
                                if (Long.MAX_VALUE - System.currentTimeMillis() > ayjVar.f2722b.f2969f) {
                                    throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!");
                                }
                                nzwVar4.getClass();
                                if (ooc.m18737c(nzwVar4, oaq.f45169b)) {
                                    jM18391a = Long.MAX_VALUE;
                                } else if (ooc.m18737c(nzwVar4, oaq.f45168a)) {
                                    jM18391a = Long.MIN_VALUE;
                                } else {
                                    jM18391a = oaq.m18391a(nzwVar4);
                                }
                                ayjVar.m2105a(String.valueOf(jM18391a));
                                C1058va c1058vaM2106b3 = ayjVar.m2106b();
                                mavVar2 = mbrVar.f39860a;
                                oerVar = oer.ERROR_ENQUEUE_WORK;
                                okvVar = okv.f46215a;
                                bevVar = ((ayz) mbrVar.m16301d().m2104d("F250_AUTO_WORKER_TAG", i6, c1058vaM2106b3)).f2738c;
                                mboVar.f39841a = mbrVar;
                                mboVar.f39846f = mauVar2;
                                mboVar.f39842b = mavVar2;
                                mboVar.f39848h = okvVar;
                                mboVar.f39849i = okvVar;
                                mboVar.f39847g = oerVar;
                                mboVar.f39845e = 3;
                                if (lku.m15644am(bevVar, mboVar) == omaVar) {
                                    return omaVar;
                                }
                                mauVar4 = mauVar2;
                                mavVar3 = mbrVar.f39860a;
                                lvoVarM16279e = mau.m16279e(mauVar4, null, null, oer.SUCCESS_PARTIAL_AUTO_WORK_ENQUEUED, 11);
                                mboVar.f39841a = null;
                                mboVar.f39846f = null;
                                mboVar.f39842b = null;
                                mboVar.f39848h = null;
                                mboVar.f39849i = null;
                                mboVar.f39847g = null;
                                mboVar.f39845e = 5;
                                if (mavVar3.m16285a(lvoVarM16279e, mboVar) == omaVar) {
                                    return omaVar;
                                }
                                return oki.f46196a;
                            } while (((ayh) objPrevious).f2715b != 1);
                            ayhVar = (ayh) objPrevious;
                            if (ayhVar != null) {
                                it = ayhVar.f2714a.iterator();
                                do {
                                    if (it.hasNext()) {
                                        lM18799m = ook.m18799m((String) it.next());
                                    } else {
                                        lM18799m = null;
                                    }
                                } while (lM18799m == null);
                            } else {
                                lM18799m = null;
                            }
                            if (lM18799m != null) {
                                nzwVarM18392b = oaq.m18392b(lM18799m.longValue());
                            } else {
                                nzwVarM18392b = oaq.f45169b;
                            }
                            nzwVarM18392b.getClass();
                            if (ayhVar == null) {
                                i9 = 4;
                            } else {
                                nzwVar2.getClass();
                                oaq.m18393c(nzwVar2);
                                oaq.m18393c(nzwVarM18392b);
                                j = nzwVar2.f45103a;
                                j2 = nzwVarM18392b.f45103a;
                                i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
                                if (j == j2) {
                                    i2 = nzwVar2.f45104b;
                                    i3 = nzwVarM18392b.f45104b;
                                    if (i2 == i3) {
                                        i = 0;
                                    } else if (i2 < i3) {
                                        i9 = 1;
                                    } else {
                                        i = 1;
                                    }
                                    if (i < 0) {
                                        i9 = 1;
                                    }
                                } else if (i < 0) {
                                    i9 = 1;
                                }
                            }
                            ayjVar = new ayj(F250AutoWorker.class);
                            nzw nzwVarM15687g4 = lle.m15687g(mbrVar.f39861b);
                            nzwVar2.getClass();
                            oaq.m18393c(nzwVarM15687g4);
                            oaq.m18393c(nzwVar2);
                            jM14996an = kxk.m14996an(nzwVar2.f45103a, nzwVarM15687g4.f45103a);
                            i4 = nzwVar2.f45104b;
                            i5 = nzwVarM15687g4.f45104b;
                            i6 = i9;
                            nzwVar4 = nzwVar2;
                            j3 = ((long) i4) - ((long) i5);
                            i7 = (int) j3;
                            if (j3 == i7) {
                                throw new ArithmeticException("overflow: checkedSubtract(" + i4 + ", " + i5 + ")");
                            }
                            nxdVarM18389a = oao.m18389a(jM14996an, i7);
                            nxdVarM18389a.getClass();
                            if (ooc.m18737c(nxdVarM18389a, oao.f45167b)) {
                                jM14994al = Long.MAX_VALUE;
                            } else if (ooc.m18737c(nxdVarM18389a, oao.f45166a)) {
                                jM14994al = Long.MIN_VALUE;
                            } else {
                                oao.m18390b(nxdVarM18389a);
                                jM14994al = kxk.m14994al(kxk.m14995am(nxdVarM18389a.f44900a, 1000L), nxdVarM18389a.f44901b / 1000000);
                            }
                            TimeUnit timeUnit4 = TimeUnit.MILLISECONDS;
                            timeUnit4.getClass();
                            ayjVar.f2722b.f2969f = timeUnit4.toMillis(jM14994al);
                            if (Long.MAX_VALUE - System.currentTimeMillis() > ayjVar.f2722b.f2969f) {
                                throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!");
                            }
                            nzwVar4.getClass();
                            if (ooc.m18737c(nzwVar4, oaq.f45169b)) {
                                jM18391a = Long.MAX_VALUE;
                            } else if (ooc.m18737c(nzwVar4, oaq.f45168a)) {
                                jM18391a = Long.MIN_VALUE;
                            } else {
                                jM18391a = oaq.m18391a(nzwVar4);
                            }
                            ayjVar.m2105a(String.valueOf(jM18391a));
                            C1058va c1058vaM2106b4 = ayjVar.m2106b();
                            mavVar2 = mbrVar.f39860a;
                            oerVar = oer.ERROR_ENQUEUE_WORK;
                            okvVar = okv.f46215a;
                            bevVar = ((ayz) mbrVar.m16301d().m2104d("F250_AUTO_WORKER_TAG", i6, c1058vaM2106b4)).f2738c;
                            mboVar.f39841a = mbrVar;
                            mboVar.f39846f = mauVar2;
                            mboVar.f39842b = mavVar2;
                            mboVar.f39848h = okvVar;
                            mboVar.f39849i = okvVar;
                            mboVar.f39847g = oerVar;
                            mboVar.f39845e = 3;
                            if (lku.m15644am(bevVar, mboVar) == omaVar) {
                                return omaVar;
                            }
                            mauVar4 = mauVar2;
                            mavVar3 = mbrVar.f39860a;
                            lvoVarM16279e = mau.m16279e(mauVar4, null, null, oer.SUCCESS_PARTIAL_AUTO_WORK_ENQUEUED, 11);
                            mboVar.f39841a = null;
                            mboVar.f39846f = null;
                            mboVar.f39842b = null;
                            mboVar.f39848h = null;
                            mboVar.f39849i = null;
                            mboVar.f39847g = null;
                            mboVar.f39845e = 5;
                            if (mavVar3.m16285a(lvoVarM16279e, mboVar) == omaVar) {
                                return omaVar;
                            }
                            return oki.f46196a;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        nzwVar2 = nzwVar;
                        mbrVar = this;
                        mavVar = mbrVar.f39860a;
                        lvoVarM16277c = mau.m16277c(mauVar2, oer.ERROR_PARTIAL_QUERY_WORK, th, null, 12);
                        mboVar.f39841a = mbrVar;
                        mboVar.f39846f = mauVar2;
                        mboVar.f39842b = nzwVar2;
                        mboVar.f39845e = 2;
                        if (mavVar.m16285a(lvoVarM16277c, mboVar) != omaVar) {
                            return omaVar;
                        }
                        nzw nzwVar7 = nzwVar2;
                        mauVar3 = mauVar2;
                        nzwVar3 = nzwVar7;
                        list = okv.f46215a;
                        mau mauVar7 = mauVar3;
                        nzwVar2 = nzwVar3;
                        mauVar2 = mauVar7;
                        list.getClass();
                        listIterator = list.listIterator(list.size());
                        do {
                            if (listIterator.hasPrevious()) {
                                objPrevious = listIterator.previous();
                            } else {
                                objPrevious = null;
                            }
                            ayhVar = (ayh) objPrevious;
                            if (ayhVar != null) {
                                it = ayhVar.f2714a.iterator();
                                do {
                                    if (it.hasNext()) {
                                        lM18799m = ook.m18799m((String) it.next());
                                    } else {
                                        lM18799m = null;
                                    }
                                } while (lM18799m == null);
                            } else {
                                lM18799m = null;
                            }
                            if (lM18799m != null) {
                                nzwVarM18392b = oaq.m18392b(lM18799m.longValue());
                            } else {
                                nzwVarM18392b = oaq.f45169b;
                            }
                            nzwVarM18392b.getClass();
                            if (ayhVar == null) {
                                i9 = 4;
                            } else {
                                nzwVar2.getClass();
                                oaq.m18393c(nzwVar2);
                                oaq.m18393c(nzwVarM18392b);
                                j = nzwVar2.f45103a;
                                j2 = nzwVarM18392b.f45103a;
                                i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
                                if (j == j2) {
                                    i2 = nzwVar2.f45104b;
                                    i3 = nzwVarM18392b.f45104b;
                                    if (i2 == i3) {
                                        i = 0;
                                    } else if (i2 < i3) {
                                        i9 = 1;
                                    } else {
                                        i = 1;
                                    }
                                    if (i < 0) {
                                        i9 = 1;
                                    }
                                } else if (i < 0) {
                                    i9 = 1;
                                }
                            }
                            ayjVar = new ayj(F250AutoWorker.class);
                            nzw nzwVarM15687g5 = lle.m15687g(mbrVar.f39861b);
                            nzwVar2.getClass();
                            oaq.m18393c(nzwVarM15687g5);
                            oaq.m18393c(nzwVar2);
                            jM14996an = kxk.m14996an(nzwVar2.f45103a, nzwVarM15687g5.f45103a);
                            i4 = nzwVar2.f45104b;
                            i5 = nzwVarM15687g5.f45104b;
                            i6 = i9;
                            nzwVar4 = nzwVar2;
                            j3 = ((long) i4) - ((long) i5);
                            i7 = (int) j3;
                            if (j3 == i7) {
                                throw new ArithmeticException("overflow: checkedSubtract(" + i4 + ", " + i5 + ")");
                            }
                            nxdVarM18389a = oao.m18389a(jM14996an, i7);
                            nxdVarM18389a.getClass();
                            if (ooc.m18737c(nxdVarM18389a, oao.f45167b)) {
                                jM14994al = Long.MAX_VALUE;
                            } else if (ooc.m18737c(nxdVarM18389a, oao.f45166a)) {
                                jM14994al = Long.MIN_VALUE;
                            } else {
                                oao.m18390b(nxdVarM18389a);
                                jM14994al = kxk.m14994al(kxk.m14995am(nxdVarM18389a.f44900a, 1000L), nxdVarM18389a.f44901b / 1000000);
                            }
                            TimeUnit timeUnit5 = TimeUnit.MILLISECONDS;
                            timeUnit5.getClass();
                            ayjVar.f2722b.f2969f = timeUnit5.toMillis(jM14994al);
                            if (Long.MAX_VALUE - System.currentTimeMillis() > ayjVar.f2722b.f2969f) {
                                throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!");
                            }
                            nzwVar4.getClass();
                            if (ooc.m18737c(nzwVar4, oaq.f45169b)) {
                                jM18391a = Long.MAX_VALUE;
                            } else if (ooc.m18737c(nzwVar4, oaq.f45168a)) {
                                jM18391a = Long.MIN_VALUE;
                            } else {
                                jM18391a = oaq.m18391a(nzwVar4);
                            }
                            ayjVar.m2105a(String.valueOf(jM18391a));
                            C1058va c1058vaM2106b5 = ayjVar.m2106b();
                            mavVar2 = mbrVar.f39860a;
                            oerVar = oer.ERROR_ENQUEUE_WORK;
                            okvVar = okv.f46215a;
                            bevVar = ((ayz) mbrVar.m16301d().m2104d("F250_AUTO_WORKER_TAG", i6, c1058vaM2106b5)).f2738c;
                            mboVar.f39841a = mbrVar;
                            mboVar.f39846f = mauVar2;
                            mboVar.f39842b = mavVar2;
                            mboVar.f39848h = okvVar;
                            mboVar.f39849i = okvVar;
                            mboVar.f39847g = oerVar;
                            mboVar.f39845e = 3;
                            if (lku.m15644am(bevVar, mboVar) == omaVar) {
                                return omaVar;
                            }
                            mauVar4 = mauVar2;
                            mavVar3 = mbrVar.f39860a;
                            lvoVarM16279e = mau.m16279e(mauVar4, null, null, oer.SUCCESS_PARTIAL_AUTO_WORK_ENQUEUED, 11);
                            mboVar.f39841a = null;
                            mboVar.f39846f = null;
                            mboVar.f39842b = null;
                            mboVar.f39848h = null;
                            mboVar.f39849i = null;
                            mboVar.f39847g = null;
                            mboVar.f39845e = 5;
                            if (mavVar3.m16285a(lvoVarM16279e, mboVar) == omaVar) {
                                return omaVar;
                            }
                            return oki.f46196a;
                        } while (((ayh) objPrevious).f2715b != 1);
                        ayhVar = (ayh) objPrevious;
                        if (ayhVar != null) {
                            it = ayhVar.f2714a.iterator();
                            do {
                                if (it.hasNext()) {
                                    lM18799m = ook.m18799m((String) it.next());
                                } else {
                                    lM18799m = null;
                                }
                            } while (lM18799m == null);
                        } else {
                            lM18799m = null;
                        }
                        if (lM18799m != null) {
                            nzwVarM18392b = oaq.m18392b(lM18799m.longValue());
                        } else {
                            nzwVarM18392b = oaq.f45169b;
                        }
                        nzwVarM18392b.getClass();
                        if (ayhVar == null) {
                            i9 = 4;
                        } else {
                            nzwVar2.getClass();
                            oaq.m18393c(nzwVar2);
                            oaq.m18393c(nzwVarM18392b);
                            j = nzwVar2.f45103a;
                            j2 = nzwVarM18392b.f45103a;
                            i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
                            if (j == j2) {
                                i2 = nzwVar2.f45104b;
                                i3 = nzwVarM18392b.f45104b;
                                if (i2 == i3) {
                                    i = 0;
                                } else if (i2 < i3) {
                                    i9 = 1;
                                } else {
                                    i = 1;
                                }
                                if (i < 0) {
                                    i9 = 1;
                                }
                            } else if (i < 0) {
                                i9 = 1;
                            }
                        }
                        ayjVar = new ayj(F250AutoWorker.class);
                        nzw nzwVarM15687g6 = lle.m15687g(mbrVar.f39861b);
                        nzwVar2.getClass();
                        oaq.m18393c(nzwVarM15687g6);
                        oaq.m18393c(nzwVar2);
                        jM14996an = kxk.m14996an(nzwVar2.f45103a, nzwVarM15687g6.f45103a);
                        i4 = nzwVar2.f45104b;
                        i5 = nzwVarM15687g6.f45104b;
                        i6 = i9;
                        nzwVar4 = nzwVar2;
                        j3 = ((long) i4) - ((long) i5);
                        i7 = (int) j3;
                        if (j3 == i7) {
                            throw new ArithmeticException("overflow: checkedSubtract(" + i4 + ", " + i5 + ")");
                        }
                        nxdVarM18389a = oao.m18389a(jM14996an, i7);
                        nxdVarM18389a.getClass();
                        if (ooc.m18737c(nxdVarM18389a, oao.f45167b)) {
                            jM14994al = Long.MAX_VALUE;
                        } else if (ooc.m18737c(nxdVarM18389a, oao.f45166a)) {
                            jM14994al = Long.MIN_VALUE;
                        } else {
                            oao.m18390b(nxdVarM18389a);
                            jM14994al = kxk.m14994al(kxk.m14995am(nxdVarM18389a.f44900a, 1000L), nxdVarM18389a.f44901b / 1000000);
                        }
                        TimeUnit timeUnit6 = TimeUnit.MILLISECONDS;
                        timeUnit6.getClass();
                        ayjVar.f2722b.f2969f = timeUnit6.toMillis(jM14994al);
                        if (Long.MAX_VALUE - System.currentTimeMillis() > ayjVar.f2722b.f2969f) {
                            throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!");
                        }
                        nzwVar4.getClass();
                        if (ooc.m18737c(nzwVar4, oaq.f45169b)) {
                            jM18391a = Long.MAX_VALUE;
                        } else if (ooc.m18737c(nzwVar4, oaq.f45168a)) {
                            jM18391a = Long.MIN_VALUE;
                        } else {
                            jM18391a = oaq.m18391a(nzwVar4);
                        }
                        ayjVar.m2105a(String.valueOf(jM18391a));
                        C1058va c1058vaM2106b6 = ayjVar.m2106b();
                        mavVar2 = mbrVar.f39860a;
                        oerVar = oer.ERROR_ENQUEUE_WORK;
                        okvVar = okv.f46215a;
                        bevVar = ((ayz) mbrVar.m16301d().m2104d("F250_AUTO_WORKER_TAG", i6, c1058vaM2106b6)).f2738c;
                        mboVar.f39841a = mbrVar;
                        mboVar.f39846f = mauVar2;
                        mboVar.f39842b = mavVar2;
                        mboVar.f39848h = okvVar;
                        mboVar.f39849i = okvVar;
                        mboVar.f39847g = oerVar;
                        mboVar.f39845e = 3;
                        if (lku.m15644am(bevVar, mboVar) == omaVar) {
                            return omaVar;
                        }
                        mauVar4 = mauVar2;
                        mavVar3 = mbrVar.f39860a;
                        lvoVarM16279e = mau.m16279e(mauVar4, null, null, oer.SUCCESS_PARTIAL_AUTO_WORK_ENQUEUED, 11);
                        mboVar.f39841a = null;
                        mboVar.f39846f = null;
                        mboVar.f39842b = null;
                        mboVar.f39848h = null;
                        mboVar.f39849i = null;
                        mboVar.f39847g = null;
                        mboVar.f39845e = 5;
                        if (mavVar3.m16285a(lvoVarM16279e, mboVar) == omaVar) {
                            return omaVar;
                        }
                        return oki.f46196a;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    mauVar2 = mauVar;
                }
                break;
            case 1:
                nzw nzwVar8 = (nzw) mboVar.f39842b;
                mau mauVar8 = mboVar.f39846f;
                mbrVar = (mbr) mboVar.f39841a;
                try {
                    lkm.m15592s(objM15644am);
                    nzwVar2 = nzwVar8;
                    mauVar2 = mauVar8;
                    list = (List) objM15644am;
                    break;
                } catch (Throwable th6) {
                    th = th6;
                    nzwVar2 = nzwVar8;
                    mauVar2 = mauVar8;
                    mavVar = mbrVar.f39860a;
                    lvoVarM16277c = mau.m16277c(mauVar2, oer.ERROR_PARTIAL_QUERY_WORK, th, null, 12);
                    mboVar.f39841a = mbrVar;
                    mboVar.f39846f = mauVar2;
                    mboVar.f39842b = nzwVar2;
                    mboVar.f39845e = 2;
                    if (mavVar.m16285a(lvoVarM16277c, mboVar) != omaVar) {
                        return omaVar;
                    }
                    nzw nzwVar9 = nzwVar2;
                    mauVar3 = mauVar2;
                    nzwVar3 = nzwVar9;
                    list = okv.f46215a;
                    mau mauVar9 = mauVar3;
                    nzwVar2 = nzwVar3;
                    mauVar2 = mauVar9;
                    list.getClass();
                    listIterator = list.listIterator(list.size());
                    do {
                        if (listIterator.hasPrevious()) {
                            objPrevious = listIterator.previous();
                        } else {
                            objPrevious = null;
                        }
                        ayhVar = (ayh) objPrevious;
                        if (ayhVar != null) {
                            it = ayhVar.f2714a.iterator();
                            do {
                                if (it.hasNext()) {
                                    lM18799m = ook.m18799m((String) it.next());
                                } else {
                                    lM18799m = null;
                                }
                            } while (lM18799m == null);
                        } else {
                            lM18799m = null;
                        }
                        if (lM18799m != null) {
                            nzwVarM18392b = oaq.m18392b(lM18799m.longValue());
                        } else {
                            nzwVarM18392b = oaq.f45169b;
                        }
                        nzwVarM18392b.getClass();
                        if (ayhVar == null) {
                            i9 = 4;
                        } else {
                            nzwVar2.getClass();
                            oaq.m18393c(nzwVar2);
                            oaq.m18393c(nzwVarM18392b);
                            j = nzwVar2.f45103a;
                            j2 = nzwVarM18392b.f45103a;
                            i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
                            if (j == j2) {
                                i2 = nzwVar2.f45104b;
                                i3 = nzwVarM18392b.f45104b;
                                if (i2 == i3) {
                                    i = 0;
                                } else if (i2 < i3) {
                                    i9 = 1;
                                } else {
                                    i = 1;
                                }
                                if (i < 0) {
                                    i9 = 1;
                                }
                            } else if (i < 0) {
                                i9 = 1;
                            }
                        }
                        ayjVar = new ayj(F250AutoWorker.class);
                        nzw nzwVarM15687g7 = lle.m15687g(mbrVar.f39861b);
                        nzwVar2.getClass();
                        oaq.m18393c(nzwVarM15687g7);
                        oaq.m18393c(nzwVar2);
                        jM14996an = kxk.m14996an(nzwVar2.f45103a, nzwVarM15687g7.f45103a);
                        i4 = nzwVar2.f45104b;
                        i5 = nzwVarM15687g7.f45104b;
                        i6 = i9;
                        nzwVar4 = nzwVar2;
                        j3 = ((long) i4) - ((long) i5);
                        i7 = (int) j3;
                        if (j3 == i7) {
                            throw new ArithmeticException("overflow: checkedSubtract(" + i4 + ", " + i5 + ")");
                        }
                        nxdVarM18389a = oao.m18389a(jM14996an, i7);
                        nxdVarM18389a.getClass();
                        if (ooc.m18737c(nxdVarM18389a, oao.f45167b)) {
                            jM14994al = Long.MAX_VALUE;
                        } else if (ooc.m18737c(nxdVarM18389a, oao.f45166a)) {
                            jM14994al = Long.MIN_VALUE;
                        } else {
                            oao.m18390b(nxdVarM18389a);
                            jM14994al = kxk.m14994al(kxk.m14995am(nxdVarM18389a.f44900a, 1000L), nxdVarM18389a.f44901b / 1000000);
                        }
                        TimeUnit timeUnit7 = TimeUnit.MILLISECONDS;
                        timeUnit7.getClass();
                        ayjVar.f2722b.f2969f = timeUnit7.toMillis(jM14994al);
                        if (Long.MAX_VALUE - System.currentTimeMillis() > ayjVar.f2722b.f2969f) {
                            throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!");
                        }
                        nzwVar4.getClass();
                        if (ooc.m18737c(nzwVar4, oaq.f45169b)) {
                            jM18391a = Long.MAX_VALUE;
                        } else if (ooc.m18737c(nzwVar4, oaq.f45168a)) {
                            jM18391a = Long.MIN_VALUE;
                        } else {
                            jM18391a = oaq.m18391a(nzwVar4);
                        }
                        ayjVar.m2105a(String.valueOf(jM18391a));
                        C1058va c1058vaM2106b7 = ayjVar.m2106b();
                        mavVar2 = mbrVar.f39860a;
                        oerVar = oer.ERROR_ENQUEUE_WORK;
                        okvVar = okv.f46215a;
                        bevVar = ((ayz) mbrVar.m16301d().m2104d("F250_AUTO_WORKER_TAG", i6, c1058vaM2106b7)).f2738c;
                        mboVar.f39841a = mbrVar;
                        mboVar.f39846f = mauVar2;
                        mboVar.f39842b = mavVar2;
                        mboVar.f39848h = okvVar;
                        mboVar.f39849i = okvVar;
                        mboVar.f39847g = oerVar;
                        mboVar.f39845e = 3;
                        if (lku.m15644am(bevVar, mboVar) == omaVar) {
                            return omaVar;
                        }
                        mauVar4 = mauVar2;
                        mavVar3 = mbrVar.f39860a;
                        lvoVarM16279e = mau.m16279e(mauVar4, null, null, oer.SUCCESS_PARTIAL_AUTO_WORK_ENQUEUED, 11);
                        mboVar.f39841a = null;
                        mboVar.f39846f = null;
                        mboVar.f39842b = null;
                        mboVar.f39848h = null;
                        mboVar.f39849i = null;
                        mboVar.f39847g = null;
                        mboVar.f39845e = 5;
                        if (mavVar3.m16285a(lvoVarM16279e, mboVar) == omaVar) {
                            return omaVar;
                        }
                        return oki.f46196a;
                    } while (((ayh) objPrevious).f2715b != 1);
                    ayhVar = (ayh) objPrevious;
                    if (ayhVar != null) {
                        it = ayhVar.f2714a.iterator();
                        do {
                            if (it.hasNext()) {
                                lM18799m = ook.m18799m((String) it.next());
                            } else {
                                lM18799m = null;
                            }
                        } while (lM18799m == null);
                    } else {
                        lM18799m = null;
                    }
                    if (lM18799m != null) {
                        nzwVarM18392b = oaq.m18392b(lM18799m.longValue());
                    } else {
                        nzwVarM18392b = oaq.f45169b;
                    }
                    nzwVarM18392b.getClass();
                    if (ayhVar == null) {
                        i9 = 4;
                    } else {
                        nzwVar2.getClass();
                        oaq.m18393c(nzwVar2);
                        oaq.m18393c(nzwVarM18392b);
                        j = nzwVar2.f45103a;
                        j2 = nzwVarM18392b.f45103a;
                        i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
                        if (j == j2) {
                            i2 = nzwVar2.f45104b;
                            i3 = nzwVarM18392b.f45104b;
                            if (i2 == i3) {
                                i = 0;
                            } else if (i2 < i3) {
                                i9 = 1;
                            } else {
                                i = 1;
                            }
                            if (i < 0) {
                                i9 = 1;
                            }
                        } else if (i < 0) {
                            i9 = 1;
                        }
                    }
                    ayjVar = new ayj(F250AutoWorker.class);
                    nzw nzwVarM15687g8 = lle.m15687g(mbrVar.f39861b);
                    nzwVar2.getClass();
                    oaq.m18393c(nzwVarM15687g8);
                    oaq.m18393c(nzwVar2);
                    jM14996an = kxk.m14996an(nzwVar2.f45103a, nzwVarM15687g8.f45103a);
                    i4 = nzwVar2.f45104b;
                    i5 = nzwVarM15687g8.f45104b;
                    i6 = i9;
                    nzwVar4 = nzwVar2;
                    j3 = ((long) i4) - ((long) i5);
                    i7 = (int) j3;
                    if (j3 == i7) {
                        throw new ArithmeticException("overflow: checkedSubtract(" + i4 + ", " + i5 + ")");
                    }
                    nxdVarM18389a = oao.m18389a(jM14996an, i7);
                    nxdVarM18389a.getClass();
                    if (ooc.m18737c(nxdVarM18389a, oao.f45167b)) {
                        jM14994al = Long.MAX_VALUE;
                    } else if (ooc.m18737c(nxdVarM18389a, oao.f45166a)) {
                        jM14994al = Long.MIN_VALUE;
                    } else {
                        oao.m18390b(nxdVarM18389a);
                        jM14994al = kxk.m14994al(kxk.m14995am(nxdVarM18389a.f44900a, 1000L), nxdVarM18389a.f44901b / 1000000);
                    }
                    TimeUnit timeUnit8 = TimeUnit.MILLISECONDS;
                    timeUnit8.getClass();
                    ayjVar.f2722b.f2969f = timeUnit8.toMillis(jM14994al);
                    if (Long.MAX_VALUE - System.currentTimeMillis() > ayjVar.f2722b.f2969f) {
                        throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!");
                    }
                    nzwVar4.getClass();
                    if (ooc.m18737c(nzwVar4, oaq.f45169b)) {
                        jM18391a = Long.MAX_VALUE;
                    } else if (ooc.m18737c(nzwVar4, oaq.f45168a)) {
                        jM18391a = Long.MIN_VALUE;
                    } else {
                        jM18391a = oaq.m18391a(nzwVar4);
                    }
                    ayjVar.m2105a(String.valueOf(jM18391a));
                    C1058va c1058vaM2106b8 = ayjVar.m2106b();
                    mavVar2 = mbrVar.f39860a;
                    oerVar = oer.ERROR_ENQUEUE_WORK;
                    okvVar = okv.f46215a;
                    bevVar = ((ayz) mbrVar.m16301d().m2104d("F250_AUTO_WORKER_TAG", i6, c1058vaM2106b8)).f2738c;
                    mboVar.f39841a = mbrVar;
                    mboVar.f39846f = mauVar2;
                    mboVar.f39842b = mavVar2;
                    mboVar.f39848h = okvVar;
                    mboVar.f39849i = okvVar;
                    mboVar.f39847g = oerVar;
                    mboVar.f39845e = 3;
                    if (lku.m15644am(bevVar, mboVar) == omaVar) {
                        return omaVar;
                    }
                    mauVar4 = mauVar2;
                    mavVar3 = mbrVar.f39860a;
                    lvoVarM16279e = mau.m16279e(mauVar4, null, null, oer.SUCCESS_PARTIAL_AUTO_WORK_ENQUEUED, 11);
                    mboVar.f39841a = null;
                    mboVar.f39846f = null;
                    mboVar.f39842b = null;
                    mboVar.f39848h = null;
                    mboVar.f39849i = null;
                    mboVar.f39847g = null;
                    mboVar.f39845e = 5;
                    if (mavVar3.m16285a(lvoVarM16279e, mboVar) == omaVar) {
                        return omaVar;
                    }
                    return oki.f46196a;
                }
                list.getClass();
                listIterator = list.listIterator(list.size());
                do {
                    if (listIterator.hasPrevious()) {
                        objPrevious = listIterator.previous();
                    } else {
                        objPrevious = null;
                    }
                    ayhVar = (ayh) objPrevious;
                    if (ayhVar != null) {
                        it = ayhVar.f2714a.iterator();
                        do {
                            if (it.hasNext()) {
                                lM18799m = ook.m18799m((String) it.next());
                            } else {
                                lM18799m = null;
                            }
                        } while (lM18799m == null);
                    } else {
                        lM18799m = null;
                    }
                    if (lM18799m != null) {
                        nzwVarM18392b = oaq.m18392b(lM18799m.longValue());
                    } else {
                        nzwVarM18392b = oaq.f45169b;
                    }
                    nzwVarM18392b.getClass();
                    if (ayhVar == null) {
                        i9 = 4;
                    } else {
                        nzwVar2.getClass();
                        oaq.m18393c(nzwVar2);
                        oaq.m18393c(nzwVarM18392b);
                        j = nzwVar2.f45103a;
                        j2 = nzwVarM18392b.f45103a;
                        i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
                        if (j == j2) {
                            i2 = nzwVar2.f45104b;
                            i3 = nzwVarM18392b.f45104b;
                            if (i2 == i3) {
                                i = 0;
                            } else if (i2 < i3) {
                                i9 = 1;
                            } else {
                                i = 1;
                            }
                            if (i < 0) {
                                i9 = 1;
                            }
                        } else if (i < 0) {
                            i9 = 1;
                        }
                    }
                    ayjVar = new ayj(F250AutoWorker.class);
                    nzw nzwVarM15687g9 = lle.m15687g(mbrVar.f39861b);
                    nzwVar2.getClass();
                    oaq.m18393c(nzwVarM15687g9);
                    oaq.m18393c(nzwVar2);
                    jM14996an = kxk.m14996an(nzwVar2.f45103a, nzwVarM15687g9.f45103a);
                    i4 = nzwVar2.f45104b;
                    i5 = nzwVarM15687g9.f45104b;
                    i6 = i9;
                    nzwVar4 = nzwVar2;
                    j3 = ((long) i4) - ((long) i5);
                    i7 = (int) j3;
                    if (j3 == i7) {
                        throw new ArithmeticException("overflow: checkedSubtract(" + i4 + ", " + i5 + ")");
                    }
                    nxdVarM18389a = oao.m18389a(jM14996an, i7);
                    nxdVarM18389a.getClass();
                    if (ooc.m18737c(nxdVarM18389a, oao.f45167b)) {
                        jM14994al = Long.MAX_VALUE;
                    } else if (ooc.m18737c(nxdVarM18389a, oao.f45166a)) {
                        jM14994al = Long.MIN_VALUE;
                    } else {
                        oao.m18390b(nxdVarM18389a);
                        jM14994al = kxk.m14994al(kxk.m14995am(nxdVarM18389a.f44900a, 1000L), nxdVarM18389a.f44901b / 1000000);
                    }
                    TimeUnit timeUnit9 = TimeUnit.MILLISECONDS;
                    timeUnit9.getClass();
                    ayjVar.f2722b.f2969f = timeUnit9.toMillis(jM14994al);
                    if (Long.MAX_VALUE - System.currentTimeMillis() > ayjVar.f2722b.f2969f) {
                        throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!");
                    }
                    nzwVar4.getClass();
                    if (ooc.m18737c(nzwVar4, oaq.f45169b)) {
                        jM18391a = Long.MAX_VALUE;
                    } else if (ooc.m18737c(nzwVar4, oaq.f45168a)) {
                        jM18391a = Long.MIN_VALUE;
                    } else {
                        jM18391a = oaq.m18391a(nzwVar4);
                    }
                    ayjVar.m2105a(String.valueOf(jM18391a));
                    C1058va c1058vaM2106b9 = ayjVar.m2106b();
                    mavVar2 = mbrVar.f39860a;
                    oerVar = oer.ERROR_ENQUEUE_WORK;
                    okvVar = okv.f46215a;
                    bevVar = ((ayz) mbrVar.m16301d().m2104d("F250_AUTO_WORKER_TAG", i6, c1058vaM2106b9)).f2738c;
                    mboVar.f39841a = mbrVar;
                    mboVar.f39846f = mauVar2;
                    mboVar.f39842b = mavVar2;
                    mboVar.f39848h = okvVar;
                    mboVar.f39849i = okvVar;
                    mboVar.f39847g = oerVar;
                    mboVar.f39845e = 3;
                    if (lku.m15644am(bevVar, mboVar) == omaVar) {
                        return omaVar;
                    }
                    mauVar4 = mauVar2;
                    mavVar3 = mbrVar.f39860a;
                    lvoVarM16279e = mau.m16279e(mauVar4, null, null, oer.SUCCESS_PARTIAL_AUTO_WORK_ENQUEUED, 11);
                    mboVar.f39841a = null;
                    mboVar.f39846f = null;
                    mboVar.f39842b = null;
                    mboVar.f39848h = null;
                    mboVar.f39849i = null;
                    mboVar.f39847g = null;
                    mboVar.f39845e = 5;
                    if (mavVar3.m16285a(lvoVarM16279e, mboVar) == omaVar) {
                        return omaVar;
                    }
                    return oki.f46196a;
                } while (((ayh) objPrevious).f2715b != 1);
                ayhVar = (ayh) objPrevious;
                if (ayhVar != null) {
                    it = ayhVar.f2714a.iterator();
                    do {
                        if (it.hasNext()) {
                            lM18799m = ook.m18799m((String) it.next());
                        } else {
                            lM18799m = null;
                        }
                    } while (lM18799m == null);
                } else {
                    lM18799m = null;
                }
                if (lM18799m != null) {
                    nzwVarM18392b = oaq.m18392b(lM18799m.longValue());
                } else {
                    nzwVarM18392b = oaq.f45169b;
                }
                nzwVarM18392b.getClass();
                if (ayhVar == null) {
                    i9 = 4;
                } else {
                    nzwVar2.getClass();
                    oaq.m18393c(nzwVar2);
                    oaq.m18393c(nzwVarM18392b);
                    j = nzwVar2.f45103a;
                    j2 = nzwVarM18392b.f45103a;
                    i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
                    if (j == j2) {
                        i2 = nzwVar2.f45104b;
                        i3 = nzwVarM18392b.f45104b;
                        if (i2 == i3) {
                            i = 0;
                        } else if (i2 < i3) {
                            i9 = 1;
                        } else {
                            i = 1;
                        }
                        if (i < 0) {
                            i9 = 1;
                        }
                    } else if (i < 0) {
                        i9 = 1;
                    }
                }
                ayjVar = new ayj(F250AutoWorker.class);
                nzw nzwVarM15687g10 = lle.m15687g(mbrVar.f39861b);
                nzwVar2.getClass();
                oaq.m18393c(nzwVarM15687g10);
                oaq.m18393c(nzwVar2);
                jM14996an = kxk.m14996an(nzwVar2.f45103a, nzwVarM15687g10.f45103a);
                i4 = nzwVar2.f45104b;
                i5 = nzwVarM15687g10.f45104b;
                i6 = i9;
                nzwVar4 = nzwVar2;
                j3 = ((long) i4) - ((long) i5);
                i7 = (int) j3;
                if (j3 == i7) {
                    throw new ArithmeticException("overflow: checkedSubtract(" + i4 + ", " + i5 + ")");
                }
                nxdVarM18389a = oao.m18389a(jM14996an, i7);
                nxdVarM18389a.getClass();
                if (ooc.m18737c(nxdVarM18389a, oao.f45167b)) {
                    jM14994al = Long.MAX_VALUE;
                } else if (ooc.m18737c(nxdVarM18389a, oao.f45166a)) {
                    jM14994al = Long.MIN_VALUE;
                } else {
                    oao.m18390b(nxdVarM18389a);
                    jM14994al = kxk.m14994al(kxk.m14995am(nxdVarM18389a.f44900a, 1000L), nxdVarM18389a.f44901b / 1000000);
                }
                TimeUnit timeUnit10 = TimeUnit.MILLISECONDS;
                timeUnit10.getClass();
                ayjVar.f2722b.f2969f = timeUnit10.toMillis(jM14994al);
                if (Long.MAX_VALUE - System.currentTimeMillis() > ayjVar.f2722b.f2969f) {
                    throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!");
                }
                nzwVar4.getClass();
                if (ooc.m18737c(nzwVar4, oaq.f45169b)) {
                    jM18391a = Long.MAX_VALUE;
                } else if (ooc.m18737c(nzwVar4, oaq.f45168a)) {
                    jM18391a = Long.MIN_VALUE;
                } else {
                    jM18391a = oaq.m18391a(nzwVar4);
                }
                ayjVar.m2105a(String.valueOf(jM18391a));
                C1058va c1058vaM2106b10 = ayjVar.m2106b();
                mavVar2 = mbrVar.f39860a;
                oerVar = oer.ERROR_ENQUEUE_WORK;
                okvVar = okv.f46215a;
                bevVar = ((ayz) mbrVar.m16301d().m2104d("F250_AUTO_WORKER_TAG", i6, c1058vaM2106b10)).f2738c;
                mboVar.f39841a = mbrVar;
                mboVar.f39846f = mauVar2;
                mboVar.f39842b = mavVar2;
                mboVar.f39848h = okvVar;
                mboVar.f39849i = okvVar;
                mboVar.f39847g = oerVar;
                mboVar.f39845e = 3;
                if (lku.m15644am(bevVar, mboVar) == omaVar) {
                    return omaVar;
                }
                mauVar4 = mauVar2;
                mavVar3 = mbrVar.f39860a;
                lvoVarM16279e = mau.m16279e(mauVar4, null, null, oer.SUCCESS_PARTIAL_AUTO_WORK_ENQUEUED, 11);
                mboVar.f39841a = null;
                mboVar.f39846f = null;
                mboVar.f39842b = null;
                mboVar.f39848h = null;
                mboVar.f39849i = null;
                mboVar.f39847g = null;
                mboVar.f39845e = 5;
                if (mavVar3.m16285a(lvoVarM16279e, mboVar) == omaVar) {
                    return omaVar;
                }
                return oki.f46196a;
            case 2:
                nzwVar3 = (nzw) mboVar.f39842b;
                mauVar3 = mboVar.f39846f;
                mbrVar = (mbr) mboVar.f39841a;
                lkm.m15592s(objM15644am);
                list = okv.f46215a;
                mau mauVar10 = mauVar3;
                nzwVar2 = nzwVar3;
                mauVar2 = mauVar10;
                list.getClass();
                listIterator = list.listIterator(list.size());
                do {
                    if (listIterator.hasPrevious()) {
                        objPrevious = listIterator.previous();
                    } else {
                        objPrevious = null;
                    }
                    ayhVar = (ayh) objPrevious;
                    if (ayhVar != null) {
                        it = ayhVar.f2714a.iterator();
                        do {
                            if (it.hasNext()) {
                                lM18799m = ook.m18799m((String) it.next());
                            } else {
                                lM18799m = null;
                            }
                        } while (lM18799m == null);
                    } else {
                        lM18799m = null;
                    }
                    if (lM18799m != null) {
                        nzwVarM18392b = oaq.m18392b(lM18799m.longValue());
                    } else {
                        nzwVarM18392b = oaq.f45169b;
                    }
                    nzwVarM18392b.getClass();
                    if (ayhVar == null) {
                        i9 = 4;
                    } else {
                        nzwVar2.getClass();
                        oaq.m18393c(nzwVar2);
                        oaq.m18393c(nzwVarM18392b);
                        j = nzwVar2.f45103a;
                        j2 = nzwVarM18392b.f45103a;
                        i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
                        if (j == j2) {
                            i2 = nzwVar2.f45104b;
                            i3 = nzwVarM18392b.f45104b;
                            if (i2 == i3) {
                                i = 0;
                            } else if (i2 < i3) {
                                i9 = 1;
                            } else {
                                i = 1;
                            }
                            if (i < 0) {
                                i9 = 1;
                            }
                        } else if (i < 0) {
                            i9 = 1;
                        }
                    }
                    ayjVar = new ayj(F250AutoWorker.class);
                    nzw nzwVarM15687g11 = lle.m15687g(mbrVar.f39861b);
                    nzwVar2.getClass();
                    oaq.m18393c(nzwVarM15687g11);
                    oaq.m18393c(nzwVar2);
                    jM14996an = kxk.m14996an(nzwVar2.f45103a, nzwVarM15687g11.f45103a);
                    i4 = nzwVar2.f45104b;
                    i5 = nzwVarM15687g11.f45104b;
                    i6 = i9;
                    nzwVar4 = nzwVar2;
                    j3 = ((long) i4) - ((long) i5);
                    i7 = (int) j3;
                    if (j3 == i7) {
                        throw new ArithmeticException("overflow: checkedSubtract(" + i4 + ", " + i5 + ")");
                    }
                    nxdVarM18389a = oao.m18389a(jM14996an, i7);
                    nxdVarM18389a.getClass();
                    if (ooc.m18737c(nxdVarM18389a, oao.f45167b)) {
                        jM14994al = Long.MAX_VALUE;
                    } else if (ooc.m18737c(nxdVarM18389a, oao.f45166a)) {
                        jM14994al = Long.MIN_VALUE;
                    } else {
                        oao.m18390b(nxdVarM18389a);
                        jM14994al = kxk.m14994al(kxk.m14995am(nxdVarM18389a.f44900a, 1000L), nxdVarM18389a.f44901b / 1000000);
                    }
                    TimeUnit timeUnit11 = TimeUnit.MILLISECONDS;
                    timeUnit11.getClass();
                    ayjVar.f2722b.f2969f = timeUnit11.toMillis(jM14994al);
                    if (Long.MAX_VALUE - System.currentTimeMillis() > ayjVar.f2722b.f2969f) {
                        throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!");
                    }
                    nzwVar4.getClass();
                    if (ooc.m18737c(nzwVar4, oaq.f45169b)) {
                        jM18391a = Long.MAX_VALUE;
                    } else if (ooc.m18737c(nzwVar4, oaq.f45168a)) {
                        jM18391a = Long.MIN_VALUE;
                    } else {
                        jM18391a = oaq.m18391a(nzwVar4);
                    }
                    ayjVar.m2105a(String.valueOf(jM18391a));
                    C1058va c1058vaM2106b11 = ayjVar.m2106b();
                    mavVar2 = mbrVar.f39860a;
                    oerVar = oer.ERROR_ENQUEUE_WORK;
                    okvVar = okv.f46215a;
                    bevVar = ((ayz) mbrVar.m16301d().m2104d("F250_AUTO_WORKER_TAG", i6, c1058vaM2106b11)).f2738c;
                    mboVar.f39841a = mbrVar;
                    mboVar.f39846f = mauVar2;
                    mboVar.f39842b = mavVar2;
                    mboVar.f39848h = okvVar;
                    mboVar.f39849i = okvVar;
                    mboVar.f39847g = oerVar;
                    mboVar.f39845e = 3;
                    if (lku.m15644am(bevVar, mboVar) == omaVar) {
                        return omaVar;
                    }
                    mauVar4 = mauVar2;
                    mavVar3 = mbrVar.f39860a;
                    lvoVarM16279e = mau.m16279e(mauVar4, null, null, oer.SUCCESS_PARTIAL_AUTO_WORK_ENQUEUED, 11);
                    mboVar.f39841a = null;
                    mboVar.f39846f = null;
                    mboVar.f39842b = null;
                    mboVar.f39848h = null;
                    mboVar.f39849i = null;
                    mboVar.f39847g = null;
                    mboVar.f39845e = 5;
                    if (mavVar3.m16285a(lvoVarM16279e, mboVar) == omaVar) {
                        return omaVar;
                    }
                    return oki.f46196a;
                } while (((ayh) objPrevious).f2715b != 1);
                ayhVar = (ayh) objPrevious;
                if (ayhVar != null) {
                    it = ayhVar.f2714a.iterator();
                    do {
                        if (it.hasNext()) {
                            lM18799m = ook.m18799m((String) it.next());
                        } else {
                            lM18799m = null;
                        }
                    } while (lM18799m == null);
                } else {
                    lM18799m = null;
                }
                if (lM18799m != null) {
                    nzwVarM18392b = oaq.m18392b(lM18799m.longValue());
                } else {
                    nzwVarM18392b = oaq.f45169b;
                }
                nzwVarM18392b.getClass();
                if (ayhVar == null) {
                    i9 = 4;
                } else {
                    nzwVar2.getClass();
                    oaq.m18393c(nzwVar2);
                    oaq.m18393c(nzwVarM18392b);
                    j = nzwVar2.f45103a;
                    j2 = nzwVarM18392b.f45103a;
                    i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
                    if (j == j2) {
                        i2 = nzwVar2.f45104b;
                        i3 = nzwVarM18392b.f45104b;
                        if (i2 == i3) {
                            i = 0;
                        } else if (i2 < i3) {
                            i9 = 1;
                        } else {
                            i = 1;
                        }
                        if (i < 0) {
                            i9 = 1;
                        }
                    } else if (i < 0) {
                        i9 = 1;
                    }
                }
                ayjVar = new ayj(F250AutoWorker.class);
                nzw nzwVarM15687g12 = lle.m15687g(mbrVar.f39861b);
                nzwVar2.getClass();
                oaq.m18393c(nzwVarM15687g12);
                oaq.m18393c(nzwVar2);
                jM14996an = kxk.m14996an(nzwVar2.f45103a, nzwVarM15687g12.f45103a);
                i4 = nzwVar2.f45104b;
                i5 = nzwVarM15687g12.f45104b;
                i6 = i9;
                nzwVar4 = nzwVar2;
                j3 = ((long) i4) - ((long) i5);
                i7 = (int) j3;
                if (j3 == i7) {
                    throw new ArithmeticException("overflow: checkedSubtract(" + i4 + ", " + i5 + ")");
                }
                nxdVarM18389a = oao.m18389a(jM14996an, i7);
                nxdVarM18389a.getClass();
                if (ooc.m18737c(nxdVarM18389a, oao.f45167b)) {
                    jM14994al = Long.MAX_VALUE;
                } else if (ooc.m18737c(nxdVarM18389a, oao.f45166a)) {
                    jM14994al = Long.MIN_VALUE;
                } else {
                    oao.m18390b(nxdVarM18389a);
                    jM14994al = kxk.m14994al(kxk.m14995am(nxdVarM18389a.f44900a, 1000L), nxdVarM18389a.f44901b / 1000000);
                }
                TimeUnit timeUnit12 = TimeUnit.MILLISECONDS;
                timeUnit12.getClass();
                ayjVar.f2722b.f2969f = timeUnit12.toMillis(jM14994al);
                if (Long.MAX_VALUE - System.currentTimeMillis() > ayjVar.f2722b.f2969f) {
                    throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!");
                }
                nzwVar4.getClass();
                if (ooc.m18737c(nzwVar4, oaq.f45169b)) {
                    jM18391a = Long.MAX_VALUE;
                } else if (ooc.m18737c(nzwVar4, oaq.f45168a)) {
                    jM18391a = Long.MIN_VALUE;
                } else {
                    jM18391a = oaq.m18391a(nzwVar4);
                }
                ayjVar.m2105a(String.valueOf(jM18391a));
                C1058va c1058vaM2106b12 = ayjVar.m2106b();
                mavVar2 = mbrVar.f39860a;
                oerVar = oer.ERROR_ENQUEUE_WORK;
                okvVar = okv.f46215a;
                bevVar = ((ayz) mbrVar.m16301d().m2104d("F250_AUTO_WORKER_TAG", i6, c1058vaM2106b12)).f2738c;
                mboVar.f39841a = mbrVar;
                mboVar.f39846f = mauVar2;
                mboVar.f39842b = mavVar2;
                mboVar.f39848h = okvVar;
                mboVar.f39849i = okvVar;
                mboVar.f39847g = oerVar;
                mboVar.f39845e = 3;
                if (lku.m15644am(bevVar, mboVar) == omaVar) {
                    return omaVar;
                }
                mauVar4 = mauVar2;
                mavVar3 = mbrVar.f39860a;
                lvoVarM16279e = mau.m16279e(mauVar4, null, null, oer.SUCCESS_PARTIAL_AUTO_WORK_ENQUEUED, 11);
                mboVar.f39841a = null;
                mboVar.f39846f = null;
                mboVar.f39842b = null;
                mboVar.f39848h = null;
                mboVar.f39849i = null;
                mboVar.f39847g = null;
                mboVar.f39845e = 5;
                if (mavVar3.m16285a(lvoVarM16279e, mboVar) == omaVar) {
                    return omaVar;
                }
                return oki.f46196a;
            case 3:
                oerVar2 = mboVar.f39847g;
                okvVar = mboVar.f39849i;
                okvVar2 = mboVar.f39848h;
                mavVar2 = (mav) mboVar.f39842b;
                mauVar4 = mboVar.f39846f;
                mbrVar = (mbr) mboVar.f39841a;
                try {
                    lkm.m15592s(objM15644am);
                    mavVar3 = mbrVar.f39860a;
                    lvoVarM16279e = mau.m16279e(mauVar4, null, null, oer.SUCCESS_PARTIAL_AUTO_WORK_ENQUEUED, 11);
                    mboVar.f39841a = null;
                    mboVar.f39846f = null;
                    mboVar.f39842b = null;
                    mboVar.f39848h = null;
                    mboVar.f39849i = null;
                    mboVar.f39847g = null;
                    mboVar.f39845e = 5;
                    if (mavVar3.m16285a(lvoVarM16279e, mboVar) == omaVar) {
                        return omaVar;
                    }
                    return oki.f46196a;
                } catch (Throwable th7) {
                    th = th7;
                    if (!(th instanceof CancellationException)) {
                        lvoVarM16280a = mauVar4.m16280a(okvVar2, okvVar, oerVar2, th);
                        mboVar.f39841a = th;
                        mboVar.f39846f = null;
                        mboVar.f39842b = null;
                        mboVar.f39848h = null;
                        mboVar.f39849i = null;
                        mboVar.f39847g = null;
                        mboVar.f39845e = 4;
                        if (mavVar2.m16285a(lvoVarM16280a, mboVar) == omaVar) {
                            return omaVar;
                        }
                    }
                    throw th;
                }
            case 4:
                Throwable th8 = (Throwable) mboVar.f39841a;
                lkm.m15592s(objM15644am);
                throw th8;
            case 5:
                lkm.m15592s(objM15644am);
                return oki.f46196a;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:55:0x010e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:59:0x0153 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:60:0x0154  */
    /* JADX WARN: Code duplicated, block: B:63:0x0175 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:70:0x0181  */
    /* JADX WARN: Code duplicated, block: B:72:0x019a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:74:0x019c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:? A[RETURN, SYNTHETIC] */
    @Override // p000.mat
    /* JADX INFO: renamed from: b */
    public final Object mo16276b(mau mauVar, axr axrVar, ols olsVar) throws Throwable {
        mbp mbpVar;
        mbr mbrVar;
        mav mavVar;
        lvo lvoVarM16277c;
        mau mauVar2;
        axr axrVar2;
        List list;
        ListIterator listIterator;
        Object objPrevious;
        ayh ayhVar;
        mav mavVar2;
        oer oerVar;
        okv okvVar;
        mau mauVar3;
        okv okvVar2;
        okv okvVar3;
        bev bevVar;
        mbr mbrVar2;
        lvo lvoVarM16280a;
        mav mavVar3;
        lvo lvoVarM16279e;
        if (olsVar instanceof mbp) {
            mbpVar = (mbp) olsVar;
            int i = mbpVar.f39854e;
            if ((i & Integer.MIN_VALUE) != 0) {
                mbpVar.f39854e = i - Integer.MIN_VALUE;
            } else {
                mbpVar = new mbp(this, olsVar);
            }
        } else {
            mbpVar = new mbp(this, olsVar);
        }
        Object objM15644am = mbpVar.f39852c;
        oma omaVar = oma.COROUTINE_SUSPENDED;
        switch (mbpVar.f39854e) {
            case 0:
                lkm.m15592s(objM15644am);
                try {
                    nps npsVarMo2101a = m16301d().mo2101a("F250_WORKER_TAG");
                    mbpVar.f39850a = this;
                    mbpVar.f39855f = mauVar;
                    mbpVar.f39851b = axrVar;
                    mbpVar.f39854e = 1;
                    objM15644am = lku.m15644am(npsVarMo2101a, mbpVar);
                    if (objM15644am == omaVar) {
                        return omaVar;
                    }
                    mbrVar = this;
                    try {
                        list = (List) objM15644am;
                        axr axrVar3 = axrVar;
                        mauVar2 = mauVar;
                        axrVar2 = axrVar3;
                    } catch (Throwable th) {
                        th = th;
                        mavVar = mbrVar.f39860a;
                        lvoVarM16277c = mau.m16277c(mauVar, oer.ERROR_PARTIAL_QUERY_WORK, th, null, 12);
                        mbpVar.f39850a = mbrVar;
                        mbpVar.f39855f = mauVar;
                        mbpVar.f39851b = axrVar;
                        mbpVar.f39854e = 2;
                        if (mavVar.m16285a(lvoVarM16277c, mbpVar) == omaVar) {
                            return omaVar;
                        }
                        axr axrVar4 = axrVar;
                        mauVar2 = mauVar;
                        axrVar2 = axrVar4;
                        list = okv.f46215a;
                    }
                    list.getClass();
                    listIterator = list.listIterator(list.size());
                    try {
                        do {
                            if (listIterator.hasPrevious()) {
                                objPrevious = listIterator.previous();
                            } else {
                                objPrevious = null;
                            }
                            ayhVar = (ayh) objPrevious;
                            if (ayhVar != null && !ayhVar.f2714a.contains(String.valueOf(axrVar2.hashCode()))) {
                                mbpVar.f39850a = mbrVar;
                                mbpVar.f39855f = mauVar2;
                                mbpVar.f39851b = axrVar2;
                                mbpVar.f39854e = 3;
                                if (mbrVar.m16302c(mauVar2, mbpVar) == omaVar) {
                                    return omaVar;
                                }
                            }
                            ayj ayjVar = new ayj(F250Worker.class);
                            axrVar2.getClass();
                            ayjVar.f2722b.f2972i = axrVar2;
                            ayjVar.m2105a(String.valueOf(axrVar2.hashCode()));
                            C1058va c1058vaM2106b = ayjVar.m2106b();
                            mavVar2 = mbrVar.f39860a;
                            oerVar = oer.ERROR_ENQUEUE_WORK;
                            okvVar = okv.f46215a;
                            bevVar = ((ayz) mbrVar.m16301d().m2104d("F250_WORKER_TAG", 2, c1058vaM2106b)).f2738c;
                            mbpVar.f39850a = mbrVar;
                            mbpVar.f39855f = mauVar2;
                            mbpVar.f39851b = mavVar2;
                            mbpVar.f39857h = okvVar;
                            mbpVar.f39858i = okvVar;
                            mbpVar.f39856g = oerVar;
                            mbpVar.f39854e = 4;
                            if (lku.m15644am(bevVar, mbpVar) == omaVar) {
                                return omaVar;
                            }
                            mauVar3 = mauVar2;
                            mbrVar2 = mbrVar;
                            mavVar3 = mbrVar2.f39860a;
                            lvoVarM16279e = mau.m16279e(mauVar3, null, null, oer.SUCCESS_PARTIAL_UPLOAD_WORK_ENQUEUED, 11);
                            mbpVar.f39850a = null;
                            mbpVar.f39855f = null;
                            mbpVar.f39851b = null;
                            mbpVar.f39857h = null;
                            mbpVar.f39858i = null;
                            mbpVar.f39856g = null;
                            mbpVar.f39854e = 6;
                            if (mavVar3.m16285a(lvoVarM16279e, mbpVar) == omaVar) {
                                return omaVar;
                            }
                            return oki.f46196a;
                        } while (!(!C0158ej.m7379f(((ayh) objPrevious).f2715b)));
                        bevVar = ((ayz) mbrVar.m16301d().m2104d("F250_WORKER_TAG", 2, c1058vaM2106b)).f2738c;
                        mbpVar.f39850a = mbrVar;
                        mbpVar.f39855f = mauVar2;
                        mbpVar.f39851b = mavVar2;
                        mbpVar.f39857h = okvVar;
                        mbpVar.f39858i = okvVar;
                        mbpVar.f39856g = oerVar;
                        mbpVar.f39854e = 4;
                        if (lku.m15644am(bevVar, mbpVar) == omaVar) {
                            return omaVar;
                        }
                        mauVar3 = mauVar2;
                        mbrVar2 = mbrVar;
                        mavVar3 = mbrVar2.f39860a;
                        lvoVarM16279e = mau.m16279e(mauVar3, null, null, oer.SUCCESS_PARTIAL_UPLOAD_WORK_ENQUEUED, 11);
                        mbpVar.f39850a = null;
                        mbpVar.f39855f = null;
                        mbpVar.f39851b = null;
                        mbpVar.f39857h = null;
                        mbpVar.f39858i = null;
                        mbpVar.f39856g = null;
                        mbpVar.f39854e = 6;
                        if (mavVar3.m16285a(lvoVarM16279e, mbpVar) == omaVar) {
                            return omaVar;
                        }
                        return oki.f46196a;
                    } catch (Throwable th2) {
                        th = th2;
                        mauVar3 = mauVar2;
                        okvVar2 = okvVar;
                        okvVar3 = okvVar2;
                        if (!(th instanceof CancellationException)) {
                            throw th;
                        }
                        lvoVarM16280a = mauVar3.m16280a(okvVar3, okvVar2, oerVar, th);
                        mbpVar.f39850a = th;
                        mbpVar.f39855f = null;
                        mbpVar.f39851b = null;
                        mbpVar.f39857h = null;
                        mbpVar.f39858i = null;
                        mbpVar.f39856g = null;
                        mbpVar.f39854e = 5;
                        if (mavVar2.m16285a(lvoVarM16280a, mbpVar) == omaVar) {
                            return omaVar;
                        }
                        throw th;
                    }
                    ayhVar = (ayh) objPrevious;
                    if (ayhVar != null) {
                        mbpVar.f39850a = mbrVar;
                        mbpVar.f39855f = mauVar2;
                        mbpVar.f39851b = axrVar2;
                        mbpVar.f39854e = 3;
                        if (mbrVar.m16302c(mauVar2, mbpVar) == omaVar) {
                            return omaVar;
                        }
                    }
                    ayj ayjVar2 = new ayj(F250Worker.class);
                    axrVar2.getClass();
                    ayjVar2.f2722b.f2972i = axrVar2;
                    ayjVar2.m2105a(String.valueOf(axrVar2.hashCode()));
                    C1058va c1058vaM2106b2 = ayjVar2.m2106b();
                    mavVar2 = mbrVar.f39860a;
                    oerVar = oer.ERROR_ENQUEUE_WORK;
                    okvVar = okv.f46215a;
                } catch (Throwable th3) {
                    th = th3;
                    mbrVar = this;
                    mavVar = mbrVar.f39860a;
                    lvoVarM16277c = mau.m16277c(mauVar, oer.ERROR_PARTIAL_QUERY_WORK, th, null, 12);
                    mbpVar.f39850a = mbrVar;
                    mbpVar.f39855f = mauVar;
                    mbpVar.f39851b = axrVar;
                    mbpVar.f39854e = 2;
                    if (mavVar.m16285a(lvoVarM16277c, mbpVar) == omaVar) {
                        return omaVar;
                    }
                    axr axrVar5 = axrVar;
                    mauVar2 = mauVar;
                    axrVar2 = axrVar5;
                    list = okv.f46215a;
                    list.getClass();
                    listIterator = list.listIterator(list.size());
                    do {
                        if (listIterator.hasPrevious()) {
                            objPrevious = listIterator.previous();
                        } else {
                            objPrevious = null;
                        }
                        ayhVar = (ayh) objPrevious;
                        if (ayhVar != null) {
                            mbpVar.f39850a = mbrVar;
                            mbpVar.f39855f = mauVar2;
                            mbpVar.f39851b = axrVar2;
                            mbpVar.f39854e = 3;
                            if (mbrVar.m16302c(mauVar2, mbpVar) == omaVar) {
                                return omaVar;
                            }
                        }
                        ayj ayjVar3 = new ayj(F250Worker.class);
                        axrVar2.getClass();
                        ayjVar3.f2722b.f2972i = axrVar2;
                        ayjVar3.m2105a(String.valueOf(axrVar2.hashCode()));
                        C1058va c1058vaM2106b3 = ayjVar3.m2106b();
                        mavVar2 = mbrVar.f39860a;
                        oerVar = oer.ERROR_ENQUEUE_WORK;
                        okvVar = okv.f46215a;
                        bevVar = ((ayz) mbrVar.m16301d().m2104d("F250_WORKER_TAG", 2, c1058vaM2106b3)).f2738c;
                        mbpVar.f39850a = mbrVar;
                        mbpVar.f39855f = mauVar2;
                        mbpVar.f39851b = mavVar2;
                        mbpVar.f39857h = okvVar;
                        mbpVar.f39858i = okvVar;
                        mbpVar.f39856g = oerVar;
                        mbpVar.f39854e = 4;
                        if (lku.m15644am(bevVar, mbpVar) == omaVar) {
                            return omaVar;
                        }
                        mauVar3 = mauVar2;
                        mbrVar2 = mbrVar;
                        mavVar3 = mbrVar2.f39860a;
                        lvoVarM16279e = mau.m16279e(mauVar3, null, null, oer.SUCCESS_PARTIAL_UPLOAD_WORK_ENQUEUED, 11);
                        mbpVar.f39850a = null;
                        mbpVar.f39855f = null;
                        mbpVar.f39851b = null;
                        mbpVar.f39857h = null;
                        mbpVar.f39858i = null;
                        mbpVar.f39856g = null;
                        mbpVar.f39854e = 6;
                        if (mavVar3.m16285a(lvoVarM16279e, mbpVar) == omaVar) {
                            return omaVar;
                        }
                        return oki.f46196a;
                    } while (!(!C0158ej.m7379f(((ayh) objPrevious).f2715b)));
                    ayhVar = (ayh) objPrevious;
                    if (ayhVar != null) {
                        mbpVar.f39850a = mbrVar;
                        mbpVar.f39855f = mauVar2;
                        mbpVar.f39851b = axrVar2;
                        mbpVar.f39854e = 3;
                        if (mbrVar.m16302c(mauVar2, mbpVar) == omaVar) {
                            return omaVar;
                        }
                    }
                    ayj ayjVar4 = new ayj(F250Worker.class);
                    axrVar2.getClass();
                    ayjVar4.f2722b.f2972i = axrVar2;
                    ayjVar4.m2105a(String.valueOf(axrVar2.hashCode()));
                    C1058va c1058vaM2106b4 = ayjVar4.m2106b();
                    mavVar2 = mbrVar.f39860a;
                    oerVar = oer.ERROR_ENQUEUE_WORK;
                    okvVar = okv.f46215a;
                    bevVar = ((ayz) mbrVar.m16301d().m2104d("F250_WORKER_TAG", 2, c1058vaM2106b4)).f2738c;
                    mbpVar.f39850a = mbrVar;
                    mbpVar.f39855f = mauVar2;
                    mbpVar.f39851b = mavVar2;
                    mbpVar.f39857h = okvVar;
                    mbpVar.f39858i = okvVar;
                    mbpVar.f39856g = oerVar;
                    mbpVar.f39854e = 4;
                    if (lku.m15644am(bevVar, mbpVar) == omaVar) {
                        return omaVar;
                    }
                    mauVar3 = mauVar2;
                    mbrVar2 = mbrVar;
                    mavVar3 = mbrVar2.f39860a;
                    lvoVarM16279e = mau.m16279e(mauVar3, null, null, oer.SUCCESS_PARTIAL_UPLOAD_WORK_ENQUEUED, 11);
                    mbpVar.f39850a = null;
                    mbpVar.f39855f = null;
                    mbpVar.f39851b = null;
                    mbpVar.f39857h = null;
                    mbpVar.f39858i = null;
                    mbpVar.f39856g = null;
                    mbpVar.f39854e = 6;
                    if (mavVar3.m16285a(lvoVarM16279e, mbpVar) == omaVar) {
                        return omaVar;
                    }
                    return oki.f46196a;
                }
                break;
            case 1:
                axrVar = (axr) mbpVar.f39851b;
                mauVar = mbpVar.f39855f;
                mbrVar = (mbr) mbpVar.f39850a;
                try {
                    lkm.m15592s(objM15644am);
                    list = (List) objM15644am;
                    axr axrVar6 = axrVar;
                    mauVar2 = mauVar;
                    axrVar2 = axrVar6;
                } catch (Throwable th4) {
                    th = th4;
                    mavVar = mbrVar.f39860a;
                    lvoVarM16277c = mau.m16277c(mauVar, oer.ERROR_PARTIAL_QUERY_WORK, th, null, 12);
                    mbpVar.f39850a = mbrVar;
                    mbpVar.f39855f = mauVar;
                    mbpVar.f39851b = axrVar;
                    mbpVar.f39854e = 2;
                    if (mavVar.m16285a(lvoVarM16277c, mbpVar) == omaVar) {
                        return omaVar;
                    }
                    axr axrVar7 = axrVar;
                    mauVar2 = mauVar;
                    axrVar2 = axrVar7;
                    list = okv.f46215a;
                    list.getClass();
                    listIterator = list.listIterator(list.size());
                    do {
                        if (listIterator.hasPrevious()) {
                            objPrevious = listIterator.previous();
                        } else {
                            objPrevious = null;
                        }
                        ayhVar = (ayh) objPrevious;
                        if (ayhVar != null) {
                            mbpVar.f39850a = mbrVar;
                            mbpVar.f39855f = mauVar2;
                            mbpVar.f39851b = axrVar2;
                            mbpVar.f39854e = 3;
                            if (mbrVar.m16302c(mauVar2, mbpVar) == omaVar) {
                                return omaVar;
                            }
                        }
                        ayj ayjVar5 = new ayj(F250Worker.class);
                        axrVar2.getClass();
                        ayjVar5.f2722b.f2972i = axrVar2;
                        ayjVar5.m2105a(String.valueOf(axrVar2.hashCode()));
                        C1058va c1058vaM2106b5 = ayjVar5.m2106b();
                        mavVar2 = mbrVar.f39860a;
                        oerVar = oer.ERROR_ENQUEUE_WORK;
                        okvVar = okv.f46215a;
                        bevVar = ((ayz) mbrVar.m16301d().m2104d("F250_WORKER_TAG", 2, c1058vaM2106b5)).f2738c;
                        mbpVar.f39850a = mbrVar;
                        mbpVar.f39855f = mauVar2;
                        mbpVar.f39851b = mavVar2;
                        mbpVar.f39857h = okvVar;
                        mbpVar.f39858i = okvVar;
                        mbpVar.f39856g = oerVar;
                        mbpVar.f39854e = 4;
                        if (lku.m15644am(bevVar, mbpVar) == omaVar) {
                            return omaVar;
                        }
                        mauVar3 = mauVar2;
                        mbrVar2 = mbrVar;
                        mavVar3 = mbrVar2.f39860a;
                        lvoVarM16279e = mau.m16279e(mauVar3, null, null, oer.SUCCESS_PARTIAL_UPLOAD_WORK_ENQUEUED, 11);
                        mbpVar.f39850a = null;
                        mbpVar.f39855f = null;
                        mbpVar.f39851b = null;
                        mbpVar.f39857h = null;
                        mbpVar.f39858i = null;
                        mbpVar.f39856g = null;
                        mbpVar.f39854e = 6;
                        if (mavVar3.m16285a(lvoVarM16279e, mbpVar) == omaVar) {
                            return omaVar;
                        }
                        return oki.f46196a;
                    } while (!(!C0158ej.m7379f(((ayh) objPrevious).f2715b)));
                    ayhVar = (ayh) objPrevious;
                    if (ayhVar != null) {
                        mbpVar.f39850a = mbrVar;
                        mbpVar.f39855f = mauVar2;
                        mbpVar.f39851b = axrVar2;
                        mbpVar.f39854e = 3;
                        if (mbrVar.m16302c(mauVar2, mbpVar) == omaVar) {
                            return omaVar;
                        }
                    }
                    ayj ayjVar6 = new ayj(F250Worker.class);
                    axrVar2.getClass();
                    ayjVar6.f2722b.f2972i = axrVar2;
                    ayjVar6.m2105a(String.valueOf(axrVar2.hashCode()));
                    C1058va c1058vaM2106b6 = ayjVar6.m2106b();
                    mavVar2 = mbrVar.f39860a;
                    oerVar = oer.ERROR_ENQUEUE_WORK;
                    okvVar = okv.f46215a;
                    bevVar = ((ayz) mbrVar.m16301d().m2104d("F250_WORKER_TAG", 2, c1058vaM2106b6)).f2738c;
                    mbpVar.f39850a = mbrVar;
                    mbpVar.f39855f = mauVar2;
                    mbpVar.f39851b = mavVar2;
                    mbpVar.f39857h = okvVar;
                    mbpVar.f39858i = okvVar;
                    mbpVar.f39856g = oerVar;
                    mbpVar.f39854e = 4;
                    if (lku.m15644am(bevVar, mbpVar) == omaVar) {
                        return omaVar;
                    }
                    mauVar3 = mauVar2;
                    mbrVar2 = mbrVar;
                    mavVar3 = mbrVar2.f39860a;
                    lvoVarM16279e = mau.m16279e(mauVar3, null, null, oer.SUCCESS_PARTIAL_UPLOAD_WORK_ENQUEUED, 11);
                    mbpVar.f39850a = null;
                    mbpVar.f39855f = null;
                    mbpVar.f39851b = null;
                    mbpVar.f39857h = null;
                    mbpVar.f39858i = null;
                    mbpVar.f39856g = null;
                    mbpVar.f39854e = 6;
                    if (mavVar3.m16285a(lvoVarM16279e, mbpVar) == omaVar) {
                        return omaVar;
                    }
                    return oki.f46196a;
                }
                list.getClass();
                listIterator = list.listIterator(list.size());
                do {
                    if (listIterator.hasPrevious()) {
                        objPrevious = listIterator.previous();
                    } else {
                        objPrevious = null;
                    }
                    ayhVar = (ayh) objPrevious;
                    if (ayhVar != null) {
                        mbpVar.f39850a = mbrVar;
                        mbpVar.f39855f = mauVar2;
                        mbpVar.f39851b = axrVar2;
                        mbpVar.f39854e = 3;
                        if (mbrVar.m16302c(mauVar2, mbpVar) == omaVar) {
                            return omaVar;
                        }
                    }
                    ayj ayjVar7 = new ayj(F250Worker.class);
                    axrVar2.getClass();
                    ayjVar7.f2722b.f2972i = axrVar2;
                    ayjVar7.m2105a(String.valueOf(axrVar2.hashCode()));
                    C1058va c1058vaM2106b7 = ayjVar7.m2106b();
                    mavVar2 = mbrVar.f39860a;
                    oerVar = oer.ERROR_ENQUEUE_WORK;
                    okvVar = okv.f46215a;
                    bevVar = ((ayz) mbrVar.m16301d().m2104d("F250_WORKER_TAG", 2, c1058vaM2106b7)).f2738c;
                    mbpVar.f39850a = mbrVar;
                    mbpVar.f39855f = mauVar2;
                    mbpVar.f39851b = mavVar2;
                    mbpVar.f39857h = okvVar;
                    mbpVar.f39858i = okvVar;
                    mbpVar.f39856g = oerVar;
                    mbpVar.f39854e = 4;
                    if (lku.m15644am(bevVar, mbpVar) == omaVar) {
                        return omaVar;
                    }
                    mauVar3 = mauVar2;
                    mbrVar2 = mbrVar;
                    mavVar3 = mbrVar2.f39860a;
                    lvoVarM16279e = mau.m16279e(mauVar3, null, null, oer.SUCCESS_PARTIAL_UPLOAD_WORK_ENQUEUED, 11);
                    mbpVar.f39850a = null;
                    mbpVar.f39855f = null;
                    mbpVar.f39851b = null;
                    mbpVar.f39857h = null;
                    mbpVar.f39858i = null;
                    mbpVar.f39856g = null;
                    mbpVar.f39854e = 6;
                    if (mavVar3.m16285a(lvoVarM16279e, mbpVar) == omaVar) {
                        return omaVar;
                    }
                    return oki.f46196a;
                } while (!(!C0158ej.m7379f(((ayh) objPrevious).f2715b)));
                ayhVar = (ayh) objPrevious;
                if (ayhVar != null) {
                    mbpVar.f39850a = mbrVar;
                    mbpVar.f39855f = mauVar2;
                    mbpVar.f39851b = axrVar2;
                    mbpVar.f39854e = 3;
                    if (mbrVar.m16302c(mauVar2, mbpVar) == omaVar) {
                        return omaVar;
                    }
                }
                ayj ayjVar8 = new ayj(F250Worker.class);
                axrVar2.getClass();
                ayjVar8.f2722b.f2972i = axrVar2;
                ayjVar8.m2105a(String.valueOf(axrVar2.hashCode()));
                C1058va c1058vaM2106b8 = ayjVar8.m2106b();
                mavVar2 = mbrVar.f39860a;
                oerVar = oer.ERROR_ENQUEUE_WORK;
                okvVar = okv.f46215a;
                bevVar = ((ayz) mbrVar.m16301d().m2104d("F250_WORKER_TAG", 2, c1058vaM2106b8)).f2738c;
                mbpVar.f39850a = mbrVar;
                mbpVar.f39855f = mauVar2;
                mbpVar.f39851b = mavVar2;
                mbpVar.f39857h = okvVar;
                mbpVar.f39858i = okvVar;
                mbpVar.f39856g = oerVar;
                mbpVar.f39854e = 4;
                if (lku.m15644am(bevVar, mbpVar) == omaVar) {
                    return omaVar;
                }
                mauVar3 = mauVar2;
                mbrVar2 = mbrVar;
                mavVar3 = mbrVar2.f39860a;
                lvoVarM16279e = mau.m16279e(mauVar3, null, null, oer.SUCCESS_PARTIAL_UPLOAD_WORK_ENQUEUED, 11);
                mbpVar.f39850a = null;
                mbpVar.f39855f = null;
                mbpVar.f39851b = null;
                mbpVar.f39857h = null;
                mbpVar.f39858i = null;
                mbpVar.f39856g = null;
                mbpVar.f39854e = 6;
                if (mavVar3.m16285a(lvoVarM16279e, mbpVar) == omaVar) {
                    return omaVar;
                }
                return oki.f46196a;
            case 2:
                axrVar2 = (axr) mbpVar.f39851b;
                mauVar2 = mbpVar.f39855f;
                mbrVar = (mbr) mbpVar.f39850a;
                lkm.m15592s(objM15644am);
                list = okv.f46215a;
                list.getClass();
                listIterator = list.listIterator(list.size());
                do {
                    if (listIterator.hasPrevious()) {
                        objPrevious = listIterator.previous();
                    } else {
                        objPrevious = null;
                    }
                    ayhVar = (ayh) objPrevious;
                    if (ayhVar != null) {
                        mbpVar.f39850a = mbrVar;
                        mbpVar.f39855f = mauVar2;
                        mbpVar.f39851b = axrVar2;
                        mbpVar.f39854e = 3;
                        if (mbrVar.m16302c(mauVar2, mbpVar) == omaVar) {
                            return omaVar;
                        }
                    }
                    ayj ayjVar9 = new ayj(F250Worker.class);
                    axrVar2.getClass();
                    ayjVar9.f2722b.f2972i = axrVar2;
                    ayjVar9.m2105a(String.valueOf(axrVar2.hashCode()));
                    C1058va c1058vaM2106b9 = ayjVar9.m2106b();
                    mavVar2 = mbrVar.f39860a;
                    oerVar = oer.ERROR_ENQUEUE_WORK;
                    okvVar = okv.f46215a;
                    bevVar = ((ayz) mbrVar.m16301d().m2104d("F250_WORKER_TAG", 2, c1058vaM2106b9)).f2738c;
                    mbpVar.f39850a = mbrVar;
                    mbpVar.f39855f = mauVar2;
                    mbpVar.f39851b = mavVar2;
                    mbpVar.f39857h = okvVar;
                    mbpVar.f39858i = okvVar;
                    mbpVar.f39856g = oerVar;
                    mbpVar.f39854e = 4;
                    if (lku.m15644am(bevVar, mbpVar) == omaVar) {
                        return omaVar;
                    }
                    mauVar3 = mauVar2;
                    mbrVar2 = mbrVar;
                    mavVar3 = mbrVar2.f39860a;
                    lvoVarM16279e = mau.m16279e(mauVar3, null, null, oer.SUCCESS_PARTIAL_UPLOAD_WORK_ENQUEUED, 11);
                    mbpVar.f39850a = null;
                    mbpVar.f39855f = null;
                    mbpVar.f39851b = null;
                    mbpVar.f39857h = null;
                    mbpVar.f39858i = null;
                    mbpVar.f39856g = null;
                    mbpVar.f39854e = 6;
                    if (mavVar3.m16285a(lvoVarM16279e, mbpVar) == omaVar) {
                        return omaVar;
                    }
                    return oki.f46196a;
                } while (!(!C0158ej.m7379f(((ayh) objPrevious).f2715b)));
                ayhVar = (ayh) objPrevious;
                if (ayhVar != null) {
                    mbpVar.f39850a = mbrVar;
                    mbpVar.f39855f = mauVar2;
                    mbpVar.f39851b = axrVar2;
                    mbpVar.f39854e = 3;
                    if (mbrVar.m16302c(mauVar2, mbpVar) == omaVar) {
                        return omaVar;
                    }
                }
                ayj ayjVar10 = new ayj(F250Worker.class);
                axrVar2.getClass();
                ayjVar10.f2722b.f2972i = axrVar2;
                ayjVar10.m2105a(String.valueOf(axrVar2.hashCode()));
                C1058va c1058vaM2106b10 = ayjVar10.m2106b();
                mavVar2 = mbrVar.f39860a;
                oerVar = oer.ERROR_ENQUEUE_WORK;
                okvVar = okv.f46215a;
                bevVar = ((ayz) mbrVar.m16301d().m2104d("F250_WORKER_TAG", 2, c1058vaM2106b10)).f2738c;
                mbpVar.f39850a = mbrVar;
                mbpVar.f39855f = mauVar2;
                mbpVar.f39851b = mavVar2;
                mbpVar.f39857h = okvVar;
                mbpVar.f39858i = okvVar;
                mbpVar.f39856g = oerVar;
                mbpVar.f39854e = 4;
                if (lku.m15644am(bevVar, mbpVar) == omaVar) {
                    return omaVar;
                }
                mauVar3 = mauVar2;
                mbrVar2 = mbrVar;
                mavVar3 = mbrVar2.f39860a;
                lvoVarM16279e = mau.m16279e(mauVar3, null, null, oer.SUCCESS_PARTIAL_UPLOAD_WORK_ENQUEUED, 11);
                mbpVar.f39850a = null;
                mbpVar.f39855f = null;
                mbpVar.f39851b = null;
                mbpVar.f39857h = null;
                mbpVar.f39858i = null;
                mbpVar.f39856g = null;
                mbpVar.f39854e = 6;
                if (mavVar3.m16285a(lvoVarM16279e, mbpVar) == omaVar) {
                    return omaVar;
                }
                return oki.f46196a;
            case 3:
                axrVar2 = (axr) mbpVar.f39851b;
                mauVar2 = mbpVar.f39855f;
                mbrVar = (mbr) mbpVar.f39850a;
                lkm.m15592s(objM15644am);
                ayj ayjVar11 = new ayj(F250Worker.class);
                axrVar2.getClass();
                ayjVar11.f2722b.f2972i = axrVar2;
                ayjVar11.m2105a(String.valueOf(axrVar2.hashCode()));
                C1058va c1058vaM2106b11 = ayjVar11.m2106b();
                mavVar2 = mbrVar.f39860a;
                oerVar = oer.ERROR_ENQUEUE_WORK;
                okvVar = okv.f46215a;
                bevVar = ((ayz) mbrVar.m16301d().m2104d("F250_WORKER_TAG", 2, c1058vaM2106b11)).f2738c;
                mbpVar.f39850a = mbrVar;
                mbpVar.f39855f = mauVar2;
                mbpVar.f39851b = mavVar2;
                mbpVar.f39857h = okvVar;
                mbpVar.f39858i = okvVar;
                mbpVar.f39856g = oerVar;
                mbpVar.f39854e = 4;
                if (lku.m15644am(bevVar, mbpVar) == omaVar) {
                    return omaVar;
                }
                mauVar3 = mauVar2;
                mbrVar2 = mbrVar;
                mavVar3 = mbrVar2.f39860a;
                lvoVarM16279e = mau.m16279e(mauVar3, null, null, oer.SUCCESS_PARTIAL_UPLOAD_WORK_ENQUEUED, 11);
                mbpVar.f39850a = null;
                mbpVar.f39855f = null;
                mbpVar.f39851b = null;
                mbpVar.f39857h = null;
                mbpVar.f39858i = null;
                mbpVar.f39856g = null;
                mbpVar.f39854e = 6;
                if (mavVar3.m16285a(lvoVarM16279e, mbpVar) == omaVar) {
                    return omaVar;
                }
                return oki.f46196a;
            case 4:
                oer oerVar2 = mbpVar.f39856g;
                okvVar2 = mbpVar.f39858i;
                okvVar3 = mbpVar.f39857h;
                mavVar2 = (mav) mbpVar.f39851b;
                mauVar3 = mbpVar.f39855f;
                mbrVar2 = (mbr) mbpVar.f39850a;
                try {
                    lkm.m15592s(objM15644am);
                    mavVar3 = mbrVar2.f39860a;
                    lvoVarM16279e = mau.m16279e(mauVar3, null, null, oer.SUCCESS_PARTIAL_UPLOAD_WORK_ENQUEUED, 11);
                    mbpVar.f39850a = null;
                    mbpVar.f39855f = null;
                    mbpVar.f39851b = null;
                    mbpVar.f39857h = null;
                    mbpVar.f39858i = null;
                    mbpVar.f39856g = null;
                    mbpVar.f39854e = 6;
                    if (mavVar3.m16285a(lvoVarM16279e, mbpVar) == omaVar) {
                        return omaVar;
                    }
                    return oki.f46196a;
                } catch (Throwable th5) {
                    oerVar = oerVar2;
                    th = th5;
                    if (!(th instanceof CancellationException)) {
                        throw th;
                    }
                    lvoVarM16280a = mauVar3.m16280a(okvVar3, okvVar2, oerVar, th);
                    mbpVar.f39850a = th;
                    mbpVar.f39855f = null;
                    mbpVar.f39851b = null;
                    mbpVar.f39857h = null;
                    mbpVar.f39858i = null;
                    mbpVar.f39856g = null;
                    mbpVar.f39854e = 5;
                    if (mavVar2.m16285a(lvoVarM16280a, mbpVar) == omaVar) {
                        return omaVar;
                    }
                    throw th;
                }
            case 5:
                Throwable th6 = (Throwable) mbpVar.f39850a;
                lkm.m15592s(objM15644am);
                throw th6;
            case 6:
                lkm.m15592s(objM15644am);
                return oki.f46196a;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x009b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:33:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:35:0x00c0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m16302c(mau mauVar, ols olsVar) throws Throwable {
        mbn mbnVar;
        mav mavVar;
        oer oerVar;
        okv okvVar;
        mau mauVar2;
        Throwable th;
        okv okvVar2;
        mbr mbrVar;
        lvo lvoVarM16280a;
        mav mavVar2;
        lvo lvoVarM16279e;
        if (olsVar instanceof mbn) {
            mbnVar = (mbn) olsVar;
            int i = mbnVar.f39835d;
            if ((i & Integer.MIN_VALUE) != 0) {
                mbnVar.f39835d = i - Integer.MIN_VALUE;
            } else {
                mbnVar = new mbn(this, olsVar);
            }
        } else {
            mbnVar = new mbn(this, olsVar);
        }
        Object obj = mbnVar.f39833b;
        oma omaVar = oma.COROUTINE_SUSPENDED;
        switch (mbnVar.f39835d) {
            case 0:
                lkm.m15592s(obj);
                mavVar = this.f39860a;
                oerVar = oer.ERROR_ENQUEUE_WORK;
                okvVar = okv.f46215a;
                try {
                    bev bevVar = ((ayz) m16301d().mo2103c()).f2738c;
                    mbnVar.f39832a = this;
                    mbnVar.f39836e = mauVar;
                    mbnVar.f39837f = mavVar;
                    mbnVar.f39839h = okvVar;
                    mbnVar.f39840i = okvVar;
                    mbnVar.f39838g = oerVar;
                    mbnVar.f39835d = 1;
                    if (lku.m15644am(bevVar, mbnVar) == omaVar) {
                        return omaVar;
                    }
                    mbrVar = this;
                    mavVar2 = mbrVar.f39860a;
                    lvoVarM16279e = mau.m16279e(mauVar, null, null, oer.SUCCESS_PARTIAL_UPLOAD_WORK_CANCELLED, 11);
                    mbnVar.f39832a = null;
                    mbnVar.f39836e = null;
                    mbnVar.f39837f = null;
                    mbnVar.f39839h = null;
                    mbnVar.f39840i = null;
                    mbnVar.f39838g = null;
                    mbnVar.f39835d = 3;
                    if (mavVar2.m16285a(lvoVarM16279e, mbnVar) == omaVar) {
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
                    mbnVar.f39832a = th;
                    mbnVar.f39836e = null;
                    mbnVar.f39837f = null;
                    mbnVar.f39839h = null;
                    mbnVar.f39840i = null;
                    mbnVar.f39838g = null;
                    mbnVar.f39835d = 2;
                    if (mavVar.m16285a(lvoVarM16280a, mbnVar) == omaVar) {
                        return omaVar;
                    }
                    throw th;
                }
            case 1:
                oer oerVar2 = mbnVar.f39838g;
                okvVar = mbnVar.f39840i;
                okvVar2 = mbnVar.f39839h;
                mavVar = mbnVar.f39837f;
                mauVar2 = mbnVar.f39836e;
                mbrVar = (mbr) mbnVar.f39832a;
                try {
                    lkm.m15592s(obj);
                    mauVar = mauVar2;
                    mavVar2 = mbrVar.f39860a;
                    lvoVarM16279e = mau.m16279e(mauVar, null, null, oer.SUCCESS_PARTIAL_UPLOAD_WORK_CANCELLED, 11);
                    mbnVar.f39832a = null;
                    mbnVar.f39836e = null;
                    mbnVar.f39837f = null;
                    mbnVar.f39839h = null;
                    mbnVar.f39840i = null;
                    mbnVar.f39838g = null;
                    mbnVar.f39835d = 3;
                    if (mavVar2.m16285a(lvoVarM16279e, mbnVar) == omaVar) {
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
                    mbnVar.f39832a = th;
                    mbnVar.f39836e = null;
                    mbnVar.f39837f = null;
                    mbnVar.f39839h = null;
                    mbnVar.f39840i = null;
                    mbnVar.f39838g = null;
                    mbnVar.f39835d = 2;
                    if (mavVar.m16285a(lvoVarM16280a, mbnVar) == omaVar) {
                        return omaVar;
                    }
                    throw th;
                }
            case 2:
                Throwable th4 = (Throwable) mbnVar.f39832a;
                lkm.m15592s(obj);
                throw th4;
            case 3:
                lkm.m15592s(obj);
                return oki.f46196a;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
