package p000;

/* JADX INFO: loaded from: classes.dex */
public final class b40 extends pq1 {

    /* JADX INFO: renamed from: a */
    public final oq1 f7903a;

    /* JADX INFO: renamed from: b */
    public final String f7904b;

    /* JADX INFO: renamed from: c */
    public final String f7905c;

    /* JADX INFO: renamed from: d */
    public final long f7906d;

    public b40(c40 c40Var, String str, String str2, long j) {
        this.f7903a = c40Var;
        this.f7904b = str;
        this.f7905c = str2;
        this.f7906d = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof pq1) {
            b40 b40Var = (b40) ((pq1) obj);
            if (this.f7903a.equals(b40Var.f7903a) && this.f7904b.equals(b40Var.f7904b) && this.f7905c.equals(b40Var.f7905c) && this.f7906d == b40Var.f7906d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((this.f7903a.hashCode() ^ 1000003) * 1000003) ^ this.f7904b.hashCode()) * 1000003) ^ this.f7905c.hashCode()) * 1000003;
        long j = this.f7906d;
        return ((int) ((j >>> 32) ^ j)) ^ iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RolloutAssignment{rolloutVariant=");
        sb.append(this.f7903a);
        sb.append(", parameterKey=");
        sb.append(this.f7904b);
        sb.append(", parameterValue=");
        sb.append(this.f7905c);
        sb.append(", templateVersion=");
        return wq1.m24113i(this.f7906d, "}", sb);
    }
}
