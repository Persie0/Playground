package p000;

import android.hardware.camera2.CaptureResult;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cfs implements cfe {

    /* JADX INFO: renamed from: a */
    private final dhv f5516a;

    /* JADX INFO: renamed from: b */
    private final cfv f5517b;

    /* JADX INFO: renamed from: c */
    private mrm f5518c;

    /* JADX INFO: renamed from: d */
    private mrm f5519d;

    public cfs(cfv cfvVar, dhv dhvVar) {
        mqu mquVar = mqu.f41450a;
        this.f5518c = mquVar;
        this.f5519d = mquVar;
        this.f5516a = dhvVar;
        this.f5517b = cfvVar;
    }

    @Override // p000.cfe
    /* JADX INFO: renamed from: a */
    public final void mo3594a(kpp kppVar) {
        String str = (String) kppVar.mo9517d(CaptureResult.LOGICAL_MULTI_CAMERA_ACTIVE_PHYSICAL_ID);
        if (str == null || !this.f5519d.mo16813g()) {
            return;
        }
        if (this.f5518c.mo16813g() && ((String) this.f5518c.mo16809c()).equals(str)) {
            return;
        }
        this.f5518c = mrm.m16829i(str);
        cfv cfvVar = this.f5517b;
        kmg kmgVar = (kmg) this.f5519d.mo16809c();
        Object obj = cfvVar.f5530h.f1685a;
        if (obj == null || !((cfw) obj).f5543a.equals(cfx.m3611e(kmgVar, str))) {
            cfx cfxVar = cfvVar.f5523a;
            String strM3611e = cfx.m3611e(kmgVar, str);
            cfw cfwVar = new cfw(strM3611e, cfxVar.f5548d.m11351s(strM3611e, ""), cfxVar.f5545a);
            String str2 = cfwVar.f5543a;
            cfvVar.f5530h.m1609l(cfwVar);
            cfvVar.f5529g = 2;
            if (!cfvVar.f5524b.containsKey(str2)) {
                cfvVar.f5524b.put(str2, new AtomicInteger(0));
            }
            cfvVar.f5527e = (AtomicInteger) cfvVar.f5524b.get(str2);
            jww jwwVar = cfvVar.f5526d;
            bko bkoVar = cfvVar.f5531i;
            jwwVar.mo3415bf(15);
        }
        cfvVar.m3608h();
    }

    @Override // p000.cfg
    /* JADX INFO: renamed from: b */
    public final cfc mo3596b() {
        return new cfr(this.f5516a);
    }

    @Override // p000.cfg
    /* JADX INFO: renamed from: c */
    public final void mo3597c() {
    }

    @Override // p000.cfg
    /* JADX INFO: renamed from: d */
    public final void mo3598d(kmg kmgVar) {
        this.f5519d = mrm.m16829i(kmgVar);
    }

    @Override // p000.cfg
    /* JADX INFO: renamed from: e */
    public final void mo3599e(kmd kmdVar) {
    }

    @Override // p000.cfg
    /* JADX INFO: renamed from: f */
    public final void mo3600f(cfk cfkVar) {
    }
}
