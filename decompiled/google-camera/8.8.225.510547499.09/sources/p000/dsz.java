package p000;

import android.graphics.Rect;
import android.hardware.HardwareBuffer;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureResult;
import android.util.ArrayMap;
import android.util.SizeF;
import com.google.android.libraries.oliveoil.p018gl.EGLImage;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dsz implements ipk {

    /* JADX INFO: renamed from: a */
    private static final nbh f12523a = nbh.m17259h("com/google/android/apps/camera/fastzoom/FastZoomEffect");

    /* JADX INFO: renamed from: b */
    private static final String f12524b = lyz.m16212h("\n").m16217g("in vec2 position;", "uniform float zoomFactor;", "out vec2 texCoord;", "void main() {", "  texCoord = (1.0 + position) / 2.0;", "  gl_Position = vec4(zoomFactor * position, 0.0, 1.0);", "}");

    /* JADX INFO: renamed from: c */
    private static final String f12525c = lyz.m16212h("\n").m16217g("#extension GL_EXT_YUV_target : enable", "precision highp float;", "uniform highp sampler2D imgTex;", "in vec2 texCoord;", "layout(yuv) out vec4 outColor;", "void main() {", "  outColor = vec4(rgb_2_yuv(texture(imgTex, texCoord).rgb, itu_601_full_range), 1.0);", "}");

    /* JADX INFO: renamed from: d */
    private static final float[] f12526d = {-1.0f, -1.0f, 1.0f, -1.0f, 1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, -1.0f, 1.0f};

    /* JADX INFO: renamed from: f */
    private final lec f12528f;

    /* JADX INFO: renamed from: g */
    private final lea f12529g;

    /* JADX INFO: renamed from: h */
    private final lby f12530h;

    /* JADX INFO: renamed from: i */
    private ldz f12531i;

    /* JADX INFO: renamed from: j */
    private kmq f12532j;

    /* JADX INFO: renamed from: m */
    private final ldx f12535m;

    /* JADX INFO: renamed from: n */
    private ldx f12536n;

    /* JADX INFO: renamed from: o */
    private final cvy f12537o;

    /* JADX INFO: renamed from: e */
    private final Map f12527e = new ArrayMap();

    /* JADX INFO: renamed from: k */
    private float f12533k = 1.0f;

    /* JADX INFO: renamed from: l */
    private float f12534l = 0.001953125f;

    public dsz(lby lbyVar, cvy cvyVar, byte[] bArr) {
        this.f12530h = lbyVar;
        this.f12537o = cvyVar;
        led ledVarM15243a = led.m15243a(f12526d);
        int i = ledVarM15243a.f38023a;
        int i2 = ledVarM15243a.f38025c;
        int i3 = i2 * 32 * i;
        lay[] layVarArr = {ledVarM15243a.f38024b};
        int[] iArr = {i2};
        ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(i3 / 8).order(ByteOrder.nativeOrder());
        for (int i4 = 0; i4 < i; i4++) {
            ledVarM15243a.m15246c(i4, byteBufferOrder);
        }
        byteBufferOrder.rewind();
        this.f12528f = new lec(lbs.m15151b(lbyVar, 34962, byteBufferOrder), layVarArr, iArr, i);
        this.f12529g = lea.m15230a(lbyVar);
        lpe lpeVarM15225o = ldx.m15225o(lbyVar);
        lpeVarM15225o.m15804b(kua.m14876o(ldx.m15219h(lbyVar, f12524b)));
        lpeVarM15225o.m15804b(kua.m14876o(ldx.m15217b(lbyVar, f12525c)));
        this.f12535m = lpeVarM15225o.m15806d();
        this.f12532j = (kmq) ((AtomicReference) cvyVar.f9844a).get();
    }

    /* JADX INFO: renamed from: d */
    private final boolean m6715d(float f, float f2) {
        return Math.abs(f - f2) < this.f12534l;
    }

    @Override // p000.ipk
    /* JADX INFO: renamed from: a */
    public final ipl mo3652a() {
        return ipl.ZEBRAS;
    }

    @Override // p000.ipk
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ lby mo3653b() {
        return null;
    }

    @Override // p000.ipk
    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String mo3654c() {
        return kbd.m13925n(this);
    }

    @Override // p000.ipk, p000.kba, java.lang.AutoCloseable
    public final void close() {
        ldz ldzVar = this.f12531i;
        if (ldzVar != null) {
            ldzVar.mo15079a();
            this.f12531i = null;
        }
        ldx ldxVar = this.f12536n;
        if (ldxVar != null) {
            ldxVar.mo15079a();
            this.f12536n = null;
        }
        this.f12528f.mo15079a();
        this.f12535m.mo15079a();
        this.f12529g.m15233c();
    }

    @Override // p000.ipk
    /* JADX INFO: renamed from: k */
    public final boolean mo3662k() {
        return !m6715d(this.f12537o.m5631h(), this.f12533k);
    }

    @Override // p000.ipk
    /* JADX INFO: renamed from: l */
    public final /* synthetic */ int mo3663l(kpw kpwVar, kpw kpwVar2) {
        return kbd.m13926o(this, kpwVar, kpwVar2);
    }

    @Override // p000.ipk
    /* JADX INFO: renamed from: m */
    public final int mo3664m(key keyVar, kgg kggVar, key keyVar2) throws IllegalAccessException, InvocationTargetException {
        dsx dsxVarM2629w;
        kpl kplVar;
        dsx dsxVarM2629w2;
        kpl kplVar2;
        kmq kmqVar = (kmq) ((AtomicReference) this.f12537o.f9844a).get();
        if (kmqVar == null) {
            return 2;
        }
        if (this.f12532j == null) {
            this.f12532j = kmqVar;
        }
        if (this.f12532j == kmqVar && (dsxVarM2629w = ((bko) this.f12537o.f9845b).m2629w()) != null) {
            if (this.f12531i == null || this.f12536n == null) {
                dsx dsxVarM2629w3 = ((bko) this.f12537o.f9845b).m2629w();
                if (dsxVarM2629w3 != null) {
                    kbc kbcVar = (kbc) dsxVarM2629w3.f12522b;
                    ldz ldzVarM15227g = ldz.m15227g(this.f12530h, new lbm(kzh.m15087d(kbcVar.f35517a, kbcVar.f35518b)));
                    this.f12531i = ldzVarM15227g;
                    this.f12536n = ldx.m15223m(kua.m14875n(ldzVarM15227g));
                    this.f12534l = 2.0f / Math.max(kbcVar.f35517a, kbcVar.f35518b);
                }
            }
            ldz ldzVar = this.f12531i;
            ldx ldxVar = this.f12536n;
            kpp kppVarMo7042c = keyVar.mo7042c();
            if (ldxVar == null || ldzVar == null || kppVarMo7042c == null || m6715d(this.f12537o.m5631h(), this.f12533k)) {
                return 2;
            }
            String str = (String) kppVarMo7042c.mo9517d(CaptureResult.LOGICAL_MULTI_CAMERA_ACTIVE_PHYSICAL_ID);
            Map mapMo9520g = kppVarMo7042c.mo9520g();
            if (str != null && !mapMo9520g.isEmpty() && (kplVar2 = (kpl) mapMo9520g.get(str)) == null) {
                kplVar = kppVarMo7042c;
                kplVar = kppVarMo7042c;
                kplVar = kplVar2;
                Map.Entry entry = (Map.Entry) ((mwx) mapMo9520g).entrySet().iterator().next();
                ((nbe) ((nbe) f12523a.m17252c()).mo17276G(1133)).mo17301z("Missing camera metadata for activeId=%s. Resorting to metadata from id=%s", str, entry.getKey());
                str = (String) entry.getKey();
                kplVar = (kpl) entry.getValue();
            }
            kplVar = kppVarMo7042c;
            kplVar = kppVarMo7042c;
            kplVar = kplVar2;
            kplVar = kppVarMo7042c;
            kplVar = kppVarMo7042c;
            kplVar = kppVarMo7042c;
            if (this.f12527e.isEmpty() && (dsxVarM2629w2 = ((bko) this.f12537o.f9845b).m2629w()) != null) {
                List<kmg> listM11495j = ((imu) dsxVarM2629w2.f12521a).m11495j();
                if (listM11495j.size() > 1) {
                    kmd kmdVarM11491f = ((imu) dsxVarM2629w2.f12521a).m11491f();
                    SizeF sizeF = (SizeF) kmdVarM11491f.mo14559l(CameraCharacteristics.SENSOR_INFO_PHYSICAL_SIZE);
                    float[] fArr = (float[]) kmdVarM11491f.mo14559l(CameraCharacteristics.LENS_INFO_AVAILABLE_FOCAL_LENGTHS);
                    if (sizeF != null && fArr != null) {
                        float fM14987ae = kxk.m14987ae(fArr);
                        for (kmg kmgVar : listM11495j) {
                            SizeF sizeF2 = (SizeF) ((imu) dsxVarM2629w2.f12521a).m11486a(kmgVar.f36540a).mo14559l(CameraCharacteristics.SENSOR_INFO_PHYSICAL_SIZE);
                            if (sizeF2 != null) {
                                this.f12527e.put(kmgVar.f36540a, Float.valueOf((sizeF.getWidth() / fM14987ae) / sizeF2.getWidth()));
                            }
                        }
                    }
                }
            }
            Rect rect = (Rect) kplVar.mo9517d(CaptureResult.SCALER_CROP_REGION);
            if (rect == null) {
                ((nbe) ((nbe) f12523a.m17251b()).mo17276G((char) 1132)).mo17290o("Scaler crop region unexpectedly missing.");
                return 2;
            }
            Float f = (Float) kplVar.mo9517d(CaptureResult.LENS_FOCAL_LENGTH);
            if (f == null) {
                ((nbe) ((nbe) f12523a.m17251b()).mo17276G((char) 1131)).mo17290o("Focal length unexpectedly missing.");
                return 2;
            }
            float fFloatValue = this.f12527e.containsKey(str) ? ((Float) this.f12527e.get(str)).floatValue() * f.floatValue() : 1.0f;
            Rect rect2 = (Rect) ((imu) dsxVarM2629w.f12521a).m11486a(str).mo14559l(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
            if (rect2 == null) {
                ((nbe) ((nbe) f12523a.m17251b()).mo17276G((char) 1130)).mo17290o("Active array size unexpectedly missing.");
                return 2;
            }
            float fWidth = (rect2.width() / rect.width()) * fFloatValue;
            float fMax = Math.max(1.0f, this.f12537o.m5631h() / fWidth);
            this.f12533k = fWidth;
            kpw kpwVarMo7043d = keyVar.mo7043d(kggVar);
            try {
                if (kpwVarMo7043d == null) {
                    ((nbe) ((nbe) f12523a.m17251b()).mo17276G(1129)).mo17290o("inputImage unexpectedly null");
                    return 2;
                }
                HardwareBuffer hardwareBufferMo7250f = kpwVarMo7043d.mo7250f();
                try {
                    hardwareBufferMo7250f.getClass();
                    EGLImage eGLImage = new EGLImage(hardwareBufferMo7250f);
                    try {
                        lcy lcyVarM15192b = lcy.m15192b(this.f12530h, eGLImage);
                        try {
                            ldx ldxVarM15220j = ldx.m15220j(this.f12530h, eGLImage);
                            try {
                                this.f12529g.m15235e(lcyVarM15192b, ldxVar);
                                lec lecVar = this.f12528f;
                                lku.m15669w(lecVar.f38021c % 3 == 0);
                                lct lctVarM15890c = new lqq(4, lecVar, (ldf) null).m15890c(this.f12535m);
                                lctVarM15890c.m15171a("position", 0);
                                lctVarM15890c.m15174d("zoomFactor", fMax);
                                lctVarM15890c.m15173c("imgTex", ldzVar);
                                lctVarM15890c.m15179k(ldxVarM15220j);
                                lzd.m16234m(this.f12530h);
                                ldxVarM15220j.close();
                                lcyVarM15192b.close();
                                eGLImage.close();
                                hardwareBufferMo7250f.close();
                                kpwVarMo7043d.close();
                                return 1;
                            } catch (Throwable th) {
                                try {
                                    ldxVarM15220j.close();
                                    throw th;
                                } catch (Throwable th2) {
                                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                                    throw th;
                                }
                            }
                        } catch (Throwable th3) {
                            try {
                                lcyVarM15192b.close();
                                throw th3;
                            } catch (Throwable th4) {
                                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th3, th4);
                                throw th3;
                            }
                        }
                    } catch (Throwable th5) {
                        try {
                            eGLImage.close();
                            throw th5;
                        } catch (Throwable th6) {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th5, th6);
                            throw th5;
                        }
                    }
                } catch (Throwable th7) {
                    if (hardwareBufferMo7250f == null) {
                        throw th7;
                    }
                    try {
                        hardwareBufferMo7250f.close();
                        throw th7;
                    } catch (Throwable th8) {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th7, th8);
                        throw th7;
                    }
                }
            } catch (Throwable th9) {
                if (kpwVarMo7043d == null) {
                    throw th9;
                }
                try {
                    kpwVarMo7043d.close();
                    throw th9;
                } catch (Throwable th10) {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th9, th10);
                    throw th9;
                }
            }
        }
        return 2;
    }

    @Override // p000.ipk
    /* JADX INFO: renamed from: n */
    public final /* synthetic */ int mo3665n(lcy lcyVar, ldx ldxVar) {
        return kbd.m13928q();
    }
}
