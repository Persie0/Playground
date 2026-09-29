package androidx.media;

import p000.lpa;

/* JADX INFO: loaded from: classes2.dex */
public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(lpa lpaVar) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f6358a = 0;
        audioAttributesImplBase.f6359b = 0;
        audioAttributesImplBase.f6360c = 0;
        audioAttributesImplBase.f6361d = -1;
        audioAttributesImplBase.f6358a = lpaVar.m16434f(0, 1);
        audioAttributesImplBase.f6359b = lpaVar.m16434f(audioAttributesImplBase.f6359b, 2);
        audioAttributesImplBase.f6360c = lpaVar.m16434f(audioAttributesImplBase.f6360c, 3);
        audioAttributesImplBase.f6361d = lpaVar.m16434f(audioAttributesImplBase.f6361d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, lpa lpaVar) {
        lpaVar.getClass();
        lpaVar.m16438j(audioAttributesImplBase.f6358a, 1);
        lpaVar.m16438j(audioAttributesImplBase.f6359b, 2);
        lpaVar.m16438j(audioAttributesImplBase.f6360c, 3);
        lpaVar.m16438j(audioAttributesImplBase.f6361d, 4);
    }
}
