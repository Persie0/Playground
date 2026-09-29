package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class k46 implements dy5 {

    /* JADX INFO: renamed from: a */
    public final long f46693a;

    /* JADX INFO: renamed from: b */
    public final long f46694b;

    /* JADX INFO: renamed from: c */
    public final long f46695c;

    public k46(long j, long j2, long j3) {
        this.f46693a = j;
        this.f46694b = j2;
        this.f46695c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k46)) {
            return false;
        }
        k46 k46Var = (k46) obj;
        return this.f46693a == k46Var.f46693a && this.f46694b == k46Var.f46694b && this.f46695c == k46Var.f46695c;
    }

    public final int hashCode() {
        return hnb.m13380b(this.f46695c) + ((hnb.m13380b(this.f46694b) + ((hnb.m13380b(this.f46693a) + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Mp4Timestamp: creation time=" + this.f46693a + ", modification time=" + this.f46694b + ", timescale=" + this.f46695c;
    }
}
