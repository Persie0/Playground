package p000;

import android.R;
import android.content.Context;
import android.graphics.RectF;
import android.hardware.HardwareBuffer;
import android.os.SystemClock;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import androidx.work.impl.workers.NHKG.pIeXJQLZLfgIN;
import com.google.android.libraries.oliveoil.p018gl.EGLImage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cgr implements ipk {

    /* JADX INFO: renamed from: a */
    private static final nbh f5669a = nbh.m17259h("com/google/android/apps/camera/aizoom/AiZoomViewEffect");

    /* JADX INFO: renamed from: b */
    private final lby f5670b;

    /* JADX INFO: renamed from: c */
    private final Interpolator f5671c;

    /* JADX INFO: renamed from: d */
    private HardwareBuffer f5672d;

    /* JADX INFO: renamed from: e */
    private RectF f5673e;

    /* JADX INFO: renamed from: f */
    private boolean f5674f;

    /* JADX INFO: renamed from: g */
    private boolean f5675g;

    /* JADX INFO: renamed from: h */
    private cgq f5676h;

    /* JADX INFO: renamed from: i */
    private long f5677i = 0;

    /* JADX INFO: renamed from: j */
    private long f5678j = 0;

    /* JADX INFO: renamed from: k */
    private final ldx f5679k;

    public cgr(lby lbyVar, Context context) {
        this.f5670b = lbyVar;
        lpe lpeVarM15225o = ldx.m15225o(lbyVar);
        lpeVarM15225o.m15804b(kua.m14876o(ldx.m15219h(lbyVar, "#version 300 es\nin vec2 aPosition;\nin vec2 aTexCoord;\nout vec2 texCoord;\nuniform float zoomFactor;\nvoid main() {\n  texCoord = (aTexCoord - 0.5f) * zoomFactor + 0.5f ;\n  gl_Position = vec4(aPosition.xy, 0.0, 1.0);\n}")));
        lpeVarM15225o.m15804b(kua.m14876o(ldx.m15217b(lbyVar, "#version 300 es\n#extension GL_OES_EGL_image_external_essl3 : require\n#extension GL_EXT_YUV_target : enable\nprecision mediump float;\nuniform samplerExternalOES uImgTex;\nuniform float insideRadius;\nuniform float outsideRadius;\nuniform float insideStroke;\nuniform float outsideStroke;\nuniform vec2 viewportXY;\nuniform vec2 viewportSize;\nuniform vec2 trackPos;\nuniform vec2 trackHalfSize;\nuniform vec2 bracketLimit;\nuniform vec3 innerColor;\nin vec2 texCoord;\nlayout(yuv) out vec4 outColor;\nbool roundedBox(vec2 fragCoord, vec2 pos, vec2 size, float radius) {\n   float d = length(max(abs(fragCoord - pos),size) - size) - radius;\n   return d > 0.0;\n}\nbool roundedFrame(vec2 fragCoord, vec2 pos, vec2 size, float radius, float border) {\n   vec2 dxy = abs(fragCoord - pos);\n   float d = length(max(dxy, size) - size) - radius;\n   return abs(d) < border && (dxy.x >= bracketLimit.x && dxy.y >= bracketLimit.y);\n}\nvoid main() {\n    vec2 fragCoord = gl_FragCoord.xy - viewportXY;\n    if(roundedBox(fragCoord, 0.5 * viewportSize,\n        0.5 * viewportSize - outsideRadius - outsideStroke,\n        outsideRadius + outsideStroke)){ \n        discard;\n    }\n    float pipFrame = float(roundedBox(fragCoord, 0.5 * viewportSize, 0.5 * viewportSize - outsideRadius - outsideStroke, outsideRadius));\n    float bbox = float(roundedFrame(fragCoord, trackPos,\n         trackHalfSize - insideRadius + insideStroke, insideRadius, insideStroke));\n    vec3 rgbColor = bbox * innerColor + \n                    (1.0 - bbox) * texture(uImgTex, texCoord).rgb;\n    if (bool(pipFrame)) { \n        rgbColor = vec3(1.0);\n    }\n    outColor = vec4(rgb_2_yuv(rgbColor, itu_601_full_range), 1.0);\n}")));
        this.f5679k = lpeVarM15225o.m15806d();
        this.f5671c = AnimationUtils.loadInterpolator(context, R.interpolator.fast_out_extra_slow_in);
    }

    @Override // p000.ipk
    /* JADX INFO: renamed from: a */
    public final ipl mo3652a() {
        return ipl.f31746j;
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
    public final synchronized void close() {
        nbz nbzVar = nch.f41987a;
        m3658g();
        this.f5679k.mo15079a();
    }

    /* JADX INFO: renamed from: d */
    public final synchronized void m3655d() {
        this.f5675g = false;
        HardwareBuffer hardwareBuffer = this.f5672d;
        if (hardwareBuffer != null) {
            hardwareBuffer.close();
        }
        this.f5672d = null;
    }

    /* JADX INFO: renamed from: e */
    public final synchronized void m3656e() {
        this.f5677i = SystemClock.elapsedRealtime();
        this.f5678j = 0L;
    }

    /* JADX INFO: renamed from: f */
    public final synchronized void m3657f() {
        if (this.f5677i == 0) {
            this.f5678j = SystemClock.elapsedRealtime();
        } else {
            this.f5678j = (500 - Math.min(500L, SystemClock.elapsedRealtime() - this.f5677i)) + SystemClock.elapsedRealtime();
            this.f5677i = 0L;
        }
    }

    /* JADX INFO: renamed from: g */
    public final synchronized void m3658g() {
        m3655d();
    }

    /* JADX INFO: renamed from: h */
    public final synchronized void m3659h(kpw kpwVar, RectF rectF, boolean z) {
        if (!this.f5675g) {
            nbz nbzVar = nch.f41987a;
            kpwVar.close();
            return;
        }
        HardwareBuffer hardwareBuffer = this.f5672d;
        if (hardwareBuffer != null) {
            hardwareBuffer.close();
        }
        this.f5672d = kpwVar.mo7250f();
        if (rectF != null) {
            this.f5673e = rectF;
        } else {
            ((nbe) ((nbe) f5669a.m17252c().mo17282g(nch.f41987a, "BobaEffect")).mo17276G((char) 132)).mo17290o("TrackRegion is null, reusing last known good.");
        }
        this.f5674f = z;
    }

    /* JADX INFO: renamed from: i */
    public final synchronized void m3660i(cgq cgqVar) {
        this.f5676h = cgqVar;
    }

    /* JADX INFO: renamed from: j */
    public final synchronized void m3661j(cgt cgtVar) {
        if (!this.f5675g && cgtVar != cgt.HIDDEN) {
            this.f5675g = true;
            if (cgtVar == cgt.COLLAPSED) {
                this.f5677i = (long) (SystemClock.elapsedRealtime() - 500.0f);
            } else {
                this.f5677i = 0L;
                this.f5678j = 0L;
            }
        }
    }

    @Override // p000.ipk
    /* JADX INFO: renamed from: k */
    public final /* synthetic */ boolean mo3662k() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:122:0x0223 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:145:? A[Catch: all -> 0x0234, SYNTHETIC, TryCatch #8 {, blocks: (B:4:0x0003, B:6:0x0008, B:9:0x002b, B:11:0x002f, B:13:0x0033, B:16:0x0039, B:51:0x01d6, B:109:0x022c, B:108:0x0229, B:110:0x022d, B:104:0x0223), top: B:128:0x0003, inners: #3 }] */
    @Override // p000.ipk
    /* JADX INFO: renamed from: l */
    public final synchronized int mo3663l(kpw kpwVar, kpw kpwVar2) {
        HardwareBuffer hardwareBuffer;
        Throwable th;
        Throwable th2;
        Throwable th3;
        Throwable th4;
        float interpolation;
        if (this.f5676h == null) {
            ((nbe) ((nbe) f5669a.m17252c().mo17282g(nch.f41987a, "BobaEffect")).mo17276G(129)).mo17292q("Parameters not set, skipping frame %s.", kpwVar.mo7248d());
            return 2;
        }
        if (this.f5675g && this.f5672d != null && this.f5673e != null) {
            HardwareBuffer hardwareBufferMo7250f = kpwVar.mo7250f();
            if (hardwareBufferMo7250f == null) {
                try {
                    nbz nbzVar = nch.f41987a;
                    return 2;
                } catch (Throwable th5) {
                    th = th5;
                    hardwareBuffer = hardwareBufferMo7250f;
                }
            } else {
                try {
                    try {
                        EGLImage eGLImage = new EGLImage(hardwareBufferMo7250f);
                        try {
                            try {
                                HardwareBuffer hardwareBuffer2 = this.f5672d;
                                hardwareBuffer2.getClass();
                                EGLImage eGLImage2 = new EGLImage(hardwareBuffer2);
                                try {
                                    try {
                                        lcy lcyVarM15192b = lcy.m15192b(this.f5670b, eGLImage2);
                                        try {
                                            try {
                                                ldx ldxVarM15220j = ldx.m15220j(this.f5670b, eGLImage);
                                                try {
                                                    float f = 1.0f;
                                                    if (this.f5677i != 0) {
                                                        interpolation = this.f5671c.getInterpolation(Math.min(1.0f, (SystemClock.elapsedRealtime() - this.f5677i) / 500.0f));
                                                    } else {
                                                        interpolation = this.f5678j != 0 ? 1.0f - this.f5671c.getInterpolation(Math.min(1.0f, (SystemClock.elapsedRealtime() - this.f5678j) / 500.0f)) : 0.0f;
                                                    }
                                                    cgq cgqVar = this.f5676h;
                                                    float f2 = 1.0f - interpolation;
                                                    float f3 = (cgqVar.f5665i * interpolation) + (cgqVar.f5658b * f2);
                                                    float f4 = (cgqVar.f5666j * interpolation) + (cgqVar.f5659c * f2);
                                                    kan kanVar = cgqVar.f5657a;
                                                    if (this.f5674f) {
                                                        if (kanVar.equals(kan.f35487b)) {
                                                            f = 0.574f;
                                                        } else {
                                                            f = kanVar.equals(kan.f35486a) ? 0.766f : 1.039f;
                                                        }
                                                    }
                                                    float f5 = 0.5f / f;
                                                    RectF rectF = this.f5673e;
                                                    rectF.getClass();
                                                    int i = (int) f3;
                                                    float fWidth = rectF.width() * f5;
                                                    RectF rectF2 = this.f5673e;
                                                    rectF2.getClass();
                                                    int i2 = (int) f4;
                                                    float fHeight = f5 * rectF2.height();
                                                    lct lctVarM15890c = lct.m15169i(ldg.m15200a(this.f5670b)).m15890c(this.f5679k);
                                                    lctVarM15890c.m15172b(lcyVarM15192b);
                                                    lctVarM15890c.m15174d("zoomFactor", f);
                                                    lctVarM15890c.m15174d("insideStroke", this.f5676h.f5661e);
                                                    lctVarM15890c.m15174d("outsideStroke", this.f5676h.f5662f);
                                                    cgq cgqVar2 = this.f5676h;
                                                    hardwareBuffer = hardwareBufferMo7250f;
                                                    try {
                                                        lctVarM15890c.m15174d("insideRadius", (cgqVar2.f5667k * interpolation) + (cgqVar2.f5663g * f2));
                                                        cgq cgqVar3 = this.f5676h;
                                                        lctVarM15890c.m15174d("outsideRadius", (interpolation * cgqVar3.f5668l) + (f2 * cgqVar3.f5664h));
                                                        float f6 = this.f5676h.f5660d;
                                                        lctVarM15890c.m15178h("viewportXY", f6, f6);
                                                        float f7 = i2;
                                                        float f8 = i;
                                                        lctVarM15890c.m15178h(pIeXJQLZLfgIN.BnELtiqXKXVY, f7, f8);
                                                        lctVarM15890c.m15178h("bracketLimit", 0.0f, 0.0f);
                                                        RectF rectF3 = this.f5673e;
                                                        rectF3.getClass();
                                                        float fCenterY = ((rectF3.centerY() - 0.5f) / f) + 0.5f;
                                                        RectF rectF4 = this.f5673e;
                                                        rectF4.getClass();
                                                        lctVarM15890c.m15178h("trackPos", fCenterY * f7, (((0.5f - rectF4.centerX()) / f) + 0.5f) * f8);
                                                        lctVarM15890c.m15178h("trackHalfSize", fHeight * f7, fWidth * f8);
                                                        lctVarM15890c.f37944e.put("innerColor", new lcp());
                                                        lctVarM15890c.m15171a("aPosition", 0);
                                                        lctVarM15890c.m15171a("aTexCoord", 1);
                                                        int i3 = this.f5676h.f5660d;
                                                        lctVarM15890c.f37947h = new int[]{i3, i3, i2, i};
                                                        lctVarM15890c.f37948i.add(3042);
                                                        lctVarM15890c.m15179k(ldxVarM15220j);
                                                        lzd.m16234m(this.f5670b);
                                                        ldxVarM15220j.close();
                                                        lcyVarM15192b.close();
                                                        eGLImage2.close();
                                                        eGLImage.close();
                                                        hardwareBuffer.close();
                                                        return 1;
                                                    } catch (Throwable th6) {
                                                        th = th6;
                                                        Throwable th7 = th;
                                                        try {
                                                            ldxVarM15220j.close();
                                                            throw th7;
                                                        } catch (Throwable th8) {
                                                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th7, th8);
                                                            throw th7;
                                                        }
                                                    }
                                                } catch (Throwable th9) {
                                                    th = th9;
                                                    hardwareBuffer = hardwareBufferMo7250f;
                                                }
                                            } catch (Throwable th10) {
                                                th = th10;
                                                th4 = th;
                                                try {
                                                    lcyVarM15192b.close();
                                                    throw th4;
                                                } catch (Throwable th11) {
                                                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th4, th11);
                                                    throw th4;
                                                }
                                            }
                                        } catch (Throwable th12) {
                                            th = th12;
                                            hardwareBuffer = hardwareBufferMo7250f;
                                            th4 = th;
                                            lcyVarM15192b.close();
                                            throw th4;
                                        }
                                    } catch (Throwable th13) {
                                        th = th13;
                                        th3 = th;
                                        try {
                                            eGLImage2.close();
                                            throw th3;
                                        } catch (Throwable th14) {
                                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th3, th14);
                                            throw th3;
                                        }
                                    }
                                } catch (Throwable th15) {
                                    th = th15;
                                    hardwareBuffer = hardwareBufferMo7250f;
                                    th3 = th;
                                    eGLImage2.close();
                                    throw th3;
                                }
                            } catch (Throwable th16) {
                                th = th16;
                                th2 = th;
                                try {
                                    eGLImage.close();
                                    throw th2;
                                } catch (Throwable th17) {
                                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th2, th17);
                                    throw th2;
                                }
                            }
                        } catch (Throwable th18) {
                            th = th18;
                            hardwareBuffer = hardwareBufferMo7250f;
                            th2 = th;
                            eGLImage.close();
                            throw th2;
                        }
                    } catch (Throwable th19) {
                        th = th19;
                        th = th;
                        if (hardwareBuffer == null) {
                            throw th;
                        }
                        try {
                            hardwareBuffer.close();
                            throw th;
                        } catch (Throwable th20) {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th20);
                            throw th;
                        }
                    }
                } catch (Throwable th21) {
                    th = th21;
                    hardwareBuffer = hardwareBufferMo7250f;
                    th = th;
                    if (hardwareBuffer == null) {
                        throw th;
                    }
                    hardwareBuffer.close();
                    throw th;
                }
            }
            if (hardwareBuffer == null) {
                throw th;
            }
            hardwareBuffer.close();
            throw th;
        }
        nbz nbzVar2 = nch.f41987a;
        kpwVar.mo7248d();
        return 2;
    }

    @Override // p000.ipk
    /* JADX INFO: renamed from: m */
    public final /* synthetic */ int mo3664m(key keyVar, kgg kggVar, key keyVar2) {
        return kbd.m13927p(this, keyVar, kggVar, keyVar2);
    }

    @Override // p000.ipk
    /* JADX INFO: renamed from: n */
    public final /* synthetic */ int mo3665n(lcy lcyVar, ldx ldxVar) {
        return kbd.m13928q();
    }
}
