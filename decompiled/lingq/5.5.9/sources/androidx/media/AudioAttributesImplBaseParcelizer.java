package androidx.media;

import androidx.versionedparcelable.VersionedParcel;

/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(VersionedParcel versionedParcel) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f6721a = versionedParcel.m4626j(audioAttributesImplBase.f6721a, 1);
        audioAttributesImplBase.f6722b = versionedParcel.m4626j(audioAttributesImplBase.f6722b, 2);
        audioAttributesImplBase.f6723c = versionedParcel.m4626j(audioAttributesImplBase.f6723c, 3);
        audioAttributesImplBase.f6724d = versionedParcel.m4626j(audioAttributesImplBase.f6724d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, VersionedParcel versionedParcel) {
        versionedParcel.getClass();
        versionedParcel.m4636t(audioAttributesImplBase.f6721a, 1);
        versionedParcel.m4636t(audioAttributesImplBase.f6722b, 2);
        versionedParcel.m4636t(audioAttributesImplBase.f6723c, 3);
        versionedParcel.m4636t(audioAttributesImplBase.f6724d, 4);
    }
}
