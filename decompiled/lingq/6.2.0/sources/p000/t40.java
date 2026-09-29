package p000;

/* JADX INFO: loaded from: classes.dex */
public final class t40 {

    /* JADX INFO: renamed from: a */
    public final String f61836a;

    /* JADX INFO: renamed from: b */
    public final long f61837b;

    /* JADX INFO: renamed from: c */
    public final long f61838c;

    public t40(long j, long j2, String str) {
        this.f61836a = str;
        this.f61837b = j;
        this.f61838c = j2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof t40) {
            t40 t40Var = (t40) obj;
            if (this.f61836a.equals(t40Var.f61836a) && this.f61837b == t40Var.f61837b && this.f61838c == t40Var.f61838c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f61836a.hashCode() ^ 1000003) * 1000003;
        long j = this.f61837b;
        long j2 = this.f61838c;
        return ((int) (j2 ^ (j2 >>> 32))) ^ ((iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstallationTokenResult{token=");
        sb.append(this.f61836a);
        sb.append(", tokenExpirationTimestamp=");
        sb.append(this.f61837b);
        sb.append(", tokenCreationTimestamp=");
        return wq1.m24113i(this.f61838c, "}", sb);
    }
}
