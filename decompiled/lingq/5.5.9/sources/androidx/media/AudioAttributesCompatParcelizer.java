package androidx.media;

import androidx.versionedparcelable.VersionedParcel;
import p448w4.InterfaceC9812c;

/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(VersionedParcel versionedParcel) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        InterfaceC9812c interfaceC9812cM4630n = audioAttributesCompat.f6718a;
        if (versionedParcel.mo4624h(1)) {
            interfaceC9812cM4630n = versionedParcel.m4630n();
        }
        audioAttributesCompat.f6718a = (AudioAttributesImpl) interfaceC9812cM4630n;
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, VersionedParcel versionedParcel) {
        versionedParcel.getClass();
        AudioAttributesImpl audioAttributesImpl = audioAttributesCompat.f6718a;
        versionedParcel.mo4631o(1);
        versionedParcel.m4639w(audioAttributesImpl);
    }
}
