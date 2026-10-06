package p000;

import android.content.Context;
import android.os.Build;
import java.util.function.Supplier;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fot implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f22967a;

    /* JADX INFO: renamed from: b */
    private final oju f22968b;

    /* JADX INFO: renamed from: c */
    private final /* synthetic */ int f22969c;

    public fot(oju ojuVar, oju ojuVar2, int i) {
        this.f22969c = i;
        this.f22967a = ojuVar;
        this.f22968b = ojuVar2;
    }

    public fot(oju ojuVar, oju ojuVar2, int i, byte[] bArr) {
        this.f22969c = i;
        this.f22968b = ojuVar;
        this.f22967a = ojuVar2;
    }

    public fot(oju ojuVar, oju ojuVar2, int i, char[] cArr) {
        this.f22969c = i;
        this.f22968b = ojuVar;
        this.f22967a = ojuVar2;
    }

    public fot(oju ojuVar, oju ojuVar2, int i, int[] iArr) {
        this.f22969c = i;
        this.f22968b = ojuVar;
        this.f22967a = ojuVar2;
    }

    public fot(oju ojuVar, oju ojuVar2, int i, short[] sArr) {
        this.f22969c = i;
        this.f22968b = ojuVar;
        this.f22967a = ojuVar2;
    }

    public fot(oju ojuVar, oju ojuVar2, int i, boolean[] zArr) {
        this.f22969c = i;
        this.f22968b = ojuVar;
        this.f22967a = ojuVar2;
    }

    /* JADX INFO: renamed from: a */
    public static fot m8638a(oju ojuVar, oju ojuVar2) {
        return new fot(ojuVar, ojuVar2, 5, (boolean[]) null);
    }

    /* JADX INFO: renamed from: b */
    public static fot m8639b(oju ojuVar, oju ojuVar2) {
        return new fot(ojuVar, ojuVar2, 6);
    }

    /* JADX INFO: renamed from: c */
    public static fot m8640c(oju ojuVar, oju ojuVar2) {
        return new fot(ojuVar, ojuVar2, 7);
    }

    /* JADX WARN: Code duplicated, block: B:61:0x0159  */
    @Override // p000.oju
    public final /* synthetic */ Object get() {
        int i;
        boolean z = true;
        switch (this.f22969c) {
            case 0:
                dhv dhvVar = (dhv) this.f22967a.get();
                final boolean zBooleanValue = ((Boolean) this.f22968b.get()).booleanValue();
                return new jwf((jxn) dhvVar.mo6173a(dhh.f11089b).filter(fjv.f22308b).map(egh.f13942h).orElseGet(new Supplier() { // from class: for
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return zBooleanValue ? jxn.FPS_240_HFR_8X : jxn.FPS_120_HFR_4X;
                    }
                }));
            case 1:
                kpb kpbVar = (kpb) this.f22968b.get();
                Context contextM6830a = ((dws) this.f22967a).m6830a();
                if (kpbVar.m14667g()) {
                    boolean z2 = contextM6830a.getApplicationInfo().targetSdkVersion == 30;
                    try {
                        i = Integer.parseInt(Build.VERSION.INCREMENTAL);
                    } catch (NumberFormatException e) {
                        ((nbe) ((nbe) fos.f22966a.m17252c()).mo17276G(2422)).mo17293r("Build number (%s) is not a number. Ignoring version check for b/163282828.", Build.VERSION.INCREMENTAL);
                        i = -1;
                    }
                    if (Build.ID.startsWith("RP1A")) {
                        ((nbe) ((nbe) fos.f22966a.m17252c()).mo17276G(2421)).mo17293r("Apply workaround: %b", Boolean.valueOf(i < 6774646 && z2));
                        if (i >= 6774646 || !z2) {
                            z = false;
                        }
                    } else {
                        z = false;
                    }
                    break;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 2:
                oju ojuVar = this.f22968b;
                cdu cduVar = ((err) this.f22967a).get();
                chw chwVar = (chw) ojuVar.get();
                cduVar.m3529i().m13537d(chwVar);
                return chwVar;
            case 3:
                Object objM17136H = ((dhv) this.f22967a.get()).mo6184l(dhh.f11084aj) ? mxk.m17136H((fpp) this.f22968b.get()) : mzx.f41874a;
                objM17136H.getClass();
                return objM17136H;
            case 4:
                Object objM17136H2 = ((dhv) this.f22967a.get()).mo6184l(dhh.f11084aj) ? mxk.m17136H(((fpp) this.f22968b.get()).f23125h) : mzx.f41874a;
                objM17136H2.getClass();
                return objM17136H2;
            case 5:
                Object fsmVar = ((dms) this.f22967a).get().m6693h() ? (ftb) this.f22968b.get() : new fsm();
                fsmVar.getClass();
                return fsmVar;
            case 6:
                return Boolean.valueOf(((dms) this.f22967a).get().m6693h() && ((fxb) this.f22968b).get().f38949a);
            default:
                mrm mrmVar = (mrm) this.f22967a.get();
                mrm mrmVar2 = (mrm) this.f22968b.get();
                return (mrmVar2.mo16813g() && ((Boolean) mrmVar2.mo16809c()).booleanValue() && mrmVar.mo16813g()) ? mrm.m16829i((ftp) ((oju) mrmVar.mo16809c()).get()) : mqu.f41450a;
        }
    }
}
