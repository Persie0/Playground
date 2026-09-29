package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class u61 extends z7d {

    /* JADX INFO: renamed from: a */
    public final int f63475a;

    /* JADX INFO: renamed from: b */
    public final String f63476b;

    public u61(int i, String str) {
        this.f63475a = i;
        this.f63476b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u61)) {
            return false;
        }
        u61 u61Var = (u61) obj;
        return this.f63475a == u61Var.f63475a && this.f63476b.equals(u61Var.f63476b);
    }

    public final int hashCode() {
        return this.f63476b.hashCode() + (Integer.hashCode(this.f63475a) * 31);
    }

    public final String toString() {
        return hn1.m13354d(this.f63475a, "DownloadCourse(courseId=", ", status=", this.f63476b, ")");
    }
}
