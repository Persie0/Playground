package p000;

import android.hardware.camera2.CaptureResult;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gaf extends kfv {

    /* JADX INFO: renamed from: a */
    public static final nbh f24020a = nbh.m17259h("com/google/android/apps/camera/one/metadata/dynamicsensororientation/DynamicSensorOrientationListener");

    /* JADX INFO: renamed from: b */
    public final jww f24021b;

    /* JADX INFO: renamed from: c */
    public final kme f24022c;

    /* JADX INFO: renamed from: d */
    public final kmd f24023d;

    /* JADX INFO: renamed from: e */
    private final Executor f24024e;

    public gaf(jww jwwVar, kme kmeVar, kmd kmdVar, Executor executor) {
        this.f24021b = jwwVar;
        this.f24022c = kmeVar;
        this.f24023d = kmdVar;
        this.f24024e = executor;
    }

    @Override // p000.kfv
    /* JADX INFO: renamed from: bu */
    public final void mo3408bu(kpp kppVar) {
        if (!this.f24023d.mo14544M()) {
            if (this.f24023d.mo14553f() != ((Integer) this.f24021b.mo3831be()).intValue()) {
                this.f24021b.mo3415bf(Integer.valueOf(this.f24023d.mo14553f()));
            }
        } else {
            String str = (String) kppVar.mo9517d(CaptureResult.LOGICAL_MULTI_CAMERA_ACTIVE_PHYSICAL_ID);
            if (str != null) {
                this.f24024e.execute(new fro(this, str, 8));
            }
        }
    }
}
