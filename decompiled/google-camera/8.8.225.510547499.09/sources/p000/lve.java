package p000;

import android.net.Uri;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lve {

    /* JADX INFO: renamed from: a */
    public final String f39385a;

    /* JADX INFO: renamed from: b */
    private final String f39386b;

    /* JADX INFO: renamed from: c */
    private final String f39387c;

    /* JADX INFO: renamed from: d */
    private final Uri f39388d;

    public lve(String str, String str2, String str3, Uri uri) {
        this.f39385a = str;
        this.f39386b = str2;
        this.f39387c = str3;
        this.f39388d = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lve)) {
            return false;
        }
        lve lveVar = (lve) obj;
        return ooc.m18737c(this.f39385a, lveVar.f39385a) && ooc.m18737c(this.f39386b, lveVar.f39386b) && ooc.m18737c(this.f39387c, lveVar.f39387c) && ooc.m18737c(this.f39388d, lveVar.f39388d);
    }

    public final int hashCode() {
        int iHashCode = this.f39385a.hashCode() * 31;
        String str = this.f39386b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f39387c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Uri uri = this.f39388d;
        return iHashCode3 + (uri != null ? uri.hashCode() : 0);
    }

    public final String toString() {
        return "Account(obfuscatedGaiaId=" + this.f39385a + ", email=" + this.f39386b + ", displayName=" + this.f39387c + ", photoUrl=" + this.f39388d + ")";
    }
}
