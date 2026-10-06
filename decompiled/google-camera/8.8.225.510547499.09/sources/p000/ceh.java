package p000;

import com.google.android.apps.camera.stats.timing.CameraActivityTiming;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ceh implements ciw {

    /* JADX INFO: renamed from: a */
    public final CameraActivityTiming f5440a;

    /* JADX INFO: renamed from: b */
    private final ceb f5441b;

    public ceh(ceb cebVar, CameraActivityTiming cameraActivityTiming) {
        this.f5441b = cebVar;
        this.f5440a = cameraActivityTiming;
    }

    @Override // p000.ciw
    /* JADX INFO: renamed from: bd */
    public final nps mo3538bd() {
        this.f5440a.m10438i(hkp.PERMISSIONS_STARTUP_TASK_START, CameraActivityTiming.f6962b);
        return nod.m17553i(this.f5441b.mo3540a(), new ceg(this, 0), not.INSTANCE);
    }

    @Override // p000.ciw
    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String mo3539c() {
        return dez.m6039i(this);
    }
}
