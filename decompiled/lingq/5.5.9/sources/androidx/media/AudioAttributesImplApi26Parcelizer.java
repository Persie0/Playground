package androidx.media;

import android.media.AudioAttributes;
import androidx.versionedparcelable.VersionedParcel;

/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesImplApi26Parcelizer {
    public static AudioAttributesImplApi26 read(VersionedParcel versionedParcel) {
        AudioAttributesImplApi26 audioAttributesImplApi26 = new AudioAttributesImplApi26();
        audioAttributesImplApi26.f6719a = (AudioAttributes) versionedParcel.m4628l(audioAttributesImplApi26.f6719a, 1);
        audioAttributesImplApi26.f6720b = versionedParcel.m4626j(audioAttributesImplApi26.f6720b, 2);
        return audioAttributesImplApi26;
    }

    public static void write(AudioAttributesImplApi26 audioAttributesImplApi26, VersionedParcel versionedParcel) {
        versionedParcel.getClass();
        AudioAttributes audioAttributes = audioAttributesImplApi26.f6719a;
        versionedParcel.mo4631o(1);
        versionedParcel.mo4637u(audioAttributes);
        versionedParcel.m4636t(audioAttributesImplApi26.f6720b, 2);
    }
}
