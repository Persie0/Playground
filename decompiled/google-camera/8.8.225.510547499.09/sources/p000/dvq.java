package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class dvq implements dtk {

    /* JADX INFO: renamed from: a */
    private final dtj f12674a;

    /* JADX INFO: renamed from: b */
    private final int f12675b;

    /* JADX INFO: renamed from: c */
    private final int f12676c;

    /* JADX INFO: renamed from: d */
    private final dvp f12677d;

    /* JADX INFO: renamed from: e */
    private final dtp f12678e;

    public dvq(dtj dtjVar, int i, int i2, dvp dvpVar, dtp dtpVar) {
        this.f12674a = dtjVar;
        this.f12675b = i;
        this.f12676c = i2;
        this.f12677d = dvpVar;
        this.f12678e = dtpVar;
    }

    @Override // p000.dtk
    /* JADX INFO: renamed from: a */
    public final float mo6734a(long j) {
        lku.m15613H(this.f12675b == 1);
        return mo6736c(j).m6723a();
    }

    @Override // p000.dtk
    /* JADX INFO: renamed from: b */
    public final long mo6735b() {
        dtu dtuVarMo6744a = this.f12678e.mo6744a(Long.MAX_VALUE);
        if (dtuVarMo6744a.mo6747c()) {
            return dtuVarMo6744a.mo6745a();
        }
        return 0L;
    }

    @Override // p000.dtk
    /* JADX INFO: renamed from: c */
    public final dtg mo6736c(long j) {
        long jMin = Math.min(j, 9223372036854775806L);
        dtu dtuVarMo6744a = this.f12678e.mo6744a(1 + jMin);
        boolean zMo6747c = dtuVarMo6744a.mo6747c();
        long jMo6745a = dtuVarMo6744a.mo6745a();
        boolean zMo6746b = dtuVarMo6744a.mo6746b();
        dtuVarMo6744a.mo6745a();
        if (zMo6746b) {
            if (!zMo6747c) {
                return dtg.m6721c(this.f12674a, jMin);
            }
        } else if (!zMo6747c) {
            return dtg.m6721c(this.f12674a, jMin);
        }
        float[] fArr = new float[this.f12676c];
        return dtg.m6722d(this.f12674a, jMin, fArr, 0, this.f12677d.mo6789a(jMo6745a, fArr));
    }

    @Override // p000.dtk
    /* JADX INFO: renamed from: d */
    public final dtg mo6737d() {
        return mo6736c(mo6735b());
    }

    @Override // p000.dtk
    /* JADX INFO: renamed from: e */
    public final boolean mo6738e() {
        return mo6735b() <= 0;
    }

    @Override // p000.dtk
    /* JADX INFO: renamed from: f */
    public final List mo6739f(long j, int i) {
        int i2 = 0;
        lku.m15669w(j > Long.MIN_VALUE);
        lku.m15669w(true);
        ArrayList arrayList = new ArrayList();
        float[] fArr = new float[this.f12676c];
        if (j <= 0) {
            dtu dtuVarMo6744a = this.f12678e.mo6744a(j - 1);
            while (i2 < i && dtuVarMo6744a.mo6746b() && dtuVarMo6744a.mo6745a() <= 0) {
                arrayList.add(dtg.m6722d(this.f12674a, dtuVarMo6744a.mo6745a(), fArr, 0, this.f12677d.mo6789a(dtuVarMo6744a.mo6745a(), fArr)));
                i2++;
            }
        } else {
            dtu dtuVarMo6744a2 = this.f12678e.mo6744a(j + 1);
            while (i2 < i && dtuVarMo6744a2.mo6747c() && dtuVarMo6744a2.mo6745a() >= 0) {
                arrayList.add(dtg.m6722d(this.f12674a, dtuVarMo6744a2.mo6745a(), fArr, 0, this.f12677d.mo6789a(dtuVarMo6744a2.mo6745a(), fArr)));
                i2++;
            }
        }
        return arrayList;
    }
}
