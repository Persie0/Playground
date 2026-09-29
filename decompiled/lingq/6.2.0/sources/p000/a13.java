package p000;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class a13 {

    /* JADX INFO: renamed from: a */
    public final String f57a;

    /* JADX INFO: renamed from: b */
    public final List f58b;

    /* JADX INFO: renamed from: c */
    public final boolean f59c;

    /* JADX INFO: renamed from: d */
    public final Integer f60d;

    public a13(String str, List list, boolean z, Integer num) {
        list.getClass();
        this.f57a = str;
        this.f58b = list;
        this.f59c = z;
        this.f60d = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a13)) {
            return false;
        }
        a13 a13Var = (a13) obj;
        return this.f57a.equals(a13Var.f57a) && fa4.m11650l(this.f58b, a13Var.f58b) && this.f59c == a13Var.f59c && fa4.m11650l(this.f60d, a13Var.f60d);
    }

    public final int hashCode() {
        int iM12428e = g9a.m12428e(ux5.m22979b(this.f57a.hashCode() * 31, 31, this.f58b), 31, this.f59c);
        Integer num = this.f60d;
        return iM12428e + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "FastSearchScreenState(query=" + this.f57a + ", items=" + this.f58b + ", isRefreshing=" + this.f59c + ", removeLessonWarningLessonId=" + this.f60d + ")";
    }
}
