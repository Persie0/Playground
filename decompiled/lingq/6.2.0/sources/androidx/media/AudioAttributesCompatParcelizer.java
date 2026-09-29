package androidx.media;

import p000.lpa;
import p000.npa;

/* JADX INFO: loaded from: classes2.dex */
public class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(lpa lpaVar) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        npa npaVarM16436h = audioAttributesCompat.f6355a;
        if (lpaVar.mo16433e(1)) {
            npaVarM16436h = lpaVar.m16436h();
        }
        audioAttributesCompat.f6355a = (AudioAttributesImpl) npaVarM16436h;
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, lpa lpaVar) {
        lpaVar.getClass();
        AudioAttributesImpl audioAttributesImpl = audioAttributesCompat.f6355a;
        lpaVar.mo16437i(1);
        lpaVar.m16440l(audioAttributesImpl);
    }
}
