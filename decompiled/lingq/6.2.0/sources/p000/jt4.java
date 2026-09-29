package p000;

/* JADX INFO: loaded from: classes.dex */
public final class jt4 {

    /* JADX INFO: renamed from: a */
    public final int f46127a;

    /* JADX INFO: renamed from: b */
    public final int f46128b;

    public jt4(int i, int i2) {
        this.f46127a = i;
        this.f46128b = i2;
        if (!(i >= 0)) {
            l54.m15814a("negative start index");
        }
        if (i2 >= i) {
            return;
        }
        l54.m15814a("end index greater than start");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jt4)) {
            return false;
        }
        jt4 jt4Var = (jt4) obj;
        return this.f46127a == jt4Var.f46127a && this.f46128b == jt4Var.f46128b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f46128b) + (Integer.hashCode(this.f46127a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Interval(start=");
        sb.append(this.f46127a);
        sb.append(", end=");
        return wq1.m24122r(sb, this.f46128b, ')');
    }
}
