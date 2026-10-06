package p000;

import android.hardware.camera2.CaptureRequest;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fkl implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f22389a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f22390b;

    public fkl(oju ojuVar, int i) {
        this.f22390b = i;
        this.f22389a = ojuVar;
    }

    /* JADX INFO: renamed from: a */
    public static fkl m8511a(oju ojuVar) {
        return new fkl(ojuVar, 2);
    }

    /* JADX INFO: renamed from: b */
    public static fkl m8512b(oju ojuVar) {
        return new fkl(ojuVar, 8);
    }

    /* JADX INFO: renamed from: c */
    public static fkl m8513c(oju ojuVar) {
        return new fkl(ojuVar, 9);
    }

    /* JADX INFO: renamed from: d */
    public static fkl m8514d(oju ojuVar) {
        return new fkl(ojuVar, 11);
    }

    /* JADX INFO: renamed from: e */
    public static fkl m8515e(oju ojuVar) {
        return new fkl(ojuVar, 12);
    }

    /* JADX INFO: renamed from: f */
    public static fkl m8516f(oju ojuVar) {
        return new fkl(ojuVar, 13);
    }

    /* JADX INFO: renamed from: g */
    public static fkl m8517g(oju ojuVar) {
        return new fkl(ojuVar, 14);
    }

    /* JADX INFO: renamed from: h */
    public static fkl m8518h(oju ojuVar) {
        return new fkl(ojuVar, 15);
    }

    /* JADX INFO: renamed from: i */
    public static fkl m8519i(oju ojuVar) {
        return new fkl(ojuVar, 16);
    }

    /* JADX INFO: renamed from: j */
    public static fkl m8520j(oju ojuVar) {
        return new fkl(ojuVar, 17);
    }

    /* JADX INFO: renamed from: k */
    public static fkl m8521k(oju ojuVar) {
        return new fkl(ojuVar, 18);
    }

    /* JADX INFO: renamed from: l */
    public static fkl m8522l(oju ojuVar) {
        return new fkl(ojuVar, 19);
    }

    /* JADX INFO: renamed from: m */
    public static fkl m8523m(oju ojuVar) {
        return new fkl(ojuVar, 20);
    }

    /* JADX WARN: Type inference failed for: r0v62, types: [java.lang.Object, jwn] */
    /* JADX WARN: Type inference failed for: r0v75, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v80, types: [java.lang.Object, java.util.List] */
    @Override // p000.oju
    public final /* synthetic */ Object get() {
        switch (this.f22390b) {
            case 0:
                dvl dvlVarM6866b = dxu.m6866b((dtj) this.f22389a.get());
                dvlVarM6866b.m6779c(5L, TimeUnit.MINUTES);
                dvlVarM6866b.m6778b();
                dvlVarM6866b.f12658a = 3;
                dvlVarM6866b.f12660c = 4;
                return dvlVarM6866b.m6777a();
            case 1:
                dvl dvlVarM6866b2 = dxu.m6866b((dtj) this.f22389a.get());
                dvlVarM6866b2.f12658a = 3;
                dvlVarM6866b2.m6779c(5L, TimeUnit.MINUTES);
                dvlVarM6866b2.f12659b = 30;
                dvlVarM6866b2.m6778b();
                dvlVarM6866b2.f12660c = 4;
                return dvlVarM6866b2.m6777a();
            case 2:
                return new gtd(((kbm) this.f22389a).get());
            case 3:
                return ((cku) this.f22389a).get();
            case 4:
                return (hle) ((hkx) this.f22389a.get()).mo10394a();
            case 5:
                return (hli) ((hkx) this.f22389a.get()).mo10394a();
            case 6:
                return (hlg) ((hkx) this.f22389a.get()).mo10394a();
            case 7:
                return (chw) ((mrq) ((crv) this.f22389a).m5442a()).f41482a;
            case 8:
                return new frq((frx) this.f22389a.get());
            case 9:
                return new guv((fre) this.f22389a.get(), 1);
            case 10:
                return new kms(((kak) this.f22389a).get());
            case 11:
                return new oyo(((fxk) this.f22389a).get().mo14553f());
            case 12:
                return new fup(((cde) this.f22389a).m3490a().booleanValue());
            case 13:
                jwn jwnVarM8932f = fxo.m8932f(CaptureRequest.CONTROL_AE_REGIONS, ((fuj) this.f22389a).get());
                jwnVarM8932f.getClass();
                return jwnVarM8932f;
            case 14:
                jwn jwnVarM8932f2 = fxo.m8932f(CaptureRequest.CONTROL_AE_LOCK, ((drj) this.f22389a.get()).f12398d);
                jwnVarM8932f2.getClass();
                return jwnVarM8932f2;
            case 15:
                Object obj = ((gtd) this.f22389a.get()).f26334a;
                obj.getClass();
                return obj;
            case 16:
                jwn jwnVarM8932f3 = fxo.m8932f(CaptureRequest.CONTROL_MODE, ((fwk) this.f22389a).get());
                jwnVarM8932f3.getClass();
                return jwnVarM8932f3;
            case 17:
                return fxo.m8929c(((fwl) this.f22389a).get().f3651a);
            case 18:
                return fxo.m8929c(((fwq) this.f22389a).get().f3651a);
            case 19:
                jwn jwnVarM8932f4 = fxo.m8932f(CaptureRequest.CONTROL_AE_MODE, (jwn) this.f22389a.get());
                jwnVarM8932f4.getClass();
                return jwnVarM8932f4;
            default:
                return fxo.m8929c(gls.m9439a(((fxk) this.f22389a).get()));
        }
    }
}
