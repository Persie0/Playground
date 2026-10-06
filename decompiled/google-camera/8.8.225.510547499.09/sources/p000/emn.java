package p000;

import android.hardware.camera2.CameraManager;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class emn implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f14723a;

    public emn(oju ojuVar) {
        this.f14723a = ojuVar;
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final CameraManager get() {
        CameraManager cameraManager = (CameraManager) ((emj) this.f14723a.get()).mo7509a(emj.f14711d);
        cameraManager.getClass();
        return cameraManager;
    }
}
