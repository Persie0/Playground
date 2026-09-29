package p000;

/* JADX INFO: loaded from: classes.dex */
public final class h30 extends cq1 {

    /* JADX INFO: renamed from: a */
    public final String f41736a;

    /* JADX INFO: renamed from: b */
    public final String f41737b;

    /* JADX INFO: renamed from: c */
    public final String f41738c;

    /* JADX INFO: renamed from: d */
    public final String f41739d;

    /* JADX INFO: renamed from: e */
    public final String f41740e;

    /* JADX INFO: renamed from: f */
    public final String f41741f;

    public h30(String str, String str2, String str3, String str4, String str5, String str6) {
        this.f41736a = str;
        this.f41737b = str2;
        this.f41738c = str3;
        this.f41739d = str4;
        this.f41740e = str5;
        this.f41741f = str6;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cq1) {
            h30 h30Var = (h30) ((cq1) obj);
            if (this.f41736a.equals(h30Var.f41736a) && this.f41737b.equals(h30Var.f41737b)) {
                String str = h30Var.f41738c;
                String str2 = this.f41738c;
                if (str2 != null ? str2.equals(str) : str == null) {
                    String str3 = h30Var.f41739d;
                    String str4 = this.f41739d;
                    if (str4 != null ? str4.equals(str3) : str3 == null) {
                        String str5 = h30Var.f41740e;
                        String str6 = this.f41740e;
                        if (str6 != null ? str6.equals(str5) : str5 == null) {
                            String str7 = h30Var.f41741f;
                            String str8 = this.f41741f;
                            if (str8 != null ? str8.equals(str7) : str7 == null) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((this.f41736a.hashCode() ^ 1000003) * 1000003) ^ this.f41737b.hashCode()) * 1000003;
        String str = this.f41738c;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * (-721379959);
        String str2 = this.f41739d;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f41740e;
        int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f41741f;
        return iHashCode4 ^ (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Application{identifier=");
        sb.append(this.f41736a);
        sb.append(", version=");
        sb.append(this.f41737b);
        sb.append(", displayVersion=");
        sb.append(this.f41738c);
        sb.append(", organization=null, installationUuid=");
        sb.append(this.f41739d);
        sb.append(", developmentPlatform=");
        sb.append(this.f41740e);
        sb.append(", developmentPlatformVersion=");
        return AbstractC3393o1.m17738m(sb, this.f41741f, "}");
    }
}
