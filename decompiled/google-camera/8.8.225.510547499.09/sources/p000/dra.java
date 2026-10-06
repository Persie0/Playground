package p000;

import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dra implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f12380a;

    /* JADX INFO: renamed from: b */
    private final oju f12381b;

    /* JADX INFO: renamed from: c */
    private final oju f12382c;

    /* JADX INFO: renamed from: d */
    private final /* synthetic */ int f12383d;

    public dra(oju ojuVar, oju ojuVar2, oju ojuVar3, int i) {
        this.f12383d = i;
        this.f12380a = ojuVar;
        this.f12381b = ojuVar2;
        this.f12382c = ojuVar3;
    }

    public dra(oju ojuVar, oju ojuVar2, oju ojuVar3, int i, byte[] bArr) {
        this.f12383d = i;
        this.f12380a = ojuVar;
        this.f12382c = ojuVar2;
        this.f12381b = ojuVar3;
    }

    public dra(oju ojuVar, oju ojuVar2, oju ojuVar3, int i, char[] cArr) {
        this.f12383d = i;
        this.f12380a = ojuVar;
        this.f12382c = ojuVar2;
        this.f12381b = ojuVar3;
    }

    public dra(oju ojuVar, oju ojuVar2, oju ojuVar3, int i, int[] iArr) {
        this.f12383d = i;
        this.f12381b = ojuVar;
        this.f12382c = ojuVar2;
        this.f12380a = ojuVar3;
    }

    public dra(oju ojuVar, oju ojuVar2, oju ojuVar3, int i, short[] sArr) {
        this.f12383d = i;
        this.f12382c = ojuVar;
        this.f12381b = ojuVar2;
        this.f12380a = ojuVar3;
    }

    @Override // p000.oju
    public final /* synthetic */ Object get() {
        switch (this.f12383d) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
        }
        return m6617a();
    }

    /* JADX INFO: renamed from: a */
    public final mrm m6617a() {
        switch (this.f12383d) {
            case 0:
                return (((Boolean) this.f12380a.get()).booleanValue() && ((Boolean) this.f12381b.get()).booleanValue()) ? (mrm) ((ohj) this.f12382c).f46012a : mqu.f41450a;
            case 1:
                return (((fwv) this.f12382c).get().m5901j() || !((dhv) this.f12381b.get()).mo6184l(dib.f11318bY)) ? mqu.f41450a : ((etl) this.f12380a).m7866a();
            case 2:
                return (((Boolean) this.f12380a.get()).booleanValue() && ((Boolean) this.f12382c.get()).booleanValue()) ? (mrm) ((ohj) this.f12381b).f46012a : mqu.f41450a;
            case 3:
                jww jwwVar = (jww) this.f12382c.get();
                dhv dhvVar = (dhv) this.f12381b.get();
                oju ojuVar = this.f12380a;
                if (!((Boolean) jwwVar.mo3831be()).booleanValue()) {
                    dhx dhxVar = dhs.f11163a;
                    dhvVar.mo6177e();
                } else if (dhvVar.mo6184l(dhs.f11167e)) {
                    return ((etl) ojuVar).m7866a();
                }
                return mqu.f41450a;
            case 4:
                Set set = ((ohm) this.f12380a).get();
                kqj kqjVar = (kqj) this.f12381b.get();
                dhv dhvVar2 = (dhv) this.f12382c.get();
                dhx dhxVar2 = dib.f11240a;
                dhvVar2.mo6177e();
                if (!set.isEmpty()) {
                    return mrm.m16829i(kqjVar.m14703e(set));
                }
                dhvVar2.mo6177e();
                dhvVar2.mo6177e();
                return mqu.f41450a;
            case 5:
                Set set2 = ((ohm) this.f12380a).get();
                kqj kqjVar2 = (kqj) this.f12381b.get();
                dhv dhvVar3 = (dhv) this.f12382c.get();
                if (set2.isEmpty()) {
                    return mqu.f41450a;
                }
                dhx dhxVar3 = dib.f11240a;
                dhvVar3.mo6177e();
                return mrm.m16829i(kqjVar2.m14703e(set2));
            case 6:
                Set set3 = ((ohm) this.f12380a).get();
                kqj kqjVar3 = (kqj) this.f12381b.get();
                dhv dhvVar4 = (dhv) this.f12382c.get();
                dhx dhxVar4 = dhh.f11074a;
                dhvVar4.mo6175c();
                dhvVar4.mo6175c();
                if (!set3.isEmpty()) {
                    dhvVar4.mo6175c();
                    if (dhvVar4.mo6184l(dib.f11349cc)) {
                        return mrm.m16829i(kqjVar3.m14703e(set3));
                    }
                }
                return mqu.f41450a;
            default:
                mrm mrmVar = (mrm) ((ohj) this.f12381b).f46012a;
                mrm mrmVar2 = (mrm) ((ohj) this.f12382c).f46012a;
                boolean zMo16813g = mrmVar.mo16813g();
                oju ojuVar2 = this.f12380a;
                if (!zMo16813g && !mrmVar2.mo16813g()) {
                    return mqu.f41450a;
                }
                ojuVar2.getClass();
                return mrm.m16829i(new doy(ojuVar2, 8));
        }
    }
}
