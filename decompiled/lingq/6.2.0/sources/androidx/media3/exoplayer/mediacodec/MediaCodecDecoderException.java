package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import androidx.media3.decoder.DecoderException;
import p000.vt5;

/* JADX INFO: loaded from: classes2.dex */
public class MediaCodecDecoderException extends DecoderException {

    /* JADX INFO: renamed from: a */
    public final int f6455a;

    public MediaCodecDecoderException(IllegalStateException illegalStateException, vt5 vt5Var) {
        StringBuilder sb = new StringBuilder("Decoder failed: ");
        sb.append(vt5Var == null ? null : vt5Var.f65881a);
        super(sb.toString(), illegalStateException);
        boolean z = illegalStateException instanceof MediaCodec.CodecException;
        if (z) {
            ((MediaCodec.CodecException) illegalStateException).getDiagnosticInfo();
        }
        this.f6455a = z ? ((MediaCodec.CodecException) illegalStateException).getErrorCode() : 0;
    }
}
