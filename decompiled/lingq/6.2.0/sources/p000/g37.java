package p000;

/* JADX INFO: loaded from: classes.dex */
public final class g37 {

    /* JADX INFO: renamed from: a */
    public final C3462pj f40120a;

    /* JADX INFO: renamed from: b */
    public final int f40121b;

    /* JADX INFO: renamed from: c */
    public final int f40122c;

    public g37(C3462pj c3462pj, int i, int i2) {
        this.f40120a = c3462pj;
        this.f40121b = i;
        this.f40122c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g37) {
            g37 g37Var = (g37) obj;
            if (this.f40120a == g37Var.f40120a && this.f40121b == g37Var.f40121b && this.f40122c == g37Var.f40122c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f40122c) + wq1.m24106b(this.f40121b, this.f40120a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphIntrinsicInfo(intrinsics=");
        sb.append(this.f40120a);
        sb.append(", startIndex=");
        sb.append(this.f40121b);
        sb.append(", endIndex=");
        return wq1.m24122r(sb, this.f40122c, ')');
    }
}
