package p000;

/* JADX INFO: loaded from: classes.dex */
public final class k30 extends dq1 {

    /* JADX INFO: renamed from: a */
    public final int f46605a;

    /* JADX INFO: renamed from: b */
    public final String f46606b;

    /* JADX INFO: renamed from: c */
    public final int f46607c;

    /* JADX INFO: renamed from: d */
    public final long f46608d;

    /* JADX INFO: renamed from: e */
    public final long f46609e;

    /* JADX INFO: renamed from: f */
    public final boolean f46610f;

    /* JADX INFO: renamed from: g */
    public final int f46611g;

    /* JADX INFO: renamed from: h */
    public final String f46612h;

    /* JADX INFO: renamed from: i */
    public final String f46613i;

    public k30(int i, String str, int i2, long j, long j2, boolean z, int i3, String str2, String str3) {
        this.f46605a = i;
        this.f46606b = str;
        this.f46607c = i2;
        this.f46608d = j;
        this.f46609e = j2;
        this.f46610f = z;
        this.f46611g = i3;
        this.f46612h = str2;
        this.f46613i = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dq1) {
            k30 k30Var = (k30) ((dq1) obj);
            if (this.f46605a == k30Var.f46605a && this.f46606b.equals(k30Var.f46606b) && this.f46607c == k30Var.f46607c && this.f46608d == k30Var.f46608d && this.f46609e == k30Var.f46609e && this.f46610f == k30Var.f46610f && this.f46611g == k30Var.f46611g && this.f46612h.equals(k30Var.f46612h) && this.f46613i.equals(k30Var.f46613i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((this.f46605a ^ 1000003) * 1000003) ^ this.f46606b.hashCode()) * 1000003) ^ this.f46607c) * 1000003;
        long j = this.f46608d;
        int i = (iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.f46609e;
        return this.f46613i.hashCode() ^ ((((((((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ (this.f46610f ? 1231 : 1237)) * 1000003) ^ this.f46611g) * 1000003) ^ this.f46612h.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Device{arch=");
        sb.append(this.f46605a);
        sb.append(", model=");
        sb.append(this.f46606b);
        sb.append(", cores=");
        sb.append(this.f46607c);
        sb.append(", ram=");
        sb.append(this.f46608d);
        sb.append(", diskSpace=");
        sb.append(this.f46609e);
        sb.append(", simulator=");
        sb.append(this.f46610f);
        sb.append(", state=");
        sb.append(this.f46611g);
        sb.append(", manufacturer=");
        sb.append(this.f46612h);
        sb.append(", modelClass=");
        return AbstractC3393o1.m17738m(sb, this.f46613i, "}");
    }
}
