package p000;

import android.content.Context;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lxe implements Callable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Object f39506a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ Object f39507b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ Object f39508c;

    /* JADX INFO: renamed from: d */
    private final /* synthetic */ int f39509d;

    public lxe(Context context, String str, String str2, int i) {
        this.f39509d = i;
        this.f39507b = context;
        this.f39506a = str;
        this.f39508c = str2;
    }

    public lxe(lxl lxlVar, List list, lvi lviVar, int i) {
        this.f39509d = i;
        this.f39508c = lxlVar;
        this.f39506a = list;
        this.f39507b = lviVar;
    }

    public lxe(lxu lxuVar, List list, lwh lwhVar, int i) {
        this.f39509d = i;
        this.f39508c = lxuVar;
        this.f39506a = list;
        this.f39507b = lwhVar;
    }

    /* JADX WARN: Type inference failed for: r1v29, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v44, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v53, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v68, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v77, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, java.util.List] */
    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        int i = 2;
        switch (this.f39509d) {
            case 0:
                StringBuilder sbM451l = afc.m451l();
                sbM451l.append("\n      UPDATE ResourceEntity SET status_airlockFileState = ?\n      WHERE onDeviceId IN (");
                afc.m452m(sbM451l, this.f39506a.size());
                sbM451l.append(")\n    ");
                arf arfVarM1832t = ((lxl) this.f39508c).f39510a.m1832t(sbM451l.toString());
                arfVarM1832t.mo1845e(1, lyy.m16184a((lvi) this.f39507b));
                for (Long l : this.f39506a) {
                    if (l == null) {
                        arfVarM1832t.mo1846f(i);
                    } else {
                        arfVarM1832t.mo1845e(i, l.longValue());
                    }
                    i++;
                }
                ((lxl) this.f39508c).f39510a.m1825m();
                try {
                    Integer numValueOf = Integer.valueOf(arfVarM1832t.m1883a());
                    ((lxl) this.f39508c).f39510a.m1829q();
                    return numValueOf;
                } finally {
                    ((lxl) this.f39508c).f39510a.m1827o();
                }
            case 1:
                return bgp.m2420a((Context) this.f39507b, (String) this.f39506a, (String) this.f39508c);
            case 2:
                StringBuilder sbM451l2 = afc.m451l();
                sbM451l2.append("\n      UPDATE AnnotachmentEntity SET status_airlockFileState = ?\n      WHERE onDeviceId IN (");
                afc.m452m(sbM451l2, this.f39506a.size());
                sbM451l2.append(")\n    ");
                arf arfVarM1832t2 = ((lxl) this.f39508c).f39510a.m1832t(sbM451l2.toString());
                arfVarM1832t2.mo1845e(1, lyy.m16184a((lvi) this.f39507b));
                for (Long l2 : this.f39506a) {
                    if (l2 == null) {
                        arfVarM1832t2.mo1846f(i);
                    } else {
                        arfVarM1832t2.mo1845e(i, l2.longValue());
                    }
                    i++;
                }
                ((lxl) this.f39508c).f39510a.m1825m();
                try {
                    Integer numValueOf2 = Integer.valueOf(arfVarM1832t2.m1883a());
                    ((lxl) this.f39508c).f39510a.m1829q();
                    return numValueOf2;
                } finally {
                    ((lxl) this.f39508c).f39510a.m1827o();
                }
            case 3:
                StringBuilder sbM451l3 = afc.m451l();
                sbM451l3.append("\n      UPDATE AnnotachmentEntity SET status_uploadState = ?\n      WHERE onDeviceId IN (");
                afc.m452m(sbM451l3, this.f39506a.size());
                sbM451l3.append(") \n    ");
                arf arfVarM1832t3 = ((lxu) this.f39508c).f39536a.m1832t(sbM451l3.toString());
                arfVarM1832t3.mo1845e(1, lyy.m16206w((lwh) this.f39507b));
                for (Long l3 : this.f39506a) {
                    if (l3 == null) {
                        arfVarM1832t3.mo1846f(i);
                    } else {
                        arfVarM1832t3.mo1845e(i, l3.longValue());
                    }
                    i++;
                }
                ((lxu) this.f39508c).f39536a.m1825m();
                try {
                    Integer numValueOf3 = Integer.valueOf(arfVarM1832t3.m1883a());
                    ((lxu) this.f39508c).f39536a.m1829q();
                    return numValueOf3;
                } finally {
                    ((lxu) this.f39508c).f39536a.m1827o();
                }
            default:
                StringBuilder sbM451l4 = afc.m451l();
                sbM451l4.append("UPDATE ResourceEntity SET status_uploadState = ? WHERE onDeviceId IN (");
                afc.m452m(sbM451l4, this.f39506a.size());
                sbM451l4.append(")");
                arf arfVarM1832t4 = ((lxu) this.f39508c).f39536a.m1832t(sbM451l4.toString());
                arfVarM1832t4.mo1845e(1, lyy.m16206w((lwh) this.f39507b));
                for (Long l4 : this.f39506a) {
                    if (l4 == null) {
                        arfVarM1832t4.mo1846f(i);
                    } else {
                        arfVarM1832t4.mo1845e(i, l4.longValue());
                    }
                    i++;
                }
                ((lxu) this.f39508c).f39536a.m1825m();
                try {
                    Integer numValueOf4 = Integer.valueOf(arfVarM1832t4.m1883a());
                    ((lxu) this.f39508c).f39536a.m1829q();
                    return numValueOf4;
                } finally {
                    ((lxu) this.f39508c).f39536a.m1827o();
                }
        }
    }
}
