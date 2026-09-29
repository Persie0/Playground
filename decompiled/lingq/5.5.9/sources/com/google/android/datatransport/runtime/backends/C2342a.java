package com.google.android.datatransport.runtime.backends;

/* JADX INFO: renamed from: com.google.android.datatransport.runtime.backends.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2342a extends BackendResponse {

    /* JADX INFO: renamed from: a */
    public final BackendResponse.Status f11776a;

    /* JADX INFO: renamed from: b */
    public final long f11777b;

    public C2342a(BackendResponse.Status status, long j10) {
        if (status == null) {
            throw new NullPointerException("Null status");
        }
        this.f11776a = status;
        this.f11777b = j10;
    }

    @Override // com.google.android.datatransport.runtime.backends.BackendResponse
    /* JADX INFO: renamed from: a */
    public final long mo6758a() {
        return this.f11777b;
    }

    @Override // com.google.android.datatransport.runtime.backends.BackendResponse
    /* JADX INFO: renamed from: b */
    public final BackendResponse.Status mo6759b() {
        return this.f11776a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BackendResponse)) {
            return false;
        }
        BackendResponse backendResponse = (BackendResponse) obj;
        return this.f11776a.equals(backendResponse.mo6759b()) && this.f11777b == backendResponse.mo6758a();
    }

    public final int hashCode() {
        int iHashCode = (this.f11776a.hashCode() ^ 1000003) * 1000003;
        long j10 = this.f11777b;
        return iHashCode ^ ((int) ((j10 >>> 32) ^ j10));
    }

    public final String toString() {
        return "BackendResponse{status=" + this.f11776a + ", nextRequestWaitMillis=" + this.f11777b + "}";
    }
}
