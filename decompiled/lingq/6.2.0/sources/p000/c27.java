package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class c27 {

    /* JADX INFO: renamed from: a */
    public final ox7 f9354a;

    /* JADX INFO: renamed from: b */
    public final String f9355b;

    /* JADX INFO: renamed from: c */
    public final String f9356c;

    /* JADX INFO: renamed from: d */
    public final String f9357d;

    /* JADX INFO: renamed from: e */
    public final boolean f9358e;

    /* JADX INFO: renamed from: f */
    public final int f9359f;

    public c27(ox7 ox7Var, String str, String str2, String str3, boolean z, int i) {
        str.getClass();
        this.f9354a = ox7Var;
        this.f9355b = str;
        this.f9356c = str2;
        this.f9357d = str3;
        this.f9358e = z;
        this.f9359f = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c27)) {
            return false;
        }
        c27 c27Var = (c27) obj;
        return this.f9354a.equals(c27Var.f9354a) && fa4.m11650l(this.f9355b, c27Var.f9355b) && this.f9356c.equals(c27Var.f9356c) && this.f9357d.equals(c27Var.f9357d) && this.f9358e == c27Var.f9358e && this.f9359f == c27Var.f9359f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f9359f) + g9a.m12428e(ux5.m22980c(ux5.m22980c(ux5.m22980c(this.f9354a.hashCode() * 31, this.f9355b, 31), this.f9356c, 31), this.f9357d, 31), 31, this.f9358e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PageData(page=");
        sb.append(this.f9354a);
        sb.append(", lessonTitle=");
        sb.append(this.f9355b);
        sb.append(", collectionTitle=");
        AbstractC3393o1.m17725C(sb, this.f9356c, ", lessonImage=", this.f9357d, ", isSentenceMode=");
        sb.append(this.f9358e);
        sb.append(", lessonId=");
        sb.append(this.f9359f);
        sb.append(")");
        return sb.toString();
    }
}
