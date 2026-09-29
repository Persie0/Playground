package p000;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class il9 implements kl9 {

    /* JADX INFO: renamed from: a */
    public final ud7 f44278a;

    /* JADX INFO: renamed from: b */
    public final List f44279b;

    public il9(ud7 ud7Var, List list) {
        this.f44278a = ud7Var;
        this.f44279b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof il9)) {
            return false;
        }
        il9 il9Var = (il9) obj;
        return this.f44278a.equals(il9Var.f44278a) && this.f44279b.equals(il9Var.f44279b);
    }

    public final int hashCode() {
        return this.f44279b.hashCode() + (this.f44278a.hashCode() * 31);
    }

    public final String toString() {
        return "CourseItem(course=" + this.f44278a + ", lessons=" + this.f44279b + ")";
    }
}
