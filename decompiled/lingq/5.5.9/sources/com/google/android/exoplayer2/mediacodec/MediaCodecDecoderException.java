package com.google.android.exoplayer2.mediacodec;

import android.media.MediaCodec;
import com.google.android.exoplayer2.decoder.DecoderException;
import p479xa.C10134c0;

/* JADX INFO: loaded from: classes.dex */
public class MediaCodecDecoderException extends DecoderException {

    /* JADX INFO: renamed from: a */
    public final String f12517a;

    public MediaCodecDecoderException(IllegalStateException illegalStateException, C2427d c2427d) {
        StringBuilder sb2 = new StringBuilder("Decoder failed: ");
        String diagnosticInfo = null;
        sb2.append(c2427d == null ? null : c2427d.f12615a);
        super(sb2.toString(), illegalStateException);
        if (C10134c0.f51354a >= 21 && (illegalStateException instanceof MediaCodec.CodecException)) {
            diagnosticInfo = ((MediaCodec.CodecException) illegalStateException).getDiagnosticInfo();
        }
        this.f12517a = diagnosticInfo;
    }
}
