package com.google.android.exoplayer2.video;

import android.view.Surface;
import com.google.android.exoplayer2.mediacodec.C2427d;
import com.google.android.exoplayer2.mediacodec.MediaCodecDecoderException;

/* JADX INFO: loaded from: classes.dex */
public class MediaCodecVideoDecoderException extends MediaCodecDecoderException {
    public MediaCodecVideoDecoderException(IllegalStateException illegalStateException, C2427d c2427d, Surface surface) {
        super(illegalStateException, c2427d);
        System.identityHashCode(surface);
        if (surface != null) {
            surface.isValid();
        }
    }
}
