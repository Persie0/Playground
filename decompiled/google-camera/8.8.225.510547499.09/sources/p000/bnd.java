package p000;

import android.hardware.Camera;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bnd {

    /* JADX INFO: renamed from: a */
    private Camera.Parameters f3867a;

    /* JADX INFO: renamed from: b */
    private final Camera f3868b;

    public bnd(Camera camera) {
        this.f3868b = camera;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized Camera.Parameters m2763a() {
        Camera.Parameters parameters;
        parameters = this.f3867a;
        if (parameters == null) {
            parameters = this.f3868b.getParameters();
            this.f3867a = parameters;
            if (parameters == null) {
                bop.m2812a(bnh.f3875a, "Camera object returned null parameters!");
                throw new IllegalStateException("camera.getParameters returned null");
            }
        }
        return parameters;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m2764b() {
        this.f3867a = null;
    }
}
