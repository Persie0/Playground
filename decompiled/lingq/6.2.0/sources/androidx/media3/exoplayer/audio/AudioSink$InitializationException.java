package androidx.media3.exoplayer.audio;

import androidx.media3.common.C0713b;
import p000.hn1;
import p000.ux5;

/* JADX INFO: loaded from: classes2.dex */
public final class AudioSink$InitializationException extends Exception {

    /* JADX INFO: renamed from: a */
    public final boolean f6449a;

    /* JADX WARN: Illegal instructions before constructor call */
    public AudioSink$InitializationException(int i, int i2, int i3, int i4, C0713b c0713b, boolean z, AudioOutputProvider$InitializationException audioOutputProvider$InitializationException) {
        StringBuilder sbM22994q = ux5.m22994q(i, i2, "AudioTrack init failed 0 Config(", ", ", ", ");
        hn1.m13360j(i3, i4, ", ", ") ", sbM22994q);
        sbM22994q.append(c0713b);
        sbM22994q.append(z ? " (recoverable)" : "");
        super(sbM22994q.toString(), audioOutputProvider$InitializationException);
        this.f6449a = z;
    }
}
