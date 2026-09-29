package p000;

import android.net.Uri;

/* JADX INFO: loaded from: classes2.dex */
public final class x32 extends tad {

    /* JADX INFO: renamed from: a */
    public final Uri f67698a;

    /* JADX INFO: renamed from: b */
    public final String f67699b;

    public x32(Uri uri, String str) {
        this.f67698a = uri;
        this.f67699b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x32)) {
            return false;
        }
        x32 x32Var = (x32) obj;
        return fa4.m11650l(this.f67698a, x32Var.f67698a) && fa4.m11650l(this.f67699b, x32Var.f67699b);
    }

    public final int hashCode() {
        Uri uri = this.f67698a;
        int iHashCode = (uri == null ? 0 : uri.hashCode()) * 31;
        String str = this.f67699b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "ChallengeDetail(uri=" + this.f67698a + ", language=" + this.f67699b + ")";
    }
}
