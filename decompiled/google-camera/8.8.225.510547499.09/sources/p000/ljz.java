package p000;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ljz implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ lkb f38447a;

    /* JADX INFO: renamed from: b */
    private final Thread.UncaughtExceptionHandler f38448b;

    public ljz(lkb lkbVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f38447a = lkbVar;
        this.f38448b = uncaughtExceptionHandler;
    }

    /* JADX WARN: Code duplicated, block: B:233:0x0654  */
    /* JADX WARN: Code duplicated, block: B:280:? A[SYNTHETIC] */
    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) throws Throwable {
        Thread thread2;
        Throwable th2;
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler;
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler2;
        liv livVarM16703b;
        int i;
        nxl nxlVarM18137O;
        Throwable[] thArr;
        Thread thread3 = thread;
        try {
            lkb lkbVar = this.f38447a;
            String name = thread.getName();
            String name2 = th.getClass().getName();
            for (Throwable cause = th.getCause(); cause != null && cause != cause.getCause(); cause = cause.getCause()) {
                name2 = cause.getClass().getName();
            }
            nxl nxlVarM18137O2 = nmv.f43910f.m18137O();
            nxl nxlVarM18137O3 = nms.f43891f.m18137O();
            if (!nxlVarM18137O3.f44974b.m18142ac()) {
                nxlVarM18137O3.mo18106p();
            }
            nms nmsVar = (nms) nxlVarM18137O3.f44974b;
            nmsVar.f43893a |= 1;
            nmsVar.f43894b = "";
            if (!nxlVarM18137O2.f44974b.m18142ac()) {
                nxlVarM18137O2.mo18106p();
            }
            nmv nmvVar = (nmv) nxlVarM18137O2.f44974b;
            nms nmsVar2 = (nms) nxlVarM18137O3.mo18103l();
            nmsVar2.getClass();
            nmvVar.f43915d = nmsVar2;
            nmvVar.f43912a |= 1;
            IdentityHashMap identityHashMap = new IdentityHashMap();
            ArrayList arrayList = new ArrayList();
            ArrayDeque arrayDeque = new ArrayDeque();
            arrayDeque.add(th);
            identityHashMap.put(th, 0);
            arrayList.add(kxk.m15002at(th));
            while (!arrayDeque.isEmpty()) {
                try {
                    try {
                        Throwable th3 = (Throwable) arrayDeque.remove();
                        Integer num = (Integer) identityHashMap.get(th3);
                        num.getClass();
                        int iIntValue = num.intValue();
                        if (th3.getCause() != null) {
                            Throwable cause2 = th3.getCause();
                            if (!identityHashMap.containsKey(cause2)) {
                                identityHashMap.put(cause2, Integer.valueOf(identityHashMap.size()));
                                arrayList.add(kxk.m15002at(cause2));
                                arrayDeque.add(cause2);
                            }
                            nxl nxlVar = (nxl) arrayList.get(iIntValue);
                            int iIntValue2 = ((Integer) identityHashMap.get(cause2)).intValue();
                            if (!nxlVar.f44974b.m18142ac()) {
                                nxlVar.mo18106p();
                            }
                            nmu nmuVar = (nmu) nxlVar.f44974b;
                            nmu nmuVar2 = nmu.f43903e;
                            nmuVar.f43905a |= 2;
                            nmuVar.f43907c = iIntValue2;
                        }
                        try {
                            thArr = (Throwable[]) Throwable.class.getDeclaredMethod("getSuppressed", new Class[0]).invoke(th3, new Object[0]);
                        } catch (Exception e) {
                            thArr = new Throwable[0];
                        }
                        int length = thArr.length;
                        int i2 = 0;
                        while (i2 < length) {
                            Throwable th4 = thArr[i2];
                            if (!identityHashMap.containsKey(th4)) {
                                identityHashMap.put(th4, Integer.valueOf(identityHashMap.size()));
                                arrayList.add(kxk.m15002at(th4));
                                arrayDeque.add(th4);
                            }
                            nxl nxlVar2 = (nxl) arrayList.get(iIntValue);
                            int iIntValue3 = ((Integer) identityHashMap.get(th4)).intValue();
                            Throwable[] thArr2 = thArr;
                            if (!nxlVar2.f44974b.m18142ac()) {
                                nxlVar2.mo18106p();
                            }
                            nmu nmuVar3 = (nmu) nxlVar2.f44974b;
                            nmu nmuVar4 = nmu.f43903e;
                            nxw nxwVar = nmuVar3.f43908d;
                            if (!nxwVar.mo17770c()) {
                                nmuVar3.f43908d = nxq.m18125S(nxwVar);
                            }
                            nmuVar3.f43908d.mo18148g(iIntValue3);
                            i2++;
                            thArr = thArr2;
                        }
                        thread3 = thread;
                    } catch (Exception e2) {
                        e = e2;
                        thread2 = thread;
                        try {
                            ((nbe) ((nbe) ((nbe) lkb.f38449a.m17252c()).mo17283h(e)).mo17276G(4517)).mo17290o("Failed to record crash.");
                            uncaughtExceptionHandler2 = this.f38448b;
                            if (uncaughtExceptionHandler2 == null) {
                                return;
                            }
                            uncaughtExceptionHandler2.uncaughtException(thread2, th);
                        } catch (Throwable th5) {
                            th = th5;
                            th2 = th;
                            uncaughtExceptionHandler = this.f38448b;
                            if (uncaughtExceptionHandler != null) {
                                throw th2;
                            }
                            uncaughtExceptionHandler.uncaughtException(thread2, th);
                            throw th2;
                        }
                    }
                } catch (Throwable th6) {
                    th = th6;
                    thread2 = thread;
                    th2 = th;
                    uncaughtExceptionHandler = this.f38448b;
                    if (uncaughtExceptionHandler != null) {
                        throw th2;
                    }
                    uncaughtExceptionHandler.uncaughtException(thread2, th);
                    throw th2;
                }
            }
            nxl nxlVarM18137O4 = nmt.f43899b.m18137O();
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                nxl nxlVar3 = (nxl) arrayList.get(i3);
                if (!nxlVarM18137O4.f44974b.m18142ac()) {
                    nxlVarM18137O4.mo18106p();
                }
                nmt nmtVar = (nmt) nxlVarM18137O4.f44974b;
                nmu nmuVar5 = (nmu) nxlVar3.mo18103l();
                nmuVar5.getClass();
                nmtVar.m17511b();
                nmtVar.f43901a.add(nmuVar5);
            }
            if (!nxlVarM18137O2.f44974b.m18142ac()) {
                nxlVarM18137O2.mo18106p();
            }
            nmv nmvVar2 = (nmv) nxlVarM18137O2.f44974b;
            nmt nmtVar2 = (nmt) nxlVarM18137O4.mo18103l();
            nmtVar2.getClass();
            nmvVar2.f43914c = nmtVar2;
            int i4 = 4;
            nmvVar2.f43913b = 4;
            Iterator it = ((Set) lkbVar.f38452d.get()).iterator();
            while (it.hasNext()) {
                lke lkeVar = (lke) it.next();
                nms nmsVar3 = ((nmv) nxlVarM18137O2.f44974b).f43915d;
                if (nmsVar3 == null) {
                    nmsVar3 = nms.f43891f;
                }
                if ((nmsVar3.f43893a & 2) != 0) {
                    String str = nmsVar3.f43895c;
                    String strM15556a = lkeVar.m15556a();
                    if (!str.equals(strM15556a)) {
                        nxl nxlVar4 = (nxl) nmsVar3.m18143ad(5);
                        nxlVar4.m18108s(nmsVar3);
                        if (!nxlVar4.f44974b.m18142ac()) {
                            nxlVar4.mo18106p();
                        }
                        nms nmsVar4 = (nms) nxlVar4.f44974b;
                        strM15556a.getClass();
                        nmsVar4.f43893a |= 2;
                        nmsVar4.f43895c = strM15556a;
                        nms nmsVar5 = (nms) nxlVar4.mo18103l();
                        if (!nxlVarM18137O2.f44974b.m18142ac()) {
                            nxlVarM18137O2.mo18106p();
                        }
                        nmv nmvVar3 = (nmv) nxlVarM18137O2.f44974b;
                        nmsVar5.getClass();
                        nmvVar3.f43915d = nmsVar5;
                        nmvVar3.f43912a |= 1;
                    }
                }
                nmv nmvVar4 = (nmv) nxlVarM18137O2.f44974b;
                if (nmvVar4.f43913b == i4) {
                    nmt nmtVar3 = (nmt) nmvVar4.f43914c;
                    nxl nxlVar5 = null;
                    int i5 = 0;
                    while (i5 < nmtVar3.f43901a.size()) {
                        nmu nmuVar6 = (nmu) nmtVar3.f43901a.get(i5);
                        nms nmsVar6 = nmuVar6.f43906b;
                        if (nmsVar6 == null) {
                            nmsVar6 = nms.f43891f;
                        }
                        if ((nmsVar6.f43893a & 2) != 0) {
                            String str2 = nmsVar6.f43895c;
                            String strM15556a2 = lkeVar.m15556a();
                            if (!str2.equals(strM15556a2)) {
                                if (nxlVar5 == null) {
                                    nxlVar5 = (nxl) nmtVar3.m18143ad(5);
                                    nxlVar5.m18108s(nmtVar3);
                                }
                                nxl nxlVar6 = (nxl) nmuVar6.m18143ad(5);
                                nxlVar6.m18108s(nmuVar6);
                                nxl nxlVar7 = (nxl) nmsVar6.m18143ad(5);
                                nxlVar7.m18108s(nmsVar6);
                                if (!nxlVar7.f44974b.m18142ac()) {
                                    nxlVar7.mo18106p();
                                }
                                nms nmsVar7 = (nms) nxlVar7.f44974b;
                                strM15556a2.getClass();
                                nmsVar7.f43893a |= 2;
                                nmsVar7.f43895c = strM15556a2;
                                nms nmsVar8 = (nms) nxlVar7.mo18103l();
                                if (!nxlVar6.f44974b.m18142ac()) {
                                    nxlVar6.mo18106p();
                                }
                                nmu nmuVar7 = (nmu) nxlVar6.f44974b;
                                nmsVar8.getClass();
                                nmuVar7.f43906b = nmsVar8;
                                nmuVar7.f43905a |= 1;
                                nmu nmuVar8 = (nmu) nxlVar6.mo18103l();
                                if (!nxlVar5.f44974b.m18142ac()) {
                                    nxlVar5.mo18106p();
                                }
                                nmt nmtVar4 = (nmt) nxlVar5.f44974b;
                                nmuVar8.getClass();
                                nmtVar4.m17511b();
                                nmtVar4.f43901a.set(i5, nmuVar8);
                            }
                        }
                        i5++;
                        it = it;
                    }
                    Iterator it2 = it;
                    if (nxlVar5 != null) {
                        nmt nmtVar5 = (nmt) nxlVar5.mo18103l();
                        if (!nxlVarM18137O2.f44974b.m18142ac()) {
                            nxlVarM18137O2.mo18106p();
                        }
                        nmv nmvVar5 = (nmv) nxlVarM18137O2.f44974b;
                        nmtVar5.getClass();
                        nmvVar5.f43914c = nmtVar5;
                        i4 = 4;
                        nmvVar5.f43913b = 4;
                        it = it2;
                    } else {
                        i4 = 4;
                        it = it2;
                    }
                } else {
                    Iterator it3 = it;
                    for (int i6 = 0; i6 < ((nmv) nxlVarM18137O2.f44974b).f43916e.size(); i6++) {
                        nms nmsVar9 = (nms) ((nmv) nxlVarM18137O2.f44974b).f43916e.get(i6);
                        if ((nmsVar9.f43893a & 2) != 0) {
                            String str3 = nmsVar9.f43895c;
                            String strM15556a3 = lkeVar.m15556a();
                            if (!str3.equals(strM15556a3)) {
                                nxl nxlVar8 = (nxl) nmsVar9.m18143ad(5);
                                nxlVar8.m18108s(nmsVar9);
                                if (!nxlVar8.f44974b.m18142ac()) {
                                    nxlVar8.mo18106p();
                                }
                                nms nmsVar10 = (nms) nxlVar8.f44974b;
                                strM15556a3.getClass();
                                nmsVar10.f43893a |= 2;
                                nmsVar10.f43895c = strM15556a3;
                                nms nmsVar11 = (nms) nxlVar8.mo18103l();
                                if (!nxlVarM18137O2.f44974b.m18142ac()) {
                                    nxlVarM18137O2.mo18106p();
                                }
                                nmv nmvVar6 = (nmv) nxlVarM18137O2.f44974b;
                                nmsVar11.getClass();
                                nmvVar6.m17512b();
                                nmvVar6.f43916e.set(i6, nmsVar11);
                            }
                        }
                    }
                    it = it3;
                }
            }
            nxl nxlVarM15555i = lkbVar.m15555i();
            if (!nxlVarM15555i.f44974b.m18142ac()) {
                nxlVarM15555i.mo18106p();
            }
            paf pafVar = (paf) nxlVarM15555i.f44974b;
            paf pafVar2 = paf.f47175l;
            name.getClass();
            pafVar.f47177a |= 8;
            pafVar.f47181e = name;
            Class<?> cls = th.getClass();
            if (cls == OutOfMemoryError.class) {
                i4 = 3;
            } else if (NullPointerException.class.isAssignableFrom(cls)) {
                i4 = 2;
            } else if (!RuntimeException.class.isAssignableFrom(cls)) {
                i4 = Error.class.isAssignableFrom(cls) ? 5 : 1;
            }
            if (!nxlVarM15555i.f44974b.m18142ac()) {
                nxlVarM15555i.mo18106p();
            }
            nxq nxqVar = nxlVarM15555i.f44974b;
            paf pafVar3 = (paf) nxqVar;
            pafVar3.f47182f = i4 - 1;
            pafVar3.f47177a |= 16;
            if (!nxqVar.m18142ac()) {
                nxlVarM15555i.mo18106p();
            }
            paf pafVar4 = (paf) nxlVarM15555i.f44974b;
            name2.getClass();
            pafVar4.f47177a |= 128;
            pafVar4.f47183g = name2;
            nmv nmvVar7 = (nmv) nxlVarM18137O2.mo18103l();
            if (!nxlVarM15555i.f44974b.m18142ac()) {
                nxlVarM15555i.mo18106p();
            }
            paf pafVar5 = (paf) nxlVarM15555i.f44974b;
            nmvVar7.getClass();
            pafVar5.f47184h = nmvVar7;
            pafVar5.f47177a |= 256;
            int i7 = mod.f41174a;
            lkd lkdVar = (lkd) lkbVar.f38454f.get();
            if (lkdVar.f38477a && (livVarM16703b = mod.m16703b(th)) != null) {
                mws mwsVar = ((mos) livVarM16703b.f38339a).f41213a;
                int i8 = lkdVar.f38478b;
                int i9 = lkdVar.f38479c;
                int i10 = lkdVar.f38480d;
                List listM16503K = mkv.m16503K(mwsVar);
                ArrayList arrayListM16502J = mkv.m16502J(Math.min(((mzr) mwsVar).f41859c, i9));
                ArrayList arrayListM16498F = mkv.m16498F();
                ArrayList arrayListM16498F2 = mkv.m16498F();
                int length2 = 0;
                int i11 = 0;
                while (true) {
                    if (i11 >= listM16503K.size()) {
                        i = 0;
                        nxlVarM18137O = null;
                        break;
                    }
                    int i12 = i11 + 1;
                    if (i12 > i9) {
                        nxlVarM18137O = pag.f47189f.m18137O();
                        int size2 = listM16503K.size() - i11;
                        if (!nxlVarM18137O.f44974b.m18142ac()) {
                            nxlVarM18137O.mo18106p();
                        }
                        pag pagVar = (pag) nxlVarM18137O.f44974b;
                        pagVar.f47191a |= 1;
                        pagVar.f47192b = size2;
                        i = 0;
                        break;
                    }
                    String str4 = (String) listM16503K.get(i11);
                    int i13 = i9;
                    if (Math.min(str4.length(), i8) + length2 > i10) {
                        nxlVarM18137O = pag.f47189f.m18137O();
                        int size3 = listM16503K.size() - i11;
                        if (!nxlVarM18137O.f44974b.m18142ac()) {
                            nxlVarM18137O.mo18106p();
                        }
                        pag pagVar2 = (pag) nxlVarM18137O.f44974b;
                        pagVar2.f47191a |= 2;
                        pagVar2.f47193c = size3;
                        i = 0;
                        break;
                    }
                    if (str4.length() > i8) {
                        arrayListM16502J.add(str4.substring(0, i8));
                        arrayListM16498F.add(Integer.valueOf(i11));
                        arrayListM16498F2.add(Integer.valueOf(str4.length() - i8));
                        length2 += i8;
                    } else {
                        arrayListM16502J.add(str4);
                        length2 += str4.length();
                    }
                    i11 = i12;
                    i10 = i10;
                    i9 = i13;
                }
                if (!arrayListM16498F.isEmpty()) {
                    if (nxlVarM18137O == null) {
                        nxlVarM18137O = pag.f47189f.m18137O();
                    }
                    int size4 = arrayListM16498F.size();
                    while (i < size4) {
                        int size5 = (arrayListM16502J.size() - ((Integer) arrayListM16498F.get(i)).intValue()) - 1;
                        if (!nxlVarM18137O.f44974b.m18142ac()) {
                            nxlVarM18137O.mo18106p();
                        }
                        pag pagVar3 = (pag) nxlVarM18137O.f44974b;
                        pag pagVar4 = pag.f47189f;
                        nxw nxwVar2 = pagVar3.f47194d;
                        if (!nxwVar2.mo17770c()) {
                            pagVar3.f47194d = nxq.m18125S(nxwVar2);
                        }
                        pagVar3.f47194d.mo18148g(size5);
                        i++;
                    }
                    if (!nxlVarM18137O.f44974b.m18142ac()) {
                        nxlVarM18137O.mo18106p();
                    }
                    pag pagVar5 = (pag) nxlVarM18137O.f44974b;
                    pag pagVar6 = pag.f47189f;
                    nxw nxwVar3 = pagVar5.f47195e;
                    if (!nxwVar3.mo17770c()) {
                        pagVar5.f47195e = nxq.m18125S(nxwVar3);
                    }
                    nwb.m17749e(arrayListM16498F2, pagVar5.f47195e);
                }
                nxl nxlVarM18137O5 = pah.f47196d.m18137O();
                List listM16503K2 = mkv.m16503K(arrayListM16502J);
                if (!nxlVarM18137O5.f44974b.m18142ac()) {
                    nxlVarM18137O5.mo18106p();
                }
                pah pahVar = (pah) nxlVarM18137O5.f44974b;
                nxy nxyVar = pahVar.f47199b;
                if (!nxyVar.mo17770c()) {
                    pahVar.f47199b = nxq.m18127U(nxyVar);
                }
                nwb.m17749e(listM16503K2, pahVar.f47199b);
                if (nxlVarM18137O != null) {
                    pag pagVar7 = (pag) nxlVarM18137O.mo18103l();
                    if (!nxlVarM18137O5.f44974b.m18142ac()) {
                        nxlVarM18137O5.mo18106p();
                    }
                    pah pahVar2 = (pah) nxlVarM18137O5.f44974b;
                    pagVar7.getClass();
                    pahVar2.f47200c = pagVar7;
                    pahVar2.f47198a |= 1;
                }
                pah pahVar3 = (pah) nxlVarM18137O5.mo18103l();
                if (!nxlVarM15555i.f44974b.m18142ac()) {
                    nxlVarM15555i.mo18106p();
                }
                paf pafVar6 = (paf) nxlVarM15555i.f44974b;
                pahVar3.getClass();
                pafVar6.f47186j = pahVar3;
                pafVar6.f47177a |= 1024;
            }
            lkbVar.m15552f((paf) nxlVarM15555i.mo18103l());
            uncaughtExceptionHandler2 = this.f38448b;
            if (uncaughtExceptionHandler2 != null) {
                thread2 = thread;
                uncaughtExceptionHandler2.uncaughtException(thread2, th);
            }
        } catch (Exception e3) {
            e = e3;
            thread2 = thread3;
        } catch (Throwable th7) {
            th = th7;
            thread2 = thread3;
        }
    }
}
