package p000;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class lzn implements Callable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Object f39633a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ Object f39634b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ Enum f39635c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ Object f39636d;

    /* JADX INFO: renamed from: e */
    private final /* synthetic */ int f39637e;

    public lzn(lxu lxuVar, List list, lwh lwhVar, nzw nzwVar, int i) {
        this.f39637e = i;
        this.f39634b = lxuVar;
        this.f39633a = list;
        this.f39635c = lwhVar;
        this.f39636d = nzwVar;
    }

    public lzn(lzo lzoVar, Set set, Set set2, lwh lwhVar, int i) {
        this.f39637e = i;
        this.f39634b = lzoVar;
        this.f39636d = set;
        this.f39633a = set2;
        this.f39635c = lwhVar;
    }

    public lzn(lzo lzoVar, Set set, lwh lwhVar, lvi lviVar, int i) {
        this.f39637e = i;
        this.f39636d = lzoVar;
        this.f39633a = set;
        this.f39634b = lwhVar;
        this.f39635c = lviVar;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r1v26, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v49, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r1v51, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object, java.util.Set] */
    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        int i = 3;
        switch (this.f39637e) {
            case 0:
                StringBuilder sbM451l = afc.m451l();
                sbM451l.append("\n      UPDATE ResourceEntity SET status_uploadState = ?\n      WHERE\n        status_uploadState IN (");
                int size = this.f39633a.size();
                afc.m452m(sbM451l, size);
                sbM451l.append(")\n        AND (\n          status_airlockFileState IS NOT ?\n          OR namespaceId IS NULL\n          OR partitionId IS NULL\n        )\n    ");
                arf arfVarM1832t = ((lzo) this.f39636d).f39638a.m1832t(sbM451l.toString());
                arfVarM1832t.mo1845e(1, lyy.m16206w((lwh) this.f39634b));
                Iterator it = this.f39633a.iterator();
                int i2 = 2;
                while (it.hasNext()) {
                    arfVarM1832t.mo1845e(i2, lyy.m16206w((lwh) it.next()));
                    i2++;
                }
                arfVarM1832t.mo1845e(size + 2, lyy.m16184a((lvi) this.f39635c));
                ((lzo) this.f39636d).f39638a.m1825m();
                try {
                    Integer numValueOf = Integer.valueOf(arfVarM1832t.m1883a());
                    ((lzo) this.f39636d).f39638a.m1829q();
                    return numValueOf;
                } finally {
                    ((lzo) this.f39636d).f39638a.m1827o();
                }
            case 1:
                StringBuilder sbM451l2 = afc.m451l();
                sbM451l2.append("\n      UPDATE ResourceEntity\n      SET\n        status_uploadState = ?,\n        status_uploadToF250RequestedEpochTimestamp = ?\n      WHERE onDeviceId IN (");
                afc.m452m(sbM451l2, this.f39633a.size());
                sbM451l2.append(")\n    ");
                arf arfVarM1832t2 = ((lxu) this.f39634b).f39536a.m1832t(sbM451l2.toString());
                arfVarM1832t2.mo1845e(1, lyy.m16206w((lwh) this.f39635c));
                Long lM16204u = lyy.m16204u((nzw) this.f39636d);
                if (lM16204u == null) {
                    arfVarM1832t2.mo1846f(2);
                } else {
                    arfVarM1832t2.mo1845e(2, lM16204u.longValue());
                }
                for (Long l : this.f39633a) {
                    if (l == null) {
                        arfVarM1832t2.mo1846f(i);
                    } else {
                        arfVarM1832t2.mo1845e(i, l.longValue());
                    }
                    i++;
                }
                ((lxu) this.f39634b).f39536a.m1825m();
                try {
                    Integer numValueOf2 = Integer.valueOf(arfVarM1832t2.m1883a());
                    ((lxu) this.f39634b).f39536a.m1829q();
                    return numValueOf2;
                } finally {
                    ((lxu) this.f39634b).f39536a.m1827o();
                }
            default:
                StringBuilder sbM451l3 = afc.m451l();
                sbM451l3.append("\n      UPDATE AnnotachmentEntity SET status_uploadState = ?\n      WHERE\n        resourceOnDeviceId IN (\n          SELECT onDeviceId FROM ResourceEntity WHERE status_uploadState = ?\n        )\n        AND isAttachment IN (");
                int size2 = this.f39636d.size();
                afc.m452m(sbM451l3, size2);
                sbM451l3.append(")\n        AND status_uploadState IN (");
                afc.m452m(sbM451l3, this.f39633a.size());
                sbM451l3.append(")\n    ");
                arf arfVarM1832t3 = ((lzo) this.f39634b).f39638a.m1832t(sbM451l3.toString());
                arfVarM1832t3.mo1845e(1, lyy.m16206w((lwh) this.f39635c));
                arfVarM1832t3.mo1845e(2, lyy.m16206w((lwh) this.f39635c));
                Iterator it2 = this.f39636d.iterator();
                int i3 = 3;
                while (it2.hasNext()) {
                    arfVarM1832t3.mo1845e(i3, lyy.m16191h((lvl) it2.next()));
                    i3++;
                }
                int i4 = size2 + 3;
                Iterator it3 = this.f39633a.iterator();
                while (it3.hasNext()) {
                    arfVarM1832t3.mo1845e(i4, lyy.m16206w((lwh) it3.next()));
                    i4++;
                }
                ((lzo) this.f39634b).f39638a.m1825m();
                try {
                    Integer numValueOf3 = Integer.valueOf(arfVarM1832t3.m1883a());
                    ((lzo) this.f39634b).f39638a.m1829q();
                    return numValueOf3;
                } finally {
                    ((lzo) this.f39634b).f39638a.m1827o();
                }
        }
    }
}
