package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class hj2 {

    /* JADX INFO: renamed from: a */
    public final int f42484a;

    /* JADX INFO: renamed from: b */
    public final String f42485b;

    /* JADX INFO: renamed from: c */
    public final boolean f42486c;

    public hj2(String str, int i, boolean z) {
        str.getClass();
        this.f42484a = i;
        this.f42485b = str;
        this.f42486c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hj2)) {
            return false;
        }
        hj2 hj2Var = (hj2) obj;
        return this.f42484a == hj2Var.f42484a && fa4.m11650l(this.f42485b, hj2Var.f42485b) && this.f42486c == hj2Var.f42486c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f42486c) + ux5.m22980c(Integer.hashCode(this.f42484a) * 31, this.f42485b, 31);
    }

    public final String toString() {
        return AbstractC3393o1.m17740o(ux5.m22995r(this.f42484a, "DownloadLessonResult(lessonId=", ", audioUrl=", this.f42485b, ", hasVideo="), this.f42486c, ")");
    }
}
