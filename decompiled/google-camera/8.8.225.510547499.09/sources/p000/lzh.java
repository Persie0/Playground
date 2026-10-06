package p000;

import androidx.work.impl.workers.NHKG.pIeXJQLZLfgIN;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class lzh {
    /* JADX INFO: renamed from: a */
    public Object mo16247a(ols olsVar) {
        throw null;
    }

    /* JADX INFO: renamed from: c */
    public Object mo16248c(ols olsVar) {
        throw null;
    }

    /* JADX INFO: renamed from: e */
    public abstract Object mo16249e(lwh lwhVar, ols olsVar);

    /* JADX INFO: renamed from: f */
    public abstract Object mo16250f(long j, lwh lwhVar, ols olsVar);

    /* JADX WARN: Code duplicated, block: B:19:0x0077  */
    /* JADX WARN: Code duplicated, block: B:24:0x00e2 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:0x00e3 A[PHI: r14
      0x00e3: PHI (r14v18 java.lang.Object) = (r14v17 java.lang.Object), (r14v1 java.lang.Object) binds: [B:23:0x00e0, B:12:0x002e] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Code duplicated, block: B:26:0x00e4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:27:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    static /* synthetic */ Object m16245b(lzh lzhVar, ols olsVar) {
        lzf lzfVar;
        lzo lzoVar;
        if (olsVar instanceof lzf) {
            lzfVar = (lzf) olsVar;
            int i = lzfVar.f39617b;
            if ((i & Integer.MIN_VALUE) != 0) {
                lzfVar.f39617b = i - Integer.MIN_VALUE;
            } else {
                lzfVar = new lzf(lzhVar, olsVar);
            }
        } else {
            lzfVar = new lzf(lzhVar, olsVar);
        }
        Object objM307c = lzfVar.f39616a;
        oma omaVar = oma.COROUTINE_SUSPENDED;
        switch (lzfVar.f39617b) {
            case 0:
                lkm.m15592s(objM307c);
                lzo lzoVar2 = (lzo) lzhVar;
                lzfVar.f39619d = lzoVar2;
                lzfVar.f39617b = 1;
                objM307c = adr.m307c(lzoVar2.f39638a, new lzn(lzoVar2, omn.m18689ac(new lwh[]{lwh.UPLOAD_PENDING, lwh.UPLOAD_IN_PROGRESS, lwh.UPLOAD_PAUSED}), lwh.UPLOAD_FAILED_PERMANENTLY, lvi.IN_AIRLOCK, 0), lzfVar);
                if (objM307c == omaVar) {
                    return omaVar;
                }
                if (((Number) objM307c).intValue() > 0) {
                    return okv.f46215a;
                }
                lzoVar = (lzo) lzhVar;
                lzfVar.f39619d = lzoVar;
                lzfVar.f39617b = 2;
                if (adr.m307c(lzoVar.f39638a, new lzn(lzoVar, omn.m18689ac(new lvl[]{lvl.ANNOTATION, lvl.ATTACHMENT}), omn.m18689ac(new lwh[]{lwh.UPLOAD_PENDING, lwh.UPLOAD_IN_PROGRESS, lwh.UPLOAD_PAUSED}), lwh.UPLOAD_FAILED_PERMANENTLY, 2), lzfVar) == omaVar) {
                    return omaVar;
                }
                lzfVar.f39619d = null;
                lzfVar.f39617b = 3;
                lwh lwhVar = lwh.UPLOAD_FAILED_PERMANENTLY;
                lvi lviVar = lvi.IN_AIRLOCK;
                apy apyVarM1841a = apy.m1841a("\n      SELECT * FROM ResourceEntity\n      WHERE\n        status_uploadState = ?\n        AND (\n          status_airlockFileState IS NOT ?\n          OR namespaceId IS NULL\n          OR partitionId IS NULL\n        )\n    ", 2);
                apyVarM1841a.mo1845e(1, lyy.m16206w(lwhVar));
                apyVarM1841a.mo1845e(2, lyy.m16184a(lviVar));
                lzo lzoVar3 = (lzo) lzhVar;
                objM307c = adr.m306b(lzoVar3.f39638a, true, afj.m507g(), new lzk(lzoVar3, apyVarM1841a), lzfVar);
                if (objM307c == omaVar) {
                    return omaVar;
                }
                return objM307c;
            case 1:
                lzhVar = lzfVar.f39619d;
                lkm.m15592s(objM307c);
                if (((Number) objM307c).intValue() > 0) {
                    return okv.f46215a;
                }
                lzoVar = (lzo) lzhVar;
                lzfVar.f39619d = lzoVar;
                lzfVar.f39617b = 2;
                if (adr.m307c(lzoVar.f39638a, new lzn(lzoVar, omn.m18689ac(new lvl[]{lvl.ANNOTATION, lvl.ATTACHMENT}), omn.m18689ac(new lwh[]{lwh.UPLOAD_PENDING, lwh.UPLOAD_IN_PROGRESS, lwh.UPLOAD_PAUSED}), lwh.UPLOAD_FAILED_PERMANENTLY, 2), lzfVar) == omaVar) {
                    return omaVar;
                }
                lzfVar.f39619d = null;
                lzfVar.f39617b = 3;
                lwh lwhVar2 = lwh.UPLOAD_FAILED_PERMANENTLY;
                lvi lviVar2 = lvi.IN_AIRLOCK;
                apy apyVarM1841a2 = apy.m1841a("\n      SELECT * FROM ResourceEntity\n      WHERE\n        status_uploadState = ?\n        AND (\n          status_airlockFileState IS NOT ?\n          OR namespaceId IS NULL\n          OR partitionId IS NULL\n        )\n    ", 2);
                apyVarM1841a2.mo1845e(1, lyy.m16206w(lwhVar2));
                apyVarM1841a2.mo1845e(2, lyy.m16184a(lviVar2));
                lzo lzoVar4 = (lzo) lzhVar;
                objM307c = adr.m306b(lzoVar4.f39638a, true, afj.m507g(), new lzk(lzoVar4, apyVarM1841a2), lzfVar);
                if (objM307c == omaVar) {
                    return omaVar;
                }
                return objM307c;
            case 2:
                lzhVar = lzfVar.f39619d;
                lkm.m15592s(objM307c);
                lzfVar.f39619d = null;
                lzfVar.f39617b = 3;
                lwh lwhVar3 = lwh.UPLOAD_FAILED_PERMANENTLY;
                lvi lviVar3 = lvi.IN_AIRLOCK;
                apy apyVarM1841a3 = apy.m1841a("\n      SELECT * FROM ResourceEntity\n      WHERE\n        status_uploadState = ?\n        AND (\n          status_airlockFileState IS NOT ?\n          OR namespaceId IS NULL\n          OR partitionId IS NULL\n        )\n    ", 2);
                apyVarM1841a3.mo1845e(1, lyy.m16206w(lwhVar3));
                apyVarM1841a3.mo1845e(2, lyy.m16184a(lviVar3));
                lzo lzoVar5 = (lzo) lzhVar;
                objM307c = adr.m306b(lzoVar5.f39638a, true, afj.m507g(), new lzk(lzoVar5, apyVarM1841a3), lzfVar);
                if (objM307c == omaVar) {
                    return omaVar;
                }
                return objM307c;
            case 3:
                lkm.m15592s(objM307c);
                return objM307c;
            default:
                throw new IllegalStateException(pIeXJQLZLfgIN.trssA);
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00b0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:23:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:25:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    static /* synthetic */ Object m16246d(lzh lzhVar, ols olsVar) {
        lzg lzgVar;
        lzc lzcVar;
        lzb lzbVar;
        List list;
        long j;
        List list2;
        lzb lzbVar2;
        if (olsVar instanceof lzg) {
            lzgVar = (lzg) olsVar;
            int i = lzgVar.f39622c;
            if ((i & Integer.MIN_VALUE) != 0) {
                lzgVar.f39622c = i - Integer.MIN_VALUE;
            } else {
                lzgVar = new lzg(lzhVar, olsVar);
            }
        } else {
            lzgVar = new lzg(lzhVar, olsVar);
        }
        Object objM306b = lzgVar.f39621b;
        oma omaVar = oma.COROUTINE_SUSPENDED;
        switch (lzgVar.f39622c) {
            case 0:
                lkm.m15592s(objM306b);
                lzgVar.f39620a = lzhVar;
                lzgVar.f39622c = 1;
                Set setM18689ac = omn.m18689ac(new lwh[]{lwh.UPLOAD_PENDING, lwh.UPLOAD_PAUSED});
                lvi lviVar = lvi.IN_AIRLOCK;
                StringBuilder sbM451l = afc.m451l();
                sbM451l.append("\n      SELECT * FROM ResourceEntity\n      WHERE\n        status_uploadState IN (");
                int size = setM18689ac.size();
                afc.m452m(sbM451l, size);
                sbM451l.append(")\n        AND status_airlockFileState IS ?\n        AND namespaceId IS NOT NULL\n        AND partitionId IS NOT NULL\n      ORDER BY status_uploadToF250RequestedEpochTimestamp ASC\n      LIMIT 1\n    ");
                int i2 = size + 1;
                apy apyVarM1841a = apy.m1841a(sbM451l.toString(), i2);
                Iterator it = setM18689ac.iterator();
                int i3 = 1;
                while (it.hasNext()) {
                    apyVarM1841a.mo1845e(i3, lyy.m16206w((lwh) it.next()));
                    i3++;
                }
                apyVarM1841a.mo1845e(i2, lyy.m16184a(lviVar));
                lzo lzoVar = (lzo) lzhVar;
                objM306b = adr.m306b(lzoVar.f39638a, true, afj.m507g(), new lzm(lzoVar, apyVarM1841a), lzgVar);
                if (objM306b != omaVar) {
                    lzcVar = (lzc) objM306b;
                    if (lzcVar == null) {
                        return null;
                    }
                    lzbVar = lzcVar.f39614a;
                    list = lzcVar.f39615b;
                    j = lzbVar.f39611u;
                    lzgVar.f39620a = lzbVar;
                    lzgVar.f39623d = list;
                    lzgVar.f39622c = 2;
                    if (lzhVar.mo16250f(j, lwh.UPLOAD_IN_PROGRESS, lzgVar) != omaVar) {
                        list2 = list;
                        lzbVar2 = lzbVar;
                        return new lzc(lzb.m16222c(lzbVar2, null, null, lxv.m16126a(lzbVar2.f39610t, null, null, null, lwh.UPLOAD_IN_PROGRESS, 0.0d, 47), 3145727), list2);
                    }
                }
                return omaVar;
            case 1:
                lzhVar = (lzh) lzgVar.f39620a;
                lkm.m15592s(objM306b);
                lzcVar = (lzc) objM306b;
                if (lzcVar == null) {
                    return null;
                }
                lzbVar = lzcVar.f39614a;
                list = lzcVar.f39615b;
                j = lzbVar.f39611u;
                lzgVar.f39620a = lzbVar;
                lzgVar.f39623d = list;
                lzgVar.f39622c = 2;
                if (lzhVar.mo16250f(j, lwh.UPLOAD_IN_PROGRESS, lzgVar) != omaVar) {
                    list2 = list;
                    lzbVar2 = lzbVar;
                    return new lzc(lzb.m16222c(lzbVar2, null, null, lxv.m16126a(lzbVar2.f39610t, null, null, null, lwh.UPLOAD_IN_PROGRESS, 0.0d, 47), 3145727), list2);
                }
                return omaVar;
            case 2:
                list2 = lzgVar.f39623d;
                lzbVar2 = (lzb) lzgVar.f39620a;
                lkm.m15592s(objM306b);
                return new lzc(lzb.m16222c(lzbVar2, null, null, lxv.m16126a(lzbVar2.f39610t, null, null, null, lwh.UPLOAD_IN_PROGRESS, 0.0d, 47), 3145727), list2);
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
