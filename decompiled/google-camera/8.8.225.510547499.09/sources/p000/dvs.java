package p000;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class dvs implements dvp {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f12679a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f12680b;

    public /* synthetic */ dvs(dvr dvrVar, int i) {
        this.f12680b = i;
        this.f12679a = dvrVar;
    }

    public /* synthetic */ dvs(oju ojuVar, int i) {
        this.f12680b = i;
        this.f12679a = ojuVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [dvr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, oju] */
    @Override // p000.dvp
    /* JADX INFO: renamed from: a */
    public final int mo6789a(long j, float[] fArr) {
        int iMin = 1;
        switch (this.f12680b) {
            case 0:
                fArr[0] = this.f12679a.mo6760a(j);
                return 1;
            default:
                jzk jzkVarMo6934a = ((dyq) this.f12679a.get()).mo6934a(j);
                mrm mrmVarM16829i = jzkVarMo6934a != null ? mrm.m16829i(jzkVarMo6934a.f35297b) : mqu.f41450a;
                if (mrmVarM16829i.mo16813g()) {
                    List list = (List) mrmVarM16829i.mo16809c();
                    iMin = Math.min(list.size(), 3);
                    for (int i = 0; i < iMin; i++) {
                        fArr[i] = ((dyk) list.get(i)).f12919b;
                    }
                } else {
                    fArr[0] = Float.NaN;
                }
                return iMin;
        }
    }
}
