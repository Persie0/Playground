package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class f50 extends vh8 {

    /* JADX INFO: renamed from: a */
    public final String f38422a;

    /* JADX INFO: renamed from: b */
    public final String f38423b;

    /* JADX INFO: renamed from: c */
    public final String f38424c;

    /* JADX INFO: renamed from: d */
    public final String f38425d;

    /* JADX INFO: renamed from: e */
    public final long f38426e;

    public f50(String str, String str2, String str3, String str4, long j) {
        this.f38422a = str;
        this.f38423b = str2;
        this.f38424c = str3;
        this.f38425d = str4;
        this.f38426e = j;
    }

    @Override // p000.vh8
    /* JADX INFO: renamed from: b */
    public final String mo11534b() {
        return this.f38424c;
    }

    @Override // p000.vh8
    /* JADX INFO: renamed from: c */
    public final String mo11535c() {
        return this.f38425d;
    }

    @Override // p000.vh8
    /* JADX INFO: renamed from: d */
    public final String mo11536d() {
        return this.f38422a;
    }

    @Override // p000.vh8
    /* JADX INFO: renamed from: e */
    public final long mo11537e() {
        return this.f38426e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vh8) {
            f50 f50Var = (f50) ((vh8) obj);
            if (this.f38422a.equals(f50Var.f38422a) && this.f38423b.equals(f50Var.f38423b) && this.f38424c.equals(f50Var.f38424c) && this.f38425d.equals(f50Var.f38425d) && this.f38426e == f50Var.f38426e) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.vh8
    /* JADX INFO: renamed from: f */
    public final String mo11538f() {
        return this.f38423b;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.f38422a.hashCode() ^ 1000003) * 1000003) ^ this.f38423b.hashCode()) * 1000003) ^ this.f38424c.hashCode()) * 1000003) ^ this.f38425d.hashCode()) * 1000003;
        long j = this.f38426e;
        return ((int) ((j >>> 32) ^ j)) ^ iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RolloutAssignment{rolloutId=");
        sb.append(this.f38422a);
        sb.append(", variantId=");
        sb.append(this.f38423b);
        sb.append(", parameterKey=");
        sb.append(this.f38424c);
        sb.append(", parameterValue=");
        sb.append(this.f38425d);
        sb.append(", templateVersion=");
        return wq1.m24113i(this.f38426e, "}", sb);
    }
}
