package androidx.media;

import android.util.SparseIntArray;
import p000.npa;

/* JADX INFO: loaded from: classes2.dex */
public class AudioAttributesCompat implements npa {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int f6354b = 0;

    /* JADX INFO: renamed from: a */
    public AudioAttributesImpl f6355a;

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
        AudioAttributesImpl audioAttributesImpl = this.f6355a;
        AudioAttributesImpl audioAttributesImpl2 = ((AudioAttributesCompat) obj).f6355a;
        if (audioAttributesImpl == null) {
            return audioAttributesImpl2 == null;
        }
        return audioAttributesImpl.equals(audioAttributesImpl2);
    }

    public final int hashCode() {
        return this.f6355a.hashCode();
    }

    public final String toString() {
        return this.f6355a.toString();
    }
}
