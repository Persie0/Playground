package p000;

import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kma extends klp implements kpp {

    /* JADX INFO: renamed from: a */
    private final TotalCaptureResult f36523a;

    /* JADX INFO: renamed from: b */
    private volatile Map f36524b;

    public kma(TotalCaptureResult totalCaptureResult) {
        super(totalCaptureResult);
        this.f36524b = null;
        this.f36523a = totalCaptureResult;
    }

    @Override // p000.kpp
    /* JADX INFO: renamed from: g */
    public final Map mo9520g() {
        Map mapMo17059b = this.f36524b;
        if (mapMo17059b == null) {
            synchronized (this) {
                mapMo17059b = this.f36524b;
                if (mapMo17059b == null) {
                    Map<String, CaptureResult> physicalCameraResults = this.f36523a.getPhysicalCameraResults();
                    mwt mwtVarM17115i = mwx.m17115i();
                    for (String str : physicalCameraResults.keySet()) {
                        CaptureResult captureResult = physicalCameraResults.get(str);
                        if (captureResult != null) {
                            mwtVarM17115i.mo17110e(str, new klp(captureResult));
                        }
                    }
                    mapMo17059b = mwtVarM17115i.mo17059b();
                    this.f36524b = mapMo17059b;
                }
            }
        }
        return mapMo17059b;
    }

    @Override // p000.kpd
    /* JADX INFO: renamed from: j */
    public final khb mo7254j() {
        return new khb(this.f36523a);
    }

    public final String toString() {
        mrl mrlVarM16766e = mpw.m16766e("TotalCaptureResult");
        mrlVarM16766e.m16827f("FrameNumber", mo9515b());
        mrlVarM16766e.m16826e("SequenceNumber", mo9514a());
        return mrlVarM16766e.toString();
    }
}
