package p000;

import android.hardware.camera2.CaptureResult;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gbt implements jwn, kbg {

    /* JADX INFO: renamed from: a */
    private final kbo f24135a;

    /* JADX INFO: renamed from: b */
    private final jwf f24136b;

    /* JADX INFO: renamed from: c */
    private int f24137c;

    /* JADX INFO: renamed from: d */
    private final fvu f24138d;

    public gbt(kbn kbnVar, fvu fvuVar, gcx gcxVar) {
        this.f24135a = kbnVar.mo6314a("AutoFlashIndicator");
        this.f24138d = fvuVar;
        boolean z = false;
        if (((gcy) gcxVar.mo3831be()).equals(gcy.ON) && fvuVar.mo14540I()) {
            z = true;
        }
        this.f24136b = new jwf(Boolean.valueOf(z));
    }

    @Override // p000.jwn
    /* JADX INFO: renamed from: a */
    public final kba mo3830a(kbg kbgVar, Executor executor) {
        return this.f24136b.mo3830a(kbgVar, executor);
    }

    @Override // p000.jwn
    /* JADX INFO: renamed from: be */
    public final /* bridge */ /* synthetic */ Object mo3831be() {
        return (Boolean) this.f24136b.f34942d;
    }

    @Override // p000.kbg
    /* JADX INFO: renamed from: bf */
    public final /* bridge */ /* synthetic */ void mo3415bf(Object obj) {
        Integer num;
        kpp kppVar = (kpp) obj;
        if (this.f24138d.mo14540I() && (num = (Integer) kppVar.mo9517d(CaptureResult.CONTROL_AE_STATE)) != null) {
            if (mpw.m16768g(num, 4)) {
                if (!((Boolean) this.f24136b.f34942d).booleanValue()) {
                    this.f24135a.mo13940b("Flash required");
                }
                this.f24137c = 0;
                this.f24136b.mo3415bf(true);
                return;
            }
            if (mpw.m16768g(num, 2) || mpw.m16768g(num, 3)) {
                if (((Boolean) this.f24136b.f34942d).booleanValue()) {
                    this.f24135a.mo13940b("Flash not required");
                }
                this.f24137c = 0;
                this.f24136b.mo3415bf(false);
                return;
            }
            int i = this.f24137c + 1;
            this.f24137c = i;
            if (i <= 30 || ((Boolean) this.f24136b.f34942d).booleanValue()) {
                return;
            }
            this.f24135a.mo13947i(kfv.m14168E("No converged AE result for %d frames,falling back to single-image auto-flash photo", Integer.valueOf(this.f24137c)));
            this.f24136b.mo3415bf(true);
        }
    }
}
