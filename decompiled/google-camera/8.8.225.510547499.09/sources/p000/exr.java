package p000;

import com.google.android.apps.lightcycle.panorama.LightCycleNative;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class exr {

    /* JADX INFO: renamed from: a */
    public float f20865a = 0.0f;

    /* JADX INFO: renamed from: b */
    public double f20866b = -1.0d;

    /* JADX INFO: renamed from: c */
    public boolean f20867c = false;

    /* JADX INFO: renamed from: a */
    public final void m8023a() {
        double d = this.f20866b;
        float f = 0.16000001f;
        if (d > 0.0d) {
            if (d > 0.025d) {
                f = 0.0025000002f;
            } else if (d < 0.01d) {
                f = true != this.f20867c ? 1.0f : 0.010000001f;
            }
        }
        boolean z = this.f20865a > f;
        Object obj = exh.f20734a;
        LightCycleNative.SetSensorMovementTooFast(z);
    }
}
