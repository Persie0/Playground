package p000;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import com.google.android.clockwork.common.wearable.wearmaterial.time.HuCi.yTyWiTtGtnBhy;
import com.google.android.material.snackbar.VMX.rgoX;
import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ekk implements elc {

    /* JADX INFO: renamed from: a */
    public static final nbh f14460a = nbh.m17259h("com/google/android/apps/camera/imax/cyclops/audio/AudioEncoder");

    /* JADX INFO: renamed from: b */
    public MediaCodec f14461b;

    /* JADX INFO: renamed from: c */
    public boolean f14462c;

    /* JADX INFO: renamed from: d */
    public boolean f14463d;

    /* JADX INFO: renamed from: e */
    private final MediaFormat f14464e;

    public ekk() throws IOException {
        MediaCodec mediaCodecCreateEncoderByType = MediaCodec.createEncoderByType("audio/mp4a-latm");
        MediaFormat mediaFormatCreateAudioFormat = MediaFormat.createAudioFormat("audio/mp4a-latm", 44100, 1);
        this.f14462c = false;
        this.f14463d = false;
        this.f14461b = mediaCodecCreateEncoderByType;
        this.f14464e = mediaFormatCreateAudioFormat;
    }

    @Override // p000.elc
    /* JADX INFO: renamed from: a */
    public final MediaCodec mo7411a() {
        return this.f14461b;
    }

    @Override // p000.elc
    /* JADX INFO: renamed from: b */
    public final void mo7412b() {
        this.f14462c = true;
    }

    @Override // p000.elc
    /* JADX INFO: renamed from: c */
    public final void mo7413c() {
        this.f14463d = false;
        this.f14461b.stop();
        this.f14461b.release();
    }

    @Override // p000.elc
    /* JADX INFO: renamed from: d */
    public final boolean mo7414d() {
        if (this.f14463d) {
            ((nbe) ((nbe) f14460a.m17251b()).mo17276G((char) 1537)).mo17290o("AudioEncoder already started!");
            return true;
        }
        this.f14464e.setInteger("aac-profile", 2);
        this.f14464e.setInteger("bitrate", 128000);
        this.f14464e.setInteger("max-input-size", 16384);
        try {
            this.f14461b.configure(this.f14464e, (Surface) null, (MediaCrypto) null, 1);
            this.f14461b.start();
            this.f14463d = true;
            return true;
        } catch (Exception e) {
            ((nbe) ((nbe) ((nbe) f14460a.m17251b()).mo17283h(e)).mo17276G((char) 1536)).mo17290o(rgoX.LMoQdJ);
            this.f14461b.release();
            try {
                this.f14461b = MediaCodec.createEncoderByType(yTyWiTtGtnBhy.chYmYnUeDtTaER);
                return false;
            } catch (IOException e2) {
                e2.printStackTrace();
                return false;
            }
        }
    }
}
