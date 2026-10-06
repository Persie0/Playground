package p000;

import android.hardware.camera2.CaptureResult;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class glo extends kfv {

    /* JADX INFO: renamed from: b */
    private static final nbh f25517b = nbh.m17259h("com/google/android/apps/camera/pixelcamerakit/common/ActiveCameraMonitor");

    /* JADX INFO: renamed from: a */
    public final jwf f25518a;

    /* JADX INFO: renamed from: c */
    private final Executor f25519c;

    /* JADX INFO: renamed from: d */
    private final fnj f25520d;

    /* JADX INFO: renamed from: e */
    private final boolean f25521e;

    public glo(jwf jwfVar, fnj fnjVar, boolean z, Executor executor) {
        this.f25518a = jwfVar;
        this.f25521e = z;
        this.f25520d = fnjVar;
        this.f25519c = executor;
    }

    @Override // p000.kfv
    /* JADX INFO: renamed from: bu */
    public final synchronized void mo3408bu(kpp kppVar) {
        String str = (String) kppVar.mo9517d(CaptureResult.LOGICAL_MULTI_CAMERA_ACTIVE_PHYSICAL_ID);
        String str2 = this.f25521e ? (String) this.f25520d.f22787a.map(new gei(kppVar, str, 3)).orElse(str) : null;
        if (str2 != null) {
            str = str2;
        }
        if (str != null && !str.equals(this.f25518a.f34942d)) {
            try {
                this.f25519c.execute(new fro(this, str, 18));
            } catch (RejectedExecutionException e) {
                ((nbe) ((nbe) ((nbe) f25517b.m17252c()).mo17283h(e)).mo17276G((char) 2963)).mo17290o("Update operation couldn't be completed.");
            }
        }
    }
}
