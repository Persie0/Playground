package androidx.media;

import android.media.AudioAttributes;

/* JADX INFO: loaded from: classes2.dex */
public class AudioAttributesImplApi21 implements AudioAttributesImpl {

    /* JADX INFO: renamed from: a */
    public AudioAttributes f6356a;

    /* JADX INFO: renamed from: b */
    public int f6357b = -1;

    public final boolean equals(Object obj) {
        if (obj instanceof AudioAttributesImplApi21) {
            return this.f6356a.equals(((AudioAttributesImplApi21) obj).f6356a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f6356a.hashCode();
    }

    public final String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f6356a;
    }
}
