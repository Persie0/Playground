package p000;

import android.hardware.Camera;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bmx extends boc {

    /* JADX INFO: renamed from: a */
    private final Camera.CameraInfo f3847a;

    public bmx(Camera.CameraInfo cameraInfo) {
        this.f3847a = cameraInfo;
    }

    @Override // p000.boc
    /* JADX INFO: renamed from: a */
    public final int mo2711a() {
        return this.f3847a.orientation;
    }

    @Override // p000.boc
    /* JADX INFO: renamed from: b */
    public final boolean mo2712b() {
        return this.f3847a.facing == 0;
    }

    @Override // p000.boc
    /* JADX INFO: renamed from: c */
    public final boolean mo2713c() {
        return this.f3847a.facing == 1;
    }
}
