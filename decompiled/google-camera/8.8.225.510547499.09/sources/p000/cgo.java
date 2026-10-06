package p000;

import android.hardware.HardwareBuffer;
import android.view.SurfaceView;
import com.google.android.libraries.oliveoil.p018gl.EGLImage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cgo implements kba {

    /* JADX INFO: renamed from: a */
    private static final nbh f5645a = nbh.m17259h("com/google/android/apps/camera/aizoom/AiZoomPreviewRenderer");

    /* JADX INFO: renamed from: b */
    private static final float[] f5646b = {0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f};

    /* JADX INFO: renamed from: c */
    private final lby f5647c;

    /* JADX INFO: renamed from: d */
    private final lea f5648d;

    /* JADX INFO: renamed from: f */
    private volatile ldx f5650f = null;

    /* JADX INFO: renamed from: e */
    private boolean f5649e = false;

    public cgo(bko bkoVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        lby lbyVarM2626t = bkoVar.m2626t("BobaRenderer");
        this.f5647c = lbyVarM2626t;
        this.f5648d = lea.m15230a(lbyVarM2626t);
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m3649a(SurfaceView surfaceView) {
        if (this.f5649e) {
            ((nbe) ((nbe) f5645a.m17252c().mo17282g(nch.f41987a, "BobaRenderer")).mo17276G('w')).mo17290o("Error clearing target view, already closed.");
            return;
        }
        if (this.f5650f == null) {
            this.f5650f = ldx.m15222l(this.f5647c, surfaceView);
        }
        ldx ldxVar = this.f5650f;
        ldxVar.getClass();
        ldxVar.m15166e(fse.f23449d, new kzc((Runnable) new kxw(ldxVar, 8, null, null), 5)).mo15109h(kzj.f37771a);
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m3650b(kpw kpwVar, SurfaceView surfaceView) {
        if (this.f5649e) {
            ((nbe) ((nbe) f5645a.m17252c().mo17282g(nch.f41987a, "BobaRenderer")).mo17276G('{')).mo17290o("Error rendering image, already closed.");
            return;
        }
        if (this.f5650f == null) {
            this.f5650f = ldx.m15222l(this.f5647c, surfaceView);
        }
        HardwareBuffer hardwareBufferMo7250f = kpwVar.mo7250f();
        if (hardwareBufferMo7250f != null) {
            try {
                EGLImage eGLImage = new EGLImage(hardwareBufferMo7250f);
                try {
                    lcy lcyVarM15192b = lcy.m15192b(this.f5647c, eGLImage);
                    try {
                        lea leaVar = this.f5648d;
                        ldx ldxVar = this.f5650f;
                        ldxVar.getClass();
                        leaVar.m15236f(lcyVarM15192b, ldxVar, f5646b);
                        lzd.m16234m(this.f5647c);
                        lcyVarM15192b.close();
                        eGLImage.close();
                    } catch (Throwable th) {
                        try {
                            lcyVarM15192b.close();
                        } catch (Throwable th2) {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    try {
                        eGLImage.close();
                    } catch (Throwable th4) {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th3, th4);
                    }
                    throw th3;
                }
            } catch (Throwable th5) {
                try {
                    hardwareBufferMo7250f.close();
                } catch (Throwable th6) {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th5, th6);
                }
                throw th5;
            }
        }
        if (hardwareBufferMo7250f != null) {
            hardwareBufferMo7250f.close();
        }
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f5649e) {
            ((nbe) ((nbe) f5645a.m17252c().mo17282g(nch.f41987a, "BobaRenderer")).mo17276G('x')).mo17290o("Already closed.");
            return;
        }
        nbz nbzVar = nch.f41987a;
        if (this.f5650f != null) {
            this.f5650f.close();
            this.f5650f = null;
        }
        this.f5648d.m15233c();
        this.f5647c.close();
        this.f5649e = true;
    }
}
