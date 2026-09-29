package androidx.media;

import android.media.AudioAttributes;
import p000.lpa;

/* JADX INFO: loaded from: classes2.dex */
public class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(lpa lpaVar) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.f6356a = (AudioAttributes) lpaVar.m16435g(audioAttributesImplApi21.f6356a, 1);
        audioAttributesImplApi21.f6357b = lpaVar.m16434f(audioAttributesImplApi21.f6357b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, lpa lpaVar) {
        lpaVar.getClass();
        lpaVar.m16439k(audioAttributesImplApi21.f6356a, 1);
        lpaVar.m16438j(audioAttributesImplApi21.f6357b, 2);
    }
}
