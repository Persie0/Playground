package p000;

/* JADX INFO: loaded from: classes.dex */
public final class dq4 {

    /* JADX INFO: renamed from: a */
    public final int f36021a;

    /* JADX INFO: renamed from: b */
    public final int f36022b;

    /* JADX INFO: renamed from: c */
    public final boolean f36023c;

    public dq4(int i, int i2, boolean z) {
        this.f36021a = i;
        this.f36022b = i2;
        this.f36023c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dq4)) {
            return false;
        }
        dq4 dq4Var = (dq4) obj;
        return this.f36021a == dq4Var.f36021a && this.f36022b == dq4Var.f36022b && this.f36023c == dq4Var.f36023c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f36023c) + wq1.m24106b(this.f36022b, Integer.hashCode(this.f36021a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BidiRun(start=");
        sb.append(this.f36021a);
        sb.append(", end=");
        sb.append(this.f36022b);
        sb.append(", isRtl=");
        return ux5.m22993p(sb, this.f36023c, ')');
    }
}
