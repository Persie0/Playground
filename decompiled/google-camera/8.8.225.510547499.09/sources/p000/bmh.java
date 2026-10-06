package p000;

import android.hardware.camera2.CameraCharacteristics;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bmh extends boc {

    /* JADX INFO: renamed from: a */
    private final CameraCharacteristics f3776a;

    public bmh(CameraCharacteristics cameraCharacteristics) {
        this.f3776a = cameraCharacteristics;
    }

    @Override // p000.boc
    /* JADX INFO: renamed from: a */
    public final int mo2711a() {
        return ((Integer) this.f3776a.get(CameraCharacteristics.SENSOR_ORIENTATION)).intValue();
    }

    @Override // p000.boc
    /* JADX INFO: renamed from: b */
    public final boolean mo2712b() {
        return ((Integer) this.f3776a.get(CameraCharacteristics.LENS_FACING)).equals(1);
    }

    @Override // p000.boc
    /* JADX INFO: renamed from: c */
    public final boolean mo2713c() {
        return ((Integer) this.f3776a.get(CameraCharacteristics.LENS_FACING)).equals(0);
    }
}
