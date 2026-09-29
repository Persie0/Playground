package com.google.android.exoplayer2.audio;

import android.media.AudioDeviceInfo;
import android.support.v4.media.session.C0166e;
import com.google.android.exoplayer2.C2416m;
import com.google.android.exoplayer2.C2505u;
import java.nio.ByteBuffer;
import p003a2.C0009a;
import p174i9.C6215e0;
import p195j9.C6434k;

/* JADX INFO: loaded from: classes.dex */
public interface AudioSink {

    public static final class ConfigurationException extends Exception {

        /* JADX INFO: renamed from: a */
        public final C2416m f11841a;

        public ConfigurationException(AudioProcessor.UnhandledAudioFormatException unhandledAudioFormatException, C2416m c2416m) {
            super(unhandledAudioFormatException);
            this.f11841a = c2416m;
        }

        public ConfigurationException(String str, C2416m c2416m) {
            super(str);
            this.f11841a = c2416m;
        }
    }

    public static final class InitializationException extends Exception {

        /* JADX INFO: renamed from: a */
        public final int f11842a;

        /* JADX INFO: renamed from: b */
        public final boolean f11843b;

        /* JADX INFO: renamed from: c */
        public final C2416m f11844c;

        /* JADX WARN: Illegal instructions before constructor call */
        public InitializationException(int i10, int i11, int i12, int i13, C2416m c2416m, boolean z10, RuntimeException runtimeException) {
            StringBuilder sbM25n = C0009a.m25n("AudioTrack init failed ", i10, " Config(", i11, ", ");
            sbM25n.append(i12);
            sbM25n.append(", ");
            sbM25n.append(i13);
            sbM25n.append(")");
            sbM25n.append(z10 ? " (recoverable)" : "");
            super(sbM25n.toString(), runtimeException);
            this.f11842a = i10;
            this.f11843b = z10;
            this.f11844c = c2416m;
        }
    }

    public static final class UnexpectedDiscontinuityException extends Exception {
        public UnexpectedDiscontinuityException(long j10, long j11) {
            super("Unexpected audio track timestamp discontinuity: expected " + j11 + ", got " + j10);
        }
    }

    public static final class WriteException extends Exception {

        /* JADX INFO: renamed from: a */
        public final int f11845a;

        /* JADX INFO: renamed from: b */
        public final boolean f11846b;

        /* JADX INFO: renamed from: c */
        public final C2416m f11847c;

        public WriteException(int i10, C2416m c2416m, boolean z10) {
            super(C0166e.m761g("AudioTrack write failed: ", i10));
            this.f11846b = z10;
            this.f11845a = i10;
            this.f11847c = c2416m;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.audio.AudioSink$a */
    public interface InterfaceC2355a {
    }

    /* JADX INFO: renamed from: b */
    boolean mo6794b(C2416m c2416m);

    /* JADX INFO: renamed from: c */
    void mo6795c();

    /* JADX INFO: renamed from: d */
    boolean mo6796d();

    /* JADX INFO: renamed from: e */
    default void mo6797e(AudioDeviceInfo audioDeviceInfo) {
    }

    /* JADX INFO: renamed from: f */
    void mo6798f() throws WriteException;

    void flush();

    /* JADX INFO: renamed from: g */
    boolean mo6799g();

    C2505u getPlaybackParameters();

    /* JADX INFO: renamed from: h */
    void mo6800h(C2416m c2416m, int[] iArr) throws ConfigurationException;

    /* JADX INFO: renamed from: i */
    long mo6801i(boolean z10);

    /* JADX INFO: renamed from: j */
    void mo6802j();

    /* JADX INFO: renamed from: k */
    void mo6803k(C2367a c2367a);

    /* JADX INFO: renamed from: l */
    void mo6804l();

    /* JADX INFO: renamed from: m */
    void mo6805m();

    /* JADX INFO: renamed from: n */
    default void mo6806n(C6215e0 c6215e0) {
    }

    /* JADX INFO: renamed from: o */
    boolean mo6807o(ByteBuffer byteBuffer, long j10, int i10) throws WriteException, InitializationException;

    /* JADX INFO: renamed from: p */
    int mo6808p(C2416m c2416m);

    void pause();

    void play();

    void setAudioSessionId(int i10);

    void setAuxEffectInfo(C6434k c6434k);

    void setPlaybackParameters(C2505u c2505u);

    void setSkipSilenceEnabled(boolean z10);

    void setVolume(float f3);
}
