package p000;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dur implements dte {

    /* JADX INFO: renamed from: a */
    public final kni f12610a;

    /* JADX INFO: renamed from: b */
    public final Object f12611b = new Object();

    /* JADX INFO: renamed from: c */
    public knh f12612c;

    /* JADX INFO: renamed from: d */
    public final dvg f12613d;

    public dur(kni kniVar, dvg dvgVar) {
        this.f12610a = kniVar;
        this.f12613d = dvgVar;
    }

    @Override // p000.dte
    /* JADX INFO: renamed from: b */
    public final void mo4009b(key keyVar, kgg kggVar) {
        kfd kfdVarMo7041b;
        synchronized (this.f12611b) {
            knh knhVar = this.f12612c;
            if (knhVar != null && (kfdVarMo7041b = keyVar.mo7041b()) != null) {
                final long j = kfdVarMo7041b.f35811b;
                knhVar.mo6999b((-3000000) + j, 3000000 + j, new kng() { // from class: duq
                    @Override // p000.kng
                    /* JADX INFO: renamed from: a */
                    public final void mo6759a(List list) {
                        knj knjVar;
                        dur durVar = this.f12608a;
                        long j2 = j;
                        if (list.size() > 10) {
                            ((nbe) ((nbe) eao.f13075a.m17252c()).mo17276G((char) 1233)).mo17290o("Warning: Samples used for vector determination is larger than 10 elements. This code is O(n) and expects small list sizes!");
                        }
                        Iterator it = list.iterator();
                        float[] fArr = null;
                        knj knjVar2 = null;
                        while (true) {
                            if (!it.hasNext()) {
                                knjVar = null;
                                break;
                            }
                            knjVar = (knj) it.next();
                            boolean z = knjVar2 == null || knjVar.f36607e > knjVar2.f36607e;
                            lku.m15670x(z, "samples must be sorted ascending in time");
                            if (knjVar.f36607e > j2) {
                                break;
                            } else {
                                knjVar2 = knjVar;
                            }
                        }
                        if (knjVar2 == null) {
                            if (knjVar != null) {
                                fArr = new float[]{knjVar.f36608f, knjVar.f36609g, knjVar.f36610h};
                            }
                        } else if (knjVar == null) {
                            fArr = new float[]{knjVar2.f36608f, knjVar2.f36609g, knjVar2.f36610h};
                        } else {
                            long j3 = knjVar2.f36607e;
                            long j4 = j2 - j3;
                            long j5 = knjVar.f36607e - j3;
                            float f = knjVar2.f36608f;
                            float f2 = knjVar.f36608f;
                            double d = j4;
                            double d2 = j5;
                            Double.isNaN(d);
                            Double.isNaN(d2);
                            double d3 = d / d2;
                            fArr = new float[]{eao.m7003a(f, f2, d3), eao.m7003a(knjVar2.f36609g, knjVar.f36609g, d3), eao.m7003a(knjVar2.f36610h, knjVar.f36610h, d3)};
                        }
                        if (fArr != null) {
                            durVar.f12613d.m6775h(j2, fArr);
                        }
                    }
                });
            }
        }
    }
}
