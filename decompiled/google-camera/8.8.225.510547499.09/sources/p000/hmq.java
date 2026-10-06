package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hmq {

    /* JADX INFO: renamed from: a */
    public static final hmq f28351a = m10465a(-1, -1, 0, 0);

    /* JADX INFO: renamed from: b */
    public final long f28352b;

    /* JADX INFO: renamed from: c */
    public final long f28353c;

    /* JADX INFO: renamed from: d */
    private final long f28354d;

    /* JADX INFO: renamed from: e */
    private final long f28355e;

    public hmq() {
    }

    public hmq(long j, long j2, long j3, long j4) {
        this.f28352b = j;
        this.f28353c = j2;
        this.f28354d = j3;
        this.f28355e = j4;
    }

    /* JADX INFO: renamed from: a */
    public static hmq m10465a(long j, long j2, long j3, long j4) {
        return new hmq(j, j2, j3, j4);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m10466b() {
        return this.f28355e < this.f28352b;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m10467c() {
        return this.f28354d < this.f28352b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hmq) {
            hmq hmqVar = (hmq) obj;
            if (this.f28352b == hmqVar.f28352b && this.f28353c == hmqVar.f28353c && this.f28354d == hmqVar.f28354d && this.f28355e == hmqVar.f28355e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f28352b;
        long j2 = this.f28353c;
        int i = (int) this.f28354d;
        return ((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ i) * 1000003) ^ ((int) this.f28355e);
    }

    public final String toString() {
        return "SpaceAvailability{rawAvailableBytes=" + this.f28352b + ", totalBytes=" + this.f28353c + ", videoThresholdBytes=" + this.f28354d + ", photoThresholdBytes=" + this.f28355e + "}";
    }
}
