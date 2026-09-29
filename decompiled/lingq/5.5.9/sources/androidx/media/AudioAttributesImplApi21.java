package androidx.media;

import android.media.AudioAttributes;

/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesImplApi21 implements AudioAttributesImpl {

    /* JADX INFO: renamed from: a */
    public AudioAttributes f6719a;

    /* JADX INFO: renamed from: b */
    public int f6720b = -1;

    public final boolean equals(Object obj) {
        if (obj instanceof AudioAttributesImplApi21) {
            return this.f6719a.equals(((AudioAttributesImplApi21) obj).f6719a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f6719a.hashCode();
    }

    public final String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f6719a;
    }
}
