package p000;

import com.google.firebase.installations.remote.InstallationResponse$ResponseCode;

/* JADX INFO: loaded from: classes.dex */
public final class s40 {

    /* JADX INFO: renamed from: a */
    public final String f60258a;

    /* JADX INFO: renamed from: b */
    public final String f60259b;

    /* JADX INFO: renamed from: c */
    public final String f60260c;

    /* JADX INFO: renamed from: d */
    public final p50 f60261d;

    /* JADX INFO: renamed from: e */
    public final InstallationResponse$ResponseCode f60262e;

    public s40(String str, String str2, String str3, p50 p50Var, InstallationResponse$ResponseCode installationResponse$ResponseCode) {
        this.f60258a = str;
        this.f60259b = str2;
        this.f60260c = str3;
        this.f60261d = p50Var;
        this.f60262e = installationResponse$ResponseCode;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof s40) {
            s40 s40Var = (s40) obj;
            String str = s40Var.f60258a;
            String str2 = this.f60258a;
            if (str2 != null ? str2.equals(str) : str == null) {
                String str3 = s40Var.f60259b;
                String str4 = this.f60259b;
                if (str4 != null ? str4.equals(str3) : str3 == null) {
                    String str5 = s40Var.f60260c;
                    String str6 = this.f60260c;
                    if (str6 != null ? str6.equals(str5) : str5 == null) {
                        p50 p50Var = s40Var.f60261d;
                        p50 p50Var2 = this.f60261d;
                        if (p50Var2 != null ? p50Var2.equals(p50Var) : p50Var == null) {
                            InstallationResponse$ResponseCode installationResponse$ResponseCode = s40Var.f60262e;
                            InstallationResponse$ResponseCode installationResponse$ResponseCode2 = this.f60262e;
                            if (installationResponse$ResponseCode2 != null ? installationResponse$ResponseCode2.equals(installationResponse$ResponseCode) : installationResponse$ResponseCode == null) {
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
        String str = this.f60258a;
        int iHashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f60259b;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f60260c;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        p50 p50Var = this.f60261d;
        int iHashCode4 = (iHashCode3 ^ (p50Var == null ? 0 : p50Var.hashCode())) * 1000003;
        InstallationResponse$ResponseCode installationResponse$ResponseCode = this.f60262e;
        return iHashCode4 ^ (installationResponse$ResponseCode != null ? installationResponse$ResponseCode.hashCode() : 0);
    }

    public final String toString() {
        return "InstallationResponse{uri=" + this.f60258a + ", fid=" + this.f60259b + ", refreshToken=" + this.f60260c + ", authToken=" + this.f60261d + ", responseCode=" + this.f60262e + "}";
    }
}
