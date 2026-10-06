package p000;

import android.graphics.Rect;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.params.Face;
import android.util.Pair;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gah implements ohi {

    /* JADX INFO: renamed from: a */
    private final /* synthetic */ int f24026a;

    public gah(int i) {
        this.f24026a = i;
    }

    @Override // p000.oju
    public final /* synthetic */ Object get() {
        switch (this.f24026a) {
            case 0:
                return new jwf(nss.f44437b);
            case 1:
                return nqf.m17621g();
            case 2:
                return new jwf(new igp(new Face[0], new Rect(), 0L));
            case 3:
                Float fValueOf = Float.valueOf(0.0f);
                return new jwf(gam.m8996a(fValueOf, new Pair(fValueOf, fValueOf)));
            case 4:
                return true;
            case 5:
                return new jwf(fxo.m8931e());
            case 6:
                return nqf.m17621g();
            case 7:
                return new gov(CaptureResult.STATISTICS_LENS_SHADING_CORRECTION_MAP);
            case 8:
                edk edkVar = edk.LONG_EXPOSURE;
                edkVar.getClass();
                return edkVar;
            case 9:
                return fxo.m8931e();
            case 10:
                return mqu.f41450a;
            case 11:
                return new gcb();
            case 12:
                return jwr.m13637g(fxg.HDR_PLUS_ZSL);
            case 13:
                edk edkVar2 = edk.MOTION_BLUR;
                edkVar2.getClass();
                return edkVar2;
            case 14:
                return mqu.f41450a;
            case 15:
                edk edkVar3 = edk.REGULAR;
                edkVar3.getClass();
                return edkVar3;
            case 16:
                edk edkVar4 = edk.PORTRAIT;
                edkVar4.getClass();
                return edkVar4;
            case 17:
                return gcm.f24205a;
            case 18:
                return gcn.f24208a;
            case 19:
                return jwr.m13637g(egl.NONE);
            default:
                return new jwf(false);
        }
    }
}
