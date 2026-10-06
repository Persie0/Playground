package com.google.android.apps.camera.hdrplus.deblurfusion;

import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.camera2.CaptureResult;
import android.os.Build;
import com.google.googlex.gcam.FaceInfoVector;
import com.google.googlex.gcam.GcamModuleJNI;
import com.google.googlex.gcam.HalAfMetadata;
import com.google.googlex.gcam.PixelRect;
import java.util.Map;
import p000.efw;
import p000.gnf;
import p000.imu;
import p000.ivw;
import p000.ivx;
import p000.key;
import p000.kgg;
import p000.kmd;
import p000.kpl;
import p000.kpp;
import p000.kua;
import p000.mqu;
import p000.mrm;
import p000.nbe;
import p000.nbh;
import p000.nta;
import p000.ntw;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class DeblurFusionMergedCropCalculator implements efw {

    /* JADX INFO: renamed from: a */
    private static final nbh f6733a = nbh.m17259h("com/google/android/apps/camera/hdrplus/deblurfusion/DeblurFusionMergedCropCalculator");

    /* JADX INFO: renamed from: b */
    private final String f6734b;

    /* JADX INFO: renamed from: c */
    private final String f6735c;

    /* JADX INFO: renamed from: d */
    private final kmd f6736d;

    /* JADX INFO: renamed from: e */
    private final kmd f6737e;

    public DeblurFusionMergedCropCalculator(imu imuVar, Map map) {
        kgg kggVar = (kgg) map.get(gnf.f25701c);
        kggVar.getClass();
        String str = kggVar.mo14193c().f36540a;
        this.f6734b = str;
        kgg kggVar2 = (kgg) map.get(gnf.RAW_ULTRAWIDE);
        kggVar2.getClass();
        String str2 = kggVar2.mo14193c().f36540a;
        this.f6735c = str2;
        this.f6736d = imuVar.m11486a(str);
        this.f6737e = imuVar.m11486a(str2);
    }

    /* JADX INFO: renamed from: b */
    private static final PixelRect m4177b(Rect rect) {
        PixelRect pixelRect = new PixelRect();
        pixelRect.m5068f(rect.left);
        pixelRect.m5069g(rect.right);
        pixelRect.m5070h(rect.top);
        pixelRect.m5071i(rect.bottom);
        return pixelRect;
    }

    private static native boolean retrieveReferenceFlowRoi(long j, float f, float f2, long j2, float f3, float f4, long j3, long j4, boolean z, String str, long j5);

    @Override // p000.efw
    /* JADX INFO: renamed from: a */
    public final mrm mo4178a(key keyVar) {
        boolean zBooleanValue;
        kpp kppVarMo7042c = keyVar.mo7042c();
        kppVarMo7042c.getClass();
        kpl kplVar = (kpl) kppVarMo7042c.mo9520g().get(this.f6734b);
        kpp kppVarMo7042c2 = keyVar.mo7042c();
        kppVarMo7042c2.getClass();
        kpl kplVar2 = (kpl) kppVarMo7042c2.mo9520g().get(this.f6735c);
        if (kplVar2 == null) {
            ((nbe) ((nbe) f6733a.m17252c()).mo17276G((char) 1379)).mo17290o("Empty secondary metadata, skipping.");
            return mqu.f41450a;
        }
        kplVar.getClass();
        Rect rectMo14555h = this.f6736d.mo14555h();
        Rect rectMo14555h2 = this.f6737e.mo14555h();
        PixelRect pixelRectM4177b = m4177b(rectMo14555h);
        PixelRect pixelRectM4177b2 = m4177b(rectMo14555h2);
        PixelRect pixelRect = new PixelRect();
        FaceInfoVector faceInfoVector = new FaceInfoVector();
        nta.m17669p(this.f6736d, kplVar, faceInfoVector);
        Float f = (Float) kplVar.mo9517d(CaptureResult.LENS_FOCAL_LENGTH);
        f.getClass();
        float fFloatValue = f.floatValue();
        Float f2 = (Float) kplVar2.mo9517d(CaptureResult.LENS_FOCAL_LENGTH);
        f2.getClass();
        float fFloatValue2 = f2.floatValue();
        float fM14868g = (float) kua.m14868g(this.f6736d);
        float fM14868g2 = (float) kua.m14868g(this.f6737e);
        kplVar.mo9518e();
        kplVar2.mo9518e();
        HalAfMetadata halAfMetadata = new HalAfMetadata(GcamModuleJNI.new_HalAfMetadata(), true);
        if (ivx.f32439b != null) {
            try {
                byte[] bArr = (byte[]) kplVar.mo9517d(ivx.f32439b);
                if (bArr != null) {
                    ntw.m17717c(bArr, halAfMetadata);
                }
            } catch (RuntimeException e) {
                ((nbe) ((nbe) ((nbe) f6733a.m17252c()).mo17283h(e)).mo17276G((char) 1378)).mo17290o("Error retrieving RESULT_AF_MULTI_DEPTH_FACE_DEBLUR.");
            }
        }
        if (ivw.f32417c == null || kplVar.mo9517d(ivw.f32417c) == null) {
            zBooleanValue = false;
        } else {
            Boolean bool = (Boolean) kplVar.mo9517d(ivw.f32417c);
            bool.getClass();
            zBooleanValue = bool.booleanValue();
        }
        retrieveReferenceFlowRoi(pixelRectM4177b.f8331a, fFloatValue, fM14868g, pixelRectM4177b2.f8331a, fFloatValue2, fM14868g2, faceInfoVector.f8251a, halAfMetadata.f8287a, zBooleanValue, Build.DEVICE, pixelRect.f8331a);
        Rect rect = new Rect(pixelRect.m5063a(), pixelRect.m5064b(), GcamModuleJNI.PixelRect_x1_get(pixelRect.f8331a, pixelRect), GcamModuleJNI.PixelRect_y1_get(pixelRect.f8331a, pixelRect));
        rect.setIntersect(rect, rectMo14555h2);
        return mrm.m16829i(new RectF(rect.left / rectMo14555h2.width(), rect.top / rectMo14555h2.height(), rect.right / rectMo14555h2.width(), rect.bottom / rectMo14555h2.height()));
    }
}
