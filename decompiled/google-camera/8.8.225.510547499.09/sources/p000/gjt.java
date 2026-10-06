package p000;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.ColorSpaceTransform;
import android.hardware.camera2.params.RggbChannelVector;
import android.util.Rational;
import com.google.googlex.gcam.AwbInfo;
import com.google.googlex.gcam.FloatArray4;
import com.google.googlex.gcam.FloatArray9;
import com.google.googlex.gcam.FrameRequest;
import com.google.googlex.gcam.FrameRequestVector;
import com.google.googlex.gcam.GcamModuleJNI;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gjt {

    /* JADX INFO: renamed from: a */
    private static final Byte f25133a;

    /* JADX INFO: renamed from: b */
    private static final Byte f25134b;

    /* JADX INFO: renamed from: c */
    private final dhv f25135c;

    /* JADX INFO: renamed from: d */
    private final nta f25136d;

    /* JADX INFO: renamed from: e */
    private final boolean f25137e;

    static {
        byte b = 0;
        Byte b2 = (byte) 0;
        f25133a = b2;
        if (ivv.f32409r != null) {
            b = 3;
        } else {
            b2.byteValue();
        }
        f25134b = Byte.valueOf(b);
    }

    public gjt(dhv dhvVar, nta ntaVar, kmd kmdVar) {
        this.f25135c = dhvVar;
        this.f25136d = ntaVar;
        this.f25137e = kmdVar.mo14558k() == kmq.f36557a;
    }

    /* JADX INFO: renamed from: d */
    private final gtd m9344d(kfj kfjVar, FrameRequest frameRequest, kpp kppVar) {
        kmd kmdVarM17681e = this.f25136d.m17681e(kppVar);
        float fFrameRequest_desired_exposure_time_ms_get = GcamModuleJNI.FrameRequest_desired_exposure_time_ms_get(frameRequest.f8267a, frameRequest);
        float fFrameRequest_desired_analog_gain_get = GcamModuleJNI.FrameRequest_desired_analog_gain_get(frameRequest.f8267a, frameRequest);
        float fFrameRequest_desired_digital_gain_get = GcamModuleJNI.FrameRequest_desired_digital_gain_get(frameRequest.f8267a, frameRequest);
        gkc.m9357b(CaptureRequest.CONTROL_MODE, 1, kfjVar);
        gkc.m9357b(CaptureRequest.CONTROL_AE_MODE, 0, kfjVar);
        gkc.m9357b(CaptureRequest.SENSOR_EXPOSURE_TIME, Long.valueOf((long) (fFrameRequest_desired_exposure_time_ms_get * 1000000.0f)), kfjVar);
        gkc.m9357b(CaptureRequest.SENSOR_FRAME_DURATION, 0L, kfjVar);
        gkc.m9357b(CaptureRequest.SENSOR_SENSITIVITY, Integer.valueOf((int) (fFrameRequest_desired_digital_gain_get * fFrameRequest_desired_analog_gain_get * nta.m17670r(kmdVarM17681e)[0])), kfjVar);
        gkc.m9357b(CaptureRequest.BLACK_LEVEL_LOCK, Boolean.valueOf(GcamModuleJNI.FrameRequest_try_to_lock_black_level_get(frameRequest.f8267a, frameRequest)), kfjVar);
        long jFrameRequest_awb_get = GcamModuleJNI.FrameRequest_awb_get(frameRequest.f8267a, frameRequest);
        AwbInfo awbInfo = jFrameRequest_awb_get == 0 ? null : new AwbInfo(jFrameRequest_awb_get, false);
        if (GcamModuleJNI.AwbInfo_IsValid(awbInfo.f8229a, awbInfo)) {
            gkc.m9357b(CaptureRequest.CONTROL_AWB_MODE, 0, kfjVar);
            gkc.m9357b(CaptureRequest.COLOR_CORRECTION_MODE, 0, kfjVar);
            int[] iArrM17671s = nta.m17671s(((Integer) kmdVarM17681e.mo14561n(CameraCharacteristics.SENSOR_INFO_COLOR_FILTER_ARRANGEMENT)).intValue());
            long jAwbInfo_rggb_gains_get = GcamModuleJNI.AwbInfo_rggb_gains_get(awbInfo.f8229a, awbInfo);
            FloatArray4 floatArray4 = jAwbInfo_rggb_gains_get == 0 ? null : new FloatArray4(jAwbInfo_rggb_gains_get, false);
            gkc.m9357b(CaptureRequest.COLOR_CORRECTION_GAINS, new RggbChannelVector(floatArray4.m4941a(iArrM17671s[0]), floatArray4.m4941a(iArrM17671s[1]), floatArray4.m4941a(iArrM17671s[2]), floatArray4.m4941a(iArrM17671s[3])), kfjVar);
            long jAwbInfo_rgb2rgb_get = GcamModuleJNI.AwbInfo_rgb2rgb_get(awbInfo.f8229a, awbInfo);
            FloatArray9 floatArray9 = jAwbInfo_rgb2rgb_get == 0 ? null : new FloatArray9(jAwbInfo_rgb2rgb_get, false);
            lku.m15672z(GcamModuleJNI.FloatArray9_size(floatArray9.f8257a, floatArray9) == 9, "ccm must have length %s.", 9);
            Rational[] rationalArr = new Rational[9];
            for (int i = 0; i < 9; i++) {
                rationalArr[i] = new Rational((int) (GcamModuleJNI.FloatArray9_get(floatArray9.f8257a, floatArray9, i) * 10000.0f), 10000);
            }
            gkc.m9357b(CaptureRequest.COLOR_CORRECTION_TRANSFORM, new ColorSpaceTransform(rationalArr), kfjVar);
        }
        gkc.m9357b(CaptureRequest.STATISTICS_LENS_SHADING_MAP_MODE, 1, kfjVar);
        gkc.m9357b(CaptureRequest.STATISTICS_OIS_DATA_MODE, 1, kfjVar);
        gkc.m9357b(CaptureRequest.STATISTICS_FACE_DETECT_MODE, Integer.valueOf(ivt.f32357k != null ? 128 : kmdVarM17681e.mo14557j().f36556e), kfjVar);
        kgw kgwVarM14226g = kgw.m14226g((kgw) kfjVar);
        if (frameRequest.m4965a() == nre.f44166f || frameRequest.m4965a() == nre.f44163c || ivv.f32409r == null) {
            gmz.m9542j(this.f25135c, kgwVarM14226g);
        } else {
            kgwVarM14226g.mo14112d(ivv.f32409r, f25134b);
        }
        return new gtd(kgwVarM14226g.mo14109a(), new FrameRequest(GcamModuleJNI.new_FrameRequest__SWIG_1(frameRequest.f8267a, frameRequest), true));
    }

    /* JADX INFO: renamed from: a */
    final int m9345a() {
        if (this.f25135c.mo6184l(did.f11414Y)) {
            return 1;
        }
        return (!this.f25135c.mo6184l(dib.f11251aK) || this.f25137e) ? 0 : 2;
    }

    /* JADX INFO: renamed from: b */
    public final List m9346b(long j, kfj kfjVar, FrameRequestVector frameRequestVector, kpp kppVar, int i) {
        lku.m15613H(frameRequestVector.m4967a() >= ((long) i));
        lku.m15613H(frameRequestVector.m4967a() > 0);
        ArrayList arrayList = new ArrayList(i);
        FrameRequest frameRequestM4968b = frameRequestVector.m4968b(0);
        gtd gtdVarM9344d = m9344d(kfjVar, frameRequestM4968b, kppVar);
        arrayList.add(gtdVarM9344d);
        for (int i2 = 1; i2 < i; i2++) {
            FrameRequest frameRequestM4968b2 = frameRequestVector.m4968b(i2);
            if (!GcamModuleJNI.FrameRequest_Equals(frameRequestM4968b2.f8267a, frameRequestM4968b2, frameRequestM4968b.f8267a, frameRequestM4968b)) {
                gtdVarM9344d = m9344d(kfjVar, frameRequestM4968b2, kppVar);
                frameRequestM4968b = frameRequestM4968b2;
            }
            arrayList.add(gtdVarM9344d);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    public final void m9347c(kfj kfjVar, gau gauVar, kho khoVar, int i, int i2) {
        kfjVar.mo14110b(khoVar);
        gauVar.mo9002e(i + i2);
        kfjVar.mo14114f(new gjs(gauVar));
        kfjVar.mo14112d(CaptureRequest.CONTROL_CAPTURE_INTENT, 0);
        if (ivr.f32309a != null) {
            kfjVar.mo14112d(ivr.f32309a, Integer.valueOf(m9345a()));
        }
        if (ivu.f32384l != null) {
            kfjVar.mo14112d(ivu.f32384l, 0);
        }
    }
}
