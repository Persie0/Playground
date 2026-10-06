package p000;

import android.hardware.camera2.CameraCharacteristics;
import android.util.SizeF;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ekd {

    /* JADX INFO: renamed from: a */
    public static final Byte f14453a = (byte) 0;

    /* JADX INFO: renamed from: b */
    public final kmd f14454b;

    /* JADX INFO: renamed from: c */
    public final eko f14455c;

    /* JADX INFO: renamed from: d */
    public final dhv f14456d;

    /* JADX INFO: renamed from: e */
    private final kmg f14457e;

    public ekd(kme kmeVar, dhv dhvVar) {
        this.f14456d = dhvVar;
        kmg kmgVarMo13858e = kmeVar.mo13858e(kmq.BACK);
        lku.m15662p(kmgVarMo13858e);
        this.f14457e = kmgVarMo13858e;
        kmd kmdVarMo13854a = kmeVar.mo13854a(kmgVarMo13858e);
        this.f14454b = kmdVarMo13854a;
        eko ekoVar = new eko();
        kbc kbcVarM13661b = jxp.RES_1080P.m13661b();
        ekoVar.f14475a = kbcVarM13661b.f35517a;
        ekoVar.f14476b = kbcVarM13661b.f35518b;
        ekoVar.f14479e = false;
        ekoVar.f14477c = kmdVarMo13854a.mo14553f();
        SizeF sizeF = (SizeF) kmdVarMo13854a.mo14559l(CameraCharacteristics.SENSOR_INFO_PHYSICAL_SIZE);
        lku.m15662p(sizeF);
        float[] fArr = (float[]) kmdVarMo13854a.mo14559l(CameraCharacteristics.LENS_INFO_AVAILABLE_FOCAL_LENGTHS);
        lku.m15662p(fArr);
        ekoVar.f14478d = (fArr[0] * 36.0f) / sizeF.getWidth();
        this.f14455c = ekoVar;
    }

    /* JADX INFO: renamed from: a */
    public final double m7408a() {
        float f = this.f14455c.f14478d;
        double dAtan = Math.atan(36.0f / (f + f));
        return Math.toDegrees(dAtan + dAtan);
    }
}
