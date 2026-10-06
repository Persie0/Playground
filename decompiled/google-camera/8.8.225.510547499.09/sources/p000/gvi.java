package p000;

import android.hardware.camera2.CaptureResult;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gvi implements gvh {

    /* JADX INFO: renamed from: a */
    private final dtk f26492a;

    /* JADX INFO: renamed from: b */
    private final float[] f26493b = new float[3];

    public gvi(dtk dtkVar) {
        this.f26492a = dtkVar;
    }

    @Override // p000.gvh
    /* JADX INFO: renamed from: a */
    public final float mo9790a(kpp kppVar) {
        Long l = (Long) kppVar.mo9517d(CaptureResult.SENSOR_EXPOSURE_TIME);
        float fSqrt = Float.NaN;
        float fLongValue = l == null ? Float.NaN : l.longValue();
        Long l2 = (Long) kppVar.mo9517d(CaptureResult.SENSOR_TIMESTAMP);
        if (l2 != null) {
            synchronized (this.f26493b) {
                dtk dtkVar = this.f26492a;
                if (dtkVar != null) {
                    dtg dtgVarMo6736c = dtkVar.mo6736c(l2.longValue());
                    if (!dtgVarMo6736c.m6725e()) {
                        float[] fArr = dtgVarMo6736c.f12554a;
                        float f = fArr[0];
                        float f2 = fArr[1];
                        float f3 = fArr[2];
                        fSqrt = (float) Math.sqrt((f * f) + (f2 * f2) + (f3 * f3));
                    }
                }
            }
        }
        return (float) Math.exp(fLongValue * (-5.0E-7f) * fSqrt);
    }
}
