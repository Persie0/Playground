package p000;

import coil.decode.ExifOrientationPolicy;

/* JADX INFO: loaded from: classes.dex */
public final class cd0 {

    /* JADX INFO: renamed from: a */
    public final ExifOrientationPolicy f9902a;

    /* JADX INFO: renamed from: b */
    public final vv8 f9903b;

    public cd0(int i, ExifOrientationPolicy exifOrientationPolicy) {
        this.f9902a = exifOrientationPolicy;
        int i2 = wv8.f67389a;
        this.f9903b = new vv8(i);
    }

    public final boolean equals(Object obj) {
        return obj instanceof cd0;
    }

    public final int hashCode() {
        return cd0.class.hashCode();
    }
}
