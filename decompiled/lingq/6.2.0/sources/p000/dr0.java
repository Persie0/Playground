package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class dr0 implements er0 {

    /* JADX INFO: renamed from: a */
    public final int f36074a;

    /* JADX INFO: renamed from: b */
    public final String f36075b;

    public dr0(int i, String str) {
        str.getClass();
        this.f36074a = i;
        this.f36075b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dr0)) {
            return false;
        }
        dr0 dr0Var = (dr0) obj;
        return this.f36074a == dr0Var.f36074a && fa4.m11650l(this.f36075b, dr0Var.f36075b);
    }

    public final int hashCode() {
        return this.f36075b.hashCode() + (Integer.hashCode(this.f36074a) * 31);
    }

    public final String toString() {
        return hn1.m13354d(this.f36074a, "OpenCourse(courseId=", ", language=", this.f36075b, ")");
    }
}
