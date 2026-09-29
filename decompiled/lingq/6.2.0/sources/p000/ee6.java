package p000;

import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public final class ee6 extends hf6 {

    /* JADX INFO: renamed from: a */
    public final Uri f37111a;

    public ee6(Uri uri) {
        uri.getClass();
        this.f37111a = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ee6) && fa4.m11650l(this.f37111a, ((ee6) obj).f37111a);
    }

    public final int hashCode() {
        return this.f37111a.hashCode();
    }

    public final String toString() {
        return "Challenge(uri=" + this.f37111a + ")";
    }
}
