package androidx.media3.exoplayer.audio;

import androidx.media3.common.C0713b;

/* JADX INFO: loaded from: classes2.dex */
public final class AudioSink$ConfigurationException extends Exception {

    /* JADX INFO: renamed from: a */
    public final C0713b f6448a;

    public AudioSink$ConfigurationException(Exception exc, C0713b c0713b) {
        super(exc);
        this.f6448a = c0713b;
    }

    public AudioSink$ConfigurationException(String str, C0713b c0713b) {
        super(str);
        this.f6448a = c0713b;
    }
}
