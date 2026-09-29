package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class g51 extends b61 {

    /* JADX INFO: renamed from: a */
    public final int f40222a;

    /* JADX INFO: renamed from: b */
    public final String f40223b;

    public g51(int i, String str) {
        this.f40222a = i;
        this.f40223b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g51)) {
            return false;
        }
        g51 g51Var = (g51) obj;
        return this.f40222a == g51Var.f40222a && this.f40223b.equals(g51Var.f40223b);
    }

    public final int hashCode() {
        return this.f40223b.hashCode() + (Integer.hashCode(this.f40222a) * 31);
    }

    public final String toString() {
        return hn1.m13354d(this.f40222a, "OnCourseBlacklistClicked(courseId=", ", name=", this.f40223b, ")");
    }
}
