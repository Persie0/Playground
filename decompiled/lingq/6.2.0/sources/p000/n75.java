package p000;

/* JADX INFO: loaded from: classes.dex */
public final class n75 {

    /* JADX INFO: renamed from: a */
    public final int f52439a;

    /* JADX INFO: renamed from: b */
    public final int f52440b;

    /* JADX INFO: renamed from: c */
    public final String f52441c;

    public n75(int i, String str, int i2) {
        str.getClass();
        this.f52439a = i;
        this.f52440b = i2;
        this.f52441c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n75)) {
            return false;
        }
        n75 n75Var = (n75) obj;
        return this.f52439a == n75Var.f52439a && this.f52440b == n75Var.f52440b && fa4.m11650l(this.f52441c, n75Var.f52441c);
    }

    public final int hashCode() {
        return this.f52441c.hashCode() + wq1.m24106b(this.f52440b, Integer.hashCode(this.f52439a) * 31, 31);
    }

    public final String toString() {
        return AbstractC3393o1.m17738m(ux5.m22994q(this.f52439a, this.f52440b, "LessonsWithPlaylistJoin(playlistId=", ", contentId=", ", language="), this.f52441c, ")");
    }
}
