package p000;

/* JADX INFO: loaded from: classes.dex */
public final class k50 {

    /* JADX INFO: renamed from: a */
    public final long f46718a;

    /* JADX INFO: renamed from: b */
    public final long f46719b;

    /* JADX INFO: renamed from: c */
    public final long f46720c;

    public k50(long j, long j2, long j3) {
        this.f46718a = j;
        this.f46719b = j2;
        this.f46720c = j3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof k50) {
            k50 k50Var = (k50) obj;
            if (this.f46718a == k50Var.f46718a && this.f46719b == k50Var.f46719b && this.f46720c == k50Var.f46720c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f46718a;
        long j2 = this.f46719b;
        int i = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        long j3 = this.f46720c;
        return ((int) ((j3 >>> 32) ^ j3)) ^ i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StartupTime{epochMillis=");
        sb.append(this.f46718a);
        sb.append(", elapsedRealtime=");
        sb.append(this.f46719b);
        sb.append(", uptimeMillis=");
        return wq1.m24113i(this.f46720c, "}", sb);
    }
}
