package androidx.media;

import android.media.AudioAttributes;
import androidx.versionedparcelable.VersionedParcel;

/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(VersionedParcel versionedParcel) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.f6719a = (AudioAttributes) versionedParcel.m4628l(audioAttributesImplApi21.f6719a, 1);
        audioAttributesImplApi21.f6720b = versionedParcel.m4626j(audioAttributesImplApi21.f6720b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, VersionedParcel versionedParcel) {
        versionedParcel.getClass();
        AudioAttributes audioAttributes = audioAttributesImplApi21.f6719a;
        versionedParcel.mo4631o(1);
        versionedParcel.mo4637u(audioAttributes);
        versionedParcel.m4636t(audioAttributesImplApi21.f6720b, 2);
    }
}
