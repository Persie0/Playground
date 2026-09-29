package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class el6 {

    /* JADX INFO: renamed from: a */
    public final String f37436a;

    /* JADX INFO: renamed from: b */
    public final String f37437b;

    /* JADX INFO: renamed from: c */
    public final String f37438c;

    /* JADX INFO: renamed from: d */
    public final String f37439d;

    public el6(String str, String str2, String str3, String str4) {
        str.getClass();
        this.f37436a = str;
        this.f37437b = str2;
        this.f37438c = str3;
        this.f37439d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof el6)) {
            return false;
        }
        el6 el6Var = (el6) obj;
        return fa4.m11650l(this.f37436a, el6Var.f37436a) && this.f37437b.equals(el6Var.f37437b) && this.f37438c.equals(el6Var.f37438c) && this.f37439d.equals(el6Var.f37439d);
    }

    public final int hashCode() {
        return this.f37439d.hashCode() + ux5.m22980c(ux5.m22980c(this.f37436a.hashCode() * 31, this.f37437b, 31), this.f37438c, 31);
    }

    public final String toString() {
        return wq1.m24125u(ux5.m23000w("NextLesson(title=", this.f37436a, ", imageUrl=", this.f37437b, ", courseTitle="), this.f37438c, ", audioDuration=", this.f37439d, ")");
    }
}
