package p000;

import com.google.android.datatransport.runtime.backends.BackendResponse$Status;

/* JADX INFO: loaded from: classes.dex */
public final class s20 {

    /* JADX INFO: renamed from: a */
    public final BackendResponse$Status f60171a;

    /* JADX INFO: renamed from: b */
    public final long f60172b;

    public s20(BackendResponse$Status backendResponse$Status, long j) {
        if (backendResponse$Status == null) {
            C3386nv.m17635v("Null status");
            throw null;
        }
        this.f60171a = backendResponse$Status;
        this.f60172b = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof s20) {
            s20 s20Var = (s20) obj;
            if (this.f60171a.equals(s20Var.f60171a) && this.f60172b == s20Var.f60172b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f60171a.hashCode() ^ 1000003) * 1000003;
        long j = this.f60172b;
        return ((int) ((j >>> 32) ^ j)) ^ iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackendResponse{status=");
        sb.append(this.f60171a);
        sb.append(", nextRequestWaitMillis=");
        return wq1.m24113i(this.f60172b, "}", sb);
    }
}
