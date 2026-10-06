package p000;

import com.google.android.apps.camera.stats.timing.CameraActivityTiming;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cea implements ciw {

    /* JADX INFO: renamed from: a */
    public final dcl f5402a;

    /* JADX INFO: renamed from: b */
    public final CameraActivityTiming f5403b;

    /* JADX INFO: renamed from: c */
    public final doe f5404c;

    /* JADX INFO: renamed from: d */
    public final Executor f5405d;

    /* JADX INFO: renamed from: e */
    public final cwd f5406e;

    /* JADX INFO: renamed from: f */
    private final cdz f5407f;

    public cea(cdz cdzVar, dcl dclVar, CameraActivityTiming cameraActivityTiming, cwd cwdVar, doe doeVar, Executor executor, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f5407f = cdzVar;
        this.f5402a = dclVar;
        this.f5403b = cameraActivityTiming;
        this.f5406e = cwdVar;
        this.f5404c = doeVar;
        this.f5405d = executor;
    }

    /* JADX INFO: renamed from: a */
    public static kcl m3537a(dnl dnlVar) {
        kcl kclVar = dnlVar.f12101b;
        if (kclVar == null) {
            kclVar = kcl.CAMERA_ERROR_CODE_UNKNOWN;
        }
        kclVar.getClass();
        return kclVar;
    }

    @Override // p000.ciw
    /* JADX INFO: renamed from: bd */
    public final nps mo3538bd() {
        CameraActivityTiming cameraActivityTiming = this.f5403b;
        cameraActivityTiming.m10438i(hkp.WAIT_FOR_CAMERA_DEVICES_TASK_START, CameraActivityTiming.f6962b);
        cameraActivityTiming.f6969i = cameraActivityTiming.f6965e.mo13957a("waitForCameraDevice");
        return nnj.m17524j(nod.m17553i(this.f5407f.m3535a(), new ceg(this, 1), not.INSTANCE), Throwable.class, etv.f19877b, not.INSTANCE);
    }

    @Override // p000.ciw
    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String mo3539c() {
        return dez.m6039i(this);
    }
}
