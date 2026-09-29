package p000;

import android.net.Uri;

/* JADX INFO: loaded from: classes2.dex */
public final class y32 extends tad {

    /* JADX INFO: renamed from: a */
    public final Uri f69207a;

    /* JADX INFO: renamed from: b */
    public final String f69208b;

    public y32(Uri uri, String str) {
        this.f69207a = uri;
        this.f69208b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y32)) {
            return false;
        }
        y32 y32Var = (y32) obj;
        return fa4.m11650l(this.f69207a, y32Var.f69207a) && fa4.m11650l(this.f69208b, y32Var.f69208b);
    }

    public final int hashCode() {
        Uri uri = this.f69207a;
        int iHashCode = (uri == null ? 0 : uri.hashCode()) * 31;
        String str = this.f69208b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "Challenges(uri=" + this.f69207a + ", language=" + this.f69208b + ")";
    }
}
