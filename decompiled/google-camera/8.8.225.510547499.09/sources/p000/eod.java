package p000;

import android.hardware.HardwareBuffer;
import android.location.Location;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.opengl.Matrix;
import android.view.Surface;
import com.google.android.libraries.oliveoil.p018gl.EGLImage;
import java.io.FileOutputStream;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class eod implements kba {

    /* JADX INFO: renamed from: a */
    public static final nbh f14836a = nbh.m17259h("com/google/android/apps/camera/kepler/AstrolapseEncoder");

    /* JADX INFO: renamed from: g */
    private static final float[] f14837g = {1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 1.0f};

    /* JADX INFO: renamed from: b */
    public final ExecutorService f14838b = jzn.m13824l("resource-closing");

    /* JADX INFO: renamed from: c */
    public final lby f14839c;

    /* JADX INFO: renamed from: d */
    public final lea f14840d;

    /* JADX INFO: renamed from: e */
    public final Surface f14841e;

    /* JADX INFO: renamed from: f */
    public final ldx f14842f;

    /* JADX INFO: renamed from: h */
    private final lex f14843h;

    /* JADX INFO: renamed from: i */
    private final kay f14844i;

    /* JADX INFO: renamed from: j */
    private final Executor f14845j;

    /* JADX INFO: renamed from: k */
    private final AtomicBoolean f14846k;

    public eod(bko bkoVar, fca fcaVar, Executor executor, FileOutputStream fileOutputStream, kbc kbcVar, kay kayVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        Surface surfaceCreatePersistentInputSurface = MediaCodec.createPersistentInputSurface();
        this.f14841e = surfaceCreatePersistentInputSurface;
        this.f14846k = new AtomicBoolean(false);
        this.f14844i = kayVar;
        kbc kbcVarM13909i = kbcVar.m13909i(kayVar);
        nbz nbzVar = nch.f41987a;
        int i = kayVar.f35503e;
        MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat("video/avc", kbcVarM13909i.f35517a, kbcVarM13909i.f35518b);
        mediaFormatCreateVideoFormat.setInteger("profile", 8);
        mediaFormatCreateVideoFormat.setInteger("level", 32768);
        mediaFormatCreateVideoFormat.setInteger("bitrate", 38000000);
        mediaFormatCreateVideoFormat.setInteger("color-format", 2130708361);
        mediaFormatCreateVideoFormat.setInteger("frame-rate", 10);
        mediaFormatCreateVideoFormat.setFloat("i-frame-interval", 1.0f);
        lfm lfmVarM14877p = kua.m14877p(executor);
        lfmVarM14877p.m15284c(fileOutputStream.getFD());
        lfmVarM14877p.m15283b(0);
        mrm mrmVarMo8117c = fcaVar.mo8117c();
        if (mrmVarMo8117c.mo16813g()) {
            Location location = (Location) mrmVarMo8117c.mo16809c();
            lfmVarM14877p.f38148b = kxk.m14965K(Float.valueOf((float) location.getLatitude()));
            lfmVarM14877p.f38149c = kxk.m14965K(Float.valueOf((float) location.getLongitude()));
        }
        lfi lfiVarM15282a = lfmVarM14877p.m15282a();
        ((lfj) lfiVarM15282a).f38130g.mo2282d(new elu(fileOutputStream, 6), executor);
        lex lexVarM14879r = kua.m14879r(lfiVarM15282a);
        this.f14843h = lexVarM14879r;
        lfc lfcVarM15277c = ((lfa) lexVarM14879r).m15277c(mediaFormatCreateVideoFormat);
        lfcVarM15277c.f38114d = false;
        lfcVarM15277c.f38115e = surfaceCreatePersistentInputSurface;
        lfcVarM15277c.m15278a();
        lby lbyVarM2626t = bkoVar.m2626t("glContext");
        this.f14839c = lbyVarM2626t;
        this.f14840d = lea.m15230a(lbyVarM2626t);
        this.f14842f = ldx.m15221k(lbyVarM2626t, new leh(surfaceCreatePersistentInputSurface), kzi.m15087d(kbcVarM13909i.f35517a, kbcVarM13909i.f35518b));
        lexVarM14879r.mo15276b();
        this.f14845j = executor;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized nps m7587a() {
        m7589c();
        return ((lfa) this.f14843h).f38103b.mo8460a();
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m7588b(HardwareBuffer hardwareBuffer, long j) {
        if (this.f14846k.get()) {
            ((nbe) ((nbe) f14836a.m17252c().mo17282g(nch.f41987a, "KeplerEncoder")).mo17276G((char) 1662)).mo17290o("Shutdown already called. Skipping additional requests.");
            hardwareBuffer.close();
            return;
        }
        EGLImage eGLImage = new EGLImage(hardwareBuffer);
        try {
            lcy lcyVarM15192b = lcy.m15192b(this.f14839c, eGLImage);
            try {
                this.f14842f.m15166e(fse.f23447b, new fsf(j, 1));
                kay kayVar = this.f14844i;
                float[] fArr = (float[]) f14837g.clone();
                Matrix.translateM(fArr, 0, 0.5f, 0.5f, 0.0f);
                Matrix.rotateM(fArr, 0, kayVar.f35503e, 0.0f, 0.0f, 1.0f);
                Matrix.translateM(fArr, 0, -0.5f, -0.5f, 0.0f);
                this.f14840d.m15236f(lcyVarM15192b, this.f14842f, fArr);
                this.f14838b.execute(new bmj(this, eGLImage, hardwareBuffer, 19));
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
    }

    /* JADX INFO: renamed from: c */
    public final void m7589c() {
        if (this.f14846k.getAndSet(true)) {
            ((nbe) ((nbe) f14836a.m17252c().mo17282g(nch.f41987a, "KeplerEncoder")).mo17276G((char) 1664)).mo17290o("Shutdown already called. Skipping additional requests.");
        } else {
            nbz nbzVar = nch.f41987a;
            this.f14843h.mo15275a().mo2282d(new elu(this, 7), this.f14845j);
        }
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
        m7589c();
    }
}
