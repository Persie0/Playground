package androidx.media;

import android.media.AudioAttributes;
import p000.att;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(att attVar) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.f1531a = (AudioAttributes) attVar.m1994b(audioAttributesImplApi21.f1531a, 1);
        audioAttributesImplApi21.f1532b = attVar.m1993a(audioAttributesImplApi21.f1532b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, att attVar) {
        attVar.m2001i(audioAttributesImplApi21.f1531a, 1);
        attVar.m2000h(audioAttributesImplApi21.f1532b, 2);
    }
}
