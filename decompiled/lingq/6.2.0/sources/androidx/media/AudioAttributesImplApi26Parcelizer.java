package androidx.media;

import android.media.AudioAttributes;
import p000.lpa;

/* JADX INFO: loaded from: classes2.dex */
public class AudioAttributesImplApi26Parcelizer {
    public static AudioAttributesImplApi26 read(lpa lpaVar) {
        AudioAttributesImplApi26 audioAttributesImplApi26 = new AudioAttributesImplApi26();
        audioAttributesImplApi26.f6356a = (AudioAttributes) lpaVar.m16435g(audioAttributesImplApi26.f6356a, 1);
        audioAttributesImplApi26.f6357b = lpaVar.m16434f(audioAttributesImplApi26.f6357b, 2);
        return audioAttributesImplApi26;
    }

    public static void write(AudioAttributesImplApi26 audioAttributesImplApi26, lpa lpaVar) {
        lpaVar.getClass();
        lpaVar.m16439k(audioAttributesImplApi26.f6356a, 1);
        lpaVar.m16438j(audioAttributesImplApi26.f6357b, 2);
    }
}
