package p000;

/* JADX INFO: loaded from: classes.dex */
public final class r40 {

    /* JADX INFO: renamed from: a */
    public final String f58591a;

    /* JADX INFO: renamed from: b */
    public final String f58592b;

    /* JADX INFO: renamed from: c */
    public final String f58593c;

    public r40(String str, String str2, String str3) {
        if (str == null) {
            C3386nv.m17635v("Null crashlyticsInstallId");
            throw null;
        }
        this.f58591a = str;
        this.f58592b = str2;
        this.f58593c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r40) {
            r40 r40Var = (r40) obj;
            if (this.f58591a.equals(r40Var.f58591a)) {
                String str = r40Var.f58592b;
                String str2 = this.f58592b;
                if (str2 != null ? str2.equals(str) : str == null) {
                    String str3 = r40Var.f58593c;
                    String str4 = this.f58593c;
                    if (str4 != null ? str4.equals(str3) : str3 == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f58591a.hashCode() ^ 1000003) * 1000003;
        String str = this.f58592b;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f58593c;
        return iHashCode2 ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstallIds{crashlyticsInstallId=");
        sb.append(this.f58591a);
        sb.append(", firebaseInstallationId=");
        sb.append(this.f58592b);
        sb.append(", firebaseAuthenticationToken=");
        return AbstractC3393o1.m17738m(sb, this.f58593c, "}");
    }
}
