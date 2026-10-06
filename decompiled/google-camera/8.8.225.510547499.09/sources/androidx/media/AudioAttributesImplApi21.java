package androidx.media;

import android.media.AudioAttributes;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesImplApi21 implements AudioAttributesImpl {

    /* JADX INFO: renamed from: a */
    public AudioAttributes f1531a;

    /* JADX INFO: renamed from: b */
    public int f1532b = -1;

    public final boolean equals(Object obj) {
        if (obj instanceof AudioAttributesImplApi21) {
            return this.f1531a.equals(((AudioAttributesImplApi21) obj).f1531a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1531a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AudioAttributesCompat: audioattributes=");
        AudioAttributes audioAttributes = this.f1531a;
        sb.append(audioAttributes);
        return "AudioAttributesCompat: audioattributes=".concat(String.valueOf(audioAttributes));
    }
}
