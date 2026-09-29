package p000;

/* JADX INFO: loaded from: classes.dex */
public final class m50 {

    /* JADX INFO: renamed from: a */
    public final String f50592a;

    /* JADX INFO: renamed from: b */
    public final String f50593b;

    /* JADX INFO: renamed from: c */
    public final String f50594c;

    /* JADX INFO: renamed from: d */
    public final String f50595d;

    /* JADX INFO: renamed from: e */
    public final int f50596e;

    /* JADX INFO: renamed from: f */
    public final b64 f50597f;

    public m50(String str, String str2, String str3, String str4, int i, b64 b64Var) {
        if (str == null) {
            C3386nv.m17635v("Null appIdentifier");
            throw null;
        }
        this.f50592a = str;
        if (str2 == null) {
            C3386nv.m17635v("Null versionCode");
            throw null;
        }
        this.f50593b = str2;
        if (str3 == null) {
            C3386nv.m17635v("Null versionName");
            throw null;
        }
        this.f50594c = str3;
        if (str4 == null) {
            C3386nv.m17635v("Null installUuid");
            throw null;
        }
        this.f50595d = str4;
        this.f50596e = i;
        this.f50597f = b64Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m50) {
            m50 m50Var = (m50) obj;
            return this.f50592a.equals(m50Var.f50592a) && this.f50593b.equals(m50Var.f50593b) && this.f50594c.equals(m50Var.f50594c) && this.f50595d.equals(m50Var.f50595d) && this.f50596e == m50Var.f50596e && this.f50597f == m50Var.f50597f;
        }
        return false;
    }

    public final int hashCode() {
        return this.f50597f.hashCode() ^ ((((((((((this.f50592a.hashCode() ^ 1000003) * 1000003) ^ this.f50593b.hashCode()) * 1000003) ^ this.f50594c.hashCode()) * 1000003) ^ this.f50595d.hashCode()) * 1000003) ^ this.f50596e) * 1000003);
    }

    public final String toString() {
        return "AppData{appIdentifier=" + this.f50592a + ", versionCode=" + this.f50593b + ", versionName=" + this.f50594c + ", installUuid=" + this.f50595d + ", deliveryMechanism=" + this.f50596e + ", developmentPlatformProvider=" + this.f50597f + "}";
    }
}
