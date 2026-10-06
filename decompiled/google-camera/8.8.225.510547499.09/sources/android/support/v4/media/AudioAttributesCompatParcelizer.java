package android.support.v4.media;

import androidx.media.AudioAttributesCompat;
import p000.att;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class AudioAttributesCompatParcelizer extends androidx.media.AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(att attVar) {
        return androidx.media.AudioAttributesCompatParcelizer.read(attVar);
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, att attVar) {
        androidx.media.AudioAttributesCompatParcelizer.write(audioAttributesCompat, attVar);
    }
}
