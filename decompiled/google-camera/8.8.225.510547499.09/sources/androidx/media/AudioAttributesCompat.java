package androidx.media;

import android.util.SparseIntArray;
import p000.atu;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesCompat implements atu {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int f1528b = 0;

    /* JADX INFO: renamed from: c */
    private static final SparseIntArray f1529c;

    /* JADX INFO: renamed from: a */
    public AudioAttributesImpl f1530a;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f1529c = sparseIntArray;
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
        AudioAttributesImpl audioAttributesImpl = this.f1530a;
        if (audioAttributesImpl == null) {
            return audioAttributesCompat.f1530a == null;
        }
        return audioAttributesImpl.equals(audioAttributesCompat.f1530a);
    }

    public final int hashCode() {
        return this.f1530a.hashCode();
    }

    public final String toString() {
        return this.f1530a.toString();
    }
}
