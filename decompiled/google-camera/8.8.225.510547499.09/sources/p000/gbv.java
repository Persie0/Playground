package p000;

import android.hardware.camera2.CaptureResult;
import com.google.android.apps.camera.jni.microvideotonemap.yUpa.qQLA;
import p021j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gbv implements fwc {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ gbv f24144a = new gbv(0);

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f24145b;

    public /* synthetic */ gbv(int i) {
        this.f24145b = i;
    }

    @Override // p000.fwc
    /* JADX INFO: renamed from: a */
    public final boolean mo8862a(kpp kppVar) {
        switch (this.f24145b) {
            case 0:
                if (kppVar == null) {
                    ((nbe) ((nbe) gbw.f24146a.m17252c().mo17282g(nch.f41987a, "MetadataConditions")).mo17276G((char) 2550)).mo17290o(qQLA.arCvhHL);
                    return false;
                }
                if (!kppVar.mo9520g().isEmpty()) {
                    return true;
                }
                ((nbe) ((nbe) gbw.f24146a.m17252c().mo17282g(nch.f41987a, "MetadataConditions")).mo17276G((char) 2549)).mo17290o("Missing expected physical capture results.");
                return false;
            default:
                if (kppVar != null) {
                    Integer num = (Integer) kppVar.mo9517d(CaptureResult.CONTROL_AE_STATE);
                    Integer num2 = (Integer) kppVar.mo9517d(CaptureResult.CONTROL_AF_STATE);
                    if (num != null && num2 != null && !Objects.equals(0, num) && !Objects.equals(5, num) && !Objects.equals(3, num2)) {
                        return true;
                    }
                }
                return false;
        }
    }
}
