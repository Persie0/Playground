package p000;

import com.google.android.apps.camera.evcomp.AZCp.HRLmc;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ftj implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f23548a;

    /* JADX INFO: renamed from: b */
    private final oju f23549b;

    /* JADX INFO: renamed from: c */
    private final /* synthetic */ int f23550c;

    public ftj(oju ojuVar, oju ojuVar2, int i) {
        this.f23550c = i;
        this.f23548a = ojuVar;
        this.f23549b = ojuVar2;
    }

    /* JADX INFO: renamed from: a */
    public static ftj m8788a(oju ojuVar, oju ojuVar2) {
        return new ftj(ojuVar, ojuVar2, 0);
    }

    @Override // p000.oju
    public final /* synthetic */ Object get() {
        switch (this.f23550c) {
            case 0:
                break;
        }
        return m8789b();
    }

    /* JADX INFO: renamed from: b */
    public final Integer m8789b() {
        int iIntValue;
        switch (this.f23550c) {
            case 0:
                return Integer.valueOf(((dhv) this.f23548a.get()).mo6184l(dij.f11575Y) ? ((ftk) this.f23549b).get().f23544a : 0);
            default:
                dhv dhvVar = (dhv) this.f23548a.get();
                had hadVar = (had) this.f23549b.get();
                String str = HRLmc.XODSyBc;
                if (hadVar.mo10047n(str)) {
                    iIntValue = hadVar.mo10046m(str) ? gzl.ON_LIGHT.f26939f : gzl.OFF.f26939f;
                } else {
                    iIntValue = ((Integer) dhvVar.mo6173a(dhp.f11144a).get()).intValue();
                }
                return Integer.valueOf(iIntValue);
        }
    }
}
