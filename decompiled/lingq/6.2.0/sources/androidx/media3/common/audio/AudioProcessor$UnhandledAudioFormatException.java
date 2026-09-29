package androidx.media3.common.audio;

import p000.C3850zy;

/* JADX INFO: loaded from: classes2.dex */
public final class AudioProcessor$UnhandledAudioFormatException extends Exception {
    public AudioProcessor$UnhandledAudioFormatException(String str, C3850zy c3850zy) {
        super(str + " " + c3850zy);
    }

    public AudioProcessor$UnhandledAudioFormatException(C3850zy c3850zy) {
        this("Unhandled input format:", c3850zy);
    }
}
