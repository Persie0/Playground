package p000;

/* JADX INFO: loaded from: classes.dex */
public final class sx9 {

    /* JADX INFO: renamed from: a */
    public final String f61558a;

    /* JADX INFO: renamed from: b */
    public String f61559b;

    /* JADX INFO: renamed from: c */
    public boolean f61560c = false;

    /* JADX INFO: renamed from: d */
    public i37 f61561d = null;

    public sx9(String str, String str2) {
        this.f61558a = str;
        this.f61559b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sx9)) {
            return false;
        }
        sx9 sx9Var = (sx9) obj;
        return fa4.m11650l(this.f61558a, sx9Var.f61558a) && fa4.m11650l(this.f61559b, sx9Var.f61559b) && this.f61560c == sx9Var.f61560c && fa4.m11650l(this.f61561d, sx9Var.f61561d);
    }

    public final int hashCode() {
        int iM12428e = g9a.m12428e(ux5.m22980c(this.f61558a.hashCode() * 31, this.f61559b, 31), 31, this.f61560c);
        i37 i37Var = this.f61561d;
        return iM12428e + (i37Var == null ? 0 : i37Var.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextSubstitution(layoutCache=");
        sb.append(this.f61561d);
        sb.append(", isShowingSubstitution=");
        return ux5.m22993p(sb, this.f61560c, ')');
    }
}
