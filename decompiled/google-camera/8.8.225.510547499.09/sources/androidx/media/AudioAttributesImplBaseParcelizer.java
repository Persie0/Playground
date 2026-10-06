package androidx.media;

import p000.att;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(att attVar) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f1533a = attVar.m1993a(audioAttributesImplBase.f1533a, 1);
        audioAttributesImplBase.f1534b = attVar.m1993a(audioAttributesImplBase.f1534b, 2);
        audioAttributesImplBase.f1535c = attVar.m1993a(audioAttributesImplBase.f1535c, 3);
        audioAttributesImplBase.f1536d = attVar.m1993a(audioAttributesImplBase.f1536d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, att attVar) {
        attVar.m2000h(audioAttributesImplBase.f1533a, 1);
        attVar.m2000h(audioAttributesImplBase.f1534b, 2);
        attVar.m2000h(audioAttributesImplBase.f1535c, 3);
        attVar.m2000h(audioAttributesImplBase.f1536d, 4);
    }
}
