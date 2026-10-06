package p000;

import android.hardware.camera2.CaptureResult;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class cch extends kfv {

    /* JADX INFO: renamed from: a */
    public final kmq f5126a;

    /* JADX INFO: renamed from: b */
    public float f5127b = 0.0f;

    /* JADX INFO: renamed from: c */
    public gzk f5128c = gzk.ON;

    /* JADX INFO: renamed from: d */
    private final kbo f5129d;

    /* JADX INFO: renamed from: e */
    private final jww f5130e;

    /* JADX INFO: renamed from: f */
    private final cci f5131f;

    /* JADX INFO: renamed from: g */
    private final ent f5132g;

    public cch(kbo kboVar, jvb jvbVar, fvu fvuVar, eat eatVar, jww jwwVar, jww jwwVar2, fcp fcpVar, jwn jwnVar) {
        kbo kboVarMo6314a = kboVar.mo6314a("LowLightAfLock");
        this.f5129d = kboVarMo6314a;
        kmq kmqVarMo14558k = fvuVar.mo14558k();
        this.f5126a = kmqVarMo14558k;
        jwwVar = kmqVarMo14558k == kmq.f36557a ? jwwVar2 : jwwVar;
        this.f5130e = jwwVar;
        this.f5132g = new ent(jwnVar);
        cci cciVar = new cci(fvuVar, eatVar, kboVarMo6314a, "cuttlef-af-".concat(String.valueOf(kmqVarMo14558k.name())));
        jvbVar.m13537d(cciVar);
        this.f5131f = cciVar;
        cciVar.m3434b();
        jvbVar.m13537d(jwwVar.mo3830a(new cdb(this, fcpVar, 1), not.INSTANCE));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, jwn] */
    @Override // p000.kfv
    /* JADX INFO: renamed from: bu */
    public final void mo3408bu(kpp kppVar) {
        Float f = (Float) kppVar.mo9517d(CaptureResult.LENS_FOCUS_DISTANCE);
        lku.m15662p(f);
        this.f5127b = f.floatValue();
        this.f5131f.m3433a(kppVar);
        ent entVar = this.f5132g;
        if (((Boolean) entVar.f14791b.mo3831be()).booleanValue()) {
            int iMin = Math.min(entVar.f14790a + 1, 5);
            entVar.f14790a = iMin;
            if (iMin >= 5 && !this.f5131f.m3435c()) {
                if (((Integer) this.f5130e.mo3831be()).intValue() == gzk.ON.f26932f) {
                    Integer num = (Integer) kppVar.mo9517d(CaptureResult.CONTROL_AF_STATE);
                    lku.m15662p(num);
                    if (gst.m9711a(num.intValue()) == gst.PASSIVE_UNFOCUSED) {
                        this.f5129d.mo13944f("Locking AF");
                        this.f5130e.mo3415bf(Integer.valueOf(gzk.ON_LOCKED.f26932f));
                        return;
                    }
                    return;
                }
                return;
            }
        } else {
            entVar.f14790a = 0;
        }
        if (((Integer) this.f5130e.mo3831be()).intValue() == gzk.ON_LOCKED.f26932f) {
            this.f5129d.mo13944f("Unlocking AF");
            this.f5130e.mo3415bf(Integer.valueOf(gzk.ON.f26932f));
        }
    }
}
