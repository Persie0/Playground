package p000;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.Camera;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.MeteringRectangle;
import android.util.Range;
import android.util.Size;
import java.util.List;
import p021j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bmv extends boi {

    /* JADX INFO: renamed from: a */
    public static final boo f3842a = new boo("AndCam2Set");

    /* JADX INFO: renamed from: A */
    private final CaptureRequest.Builder f3843A;

    /* JADX INFO: renamed from: B */
    private final Rect f3844B;

    /* JADX INFO: renamed from: b */
    public final bor f3845b;

    /* JADX INFO: renamed from: c */
    public final Rect f3846c;

    public bmv(CameraDevice cameraDevice, Rect rect, bon bonVar, bon bonVar2) throws CameraAccessException {
        if (cameraDevice == null) {
            throw new NullPointerException("camera must not be null");
        }
        if (rect == null) {
            throw new NullPointerException("activeArray must not be null");
        }
        CaptureRequest.Builder builderCreateCaptureRequest = cameraDevice.createCaptureRequest(1);
        this.f3843A = builderCreateCaptureRequest;
        this.f3845b = new bor();
        this.f3844B = rect;
        this.f3846c = new Rect(0, 0, rect.width(), rect.height());
        this.f3990g = false;
        Range range = (Range) builderCreateCaptureRequest.get(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE);
        if (range != null) {
            m2797j(((Integer) range.getLower()).intValue(), ((Integer) range.getUpper()).intValue());
        }
        m2799l(bonVar);
        m2798k(bonVar2);
        this.f3997n = ((Byte) m2751m(CaptureRequest.JPEG_QUALITY, (byte) 0)).byteValue();
        this.f3999p = 1.0f;
        this.f4000q = ((Integer) m2751m(CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION, 0)).intValue();
        Integer num = (Integer) builderCreateCaptureRequest.get(CaptureRequest.CONTROL_AE_MODE);
        bnx bnxVar = null;
        if (num != null) {
            switch (num.intValue()) {
                case 1:
                    bnxVar = bnx.OFF;
                    break;
                case 2:
                    bnxVar = bnx.AUTO;
                    break;
                case 3:
                    bnxVar = ((Integer) builderCreateCaptureRequest.get(CaptureRequest.FLASH_MODE)).intValue() != 2 ? bnx.ON : bnx.TORCH;
                    break;
                case 4:
                    bnxVar = bnx.RED_EYE;
                    break;
            }
        }
        this.f4001r = bnxVar;
        Integer num2 = (Integer) builderCreateCaptureRequest.get(CaptureRequest.CONTROL_AF_MODE);
        if (num2 != null) {
            this.f4002s = bmu.m2748a(num2.intValue());
        }
        Integer num3 = (Integer) builderCreateCaptureRequest.get(CaptureRequest.CONTROL_SCENE_MODE);
        if (num3 != null) {
            this.f4003t = bmu.m2749b(num3.intValue());
        }
        Integer num4 = (Integer) builderCreateCaptureRequest.get(CaptureRequest.CONTROL_AWB_MODE);
        if (num4 != null) {
            this.f4004u = bmu.m2750c(num4.intValue());
        }
        this.f4005v = ((Integer) m2751m(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 0)).intValue() == 1;
        this.f4006w = ((Boolean) m2751m(CaptureRequest.CONTROL_AE_LOCK, false)).booleanValue();
        this.f4007x = ((Boolean) m2751m(CaptureRequest.CONTROL_AWB_LOCK, false)).booleanValue();
        Size size = (Size) builderCreateCaptureRequest.get(CaptureRequest.JPEG_THUMBNAIL_SIZE);
        if (size != null) {
            this.f4009z = new bon(size.getWidth(), size.getHeight());
        }
    }

    /* JADX INFO: renamed from: m */
    private final Object m2751m(CaptureRequest.Key key, Object obj) {
        Object obj2 = this.f3843A.get(key);
        if (obj2 != null) {
            return obj2;
        }
        this.f3843A.set(key, obj);
        return obj;
    }

    /* JADX INFO: renamed from: n */
    private static final int m2752n(double d, int i) {
        return (int) Math.min(Math.max(d, 0.0d), i);
    }

    @Override // p000.boi
    /* JADX INFO: renamed from: a */
    public final boi mo2753a() {
        return new bmv(this);
    }

    /* JADX WARN: Code duplicated, block: B:69:0x0124  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0058, code lost:
    
        if (r7.f3992i == ((java.lang.Integer) r1.getUpper()).intValue()) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00af, code lost:
    
        if (r1.intValue() == 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x011f, code lost:
    
        if (r7.f4009z.m2810a() == r1.getHeight()) goto L61;
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2754b(CaptureRequest.Key key, Object obj) {
        bor borVar = this.f3845b;
        if (key == CaptureRequest.CONTROL_AE_REGIONS) {
            if (this.f3988e.size() == 0) {
                obj = null;
            }
        } else if (key != CaptureRequest.CONTROL_AF_REGIONS) {
            boolean zEquals = false;
            if (key == CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE) {
                Range range = (Range) this.f3843A.get(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE);
                int i = this.f3991h;
                if (i == 0) {
                    if (this.f3992i != 0) {
                        i = 0;
                        if (range != null) {
                        }
                    } else {
                        zEquals = true;
                    }
                    if (true == zEquals) {
                        obj = null;
                    }
                } else if (range != null || i != ((Integer) range.getLower()).intValue()) {
                    if (true == zEquals) {
                        obj = null;
                    }
                }
            } else {
                if (key == CaptureRequest.JPEG_QUALITY) {
                    zEquals = Objects.equals(Byte.valueOf(this.f3997n), this.f3843A.get(CaptureRequest.JPEG_QUALITY));
                } else if (key == CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION) {
                    zEquals = Objects.equals(Integer.valueOf(this.f4000q), this.f3843A.get(CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION));
                } else if (key == CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE) {
                    Integer num = (Integer) this.f3843A.get(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE);
                    if (num != null && this.f4005v && num.intValue() == 1) {
                        zEquals = true;
                    } else if (this.f4005v) {
                    }
                } else if (key == CaptureRequest.CONTROL_AE_LOCK) {
                    zEquals = Objects.equals(Boolean.valueOf(this.f4006w), this.f3843A.get(CaptureRequest.CONTROL_AE_LOCK));
                } else if (key == CaptureRequest.CONTROL_AWB_LOCK) {
                    zEquals = Objects.equals(Boolean.valueOf(this.f4007x), this.f3843A.get(CaptureRequest.CONTROL_AWB_LOCK));
                } else if (key != CaptureRequest.JPEG_THUMBNAIL_SIZE) {
                    bop.m2814c(f3842a, "Settings implementation checked default of unhandled option key");
                    obj = null;
                } else if (this.f4009z != null) {
                    Size size = (Size) this.f3843A.get(CaptureRequest.JPEG_THUMBNAIL_SIZE);
                    if (this.f4009z.m2811b() == 0 && this.f4009z.m2810a() == 0) {
                        zEquals = true;
                    } else if (size == null || this.f4009z.m2811b() != size.getWidth()) {
                    }
                }
                if (true == zEquals) {
                    obj = null;
                }
            }
        } else if (this.f3989f.size() == 0) {
            obj = null;
        }
        borVar.m2823d(key, obj);
    }

    /* JADX INFO: renamed from: c */
    public final MeteringRectangle[] m2755c(List list) {
        if (list.size() <= 0) {
            return null;
        }
        MeteringRectangle[] meteringRectangleArr = new MeteringRectangle[list.size()];
        for (int i = 0; i < list.size(); i++) {
            Camera.Area area = (Camera.Area) list.get(i);
            Rect rect = area.rect;
            int i2 = rect.left + 1000;
            int i3 = rect.top + 1000;
            int i4 = rect.right + 1000;
            int i5 = rect.bottom + 1000;
            int i6 = this.f3846c.left;
            double dWidth = this.f3846c.width();
            int iWidth = this.f3846c.width() - 1;
            double d = i2;
            Double.isNaN(d);
            Double.isNaN(dWidth);
            int iM2752n = i6 + m2752n(dWidth * (d / 2000.0d), iWidth);
            int i7 = this.f3846c.top;
            double dHeight = this.f3846c.height();
            int iHeight = this.f3846c.height() - 1;
            double d2 = i3;
            Double.isNaN(d2);
            Double.isNaN(dHeight);
            int iM2752n2 = i7 + m2752n(dHeight * (d2 / 2000.0d), iHeight);
            int i8 = this.f3846c.left;
            double dWidth2 = this.f3846c.width();
            int iWidth2 = this.f3846c.width() - 1;
            double d3 = i4;
            Double.isNaN(d3);
            Double.isNaN(dWidth2);
            int iM2752n3 = i8 + m2752n(dWidth2 * (d3 / 2000.0d), iWidth2);
            int i9 = this.f3846c.top;
            double dHeight2 = this.f3846c.height();
            int iHeight2 = this.f3846c.height() - 1;
            double d4 = i5;
            Double.isNaN(d4);
            Double.isNaN(dHeight2);
            meteringRectangleArr[i] = new MeteringRectangle(iM2752n, iM2752n2, iM2752n3 - iM2752n, (i9 + m2752n(dHeight2 * (d4 / 2000.0d), iHeight2)) - iM2752n2, area.weight);
        }
        return meteringRectangleArr;
    }

    @Override // p000.boi
    /* JADX INFO: renamed from: d */
    public final void mo2756d() {
        float f;
        float fHeight;
        this.f3999p = 1.0f;
        this.f3846c.set(0, 0, m2752n(this.f3844B.width() / this.f3999p, this.f3844B.width()), m2752n(this.f3844B.height() / this.f3999p, this.f3844B.height()));
        this.f3846c.offsetTo((this.f3844B.width() - this.f3846c.width()) / 2, (this.f3844B.height() - this.f3846c.height()) / 2);
        Rect rect = this.f3846c;
        bon bonVar = this.f3994k;
        float fWidth = rect.width();
        float fHeight2 = rect.height();
        float fM2811b = bonVar.m2811b() / bonVar.m2810a();
        if (fM2811b < fWidth / fHeight2) {
            fHeight = rect.height();
            f = fM2811b * fHeight;
        } else {
            float fWidth2 = rect.width();
            float f2 = fWidth2 / fM2811b;
            f = fWidth2;
            fHeight = f2;
        }
        Matrix matrix = new Matrix();
        RectF rectF = new RectF(0.0f, 0.0f, f, fHeight);
        matrix.setTranslate(rect.exactCenterX(), rect.exactCenterY());
        matrix.postTranslate(-rectF.centerX(), -rectF.centerY());
        matrix.mapRect(rectF);
        rectF.roundOut(new Rect());
    }

    public bmv(bmv bmvVar) {
        super(bmvVar);
        this.f3843A = bmvVar.f3843A;
        this.f3845b = new bor(bmvVar.f3845b);
        this.f3844B = bmvVar.f3844B;
        this.f3846c = new Rect(bmvVar.f3846c);
    }
}
