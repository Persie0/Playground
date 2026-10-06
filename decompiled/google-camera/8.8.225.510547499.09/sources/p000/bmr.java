package p000;

import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.media.ImageReader;
import android.os.Looper;
import android.os.Message;
import android.util.Range;
import android.util.Size;
import android.view.Surface;
import com.google.android.apps.camera.util.p015ui.mfv.EArqVBjecl;
import com.google.android.libraries.lens.lenslite.dynamicloading.QSK.hIAHJKEnGsNbz;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bmr extends bol {

    /* JADX INFO: renamed from: a */
    public bnm f3803a;

    /* JADX INFO: renamed from: b */
    public int f3804b;

    /* JADX INFO: renamed from: c */
    public String f3805c;

    /* JADX INFO: renamed from: d */
    public CameraDevice f3806d;

    /* JADX INFO: renamed from: e */
    public bmk f3807e;

    /* JADX INFO: renamed from: f */
    public bor f3808f;

    /* JADX INFO: renamed from: g */
    public Rect f3809g;

    /* JADX INFO: renamed from: h */
    public boolean f3810h;

    /* JADX INFO: renamed from: i */
    public CameraCaptureSession f3811i;

    /* JADX INFO: renamed from: j */
    public ImageReader f3812j;

    /* JADX INFO: renamed from: k */
    public bnr f3813k;

    /* JADX INFO: renamed from: l */
    public bnk f3814l;

    /* JADX INFO: renamed from: m */
    public bms f3815m;

    /* JADX INFO: renamed from: n */
    public bnl f3816n;

    /* JADX INFO: renamed from: o */
    public int f3817o;

    /* JADX INFO: renamed from: p */
    public final bmq f3818p;

    /* JADX INFO: renamed from: q */
    final /* synthetic */ bmt f3819q;

    /* JADX INFO: renamed from: s */
    private int f3820s;

    /* JADX INFO: renamed from: t */
    private bon f3821t;

    /* JADX INFO: renamed from: u */
    private bon f3822u;

    /* JADX INFO: renamed from: v */
    private SurfaceTexture f3823v;

    /* JADX INFO: renamed from: w */
    private Surface f3824w;

    /* JADX INFO: renamed from: x */
    private final CameraDevice.StateCallback f3825x;

    /* JADX INFO: renamed from: y */
    private final CameraCaptureSession.StateCallback f3826y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bmr(bmt bmtVar, Looper looper) {
        super(looper);
        this.f3819q = bmtVar;
        this.f3820s = 0;
        this.f3817o = 0;
        this.f3825x = new bmn(this);
        this.f3826y = new bmo(this);
        this.f3818p = new bmp(this);
    }

    /* JADX INFO: renamed from: d */
    private final void m2736d(bmv bmvVar) {
        Integer num;
        Integer num2;
        Integer num3;
        Integer numValueOf;
        bor borVar = this.f3808f;
        bmvVar.m2754b(CaptureRequest.CONTROL_AE_REGIONS, bmvVar.m2755c(bmvVar.f3988e));
        bmvVar.m2754b(CaptureRequest.CONTROL_AF_REGIONS, bmvVar.m2755c(bmvVar.f3989f));
        bmvVar.m2754b(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, new Range(Integer.valueOf(bmvVar.f3991h), Integer.valueOf(bmvVar.f3992i)));
        bmvVar.m2754b(CaptureRequest.JPEG_QUALITY, Byte.valueOf(bmvVar.f3997n));
        bmvVar.f3845b.m2823d(CaptureRequest.SCALER_CROP_REGION, bmvVar.f3846c);
        bmvVar.m2754b(CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION, Integer.valueOf(bmvVar.f4000q));
        Integer num4 = 3;
        Integer num5 = 0;
        if (bmvVar.f4001r != null) {
            boa boaVar = boa.AUTO;
            bnz bnzVar = bnz.NO_SCENE_MODE;
            bny bnyVar = bny.AUTO;
            bnx bnxVar = bnx.NO_FLASH;
            switch (bmvVar.f4001r.ordinal()) {
                case 1:
                    num = 2;
                    num2 = null;
                    break;
                case 2:
                    num2 = num5;
                    num = 1;
                    break;
                case 3:
                    num = num4;
                    num2 = 1;
                    break;
                case 4:
                    num2 = 2;
                    num = null;
                    break;
                case 5:
                    num = 4;
                    num2 = null;
                    break;
                default:
                    boo booVar = bmv.f3842a;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unable to convert to API 2 flash mode: ");
                    bnx bnxVar2 = bmvVar.f4001r;
                    sb.append(bnxVar2);
                    bop.m2814c(booVar, "Unable to convert to API 2 flash mode: ".concat(String.valueOf(bnxVar2)));
                    num = null;
                    num2 = null;
                    break;
            }
        } else {
            num = null;
            num2 = null;
        }
        bmvVar.f3845b.m2823d(CaptureRequest.CONTROL_AE_MODE, num);
        bmvVar.f3845b.m2823d(CaptureRequest.FLASH_MODE, num2);
        if (bmvVar.f4002s != null) {
            boa boaVar2 = boa.AUTO;
            bnz bnzVar2 = bnz.NO_SCENE_MODE;
            bny bnyVar2 = bny.AUTO;
            bnx bnxVar3 = bnx.NO_FLASH;
            switch (bmvVar.f4002s) {
                case AUTO:
                    num3 = 1;
                    break;
                case CONTINUOUS_PICTURE:
                    num3 = 4;
                    break;
                case CONTINUOUS_VIDEO:
                    num3 = num4;
                    break;
                case EXTENDED_DOF:
                    num3 = 5;
                    break;
                case FIXED:
                    num3 = num5;
                    break;
                case INFINITY:
                default:
                    boo booVar2 = bmv.f3842a;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Unable to convert to API 2 focus mode: ");
                    bny bnyVar3 = bmvVar.f4002s;
                    sb2.append(bnyVar3);
                    bop.m2814c(booVar2, "Unable to convert to API 2 focus mode: ".concat(String.valueOf(bnyVar3)));
                    num3 = null;
                    break;
                case MACRO:
                    num3 = 2;
                    break;
            }
        } else {
            num3 = null;
        }
        bmvVar.f3845b.m2823d(CaptureRequest.CONTROL_AF_MODE, num3);
        if (bmvVar.f4003t != null) {
            boa boaVar3 = boa.AUTO;
            bnz bnzVar3 = bnz.NO_SCENE_MODE;
            bny bnyVar4 = bny.AUTO;
            bnx bnxVar4 = bnx.NO_FLASH;
            switch (bmvVar.f4003t.ordinal()) {
                case 1:
                    numValueOf = num5;
                    break;
                case 2:
                    numValueOf = 2;
                    break;
                case 3:
                    numValueOf = 16;
                    break;
                case 4:
                    numValueOf = 8;
                    break;
                case 5:
                    numValueOf = 15;
                    break;
                case 6:
                    numValueOf = 12;
                    break;
                case 7:
                    numValueOf = Integer.valueOf(bom.f4019a);
                    break;
                case 8:
                    numValueOf = 4;
                    break;
                case 9:
                    numValueOf = 5;
                    break;
                case 10:
                default:
                    boo booVar3 = bmv.f3842a;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Unable to convert to API 2 scene mode: ");
                    bnz bnzVar4 = bmvVar.f4003t;
                    sb3.append(bnzVar4);
                    bop.m2814c(booVar3, "Unable to convert to API 2 scene mode: ".concat(String.valueOf(bnzVar4)));
                    numValueOf = null;
                    break;
                case 11:
                    numValueOf = 14;
                    break;
                case 12:
                    numValueOf = num4;
                    break;
                case 13:
                    numValueOf = 9;
                    break;
                case 14:
                    numValueOf = 13;
                    break;
                case 15:
                    numValueOf = 11;
                    break;
                case 16:
                    numValueOf = 10;
                    break;
                case 17:
                    numValueOf = 7;
                    break;
            }
        } else {
            numValueOf = null;
        }
        bmvVar.f3845b.m2823d(CaptureRequest.CONTROL_SCENE_MODE, numValueOf);
        if (bmvVar.f4004u != null) {
            boa boaVar4 = boa.AUTO;
            bnz bnzVar5 = bnz.NO_SCENE_MODE;
            bny bnyVar5 = bny.AUTO;
            bnx bnxVar5 = bnx.NO_FLASH;
            switch (bmvVar.f4004u) {
                case AUTO:
                    num4 = 1;
                    break;
                case f3947b:
                    num4 = 6;
                    break;
                case DAYLIGHT:
                    num4 = 5;
                    break;
                case FLUORESCENT:
                    break;
                case INCANDESCENT:
                    num4 = 2;
                    break;
                case f3951f:
                    num4 = 8;
                    break;
                case TWILIGHT:
                    num4 = 7;
                    break;
                case WARM_FLUORESCENT:
                    num4 = 4;
                    break;
                default:
                    boo booVar4 = bmv.f3842a;
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("Unable to convert to API 2 white balance: ");
                    boa boaVar5 = bmvVar.f4004u;
                    sb4.append(boaVar5);
                    bop.m2814c(booVar4, "Unable to convert to API 2 white balance: ".concat(String.valueOf(boaVar5)));
                    num4 = null;
                    break;
            }
        } else {
            num4 = null;
        }
        bmvVar.f3845b.m2823d(CaptureRequest.CONTROL_AWB_MODE, num4);
        bmvVar.m2754b(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, Integer.valueOf(bmvVar.f4005v ? 1 : 0));
        bmvVar.f3845b.m2823d(CaptureRequest.LENS_OPTICAL_STABILIZATION_MODE, bmvVar.f4005v ? 0 : null);
        bmvVar.m2754b(CaptureRequest.CONTROL_AE_LOCK, Boolean.valueOf(bmvVar.f4006w));
        bmvVar.m2754b(CaptureRequest.CONTROL_AWB_LOCK, Boolean.valueOf(bmvVar.f4007x));
        bmvVar.f3845b.m2823d(CaptureRequest.JPEG_GPS_LOCATION, null);
        if (bmvVar.f4009z != null) {
            bmvVar.m2754b(CaptureRequest.JPEG_THUMBNAIL_SIZE, new Size(bmvVar.f4009z.m2811b(), bmvVar.f4009z.m2810a()));
        } else {
            bmvVar.m2754b(CaptureRequest.JPEG_THUMBNAIL_SIZE, null);
        }
        bor borVar2 = bmvVar.f3845b;
        if (borVar2 != borVar) {
            borVar.f4024a.putAll(borVar2.f4024a);
            borVar.f4025b++;
        }
        this.f3821t = bmvVar.m2793f();
        this.f3822u = bmvVar.m2792e();
        if (this.f3819q.f3833c.m2800a() < 16) {
            if (this.f3819q.f3833c.m2800a() < 8) {
                m2739a(4);
            }
        } else {
            try {
                this.f3811i.setRepeatingRequest(this.f3808f.m2820a(this.f3806d, 1, this.f3824w), this.f3818p, this);
            } catch (CameraAccessException e) {
                bop.m2813b(bmt.f3831a, "Failed to apply updated request settings", e);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    private final void m2737e() {
        try {
            this.f3811i.abortCaptures();
            this.f3811i = null;
        } catch (CameraAccessException e) {
            bop.m2813b(bmt.f3831a, "Failed to close existing camera capture session", e);
        }
        m2739a(4);
    }

    /* JADX INFO: renamed from: f */
    private final void m2738f(SurfaceTexture surfaceTexture) {
        if (this.f3819q.f3833c.m2800a() < 4) {
            bop.m2814c(bmt.f3831a, "Ignoring texture setting at inappropriate time");
            return;
        }
        if (surfaceTexture == this.f3823v) {
            bop.m2817f(bmt.f3831a);
            return;
        }
        if (this.f3811i != null) {
            m2737e();
        }
        this.f3823v = surfaceTexture;
        surfaceTexture.setDefaultBufferSize(this.f3821t.m2811b(), this.f3821t.m2810a());
        Surface surface = this.f3824w;
        if (surface != null) {
            surface.release();
        }
        this.f3824w = new Surface(surfaceTexture);
        ImageReader imageReader = this.f3812j;
        if (imageReader != null) {
            imageReader.close();
        }
        ImageReader imageReaderNewInstance = ImageReader.newInstance(this.f3822u.m2811b(), this.f3822u.m2810a(), 256, 1);
        this.f3812j = imageReaderNewInstance;
        try {
            this.f3806d.createCaptureSession(Arrays.asList(this.f3824w, imageReaderNewInstance.getSurface()), this.f3826y, this);
        } catch (CameraAccessException e) {
            bop.m2813b(bmt.f3831a, EArqVBjecl.ExrKOhpofkV, e);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m2739a(int i) {
        if (this.f3819q.f3833c.m2800a() != i) {
            this.f3819q.f3833c.m2802c(i);
            if (i < 16) {
                this.f3817o = 0;
                bmp bmpVar = (bmp) this.f3818p;
                bmpVar.f3799a = -1;
                bmpVar.f3800b = -1L;
                bmpVar.f3801c = -1L;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final boi m2740b() {
        try {
            return new bmv(this.f3806d, this.f3809g, this.f3821t, this.f3822u);
        } catch (CameraAccessException e) {
            bop.m2812a(bmt.f3831a, "Unable to query camera device to build settings representation");
            return null;
        }
    }

    @Override // p000.bol, android.os.Handler
    public final void handleMessage(Message message) {
        CameraDevice cameraDevice;
        super.handleMessage(message);
        boo booVar = bmt.f3831a;
        bzq.m3235H(message.what);
        bop.m2818g(booVar);
        int i = message.what;
        try {
            switch (i) {
                case 1:
                case 3:
                    bnm bnmVar = (bnm) message.obj;
                    int i2 = message.arg1;
                    if (this.f3819q.f3833c.m2800a() <= 1) {
                        this.f3803a = bnmVar;
                        this.f3804b = i2;
                        this.f3805c = (String) this.f3819q.f3838h.get(i2);
                        boo booVar2 = bmt.f3831a;
                        String.format("Opening camera index %d (id %s) with camera2 API", Integer.valueOf(i2), this.f3805c);
                        bop.m2817f(booVar2);
                        String str = this.f3805c;
                        if (str != null) {
                            this.f3819q.f3835e.openCamera(str, this.f3825x, this);
                        } else {
                            this.f3803a.mo2769a(message.arg1);
                        }
                    } else {
                        bnmVar.mo2772d(i2, m2808c(i2));
                    }
                    break;
                case 2:
                    if (this.f3819q.f3833c.m2800a() != 1) {
                        if (this.f3811i != null) {
                            m2737e();
                            this.f3811i = null;
                        }
                        CameraDevice cameraDevice2 = this.f3806d;
                        if (cameraDevice2 != null) {
                            cameraDevice2.close();
                            this.f3806d = null;
                        }
                        this.f3807e = null;
                        this.f3808f = null;
                        this.f3809g = null;
                        Surface surface = this.f3824w;
                        if (surface != null) {
                            surface.release();
                            this.f3824w = null;
                        }
                        this.f3823v = null;
                        ImageReader imageReader = this.f3812j;
                        if (imageReader != null) {
                            imageReader.close();
                            this.f3812j = null;
                        }
                        this.f3821t = null;
                        this.f3822u = null;
                        this.f3804b = 0;
                        this.f3805c = null;
                        m2739a(1);
                    } else {
                        bop.m2814c(bmt.f3831a, "Ignoring release at inappropriate time");
                    }
                    break;
                case 101:
                    m2738f((SurfaceTexture) message.obj);
                    break;
                case 102:
                    if (this.f3819q.f3833c.m2800a() == 8) {
                        this.f3813k = (bnr) message.obj;
                        m2739a(16);
                        try {
                            this.f3811i.setRepeatingRequest(this.f3808f.m2820a(this.f3806d, 1, this.f3824w), this.f3818p, this);
                        } catch (CameraAccessException e) {
                            bop.m2815d(bmt.f3831a, "Unable to start preview", e);
                            m2739a(8);
                        }
                    } else {
                        bop.m2814c(bmt.f3831a, "Refusing to start preview at inappropriate time");
                    }
                    break;
                case 103:
                    if (this.f3819q.f3833c.m2800a() >= 16) {
                        this.f3811i.stopRepeating();
                        m2739a(8);
                    } else {
                        bop.m2814c(bmt.f3831a, "Refusing to stop preview at inappropriate time");
                    }
                    break;
                case 204:
                    m2736d((bmv) message.obj);
                    break;
                case 301:
                    if (this.f3820s > 0) {
                        bop.m2818g(bmt.f3831a);
                    } else if (this.f3819q.f3833c.m2800a() >= 16) {
                        bml bmlVar = new bml(this, (bnk) message.obj);
                        m2739a(32);
                        bor borVar = new bor(this.f3808f);
                        borVar.m2823d(CaptureRequest.CONTROL_AF_TRIGGER, 1);
                        try {
                            this.f3811i.capture(borVar.m2820a(this.f3806d, 1, this.f3824w), bmlVar, this);
                        } catch (CameraAccessException e2) {
                            bop.m2813b(bmt.f3831a, "Unable to lock autofocus", e2);
                            m2739a(16);
                        }
                    } else {
                        bop.m2814c(bmt.f3831a, "Ignoring attempt to autofocus without preview");
                    }
                    break;
                case 302:
                    this.f3820s++;
                    if (this.f3819q.f3833c.m2800a() >= 16) {
                        m2739a(16);
                        bor borVar2 = new bor(this.f3808f);
                        borVar2.m2823d(CaptureRequest.CONTROL_AF_TRIGGER, 2);
                        try {
                            this.f3811i.capture(borVar2.m2820a(this.f3806d, 1, this.f3824w), null, this);
                        } catch (CameraAccessException e3) {
                            bop.m2813b(bmt.f3831a, "Unable to cancel autofocus", e3);
                            m2739a(32);
                        }
                    } else {
                        bop.m2814c(bmt.f3831a, "Ignoring attempt to release focus lock without preview");
                    }
                    break;
                case 303:
                    this.f3816n = (bnl) message.obj;
                    break;
                case 305:
                    this.f3820s--;
                    break;
                case 502:
                    this.f3808f.m2823d(CaptureRequest.JPEG_ORIENTATION, Integer.valueOf(message.arg2 > 0 ? this.f3807e.f3784a.m2787d(message.arg1) : 0));
                    break;
                case 503:
                    this.f3808f.m2823d(CaptureRequest.JPEG_ORIENTATION, Integer.valueOf(message.arg1));
                    break;
                case 601:
                    if (this.f3819q.f3833c.m2800a() >= 16) {
                        if (this.f3819q.f3833c.m2800a() != 32) {
                            bop.m2814c(bmt.f3831a, "Taking a (likely blurry) photo without the lens locked");
                        }
                        bms bmsVar = (bms) message.obj;
                        if (!this.f3810h && (this.f3817o != 2 || this.f3808f.m2822c(CaptureRequest.CONTROL_AE_MODE, 3) || this.f3808f.m2822c(CaptureRequest.FLASH_MODE, 1))) {
                            bop.m2817f(bmt.f3831a);
                            bmm bmmVar = new bmm(this, bmsVar);
                            bor borVar3 = new bor(this.f3808f);
                            borVar3.m2823d(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 1);
                            try {
                                this.f3811i.capture(borVar3.m2820a(this.f3806d, 1, this.f3824w), bmmVar, this);
                            } catch (CameraAccessException e4) {
                                bop.m2813b(bmt.f3831a, "Unable to run autoexposure and perform capture", e4);
                            }
                        } else {
                            bop.m2817f(bmt.f3831a);
                            this.f3812j.setOnImageAvailableListener(bmsVar, this);
                            try {
                                this.f3811i.capture(this.f3808f.m2820a(this.f3806d, 2, this.f3812j.getSurface()), bmsVar, this);
                            } catch (CameraAccessException e5) {
                                bop.m2813b(bmt.f3831a, "Unable to initiate immediate capture", e5);
                            }
                        }
                    } else {
                        bop.m2812a(bmt.f3831a, "Photos may only be taken when a preview is active");
                    }
                    break;
                default:
                    throw new RuntimeException(hIAHJKEnGsNbz.jUAyVgjbvmfKq + message.what);
            }
        } catch (Exception e6) {
            if (i != 2 && (cameraDevice = this.f3806d) != null) {
                cameraDevice.close();
                this.f3806d = null;
            } else if (this.f3806d == null) {
                if (i == 1) {
                    bnm bnmVar2 = this.f3803a;
                    if (bnmVar2 != null) {
                        int i3 = this.f3804b;
                        bnmVar2.mo2771c(i3, m2808c(i3));
                    }
                } else {
                    bop.m2814c(bmt.f3831a, "Cannot handle message " + message.what + ", mCamera is null");
                }
            }
            if (e6 instanceof RuntimeException) {
                String strM2808c = m2808c(Integer.parseInt(this.f3805c));
                bmt bmtVar = this.f3819q;
                bmtVar.f3837g.mo2758b((RuntimeException) e6, strM2808c, i, bmtVar.f3833c.m2800a());
            }
        } finally {
            bnt.m2778a(message);
        }
    }
}
