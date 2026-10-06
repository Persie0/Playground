package p000;

import com.google.android.apps.camera.imax.cyclops.capture.TrackerStats;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class eku {

    /* JADX INFO: renamed from: a */
    private float f14519a;

    /* JADX INFO: renamed from: b */
    private float f14520b;

    /* JADX INFO: renamed from: c */
    private int f14521c;

    public eku() {
        m7426b();
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m7425a(TrackerStats trackerStats) {
        this.f14521c++;
        float f = trackerStats.featureMotionInPixels;
        float fMin = Math.min(trackerStats.numActiveTracks, 50);
        float fMin2 = 1.0f / Math.min(this.f14521c, 5);
        float f2 = 1.0f - fMin2;
        this.f14519a = (f * fMin2) + (this.f14519a * f2);
        this.f14520b = (fMin2 * (fMin / 50.0f)) + (f2 * this.f14520b);
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m7426b() {
        this.f14519a = 0.0f;
        this.f14520b = 0.0f;
        this.f14521c = 0;
    }
}
