package p000;

import android.media.MediaCodec;
import android.opengl.EGL14;
import com.google.android.libraries.vision.opengl.Texture;
import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ekq implements ekp {

    /* JADX INFO: renamed from: a */
    public static final nbh f14480a = nbh.m17259h("com/google/android/apps/camera/imax/cyclops/capture/CameraRecorder");

    /* JADX INFO: renamed from: h */
    private eko f14487h = null;

    /* JADX INFO: renamed from: i */
    private Texture f14488i = null;

    /* JADX INFO: renamed from: b */
    public ell f14481b = null;

    /* JADX INFO: renamed from: c */
    public eli f14482c = null;

    /* JADX INFO: renamed from: d */
    public ekm f14483d = null;

    /* JADX INFO: renamed from: g */
    public eig f14486g = null;

    /* JADX INFO: renamed from: e */
    public boolean f14484e = false;

    /* JADX INFO: renamed from: f */
    public int f14485f = -1;

    @Override // p000.ekp
    /* JADX INFO: renamed from: a */
    public final void mo7345a(float[] fArr, long j) {
        ekm ekmVar;
        if (!this.f14484e && (ekmVar = this.f14483d) != null) {
            ekmVar.f14467b.f14471c = (j / 1000) - (System.nanoTime() / 1000);
            this.f14484e = true;
        }
        ell ellVar = this.f14481b;
        if (ellVar != null && ellVar.f14605f) {
            ellVar.f14606g.incrementAndGet();
            ellVar.f14601b.m7452e();
            elk elkVar = ellVar.f14604e;
            elkVar.sendMessage(elkVar.obtainMessage(1, (int) (j >> 32), (int) j, fArr));
        }
    }

    @Override // p000.ekp
    /* JADX INFO: renamed from: b */
    public final void mo7346b(int i, int i2) {
    }

    @Override // p000.ekp
    /* JADX INFO: renamed from: c */
    public final void mo7347c(Texture texture, eko ekoVar) {
        this.f14488i = texture;
        this.f14487h = ekoVar;
        m7416f();
    }

    @Override // p000.ekp
    /* JADX INFO: renamed from: d */
    public final void mo7348d() {
        ell ellVar = this.f14481b;
        if (ellVar == null) {
            return;
        }
        eli eliVar = ellVar.f14601b;
        eliVar.m7452e();
        eliVar.m7453f();
    }

    @Override // p000.ekp
    /* JADX INFO: renamed from: e */
    public final void mo7349e(eig eigVar) {
        this.f14486g = eigVar;
    }

    /* JADX INFO: renamed from: f */
    public final void m7416f() {
        try {
            int i = this.f14485f;
            if (i <= 0) {
                float f = this.f14487h.f14476b / 1080.0f;
                i = (int) ((f + (f * f)) * 0.5f * 1.2E7f);
            }
            eko ekoVar = this.f14487h;
            this.f14482c = new eli(MediaCodec.createEncoderByType("video/avc"), new elh(ekoVar.f14475a, ekoVar.f14476b, ekoVar.f14477c, EGL14.eglGetCurrentContext(), this.f14488i, i));
        } catch (IOException e) {
            ((nbe) ((nbe) f14480a.m17251b()).mo17276G((char) 1548)).mo17290o("Could not instantiate a video recorder!");
            this.f14482c = null;
        }
    }
}
