package p000;

import com.google.firebase.installations.remote.TokenResult$ResponseCode;

/* JADX INFO: loaded from: classes.dex */
public final class p50 {

    /* JADX INFO: renamed from: a */
    public final String f55585a;

    /* JADX INFO: renamed from: b */
    public final long f55586b;

    /* JADX INFO: renamed from: c */
    public final TokenResult$ResponseCode f55587c;

    public p50(String str, long j, TokenResult$ResponseCode tokenResult$ResponseCode) {
        this.f55585a = str;
        this.f55586b = j;
        this.f55587c = tokenResult$ResponseCode;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p50) {
            p50 p50Var = (p50) obj;
            String str = p50Var.f55585a;
            String str2 = this.f55585a;
            if (str2 != null ? str2.equals(str) : str == null) {
                if (this.f55586b == p50Var.f55586b) {
                    TokenResult$ResponseCode tokenResult$ResponseCode = p50Var.f55587c;
                    TokenResult$ResponseCode tokenResult$ResponseCode2 = this.f55587c;
                    if (tokenResult$ResponseCode2 != null ? tokenResult$ResponseCode2.equals(tokenResult$ResponseCode) : tokenResult$ResponseCode == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f55585a;
        int iHashCode = str == null ? 0 : str.hashCode();
        long j = this.f55586b;
        int i = (((iHashCode ^ 1000003) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003;
        TokenResult$ResponseCode tokenResult$ResponseCode = this.f55587c;
        return i ^ (tokenResult$ResponseCode != null ? tokenResult$ResponseCode.hashCode() : 0);
    }

    public final String toString() {
        return "TokenResult{token=" + this.f55585a + ", tokenExpirationTimestamp=" + this.f55586b + ", responseCode=" + this.f55587c + "}";
    }
}
