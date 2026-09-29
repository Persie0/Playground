package p000;

/* JADX INFO: loaded from: classes.dex */
public final class x20 extends vq1 {

    /* JADX INFO: renamed from: b */
    public final String f67656b;

    /* JADX INFO: renamed from: c */
    public final String f67657c;

    /* JADX INFO: renamed from: d */
    public final int f67658d;

    /* JADX INFO: renamed from: e */
    public final String f67659e;

    /* JADX INFO: renamed from: f */
    public final String f67660f;

    /* JADX INFO: renamed from: g */
    public final String f67661g;

    /* JADX INFO: renamed from: h */
    public final String f67662h;

    /* JADX INFO: renamed from: i */
    public final String f67663i;

    /* JADX INFO: renamed from: j */
    public final String f67664j;

    /* JADX INFO: renamed from: k */
    public final uq1 f67665k;

    /* JADX INFO: renamed from: l */
    public final aq1 f67666l;

    /* JADX INFO: renamed from: m */
    public final xp1 f67667m;

    public x20(String str, String str2, int i, String str3, String str4, String str5, String str6, String str7, String str8, uq1 uq1Var, aq1 aq1Var, xp1 xp1Var) {
        this.f67656b = str;
        this.f67657c = str2;
        this.f67658d = i;
        this.f67659e = str3;
        this.f67660f = str4;
        this.f67661g = str5;
        this.f67662h = str6;
        this.f67663i = str7;
        this.f67664j = str8;
        this.f67665k = uq1Var;
        this.f67666l = aq1Var;
        this.f67667m = xp1Var;
    }

    @Override // p000.vq1
    /* JADX INFO: renamed from: a */
    public final w20 mo23463a() {
        w20 w20Var = new w20();
        w20Var.f66237a = this.f67656b;
        w20Var.f66238b = this.f67657c;
        w20Var.f66239c = this.f67658d;
        w20Var.f66240d = this.f67659e;
        w20Var.f66241e = this.f67660f;
        w20Var.f66242f = this.f67661g;
        w20Var.f66243g = this.f67662h;
        w20Var.f66244h = this.f67663i;
        w20Var.f66245i = this.f67664j;
        w20Var.f66246j = this.f67665k;
        w20Var.f66247k = this.f67666l;
        w20Var.f66248l = this.f67667m;
        w20Var.f66249m = (byte) 1;
        return w20Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vq1) {
            x20 x20Var = (x20) ((vq1) obj);
            if (this.f67656b.equals(x20Var.f67656b) && this.f67657c.equals(x20Var.f67657c) && this.f67658d == x20Var.f67658d && this.f67659e.equals(x20Var.f67659e)) {
                String str = x20Var.f67660f;
                String str2 = this.f67660f;
                if (str2 != null ? str2.equals(str) : str == null) {
                    String str3 = x20Var.f67661g;
                    String str4 = this.f67661g;
                    if (str4 != null ? str4.equals(str3) : str3 == null) {
                        String str5 = x20Var.f67662h;
                        String str6 = this.f67662h;
                        if (str6 != null ? str6.equals(str5) : str5 == null) {
                            if (this.f67663i.equals(x20Var.f67663i) && this.f67664j.equals(x20Var.f67664j)) {
                                uq1 uq1Var = x20Var.f67665k;
                                uq1 uq1Var2 = this.f67665k;
                                if (uq1Var2 != null ? uq1Var2.equals(uq1Var) : uq1Var == null) {
                                    aq1 aq1Var = x20Var.f67666l;
                                    aq1 aq1Var2 = this.f67666l;
                                    if (aq1Var2 != null ? aq1Var2.equals(aq1Var) : aq1Var == null) {
                                        xp1 xp1Var = x20Var.f67667m;
                                        xp1 xp1Var2 = this.f67667m;
                                        if (xp1Var2 != null ? xp1Var2.equals(xp1Var) : xp1Var == null) {
                                            return true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.f67656b.hashCode() ^ 1000003) * 1000003) ^ this.f67657c.hashCode()) * 1000003) ^ this.f67658d) * 1000003) ^ this.f67659e.hashCode()) * 1000003;
        String str = this.f67660f;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f67661g;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f67662h;
        int iHashCode4 = (((((iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003) ^ this.f67663i.hashCode()) * 1000003) ^ this.f67664j.hashCode()) * 1000003;
        uq1 uq1Var = this.f67665k;
        int iHashCode5 = (iHashCode4 ^ (uq1Var == null ? 0 : uq1Var.hashCode())) * 1000003;
        aq1 aq1Var = this.f67666l;
        int iHashCode6 = (iHashCode5 ^ (aq1Var == null ? 0 : aq1Var.hashCode())) * 1000003;
        xp1 xp1Var = this.f67667m;
        return iHashCode6 ^ (xp1Var != null ? xp1Var.hashCode() : 0);
    }

    public final String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f67656b + ", gmpAppId=" + this.f67657c + ", platform=" + this.f67658d + ", installationUuid=" + this.f67659e + ", firebaseInstallationId=" + this.f67660f + ", firebaseAuthenticationToken=" + this.f67661g + ", appQualitySessionId=" + this.f67662h + ", buildVersion=" + this.f67663i + ", displayVersion=" + this.f67664j + ", session=" + this.f67665k + ", ndkPayload=" + this.f67666l + ", appExitInfo=" + this.f67667m + "}";
    }
}
