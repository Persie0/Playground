package p000;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class w40 extends ej5 {

    /* JADX INFO: renamed from: a */
    public final long f66350a;

    /* JADX INFO: renamed from: b */
    public final Integer f66351b;

    /* JADX INFO: renamed from: c */
    public final ec1 f66352c;

    /* JADX INFO: renamed from: d */
    public final long f66353d;

    /* JADX INFO: renamed from: e */
    public final byte[] f66354e;

    /* JADX INFO: renamed from: f */
    public final String f66355f;

    /* JADX INFO: renamed from: g */
    public final long f66356g;

    /* JADX INFO: renamed from: h */
    public final wj6 f66357h;

    /* JADX INFO: renamed from: i */
    public final uw2 f66358i;

    public w40(long j, Integer num, ec1 ec1Var, long j2, byte[] bArr, String str, long j3, wj6 wj6Var, uw2 uw2Var) {
        this.f66350a = j;
        this.f66351b = num;
        this.f66352c = ec1Var;
        this.f66353d = j2;
        this.f66354e = bArr;
        this.f66355f = str;
        this.f66356g = j3;
        this.f66357h = wj6Var;
        this.f66358i = uw2Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ej5) {
            ej5 ej5Var = (ej5) obj;
            w40 w40Var = (w40) ej5Var;
            if (this.f66350a == w40Var.f66350a) {
                Integer num = w40Var.f66351b;
                Integer num2 = this.f66351b;
                if (num2 != null ? num2.equals(num) : num == null) {
                    ec1 ec1Var = w40Var.f66352c;
                    ec1 ec1Var2 = this.f66352c;
                    if (ec1Var2 != null ? ec1Var2.equals(ec1Var) : ec1Var == null) {
                        if (this.f66353d == w40Var.f66353d) {
                            if (Arrays.equals(this.f66354e, ej5Var instanceof w40 ? ((w40) ej5Var).f66354e : w40Var.f66354e)) {
                                String str = w40Var.f66355f;
                                String str2 = this.f66355f;
                                if (str2 != null ? str2.equals(str) : str == null) {
                                    if (this.f66356g == w40Var.f66356g) {
                                        wj6 wj6Var = w40Var.f66357h;
                                        wj6 wj6Var2 = this.f66357h;
                                        if (wj6Var2 != null ? wj6Var2.equals(wj6Var) : wj6Var == null) {
                                            uw2 uw2Var = w40Var.f66358i;
                                            uw2 uw2Var2 = this.f66358i;
                                            if (uw2Var2 != null ? uw2Var2.equals(uw2Var) : uw2Var == null) {
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
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f66350a;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f66351b;
        int iHashCode = (i ^ (num == null ? 0 : num.hashCode())) * 1000003;
        ec1 ec1Var = this.f66352c;
        int iHashCode2 = (iHashCode ^ (ec1Var == null ? 0 : ec1Var.hashCode())) * 1000003;
        long j2 = this.f66353d;
        int iHashCode3 = (((iHashCode2 ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f66354e)) * 1000003;
        String str = this.f66355f;
        int iHashCode4 = (iHashCode3 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j3 = this.f66356g;
        int i2 = (iHashCode4 ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        wj6 wj6Var = this.f66357h;
        int iHashCode5 = (i2 ^ (wj6Var == null ? 0 : wj6Var.hashCode())) * 1000003;
        uw2 uw2Var = this.f66358i;
        return iHashCode5 ^ (uw2Var != null ? uw2Var.hashCode() : 0);
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.f66350a + ", eventCode=" + this.f66351b + ", complianceData=" + this.f66352c + ", eventUptimeMs=" + this.f66353d + ", sourceExtension=" + Arrays.toString(this.f66354e) + ", sourceExtensionJsonProto3=" + this.f66355f + ", timezoneOffsetSeconds=" + this.f66356g + ", networkConnectionInfo=" + this.f66357h + ", experimentIds=" + this.f66358i + "}";
    }
}
