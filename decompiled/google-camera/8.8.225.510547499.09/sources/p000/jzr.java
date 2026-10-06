package p000;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.util.Log;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class jzr extends MediaCodec.Callback {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ jzs f35346a;

    public jzr(jzs jzsVar) {
        this.f35346a = jzsVar;
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        String str = String.format("%s failed due to error (%d), transient: %s, recoverable: %s, message: %s, info: %s)", "VideoEncoder", Integer.valueOf(codecException.getErrorCode()), Boolean.valueOf(codecException.isTransient()), Boolean.valueOf(codecException.isRecoverable()), codecException.getMessage(), codecException.getDiagnosticInfo());
        if (codecException.isTransient()) {
            Log.e("VideoEncoder", str);
            return;
        }
        this.f35346a.f35378t = true;
        this.f35346a.f35366h.mo14894e(null);
        Log.e("VideoEncoder", "Stopping recording due to: ".concat(String.valueOf(str)), codecException);
        this.f35346a.f35363e.m13792a(jzf.MEDIA_CODEC_ERROR_VIDEO);
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        Log.e("VideoEncoder", "InputBuffer handling is not implemented (yet) since it's not needed forsurfaces.");
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        jzs jzsVar = this.f35346a;
        if (jzsVar.f35370l) {
            synchronized (jzsVar.f35360b) {
                jzs jzsVar2 = this.f35346a;
                if (!jzsVar2.f35380v) {
                    jzsVar2.f35379u.add(Integer.valueOf(i));
                    this.f35346a.m13848d(true);
                    return;
                }
            }
        }
        this.f35346a.m13850f(i, bufferInfo);
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        jzs jzsVar = this.f35346a;
        if (jzsVar.f35370l) {
            synchronized (jzsVar.f35360b) {
                jzs jzsVar2 = this.f35346a;
                if (!jzsVar2.f35380v) {
                    jzsVar2.f35381w = mediaFormat;
                    return;
                }
            }
        }
        this.f35346a.m13847c(mediaFormat);
    }
}
