package p000;

/* JADX INFO: loaded from: classes.dex */
public final class p30 extends eq1 {

    /* JADX INFO: renamed from: a */
    public final long f55506a;

    /* JADX INFO: renamed from: b */
    public final long f55507b;

    /* JADX INFO: renamed from: c */
    public final String f55508c;

    /* JADX INFO: renamed from: d */
    public final String f55509d;

    public p30(long j, long j2, String str, String str2) {
        this.f55506a = j;
        this.f55507b = j2;
        this.f55508c = str;
        this.f55509d = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eq1) {
            p30 p30Var = (p30) ((eq1) obj);
            if (this.f55506a == p30Var.f55506a && this.f55507b == p30Var.f55507b && this.f55508c.equals(p30Var.f55508c)) {
                String str = p30Var.f55509d;
                String str2 = this.f55509d;
                if (str2 != null ? str2.equals(str) : str == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f55506a;
        long j2 = this.f55507b;
        int iHashCode = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f55508c.hashCode()) * 1000003;
        String str = this.f55509d;
        return (str == null ? 0 : str.hashCode()) ^ iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BinaryImage{baseAddress=");
        sb.append(this.f55506a);
        sb.append(", size=");
        sb.append(this.f55507b);
        sb.append(", name=");
        sb.append(this.f55508c);
        sb.append(", uuid=");
        return AbstractC3393o1.m17738m(sb, this.f55509d, "}");
    }
}
