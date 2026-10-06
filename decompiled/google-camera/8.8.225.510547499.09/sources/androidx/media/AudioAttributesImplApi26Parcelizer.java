package androidx.media;

import android.media.AudioAttributes;
import p000.att;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesImplApi26Parcelizer {
    public static AudioAttributesImplApi26 read(att attVar) {
        AudioAttributesImplApi26 audioAttributesImplApi26 = new AudioAttributesImplApi26();
        audioAttributesImplApi26.f1531a = (AudioAttributes) attVar.m1994b(audioAttributesImplApi26.f1531a, 1);
        audioAttributesImplApi26.f1532b = attVar.m1993a(audioAttributesImplApi26.f1532b, 2);
        return audioAttributesImplApi26;
    }

    public static void write(AudioAttributesImplApi26 audioAttributesImplApi26, att attVar) {
        attVar.m2001i(audioAttributesImplApi26.f1531a, 1);
        attVar.m2000h(audioAttributesImplApi26.f1532b, 2);
    }
}
