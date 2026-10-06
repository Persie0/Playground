package p000;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.opengl.EGL14;
import android.opengl.Matrix;
import android.os.Bundle;
import android.view.Surface;
import androidx.work.impl.workers.NHKG.pIeXJQLZLfgIN;
import java.io.IOException;
import java.util.concurrent.Semaphore;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class eli implements elc {

    /* JADX INFO: renamed from: a */
    public static final nbh f14577a = nbh.m17259h("com/google/android/apps/camera/imax/cyclops/video/SurfaceVideoEncoder");

    /* JADX INFO: renamed from: b */
    public final Bundle f14578b;

    /* JADX INFO: renamed from: c */
    public MediaCodec f14579c;

    /* JADX INFO: renamed from: d */
    public lup f14580d;

    /* JADX INFO: renamed from: e */
    public final elh f14581e;

    /* JADX INFO: renamed from: f */
    public int f14582f;

    /* JADX INFO: renamed from: g */
    public boolean f14583g;

    /* JADX INFO: renamed from: h */
    public cwd f14584h;

    /* JADX INFO: renamed from: i */
    private final Semaphore f14585i = new Semaphore(1);

    public eli(MediaCodec mediaCodec, elh elhVar) {
        Bundle bundle = new Bundle();
        this.f14578b = bundle;
        this.f14582f = 0;
        this.f14583g = false;
        this.f14579c = mediaCodec;
        this.f14581e = elhVar;
        bundle.putInt("request-sync", 0);
    }

    @Override // p000.elc
    /* JADX INFO: renamed from: a */
    public final MediaCodec mo7411a() {
        return this.f14579c;
    }

    @Override // p000.elc
    /* JADX INFO: renamed from: b */
    public final void mo7412b() {
        if (this.f14583g) {
            this.f14579c.signalEndOfInputStream();
        }
    }

    @Override // p000.elc
    /* JADX INFO: renamed from: c */
    public final void mo7413c() {
        if (this.f14583g) {
            this.f14583g = false;
            try {
                this.f14579c.stop();
            } catch (IllegalStateException e) {
                ((nbe) ((nbe) ((nbe) f14577a.m17251b()).mo17283h(e)).mo17276G((char) 1581)).mo17290o("Illegal state when stopping MediaCodec");
            }
            this.f14579c.release();
            this.f14580d.m16019a();
        }
    }

    @Override // p000.elc
    /* JADX INFO: renamed from: d */
    public final boolean mo7414d() {
        elh elhVar = this.f14581e;
        MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat("video/avc", elhVar.f14572b, elhVar.f14573c);
        mediaFormatCreateVideoFormat.setInteger("color-format", 2130708361);
        mediaFormatCreateVideoFormat.setInteger("bitrate", this.f14581e.f14571a);
        mediaFormatCreateVideoFormat.setInteger("frame-rate", 30);
        mediaFormatCreateVideoFormat.setInteger("i-frame-interval", Math.max(1, 10));
        try {
            this.f14579c.configure(mediaFormatCreateVideoFormat, (Surface) null, (MediaCrypto) null, 1);
            lup lupVar = new lup(this.f14581e.f14575e, this.f14579c.createInputSurface());
            this.f14580d = lupVar;
            lupVar.m16020b();
            elh elhVar2 = this.f14581e;
            cwd cwdVar = new cwd(elhVar2.f14576f, elhVar2.f14574d);
            this.f14584h = cwdVar;
            float[] fArr = new float[16];
            Matrix.setIdentityM(fArr, 0);
            cwdVar.m5653L(fArr);
            EGL14.eglMakeCurrent(this.f14580d.f39243a, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_CONTEXT);
            try {
                this.f14579c.start();
                this.f14583g = true;
                return true;
            } catch (IllegalStateException e) {
                ((nbe) ((nbe) ((nbe) f14577a.m17251b()).mo17283h(e)).mo17276G((char) 1583)).mo17290o(pIeXJQLZLfgIN.HUe);
                return false;
            }
        } catch (Exception e2) {
            ((nbe) ((nbe) ((nbe) f14577a.m17251b()).mo17283h(e2)).mo17276G((char) 1582)).mo17290o("Exception when configuring MediaCodec");
            this.f14579c.release();
            try {
                this.f14579c = MediaCodec.createEncoderByType("video/avc");
            } catch (IOException e3) {
                e3.printStackTrace();
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m7453f() {
        this.f14585i.release();
    }

    /* JADX INFO: renamed from: e */
    public final void m7452e() {
        try {
            this.f14585i.acquire();
        } catch (InterruptedException e) {
            throw new RuntimeException("Unable to lock frame data", e);
        }
    }
}
