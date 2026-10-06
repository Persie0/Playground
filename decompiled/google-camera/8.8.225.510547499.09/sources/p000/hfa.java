package p000;

import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.params.Face;
import com.google.android.apps.camera.jni.saliency.SaliencyPredictor;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hfa implements hfe {
    @Override // p000.hfe
    /* JADX INFO: renamed from: a */
    public final synchronized mrm mo10178a(kpw kpwVar, gsr gsrVar) {
        Face[] faceArr;
        float[] fArr;
        int i;
        float fMin;
        mrm mrmVarM16829i;
        int length;
        SaliencyPredictor saliencyPredictor = new SaliencyPredictor();
        if (saliencyPredictor.f6755b.getAndSet(false)) {
            saliencyPredictor.f6754a = SaliencyPredictor.nativeLoad(false);
        }
        List listMo7251g = kpwVar.mo7251g();
        kpv kpvVar = (kpv) listMo7251g.get(0);
        kpv kpvVar2 = (kpv) listMo7251g.get(1);
        kpv kpvVar3 = (kpv) listMo7251g.get(2);
        if (gsrVar != null) {
            kpl kplVar = gsrVar.f26241a;
            kplVar.getClass();
            faceArr = (Face[]) kplVar.mo9517d(CaptureResult.STATISTICS_FACES);
        } else {
            faceArr = null;
        }
        float[] fArr2 = new float[0];
        if (faceArr == null || (length = faceArr.length) <= 0) {
            fArr = fArr2;
        } else {
            float[] fArr3 = new float[length * 4];
            for (int i2 = 0; i2 < faceArr.length; i2++) {
                int i3 = i2 * 4;
                fArr3[i3] = faceArr[i2].getBounds().left / 1.1f;
                fArr3[i3 + 1] = faceArr[i2].getBounds().top / 1.1f;
                fArr3[i3 + 2] = faceArr[i2].getBounds().right * 1.1f;
                fArr3[i3 + 3] = faceArr[i2].getBounds().bottom * 1.1f;
            }
            fArr = fArr3;
        }
        Face[] faceArr2 = faceArr;
        float[] fArrNativeGetSaliencyHeatMap = saliencyPredictor.nativeGetSaliencyHeatMap(saliencyPredictor.f6754a, kpwVar.mo7247c(), kpwVar.mo7246b(), kpvVar.getBuffer(), kpvVar.getPixelStride(), kpvVar.getRowStride(), kpvVar2.getBuffer(), kpvVar2.getPixelStride(), kpvVar2.getRowStride(), kpvVar3.getBuffer(), kpvVar3.getPixelStride(), kpvVar3.getRowStride(), gsrVar != null ? gsrVar.f26260t.right : 0.0f, gsrVar != null ? gsrVar.f26260t.bottom : 0.0f, fArr);
        int length2 = fArrNativeGetSaliencyHeatMap.length;
        if (length2 == 0) {
            i = 2;
            fMin = 1.0f;
        } else if ((length2 & 3) == 0) {
            fMin = 1.0f;
            int i4 = 0;
            while (true) {
                i = 2;
                if (i4 >= (fArrNativeGetSaliencyHeatMap.length >> 2)) {
                    break;
                }
                int i5 = i4 * 4;
                fMin = Math.min(fMin, Math.max(Math.max(Math.abs(fArrNativeGetSaliencyHeatMap[i5] - 0.5f), Math.abs(fArrNativeGetSaliencyHeatMap[i5 + 2] - 0.5f)), Math.max(Math.abs(fArrNativeGetSaliencyHeatMap[i5 + 1] - 0.5f), Math.abs(fArrNativeGetSaliencyHeatMap[i5 + 3] - 0.5f))));
                i4++;
            }
        } else {
            fMin = 1.0f;
            i = 2;
        }
        mrmVarM16829i = mrm.m16829i(Float.valueOf(0.5f / (fMin * 1.1f)));
        if (((Float) ((mrq) mrmVarM16829i).f41482a).floatValue() < 1.2f) {
            mrmVarM16829i = mrm.m16829i(Float.valueOf(0.0f));
        }
        if (((Float) ((mrq) mrmVarM16829i).f41482a).floatValue() < 1.0f && faceArr2 != null && faceArr2.length >= i) {
            mrmVarM16829i = mqu.f41450a;
        }
        saliencyPredictor.m4187a();
        return mrmVarM16829i;
    }

    @Override // p000.hfe, java.lang.AutoCloseable
    public final void close() {
    }
}
