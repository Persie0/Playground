package p000;

/* JADX INFO: loaded from: classes.dex */
public final class u30 extends hq1 {

    /* JADX INFO: renamed from: a */
    public final long f63335a;

    /* JADX INFO: renamed from: b */
    public final String f63336b;

    /* JADX INFO: renamed from: c */
    public final String f63337c;

    /* JADX INFO: renamed from: d */
    public final long f63338d;

    /* JADX INFO: renamed from: e */
    public final int f63339e;

    public u30(long j, String str, String str2, long j2, int i) {
        this.f63335a = j;
        this.f63336b = str;
        this.f63337c = str2;
        this.f63338d = j2;
        this.f63339e = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hq1) {
            u30 u30Var = (u30) ((hq1) obj);
            if (this.f63335a == u30Var.f63335a && this.f63336b.equals(u30Var.f63336b)) {
                String str = u30Var.f63337c;
                String str2 = this.f63337c;
                if (str2 != null ? str2.equals(str) : str == null) {
                    if (this.f63338d == u30Var.f63338d && this.f63339e == u30Var.f63339e) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f63335a;
        int iHashCode = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f63336b.hashCode()) * 1000003;
        String str = this.f63337c;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j2 = this.f63338d;
        return this.f63339e ^ ((iHashCode2 ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Frame{pc=");
        sb.append(this.f63335a);
        sb.append(", symbol=");
        sb.append(this.f63336b);
        sb.append(", file=");
        sb.append(this.f63337c);
        sb.append(", offset=");
        sb.append(this.f63338d);
        sb.append(", importance=");
        return wq1.m24123s(sb, this.f63339e, "}");
    }
}
