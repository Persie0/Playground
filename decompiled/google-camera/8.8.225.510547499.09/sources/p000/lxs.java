package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class lxs {
    /* JADX INFO: renamed from: a */
    public Object mo16123a(List list, List list2, ols olsVar) {
        throw null;
    }

    /* JADX INFO: renamed from: c */
    public abstract Object mo16124c(List list, lwh lwhVar, nzw nzwVar, ols olsVar);

    /* JADX INFO: renamed from: d */
    public abstract Object mo16125d(List list, lwh lwhVar, ols olsVar);

    /* JADX WARN: Code duplicated, block: B:23:0x007e  */
    /* JADX WARN: Code duplicated, block: B:28:0x0094  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ba A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:37:0x00a0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x008d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x009c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x0077 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    static /* synthetic */ Object m16122b(lxs lxsVar, List list, List list2, ols olsVar) {
        lxr lxrVar;
        ArrayList arrayList;
        Iterator it;
        Long lM18699d;
        lxu lxuVar;
        lxm lxmVar;
        if (olsVar instanceof lxr) {
            lxrVar = (lxr) olsVar;
            int i = lxrVar.f39528b;
            if ((i & Integer.MIN_VALUE) != 0) {
                lxrVar.f39528b = i - Integer.MIN_VALUE;
            } else {
                lxrVar = new lxr(lxsVar, olsVar);
            }
        } else {
            lxrVar = new lxr(lxsVar, olsVar);
        }
        Object obj = lxrVar.f39527a;
        oma omaVar = oma.COROUTINE_SUSPENDED;
        switch (lxrVar.f39528b) {
            case 0:
                lkm.m15592s(obj);
                List arrayList2 = new ArrayList(omn.m18678R(list));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(omn.m18699d(((lzb) it2.next()).f39611u));
                }
                lwh lwhVar = lwh.UPLOAD_FAILED_PERMANENTLY;
                lxrVar.f39531e = (lxu) lxsVar;
                lxrVar.f39529c = list2;
                lxrVar.f39528b = 1;
                if (lxsVar.mo16125d(arrayList2, lwhVar, lxrVar) == omaVar) {
                    return omaVar;
                }
                arrayList = new ArrayList();
                it = list2.iterator();
                while (true) {
                    lM18699d = null;
                    if (it.hasNext()) {
                        lxmVar = (lxm) it.next();
                        switch (lxmVar.f39512b) {
                            case null:
                            case 1:
                                lM18699d = omn.m18699d(lxmVar.f39521k);
                                break;
                            case 2:
                                break;
                            default:
                                throw new ojz();
                        }
                        if (lM18699d != null) {
                            arrayList.add(lM18699d);
                        }
                    } else {
                        lxrVar.f39531e = null;
                        lxrVar.f39529c = null;
                        lxrVar.f39528b = 2;
                        lxuVar = (lxu) lxsVar;
                        if (adr.m307c(lxuVar.f39536a, new lxe(lxuVar, arrayList, lwh.UPLOAD_FAILED_PERMANENTLY, 3), lxrVar) == omaVar) {
                            return omaVar;
                        }
                    }
                }
                return oki.f46196a;
            case 1:
                list2 = lxrVar.f39529c;
                lxsVar = lxrVar.f39531e;
                lkm.m15592s(obj);
                arrayList = new ArrayList();
                it = list2.iterator();
                while (true) {
                    lM18699d = null;
                    if (it.hasNext()) {
                        lxmVar = (lxm) it.next();
                        switch (lxmVar.f39512b) {
                            case ANNOTATION:
                            case ATTACHMENT:
                                lM18699d = omn.m18699d(lxmVar.f39521k);
                                break;
                            case NOT_FOR_UPLOAD:
                                break;
                            default:
                                throw new ojz();
                        }
                        if (lM18699d != null) {
                            arrayList.add(lM18699d);
                        }
                    } else {
                        lxrVar.f39531e = null;
                        lxrVar.f39529c = null;
                        lxrVar.f39528b = 2;
                        lxuVar = (lxu) lxsVar;
                        if (adr.m307c(lxuVar.f39536a, new lxe(lxuVar, arrayList, lwh.UPLOAD_FAILED_PERMANENTLY, 3), lxrVar) == omaVar) {
                            return omaVar;
                        }
                    }
                }
                return oki.f46196a;
            case 2:
                lkm.m15592s(obj);
                return oki.f46196a;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
