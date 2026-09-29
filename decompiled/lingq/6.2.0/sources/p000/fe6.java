package p000;

import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public final class fe6 extends hf6 {

    /* JADX INFO: renamed from: a */
    public final Uri f38945a;

    public fe6(Uri uri) {
        uri.getClass();
        this.f38945a = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fe6) && fa4.m11650l(this.f38945a, ((fe6) obj).f38945a);
    }

    public final int hashCode() {
        return this.f38945a.hashCode();
    }

    public final String toString() {
        return "ChallengeDetail(uri=" + this.f38945a + ")";
    }
}
