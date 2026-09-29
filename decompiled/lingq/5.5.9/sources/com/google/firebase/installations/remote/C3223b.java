package com.google.firebase.installations.remote;

/* JADX INFO: renamed from: com.google.firebase.installations.remote.b */
/* JADX INFO: loaded from: classes.dex */
public final class C3223b extends TokenResult {

    /* JADX INFO: renamed from: a */
    public final String f16291a;

    /* JADX INFO: renamed from: b */
    public final long f16292b;

    /* JADX INFO: renamed from: c */
    public final TokenResult.ResponseCode f16293c;

    public C3223b(String str, long j10, TokenResult.ResponseCode responseCode) {
        this.f16291a = str;
        this.f16292b = j10;
        this.f16293c = responseCode;
    }

    @Override // com.google.firebase.installations.remote.TokenResult
    /* JADX INFO: renamed from: a */
    public final TokenResult.ResponseCode mo9216a() {
        return this.f16293c;
    }

    @Override // com.google.firebase.installations.remote.TokenResult
    /* JADX INFO: renamed from: b */
    public final String mo9217b() {
        return this.f16291a;
    }

    @Override // com.google.firebase.installations.remote.TokenResult
    /* JADX INFO: renamed from: c */
    public final long mo9218c() {
        return this.f16292b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TokenResult)) {
            return false;
        }
        TokenResult tokenResult = (TokenResult) obj;
        String str = this.f16291a;
        if (str != null ? str.equals(tokenResult.mo9217b()) : tokenResult.mo9217b() == null) {
            if (this.f16292b == tokenResult.mo9218c()) {
                TokenResult.ResponseCode responseCode = this.f16293c;
                if (responseCode == null) {
                    if (tokenResult.mo9216a() == null) {
                        return true;
                    }
                } else if (responseCode.equals(tokenResult.mo9216a())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = 0;
        String str = this.f16291a;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        long j10 = this.f16292b;
        int i10 = (((iHashCode2 ^ 1000003) * 1000003) ^ ((int) ((j10 >>> 32) ^ j10))) * 1000003;
        TokenResult.ResponseCode responseCode = this.f16293c;
        if (responseCode != null) {
            iHashCode = responseCode.hashCode();
        }
        return iHashCode ^ i10;
    }

    public final String toString() {
        return "TokenResult{token=" + this.f16291a + ", tokenExpirationTimestamp=" + this.f16292b + ", responseCode=" + this.f16293c + "}";
    }
}
