package android.support.v4.media;

import androidx.media.AudioAttributesCompat;
import p000.lpa;

/* JADX INFO: loaded from: classes2.dex */
public final class AudioAttributesCompatParcelizer extends androidx.media.AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(lpa lpaVar) {
        return androidx.media.AudioAttributesCompatParcelizer.read(lpaVar);
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, lpa lpaVar) {
        androidx.media.AudioAttributesCompatParcelizer.write(audioAttributesCompat, lpaVar);
    }
}
