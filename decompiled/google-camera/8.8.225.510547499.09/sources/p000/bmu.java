package p000;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.MediaRecorder;
import android.util.Range;
import android.util.Rational;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bmu extends bob {

    /* JADX INFO: renamed from: x */
    private static final boo f3841x = new boo("AndCam2Capabs");

    public bmu(CameraCharacteristics cameraCharacteristics) {
        super(new bzq((boolean[]) null), null, null, null);
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        for (Range range : (Range[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES)) {
            this.f3956b.add(new int[]{((Integer) range.getLower()).intValue(), ((Integer) range.getUpper()).intValue()});
        }
        this.f3957c.addAll(bon.m2809c(Arrays.asList(streamConfigurationMap.getOutputSizes(SurfaceTexture.class))));
        for (int i : streamConfigurationMap.getOutputFormats()) {
            this.f3958d.add(Integer.valueOf(i));
        }
        this.f3959e.addAll(bon.m2809c(Arrays.asList(streamConfigurationMap.getOutputSizes(MediaRecorder.class))));
        this.f3960f.addAll(bon.m2809c(Arrays.asList(streamConfigurationMap.getOutputSizes(256))));
        this.f3961g.addAll(this.f3958d);
        int[] iArr = (int[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AVAILABLE_SCENE_MODES);
        if (iArr != null) {
            for (int i2 : iArr) {
                bnz bnzVarM2749b = m2749b(i2);
                if (bnzVarM2749b != null) {
                    this.f3962h.add(bnzVarM2749b);
                }
            }
        }
        this.f3963i.add(bnx.OFF);
        if (((Boolean) cameraCharacteristics.get(CameraCharacteristics.FLASH_INFO_AVAILABLE)).booleanValue()) {
            this.f3963i.add(bnx.AUTO);
            this.f3963i.add(bnx.ON);
            this.f3963i.add(bnx.TORCH);
            for (int i3 : (int[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES)) {
                if (i3 == 4) {
                    this.f3963i.add(bnx.RED_EYE);
                }
            }
        }
        int[] iArr2 = (int[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES);
        if (iArr2 != null) {
            for (int i4 : iArr2) {
                bny bnyVarM2748a = m2748a(i4);
                if (bnyVarM2748a != null) {
                    this.f3964j.add(bnyVarM2748a);
                }
            }
        }
        int[] iArr3 = (int[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AWB_AVAILABLE_MODES);
        if (iArr3 != null) {
            for (int i5 : iArr3) {
                boa boaVarM2750c = m2750c(i5);
                if (boaVarM2750c != null) {
                    this.f3965k.add(boaVarM2750c);
                }
            }
        }
        Range range2 = (Range) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE);
        this.f3968n = ((Integer) range2.getLower()).intValue();
        this.f3969o = ((Integer) range2.getUpper()).intValue();
        Rational rational = (Rational) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_COMPENSATION_STEP);
        this.f3970p = rational.getNumerator() / rational.getDenominator();
        this.f3971q = ((Integer) cameraCharacteristics.get(CameraCharacteristics.STATISTICS_INFO_MAX_FACE_COUNT)).intValue();
        this.f3973s = ((Integer) cameraCharacteristics.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AE)).intValue();
        this.f3974t = ((Float) cameraCharacteristics.get(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM)).floatValue();
        if (m2786f(bny.AUTO)) {
            int iIntValue = ((Integer) cameraCharacteristics.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AF)).intValue();
            this.f3972r = iIntValue;
            if (iIntValue > 0) {
                this.f3966l.add(bnw.FOCUS_AREA);
            }
        }
        if (this.f3973s > 0) {
            this.f3966l.add(bnw.METERING_AREA);
        }
        if (this.f3974t > 1.0f) {
            this.f3966l.add(bnw.ZOOM);
        }
    }

    /* JADX INFO: renamed from: a */
    public static bny m2748a(int i) {
        switch (i) {
            case 0:
                return bny.FIXED;
            case 1:
                return bny.AUTO;
            case 2:
                return bny.MACRO;
            case 3:
                return bny.CONTINUOUS_VIDEO;
            case 4:
                return bny.CONTINUOUS_PICTURE;
            case 5:
                return bny.EXTENDED_DOF;
            default:
                bop.m2814c(f3841x, "Unable to convert from API 2 focus mode: " + i);
                return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static boa m2750c(int i) {
        switch (i) {
            case 1:
                return boa.AUTO;
            case 2:
                return boa.INCANDESCENT;
            case 3:
                return boa.FLUORESCENT;
            case 4:
                return boa.WARM_FLUORESCENT;
            case 5:
                return boa.DAYLIGHT;
            case 6:
                return boa.f3947b;
            case 7:
                return boa.TWILIGHT;
            case 8:
                return boa.f3951f;
            default:
                bop.m2814c(f3841x, "Unable to convert from API 2 white balance: " + i);
                return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static bnz m2749b(int i) {
        switch (i) {
            case 0:
                return bnz.AUTO;
            case 1:
            case 6:
            default:
                if (i == bom.f4019a) {
                    return bnz.HDR;
                }
                bop.m2814c(f3841x, "Unable to convert from API 2 scene mode: " + i);
                return null;
            case 2:
                return bnz.ACTION;
            case 3:
                return bnz.PORTRAIT;
            case 4:
                return bnz.LANDSCAPE;
            case 5:
                return bnz.NIGHT;
            case 7:
                return bnz.THEATRE;
            case 8:
                return bnz.BEACH;
            case 9:
                return bnz.SNOW;
            case 10:
                return bnz.SUNSET;
            case 11:
                return bnz.f3941p;
            case 12:
                return bnz.FIREWORKS;
            case 13:
                return bnz.SPORTS;
            case 14:
                return bnz.PARTY;
            case 15:
                return bnz.CANDLELIGHT;
            case 16:
                return bnz.BARCODE;
        }
    }
}
