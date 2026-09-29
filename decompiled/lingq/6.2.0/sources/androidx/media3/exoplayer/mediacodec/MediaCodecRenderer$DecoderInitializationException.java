package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import androidx.media3.common.C0713b;
import p000.vt5;

/* JADX INFO: loaded from: classes2.dex */
public class MediaCodecRenderer$DecoderInitializationException extends Exception {

    /* JADX INFO: renamed from: a */
    public final String f6456a;

    /* JADX INFO: renamed from: b */
    public final boolean f6457b;

    /* JADX INFO: renamed from: c */
    public final vt5 f6458c;

    /* JADX INFO: renamed from: d */
    public final String f6459d;

    public MediaCodecRenderer$DecoderInitializationException(C0713b c0713b, MediaCodecUtil$DecoderQueryException mediaCodecUtil$DecoderQueryException, boolean z, int i) {
        this("Decoder init failed: [" + i + "], " + c0713b, mediaCodecUtil$DecoderQueryException, c0713b.f6406o, z, null, "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_" + (i < 0 ? "neg_" : "") + Math.abs(i));
    }

    /* JADX INFO: renamed from: a */
    public static MediaCodecRenderer$DecoderInitializationException m2530a(MediaCodecRenderer$DecoderInitializationException mediaCodecRenderer$DecoderInitializationException) {
        return new MediaCodecRenderer$DecoderInitializationException(mediaCodecRenderer$DecoderInitializationException.getMessage(), mediaCodecRenderer$DecoderInitializationException.getCause(), mediaCodecRenderer$DecoderInitializationException.f6456a, mediaCodecRenderer$DecoderInitializationException.f6457b, mediaCodecRenderer$DecoderInitializationException.f6458c, mediaCodecRenderer$DecoderInitializationException.f6459d);
    }

    public MediaCodecRenderer$DecoderInitializationException(C0713b c0713b, Exception exc, boolean z, vt5 vt5Var) {
        this("Decoder init failed: " + vt5Var.f65881a + ", " + c0713b, exc, c0713b.f6406o, z, vt5Var, exc instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) exc).getDiagnosticInfo() : null);
    }

    public MediaCodecRenderer$DecoderInitializationException(String str, Throwable th, String str2, boolean z, vt5 vt5Var, String str3) {
        super(str, th);
        this.f6456a = str2;
        this.f6457b = z;
        this.f6458c = vt5Var;
        this.f6459d = str3;
    }
}
