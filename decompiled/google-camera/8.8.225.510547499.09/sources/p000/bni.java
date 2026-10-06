package p000;

import android.hardware.Camera;
import com.google.android.material.behavior.iWN.zuAgeeF;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class bni extends bob {

    /* JADX INFO: renamed from: x */
    private C1143ye f3884x;

    /* JADX INFO: renamed from: y */
    private C1143ye f3885y;

    static {
        new boo("AndCamCapabs");
    }

    public bni(Camera.Parameters parameters) {
        super(new bzq((boolean[]) null), null, null, null);
        this.f3884x = new C1143ye(4);
        this.f3885y = new C1143ye(5);
        this.f3969o = parameters.getMaxExposureCompensation();
        this.f3968n = parameters.getMinExposureCompensation();
        this.f3970p = parameters.getExposureCompensationStep();
        this.f3971q = parameters.getMaxNumDetectedFaces();
        this.f3973s = parameters.getMaxNumMeteringAreas();
        this.f3967m = new bon(parameters.getPreferredPreviewSizeForVideo());
        this.f3958d.addAll(parameters.getSupportedPreviewFormats());
        this.f3961g.addAll(parameters.getSupportedPictureFormats());
        this.f3975u = parameters.getHorizontalViewAngle();
        this.f3976v = parameters.getVerticalViewAngle();
        List<int[]> supportedPreviewFpsRange = parameters.getSupportedPreviewFpsRange();
        if (supportedPreviewFpsRange != null) {
            this.f3956b.addAll(supportedPreviewFpsRange);
        }
        Collections.sort(this.f3956b, this.f3884x);
        List<Camera.Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
        if (supportedPreviewSizes != null) {
            for (Camera.Size size : supportedPreviewSizes) {
                this.f3957c.add(new bon(size.width, size.height));
            }
        }
        Collections.sort(this.f3957c, this.f3885y);
        List<Camera.Size> supportedVideoSizes = parameters.getSupportedVideoSizes();
        if (supportedVideoSizes != null) {
            for (Camera.Size size2 : supportedVideoSizes) {
                this.f3959e.add(new bon(size2.width, size2.height));
            }
        }
        Collections.sort(this.f3959e, this.f3885y);
        List<Camera.Size> supportedPictureSizes = parameters.getSupportedPictureSizes();
        if (supportedPictureSizes != null) {
            for (Camera.Size size3 : supportedPictureSizes) {
                this.f3960f.add(new bon(size3.width, size3.height));
            }
        }
        Collections.sort(this.f3960f, this.f3885y);
        List<String> supportedSceneModes = parameters.getSupportedSceneModes();
        if (supportedSceneModes != null) {
            for (String str : supportedSceneModes) {
                if ("auto".equals(str)) {
                    this.f3962h.add(bnz.AUTO);
                } else if ("action".equals(str)) {
                    this.f3962h.add(bnz.ACTION);
                } else if ("barcode".equals(str)) {
                    this.f3962h.add(bnz.BARCODE);
                } else if ("beach".equals(str)) {
                    this.f3962h.add(bnz.BEACH);
                } else if ("candlelight".equals(str)) {
                    this.f3962h.add(bnz.CANDLELIGHT);
                } else if ("fireworks".equals(str)) {
                    this.f3962h.add(bnz.FIREWORKS);
                } else if ("hdr".equals(str)) {
                    this.f3962h.add(bnz.HDR);
                } else if ("landscape".equals(str)) {
                    this.f3962h.add(bnz.LANDSCAPE);
                } else if ("night".equals(str)) {
                    this.f3962h.add(bnz.NIGHT);
                } else if ("night-portrait".equals(str)) {
                    this.f3962h.add(bnz.NIGHT_PORTRAIT);
                } else if ("party".equals(str)) {
                    this.f3962h.add(bnz.PARTY);
                } else if ("portrait".equals(str)) {
                    this.f3962h.add(bnz.PORTRAIT);
                } else if ("snow".equals(str)) {
                    this.f3962h.add(bnz.SNOW);
                } else if ("sports".equals(str)) {
                    this.f3962h.add(bnz.SPORTS);
                } else if ("steadyphoto".equals(str)) {
                    this.f3962h.add(bnz.f3941p);
                } else if ("sunset".equals(str)) {
                    this.f3962h.add(bnz.SUNSET);
                } else if ("theatre".equals(str)) {
                    this.f3962h.add(bnz.THEATRE);
                }
            }
        }
        List<String> supportedFlashModes = parameters.getSupportedFlashModes();
        if (supportedFlashModes == null) {
            this.f3963i.add(bnx.NO_FLASH);
        } else {
            for (String str2 : supportedFlashModes) {
                if ("auto".equals(str2)) {
                    this.f3963i.add(bnx.AUTO);
                } else if ("off".equals(str2)) {
                    this.f3963i.add(bnx.OFF);
                } else if (zuAgeeF.wcCmW.equals(str2)) {
                    this.f3963i.add(bnx.ON);
                } else if ("red-eye".equals(str2)) {
                    this.f3963i.add(bnx.RED_EYE);
                } else if ("torch".equals(str2)) {
                    this.f3963i.add(bnx.TORCH);
                }
            }
        }
        List<String> supportedFocusModes = parameters.getSupportedFocusModes();
        if (supportedFocusModes != null) {
            for (String str3 : supportedFocusModes) {
                if ("auto".equals(str3)) {
                    this.f3964j.add(bny.AUTO);
                } else if ("continuous-picture".equals(str3)) {
                    this.f3964j.add(bny.CONTINUOUS_PICTURE);
                } else if ("continuous-video".equals(str3)) {
                    this.f3964j.add(bny.CONTINUOUS_VIDEO);
                } else if ("edof".equals(str3)) {
                    this.f3964j.add(bny.EXTENDED_DOF);
                } else if ("fixed".equals(str3)) {
                    this.f3964j.add(bny.FIXED);
                } else if ("infinity".equals(str3)) {
                    this.f3964j.add(bny.INFINITY);
                } else if ("macro".equals(str3)) {
                    this.f3964j.add(bny.MACRO);
                }
            }
        }
        List<String> supportedFocusModes2 = parameters.getSupportedFocusModes();
        if (supportedFocusModes2 != null) {
            for (String str4 : supportedFocusModes2) {
                if ("auto".equals(str4)) {
                    this.f3965k.add(boa.AUTO);
                } else if ("cloudy-daylight".equals(str4)) {
                    this.f3965k.add(boa.f3947b);
                } else if ("daylight".equals(str4)) {
                    this.f3965k.add(boa.DAYLIGHT);
                } else if ("fluorescent".equals(str4)) {
                    this.f3965k.add(boa.FLUORESCENT);
                } else if ("incandescent".equals(str4)) {
                    this.f3965k.add(boa.INCANDESCENT);
                } else if ("shade".equals(str4)) {
                    this.f3965k.add(boa.f3951f);
                } else if ("twilight".equals(str4)) {
                    this.f3965k.add(boa.TWILIGHT);
                } else if ("warm-fluorescent".equals(str4)) {
                    this.f3965k.add(boa.WARM_FLUORESCENT);
                }
            }
        }
        if (parameters.isZoomSupported()) {
            this.f3974t = parameters.getZoomRatios().get(parameters.getMaxZoom()).intValue() / 100.0f;
            this.f3966l.add(bnw.ZOOM);
        }
        if (parameters.isVideoSnapshotSupported()) {
            this.f3966l.add(bnw.f3904b);
        }
        if (parameters.isAutoExposureLockSupported()) {
            this.f3966l.add(bnw.AUTO_EXPOSURE_LOCK);
        }
        if (parameters.isAutoWhiteBalanceLockSupported()) {
            this.f3966l.add(bnw.AUTO_WHITE_BALANCE_LOCK);
        }
        if (m2786f(bny.AUTO)) {
            int maxNumFocusAreas = parameters.getMaxNumFocusAreas();
            this.f3972r = maxNumFocusAreas;
            if (maxNumFocusAreas > 0) {
                this.f3966l.add(bnw.FOCUS_AREA);
            }
        }
        if (this.f3973s > 0) {
            this.f3966l.add(bnw.METERING_AREA);
        }
    }

    public bni(bni bniVar) {
        super(bniVar);
        this.f3884x = new C1143ye(4);
        this.f3885y = new C1143ye(5);
    }
}
