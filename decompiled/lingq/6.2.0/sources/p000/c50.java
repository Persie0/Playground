package p000;

import com.google.firebase.installations.local.PersistedInstallation$RegistrationStatus;

/* JADX INFO: loaded from: classes.dex */
public final class c50 {

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ int f9501h = 0;

    /* JADX INFO: renamed from: a */
    public final String f9502a;

    /* JADX INFO: renamed from: b */
    public final PersistedInstallation$RegistrationStatus f9503b;

    /* JADX INFO: renamed from: c */
    public final String f9504c;

    /* JADX INFO: renamed from: d */
    public final String f9505d;

    /* JADX INFO: renamed from: e */
    public final long f9506e;

    /* JADX INFO: renamed from: f */
    public final long f9507f;

    /* JADX INFO: renamed from: g */
    public final String f9508g;

    static {
        b50 b50Var = new b50();
        b50Var.f7950f = 0L;
        b50Var.f7952h = (byte) (b50Var.f7952h | 2);
        b50Var.m3299b(PersistedInstallation$RegistrationStatus.ATTEMPT_MIGRATION);
        b50Var.f7949e = 0L;
        b50Var.f7952h = (byte) (b50Var.f7952h | 1);
        b50Var.m3298a();
    }

    public c50(String str, PersistedInstallation$RegistrationStatus persistedInstallation$RegistrationStatus, String str2, String str3, long j, long j2, String str4) {
        this.f9502a = str;
        this.f9503b = persistedInstallation$RegistrationStatus;
        this.f9504c = str2;
        this.f9505d = str3;
        this.f9506e = j;
        this.f9507f = j2;
        this.f9508g = str4;
    }

    /* JADX INFO: renamed from: a */
    public final b50 m4313a() {
        b50 b50Var = new b50();
        b50Var.f7945a = this.f9502a;
        b50Var.f7946b = this.f9503b;
        b50Var.f7947c = this.f9504c;
        b50Var.f7948d = this.f9505d;
        b50Var.f7949e = this.f9506e;
        b50Var.f7950f = this.f9507f;
        b50Var.f7951g = this.f9508g;
        b50Var.f7952h = (byte) 3;
        return b50Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c50) {
            c50 c50Var = (c50) obj;
            String str = c50Var.f9502a;
            String str2 = this.f9502a;
            if (str2 != null ? str2.equals(str) : str == null) {
                if (this.f9503b.equals(c50Var.f9503b)) {
                    String str3 = c50Var.f9504c;
                    String str4 = this.f9504c;
                    if (str4 != null ? str4.equals(str3) : str3 == null) {
                        String str5 = c50Var.f9505d;
                        String str6 = this.f9505d;
                        if (str6 != null ? str6.equals(str5) : str5 == null) {
                            if (this.f9506e == c50Var.f9506e && this.f9507f == c50Var.f9507f) {
                                String str7 = c50Var.f9508g;
                                String str8 = this.f9508g;
                                if (str8 != null ? str8.equals(str7) : str7 == null) {
                                    return true;
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
        String str = this.f9502a;
        int iHashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f9503b.hashCode()) * 1000003;
        String str2 = this.f9504c;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f9505d;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        long j = this.f9506e;
        int i = (iHashCode3 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.f9507f;
        int i2 = (i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        String str4 = this.f9508g;
        return i2 ^ (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PersistedInstallationEntry{firebaseInstallationId=");
        sb.append(this.f9502a);
        sb.append(", registrationStatus=");
        sb.append(this.f9503b);
        sb.append(", authToken=");
        sb.append(this.f9504c);
        sb.append(", refreshToken=");
        sb.append(this.f9505d);
        sb.append(", expiresInSecs=");
        sb.append(this.f9506e);
        sb.append(", tokenCreationEpochInSecs=");
        sb.append(this.f9507f);
        sb.append(", fisError=");
        return AbstractC3393o1.m17738m(sb, this.f9508g, "}");
    }
}
