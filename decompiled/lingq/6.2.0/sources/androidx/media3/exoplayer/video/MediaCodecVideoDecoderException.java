package androidx.media3.exoplayer.video;

import android.view.Surface;
import androidx.media3.exoplayer.mediacodec.MediaCodecDecoderException;
import p000.vt5;

/* JADX INFO: loaded from: classes2.dex */
public class MediaCodecVideoDecoderException extends MediaCodecDecoderException {
    public MediaCodecVideoDecoderException(IllegalStateException illegalStateException, vt5 vt5Var, Surface surface) {
        super(illegalStateException, vt5Var);
        System.identityHashCode(surface);
        if (surface != null) {
            surface.isValid();
        }
    }
}
