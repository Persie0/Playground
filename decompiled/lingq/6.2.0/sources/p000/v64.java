package p000;

/* JADX INFO: loaded from: classes.dex */
public final class v64 {

    /* JADX INFO: renamed from: a */
    public final int f64916a;

    /* JADX INFO: renamed from: b */
    public final int f64917b;

    /* JADX INFO: renamed from: c */
    public final int f64918c;

    /* JADX INFO: renamed from: d */
    public final int f64919d;

    public v64(int i, int i2, int i3, int i4) {
        this.f64916a = i;
        this.f64917b = i2;
        this.f64918c = i3;
        this.f64919d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v64)) {
            return false;
        }
        v64 v64Var = (v64) obj;
        return this.f64916a == v64Var.f64916a && this.f64917b == v64Var.f64917b && this.f64918c == v64Var.f64918c && this.f64919d == v64Var.f64919d;
    }

    public final int hashCode() {
        return (((((this.f64916a * 31) + this.f64917b) * 31) + this.f64918c) * 31) + this.f64919d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InsetsValues(left=");
        sb.append(this.f64916a);
        sb.append(", top=");
        sb.append(this.f64917b);
        sb.append(", right=");
        sb.append(this.f64918c);
        sb.append(", bottom=");
        return wq1.m24122r(sb, this.f64919d, ')');
    }
}
