package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class z61 extends z7d {

    /* JADX INFO: renamed from: a */
    public final int f70975a;

    /* JADX INFO: renamed from: b */
    public final int f70976b;

    /* JADX INFO: renamed from: c */
    public final String f70977c;

    /* JADX INFO: renamed from: d */
    public final boolean f70978d;

    public z61(int i, int i2, String str, boolean z) {
        this.f70975a = i;
        this.f70976b = i2;
        this.f70977c = str;
        this.f70978d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z61)) {
            return false;
        }
        z61 z61Var = (z61) obj;
        return this.f70975a == z61Var.f70975a && this.f70976b == z61Var.f70976b && fa4.m11650l(this.f70977c, z61Var.f70977c) && this.f70978d == z61Var.f70978d;
    }

    public final int hashCode() {
        int iM24106b = wq1.m24106b(this.f70976b, Integer.hashCode(this.f70975a) * 31, 31);
        String str = this.f70977c;
        return Boolean.hashCode(this.f70978d) + ((iM24106b + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sbM22994q = ux5.m22994q(this.f70975a, this.f70976b, "RemovePaidContentWarning(lessonId=", ", lessonPrice=", ", sharedByName=");
        sbM22994q.append(this.f70977c);
        sbM22994q.append(", save=");
        sbM22994q.append(this.f70978d);
        sbM22994q.append(")");
        return sbM22994q.toString();
    }
}
