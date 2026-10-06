package p000;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.util.Log;
import android.view.Surface;
import com.google.android.apps.camera.zoomui.view.WdNM.xPAWq;
import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class lev implements lew {

    /* JADX INFO: renamed from: a */
    private final let f38095a;

    /* JADX INFO: renamed from: b */
    private final nps f38096b;

    public lev(MediaFormat mediaFormat, lfk lfkVar, lfg lfgVar, Handler handler, boolean z, Surface surface, boolean z2) throws IOException {
        mrf hgvVar;
        boolean z3;
        if (z) {
            hgvVar = hnk.f28500m;
            z3 = true;
        } else {
            hgvVar = surface != null ? new hgv(surface, 17) : null;
            z3 = false;
        }
        MediaCodec mediaCodecCreateEncoderByType = MediaCodec.createEncoderByType(mediaFormat.getString(xPAWq.Wfq));
        boolean z4 = lbo.f37882a;
        les lesVar = new les(mediaCodecCreateEncoderByType, mediaFormat, hgvVar, z3, handler, z2);
        this.f38095a = lesVar;
        if (lesVar.f38087i.get()) {
            throw new IllegalStateException("Not allowed to update the listener after start.");
        }
        lesVar.f38093o = lfgVar;
        lfq lfqVar = new lfq(lfkVar);
        if (lesVar.f38087i.get()) {
            throw new IllegalStateException("Not allowed to update the frame processor after start.");
        }
        lesVar.f38092n = lfqVar;
        this.f38096b = lfqVar.f38158b;
    }

    @Override // p000.lew
    /* JADX INFO: renamed from: a */
    public final Surface mo15270a() {
        return ((les) this.f38095a).f38081c;
    }

    @Override // p000.lew
    /* JADX INFO: renamed from: b */
    public final leu mo15271b() {
        return this.f38095a.mo15263a();
    }

    @Override // p000.lew
    /* JADX INFO: renamed from: c */
    public final nps mo15272c() {
        return this.f38096b;
    }

    @Override // p000.lfb
    /* JADX INFO: renamed from: d */
    public final void mo15273d() {
        let letVar = this.f38095a;
        MediaCodec.CodecException th = null;
        for (int i = 0; i <= 3; i++) {
            try {
                ((les) letVar).f38079a.start();
                ((les) letVar).f38087i.set(true);
                ((les) letVar).f38080b.set(1);
                ((les) letVar).f38093o.mo8417d();
                break;
            } catch (Throwable th2) {
                th = th2;
                Log.e("AsynchMediaCodec", "Exception occurred while trying to start codec", th);
                if (i < 3) {
                    Log.w("AsynchMediaCodec", "Trying to start codec again.");
                }
            }
        }
        if (th != null) {
            Log.e("AsynchMediaCodec", "Failed to start codec", th);
            les lesVar = (les) letVar;
            lesVar.f38088j.onError(lesVar.f38079a, th instanceof MediaCodec.CodecException ? th : null);
            if (!(th instanceof RuntimeException)) {
                throw new IllegalStateException(th);
            }
        }
    }

    @Override // p000.lfb
    /* JADX INFO: renamed from: e */
    public final void mo15274e() {
        les lesVar = (les) this.f38095a;
        if (!lesVar.f38085g.getAndSet(true)) {
            switch (lesVar.f38080b.get()) {
                case 1:
                    lesVar.m15268f();
                    break;
                case 3:
                case 4:
                    lesVar.m15266d();
                    break;
            }
        }
        kxk.m14966L(lesVar.f38083e);
    }
}
