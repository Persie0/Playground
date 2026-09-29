package p000;

import android.net.Uri;

/* JADX INFO: loaded from: classes2.dex */
public final class k42 extends tad {

    /* JADX INFO: renamed from: a */
    public final Uri f46688a;

    public k42(Uri uri) {
        this.f46688a = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k42) && this.f46688a.equals(((k42) obj).f46688a);
    }

    public final int hashCode() {
        return this.f46688a.hashCode();
    }

    public final String toString() {
        return "Login(uri=" + this.f46688a + ")";
    }
}
