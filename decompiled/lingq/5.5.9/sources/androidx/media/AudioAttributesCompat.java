package androidx.media;

import android.util.SparseIntArray;
import p448w4.InterfaceC9812c;

/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesCompat implements InterfaceC9812c {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int f6717b = 0;

    /* JADX INFO: renamed from: a */
    public AudioAttributesImpl f6718a;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sparseIntArray.put(5, 1);
        sparseIntArray.put(6, 2);
        sparseIntArray.put(7, 2);
        sparseIntArray.put(8, 1);
        sparseIntArray.put(9, 1);
        sparseIntArray.put(10, 1);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesCompat)) {
            return false;
        }
        AudioAttributesCompat audioAttributesCompat = (AudioAttributesCompat) obj;
        AudioAttributesImpl audioAttributesImpl = this.f6718a;
        if (audioAttributesImpl == null) {
            return audioAttributesCompat.f6718a == null;
        }
        return audioAttributesImpl.equals(audioAttributesCompat.f6718a);
    }

    public final int hashCode() {
        return this.f6718a.hashCode();
    }

    public final String toString() {
        return this.f6718a.toString();
    }
}
