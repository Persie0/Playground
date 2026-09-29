package p000;

import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public final class se6 extends hf6 {

    /* JADX INFO: renamed from: a */
    public final Uri f60763a;

    public se6(Uri uri) {
        this.f60763a = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof se6) && this.f60763a.equals(((se6) obj).f60763a);
    }

    public final int hashCode() {
        return this.f60763a.hashCode();
    }

    public final String toString() {
        return "Login(uri=" + this.f60763a + ")";
    }
}
