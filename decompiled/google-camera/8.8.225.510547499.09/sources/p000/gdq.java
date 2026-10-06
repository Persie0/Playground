package p000;

import android.hardware.camera2.CaptureResult;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gdq implements gdo {

    /* JADX INFO: renamed from: a */
    private final kbo f24331a;

    /* JADX INFO: renamed from: b */
    private final dlc f24332b;

    /* JADX INFO: renamed from: c */
    private double f24333c = 33.0d;

    public gdq(kbn kbnVar, dlc dlcVar) {
        this.f24331a = kbnVar.mo6314a("FrameJank");
        this.f24332b = dlcVar;
    }

    @Override // p000.gdo
    /* JADX INFO: renamed from: a */
    public final void mo9080a(kpp kppVar, double d, double d2) {
        Long l = (Long) kppVar.mo9517d(CaptureResult.SENSOR_TIMESTAMP);
        Long l2 = (Long) kppVar.mo9517d(CaptureResult.SENSOR_FRAME_DURATION);
        if (l != null && l2 != null) {
            this.f24332b.mo6329b(l.longValue(), l2.longValue());
        }
        double d3 = this.f24333c;
        if (d3 > 33.0d && d > 33.0d) {
            double d4 = (d - d3) / d3;
            if (d4 >= 1.5d) {
                this.f24331a.mo13944f("JANK! Time between frames (" + d + "ms) increased by " + (d4 * 100.0d) + "% over the expected delta (" + d3 + "ms)");
            }
        }
        if (d > 33.0d) {
            double d5 = this.f24333c;
            if (d > d5) {
                this.f24333c = (d + (d5 * 10.0d)) / 11.0d;
            } else {
                this.f24333c = d;
            }
        }
    }
}
