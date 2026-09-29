package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class k81 extends v81 {

    /* JADX INFO: renamed from: a */
    public final int f46847a;

    /* JADX INFO: renamed from: b */
    public final String f46848b;

    /* JADX INFO: renamed from: c */
    public final boolean f46849c;

    public k81(String str, int i, boolean z) {
        this.f46847a = i;
        this.f46848b = str;
        this.f46849c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k81)) {
            return false;
        }
        k81 k81Var = (k81) obj;
        return this.f46847a == k81Var.f46847a && this.f46848b.equals(k81Var.f46848b) && this.f46849c == k81Var.f46849c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f46849c) + ux5.m22980c(Integer.hashCode(this.f46847a) * 31, this.f46848b, 31);
    }

    public final String toString() {
        return AbstractC3393o1.m17740o(ux5.m22995r(this.f46847a, "OnAddCourseToPlaylist(courseId=", ", courseUrl=", this.f46848b, ", isPremium="), this.f46849c, ")");
    }
}
