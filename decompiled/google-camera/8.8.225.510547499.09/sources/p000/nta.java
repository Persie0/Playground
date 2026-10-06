package p000;

import android.graphics.ImageFormat;
import android.graphics.Point;
import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.params.BlackLevelPattern;
import android.hardware.camera2.params.ColorSpaceTransform;
import android.hardware.camera2.params.Face;
import android.hardware.camera2.params.LensShadingMap;
import android.hardware.camera2.params.MeteringRectangle;
import android.hardware.camera2.params.OisSample;
import android.hardware.camera2.params.RggbChannelVector;
import android.os.Build;
import android.util.Log;
import android.util.Pair;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import android.util.SizeF;
import androidx.work.impl.diagnostics.p003tK.KMNlNMe;
import androidx.work.impl.workers.NHKG.pIeXJQLZLfgIN;
import com.google.android.apps.camera.cameravisionkit.olQ.BEeWZPor;
import com.google.android.apps.camera.zoomui.view.WdNM.xPAWq;
import com.google.googlex.gcam.AeMetadata;
import com.google.googlex.gcam.AeModeResult;
import com.google.googlex.gcam.AeResults;
import com.google.googlex.gcam.AeShotParams;
import com.google.googlex.gcam.AfMetadata;
import com.google.googlex.gcam.AwbInfo;
import com.google.googlex.gcam.AwbMetadata;
import com.google.googlex.gcam.BufferUtils;
import com.google.googlex.gcam.DarkShadingData;
import com.google.googlex.gcam.DngColorCalibration;
import com.google.googlex.gcam.DngColorCalibrationVector;
import com.google.googlex.gcam.FaceInfo;
import com.google.googlex.gcam.FaceInfoVector;
import com.google.googlex.gcam.FloatArray4;
import com.google.googlex.gcam.FloatArray9;
import com.google.googlex.gcam.FloatVector;
import com.google.googlex.gcam.FrameMetadata;
import com.google.googlex.gcam.FrameMetadataKey;
import com.google.googlex.gcam.GcamModuleJNI;
import com.google.googlex.gcam.GeometricCalibration;
import com.google.googlex.gcam.GeometricCalibrationVector;
import com.google.googlex.gcam.GyroSampleVector;
import com.google.googlex.gcam.HalAfMetadata;
import com.google.googlex.gcam.IspAwbMetadata;
import com.google.googlex.gcam.LiveHdrMetadata;
import com.google.googlex.gcam.MeshTranslation;
import com.google.googlex.gcam.MeshWarp;
import com.google.googlex.gcam.NoiseModel;
import com.google.googlex.gcam.NormalizedRect;
import com.google.googlex.gcam.OisMetadata;
import com.google.googlex.gcam.OisPosition;
import com.google.googlex.gcam.OisPositionVector;
import com.google.googlex.gcam.PixelRect;
import com.google.googlex.gcam.PixelRectVector;
import com.google.googlex.gcam.PortraitMask;
import com.google.googlex.gcam.QcColorCalibration;
import com.google.googlex.gcam.QcIlluminantVector;
import com.google.googlex.gcam.SceneFlicker;
import com.google.googlex.gcam.SpatialGainMap;
import com.google.googlex.gcam.StaticMetadata;
import com.google.googlex.gcam.Uint8Vector;
import com.google.googlex.gcam.WeightedNormalizedRect;
import com.google.googlex.gcam.WeightedNormalizedRectVector;
import com.google.googlex.gcam.WeightedPixelRect;
import com.google.googlex.gcam.WeightedPixelRectVector;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import p021j$.util.Collection$EL;
import p021j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class nta {

    /* JADX INFO: renamed from: a */
    private static final String f44463a = nta.class.getSimpleName();

    /* JADX INFO: renamed from: b */
    private static final kpb f44464b = kpb.m14660a();

    /* JADX INFO: renamed from: c */
    private final kmd f44465c;

    /* JADX INFO: renamed from: d */
    private final kme f44466d;

    public nta(kmd kmdVar, kme kmeVar) {
        this.f44465c = kmdVar;
        this.f44466d = kmeVar;
        kpa.m14659a();
        lku.m15670x(true, "Android Q or higher required.");
    }

    /* JADX INFO: renamed from: A */
    private static FloatVector m17653A(float[] fArr) {
        FloatVector floatVector = new FloatVector();
        BufferUtils.setFloatVectorImpl(fArr, floatVector.f8261a);
        return floatVector;
    }

    /* JADX INFO: renamed from: B */
    private static nse m17654B(kmd kmdVar, kpp kppVar) {
        Float f;
        kmq kmqVarMo14558k = kmdVar.mo14558k();
        boolean z = kmdVar.mo14544M() && kmdVar.mo14535D();
        Integer num = (Integer) kmdVar.mo14559l(CameraCharacteristics.SENSOR_INFO_COLOR_FILTER_ARRANGEMENT);
        boolean z2 = num != null && num.intValue() == 6;
        if (z && kppVar == null) {
            return kmqVarMo14558k == kmq.BACK ? nse.f44371j : nse.f44374m;
        }
        List listMo14567t = kmdVar.mo14567t();
        if (listMo14567t.size() == 1) {
            f = (Float) listMo14567t.get(0);
        } else {
            f = kppVar != null ? (Float) kppVar.mo9517d(CaptureResult.LENS_FOCAL_LENGTH) : null;
        }
        SizeF sizeF = (SizeF) kmdVar.mo14559l(CameraCharacteristics.SENSOR_INFO_PHYSICAL_SIZE);
        Integer num2 = (Integer) kmdVar.mo14559l(CameraCharacteristics.SENSOR_ORIENTATION);
        if (kmqVarMo14558k == kmq.BACK) {
            if (z && f == null) {
                return nse.f44371j;
            }
            if (f != null && f.floatValue() >= 10.0f) {
                if (m17660H(kppVar)) {
                    return nse.f44367f;
                }
                return (!m17659G() || sizeF.getWidth() >= 4.5f) ? nse.f44366e : nse.f44368g;
            }
            if (f != null && f.floatValue() >= 3.5f && f.floatValue() < 10.0f) {
                return (!m17659G() || sizeF.getWidth() >= 6.0f) ? nse.f44363b : nse.f44365d;
            }
            if (f == null || f.floatValue() >= 3.5f) {
                return nse.f44363b;
            }
            return m17660H(kppVar) ? nse.f44370i : nse.f44369h;
        }
        if (z && f == null) {
            return nse.f44374m;
        }
        if (f != null) {
            kpb kpbVar = f44464b;
            if ((kpbVar.m14665e() && f.floatValue() < 2.1f) || ((kpbVar.f36768a && f.floatValue() < 5.0f) || ((kpbVar.f36775h || kpbVar.m14662b()) && sizeF.getWidth() > 4.5f))) {
                return nse.f44373l;
            }
        }
        if (z2) {
            return nse.f44375n;
        }
        kpb kpbVar2 = f44464b;
        return ((!kpbVar2.f36782o || sizeF.getWidth() >= 4.2f) && !(kpbVar2.f36776i && num2.intValue() == 0)) ? nse.f44372k : nse.f44376o;
    }

    /* JADX INFO: renamed from: C */
    private static nse m17655C(kmd kmdVar, kme kmeVar, kpp kppVar, kmg kmgVar) {
        if (kppVar != null) {
            kmdVar = m17676y(kmdVar, kmeVar, kppVar, kmgVar);
        }
        return m17654B(kmdVar, kppVar);
    }

    /* JADX INFO: renamed from: D */
    private static Integer m17656D(kpl kplVar) {
        Integer num = kplVar != null ? (Integer) kplVar.mo9517d(CaptureResult.CONTROL_SCENE_MODE) : null;
        return Integer.valueOf(num == null ? -1 : num.intValue());
    }

    /* JADX INFO: renamed from: E */
    private static void m17657E(MeteringRectangle[] meteringRectangleArr, boolean z, WeightedPixelRectVector weightedPixelRectVector) {
        if (meteringRectangleArr != null) {
            for (MeteringRectangle meteringRectangle : meteringRectangleArr) {
                if (z || meteringRectangle.getMeteringWeight() != 0) {
                    WeightedPixelRect weightedPixelRect = new WeightedPixelRect();
                    Rect rect = meteringRectangle.getRect();
                    long jWeightedPixelRect_rect_get = GcamModuleJNI.WeightedPixelRect_rect_get(weightedPixelRect.f8386a, weightedPixelRect);
                    PixelRect pixelRect = jWeightedPixelRect_rect_get == 0 ? null : new PixelRect(jWeightedPixelRect_rect_get, false);
                    pixelRect.m5068f(rect.left);
                    pixelRect.m5069g(rect.right);
                    pixelRect.m5070h(rect.top);
                    pixelRect.m5071i(rect.bottom);
                    GcamModuleJNI.WeightedPixelRect_weight_set(weightedPixelRect.f8386a, weightedPixelRect, meteringRectangle.getMeteringWeight());
                    GcamModuleJNI.WeightedPixelRectVector_add(weightedPixelRectVector.f8388a, weightedPixelRectVector, weightedPixelRect.f8386a, weightedPixelRect);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:78:0x01da  */
    /* JADX INFO: renamed from: F */
    private static void m17658F(kmd kmdVar, kpl kplVar, Map map, FaceInfoVector faceInfoVector) {
        float[] fArr;
        int[] iArr;
        byte[] bArr;
        float[] fArr2;
        boolean z;
        Point leftEyePosition;
        Float f;
        Face[] faceArr = (Face[]) kplVar.mo9517d(CaptureResult.STATISTICS_FACES);
        if (ivt.f32359m == null || ivt.f32360n == null || ivt.f32361o == null) {
            fArr = null;
            iArr = null;
            bArr = null;
            fArr2 = null;
        } else {
            iArr = (int[]) kplVar.mo9517d(ivt.f32359m);
            bArr = (byte[]) kplVar.mo9517d(ivt.f32360n);
            fArr2 = (float[]) kplVar.mo9517d(ivt.f32361o);
            fArr = (float[]) kplVar.mo9517d(ivt.f32363q);
        }
        if (faceArr == null) {
            return;
        }
        Rect rect = (Rect) kmdVar.mo14561n(CameraCharacteristics.SENSOR_INFO_PRE_CORRECTION_ACTIVE_ARRAY_SIZE);
        int iWidth = rect.width();
        int iHeight = rect.height();
        if (fArr != null) {
            int length = faceArr.length;
            int i = length * 3;
            int length2 = fArr.length;
            if (length2 == i) {
                z = true;
            } else {
                Log.w(f44463a, String.format("Expect 3 face pose angles for each face. Only got %d angles for %d faces in total.", Integer.valueOf(length2), Integer.valueOf(length)));
                z = false;
            }
        } else {
            z = false;
        }
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int length3 = faceArr.length;
            if (i2 >= length3) {
                return;
            }
            Face face = faceArr[i2];
            Rect bounds = face.getBounds();
            float f2 = iWidth;
            float fExactCenterX = bounds.exactCenterX() / f2;
            float f3 = iHeight;
            Face[] faceArr2 = faceArr;
            float fExactCenterY = bounds.exactCenterY() / f3;
            int iWidth2 = bounds.width() + bounds.height();
            float fMax = Math.max(iWidth, iHeight);
            int i4 = iHeight;
            float f4 = iWidth2;
            float score = face.getScore() - 1;
            int i5 = iWidth;
            if (fExactCenterX < 0.0f || fExactCenterX > 1.0f || fExactCenterY < 0.0f || fExactCenterY > 1.0f) {
                Log.w(f44463a, String.format("Face data is bad: (%d, %d) - (%d, %d), score %d", Integer.valueOf(bounds.left), Integer.valueOf(bounds.top), Integer.valueOf(bounds.right), Integer.valueOf(bounds.bottom), Integer.valueOf(face.getScore())));
            } else {
                float f5 = (f4 * 0.5f) / fMax;
                if (f5 < 0.0f || f5 > 1.0f) {
                    Log.w(f44463a, String.format("Face data is bad: (%d, %d) - (%d, %d), score %d", Integer.valueOf(bounds.left), Integer.valueOf(bounds.top), Integer.valueOf(bounds.right), Integer.valueOf(bounds.bottom), Integer.valueOf(face.getScore())));
                } else {
                    float f6 = score / 99.0f;
                    if (f6 < 0.0f || f6 > 1.0f) {
                        Log.w(f44463a, String.format("Face data is bad: (%d, %d) - (%d, %d), score %d", Integer.valueOf(bounds.left), Integer.valueOf(bounds.top), Integer.valueOf(bounds.right), Integer.valueOf(bounds.bottom), Integer.valueOf(face.getScore())));
                    } else {
                        FaceInfo faceInfo = new FaceInfo(GcamModuleJNI.new_FaceInfo__SWIG_0(), true);
                        faceInfo.m4930c(fExactCenterX);
                        faceInfo.m4931d(fExactCenterY);
                        faceInfo.m4932e(f5);
                        GcamModuleJNI.FaceInfo_confidence_set(faceInfo.f8247a, faceInfo, f6);
                        GcamModuleJNI.FaceInfo_id_set(faceInfo.f8247a, faceInfo, face.getId());
                        if (length3 <= 0 || iArr == null || iArr.length != length3) {
                            int[] iArr2 = {1, 2, 46};
                            for (int i6 = 0; i6 < 3; i6++) {
                                int i7 = iArr2[i6];
                                kmq kmqVar = kmq.f36557a;
                                int i8 = i7 - 1;
                                if (i7 == 0) {
                                    throw null;
                                }
                                switch (i8) {
                                    case 0:
                                        leftEyePosition = face.getLeftEyePosition();
                                        break;
                                    case 1:
                                        leftEyePosition = face.getRightEyePosition();
                                        break;
                                    case 45:
                                        leftEyePosition = face.getMouthPosition();
                                        break;
                                    default:
                                        leftEyePosition = null;
                                        break;
                                }
                                if (leftEyePosition != null) {
                                    FaceInfo.Landmark landmark = new FaceInfo.Landmark();
                                    landmark.m4934b(leftEyePosition.x / f2);
                                    landmark.m4935c(leftEyePosition.y / f3);
                                    faceInfo.m4928a().m5026b(i8, landmark);
                                }
                            }
                        } else {
                            if (z) {
                                int i9 = i2 * 3;
                                GcamModuleJNI.FaceInfo_tilt_angle_set(faceInfo.f8247a, faceInfo, fArr[i9]);
                                GcamModuleJNI.FaceInfo_pan_angle_set(faceInfo.f8247a, faceInfo, fArr[i9 + 1]);
                                GcamModuleJNI.FaceInfo_roll_angle_set(faceInfo.f8247a, faceInfo, fArr[i9 + 2]);
                            }
                            if (fArr2 != null && bArr != null) {
                                int i10 = 0;
                                while (true) {
                                    int i11 = iArr[i2];
                                    if (i10 < i11) {
                                        FaceInfo.Landmark landmark2 = new FaceInfo.Landmark();
                                        int i12 = i3 + i10;
                                        int i13 = i12 + i12;
                                        landmark2.m4934b(fArr2[i13] / f2);
                                        landmark2.m4935c(fArr2[i13 + 1] / f3);
                                        faceInfo.m4928a().m5026b(bArr[i12], landmark2);
                                        i10++;
                                    } else {
                                        i3 += i11;
                                    }
                                }
                            }
                        }
                        map = map;
                        if (map != null && (f = (Float) map.get(Integer.valueOf(face.getId()))) != null) {
                            GcamModuleJNI.FaceInfo_familiarity_set(faceInfo.f8247a, faceInfo, f.floatValue());
                        }
                        faceInfoVector.m4937b(faceInfo);
                    }
                }
            }
            i2++;
            faceArr = faceArr2;
            iHeight = i4;
            iWidth = i5;
        }
    }

    /* JADX INFO: renamed from: G */
    private static boolean m17659G() {
        kpb kpbVar = f44464b;
        return kpbVar.m14669i() || kpbVar.m14662b() || kpbVar.f36781n || kpbVar.f36782o;
    }

    /* JADX INFO: renamed from: H */
    private static boolean m17660H(kpl kplVar) {
        kpb kpbVar = f44464b;
        return (kpbVar.m14668h() || kpbVar.f36773f || kpbVar.m14669i() || kpbVar.m14662b() || kpbVar.f36781n || kpbVar.f36782o) && m17656D(kplVar).intValue() == 3;
    }

    /* JADX INFO: renamed from: I */
    private static byte[] m17661I(CaptureResult.Key key, kpp kppVar) {
        if (key == null) {
            return null;
        }
        try {
            return (byte[]) kppVar.mo9517d(key);
        } catch (RuntimeException e) {
            Log.e(f44463a, "Error retrieving ".concat(key.toString()), e);
            return null;
        }
    }

    /* JADX INFO: renamed from: J */
    private static float[] m17662J(kmd kmdVar, kpp kppVar) {
        float f;
        float fMax;
        Float f2 = ivv.f32410s != null ? (Float) kppVar.mo9517d(ivv.f32410s) : null;
        float fFloatValue = f2 != null ? f2.floatValue() : ((Integer) kppVar.mo9517d(CaptureResult.SENSOR_SENSITIVITY)).intValue();
        float f3 = m17670r(kmdVar)[0];
        float fM17674w = m17674w(kmdVar);
        if (fFloatValue > fM17674w) {
            f = fM17674w / f3;
            fMax = Math.max(fFloatValue / fM17674w, 1.0f);
        } else {
            f = fFloatValue / f3;
            fMax = 1.0f;
        }
        if (f < 1.0f) {
            Log.e(f44463a, String.format(Locale.ENGLISH, "Analog gain is < 1.0f for camera ID %s (physical IDs: %s). sensitivity: %f (min: %f, max analog: %f)", kmdVar.mo14556i(), kmdVar.mo14533B(), Float.valueOf(fFloatValue), Float.valueOf(f3), Float.valueOf(fM17674w)));
        }
        return new float[]{f, fMax};
    }

    /* JADX INFO: renamed from: c */
    public static long m17663c(kmd kmdVar) {
        kna knaVarM17664g = m17664g(kmdVar);
        return kmdVar.mo14554g(knaVarM17664g.f36580a, knaVarM17664g.f36581b);
    }

    /* JADX INFO: renamed from: g */
    public static kna m17664g(kmd kmdVar) {
        List listMo14571x = kmdVar.mo14571x(37);
        List listMo14571x2 = kmdVar.mo14571x(38);
        List listMo14571x3 = kmdVar.mo14571x(32);
        if (!listMo14571x.isEmpty()) {
            return new kna(37, kbd.m13914c(listMo14571x));
        }
        if (!listMo14571x2.isEmpty()) {
            return new kna(38, kbd.m13914c(listMo14571x2));
        }
        if (listMo14571x3.isEmpty()) {
            throw new IllegalArgumentException("No HDR+ compatible raw format supported.");
        }
        return new kna(32, kbd.m13914c(listMo14571x3));
    }

    /* JADX INFO: renamed from: h */
    public static kpp m17665h(kpp kppVar, String str) {
        Map mapMo9520g = kppVar.mo9520g();
        if (mapMo9520g.isEmpty()) {
            return kppVar;
        }
        kpl kplVar = (kpl) mapMo9520g.get(str);
        if (kplVar != null) {
            return new kpo(kplVar);
        }
        Log.w(f44463a, "Physical metadata is null for images from camera ".concat(String.valueOf(str)));
        return kppVar;
    }

    /* JADX INFO: renamed from: i */
    public static AwbInfo m17666i(kpp kppVar, kmd kmdVar) {
        FloatArray9 floatArray9M17677z;
        kpb kpbVar = f44464b;
        if (!kpbVar.f36770c && !kpbVar.m14668h() && !kpbVar.f36773f) {
            kppVar = m17665h(kppVar, kmdVar.mo14556i().f36540a);
        }
        AwbInfo awbInfo = new AwbInfo(GcamModuleJNI.new_AwbInfo__SWIG_0(), true);
        int[] iArrM17671s = m17671s(((Integer) kmdVar.mo14561n(CameraCharacteristics.SENSOR_INFO_COLOR_FILTER_ARRANGEMENT)).intValue());
        FloatArray4 floatArray4 = new FloatArray4();
        RggbChannelVector rggbChannelVector = (RggbChannelVector) kppVar.mo9517d(CaptureResult.COLOR_CORRECTION_GAINS);
        if (rggbChannelVector == null) {
            Log.w(f44463a, "CaptureResult missing COLOR_CORRECTION_GAINS.");
            for (int i = 0; i < 4; i++) {
                floatArray4.m4944d(i, 1.0f);
            }
        } else {
            for (int i2 = 0; i2 < 4; i2++) {
                floatArray4.m4944d(i2, rggbChannelVector.getComponent(iArrM17671s[i2]));
            }
        }
        GcamModuleJNI.AwbInfo_rggb_gains_set(awbInfo.f8229a, awbInfo, floatArray4.f8255a, floatArray4);
        ColorSpaceTransform colorSpaceTransform = (ColorSpaceTransform) kppVar.mo9517d(CaptureResult.COLOR_CORRECTION_TRANSFORM);
        if (colorSpaceTransform == null) {
            Log.w(f44463a, "CaptureResult missing COLOR_CORRECTION_TRANSFORM.");
            FloatArray9 floatArray9 = new FloatArray9();
            floatArray9.m4946b(0, 1.0f);
            floatArray9.m4946b(1, 0.0f);
            floatArray9.m4946b(2, 0.0f);
            floatArray9.m4946b(3, 0.0f);
            floatArray9.m4946b(4, 1.0f);
            floatArray9.m4946b(5, 0.0f);
            floatArray9.m4946b(6, 0.0f);
            floatArray9.m4946b(7, 0.0f);
            floatArray9.m4946b(8, 1.0f);
            floatArray9M17677z = floatArray9;
        } else {
            floatArray9M17677z = m17677z(colorSpaceTransform);
        }
        GcamModuleJNI.AwbInfo_rgb2rgb_set(awbInfo.f8229a, awbInfo, floatArray9M17677z.f8257a, floatArray9M17677z);
        return awbInfo;
    }

    /* JADX INFO: renamed from: l */
    public static MeshWarp m17667l(Rect rect, kpl kplVar) {
        CaptureResult.Key key;
        MeshWarp meshWarp = new MeshWarp(GcamModuleJNI.new_MeshWarp(), true);
        if (ivu.f32380h != null && ivu.f32378f != null && ivu.f32379g != null && ((key = ivu.f32381i) == null || kplVar.mo9517d(key) == null || !((Boolean) kplVar.mo9517d(ivu.f32381i)).booleanValue())) {
            float[] fArr = (float[]) kplVar.mo9517d(ivu.f32380h);
            int[] iArr = (int[]) kplVar.mo9517d(ivu.f32378f);
            int[] iArr2 = (int[]) kplVar.mo9517d(ivu.f32379g);
            if (fArr != null && iArr != null && iArr.length == 2 && iArr2 != null && iArr2.length == 4) {
                int i = iArr[0] * iArr[1];
                int length = fArr.length;
                if (length == i + i) {
                    FloatVector floatVectorM17653A = m17653A(fArr);
                    GcamModuleJNI.MeshWarp_mesh_warp_data_set(meshWarp.f8318a, meshWarp, floatVectorM17653A.f8261a, floatVectorM17653A);
                    GcamModuleJNI.MeshWarp_grid_cols_set(meshWarp.f8318a, meshWarp, iArr[0]);
                    GcamModuleJNI.MeshWarp_grid_rows_set(meshWarp.f8318a, meshWarp, iArr[1]);
                    PixelRect pixelRect = new PixelRect();
                    pixelRect.m5068f(iArr2[0]);
                    pixelRect.m5070h(iArr2[1]);
                    pixelRect.m5069g(iArr2[0] + iArr2[2]);
                    pixelRect.m5071i(iArr2[1] + iArr2[3]);
                    GcamModuleJNI.MeshWarp_mesh_warp_crop_region_set(meshWarp.f8318a, meshWarp, pixelRect.f8331a, pixelRect);
                    lku.m15607B(!rect.isEmpty(), "Invalid physical scaler crop region: %s", rect);
                    PixelRect pixelRect2 = new PixelRect();
                    pixelRect2.m5068f(rect.left);
                    pixelRect2.m5069g(rect.right);
                    pixelRect2.m5070h(rect.top);
                    pixelRect2.m5071i(rect.bottom);
                    GcamModuleJNI.MeshWarp_mesh_warp_dst_region_set(meshWarp.f8318a, meshWarp, pixelRect2.f8331a, pixelRect2);
                    if (ivx.f32446i != null && kplVar.mo9517d(ivx.f32446i) != null) {
                        GcamModuleJNI.MeshWarp_is_forward_mesh_set(meshWarp.f8318a, meshWarp, ((Boolean) kplVar.mo9517d(ivx.f32446i)).booleanValue());
                    }
                } else {
                    Log.e(f44463a, String.format("Mesh data length (%d) and grid dimension (%dx%dx2) mismatch.", Integer.valueOf(length), Integer.valueOf(iArr[0]), Integer.valueOf(iArr[1])));
                }
            }
        }
        return meshWarp;
    }

    /* JADX INFO: renamed from: m */
    public static nse m17668m(kmd kmdVar) {
        return m17654B(kmdVar, null);
    }

    /* JADX INFO: renamed from: p */
    public static void m17669p(kmd kmdVar, kpl kplVar, FaceInfoVector faceInfoVector) {
        m17658F(kmdVar, kplVar, null, faceInfoVector);
    }

    /* JADX INFO: renamed from: r */
    public static float[] m17670r(kmd kmdVar) {
        float[] fArr;
        if (ivw.f32426l != null && (fArr = (float[]) kmdVar.mo14559l(ivw.f32426l)) != null) {
            return fArr;
        }
        Range range = (Range) kmdVar.mo14561n(CameraCharacteristics.SENSOR_INFO_SENSITIVITY_RANGE);
        return new float[]{((Integer) range.getLower()).intValue(), ((Integer) range.getUpper()).intValue()};
    }

    /* JADX INFO: renamed from: s */
    public static int[] m17671s(int i) {
        switch (i) {
            case 0:
            case 1:
                return new int[]{0, 1, 2, 3};
            case 2:
            case 3:
                return new int[]{0, 2, 1, 3};
            default:
                throw new IllegalArgumentException("CameraCharacteristics: unsupported colorFilterArrangment");
        }
    }

    /* JADX INFO: renamed from: t */
    public static StaticMetadata m17672t(kmd kmdVar) {
        nrd nrdVar;
        Float fValueOf;
        QcColorCalibration qcColorCalibration;
        StaticMetadata staticMetadata = new StaticMetadata();
        GcamModuleJNI.StaticMetadata_make_set(staticMetadata.f8364a, staticMetadata, Build.MANUFACTURER);
        GcamModuleJNI.StaticMetadata_model_set(staticMetadata.f8364a, staticMetadata, Build.MODEL);
        GcamModuleJNI.StaticMetadata_device_set(staticMetadata.f8364a, staticMetadata, Build.DEVICE);
        String strM14249o = kpc.f36794a.m14249o("ro.revision");
        if (strM14249o != null && !strM14249o.isEmpty()) {
            GcamModuleJNI.StaticMetadata_hardware_revision_set(staticMetadata.f8364a, staticMetadata, strM14249o);
        }
        GcamModuleJNI.StaticMetadata_software_set(staticMetadata.f8364a, staticMetadata, "HDR+ ".concat(String.valueOf(GcamModuleJNI.GetVersion())));
        GcamModuleJNI.StaticMetadata_device_os_version_set(staticMetadata.f8364a, staticMetadata, Build.FINGERPRINT);
        GcamModuleJNI.StaticMetadata_device_os_unix_ms_set(staticMetadata.f8364a, staticMetadata, Build.TIME);
        staticMetadata.m5124g(m17668m(kmdVar));
        GcamModuleJNI.StaticMetadata_has_flash_set(staticMetadata.f8364a, staticMetadata, kmdVar.mo14540I());
        kmq kmqVarMo14558k = kmdVar.mo14558k();
        nrp nrpVar = nrp.f44267a;
        kmq kmqVar = kmq.f36557a;
        switch (kmqVarMo14558k) {
            case f36557a:
                nrpVar = nrp.f44268b;
                break;
            case BACK:
                nrpVar = nrp.f44269c;
                break;
            case EXTERNAL:
                nrpVar = nrp.f44270d;
                break;
        }
        GcamModuleJNI.StaticMetadata_lens_facing_set(staticMetadata.f8364a, staticMetadata, nrpVar.f44272f);
        List listMo14565r = kmdVar.mo14565r();
        lku.m15670x(!listMo14565r.isEmpty(), KMNlNMe.CnARmydRueOtU);
        FloatVector floatVector = new FloatVector();
        Iterator it = listMo14565r.iterator();
        while (it.hasNext()) {
            floatVector.m4949b(((Float) it.next()).floatValue());
        }
        GcamModuleJNI.StaticMetadata_available_focal_lengths_mm_set(staticMetadata.f8364a, staticMetadata, floatVector.f8261a, floatVector);
        float[] fArr = (float[]) kmdVar.mo14561n(CameraCharacteristics.LENS_INFO_AVAILABLE_APERTURES);
        lku.m15670x(fArr.length > 0, "Cameras must have at least one f-number (aperture size).");
        FloatVector floatVectorM17653A = m17653A(fArr);
        GcamModuleJNI.StaticMetadata_available_f_numbers_set(staticMetadata.f8364a, staticMetadata, floatVectorM17653A.f8261a, floatVectorM17653A);
        GcamModuleJNI.StaticMetadata_white_level_set(staticMetadata.f8364a, staticMetadata, ((Integer) kmdVar.mo14559l(CameraCharacteristics.SENSOR_INFO_WHITE_LEVEL)).intValue());
        Rect[] rectArr = (Rect[]) kmdVar.mo14559l(CameraCharacteristics.SENSOR_OPTICAL_BLACK_REGIONS);
        if (rectArr != null) {
            PixelRectVector pixelRectVector = new PixelRectVector();
            for (Rect rect : rectArr) {
                PixelRect pixelRect = new PixelRect();
                pixelRect.m5068f(rect.left);
                pixelRect.m5069g(rect.right);
                pixelRect.m5070h(rect.top);
                pixelRect.m5071i(rect.bottom);
                pixelRectVector.m5072a(pixelRect);
            }
            GcamModuleJNI.StaticMetadata_optically_black_regions_set(staticMetadata.f8364a, staticMetadata, pixelRectVector.f8333a, pixelRectVector);
        }
        int iIntValue = ((Integer) kmdVar.mo14561n(CameraCharacteristics.SENSOR_INFO_COLOR_FILTER_ARRANGEMENT)).intValue();
        switch (iIntValue) {
            case 0:
                nrdVar = nrd.f44154b;
                break;
            case 1:
                nrdVar = nrd.f44156d;
                break;
            case 2:
                nrdVar = nrd.f44157e;
                break;
            case 3:
                nrdVar = nrd.f44155c;
                break;
            default:
                Log.w(f44463a, "convertToBayerPattern: unsupported color filter arrangement: " + iIntValue + ", returning kInvalid.");
                nrdVar = nrd.f44153a;
                break;
        }
        GcamModuleJNI.StaticMetadata_bayer_pattern_set(staticMetadata.f8364a, staticMetadata, nrdVar.f44159f);
        long jLongValue = ((Long) ((Range) kmdVar.mo14561n(CameraCharacteristics.SENSOR_INFO_EXPOSURE_TIME_RANGE)).getUpper()).longValue();
        float[] fArr2 = {m17675x(new long[]{((Long) ((Range) kmdVar.mo14561n(CameraCharacteristics.SENSOR_INFO_EXPOSURE_TIME_RANGE)).getLower()).longValue(), jLongValue}[0]), m17675x(jLongValue)};
        if (kmdVar.mo14558k() != kmq.BACK) {
            fValueOf = null;
        } else {
            kpb kpbVar = f44464b;
            if (kpbVar.f36770c || kpbVar.m14668h() || kpbVar.f36773f || kpbVar.m14669i() || kpbVar.f36777j || kpbVar.m14662b() || kpbVar.f36781n || kpbVar.f36782o) {
                nse nseVarM17668m = m17668m(kmdVar);
                fValueOf = (nseVarM17668m == nse.f44363b || nseVarM17668m == nse.f44365d) ? Float.valueOf(32000.0f) : (nseVarM17668m == nse.f44366e || nseVarM17668m == nse.f44368g || nseVarM17668m == nse.f44371j || nseVarM17668m == nse.f44369h) ? Float.valueOf(24000.0f) : null;
            } else {
                fValueOf = null;
            }
        }
        if (fValueOf != null) {
            fArr2[1] = Math.max(fValueOf.floatValue(), fArr2[0]);
        }
        GcamModuleJNI.StaticMetadata_exposure_time_range_ms_set(staticMetadata.f8364a, staticMetadata, fArr2);
        float[] fArrM17670r = m17670r(kmdVar);
        float fM17674w = m17674w(kmdVar);
        GcamModuleJNI.StaticMetadata_iso_range_set(staticMetadata.f8364a, staticMetadata, fArrM17670r);
        GcamModuleJNI.StaticMetadata_max_analog_iso_set(staticMetadata.f8364a, staticMetadata, fM17674w);
        DngColorCalibrationVector dngColorCalibrationVector = new DngColorCalibrationVector();
        Integer num = (Integer) kmdVar.mo14559l(CameraCharacteristics.SENSOR_REFERENCE_ILLUMINANT1);
        if (num != null) {
            FloatArray9 floatArray9M17677z = m17677z((ColorSpaceTransform) kmdVar.mo14561n(CameraCharacteristics.SENSOR_COLOR_TRANSFORM1));
            FloatArray9 floatArray9M17677z2 = m17677z((ColorSpaceTransform) kmdVar.mo14561n(CameraCharacteristics.SENSOR_CALIBRATION_TRANSFORM1));
            DngColorCalibration dngColorCalibration = new DngColorCalibration();
            dngColorCalibration.m4923b(nrh.m17631a(num.intValue()));
            dngColorCalibration.m4925d(floatArray9M17677z);
            dngColorCalibration.m4924c(floatArray9M17677z2);
            dngColorCalibrationVector.m4926a(dngColorCalibration);
        }
        Byte b = (Byte) kmdVar.mo14559l(CameraCharacteristics.SENSOR_REFERENCE_ILLUMINANT2);
        if (b != null) {
            FloatArray9 floatArray9M17677z3 = m17677z((ColorSpaceTransform) kmdVar.mo14561n(CameraCharacteristics.SENSOR_COLOR_TRANSFORM2));
            FloatArray9 floatArray9M17677z4 = m17677z((ColorSpaceTransform) kmdVar.mo14561n(CameraCharacteristics.SENSOR_CALIBRATION_TRANSFORM2));
            DngColorCalibration dngColorCalibration2 = new DngColorCalibration();
            dngColorCalibration2.m4923b(nrh.m17631a(b.byteValue()));
            dngColorCalibration2.m4925d(floatArray9M17677z3);
            dngColorCalibration2.m4924c(floatArray9M17677z4);
            dngColorCalibrationVector.m4926a(dngColorCalibration2);
        }
        GcamModuleJNI.StaticMetadata_dng_color_calibration_set(staticMetadata.f8364a, staticMetadata, dngColorCalibrationVector.f8245a, dngColorCalibrationVector);
        QcColorCalibration qcColorCalibration2 = new QcColorCalibration();
        try {
            if (ivs.f32331k != null) {
                Integer num2 = (Integer) kmdVar.mo14559l(ivs.f32331k);
                if (num2 == null) {
                    Log.w(f44463a, "The EEPROM_WB_CALIB is not available");
                    qcColorCalibration2 = new QcColorCalibration();
                } else {
                    int iIntValue2 = num2.intValue();
                    String.format("EEPROM_WB_CALIB is available, found %d illuminants", Integer.valueOf(iIntValue2));
                    if (iIntValue2 > 0) {
                        float[] fArr3 = (float[]) kmdVar.mo14561n(ivs.f32332l);
                        float[] fArr4 = (float[]) kmdVar.mo14561n(ivs.f32333m);
                        if (fArr3.length == iIntValue2 && fArr4.length == iIntValue2) {
                            QcIlluminantVector qcIlluminantVector = new QcIlluminantVector();
                            for (int i = 0; i < iIntValue2; i++) {
                                QcColorCalibration.IlluminantData illuminantData = new QcColorCalibration.IlluminantData();
                                GcamModuleJNI.QcColorCalibration_IlluminantData_rg_ratio_set(illuminantData.f8345a, illuminantData, fArr3[i]);
                                GcamModuleJNI.QcColorCalibration_IlluminantData_bg_ratio_set(illuminantData.f8345a, illuminantData, fArr4[i]);
                                GcamModuleJNI.QcIlluminantVector_add(qcIlluminantVector.f8347a, qcIlluminantVector, illuminantData.f8345a, illuminantData);
                            }
                            GcamModuleJNI.QcColorCalibration_illuminant_data_set(qcColorCalibration2.f8343a, qcColorCalibration2, qcIlluminantVector.f8347a, qcIlluminantVector);
                            CameraCharacteristics.Key key = ivs.f32334n;
                            if (key != null) {
                                qcColorCalibration2.m5087b(((Float) kmdVar.mo14561n(key)).floatValue());
                            } else {
                                Log.w(f44463a, "EEPROM_WB_CALIB_GR_OVER_GB_RATIO is not available. Setting the value to 1.0f.");
                                qcColorCalibration2.m5087b(1.0f);
                            }
                        } else {
                            Log.w(f44463a, "The r/g and b/g ratio data is corrupted");
                            qcColorCalibration = new QcColorCalibration();
                        }
                    } else {
                        Log.w(f44463a, "EEPROM_WB_CALIB available, but has no calibrated illuminants");
                        qcColorCalibration = new QcColorCalibration();
                    }
                }
                qcColorCalibration = qcColorCalibration2;
            } else {
                Log.w(f44463a, "EEPROM_WB_CALIB is not available");
                qcColorCalibration = new QcColorCalibration();
            }
        } catch (IllegalArgumentException e) {
            Log.w(f44463a, "EEPROM_WB keys do not exist");
            qcColorCalibration = new QcColorCalibration();
        }
        GcamModuleJNI.StaticMetadata_qc_color_calibration_set(staticMetadata.f8364a, staticMetadata, qcColorCalibration.f8343a, qcColorCalibration);
        SizeF sizeF = (SizeF) kmdVar.mo14561n(CameraCharacteristics.SENSOR_INFO_PHYSICAL_SIZE);
        GcamModuleJNI.StaticMetadata_sensor_physical_width_mm_set(staticMetadata.f8364a, staticMetadata, sizeF.getWidth());
        GcamModuleJNI.StaticMetadata_sensor_physical_height_mm_set(staticMetadata.f8364a, staticMetadata, sizeF.getHeight());
        Size size = (Size) kmdVar.mo14561n(CameraCharacteristics.SENSOR_INFO_PIXEL_ARRAY_SIZE);
        GcamModuleJNI.StaticMetadata_pixel_array_width_set(staticMetadata.f8364a, staticMetadata, size.getWidth());
        GcamModuleJNI.StaticMetadata_pixel_array_height_set(staticMetadata.f8364a, staticMetadata, size.getHeight());
        Rect rect2 = (Rect) kmdVar.mo14561n(CameraCharacteristics.SENSOR_INFO_PRE_CORRECTION_ACTIVE_ARRAY_SIZE);
        PixelRect pixelRect2 = new PixelRect();
        pixelRect2.m5068f(rect2.left);
        pixelRect2.m5069g(rect2.right);
        pixelRect2.m5070h(rect2.top);
        pixelRect2.m5071i(rect2.bottom);
        GcamModuleJNI.StaticMetadata_active_area_set(staticMetadata.f8364a, staticMetadata, pixelRect2.f8331a, pixelRect2);
        kna knaVarM17664g = m17664g(kmdVar);
        GcamModuleJNI.StaticMetadata_frame_raw_max_width_set(staticMetadata.f8364a, staticMetadata, knaVarM17664g.f36581b.f35517a);
        staticMetadata.m5123f(knaVarM17664g.f36581b.f35518b);
        GcamModuleJNI.StaticMetadata_raw_bits_per_pixel_set(staticMetadata.f8364a, staticMetadata, ImageFormat.getBitsPerPixel(knaVarM17664g.f36580a));
        GcamModuleJNI.StaticMetadata_frame_readout_time_ms_set(staticMetadata.f8364a, staticMetadata, m17675x(m17663c(kmdVar)));
        for (int i2 : (int[]) kmdVar.mo14561n(CameraCharacteristics.LENS_INFO_AVAILABLE_OPTICAL_STABILIZATION)) {
            if (i2 == 1) {
                GcamModuleJNI.StaticMetadata_has_ois_set(staticMetadata.f8364a, staticMetadata, true);
            }
        }
        byte[] bArr = ivx.f32449l != null ? (byte[]) kmdVar.mo14559l(ivx.f32449l) : null;
        if (bArr != null) {
            long jStaticMetadata_dark_shading_data_get = GcamModuleJNI.StaticMetadata_dark_shading_data_get(staticMetadata.f8364a, staticMetadata);
            DarkShadingData darkShadingData = jStaticMetadata_dark_shading_data_get == 0 ? null : new DarkShadingData(jStaticMetadata_dark_shading_data_get);
            ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(bArr.length).order(ByteOrder.nativeOrder());
            byteBufferOrder.put(bArr);
            if (!GcamModuleJNI.DarkShadingData_SetDarkShadingDataFromBytes(darkShadingData.f8238a, darkShadingData, nsd.m17642a(new nsd(BufferUtils.m4902a(byteBufferOrder))), byteBufferOrder.capacity())) {
                Log.w(f44463a, "2D BLC data size does not meet expected length or it is empty.");
            }
        }
        return staticMetadata;
    }

    /* JADX INFO: renamed from: v */
    private static float m17673v(kpl kplVar) {
        return m17675x(((Long) kplVar.mo9517d(CaptureResult.SENSOR_EXPOSURE_TIME)).longValue());
    }

    /* JADX INFO: renamed from: w */
    private static float m17674w(kmd kmdVar) {
        Float f;
        return (ivw.f32427m == null || (f = (Float) kmdVar.mo14559l(ivw.f32427m)) == null) ? ((Integer) kmdVar.mo14561n(CameraCharacteristics.SENSOR_MAX_ANALOG_SENSITIVITY)).intValue() : f.floatValue();
    }

    /* JADX INFO: renamed from: x */
    private static float m17675x(long j) {
        return j / 1000000.0f;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00f3  */
    /* JADX INFO: renamed from: y */
    private static kmd m17676y(kmd kmdVar, kme kmeVar, kpp kppVar, kmg kmgVar) {
        Float f;
        kpl kplVar;
        if (kmgVar != null && kmdVar.mo14533B().contains(kmgVar)) {
            return kmeVar.mo13854a(kmgVar);
        }
        if (!kmdVar.mo14544M() || !kmdVar.mo14535D()) {
            return kmdVar;
        }
        Set<kmg> setMo14533B = kmdVar.mo14533B();
        if (setMo14533B.size() == 1) {
            return kmeVar.mo13854a((kmg) setMo14533B.iterator().next());
        }
        Map mapMo9520g = kppVar.mo9520g();
        String strMo9518e = (!mapMo9520g.isEmpty() || f44464b.m14665e()) ? ((mzw) mapMo9520g).f41872c == 1 ? ((kpl) Collection$EL.stream(((mwx) mapMo9520g).values()).findFirst().get()).mo9518e() : null : kppVar.mo9518e();
        if (strMo9518e != null) {
            for (kmg kmgVar2 : setMo14533B) {
                if (strMo9518e.equals(kmgVar2.f36540a)) {
                    return kmeVar.mo13854a(kmgVar2);
                }
            }
            Log.e(f44463a, String.format("Physical camera ID not found: %s in %s", strMo9518e, setMo14533B));
            throw new IllegalArgumentException("Physical camera with matching ID not found: ".concat(strMo9518e));
        }
        Map mapMo9520g2 = kppVar.mo9520g();
        if (mapMo9520g2.isEmpty()) {
            f = (Float) kppVar.mo9517d(CaptureResult.LENS_FOCAL_LENGTH);
        } else if (kmgVar != null && (kplVar = (kpl) mapMo9520g2.get(kmgVar.f36540a)) != null) {
            f = (Float) kplVar.mo9517d(CaptureResult.LENS_FOCAL_LENGTH);
        } else if (((mzw) mapMo9520g2).f41872c == 1) {
            f = (Float) ((kpl) Collection$EL.stream(((mwx) mapMo9520g2).values()).findFirst().get()).mo9517d(CaptureResult.LENS_FOCAL_LENGTH);
        } else {
            f = (Float) kppVar.mo9517d(CaptureResult.LENS_FOCAL_LENGTH);
        }
        f.getClass();
        Iterator it = setMo14533B.iterator();
        while (it.hasNext()) {
            kmd kmdVarMo13854a = kmeVar.mo13854a((kmg) it.next());
            List listMo14565r = kmdVarMo13854a.mo14565r();
            lku.m15670x(listMo14565r.size() == 1, "Physical cameras must have single focal length.");
            if (f.floatValue() == ((Float) listMo14565r.get(0)).floatValue()) {
                return kmdVarMo13854a;
            }
        }
        throw new IllegalArgumentException("Physical camera with matching focal length not found.");
    }

    /* JADX INFO: renamed from: z */
    private static FloatArray9 m17677z(ColorSpaceTransform colorSpaceTransform) {
        Rational[] rationalArr = new Rational[9];
        colorSpaceTransform.copyElements(rationalArr, 0);
        FloatArray9 floatArray9 = new FloatArray9();
        for (int i = 0; i < 9; i++) {
            floatArray9.m4946b(i, rationalArr[i].floatValue());
        }
        return floatArray9;
    }

    /* JADX INFO: renamed from: a */
    public final float m17678a(int i) {
        Rational rational = (Rational) this.f44465c.mo14561n(CameraCharacteristics.CONTROL_AE_COMPENSATION_STEP);
        return new Rational(i * rational.getNumerator(), rational.getDenominator()).floatValue();
    }

    /* JADX INFO: renamed from: b */
    public final float m17679b(kpp kppVar) {
        float[] fArrM17687q = m17687q(kppVar);
        return fArrM17687q[0] * fArrM17687q[1] * fArrM17687q[2];
    }

    /* JADX INFO: renamed from: d */
    public final long m17680d(kpp kppVar) {
        return m17663c(m17681e(kppVar));
    }

    /* JADX INFO: renamed from: e */
    public final kmd m17681e(kpp kppVar) {
        return m17676y(this.f44465c, this.f44466d, kppVar, null);
    }

    /* JADX INFO: renamed from: f */
    public final kmd m17682f(kpp kppVar, kmg kmgVar) {
        return m17676y(this.f44465c, this.f44466d, kppVar, kmgVar);
    }

    /* JADX WARN: Code duplicated, block: B:116:0x0348 A[Catch: RuntimeException -> 0x0330, TRY_ENTER, TRY_LEAVE, TryCatch #20 {RuntimeException -> 0x0330, blocks: (B:71:0x022c, B:116:0x0348, B:121:0x0366, B:128:0x03a1, B:130:0x03ab, B:132:0x03b5, B:134:0x03bf, B:152:0x0400, B:154:0x0404, B:156:0x0408, B:158:0x040c, B:160:0x0410, B:166:0x0442, B:141:0x03db, B:143:0x03e0, B:145:0x03e5, B:147:0x03ec), top: B:487:0x022c }] */
    /* JADX WARN: Code duplicated, block: B:118:0x0359  */
    /* JADX WARN: Code duplicated, block: B:121:0x0366 A[Catch: RuntimeException -> 0x0330, TRY_ENTER, TRY_LEAVE, TryCatch #20 {RuntimeException -> 0x0330, blocks: (B:71:0x022c, B:116:0x0348, B:121:0x0366, B:128:0x03a1, B:130:0x03ab, B:132:0x03b5, B:134:0x03bf, B:152:0x0400, B:154:0x0404, B:156:0x0408, B:158:0x040c, B:160:0x0410, B:166:0x0442, B:141:0x03db, B:143:0x03e0, B:145:0x03e5, B:147:0x03ec), top: B:487:0x022c }] */
    /* JADX WARN: Code duplicated, block: B:125:0x0370 A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Code duplicated, block: B:128:0x03a1 A[Catch: RuntimeException -> 0x0330, TRY_ENTER, TryCatch #20 {RuntimeException -> 0x0330, blocks: (B:71:0x022c, B:116:0x0348, B:121:0x0366, B:128:0x03a1, B:130:0x03ab, B:132:0x03b5, B:134:0x03bf, B:152:0x0400, B:154:0x0404, B:156:0x0408, B:158:0x040c, B:160:0x0410, B:166:0x0442, B:141:0x03db, B:143:0x03e0, B:145:0x03e5, B:147:0x03ec), top: B:487:0x022c }] */
    /* JADX WARN: Code duplicated, block: B:130:0x03ab A[Catch: RuntimeException -> 0x0330, TryCatch #20 {RuntimeException -> 0x0330, blocks: (B:71:0x022c, B:116:0x0348, B:121:0x0366, B:128:0x03a1, B:130:0x03ab, B:132:0x03b5, B:134:0x03bf, B:152:0x0400, B:154:0x0404, B:156:0x0408, B:158:0x040c, B:160:0x0410, B:166:0x0442, B:141:0x03db, B:143:0x03e0, B:145:0x03e5, B:147:0x03ec), top: B:487:0x022c }] */
    /* JADX WARN: Code duplicated, block: B:132:0x03b5 A[Catch: RuntimeException -> 0x0330, TryCatch #20 {RuntimeException -> 0x0330, blocks: (B:71:0x022c, B:116:0x0348, B:121:0x0366, B:128:0x03a1, B:130:0x03ab, B:132:0x03b5, B:134:0x03bf, B:152:0x0400, B:154:0x0404, B:156:0x0408, B:158:0x040c, B:160:0x0410, B:166:0x0442, B:141:0x03db, B:143:0x03e0, B:145:0x03e5, B:147:0x03ec), top: B:487:0x022c }] */
    /* JADX WARN: Code duplicated, block: B:134:0x03bf A[Catch: RuntimeException -> 0x0330, TRY_LEAVE, TryCatch #20 {RuntimeException -> 0x0330, blocks: (B:71:0x022c, B:116:0x0348, B:121:0x0366, B:128:0x03a1, B:130:0x03ab, B:132:0x03b5, B:134:0x03bf, B:152:0x0400, B:154:0x0404, B:156:0x0408, B:158:0x040c, B:160:0x0410, B:166:0x0442, B:141:0x03db, B:143:0x03e0, B:145:0x03e5, B:147:0x03ec), top: B:487:0x022c }] */
    /* JADX WARN: Code duplicated, block: B:136:0x03c9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:139:0x03cf A[Catch: RuntimeException -> 0x0ba9, TRY_ENTER, TRY_LEAVE, TryCatch #24 {RuntimeException -> 0x0ba9, blocks: (B:68:0x0206, B:112:0x0336, B:113:0x033a, B:119:0x035e, B:126:0x0371, B:149:0x03f4, B:170:0x04e6, B:139:0x03cf, B:148:0x03f1), top: B:494:0x0206 }] */
    /* JADX WARN: Code duplicated, block: B:141:0x03db A[Catch: RuntimeException -> 0x0330, TRY_ENTER, TryCatch #20 {RuntimeException -> 0x0330, blocks: (B:71:0x022c, B:116:0x0348, B:121:0x0366, B:128:0x03a1, B:130:0x03ab, B:132:0x03b5, B:134:0x03bf, B:152:0x0400, B:154:0x0404, B:156:0x0408, B:158:0x040c, B:160:0x0410, B:166:0x0442, B:141:0x03db, B:143:0x03e0, B:145:0x03e5, B:147:0x03ec), top: B:487:0x022c }] */
    /* JADX WARN: Code duplicated, block: B:143:0x03e0 A[Catch: RuntimeException -> 0x0330, TryCatch #20 {RuntimeException -> 0x0330, blocks: (B:71:0x022c, B:116:0x0348, B:121:0x0366, B:128:0x03a1, B:130:0x03ab, B:132:0x03b5, B:134:0x03bf, B:152:0x0400, B:154:0x0404, B:156:0x0408, B:158:0x040c, B:160:0x0410, B:166:0x0442, B:141:0x03db, B:143:0x03e0, B:145:0x03e5, B:147:0x03ec), top: B:487:0x022c }] */
    /* JADX WARN: Code duplicated, block: B:145:0x03e5 A[Catch: RuntimeException -> 0x0330, TryCatch #20 {RuntimeException -> 0x0330, blocks: (B:71:0x022c, B:116:0x0348, B:121:0x0366, B:128:0x03a1, B:130:0x03ab, B:132:0x03b5, B:134:0x03bf, B:152:0x0400, B:154:0x0404, B:156:0x0408, B:158:0x040c, B:160:0x0410, B:166:0x0442, B:141:0x03db, B:143:0x03e0, B:145:0x03e5, B:147:0x03ec), top: B:487:0x022c }] */
    /* JADX WARN: Code duplicated, block: B:147:0x03ec A[Catch: RuntimeException -> 0x0330, TRY_LEAVE, TryCatch #20 {RuntimeException -> 0x0330, blocks: (B:71:0x022c, B:116:0x0348, B:121:0x0366, B:128:0x03a1, B:130:0x03ab, B:132:0x03b5, B:134:0x03bf, B:152:0x0400, B:154:0x0404, B:156:0x0408, B:158:0x040c, B:160:0x0410, B:166:0x0442, B:141:0x03db, B:143:0x03e0, B:145:0x03e5, B:147:0x03ec), top: B:487:0x022c }] */
    /* JADX WARN: Code duplicated, block: B:152:0x0400 A[Catch: RuntimeException -> 0x0330, TRY_ENTER, TryCatch #20 {RuntimeException -> 0x0330, blocks: (B:71:0x022c, B:116:0x0348, B:121:0x0366, B:128:0x03a1, B:130:0x03ab, B:132:0x03b5, B:134:0x03bf, B:152:0x0400, B:154:0x0404, B:156:0x0408, B:158:0x040c, B:160:0x0410, B:166:0x0442, B:141:0x03db, B:143:0x03e0, B:145:0x03e5, B:147:0x03ec), top: B:487:0x022c }] */
    /* JADX WARN: Code duplicated, block: B:169:0x04e1  */
    /* JADX WARN: Code duplicated, block: B:174:0x0510  */
    /* JADX WARN: Code duplicated, block: B:181:0x051f A[Catch: RuntimeException -> 0x0bbf, TRY_ENTER, TryCatch #30 {RuntimeException -> 0x0bbf, blocks: (B:4:0x000f, B:12:0x0021, B:171:0x04f2, B:225:0x064b, B:240:0x069b, B:248:0x06c8, B:258:0x0720, B:181:0x051f), top: B:506:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:185:0x0540  */
    /* JADX WARN: Code duplicated, block: B:190:0x054c A[Catch: RuntimeException -> 0x0ba4, PHI: r3
      0x054c: PHI (r3v50 java.lang.Boolean) = (r3v49 java.lang.Boolean), (r3v150 java.lang.Boolean) binds: [B:184:0x053e, B:187:0x0545] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #8 {RuntimeException -> 0x0ba4, blocks: (B:183:0x0526, B:190:0x054c, B:198:0x059f, B:219:0x05e6, B:224:0x062c, B:209:0x05be), top: B:464:0x0526 }] */
    /* JADX WARN: Code duplicated, block: B:193:0x058f A[Catch: RuntimeException -> 0x0547, TRY_ENTER, TryCatch #28 {RuntimeException -> 0x0547, blocks: (B:186:0x0541, B:193:0x058f, B:195:0x0597, B:200:0x05a3, B:202:0x05ab, B:222:0x060f, B:211:0x05c8, B:212:0x05ce, B:213:0x05d1, B:218:0x05e0), top: B:502:0x0541 }] */
    /* JADX WARN: Code duplicated, block: B:197:0x059d  */
    /* JADX WARN: Code duplicated, block: B:200:0x05a3 A[Catch: RuntimeException -> 0x0547, TRY_ENTER, TryCatch #28 {RuntimeException -> 0x0547, blocks: (B:186:0x0541, B:193:0x058f, B:195:0x0597, B:200:0x05a3, B:202:0x05ab, B:222:0x060f, B:211:0x05c8, B:212:0x05ce, B:213:0x05d1, B:218:0x05e0), top: B:502:0x0541 }] */
    /* JADX WARN: Code duplicated, block: B:207:0x05ba  */
    /* JADX WARN: Code duplicated, block: B:209:0x05be A[Catch: RuntimeException -> 0x0ba4, TRY_ENTER, TRY_LEAVE, TryCatch #8 {RuntimeException -> 0x0ba4, blocks: (B:183:0x0526, B:190:0x054c, B:198:0x059f, B:219:0x05e6, B:224:0x062c, B:209:0x05be), top: B:464:0x0526 }] */
    /* JADX WARN: Code duplicated, block: B:213:0x05d1 A[Catch: RuntimeException -> 0x0547, TryCatch #28 {RuntimeException -> 0x0547, blocks: (B:186:0x0541, B:193:0x058f, B:195:0x0597, B:200:0x05a3, B:202:0x05ab, B:222:0x060f, B:211:0x05c8, B:212:0x05ce, B:213:0x05d1, B:218:0x05e0), top: B:502:0x0541 }] */
    /* JADX WARN: Code duplicated, block: B:214:0x05d4  */
    /* JADX WARN: Code duplicated, block: B:215:0x05d9  */
    /* JADX WARN: Code duplicated, block: B:216:0x05dc  */
    /* JADX WARN: Code duplicated, block: B:222:0x060f A[Catch: RuntimeException -> 0x0547, TRY_ENTER, TRY_LEAVE, TryCatch #28 {RuntimeException -> 0x0547, blocks: (B:186:0x0541, B:193:0x058f, B:195:0x0597, B:200:0x05a3, B:202:0x05ab, B:222:0x060f, B:211:0x05c8, B:212:0x05ce, B:213:0x05d1, B:218:0x05e0), top: B:502:0x0541 }] */
    /* JADX WARN: Code duplicated, block: B:227:0x0655 A[Catch: RuntimeException -> 0x001b, TRY_ENTER, TryCatch #13 {RuntimeException -> 0x001b, blocks: (B:6:0x0015, B:15:0x0036, B:17:0x0040, B:227:0x0655, B:228:0x065b, B:230:0x0664, B:231:0x066c, B:243:0x06b1, B:245:0x06b8, B:247:0x06bf, B:250:0x06e2, B:252:0x06ec, B:254:0x06ef, B:256:0x0709, B:257:0x0711, B:260:0x0726, B:262:0x072e, B:264:0x0731, B:266:0x079a, B:269:0x07a7, B:271:0x07cb, B:276:0x07da, B:278:0x07ea, B:279:0x07f5), top: B:474:0x0015 }] */
    /* JADX WARN: Code duplicated, block: B:230:0x0664 A[Catch: RuntimeException -> 0x001b, LOOP:1: B:228:0x065b->B:230:0x0664, LOOP_END, TryCatch #13 {RuntimeException -> 0x001b, blocks: (B:6:0x0015, B:15:0x0036, B:17:0x0040, B:227:0x0655, B:228:0x065b, B:230:0x0664, B:231:0x066c, B:243:0x06b1, B:245:0x06b8, B:247:0x06bf, B:250:0x06e2, B:252:0x06ec, B:254:0x06ef, B:256:0x0709, B:257:0x0711, B:260:0x0726, B:262:0x072e, B:264:0x0731, B:266:0x079a, B:269:0x07a7, B:271:0x07cb, B:276:0x07da, B:278:0x07ea, B:279:0x07f5), top: B:474:0x0015 }] */
    /* JADX WARN: Code duplicated, block: B:235:0x067a A[Catch: RuntimeException -> 0x051a, TRY_ENTER, TryCatch #11 {RuntimeException -> 0x051a, blocks: (B:177:0x0514, B:274:0x07d4, B:235:0x067a, B:236:0x0680, B:238:0x0689, B:239:0x0698), top: B:470:0x0514 }] */
    /* JADX WARN: Code duplicated, block: B:238:0x0689 A[Catch: RuntimeException -> 0x051a, LOOP:6: B:236:0x0680->B:238:0x0689, LOOP_END, TryCatch #11 {RuntimeException -> 0x051a, blocks: (B:177:0x0514, B:274:0x07d4, B:235:0x067a, B:236:0x0680, B:238:0x0689, B:239:0x0698), top: B:470:0x0514 }] */
    /* JADX WARN: Code duplicated, block: B:242:0x06af A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:250:0x06e2 A[Catch: RuntimeException -> 0x001b, TRY_ENTER, TryCatch #13 {RuntimeException -> 0x001b, blocks: (B:6:0x0015, B:15:0x0036, B:17:0x0040, B:227:0x0655, B:228:0x065b, B:230:0x0664, B:231:0x066c, B:243:0x06b1, B:245:0x06b8, B:247:0x06bf, B:250:0x06e2, B:252:0x06ec, B:254:0x06ef, B:256:0x0709, B:257:0x0711, B:260:0x0726, B:262:0x072e, B:264:0x0731, B:266:0x079a, B:269:0x07a7, B:271:0x07cb, B:276:0x07da, B:278:0x07ea, B:279:0x07f5), top: B:474:0x0015 }] */
    /* JADX WARN: Code duplicated, block: B:256:0x0709 A[Catch: RuntimeException -> 0x001b, TryCatch #13 {RuntimeException -> 0x001b, blocks: (B:6:0x0015, B:15:0x0036, B:17:0x0040, B:227:0x0655, B:228:0x065b, B:230:0x0664, B:231:0x066c, B:243:0x06b1, B:245:0x06b8, B:247:0x06bf, B:250:0x06e2, B:252:0x06ec, B:254:0x06ef, B:256:0x0709, B:257:0x0711, B:260:0x0726, B:262:0x072e, B:264:0x0731, B:266:0x079a, B:269:0x07a7, B:271:0x07cb, B:276:0x07da, B:278:0x07ea, B:279:0x07f5), top: B:474:0x0015 }] */
    /* JADX WARN: Code duplicated, block: B:260:0x0726 A[Catch: RuntimeException -> 0x001b, TRY_ENTER, TryCatch #13 {RuntimeException -> 0x001b, blocks: (B:6:0x0015, B:15:0x0036, B:17:0x0040, B:227:0x0655, B:228:0x065b, B:230:0x0664, B:231:0x066c, B:243:0x06b1, B:245:0x06b8, B:247:0x06bf, B:250:0x06e2, B:252:0x06ec, B:254:0x06ef, B:256:0x0709, B:257:0x0711, B:260:0x0726, B:262:0x072e, B:264:0x0731, B:266:0x079a, B:269:0x07a7, B:271:0x07cb, B:276:0x07da, B:278:0x07ea, B:279:0x07f5), top: B:474:0x0015 }] */
    /* JADX WARN: Code duplicated, block: B:266:0x079a A[Catch: RuntimeException -> 0x001b, TryCatch #13 {RuntimeException -> 0x001b, blocks: (B:6:0x0015, B:15:0x0036, B:17:0x0040, B:227:0x0655, B:228:0x065b, B:230:0x0664, B:231:0x066c, B:243:0x06b1, B:245:0x06b8, B:247:0x06bf, B:250:0x06e2, B:252:0x06ec, B:254:0x06ef, B:256:0x0709, B:257:0x0711, B:260:0x0726, B:262:0x072e, B:264:0x0731, B:266:0x079a, B:269:0x07a7, B:271:0x07cb, B:276:0x07da, B:278:0x07ea, B:279:0x07f5), top: B:474:0x0015 }] */
    /* JADX WARN: Code duplicated, block: B:269:0x07a7 A[Catch: RuntimeException -> 0x001b, TryCatch #13 {RuntimeException -> 0x001b, blocks: (B:6:0x0015, B:15:0x0036, B:17:0x0040, B:227:0x0655, B:228:0x065b, B:230:0x0664, B:231:0x066c, B:243:0x06b1, B:245:0x06b8, B:247:0x06bf, B:250:0x06e2, B:252:0x06ec, B:254:0x06ef, B:256:0x0709, B:257:0x0711, B:260:0x0726, B:262:0x072e, B:264:0x0731, B:266:0x079a, B:269:0x07a7, B:271:0x07cb, B:276:0x07da, B:278:0x07ea, B:279:0x07f5), top: B:474:0x0015 }] */
    /* JADX WARN: Code duplicated, block: B:271:0x07cb A[Catch: RuntimeException -> 0x001b, TRY_LEAVE, TryCatch #13 {RuntimeException -> 0x001b, blocks: (B:6:0x0015, B:15:0x0036, B:17:0x0040, B:227:0x0655, B:228:0x065b, B:230:0x0664, B:231:0x066c, B:243:0x06b1, B:245:0x06b8, B:247:0x06bf, B:250:0x06e2, B:252:0x06ec, B:254:0x06ef, B:256:0x0709, B:257:0x0711, B:260:0x0726, B:262:0x072e, B:264:0x0731, B:266:0x079a, B:269:0x07a7, B:271:0x07cb, B:276:0x07da, B:278:0x07ea, B:279:0x07f5), top: B:474:0x0015 }] */
    /* JADX WARN: Code duplicated, block: B:274:0x07d4 A[Catch: RuntimeException -> 0x051a, TRY_ENTER, TRY_LEAVE, TryCatch #11 {RuntimeException -> 0x051a, blocks: (B:177:0x0514, B:274:0x07d4, B:235:0x067a, B:236:0x0680, B:238:0x0689, B:239:0x0698), top: B:470:0x0514 }] */
    /* JADX WARN: Code duplicated, block: B:278:0x07ea A[Catch: RuntimeException -> 0x001b, LOOP:2: B:277:0x07e8->B:278:0x07ea, LOOP_END, TryCatch #13 {RuntimeException -> 0x001b, blocks: (B:6:0x0015, B:15:0x0036, B:17:0x0040, B:227:0x0655, B:228:0x065b, B:230:0x0664, B:231:0x066c, B:243:0x06b1, B:245:0x06b8, B:247:0x06bf, B:250:0x06e2, B:252:0x06ec, B:254:0x06ef, B:256:0x0709, B:257:0x0711, B:260:0x0726, B:262:0x072e, B:264:0x0731, B:266:0x079a, B:269:0x07a7, B:271:0x07cb, B:276:0x07da, B:278:0x07ea, B:279:0x07f5), top: B:474:0x0015 }] */
    /* JADX WARN: Code duplicated, block: B:285:0x0808 A[Catch: RuntimeException -> 0x08d3, TRY_LEAVE, TryCatch #3 {RuntimeException -> 0x08d3, blocks: (B:283:0x07fe, B:285:0x0808), top: B:454:0x07fe }] */
    /* JADX WARN: Code duplicated, block: B:318:0x08cf A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Code duplicated, block: B:321:0x08dc  */
    /* JADX WARN: Code duplicated, block: B:326:0x0907 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:333:0x0915  */
    /* JADX WARN: Code duplicated, block: B:342:0x0966 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:347:0x0971  */
    /* JADX WARN: Code duplicated, block: B:351:0x0977 A[Catch: RuntimeException -> 0x0b98, TRY_ENTER, TRY_LEAVE, TryCatch #1 {RuntimeException -> 0x0b98, blocks: (B:334:0x0916, B:351:0x0977), top: B:450:0x0916 }] */
    /* JADX WARN: Code duplicated, block: B:356:0x098f A[Catch: RuntimeException -> 0x0912, TryCatch #2 {RuntimeException -> 0x0912, blocks: (B:324:0x08f6, B:327:0x0909, B:340:0x0922, B:343:0x0968, B:354:0x097e, B:356:0x098f, B:357:0x0998, B:359:0x0a27, B:362:0x0a32, B:372:0x0a46), top: B:452:0x08f6 }] */
    /* JADX WARN: Code duplicated, block: B:359:0x0a27 A[Catch: RuntimeException -> 0x0912, TryCatch #2 {RuntimeException -> 0x0912, blocks: (B:324:0x08f6, B:327:0x0909, B:340:0x0922, B:343:0x0968, B:354:0x097e, B:356:0x098f, B:357:0x0998, B:359:0x0a27, B:362:0x0a32, B:372:0x0a46), top: B:452:0x08f6 }] */
    /* JADX WARN: Code duplicated, block: B:361:0x0a30 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:370:0x0a40 A[Catch: RuntimeException -> 0x0b5e, TRY_ENTER, TRY_LEAVE, TryCatch #9 {RuntimeException -> 0x0b5e, blocks: (B:348:0x0972, B:370:0x0a40), top: B:466:0x0972 }] */
    /* JADX WARN: Code duplicated, block: B:374:0x0a4e A[LOOP:5: B:476:0x0a3b->B:374:0x0a4e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:379:0x0a7a  */
    /* JADX WARN: Code duplicated, block: B:384:0x0a88 A[Catch: RuntimeException -> 0x0abc, TRY_LEAVE, TryCatch #31 {RuntimeException -> 0x0abc, blocks: (B:382:0x0a80, B:384:0x0a88), top: B:508:0x0a80 }] */
    /* JADX WARN: Code duplicated, block: B:394:0x0ad3 A[Catch: RuntimeException -> 0x0b28, TryCatch #5 {RuntimeException -> 0x0b28, blocks: (B:392:0x0acb, B:394:0x0ad3, B:396:0x0adb), top: B:458:0x0acb }] */
    /* JADX WARN: Code duplicated, block: B:396:0x0adb A[Catch: RuntimeException -> 0x0b28, TryCatch #5 {RuntimeException -> 0x0b28, blocks: (B:392:0x0acb, B:394:0x0ad3, B:396:0x0adb), top: B:458:0x0acb }] */
    /* JADX WARN: Code duplicated, block: B:400:0x0af0 A[Catch: RuntimeException -> 0x0a76, TryCatch #14 {RuntimeException -> 0x0a76, blocks: (B:367:0x0a3b, B:398:0x0ae8, B:400:0x0af0, B:401:0x0af7, B:403:0x0aff), top: B:476:0x0a3b }] */
    /* JADX WARN: Code duplicated, block: B:403:0x0aff A[Catch: RuntimeException -> 0x0a76, TRY_LEAVE, TryCatch #14 {RuntimeException -> 0x0a76, blocks: (B:367:0x0a3b, B:398:0x0ae8, B:400:0x0af0, B:401:0x0af7, B:403:0x0aff), top: B:476:0x0a3b }] */
    /* JADX WARN: Code duplicated, block: B:409:0x0b30 A[LOOP:4: B:466:0x0972->B:409:0x0b30, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:449:0x0b62 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:454:0x07fe A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:458:0x0acb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:468:0x0670 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:496:0x091b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:508:0x0a80 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:513:0x0b70 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:514:0x0921 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:516:0x097d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:517:0x0b39 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:519:0x0a51 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:520:0x0a46 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:521:? A[SYNTHETIC] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /* JADX INFO: renamed from: j */
    public final FrameMetadata m17683j(kpp kppVar, GyroSampleVector gyroSampleVector, Map map, kmg kmgVar) {
        RuntimeException runtimeException;
        kmg kmgVarMo14556i;
        String str;
        kmg kmgVar2;
        WeightedPixelRectVector weightedPixelRectVector;
        int i;
        nrq nrqVar;
        Long l;
        Optional optionalEmpty;
        boolean z;
        boolean z2;
        GeometricCalibrationVector geometricCalibrationVector;
        float[] fArr;
        float[] fArr2;
        float[] fArr3;
        float[] fArr4;
        GeometricCalibration geometricCalibration;
        String str2;
        int i2;
        int iIntValue;
        String str3;
        Boolean bool;
        CaptureResult.Key key;
        float fIntValue;
        float fIntValue2;
        CaptureResult.Key key2;
        Integer num;
        Pair[] pairArr;
        FloatVector floatVector;
        FloatVector floatVector2;
        int i3;
        float[] fArr5;
        BlackLevelPattern blackLevelPattern;
        FloatArray4 floatArray4;
        int i4;
        Float f;
        LiveHdrMetadata liveHdrMetadata;
        AeResults aeResults;
        CaptureResult.Key key3;
        String str4;
        byte[] bArr;
        int i5;
        int length;
        int iIntValue2;
        int i6;
        nrf nrfVar;
        AeMetadata aeMetadataM4954d;
        int iIntValue3;
        int i7;
        nqy nqyVar;
        Integer num2;
        Integer num3;
        CaptureResult.Key key4;
        byte[] bArr2;
        byte[] bArrM17661I;
        byte[] bArrM17661I2;
        int iIntValue4;
        nrr[] nrrVarArr;
        nrr nrrVar;
        nqy[] nqyVarArr;
        nqy nqyVar2;
        nrf[] nrfVarArr;
        nrf nrfVar2;
        float[] fArr6;
        int length2;
        AeModeResult[] aeModeResultArr;
        long[] jArr;
        int i8;
        float[] fArr7;
        FloatArray4 floatArray5;
        int i9;
        Integer num4;
        Integer num5;
        Long l2;
        FrameMetadata frameMetadata = new FrameMetadata();
        String str5 = "characteristics";
        try {
            kmd kmdVarM17682f = m17682f(kppVar, kmgVar);
            if (kmgVar == null) {
                try {
                    kmgVarMo14556i = kmdVarM17682f.mo14556i();
                } catch (RuntimeException e) {
                    runtimeException = e;
                    frameMetadata = frameMetadata;
                    Log.e(f44463a, "Exception in converting to Gcam FrameMetadata at ".concat(str5), runtimeException);
                    return frameMetadata;
                }
            } else {
                kmgVarMo14556i = kmgVar;
            }
            kpp kppVarM17665h = m17665h(kppVar, kmgVarMo14556i.f36540a);
            String str6 = "physical2fm";
            try {
                m17658F(kmdVarM17682f, kppVarM17665h, map, frameMetadata.m4957g());
                if (ivv.f32397f != null && (l2 = (Long) kppVarM17665h.mo9517d(ivv.f32397f)) != null) {
                    GcamModuleJNI.FrameMetadata_timestamp_faces_ns_set(frameMetadata.f8263a, frameMetadata, l2.longValue());
                }
                try {
                    if (ivx.f32442e != null) {
                        try {
                            int[] iArr = (int[]) kppVarM17665h.mo9517d(ivx.f32442e);
                            if (iArr != null) {
                                long jM4936a = frameMetadata.m4957g().m4936a() * 4;
                                int length3 = iArr.length;
                                if (jM4936a == length3) {
                                    Rect rect = (Rect) kmdVarM17682f.mo14561n(CameraCharacteristics.SENSOR_INFO_PRE_CORRECTION_ACTIVE_ARRAY_SIZE);
                                    int iWidth = rect.width();
                                    int iHeight = rect.height();
                                    long jFrameMetadata_skin_area_faces_get = GcamModuleJNI.FrameMetadata_skin_area_faces_get(frameMetadata.f8263a, frameMetadata);
                                    FaceInfoVector faceInfoVector = jFrameMetadata_skin_area_faces_get == 0 ? null : new FaceInfoVector(jFrameMetadata_skin_area_faces_get, false);
                                    int i10 = 0;
                                    while (true) {
                                        kmgVar2 = kmgVarMo14556i;
                                        if (i10 >= frameMetadata.m4957g().m4936a()) {
                                            break;
                                        }
                                        int i11 = i10 * 4;
                                        float f2 = iArr[i11];
                                        float f3 = iArr[i11 + 1];
                                        float f4 = iArr[i11 + 2];
                                        float f5 = iArr[i11 + 3];
                                        String str7 = str6;
                                        float f6 = ((f2 + f4) * 0.5f) / iWidth;
                                        int[] iArr2 = iArr;
                                        float f7 = ((f3 + f5) * 0.5f) / iHeight;
                                        float fMax = (((f4 - f2) + (f5 - f3)) * 0.5f) / Math.max(iWidth, iHeight);
                                        FaceInfoVector faceInfoVectorM4957g = frameMetadata.m4957g();
                                        FaceInfo faceInfo = new FaceInfo(GcamModuleJNI.FaceInfoVector_get(faceInfoVectorM4957g.f8251a, faceInfoVectorM4957g, i10), false);
                                        FaceInfo faceInfo2 = new FaceInfo(GcamModuleJNI.new_FaceInfo__SWIG_1(faceInfo.f8247a, faceInfo), true);
                                        faceInfo2.m4930c(f6);
                                        faceInfo2.m4931d(f7);
                                        faceInfo2.m4932e(fMax);
                                        faceInfoVector.m4937b(faceInfo2);
                                        i10++;
                                        iWidth = iWidth;
                                        str6 = str7;
                                        kmgVarMo14556i = kmgVar2;
                                        iHeight = iHeight;
                                        iArr = iArr2;
                                    }
                                    str = str6;
                                } else {
                                    str = "physical2fm";
                                    kmgVar2 = kmgVarMo14556i;
                                    Log.e(f44463a, String.format("Inconsistent number of faces (%d) vs. skin area elements (%d).", Long.valueOf(frameMetadata.m4957g().m4936a()), Integer.valueOf(length3)));
                                }
                            } else {
                                str = "physical2fm";
                                kmgVar2 = kmgVarMo14556i;
                            }
                        } catch (RuntimeException e2) {
                            e = e2;
                            str = str6;
                            runtimeException = e;
                            str5 = str;
                        }
                    } else {
                        str = "physical2fm";
                        kmgVar2 = kmgVarMo14556i;
                    }
                    try {
                        MeteringRectangle[] meteringRectangleArr = (MeteringRectangle[]) kppVarM17665h.mo9517d(CaptureResult.CONTROL_AE_REGIONS);
                        MeteringRectangle[] meteringRectangleArr2 = (MeteringRectangle[]) kppVarM17665h.mo9517d(CaptureResult.CONTROL_AWB_REGIONS);
                        MeteringRectangle[] meteringRectangleArr3 = (MeteringRectangle[]) kppVarM17665h.mo9517d(CaptureResult.CONTROL_AF_REGIONS);
                        m17657E(meteringRectangleArr, false, frameMetadata.m4954d().m4875a());
                        AwbMetadata awbMetadataM4956f = frameMetadata.m4956f();
                        long jAwbMetadata_metering_rectangles_get = GcamModuleJNI.AwbMetadata_metering_rectangles_get(awbMetadataM4956f.f8231a, awbMetadataM4956f);
                        if (jAwbMetadata_metering_rectangles_get == 0) {
                            weightedPixelRectVector = null;
                        } else {
                            try {
                                weightedPixelRectVector = new WeightedPixelRectVector(jAwbMetadata_metering_rectangles_get);
                            } catch (RuntimeException e3) {
                                frameMetadata = frameMetadata;
                                runtimeException = e3;
                                str5 = str;
                            }
                        }
                        m17657E(meteringRectangleArr2, false, weightedPixelRectVector);
                        AfMetadata afMetadataM4955e = frameMetadata.m4955e();
                        long jAfMetadata_metering_rectangles_get = GcamModuleJNI.AfMetadata_metering_rectangles_get(afMetadataM4955e.f8228a, afMetadataM4955e);
                        m17657E(meteringRectangleArr3, true, jAfMetadata_metering_rectangles_get == 0 ? null : new WeightedPixelRectVector(jAfMetadata_metering_rectangles_get));
                        GcamModuleJNI.FrameMetadata_actual_exposure_time_ms_set(frameMetadata.f8263a, frameMetadata, m17673v(kppVarM17665h));
                        float[] fArrM17662J = m17662J(kmdVarM17682f, kppVarM17665h);
                        GcamModuleJNI.FrameMetadata_actual_analog_gain_set(frameMetadata.f8263a, frameMetadata, fArrM17662J[0]);
                        GcamModuleJNI.FrameMetadata_applied_digital_gain_set(frameMetadata.f8263a, frameMetadata, fArrM17662J[1]);
                        Integer num6 = (Integer) kppVarM17665h.mo9517d(CaptureResult.CONTROL_POST_RAW_SENSITIVITY_BOOST);
                        if (num6 != null) {
                            GcamModuleJNI.FrameMetadata_post_raw_digital_gain_set(frameMetadata.f8263a, frameMetadata, num6.intValue() / 100.0f);
                        }
                        Float f8 = (Float) kppVarM17665h.mo9517d(CaptureResult.LENS_FOCAL_LENGTH);
                        if (f8 != null) {
                            GcamModuleJNI.FrameMetadata_focal_length_mm_set(frameMetadata.f8263a, frameMetadata, f8.floatValue());
                        }
                        Float f9 = (Float) kppVarM17665h.mo9517d(CaptureResult.LENS_APERTURE);
                        if (f9 != null) {
                            GcamModuleJNI.FrameMetadata_f_number_set(frameMetadata.f8263a, frameMetadata, f9.floatValue());
                        }
                        String str8 = "scaler";
                        try {
                            Rect rect2 = (Rect) kppVarM17665h.mo9517d(CaptureResult.SCALER_CROP_REGION);
                            rect2.getClass();
                            MeshWarp meshWarpM17667l = m17667l(rect2, kppVar);
                            GcamModuleJNI.FrameMetadata_mesh_warp_set(frameMetadata.f8263a, frameMetadata, meshWarpM17667l.f8318a, meshWarpM17667l);
                            Integer num7 = (Integer) kppVar.mo9517d(CaptureResult.STATISTICS_OIS_DATA_MODE);
                            String str9 = " with value ";
                            int i12 = 3;
                            if (num7 != null) {
                                try {
                                    if (num7.intValue() != 0) {
                                        try {
                                            int iIntValue5 = ((Integer) kppVar.mo9517d(CaptureResult.LENS_OPTICAL_STABILIZATION_MODE)).intValue();
                                            nrq[] nrqVarArr = nrq.f44277d;
                                            if (iIntValue5 < 3 && iIntValue5 >= 0) {
                                                nrqVar = nrqVarArr[iIntValue5];
                                                if (nrqVar.f44278e != iIntValue5) {
                                                    i = 0;
                                                }
                                                l = (Long) kppVar.mo9517d(CaptureResult.SENSOR_TIMESTAMP);
                                                OisSample[] oisSampleArr = (OisSample[]) kppVar.mo9517d(CaptureResult.STATISTICS_OIS_SAMPLES);
                                                if (l != null || oisSampleArr == null) {
                                                    optionalEmpty = Optional.empty();
                                                    str9 = " with value ";
                                                } else {
                                                    OisMetadata oisMetadata = new OisMetadata();
                                                    kmdVarM17682f = kmdVarM17682f;
                                                    GcamModuleJNI.OisMetadata_lens_optical_stabilization_mode_set(oisMetadata.f8324a, oisMetadata, nrqVar.f44278e);
                                                    GcamModuleJNI.OisMetadata_timestamp_ois_clock_ns_set(oisMetadata.f8324a, oisMetadata, l.longValue());
                                                    long jOisMetadata_ois_positions_get = GcamModuleJNI.OisMetadata_ois_positions_get(oisMetadata.f8324a, oisMetadata);
                                                    OisPositionVector oisPositionVector = jOisMetadata_ois_positions_get == 0 ? null : new OisPositionVector(jOisMetadata_ois_positions_get);
                                                    int length4 = oisSampleArr.length;
                                                    int i13 = 0;
                                                    while (i13 < length4) {
                                                        OisSample oisSample = oisSampleArr[i13];
                                                        OisPosition oisPosition = new OisPosition();
                                                        GcamModuleJNI.OisPosition_timestamp_ns_set(oisPosition.f8326a, oisPosition, oisSample.getTimestamp());
                                                        GcamModuleJNI.OisPosition_shift_pixel_x_set(oisPosition.f8326a, oisPosition, oisSample.getXshift());
                                                        GcamModuleJNI.OisPosition_shift_pixel_y_set(oisPosition.f8326a, oisPosition, oisSample.getYshift());
                                                        GcamModuleJNI.OisPositionVector_add(oisPositionVector.f8328a, oisPositionVector, oisPosition.f8326a, oisPosition);
                                                        i13++;
                                                        oisSampleArr = oisSampleArr;
                                                        str9 = str9;
                                                    }
                                                    optionalEmpty = Optional.m12505of(oisMetadata);
                                                    str9 = str9;
                                                }
                                                optionalEmpty.ifPresent(new idi(frameMetadata, 11));
                                                if (gyroSampleVector != null) {
                                                    z = true;
                                                    GcamModuleJNI.FrameMetadata_gyro_samples_set(frameMetadata.f8263a, frameMetadata, gyroSampleVector.f8285a, gyroSampleVector);
                                                } else {
                                                    z = true;
                                                }
                                                str8 = "geocalibration";
                                                z2 = kmdVarM17682f.mo14544M() || !kmdVarM17682f.mo14535D();
                                                lku.m15670x(z2, "Logical cameras not supported.");
                                                geometricCalibrationVector = new GeometricCalibrationVector(GcamModuleJNI.new_GeometricCalibrationVector__SWIG_0(), z);
                                                fArr = (float[]) kppVar.mo9517d(CaptureResult.LENS_DISTORTION);
                                                fArr2 = (float[]) kppVar.mo9517d(CaptureResult.LENS_INTRINSIC_CALIBRATION);
                                                fArr3 = (float[]) kppVar.mo9517d(CaptureResult.LENS_POSE_ROTATION);
                                                fArr4 = (float[]) kppVar.mo9517d(CaptureResult.LENS_POSE_TRANSLATION);
                                                if (fArr == null) {
                                                    fArr = (float[]) kmdVarM17682f.mo14559l(CameraCharacteristics.LENS_DISTORTION);
                                                }
                                                if (fArr2 == null) {
                                                    fArr2 = (float[]) kmdVarM17682f.mo14559l(CameraCharacteristics.LENS_INTRINSIC_CALIBRATION);
                                                }
                                                if (fArr3 == null) {
                                                    fArr3 = (float[]) kmdVarM17682f.mo14559l(CameraCharacteristics.LENS_POSE_ROTATION);
                                                }
                                                if (fArr4 == null) {
                                                    fArr4 = (float[]) kmdVarM17682f.mo14559l(CameraCharacteristics.LENS_POSE_TRANSLATION);
                                                }
                                                if (fArr == null || fArr2 != null || fArr3 != null || fArr4 != null) {
                                                    geometricCalibration = new GeometricCalibration();
                                                    geometricCalibration.m4982d(nrm.f44244a);
                                                    if (fArr != null) {
                                                        geometricCalibration.m4980b(fArr);
                                                    }
                                                    if (fArr2 != null) {
                                                        geometricCalibration.m4981c(fArr2);
                                                    }
                                                    if (fArr3 != null) {
                                                        GcamModuleJNI.GeometricCalibration_lens_pose_rotation_set(geometricCalibration.f8275a, geometricCalibration, fArr3);
                                                    }
                                                    if (fArr4 != null) {
                                                        GcamModuleJNI.GeometricCalibration_lens_pose_translation_set(geometricCalibration.f8275a, geometricCalibration, fArr4);
                                                    }
                                                    geometricCalibrationVector.m4983a(geometricCalibration);
                                                }
                                                if (ivt.f32348b != null || ivt.f32349c == null || ivt.f32350d == null || ivt.f32351e == null || ivt.f32352f == null) {
                                                    str2 = "No enum ";
                                                    i2 = 4;
                                                } else {
                                                    float[] fArr8 = (float[]) kmdVarM17682f.mo14559l(ivt.f32348b);
                                                    float[] fArr9 = (float[]) kmdVarM17682f.mo14559l(ivt.f32349c);
                                                    float[] fArr10 = (float[]) kmdVarM17682f.mo14559l(ivt.f32350d);
                                                    int[] iArr3 = (int[]) kmdVarM17682f.mo14559l(ivt.f32351e);
                                                    int[] iArr4 = (int[]) kmdVarM17682f.mo14559l(ivt.f32352f);
                                                    if (fArr8 == null || fArr9 == null || fArr10 == null || iArr3 == null || iArr4 == null) {
                                                        str2 = "No enum ";
                                                        i2 = 4;
                                                    } else {
                                                        GeometricCalibration geometricCalibration2 = new GeometricCalibration();
                                                        geometricCalibration2.m4982d(nrm.f44245b);
                                                        float[] fArrGeometricCalibration_lens_distortion_get = GcamModuleJNI.GeometricCalibration_lens_distortion_get(geometricCalibration2.f8275a, geometricCalibration2);
                                                        fArrGeometricCalibration_lens_distortion_get[0] = fArr8[0];
                                                        fArrGeometricCalibration_lens_distortion_get[1] = fArr8[1];
                                                        fArrGeometricCalibration_lens_distortion_get[2] = fArr8[2];
                                                        fArrGeometricCalibration_lens_distortion_get[3] = fArr8[6];
                                                        fArrGeometricCalibration_lens_distortion_get[4] = fArr8[7];
                                                        geometricCalibration2.m4980b(fArrGeometricCalibration_lens_distortion_get);
                                                        float[] fArrGeometricCalibration_lens_distortion_extended_get = GcamModuleJNI.GeometricCalibration_lens_distortion_extended_get(geometricCalibration2.f8275a, geometricCalibration2);
                                                        fArrGeometricCalibration_lens_distortion_extended_get[0] = fArr8[3];
                                                        fArrGeometricCalibration_lens_distortion_extended_get[1] = fArr8[4];
                                                        fArrGeometricCalibration_lens_distortion_extended_get[2] = fArr8[5];
                                                        fArrGeometricCalibration_lens_distortion_extended_get[3] = fArr8[8];
                                                        fArrGeometricCalibration_lens_distortion_extended_get[4] = fArr8[9];
                                                        fArrGeometricCalibration_lens_distortion_extended_get[5] = fArr8[10];
                                                        fArrGeometricCalibration_lens_distortion_extended_get[6] = fArr8[11];
                                                        str2 = "No enum ";
                                                        GcamModuleJNI.GeometricCalibration_lens_distortion_extended_set(geometricCalibration2.f8275a, geometricCalibration2, fArrGeometricCalibration_lens_distortion_extended_get);
                                                        float[] fArrGeometricCalibration_lens_intrinsic_calibration_get = GcamModuleJNI.GeometricCalibration_lens_intrinsic_calibration_get(geometricCalibration2.f8275a, geometricCalibration2);
                                                        fArrGeometricCalibration_lens_intrinsic_calibration_get[0] = fArr10[0];
                                                        fArrGeometricCalibration_lens_intrinsic_calibration_get[1] = fArr10[1];
                                                        fArrGeometricCalibration_lens_intrinsic_calibration_get[2] = fArr9[0];
                                                        fArrGeometricCalibration_lens_intrinsic_calibration_get[3] = fArr9[1];
                                                        i2 = 4;
                                                        fArrGeometricCalibration_lens_intrinsic_calibration_get[4] = 0.0f;
                                                        geometricCalibration2.m4981c(fArrGeometricCalibration_lens_intrinsic_calibration_get);
                                                        GcamModuleJNI.GeometricCalibration_active_rectangle_set(geometricCalibration2.f8275a, geometricCalibration2, iArr3);
                                                        GcamModuleJNI.GeometricCalibration_valid_rectangle_set(geometricCalibration2.f8275a, geometricCalibration2, iArr4);
                                                        geometricCalibrationVector.m4983a(geometricCalibration2);
                                                    }
                                                }
                                                GcamModuleJNI.FrameMetadata_geometric_calibration_set(frameMetadata.f8263a, frameMetadata, geometricCalibrationVector.f8277a, geometricCalibrationVector);
                                                GcamModuleJNI.FrameMetadata_sensor_id_set(frameMetadata.f8263a, frameMetadata, m17655C(kmdVarM17682f, this.f44466d, kppVar, kmgVar2).f44379q);
                                                str5 = "flash";
                                                iIntValue = ((Integer) kppVar.mo9517d(CaptureResult.FLASH_MODE)).intValue();
                                                if (iIntValue != 1 || iIntValue == 2) {
                                                    frameMetadata.m4963m(nrj.f44222b);
                                                } else {
                                                    try {
                                                        frameMetadata.m4963m(nrj.f44221a);
                                                    } catch (RuntimeException e4) {
                                                        runtimeException = e4;
                                                        frameMetadata = frameMetadata;
                                                    }
                                                }
                                                str3 = "awb";
                                                try {
                                                    AwbInfo awbInfoM17666i = m17666i(kppVar, kmdVarM17682f);
                                                    GcamModuleJNI.FrameMetadata_wb_set(frameMetadata.f8263a, frameMetadata, AwbInfo.m4899a(awbInfoM17666i), awbInfoM17666i);
                                                    str3 = "bl";
                                                    bool = (Boolean) kppVar.mo9517d(CaptureResult.BLACK_LEVEL_LOCK);
                                                    if (bool == null) {
                                                        try {
                                                            bool = false;
                                                            GcamModuleJNI.FrameMetadata_was_black_level_locked_set(frameMetadata.f8263a, frameMetadata, bool.booleanValue());
                                                            GcamModuleJNI.FrameMetadata_frame_duration_ms_set(frameMetadata.f8263a, frameMetadata, m17675x(((Long) kppVar.mo9517d(CaptureResult.SENSOR_FRAME_DURATION)).longValue()));
                                                            GcamModuleJNI.FrameMetadata_timestamp_ns_set(frameMetadata.f8263a, frameMetadata, ((Long) kppVar.mo9517d(CaptureResult.SENSOR_TIMESTAMP)).longValue());
                                                            GcamModuleJNI.FrameMetadata_sensor_temp_set(frameMetadata.f8263a, frameMetadata, GcamModuleJNI.kSensorTempUnknown_get());
                                                            SceneFlicker sceneFlicker = new SceneFlicker();
                                                            key = ivv.f32398g;
                                                            fIntValue = -1.0f;
                                                            if (key != null || (num5 = (Integer) kppVar.mo9517d(key)) == null) {
                                                                fIntValue2 = -1.0f;
                                                            } else {
                                                                fIntValue2 = num5.intValue();
                                                            }
                                                            key2 = ivv.f32399h;
                                                            if (key2 != null && (num4 = (Integer) kppVar.mo9517d(key2)) != null) {
                                                                fIntValue = num4.intValue() / 10000.0f;
                                                            }
                                                            if ((fIntValue2 >= 0.0f || fIntValue < 0.0f) && (num = (Integer) kppVar.mo9517d(CaptureResult.STATISTICS_SCENE_FLICKER)) != null) {
                                                                switch (num.intValue()) {
                                                                    case 0:
                                                                        fIntValue2 = 0.0f;
                                                                        fIntValue = 1.0f;
                                                                        break;
                                                                    case 1:
                                                                        fIntValue2 = 100.0f;
                                                                        fIntValue = 1.0f;
                                                                        break;
                                                                    case 2:
                                                                        fIntValue2 = 120.0f;
                                                                        fIntValue = 1.0f;
                                                                        break;
                                                                    default:
                                                                        Log.e(f44463a, BEeWZPor.BZKQtFscIANQJ);
                                                                        break;
                                                                }
                                                            }
                                                            GcamModuleJNI.SceneFlicker_frequency_set(sceneFlicker.f8352a, sceneFlicker, fIntValue2);
                                                            GcamModuleJNI.SceneFlicker_confidence_set(sceneFlicker.f8352a, sceneFlicker, fIntValue);
                                                            GcamModuleJNI.FrameMetadata_scene_flicker_set(frameMetadata.f8263a, frameMetadata, sceneFlicker.f8352a, sceneFlicker);
                                                            str3 = "noise";
                                                            pairArr = (Pair[]) kppVar.mo9517d(CaptureResult.SENSOR_NOISE_PROFILE);
                                                            floatVector = new FloatVector();
                                                            floatVector2 = new FloatVector();
                                                            for (i3 = 0; i3 < i2; i3++) {
                                                                floatVector.m4949b(((Double) pairArr[i3].first).floatValue());
                                                                floatVector2.m4949b(((Double) pairArr[i3].second).floatValue());
                                                            }
                                                            NoiseModel noiseModel = new NoiseModel(GcamModuleJNI.NoiseModel_FromShotReadNoiseVector(floatVector.f8261a, floatVector, floatVector2.f8261a, floatVector2));
                                                            GcamModuleJNI.FrameMetadata_dng_noise_model_bayer_set(frameMetadata.f8263a, frameMetadata, noiseModel.f8320a, noiseModel);
                                                            str5 = "dynamicbl";
                                                            fArr5 = (float[]) kppVar.mo9517d(CaptureResult.SENSOR_DYNAMIC_BLACK_LEVEL);
                                                            if (fArr5 != null) {
                                                                floatArray5 = new FloatArray4();
                                                                for (i9 = 0; i9 < floatArray5.m4942b(); i9++) {
                                                                    floatArray5.m4944d(i9, fArr5[i9]);
                                                                }
                                                                frameMetadata.m4962l(floatArray5);
                                                            } else {
                                                                try {
                                                                    blackLevelPattern = (BlackLevelPattern) kmdVarM17682f.mo14559l(CameraCharacteristics.SENSOR_BLACK_LEVEL_PATTERN);
                                                                    if (blackLevelPattern != null) {
                                                                        floatArray4 = new FloatArray4();
                                                                        for (i4 = 0; i4 < floatArray4.m4942b(); i4++) {
                                                                            floatArray4.m4944d(i4, blackLevelPattern.getOffsetForIndex(i4 % 2, i4 / 2));
                                                                        }
                                                                        frameMetadata.m4962l(floatArray4);
                                                                    }
                                                                } catch (RuntimeException e5) {
                                                                    frameMetadata = frameMetadata;
                                                                    runtimeException = e5;
                                                                }
                                                            }
                                                            f = (Float) kppVar.mo9517d(CaptureResult.LENS_FOCUS_DISTANCE);
                                                            Integer num8 = (Integer) kmdVarM17682f.mo14559l(CameraCharacteristics.LENS_INFO_FOCUS_DISTANCE_CALIBRATION);
                                                            if (f != null && num8 != null && (num8.intValue() == 2 || num8.intValue() == 1)) {
                                                                GcamModuleJNI.FrameMetadata_focus_distance_diopters_set(frameMetadata.f8263a, frameMetadata, f.floatValue());
                                                            }
                                                            liveHdrMetadata = new LiveHdrMetadata(GcamModuleJNI.new_LiveHdrMetadata(), true);
                                                            aeResults = new AeResults(GcamModuleJNI.new_AeResults(), true);
                                                            if (ivu.f32375c != null && (fArr7 = (float[]) kppVar.mo9517d(ivu.f32375c)) != null && fArr7.length > 0) {
                                                                GcamModuleJNI.LiveHdrMetadata_max_hdr_ratio_override_set(liveHdrMetadata.f8311a, liveHdrMetadata, fArr7[0]);
                                                                liveHdrMetadata.m5029c(fArr7[1]);
                                                                liveHdrMetadata.m5028b(fArr7[2]);
                                                                if (!f44464b.f36770c) {
                                                                    GcamModuleJNI.LiveHdrMetadata_night_factor_set(liveHdrMetadata.f8311a, liveHdrMetadata, fArr7[3]);
                                                                }
                                                                GcamModuleJNI.LiveHdrMetadata_manual_ec_short_set(liveHdrMetadata.f8311a, liveHdrMetadata, fArr7[i2]);
                                                                GcamModuleJNI.LiveHdrMetadata_manual_portrait_tet_override_set(liveHdrMetadata.f8311a, liveHdrMetadata, fArr7[5]);
                                                            }
                                                            str5 = "gcamae";
                                                            key3 = ivu.f32373a;
                                                            if (key3 != null && (fArr6 = (float[]) kppVar.mo9517d(key3)) != null && (length2 = fArr6.length) > 0) {
                                                                AeModeResult aeModeResult = new AeModeResult();
                                                                AeModeResult aeModeResult2 = new AeModeResult();
                                                                aeModeResult.m4880d(fArr6[0]);
                                                                aeModeResult2.m4880d(fArr6[1]);
                                                                aeModeResult.m4879c(fArr6[2]);
                                                                aeModeResult2.m4879c(fArr6[3]);
                                                                GcamModuleJNI.AeResults_pure_fraction_of_pixels_from_long_exposure_set(aeResults.f8224a, aeResults, fArr6[i2]);
                                                                GcamModuleJNI.AeResults_weighted_fraction_of_pixels_from_long_exposure_set(aeResults.f8224a, aeResults, fArr6[5]);
                                                                GcamModuleJNI.AeModeResult_log_scene_brightness_set(aeModeResult.f8222a, aeModeResult, fArr6[6]);
                                                                GcamModuleJNI.AeResults_predicted_image_brightness_set(aeResults.f8224a, aeResults, fArr6[7]);
                                                                GcamModuleJNI.LiveHdrMetadata_motion_magnitude_pix_set(liveHdrMetadata.f8311a, liveHdrMetadata, fArr6[8]);
                                                                GcamModuleJNI.LiveHdrMetadata_metering_interval_ms_set(liveHdrMetadata.f8311a, liveHdrMetadata, fArr6[9]);
                                                                GcamModuleJNI.LiveHdrMetadata_filtered_motion_speed_pix_per_ms_set(liveHdrMetadata.f8311a, liveHdrMetadata, fArr6[10]);
                                                                liveHdrMetadata.m5032f(fArr6[11]);
                                                                liveHdrMetadata.m5030d(fArr6[12]);
                                                                if (length2 > 13) {
                                                                    GcamModuleJNI.AeResults_safe_underexposure_set(aeResults.f8224a, aeResults, fArr6[13]);
                                                                }
                                                                if (length2 > 15) {
                                                                    AeModeResult aeModeResult3 = new AeModeResult();
                                                                    aeModeResult3.m4880d(fArr6[14]);
                                                                    aeModeResult3.m4879c(fArr6[15]);
                                                                    GcamModuleJNI.AeResults_portrait_result_set(aeResults.f8224a, aeResults, AeModeResult.m4877a(aeModeResult3), aeModeResult3);
                                                                    if (length2 > 16) {
                                                                        liveHdrMetadata.m5031e(fArr6[16]);
                                                                    } else {
                                                                        liveHdrMetadata.m5031e(fArr6[15]);
                                                                    }
                                                                }
                                                                aeModeResultArr = new AeModeResult[]{aeModeResult, aeModeResult2};
                                                                long j = aeResults.f8224a;
                                                                jArr = new long[2];
                                                                for (i8 = 0; i8 < 2; i8++) {
                                                                    jArr[i8] = AeModeResult.m4877a(aeModeResultArr[i8]);
                                                                }
                                                                GcamModuleJNI.AeResults_mode_result_set(j, aeResults, jArr);
                                                            }
                                                            str4 = "smask";
                                                            try {
                                                                if (ivw.f32425k != null) {
                                                                    try {
                                                                        bArr = (byte[]) kppVar.mo9517d(ivw.f32425k);
                                                                        if (bArr != null || (length = bArr.length) == 0) {
                                                                            frameMetadata = frameMetadata;
                                                                            i5 = 0;
                                                                        } else {
                                                                            try {
                                                                                try {
                                                                                    i5 = 0;
                                                                                    try {
                                                                                        nxq nxqVarM18123Q = nxq.m18123Q(oby.f45400i, bArr, 0, length, nxf.m18011a());
                                                                                        nxq.m18132ae(nxqVarM18123Q);
                                                                                        oby obyVar = (oby) nxqVarM18123Q;
                                                                                        if (!obyVar.f45402a || obyVar.f45403b <= 0 || obyVar.f45404c <= 0) {
                                                                                            frameMetadata = frameMetadata;
                                                                                        } else {
                                                                                            long jFrameMetadata_portrait_mask_get = GcamModuleJNI.FrameMetadata_portrait_mask_get(frameMetadata.f8263a, frameMetadata);
                                                                                            PortraitMask portraitMask = jFrameMetadata_portrait_mask_get == 0 ? null : new PortraitMask(jFrameMetadata_portrait_mask_get);
                                                                                            com.google.googlex.gcam.Size size = new com.google.googlex.gcam.Size();
                                                                                            GcamModuleJNI.Size_height_set(size.f8360a, size, obyVar.f45404c);
                                                                                            GcamModuleJNI.Size_width_set(size.f8360a, size, obyVar.f45403b);
                                                                                            frameMetadata = frameMetadata;
                                                                                            try {
                                                                                                GcamModuleJNI.PortraitMask_size_set(portraitMask.f8335a, portraitMask, size.f8360a, size);
                                                                                                NormalizedRect normalizedRect = new NormalizedRect();
                                                                                                normalizedRect.m5052c(obyVar.f45405d);
                                                                                                normalizedRect.m5053d(obyVar.f45407f);
                                                                                                normalizedRect.m5054e(obyVar.f45406e);
                                                                                                normalizedRect.m5055f(obyVar.f45408g);
                                                                                                GcamModuleJNI.PortraitMask_crop_set(portraitMask.f8335a, portraitMask, NormalizedRect.m5050a(normalizedRect), normalizedRect);
                                                                                                byte[] bArrM17804A = obyVar.f45409h.m17804A();
                                                                                                Uint8Vector uint8Vector = new Uint8Vector();
                                                                                                BufferUtils.setByteVectorImpl(bArrM17804A, uint8Vector.f8377a);
                                                                                                GcamModuleJNI.PortraitMask_data_set(portraitMask.f8335a, portraitMask, uint8Vector.f8377a, uint8Vector);
                                                                                            } catch (RuntimeException e6) {
                                                                                                e = e6;
                                                                                                runtimeException = e;
                                                                                                str5 = "smask";
                                                                                                frameMetadata = frameMetadata;
                                                                                            }
                                                                                        }
                                                                                    } catch (nyb e7) {
                                                                                        try {
                                                                                            Log.e(f44463a, "Cannot parse the mask proto");
                                                                                        } catch (RuntimeException e8) {
                                                                                            runtimeException = e8;
                                                                                            str5 = "smask";
                                                                                            frameMetadata = frameMetadata;
                                                                                        }
                                                                                    }
                                                                                } catch (nyb e9) {
                                                                                    i5 = 0;
                                                                                }
                                                                            } catch (RuntimeException e10) {
                                                                                e = e10;
                                                                                frameMetadata = frameMetadata;
                                                                            }
                                                                        }
                                                                    } catch (RuntimeException e11) {
                                                                        runtimeException = e11;
                                                                        str5 = "smask";
                                                                        frameMetadata = frameMetadata;
                                                                    }
                                                                } else {
                                                                    frameMetadata = frameMetadata;
                                                                    i5 = 0;
                                                                }
                                                                frameMetadata = frameMetadata;
                                                                try {
                                                                    GcamModuleJNI.FrameMetadata_live_hdr_set(frameMetadata.f8263a, frameMetadata, liveHdrMetadata.f8311a, liveHdrMetadata);
                                                                    GcamModuleJNI.FrameMetadata_ae_results_set(frameMetadata.f8263a, frameMetadata, AeResults.m4881b(aeResults), aeResults);
                                                                    str5 = "3a";
                                                                    try {
                                                                        iIntValue2 = ((Integer) kppVar.mo9517d(CaptureResult.CONTROL_MODE)).intValue();
                                                                        nrf[] nrfVarArr2 = nrf.f44179g;
                                                                        if (iIntValue2 < 6 || iIntValue2 < 0) {
                                                                            i6 = 0;
                                                                        } else {
                                                                            nrfVar = nrfVarArr2[iIntValue2];
                                                                            if (nrfVar.f44180h == iIntValue2) {
                                                                                GcamModuleJNI.FrameMetadata_control_mode_set(frameMetadata.f8263a, frameMetadata, nrfVar.f44180h);
                                                                                aeMetadataM4954d = frameMetadata.m4954d();
                                                                                GcamModuleJNI.AeMetadata_mode_set(aeMetadataM4954d.f8221a, aeMetadataM4954d, nqx.m17628a(((Integer) kppVar.mo9517d(CaptureResult.CONTROL_AE_MODE)).intValue()).f44108h);
                                                                                GcamModuleJNI.AeMetadata_lock_set(aeMetadataM4954d.f8221a, aeMetadataM4954d, ((Boolean) kppVar.mo9517d(CaptureResult.CONTROL_AE_LOCK)).booleanValue());
                                                                                iIntValue3 = ((Integer) kppVar.mo9517d(CaptureResult.CONTROL_AE_STATE)).intValue();
                                                                                nqy[] nqyVarArr2 = nqy.f44117h;
                                                                                if (iIntValue3 < 7 || iIntValue3 < 0) {
                                                                                    i7 = 0;
                                                                                } else {
                                                                                    nqyVar = nqyVarArr2[iIntValue3];
                                                                                    if (nqyVar.f44118i == iIntValue3) {
                                                                                        GcamModuleJNI.AeMetadata_state_set(aeMetadataM4954d.f8221a, aeMetadataM4954d, nqyVar.f44118i);
                                                                                        num2 = (Integer) kppVar.mo9517d(CaptureResult.CONTROL_AE_PRECAPTURE_TRIGGER);
                                                                                        if (num2 != null) {
                                                                                            GcamModuleJNI.AeMetadata_precapture_trigger_set(aeMetadataM4954d.f8221a, aeMetadataM4954d, num2.intValue());
                                                                                        }
                                                                                        GcamModuleJNI.AeMetadata_exposure_compensation_set(aeMetadataM4954d.f8221a, aeMetadataM4954d, m17678a(((Integer) kppVar.mo9517d(CaptureResult.CONTROL_AE_EXPOSURE_COMPENSATION)).intValue()));
                                                                                        AwbMetadata awbMetadataM4956f2 = frameMetadata.m4956f();
                                                                                        GcamModuleJNI.AwbMetadata_mode_set(awbMetadataM4956f2.f8231a, awbMetadataM4956f2, ((Integer) kppVar.mo9517d(CaptureResult.CONTROL_AWB_MODE)).intValue());
                                                                                        GcamModuleJNI.AwbMetadata_lock_set(awbMetadataM4956f2.f8231a, awbMetadataM4956f2, ((Boolean) kppVar.mo9517d(CaptureResult.CONTROL_AWB_LOCK)).booleanValue());
                                                                                        GcamModuleJNI.AwbMetadata_state_set(awbMetadataM4956f2.f8231a, awbMetadataM4956f2, ((Integer) kppVar.mo9517d(CaptureResult.CONTROL_AWB_STATE)).intValue());
                                                                                        AfMetadata afMetadataM4955e2 = frameMetadata.m4955e();
                                                                                        afMetadataM4955e2.m4896b(nra.m17629a(((Integer) kppVar.mo9517d(CaptureResult.CONTROL_AF_MODE)).intValue()));
                                                                                        afMetadataM4955e2.m4897c(nrb.m17630a(((Integer) kppVar.mo9517d(CaptureResult.CONTROL_AF_STATE)).intValue()));
                                                                                        afMetadataM4955e2.m4898d(((Integer) kppVar.mo9517d(CaptureResult.CONTROL_AF_TRIGGER)).intValue());
                                                                                        num3 = (Integer) kppVar.mo9517d(CaptureResult.LENS_STATE);
                                                                                        if (num3 != null) {
                                                                                            iIntValue4 = num3.intValue();
                                                                                            nrr[] nrrVarArr2 = nrr.f44283d;
                                                                                            if (iIntValue4 < 3 || iIntValue4 < 0) {
                                                                                                while (true) {
                                                                                                    try {
                                                                                                        nrrVarArr = nrr.f44283d;
                                                                                                        if (i5 < 3) {
                                                                                                            throw new IllegalArgumentException(str2 + nrr.class.toString() + str9 + iIntValue4);
                                                                                                        }
                                                                                                        nrrVar = nrrVarArr[i5];
                                                                                                        if (nrrVar.f44284e == iIntValue4) {
                                                                                                            i5++;
                                                                                                        }
                                                                                                    } catch (RuntimeException e12) {
                                                                                                        runtimeException = e12;
                                                                                                    }
                                                                                                }
                                                                                                GcamModuleJNI.FrameMetadata_lens_state_set(frameMetadata.f8263a, frameMetadata, nrrVar.f44284e);
                                                                                                str4 = "bgstats";
                                                                                                key4 = ivt.f32366t;
                                                                                                if (key4 != null) {
                                                                                                    try {
                                                                                                        bArr2 = (byte[]) kppVar.mo9517d(key4);
                                                                                                        if (bArr2 != null) {
                                                                                                            ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(bArr2.length).order(ByteOrder.nativeOrder());
                                                                                                            byteBufferOrder.put(bArr2);
                                                                                                            IspAwbMetadata ispAwbMetadata = new IspAwbMetadata(GcamModuleJNI.DeserializeFromBytes(nsd.m17642a(new nsd(BufferUtils.m4902a(byteBufferOrder))), byteBufferOrder.capacity()));
                                                                                                            GcamModuleJNI.FrameMetadata_isp_metadata_set(frameMetadata.f8263a, frameMetadata, ispAwbMetadata.f8306a, ispAwbMetadata);
                                                                                                        }
                                                                                                    } catch (RuntimeException e13) {
                                                                                                        try {
                                                                                                            Log.e(f44463a, "Error retrieving EXPERIMENTAL_BGSTATS_AWB", e13);
                                                                                                        } catch (RuntimeException e14) {
                                                                                                            runtimeException = e14;
                                                                                                            str5 = "bgstats";
                                                                                                        }
                                                                                                    }
                                                                                                    try {
                                                                                                        if (frameMetadata.m4960j() != nse.f44367f || frameMetadata.m4960j() == nse.f44370i) {
                                                                                                            GcamModuleJNI.ApplySensorBinning__SWIG_0(2, true, false, FrameMetadata.m4951b(frameMetadata), frameMetadata);
                                                                                                        }
                                                                                                        str5 = "halaf";
                                                                                                        bArrM17661I = m17661I(ivx.f32439b, kppVar);
                                                                                                        if (bArrM17661I != null) {
                                                                                                            ntw.m17717c(bArrM17661I, frameMetadata.m4958h());
                                                                                                        }
                                                                                                        bArrM17661I2 = m17661I(ivx.f32438a, kppVar);
                                                                                                        if (bArrM17661I2 != null) {
                                                                                                            HalAfMetadata halAfMetadataM4958h = frameMetadata.m4958h();
                                                                                                            Pair pairM17716b = ntw.m17716b(bArrM17661I2);
                                                                                                            GcamModuleJNI.HalAfMetadata_SetAfTargetFocusInfoFromBytes(halAfMetadataM4958h.f8287a, halAfMetadataM4958h, nsd.m17642a(new nsd(((Long) pairM17716b.second).longValue())), ((ByteBuffer) pairM17716b.first).capacity());
                                                                                                        }
                                                                                                    } catch (RuntimeException e15) {
                                                                                                        runtimeException = e15;
                                                                                                        str5 = "bgstats";
                                                                                                        Log.e(f44463a, "Exception in converting to Gcam FrameMetadata at ".concat(str5), runtimeException);
                                                                                                    }
                                                                                                } else {
                                                                                                    if (frameMetadata.m4960j() != nse.f44367f) {
                                                                                                        GcamModuleJNI.ApplySensorBinning__SWIG_0(2, true, false, FrameMetadata.m4951b(frameMetadata), frameMetadata);
                                                                                                    } else {
                                                                                                        GcamModuleJNI.ApplySensorBinning__SWIG_0(2, true, false, FrameMetadata.m4951b(frameMetadata), frameMetadata);
                                                                                                    }
                                                                                                    str5 = "halaf";
                                                                                                    bArrM17661I = m17661I(ivx.f32439b, kppVar);
                                                                                                    if (bArrM17661I != null) {
                                                                                                        ntw.m17717c(bArrM17661I, frameMetadata.m4958h());
                                                                                                    }
                                                                                                    bArrM17661I2 = m17661I(ivx.f32438a, kppVar);
                                                                                                    if (bArrM17661I2 != null) {
                                                                                                        HalAfMetadata halAfMetadataM4958h2 = frameMetadata.m4958h();
                                                                                                        Pair pairM17716b2 = ntw.m17716b(bArrM17661I2);
                                                                                                        GcamModuleJNI.HalAfMetadata_SetAfTargetFocusInfoFromBytes(halAfMetadataM4958h2.f8287a, halAfMetadataM4958h2, nsd.m17642a(new nsd(((Long) pairM17716b2.second).longValue())), ((ByteBuffer) pairM17716b2.first).capacity());
                                                                                                    }
                                                                                                }
                                                                                            } else {
                                                                                                nrrVar = nrrVarArr2[iIntValue4];
                                                                                                if (nrrVar.f44284e != iIntValue4) {
                                                                                                    while (true) {
                                                                                                        nrrVarArr = nrr.f44283d;
                                                                                                        if (i5 < 3) {
                                                                                                            throw new IllegalArgumentException(str2 + nrr.class.toString() + str9 + iIntValue4);
                                                                                                        }
                                                                                                        nrrVar = nrrVarArr[i5];
                                                                                                        if (nrrVar.f44284e == iIntValue4) {
                                                                                                            i5++;
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                GcamModuleJNI.FrameMetadata_lens_state_set(frameMetadata.f8263a, frameMetadata, nrrVar.f44284e);
                                                                                                str4 = "bgstats";
                                                                                                key4 = ivt.f32366t;
                                                                                                if (key4 != null) {
                                                                                                    bArr2 = (byte[]) kppVar.mo9517d(key4);
                                                                                                    if (bArr2 != null) {
                                                                                                        ByteBuffer byteBufferOrder2 = ByteBuffer.allocateDirect(bArr2.length).order(ByteOrder.nativeOrder());
                                                                                                        byteBufferOrder2.put(bArr2);
                                                                                                        IspAwbMetadata ispAwbMetadata2 = new IspAwbMetadata(GcamModuleJNI.DeserializeFromBytes(nsd.m17642a(new nsd(BufferUtils.m4902a(byteBufferOrder2))), byteBufferOrder2.capacity()));
                                                                                                        GcamModuleJNI.FrameMetadata_isp_metadata_set(frameMetadata.f8263a, frameMetadata, ispAwbMetadata2.f8306a, ispAwbMetadata2);
                                                                                                    }
                                                                                                    if (frameMetadata.m4960j() != nse.f44367f) {
                                                                                                        GcamModuleJNI.ApplySensorBinning__SWIG_0(2, true, false, FrameMetadata.m4951b(frameMetadata), frameMetadata);
                                                                                                    } else {
                                                                                                        GcamModuleJNI.ApplySensorBinning__SWIG_0(2, true, false, FrameMetadata.m4951b(frameMetadata), frameMetadata);
                                                                                                    }
                                                                                                    str5 = "halaf";
                                                                                                    bArrM17661I = m17661I(ivx.f32439b, kppVar);
                                                                                                    if (bArrM17661I != null) {
                                                                                                        ntw.m17717c(bArrM17661I, frameMetadata.m4958h());
                                                                                                    }
                                                                                                    bArrM17661I2 = m17661I(ivx.f32438a, kppVar);
                                                                                                    if (bArrM17661I2 != null) {
                                                                                                        HalAfMetadata halAfMetadataM4958h3 = frameMetadata.m4958h();
                                                                                                        Pair pairM17716b3 = ntw.m17716b(bArrM17661I2);
                                                                                                        GcamModuleJNI.HalAfMetadata_SetAfTargetFocusInfoFromBytes(halAfMetadataM4958h3.f8287a, halAfMetadataM4958h3, nsd.m17642a(new nsd(((Long) pairM17716b3.second).longValue())), ((ByteBuffer) pairM17716b3.first).capacity());
                                                                                                    }
                                                                                                } else {
                                                                                                    if (frameMetadata.m4960j() != nse.f44367f) {
                                                                                                        GcamModuleJNI.ApplySensorBinning__SWIG_0(2, true, false, FrameMetadata.m4951b(frameMetadata), frameMetadata);
                                                                                                    } else {
                                                                                                        GcamModuleJNI.ApplySensorBinning__SWIG_0(2, true, false, FrameMetadata.m4951b(frameMetadata), frameMetadata);
                                                                                                    }
                                                                                                    str5 = "halaf";
                                                                                                    bArrM17661I = m17661I(ivx.f32439b, kppVar);
                                                                                                    if (bArrM17661I != null) {
                                                                                                        ntw.m17717c(bArrM17661I, frameMetadata.m4958h());
                                                                                                    }
                                                                                                    bArrM17661I2 = m17661I(ivx.f32438a, kppVar);
                                                                                                    if (bArrM17661I2 != null) {
                                                                                                        HalAfMetadata halAfMetadataM4958h4 = frameMetadata.m4958h();
                                                                                                        Pair pairM17716b4 = ntw.m17716b(bArrM17661I2);
                                                                                                        GcamModuleJNI.HalAfMetadata_SetAfTargetFocusInfoFromBytes(halAfMetadataM4958h4.f8287a, halAfMetadataM4958h4, nsd.m17642a(new nsd(((Long) pairM17716b4.second).longValue())), ((ByteBuffer) pairM17716b4.first).capacity());
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        } else {
                                                                                            str4 = "bgstats";
                                                                                            key4 = ivt.f32366t;
                                                                                            if (key4 != null) {
                                                                                                bArr2 = (byte[]) kppVar.mo9517d(key4);
                                                                                                if (bArr2 != null) {
                                                                                                    ByteBuffer byteBufferOrder3 = ByteBuffer.allocateDirect(bArr2.length).order(ByteOrder.nativeOrder());
                                                                                                    byteBufferOrder3.put(bArr2);
                                                                                                    IspAwbMetadata ispAwbMetadata3 = new IspAwbMetadata(GcamModuleJNI.DeserializeFromBytes(nsd.m17642a(new nsd(BufferUtils.m4902a(byteBufferOrder3))), byteBufferOrder3.capacity()));
                                                                                                    GcamModuleJNI.FrameMetadata_isp_metadata_set(frameMetadata.f8263a, frameMetadata, ispAwbMetadata3.f8306a, ispAwbMetadata3);
                                                                                                }
                                                                                                if (frameMetadata.m4960j() != nse.f44367f) {
                                                                                                    GcamModuleJNI.ApplySensorBinning__SWIG_0(2, true, false, FrameMetadata.m4951b(frameMetadata), frameMetadata);
                                                                                                } else {
                                                                                                    GcamModuleJNI.ApplySensorBinning__SWIG_0(2, true, false, FrameMetadata.m4951b(frameMetadata), frameMetadata);
                                                                                                }
                                                                                                str5 = "halaf";
                                                                                                bArrM17661I = m17661I(ivx.f32439b, kppVar);
                                                                                                if (bArrM17661I != null) {
                                                                                                    ntw.m17717c(bArrM17661I, frameMetadata.m4958h());
                                                                                                }
                                                                                                bArrM17661I2 = m17661I(ivx.f32438a, kppVar);
                                                                                                if (bArrM17661I2 != null) {
                                                                                                    HalAfMetadata halAfMetadataM4958h5 = frameMetadata.m4958h();
                                                                                                    Pair pairM17716b5 = ntw.m17716b(bArrM17661I2);
                                                                                                    GcamModuleJNI.HalAfMetadata_SetAfTargetFocusInfoFromBytes(halAfMetadataM4958h5.f8287a, halAfMetadataM4958h5, nsd.m17642a(new nsd(((Long) pairM17716b5.second).longValue())), ((ByteBuffer) pairM17716b5.first).capacity());
                                                                                                }
                                                                                            } else {
                                                                                                if (frameMetadata.m4960j() != nse.f44367f) {
                                                                                                    GcamModuleJNI.ApplySensorBinning__SWIG_0(2, true, false, FrameMetadata.m4951b(frameMetadata), frameMetadata);
                                                                                                } else {
                                                                                                    GcamModuleJNI.ApplySensorBinning__SWIG_0(2, true, false, FrameMetadata.m4951b(frameMetadata), frameMetadata);
                                                                                                }
                                                                                                str5 = "halaf";
                                                                                                bArrM17661I = m17661I(ivx.f32439b, kppVar);
                                                                                                if (bArrM17661I != null) {
                                                                                                    ntw.m17717c(bArrM17661I, frameMetadata.m4958h());
                                                                                                }
                                                                                                bArrM17661I2 = m17661I(ivx.f32438a, kppVar);
                                                                                                if (bArrM17661I2 != null) {
                                                                                                    HalAfMetadata halAfMetadataM4958h6 = frameMetadata.m4958h();
                                                                                                    Pair pairM17716b6 = ntw.m17716b(bArrM17661I2);
                                                                                                    GcamModuleJNI.HalAfMetadata_SetAfTargetFocusInfoFromBytes(halAfMetadataM4958h6.f8287a, halAfMetadataM4958h6, nsd.m17642a(new nsd(((Long) pairM17716b6.second).longValue())), ((ByteBuffer) pairM17716b6.first).capacity());
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    } else {
                                                                                        i7 = 0;
                                                                                    }
                                                                                }
                                                                                while (true) {
                                                                                    try {
                                                                                        nqyVarArr = nqy.f44117h;
                                                                                        if (i7 >= 7) {
                                                                                            String str10 = str9;
                                                                                            throw new IllegalArgumentException(str2 + nqy.class.toString() + str10 + iIntValue3);
                                                                                        }
                                                                                        nqyVar2 = nqyVarArr[i7];
                                                                                        if (nqyVar2.f44118i == iIntValue3) {
                                                                                            nqyVar = nqyVar2;
                                                                                        } else {
                                                                                            i7++;
                                                                                        }
                                                                                    } catch (RuntimeException e16) {
                                                                                        runtimeException = e16;
                                                                                    }
                                                                                }
                                                                                GcamModuleJNI.AeMetadata_state_set(aeMetadataM4954d.f8221a, aeMetadataM4954d, nqyVar.f44118i);
                                                                                num2 = (Integer) kppVar.mo9517d(CaptureResult.CONTROL_AE_PRECAPTURE_TRIGGER);
                                                                                if (num2 != null) {
                                                                                    GcamModuleJNI.AeMetadata_precapture_trigger_set(aeMetadataM4954d.f8221a, aeMetadataM4954d, num2.intValue());
                                                                                }
                                                                                GcamModuleJNI.AeMetadata_exposure_compensation_set(aeMetadataM4954d.f8221a, aeMetadataM4954d, m17678a(((Integer) kppVar.mo9517d(CaptureResult.CONTROL_AE_EXPOSURE_COMPENSATION)).intValue()));
                                                                                AwbMetadata awbMetadataM4956f3 = frameMetadata.m4956f();
                                                                                GcamModuleJNI.AwbMetadata_mode_set(awbMetadataM4956f3.f8231a, awbMetadataM4956f3, ((Integer) kppVar.mo9517d(CaptureResult.CONTROL_AWB_MODE)).intValue());
                                                                                GcamModuleJNI.AwbMetadata_lock_set(awbMetadataM4956f3.f8231a, awbMetadataM4956f3, ((Boolean) kppVar.mo9517d(CaptureResult.CONTROL_AWB_LOCK)).booleanValue());
                                                                                GcamModuleJNI.AwbMetadata_state_set(awbMetadataM4956f3.f8231a, awbMetadataM4956f3, ((Integer) kppVar.mo9517d(CaptureResult.CONTROL_AWB_STATE)).intValue());
                                                                                AfMetadata afMetadataM4955e3 = frameMetadata.m4955e();
                                                                                afMetadataM4955e3.m4896b(nra.m17629a(((Integer) kppVar.mo9517d(CaptureResult.CONTROL_AF_MODE)).intValue()));
                                                                                afMetadataM4955e3.m4897c(nrb.m17630a(((Integer) kppVar.mo9517d(CaptureResult.CONTROL_AF_STATE)).intValue()));
                                                                                afMetadataM4955e3.m4898d(((Integer) kppVar.mo9517d(CaptureResult.CONTROL_AF_TRIGGER)).intValue());
                                                                                num3 = (Integer) kppVar.mo9517d(CaptureResult.LENS_STATE);
                                                                                if (num3 != null) {
                                                                                    iIntValue4 = num3.intValue();
                                                                                    nrr[] nrrVarArr3 = nrr.f44283d;
                                                                                    if (iIntValue4 < 3) {
                                                                                        while (true) {
                                                                                            nrrVarArr = nrr.f44283d;
                                                                                            if (i5 < 3) {
                                                                                                throw new IllegalArgumentException(str2 + nrr.class.toString() + str9 + iIntValue4);
                                                                                            }
                                                                                            nrrVar = nrrVarArr[i5];
                                                                                            if (nrrVar.f44284e == iIntValue4) {
                                                                                                i5++;
                                                                                            }
                                                                                        }
                                                                                        GcamModuleJNI.FrameMetadata_lens_state_set(frameMetadata.f8263a, frameMetadata, nrrVar.f44284e);
                                                                                        str4 = "bgstats";
                                                                                        key4 = ivt.f32366t;
                                                                                        if (key4 != null) {
                                                                                            bArr2 = (byte[]) kppVar.mo9517d(key4);
                                                                                            if (bArr2 != null) {
                                                                                                ByteBuffer byteBufferOrder4 = ByteBuffer.allocateDirect(bArr2.length).order(ByteOrder.nativeOrder());
                                                                                                byteBufferOrder4.put(bArr2);
                                                                                                IspAwbMetadata ispAwbMetadata4 = new IspAwbMetadata(GcamModuleJNI.DeserializeFromBytes(nsd.m17642a(new nsd(BufferUtils.m4902a(byteBufferOrder4))), byteBufferOrder4.capacity()));
                                                                                                GcamModuleJNI.FrameMetadata_isp_metadata_set(frameMetadata.f8263a, frameMetadata, ispAwbMetadata4.f8306a, ispAwbMetadata4);
                                                                                            }
                                                                                            if (frameMetadata.m4960j() != nse.f44367f) {
                                                                                                GcamModuleJNI.ApplySensorBinning__SWIG_0(2, true, false, FrameMetadata.m4951b(frameMetadata), frameMetadata);
                                                                                            } else {
                                                                                                GcamModuleJNI.ApplySensorBinning__SWIG_0(2, true, false, FrameMetadata.m4951b(frameMetadata), frameMetadata);
                                                                                            }
                                                                                            str5 = "halaf";
                                                                                            bArrM17661I = m17661I(ivx.f32439b, kppVar);
                                                                                            if (bArrM17661I != null) {
                                                                                                ntw.m17717c(bArrM17661I, frameMetadata.m4958h());
                                                                                            }
                                                                                            bArrM17661I2 = m17661I(ivx.f32438a, kppVar);
                                                                                            if (bArrM17661I2 != null) {
                                                                                                HalAfMetadata halAfMetadataM4958h7 = frameMetadata.m4958h();
                                                                                                Pair pairM17716b7 = ntw.m17716b(bArrM17661I2);
                                                                                                GcamModuleJNI.HalAfMetadata_SetAfTargetFocusInfoFromBytes(halAfMetadataM4958h7.f8287a, halAfMetadataM4958h7, nsd.m17642a(new nsd(((Long) pairM17716b7.second).longValue())), ((ByteBuffer) pairM17716b7.first).capacity());
                                                                                            }
                                                                                        } else {
                                                                                            if (frameMetadata.m4960j() != nse.f44367f) {
                                                                                                GcamModuleJNI.ApplySensorBinning__SWIG_0(2, true, false, FrameMetadata.m4951b(frameMetadata), frameMetadata);
                                                                                            } else {
                                                                                                GcamModuleJNI.ApplySensorBinning__SWIG_0(2, true, false, FrameMetadata.m4951b(frameMetadata), frameMetadata);
                                                                                            }
                                                                                            str5 = "halaf";
                                                                                            bArrM17661I = m17661I(ivx.f32439b, kppVar);
                                                                                            if (bArrM17661I != null) {
                                                                                                ntw.m17717c(bArrM17661I, frameMetadata.m4958h());
                                                                                            }
                                                                                            bArrM17661I2 = m17661I(ivx.f32438a, kppVar);
                                                                                            if (bArrM17661I2 != null) {
                                                                                                HalAfMetadata halAfMetadataM4958h8 = frameMetadata.m4958h();
                                                                                                Pair pairM17716b8 = ntw.m17716b(bArrM17661I2);
                                                                                                GcamModuleJNI.HalAfMetadata_SetAfTargetFocusInfoFromBytes(halAfMetadataM4958h8.f8287a, halAfMetadataM4958h8, nsd.m17642a(new nsd(((Long) pairM17716b8.second).longValue())), ((ByteBuffer) pairM17716b8.first).capacity());
                                                                                            }
                                                                                        }
                                                                                    } else {
                                                                                        while (true) {
                                                                                            nrrVarArr = nrr.f44283d;
                                                                                            if (i5 < 3) {
                                                                                                throw new IllegalArgumentException(str2 + nrr.class.toString() + str9 + iIntValue4);
                                                                                            }
                                                                                            nrrVar = nrrVarArr[i5];
                                                                                            if (nrrVar.f44284e == iIntValue4) {
                                                                                                i5++;
                                                                                            }
                                                                                        }
                                                                                        GcamModuleJNI.FrameMetadata_lens_state_set(frameMetadata.f8263a, frameMetadata, nrrVar.f44284e);
                                                                                        str4 = "bgstats";
                                                                                        key4 = ivt.f32366t;
                                                                                        if (key4 != null) {
                                                                                            bArr2 = (byte[]) kppVar.mo9517d(key4);
                                                                                            if (bArr2 != null) {
                                                                                                ByteBuffer byteBufferOrder5 = ByteBuffer.allocateDirect(bArr2.length).order(ByteOrder.nativeOrder());
                                                                                                byteBufferOrder5.put(bArr2);
                                                                                                IspAwbMetadata ispAwbMetadata5 = new IspAwbMetadata(GcamModuleJNI.DeserializeFromBytes(nsd.m17642a(new nsd(BufferUtils.m4902a(byteBufferOrder5))), byteBufferOrder5.capacity()));
                                                                                                GcamModuleJNI.FrameMetadata_isp_metadata_set(frameMetadata.f8263a, frameMetadata, ispAwbMetadata5.f8306a, ispAwbMetadata5);
                                                                                            }
                                                                                            if (frameMetadata.m4960j() != nse.f44367f) {
                                                                                                GcamModuleJNI.ApplySensorBinning__SWIG_0(2, true, false, FrameMetadata.m4951b(frameMetadata), frameMetadata);
                                                                                            } else {
                                                                                                GcamModuleJNI.ApplySensorBinning__SWIG_0(2, true, false, FrameMetadata.m4951b(frameMetadata), frameMetadata);
                                                                                            }
                                                                                            str5 = "halaf";
                                                                                            bArrM17661I = m17661I(ivx.f32439b, kppVar);
                                                                                            if (bArrM17661I != null) {
                                                                                                ntw.m17717c(bArrM17661I, frameMetadata.m4958h());
                                                                                            }
                                                                                            bArrM17661I2 = m17661I(ivx.f32438a, kppVar);
                                                                                            if (bArrM17661I2 != null) {
                                                                                                HalAfMetadata halAfMetadataM4958h9 = frameMetadata.m4958h();
                                                                                                Pair pairM17716b9 = ntw.m17716b(bArrM17661I2);
                                                                                                GcamModuleJNI.HalAfMetadata_SetAfTargetFocusInfoFromBytes(halAfMetadataM4958h9.f8287a, halAfMetadataM4958h9, nsd.m17642a(new nsd(((Long) pairM17716b9.second).longValue())), ((ByteBuffer) pairM17716b9.first).capacity());
                                                                                            }
                                                                                        } else {
                                                                                            if (frameMetadata.m4960j() != nse.f44367f) {
                                                                                                GcamModuleJNI.ApplySensorBinning__SWIG_0(2, true, false, FrameMetadata.m4951b(frameMetadata), frameMetadata);
                                                                                            } else {
                                                                                                GcamModuleJNI.ApplySensorBinning__SWIG_0(2, true, false, FrameMetadata.m4951b(frameMetadata), frameMetadata);
                                                                                            }
                                                                                            str5 = "halaf";
                                                                                            bArrM17661I = m17661I(ivx.f32439b, kppVar);
                                                                                            if (bArrM17661I != null) {
                                                                                                ntw.m17717c(bArrM17661I, frameMetadata.m4958h());
                                                                                            }
                                                                                            bArrM17661I2 = m17661I(ivx.f32438a, kppVar);
                                                                                            if (bArrM17661I2 != null) {
                                                                                                HalAfMetadata halAfMetadataM4958h10 = frameMetadata.m4958h();
                                                                                                Pair pairM17716b10 = ntw.m17716b(bArrM17661I2);
                                                                                                GcamModuleJNI.HalAfMetadata_SetAfTargetFocusInfoFromBytes(halAfMetadataM4958h10.f8287a, halAfMetadataM4958h10, nsd.m17642a(new nsd(((Long) pairM17716b10.second).longValue())), ((ByteBuffer) pairM17716b10.first).capacity());
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                } else {
                                                                                    str4 = "bgstats";
                                                                                    key4 = ivt.f32366t;
                                                                                    if (key4 != null) {
                                                                                        bArr2 = (byte[]) kppVar.mo9517d(key4);
                                                                                        if (bArr2 != null) {
                                                                                            ByteBuffer byteBufferOrder6 = ByteBuffer.allocateDirect(bArr2.length).order(ByteOrder.nativeOrder());
                                                                                            byteBufferOrder6.put(bArr2);
                                                                                            IspAwbMetadata ispAwbMetadata6 = new IspAwbMetadata(GcamModuleJNI.DeserializeFromBytes(nsd.m17642a(new nsd(BufferUtils.m4902a(byteBufferOrder6))), byteBufferOrder6.capacity()));
                                                                                            GcamModuleJNI.FrameMetadata_isp_metadata_set(frameMetadata.f8263a, frameMetadata, ispAwbMetadata6.f8306a, ispAwbMetadata6);
                                                                                        }
                                                                                        if (frameMetadata.m4960j() != nse.f44367f) {
                                                                                            GcamModuleJNI.ApplySensorBinning__SWIG_0(2, true, false, FrameMetadata.m4951b(frameMetadata), frameMetadata);
                                                                                        } else {
                                                                                            GcamModuleJNI.ApplySensorBinning__SWIG_0(2, true, false, FrameMetadata.m4951b(frameMetadata), frameMetadata);
                                                                                        }
                                                                                        str5 = "halaf";
                                                                                        bArrM17661I = m17661I(ivx.f32439b, kppVar);
                                                                                        if (bArrM17661I != null) {
                                                                                            ntw.m17717c(bArrM17661I, frameMetadata.m4958h());
                                                                                        }
                                                                                        bArrM17661I2 = m17661I(ivx.f32438a, kppVar);
                                                                                        if (bArrM17661I2 != null) {
                                                                                            HalAfMetadata halAfMetadataM4958h11 = frameMetadata.m4958h();
                                                                                            Pair pairM17716b11 = ntw.m17716b(bArrM17661I2);
                                                                                            GcamModuleJNI.HalAfMetadata_SetAfTargetFocusInfoFromBytes(halAfMetadataM4958h11.f8287a, halAfMetadataM4958h11, nsd.m17642a(new nsd(((Long) pairM17716b11.second).longValue())), ((ByteBuffer) pairM17716b11.first).capacity());
                                                                                        }
                                                                                    } else {
                                                                                        if (frameMetadata.m4960j() != nse.f44367f) {
                                                                                            GcamModuleJNI.ApplySensorBinning__SWIG_0(2, true, false, FrameMetadata.m4951b(frameMetadata), frameMetadata);
                                                                                        } else {
                                                                                            GcamModuleJNI.ApplySensorBinning__SWIG_0(2, true, false, FrameMetadata.m4951b(frameMetadata), frameMetadata);
                                                                                        }
                                                                                        str5 = "halaf";
                                                                                        bArrM17661I = m17661I(ivx.f32439b, kppVar);
                                                                                        if (bArrM17661I != null) {
                                                                                            ntw.m17717c(bArrM17661I, frameMetadata.m4958h());
                                                                                        }
                                                                                        bArrM17661I2 = m17661I(ivx.f32438a, kppVar);
                                                                                        if (bArrM17661I2 != null) {
                                                                                            HalAfMetadata halAfMetadataM4958h12 = frameMetadata.m4958h();
                                                                                            Pair pairM17716b12 = ntw.m17716b(bArrM17661I2);
                                                                                            GcamModuleJNI.HalAfMetadata_SetAfTargetFocusInfoFromBytes(halAfMetadataM4958h12.f8287a, halAfMetadataM4958h12, nsd.m17642a(new nsd(((Long) pairM17716b12.second).longValue())), ((ByteBuffer) pairM17716b12.first).capacity());
                                                                                        }
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                i6 = 0;
                                                                            }
                                                                        }
                                                                        while (true) {
                                                                            try {
                                                                                nrfVarArr = nrf.f44179g;
                                                                                if (i6 >= 6) {
                                                                                    throw new IllegalArgumentException(str2 + nrf.class.toString() + str9 + iIntValue2);
                                                                                }
                                                                                try {
                                                                                    nrfVar2 = nrfVarArr[i6];
                                                                                    if (nrfVar2.f44180h == iIntValue2) {
                                                                                        nrfVar = nrfVar2;
                                                                                    } else {
                                                                                        try {
                                                                                            i6++;
                                                                                        } catch (RuntimeException e17) {
                                                                                            runtimeException = e17;
                                                                                        }
                                                                                    }
                                                                                } catch (RuntimeException e18) {
                                                                                    runtimeException = e18;
                                                                                }
                                                                            } catch (RuntimeException e19) {
                                                                                runtimeException = e19;
                                                                            }
                                                                        }
                                                                        GcamModuleJNI.FrameMetadata_control_mode_set(frameMetadata.f8263a, frameMetadata, nrfVar.f44180h);
                                                                        aeMetadataM4954d = frameMetadata.m4954d();
                                                                        GcamModuleJNI.AeMetadata_mode_set(aeMetadataM4954d.f8221a, aeMetadataM4954d, nqx.m17628a(((Integer) kppVar.mo9517d(CaptureResult.CONTROL_AE_MODE)).intValue()).f44108h);
                                                                        GcamModuleJNI.AeMetadata_lock_set(aeMetadataM4954d.f8221a, aeMetadataM4954d, ((Boolean) kppVar.mo9517d(CaptureResult.CONTROL_AE_LOCK)).booleanValue());
                                                                        iIntValue3 = ((Integer) kppVar.mo9517d(CaptureResult.CONTROL_AE_STATE)).intValue();
                                                                        nqy[] nqyVarArr3 = nqy.f44117h;
                                                                        if (iIntValue3 < 7) {
                                                                            i7 = 0;
                                                                            while (true) {
                                                                                nqyVarArr = nqy.f44117h;
                                                                                if (i7 >= 7) {
                                                                                    String str11 = str9;
                                                                                    throw new IllegalArgumentException(str2 + nqy.class.toString() + str11 + iIntValue3);
                                                                                }
                                                                                nqyVar2 = nqyVarArr[i7];
                                                                                if (nqyVar2.f44118i == iIntValue3) {
                                                                                    nqyVar = nqyVar2;
                                                                                } else {
                                                                                    i7++;
                                                                                }
                                                                            }
                                                                        } else {
                                                                            i7 = 0;
                                                                            while (true) {
                                                                                nqyVarArr = nqy.f44117h;
                                                                                if (i7 >= 7) {
                                                                                    String str12 = str9;
                                                                                    throw new IllegalArgumentException(str2 + nqy.class.toString() + str12 + iIntValue3);
                                                                                }
                                                                                nqyVar2 = nqyVarArr[i7];
                                                                                if (nqyVar2.f44118i == iIntValue3) {
                                                                                    nqyVar = nqyVar2;
                                                                                } else {
                                                                                    i7++;
                                                                                }
                                                                            }
                                                                        }
                                                                        GcamModuleJNI.AeMetadata_state_set(aeMetadataM4954d.f8221a, aeMetadataM4954d, nqyVar.f44118i);
                                                                        num2 = (Integer) kppVar.mo9517d(CaptureResult.CONTROL_AE_PRECAPTURE_TRIGGER);
                                                                        if (num2 != null) {
                                                                            GcamModuleJNI.AeMetadata_precapture_trigger_set(aeMetadataM4954d.f8221a, aeMetadataM4954d, num2.intValue());
                                                                        }
                                                                        GcamModuleJNI.AeMetadata_exposure_compensation_set(aeMetadataM4954d.f8221a, aeMetadataM4954d, m17678a(((Integer) kppVar.mo9517d(CaptureResult.CONTROL_AE_EXPOSURE_COMPENSATION)).intValue()));
                                                                        AwbMetadata awbMetadataM4956f4 = frameMetadata.m4956f();
                                                                        GcamModuleJNI.AwbMetadata_mode_set(awbMetadataM4956f4.f8231a, awbMetadataM4956f4, ((Integer) kppVar.mo9517d(CaptureResult.CONTROL_AWB_MODE)).intValue());
                                                                        GcamModuleJNI.AwbMetadata_lock_set(awbMetadataM4956f4.f8231a, awbMetadataM4956f4, ((Boolean) kppVar.mo9517d(CaptureResult.CONTROL_AWB_LOCK)).booleanValue());
                                                                        GcamModuleJNI.AwbMetadata_state_set(awbMetadataM4956f4.f8231a, awbMetadataM4956f4, ((Integer) kppVar.mo9517d(CaptureResult.CONTROL_AWB_STATE)).intValue());
                                                                        AfMetadata afMetadataM4955e4 = frameMetadata.m4955e();
                                                                        afMetadataM4955e4.m4896b(nra.m17629a(((Integer) kppVar.mo9517d(CaptureResult.CONTROL_AF_MODE)).intValue()));
                                                                        afMetadataM4955e4.m4897c(nrb.m17630a(((Integer) kppVar.mo9517d(CaptureResult.CONTROL_AF_STATE)).intValue()));
                                                                        afMetadataM4955e4.m4898d(((Integer) kppVar.mo9517d(CaptureResult.CONTROL_AF_TRIGGER)).intValue());
                                                                        num3 = (Integer) kppVar.mo9517d(CaptureResult.LENS_STATE);
                                                                        if (num3 != null) {
                                                                            iIntValue4 = num3.intValue();
                                                                            nrr[] nrrVarArr4 = nrr.f44283d;
                                                                            if (iIntValue4 < 3) {
                                                                                while (true) {
                                                                                    nrrVarArr = nrr.f44283d;
                                                                                    if (i5 < 3) {
                                                                                        throw new IllegalArgumentException(str2 + nrr.class.toString() + str9 + iIntValue4);
                                                                                    }
                                                                                    nrrVar = nrrVarArr[i5];
                                                                                    if (nrrVar.f44284e == iIntValue4) {
                                                                                        i5++;
                                                                                    }
                                                                                }
                                                                                GcamModuleJNI.FrameMetadata_lens_state_set(frameMetadata.f8263a, frameMetadata, nrrVar.f44284e);
                                                                                str4 = "bgstats";
                                                                                key4 = ivt.f32366t;
                                                                                if (key4 != null) {
                                                                                    bArr2 = (byte[]) kppVar.mo9517d(key4);
                                                                                    if (bArr2 != null) {
                                                                                        ByteBuffer byteBufferOrder7 = ByteBuffer.allocateDirect(bArr2.length).order(ByteOrder.nativeOrder());
                                                                                        byteBufferOrder7.put(bArr2);
                                                                                        IspAwbMetadata ispAwbMetadata7 = new IspAwbMetadata(GcamModuleJNI.DeserializeFromBytes(nsd.m17642a(new nsd(BufferUtils.m4902a(byteBufferOrder7))), byteBufferOrder7.capacity()));
                                                                                        GcamModuleJNI.FrameMetadata_isp_metadata_set(frameMetadata.f8263a, frameMetadata, ispAwbMetadata7.f8306a, ispAwbMetadata7);
                                                                                    }
                                                                                    if (frameMetadata.m4960j() != nse.f44367f) {
                                                                                        GcamModuleJNI.ApplySensorBinning__SWIG_0(2, true, false, FrameMetadata.m4951b(frameMetadata), frameMetadata);
                                                                                    } else {
                                                                                        GcamModuleJNI.ApplySensorBinning__SWIG_0(2, true, false, FrameMetadata.m4951b(frameMetadata), frameMetadata);
                                                                                    }
                                                                                    str5 = "halaf";
                                                                                    bArrM17661I = m17661I(ivx.f32439b, kppVar);
                                                                                    if (bArrM17661I != null) {
                                                                                        ntw.m17717c(bArrM17661I, frameMetadata.m4958h());
                                                                                    }
                                                                                    bArrM17661I2 = m17661I(ivx.f32438a, kppVar);
                                                                                    if (bArrM17661I2 != null) {
                                                                                        HalAfMetadata halAfMetadataM4958h13 = frameMetadata.m4958h();
                                                                                        Pair pairM17716b13 = ntw.m17716b(bArrM17661I2);
                                                                                        GcamModuleJNI.HalAfMetadata_SetAfTargetFocusInfoFromBytes(halAfMetadataM4958h13.f8287a, halAfMetadataM4958h13, nsd.m17642a(new nsd(((Long) pairM17716b13.second).longValue())), ((ByteBuffer) pairM17716b13.first).capacity());
                                                                                    }
                                                                                } else {
                                                                                    if (frameMetadata.m4960j() != nse.f44367f) {
                                                                                        GcamModuleJNI.ApplySensorBinning__SWIG_0(2, true, false, FrameMetadata.m4951b(frameMetadata), frameMetadata);
                                                                                    } else {
                                                                                        GcamModuleJNI.ApplySensorBinning__SWIG_0(2, true, false, FrameMetadata.m4951b(frameMetadata), frameMetadata);
                                                                                    }
                                                                                    str5 = "halaf";
                                                                                    bArrM17661I = m17661I(ivx.f32439b, kppVar);
                                                                                    if (bArrM17661I != null) {
                                                                                        ntw.m17717c(bArrM17661I, frameMetadata.m4958h());
                                                                                    }
                                                                                    bArrM17661I2 = m17661I(ivx.f32438a, kppVar);
                                                                                    if (bArrM17661I2 != null) {
                                                                                        HalAfMetadata halAfMetadataM4958h14 = frameMetadata.m4958h();
                                                                                        Pair pairM17716b14 = ntw.m17716b(bArrM17661I2);
                                                                                        GcamModuleJNI.HalAfMetadata_SetAfTargetFocusInfoFromBytes(halAfMetadataM4958h14.f8287a, halAfMetadataM4958h14, nsd.m17642a(new nsd(((Long) pairM17716b14.second).longValue())), ((ByteBuffer) pairM17716b14.first).capacity());
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                while (true) {
                                                                                    nrrVarArr = nrr.f44283d;
                                                                                    if (i5 < 3) {
                                                                                        throw new IllegalArgumentException(str2 + nrr.class.toString() + str9 + iIntValue4);
                                                                                    }
                                                                                    nrrVar = nrrVarArr[i5];
                                                                                    if (nrrVar.f44284e == iIntValue4) {
                                                                                        i5++;
                                                                                    }
                                                                                }
                                                                                GcamModuleJNI.FrameMetadata_lens_state_set(frameMetadata.f8263a, frameMetadata, nrrVar.f44284e);
                                                                                str4 = "bgstats";
                                                                                key4 = ivt.f32366t;
                                                                                if (key4 != null) {
                                                                                    bArr2 = (byte[]) kppVar.mo9517d(key4);
                                                                                    if (bArr2 != null) {
                                                                                        ByteBuffer byteBufferOrder8 = ByteBuffer.allocateDirect(bArr2.length).order(ByteOrder.nativeOrder());
                                                                                        byteBufferOrder8.put(bArr2);
                                                                                        IspAwbMetadata ispAwbMetadata8 = new IspAwbMetadata(GcamModuleJNI.DeserializeFromBytes(nsd.m17642a(new nsd(BufferUtils.m4902a(byteBufferOrder8))), byteBufferOrder8.capacity()));
                                                                                        GcamModuleJNI.FrameMetadata_isp_metadata_set(frameMetadata.f8263a, frameMetadata, ispAwbMetadata8.f8306a, ispAwbMetadata8);
                                                                                    }
                                                                                    if (frameMetadata.m4960j() != nse.f44367f) {
                                                                                        GcamModuleJNI.ApplySensorBinning__SWIG_0(2, true, false, FrameMetadata.m4951b(frameMetadata), frameMetadata);
                                                                                    } else {
                                                                                        GcamModuleJNI.ApplySensorBinning__SWIG_0(2, true, false, FrameMetadata.m4951b(frameMetadata), frameMetadata);
                                                                                    }
                                                                                    str5 = "halaf";
                                                                                    bArrM17661I = m17661I(ivx.f32439b, kppVar);
                                                                                    if (bArrM17661I != null) {
                                                                                        ntw.m17717c(bArrM17661I, frameMetadata.m4958h());
                                                                                    }
                                                                                    bArrM17661I2 = m17661I(ivx.f32438a, kppVar);
                                                                                    if (bArrM17661I2 != null) {
                                                                                        HalAfMetadata halAfMetadataM4958h15 = frameMetadata.m4958h();
                                                                                        Pair pairM17716b15 = ntw.m17716b(bArrM17661I2);
                                                                                        GcamModuleJNI.HalAfMetadata_SetAfTargetFocusInfoFromBytes(halAfMetadataM4958h15.f8287a, halAfMetadataM4958h15, nsd.m17642a(new nsd(((Long) pairM17716b15.second).longValue())), ((ByteBuffer) pairM17716b15.first).capacity());
                                                                                    }
                                                                                } else {
                                                                                    if (frameMetadata.m4960j() != nse.f44367f) {
                                                                                        GcamModuleJNI.ApplySensorBinning__SWIG_0(2, true, false, FrameMetadata.m4951b(frameMetadata), frameMetadata);
                                                                                    } else {
                                                                                        GcamModuleJNI.ApplySensorBinning__SWIG_0(2, true, false, FrameMetadata.m4951b(frameMetadata), frameMetadata);
                                                                                    }
                                                                                    str5 = "halaf";
                                                                                    bArrM17661I = m17661I(ivx.f32439b, kppVar);
                                                                                    if (bArrM17661I != null) {
                                                                                        ntw.m17717c(bArrM17661I, frameMetadata.m4958h());
                                                                                    }
                                                                                    bArrM17661I2 = m17661I(ivx.f32438a, kppVar);
                                                                                    if (bArrM17661I2 != null) {
                                                                                        HalAfMetadata halAfMetadataM4958h16 = frameMetadata.m4958h();
                                                                                        Pair pairM17716b16 = ntw.m17716b(bArrM17661I2);
                                                                                        GcamModuleJNI.HalAfMetadata_SetAfTargetFocusInfoFromBytes(halAfMetadataM4958h16.f8287a, halAfMetadataM4958h16, nsd.m17642a(new nsd(((Long) pairM17716b16.second).longValue())), ((ByteBuffer) pairM17716b16.first).capacity());
                                                                                    }
                                                                                }
                                                                            }
                                                                        } else {
                                                                            str4 = "bgstats";
                                                                            key4 = ivt.f32366t;
                                                                            if (key4 != null) {
                                                                                bArr2 = (byte[]) kppVar.mo9517d(key4);
                                                                                if (bArr2 != null) {
                                                                                    ByteBuffer byteBufferOrder9 = ByteBuffer.allocateDirect(bArr2.length).order(ByteOrder.nativeOrder());
                                                                                    byteBufferOrder9.put(bArr2);
                                                                                    IspAwbMetadata ispAwbMetadata9 = new IspAwbMetadata(GcamModuleJNI.DeserializeFromBytes(nsd.m17642a(new nsd(BufferUtils.m4902a(byteBufferOrder9))), byteBufferOrder9.capacity()));
                                                                                    GcamModuleJNI.FrameMetadata_isp_metadata_set(frameMetadata.f8263a, frameMetadata, ispAwbMetadata9.f8306a, ispAwbMetadata9);
                                                                                }
                                                                                if (frameMetadata.m4960j() != nse.f44367f) {
                                                                                    GcamModuleJNI.ApplySensorBinning__SWIG_0(2, true, false, FrameMetadata.m4951b(frameMetadata), frameMetadata);
                                                                                } else {
                                                                                    GcamModuleJNI.ApplySensorBinning__SWIG_0(2, true, false, FrameMetadata.m4951b(frameMetadata), frameMetadata);
                                                                                }
                                                                                str5 = "halaf";
                                                                                bArrM17661I = m17661I(ivx.f32439b, kppVar);
                                                                                if (bArrM17661I != null) {
                                                                                    ntw.m17717c(bArrM17661I, frameMetadata.m4958h());
                                                                                }
                                                                                bArrM17661I2 = m17661I(ivx.f32438a, kppVar);
                                                                                if (bArrM17661I2 != null) {
                                                                                    HalAfMetadata halAfMetadataM4958h17 = frameMetadata.m4958h();
                                                                                    Pair pairM17716b17 = ntw.m17716b(bArrM17661I2);
                                                                                    GcamModuleJNI.HalAfMetadata_SetAfTargetFocusInfoFromBytes(halAfMetadataM4958h17.f8287a, halAfMetadataM4958h17, nsd.m17642a(new nsd(((Long) pairM17716b17.second).longValue())), ((ByteBuffer) pairM17716b17.first).capacity());
                                                                                }
                                                                            } else {
                                                                                if (frameMetadata.m4960j() != nse.f44367f) {
                                                                                    GcamModuleJNI.ApplySensorBinning__SWIG_0(2, true, false, FrameMetadata.m4951b(frameMetadata), frameMetadata);
                                                                                } else {
                                                                                    GcamModuleJNI.ApplySensorBinning__SWIG_0(2, true, false, FrameMetadata.m4951b(frameMetadata), frameMetadata);
                                                                                }
                                                                                str5 = "halaf";
                                                                                bArrM17661I = m17661I(ivx.f32439b, kppVar);
                                                                                if (bArrM17661I != null) {
                                                                                    ntw.m17717c(bArrM17661I, frameMetadata.m4958h());
                                                                                }
                                                                                bArrM17661I2 = m17661I(ivx.f32438a, kppVar);
                                                                                if (bArrM17661I2 != null) {
                                                                                    HalAfMetadata halAfMetadataM4958h18 = frameMetadata.m4958h();
                                                                                    Pair pairM17716b18 = ntw.m17716b(bArrM17661I2);
                                                                                    GcamModuleJNI.HalAfMetadata_SetAfTargetFocusInfoFromBytes(halAfMetadataM4958h18.f8287a, halAfMetadataM4958h18, nsd.m17642a(new nsd(((Long) pairM17716b18.second).longValue())), ((ByteBuffer) pairM17716b18.first).capacity());
                                                                                }
                                                                            }
                                                                        }
                                                                    } catch (RuntimeException e20) {
                                                                        e = e20;
                                                                        runtimeException = e;
                                                                    }
                                                                } catch (RuntimeException e21) {
                                                                    e = e21;
                                                                    runtimeException = e;
                                                                    str5 = str4;
                                                                }
                                                            } catch (RuntimeException e22) {
                                                                e = e22;
                                                                frameMetadata = frameMetadata;
                                                            }
                                                        } catch (RuntimeException e23) {
                                                            runtimeException = e23;
                                                            str5 = str3;
                                                            frameMetadata = frameMetadata;
                                                        }
                                                    } else {
                                                        GcamModuleJNI.FrameMetadata_was_black_level_locked_set(frameMetadata.f8263a, frameMetadata, bool.booleanValue());
                                                        GcamModuleJNI.FrameMetadata_frame_duration_ms_set(frameMetadata.f8263a, frameMetadata, m17675x(((Long) kppVar.mo9517d(CaptureResult.SENSOR_FRAME_DURATION)).longValue()));
                                                        GcamModuleJNI.FrameMetadata_timestamp_ns_set(frameMetadata.f8263a, frameMetadata, ((Long) kppVar.mo9517d(CaptureResult.SENSOR_TIMESTAMP)).longValue());
                                                        GcamModuleJNI.FrameMetadata_sensor_temp_set(frameMetadata.f8263a, frameMetadata, GcamModuleJNI.kSensorTempUnknown_get());
                                                        SceneFlicker sceneFlicker2 = new SceneFlicker();
                                                        key = ivv.f32398g;
                                                        fIntValue = -1.0f;
                                                        if (key != null) {
                                                            fIntValue2 = -1.0f;
                                                        } else {
                                                            fIntValue2 = -1.0f;
                                                        }
                                                        key2 = ivv.f32399h;
                                                        if (key2 != null) {
                                                            fIntValue = num4.intValue() / 10000.0f;
                                                        }
                                                        if (fIntValue2 >= 0.0f) {
                                                            switch (num.intValue()) {
                                                                case 0:
                                                                    fIntValue2 = 0.0f;
                                                                    fIntValue = 1.0f;
                                                                    break;
                                                                case 1:
                                                                    fIntValue2 = 100.0f;
                                                                    fIntValue = 1.0f;
                                                                    break;
                                                                case 2:
                                                                    fIntValue2 = 120.0f;
                                                                    fIntValue = 1.0f;
                                                                    break;
                                                                default:
                                                                    Log.e(f44463a, BEeWZPor.BZKQtFscIANQJ);
                                                                    break;
                                                            }
                                                        } else {
                                                            switch (num.intValue()) {
                                                                case 0:
                                                                    fIntValue2 = 0.0f;
                                                                    fIntValue = 1.0f;
                                                                    break;
                                                                case 1:
                                                                    fIntValue2 = 100.0f;
                                                                    fIntValue = 1.0f;
                                                                    break;
                                                                case 2:
                                                                    fIntValue2 = 120.0f;
                                                                    fIntValue = 1.0f;
                                                                    break;
                                                                default:
                                                                    Log.e(f44463a, BEeWZPor.BZKQtFscIANQJ);
                                                                    break;
                                                            }
                                                        }
                                                        GcamModuleJNI.SceneFlicker_frequency_set(sceneFlicker2.f8352a, sceneFlicker2, fIntValue2);
                                                        GcamModuleJNI.SceneFlicker_confidence_set(sceneFlicker2.f8352a, sceneFlicker2, fIntValue);
                                                        GcamModuleJNI.FrameMetadata_scene_flicker_set(frameMetadata.f8263a, frameMetadata, sceneFlicker2.f8352a, sceneFlicker2);
                                                        str3 = "noise";
                                                        pairArr = (Pair[]) kppVar.mo9517d(CaptureResult.SENSOR_NOISE_PROFILE);
                                                        floatVector = new FloatVector();
                                                        floatVector2 = new FloatVector();
                                                        while (i3 < i2) {
                                                            floatVector.m4949b(((Double) pairArr[i3].first).floatValue());
                                                            floatVector2.m4949b(((Double) pairArr[i3].second).floatValue());
                                                        }
                                                        NoiseModel noiseModel2 = new NoiseModel(GcamModuleJNI.NoiseModel_FromShotReadNoiseVector(floatVector.f8261a, floatVector, floatVector2.f8261a, floatVector2));
                                                        GcamModuleJNI.FrameMetadata_dng_noise_model_bayer_set(frameMetadata.f8263a, frameMetadata, noiseModel2.f8320a, noiseModel2);
                                                        str5 = "dynamicbl";
                                                        fArr5 = (float[]) kppVar.mo9517d(CaptureResult.SENSOR_DYNAMIC_BLACK_LEVEL);
                                                        if (fArr5 != null) {
                                                            floatArray5 = new FloatArray4();
                                                            while (i9 < floatArray5.m4942b()) {
                                                                floatArray5.m4944d(i9, fArr5[i9]);
                                                            }
                                                            frameMetadata.m4962l(floatArray5);
                                                        } else {
                                                            blackLevelPattern = (BlackLevelPattern) kmdVarM17682f.mo14559l(CameraCharacteristics.SENSOR_BLACK_LEVEL_PATTERN);
                                                            if (blackLevelPattern != null) {
                                                                floatArray4 = new FloatArray4();
                                                                while (i4 < floatArray4.m4942b()) {
                                                                    floatArray4.m4944d(i4, blackLevelPattern.getOffsetForIndex(i4 % 2, i4 / 2));
                                                                }
                                                                frameMetadata.m4962l(floatArray4);
                                                            }
                                                        }
                                                        f = (Float) kppVar.mo9517d(CaptureResult.LENS_FOCUS_DISTANCE);
                                                        Integer num9 = (Integer) kmdVarM17682f.mo14559l(CameraCharacteristics.LENS_INFO_FOCUS_DISTANCE_CALIBRATION);
                                                        if (f != null) {
                                                            GcamModuleJNI.FrameMetadata_focus_distance_diopters_set(frameMetadata.f8263a, frameMetadata, f.floatValue());
                                                        }
                                                        liveHdrMetadata = new LiveHdrMetadata(GcamModuleJNI.new_LiveHdrMetadata(), true);
                                                        aeResults = new AeResults(GcamModuleJNI.new_AeResults(), true);
                                                        if (ivu.f32375c != null) {
                                                            GcamModuleJNI.LiveHdrMetadata_max_hdr_ratio_override_set(liveHdrMetadata.f8311a, liveHdrMetadata, fArr7[0]);
                                                            liveHdrMetadata.m5029c(fArr7[1]);
                                                            liveHdrMetadata.m5028b(fArr7[2]);
                                                            if (!f44464b.f36770c) {
                                                                GcamModuleJNI.LiveHdrMetadata_night_factor_set(liveHdrMetadata.f8311a, liveHdrMetadata, fArr7[3]);
                                                            }
                                                            GcamModuleJNI.LiveHdrMetadata_manual_ec_short_set(liveHdrMetadata.f8311a, liveHdrMetadata, fArr7[i2]);
                                                            GcamModuleJNI.LiveHdrMetadata_manual_portrait_tet_override_set(liveHdrMetadata.f8311a, liveHdrMetadata, fArr7[5]);
                                                        }
                                                        str5 = "gcamae";
                                                        key3 = ivu.f32373a;
                                                        if (key3 != null) {
                                                            AeModeResult aeModeResult4 = new AeModeResult();
                                                            AeModeResult aeModeResult5 = new AeModeResult();
                                                            aeModeResult4.m4880d(fArr6[0]);
                                                            aeModeResult5.m4880d(fArr6[1]);
                                                            aeModeResult4.m4879c(fArr6[2]);
                                                            aeModeResult5.m4879c(fArr6[3]);
                                                            GcamModuleJNI.AeResults_pure_fraction_of_pixels_from_long_exposure_set(aeResults.f8224a, aeResults, fArr6[i2]);
                                                            GcamModuleJNI.AeResults_weighted_fraction_of_pixels_from_long_exposure_set(aeResults.f8224a, aeResults, fArr6[5]);
                                                            GcamModuleJNI.AeModeResult_log_scene_brightness_set(aeModeResult4.f8222a, aeModeResult4, fArr6[6]);
                                                            GcamModuleJNI.AeResults_predicted_image_brightness_set(aeResults.f8224a, aeResults, fArr6[7]);
                                                            GcamModuleJNI.LiveHdrMetadata_motion_magnitude_pix_set(liveHdrMetadata.f8311a, liveHdrMetadata, fArr6[8]);
                                                            GcamModuleJNI.LiveHdrMetadata_metering_interval_ms_set(liveHdrMetadata.f8311a, liveHdrMetadata, fArr6[9]);
                                                            GcamModuleJNI.LiveHdrMetadata_filtered_motion_speed_pix_per_ms_set(liveHdrMetadata.f8311a, liveHdrMetadata, fArr6[10]);
                                                            liveHdrMetadata.m5032f(fArr6[11]);
                                                            liveHdrMetadata.m5030d(fArr6[12]);
                                                            if (length2 > 13) {
                                                                GcamModuleJNI.AeResults_safe_underexposure_set(aeResults.f8224a, aeResults, fArr6[13]);
                                                            }
                                                            if (length2 > 15) {
                                                                AeModeResult aeModeResult6 = new AeModeResult();
                                                                aeModeResult6.m4880d(fArr6[14]);
                                                                aeModeResult6.m4879c(fArr6[15]);
                                                                GcamModuleJNI.AeResults_portrait_result_set(aeResults.f8224a, aeResults, AeModeResult.m4877a(aeModeResult6), aeModeResult6);
                                                                if (length2 > 16) {
                                                                    liveHdrMetadata.m5031e(fArr6[16]);
                                                                } else {
                                                                    liveHdrMetadata.m5031e(fArr6[15]);
                                                                }
                                                            }
                                                            aeModeResultArr = new AeModeResult[]{aeModeResult4, aeModeResult5};
                                                            long j2 = aeResults.f8224a;
                                                            jArr = new long[2];
                                                            while (i8 < 2) {
                                                                jArr[i8] = AeModeResult.m4877a(aeModeResultArr[i8]);
                                                            }
                                                            GcamModuleJNI.AeResults_mode_result_set(j2, aeResults, jArr);
                                                        }
                                                        str4 = "smask";
                                                        if (ivw.f32425k != null) {
                                                            bArr = (byte[]) kppVar.mo9517d(ivw.f32425k);
                                                            if (bArr != null) {
                                                                frameMetadata = frameMetadata;
                                                                i5 = 0;
                                                            } else {
                                                                frameMetadata = frameMetadata;
                                                                i5 = 0;
                                                            }
                                                        } else {
                                                            frameMetadata = frameMetadata;
                                                            i5 = 0;
                                                        }
                                                        frameMetadata = frameMetadata;
                                                        GcamModuleJNI.FrameMetadata_live_hdr_set(frameMetadata.f8263a, frameMetadata, liveHdrMetadata.f8311a, liveHdrMetadata);
                                                        GcamModuleJNI.FrameMetadata_ae_results_set(frameMetadata.f8263a, frameMetadata, AeResults.m4881b(aeResults), aeResults);
                                                        str5 = "3a";
                                                        iIntValue2 = ((Integer) kppVar.mo9517d(CaptureResult.CONTROL_MODE)).intValue();
                                                        nrf[] nrfVarArr3 = nrf.f44179g;
                                                        if (iIntValue2 < 6) {
                                                            i6 = 0;
                                                            while (true) {
                                                                nrfVarArr = nrf.f44179g;
                                                                if (i6 >= 6) {
                                                                    throw new IllegalArgumentException(str2 + nrf.class.toString() + str9 + iIntValue2);
                                                                }
                                                                nrfVar2 = nrfVarArr[i6];
                                                                if (nrfVar2.f44180h == iIntValue2) {
                                                                    nrfVar = nrfVar2;
                                                                } else {
                                                                    i6++;
                                                                }
                                                            }
                                                        } else {
                                                            i6 = 0;
                                                            while (true) {
                                                                nrfVarArr = nrf.f44179g;
                                                                if (i6 >= 6) {
                                                                    throw new IllegalArgumentException(str2 + nrf.class.toString() + str9 + iIntValue2);
                                                                }
                                                                nrfVar2 = nrfVarArr[i6];
                                                                if (nrfVar2.f44180h == iIntValue2) {
                                                                    nrfVar = nrfVar2;
                                                                } else {
                                                                    i6++;
                                                                }
                                                            }
                                                        }
                                                        GcamModuleJNI.FrameMetadata_control_mode_set(frameMetadata.f8263a, frameMetadata, nrfVar.f44180h);
                                                        aeMetadataM4954d = frameMetadata.m4954d();
                                                        GcamModuleJNI.AeMetadata_mode_set(aeMetadataM4954d.f8221a, aeMetadataM4954d, nqx.m17628a(((Integer) kppVar.mo9517d(CaptureResult.CONTROL_AE_MODE)).intValue()).f44108h);
                                                        GcamModuleJNI.AeMetadata_lock_set(aeMetadataM4954d.f8221a, aeMetadataM4954d, ((Boolean) kppVar.mo9517d(CaptureResult.CONTROL_AE_LOCK)).booleanValue());
                                                        iIntValue3 = ((Integer) kppVar.mo9517d(CaptureResult.CONTROL_AE_STATE)).intValue();
                                                        nqy[] nqyVarArr4 = nqy.f44117h;
                                                        if (iIntValue3 < 7) {
                                                            i7 = 0;
                                                            while (true) {
                                                                nqyVarArr = nqy.f44117h;
                                                                if (i7 >= 7) {
                                                                    String str13 = str9;
                                                                    throw new IllegalArgumentException(str2 + nqy.class.toString() + str13 + iIntValue3);
                                                                }
                                                                nqyVar2 = nqyVarArr[i7];
                                                                if (nqyVar2.f44118i == iIntValue3) {
                                                                    nqyVar = nqyVar2;
                                                                } else {
                                                                    i7++;
                                                                }
                                                            }
                                                        } else {
                                                            i7 = 0;
                                                            while (true) {
                                                                nqyVarArr = nqy.f44117h;
                                                                if (i7 >= 7) {
                                                                    String str14 = str9;
                                                                    throw new IllegalArgumentException(str2 + nqy.class.toString() + str14 + iIntValue3);
                                                                }
                                                                nqyVar2 = nqyVarArr[i7];
                                                                if (nqyVar2.f44118i == iIntValue3) {
                                                                    nqyVar = nqyVar2;
                                                                } else {
                                                                    i7++;
                                                                }
                                                            }
                                                        }
                                                        GcamModuleJNI.AeMetadata_state_set(aeMetadataM4954d.f8221a, aeMetadataM4954d, nqyVar.f44118i);
                                                        num2 = (Integer) kppVar.mo9517d(CaptureResult.CONTROL_AE_PRECAPTURE_TRIGGER);
                                                        if (num2 != null) {
                                                            GcamModuleJNI.AeMetadata_precapture_trigger_set(aeMetadataM4954d.f8221a, aeMetadataM4954d, num2.intValue());
                                                        }
                                                        GcamModuleJNI.AeMetadata_exposure_compensation_set(aeMetadataM4954d.f8221a, aeMetadataM4954d, m17678a(((Integer) kppVar.mo9517d(CaptureResult.CONTROL_AE_EXPOSURE_COMPENSATION)).intValue()));
                                                        AwbMetadata awbMetadataM4956f5 = frameMetadata.m4956f();
                                                        GcamModuleJNI.AwbMetadata_mode_set(awbMetadataM4956f5.f8231a, awbMetadataM4956f5, ((Integer) kppVar.mo9517d(CaptureResult.CONTROL_AWB_MODE)).intValue());
                                                        GcamModuleJNI.AwbMetadata_lock_set(awbMetadataM4956f5.f8231a, awbMetadataM4956f5, ((Boolean) kppVar.mo9517d(CaptureResult.CONTROL_AWB_LOCK)).booleanValue());
                                                        GcamModuleJNI.AwbMetadata_state_set(awbMetadataM4956f5.f8231a, awbMetadataM4956f5, ((Integer) kppVar.mo9517d(CaptureResult.CONTROL_AWB_STATE)).intValue());
                                                        AfMetadata afMetadataM4955e5 = frameMetadata.m4955e();
                                                        afMetadataM4955e5.m4896b(nra.m17629a(((Integer) kppVar.mo9517d(CaptureResult.CONTROL_AF_MODE)).intValue()));
                                                        afMetadataM4955e5.m4897c(nrb.m17630a(((Integer) kppVar.mo9517d(CaptureResult.CONTROL_AF_STATE)).intValue()));
                                                        afMetadataM4955e5.m4898d(((Integer) kppVar.mo9517d(CaptureResult.CONTROL_AF_TRIGGER)).intValue());
                                                        num3 = (Integer) kppVar.mo9517d(CaptureResult.LENS_STATE);
                                                        if (num3 != null) {
                                                            iIntValue4 = num3.intValue();
                                                            nrr[] nrrVarArr5 = nrr.f44283d;
                                                            if (iIntValue4 < 3) {
                                                                while (true) {
                                                                    nrrVarArr = nrr.f44283d;
                                                                    if (i5 < 3) {
                                                                        throw new IllegalArgumentException(str2 + nrr.class.toString() + str9 + iIntValue4);
                                                                    }
                                                                    nrrVar = nrrVarArr[i5];
                                                                    if (nrrVar.f44284e == iIntValue4) {
                                                                        i5++;
                                                                    }
                                                                }
                                                                GcamModuleJNI.FrameMetadata_lens_state_set(frameMetadata.f8263a, frameMetadata, nrrVar.f44284e);
                                                                str4 = "bgstats";
                                                                key4 = ivt.f32366t;
                                                                if (key4 != null) {
                                                                    bArr2 = (byte[]) kppVar.mo9517d(key4);
                                                                    if (bArr2 != null) {
                                                                        ByteBuffer byteBufferOrder10 = ByteBuffer.allocateDirect(bArr2.length).order(ByteOrder.nativeOrder());
                                                                        byteBufferOrder10.put(bArr2);
                                                                        IspAwbMetadata ispAwbMetadata10 = new IspAwbMetadata(GcamModuleJNI.DeserializeFromBytes(nsd.m17642a(new nsd(BufferUtils.m4902a(byteBufferOrder10))), byteBufferOrder10.capacity()));
                                                                        GcamModuleJNI.FrameMetadata_isp_metadata_set(frameMetadata.f8263a, frameMetadata, ispAwbMetadata10.f8306a, ispAwbMetadata10);
                                                                    }
                                                                    if (frameMetadata.m4960j() != nse.f44367f) {
                                                                        GcamModuleJNI.ApplySensorBinning__SWIG_0(2, true, false, FrameMetadata.m4951b(frameMetadata), frameMetadata);
                                                                    } else {
                                                                        GcamModuleJNI.ApplySensorBinning__SWIG_0(2, true, false, FrameMetadata.m4951b(frameMetadata), frameMetadata);
                                                                    }
                                                                    str5 = "halaf";
                                                                    bArrM17661I = m17661I(ivx.f32439b, kppVar);
                                                                    if (bArrM17661I != null) {
                                                                        ntw.m17717c(bArrM17661I, frameMetadata.m4958h());
                                                                    }
                                                                    bArrM17661I2 = m17661I(ivx.f32438a, kppVar);
                                                                    if (bArrM17661I2 != null) {
                                                                        HalAfMetadata halAfMetadataM4958h19 = frameMetadata.m4958h();
                                                                        Pair pairM17716b19 = ntw.m17716b(bArrM17661I2);
                                                                        GcamModuleJNI.HalAfMetadata_SetAfTargetFocusInfoFromBytes(halAfMetadataM4958h19.f8287a, halAfMetadataM4958h19, nsd.m17642a(new nsd(((Long) pairM17716b19.second).longValue())), ((ByteBuffer) pairM17716b19.first).capacity());
                                                                    }
                                                                } else {
                                                                    if (frameMetadata.m4960j() != nse.f44367f) {
                                                                        GcamModuleJNI.ApplySensorBinning__SWIG_0(2, true, false, FrameMetadata.m4951b(frameMetadata), frameMetadata);
                                                                    } else {
                                                                        GcamModuleJNI.ApplySensorBinning__SWIG_0(2, true, false, FrameMetadata.m4951b(frameMetadata), frameMetadata);
                                                                    }
                                                                    str5 = "halaf";
                                                                    bArrM17661I = m17661I(ivx.f32439b, kppVar);
                                                                    if (bArrM17661I != null) {
                                                                        ntw.m17717c(bArrM17661I, frameMetadata.m4958h());
                                                                    }
                                                                    bArrM17661I2 = m17661I(ivx.f32438a, kppVar);
                                                                    if (bArrM17661I2 != null) {
                                                                        HalAfMetadata halAfMetadataM4958h110 = frameMetadata.m4958h();
                                                                        Pair pairM17716b110 = ntw.m17716b(bArrM17661I2);
                                                                        GcamModuleJNI.HalAfMetadata_SetAfTargetFocusInfoFromBytes(halAfMetadataM4958h110.f8287a, halAfMetadataM4958h110, nsd.m17642a(new nsd(((Long) pairM17716b110.second).longValue())), ((ByteBuffer) pairM17716b110.first).capacity());
                                                                    }
                                                                }
                                                            } else {
                                                                while (true) {
                                                                    nrrVarArr = nrr.f44283d;
                                                                    if (i5 < 3) {
                                                                        throw new IllegalArgumentException(str2 + nrr.class.toString() + str9 + iIntValue4);
                                                                    }
                                                                    nrrVar = nrrVarArr[i5];
                                                                    if (nrrVar.f44284e == iIntValue4) {
                                                                        i5++;
                                                                    }
                                                                }
                                                                GcamModuleJNI.FrameMetadata_lens_state_set(frameMetadata.f8263a, frameMetadata, nrrVar.f44284e);
                                                                str4 = "bgstats";
                                                                key4 = ivt.f32366t;
                                                                if (key4 != null) {
                                                                    bArr2 = (byte[]) kppVar.mo9517d(key4);
                                                                    if (bArr2 != null) {
                                                                        ByteBuffer byteBufferOrder11 = ByteBuffer.allocateDirect(bArr2.length).order(ByteOrder.nativeOrder());
                                                                        byteBufferOrder11.put(bArr2);
                                                                        IspAwbMetadata ispAwbMetadata11 = new IspAwbMetadata(GcamModuleJNI.DeserializeFromBytes(nsd.m17642a(new nsd(BufferUtils.m4902a(byteBufferOrder11))), byteBufferOrder11.capacity()));
                                                                        GcamModuleJNI.FrameMetadata_isp_metadata_set(frameMetadata.f8263a, frameMetadata, ispAwbMetadata11.f8306a, ispAwbMetadata11);
                                                                    }
                                                                    if (frameMetadata.m4960j() != nse.f44367f) {
                                                                        GcamModuleJNI.ApplySensorBinning__SWIG_0(2, true, false, FrameMetadata.m4951b(frameMetadata), frameMetadata);
                                                                    } else {
                                                                        GcamModuleJNI.ApplySensorBinning__SWIG_0(2, true, false, FrameMetadata.m4951b(frameMetadata), frameMetadata);
                                                                    }
                                                                    str5 = "halaf";
                                                                    bArrM17661I = m17661I(ivx.f32439b, kppVar);
                                                                    if (bArrM17661I != null) {
                                                                        ntw.m17717c(bArrM17661I, frameMetadata.m4958h());
                                                                    }
                                                                    bArrM17661I2 = m17661I(ivx.f32438a, kppVar);
                                                                    if (bArrM17661I2 != null) {
                                                                        HalAfMetadata halAfMetadataM4958h111 = frameMetadata.m4958h();
                                                                        Pair pairM17716b111 = ntw.m17716b(bArrM17661I2);
                                                                        GcamModuleJNI.HalAfMetadata_SetAfTargetFocusInfoFromBytes(halAfMetadataM4958h111.f8287a, halAfMetadataM4958h111, nsd.m17642a(new nsd(((Long) pairM17716b111.second).longValue())), ((ByteBuffer) pairM17716b111.first).capacity());
                                                                    }
                                                                } else {
                                                                    if (frameMetadata.m4960j() != nse.f44367f) {
                                                                        GcamModuleJNI.ApplySensorBinning__SWIG_0(2, true, false, FrameMetadata.m4951b(frameMetadata), frameMetadata);
                                                                    } else {
                                                                        GcamModuleJNI.ApplySensorBinning__SWIG_0(2, true, false, FrameMetadata.m4951b(frameMetadata), frameMetadata);
                                                                    }
                                                                    str5 = "halaf";
                                                                    bArrM17661I = m17661I(ivx.f32439b, kppVar);
                                                                    if (bArrM17661I != null) {
                                                                        ntw.m17717c(bArrM17661I, frameMetadata.m4958h());
                                                                    }
                                                                    bArrM17661I2 = m17661I(ivx.f32438a, kppVar);
                                                                    if (bArrM17661I2 != null) {
                                                                        HalAfMetadata halAfMetadataM4958h112 = frameMetadata.m4958h();
                                                                        Pair pairM17716b112 = ntw.m17716b(bArrM17661I2);
                                                                        GcamModuleJNI.HalAfMetadata_SetAfTargetFocusInfoFromBytes(halAfMetadataM4958h112.f8287a, halAfMetadataM4958h112, nsd.m17642a(new nsd(((Long) pairM17716b112.second).longValue())), ((ByteBuffer) pairM17716b112.first).capacity());
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            str4 = "bgstats";
                                                            key4 = ivt.f32366t;
                                                            if (key4 != null) {
                                                                bArr2 = (byte[]) kppVar.mo9517d(key4);
                                                                if (bArr2 != null) {
                                                                    ByteBuffer byteBufferOrder12 = ByteBuffer.allocateDirect(bArr2.length).order(ByteOrder.nativeOrder());
                                                                    byteBufferOrder12.put(bArr2);
                                                                    IspAwbMetadata ispAwbMetadata12 = new IspAwbMetadata(GcamModuleJNI.DeserializeFromBytes(nsd.m17642a(new nsd(BufferUtils.m4902a(byteBufferOrder12))), byteBufferOrder12.capacity()));
                                                                    GcamModuleJNI.FrameMetadata_isp_metadata_set(frameMetadata.f8263a, frameMetadata, ispAwbMetadata12.f8306a, ispAwbMetadata12);
                                                                }
                                                                if (frameMetadata.m4960j() != nse.f44367f) {
                                                                    GcamModuleJNI.ApplySensorBinning__SWIG_0(2, true, false, FrameMetadata.m4951b(frameMetadata), frameMetadata);
                                                                } else {
                                                                    GcamModuleJNI.ApplySensorBinning__SWIG_0(2, true, false, FrameMetadata.m4951b(frameMetadata), frameMetadata);
                                                                }
                                                                str5 = "halaf";
                                                                bArrM17661I = m17661I(ivx.f32439b, kppVar);
                                                                if (bArrM17661I != null) {
                                                                    ntw.m17717c(bArrM17661I, frameMetadata.m4958h());
                                                                }
                                                                bArrM17661I2 = m17661I(ivx.f32438a, kppVar);
                                                                if (bArrM17661I2 != null) {
                                                                    HalAfMetadata halAfMetadataM4958h113 = frameMetadata.m4958h();
                                                                    Pair pairM17716b113 = ntw.m17716b(bArrM17661I2);
                                                                    GcamModuleJNI.HalAfMetadata_SetAfTargetFocusInfoFromBytes(halAfMetadataM4958h113.f8287a, halAfMetadataM4958h113, nsd.m17642a(new nsd(((Long) pairM17716b113.second).longValue())), ((ByteBuffer) pairM17716b113.first).capacity());
                                                                }
                                                            } else {
                                                                if (frameMetadata.m4960j() != nse.f44367f) {
                                                                    GcamModuleJNI.ApplySensorBinning__SWIG_0(2, true, false, FrameMetadata.m4951b(frameMetadata), frameMetadata);
                                                                } else {
                                                                    GcamModuleJNI.ApplySensorBinning__SWIG_0(2, true, false, FrameMetadata.m4951b(frameMetadata), frameMetadata);
                                                                }
                                                                str5 = "halaf";
                                                                bArrM17661I = m17661I(ivx.f32439b, kppVar);
                                                                if (bArrM17661I != null) {
                                                                    ntw.m17717c(bArrM17661I, frameMetadata.m4958h());
                                                                }
                                                                bArrM17661I2 = m17661I(ivx.f32438a, kppVar);
                                                                if (bArrM17661I2 != null) {
                                                                    HalAfMetadata halAfMetadataM4958h114 = frameMetadata.m4958h();
                                                                    Pair pairM17716b114 = ntw.m17716b(bArrM17661I2);
                                                                    GcamModuleJNI.HalAfMetadata_SetAfTargetFocusInfoFromBytes(halAfMetadataM4958h114.f8287a, halAfMetadataM4958h114, nsd.m17642a(new nsd(((Long) pairM17716b114.second).longValue())), ((ByteBuffer) pairM17716b114.first).capacity());
                                                                }
                                                            }
                                                        }
                                                    }
                                                } catch (RuntimeException e24) {
                                                    frameMetadata = frameMetadata;
                                                    runtimeException = e24;
                                                    str5 = str3;
                                                }
                                                return frameMetadata;
                                            }
                                            i = 0;
                                            while (true) {
                                                nrq[] nrqVarArr2 = nrq.f44277d;
                                                if (i >= i12) {
                                                    throw new IllegalArgumentException("No enum " + nrq.class.toString() + " with value " + iIntValue5);
                                                }
                                                try {
                                                    nrqVar = nrqVarArr2[i];
                                                    if (nrqVar.f44278e == iIntValue5) {
                                                        break;
                                                    }
                                                    i++;
                                                    i12 = 3;
                                                } catch (RuntimeException e25) {
                                                    runtimeException = e25;
                                                    frameMetadata = frameMetadata;
                                                    str5 = "scaler";
                                                }
                                                runtimeException = e25;
                                                frameMetadata = frameMetadata;
                                                str5 = "scaler";
                                                Log.e(f44463a, "Exception in converting to Gcam FrameMetadata at ".concat(str5), runtimeException);
                                                return frameMetadata;
                                            }
                                            l = (Long) kppVar.mo9517d(CaptureResult.SENSOR_TIMESTAMP);
                                            OisSample[] oisSampleArr2 = (OisSample[]) kppVar.mo9517d(CaptureResult.STATISTICS_OIS_SAMPLES);
                                            if (l != null) {
                                            }
                                            optionalEmpty = Optional.empty();
                                            str9 = " with value ";
                                            optionalEmpty.ifPresent(new idi(frameMetadata, 11));
                                            if (gyroSampleVector != null) {
                                                z = true;
                                                GcamModuleJNI.FrameMetadata_gyro_samples_set(frameMetadata.f8263a, frameMetadata, gyroSampleVector.f8285a, gyroSampleVector);
                                            } else {
                                                z = true;
                                            }
                                            str8 = "geocalibration";
                                            if (kmdVarM17682f.mo14544M()) {
                                                z2 = true;
                                            }
                                            lku.m15670x(z2, "Logical cameras not supported.");
                                            geometricCalibrationVector = new GeometricCalibrationVector(GcamModuleJNI.new_GeometricCalibrationVector__SWIG_0(), z);
                                            fArr = (float[]) kppVar.mo9517d(CaptureResult.LENS_DISTORTION);
                                            fArr2 = (float[]) kppVar.mo9517d(CaptureResult.LENS_INTRINSIC_CALIBRATION);
                                            fArr3 = (float[]) kppVar.mo9517d(CaptureResult.LENS_POSE_ROTATION);
                                            fArr4 = (float[]) kppVar.mo9517d(CaptureResult.LENS_POSE_TRANSLATION);
                                            if (fArr == null) {
                                                fArr = (float[]) kmdVarM17682f.mo14559l(CameraCharacteristics.LENS_DISTORTION);
                                            }
                                            if (fArr2 == null) {
                                                fArr2 = (float[]) kmdVarM17682f.mo14559l(CameraCharacteristics.LENS_INTRINSIC_CALIBRATION);
                                            }
                                            if (fArr3 == null) {
                                                fArr3 = (float[]) kmdVarM17682f.mo14559l(CameraCharacteristics.LENS_POSE_ROTATION);
                                            }
                                            if (fArr4 == null) {
                                                fArr4 = (float[]) kmdVarM17682f.mo14559l(CameraCharacteristics.LENS_POSE_TRANSLATION);
                                            }
                                            if (fArr == null) {
                                                geometricCalibration = new GeometricCalibration();
                                                geometricCalibration.m4982d(nrm.f44244a);
                                                if (fArr != null) {
                                                    geometricCalibration.m4980b(fArr);
                                                }
                                                if (fArr2 != null) {
                                                    geometricCalibration.m4981c(fArr2);
                                                }
                                                if (fArr3 != null) {
                                                    GcamModuleJNI.GeometricCalibration_lens_pose_rotation_set(geometricCalibration.f8275a, geometricCalibration, fArr3);
                                                }
                                                if (fArr4 != null) {
                                                    GcamModuleJNI.GeometricCalibration_lens_pose_translation_set(geometricCalibration.f8275a, geometricCalibration, fArr4);
                                                }
                                                geometricCalibrationVector.m4983a(geometricCalibration);
                                            } else {
                                                geometricCalibration = new GeometricCalibration();
                                                geometricCalibration.m4982d(nrm.f44244a);
                                                if (fArr != null) {
                                                    geometricCalibration.m4980b(fArr);
                                                }
                                                if (fArr2 != null) {
                                                    geometricCalibration.m4981c(fArr2);
                                                }
                                                if (fArr3 != null) {
                                                    GcamModuleJNI.GeometricCalibration_lens_pose_rotation_set(geometricCalibration.f8275a, geometricCalibration, fArr3);
                                                }
                                                if (fArr4 != null) {
                                                    GcamModuleJNI.GeometricCalibration_lens_pose_translation_set(geometricCalibration.f8275a, geometricCalibration, fArr4);
                                                }
                                                geometricCalibrationVector.m4983a(geometricCalibration);
                                            }
                                            if (ivt.f32348b != null) {
                                                str2 = "No enum ";
                                                i2 = 4;
                                            } else {
                                                str2 = "No enum ";
                                                i2 = 4;
                                            }
                                            GcamModuleJNI.FrameMetadata_geometric_calibration_set(frameMetadata.f8263a, frameMetadata, geometricCalibrationVector.f8277a, geometricCalibrationVector);
                                            GcamModuleJNI.FrameMetadata_sensor_id_set(frameMetadata.f8263a, frameMetadata, m17655C(kmdVarM17682f, this.f44466d, kppVar, kmgVar2).f44379q);
                                            str5 = "flash";
                                            iIntValue = ((Integer) kppVar.mo9517d(CaptureResult.FLASH_MODE)).intValue();
                                            if (iIntValue != 1) {
                                                frameMetadata.m4963m(nrj.f44222b);
                                                str3 = "awb";
                                                AwbInfo awbInfoM17666i2 = m17666i(kppVar, kmdVarM17682f);
                                                GcamModuleJNI.FrameMetadata_wb_set(frameMetadata.f8263a, frameMetadata, AwbInfo.m4899a(awbInfoM17666i2), awbInfoM17666i2);
                                                str3 = "bl";
                                                bool = (Boolean) kppVar.mo9517d(CaptureResult.BLACK_LEVEL_LOCK);
                                                if (bool == null) {
                                                    bool = false;
                                                    GcamModuleJNI.FrameMetadata_was_black_level_locked_set(frameMetadata.f8263a, frameMetadata, bool.booleanValue());
                                                    GcamModuleJNI.FrameMetadata_frame_duration_ms_set(frameMetadata.f8263a, frameMetadata, m17675x(((Long) kppVar.mo9517d(CaptureResult.SENSOR_FRAME_DURATION)).longValue()));
                                                    GcamModuleJNI.FrameMetadata_timestamp_ns_set(frameMetadata.f8263a, frameMetadata, ((Long) kppVar.mo9517d(CaptureResult.SENSOR_TIMESTAMP)).longValue());
                                                    GcamModuleJNI.FrameMetadata_sensor_temp_set(frameMetadata.f8263a, frameMetadata, GcamModuleJNI.kSensorTempUnknown_get());
                                                    SceneFlicker sceneFlicker3 = new SceneFlicker();
                                                    key = ivv.f32398g;
                                                    fIntValue = -1.0f;
                                                    if (key != null) {
                                                        fIntValue2 = -1.0f;
                                                    } else {
                                                        fIntValue2 = -1.0f;
                                                    }
                                                    key2 = ivv.f32399h;
                                                    if (key2 != null) {
                                                        fIntValue = num4.intValue() / 10000.0f;
                                                    }
                                                    if (fIntValue2 >= 0.0f) {
                                                        switch (num.intValue()) {
                                                            case 0:
                                                                fIntValue2 = 0.0f;
                                                                fIntValue = 1.0f;
                                                                break;
                                                            case 1:
                                                                fIntValue2 = 100.0f;
                                                                fIntValue = 1.0f;
                                                                break;
                                                            case 2:
                                                                fIntValue2 = 120.0f;
                                                                fIntValue = 1.0f;
                                                                break;
                                                            default:
                                                                Log.e(f44463a, BEeWZPor.BZKQtFscIANQJ);
                                                                break;
                                                        }
                                                    } else {
                                                        switch (num.intValue()) {
                                                            case 0:
                                                                fIntValue2 = 0.0f;
                                                                fIntValue = 1.0f;
                                                                break;
                                                            case 1:
                                                                fIntValue2 = 100.0f;
                                                                fIntValue = 1.0f;
                                                                break;
                                                            case 2:
                                                                fIntValue2 = 120.0f;
                                                                fIntValue = 1.0f;
                                                                break;
                                                            default:
                                                                Log.e(f44463a, BEeWZPor.BZKQtFscIANQJ);
                                                                break;
                                                        }
                                                    }
                                                    GcamModuleJNI.SceneFlicker_frequency_set(sceneFlicker3.f8352a, sceneFlicker3, fIntValue2);
                                                    GcamModuleJNI.SceneFlicker_confidence_set(sceneFlicker3.f8352a, sceneFlicker3, fIntValue);
                                                    GcamModuleJNI.FrameMetadata_scene_flicker_set(frameMetadata.f8263a, frameMetadata, sceneFlicker3.f8352a, sceneFlicker3);
                                                    str3 = "noise";
                                                    pairArr = (Pair[]) kppVar.mo9517d(CaptureResult.SENSOR_NOISE_PROFILE);
                                                    floatVector = new FloatVector();
                                                    floatVector2 = new FloatVector();
                                                    while (i3 < i2) {
                                                        floatVector.m4949b(((Double) pairArr[i3].first).floatValue());
                                                        floatVector2.m4949b(((Double) pairArr[i3].second).floatValue());
                                                    }
                                                    NoiseModel noiseModel3 = new NoiseModel(GcamModuleJNI.NoiseModel_FromShotReadNoiseVector(floatVector.f8261a, floatVector, floatVector2.f8261a, floatVector2));
                                                    GcamModuleJNI.FrameMetadata_dng_noise_model_bayer_set(frameMetadata.f8263a, frameMetadata, noiseModel3.f8320a, noiseModel3);
                                                    str5 = "dynamicbl";
                                                    fArr5 = (float[]) kppVar.mo9517d(CaptureResult.SENSOR_DYNAMIC_BLACK_LEVEL);
                                                    if (fArr5 != null) {
                                                        floatArray5 = new FloatArray4();
                                                        while (i9 < floatArray5.m4942b()) {
                                                            floatArray5.m4944d(i9, fArr5[i9]);
                                                        }
                                                        frameMetadata.m4962l(floatArray5);
                                                    } else {
                                                        blackLevelPattern = (BlackLevelPattern) kmdVarM17682f.mo14559l(CameraCharacteristics.SENSOR_BLACK_LEVEL_PATTERN);
                                                        if (blackLevelPattern != null) {
                                                            floatArray4 = new FloatArray4();
                                                            while (i4 < floatArray4.m4942b()) {
                                                                floatArray4.m4944d(i4, blackLevelPattern.getOffsetForIndex(i4 % 2, i4 / 2));
                                                            }
                                                            frameMetadata.m4962l(floatArray4);
                                                        }
                                                    }
                                                    f = (Float) kppVar.mo9517d(CaptureResult.LENS_FOCUS_DISTANCE);
                                                    Integer num10 = (Integer) kmdVarM17682f.mo14559l(CameraCharacteristics.LENS_INFO_FOCUS_DISTANCE_CALIBRATION);
                                                    if (f != null) {
                                                        GcamModuleJNI.FrameMetadata_focus_distance_diopters_set(frameMetadata.f8263a, frameMetadata, f.floatValue());
                                                    }
                                                    liveHdrMetadata = new LiveHdrMetadata(GcamModuleJNI.new_LiveHdrMetadata(), true);
                                                    aeResults = new AeResults(GcamModuleJNI.new_AeResults(), true);
                                                    if (ivu.f32375c != null) {
                                                        GcamModuleJNI.LiveHdrMetadata_max_hdr_ratio_override_set(liveHdrMetadata.f8311a, liveHdrMetadata, fArr7[0]);
                                                        liveHdrMetadata.m5029c(fArr7[1]);
                                                        liveHdrMetadata.m5028b(fArr7[2]);
                                                        if (!f44464b.f36770c) {
                                                            GcamModuleJNI.LiveHdrMetadata_night_factor_set(liveHdrMetadata.f8311a, liveHdrMetadata, fArr7[3]);
                                                        }
                                                        GcamModuleJNI.LiveHdrMetadata_manual_ec_short_set(liveHdrMetadata.f8311a, liveHdrMetadata, fArr7[i2]);
                                                        GcamModuleJNI.LiveHdrMetadata_manual_portrait_tet_override_set(liveHdrMetadata.f8311a, liveHdrMetadata, fArr7[5]);
                                                    }
                                                    str5 = "gcamae";
                                                    key3 = ivu.f32373a;
                                                    if (key3 != null) {
                                                        AeModeResult aeModeResult7 = new AeModeResult();
                                                        AeModeResult aeModeResult8 = new AeModeResult();
                                                        aeModeResult7.m4880d(fArr6[0]);
                                                        aeModeResult8.m4880d(fArr6[1]);
                                                        aeModeResult7.m4879c(fArr6[2]);
                                                        aeModeResult8.m4879c(fArr6[3]);
                                                        GcamModuleJNI.AeResults_pure_fraction_of_pixels_from_long_exposure_set(aeResults.f8224a, aeResults, fArr6[i2]);
                                                        GcamModuleJNI.AeResults_weighted_fraction_of_pixels_from_long_exposure_set(aeResults.f8224a, aeResults, fArr6[5]);
                                                        GcamModuleJNI.AeModeResult_log_scene_brightness_set(aeModeResult7.f8222a, aeModeResult7, fArr6[6]);
                                                        GcamModuleJNI.AeResults_predicted_image_brightness_set(aeResults.f8224a, aeResults, fArr6[7]);
                                                        GcamModuleJNI.LiveHdrMetadata_motion_magnitude_pix_set(liveHdrMetadata.f8311a, liveHdrMetadata, fArr6[8]);
                                                        GcamModuleJNI.LiveHdrMetadata_metering_interval_ms_set(liveHdrMetadata.f8311a, liveHdrMetadata, fArr6[9]);
                                                        GcamModuleJNI.LiveHdrMetadata_filtered_motion_speed_pix_per_ms_set(liveHdrMetadata.f8311a, liveHdrMetadata, fArr6[10]);
                                                        liveHdrMetadata.m5032f(fArr6[11]);
                                                        liveHdrMetadata.m5030d(fArr6[12]);
                                                        if (length2 > 13) {
                                                            GcamModuleJNI.AeResults_safe_underexposure_set(aeResults.f8224a, aeResults, fArr6[13]);
                                                        }
                                                        if (length2 > 15) {
                                                            AeModeResult aeModeResult9 = new AeModeResult();
                                                            aeModeResult9.m4880d(fArr6[14]);
                                                            aeModeResult9.m4879c(fArr6[15]);
                                                            GcamModuleJNI.AeResults_portrait_result_set(aeResults.f8224a, aeResults, AeModeResult.m4877a(aeModeResult9), aeModeResult9);
                                                            if (length2 > 16) {
                                                                liveHdrMetadata.m5031e(fArr6[16]);
                                                            } else {
                                                                liveHdrMetadata.m5031e(fArr6[15]);
                                                            }
                                                        }
                                                        aeModeResultArr = new AeModeResult[]{aeModeResult7, aeModeResult8};
                                                        long j3 = aeResults.f8224a;
                                                        jArr = new long[2];
                                                        while (i8 < 2) {
                                                            jArr[i8] = AeModeResult.m4877a(aeModeResultArr[i8]);
                                                        }
                                                        GcamModuleJNI.AeResults_mode_result_set(j3, aeResults, jArr);
                                                    }
                                                    str4 = "smask";
                                                    if (ivw.f32425k != null) {
                                                        bArr = (byte[]) kppVar.mo9517d(ivw.f32425k);
                                                        if (bArr != null) {
                                                            frameMetadata = frameMetadata;
                                                            i5 = 0;
                                                        } else {
                                                            frameMetadata = frameMetadata;
                                                            i5 = 0;
                                                        }
                                                    } else {
                                                        frameMetadata = frameMetadata;
                                                        i5 = 0;
                                                    }
                                                    frameMetadata = frameMetadata;
                                                    GcamModuleJNI.FrameMetadata_live_hdr_set(frameMetadata.f8263a, frameMetadata, liveHdrMetadata.f8311a, liveHdrMetadata);
                                                    GcamModuleJNI.FrameMetadata_ae_results_set(frameMetadata.f8263a, frameMetadata, AeResults.m4881b(aeResults), aeResults);
                                                    str5 = "3a";
                                                    iIntValue2 = ((Integer) kppVar.mo9517d(CaptureResult.CONTROL_MODE)).intValue();
                                                    nrf[] nrfVarArr4 = nrf.f44179g;
                                                    if (iIntValue2 < 6) {
                                                        i6 = 0;
                                                        while (true) {
                                                            nrfVarArr = nrf.f44179g;
                                                            if (i6 >= 6) {
                                                                throw new IllegalArgumentException(str2 + nrf.class.toString() + str9 + iIntValue2);
                                                            }
                                                            nrfVar2 = nrfVarArr[i6];
                                                            if (nrfVar2.f44180h == iIntValue2) {
                                                                nrfVar = nrfVar2;
                                                            } else {
                                                                i6++;
                                                            }
                                                        }
                                                    } else {
                                                        i6 = 0;
                                                        while (true) {
                                                            nrfVarArr = nrf.f44179g;
                                                            if (i6 >= 6) {
                                                                throw new IllegalArgumentException(str2 + nrf.class.toString() + str9 + iIntValue2);
                                                            }
                                                            nrfVar2 = nrfVarArr[i6];
                                                            if (nrfVar2.f44180h == iIntValue2) {
                                                                nrfVar = nrfVar2;
                                                            } else {
                                                                i6++;
                                                            }
                                                        }
                                                    }
                                                    GcamModuleJNI.FrameMetadata_control_mode_set(frameMetadata.f8263a, frameMetadata, nrfVar.f44180h);
                                                    aeMetadataM4954d = frameMetadata.m4954d();
                                                    GcamModuleJNI.AeMetadata_mode_set(aeMetadataM4954d.f8221a, aeMetadataM4954d, nqx.m17628a(((Integer) kppVar.mo9517d(CaptureResult.CONTROL_AE_MODE)).intValue()).f44108h);
                                                    GcamModuleJNI.AeMetadata_lock_set(aeMetadataM4954d.f8221a, aeMetadataM4954d, ((Boolean) kppVar.mo9517d(CaptureResult.CONTROL_AE_LOCK)).booleanValue());
                                                    iIntValue3 = ((Integer) kppVar.mo9517d(CaptureResult.CONTROL_AE_STATE)).intValue();
                                                    nqy[] nqyVarArr5 = nqy.f44117h;
                                                    if (iIntValue3 < 7) {
                                                        i7 = 0;
                                                        while (true) {
                                                            nqyVarArr = nqy.f44117h;
                                                            if (i7 >= 7) {
                                                                String str15 = str9;
                                                                throw new IllegalArgumentException(str2 + nqy.class.toString() + str15 + iIntValue3);
                                                            }
                                                            nqyVar2 = nqyVarArr[i7];
                                                            if (nqyVar2.f44118i == iIntValue3) {
                                                                nqyVar = nqyVar2;
                                                            } else {
                                                                i7++;
                                                            }
                                                        }
                                                    } else {
                                                        i7 = 0;
                                                        while (true) {
                                                            nqyVarArr = nqy.f44117h;
                                                            if (i7 >= 7) {
                                                                String str16 = str9;
                                                                throw new IllegalArgumentException(str2 + nqy.class.toString() + str16 + iIntValue3);
                                                            }
                                                            nqyVar2 = nqyVarArr[i7];
                                                            if (nqyVar2.f44118i == iIntValue3) {
                                                                nqyVar = nqyVar2;
                                                            } else {
                                                                i7++;
                                                            }
                                                        }
                                                    }
                                                    GcamModuleJNI.AeMetadata_state_set(aeMetadataM4954d.f8221a, aeMetadataM4954d, nqyVar.f44118i);
                                                    num2 = (Integer) kppVar.mo9517d(CaptureResult.CONTROL_AE_PRECAPTURE_TRIGGER);
                                                    if (num2 != null) {
                                                        GcamModuleJNI.AeMetadata_precapture_trigger_set(aeMetadataM4954d.f8221a, aeMetadataM4954d, num2.intValue());
                                                    }
                                                    GcamModuleJNI.AeMetadata_exposure_compensation_set(aeMetadataM4954d.f8221a, aeMetadataM4954d, m17678a(((Integer) kppVar.mo9517d(CaptureResult.CONTROL_AE_EXPOSURE_COMPENSATION)).intValue()));
                                                    AwbMetadata awbMetadataM4956f6 = frameMetadata.m4956f();
                                                    GcamModuleJNI.AwbMetadata_mode_set(awbMetadataM4956f6.f8231a, awbMetadataM4956f6, ((Integer) kppVar.mo9517d(CaptureResult.CONTROL_AWB_MODE)).intValue());
                                                    GcamModuleJNI.AwbMetadata_lock_set(awbMetadataM4956f6.f8231a, awbMetadataM4956f6, ((Boolean) kppVar.mo9517d(CaptureResult.CONTROL_AWB_LOCK)).booleanValue());
                                                    GcamModuleJNI.AwbMetadata_state_set(awbMetadataM4956f6.f8231a, awbMetadataM4956f6, ((Integer) kppVar.mo9517d(CaptureResult.CONTROL_AWB_STATE)).intValue());
                                                    AfMetadata afMetadataM4955e6 = frameMetadata.m4955e();
                                                    afMetadataM4955e6.m4896b(nra.m17629a(((Integer) kppVar.mo9517d(CaptureResult.CONTROL_AF_MODE)).intValue()));
                                                    afMetadataM4955e6.m4897c(nrb.m17630a(((Integer) kppVar.mo9517d(CaptureResult.CONTROL_AF_STATE)).intValue()));
                                                    afMetadataM4955e6.m4898d(((Integer) kppVar.mo9517d(CaptureResult.CONTROL_AF_TRIGGER)).intValue());
                                                    num3 = (Integer) kppVar.mo9517d(CaptureResult.LENS_STATE);
                                                    if (num3 != null) {
                                                        iIntValue4 = num3.intValue();
                                                        nrr[] nrrVarArr6 = nrr.f44283d;
                                                        if (iIntValue4 < 3) {
                                                            while (true) {
                                                                nrrVarArr = nrr.f44283d;
                                                                if (i5 < 3) {
                                                                    throw new IllegalArgumentException(str2 + nrr.class.toString() + str9 + iIntValue4);
                                                                }
                                                                nrrVar = nrrVarArr[i5];
                                                                if (nrrVar.f44284e == iIntValue4) {
                                                                    i5++;
                                                                }
                                                            }
                                                            GcamModuleJNI.FrameMetadata_lens_state_set(frameMetadata.f8263a, frameMetadata, nrrVar.f44284e);
                                                            str4 = "bgstats";
                                                            key4 = ivt.f32366t;
                                                            if (key4 != null) {
                                                                bArr2 = (byte[]) kppVar.mo9517d(key4);
                                                                if (bArr2 != null) {
                                                                    ByteBuffer byteBufferOrder13 = ByteBuffer.allocateDirect(bArr2.length).order(ByteOrder.nativeOrder());
                                                                    byteBufferOrder13.put(bArr2);
                                                                    IspAwbMetadata ispAwbMetadata13 = new IspAwbMetadata(GcamModuleJNI.DeserializeFromBytes(nsd.m17642a(new nsd(BufferUtils.m4902a(byteBufferOrder13))), byteBufferOrder13.capacity()));
                                                                    GcamModuleJNI.FrameMetadata_isp_metadata_set(frameMetadata.f8263a, frameMetadata, ispAwbMetadata13.f8306a, ispAwbMetadata13);
                                                                }
                                                                if (frameMetadata.m4960j() != nse.f44367f) {
                                                                    GcamModuleJNI.ApplySensorBinning__SWIG_0(2, true, false, FrameMetadata.m4951b(frameMetadata), frameMetadata);
                                                                } else {
                                                                    GcamModuleJNI.ApplySensorBinning__SWIG_0(2, true, false, FrameMetadata.m4951b(frameMetadata), frameMetadata);
                                                                }
                                                                str5 = "halaf";
                                                                bArrM17661I = m17661I(ivx.f32439b, kppVar);
                                                                if (bArrM17661I != null) {
                                                                    ntw.m17717c(bArrM17661I, frameMetadata.m4958h());
                                                                }
                                                                bArrM17661I2 = m17661I(ivx.f32438a, kppVar);
                                                                if (bArrM17661I2 != null) {
                                                                    HalAfMetadata halAfMetadataM4958h115 = frameMetadata.m4958h();
                                                                    Pair pairM17716b115 = ntw.m17716b(bArrM17661I2);
                                                                    GcamModuleJNI.HalAfMetadata_SetAfTargetFocusInfoFromBytes(halAfMetadataM4958h115.f8287a, halAfMetadataM4958h115, nsd.m17642a(new nsd(((Long) pairM17716b115.second).longValue())), ((ByteBuffer) pairM17716b115.first).capacity());
                                                                }
                                                            } else {
                                                                if (frameMetadata.m4960j() != nse.f44367f) {
                                                                    GcamModuleJNI.ApplySensorBinning__SWIG_0(2, true, false, FrameMetadata.m4951b(frameMetadata), frameMetadata);
                                                                } else {
                                                                    GcamModuleJNI.ApplySensorBinning__SWIG_0(2, true, false, FrameMetadata.m4951b(frameMetadata), frameMetadata);
                                                                }
                                                                str5 = "halaf";
                                                                bArrM17661I = m17661I(ivx.f32439b, kppVar);
                                                                if (bArrM17661I != null) {
                                                                    ntw.m17717c(bArrM17661I, frameMetadata.m4958h());
                                                                }
                                                                bArrM17661I2 = m17661I(ivx.f32438a, kppVar);
                                                                if (bArrM17661I2 != null) {
                                                                    HalAfMetadata halAfMetadataM4958h116 = frameMetadata.m4958h();
                                                                    Pair pairM17716b116 = ntw.m17716b(bArrM17661I2);
                                                                    GcamModuleJNI.HalAfMetadata_SetAfTargetFocusInfoFromBytes(halAfMetadataM4958h116.f8287a, halAfMetadataM4958h116, nsd.m17642a(new nsd(((Long) pairM17716b116.second).longValue())), ((ByteBuffer) pairM17716b116.first).capacity());
                                                                }
                                                            }
                                                        } else {
                                                            while (true) {
                                                                nrrVarArr = nrr.f44283d;
                                                                if (i5 < 3) {
                                                                    throw new IllegalArgumentException(str2 + nrr.class.toString() + str9 + iIntValue4);
                                                                }
                                                                nrrVar = nrrVarArr[i5];
                                                                if (nrrVar.f44284e == iIntValue4) {
                                                                    i5++;
                                                                }
                                                            }
                                                            GcamModuleJNI.FrameMetadata_lens_state_set(frameMetadata.f8263a, frameMetadata, nrrVar.f44284e);
                                                            str4 = "bgstats";
                                                            key4 = ivt.f32366t;
                                                            if (key4 != null) {
                                                                bArr2 = (byte[]) kppVar.mo9517d(key4);
                                                                if (bArr2 != null) {
                                                                    ByteBuffer byteBufferOrder14 = ByteBuffer.allocateDirect(bArr2.length).order(ByteOrder.nativeOrder());
                                                                    byteBufferOrder14.put(bArr2);
                                                                    IspAwbMetadata ispAwbMetadata14 = new IspAwbMetadata(GcamModuleJNI.DeserializeFromBytes(nsd.m17642a(new nsd(BufferUtils.m4902a(byteBufferOrder14))), byteBufferOrder14.capacity()));
                                                                    GcamModuleJNI.FrameMetadata_isp_metadata_set(frameMetadata.f8263a, frameMetadata, ispAwbMetadata14.f8306a, ispAwbMetadata14);
                                                                }
                                                                if (frameMetadata.m4960j() != nse.f44367f) {
                                                                    GcamModuleJNI.ApplySensorBinning__SWIG_0(2, true, false, FrameMetadata.m4951b(frameMetadata), frameMetadata);
                                                                } else {
                                                                    GcamModuleJNI.ApplySensorBinning__SWIG_0(2, true, false, FrameMetadata.m4951b(frameMetadata), frameMetadata);
                                                                }
                                                                str5 = "halaf";
                                                                bArrM17661I = m17661I(ivx.f32439b, kppVar);
                                                                if (bArrM17661I != null) {
                                                                    ntw.m17717c(bArrM17661I, frameMetadata.m4958h());
                                                                }
                                                                bArrM17661I2 = m17661I(ivx.f32438a, kppVar);
                                                                if (bArrM17661I2 != null) {
                                                                    HalAfMetadata halAfMetadataM4958h117 = frameMetadata.m4958h();
                                                                    Pair pairM17716b117 = ntw.m17716b(bArrM17661I2);
                                                                    GcamModuleJNI.HalAfMetadata_SetAfTargetFocusInfoFromBytes(halAfMetadataM4958h117.f8287a, halAfMetadataM4958h117, nsd.m17642a(new nsd(((Long) pairM17716b117.second).longValue())), ((ByteBuffer) pairM17716b117.first).capacity());
                                                                }
                                                            } else {
                                                                if (frameMetadata.m4960j() != nse.f44367f) {
                                                                    GcamModuleJNI.ApplySensorBinning__SWIG_0(2, true, false, FrameMetadata.m4951b(frameMetadata), frameMetadata);
                                                                } else {
                                                                    GcamModuleJNI.ApplySensorBinning__SWIG_0(2, true, false, FrameMetadata.m4951b(frameMetadata), frameMetadata);
                                                                }
                                                                str5 = "halaf";
                                                                bArrM17661I = m17661I(ivx.f32439b, kppVar);
                                                                if (bArrM17661I != null) {
                                                                    ntw.m17717c(bArrM17661I, frameMetadata.m4958h());
                                                                }
                                                                bArrM17661I2 = m17661I(ivx.f32438a, kppVar);
                                                                if (bArrM17661I2 != null) {
                                                                    HalAfMetadata halAfMetadataM4958h118 = frameMetadata.m4958h();
                                                                    Pair pairM17716b118 = ntw.m17716b(bArrM17661I2);
                                                                    GcamModuleJNI.HalAfMetadata_SetAfTargetFocusInfoFromBytes(halAfMetadataM4958h118.f8287a, halAfMetadataM4958h118, nsd.m17642a(new nsd(((Long) pairM17716b118.second).longValue())), ((ByteBuffer) pairM17716b118.first).capacity());
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        str4 = "bgstats";
                                                        key4 = ivt.f32366t;
                                                        if (key4 != null) {
                                                            bArr2 = (byte[]) kppVar.mo9517d(key4);
                                                            if (bArr2 != null) {
                                                                ByteBuffer byteBufferOrder15 = ByteBuffer.allocateDirect(bArr2.length).order(ByteOrder.nativeOrder());
                                                                byteBufferOrder15.put(bArr2);
                                                                IspAwbMetadata ispAwbMetadata15 = new IspAwbMetadata(GcamModuleJNI.DeserializeFromBytes(nsd.m17642a(new nsd(BufferUtils.m4902a(byteBufferOrder15))), byteBufferOrder15.capacity()));
                                                                GcamModuleJNI.FrameMetadata_isp_metadata_set(frameMetadata.f8263a, frameMetadata, ispAwbMetadata15.f8306a, ispAwbMetadata15);
                                                            }
                                                            if (frameMetadata.m4960j() != nse.f44367f) {
                                                                GcamModuleJNI.ApplySensorBinning__SWIG_0(2, true, false, FrameMetadata.m4951b(frameMetadata), frameMetadata);
                                                            } else {
                                                                GcamModuleJNI.ApplySensorBinning__SWIG_0(2, true, false, FrameMetadata.m4951b(frameMetadata), frameMetadata);
                                                            }
                                                            str5 = "halaf";
                                                            bArrM17661I = m17661I(ivx.f32439b, kppVar);
                                                            if (bArrM17661I != null) {
                                                                ntw.m17717c(bArrM17661I, frameMetadata.m4958h());
                                                            }
                                                            bArrM17661I2 = m17661I(ivx.f32438a, kppVar);
                                                            if (bArrM17661I2 != null) {
                                                                HalAfMetadata halAfMetadataM4958h119 = frameMetadata.m4958h();
                                                                Pair pairM17716b119 = ntw.m17716b(bArrM17661I2);
                                                                GcamModuleJNI.HalAfMetadata_SetAfTargetFocusInfoFromBytes(halAfMetadataM4958h119.f8287a, halAfMetadataM4958h119, nsd.m17642a(new nsd(((Long) pairM17716b119.second).longValue())), ((ByteBuffer) pairM17716b119.first).capacity());
                                                            }
                                                        } else {
                                                            if (frameMetadata.m4960j() != nse.f44367f) {
                                                                GcamModuleJNI.ApplySensorBinning__SWIG_0(2, true, false, FrameMetadata.m4951b(frameMetadata), frameMetadata);
                                                            } else {
                                                                GcamModuleJNI.ApplySensorBinning__SWIG_0(2, true, false, FrameMetadata.m4951b(frameMetadata), frameMetadata);
                                                            }
                                                            str5 = "halaf";
                                                            bArrM17661I = m17661I(ivx.f32439b, kppVar);
                                                            if (bArrM17661I != null) {
                                                                ntw.m17717c(bArrM17661I, frameMetadata.m4958h());
                                                            }
                                                            bArrM17661I2 = m17661I(ivx.f32438a, kppVar);
                                                            if (bArrM17661I2 != null) {
                                                                HalAfMetadata halAfMetadataM4958h1110 = frameMetadata.m4958h();
                                                                Pair pairM17716b1110 = ntw.m17716b(bArrM17661I2);
                                                                GcamModuleJNI.HalAfMetadata_SetAfTargetFocusInfoFromBytes(halAfMetadataM4958h1110.f8287a, halAfMetadataM4958h1110, nsd.m17642a(new nsd(((Long) pairM17716b1110.second).longValue())), ((ByteBuffer) pairM17716b1110.first).capacity());
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    GcamModuleJNI.FrameMetadata_was_black_level_locked_set(frameMetadata.f8263a, frameMetadata, bool.booleanValue());
                                                    GcamModuleJNI.FrameMetadata_frame_duration_ms_set(frameMetadata.f8263a, frameMetadata, m17675x(((Long) kppVar.mo9517d(CaptureResult.SENSOR_FRAME_DURATION)).longValue()));
                                                    GcamModuleJNI.FrameMetadata_timestamp_ns_set(frameMetadata.f8263a, frameMetadata, ((Long) kppVar.mo9517d(CaptureResult.SENSOR_TIMESTAMP)).longValue());
                                                    GcamModuleJNI.FrameMetadata_sensor_temp_set(frameMetadata.f8263a, frameMetadata, GcamModuleJNI.kSensorTempUnknown_get());
                                                    SceneFlicker sceneFlicker4 = new SceneFlicker();
                                                    key = ivv.f32398g;
                                                    fIntValue = -1.0f;
                                                    if (key != null) {
                                                        fIntValue2 = -1.0f;
                                                    } else {
                                                        fIntValue2 = -1.0f;
                                                    }
                                                    key2 = ivv.f32399h;
                                                    if (key2 != null) {
                                                        fIntValue = num4.intValue() / 10000.0f;
                                                    }
                                                    if (fIntValue2 >= 0.0f) {
                                                        switch (num.intValue()) {
                                                            case 0:
                                                                fIntValue2 = 0.0f;
                                                                fIntValue = 1.0f;
                                                                break;
                                                            case 1:
                                                                fIntValue2 = 100.0f;
                                                                fIntValue = 1.0f;
                                                                break;
                                                            case 2:
                                                                fIntValue2 = 120.0f;
                                                                fIntValue = 1.0f;
                                                                break;
                                                            default:
                                                                Log.e(f44463a, BEeWZPor.BZKQtFscIANQJ);
                                                                break;
                                                        }
                                                    } else {
                                                        switch (num.intValue()) {
                                                            case 0:
                                                                fIntValue2 = 0.0f;
                                                                fIntValue = 1.0f;
                                                                break;
                                                            case 1:
                                                                fIntValue2 = 100.0f;
                                                                fIntValue = 1.0f;
                                                                break;
                                                            case 2:
                                                                fIntValue2 = 120.0f;
                                                                fIntValue = 1.0f;
                                                                break;
                                                            default:
                                                                Log.e(f44463a, BEeWZPor.BZKQtFscIANQJ);
                                                                break;
                                                        }
                                                    }
                                                    GcamModuleJNI.SceneFlicker_frequency_set(sceneFlicker4.f8352a, sceneFlicker4, fIntValue2);
                                                    GcamModuleJNI.SceneFlicker_confidence_set(sceneFlicker4.f8352a, sceneFlicker4, fIntValue);
                                                    GcamModuleJNI.FrameMetadata_scene_flicker_set(frameMetadata.f8263a, frameMetadata, sceneFlicker4.f8352a, sceneFlicker4);
                                                    str3 = "noise";
                                                    pairArr = (Pair[]) kppVar.mo9517d(CaptureResult.SENSOR_NOISE_PROFILE);
                                                    floatVector = new FloatVector();
                                                    floatVector2 = new FloatVector();
                                                    while (i3 < i2) {
                                                        floatVector.m4949b(((Double) pairArr[i3].first).floatValue());
                                                        floatVector2.m4949b(((Double) pairArr[i3].second).floatValue());
                                                    }
                                                    NoiseModel noiseModel4 = new NoiseModel(GcamModuleJNI.NoiseModel_FromShotReadNoiseVector(floatVector.f8261a, floatVector, floatVector2.f8261a, floatVector2));
                                                    GcamModuleJNI.FrameMetadata_dng_noise_model_bayer_set(frameMetadata.f8263a, frameMetadata, noiseModel4.f8320a, noiseModel4);
                                                    str5 = "dynamicbl";
                                                    fArr5 = (float[]) kppVar.mo9517d(CaptureResult.SENSOR_DYNAMIC_BLACK_LEVEL);
                                                    if (fArr5 != null) {
                                                        floatArray5 = new FloatArray4();
                                                        while (i9 < floatArray5.m4942b()) {
                                                            floatArray5.m4944d(i9, fArr5[i9]);
                                                        }
                                                        frameMetadata.m4962l(floatArray5);
                                                    } else {
                                                        blackLevelPattern = (BlackLevelPattern) kmdVarM17682f.mo14559l(CameraCharacteristics.SENSOR_BLACK_LEVEL_PATTERN);
                                                        if (blackLevelPattern != null) {
                                                            floatArray4 = new FloatArray4();
                                                            while (i4 < floatArray4.m4942b()) {
                                                                floatArray4.m4944d(i4, blackLevelPattern.getOffsetForIndex(i4 % 2, i4 / 2));
                                                            }
                                                            frameMetadata.m4962l(floatArray4);
                                                        }
                                                    }
                                                    f = (Float) kppVar.mo9517d(CaptureResult.LENS_FOCUS_DISTANCE);
                                                    Integer num11 = (Integer) kmdVarM17682f.mo14559l(CameraCharacteristics.LENS_INFO_FOCUS_DISTANCE_CALIBRATION);
                                                    if (f != null) {
                                                        GcamModuleJNI.FrameMetadata_focus_distance_diopters_set(frameMetadata.f8263a, frameMetadata, f.floatValue());
                                                    }
                                                    liveHdrMetadata = new LiveHdrMetadata(GcamModuleJNI.new_LiveHdrMetadata(), true);
                                                    aeResults = new AeResults(GcamModuleJNI.new_AeResults(), true);
                                                    if (ivu.f32375c != null) {
                                                        GcamModuleJNI.LiveHdrMetadata_max_hdr_ratio_override_set(liveHdrMetadata.f8311a, liveHdrMetadata, fArr7[0]);
                                                        liveHdrMetadata.m5029c(fArr7[1]);
                                                        liveHdrMetadata.m5028b(fArr7[2]);
                                                        if (!f44464b.f36770c) {
                                                            GcamModuleJNI.LiveHdrMetadata_night_factor_set(liveHdrMetadata.f8311a, liveHdrMetadata, fArr7[3]);
                                                        }
                                                        GcamModuleJNI.LiveHdrMetadata_manual_ec_short_set(liveHdrMetadata.f8311a, liveHdrMetadata, fArr7[i2]);
                                                        GcamModuleJNI.LiveHdrMetadata_manual_portrait_tet_override_set(liveHdrMetadata.f8311a, liveHdrMetadata, fArr7[5]);
                                                    }
                                                    str5 = "gcamae";
                                                    key3 = ivu.f32373a;
                                                    if (key3 != null) {
                                                        AeModeResult aeModeResult10 = new AeModeResult();
                                                        AeModeResult aeModeResult11 = new AeModeResult();
                                                        aeModeResult10.m4880d(fArr6[0]);
                                                        aeModeResult11.m4880d(fArr6[1]);
                                                        aeModeResult10.m4879c(fArr6[2]);
                                                        aeModeResult11.m4879c(fArr6[3]);
                                                        GcamModuleJNI.AeResults_pure_fraction_of_pixels_from_long_exposure_set(aeResults.f8224a, aeResults, fArr6[i2]);
                                                        GcamModuleJNI.AeResults_weighted_fraction_of_pixels_from_long_exposure_set(aeResults.f8224a, aeResults, fArr6[5]);
                                                        GcamModuleJNI.AeModeResult_log_scene_brightness_set(aeModeResult10.f8222a, aeModeResult10, fArr6[6]);
                                                        GcamModuleJNI.AeResults_predicted_image_brightness_set(aeResults.f8224a, aeResults, fArr6[7]);
                                                        GcamModuleJNI.LiveHdrMetadata_motion_magnitude_pix_set(liveHdrMetadata.f8311a, liveHdrMetadata, fArr6[8]);
                                                        GcamModuleJNI.LiveHdrMetadata_metering_interval_ms_set(liveHdrMetadata.f8311a, liveHdrMetadata, fArr6[9]);
                                                        GcamModuleJNI.LiveHdrMetadata_filtered_motion_speed_pix_per_ms_set(liveHdrMetadata.f8311a, liveHdrMetadata, fArr6[10]);
                                                        liveHdrMetadata.m5032f(fArr6[11]);
                                                        liveHdrMetadata.m5030d(fArr6[12]);
                                                        if (length2 > 13) {
                                                            GcamModuleJNI.AeResults_safe_underexposure_set(aeResults.f8224a, aeResults, fArr6[13]);
                                                        }
                                                        if (length2 > 15) {
                                                            AeModeResult aeModeResult12 = new AeModeResult();
                                                            aeModeResult12.m4880d(fArr6[14]);
                                                            aeModeResult12.m4879c(fArr6[15]);
                                                            GcamModuleJNI.AeResults_portrait_result_set(aeResults.f8224a, aeResults, AeModeResult.m4877a(aeModeResult12), aeModeResult12);
                                                            if (length2 > 16) {
                                                                liveHdrMetadata.m5031e(fArr6[16]);
                                                            } else {
                                                                liveHdrMetadata.m5031e(fArr6[15]);
                                                            }
                                                        }
                                                        aeModeResultArr = new AeModeResult[]{aeModeResult10, aeModeResult11};
                                                        long j4 = aeResults.f8224a;
                                                        jArr = new long[2];
                                                        while (i8 < 2) {
                                                            jArr[i8] = AeModeResult.m4877a(aeModeResultArr[i8]);
                                                        }
                                                        GcamModuleJNI.AeResults_mode_result_set(j4, aeResults, jArr);
                                                    }
                                                    str4 = "smask";
                                                    if (ivw.f32425k != null) {
                                                        bArr = (byte[]) kppVar.mo9517d(ivw.f32425k);
                                                        if (bArr != null) {
                                                            frameMetadata = frameMetadata;
                                                            i5 = 0;
                                                        } else {
                                                            frameMetadata = frameMetadata;
                                                            i5 = 0;
                                                        }
                                                    } else {
                                                        frameMetadata = frameMetadata;
                                                        i5 = 0;
                                                    }
                                                    frameMetadata = frameMetadata;
                                                    GcamModuleJNI.FrameMetadata_live_hdr_set(frameMetadata.f8263a, frameMetadata, liveHdrMetadata.f8311a, liveHdrMetadata);
                                                    GcamModuleJNI.FrameMetadata_ae_results_set(frameMetadata.f8263a, frameMetadata, AeResults.m4881b(aeResults), aeResults);
                                                    str5 = "3a";
                                                    iIntValue2 = ((Integer) kppVar.mo9517d(CaptureResult.CONTROL_MODE)).intValue();
                                                    nrf[] nrfVarArr5 = nrf.f44179g;
                                                    if (iIntValue2 < 6) {
                                                        i6 = 0;
                                                        while (true) {
                                                            nrfVarArr = nrf.f44179g;
                                                            if (i6 >= 6) {
                                                                throw new IllegalArgumentException(str2 + nrf.class.toString() + str9 + iIntValue2);
                                                            }
                                                            nrfVar2 = nrfVarArr[i6];
                                                            if (nrfVar2.f44180h == iIntValue2) {
                                                                nrfVar = nrfVar2;
                                                            } else {
                                                                i6++;
                                                            }
                                                        }
                                                    } else {
                                                        i6 = 0;
                                                        while (true) {
                                                            nrfVarArr = nrf.f44179g;
                                                            if (i6 >= 6) {
                                                                throw new IllegalArgumentException(str2 + nrf.class.toString() + str9 + iIntValue2);
                                                            }
                                                            nrfVar2 = nrfVarArr[i6];
                                                            if (nrfVar2.f44180h == iIntValue2) {
                                                                nrfVar = nrfVar2;
                                                            } else {
                                                                i6++;
                                                            }
                                                        }
                                                    }
                                                    GcamModuleJNI.FrameMetadata_control_mode_set(frameMetadata.f8263a, frameMetadata, nrfVar.f44180h);
                                                    aeMetadataM4954d = frameMetadata.m4954d();
                                                    GcamModuleJNI.AeMetadata_mode_set(aeMetadataM4954d.f8221a, aeMetadataM4954d, nqx.m17628a(((Integer) kppVar.mo9517d(CaptureResult.CONTROL_AE_MODE)).intValue()).f44108h);
                                                    GcamModuleJNI.AeMetadata_lock_set(aeMetadataM4954d.f8221a, aeMetadataM4954d, ((Boolean) kppVar.mo9517d(CaptureResult.CONTROL_AE_LOCK)).booleanValue());
                                                    iIntValue3 = ((Integer) kppVar.mo9517d(CaptureResult.CONTROL_AE_STATE)).intValue();
                                                    nqy[] nqyVarArr6 = nqy.f44117h;
                                                    if (iIntValue3 < 7) {
                                                        i7 = 0;
                                                        while (true) {
                                                            nqyVarArr = nqy.f44117h;
                                                            if (i7 >= 7) {
                                                                String str17 = str9;
                                                                throw new IllegalArgumentException(str2 + nqy.class.toString() + str17 + iIntValue3);
                                                            }
                                                            nqyVar2 = nqyVarArr[i7];
                                                            if (nqyVar2.f44118i == iIntValue3) {
                                                                nqyVar = nqyVar2;
                                                            } else {
                                                                i7++;
                                                            }
                                                        }
                                                    } else {
                                                        i7 = 0;
                                                        while (true) {
                                                            nqyVarArr = nqy.f44117h;
                                                            if (i7 >= 7) {
                                                                String str18 = str9;
                                                                throw new IllegalArgumentException(str2 + nqy.class.toString() + str18 + iIntValue3);
                                                            }
                                                            nqyVar2 = nqyVarArr[i7];
                                                            if (nqyVar2.f44118i == iIntValue3) {
                                                                nqyVar = nqyVar2;
                                                            } else {
                                                                i7++;
                                                            }
                                                        }
                                                    }
                                                    GcamModuleJNI.AeMetadata_state_set(aeMetadataM4954d.f8221a, aeMetadataM4954d, nqyVar.f44118i);
                                                    num2 = (Integer) kppVar.mo9517d(CaptureResult.CONTROL_AE_PRECAPTURE_TRIGGER);
                                                    if (num2 != null) {
                                                        GcamModuleJNI.AeMetadata_precapture_trigger_set(aeMetadataM4954d.f8221a, aeMetadataM4954d, num2.intValue());
                                                    }
                                                    GcamModuleJNI.AeMetadata_exposure_compensation_set(aeMetadataM4954d.f8221a, aeMetadataM4954d, m17678a(((Integer) kppVar.mo9517d(CaptureResult.CONTROL_AE_EXPOSURE_COMPENSATION)).intValue()));
                                                    AwbMetadata awbMetadataM4956f7 = frameMetadata.m4956f();
                                                    GcamModuleJNI.AwbMetadata_mode_set(awbMetadataM4956f7.f8231a, awbMetadataM4956f7, ((Integer) kppVar.mo9517d(CaptureResult.CONTROL_AWB_MODE)).intValue());
                                                    GcamModuleJNI.AwbMetadata_lock_set(awbMetadataM4956f7.f8231a, awbMetadataM4956f7, ((Boolean) kppVar.mo9517d(CaptureResult.CONTROL_AWB_LOCK)).booleanValue());
                                                    GcamModuleJNI.AwbMetadata_state_set(awbMetadataM4956f7.f8231a, awbMetadataM4956f7, ((Integer) kppVar.mo9517d(CaptureResult.CONTROL_AWB_STATE)).intValue());
                                                    AfMetadata afMetadataM4955e7 = frameMetadata.m4955e();
                                                    afMetadataM4955e7.m4896b(nra.m17629a(((Integer) kppVar.mo9517d(CaptureResult.CONTROL_AF_MODE)).intValue()));
                                                    afMetadataM4955e7.m4897c(nrb.m17630a(((Integer) kppVar.mo9517d(CaptureResult.CONTROL_AF_STATE)).intValue()));
                                                    afMetadataM4955e7.m4898d(((Integer) kppVar.mo9517d(CaptureResult.CONTROL_AF_TRIGGER)).intValue());
                                                    num3 = (Integer) kppVar.mo9517d(CaptureResult.LENS_STATE);
                                                    if (num3 != null) {
                                                        iIntValue4 = num3.intValue();
                                                        nrr[] nrrVarArr7 = nrr.f44283d;
                                                        if (iIntValue4 < 3) {
                                                            while (true) {
                                                                nrrVarArr = nrr.f44283d;
                                                                if (i5 < 3) {
                                                                    throw new IllegalArgumentException(str2 + nrr.class.toString() + str9 + iIntValue4);
                                                                }
                                                                nrrVar = nrrVarArr[i5];
                                                                if (nrrVar.f44284e == iIntValue4) {
                                                                    i5++;
                                                                }
                                                            }
                                                            GcamModuleJNI.FrameMetadata_lens_state_set(frameMetadata.f8263a, frameMetadata, nrrVar.f44284e);
                                                            str4 = "bgstats";
                                                            key4 = ivt.f32366t;
                                                            if (key4 != null) {
                                                                bArr2 = (byte[]) kppVar.mo9517d(key4);
                                                                if (bArr2 != null) {
                                                                    ByteBuffer byteBufferOrder16 = ByteBuffer.allocateDirect(bArr2.length).order(ByteOrder.nativeOrder());
                                                                    byteBufferOrder16.put(bArr2);
                                                                    IspAwbMetadata ispAwbMetadata16 = new IspAwbMetadata(GcamModuleJNI.DeserializeFromBytes(nsd.m17642a(new nsd(BufferUtils.m4902a(byteBufferOrder16))), byteBufferOrder16.capacity()));
                                                                    GcamModuleJNI.FrameMetadata_isp_metadata_set(frameMetadata.f8263a, frameMetadata, ispAwbMetadata16.f8306a, ispAwbMetadata16);
                                                                }
                                                                if (frameMetadata.m4960j() != nse.f44367f) {
                                                                    GcamModuleJNI.ApplySensorBinning__SWIG_0(2, true, false, FrameMetadata.m4951b(frameMetadata), frameMetadata);
                                                                } else {
                                                                    GcamModuleJNI.ApplySensorBinning__SWIG_0(2, true, false, FrameMetadata.m4951b(frameMetadata), frameMetadata);
                                                                }
                                                                str5 = "halaf";
                                                                bArrM17661I = m17661I(ivx.f32439b, kppVar);
                                                                if (bArrM17661I != null) {
                                                                    ntw.m17717c(bArrM17661I, frameMetadata.m4958h());
                                                                }
                                                                bArrM17661I2 = m17661I(ivx.f32438a, kppVar);
                                                                if (bArrM17661I2 != null) {
                                                                    HalAfMetadata halAfMetadataM4958h1111 = frameMetadata.m4958h();
                                                                    Pair pairM17716b1111 = ntw.m17716b(bArrM17661I2);
                                                                    GcamModuleJNI.HalAfMetadata_SetAfTargetFocusInfoFromBytes(halAfMetadataM4958h1111.f8287a, halAfMetadataM4958h1111, nsd.m17642a(new nsd(((Long) pairM17716b1111.second).longValue())), ((ByteBuffer) pairM17716b1111.first).capacity());
                                                                }
                                                            } else {
                                                                if (frameMetadata.m4960j() != nse.f44367f) {
                                                                    GcamModuleJNI.ApplySensorBinning__SWIG_0(2, true, false, FrameMetadata.m4951b(frameMetadata), frameMetadata);
                                                                } else {
                                                                    GcamModuleJNI.ApplySensorBinning__SWIG_0(2, true, false, FrameMetadata.m4951b(frameMetadata), frameMetadata);
                                                                }
                                                                str5 = "halaf";
                                                                bArrM17661I = m17661I(ivx.f32439b, kppVar);
                                                                if (bArrM17661I != null) {
                                                                    ntw.m17717c(bArrM17661I, frameMetadata.m4958h());
                                                                }
                                                                bArrM17661I2 = m17661I(ivx.f32438a, kppVar);
                                                                if (bArrM17661I2 != null) {
                                                                    HalAfMetadata halAfMetadataM4958h1112 = frameMetadata.m4958h();
                                                                    Pair pairM17716b1112 = ntw.m17716b(bArrM17661I2);
                                                                    GcamModuleJNI.HalAfMetadata_SetAfTargetFocusInfoFromBytes(halAfMetadataM4958h1112.f8287a, halAfMetadataM4958h1112, nsd.m17642a(new nsd(((Long) pairM17716b1112.second).longValue())), ((ByteBuffer) pairM17716b1112.first).capacity());
                                                                }
                                                            }
                                                        } else {
                                                            while (true) {
                                                                nrrVarArr = nrr.f44283d;
                                                                if (i5 < 3) {
                                                                    throw new IllegalArgumentException(str2 + nrr.class.toString() + str9 + iIntValue4);
                                                                }
                                                                nrrVar = nrrVarArr[i5];
                                                                if (nrrVar.f44284e == iIntValue4) {
                                                                    i5++;
                                                                }
                                                            }
                                                            GcamModuleJNI.FrameMetadata_lens_state_set(frameMetadata.f8263a, frameMetadata, nrrVar.f44284e);
                                                            str4 = "bgstats";
                                                            key4 = ivt.f32366t;
                                                            if (key4 != null) {
                                                                bArr2 = (byte[]) kppVar.mo9517d(key4);
                                                                if (bArr2 != null) {
                                                                    ByteBuffer byteBufferOrder17 = ByteBuffer.allocateDirect(bArr2.length).order(ByteOrder.nativeOrder());
                                                                    byteBufferOrder17.put(bArr2);
                                                                    IspAwbMetadata ispAwbMetadata17 = new IspAwbMetadata(GcamModuleJNI.DeserializeFromBytes(nsd.m17642a(new nsd(BufferUtils.m4902a(byteBufferOrder17))), byteBufferOrder17.capacity()));
                                                                    GcamModuleJNI.FrameMetadata_isp_metadata_set(frameMetadata.f8263a, frameMetadata, ispAwbMetadata17.f8306a, ispAwbMetadata17);
                                                                }
                                                                if (frameMetadata.m4960j() != nse.f44367f) {
                                                                    GcamModuleJNI.ApplySensorBinning__SWIG_0(2, true, false, FrameMetadata.m4951b(frameMetadata), frameMetadata);
                                                                } else {
                                                                    GcamModuleJNI.ApplySensorBinning__SWIG_0(2, true, false, FrameMetadata.m4951b(frameMetadata), frameMetadata);
                                                                }
                                                                str5 = "halaf";
                                                                bArrM17661I = m17661I(ivx.f32439b, kppVar);
                                                                if (bArrM17661I != null) {
                                                                    ntw.m17717c(bArrM17661I, frameMetadata.m4958h());
                                                                }
                                                                bArrM17661I2 = m17661I(ivx.f32438a, kppVar);
                                                                if (bArrM17661I2 != null) {
                                                                    HalAfMetadata halAfMetadataM4958h1113 = frameMetadata.m4958h();
                                                                    Pair pairM17716b1113 = ntw.m17716b(bArrM17661I2);
                                                                    GcamModuleJNI.HalAfMetadata_SetAfTargetFocusInfoFromBytes(halAfMetadataM4958h1113.f8287a, halAfMetadataM4958h1113, nsd.m17642a(new nsd(((Long) pairM17716b1113.second).longValue())), ((ByteBuffer) pairM17716b1113.first).capacity());
                                                                }
                                                            } else {
                                                                if (frameMetadata.m4960j() != nse.f44367f) {
                                                                    GcamModuleJNI.ApplySensorBinning__SWIG_0(2, true, false, FrameMetadata.m4951b(frameMetadata), frameMetadata);
                                                                } else {
                                                                    GcamModuleJNI.ApplySensorBinning__SWIG_0(2, true, false, FrameMetadata.m4951b(frameMetadata), frameMetadata);
                                                                }
                                                                str5 = "halaf";
                                                                bArrM17661I = m17661I(ivx.f32439b, kppVar);
                                                                if (bArrM17661I != null) {
                                                                    ntw.m17717c(bArrM17661I, frameMetadata.m4958h());
                                                                }
                                                                bArrM17661I2 = m17661I(ivx.f32438a, kppVar);
                                                                if (bArrM17661I2 != null) {
                                                                    HalAfMetadata halAfMetadataM4958h1114 = frameMetadata.m4958h();
                                                                    Pair pairM17716b1114 = ntw.m17716b(bArrM17661I2);
                                                                    GcamModuleJNI.HalAfMetadata_SetAfTargetFocusInfoFromBytes(halAfMetadataM4958h1114.f8287a, halAfMetadataM4958h1114, nsd.m17642a(new nsd(((Long) pairM17716b1114.second).longValue())), ((ByteBuffer) pairM17716b1114.first).capacity());
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        str4 = "bgstats";
                                                        key4 = ivt.f32366t;
                                                        if (key4 != null) {
                                                            bArr2 = (byte[]) kppVar.mo9517d(key4);
                                                            if (bArr2 != null) {
                                                                ByteBuffer byteBufferOrder18 = ByteBuffer.allocateDirect(bArr2.length).order(ByteOrder.nativeOrder());
                                                                byteBufferOrder18.put(bArr2);
                                                                IspAwbMetadata ispAwbMetadata18 = new IspAwbMetadata(GcamModuleJNI.DeserializeFromBytes(nsd.m17642a(new nsd(BufferUtils.m4902a(byteBufferOrder18))), byteBufferOrder18.capacity()));
                                                                GcamModuleJNI.FrameMetadata_isp_metadata_set(frameMetadata.f8263a, frameMetadata, ispAwbMetadata18.f8306a, ispAwbMetadata18);
                                                            }
                                                            if (frameMetadata.m4960j() != nse.f44367f) {
                                                                GcamModuleJNI.ApplySensorBinning__SWIG_0(2, true, false, FrameMetadata.m4951b(frameMetadata), frameMetadata);
                                                            } else {
                                                                GcamModuleJNI.ApplySensorBinning__SWIG_0(2, true, false, FrameMetadata.m4951b(frameMetadata), frameMetadata);
                                                            }
                                                            str5 = "halaf";
                                                            bArrM17661I = m17661I(ivx.f32439b, kppVar);
                                                            if (bArrM17661I != null) {
                                                                ntw.m17717c(bArrM17661I, frameMetadata.m4958h());
                                                            }
                                                            bArrM17661I2 = m17661I(ivx.f32438a, kppVar);
                                                            if (bArrM17661I2 != null) {
                                                                HalAfMetadata halAfMetadataM4958h1115 = frameMetadata.m4958h();
                                                                Pair pairM17716b1115 = ntw.m17716b(bArrM17661I2);
                                                                GcamModuleJNI.HalAfMetadata_SetAfTargetFocusInfoFromBytes(halAfMetadataM4958h1115.f8287a, halAfMetadataM4958h1115, nsd.m17642a(new nsd(((Long) pairM17716b1115.second).longValue())), ((ByteBuffer) pairM17716b1115.first).capacity());
                                                            }
                                                        } else {
                                                            if (frameMetadata.m4960j() != nse.f44367f) {
                                                                GcamModuleJNI.ApplySensorBinning__SWIG_0(2, true, false, FrameMetadata.m4951b(frameMetadata), frameMetadata);
                                                            } else {
                                                                GcamModuleJNI.ApplySensorBinning__SWIG_0(2, true, false, FrameMetadata.m4951b(frameMetadata), frameMetadata);
                                                            }
                                                            str5 = "halaf";
                                                            bArrM17661I = m17661I(ivx.f32439b, kppVar);
                                                            if (bArrM17661I != null) {
                                                                ntw.m17717c(bArrM17661I, frameMetadata.m4958h());
                                                            }
                                                            bArrM17661I2 = m17661I(ivx.f32438a, kppVar);
                                                            if (bArrM17661I2 != null) {
                                                                HalAfMetadata halAfMetadataM4958h1116 = frameMetadata.m4958h();
                                                                Pair pairM17716b1116 = ntw.m17716b(bArrM17661I2);
                                                                GcamModuleJNI.HalAfMetadata_SetAfTargetFocusInfoFromBytes(halAfMetadataM4958h1116.f8287a, halAfMetadataM4958h1116, nsd.m17642a(new nsd(((Long) pairM17716b1116.second).longValue())), ((ByteBuffer) pairM17716b1116.first).capacity());
                                                            }
                                                        }
                                                    }
                                                }
                                            } else {
                                                frameMetadata.m4963m(nrj.f44222b);
                                                str3 = "awb";
                                                AwbInfo awbInfoM17666i3 = m17666i(kppVar, kmdVarM17682f);
                                                GcamModuleJNI.FrameMetadata_wb_set(frameMetadata.f8263a, frameMetadata, AwbInfo.m4899a(awbInfoM17666i3), awbInfoM17666i3);
                                                str3 = "bl";
                                                bool = (Boolean) kppVar.mo9517d(CaptureResult.BLACK_LEVEL_LOCK);
                                                if (bool == null) {
                                                    bool = false;
                                                    GcamModuleJNI.FrameMetadata_was_black_level_locked_set(frameMetadata.f8263a, frameMetadata, bool.booleanValue());
                                                    GcamModuleJNI.FrameMetadata_frame_duration_ms_set(frameMetadata.f8263a, frameMetadata, m17675x(((Long) kppVar.mo9517d(CaptureResult.SENSOR_FRAME_DURATION)).longValue()));
                                                    GcamModuleJNI.FrameMetadata_timestamp_ns_set(frameMetadata.f8263a, frameMetadata, ((Long) kppVar.mo9517d(CaptureResult.SENSOR_TIMESTAMP)).longValue());
                                                    GcamModuleJNI.FrameMetadata_sensor_temp_set(frameMetadata.f8263a, frameMetadata, GcamModuleJNI.kSensorTempUnknown_get());
                                                    SceneFlicker sceneFlicker5 = new SceneFlicker();
                                                    key = ivv.f32398g;
                                                    fIntValue = -1.0f;
                                                    if (key != null) {
                                                        fIntValue2 = -1.0f;
                                                    } else {
                                                        fIntValue2 = -1.0f;
                                                    }
                                                    key2 = ivv.f32399h;
                                                    if (key2 != null) {
                                                        fIntValue = num4.intValue() / 10000.0f;
                                                    }
                                                    if (fIntValue2 >= 0.0f) {
                                                        switch (num.intValue()) {
                                                            case 0:
                                                                fIntValue2 = 0.0f;
                                                                fIntValue = 1.0f;
                                                                break;
                                                            case 1:
                                                                fIntValue2 = 100.0f;
                                                                fIntValue = 1.0f;
                                                                break;
                                                            case 2:
                                                                fIntValue2 = 120.0f;
                                                                fIntValue = 1.0f;
                                                                break;
                                                            default:
                                                                Log.e(f44463a, BEeWZPor.BZKQtFscIANQJ);
                                                                break;
                                                        }
                                                    } else {
                                                        switch (num.intValue()) {
                                                            case 0:
                                                                fIntValue2 = 0.0f;
                                                                fIntValue = 1.0f;
                                                                break;
                                                            case 1:
                                                                fIntValue2 = 100.0f;
                                                                fIntValue = 1.0f;
                                                                break;
                                                            case 2:
                                                                fIntValue2 = 120.0f;
                                                                fIntValue = 1.0f;
                                                                break;
                                                            default:
                                                                Log.e(f44463a, BEeWZPor.BZKQtFscIANQJ);
                                                                break;
                                                        }
                                                    }
                                                    GcamModuleJNI.SceneFlicker_frequency_set(sceneFlicker5.f8352a, sceneFlicker5, fIntValue2);
                                                    GcamModuleJNI.SceneFlicker_confidence_set(sceneFlicker5.f8352a, sceneFlicker5, fIntValue);
                                                    GcamModuleJNI.FrameMetadata_scene_flicker_set(frameMetadata.f8263a, frameMetadata, sceneFlicker5.f8352a, sceneFlicker5);
                                                    str3 = "noise";
                                                    pairArr = (Pair[]) kppVar.mo9517d(CaptureResult.SENSOR_NOISE_PROFILE);
                                                    floatVector = new FloatVector();
                                                    floatVector2 = new FloatVector();
                                                    while (i3 < i2) {
                                                        floatVector.m4949b(((Double) pairArr[i3].first).floatValue());
                                                        floatVector2.m4949b(((Double) pairArr[i3].second).floatValue());
                                                    }
                                                    NoiseModel noiseModel5 = new NoiseModel(GcamModuleJNI.NoiseModel_FromShotReadNoiseVector(floatVector.f8261a, floatVector, floatVector2.f8261a, floatVector2));
                                                    GcamModuleJNI.FrameMetadata_dng_noise_model_bayer_set(frameMetadata.f8263a, frameMetadata, noiseModel5.f8320a, noiseModel5);
                                                    str5 = "dynamicbl";
                                                    fArr5 = (float[]) kppVar.mo9517d(CaptureResult.SENSOR_DYNAMIC_BLACK_LEVEL);
                                                    if (fArr5 != null) {
                                                        floatArray5 = new FloatArray4();
                                                        while (i9 < floatArray5.m4942b()) {
                                                            floatArray5.m4944d(i9, fArr5[i9]);
                                                        }
                                                        frameMetadata.m4962l(floatArray5);
                                                    } else {
                                                        blackLevelPattern = (BlackLevelPattern) kmdVarM17682f.mo14559l(CameraCharacteristics.SENSOR_BLACK_LEVEL_PATTERN);
                                                        if (blackLevelPattern != null) {
                                                            floatArray4 = new FloatArray4();
                                                            while (i4 < floatArray4.m4942b()) {
                                                                floatArray4.m4944d(i4, blackLevelPattern.getOffsetForIndex(i4 % 2, i4 / 2));
                                                            }
                                                            frameMetadata.m4962l(floatArray4);
                                                        }
                                                    }
                                                    f = (Float) kppVar.mo9517d(CaptureResult.LENS_FOCUS_DISTANCE);
                                                    Integer num12 = (Integer) kmdVarM17682f.mo14559l(CameraCharacteristics.LENS_INFO_FOCUS_DISTANCE_CALIBRATION);
                                                    if (f != null) {
                                                        GcamModuleJNI.FrameMetadata_focus_distance_diopters_set(frameMetadata.f8263a, frameMetadata, f.floatValue());
                                                    }
                                                    liveHdrMetadata = new LiveHdrMetadata(GcamModuleJNI.new_LiveHdrMetadata(), true);
                                                    aeResults = new AeResults(GcamModuleJNI.new_AeResults(), true);
                                                    if (ivu.f32375c != null) {
                                                        GcamModuleJNI.LiveHdrMetadata_max_hdr_ratio_override_set(liveHdrMetadata.f8311a, liveHdrMetadata, fArr7[0]);
                                                        liveHdrMetadata.m5029c(fArr7[1]);
                                                        liveHdrMetadata.m5028b(fArr7[2]);
                                                        if (!f44464b.f36770c) {
                                                            GcamModuleJNI.LiveHdrMetadata_night_factor_set(liveHdrMetadata.f8311a, liveHdrMetadata, fArr7[3]);
                                                        }
                                                        GcamModuleJNI.LiveHdrMetadata_manual_ec_short_set(liveHdrMetadata.f8311a, liveHdrMetadata, fArr7[i2]);
                                                        GcamModuleJNI.LiveHdrMetadata_manual_portrait_tet_override_set(liveHdrMetadata.f8311a, liveHdrMetadata, fArr7[5]);
                                                    }
                                                    str5 = "gcamae";
                                                    key3 = ivu.f32373a;
                                                    if (key3 != null) {
                                                        AeModeResult aeModeResult13 = new AeModeResult();
                                                        AeModeResult aeModeResult14 = new AeModeResult();
                                                        aeModeResult13.m4880d(fArr6[0]);
                                                        aeModeResult14.m4880d(fArr6[1]);
                                                        aeModeResult13.m4879c(fArr6[2]);
                                                        aeModeResult14.m4879c(fArr6[3]);
                                                        GcamModuleJNI.AeResults_pure_fraction_of_pixels_from_long_exposure_set(aeResults.f8224a, aeResults, fArr6[i2]);
                                                        GcamModuleJNI.AeResults_weighted_fraction_of_pixels_from_long_exposure_set(aeResults.f8224a, aeResults, fArr6[5]);
                                                        GcamModuleJNI.AeModeResult_log_scene_brightness_set(aeModeResult13.f8222a, aeModeResult13, fArr6[6]);
                                                        GcamModuleJNI.AeResults_predicted_image_brightness_set(aeResults.f8224a, aeResults, fArr6[7]);
                                                        GcamModuleJNI.LiveHdrMetadata_motion_magnitude_pix_set(liveHdrMetadata.f8311a, liveHdrMetadata, fArr6[8]);
                                                        GcamModuleJNI.LiveHdrMetadata_metering_interval_ms_set(liveHdrMetadata.f8311a, liveHdrMetadata, fArr6[9]);
                                                        GcamModuleJNI.LiveHdrMetadata_filtered_motion_speed_pix_per_ms_set(liveHdrMetadata.f8311a, liveHdrMetadata, fArr6[10]);
                                                        liveHdrMetadata.m5032f(fArr6[11]);
                                                        liveHdrMetadata.m5030d(fArr6[12]);
                                                        if (length2 > 13) {
                                                            GcamModuleJNI.AeResults_safe_underexposure_set(aeResults.f8224a, aeResults, fArr6[13]);
                                                        }
                                                        if (length2 > 15) {
                                                            AeModeResult aeModeResult15 = new AeModeResult();
                                                            aeModeResult15.m4880d(fArr6[14]);
                                                            aeModeResult15.m4879c(fArr6[15]);
                                                            GcamModuleJNI.AeResults_portrait_result_set(aeResults.f8224a, aeResults, AeModeResult.m4877a(aeModeResult15), aeModeResult15);
                                                            if (length2 > 16) {
                                                                liveHdrMetadata.m5031e(fArr6[16]);
                                                            } else {
                                                                liveHdrMetadata.m5031e(fArr6[15]);
                                                            }
                                                        }
                                                        aeModeResultArr = new AeModeResult[]{aeModeResult13, aeModeResult14};
                                                        long j5 = aeResults.f8224a;
                                                        jArr = new long[2];
                                                        while (i8 < 2) {
                                                            jArr[i8] = AeModeResult.m4877a(aeModeResultArr[i8]);
                                                        }
                                                        GcamModuleJNI.AeResults_mode_result_set(j5, aeResults, jArr);
                                                    }
                                                    str4 = "smask";
                                                    if (ivw.f32425k != null) {
                                                        bArr = (byte[]) kppVar.mo9517d(ivw.f32425k);
                                                        if (bArr != null) {
                                                            frameMetadata = frameMetadata;
                                                            i5 = 0;
                                                        } else {
                                                            frameMetadata = frameMetadata;
                                                            i5 = 0;
                                                        }
                                                    } else {
                                                        frameMetadata = frameMetadata;
                                                        i5 = 0;
                                                    }
                                                    frameMetadata = frameMetadata;
                                                    GcamModuleJNI.FrameMetadata_live_hdr_set(frameMetadata.f8263a, frameMetadata, liveHdrMetadata.f8311a, liveHdrMetadata);
                                                    GcamModuleJNI.FrameMetadata_ae_results_set(frameMetadata.f8263a, frameMetadata, AeResults.m4881b(aeResults), aeResults);
                                                    str5 = "3a";
                                                    iIntValue2 = ((Integer) kppVar.mo9517d(CaptureResult.CONTROL_MODE)).intValue();
                                                    nrf[] nrfVarArr6 = nrf.f44179g;
                                                    if (iIntValue2 < 6) {
                                                        i6 = 0;
                                                        while (true) {
                                                            nrfVarArr = nrf.f44179g;
                                                            if (i6 >= 6) {
                                                                throw new IllegalArgumentException(str2 + nrf.class.toString() + str9 + iIntValue2);
                                                            }
                                                            nrfVar2 = nrfVarArr[i6];
                                                            if (nrfVar2.f44180h == iIntValue2) {
                                                                nrfVar = nrfVar2;
                                                            } else {
                                                                i6++;
                                                            }
                                                        }
                                                    } else {
                                                        i6 = 0;
                                                        while (true) {
                                                            nrfVarArr = nrf.f44179g;
                                                            if (i6 >= 6) {
                                                                throw new IllegalArgumentException(str2 + nrf.class.toString() + str9 + iIntValue2);
                                                            }
                                                            nrfVar2 = nrfVarArr[i6];
                                                            if (nrfVar2.f44180h == iIntValue2) {
                                                                nrfVar = nrfVar2;
                                                            } else {
                                                                i6++;
                                                            }
                                                        }
                                                    }
                                                    GcamModuleJNI.FrameMetadata_control_mode_set(frameMetadata.f8263a, frameMetadata, nrfVar.f44180h);
                                                    aeMetadataM4954d = frameMetadata.m4954d();
                                                    GcamModuleJNI.AeMetadata_mode_set(aeMetadataM4954d.f8221a, aeMetadataM4954d, nqx.m17628a(((Integer) kppVar.mo9517d(CaptureResult.CONTROL_AE_MODE)).intValue()).f44108h);
                                                    GcamModuleJNI.AeMetadata_lock_set(aeMetadataM4954d.f8221a, aeMetadataM4954d, ((Boolean) kppVar.mo9517d(CaptureResult.CONTROL_AE_LOCK)).booleanValue());
                                                    iIntValue3 = ((Integer) kppVar.mo9517d(CaptureResult.CONTROL_AE_STATE)).intValue();
                                                    nqy[] nqyVarArr7 = nqy.f44117h;
                                                    if (iIntValue3 < 7) {
                                                        i7 = 0;
                                                        while (true) {
                                                            nqyVarArr = nqy.f44117h;
                                                            if (i7 >= 7) {
                                                                String str19 = str9;
                                                                throw new IllegalArgumentException(str2 + nqy.class.toString() + str19 + iIntValue3);
                                                            }
                                                            nqyVar2 = nqyVarArr[i7];
                                                            if (nqyVar2.f44118i == iIntValue3) {
                                                                nqyVar = nqyVar2;
                                                            } else {
                                                                i7++;
                                                            }
                                                        }
                                                    } else {
                                                        i7 = 0;
                                                        while (true) {
                                                            nqyVarArr = nqy.f44117h;
                                                            if (i7 >= 7) {
                                                                String str110 = str9;
                                                                throw new IllegalArgumentException(str2 + nqy.class.toString() + str110 + iIntValue3);
                                                            }
                                                            nqyVar2 = nqyVarArr[i7];
                                                            if (nqyVar2.f44118i == iIntValue3) {
                                                                nqyVar = nqyVar2;
                                                            } else {
                                                                i7++;
                                                            }
                                                        }
                                                    }
                                                    GcamModuleJNI.AeMetadata_state_set(aeMetadataM4954d.f8221a, aeMetadataM4954d, nqyVar.f44118i);
                                                    num2 = (Integer) kppVar.mo9517d(CaptureResult.CONTROL_AE_PRECAPTURE_TRIGGER);
                                                    if (num2 != null) {
                                                        GcamModuleJNI.AeMetadata_precapture_trigger_set(aeMetadataM4954d.f8221a, aeMetadataM4954d, num2.intValue());
                                                    }
                                                    GcamModuleJNI.AeMetadata_exposure_compensation_set(aeMetadataM4954d.f8221a, aeMetadataM4954d, m17678a(((Integer) kppVar.mo9517d(CaptureResult.CONTROL_AE_EXPOSURE_COMPENSATION)).intValue()));
                                                    AwbMetadata awbMetadataM4956f8 = frameMetadata.m4956f();
                                                    GcamModuleJNI.AwbMetadata_mode_set(awbMetadataM4956f8.f8231a, awbMetadataM4956f8, ((Integer) kppVar.mo9517d(CaptureResult.CONTROL_AWB_MODE)).intValue());
                                                    GcamModuleJNI.AwbMetadata_lock_set(awbMetadataM4956f8.f8231a, awbMetadataM4956f8, ((Boolean) kppVar.mo9517d(CaptureResult.CONTROL_AWB_LOCK)).booleanValue());
                                                    GcamModuleJNI.AwbMetadata_state_set(awbMetadataM4956f8.f8231a, awbMetadataM4956f8, ((Integer) kppVar.mo9517d(CaptureResult.CONTROL_AWB_STATE)).intValue());
                                                    AfMetadata afMetadataM4955e8 = frameMetadata.m4955e();
                                                    afMetadataM4955e8.m4896b(nra.m17629a(((Integer) kppVar.mo9517d(CaptureResult.CONTROL_AF_MODE)).intValue()));
                                                    afMetadataM4955e8.m4897c(nrb.m17630a(((Integer) kppVar.mo9517d(CaptureResult.CONTROL_AF_STATE)).intValue()));
                                                    afMetadataM4955e8.m4898d(((Integer) kppVar.mo9517d(CaptureResult.CONTROL_AF_TRIGGER)).intValue());
                                                    num3 = (Integer) kppVar.mo9517d(CaptureResult.LENS_STATE);
                                                    if (num3 != null) {
                                                        iIntValue4 = num3.intValue();
                                                        nrr[] nrrVarArr8 = nrr.f44283d;
                                                        if (iIntValue4 < 3) {
                                                            while (true) {
                                                                nrrVarArr = nrr.f44283d;
                                                                if (i5 < 3) {
                                                                    throw new IllegalArgumentException(str2 + nrr.class.toString() + str9 + iIntValue4);
                                                                }
                                                                nrrVar = nrrVarArr[i5];
                                                                if (nrrVar.f44284e == iIntValue4) {
                                                                    i5++;
                                                                }
                                                            }
                                                            GcamModuleJNI.FrameMetadata_lens_state_set(frameMetadata.f8263a, frameMetadata, nrrVar.f44284e);
                                                            str4 = "bgstats";
                                                            key4 = ivt.f32366t;
                                                            if (key4 != null) {
                                                                bArr2 = (byte[]) kppVar.mo9517d(key4);
                                                                if (bArr2 != null) {
                                                                    ByteBuffer byteBufferOrder19 = ByteBuffer.allocateDirect(bArr2.length).order(ByteOrder.nativeOrder());
                                                                    byteBufferOrder19.put(bArr2);
                                                                    IspAwbMetadata ispAwbMetadata19 = new IspAwbMetadata(GcamModuleJNI.DeserializeFromBytes(nsd.m17642a(new nsd(BufferUtils.m4902a(byteBufferOrder19))), byteBufferOrder19.capacity()));
                                                                    GcamModuleJNI.FrameMetadata_isp_metadata_set(frameMetadata.f8263a, frameMetadata, ispAwbMetadata19.f8306a, ispAwbMetadata19);
                                                                }
                                                                if (frameMetadata.m4960j() != nse.f44367f) {
                                                                    GcamModuleJNI.ApplySensorBinning__SWIG_0(2, true, false, FrameMetadata.m4951b(frameMetadata), frameMetadata);
                                                                } else {
                                                                    GcamModuleJNI.ApplySensorBinning__SWIG_0(2, true, false, FrameMetadata.m4951b(frameMetadata), frameMetadata);
                                                                }
                                                                str5 = "halaf";
                                                                bArrM17661I = m17661I(ivx.f32439b, kppVar);
                                                                if (bArrM17661I != null) {
                                                                    ntw.m17717c(bArrM17661I, frameMetadata.m4958h());
                                                                }
                                                                bArrM17661I2 = m17661I(ivx.f32438a, kppVar);
                                                                if (bArrM17661I2 != null) {
                                                                    HalAfMetadata halAfMetadataM4958h1117 = frameMetadata.m4958h();
                                                                    Pair pairM17716b1117 = ntw.m17716b(bArrM17661I2);
                                                                    GcamModuleJNI.HalAfMetadata_SetAfTargetFocusInfoFromBytes(halAfMetadataM4958h1117.f8287a, halAfMetadataM4958h1117, nsd.m17642a(new nsd(((Long) pairM17716b1117.second).longValue())), ((ByteBuffer) pairM17716b1117.first).capacity());
                                                                }
                                                            } else {
                                                                if (frameMetadata.m4960j() != nse.f44367f) {
                                                                    GcamModuleJNI.ApplySensorBinning__SWIG_0(2, true, false, FrameMetadata.m4951b(frameMetadata), frameMetadata);
                                                                } else {
                                                                    GcamModuleJNI.ApplySensorBinning__SWIG_0(2, true, false, FrameMetadata.m4951b(frameMetadata), frameMetadata);
                                                                }
                                                                str5 = "halaf";
                                                                bArrM17661I = m17661I(ivx.f32439b, kppVar);
                                                                if (bArrM17661I != null) {
                                                                    ntw.m17717c(bArrM17661I, frameMetadata.m4958h());
                                                                }
                                                                bArrM17661I2 = m17661I(ivx.f32438a, kppVar);
                                                                if (bArrM17661I2 != null) {
                                                                    HalAfMetadata halAfMetadataM4958h1118 = frameMetadata.m4958h();
                                                                    Pair pairM17716b1118 = ntw.m17716b(bArrM17661I2);
                                                                    GcamModuleJNI.HalAfMetadata_SetAfTargetFocusInfoFromBytes(halAfMetadataM4958h1118.f8287a, halAfMetadataM4958h1118, nsd.m17642a(new nsd(((Long) pairM17716b1118.second).longValue())), ((ByteBuffer) pairM17716b1118.first).capacity());
                                                                }
                                                            }
                                                        } else {
                                                            while (true) {
                                                                nrrVarArr = nrr.f44283d;
                                                                if (i5 < 3) {
                                                                    throw new IllegalArgumentException(str2 + nrr.class.toString() + str9 + iIntValue4);
                                                                }
                                                                nrrVar = nrrVarArr[i5];
                                                                if (nrrVar.f44284e == iIntValue4) {
                                                                    i5++;
                                                                }
                                                            }
                                                            GcamModuleJNI.FrameMetadata_lens_state_set(frameMetadata.f8263a, frameMetadata, nrrVar.f44284e);
                                                            str4 = "bgstats";
                                                            key4 = ivt.f32366t;
                                                            if (key4 != null) {
                                                                bArr2 = (byte[]) kppVar.mo9517d(key4);
                                                                if (bArr2 != null) {
                                                                    ByteBuffer byteBufferOrder110 = ByteBuffer.allocateDirect(bArr2.length).order(ByteOrder.nativeOrder());
                                                                    byteBufferOrder110.put(bArr2);
                                                                    IspAwbMetadata ispAwbMetadata110 = new IspAwbMetadata(GcamModuleJNI.DeserializeFromBytes(nsd.m17642a(new nsd(BufferUtils.m4902a(byteBufferOrder110))), byteBufferOrder110.capacity()));
                                                                    GcamModuleJNI.FrameMetadata_isp_metadata_set(frameMetadata.f8263a, frameMetadata, ispAwbMetadata110.f8306a, ispAwbMetadata110);
                                                                }
                                                                if (frameMetadata.m4960j() != nse.f44367f) {
                                                                    GcamModuleJNI.ApplySensorBinning__SWIG_0(2, true, false, FrameMetadata.m4951b(frameMetadata), frameMetadata);
                                                                } else {
                                                                    GcamModuleJNI.ApplySensorBinning__SWIG_0(2, true, false, FrameMetadata.m4951b(frameMetadata), frameMetadata);
                                                                }
                                                                str5 = "halaf";
                                                                bArrM17661I = m17661I(ivx.f32439b, kppVar);
                                                                if (bArrM17661I != null) {
                                                                    ntw.m17717c(bArrM17661I, frameMetadata.m4958h());
                                                                }
                                                                bArrM17661I2 = m17661I(ivx.f32438a, kppVar);
                                                                if (bArrM17661I2 != null) {
                                                                    HalAfMetadata halAfMetadataM4958h1119 = frameMetadata.m4958h();
                                                                    Pair pairM17716b1119 = ntw.m17716b(bArrM17661I2);
                                                                    GcamModuleJNI.HalAfMetadata_SetAfTargetFocusInfoFromBytes(halAfMetadataM4958h1119.f8287a, halAfMetadataM4958h1119, nsd.m17642a(new nsd(((Long) pairM17716b1119.second).longValue())), ((ByteBuffer) pairM17716b1119.first).capacity());
                                                                }
                                                            } else {
                                                                if (frameMetadata.m4960j() != nse.f44367f) {
                                                                    GcamModuleJNI.ApplySensorBinning__SWIG_0(2, true, false, FrameMetadata.m4951b(frameMetadata), frameMetadata);
                                                                } else {
                                                                    GcamModuleJNI.ApplySensorBinning__SWIG_0(2, true, false, FrameMetadata.m4951b(frameMetadata), frameMetadata);
                                                                }
                                                                str5 = "halaf";
                                                                bArrM17661I = m17661I(ivx.f32439b, kppVar);
                                                                if (bArrM17661I != null) {
                                                                    ntw.m17717c(bArrM17661I, frameMetadata.m4958h());
                                                                }
                                                                bArrM17661I2 = m17661I(ivx.f32438a, kppVar);
                                                                if (bArrM17661I2 != null) {
                                                                    HalAfMetadata halAfMetadataM4958h11110 = frameMetadata.m4958h();
                                                                    Pair pairM17716b11110 = ntw.m17716b(bArrM17661I2);
                                                                    GcamModuleJNI.HalAfMetadata_SetAfTargetFocusInfoFromBytes(halAfMetadataM4958h11110.f8287a, halAfMetadataM4958h11110, nsd.m17642a(new nsd(((Long) pairM17716b11110.second).longValue())), ((ByteBuffer) pairM17716b11110.first).capacity());
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        str4 = "bgstats";
                                                        key4 = ivt.f32366t;
                                                        if (key4 != null) {
                                                            bArr2 = (byte[]) kppVar.mo9517d(key4);
                                                            if (bArr2 != null) {
                                                                ByteBuffer byteBufferOrder111 = ByteBuffer.allocateDirect(bArr2.length).order(ByteOrder.nativeOrder());
                                                                byteBufferOrder111.put(bArr2);
                                                                IspAwbMetadata ispAwbMetadata111 = new IspAwbMetadata(GcamModuleJNI.DeserializeFromBytes(nsd.m17642a(new nsd(BufferUtils.m4902a(byteBufferOrder111))), byteBufferOrder111.capacity()));
                                                                GcamModuleJNI.FrameMetadata_isp_metadata_set(frameMetadata.f8263a, frameMetadata, ispAwbMetadata111.f8306a, ispAwbMetadata111);
                                                            }
                                                            if (frameMetadata.m4960j() != nse.f44367f) {
                                                                GcamModuleJNI.ApplySensorBinning__SWIG_0(2, true, false, FrameMetadata.m4951b(frameMetadata), frameMetadata);
                                                            } else {
                                                                GcamModuleJNI.ApplySensorBinning__SWIG_0(2, true, false, FrameMetadata.m4951b(frameMetadata), frameMetadata);
                                                            }
                                                            str5 = "halaf";
                                                            bArrM17661I = m17661I(ivx.f32439b, kppVar);
                                                            if (bArrM17661I != null) {
                                                                ntw.m17717c(bArrM17661I, frameMetadata.m4958h());
                                                            }
                                                            bArrM17661I2 = m17661I(ivx.f32438a, kppVar);
                                                            if (bArrM17661I2 != null) {
                                                                HalAfMetadata halAfMetadataM4958h11111 = frameMetadata.m4958h();
                                                                Pair pairM17716b11111 = ntw.m17716b(bArrM17661I2);
                                                                GcamModuleJNI.HalAfMetadata_SetAfTargetFocusInfoFromBytes(halAfMetadataM4958h11111.f8287a, halAfMetadataM4958h11111, nsd.m17642a(new nsd(((Long) pairM17716b11111.second).longValue())), ((ByteBuffer) pairM17716b11111.first).capacity());
                                                            }
                                                        } else {
                                                            if (frameMetadata.m4960j() != nse.f44367f) {
                                                                GcamModuleJNI.ApplySensorBinning__SWIG_0(2, true, false, FrameMetadata.m4951b(frameMetadata), frameMetadata);
                                                            } else {
                                                                GcamModuleJNI.ApplySensorBinning__SWIG_0(2, true, false, FrameMetadata.m4951b(frameMetadata), frameMetadata);
                                                            }
                                                            str5 = "halaf";
                                                            bArrM17661I = m17661I(ivx.f32439b, kppVar);
                                                            if (bArrM17661I != null) {
                                                                ntw.m17717c(bArrM17661I, frameMetadata.m4958h());
                                                            }
                                                            bArrM17661I2 = m17661I(ivx.f32438a, kppVar);
                                                            if (bArrM17661I2 != null) {
                                                                HalAfMetadata halAfMetadataM4958h11112 = frameMetadata.m4958h();
                                                                Pair pairM17716b11112 = ntw.m17716b(bArrM17661I2);
                                                                GcamModuleJNI.HalAfMetadata_SetAfTargetFocusInfoFromBytes(halAfMetadataM4958h11112.f8287a, halAfMetadataM4958h11112, nsd.m17642a(new nsd(((Long) pairM17716b11112.second).longValue())), ((ByteBuffer) pairM17716b11112.first).capacity());
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    GcamModuleJNI.FrameMetadata_was_black_level_locked_set(frameMetadata.f8263a, frameMetadata, bool.booleanValue());
                                                    GcamModuleJNI.FrameMetadata_frame_duration_ms_set(frameMetadata.f8263a, frameMetadata, m17675x(((Long) kppVar.mo9517d(CaptureResult.SENSOR_FRAME_DURATION)).longValue()));
                                                    GcamModuleJNI.FrameMetadata_timestamp_ns_set(frameMetadata.f8263a, frameMetadata, ((Long) kppVar.mo9517d(CaptureResult.SENSOR_TIMESTAMP)).longValue());
                                                    GcamModuleJNI.FrameMetadata_sensor_temp_set(frameMetadata.f8263a, frameMetadata, GcamModuleJNI.kSensorTempUnknown_get());
                                                    SceneFlicker sceneFlicker6 = new SceneFlicker();
                                                    key = ivv.f32398g;
                                                    fIntValue = -1.0f;
                                                    if (key != null) {
                                                        fIntValue2 = -1.0f;
                                                    } else {
                                                        fIntValue2 = -1.0f;
                                                    }
                                                    key2 = ivv.f32399h;
                                                    if (key2 != null) {
                                                        fIntValue = num4.intValue() / 10000.0f;
                                                    }
                                                    if (fIntValue2 >= 0.0f) {
                                                        switch (num.intValue()) {
                                                            case 0:
                                                                fIntValue2 = 0.0f;
                                                                fIntValue = 1.0f;
                                                                break;
                                                            case 1:
                                                                fIntValue2 = 100.0f;
                                                                fIntValue = 1.0f;
                                                                break;
                                                            case 2:
                                                                fIntValue2 = 120.0f;
                                                                fIntValue = 1.0f;
                                                                break;
                                                            default:
                                                                Log.e(f44463a, BEeWZPor.BZKQtFscIANQJ);
                                                                break;
                                                        }
                                                    } else {
                                                        switch (num.intValue()) {
                                                            case 0:
                                                                fIntValue2 = 0.0f;
                                                                fIntValue = 1.0f;
                                                                break;
                                                            case 1:
                                                                fIntValue2 = 100.0f;
                                                                fIntValue = 1.0f;
                                                                break;
                                                            case 2:
                                                                fIntValue2 = 120.0f;
                                                                fIntValue = 1.0f;
                                                                break;
                                                            default:
                                                                Log.e(f44463a, BEeWZPor.BZKQtFscIANQJ);
                                                                break;
                                                        }
                                                    }
                                                    GcamModuleJNI.SceneFlicker_frequency_set(sceneFlicker6.f8352a, sceneFlicker6, fIntValue2);
                                                    GcamModuleJNI.SceneFlicker_confidence_set(sceneFlicker6.f8352a, sceneFlicker6, fIntValue);
                                                    GcamModuleJNI.FrameMetadata_scene_flicker_set(frameMetadata.f8263a, frameMetadata, sceneFlicker6.f8352a, sceneFlicker6);
                                                    str3 = "noise";
                                                    pairArr = (Pair[]) kppVar.mo9517d(CaptureResult.SENSOR_NOISE_PROFILE);
                                                    floatVector = new FloatVector();
                                                    floatVector2 = new FloatVector();
                                                    while (i3 < i2) {
                                                        floatVector.m4949b(((Double) pairArr[i3].first).floatValue());
                                                        floatVector2.m4949b(((Double) pairArr[i3].second).floatValue());
                                                    }
                                                    NoiseModel noiseModel6 = new NoiseModel(GcamModuleJNI.NoiseModel_FromShotReadNoiseVector(floatVector.f8261a, floatVector, floatVector2.f8261a, floatVector2));
                                                    GcamModuleJNI.FrameMetadata_dng_noise_model_bayer_set(frameMetadata.f8263a, frameMetadata, noiseModel6.f8320a, noiseModel6);
                                                    str5 = "dynamicbl";
                                                    fArr5 = (float[]) kppVar.mo9517d(CaptureResult.SENSOR_DYNAMIC_BLACK_LEVEL);
                                                    if (fArr5 != null) {
                                                        floatArray5 = new FloatArray4();
                                                        while (i9 < floatArray5.m4942b()) {
                                                            floatArray5.m4944d(i9, fArr5[i9]);
                                                        }
                                                        frameMetadata.m4962l(floatArray5);
                                                    } else {
                                                        blackLevelPattern = (BlackLevelPattern) kmdVarM17682f.mo14559l(CameraCharacteristics.SENSOR_BLACK_LEVEL_PATTERN);
                                                        if (blackLevelPattern != null) {
                                                            floatArray4 = new FloatArray4();
                                                            while (i4 < floatArray4.m4942b()) {
                                                                floatArray4.m4944d(i4, blackLevelPattern.getOffsetForIndex(i4 % 2, i4 / 2));
                                                            }
                                                            frameMetadata.m4962l(floatArray4);
                                                        }
                                                    }
                                                    f = (Float) kppVar.mo9517d(CaptureResult.LENS_FOCUS_DISTANCE);
                                                    Integer num13 = (Integer) kmdVarM17682f.mo14559l(CameraCharacteristics.LENS_INFO_FOCUS_DISTANCE_CALIBRATION);
                                                    if (f != null) {
                                                        GcamModuleJNI.FrameMetadata_focus_distance_diopters_set(frameMetadata.f8263a, frameMetadata, f.floatValue());
                                                    }
                                                    liveHdrMetadata = new LiveHdrMetadata(GcamModuleJNI.new_LiveHdrMetadata(), true);
                                                    aeResults = new AeResults(GcamModuleJNI.new_AeResults(), true);
                                                    if (ivu.f32375c != null) {
                                                        GcamModuleJNI.LiveHdrMetadata_max_hdr_ratio_override_set(liveHdrMetadata.f8311a, liveHdrMetadata, fArr7[0]);
                                                        liveHdrMetadata.m5029c(fArr7[1]);
                                                        liveHdrMetadata.m5028b(fArr7[2]);
                                                        if (!f44464b.f36770c) {
                                                            GcamModuleJNI.LiveHdrMetadata_night_factor_set(liveHdrMetadata.f8311a, liveHdrMetadata, fArr7[3]);
                                                        }
                                                        GcamModuleJNI.LiveHdrMetadata_manual_ec_short_set(liveHdrMetadata.f8311a, liveHdrMetadata, fArr7[i2]);
                                                        GcamModuleJNI.LiveHdrMetadata_manual_portrait_tet_override_set(liveHdrMetadata.f8311a, liveHdrMetadata, fArr7[5]);
                                                    }
                                                    str5 = "gcamae";
                                                    key3 = ivu.f32373a;
                                                    if (key3 != null) {
                                                        AeModeResult aeModeResult16 = new AeModeResult();
                                                        AeModeResult aeModeResult17 = new AeModeResult();
                                                        aeModeResult16.m4880d(fArr6[0]);
                                                        aeModeResult17.m4880d(fArr6[1]);
                                                        aeModeResult16.m4879c(fArr6[2]);
                                                        aeModeResult17.m4879c(fArr6[3]);
                                                        GcamModuleJNI.AeResults_pure_fraction_of_pixels_from_long_exposure_set(aeResults.f8224a, aeResults, fArr6[i2]);
                                                        GcamModuleJNI.AeResults_weighted_fraction_of_pixels_from_long_exposure_set(aeResults.f8224a, aeResults, fArr6[5]);
                                                        GcamModuleJNI.AeModeResult_log_scene_brightness_set(aeModeResult16.f8222a, aeModeResult16, fArr6[6]);
                                                        GcamModuleJNI.AeResults_predicted_image_brightness_set(aeResults.f8224a, aeResults, fArr6[7]);
                                                        GcamModuleJNI.LiveHdrMetadata_motion_magnitude_pix_set(liveHdrMetadata.f8311a, liveHdrMetadata, fArr6[8]);
                                                        GcamModuleJNI.LiveHdrMetadata_metering_interval_ms_set(liveHdrMetadata.f8311a, liveHdrMetadata, fArr6[9]);
                                                        GcamModuleJNI.LiveHdrMetadata_filtered_motion_speed_pix_per_ms_set(liveHdrMetadata.f8311a, liveHdrMetadata, fArr6[10]);
                                                        liveHdrMetadata.m5032f(fArr6[11]);
                                                        liveHdrMetadata.m5030d(fArr6[12]);
                                                        if (length2 > 13) {
                                                            GcamModuleJNI.AeResults_safe_underexposure_set(aeResults.f8224a, aeResults, fArr6[13]);
                                                        }
                                                        if (length2 > 15) {
                                                            AeModeResult aeModeResult18 = new AeModeResult();
                                                            aeModeResult18.m4880d(fArr6[14]);
                                                            aeModeResult18.m4879c(fArr6[15]);
                                                            GcamModuleJNI.AeResults_portrait_result_set(aeResults.f8224a, aeResults, AeModeResult.m4877a(aeModeResult18), aeModeResult18);
                                                            if (length2 > 16) {
                                                                liveHdrMetadata.m5031e(fArr6[16]);
                                                            } else {
                                                                liveHdrMetadata.m5031e(fArr6[15]);
                                                            }
                                                        }
                                                        aeModeResultArr = new AeModeResult[]{aeModeResult16, aeModeResult17};
                                                        long j6 = aeResults.f8224a;
                                                        jArr = new long[2];
                                                        while (i8 < 2) {
                                                            jArr[i8] = AeModeResult.m4877a(aeModeResultArr[i8]);
                                                        }
                                                        GcamModuleJNI.AeResults_mode_result_set(j6, aeResults, jArr);
                                                    }
                                                    str4 = "smask";
                                                    if (ivw.f32425k != null) {
                                                        bArr = (byte[]) kppVar.mo9517d(ivw.f32425k);
                                                        if (bArr != null) {
                                                            frameMetadata = frameMetadata;
                                                            i5 = 0;
                                                        } else {
                                                            frameMetadata = frameMetadata;
                                                            i5 = 0;
                                                        }
                                                    } else {
                                                        frameMetadata = frameMetadata;
                                                        i5 = 0;
                                                    }
                                                    frameMetadata = frameMetadata;
                                                    GcamModuleJNI.FrameMetadata_live_hdr_set(frameMetadata.f8263a, frameMetadata, liveHdrMetadata.f8311a, liveHdrMetadata);
                                                    GcamModuleJNI.FrameMetadata_ae_results_set(frameMetadata.f8263a, frameMetadata, AeResults.m4881b(aeResults), aeResults);
                                                    str5 = "3a";
                                                    iIntValue2 = ((Integer) kppVar.mo9517d(CaptureResult.CONTROL_MODE)).intValue();
                                                    nrf[] nrfVarArr7 = nrf.f44179g;
                                                    if (iIntValue2 < 6) {
                                                        i6 = 0;
                                                        while (true) {
                                                            nrfVarArr = nrf.f44179g;
                                                            if (i6 >= 6) {
                                                                throw new IllegalArgumentException(str2 + nrf.class.toString() + str9 + iIntValue2);
                                                            }
                                                            nrfVar2 = nrfVarArr[i6];
                                                            if (nrfVar2.f44180h == iIntValue2) {
                                                                nrfVar = nrfVar2;
                                                            } else {
                                                                i6++;
                                                            }
                                                        }
                                                    } else {
                                                        i6 = 0;
                                                        while (true) {
                                                            nrfVarArr = nrf.f44179g;
                                                            if (i6 >= 6) {
                                                                throw new IllegalArgumentException(str2 + nrf.class.toString() + str9 + iIntValue2);
                                                            }
                                                            nrfVar2 = nrfVarArr[i6];
                                                            if (nrfVar2.f44180h == iIntValue2) {
                                                                nrfVar = nrfVar2;
                                                            } else {
                                                                i6++;
                                                            }
                                                        }
                                                    }
                                                    GcamModuleJNI.FrameMetadata_control_mode_set(frameMetadata.f8263a, frameMetadata, nrfVar.f44180h);
                                                    aeMetadataM4954d = frameMetadata.m4954d();
                                                    GcamModuleJNI.AeMetadata_mode_set(aeMetadataM4954d.f8221a, aeMetadataM4954d, nqx.m17628a(((Integer) kppVar.mo9517d(CaptureResult.CONTROL_AE_MODE)).intValue()).f44108h);
                                                    GcamModuleJNI.AeMetadata_lock_set(aeMetadataM4954d.f8221a, aeMetadataM4954d, ((Boolean) kppVar.mo9517d(CaptureResult.CONTROL_AE_LOCK)).booleanValue());
                                                    iIntValue3 = ((Integer) kppVar.mo9517d(CaptureResult.CONTROL_AE_STATE)).intValue();
                                                    nqy[] nqyVarArr8 = nqy.f44117h;
                                                    if (iIntValue3 < 7) {
                                                        i7 = 0;
                                                        while (true) {
                                                            nqyVarArr = nqy.f44117h;
                                                            if (i7 >= 7) {
                                                                String str111 = str9;
                                                                throw new IllegalArgumentException(str2 + nqy.class.toString() + str111 + iIntValue3);
                                                            }
                                                            nqyVar2 = nqyVarArr[i7];
                                                            if (nqyVar2.f44118i == iIntValue3) {
                                                                nqyVar = nqyVar2;
                                                            } else {
                                                                i7++;
                                                            }
                                                        }
                                                    } else {
                                                        i7 = 0;
                                                        while (true) {
                                                            nqyVarArr = nqy.f44117h;
                                                            if (i7 >= 7) {
                                                                String str112 = str9;
                                                                throw new IllegalArgumentException(str2 + nqy.class.toString() + str112 + iIntValue3);
                                                            }
                                                            nqyVar2 = nqyVarArr[i7];
                                                            if (nqyVar2.f44118i == iIntValue3) {
                                                                nqyVar = nqyVar2;
                                                            } else {
                                                                i7++;
                                                            }
                                                        }
                                                    }
                                                    GcamModuleJNI.AeMetadata_state_set(aeMetadataM4954d.f8221a, aeMetadataM4954d, nqyVar.f44118i);
                                                    num2 = (Integer) kppVar.mo9517d(CaptureResult.CONTROL_AE_PRECAPTURE_TRIGGER);
                                                    if (num2 != null) {
                                                        GcamModuleJNI.AeMetadata_precapture_trigger_set(aeMetadataM4954d.f8221a, aeMetadataM4954d, num2.intValue());
                                                    }
                                                    GcamModuleJNI.AeMetadata_exposure_compensation_set(aeMetadataM4954d.f8221a, aeMetadataM4954d, m17678a(((Integer) kppVar.mo9517d(CaptureResult.CONTROL_AE_EXPOSURE_COMPENSATION)).intValue()));
                                                    AwbMetadata awbMetadataM4956f9 = frameMetadata.m4956f();
                                                    GcamModuleJNI.AwbMetadata_mode_set(awbMetadataM4956f9.f8231a, awbMetadataM4956f9, ((Integer) kppVar.mo9517d(CaptureResult.CONTROL_AWB_MODE)).intValue());
                                                    GcamModuleJNI.AwbMetadata_lock_set(awbMetadataM4956f9.f8231a, awbMetadataM4956f9, ((Boolean) kppVar.mo9517d(CaptureResult.CONTROL_AWB_LOCK)).booleanValue());
                                                    GcamModuleJNI.AwbMetadata_state_set(awbMetadataM4956f9.f8231a, awbMetadataM4956f9, ((Integer) kppVar.mo9517d(CaptureResult.CONTROL_AWB_STATE)).intValue());
                                                    AfMetadata afMetadataM4955e9 = frameMetadata.m4955e();
                                                    afMetadataM4955e9.m4896b(nra.m17629a(((Integer) kppVar.mo9517d(CaptureResult.CONTROL_AF_MODE)).intValue()));
                                                    afMetadataM4955e9.m4897c(nrb.m17630a(((Integer) kppVar.mo9517d(CaptureResult.CONTROL_AF_STATE)).intValue()));
                                                    afMetadataM4955e9.m4898d(((Integer) kppVar.mo9517d(CaptureResult.CONTROL_AF_TRIGGER)).intValue());
                                                    num3 = (Integer) kppVar.mo9517d(CaptureResult.LENS_STATE);
                                                    if (num3 != null) {
                                                        iIntValue4 = num3.intValue();
                                                        nrr[] nrrVarArr9 = nrr.f44283d;
                                                        if (iIntValue4 < 3) {
                                                            while (true) {
                                                                nrrVarArr = nrr.f44283d;
                                                                if (i5 < 3) {
                                                                    throw new IllegalArgumentException(str2 + nrr.class.toString() + str9 + iIntValue4);
                                                                }
                                                                nrrVar = nrrVarArr[i5];
                                                                if (nrrVar.f44284e == iIntValue4) {
                                                                    i5++;
                                                                }
                                                            }
                                                            GcamModuleJNI.FrameMetadata_lens_state_set(frameMetadata.f8263a, frameMetadata, nrrVar.f44284e);
                                                            str4 = "bgstats";
                                                            key4 = ivt.f32366t;
                                                            if (key4 != null) {
                                                                bArr2 = (byte[]) kppVar.mo9517d(key4);
                                                                if (bArr2 != null) {
                                                                    ByteBuffer byteBufferOrder112 = ByteBuffer.allocateDirect(bArr2.length).order(ByteOrder.nativeOrder());
                                                                    byteBufferOrder112.put(bArr2);
                                                                    IspAwbMetadata ispAwbMetadata112 = new IspAwbMetadata(GcamModuleJNI.DeserializeFromBytes(nsd.m17642a(new nsd(BufferUtils.m4902a(byteBufferOrder112))), byteBufferOrder112.capacity()));
                                                                    GcamModuleJNI.FrameMetadata_isp_metadata_set(frameMetadata.f8263a, frameMetadata, ispAwbMetadata112.f8306a, ispAwbMetadata112);
                                                                }
                                                                if (frameMetadata.m4960j() != nse.f44367f) {
                                                                    GcamModuleJNI.ApplySensorBinning__SWIG_0(2, true, false, FrameMetadata.m4951b(frameMetadata), frameMetadata);
                                                                } else {
                                                                    GcamModuleJNI.ApplySensorBinning__SWIG_0(2, true, false, FrameMetadata.m4951b(frameMetadata), frameMetadata);
                                                                }
                                                                str5 = "halaf";
                                                                bArrM17661I = m17661I(ivx.f32439b, kppVar);
                                                                if (bArrM17661I != null) {
                                                                    ntw.m17717c(bArrM17661I, frameMetadata.m4958h());
                                                                }
                                                                bArrM17661I2 = m17661I(ivx.f32438a, kppVar);
                                                                if (bArrM17661I2 != null) {
                                                                    HalAfMetadata halAfMetadataM4958h11113 = frameMetadata.m4958h();
                                                                    Pair pairM17716b11113 = ntw.m17716b(bArrM17661I2);
                                                                    GcamModuleJNI.HalAfMetadata_SetAfTargetFocusInfoFromBytes(halAfMetadataM4958h11113.f8287a, halAfMetadataM4958h11113, nsd.m17642a(new nsd(((Long) pairM17716b11113.second).longValue())), ((ByteBuffer) pairM17716b11113.first).capacity());
                                                                }
                                                            } else {
                                                                if (frameMetadata.m4960j() != nse.f44367f) {
                                                                    GcamModuleJNI.ApplySensorBinning__SWIG_0(2, true, false, FrameMetadata.m4951b(frameMetadata), frameMetadata);
                                                                } else {
                                                                    GcamModuleJNI.ApplySensorBinning__SWIG_0(2, true, false, FrameMetadata.m4951b(frameMetadata), frameMetadata);
                                                                }
                                                                str5 = "halaf";
                                                                bArrM17661I = m17661I(ivx.f32439b, kppVar);
                                                                if (bArrM17661I != null) {
                                                                    ntw.m17717c(bArrM17661I, frameMetadata.m4958h());
                                                                }
                                                                bArrM17661I2 = m17661I(ivx.f32438a, kppVar);
                                                                if (bArrM17661I2 != null) {
                                                                    HalAfMetadata halAfMetadataM4958h11114 = frameMetadata.m4958h();
                                                                    Pair pairM17716b11114 = ntw.m17716b(bArrM17661I2);
                                                                    GcamModuleJNI.HalAfMetadata_SetAfTargetFocusInfoFromBytes(halAfMetadataM4958h11114.f8287a, halAfMetadataM4958h11114, nsd.m17642a(new nsd(((Long) pairM17716b11114.second).longValue())), ((ByteBuffer) pairM17716b11114.first).capacity());
                                                                }
                                                            }
                                                        } else {
                                                            while (true) {
                                                                nrrVarArr = nrr.f44283d;
                                                                if (i5 < 3) {
                                                                    throw new IllegalArgumentException(str2 + nrr.class.toString() + str9 + iIntValue4);
                                                                }
                                                                nrrVar = nrrVarArr[i5];
                                                                if (nrrVar.f44284e == iIntValue4) {
                                                                    i5++;
                                                                }
                                                            }
                                                            GcamModuleJNI.FrameMetadata_lens_state_set(frameMetadata.f8263a, frameMetadata, nrrVar.f44284e);
                                                            str4 = "bgstats";
                                                            key4 = ivt.f32366t;
                                                            if (key4 != null) {
                                                                bArr2 = (byte[]) kppVar.mo9517d(key4);
                                                                if (bArr2 != null) {
                                                                    ByteBuffer byteBufferOrder113 = ByteBuffer.allocateDirect(bArr2.length).order(ByteOrder.nativeOrder());
                                                                    byteBufferOrder113.put(bArr2);
                                                                    IspAwbMetadata ispAwbMetadata113 = new IspAwbMetadata(GcamModuleJNI.DeserializeFromBytes(nsd.m17642a(new nsd(BufferUtils.m4902a(byteBufferOrder113))), byteBufferOrder113.capacity()));
                                                                    GcamModuleJNI.FrameMetadata_isp_metadata_set(frameMetadata.f8263a, frameMetadata, ispAwbMetadata113.f8306a, ispAwbMetadata113);
                                                                }
                                                                if (frameMetadata.m4960j() != nse.f44367f) {
                                                                    GcamModuleJNI.ApplySensorBinning__SWIG_0(2, true, false, FrameMetadata.m4951b(frameMetadata), frameMetadata);
                                                                } else {
                                                                    GcamModuleJNI.ApplySensorBinning__SWIG_0(2, true, false, FrameMetadata.m4951b(frameMetadata), frameMetadata);
                                                                }
                                                                str5 = "halaf";
                                                                bArrM17661I = m17661I(ivx.f32439b, kppVar);
                                                                if (bArrM17661I != null) {
                                                                    ntw.m17717c(bArrM17661I, frameMetadata.m4958h());
                                                                }
                                                                bArrM17661I2 = m17661I(ivx.f32438a, kppVar);
                                                                if (bArrM17661I2 != null) {
                                                                    HalAfMetadata halAfMetadataM4958h11115 = frameMetadata.m4958h();
                                                                    Pair pairM17716b11115 = ntw.m17716b(bArrM17661I2);
                                                                    GcamModuleJNI.HalAfMetadata_SetAfTargetFocusInfoFromBytes(halAfMetadataM4958h11115.f8287a, halAfMetadataM4958h11115, nsd.m17642a(new nsd(((Long) pairM17716b11115.second).longValue())), ((ByteBuffer) pairM17716b11115.first).capacity());
                                                                }
                                                            } else {
                                                                if (frameMetadata.m4960j() != nse.f44367f) {
                                                                    GcamModuleJNI.ApplySensorBinning__SWIG_0(2, true, false, FrameMetadata.m4951b(frameMetadata), frameMetadata);
                                                                } else {
                                                                    GcamModuleJNI.ApplySensorBinning__SWIG_0(2, true, false, FrameMetadata.m4951b(frameMetadata), frameMetadata);
                                                                }
                                                                str5 = "halaf";
                                                                bArrM17661I = m17661I(ivx.f32439b, kppVar);
                                                                if (bArrM17661I != null) {
                                                                    ntw.m17717c(bArrM17661I, frameMetadata.m4958h());
                                                                }
                                                                bArrM17661I2 = m17661I(ivx.f32438a, kppVar);
                                                                if (bArrM17661I2 != null) {
                                                                    HalAfMetadata halAfMetadataM4958h11116 = frameMetadata.m4958h();
                                                                    Pair pairM17716b11116 = ntw.m17716b(bArrM17661I2);
                                                                    GcamModuleJNI.HalAfMetadata_SetAfTargetFocusInfoFromBytes(halAfMetadataM4958h11116.f8287a, halAfMetadataM4958h11116, nsd.m17642a(new nsd(((Long) pairM17716b11116.second).longValue())), ((ByteBuffer) pairM17716b11116.first).capacity());
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        str4 = "bgstats";
                                                        key4 = ivt.f32366t;
                                                        if (key4 != null) {
                                                            bArr2 = (byte[]) kppVar.mo9517d(key4);
                                                            if (bArr2 != null) {
                                                                ByteBuffer byteBufferOrder114 = ByteBuffer.allocateDirect(bArr2.length).order(ByteOrder.nativeOrder());
                                                                byteBufferOrder114.put(bArr2);
                                                                IspAwbMetadata ispAwbMetadata114 = new IspAwbMetadata(GcamModuleJNI.DeserializeFromBytes(nsd.m17642a(new nsd(BufferUtils.m4902a(byteBufferOrder114))), byteBufferOrder114.capacity()));
                                                                GcamModuleJNI.FrameMetadata_isp_metadata_set(frameMetadata.f8263a, frameMetadata, ispAwbMetadata114.f8306a, ispAwbMetadata114);
                                                            }
                                                            if (frameMetadata.m4960j() != nse.f44367f) {
                                                                GcamModuleJNI.ApplySensorBinning__SWIG_0(2, true, false, FrameMetadata.m4951b(frameMetadata), frameMetadata);
                                                            } else {
                                                                GcamModuleJNI.ApplySensorBinning__SWIG_0(2, true, false, FrameMetadata.m4951b(frameMetadata), frameMetadata);
                                                            }
                                                            str5 = "halaf";
                                                            bArrM17661I = m17661I(ivx.f32439b, kppVar);
                                                            if (bArrM17661I != null) {
                                                                ntw.m17717c(bArrM17661I, frameMetadata.m4958h());
                                                            }
                                                            bArrM17661I2 = m17661I(ivx.f32438a, kppVar);
                                                            if (bArrM17661I2 != null) {
                                                                HalAfMetadata halAfMetadataM4958h11117 = frameMetadata.m4958h();
                                                                Pair pairM17716b11117 = ntw.m17716b(bArrM17661I2);
                                                                GcamModuleJNI.HalAfMetadata_SetAfTargetFocusInfoFromBytes(halAfMetadataM4958h11117.f8287a, halAfMetadataM4958h11117, nsd.m17642a(new nsd(((Long) pairM17716b11117.second).longValue())), ((ByteBuffer) pairM17716b11117.first).capacity());
                                                            }
                                                        } else {
                                                            if (frameMetadata.m4960j() != nse.f44367f) {
                                                                GcamModuleJNI.ApplySensorBinning__SWIG_0(2, true, false, FrameMetadata.m4951b(frameMetadata), frameMetadata);
                                                            } else {
                                                                GcamModuleJNI.ApplySensorBinning__SWIG_0(2, true, false, FrameMetadata.m4951b(frameMetadata), frameMetadata);
                                                            }
                                                            str5 = "halaf";
                                                            bArrM17661I = m17661I(ivx.f32439b, kppVar);
                                                            if (bArrM17661I != null) {
                                                                ntw.m17717c(bArrM17661I, frameMetadata.m4958h());
                                                            }
                                                            bArrM17661I2 = m17661I(ivx.f32438a, kppVar);
                                                            if (bArrM17661I2 != null) {
                                                                HalAfMetadata halAfMetadataM4958h11118 = frameMetadata.m4958h();
                                                                Pair pairM17716b11118 = ntw.m17716b(bArrM17661I2);
                                                                GcamModuleJNI.HalAfMetadata_SetAfTargetFocusInfoFromBytes(halAfMetadataM4958h11118.f8287a, halAfMetadataM4958h11118, nsd.m17642a(new nsd(((Long) pairM17716b11118.second).longValue())), ((ByteBuffer) pairM17716b11118.first).capacity());
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        } catch (RuntimeException e26) {
                                            runtimeException = e26;
                                            frameMetadata = frameMetadata;
                                            str5 = "scaler";
                                        }
                                        return frameMetadata;
                                    }
                                } catch (RuntimeException e27) {
                                    runtimeException = e27;
                                    str5 = str8;
                                }
                            }
                            optionalEmpty = Optional.empty();
                            optionalEmpty.ifPresent(new idi(frameMetadata, 11));
                            if (gyroSampleVector != null) {
                                z = true;
                                GcamModuleJNI.FrameMetadata_gyro_samples_set(frameMetadata.f8263a, frameMetadata, gyroSampleVector.f8285a, gyroSampleVector);
                            } else {
                                z = true;
                            }
                            str8 = "geocalibration";
                            if (kmdVarM17682f.mo14544M()) {
                                z2 = true;
                            }
                            lku.m15670x(z2, "Logical cameras not supported.");
                            geometricCalibrationVector = new GeometricCalibrationVector(GcamModuleJNI.new_GeometricCalibrationVector__SWIG_0(), z);
                            fArr = (float[]) kppVar.mo9517d(CaptureResult.LENS_DISTORTION);
                            fArr2 = (float[]) kppVar.mo9517d(CaptureResult.LENS_INTRINSIC_CALIBRATION);
                            fArr3 = (float[]) kppVar.mo9517d(CaptureResult.LENS_POSE_ROTATION);
                            fArr4 = (float[]) kppVar.mo9517d(CaptureResult.LENS_POSE_TRANSLATION);
                            if (fArr == null) {
                                fArr = (float[]) kmdVarM17682f.mo14559l(CameraCharacteristics.LENS_DISTORTION);
                            }
                            if (fArr2 == null) {
                                fArr2 = (float[]) kmdVarM17682f.mo14559l(CameraCharacteristics.LENS_INTRINSIC_CALIBRATION);
                            }
                            if (fArr3 == null) {
                                fArr3 = (float[]) kmdVarM17682f.mo14559l(CameraCharacteristics.LENS_POSE_ROTATION);
                            }
                            if (fArr4 == null) {
                                fArr4 = (float[]) kmdVarM17682f.mo14559l(CameraCharacteristics.LENS_POSE_TRANSLATION);
                            }
                            if (fArr == null) {
                                geometricCalibration = new GeometricCalibration();
                                geometricCalibration.m4982d(nrm.f44244a);
                                if (fArr != null) {
                                    geometricCalibration.m4980b(fArr);
                                }
                                if (fArr2 != null) {
                                    geometricCalibration.m4981c(fArr2);
                                }
                                if (fArr3 != null) {
                                    GcamModuleJNI.GeometricCalibration_lens_pose_rotation_set(geometricCalibration.f8275a, geometricCalibration, fArr3);
                                }
                                if (fArr4 != null) {
                                    GcamModuleJNI.GeometricCalibration_lens_pose_translation_set(geometricCalibration.f8275a, geometricCalibration, fArr4);
                                }
                                geometricCalibrationVector.m4983a(geometricCalibration);
                            } else {
                                geometricCalibration = new GeometricCalibration();
                                geometricCalibration.m4982d(nrm.f44244a);
                                if (fArr != null) {
                                    geometricCalibration.m4980b(fArr);
                                }
                                if (fArr2 != null) {
                                    geometricCalibration.m4981c(fArr2);
                                }
                                if (fArr3 != null) {
                                    GcamModuleJNI.GeometricCalibration_lens_pose_rotation_set(geometricCalibration.f8275a, geometricCalibration, fArr3);
                                }
                                if (fArr4 != null) {
                                    GcamModuleJNI.GeometricCalibration_lens_pose_translation_set(geometricCalibration.f8275a, geometricCalibration, fArr4);
                                }
                                geometricCalibrationVector.m4983a(geometricCalibration);
                            }
                            if (ivt.f32348b != null) {
                                str2 = "No enum ";
                                i2 = 4;
                            } else {
                                str2 = "No enum ";
                                i2 = 4;
                            }
                            GcamModuleJNI.FrameMetadata_geometric_calibration_set(frameMetadata.f8263a, frameMetadata, geometricCalibrationVector.f8277a, geometricCalibrationVector);
                            GcamModuleJNI.FrameMetadata_sensor_id_set(frameMetadata.f8263a, frameMetadata, m17655C(kmdVarM17682f, this.f44466d, kppVar, kmgVar2).f44379q);
                            str5 = "flash";
                            iIntValue = ((Integer) kppVar.mo9517d(CaptureResult.FLASH_MODE)).intValue();
                            if (iIntValue != 1) {
                                frameMetadata.m4963m(nrj.f44222b);
                                str3 = "awb";
                                AwbInfo awbInfoM17666i4 = m17666i(kppVar, kmdVarM17682f);
                                GcamModuleJNI.FrameMetadata_wb_set(frameMetadata.f8263a, frameMetadata, AwbInfo.m4899a(awbInfoM17666i4), awbInfoM17666i4);
                                str3 = "bl";
                                bool = (Boolean) kppVar.mo9517d(CaptureResult.BLACK_LEVEL_LOCK);
                                if (bool == null) {
                                    bool = false;
                                    GcamModuleJNI.FrameMetadata_was_black_level_locked_set(frameMetadata.f8263a, frameMetadata, bool.booleanValue());
                                    GcamModuleJNI.FrameMetadata_frame_duration_ms_set(frameMetadata.f8263a, frameMetadata, m17675x(((Long) kppVar.mo9517d(CaptureResult.SENSOR_FRAME_DURATION)).longValue()));
                                    GcamModuleJNI.FrameMetadata_timestamp_ns_set(frameMetadata.f8263a, frameMetadata, ((Long) kppVar.mo9517d(CaptureResult.SENSOR_TIMESTAMP)).longValue());
                                    GcamModuleJNI.FrameMetadata_sensor_temp_set(frameMetadata.f8263a, frameMetadata, GcamModuleJNI.kSensorTempUnknown_get());
                                    SceneFlicker sceneFlicker7 = new SceneFlicker();
                                    key = ivv.f32398g;
                                    fIntValue = -1.0f;
                                    if (key != null) {
                                        fIntValue2 = -1.0f;
                                    } else {
                                        fIntValue2 = -1.0f;
                                    }
                                    key2 = ivv.f32399h;
                                    if (key2 != null) {
                                        fIntValue = num4.intValue() / 10000.0f;
                                    }
                                    if (fIntValue2 >= 0.0f) {
                                        switch (num.intValue()) {
                                            case 0:
                                                fIntValue2 = 0.0f;
                                                fIntValue = 1.0f;
                                                break;
                                            case 1:
                                                fIntValue2 = 100.0f;
                                                fIntValue = 1.0f;
                                                break;
                                            case 2:
                                                fIntValue2 = 120.0f;
                                                fIntValue = 1.0f;
                                                break;
                                            default:
                                                Log.e(f44463a, BEeWZPor.BZKQtFscIANQJ);
                                                break;
                                        }
                                    } else {
                                        switch (num.intValue()) {
                                            case 0:
                                                fIntValue2 = 0.0f;
                                                fIntValue = 1.0f;
                                                break;
                                            case 1:
                                                fIntValue2 = 100.0f;
                                                fIntValue = 1.0f;
                                                break;
                                            case 2:
                                                fIntValue2 = 120.0f;
                                                fIntValue = 1.0f;
                                                break;
                                            default:
                                                Log.e(f44463a, BEeWZPor.BZKQtFscIANQJ);
                                                break;
                                        }
                                    }
                                    GcamModuleJNI.SceneFlicker_frequency_set(sceneFlicker7.f8352a, sceneFlicker7, fIntValue2);
                                    GcamModuleJNI.SceneFlicker_confidence_set(sceneFlicker7.f8352a, sceneFlicker7, fIntValue);
                                    GcamModuleJNI.FrameMetadata_scene_flicker_set(frameMetadata.f8263a, frameMetadata, sceneFlicker7.f8352a, sceneFlicker7);
                                    str3 = "noise";
                                    pairArr = (Pair[]) kppVar.mo9517d(CaptureResult.SENSOR_NOISE_PROFILE);
                                    floatVector = new FloatVector();
                                    floatVector2 = new FloatVector();
                                    while (i3 < i2) {
                                        floatVector.m4949b(((Double) pairArr[i3].first).floatValue());
                                        floatVector2.m4949b(((Double) pairArr[i3].second).floatValue());
                                    }
                                    NoiseModel noiseModel7 = new NoiseModel(GcamModuleJNI.NoiseModel_FromShotReadNoiseVector(floatVector.f8261a, floatVector, floatVector2.f8261a, floatVector2));
                                    GcamModuleJNI.FrameMetadata_dng_noise_model_bayer_set(frameMetadata.f8263a, frameMetadata, noiseModel7.f8320a, noiseModel7);
                                    str5 = "dynamicbl";
                                    fArr5 = (float[]) kppVar.mo9517d(CaptureResult.SENSOR_DYNAMIC_BLACK_LEVEL);
                                    if (fArr5 != null) {
                                        floatArray5 = new FloatArray4();
                                        while (i9 < floatArray5.m4942b()) {
                                            floatArray5.m4944d(i9, fArr5[i9]);
                                        }
                                        frameMetadata.m4962l(floatArray5);
                                    } else {
                                        blackLevelPattern = (BlackLevelPattern) kmdVarM17682f.mo14559l(CameraCharacteristics.SENSOR_BLACK_LEVEL_PATTERN);
                                        if (blackLevelPattern != null) {
                                            floatArray4 = new FloatArray4();
                                            while (i4 < floatArray4.m4942b()) {
                                                floatArray4.m4944d(i4, blackLevelPattern.getOffsetForIndex(i4 % 2, i4 / 2));
                                            }
                                            frameMetadata.m4962l(floatArray4);
                                        }
                                    }
                                    f = (Float) kppVar.mo9517d(CaptureResult.LENS_FOCUS_DISTANCE);
                                    Integer num14 = (Integer) kmdVarM17682f.mo14559l(CameraCharacteristics.LENS_INFO_FOCUS_DISTANCE_CALIBRATION);
                                    if (f != null) {
                                        GcamModuleJNI.FrameMetadata_focus_distance_diopters_set(frameMetadata.f8263a, frameMetadata, f.floatValue());
                                    }
                                    liveHdrMetadata = new LiveHdrMetadata(GcamModuleJNI.new_LiveHdrMetadata(), true);
                                    aeResults = new AeResults(GcamModuleJNI.new_AeResults(), true);
                                    if (ivu.f32375c != null) {
                                        GcamModuleJNI.LiveHdrMetadata_max_hdr_ratio_override_set(liveHdrMetadata.f8311a, liveHdrMetadata, fArr7[0]);
                                        liveHdrMetadata.m5029c(fArr7[1]);
                                        liveHdrMetadata.m5028b(fArr7[2]);
                                        if (!f44464b.f36770c) {
                                            GcamModuleJNI.LiveHdrMetadata_night_factor_set(liveHdrMetadata.f8311a, liveHdrMetadata, fArr7[3]);
                                        }
                                        GcamModuleJNI.LiveHdrMetadata_manual_ec_short_set(liveHdrMetadata.f8311a, liveHdrMetadata, fArr7[i2]);
                                        GcamModuleJNI.LiveHdrMetadata_manual_portrait_tet_override_set(liveHdrMetadata.f8311a, liveHdrMetadata, fArr7[5]);
                                    }
                                    str5 = "gcamae";
                                    key3 = ivu.f32373a;
                                    if (key3 != null) {
                                        AeModeResult aeModeResult19 = new AeModeResult();
                                        AeModeResult aeModeResult110 = new AeModeResult();
                                        aeModeResult19.m4880d(fArr6[0]);
                                        aeModeResult110.m4880d(fArr6[1]);
                                        aeModeResult19.m4879c(fArr6[2]);
                                        aeModeResult110.m4879c(fArr6[3]);
                                        GcamModuleJNI.AeResults_pure_fraction_of_pixels_from_long_exposure_set(aeResults.f8224a, aeResults, fArr6[i2]);
                                        GcamModuleJNI.AeResults_weighted_fraction_of_pixels_from_long_exposure_set(aeResults.f8224a, aeResults, fArr6[5]);
                                        GcamModuleJNI.AeModeResult_log_scene_brightness_set(aeModeResult19.f8222a, aeModeResult19, fArr6[6]);
                                        GcamModuleJNI.AeResults_predicted_image_brightness_set(aeResults.f8224a, aeResults, fArr6[7]);
                                        GcamModuleJNI.LiveHdrMetadata_motion_magnitude_pix_set(liveHdrMetadata.f8311a, liveHdrMetadata, fArr6[8]);
                                        GcamModuleJNI.LiveHdrMetadata_metering_interval_ms_set(liveHdrMetadata.f8311a, liveHdrMetadata, fArr6[9]);
                                        GcamModuleJNI.LiveHdrMetadata_filtered_motion_speed_pix_per_ms_set(liveHdrMetadata.f8311a, liveHdrMetadata, fArr6[10]);
                                        liveHdrMetadata.m5032f(fArr6[11]);
                                        liveHdrMetadata.m5030d(fArr6[12]);
                                        if (length2 > 13) {
                                            GcamModuleJNI.AeResults_safe_underexposure_set(aeResults.f8224a, aeResults, fArr6[13]);
                                        }
                                        if (length2 > 15) {
                                            AeModeResult aeModeResult111 = new AeModeResult();
                                            aeModeResult111.m4880d(fArr6[14]);
                                            aeModeResult111.m4879c(fArr6[15]);
                                            GcamModuleJNI.AeResults_portrait_result_set(aeResults.f8224a, aeResults, AeModeResult.m4877a(aeModeResult111), aeModeResult111);
                                            if (length2 > 16) {
                                                liveHdrMetadata.m5031e(fArr6[16]);
                                            } else {
                                                liveHdrMetadata.m5031e(fArr6[15]);
                                            }
                                        }
                                        aeModeResultArr = new AeModeResult[]{aeModeResult19, aeModeResult110};
                                        long j7 = aeResults.f8224a;
                                        jArr = new long[2];
                                        while (i8 < 2) {
                                            jArr[i8] = AeModeResult.m4877a(aeModeResultArr[i8]);
                                        }
                                        GcamModuleJNI.AeResults_mode_result_set(j7, aeResults, jArr);
                                    }
                                    str4 = "smask";
                                    if (ivw.f32425k != null) {
                                        bArr = (byte[]) kppVar.mo9517d(ivw.f32425k);
                                        if (bArr != null) {
                                            frameMetadata = frameMetadata;
                                            i5 = 0;
                                        } else {
                                            frameMetadata = frameMetadata;
                                            i5 = 0;
                                        }
                                    } else {
                                        frameMetadata = frameMetadata;
                                        i5 = 0;
                                    }
                                    frameMetadata = frameMetadata;
                                    GcamModuleJNI.FrameMetadata_live_hdr_set(frameMetadata.f8263a, frameMetadata, liveHdrMetadata.f8311a, liveHdrMetadata);
                                    GcamModuleJNI.FrameMetadata_ae_results_set(frameMetadata.f8263a, frameMetadata, AeResults.m4881b(aeResults), aeResults);
                                    str5 = "3a";
                                    iIntValue2 = ((Integer) kppVar.mo9517d(CaptureResult.CONTROL_MODE)).intValue();
                                    nrf[] nrfVarArr8 = nrf.f44179g;
                                    if (iIntValue2 < 6) {
                                        i6 = 0;
                                        while (true) {
                                            nrfVarArr = nrf.f44179g;
                                            if (i6 >= 6) {
                                                throw new IllegalArgumentException(str2 + nrf.class.toString() + str9 + iIntValue2);
                                            }
                                            nrfVar2 = nrfVarArr[i6];
                                            if (nrfVar2.f44180h == iIntValue2) {
                                                nrfVar = nrfVar2;
                                            } else {
                                                i6++;
                                            }
                                        }
                                    } else {
                                        i6 = 0;
                                        while (true) {
                                            nrfVarArr = nrf.f44179g;
                                            if (i6 >= 6) {
                                                throw new IllegalArgumentException(str2 + nrf.class.toString() + str9 + iIntValue2);
                                            }
                                            nrfVar2 = nrfVarArr[i6];
                                            if (nrfVar2.f44180h == iIntValue2) {
                                                nrfVar = nrfVar2;
                                            } else {
                                                i6++;
                                            }
                                        }
                                    }
                                    GcamModuleJNI.FrameMetadata_control_mode_set(frameMetadata.f8263a, frameMetadata, nrfVar.f44180h);
                                    aeMetadataM4954d = frameMetadata.m4954d();
                                    GcamModuleJNI.AeMetadata_mode_set(aeMetadataM4954d.f8221a, aeMetadataM4954d, nqx.m17628a(((Integer) kppVar.mo9517d(CaptureResult.CONTROL_AE_MODE)).intValue()).f44108h);
                                    GcamModuleJNI.AeMetadata_lock_set(aeMetadataM4954d.f8221a, aeMetadataM4954d, ((Boolean) kppVar.mo9517d(CaptureResult.CONTROL_AE_LOCK)).booleanValue());
                                    iIntValue3 = ((Integer) kppVar.mo9517d(CaptureResult.CONTROL_AE_STATE)).intValue();
                                    nqy[] nqyVarArr9 = nqy.f44117h;
                                    if (iIntValue3 < 7) {
                                        i7 = 0;
                                        while (true) {
                                            nqyVarArr = nqy.f44117h;
                                            if (i7 >= 7) {
                                                String str113 = str9;
                                                throw new IllegalArgumentException(str2 + nqy.class.toString() + str113 + iIntValue3);
                                            }
                                            nqyVar2 = nqyVarArr[i7];
                                            if (nqyVar2.f44118i == iIntValue3) {
                                                nqyVar = nqyVar2;
                                            } else {
                                                i7++;
                                            }
                                        }
                                    } else {
                                        i7 = 0;
                                        while (true) {
                                            nqyVarArr = nqy.f44117h;
                                            if (i7 >= 7) {
                                                String str114 = str9;
                                                throw new IllegalArgumentException(str2 + nqy.class.toString() + str114 + iIntValue3);
                                            }
                                            nqyVar2 = nqyVarArr[i7];
                                            if (nqyVar2.f44118i == iIntValue3) {
                                                nqyVar = nqyVar2;
                                            } else {
                                                i7++;
                                            }
                                        }
                                    }
                                    GcamModuleJNI.AeMetadata_state_set(aeMetadataM4954d.f8221a, aeMetadataM4954d, nqyVar.f44118i);
                                    num2 = (Integer) kppVar.mo9517d(CaptureResult.CONTROL_AE_PRECAPTURE_TRIGGER);
                                    if (num2 != null) {
                                        GcamModuleJNI.AeMetadata_precapture_trigger_set(aeMetadataM4954d.f8221a, aeMetadataM4954d, num2.intValue());
                                    }
                                    GcamModuleJNI.AeMetadata_exposure_compensation_set(aeMetadataM4954d.f8221a, aeMetadataM4954d, m17678a(((Integer) kppVar.mo9517d(CaptureResult.CONTROL_AE_EXPOSURE_COMPENSATION)).intValue()));
                                    AwbMetadata awbMetadataM4956f10 = frameMetadata.m4956f();
                                    GcamModuleJNI.AwbMetadata_mode_set(awbMetadataM4956f10.f8231a, awbMetadataM4956f10, ((Integer) kppVar.mo9517d(CaptureResult.CONTROL_AWB_MODE)).intValue());
                                    GcamModuleJNI.AwbMetadata_lock_set(awbMetadataM4956f10.f8231a, awbMetadataM4956f10, ((Boolean) kppVar.mo9517d(CaptureResult.CONTROL_AWB_LOCK)).booleanValue());
                                    GcamModuleJNI.AwbMetadata_state_set(awbMetadataM4956f10.f8231a, awbMetadataM4956f10, ((Integer) kppVar.mo9517d(CaptureResult.CONTROL_AWB_STATE)).intValue());
                                    AfMetadata afMetadataM4955e10 = frameMetadata.m4955e();
                                    afMetadataM4955e10.m4896b(nra.m17629a(((Integer) kppVar.mo9517d(CaptureResult.CONTROL_AF_MODE)).intValue()));
                                    afMetadataM4955e10.m4897c(nrb.m17630a(((Integer) kppVar.mo9517d(CaptureResult.CONTROL_AF_STATE)).intValue()));
                                    afMetadataM4955e10.m4898d(((Integer) kppVar.mo9517d(CaptureResult.CONTROL_AF_TRIGGER)).intValue());
                                    num3 = (Integer) kppVar.mo9517d(CaptureResult.LENS_STATE);
                                    if (num3 != null) {
                                        iIntValue4 = num3.intValue();
                                        nrr[] nrrVarArr10 = nrr.f44283d;
                                        if (iIntValue4 < 3) {
                                            while (true) {
                                                nrrVarArr = nrr.f44283d;
                                                if (i5 < 3) {
                                                    throw new IllegalArgumentException(str2 + nrr.class.toString() + str9 + iIntValue4);
                                                }
                                                nrrVar = nrrVarArr[i5];
                                                if (nrrVar.f44284e == iIntValue4) {
                                                    i5++;
                                                }
                                            }
                                            GcamModuleJNI.FrameMetadata_lens_state_set(frameMetadata.f8263a, frameMetadata, nrrVar.f44284e);
                                            str4 = "bgstats";
                                            key4 = ivt.f32366t;
                                            if (key4 != null) {
                                                bArr2 = (byte[]) kppVar.mo9517d(key4);
                                                if (bArr2 != null) {
                                                    ByteBuffer byteBufferOrder115 = ByteBuffer.allocateDirect(bArr2.length).order(ByteOrder.nativeOrder());
                                                    byteBufferOrder115.put(bArr2);
                                                    IspAwbMetadata ispAwbMetadata115 = new IspAwbMetadata(GcamModuleJNI.DeserializeFromBytes(nsd.m17642a(new nsd(BufferUtils.m4902a(byteBufferOrder115))), byteBufferOrder115.capacity()));
                                                    GcamModuleJNI.FrameMetadata_isp_metadata_set(frameMetadata.f8263a, frameMetadata, ispAwbMetadata115.f8306a, ispAwbMetadata115);
                                                }
                                                if (frameMetadata.m4960j() != nse.f44367f) {
                                                    GcamModuleJNI.ApplySensorBinning__SWIG_0(2, true, false, FrameMetadata.m4951b(frameMetadata), frameMetadata);
                                                } else {
                                                    GcamModuleJNI.ApplySensorBinning__SWIG_0(2, true, false, FrameMetadata.m4951b(frameMetadata), frameMetadata);
                                                }
                                                str5 = "halaf";
                                                bArrM17661I = m17661I(ivx.f32439b, kppVar);
                                                if (bArrM17661I != null) {
                                                    ntw.m17717c(bArrM17661I, frameMetadata.m4958h());
                                                }
                                                bArrM17661I2 = m17661I(ivx.f32438a, kppVar);
                                                if (bArrM17661I2 != null) {
                                                    HalAfMetadata halAfMetadataM4958h11119 = frameMetadata.m4958h();
                                                    Pair pairM17716b11119 = ntw.m17716b(bArrM17661I2);
                                                    GcamModuleJNI.HalAfMetadata_SetAfTargetFocusInfoFromBytes(halAfMetadataM4958h11119.f8287a, halAfMetadataM4958h11119, nsd.m17642a(new nsd(((Long) pairM17716b11119.second).longValue())), ((ByteBuffer) pairM17716b11119.first).capacity());
                                                }
                                            } else {
                                                if (frameMetadata.m4960j() != nse.f44367f) {
                                                    GcamModuleJNI.ApplySensorBinning__SWIG_0(2, true, false, FrameMetadata.m4951b(frameMetadata), frameMetadata);
                                                } else {
                                                    GcamModuleJNI.ApplySensorBinning__SWIG_0(2, true, false, FrameMetadata.m4951b(frameMetadata), frameMetadata);
                                                }
                                                str5 = "halaf";
                                                bArrM17661I = m17661I(ivx.f32439b, kppVar);
                                                if (bArrM17661I != null) {
                                                    ntw.m17717c(bArrM17661I, frameMetadata.m4958h());
                                                }
                                                bArrM17661I2 = m17661I(ivx.f32438a, kppVar);
                                                if (bArrM17661I2 != null) {
                                                    HalAfMetadata halAfMetadataM4958h111110 = frameMetadata.m4958h();
                                                    Pair pairM17716b111110 = ntw.m17716b(bArrM17661I2);
                                                    GcamModuleJNI.HalAfMetadata_SetAfTargetFocusInfoFromBytes(halAfMetadataM4958h111110.f8287a, halAfMetadataM4958h111110, nsd.m17642a(new nsd(((Long) pairM17716b111110.second).longValue())), ((ByteBuffer) pairM17716b111110.first).capacity());
                                                }
                                            }
                                        } else {
                                            while (true) {
                                                nrrVarArr = nrr.f44283d;
                                                if (i5 < 3) {
                                                    throw new IllegalArgumentException(str2 + nrr.class.toString() + str9 + iIntValue4);
                                                }
                                                nrrVar = nrrVarArr[i5];
                                                if (nrrVar.f44284e == iIntValue4) {
                                                    i5++;
                                                }
                                            }
                                            GcamModuleJNI.FrameMetadata_lens_state_set(frameMetadata.f8263a, frameMetadata, nrrVar.f44284e);
                                            str4 = "bgstats";
                                            key4 = ivt.f32366t;
                                            if (key4 != null) {
                                                bArr2 = (byte[]) kppVar.mo9517d(key4);
                                                if (bArr2 != null) {
                                                    ByteBuffer byteBufferOrder116 = ByteBuffer.allocateDirect(bArr2.length).order(ByteOrder.nativeOrder());
                                                    byteBufferOrder116.put(bArr2);
                                                    IspAwbMetadata ispAwbMetadata116 = new IspAwbMetadata(GcamModuleJNI.DeserializeFromBytes(nsd.m17642a(new nsd(BufferUtils.m4902a(byteBufferOrder116))), byteBufferOrder116.capacity()));
                                                    GcamModuleJNI.FrameMetadata_isp_metadata_set(frameMetadata.f8263a, frameMetadata, ispAwbMetadata116.f8306a, ispAwbMetadata116);
                                                }
                                                if (frameMetadata.m4960j() != nse.f44367f) {
                                                    GcamModuleJNI.ApplySensorBinning__SWIG_0(2, true, false, FrameMetadata.m4951b(frameMetadata), frameMetadata);
                                                } else {
                                                    GcamModuleJNI.ApplySensorBinning__SWIG_0(2, true, false, FrameMetadata.m4951b(frameMetadata), frameMetadata);
                                                }
                                                str5 = "halaf";
                                                bArrM17661I = m17661I(ivx.f32439b, kppVar);
                                                if (bArrM17661I != null) {
                                                    ntw.m17717c(bArrM17661I, frameMetadata.m4958h());
                                                }
                                                bArrM17661I2 = m17661I(ivx.f32438a, kppVar);
                                                if (bArrM17661I2 != null) {
                                                    HalAfMetadata halAfMetadataM4958h111111 = frameMetadata.m4958h();
                                                    Pair pairM17716b111111 = ntw.m17716b(bArrM17661I2);
                                                    GcamModuleJNI.HalAfMetadata_SetAfTargetFocusInfoFromBytes(halAfMetadataM4958h111111.f8287a, halAfMetadataM4958h111111, nsd.m17642a(new nsd(((Long) pairM17716b111111.second).longValue())), ((ByteBuffer) pairM17716b111111.first).capacity());
                                                }
                                            } else {
                                                if (frameMetadata.m4960j() != nse.f44367f) {
                                                    GcamModuleJNI.ApplySensorBinning__SWIG_0(2, true, false, FrameMetadata.m4951b(frameMetadata), frameMetadata);
                                                } else {
                                                    GcamModuleJNI.ApplySensorBinning__SWIG_0(2, true, false, FrameMetadata.m4951b(frameMetadata), frameMetadata);
                                                }
                                                str5 = "halaf";
                                                bArrM17661I = m17661I(ivx.f32439b, kppVar);
                                                if (bArrM17661I != null) {
                                                    ntw.m17717c(bArrM17661I, frameMetadata.m4958h());
                                                }
                                                bArrM17661I2 = m17661I(ivx.f32438a, kppVar);
                                                if (bArrM17661I2 != null) {
                                                    HalAfMetadata halAfMetadataM4958h111112 = frameMetadata.m4958h();
                                                    Pair pairM17716b111112 = ntw.m17716b(bArrM17661I2);
                                                    GcamModuleJNI.HalAfMetadata_SetAfTargetFocusInfoFromBytes(halAfMetadataM4958h111112.f8287a, halAfMetadataM4958h111112, nsd.m17642a(new nsd(((Long) pairM17716b111112.second).longValue())), ((ByteBuffer) pairM17716b111112.first).capacity());
                                                }
                                            }
                                        }
                                    } else {
                                        str4 = "bgstats";
                                        key4 = ivt.f32366t;
                                        if (key4 != null) {
                                            bArr2 = (byte[]) kppVar.mo9517d(key4);
                                            if (bArr2 != null) {
                                                ByteBuffer byteBufferOrder117 = ByteBuffer.allocateDirect(bArr2.length).order(ByteOrder.nativeOrder());
                                                byteBufferOrder117.put(bArr2);
                                                IspAwbMetadata ispAwbMetadata117 = new IspAwbMetadata(GcamModuleJNI.DeserializeFromBytes(nsd.m17642a(new nsd(BufferUtils.m4902a(byteBufferOrder117))), byteBufferOrder117.capacity()));
                                                GcamModuleJNI.FrameMetadata_isp_metadata_set(frameMetadata.f8263a, frameMetadata, ispAwbMetadata117.f8306a, ispAwbMetadata117);
                                            }
                                            if (frameMetadata.m4960j() != nse.f44367f) {
                                                GcamModuleJNI.ApplySensorBinning__SWIG_0(2, true, false, FrameMetadata.m4951b(frameMetadata), frameMetadata);
                                            } else {
                                                GcamModuleJNI.ApplySensorBinning__SWIG_0(2, true, false, FrameMetadata.m4951b(frameMetadata), frameMetadata);
                                            }
                                            str5 = "halaf";
                                            bArrM17661I = m17661I(ivx.f32439b, kppVar);
                                            if (bArrM17661I != null) {
                                                ntw.m17717c(bArrM17661I, frameMetadata.m4958h());
                                            }
                                            bArrM17661I2 = m17661I(ivx.f32438a, kppVar);
                                            if (bArrM17661I2 != null) {
                                                HalAfMetadata halAfMetadataM4958h111113 = frameMetadata.m4958h();
                                                Pair pairM17716b111113 = ntw.m17716b(bArrM17661I2);
                                                GcamModuleJNI.HalAfMetadata_SetAfTargetFocusInfoFromBytes(halAfMetadataM4958h111113.f8287a, halAfMetadataM4958h111113, nsd.m17642a(new nsd(((Long) pairM17716b111113.second).longValue())), ((ByteBuffer) pairM17716b111113.first).capacity());
                                            }
                                        } else {
                                            if (frameMetadata.m4960j() != nse.f44367f) {
                                                GcamModuleJNI.ApplySensorBinning__SWIG_0(2, true, false, FrameMetadata.m4951b(frameMetadata), frameMetadata);
                                            } else {
                                                GcamModuleJNI.ApplySensorBinning__SWIG_0(2, true, false, FrameMetadata.m4951b(frameMetadata), frameMetadata);
                                            }
                                            str5 = "halaf";
                                            bArrM17661I = m17661I(ivx.f32439b, kppVar);
                                            if (bArrM17661I != null) {
                                                ntw.m17717c(bArrM17661I, frameMetadata.m4958h());
                                            }
                                            bArrM17661I2 = m17661I(ivx.f32438a, kppVar);
                                            if (bArrM17661I2 != null) {
                                                HalAfMetadata halAfMetadataM4958h111114 = frameMetadata.m4958h();
                                                Pair pairM17716b111114 = ntw.m17716b(bArrM17661I2);
                                                GcamModuleJNI.HalAfMetadata_SetAfTargetFocusInfoFromBytes(halAfMetadataM4958h111114.f8287a, halAfMetadataM4958h111114, nsd.m17642a(new nsd(((Long) pairM17716b111114.second).longValue())), ((ByteBuffer) pairM17716b111114.first).capacity());
                                            }
                                        }
                                    }
                                } else {
                                    GcamModuleJNI.FrameMetadata_was_black_level_locked_set(frameMetadata.f8263a, frameMetadata, bool.booleanValue());
                                    GcamModuleJNI.FrameMetadata_frame_duration_ms_set(frameMetadata.f8263a, frameMetadata, m17675x(((Long) kppVar.mo9517d(CaptureResult.SENSOR_FRAME_DURATION)).longValue()));
                                    GcamModuleJNI.FrameMetadata_timestamp_ns_set(frameMetadata.f8263a, frameMetadata, ((Long) kppVar.mo9517d(CaptureResult.SENSOR_TIMESTAMP)).longValue());
                                    GcamModuleJNI.FrameMetadata_sensor_temp_set(frameMetadata.f8263a, frameMetadata, GcamModuleJNI.kSensorTempUnknown_get());
                                    SceneFlicker sceneFlicker8 = new SceneFlicker();
                                    key = ivv.f32398g;
                                    fIntValue = -1.0f;
                                    if (key != null) {
                                        fIntValue2 = -1.0f;
                                    } else {
                                        fIntValue2 = -1.0f;
                                    }
                                    key2 = ivv.f32399h;
                                    if (key2 != null) {
                                        fIntValue = num4.intValue() / 10000.0f;
                                    }
                                    if (fIntValue2 >= 0.0f) {
                                        switch (num.intValue()) {
                                            case 0:
                                                fIntValue2 = 0.0f;
                                                fIntValue = 1.0f;
                                                break;
                                            case 1:
                                                fIntValue2 = 100.0f;
                                                fIntValue = 1.0f;
                                                break;
                                            case 2:
                                                fIntValue2 = 120.0f;
                                                fIntValue = 1.0f;
                                                break;
                                            default:
                                                Log.e(f44463a, BEeWZPor.BZKQtFscIANQJ);
                                                break;
                                        }
                                    } else {
                                        switch (num.intValue()) {
                                            case 0:
                                                fIntValue2 = 0.0f;
                                                fIntValue = 1.0f;
                                                break;
                                            case 1:
                                                fIntValue2 = 100.0f;
                                                fIntValue = 1.0f;
                                                break;
                                            case 2:
                                                fIntValue2 = 120.0f;
                                                fIntValue = 1.0f;
                                                break;
                                            default:
                                                Log.e(f44463a, BEeWZPor.BZKQtFscIANQJ);
                                                break;
                                        }
                                    }
                                    GcamModuleJNI.SceneFlicker_frequency_set(sceneFlicker8.f8352a, sceneFlicker8, fIntValue2);
                                    GcamModuleJNI.SceneFlicker_confidence_set(sceneFlicker8.f8352a, sceneFlicker8, fIntValue);
                                    GcamModuleJNI.FrameMetadata_scene_flicker_set(frameMetadata.f8263a, frameMetadata, sceneFlicker8.f8352a, sceneFlicker8);
                                    str3 = "noise";
                                    pairArr = (Pair[]) kppVar.mo9517d(CaptureResult.SENSOR_NOISE_PROFILE);
                                    floatVector = new FloatVector();
                                    floatVector2 = new FloatVector();
                                    while (i3 < i2) {
                                        floatVector.m4949b(((Double) pairArr[i3].first).floatValue());
                                        floatVector2.m4949b(((Double) pairArr[i3].second).floatValue());
                                    }
                                    NoiseModel noiseModel8 = new NoiseModel(GcamModuleJNI.NoiseModel_FromShotReadNoiseVector(floatVector.f8261a, floatVector, floatVector2.f8261a, floatVector2));
                                    GcamModuleJNI.FrameMetadata_dng_noise_model_bayer_set(frameMetadata.f8263a, frameMetadata, noiseModel8.f8320a, noiseModel8);
                                    str5 = "dynamicbl";
                                    fArr5 = (float[]) kppVar.mo9517d(CaptureResult.SENSOR_DYNAMIC_BLACK_LEVEL);
                                    if (fArr5 != null) {
                                        floatArray5 = new FloatArray4();
                                        while (i9 < floatArray5.m4942b()) {
                                            floatArray5.m4944d(i9, fArr5[i9]);
                                        }
                                        frameMetadata.m4962l(floatArray5);
                                    } else {
                                        blackLevelPattern = (BlackLevelPattern) kmdVarM17682f.mo14559l(CameraCharacteristics.SENSOR_BLACK_LEVEL_PATTERN);
                                        if (blackLevelPattern != null) {
                                            floatArray4 = new FloatArray4();
                                            while (i4 < floatArray4.m4942b()) {
                                                floatArray4.m4944d(i4, blackLevelPattern.getOffsetForIndex(i4 % 2, i4 / 2));
                                            }
                                            frameMetadata.m4962l(floatArray4);
                                        }
                                    }
                                    f = (Float) kppVar.mo9517d(CaptureResult.LENS_FOCUS_DISTANCE);
                                    Integer num15 = (Integer) kmdVarM17682f.mo14559l(CameraCharacteristics.LENS_INFO_FOCUS_DISTANCE_CALIBRATION);
                                    if (f != null) {
                                        GcamModuleJNI.FrameMetadata_focus_distance_diopters_set(frameMetadata.f8263a, frameMetadata, f.floatValue());
                                    }
                                    liveHdrMetadata = new LiveHdrMetadata(GcamModuleJNI.new_LiveHdrMetadata(), true);
                                    aeResults = new AeResults(GcamModuleJNI.new_AeResults(), true);
                                    if (ivu.f32375c != null) {
                                        GcamModuleJNI.LiveHdrMetadata_max_hdr_ratio_override_set(liveHdrMetadata.f8311a, liveHdrMetadata, fArr7[0]);
                                        liveHdrMetadata.m5029c(fArr7[1]);
                                        liveHdrMetadata.m5028b(fArr7[2]);
                                        if (!f44464b.f36770c) {
                                            GcamModuleJNI.LiveHdrMetadata_night_factor_set(liveHdrMetadata.f8311a, liveHdrMetadata, fArr7[3]);
                                        }
                                        GcamModuleJNI.LiveHdrMetadata_manual_ec_short_set(liveHdrMetadata.f8311a, liveHdrMetadata, fArr7[i2]);
                                        GcamModuleJNI.LiveHdrMetadata_manual_portrait_tet_override_set(liveHdrMetadata.f8311a, liveHdrMetadata, fArr7[5]);
                                    }
                                    str5 = "gcamae";
                                    key3 = ivu.f32373a;
                                    if (key3 != null) {
                                        AeModeResult aeModeResult112 = new AeModeResult();
                                        AeModeResult aeModeResult113 = new AeModeResult();
                                        aeModeResult112.m4880d(fArr6[0]);
                                        aeModeResult113.m4880d(fArr6[1]);
                                        aeModeResult112.m4879c(fArr6[2]);
                                        aeModeResult113.m4879c(fArr6[3]);
                                        GcamModuleJNI.AeResults_pure_fraction_of_pixels_from_long_exposure_set(aeResults.f8224a, aeResults, fArr6[i2]);
                                        GcamModuleJNI.AeResults_weighted_fraction_of_pixels_from_long_exposure_set(aeResults.f8224a, aeResults, fArr6[5]);
                                        GcamModuleJNI.AeModeResult_log_scene_brightness_set(aeModeResult112.f8222a, aeModeResult112, fArr6[6]);
                                        GcamModuleJNI.AeResults_predicted_image_brightness_set(aeResults.f8224a, aeResults, fArr6[7]);
                                        GcamModuleJNI.LiveHdrMetadata_motion_magnitude_pix_set(liveHdrMetadata.f8311a, liveHdrMetadata, fArr6[8]);
                                        GcamModuleJNI.LiveHdrMetadata_metering_interval_ms_set(liveHdrMetadata.f8311a, liveHdrMetadata, fArr6[9]);
                                        GcamModuleJNI.LiveHdrMetadata_filtered_motion_speed_pix_per_ms_set(liveHdrMetadata.f8311a, liveHdrMetadata, fArr6[10]);
                                        liveHdrMetadata.m5032f(fArr6[11]);
                                        liveHdrMetadata.m5030d(fArr6[12]);
                                        if (length2 > 13) {
                                            GcamModuleJNI.AeResults_safe_underexposure_set(aeResults.f8224a, aeResults, fArr6[13]);
                                        }
                                        if (length2 > 15) {
                                            AeModeResult aeModeResult114 = new AeModeResult();
                                            aeModeResult114.m4880d(fArr6[14]);
                                            aeModeResult114.m4879c(fArr6[15]);
                                            GcamModuleJNI.AeResults_portrait_result_set(aeResults.f8224a, aeResults, AeModeResult.m4877a(aeModeResult114), aeModeResult114);
                                            if (length2 > 16) {
                                                liveHdrMetadata.m5031e(fArr6[16]);
                                            } else {
                                                liveHdrMetadata.m5031e(fArr6[15]);
                                            }
                                        }
                                        aeModeResultArr = new AeModeResult[]{aeModeResult112, aeModeResult113};
                                        long j8 = aeResults.f8224a;
                                        jArr = new long[2];
                                        while (i8 < 2) {
                                            jArr[i8] = AeModeResult.m4877a(aeModeResultArr[i8]);
                                        }
                                        GcamModuleJNI.AeResults_mode_result_set(j8, aeResults, jArr);
                                    }
                                    str4 = "smask";
                                    if (ivw.f32425k != null) {
                                        bArr = (byte[]) kppVar.mo9517d(ivw.f32425k);
                                        if (bArr != null) {
                                            frameMetadata = frameMetadata;
                                            i5 = 0;
                                        } else {
                                            frameMetadata = frameMetadata;
                                            i5 = 0;
                                        }
                                    } else {
                                        frameMetadata = frameMetadata;
                                        i5 = 0;
                                    }
                                    frameMetadata = frameMetadata;
                                    GcamModuleJNI.FrameMetadata_live_hdr_set(frameMetadata.f8263a, frameMetadata, liveHdrMetadata.f8311a, liveHdrMetadata);
                                    GcamModuleJNI.FrameMetadata_ae_results_set(frameMetadata.f8263a, frameMetadata, AeResults.m4881b(aeResults), aeResults);
                                    str5 = "3a";
                                    iIntValue2 = ((Integer) kppVar.mo9517d(CaptureResult.CONTROL_MODE)).intValue();
                                    nrf[] nrfVarArr9 = nrf.f44179g;
                                    if (iIntValue2 < 6) {
                                        i6 = 0;
                                        while (true) {
                                            nrfVarArr = nrf.f44179g;
                                            if (i6 >= 6) {
                                                throw new IllegalArgumentException(str2 + nrf.class.toString() + str9 + iIntValue2);
                                            }
                                            nrfVar2 = nrfVarArr[i6];
                                            if (nrfVar2.f44180h == iIntValue2) {
                                                nrfVar = nrfVar2;
                                            } else {
                                                i6++;
                                            }
                                        }
                                    } else {
                                        i6 = 0;
                                        while (true) {
                                            nrfVarArr = nrf.f44179g;
                                            if (i6 >= 6) {
                                                throw new IllegalArgumentException(str2 + nrf.class.toString() + str9 + iIntValue2);
                                            }
                                            nrfVar2 = nrfVarArr[i6];
                                            if (nrfVar2.f44180h == iIntValue2) {
                                                nrfVar = nrfVar2;
                                            } else {
                                                i6++;
                                            }
                                        }
                                    }
                                    GcamModuleJNI.FrameMetadata_control_mode_set(frameMetadata.f8263a, frameMetadata, nrfVar.f44180h);
                                    aeMetadataM4954d = frameMetadata.m4954d();
                                    GcamModuleJNI.AeMetadata_mode_set(aeMetadataM4954d.f8221a, aeMetadataM4954d, nqx.m17628a(((Integer) kppVar.mo9517d(CaptureResult.CONTROL_AE_MODE)).intValue()).f44108h);
                                    GcamModuleJNI.AeMetadata_lock_set(aeMetadataM4954d.f8221a, aeMetadataM4954d, ((Boolean) kppVar.mo9517d(CaptureResult.CONTROL_AE_LOCK)).booleanValue());
                                    iIntValue3 = ((Integer) kppVar.mo9517d(CaptureResult.CONTROL_AE_STATE)).intValue();
                                    nqy[] nqyVarArr10 = nqy.f44117h;
                                    if (iIntValue3 < 7) {
                                        i7 = 0;
                                        while (true) {
                                            nqyVarArr = nqy.f44117h;
                                            if (i7 >= 7) {
                                                String str115 = str9;
                                                throw new IllegalArgumentException(str2 + nqy.class.toString() + str115 + iIntValue3);
                                            }
                                            nqyVar2 = nqyVarArr[i7];
                                            if (nqyVar2.f44118i == iIntValue3) {
                                                nqyVar = nqyVar2;
                                            } else {
                                                i7++;
                                            }
                                        }
                                    } else {
                                        i7 = 0;
                                        while (true) {
                                            nqyVarArr = nqy.f44117h;
                                            if (i7 >= 7) {
                                                String str116 = str9;
                                                throw new IllegalArgumentException(str2 + nqy.class.toString() + str116 + iIntValue3);
                                            }
                                            nqyVar2 = nqyVarArr[i7];
                                            if (nqyVar2.f44118i == iIntValue3) {
                                                nqyVar = nqyVar2;
                                            } else {
                                                i7++;
                                            }
                                        }
                                    }
                                    GcamModuleJNI.AeMetadata_state_set(aeMetadataM4954d.f8221a, aeMetadataM4954d, nqyVar.f44118i);
                                    num2 = (Integer) kppVar.mo9517d(CaptureResult.CONTROL_AE_PRECAPTURE_TRIGGER);
                                    if (num2 != null) {
                                        GcamModuleJNI.AeMetadata_precapture_trigger_set(aeMetadataM4954d.f8221a, aeMetadataM4954d, num2.intValue());
                                    }
                                    GcamModuleJNI.AeMetadata_exposure_compensation_set(aeMetadataM4954d.f8221a, aeMetadataM4954d, m17678a(((Integer) kppVar.mo9517d(CaptureResult.CONTROL_AE_EXPOSURE_COMPENSATION)).intValue()));
                                    AwbMetadata awbMetadataM4956f11 = frameMetadata.m4956f();
                                    GcamModuleJNI.AwbMetadata_mode_set(awbMetadataM4956f11.f8231a, awbMetadataM4956f11, ((Integer) kppVar.mo9517d(CaptureResult.CONTROL_AWB_MODE)).intValue());
                                    GcamModuleJNI.AwbMetadata_lock_set(awbMetadataM4956f11.f8231a, awbMetadataM4956f11, ((Boolean) kppVar.mo9517d(CaptureResult.CONTROL_AWB_LOCK)).booleanValue());
                                    GcamModuleJNI.AwbMetadata_state_set(awbMetadataM4956f11.f8231a, awbMetadataM4956f11, ((Integer) kppVar.mo9517d(CaptureResult.CONTROL_AWB_STATE)).intValue());
                                    AfMetadata afMetadataM4955e11 = frameMetadata.m4955e();
                                    afMetadataM4955e11.m4896b(nra.m17629a(((Integer) kppVar.mo9517d(CaptureResult.CONTROL_AF_MODE)).intValue()));
                                    afMetadataM4955e11.m4897c(nrb.m17630a(((Integer) kppVar.mo9517d(CaptureResult.CONTROL_AF_STATE)).intValue()));
                                    afMetadataM4955e11.m4898d(((Integer) kppVar.mo9517d(CaptureResult.CONTROL_AF_TRIGGER)).intValue());
                                    num3 = (Integer) kppVar.mo9517d(CaptureResult.LENS_STATE);
                                    if (num3 != null) {
                                        iIntValue4 = num3.intValue();
                                        nrr[] nrrVarArr11 = nrr.f44283d;
                                        if (iIntValue4 < 3) {
                                            while (true) {
                                                nrrVarArr = nrr.f44283d;
                                                if (i5 < 3) {
                                                    throw new IllegalArgumentException(str2 + nrr.class.toString() + str9 + iIntValue4);
                                                }
                                                nrrVar = nrrVarArr[i5];
                                                if (nrrVar.f44284e == iIntValue4) {
                                                    i5++;
                                                }
                                            }
                                            GcamModuleJNI.FrameMetadata_lens_state_set(frameMetadata.f8263a, frameMetadata, nrrVar.f44284e);
                                            str4 = "bgstats";
                                            key4 = ivt.f32366t;
                                            if (key4 != null) {
                                                bArr2 = (byte[]) kppVar.mo9517d(key4);
                                                if (bArr2 != null) {
                                                    ByteBuffer byteBufferOrder118 = ByteBuffer.allocateDirect(bArr2.length).order(ByteOrder.nativeOrder());
                                                    byteBufferOrder118.put(bArr2);
                                                    IspAwbMetadata ispAwbMetadata118 = new IspAwbMetadata(GcamModuleJNI.DeserializeFromBytes(nsd.m17642a(new nsd(BufferUtils.m4902a(byteBufferOrder118))), byteBufferOrder118.capacity()));
                                                    GcamModuleJNI.FrameMetadata_isp_metadata_set(frameMetadata.f8263a, frameMetadata, ispAwbMetadata118.f8306a, ispAwbMetadata118);
                                                }
                                                if (frameMetadata.m4960j() != nse.f44367f) {
                                                    GcamModuleJNI.ApplySensorBinning__SWIG_0(2, true, false, FrameMetadata.m4951b(frameMetadata), frameMetadata);
                                                } else {
                                                    GcamModuleJNI.ApplySensorBinning__SWIG_0(2, true, false, FrameMetadata.m4951b(frameMetadata), frameMetadata);
                                                }
                                                str5 = "halaf";
                                                bArrM17661I = m17661I(ivx.f32439b, kppVar);
                                                if (bArrM17661I != null) {
                                                    ntw.m17717c(bArrM17661I, frameMetadata.m4958h());
                                                }
                                                bArrM17661I2 = m17661I(ivx.f32438a, kppVar);
                                                if (bArrM17661I2 != null) {
                                                    HalAfMetadata halAfMetadataM4958h111115 = frameMetadata.m4958h();
                                                    Pair pairM17716b111115 = ntw.m17716b(bArrM17661I2);
                                                    GcamModuleJNI.HalAfMetadata_SetAfTargetFocusInfoFromBytes(halAfMetadataM4958h111115.f8287a, halAfMetadataM4958h111115, nsd.m17642a(new nsd(((Long) pairM17716b111115.second).longValue())), ((ByteBuffer) pairM17716b111115.first).capacity());
                                                }
                                            } else {
                                                if (frameMetadata.m4960j() != nse.f44367f) {
                                                    GcamModuleJNI.ApplySensorBinning__SWIG_0(2, true, false, FrameMetadata.m4951b(frameMetadata), frameMetadata);
                                                } else {
                                                    GcamModuleJNI.ApplySensorBinning__SWIG_0(2, true, false, FrameMetadata.m4951b(frameMetadata), frameMetadata);
                                                }
                                                str5 = "halaf";
                                                bArrM17661I = m17661I(ivx.f32439b, kppVar);
                                                if (bArrM17661I != null) {
                                                    ntw.m17717c(bArrM17661I, frameMetadata.m4958h());
                                                }
                                                bArrM17661I2 = m17661I(ivx.f32438a, kppVar);
                                                if (bArrM17661I2 != null) {
                                                    HalAfMetadata halAfMetadataM4958h111116 = frameMetadata.m4958h();
                                                    Pair pairM17716b111116 = ntw.m17716b(bArrM17661I2);
                                                    GcamModuleJNI.HalAfMetadata_SetAfTargetFocusInfoFromBytes(halAfMetadataM4958h111116.f8287a, halAfMetadataM4958h111116, nsd.m17642a(new nsd(((Long) pairM17716b111116.second).longValue())), ((ByteBuffer) pairM17716b111116.first).capacity());
                                                }
                                            }
                                        } else {
                                            while (true) {
                                                nrrVarArr = nrr.f44283d;
                                                if (i5 < 3) {
                                                    throw new IllegalArgumentException(str2 + nrr.class.toString() + str9 + iIntValue4);
                                                }
                                                nrrVar = nrrVarArr[i5];
                                                if (nrrVar.f44284e == iIntValue4) {
                                                    i5++;
                                                }
                                            }
                                            GcamModuleJNI.FrameMetadata_lens_state_set(frameMetadata.f8263a, frameMetadata, nrrVar.f44284e);
                                            str4 = "bgstats";
                                            key4 = ivt.f32366t;
                                            if (key4 != null) {
                                                bArr2 = (byte[]) kppVar.mo9517d(key4);
                                                if (bArr2 != null) {
                                                    ByteBuffer byteBufferOrder119 = ByteBuffer.allocateDirect(bArr2.length).order(ByteOrder.nativeOrder());
                                                    byteBufferOrder119.put(bArr2);
                                                    IspAwbMetadata ispAwbMetadata119 = new IspAwbMetadata(GcamModuleJNI.DeserializeFromBytes(nsd.m17642a(new nsd(BufferUtils.m4902a(byteBufferOrder119))), byteBufferOrder119.capacity()));
                                                    GcamModuleJNI.FrameMetadata_isp_metadata_set(frameMetadata.f8263a, frameMetadata, ispAwbMetadata119.f8306a, ispAwbMetadata119);
                                                }
                                                if (frameMetadata.m4960j() != nse.f44367f) {
                                                    GcamModuleJNI.ApplySensorBinning__SWIG_0(2, true, false, FrameMetadata.m4951b(frameMetadata), frameMetadata);
                                                } else {
                                                    GcamModuleJNI.ApplySensorBinning__SWIG_0(2, true, false, FrameMetadata.m4951b(frameMetadata), frameMetadata);
                                                }
                                                str5 = "halaf";
                                                bArrM17661I = m17661I(ivx.f32439b, kppVar);
                                                if (bArrM17661I != null) {
                                                    ntw.m17717c(bArrM17661I, frameMetadata.m4958h());
                                                }
                                                bArrM17661I2 = m17661I(ivx.f32438a, kppVar);
                                                if (bArrM17661I2 != null) {
                                                    HalAfMetadata halAfMetadataM4958h111117 = frameMetadata.m4958h();
                                                    Pair pairM17716b111117 = ntw.m17716b(bArrM17661I2);
                                                    GcamModuleJNI.HalAfMetadata_SetAfTargetFocusInfoFromBytes(halAfMetadataM4958h111117.f8287a, halAfMetadataM4958h111117, nsd.m17642a(new nsd(((Long) pairM17716b111117.second).longValue())), ((ByteBuffer) pairM17716b111117.first).capacity());
                                                }
                                            } else {
                                                if (frameMetadata.m4960j() != nse.f44367f) {
                                                    GcamModuleJNI.ApplySensorBinning__SWIG_0(2, true, false, FrameMetadata.m4951b(frameMetadata), frameMetadata);
                                                } else {
                                                    GcamModuleJNI.ApplySensorBinning__SWIG_0(2, true, false, FrameMetadata.m4951b(frameMetadata), frameMetadata);
                                                }
                                                str5 = "halaf";
                                                bArrM17661I = m17661I(ivx.f32439b, kppVar);
                                                if (bArrM17661I != null) {
                                                    ntw.m17717c(bArrM17661I, frameMetadata.m4958h());
                                                }
                                                bArrM17661I2 = m17661I(ivx.f32438a, kppVar);
                                                if (bArrM17661I2 != null) {
                                                    HalAfMetadata halAfMetadataM4958h111118 = frameMetadata.m4958h();
                                                    Pair pairM17716b111118 = ntw.m17716b(bArrM17661I2);
                                                    GcamModuleJNI.HalAfMetadata_SetAfTargetFocusInfoFromBytes(halAfMetadataM4958h111118.f8287a, halAfMetadataM4958h111118, nsd.m17642a(new nsd(((Long) pairM17716b111118.second).longValue())), ((ByteBuffer) pairM17716b111118.first).capacity());
                                                }
                                            }
                                        }
                                    } else {
                                        str4 = "bgstats";
                                        key4 = ivt.f32366t;
                                        if (key4 != null) {
                                            bArr2 = (byte[]) kppVar.mo9517d(key4);
                                            if (bArr2 != null) {
                                                ByteBuffer byteBufferOrder1110 = ByteBuffer.allocateDirect(bArr2.length).order(ByteOrder.nativeOrder());
                                                byteBufferOrder1110.put(bArr2);
                                                IspAwbMetadata ispAwbMetadata1110 = new IspAwbMetadata(GcamModuleJNI.DeserializeFromBytes(nsd.m17642a(new nsd(BufferUtils.m4902a(byteBufferOrder1110))), byteBufferOrder1110.capacity()));
                                                GcamModuleJNI.FrameMetadata_isp_metadata_set(frameMetadata.f8263a, frameMetadata, ispAwbMetadata1110.f8306a, ispAwbMetadata1110);
                                            }
                                            if (frameMetadata.m4960j() != nse.f44367f) {
                                                GcamModuleJNI.ApplySensorBinning__SWIG_0(2, true, false, FrameMetadata.m4951b(frameMetadata), frameMetadata);
                                            } else {
                                                GcamModuleJNI.ApplySensorBinning__SWIG_0(2, true, false, FrameMetadata.m4951b(frameMetadata), frameMetadata);
                                            }
                                            str5 = "halaf";
                                            bArrM17661I = m17661I(ivx.f32439b, kppVar);
                                            if (bArrM17661I != null) {
                                                ntw.m17717c(bArrM17661I, frameMetadata.m4958h());
                                            }
                                            bArrM17661I2 = m17661I(ivx.f32438a, kppVar);
                                            if (bArrM17661I2 != null) {
                                                HalAfMetadata halAfMetadataM4958h111119 = frameMetadata.m4958h();
                                                Pair pairM17716b111119 = ntw.m17716b(bArrM17661I2);
                                                GcamModuleJNI.HalAfMetadata_SetAfTargetFocusInfoFromBytes(halAfMetadataM4958h111119.f8287a, halAfMetadataM4958h111119, nsd.m17642a(new nsd(((Long) pairM17716b111119.second).longValue())), ((ByteBuffer) pairM17716b111119.first).capacity());
                                            }
                                        } else {
                                            if (frameMetadata.m4960j() != nse.f44367f) {
                                                GcamModuleJNI.ApplySensorBinning__SWIG_0(2, true, false, FrameMetadata.m4951b(frameMetadata), frameMetadata);
                                            } else {
                                                GcamModuleJNI.ApplySensorBinning__SWIG_0(2, true, false, FrameMetadata.m4951b(frameMetadata), frameMetadata);
                                            }
                                            str5 = "halaf";
                                            bArrM17661I = m17661I(ivx.f32439b, kppVar);
                                            if (bArrM17661I != null) {
                                                ntw.m17717c(bArrM17661I, frameMetadata.m4958h());
                                            }
                                            bArrM17661I2 = m17661I(ivx.f32438a, kppVar);
                                            if (bArrM17661I2 != null) {
                                                HalAfMetadata halAfMetadataM4958h1111110 = frameMetadata.m4958h();
                                                Pair pairM17716b1111110 = ntw.m17716b(bArrM17661I2);
                                                GcamModuleJNI.HalAfMetadata_SetAfTargetFocusInfoFromBytes(halAfMetadataM4958h1111110.f8287a, halAfMetadataM4958h1111110, nsd.m17642a(new nsd(((Long) pairM17716b1111110.second).longValue())), ((ByteBuffer) pairM17716b1111110.first).capacity());
                                            }
                                        }
                                    }
                                }
                            } else {
                                frameMetadata.m4963m(nrj.f44222b);
                                str3 = "awb";
                                AwbInfo awbInfoM17666i5 = m17666i(kppVar, kmdVarM17682f);
                                GcamModuleJNI.FrameMetadata_wb_set(frameMetadata.f8263a, frameMetadata, AwbInfo.m4899a(awbInfoM17666i5), awbInfoM17666i5);
                                str3 = "bl";
                                bool = (Boolean) kppVar.mo9517d(CaptureResult.BLACK_LEVEL_LOCK);
                                if (bool == null) {
                                    bool = false;
                                    GcamModuleJNI.FrameMetadata_was_black_level_locked_set(frameMetadata.f8263a, frameMetadata, bool.booleanValue());
                                    GcamModuleJNI.FrameMetadata_frame_duration_ms_set(frameMetadata.f8263a, frameMetadata, m17675x(((Long) kppVar.mo9517d(CaptureResult.SENSOR_FRAME_DURATION)).longValue()));
                                    GcamModuleJNI.FrameMetadata_timestamp_ns_set(frameMetadata.f8263a, frameMetadata, ((Long) kppVar.mo9517d(CaptureResult.SENSOR_TIMESTAMP)).longValue());
                                    GcamModuleJNI.FrameMetadata_sensor_temp_set(frameMetadata.f8263a, frameMetadata, GcamModuleJNI.kSensorTempUnknown_get());
                                    SceneFlicker sceneFlicker9 = new SceneFlicker();
                                    key = ivv.f32398g;
                                    fIntValue = -1.0f;
                                    if (key != null) {
                                        fIntValue2 = -1.0f;
                                    } else {
                                        fIntValue2 = -1.0f;
                                    }
                                    key2 = ivv.f32399h;
                                    if (key2 != null) {
                                        fIntValue = num4.intValue() / 10000.0f;
                                    }
                                    if (fIntValue2 >= 0.0f) {
                                        switch (num.intValue()) {
                                            case 0:
                                                fIntValue2 = 0.0f;
                                                fIntValue = 1.0f;
                                                break;
                                            case 1:
                                                fIntValue2 = 100.0f;
                                                fIntValue = 1.0f;
                                                break;
                                            case 2:
                                                fIntValue2 = 120.0f;
                                                fIntValue = 1.0f;
                                                break;
                                            default:
                                                Log.e(f44463a, BEeWZPor.BZKQtFscIANQJ);
                                                break;
                                        }
                                    } else {
                                        switch (num.intValue()) {
                                            case 0:
                                                fIntValue2 = 0.0f;
                                                fIntValue = 1.0f;
                                                break;
                                            case 1:
                                                fIntValue2 = 100.0f;
                                                fIntValue = 1.0f;
                                                break;
                                            case 2:
                                                fIntValue2 = 120.0f;
                                                fIntValue = 1.0f;
                                                break;
                                            default:
                                                Log.e(f44463a, BEeWZPor.BZKQtFscIANQJ);
                                                break;
                                        }
                                    }
                                    GcamModuleJNI.SceneFlicker_frequency_set(sceneFlicker9.f8352a, sceneFlicker9, fIntValue2);
                                    GcamModuleJNI.SceneFlicker_confidence_set(sceneFlicker9.f8352a, sceneFlicker9, fIntValue);
                                    GcamModuleJNI.FrameMetadata_scene_flicker_set(frameMetadata.f8263a, frameMetadata, sceneFlicker9.f8352a, sceneFlicker9);
                                    str3 = "noise";
                                    pairArr = (Pair[]) kppVar.mo9517d(CaptureResult.SENSOR_NOISE_PROFILE);
                                    floatVector = new FloatVector();
                                    floatVector2 = new FloatVector();
                                    while (i3 < i2) {
                                        floatVector.m4949b(((Double) pairArr[i3].first).floatValue());
                                        floatVector2.m4949b(((Double) pairArr[i3].second).floatValue());
                                    }
                                    NoiseModel noiseModel9 = new NoiseModel(GcamModuleJNI.NoiseModel_FromShotReadNoiseVector(floatVector.f8261a, floatVector, floatVector2.f8261a, floatVector2));
                                    GcamModuleJNI.FrameMetadata_dng_noise_model_bayer_set(frameMetadata.f8263a, frameMetadata, noiseModel9.f8320a, noiseModel9);
                                    str5 = "dynamicbl";
                                    fArr5 = (float[]) kppVar.mo9517d(CaptureResult.SENSOR_DYNAMIC_BLACK_LEVEL);
                                    if (fArr5 != null) {
                                        floatArray5 = new FloatArray4();
                                        while (i9 < floatArray5.m4942b()) {
                                            floatArray5.m4944d(i9, fArr5[i9]);
                                        }
                                        frameMetadata.m4962l(floatArray5);
                                    } else {
                                        blackLevelPattern = (BlackLevelPattern) kmdVarM17682f.mo14559l(CameraCharacteristics.SENSOR_BLACK_LEVEL_PATTERN);
                                        if (blackLevelPattern != null) {
                                            floatArray4 = new FloatArray4();
                                            while (i4 < floatArray4.m4942b()) {
                                                floatArray4.m4944d(i4, blackLevelPattern.getOffsetForIndex(i4 % 2, i4 / 2));
                                            }
                                            frameMetadata.m4962l(floatArray4);
                                        }
                                    }
                                    f = (Float) kppVar.mo9517d(CaptureResult.LENS_FOCUS_DISTANCE);
                                    Integer num16 = (Integer) kmdVarM17682f.mo14559l(CameraCharacteristics.LENS_INFO_FOCUS_DISTANCE_CALIBRATION);
                                    if (f != null) {
                                        GcamModuleJNI.FrameMetadata_focus_distance_diopters_set(frameMetadata.f8263a, frameMetadata, f.floatValue());
                                    }
                                    liveHdrMetadata = new LiveHdrMetadata(GcamModuleJNI.new_LiveHdrMetadata(), true);
                                    aeResults = new AeResults(GcamModuleJNI.new_AeResults(), true);
                                    if (ivu.f32375c != null) {
                                        GcamModuleJNI.LiveHdrMetadata_max_hdr_ratio_override_set(liveHdrMetadata.f8311a, liveHdrMetadata, fArr7[0]);
                                        liveHdrMetadata.m5029c(fArr7[1]);
                                        liveHdrMetadata.m5028b(fArr7[2]);
                                        if (!f44464b.f36770c) {
                                            GcamModuleJNI.LiveHdrMetadata_night_factor_set(liveHdrMetadata.f8311a, liveHdrMetadata, fArr7[3]);
                                        }
                                        GcamModuleJNI.LiveHdrMetadata_manual_ec_short_set(liveHdrMetadata.f8311a, liveHdrMetadata, fArr7[i2]);
                                        GcamModuleJNI.LiveHdrMetadata_manual_portrait_tet_override_set(liveHdrMetadata.f8311a, liveHdrMetadata, fArr7[5]);
                                    }
                                    str5 = "gcamae";
                                    key3 = ivu.f32373a;
                                    if (key3 != null) {
                                        AeModeResult aeModeResult115 = new AeModeResult();
                                        AeModeResult aeModeResult116 = new AeModeResult();
                                        aeModeResult115.m4880d(fArr6[0]);
                                        aeModeResult116.m4880d(fArr6[1]);
                                        aeModeResult115.m4879c(fArr6[2]);
                                        aeModeResult116.m4879c(fArr6[3]);
                                        GcamModuleJNI.AeResults_pure_fraction_of_pixels_from_long_exposure_set(aeResults.f8224a, aeResults, fArr6[i2]);
                                        GcamModuleJNI.AeResults_weighted_fraction_of_pixels_from_long_exposure_set(aeResults.f8224a, aeResults, fArr6[5]);
                                        GcamModuleJNI.AeModeResult_log_scene_brightness_set(aeModeResult115.f8222a, aeModeResult115, fArr6[6]);
                                        GcamModuleJNI.AeResults_predicted_image_brightness_set(aeResults.f8224a, aeResults, fArr6[7]);
                                        GcamModuleJNI.LiveHdrMetadata_motion_magnitude_pix_set(liveHdrMetadata.f8311a, liveHdrMetadata, fArr6[8]);
                                        GcamModuleJNI.LiveHdrMetadata_metering_interval_ms_set(liveHdrMetadata.f8311a, liveHdrMetadata, fArr6[9]);
                                        GcamModuleJNI.LiveHdrMetadata_filtered_motion_speed_pix_per_ms_set(liveHdrMetadata.f8311a, liveHdrMetadata, fArr6[10]);
                                        liveHdrMetadata.m5032f(fArr6[11]);
                                        liveHdrMetadata.m5030d(fArr6[12]);
                                        if (length2 > 13) {
                                            GcamModuleJNI.AeResults_safe_underexposure_set(aeResults.f8224a, aeResults, fArr6[13]);
                                        }
                                        if (length2 > 15) {
                                            AeModeResult aeModeResult117 = new AeModeResult();
                                            aeModeResult117.m4880d(fArr6[14]);
                                            aeModeResult117.m4879c(fArr6[15]);
                                            GcamModuleJNI.AeResults_portrait_result_set(aeResults.f8224a, aeResults, AeModeResult.m4877a(aeModeResult117), aeModeResult117);
                                            if (length2 > 16) {
                                                liveHdrMetadata.m5031e(fArr6[16]);
                                            } else {
                                                liveHdrMetadata.m5031e(fArr6[15]);
                                            }
                                        }
                                        aeModeResultArr = new AeModeResult[]{aeModeResult115, aeModeResult116};
                                        long j9 = aeResults.f8224a;
                                        jArr = new long[2];
                                        while (i8 < 2) {
                                            jArr[i8] = AeModeResult.m4877a(aeModeResultArr[i8]);
                                        }
                                        GcamModuleJNI.AeResults_mode_result_set(j9, aeResults, jArr);
                                    }
                                    str4 = "smask";
                                    if (ivw.f32425k != null) {
                                        bArr = (byte[]) kppVar.mo9517d(ivw.f32425k);
                                        if (bArr != null) {
                                            frameMetadata = frameMetadata;
                                            i5 = 0;
                                        } else {
                                            frameMetadata = frameMetadata;
                                            i5 = 0;
                                        }
                                    } else {
                                        frameMetadata = frameMetadata;
                                        i5 = 0;
                                    }
                                    frameMetadata = frameMetadata;
                                    GcamModuleJNI.FrameMetadata_live_hdr_set(frameMetadata.f8263a, frameMetadata, liveHdrMetadata.f8311a, liveHdrMetadata);
                                    GcamModuleJNI.FrameMetadata_ae_results_set(frameMetadata.f8263a, frameMetadata, AeResults.m4881b(aeResults), aeResults);
                                    str5 = "3a";
                                    iIntValue2 = ((Integer) kppVar.mo9517d(CaptureResult.CONTROL_MODE)).intValue();
                                    nrf[] nrfVarArr10 = nrf.f44179g;
                                    if (iIntValue2 < 6) {
                                        i6 = 0;
                                        while (true) {
                                            nrfVarArr = nrf.f44179g;
                                            if (i6 >= 6) {
                                                throw new IllegalArgumentException(str2 + nrf.class.toString() + str9 + iIntValue2);
                                            }
                                            nrfVar2 = nrfVarArr[i6];
                                            if (nrfVar2.f44180h == iIntValue2) {
                                                nrfVar = nrfVar2;
                                            } else {
                                                i6++;
                                            }
                                        }
                                    } else {
                                        i6 = 0;
                                        while (true) {
                                            nrfVarArr = nrf.f44179g;
                                            if (i6 >= 6) {
                                                throw new IllegalArgumentException(str2 + nrf.class.toString() + str9 + iIntValue2);
                                            }
                                            nrfVar2 = nrfVarArr[i6];
                                            if (nrfVar2.f44180h == iIntValue2) {
                                                nrfVar = nrfVar2;
                                            } else {
                                                i6++;
                                            }
                                        }
                                    }
                                    GcamModuleJNI.FrameMetadata_control_mode_set(frameMetadata.f8263a, frameMetadata, nrfVar.f44180h);
                                    aeMetadataM4954d = frameMetadata.m4954d();
                                    GcamModuleJNI.AeMetadata_mode_set(aeMetadataM4954d.f8221a, aeMetadataM4954d, nqx.m17628a(((Integer) kppVar.mo9517d(CaptureResult.CONTROL_AE_MODE)).intValue()).f44108h);
                                    GcamModuleJNI.AeMetadata_lock_set(aeMetadataM4954d.f8221a, aeMetadataM4954d, ((Boolean) kppVar.mo9517d(CaptureResult.CONTROL_AE_LOCK)).booleanValue());
                                    iIntValue3 = ((Integer) kppVar.mo9517d(CaptureResult.CONTROL_AE_STATE)).intValue();
                                    nqy[] nqyVarArr11 = nqy.f44117h;
                                    if (iIntValue3 < 7) {
                                        i7 = 0;
                                        while (true) {
                                            nqyVarArr = nqy.f44117h;
                                            if (i7 >= 7) {
                                                String str117 = str9;
                                                throw new IllegalArgumentException(str2 + nqy.class.toString() + str117 + iIntValue3);
                                            }
                                            nqyVar2 = nqyVarArr[i7];
                                            if (nqyVar2.f44118i == iIntValue3) {
                                                nqyVar = nqyVar2;
                                            } else {
                                                i7++;
                                            }
                                        }
                                    } else {
                                        i7 = 0;
                                        while (true) {
                                            nqyVarArr = nqy.f44117h;
                                            if (i7 >= 7) {
                                                String str118 = str9;
                                                throw new IllegalArgumentException(str2 + nqy.class.toString() + str118 + iIntValue3);
                                            }
                                            nqyVar2 = nqyVarArr[i7];
                                            if (nqyVar2.f44118i == iIntValue3) {
                                                nqyVar = nqyVar2;
                                            } else {
                                                i7++;
                                            }
                                        }
                                    }
                                    GcamModuleJNI.AeMetadata_state_set(aeMetadataM4954d.f8221a, aeMetadataM4954d, nqyVar.f44118i);
                                    num2 = (Integer) kppVar.mo9517d(CaptureResult.CONTROL_AE_PRECAPTURE_TRIGGER);
                                    if (num2 != null) {
                                        GcamModuleJNI.AeMetadata_precapture_trigger_set(aeMetadataM4954d.f8221a, aeMetadataM4954d, num2.intValue());
                                    }
                                    GcamModuleJNI.AeMetadata_exposure_compensation_set(aeMetadataM4954d.f8221a, aeMetadataM4954d, m17678a(((Integer) kppVar.mo9517d(CaptureResult.CONTROL_AE_EXPOSURE_COMPENSATION)).intValue()));
                                    AwbMetadata awbMetadataM4956f12 = frameMetadata.m4956f();
                                    GcamModuleJNI.AwbMetadata_mode_set(awbMetadataM4956f12.f8231a, awbMetadataM4956f12, ((Integer) kppVar.mo9517d(CaptureResult.CONTROL_AWB_MODE)).intValue());
                                    GcamModuleJNI.AwbMetadata_lock_set(awbMetadataM4956f12.f8231a, awbMetadataM4956f12, ((Boolean) kppVar.mo9517d(CaptureResult.CONTROL_AWB_LOCK)).booleanValue());
                                    GcamModuleJNI.AwbMetadata_state_set(awbMetadataM4956f12.f8231a, awbMetadataM4956f12, ((Integer) kppVar.mo9517d(CaptureResult.CONTROL_AWB_STATE)).intValue());
                                    AfMetadata afMetadataM4955e12 = frameMetadata.m4955e();
                                    afMetadataM4955e12.m4896b(nra.m17629a(((Integer) kppVar.mo9517d(CaptureResult.CONTROL_AF_MODE)).intValue()));
                                    afMetadataM4955e12.m4897c(nrb.m17630a(((Integer) kppVar.mo9517d(CaptureResult.CONTROL_AF_STATE)).intValue()));
                                    afMetadataM4955e12.m4898d(((Integer) kppVar.mo9517d(CaptureResult.CONTROL_AF_TRIGGER)).intValue());
                                    num3 = (Integer) kppVar.mo9517d(CaptureResult.LENS_STATE);
                                    if (num3 != null) {
                                        iIntValue4 = num3.intValue();
                                        nrr[] nrrVarArr12 = nrr.f44283d;
                                        if (iIntValue4 < 3) {
                                            while (true) {
                                                nrrVarArr = nrr.f44283d;
                                                if (i5 < 3) {
                                                    throw new IllegalArgumentException(str2 + nrr.class.toString() + str9 + iIntValue4);
                                                }
                                                nrrVar = nrrVarArr[i5];
                                                if (nrrVar.f44284e == iIntValue4) {
                                                    i5++;
                                                }
                                            }
                                            GcamModuleJNI.FrameMetadata_lens_state_set(frameMetadata.f8263a, frameMetadata, nrrVar.f44284e);
                                            str4 = "bgstats";
                                            key4 = ivt.f32366t;
                                            if (key4 != null) {
                                                bArr2 = (byte[]) kppVar.mo9517d(key4);
                                                if (bArr2 != null) {
                                                    ByteBuffer byteBufferOrder1111 = ByteBuffer.allocateDirect(bArr2.length).order(ByteOrder.nativeOrder());
                                                    byteBufferOrder1111.put(bArr2);
                                                    IspAwbMetadata ispAwbMetadata1111 = new IspAwbMetadata(GcamModuleJNI.DeserializeFromBytes(nsd.m17642a(new nsd(BufferUtils.m4902a(byteBufferOrder1111))), byteBufferOrder1111.capacity()));
                                                    GcamModuleJNI.FrameMetadata_isp_metadata_set(frameMetadata.f8263a, frameMetadata, ispAwbMetadata1111.f8306a, ispAwbMetadata1111);
                                                }
                                                if (frameMetadata.m4960j() != nse.f44367f) {
                                                    GcamModuleJNI.ApplySensorBinning__SWIG_0(2, true, false, FrameMetadata.m4951b(frameMetadata), frameMetadata);
                                                } else {
                                                    GcamModuleJNI.ApplySensorBinning__SWIG_0(2, true, false, FrameMetadata.m4951b(frameMetadata), frameMetadata);
                                                }
                                                str5 = "halaf";
                                                bArrM17661I = m17661I(ivx.f32439b, kppVar);
                                                if (bArrM17661I != null) {
                                                    ntw.m17717c(bArrM17661I, frameMetadata.m4958h());
                                                }
                                                bArrM17661I2 = m17661I(ivx.f32438a, kppVar);
                                                if (bArrM17661I2 != null) {
                                                    HalAfMetadata halAfMetadataM4958h1111111 = frameMetadata.m4958h();
                                                    Pair pairM17716b1111111 = ntw.m17716b(bArrM17661I2);
                                                    GcamModuleJNI.HalAfMetadata_SetAfTargetFocusInfoFromBytes(halAfMetadataM4958h1111111.f8287a, halAfMetadataM4958h1111111, nsd.m17642a(new nsd(((Long) pairM17716b1111111.second).longValue())), ((ByteBuffer) pairM17716b1111111.first).capacity());
                                                }
                                            } else {
                                                if (frameMetadata.m4960j() != nse.f44367f) {
                                                    GcamModuleJNI.ApplySensorBinning__SWIG_0(2, true, false, FrameMetadata.m4951b(frameMetadata), frameMetadata);
                                                } else {
                                                    GcamModuleJNI.ApplySensorBinning__SWIG_0(2, true, false, FrameMetadata.m4951b(frameMetadata), frameMetadata);
                                                }
                                                str5 = "halaf";
                                                bArrM17661I = m17661I(ivx.f32439b, kppVar);
                                                if (bArrM17661I != null) {
                                                    ntw.m17717c(bArrM17661I, frameMetadata.m4958h());
                                                }
                                                bArrM17661I2 = m17661I(ivx.f32438a, kppVar);
                                                if (bArrM17661I2 != null) {
                                                    HalAfMetadata halAfMetadataM4958h1111112 = frameMetadata.m4958h();
                                                    Pair pairM17716b1111112 = ntw.m17716b(bArrM17661I2);
                                                    GcamModuleJNI.HalAfMetadata_SetAfTargetFocusInfoFromBytes(halAfMetadataM4958h1111112.f8287a, halAfMetadataM4958h1111112, nsd.m17642a(new nsd(((Long) pairM17716b1111112.second).longValue())), ((ByteBuffer) pairM17716b1111112.first).capacity());
                                                }
                                            }
                                        } else {
                                            while (true) {
                                                nrrVarArr = nrr.f44283d;
                                                if (i5 < 3) {
                                                    throw new IllegalArgumentException(str2 + nrr.class.toString() + str9 + iIntValue4);
                                                }
                                                nrrVar = nrrVarArr[i5];
                                                if (nrrVar.f44284e == iIntValue4) {
                                                    i5++;
                                                }
                                            }
                                            GcamModuleJNI.FrameMetadata_lens_state_set(frameMetadata.f8263a, frameMetadata, nrrVar.f44284e);
                                            str4 = "bgstats";
                                            key4 = ivt.f32366t;
                                            if (key4 != null) {
                                                bArr2 = (byte[]) kppVar.mo9517d(key4);
                                                if (bArr2 != null) {
                                                    ByteBuffer byteBufferOrder1112 = ByteBuffer.allocateDirect(bArr2.length).order(ByteOrder.nativeOrder());
                                                    byteBufferOrder1112.put(bArr2);
                                                    IspAwbMetadata ispAwbMetadata1112 = new IspAwbMetadata(GcamModuleJNI.DeserializeFromBytes(nsd.m17642a(new nsd(BufferUtils.m4902a(byteBufferOrder1112))), byteBufferOrder1112.capacity()));
                                                    GcamModuleJNI.FrameMetadata_isp_metadata_set(frameMetadata.f8263a, frameMetadata, ispAwbMetadata1112.f8306a, ispAwbMetadata1112);
                                                }
                                                if (frameMetadata.m4960j() != nse.f44367f) {
                                                    GcamModuleJNI.ApplySensorBinning__SWIG_0(2, true, false, FrameMetadata.m4951b(frameMetadata), frameMetadata);
                                                } else {
                                                    GcamModuleJNI.ApplySensorBinning__SWIG_0(2, true, false, FrameMetadata.m4951b(frameMetadata), frameMetadata);
                                                }
                                                str5 = "halaf";
                                                bArrM17661I = m17661I(ivx.f32439b, kppVar);
                                                if (bArrM17661I != null) {
                                                    ntw.m17717c(bArrM17661I, frameMetadata.m4958h());
                                                }
                                                bArrM17661I2 = m17661I(ivx.f32438a, kppVar);
                                                if (bArrM17661I2 != null) {
                                                    HalAfMetadata halAfMetadataM4958h1111113 = frameMetadata.m4958h();
                                                    Pair pairM17716b1111113 = ntw.m17716b(bArrM17661I2);
                                                    GcamModuleJNI.HalAfMetadata_SetAfTargetFocusInfoFromBytes(halAfMetadataM4958h1111113.f8287a, halAfMetadataM4958h1111113, nsd.m17642a(new nsd(((Long) pairM17716b1111113.second).longValue())), ((ByteBuffer) pairM17716b1111113.first).capacity());
                                                }
                                            } else {
                                                if (frameMetadata.m4960j() != nse.f44367f) {
                                                    GcamModuleJNI.ApplySensorBinning__SWIG_0(2, true, false, FrameMetadata.m4951b(frameMetadata), frameMetadata);
                                                } else {
                                                    GcamModuleJNI.ApplySensorBinning__SWIG_0(2, true, false, FrameMetadata.m4951b(frameMetadata), frameMetadata);
                                                }
                                                str5 = "halaf";
                                                bArrM17661I = m17661I(ivx.f32439b, kppVar);
                                                if (bArrM17661I != null) {
                                                    ntw.m17717c(bArrM17661I, frameMetadata.m4958h());
                                                }
                                                bArrM17661I2 = m17661I(ivx.f32438a, kppVar);
                                                if (bArrM17661I2 != null) {
                                                    HalAfMetadata halAfMetadataM4958h1111114 = frameMetadata.m4958h();
                                                    Pair pairM17716b1111114 = ntw.m17716b(bArrM17661I2);
                                                    GcamModuleJNI.HalAfMetadata_SetAfTargetFocusInfoFromBytes(halAfMetadataM4958h1111114.f8287a, halAfMetadataM4958h1111114, nsd.m17642a(new nsd(((Long) pairM17716b1111114.second).longValue())), ((ByteBuffer) pairM17716b1111114.first).capacity());
                                                }
                                            }
                                        }
                                    } else {
                                        str4 = "bgstats";
                                        key4 = ivt.f32366t;
                                        if (key4 != null) {
                                            bArr2 = (byte[]) kppVar.mo9517d(key4);
                                            if (bArr2 != null) {
                                                ByteBuffer byteBufferOrder1113 = ByteBuffer.allocateDirect(bArr2.length).order(ByteOrder.nativeOrder());
                                                byteBufferOrder1113.put(bArr2);
                                                IspAwbMetadata ispAwbMetadata1113 = new IspAwbMetadata(GcamModuleJNI.DeserializeFromBytes(nsd.m17642a(new nsd(BufferUtils.m4902a(byteBufferOrder1113))), byteBufferOrder1113.capacity()));
                                                GcamModuleJNI.FrameMetadata_isp_metadata_set(frameMetadata.f8263a, frameMetadata, ispAwbMetadata1113.f8306a, ispAwbMetadata1113);
                                            }
                                            if (frameMetadata.m4960j() != nse.f44367f) {
                                                GcamModuleJNI.ApplySensorBinning__SWIG_0(2, true, false, FrameMetadata.m4951b(frameMetadata), frameMetadata);
                                            } else {
                                                GcamModuleJNI.ApplySensorBinning__SWIG_0(2, true, false, FrameMetadata.m4951b(frameMetadata), frameMetadata);
                                            }
                                            str5 = "halaf";
                                            bArrM17661I = m17661I(ivx.f32439b, kppVar);
                                            if (bArrM17661I != null) {
                                                ntw.m17717c(bArrM17661I, frameMetadata.m4958h());
                                            }
                                            bArrM17661I2 = m17661I(ivx.f32438a, kppVar);
                                            if (bArrM17661I2 != null) {
                                                HalAfMetadata halAfMetadataM4958h1111115 = frameMetadata.m4958h();
                                                Pair pairM17716b1111115 = ntw.m17716b(bArrM17661I2);
                                                GcamModuleJNI.HalAfMetadata_SetAfTargetFocusInfoFromBytes(halAfMetadataM4958h1111115.f8287a, halAfMetadataM4958h1111115, nsd.m17642a(new nsd(((Long) pairM17716b1111115.second).longValue())), ((ByteBuffer) pairM17716b1111115.first).capacity());
                                            }
                                        } else {
                                            if (frameMetadata.m4960j() != nse.f44367f) {
                                                GcamModuleJNI.ApplySensorBinning__SWIG_0(2, true, false, FrameMetadata.m4951b(frameMetadata), frameMetadata);
                                            } else {
                                                GcamModuleJNI.ApplySensorBinning__SWIG_0(2, true, false, FrameMetadata.m4951b(frameMetadata), frameMetadata);
                                            }
                                            str5 = "halaf";
                                            bArrM17661I = m17661I(ivx.f32439b, kppVar);
                                            if (bArrM17661I != null) {
                                                ntw.m17717c(bArrM17661I, frameMetadata.m4958h());
                                            }
                                            bArrM17661I2 = m17661I(ivx.f32438a, kppVar);
                                            if (bArrM17661I2 != null) {
                                                HalAfMetadata halAfMetadataM4958h1111116 = frameMetadata.m4958h();
                                                Pair pairM17716b1111116 = ntw.m17716b(bArrM17661I2);
                                                GcamModuleJNI.HalAfMetadata_SetAfTargetFocusInfoFromBytes(halAfMetadataM4958h1111116.f8287a, halAfMetadataM4958h1111116, nsd.m17642a(new nsd(((Long) pairM17716b1111116.second).longValue())), ((ByteBuffer) pairM17716b1111116.first).capacity());
                                            }
                                        }
                                    }
                                } else {
                                    GcamModuleJNI.FrameMetadata_was_black_level_locked_set(frameMetadata.f8263a, frameMetadata, bool.booleanValue());
                                    GcamModuleJNI.FrameMetadata_frame_duration_ms_set(frameMetadata.f8263a, frameMetadata, m17675x(((Long) kppVar.mo9517d(CaptureResult.SENSOR_FRAME_DURATION)).longValue()));
                                    GcamModuleJNI.FrameMetadata_timestamp_ns_set(frameMetadata.f8263a, frameMetadata, ((Long) kppVar.mo9517d(CaptureResult.SENSOR_TIMESTAMP)).longValue());
                                    GcamModuleJNI.FrameMetadata_sensor_temp_set(frameMetadata.f8263a, frameMetadata, GcamModuleJNI.kSensorTempUnknown_get());
                                    SceneFlicker sceneFlicker10 = new SceneFlicker();
                                    key = ivv.f32398g;
                                    fIntValue = -1.0f;
                                    if (key != null) {
                                        fIntValue2 = -1.0f;
                                    } else {
                                        fIntValue2 = -1.0f;
                                    }
                                    key2 = ivv.f32399h;
                                    if (key2 != null) {
                                        fIntValue = num4.intValue() / 10000.0f;
                                    }
                                    if (fIntValue2 >= 0.0f) {
                                        switch (num.intValue()) {
                                            case 0:
                                                fIntValue2 = 0.0f;
                                                fIntValue = 1.0f;
                                                break;
                                            case 1:
                                                fIntValue2 = 100.0f;
                                                fIntValue = 1.0f;
                                                break;
                                            case 2:
                                                fIntValue2 = 120.0f;
                                                fIntValue = 1.0f;
                                                break;
                                            default:
                                                Log.e(f44463a, BEeWZPor.BZKQtFscIANQJ);
                                                break;
                                        }
                                    } else {
                                        switch (num.intValue()) {
                                            case 0:
                                                fIntValue2 = 0.0f;
                                                fIntValue = 1.0f;
                                                break;
                                            case 1:
                                                fIntValue2 = 100.0f;
                                                fIntValue = 1.0f;
                                                break;
                                            case 2:
                                                fIntValue2 = 120.0f;
                                                fIntValue = 1.0f;
                                                break;
                                            default:
                                                Log.e(f44463a, BEeWZPor.BZKQtFscIANQJ);
                                                break;
                                        }
                                    }
                                    GcamModuleJNI.SceneFlicker_frequency_set(sceneFlicker10.f8352a, sceneFlicker10, fIntValue2);
                                    GcamModuleJNI.SceneFlicker_confidence_set(sceneFlicker10.f8352a, sceneFlicker10, fIntValue);
                                    GcamModuleJNI.FrameMetadata_scene_flicker_set(frameMetadata.f8263a, frameMetadata, sceneFlicker10.f8352a, sceneFlicker10);
                                    str3 = "noise";
                                    pairArr = (Pair[]) kppVar.mo9517d(CaptureResult.SENSOR_NOISE_PROFILE);
                                    floatVector = new FloatVector();
                                    floatVector2 = new FloatVector();
                                    while (i3 < i2) {
                                        floatVector.m4949b(((Double) pairArr[i3].first).floatValue());
                                        floatVector2.m4949b(((Double) pairArr[i3].second).floatValue());
                                    }
                                    NoiseModel noiseModel10 = new NoiseModel(GcamModuleJNI.NoiseModel_FromShotReadNoiseVector(floatVector.f8261a, floatVector, floatVector2.f8261a, floatVector2));
                                    GcamModuleJNI.FrameMetadata_dng_noise_model_bayer_set(frameMetadata.f8263a, frameMetadata, noiseModel10.f8320a, noiseModel10);
                                    str5 = "dynamicbl";
                                    fArr5 = (float[]) kppVar.mo9517d(CaptureResult.SENSOR_DYNAMIC_BLACK_LEVEL);
                                    if (fArr5 != null) {
                                        floatArray5 = new FloatArray4();
                                        while (i9 < floatArray5.m4942b()) {
                                            floatArray5.m4944d(i9, fArr5[i9]);
                                        }
                                        frameMetadata.m4962l(floatArray5);
                                    } else {
                                        blackLevelPattern = (BlackLevelPattern) kmdVarM17682f.mo14559l(CameraCharacteristics.SENSOR_BLACK_LEVEL_PATTERN);
                                        if (blackLevelPattern != null) {
                                            floatArray4 = new FloatArray4();
                                            while (i4 < floatArray4.m4942b()) {
                                                floatArray4.m4944d(i4, blackLevelPattern.getOffsetForIndex(i4 % 2, i4 / 2));
                                            }
                                            frameMetadata.m4962l(floatArray4);
                                        }
                                    }
                                    f = (Float) kppVar.mo9517d(CaptureResult.LENS_FOCUS_DISTANCE);
                                    Integer num17 = (Integer) kmdVarM17682f.mo14559l(CameraCharacteristics.LENS_INFO_FOCUS_DISTANCE_CALIBRATION);
                                    if (f != null) {
                                        GcamModuleJNI.FrameMetadata_focus_distance_diopters_set(frameMetadata.f8263a, frameMetadata, f.floatValue());
                                    }
                                    liveHdrMetadata = new LiveHdrMetadata(GcamModuleJNI.new_LiveHdrMetadata(), true);
                                    aeResults = new AeResults(GcamModuleJNI.new_AeResults(), true);
                                    if (ivu.f32375c != null) {
                                        GcamModuleJNI.LiveHdrMetadata_max_hdr_ratio_override_set(liveHdrMetadata.f8311a, liveHdrMetadata, fArr7[0]);
                                        liveHdrMetadata.m5029c(fArr7[1]);
                                        liveHdrMetadata.m5028b(fArr7[2]);
                                        if (!f44464b.f36770c) {
                                            GcamModuleJNI.LiveHdrMetadata_night_factor_set(liveHdrMetadata.f8311a, liveHdrMetadata, fArr7[3]);
                                        }
                                        GcamModuleJNI.LiveHdrMetadata_manual_ec_short_set(liveHdrMetadata.f8311a, liveHdrMetadata, fArr7[i2]);
                                        GcamModuleJNI.LiveHdrMetadata_manual_portrait_tet_override_set(liveHdrMetadata.f8311a, liveHdrMetadata, fArr7[5]);
                                    }
                                    str5 = "gcamae";
                                    key3 = ivu.f32373a;
                                    if (key3 != null) {
                                        AeModeResult aeModeResult118 = new AeModeResult();
                                        AeModeResult aeModeResult119 = new AeModeResult();
                                        aeModeResult118.m4880d(fArr6[0]);
                                        aeModeResult119.m4880d(fArr6[1]);
                                        aeModeResult118.m4879c(fArr6[2]);
                                        aeModeResult119.m4879c(fArr6[3]);
                                        GcamModuleJNI.AeResults_pure_fraction_of_pixels_from_long_exposure_set(aeResults.f8224a, aeResults, fArr6[i2]);
                                        GcamModuleJNI.AeResults_weighted_fraction_of_pixels_from_long_exposure_set(aeResults.f8224a, aeResults, fArr6[5]);
                                        GcamModuleJNI.AeModeResult_log_scene_brightness_set(aeModeResult118.f8222a, aeModeResult118, fArr6[6]);
                                        GcamModuleJNI.AeResults_predicted_image_brightness_set(aeResults.f8224a, aeResults, fArr6[7]);
                                        GcamModuleJNI.LiveHdrMetadata_motion_magnitude_pix_set(liveHdrMetadata.f8311a, liveHdrMetadata, fArr6[8]);
                                        GcamModuleJNI.LiveHdrMetadata_metering_interval_ms_set(liveHdrMetadata.f8311a, liveHdrMetadata, fArr6[9]);
                                        GcamModuleJNI.LiveHdrMetadata_filtered_motion_speed_pix_per_ms_set(liveHdrMetadata.f8311a, liveHdrMetadata, fArr6[10]);
                                        liveHdrMetadata.m5032f(fArr6[11]);
                                        liveHdrMetadata.m5030d(fArr6[12]);
                                        if (length2 > 13) {
                                            GcamModuleJNI.AeResults_safe_underexposure_set(aeResults.f8224a, aeResults, fArr6[13]);
                                        }
                                        if (length2 > 15) {
                                            AeModeResult aeModeResult1110 = new AeModeResult();
                                            aeModeResult1110.m4880d(fArr6[14]);
                                            aeModeResult1110.m4879c(fArr6[15]);
                                            GcamModuleJNI.AeResults_portrait_result_set(aeResults.f8224a, aeResults, AeModeResult.m4877a(aeModeResult1110), aeModeResult1110);
                                            if (length2 > 16) {
                                                liveHdrMetadata.m5031e(fArr6[16]);
                                            } else {
                                                liveHdrMetadata.m5031e(fArr6[15]);
                                            }
                                        }
                                        aeModeResultArr = new AeModeResult[]{aeModeResult118, aeModeResult119};
                                        long j10 = aeResults.f8224a;
                                        jArr = new long[2];
                                        while (i8 < 2) {
                                            jArr[i8] = AeModeResult.m4877a(aeModeResultArr[i8]);
                                        }
                                        GcamModuleJNI.AeResults_mode_result_set(j10, aeResults, jArr);
                                    }
                                    str4 = "smask";
                                    if (ivw.f32425k != null) {
                                        bArr = (byte[]) kppVar.mo9517d(ivw.f32425k);
                                        if (bArr != null) {
                                            frameMetadata = frameMetadata;
                                            i5 = 0;
                                        } else {
                                            frameMetadata = frameMetadata;
                                            i5 = 0;
                                        }
                                    } else {
                                        frameMetadata = frameMetadata;
                                        i5 = 0;
                                    }
                                    frameMetadata = frameMetadata;
                                    GcamModuleJNI.FrameMetadata_live_hdr_set(frameMetadata.f8263a, frameMetadata, liveHdrMetadata.f8311a, liveHdrMetadata);
                                    GcamModuleJNI.FrameMetadata_ae_results_set(frameMetadata.f8263a, frameMetadata, AeResults.m4881b(aeResults), aeResults);
                                    str5 = "3a";
                                    iIntValue2 = ((Integer) kppVar.mo9517d(CaptureResult.CONTROL_MODE)).intValue();
                                    nrf[] nrfVarArr11 = nrf.f44179g;
                                    if (iIntValue2 < 6) {
                                        i6 = 0;
                                        while (true) {
                                            nrfVarArr = nrf.f44179g;
                                            if (i6 >= 6) {
                                                throw new IllegalArgumentException(str2 + nrf.class.toString() + str9 + iIntValue2);
                                            }
                                            nrfVar2 = nrfVarArr[i6];
                                            if (nrfVar2.f44180h == iIntValue2) {
                                                nrfVar = nrfVar2;
                                            } else {
                                                i6++;
                                            }
                                        }
                                    } else {
                                        i6 = 0;
                                        while (true) {
                                            nrfVarArr = nrf.f44179g;
                                            if (i6 >= 6) {
                                                throw new IllegalArgumentException(str2 + nrf.class.toString() + str9 + iIntValue2);
                                            }
                                            nrfVar2 = nrfVarArr[i6];
                                            if (nrfVar2.f44180h == iIntValue2) {
                                                nrfVar = nrfVar2;
                                            } else {
                                                i6++;
                                            }
                                        }
                                    }
                                    GcamModuleJNI.FrameMetadata_control_mode_set(frameMetadata.f8263a, frameMetadata, nrfVar.f44180h);
                                    aeMetadataM4954d = frameMetadata.m4954d();
                                    GcamModuleJNI.AeMetadata_mode_set(aeMetadataM4954d.f8221a, aeMetadataM4954d, nqx.m17628a(((Integer) kppVar.mo9517d(CaptureResult.CONTROL_AE_MODE)).intValue()).f44108h);
                                    GcamModuleJNI.AeMetadata_lock_set(aeMetadataM4954d.f8221a, aeMetadataM4954d, ((Boolean) kppVar.mo9517d(CaptureResult.CONTROL_AE_LOCK)).booleanValue());
                                    iIntValue3 = ((Integer) kppVar.mo9517d(CaptureResult.CONTROL_AE_STATE)).intValue();
                                    nqy[] nqyVarArr12 = nqy.f44117h;
                                    if (iIntValue3 < 7) {
                                        i7 = 0;
                                        while (true) {
                                            nqyVarArr = nqy.f44117h;
                                            if (i7 >= 7) {
                                                String str119 = str9;
                                                throw new IllegalArgumentException(str2 + nqy.class.toString() + str119 + iIntValue3);
                                            }
                                            nqyVar2 = nqyVarArr[i7];
                                            if (nqyVar2.f44118i == iIntValue3) {
                                                nqyVar = nqyVar2;
                                            } else {
                                                i7++;
                                            }
                                        }
                                    } else {
                                        i7 = 0;
                                        while (true) {
                                            nqyVarArr = nqy.f44117h;
                                            if (i7 >= 7) {
                                                String str1110 = str9;
                                                throw new IllegalArgumentException(str2 + nqy.class.toString() + str1110 + iIntValue3);
                                            }
                                            nqyVar2 = nqyVarArr[i7];
                                            if (nqyVar2.f44118i == iIntValue3) {
                                                nqyVar = nqyVar2;
                                            } else {
                                                i7++;
                                            }
                                        }
                                    }
                                    GcamModuleJNI.AeMetadata_state_set(aeMetadataM4954d.f8221a, aeMetadataM4954d, nqyVar.f44118i);
                                    num2 = (Integer) kppVar.mo9517d(CaptureResult.CONTROL_AE_PRECAPTURE_TRIGGER);
                                    if (num2 != null) {
                                        GcamModuleJNI.AeMetadata_precapture_trigger_set(aeMetadataM4954d.f8221a, aeMetadataM4954d, num2.intValue());
                                    }
                                    GcamModuleJNI.AeMetadata_exposure_compensation_set(aeMetadataM4954d.f8221a, aeMetadataM4954d, m17678a(((Integer) kppVar.mo9517d(CaptureResult.CONTROL_AE_EXPOSURE_COMPENSATION)).intValue()));
                                    AwbMetadata awbMetadataM4956f13 = frameMetadata.m4956f();
                                    GcamModuleJNI.AwbMetadata_mode_set(awbMetadataM4956f13.f8231a, awbMetadataM4956f13, ((Integer) kppVar.mo9517d(CaptureResult.CONTROL_AWB_MODE)).intValue());
                                    GcamModuleJNI.AwbMetadata_lock_set(awbMetadataM4956f13.f8231a, awbMetadataM4956f13, ((Boolean) kppVar.mo9517d(CaptureResult.CONTROL_AWB_LOCK)).booleanValue());
                                    GcamModuleJNI.AwbMetadata_state_set(awbMetadataM4956f13.f8231a, awbMetadataM4956f13, ((Integer) kppVar.mo9517d(CaptureResult.CONTROL_AWB_STATE)).intValue());
                                    AfMetadata afMetadataM4955e13 = frameMetadata.m4955e();
                                    afMetadataM4955e13.m4896b(nra.m17629a(((Integer) kppVar.mo9517d(CaptureResult.CONTROL_AF_MODE)).intValue()));
                                    afMetadataM4955e13.m4897c(nrb.m17630a(((Integer) kppVar.mo9517d(CaptureResult.CONTROL_AF_STATE)).intValue()));
                                    afMetadataM4955e13.m4898d(((Integer) kppVar.mo9517d(CaptureResult.CONTROL_AF_TRIGGER)).intValue());
                                    num3 = (Integer) kppVar.mo9517d(CaptureResult.LENS_STATE);
                                    if (num3 != null) {
                                        iIntValue4 = num3.intValue();
                                        nrr[] nrrVarArr13 = nrr.f44283d;
                                        if (iIntValue4 < 3) {
                                            while (true) {
                                                nrrVarArr = nrr.f44283d;
                                                if (i5 < 3) {
                                                    throw new IllegalArgumentException(str2 + nrr.class.toString() + str9 + iIntValue4);
                                                }
                                                nrrVar = nrrVarArr[i5];
                                                if (nrrVar.f44284e == iIntValue4) {
                                                    i5++;
                                                }
                                            }
                                            GcamModuleJNI.FrameMetadata_lens_state_set(frameMetadata.f8263a, frameMetadata, nrrVar.f44284e);
                                            str4 = "bgstats";
                                            key4 = ivt.f32366t;
                                            if (key4 != null) {
                                                bArr2 = (byte[]) kppVar.mo9517d(key4);
                                                if (bArr2 != null) {
                                                    ByteBuffer byteBufferOrder1114 = ByteBuffer.allocateDirect(bArr2.length).order(ByteOrder.nativeOrder());
                                                    byteBufferOrder1114.put(bArr2);
                                                    IspAwbMetadata ispAwbMetadata1114 = new IspAwbMetadata(GcamModuleJNI.DeserializeFromBytes(nsd.m17642a(new nsd(BufferUtils.m4902a(byteBufferOrder1114))), byteBufferOrder1114.capacity()));
                                                    GcamModuleJNI.FrameMetadata_isp_metadata_set(frameMetadata.f8263a, frameMetadata, ispAwbMetadata1114.f8306a, ispAwbMetadata1114);
                                                }
                                                if (frameMetadata.m4960j() != nse.f44367f) {
                                                    GcamModuleJNI.ApplySensorBinning__SWIG_0(2, true, false, FrameMetadata.m4951b(frameMetadata), frameMetadata);
                                                } else {
                                                    GcamModuleJNI.ApplySensorBinning__SWIG_0(2, true, false, FrameMetadata.m4951b(frameMetadata), frameMetadata);
                                                }
                                                str5 = "halaf";
                                                bArrM17661I = m17661I(ivx.f32439b, kppVar);
                                                if (bArrM17661I != null) {
                                                    ntw.m17717c(bArrM17661I, frameMetadata.m4958h());
                                                }
                                                bArrM17661I2 = m17661I(ivx.f32438a, kppVar);
                                                if (bArrM17661I2 != null) {
                                                    HalAfMetadata halAfMetadataM4958h1111117 = frameMetadata.m4958h();
                                                    Pair pairM17716b1111117 = ntw.m17716b(bArrM17661I2);
                                                    GcamModuleJNI.HalAfMetadata_SetAfTargetFocusInfoFromBytes(halAfMetadataM4958h1111117.f8287a, halAfMetadataM4958h1111117, nsd.m17642a(new nsd(((Long) pairM17716b1111117.second).longValue())), ((ByteBuffer) pairM17716b1111117.first).capacity());
                                                }
                                            } else {
                                                if (frameMetadata.m4960j() != nse.f44367f) {
                                                    GcamModuleJNI.ApplySensorBinning__SWIG_0(2, true, false, FrameMetadata.m4951b(frameMetadata), frameMetadata);
                                                } else {
                                                    GcamModuleJNI.ApplySensorBinning__SWIG_0(2, true, false, FrameMetadata.m4951b(frameMetadata), frameMetadata);
                                                }
                                                str5 = "halaf";
                                                bArrM17661I = m17661I(ivx.f32439b, kppVar);
                                                if (bArrM17661I != null) {
                                                    ntw.m17717c(bArrM17661I, frameMetadata.m4958h());
                                                }
                                                bArrM17661I2 = m17661I(ivx.f32438a, kppVar);
                                                if (bArrM17661I2 != null) {
                                                    HalAfMetadata halAfMetadataM4958h1111118 = frameMetadata.m4958h();
                                                    Pair pairM17716b1111118 = ntw.m17716b(bArrM17661I2);
                                                    GcamModuleJNI.HalAfMetadata_SetAfTargetFocusInfoFromBytes(halAfMetadataM4958h1111118.f8287a, halAfMetadataM4958h1111118, nsd.m17642a(new nsd(((Long) pairM17716b1111118.second).longValue())), ((ByteBuffer) pairM17716b1111118.first).capacity());
                                                }
                                            }
                                        } else {
                                            while (true) {
                                                nrrVarArr = nrr.f44283d;
                                                if (i5 < 3) {
                                                    throw new IllegalArgumentException(str2 + nrr.class.toString() + str9 + iIntValue4);
                                                }
                                                nrrVar = nrrVarArr[i5];
                                                if (nrrVar.f44284e == iIntValue4) {
                                                    i5++;
                                                }
                                            }
                                            GcamModuleJNI.FrameMetadata_lens_state_set(frameMetadata.f8263a, frameMetadata, nrrVar.f44284e);
                                            str4 = "bgstats";
                                            key4 = ivt.f32366t;
                                            if (key4 != null) {
                                                bArr2 = (byte[]) kppVar.mo9517d(key4);
                                                if (bArr2 != null) {
                                                    ByteBuffer byteBufferOrder1115 = ByteBuffer.allocateDirect(bArr2.length).order(ByteOrder.nativeOrder());
                                                    byteBufferOrder1115.put(bArr2);
                                                    IspAwbMetadata ispAwbMetadata1115 = new IspAwbMetadata(GcamModuleJNI.DeserializeFromBytes(nsd.m17642a(new nsd(BufferUtils.m4902a(byteBufferOrder1115))), byteBufferOrder1115.capacity()));
                                                    GcamModuleJNI.FrameMetadata_isp_metadata_set(frameMetadata.f8263a, frameMetadata, ispAwbMetadata1115.f8306a, ispAwbMetadata1115);
                                                }
                                                if (frameMetadata.m4960j() != nse.f44367f) {
                                                    GcamModuleJNI.ApplySensorBinning__SWIG_0(2, true, false, FrameMetadata.m4951b(frameMetadata), frameMetadata);
                                                } else {
                                                    GcamModuleJNI.ApplySensorBinning__SWIG_0(2, true, false, FrameMetadata.m4951b(frameMetadata), frameMetadata);
                                                }
                                                str5 = "halaf";
                                                bArrM17661I = m17661I(ivx.f32439b, kppVar);
                                                if (bArrM17661I != null) {
                                                    ntw.m17717c(bArrM17661I, frameMetadata.m4958h());
                                                }
                                                bArrM17661I2 = m17661I(ivx.f32438a, kppVar);
                                                if (bArrM17661I2 != null) {
                                                    HalAfMetadata halAfMetadataM4958h1111119 = frameMetadata.m4958h();
                                                    Pair pairM17716b1111119 = ntw.m17716b(bArrM17661I2);
                                                    GcamModuleJNI.HalAfMetadata_SetAfTargetFocusInfoFromBytes(halAfMetadataM4958h1111119.f8287a, halAfMetadataM4958h1111119, nsd.m17642a(new nsd(((Long) pairM17716b1111119.second).longValue())), ((ByteBuffer) pairM17716b1111119.first).capacity());
                                                }
                                            } else {
                                                if (frameMetadata.m4960j() != nse.f44367f) {
                                                    GcamModuleJNI.ApplySensorBinning__SWIG_0(2, true, false, FrameMetadata.m4951b(frameMetadata), frameMetadata);
                                                } else {
                                                    GcamModuleJNI.ApplySensorBinning__SWIG_0(2, true, false, FrameMetadata.m4951b(frameMetadata), frameMetadata);
                                                }
                                                str5 = "halaf";
                                                bArrM17661I = m17661I(ivx.f32439b, kppVar);
                                                if (bArrM17661I != null) {
                                                    ntw.m17717c(bArrM17661I, frameMetadata.m4958h());
                                                }
                                                bArrM17661I2 = m17661I(ivx.f32438a, kppVar);
                                                if (bArrM17661I2 != null) {
                                                    HalAfMetadata halAfMetadataM4958h11111110 = frameMetadata.m4958h();
                                                    Pair pairM17716b11111110 = ntw.m17716b(bArrM17661I2);
                                                    GcamModuleJNI.HalAfMetadata_SetAfTargetFocusInfoFromBytes(halAfMetadataM4958h11111110.f8287a, halAfMetadataM4958h11111110, nsd.m17642a(new nsd(((Long) pairM17716b11111110.second).longValue())), ((ByteBuffer) pairM17716b11111110.first).capacity());
                                                }
                                            }
                                        }
                                    } else {
                                        str4 = "bgstats";
                                        key4 = ivt.f32366t;
                                        if (key4 != null) {
                                            bArr2 = (byte[]) kppVar.mo9517d(key4);
                                            if (bArr2 != null) {
                                                ByteBuffer byteBufferOrder1116 = ByteBuffer.allocateDirect(bArr2.length).order(ByteOrder.nativeOrder());
                                                byteBufferOrder1116.put(bArr2);
                                                IspAwbMetadata ispAwbMetadata1116 = new IspAwbMetadata(GcamModuleJNI.DeserializeFromBytes(nsd.m17642a(new nsd(BufferUtils.m4902a(byteBufferOrder1116))), byteBufferOrder1116.capacity()));
                                                GcamModuleJNI.FrameMetadata_isp_metadata_set(frameMetadata.f8263a, frameMetadata, ispAwbMetadata1116.f8306a, ispAwbMetadata1116);
                                            }
                                            if (frameMetadata.m4960j() != nse.f44367f) {
                                                GcamModuleJNI.ApplySensorBinning__SWIG_0(2, true, false, FrameMetadata.m4951b(frameMetadata), frameMetadata);
                                            } else {
                                                GcamModuleJNI.ApplySensorBinning__SWIG_0(2, true, false, FrameMetadata.m4951b(frameMetadata), frameMetadata);
                                            }
                                            str5 = "halaf";
                                            bArrM17661I = m17661I(ivx.f32439b, kppVar);
                                            if (bArrM17661I != null) {
                                                ntw.m17717c(bArrM17661I, frameMetadata.m4958h());
                                            }
                                            bArrM17661I2 = m17661I(ivx.f32438a, kppVar);
                                            if (bArrM17661I2 != null) {
                                                HalAfMetadata halAfMetadataM4958h11111111 = frameMetadata.m4958h();
                                                Pair pairM17716b11111111 = ntw.m17716b(bArrM17661I2);
                                                GcamModuleJNI.HalAfMetadata_SetAfTargetFocusInfoFromBytes(halAfMetadataM4958h11111111.f8287a, halAfMetadataM4958h11111111, nsd.m17642a(new nsd(((Long) pairM17716b11111111.second).longValue())), ((ByteBuffer) pairM17716b11111111.first).capacity());
                                            }
                                        } else {
                                            if (frameMetadata.m4960j() != nse.f44367f) {
                                                GcamModuleJNI.ApplySensorBinning__SWIG_0(2, true, false, FrameMetadata.m4951b(frameMetadata), frameMetadata);
                                            } else {
                                                GcamModuleJNI.ApplySensorBinning__SWIG_0(2, true, false, FrameMetadata.m4951b(frameMetadata), frameMetadata);
                                            }
                                            str5 = "halaf";
                                            bArrM17661I = m17661I(ivx.f32439b, kppVar);
                                            if (bArrM17661I != null) {
                                                ntw.m17717c(bArrM17661I, frameMetadata.m4958h());
                                            }
                                            bArrM17661I2 = m17661I(ivx.f32438a, kppVar);
                                            if (bArrM17661I2 != null) {
                                                HalAfMetadata halAfMetadataM4958h11111112 = frameMetadata.m4958h();
                                                Pair pairM17716b11111112 = ntw.m17716b(bArrM17661I2);
                                                GcamModuleJNI.HalAfMetadata_SetAfTargetFocusInfoFromBytes(halAfMetadataM4958h11111112.f8287a, halAfMetadataM4958h11111112, nsd.m17642a(new nsd(((Long) pairM17716b11111112.second).longValue())), ((ByteBuffer) pairM17716b11111112.first).capacity());
                                            }
                                        }
                                    }
                                }
                            }
                        } catch (RuntimeException e28) {
                            runtimeException = e28;
                        }
                    } catch (RuntimeException e29) {
                        e = e29;
                        runtimeException = e;
                        str5 = str;
                    }
                } catch (RuntimeException e30) {
                    e = e30;
                }
            } catch (RuntimeException e31) {
                e = e31;
                str = "physical2fm";
            }
        } catch (RuntimeException e32) {
            e = e32;
            frameMetadata = frameMetadata;
        }
        return frameMetadata;
    }

    /* JADX INFO: renamed from: k */
    public final FrameMetadataKey m17684k(kpp kppVar, kmg kmgVar) {
        Long l = (Long) kppVar.mo9517d(CaptureResult.SENSOR_TIMESTAMP);
        if (l == null) {
            return null;
        }
        return new FrameMetadataKey(l.longValue(), m17655C(m17682f(kppVar, kmgVar), this.f44466d, kppVar, kmgVar));
    }

    /* JADX INFO: renamed from: n */
    public final nse m17685n(kpp kppVar, kmg kmgVar) {
        return m17655C(this.f44465c, this.f44466d, kppVar, kmgVar);
    }

    /* JADX INFO: renamed from: o */
    public final SpatialGainMap m17686o(kpp kppVar) {
        LensShadingMap lensShadingMap = (LensShadingMap) kppVar.mo9517d(CaptureResult.STATISTICS_LENS_SHADING_CORRECTION_MAP);
        if (lensShadingMap == null) {
            int iIntValue = ((Integer) kppVar.mo9516c().mo9512a(CaptureRequest.STATISTICS_LENS_SHADING_MAP_MODE)).intValue();
            Log.w(f44463a, pIeXJQLZLfgIN.jFaFrwIpi + iIntValue);
            return new SpatialGainMap();
        }
        int columnCount = lensShadingMap.getColumnCount();
        int rowCount = lensShadingMap.getRowCount();
        SpatialGainMap spatialGainMap = new SpatialGainMap(GcamModuleJNI.new_SpatialGainMap__SWIG_2(columnCount, rowCount));
        int[] iArrM17671s = m17671s(((Integer) m17681e(kppVar).mo14561n(CameraCharacteristics.SENSOR_INFO_COLOR_FILTER_ARRANGEMENT)).intValue());
        for (int i = 0; i < 4; i++) {
            int i2 = iArrM17671s[i];
            for (int i3 = 0; i3 < rowCount; i3++) {
                for (int i4 = 0; i4 < columnCount; i4++) {
                    GcamModuleJNI.SpatialGainMap_WriteRggb(spatialGainMap.f8362a, spatialGainMap, i4, i3, i, lensShadingMap.getGainFactor(i2, i4, i3));
                }
            }
        }
        return spatialGainMap;
    }

    /* JADX INFO: renamed from: q */
    public final float[] m17687q(kpp kppVar) {
        float[] fArrM17662J = m17662J(m17681e(kppVar), kppVar);
        return new float[]{m17673v(kppVar), fArrM17662J[0], fArrM17662J[1]};
    }

    /* JADX INFO: renamed from: u */
    public final void m17688u(kmg kmgVar, AeShotParams aeShotParams, kpp kppVar, float f, kbc kbcVar) {
        kmd kmdVarM17682f = m17682f(kppVar, kmgVar);
        kpp kppVarM17665h = m17665h(kppVar, kmdVarM17682f.mo14556i().f36540a);
        Rect rect = (Rect) kppVarM17665h.mo9517d(CaptureResult.SCALER_CROP_REGION);
        rect.getClass();
        MeshWarp meshWarpM17667l = m17667l(rect, kppVar);
        MeteringRectangle[] meteringRectangleArr = (MeteringRectangle[]) kppVarM17665h.mo9517d(CaptureResult.CONTROL_AE_REGIONS);
        Rect rect2 = (Rect) kppVarM17665h.mo9517d(CaptureResult.SCALER_CROP_REGION);
        rect2.getClass();
        boolean z = true;
        lku.m15607B(!rect2.isEmpty(), "Invalid scaler crop region: %s", rect2);
        Rect rect3 = (Rect) kmdVarM17682f.mo14561n(CameraCharacteristics.SENSOR_INFO_PRE_CORRECTION_ACTIVE_ARRAY_SIZE);
        Rect rectM13878d = kan.m13873j(kbcVar).m13878d(rect2);
        if (rect3.contains(rectM13878d)) {
            rect3.toString();
            rectM13878d.toString();
            MeshTranslation meshTranslation = new MeshTranslation(GcamModuleJNI.MeshWarp_TranslationHint(meshWarpM17667l.f8318a, meshWarpM17667l));
            kpb kpbVar = f44464b;
            if ((kpbVar.f36770c || kpbVar.m14668h() || kpbVar.f36773f) && m17656D(kppVarM17665h).intValue() == 3 && kmdVarM17682f.mo14558k() == kmq.f36557a && rect3.width() - rectM13878d.width() <= 10 && rect3.height() - rectM13878d.height() <= 10) {
                GcamModuleJNI.MeshTranslation_x_set(meshTranslation.f8316a, meshTranslation, 0);
                GcamModuleJNI.MeshTranslation_y_set(meshTranslation.f8316a, meshTranslation, 0);
            }
            Rect rect4 = new Rect(rectM13878d);
            rect4.offset(rect3.left - GcamModuleJNI.MeshTranslation_x_get(meshTranslation.f8316a, meshTranslation), rect3.top - GcamModuleJNI.MeshTranslation_y_get(meshTranslation.f8316a, meshTranslation));
            if (rect3.contains(rect4)) {
                rectM13878d.set(rect4);
                rectM13878d.offset(-rect3.left, -rect3.top);
            } else {
                int iM14978X = kxk.m14978X(rect4.left, rect3.left, rect3.right - rect4.width());
                int iM14978X2 = kxk.m14978X(rect4.top, rect3.top, rect3.bottom - rect4.height());
                rectM13878d.set(new Rect(iM14978X, iM14978X2, rect4.width() + iM14978X, rect4.height() + iM14978X2));
                rectM13878d.offset(-rect3.left, -rect3.top);
                z = false;
            }
            if (!rectM13878d.setIntersect(rectM13878d, rect3)) {
                Log.w(f44463a, "crop failed to intersect with preCorrectionActiveArraySize.");
            }
            rectM13878d.toString();
            lku.m15670x(rect3.contains(rectM13878d), "crop exceeds preCorrectionActiveArraySize!");
            if (!z) {
                Log.w(f44463a, xPAWq.FEethm);
            }
        } else {
            Log.w(f44463a, "aeCrop exceeds preCorrectionActiveArraySize. aeCrop: " + rectM13878d.toString() + ", preCorrectionActiveArraySize: " + rect3.toString());
        }
        NormalizedRect normalizedRect = new NormalizedRect();
        float fWidth = rect3.width();
        float fHeight = rect3.height();
        float f2 = 1.0f;
        float f3 = 1.0f / fWidth;
        normalizedRect.m5052c(Math.max(rectM13878d.left * f3, 0.0f));
        float f4 = 1.0f / fHeight;
        normalizedRect.m5054e(Math.max(rectM13878d.top * f4, 0.0f));
        normalizedRect.m5053d(Math.min(rectM13878d.right * f3, 1.0f));
        normalizedRect.m5055f(Math.min(rectM13878d.bottom * f4, 1.0f));
        aeShotParams.m4888e(normalizedRect);
        WeightedNormalizedRectVector weightedNormalizedRectVectorM4886c = aeShotParams.m4886c();
        WeightedNormalizedRect weightedNormalizedRect = new WeightedNormalizedRect();
        weightedNormalizedRect.m5141b(1.0f);
        NormalizedRect normalizedRect2 = new NormalizedRect();
        GcamModuleJNI.WeightedNormalizedRect_rect_set(weightedNormalizedRect.f8383a, weightedNormalizedRect, NormalizedRect.m5050a(normalizedRect2), normalizedRect2);
        weightedNormalizedRectVectorM4886c.m5143b(weightedNormalizedRect);
        if (meteringRectangleArr != null) {
            int i = 0;
            while (i < meteringRectangleArr.length) {
                if (meteringRectangleArr[i].getMeteringWeight() != 0) {
                    WeightedNormalizedRect weightedNormalizedRect2 = new WeightedNormalizedRect();
                    Rect rect5 = meteringRectangleArr[i].getRect();
                    float fExactCenterX = rect5.exactCenterX();
                    float fExactCenterY = rect5.exactCenterY();
                    float fMin = Math.min(rectM13878d.width(), rectM13878d.height()) * 0.06125f;
                    float f5 = fExactCenterX - fMin;
                    float f6 = fExactCenterY - fMin;
                    float f7 = fExactCenterX + fMin;
                    float f8 = fExactCenterY + fMin;
                    float fM14986ad = kxk.m14986ad(f5 / rect3.width(), 0.0f, f2);
                    float fM14986ad2 = kxk.m14986ad(f6 / rect3.height(), 0.0f, f2);
                    float fM14986ad3 = kxk.m14986ad(f7 / rect3.width(), 0.0f, f2);
                    float fM14986ad4 = kxk.m14986ad(f8 / rect3.height(), 0.0f, f2);
                    long jWeightedNormalizedRect_rect_get = GcamModuleJNI.WeightedNormalizedRect_rect_get(weightedNormalizedRect2.f8383a, weightedNormalizedRect2);
                    NormalizedRect normalizedRect3 = jWeightedNormalizedRect_rect_get == 0 ? null : new NormalizedRect(jWeightedNormalizedRect_rect_get, false);
                    normalizedRect3.m5052c(fM14986ad);
                    normalizedRect3.m5054e(fM14986ad2);
                    normalizedRect3.m5053d(fM14986ad3);
                    normalizedRect3.m5055f(fM14986ad4);
                    weightedNormalizedRect2.m5141b(f);
                    weightedNormalizedRectVectorM4886c.m5143b(weightedNormalizedRect2);
                }
                i++;
                f2 = 1.0f;
            }
        }
    }
}
