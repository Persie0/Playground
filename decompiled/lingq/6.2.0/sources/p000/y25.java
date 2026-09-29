package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class y25 {

    /* JADX INFO: renamed from: a */
    public final boolean f69128a;

    /* JADX INFO: renamed from: b */
    public final int f69129b;

    /* JADX INFO: renamed from: c */
    public final String f69130c;

    /* JADX INFO: renamed from: d */
    public final String f69131d;

    /* JADX INFO: renamed from: e */
    public final String f69132e;

    public y25(int i, String str, String str2, String str3, boolean z) {
        str.getClass();
        this.f69128a = z;
        this.f69129b = i;
        this.f69130c = str;
        this.f69131d = str2;
        this.f69132e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y25)) {
            return false;
        }
        y25 y25Var = (y25) obj;
        return this.f69128a == y25Var.f69128a && this.f69129b == y25Var.f69129b && fa4.m11650l(this.f69130c, y25Var.f69130c) && fa4.m11650l(this.f69131d, y25Var.f69131d) && fa4.m11650l(this.f69132e, y25Var.f69132e);
    }

    public final int hashCode() {
        return this.f69132e.hashCode() + ux5.m22980c(ux5.m22980c(wq1.m24106b(this.f69129b, Boolean.hashCode(this.f69128a) * 31, 31), this.f69130c, 31), this.f69131d, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LessonInfoBottomSheetState(show=");
        sb.append(this.f69128a);
        sb.append(", lessonId=");
        sb.append(this.f69129b);
        sb.append(", title=");
        AbstractC3393o1.m17725C(sb, this.f69130c, ", imageUrl=", this.f69131d, ", originalImageUrl=");
        return AbstractC3393o1.m17738m(sb, this.f69132e, ")");
    }

    public /* synthetic */ y25() {
        this(0, "", "", "", false);
    }
}
