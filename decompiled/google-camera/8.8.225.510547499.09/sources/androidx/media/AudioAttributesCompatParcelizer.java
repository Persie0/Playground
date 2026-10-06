package androidx.media;

import p000.att;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(att attVar) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        audioAttributesCompat.f1530a = (AudioAttributesImpl) attVar.m2012t(audioAttributesCompat.f1530a);
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, att attVar) {
        attVar.m2013u(audioAttributesCompat.f1530a);
    }
}
